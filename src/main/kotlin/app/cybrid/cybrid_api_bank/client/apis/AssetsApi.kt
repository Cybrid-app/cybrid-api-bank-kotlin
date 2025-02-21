package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.AssetListBankModel

interface AssetsApi {
    /**
     * Get assets list
     * Retrieves a listing of assets.
     * Responses:
     *  - 200: get list of assets
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param code Comma separated codes to list assets for. (optional)
     * @return [AssetListBankModel]
     */
    @GET("api/assets")
    suspend fun listAssets(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("code") code: kotlin.String? = null): Response<AssetListBankModel>

}
