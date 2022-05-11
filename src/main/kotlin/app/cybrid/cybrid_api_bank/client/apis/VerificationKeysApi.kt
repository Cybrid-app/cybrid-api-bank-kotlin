package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.PostVerificationKeyBankModel
import app.cybrid.cybrid_api_bank.client.models.VerificationKeyBankModel
import app.cybrid.cybrid_api_bank.client.models.VerificationKeyListBankModel

interface VerificationKeysApi {
    /**
     * Create VerificationKey
     * Creates a verification key.   Example code (python) for generating a Verification Key  &#x60;&#x60;&#x60;python import base64  from cryptography.hazmat.primitives import hashes from cryptography.hazmat.primitives import serialization from cryptography.hazmat.primitives.asymmetric import padding from cryptography.hazmat.primitives.asymmetric import rsa  nonce &#x3D; \&quot;wen moon\&quot; private_key &#x3D; rsa.generate_private_key(public_exponent&#x3D;65537, key_size&#x3D;2048) signature &#x3D; base64.b64encode(private_key.sign(     data&#x3D;nonce.encode(&#39;ascii&#39;), padding&#x3D;padding.PKCS1v15(), algorithm&#x3D;hashes.SHA512())).decode(&#39;ascii&#39;) public_key &#x3D; base64.b64encode(private_key.public_key().public_bytes(     encoding&#x3D;serialization.Encoding.DER, format&#x3D;serialization.PublicFormat.SubjectPublicKeyInfo)).decode(&#39;ascii&#39;) &#x60;&#x60;&#x60;&#x60;  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the verification in our private key store | | pending | The Platform is verifying the verification key&#39;s signature | | verified | The Platform has verified the verification key&#39;s signature and the key can be used | | failed | The Platform was not able to verify the verification key&#39;s signature and the key cannot be used |    Required scope: **banks:write**
     * Responses:
     *  - 201: verification key created
     *
     * @param postVerificationKeyBankModel  
     * @return [VerificationKeyBankModel]
     */
    @POST("api/bank_verification_keys")
    suspend fun createVerificationKey(@Body postVerificationKeyBankModel: PostVerificationKeyBankModel): Response<VerificationKeyBankModel>

    /**
     * Get VerificationKey
     * Retrieves a verification key.  Required scope: **banks:read**
     * Responses:
     *  - 200: Verification Key found
     *
     * @param verificationKeyGuid Identifier for the verification key. 
     * @return [VerificationKeyBankModel]
     */
    @GET("api/bank_verification_keys/{verification_key_guid}")
    suspend fun getVerificationKey(@Path("verification_key_guid") verificationKeyGuid: kotlin.String): Response<VerificationKeyBankModel>

    /**
     * Get Verification Keys list
     * Retrieves a listing of verification keys of a bank.  Required scope: **banks:read**
     * Responses:
     *  - 200: get list of verification keys
     *
     * @param page  (optional, default to 0)
     * @param perPage  (optional, default to 10)
     * @return [VerificationKeyListBankModel]
     */
    @GET("api/bank_verification_keys")
    suspend fun listVerificationKeys(@Query("page") page: kotlin.Int? = null, @Query("per_page") perPage: kotlin.Int? = null): Response<VerificationKeyListBankModel>

}
