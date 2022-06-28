package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostTradeBankModel
import app.cybrid.cybrid_api_bank.client.models.TradeBankModel
import app.cybrid.cybrid_api_bank.client.models.TradeListBankModel

interface TradesApi {
    /**
     * Create Trade
     * Creates a trade.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | initiating | The Platform has begun to perform the trade | | pending | The Platform is executing the trade | | settling | The Platform is settling the trade | | completed | The Platform has successfully completed the trade | | failed | The Platform was not able to successfully complete the trade |    Required scope: **trades:execute**
     * Responses:
     *  - 201: Trade created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 409: Data already exists
     *  - 422: Unable to process request
     *
     * @param postTradeBankModel 
     * @return [TradeBankModel]
     */
    @POST("api/trades")
    suspend fun createTrade(@Body postTradeBankModel: PostTradeBankModel): Response<TradeBankModel>

    /**
     * Get Trade
     * Retrieves a trade.  Required scope: **trades:read**
     * Responses:
     *  - 200: trade found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: trade not found
     *
     * @param tradeGuid Identifier for the trade.
     * @return [TradeBankModel]
     */
    @GET("api/trades/{trade_guid}")
    suspend fun getTrade(@Path("trade_guid") tradeGuid: kotlin.String): Response<TradeBankModel>

    /**
     * Get trades list
     * Retrieves a listing of trades.  Required scope: **trades:read**
     * Responses:
     *  - 200: get list of trades
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated trade_guids to list trades for. (optional)
     * @param bankGuid Comma separated bank_guids to list trades for. (optional)
     * @param customerGuid Comma separated customer_guids to list trades for. (optional)
     * @param accountGuid Comma separated account_guids to list trades for. (optional)
     * @return [TradeListBankModel]
     */
    @GET("api/trades")
    suspend fun listTrades(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("account_guid") accountGuid: kotlin.String? = null): Response<TradeListBankModel>

}
