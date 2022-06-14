package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.PostTradingConfigurationBankModel
import app.cybrid.cybrid_api_bank.client.models.TradingConfigurationBankModel
import app.cybrid.cybrid_api_bank.client.models.TradingConfigurationListBankModel

interface TradingConfigurationsApi {
    /**
     * Create TradingConfiguration
     * Creates a trading configuration.  Required scope: **banks:write**
     * Responses:
     *  - 201: trading configuration created
     *
     * @param postTradingConfigurationBankModel 
     * @return [TradingConfigurationBankModel]
     */
    @POST("api/trading_configurations")
    suspend fun createTradingConfiguration(@Body postTradingConfigurationBankModel: PostTradingConfigurationBankModel): Response<TradingConfigurationBankModel>

    /**
     * Get TradingConfiguration
     * Retrieves a trading configuration.  Required scope: **banks:read**
     * Responses:
     *  - 200: trading configuration found
     *
     * @param tradingConfigurationGuid Identifier for the trading configuration.
     * @return [TradingConfigurationBankModel]
     */
    @GET("api/trading_configurations/{trading_configuration_guid}")
    suspend fun getTradingConfiguration(@Path("trading_configuration_guid") tradingConfigurationGuid: kotlin.String): Response<TradingConfigurationBankModel>

    /**
     * List trading configurations
     * Retrieves a listing of trading configurations for a bank.  Required scope: **banks:read**
     * Responses:
     *  - 200: get list of trading configurations
     *
     * @param page  (optional, default to 0)
     * @param perPage  (optional, default to 10)
     * @return [TradingConfigurationListBankModel]
     */
    @GET("api/trading_configurations")
    suspend fun listTradingConfigurations(@Query("page") page: kotlin.Int? = 0, @Query("per_page") perPage: kotlin.Int? = 10): Response<TradingConfigurationListBankModel>

}
