package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.IdentityVerificationBankModel
import app.cybrid.cybrid_api_bank.client.models.IdentityVerificationListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostIdentityVerificationBankModel

interface IdentityVerificationsApi {
    /**
     * Create Identity Verification
     * Create an Identity Verification.  Required scope: **customers:write**
     * Responses:
     *  - 201: Identity Verification created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postIdentityVerificationBankModel 
     * @return [IdentityVerificationBankModel]
     */
    @POST("api/identity_verifications")
    suspend fun createIdentityVerification(@Body postIdentityVerificationBankModel: PostIdentityVerificationBankModel): Response<IdentityVerificationBankModel>

    /**
     * Get Identity Verification
     * Retrieves an identity verification.  Required scope: **customers:read**
     * Responses:
     *  - 200: identity verification found
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: identity_verification not found
     *
     * @param identityVerificationGuid Identifier for the identity verification.
     * @return [IdentityVerificationBankModel]
     */
    @GET("api/identity_verifications/{identity_verification_guid}")
    suspend fun getIdentityVerification(@Path("identity_verification_guid") identityVerificationGuid: kotlin.String): Response<IdentityVerificationBankModel>

    /**
     * List Identity Verifications
     * Retrieves a list of identity verifications.  Required scope: **customers:read**
     * Responses:
     *  - 200: get list of identity verifications
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated guids to list identity verifications for. (optional)
     * @param bankGuid Comma separated bank_guids to list identity verifications for. (optional)
     * @param customerGuid Comma separated customer_guids to list identity verifications for. (optional)
     * @return [IdentityVerificationListBankModel]
     */
    @GET("api/identity_verifications")
    suspend fun listIdentityVerifications(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<IdentityVerificationListBankModel>

}