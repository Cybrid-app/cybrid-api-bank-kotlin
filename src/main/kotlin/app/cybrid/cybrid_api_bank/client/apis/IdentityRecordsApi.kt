package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.IdentityRecordBankModel
import app.cybrid.cybrid_api_bank.client.models.IdentityRecordListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostIdentityRecordBankModel

interface IdentityRecordsApi {
    /**
     * Create Identity Record
     * Creates an identity record.  ## Identity Records  Identity Records verify an individual for inclusion on the platform. This know-your-customer (KYC) process is a requirement for individuals to be able to transact. At present, we offer support for Attestation Identity Records.  Once an Identity Record has been submitted, it will be reviewed by our system and transit through a lifecycle before ultimately being &#x60;verified&#x60; or &#x60;failed&#x60;. If an Identity Record is ends up &#x60;failed&#x60;, contextual information as to the reason may be provided on the resource and additional attempts can be made.  ## Attestation Identity Records  An Attestation Identity Record is a confirmation of fact that the Organization has completed their own KYC process and can vouch for its correctness.  Prior to uploading &#x60;verified&#x60; attestation identity records, an Organization must register their signing public key with their Bank through the create Verification Key API.  To create an attestation identity record, a signed JWT is required as proof that the Customer&#39;s identity has been verified by the Organization. When creating the JWT, the Organization must use the RS512 signing algorithm.  The JWT must contain the following headers:  - **alg**: The RS512 algorithm value, e.g., &#39;RS512&#39;. - **kid**: Set to the guid of the verification key that has been registered for the Bank  The JWT must contain the following claims:  - **iss**: Set to http://api.cybrid.app/banks/{bank_guid} - **aud**: Set to http://api.cybrid.app - **sub**: Set to http://api.cybrid.app/customers/{customer_guid} - **iat**: Set to the time at which the JWT was issued - **exp**: Set to the time after which the JWT expires - **jti**: Set to a unique identifier for the JWT  Example code (python) for generating an Attestation Identity Record JWT token:  &#x60;&#x60;&#x60;python # Assumes an RSA private key has been generated (&#x60;private_key&#x60;), a Verification Key has been created and a &#x60;verification_key_guid&#x60; is available. # # &#x60;customer_guid&#x60; should be set to the guid assigned to a Customer that has been created. # &#x60;bank_guid&#x60; should be set to the guid of your bank #  import uuid  from datetime import datetime, timezone, timedelta from jwcrypto import jwt, jwk from cryptography.hazmat.primitives import serialization from cryptography.hazmat.primitives.serialization import load_pem_private_key  algorithm &#x3D; &#39;RS512&#39; issued_at &#x3D; datetime.now(timezone.utc) expired_at &#x3D; issued_at + timedelta(days&#x3D;365)  with open(\&quot;verification_key.pem\&quot;, &#39;rb&#39;) as pem_in:   pem_lines &#x3D; pem_in.read()  private_key &#x3D; load_pem_private_key(pem_lines, None)  ### DISCLAIMER:- Since NO ENCRYPTION is used in the key storage/formatting. Please DO NOT use this code in production environment. signing_key &#x3D; jwk.JWK.from_pem(     private_key.private_bytes(         encoding&#x3D;serialization.Encoding.PEM,         format&#x3D;serialization.PrivateFormat.PKCS8,         encryption_algorithm&#x3D;serialization.NoEncryption()     ) ) signing_key.update({\&quot;kid\&quot;: verification_key_guid})  attestation_jwt &#x3D; jwt.JWT(     header&#x3D;{         \&quot;alg\&quot;: algorithm,         \&quot;kid\&quot;: verification_key_guid     },     claims&#x3D;{         \&quot;iss\&quot;: f\&quot;http://api.cybrid.app/banks/{bank_guid}\&quot;,         \&quot;aud\&quot;: \&quot;http://api.cybrid.app\&quot;,         \&quot;sub\&quot;: f\&quot;http://api.cybrid.app/customers/{customer_guid}\&quot;,         \&quot;iat\&quot;: int(issued_at.timestamp()),         \&quot;exp\&quot;: int(expired_at.timestamp()),         \&quot;jti\&quot;: str(uuid.uuid4())     },     key&#x3D;signing_key,     algs&#x3D;[algorithm] ) attestation_jwt.make_signed_token(signing_key)  token &#x3D; attestation_jwt.serialize(compact&#x3D;True) print(\&quot;Token is : \&quot;, token) &#x60;&#x60;&#x60;  ## Attestation State  | State | Description | |-------|-------------| | storing | The Platform is storing the attestation in our private store | | pending | The Platform is verifying the attestation&#39;s JWT | | verified | The Platform has verified the attestation and the customer is able to transact | | failed | The Platform was not able to verify the attestation and the customer is not able to transact |    Required scope: **customers:write**
     * Responses:
     *  - 201: Identity Record created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed,
     *  - 403: Invalid scope
     *
     * @param postIdentityRecordBankModel  
     * @return [IdentityRecordBankModel]
     */
    @POST("api/identity_records")
    suspend fun createIdentityRecord(@Body postIdentityRecordBankModel: PostIdentityRecordBankModel): Response<IdentityRecordBankModel>

    /**
     * Get Identity Record
     * Retrieves an identity record.  Required scope: **customers:read**
     * Responses:
     *  - 200: Identity Record found
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: identity record not found
     *
     * @param identityRecordGuid Identifier for the identity record. 
     * @return [IdentityRecordBankModel]
     */
    @GET("api/identity_records/{identity_record_guid}")
    suspend fun getIdentityRecord(@Path("identity_record_guid") identityRecordGuid: kotlin.String): Response<IdentityRecordBankModel>

    /**
     * List Identity Records
     * Retrieves a listing of identity records for a bank.  Required scope: **customers:read**
     * Responses:
     *  - 200: list of identity records
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param customerGuid Comma separated customer identifier to list identity records for. (optional)
     * @param page  (optional, default to 0)
     * @param perPage  (optional, default to 10)
     * @return [IdentityRecordListBankModel]
     */
    @GET("api/identity_records")
    suspend fun listIdentityRecords(@Query("customer_guid") customerGuid: kotlin.String? = null, @Query("page") page: kotlin.Int? = null, @Query("per_page") perPage: kotlin.Int? = null): Response<IdentityRecordListBankModel>

}
