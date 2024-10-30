package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.AccountBankModel
import app.cybrid.cybrid_api_bank.client.models.AccountListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostAccountBankModel

interface AccountsApi {
    /**
     * Create Account
     * Creates an account.  ## Account Type  An Account is tied to a specific cryptocurrency or fiat and is comprised of transactions and a current balance.  An account is required to allow a Bank or Customer to hold cryptocurrency or a Customer to hold fiat on the Cybrid Platform.  At present, accounts can be created as &#x60;trading&#x60;, &#x60;storage&#x60; or &#x60;fiat &#x60; accounts and are required before a Customer can generate quotes or execute a &#x60;trade&#x60; or &#x60;transfer&#x60;.  To create accounts for your Bank, omit the &#x60;customer_guid&#x60; parameter in the request body. To create accounts for your Customers, include the &#x60;customer_guid&#x60; parameter in the request body.  At the bank level, &#x60;invoice_operations&#x60; accounts can be configured to pre-fund your customers&#39; Lightning Network operations.  ## Asset  The asset is the specific cryptocurrency or fiat that the account holds, e.g., &#39;BTC&#39; for Bitcoin or &#x60;USD&#x60; for US dollars. See the Symbols API for a complete list of cryptocurrencies and fiat supported.   ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the account details in our private store | | created | The Platform has created the account |    Required scope: **accounts:execute**
     * Responses:
     *  - 201: account created
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postAccountBankModel 
     * @return [AccountBankModel]
     */
    @POST("api/accounts")
    suspend fun createAccount(@Body postAccountBankModel: PostAccountBankModel): Response<AccountBankModel>

    /**
     * Get Account
     * Retrieves an account.  Required scope: **accounts:read**
     * Responses:
     *  - 200: account found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: account not found
     *
     * @param accountGuid Identifier for the account.
     * @return [AccountBankModel]
     */
    @GET("api/accounts/{account_guid}")
    suspend fun getAccount(@Path("account_guid") accountGuid: kotlin.String): Response<AccountBankModel>

    /**
     * List Accounts
     * Retrieves a list of accounts.  Required scope: **accounts:read**
     * Responses:
     *  - 200: get list of accounts
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param owner The owner of the entity. (optional)
     * @param guid Comma separated account_guids to list accounts for. (optional)
     * @param type Comma separated account_types to list accounts for. (optional)
     * @param bankGuid Comma separated bank_guids to list accounts for. (optional)
     * @param customerGuid Comma separated customer_guids to list accounts for. (optional)
     * @param label Comma separated labels to list accounts for. (optional)
     * @return [AccountListBankModel]
     */
    @GET("api/accounts")
    suspend fun listAccounts(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("owner") owner: kotlin.String? = null, @Query("guid") guid: kotlin.String? = null, @Query("type") type: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("label") label: kotlin.String? = null): Response<AccountListBankModel>

}
