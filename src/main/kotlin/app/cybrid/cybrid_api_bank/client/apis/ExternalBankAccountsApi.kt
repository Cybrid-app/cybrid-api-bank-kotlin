package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.ExternalBankAccountBankModel
import app.cybrid.cybrid_api_bank.client.models.ExternalBankAccountListBankModel
import app.cybrid.cybrid_api_bank.client.models.PatchExternalBankAccountBankModel
import app.cybrid.cybrid_api_bank.client.models.PostExternalBankAccountBankModel

interface ExternalBankAccountsApi {
    /**
     * Create ExternalBankAccount
     * Create an ExternalBankAccount.  ## Account creation  Accounts can be created for a Bank or a Customer.  To create accounts for your Bank, omit the &#x60;customer_guid&#x60; parameter in the request body. To create accounts for your Customers, include the &#x60;customer_guid&#x60; parameter in the request body.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the external bank account details in our private store | | completed | The Platform has created the external bank account | | unverified | The external bank account is created, but it has not yet been verified | | failed | The Platform was not able to successfully create the external bank account | | refresh_required | The Platform has created the external bank account, but needs to be refreshed | | deleting | The Platform is deleting the external bank account | | deleted | The Platform has deleted the external bank account |  ## Failure codes  | Code | Description | |------|-------------| | invalid_routing_number | The provided routing number is invalid |    Required scope: **external_bank_accounts:execute**
     * Responses:
     *  - 201: ExternalBankAccount created
     *  - 400: Invalid requests
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
     * Delete External Bank Account
     * Deletes an external bank account.  Required scope: **external_bank_accounts:execute**
     * Responses:
     *  - 200: External bank account deleted
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: ExternalBankAccount not found
     *
     * @param externalBankAccountGuid Identifier for the external bank account.
     * @return [ExternalBankAccountBankModel]
     */
    @DELETE("api/external_bank_accounts/{external_bank_account_guid}")
    suspend fun deleteExternalBankAccount(@Path("external_bank_account_guid") externalBankAccountGuid: kotlin.String): Response<ExternalBankAccountBankModel>

    /**
     * Get External Bank Account
     * Retrieves an external bank account.  Required scope: **external_bank_accounts:read**
     * Responses:
     *  - 200: External bank account found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: ExternalBankAccount not found
     *  - 422: Unable to process request
     *
     * @param externalBankAccountGuid Identifier for the external bank account.
     * @param forceBalanceRefresh Force the balance on the account to be retrieved. (optional)
     * @param includeBalances Include balance information in the response. If &#x60;force_balance_refresh&#x60; is &#x60;true&#x60;, the most up to date balance will be returned. If &#x60;force_balance_refresh&#x60; is &#x60;false&#x60;, the cached balance will be returned. &#x60;balance_updated_at&#x60; in the response will provide the timestamp the balance was last updated. (optional)
     * @param includePii Include the account holder&#39;s PII in the response. (optional)
     * @return [ExternalBankAccountBankModel]
     */
    @GET("api/external_bank_accounts/{external_bank_account_guid}")
    suspend fun getExternalBankAccount(@Path("external_bank_account_guid") externalBankAccountGuid: kotlin.String, @Query("force_balance_refresh") forceBalanceRefresh: kotlin.Boolean? = null, @Query("include_balances") includeBalances: kotlin.Boolean? = null, @Query("include_pii") includePii: kotlin.Boolean? = null): Response<ExternalBankAccountBankModel>

    /**
     * Get external bank accounts list
     * Retrieves a listing of external bank accounts.  Required scope: **external_bank_accounts:read**
     * Responses:
     *  - 200: Get list of external_bank_accounts
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated external_bank_account_guids to list external_bank_accounts for. (optional)
     * @param bankGuid Comma separated bank_guids to list external_bank_accounts for. (optional)
     * @param customerGuid Comma separated customer_guids to list external_bank_accounts for. (optional)
     * @param state Comma separated states to list external_bank_accounts for. (optional)
     * @return [ExternalBankAccountListBankModel]
     */
    @GET("api/external_bank_accounts")
    suspend fun listExternalBankAccounts(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("state") state: kotlin.String? = null): Response<ExternalBankAccountListBankModel>

    /**
     * Patch ExternalBankAccount
     * Patch an external bank account.  Required scope: **external_bank_accounts:write**
     * Responses:
     *  - 200: external bank account found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: ExternalBankAccount not found
     *
     * @param externalBankAccountGuid Identifier for the external bank account.
     * @param patchExternalBankAccountBankModel 
     * @return [ExternalBankAccountBankModel]
     */
    @PATCH("api/external_bank_accounts/{external_bank_account_guid}")
    suspend fun patchExternalBankAccount(@Path("external_bank_account_guid") externalBankAccountGuid: kotlin.String, @Body patchExternalBankAccountBankModel: PatchExternalBankAccountBankModel): Response<ExternalBankAccountBankModel>

}
