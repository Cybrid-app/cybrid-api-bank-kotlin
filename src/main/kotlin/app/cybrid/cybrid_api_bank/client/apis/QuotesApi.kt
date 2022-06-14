package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostQuoteBankModel
import app.cybrid.cybrid_api_bank.client.models.QuoteBankModel
import app.cybrid.cybrid_api_bank.client.models.QuoteListBankModel

interface QuotesApi {
    /**
     * Create Quote
     * Creates a quote.  Required scope: **quotes:execute**
     * Responses:
     *  - 201: quote created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 422: Unable to process request
     *  - 500: Internal server error
     *
     * @param postQuoteBankModel 
     * @return [QuoteBankModel]
     */
    @POST("api/quotes")
    suspend fun createQuote(@Body postQuoteBankModel: PostQuoteBankModel): Response<QuoteBankModel>

    /**
     * Get Quote
     * Retrieves a quote.  Required scope: **quotes:read**
     * Responses:
     *  - 200: quote found
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: quote not found
     *
     * @param quoteGuid Identifier for the quote.
     * @return [QuoteBankModel]
     */
    @GET("api/quotes/{quote_guid}")
    suspend fun getQuote(@Path("quote_guid") quoteGuid: kotlin.String): Response<QuoteBankModel>

    /**
     * Get quotes list
     * Retrieves a listing of quotes for all customers of a bank.  Required scope: **quotes:read**
     * Responses:
     *  - 200: get list of quotes
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page  (optional, default to 0)
     * @param perPage  (optional, default to 10)
     * @param guid Comma separated quote_guids to list quotes for. (optional)
     * @param bankGuid Comma separated bank_guids to list quotes for. (optional)
     * @param customerGuid Comma separated customer_guids to list quotes for. (optional)
     * @return [QuoteListBankModel]
     */
    @GET("api/quotes")
    suspend fun listQuotes(@Query("page") page: kotlin.Int? = 0, @Query("per_page") perPage: kotlin.Int? = 10, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<QuoteListBankModel>

}
