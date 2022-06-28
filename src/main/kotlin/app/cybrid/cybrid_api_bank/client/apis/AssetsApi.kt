package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.AssetListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel

interface AssetsApi {
    /**
     * Get assets list
     * Retrieves a listing of assets.  Required scope: **prices:read**
     * Responses:
     *  - 200: get list of assets
     *  - 400: Invalid requests - Malformed Authentication Header
     *  - 401: Unauthorized - Authentication failed, invalid subject
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional, default to 0)
     * @param perPage The number of entities per page to return. (optional, default to 10)
     * @return [AssetListBankModel]
     */
    @GET("api/assets")
    suspend fun listAssets(@Query("page") page: java.math.BigDecimal? = 0, @Query("per_page") perPage: java.math.BigDecimal? = 10): Response<AssetListBankModel>

}
