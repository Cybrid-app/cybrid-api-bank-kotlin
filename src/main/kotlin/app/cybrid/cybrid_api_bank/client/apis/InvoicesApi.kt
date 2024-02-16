package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.InvoiceBankModel
import app.cybrid.cybrid_api_bank.client.models.InvoiceListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostInvoiceBankModel

interface InvoicesApi {
    /**
     * Create Invoice
     * Creates a invoice.  ## State  | State | Description | |-------|-------------| | storing    | The Platform is storing the invoice details in our private store | | unpaid     | The invoice is unpaid. Payment instructions can be generated for an invoice in this state | | cancelling | The invocie is in the process of being cancelled | | cancelled  | The invoice has been cancelled |  | settling   | The invoice has been paid and the funds associated with this invoice are in the process of being settled | | paid       | The invoice has been paid and the funds associated with this invoice have been settled |     Required scope: **invoices:execute**
     * Responses:
     *  - 201: Invoice created
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postInvoiceBankModel 
     * @return [InvoiceBankModel]
     */
    @POST("api/invoices")
    suspend fun createInvoice(@Body postInvoiceBankModel: PostInvoiceBankModel): Response<InvoiceBankModel>

    /**
     * Get Invoice
     * Retrieves a invoice.  Required scope: **invoices:read**
     * Responses:
     *  - 200: invoice found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: invoice not found
     *
     * @param invoiceGuid Identifier for the payment instruction.
     * @return [InvoiceBankModel]
     */
    @GET("api/invoices/{invoice_guid}")
    suspend fun getInvoice(@Path("invoice_guid") invoiceGuid: kotlin.String): Response<InvoiceBankModel>

    /**
     * List Invoices
     * Retrieves a list of invoices.  Required scope: **invoices:read**
     * Responses:
     *  - 200: get list of invoices
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated guids to list invoices for. (optional)
     * @param bankGuid Comma separated bank_guids to list invoices for. (optional)
     * @param customerGuid Comma separated customer_guids to list invoices for. (optional)
     * @param accountGuid Comma separated account_guids to list invoices for. (optional)
     * @param label Comma separated labels to list invoices for. (optional)
     * @return [InvoiceListBankModel]
     */
    @GET("api/invoices")
    suspend fun listInvoices(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("account_guid") accountGuid: kotlin.String? = null, @Query("label") label: kotlin.String? = null): Response<InvoiceListBankModel>

}
