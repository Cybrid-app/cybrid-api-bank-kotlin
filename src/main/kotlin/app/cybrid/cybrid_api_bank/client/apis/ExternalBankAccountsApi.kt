package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.ExternalBankAccountBankModel
import app.cybrid.cybrid_api_bank.client.models.ExternalBankAccountListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostExternalBankAccountBankModel

interface ExternalBankAccountsApi {
    /**
     * Create ExternalBankAccount
     * Create an ExternalBankAccount.  Required scope: **external_bank_accounts:execute**
     * Responses:
     *  - 201: ExternalBankAccount created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 422: Unable to process request
     *
     * @param postExternalBankAccountBankModel 
     * @return [ExternalBankAccountBankModel]
     */
    @POST("api/external_bank_accounts")
    suspend fun createExternalBankAccount(@Body postExternalBankAccountBankModel: PostExternalBankAccountBankModel): Response<ExternalBankAccountBankModel>

    /**
     * Get External Bank Account
     * Retrieves an external bank account.  Required scope: **external_bank_accounts:read**
     * Responses:
     *  - 200: External bank account found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: ExternalBankAccount not found
     *
     * @param externalBankAccountGuid Identifier for the external bank account.
     * @return [ExternalBankAccountBankModel]
     */
    @GET("api/external_bank_accounts/{external_bank_account_guid}")
    suspend fun getExternalBankAccount(@Path("external_bank_account_guid") externalBankAccountGuid: kotlin.String): Response<ExternalBankAccountBankModel>

    /**
     * Get external bank accounts list
     * Retrieves a listing of external bank accounts.  Required scope: **external_bank_accounts:read**
     * Responses:
     *  - 200: Get list of external_bank_accounts
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated external_bank_account_guids to list external_bank_accounts for. (optional)
     * @param bankGuid Comma separated bank_guids to list external_bank_accounts for. (optional)
     * @param customerGuid Comma separated customer_guids to list external_bank_accounts for. (optional)
     * @return [ExternalBankAccountListBankModel]
     */
    @GET("api/external_bank_accounts")
    suspend fun listExternalBankAccounts(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<ExternalBankAccountListBankModel>

}
