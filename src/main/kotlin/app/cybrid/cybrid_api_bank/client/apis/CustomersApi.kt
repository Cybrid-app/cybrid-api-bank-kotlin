package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.CustomerBankModel
import app.cybrid.cybrid_api_bank.client.models.CustomerListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PatchCustomerBankModel
import app.cybrid.cybrid_api_bank.client.models.PostCustomerBankModel

interface CustomersApi {
    /**
     * Create Customer
     * Creates a customer.  ## Customer Type  Customer resources are an abstraction for real world individuals and businesses on the Cybrid Platform and are used throughout the platform to perform high level operations, e.g., create a quote, execute a trade, etc..  Customers can have additional resources attached to them, e.g., identity verifications, accounts, etc.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the customer details in our private store | | unverified | The Platform has not yet verified the customer&#39;s identity | | verified | The Platform has verified the customer&#39;s identity | | rejected | The Platform was not able to successfully verify the customer&#39;s identity | | frozen | The customer has been frozen on the Platform |    Required scope: **customers:execute**
     * Responses:
     *  - 201: customer created
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, invalid subject
     *  - 403: Invalid scope
     *
     * @param postCustomerBankModel 
     * @return [CustomerBankModel]
     */
    @POST("api/customers")
    suspend fun createCustomer(@Body postCustomerBankModel: PostCustomerBankModel): Response<CustomerBankModel>

    /**
     * Get Customer
     * Retrieves a customer.  Required scope: **customers:read**
     * Responses:
     *  - 200: customer found
     *  - 401: Unauthorized - Authentication failed, invalid subject
     *  - 403: Invalid scope
     *  - 404: customer not found
     *
     * @param customerGuid Identifier for the customer.
     * @param includePii Include PII in the response. (optional)
     * @return [CustomerBankModel]
     */
    @GET("api/customers/{customer_guid}")
    suspend fun getCustomer(@Path("customer_guid") customerGuid: kotlin.String, @Query("include_pii") includePii: kotlin.Boolean? = null): Response<CustomerBankModel>

    /**
     * Get customers list
     * Retrieves a listing of customers.  Required scope: **customers:read**
     * Responses:
     *  - 200: get list of customers
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, invalid subject,
     *  - 403: Invalid scope
     *
     * @param page  (optional)
     * @param perPage  (optional)
     * @param bankGuid Comma separated bank_guids to list customers for. (optional)
     * @param guid Comma separated customer_guids to list customers for. (optional)
     * @param label Comma separated labels to list customers for. (optional)
     * @return [CustomerListBankModel]
     */
    @GET("api/customers")
    suspend fun listCustomers(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("guid") guid: kotlin.String? = null, @Query("label") label: kotlin.String? = null): Response<CustomerListBankModel>

    /**
     * Patch Customer
     * Update a customer.  Required scope: **customers:write**
     * Responses:
     *  - 200: customer found
     *  - 401: Unauthorized - Authentication failed, invalid subject
     *  - 403: Invalid scope
     *  - 404: customer not found
     *
     * @param customerGuid Identifier for the customer.
     * @param patchCustomerBankModel 
     * @return [CustomerBankModel]
     */
    @PATCH("api/customers/{customer_guid}")
    suspend fun updateCustomer(@Path("customer_guid") customerGuid: kotlin.String, @Body patchCustomerBankModel: PatchCustomerBankModel): Response<CustomerBankModel>

}
