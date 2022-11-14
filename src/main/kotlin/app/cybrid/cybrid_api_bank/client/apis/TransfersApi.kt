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
     * Creates a transfer.  Required scope: **transfers:execute**
     * Responses:
     *  - 201: Transfer created
     *  - 400: Invalid requests - malformed authentication header
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
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated trade_guids to list transfers for. (optional)
     * @param bankGuid Comma separated bank_guids to list transfers for. (optional)
     * @param customerGuid Comma separated customer_guids to list transfers for. (optional)
     * @param accountGuid Comma separated account_guids to list transfers for. (optional)
     * @return [TransferListBankModel]
     */
    @GET("api/transfers")
    suspend fun listTransfers(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("account_guid") accountGuid: kotlin.String? = null): Response<TransferListBankModel>

}
