package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.SymbolPriceBankModel

interface PricesApi {
    /**
     * Get Price
     * Retrieves a listing of symbol prices.  ## Symbols  Symbol are pairs and are in the format asset-counter_asset, e.g., &#39;BTC-USD&#39; for the Bitcoin/ USD pair. See the Symbols API for a complete list of cryptocurrencies supported.    Required scope: **prices:read**
     * Responses:
     *  - 200: get list of price
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param symbol Comma separated symbols to list prices for. (optional)
     * @param bankGuid The bank identifier to retrieve prices for. (optional)
     * @return [kotlin.collections.List<SymbolPriceBankModel>]
     */
    @GET("api/prices")
    suspend fun listPrices(@Query("symbol") symbol: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null): Response<kotlin.collections.List<SymbolPriceBankModel>>

}
