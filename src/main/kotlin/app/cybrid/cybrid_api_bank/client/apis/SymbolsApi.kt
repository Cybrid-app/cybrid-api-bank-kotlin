package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel

interface SymbolsApi {
    /**
     * Get Symbols list
     * Retrieves a listing of symbols.  Required scope: **prices:read**
     * Responses:
     *  - 200: get list of symbols
     *  - 400: Invalid requests - Malformed Authentication Header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @return [kotlin.collections.List<kotlin.String>]
     */
    @GET("api/symbols")
    suspend fun listSymbols(): Response<kotlin.collections.List<kotlin.String>>

}
