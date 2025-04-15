package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PatchTransferBankModel
import app.cybrid.cybrid_api_bank.client.models.PostTransferBankModel
import app.cybrid.cybrid_api_bank.client.models.TransferBankModel
import app.cybrid.cybrid_api_bank.client.models.TransferListBankModel

interface TransfersApi {
    /**
     * Create Transfer
     * Creates a transfer.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the transfer details in our private store | | reviewing | The Platform is reviewing the transfer for compliance | | pending | The Platform is executing the transfer | | completed | The Platform has successfully completed the transfer | | failed | The Platform was not able to successfully complete the transfer |  ## Failure codes  | Code | Description | |------|-------------| | amount_too_low | The transfer was rejected due to the amount being too low | | cancelled | The transfer was manually cancelled | | compliance_rejection | The transfer was rejected for compliance reasons | | internal_error | An internal error occurred while processing the transfer, please try again | | invalid_address | The destination address is invalid for transfer | | invalid_balance | There was insufficient balance for all required currencies to complete the transfer | | limit_exceeded | The customer is over the limits that have been set for them for this activity | | network_fee_too_low | The transfer was rejected due to the network fee being too low | | non_sufficient_funds | The customer does not have enough funds to complete the transfer | | party_name_invalid | The transfer&#39;s associated external bank account has an invalid party name | | payment_rail_invalid | The payment rail specified for the transfer is not supported by the external bank account | | plaid_access_not_granted | See the description from Plaid [here](https://plaid.com/docs/errors/item/#access_not_granted) | | plaid_institution_not_responding | See the description from Plaid [here](https://plaid.com/docs/errors/institution/#institution_not_responding) | | plaid_internal_server_error | See the description from Plaid [here](https://plaid.com/docs/errors/api/#internal_server_error-or-plaid-internal-error) | | plaid_item_not_found | See the description from Plaid [here](https://plaid.com/docs/errors/item/#item_not_found) | | plaid_item_not_supported | See the description from Plaid [here](https://plaid.com/docs/errors/item/#item_not_supported) | | plaid_multiple_accounts | Multiple accounts were selected through Plaid Link. | | plaid_no_accounts | See the description from Plaid [here](https://plaid.com/docs/errors/item/#no_accounts) | | plaid_none_balances_error | The transfer was rejected due to an error with the balances retrieved by Plaid | | plaid_unknown_error | See the description from Plaid [here](https://plaid.com/docs/errors/api/#unknown_error) | | refresh_required | The transfer&#39;s associated external_bank_account needs to be reconnected via Plaid | | reversed | The transfer was reversed |  ## Failure codes that will result in a state change for the associated external bank account  | Code | Description | |------|-------------| | refresh_required | The transfer was rejected due to the external bank account needing to be refreshed. The external bank account will be put in the state &#x60;refresh_required&#x60; | | plaid_access_not_granted | The transfer was rejected due to the external bank account needing to be reconnected via Plaid. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_item_not_found | The transfer was rejected due to the external bank account needing to be reconnected via Plaid. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_item_not_supported | The transfer was rejected because the account is not supported. A different account should be connected via Plaid. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_multiple_accounts | The transfer was rejected because multiple accounts were selected through Plaid Link. Only one account must be selected. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_no_accounts | The transfer was rejected because no compatible accounts could be found. The external bank account will be put in the state &#x60;deleted&#x60; |    Required scope: **transfers:execute**
     * Responses:
     *  - 201: Transfer created
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 409: Conflict
     *  - 422: Unprocessable Content
     *
     * @param postTransferBankModel 
     * @return [TransferBankModel]
     */
    @POST("api/transfers")
    suspend fun createTransfer(@Body postTransferBankModel: PostTransferBankModel): Response<TransferBankModel>

    /**
     * Get Transfer
     * Retrieves a transfer.  Required scope: **transfers:read**
     * Responses:
     *  - 200: transfer found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: transfer not found
     *
     * @param transferGuid Identifier for the transfer.
     * @return [TransferBankModel]
     */
    @GET("api/transfers/{transfer_guid}")
    suspend fun getTransfer(@Path("transfer_guid") transferGuid: kotlin.String): Response<TransferBankModel>

    /**
     * Get transfers list
     * Retrieves a listing of transfers.  Required scope: **transfers:read**
     * Responses:
     *  - 200: get list of transfers
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated transfer_guids to list transfers for. (optional)
     * @param transferType Comma separated transfer_types to list accounts for. (optional)
     * @param bankGuid Comma separated bank_guids to list transfers for. (optional)
     * @param customerGuid Comma separated customer_guids to list transfers for. (optional)
     * @param accountGuid Comma separated account_guids to list transfers for. (optional)
     * @param state Comma separated states to list transfers for. (optional)
     * @param side Comma separated sides to list transfers for. (optional)
     * @param label Comma separated labels to list transfers for. (optional)
     * @param txnHash Comma separated transaction hashes to list transfers for. (optional)
     * @param createdAtGte Created at start date-time inclusive lower bound, ISO8601 (optional)
     * @param createdAtLt Created at end date-time exclusive upper bound, ISO8601. (optional)
     * @param updatedAtGte Created at start date-time inclusive lower bound, ISO8601 (optional)
     * @param updatedAtLt Created at end date-time exclusive upper bound, ISO8601. (optional)
     * @return [TransferListBankModel]
     */
    @GET("api/transfers")
    suspend fun listTransfers(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("transfer_type") transferType: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("account_guid") accountGuid: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("side") side: kotlin.String? = null, @Query("label") label: kotlin.String? = null, @Query("txn_hash") txnHash: kotlin.String? = null, @Query("created_at_gte") createdAtGte: kotlin.String? = null, @Query("created_at_lt") createdAtLt: kotlin.String? = null, @Query("updated_at_gte") updatedAtGte: kotlin.String? = null, @Query("updated_at_lt") updatedAtLt: kotlin.String? = null): Response<TransferListBankModel>

    /**
     * Patch Transfer
     * Update a transfer.  Required scope: **transfers:write**
     * Responses:
     *  - 200: Transfer updated
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 404: Not Found
     *  - 422: Unprocessable Content
     *
     * @param transferGuid Identifier for the transfer.
     * @param patchTransferBankModel 
     * @return [TransferBankModel]
     */
    @PATCH("api/transfers/{transfer_guid}")
    suspend fun updateTransfer(@Path("transfer_guid") transferGuid: kotlin.String, @Body patchTransferBankModel: PatchTransferBankModel): Response<TransferBankModel>

}
