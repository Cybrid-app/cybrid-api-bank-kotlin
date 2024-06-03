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
     * Creates a quote.  ## Quote creation  Quotes can be created for a Bank or a Customer.  To create quotes for your Bank, omit the &#x60;customer_guid&#x60; parameter in the request body. To create quotes for your Customers, include the &#x60;customer_guid&#x60; parameter in the request body.  ## Failure codes  | Code | Description | |------|-------------| | invalid_amount | The amount on the invoice is unprocessable | | insufficient_balance | There are insufficient funds to process the quote | | invalid_invoice | The invoice cannot be processed |    Required scope: **quotes:execute**
     * Responses:
     *  - 201: quote created
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 422: Unable to process request
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
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page  (optional)
     * @param perPage  (optional)
     * @param guid Comma separated quote_guids to list quotes for. (optional)
     * @param productType Comma separated product_types to list accounts for. (optional)
     * @param bankGuid Comma separated bank_guids to list quotes for. (optional)
     * @param customerGuid Comma separated customer_guids to list quotes for. (optional)
     * @param side Comma separated sides to list quotes for. (optional)
     * @return [QuoteListBankModel]
     */
    @GET("api/quotes")
    suspend fun listQuotes(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("product_type") productType: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("side") side: kotlin.String? = null): Response<QuoteListBankModel>

}
