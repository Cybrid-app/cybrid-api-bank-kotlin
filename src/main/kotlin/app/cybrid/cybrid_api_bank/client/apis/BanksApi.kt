package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.BankBankModel
import app.cybrid.cybrid_api_bank.client.models.BankListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostBankBankModel

interface BanksApi {
    /**
     * Create Bank
     * Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).  ## Backstopped Funding Source  A Backstopped Funding Source is an agreement between the Organization and Cybrid on transaction settlement. A Backstopped Funding Source is an escrow bank account that the Organization tops up on a regular basis and is drawn down by the Cybrid Platform when trades are executed by the Bank for its customers.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;backstopped_funding_source&#x60; flag. At present, backstopped funding sources is the supported method for funding trades on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.  ## Attestation Identity Records  Attestation Identity Records is a method the Cybrid Platform uses to verify the identity of a Bank&#39;s customers. Please see the documentation under the create Identity Record API for more technical detail.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;attestation_identity_records&#x60; flag. At present, attestation identity records is the supported method for verifying a customer&#39;s identity on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.    Required scope: **banks:execute**
     * Responses:
     *  - 201: Bank created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, invalid subject
     *  - 403: Invalid scope
     *  - 415: Unsupported values
     *
     * @param postBankBankModel  
     * @return [BankBankModel]
     */
    @POST("api/banks")
    suspend fun createBank(@Body postBankBankModel: PostBankBankModel): Response<BankBankModel>

    /**
     * Get Bank
     * Retrieves a bank.  Required scope: **banks:read**
     * Responses:
     *  - 200: bank found
     *  - 400: Invalid requests - invalid value in request
     *  - 401: Unauthorized - Authentication failed, invalid subject
     *  - 403: Invalid scope
     *
     * @param bankGuid Identifier for the bank. 
     * @return [BankBankModel]
     */
    @GET("api/banks/{bank_guid}")
    suspend fun getBank(@Path("bank_guid") bankGuid: kotlin.String): Response<BankBankModel>

    /**
     * Get banks list
     * Retrieves a listing of bank.  Required scope: **banks:read**
     * Responses:
     *  - 200: get list of banks
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - invalid subject, Authentication failed
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional, default to 0)
     * @param perPage The number of entities per page to return. (optional, default to 10)
     * @return [BankListBankModel]
     */
    @GET("api/banks")
    suspend fun listBanks(@Query("page") page: kotlin.Int? = null, @Query("per_page") perPage: kotlin.Int? = null): Response<BankListBankModel>

}
