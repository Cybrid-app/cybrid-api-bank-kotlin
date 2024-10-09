package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.BankBankModel
import app.cybrid.cybrid_api_bank.client.models.BankListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PatchBankBankModel
import app.cybrid.cybrid_api_bank.client.models.PostBankBankModel

interface BanksApi {
    /**
     * Create Bank
     * Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).    Required scope: **banks:execute**
     * Responses:
     *  - 201: Bank created
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 422: Unprocessable Content
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
     *  - 401: Unauthorized - Authentication failed, invalid subject
     *  - 403: Invalid scope
     *  - 404: bank not found
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
     *  - 401: Unauthorized - invalid subject, Authentication failed
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param type Comma separated types to list banks for. (optional)
     * @param guid Comma separated bank_guids to list banks for. (optional)
     * @return [BankListBankModel]
     */
    @GET("api/banks")
    suspend fun listBanks(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("type") type: kotlin.String? = null, @Query("guid") guid: kotlin.String? = null): Response<BankListBankModel>

    /**
     * Patch Bank
     * Update a bank.  Required scope: **banks:write**
     * Responses:
     *  - 200: bank found
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 422: Unprocessable Content
     *
     * @param bankGuid Identifier for the bank.
     * @param patchBankBankModel 
     * @return [BankBankModel]
     */
    @PATCH("api/banks/{bank_guid}")
    suspend fun updateBank(@Path("bank_guid") bankGuid: kotlin.String, @Body patchBankBankModel: PatchBankBankModel): Response<BankBankModel>

}
