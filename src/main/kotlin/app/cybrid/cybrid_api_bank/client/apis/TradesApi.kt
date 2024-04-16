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
     * Creates a trade.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | pending | The Platform is executing the trade | | cancelled | The Platform has cancelled the trade | | settling | The Platform is settling the trade | | completed | The Platform has successfully completed the trade | | failed | The Platform was not able to successfully complete the trade |  ## Failure codes  | Code | Description | |------|-------------| | non_sufficient_funds | The delivery account does not have enough funds to complete the trade | | unsupported | The trading pair is not supported for this customer | | limit_exceeded | The customer is over the limits that have been set for them for this activity | | expired_quote | The quote expired before it could be executed | | market_volatility | The quote could not be executed due to market volatility |    Required scope: **trades:execute**
     * Responses:
     *  - 201: Trade created
     *  - 400: Invalid requests
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
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated trade_guids to list trades for. (optional)
     * @param bankGuid Comma separated bank_guids to list trades for. (optional)
     * @param customerGuid Comma separated customer_guids to list trades for. (optional)
     * @param accountGuid Comma separated account_guids to list trades for. (optional)
     * @param state Comma separated states to list trades for. (optional)
     * @param side Comma separated sides to list trades for. (optional)
     * @param label Comma separated labels to list trades for. (optional)
     * @param createdAtGte Created at start date inclusive lower bound, ISO8601. (optional)
     * @param createdAtLt Created at end date exclusive upper bound, ISO8601. (optional)
     * @param updatedAtGte Updated at start date inclusive lower bound, ISO8601. (optional)
     * @param updatedAtLt Updated at end date exclusive upper bound, ISO8601. (optional)
     * @return [TradeListBankModel]
     */
    @GET("api/trades")
    suspend fun listTrades(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("account_guid") accountGuid: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("side") side: kotlin.String? = null, @Query("label") label: kotlin.String? = null, @Query("created_at_gte") createdAtGte: kotlin.String? = null, @Query("created_at_lt") createdAtLt: kotlin.String? = null, @Query("updated_at_gte") updatedAtGte: kotlin.String? = null, @Query("updated_at_lt") updatedAtLt: kotlin.String? = null): Response<TradeListBankModel>

}
