package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostTradingConfigurationBankModel
import app.cybrid.cybrid_api_bank.client.models.TradingConfigurationBankModel
import app.cybrid.cybrid_api_bank.client.models.TradingConfigurationListBankModel

interface TradingConfigurationsApi {
    /**
     * Create TradingConfiguration
     * Creates a trading configuration.  Required scope: **banks:write**
     * Responses:
     *  - 201: trading configuration created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
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
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: trading_configuration not found
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
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page  (optional)
     * @param perPage  (optional)
     * @return [TradingConfigurationListBankModel]
     */
    @GET("api/trading_configurations")
    suspend fun listTradingConfigurations(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null): Response<TradingConfigurationListBankModel>

}
