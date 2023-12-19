package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostTransferBankModel
import app.cybrid.cybrid_api_bank.client.models.TransferBankModel
import app.cybrid.cybrid_api_bank.client.models.TransferListBankModel

interface TransfersApi {
    /**
     * Create Transfer
     * Creates a transfer.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | reviewing | The Platform is reviewing the transfer for compliance | | pending | The Platform is executing the transfer | | completed | The Platform has successfully completed the transfer | | failed | The Platform was not able to successfully complete the transfer |  ## Failure codes  | Code | Description | |------|-------------| | non_sufficient_funds | The customer does not have enough funds to complete the transfer | | refresh_required | The transfer&#39;s associated external_bank_account needs to be reconnected via Plaid | | party_name_invalid | The transfer&#39;s associated external bank account has an invalid party name | | limit_exceeded | The customer is over the limits that have been set for them for this activity | | compliance_rejection | The transfer was rejected for compliance reasons |    Required scope: **transfers:execute**
     * Responses:
     *  - 201: Transfer created
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 409: Data already exists
     *  - 422: Unable to process request
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
     * @param label Comma separated labels to list transfers for. (optional)
     * @param createdAtGte Created at start date inclusive lower bound, ISO8601 (optional)
     * @param createdAtLt Created at end date exclusive upper bound, ISO8601. (optional)
     * @param updatedAtGte Created at start date inclusive lower bound, ISO8601 (optional)
     * @param updatedAtLt Created at end date exclusive upper bound, ISO8601. (optional)
     * @return [TransferListBankModel]
     */
    @GET("api/transfers")
    suspend fun listTransfers(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("transfer_type") transferType: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("account_guid") accountGuid: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("label") label: kotlin.String? = null, @Query("created_at_gte") createdAtGte: kotlin.String? = null, @Query("created_at_lt") createdAtLt: kotlin.String? = null, @Query("updated_at_gte") updatedAtGte: kotlin.String? = null, @Query("updated_at_lt") updatedAtLt: kotlin.String? = null): Response<TransferListBankModel>

}
