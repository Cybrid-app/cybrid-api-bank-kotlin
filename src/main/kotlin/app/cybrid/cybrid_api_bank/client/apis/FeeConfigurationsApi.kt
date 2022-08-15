package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.FeeConfigurationBankModel
import app.cybrid.cybrid_api_bank.client.models.FeeConfigurationListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostFeeConfigurationBankModel

interface FeeConfigurationsApi {
    /**
     * Create Fee Configuration
     * Creates a fee configuration.  Required scope: **banks:write**
     * Responses:
     *  - 201: fee configuration created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postFeeConfigurationBankModel 
     * @return [FeeConfigurationBankModel]
     */
    @POST("api/fee_configurations")
    suspend fun createFeeConfiguration(@Body postFeeConfigurationBankModel: PostFeeConfigurationBankModel): Response<FeeConfigurationBankModel>

    /**
     * Get Fee Configuration
     * Retrieves a fee configuration.  Required scope: **banks:read**
     * Responses:
     *  - 200: fee configuration found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: fee_configuration not found
     *
     * @param feeConfigurationGuid Identifier for the fee configuration.
     * @return [FeeConfigurationBankModel]
     */
    @GET("api/fee_configurations/{fee_configuration_guid}")
    suspend fun getFeeConfiguration(@Path("fee_configuration_guid") feeConfigurationGuid: kotlin.String): Response<FeeConfigurationBankModel>

    /**
     * List Fee Configurations
     * Retrieves a listing of fee configurations for a bank.  Required scope: **banks:read**
     * Responses:
     *  - 200: get list of fee configurations
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page  (optional)
     * @param perPage  (optional)
     * @return [FeeConfigurationListBankModel]
     */
    @GET("api/fee_configurations")
    suspend fun listFeeConfigurations(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null): Response<FeeConfigurationListBankModel>

}
