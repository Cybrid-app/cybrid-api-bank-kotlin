package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.PostQuoteBankModel
import app.cybrid.cybrid_api_bank.client.models.QuoteBankModel
import app.cybrid.cybrid_api_bank.client.models.QuoteListBankModel

interface QuotesApi {
    /**
     * Create Quote
     * Creates a quote.  Required scope: **quotes:execute**
     * Responses:
     *  - 201: quote created
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
     *
     * @param page  (optional, default to 0)
     * @param perPage  (optional, default to 10)
     * @return [QuoteListBankModel]
     */
    @GET("api/quotes")
    suspend fun listQuotes(@Query("page") page: kotlin.Int? = null, @Query("per_page") perPage: kotlin.Int? = null): Response<QuoteListBankModel>

}
