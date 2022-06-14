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
     * Creates an account.  ## Account Type  An Account is tied to a specific cryptocurrency and is comprised of transactions and a current balance.  An account is required to allow a Customer to hold cryptocurrency on the Cybrid Platform.  At present, account&#39;s can be created as &#x60;trading&#x60; accounts and are required before a Customer can generate a quote and execute a trade.  ## Asset  The asset is the specific cryptocurrency that the account holds, e.g., &#39;BTC&#39; for Bitcoin. See the Symbols API for a complete list of cryptocurrencies supported.     Required scope: **accounts:execute**
     * Responses:
     *  - 201: account created
     *  - 400: Invalid requests - malformed authentication header
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
     *  - 400: Invalid requests - malformed authentication header
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
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional, default to 0)
     * @param perPage The number of entities per page to return. (optional, default to 10)
     * @param guid Comma separated account_guids to list accounts for. (optional)
     * @param bankGuid Comma separated bank_guids to list accounts for. (optional)
     * @param customerGuid Comma separated customer_guids to list accounts for. (optional)
     * @return [AccountListBankModel]
     */
    @GET("api/accounts")
    suspend fun listAccounts(@Query("page") page: kotlin.Int? = 0, @Query("per_page") perPage: kotlin.Int? = 10, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<AccountListBankModel>

}
