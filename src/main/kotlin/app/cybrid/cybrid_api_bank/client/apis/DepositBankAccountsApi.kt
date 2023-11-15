package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.DepositBankAccountBankModel
import app.cybrid.cybrid_api_bank.client.models.DepositBankAccountListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostDepositBankAccountBankModel

interface DepositBankAccountsApi {
    /**
     * Create Deposit Bank Account
     * Creates a deposit bank account.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the deposit bank account details in our private store | | created | The Platform has created the deposit bank account |    Required scope: **deposit_bank_accounts:execute**
     * Responses:
     *  - 201: Deposit Bank Account created
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 422: Unable to process request
     *  - 500: Internal server error
     *
     * @param postDepositBankAccountBankModel 
     * @return [DepositBankAccountBankModel]
     */
    @POST("api/deposit_bank_accounts")
    suspend fun createDepositBankAccount(@Body postDepositBankAccountBankModel: PostDepositBankAccountBankModel): Response<DepositBankAccountBankModel>

    /**
     * Get Deposit Bank Account
     * Retrieves a deposit bank account.  Required scope: **deposit_bank_accounts:read**
     * Responses:
     *  - 200: deposit bank account found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: deposit_bank_account not found
     *
     * @param depositBankAccountGuid Identifier for the deposit bank account.
     * @return [DepositBankAccountBankModel]
     */
    @GET("api/deposit_bank_accounts/{deposit_bank_account_guid}")
    suspend fun getDepositBankAccount(@Path("deposit_bank_account_guid") depositBankAccountGuid: kotlin.String): Response<DepositBankAccountBankModel>

    /**
     * List Deposit Bank Accounts
     * Retrieves a list of deposit bank accounts.  Required scope: **deposit_bank_accounts:read**
     * Responses:
     *  - 200: get list of deposit bank accounts
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated guids to list deposit bank accounts for. (optional)
     * @param bankGuid Comma separated bank_guids to list deposit bank accounts for. (optional)
     * @param customerGuid Comma separated customer_guids to list deposit bank accounts for. (optional)
     * @param label Comma separated labels to list deposit bank accounts for. (optional)
     * @return [DepositBankAccountListBankModel]
     */
    @GET("api/deposit_bank_accounts")
    suspend fun listDepositBankAccounts(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("label") label: kotlin.String? = null): Response<DepositBankAccountListBankModel>

}
