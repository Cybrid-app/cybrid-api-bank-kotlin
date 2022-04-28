package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.AssetListBankModel

interface AssetsApi {
    /**
     * Get assets list
     * Retrieves a listing of assets.  Required scope: **prices:read**
     * Responses:
     *  - 200: get list of assets
     *
     * @param page The page index to retrieve. (optional, default to 0)
     * @param perPage The number of entities per page to return. (optional, default to 10)
     * @return [AssetListBankModel]
     */
    @GET("api/assets")
    suspend fun listAssets(@Query("page") page: kotlin.Int? = null, @Query("per_page") perPage: kotlin.Int? = null): Response<AssetListBankModel>

}
