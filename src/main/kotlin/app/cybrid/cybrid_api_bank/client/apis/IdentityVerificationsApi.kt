package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.IdentityVerificationBankModel
import app.cybrid.cybrid_api_bank.client.models.IdentityVerificationListBankModel
import app.cybrid.cybrid_api_bank.client.models.IdentityVerificationWithDetailsBankModel
import app.cybrid.cybrid_api_bank.client.models.PostIdentityVerificationBankModel

interface IdentityVerificationsApi {
    /**
     * Create Identity Verification
     * Creates an Identity Verification.  ## Identity Verifications  Identity Verifications confirm an individual&#39;s identity with for the purpose of inclusion on the platform. This know-your-customer (KYC) process is a requirement for individuals to be able to transact. At present, we offer support for Cybrid performing the verification or working with partners to accept their KYC/AML process and have it attested to in our platform.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the identity verification details in our private store | | waiting | The Platform is waiting for the customer to complete the identity verification process | | expired | The identity verification process has expired | | completed | The identity verification process has been completed |  ## Outcome  | State | Description | |-------|-------------| | passed | The customer has passed the identity verification process | | failed | The customer has failed the identity verification process |  ## Failure Codes  | Code | Description | |-------|-------------| | id_check_failure | Failure due to an issue when verifying the provided ID | | database_check_failure | Failure due to an issue when verifying the provided information against authoritative data sources | | selfie_failure | Failure due to an issue verifying the provided selfie photo | | duplicate_person_check_failure | Failure due to a customer already existing for this person | | name_check_failure | Failure due to an issue verifying the name of the person | | address_check_failure | Failure due to an issue verifying the address of the person | | dob_check_failure | Failure due to an issue verifying the date of birth of the person | | id_number_check_failure | Failure due to an issue verifying an identification number of the person | | phone_number_check_failure | Failure due to an issue verifying the phone number of the person | | email_address_check_failure | Failure due to an issue verifying the email address of the person | | plaid_failure | Failure due to an issue interacting with Plaid | | decision_timeout | Failure due to an issue verifying the email address of the person | | requested_failure | In sandbox, the caller requested that the process failed |    Required scope: **customers:write**
     * Responses:
     *  - 201: Identity Verification created
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
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: identity_verification not found
     *
     * @param identityVerificationGuid Identifier for the identity verification.
     * @return [IdentityVerificationWithDetailsBankModel]
     */
    @GET("api/identity_verifications/{identity_verification_guid}")
    suspend fun getIdentityVerification(@Path("identity_verification_guid") identityVerificationGuid: kotlin.String): Response<IdentityVerificationWithDetailsBankModel>

    /**
     * List Identity Verifications
     * Retrieves a list of identity verifications.  Required scope: **customers:read**
     * Responses:
     *  - 200: get list of identity verifications
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated guids to list identity verifications for. (optional)
     * @param bankGuid Comma separated bank_guids to list identity verifications for. (optional)
     * @param customerGuid Comma separated customer_guids to list identity verifications for. (optional)
     * @param state Comma separated states to list identity verifications for. (optional)
     * @return [IdentityVerificationListBankModel]
     */
    @GET("api/identity_verifications")
    suspend fun listIdentityVerifications(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("state") state: kotlin.String? = null): Response<IdentityVerificationListBankModel>

}
