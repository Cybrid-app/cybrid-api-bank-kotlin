package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.CustomerBankModel
import app.cybrid.cybrid_api_bank.client.models.CustomerListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostCustomerBankModel

interface CustomersApi {
    /**
     * Create Customer
     * Creates a customer.  ## Customer Type  Customer resources are an abstraction for real world individuals and businesses on the Cybrid Platform and are used throughout the platform to perform high level operations, e.g., create a quote, execute a trade, etc..  Customers can have additional resources attached to them, e.g., identity records, accounts, etc.  At present, Customer&#39;s can be created with type &#x60;individual&#x60;.    Required scope: **customers:execute**
     * Responses:
     *  - 201: customer created
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
     *
     * @param customerGuid Identifier for the customer. 
     * @param bankGuid Identifier for the bank. (optional)
     * @return [CustomerBankModel]
     */
    @GET("api/customers/{customer_guid}")
    suspend fun getCustomer(@Path("customer_guid") customerGuid: kotlin.String, @Query("bank_guid") bankGuid: kotlin.String? = null): Response<CustomerBankModel>

    /**
     * Get customers list
     * Retrieves a listing of customers.  Required scope: **customers:read**
     * Responses:
     *  - 200: get list of customers
     *
     * @param page  (optional, default to 0)
     * @param perPage  (optional, default to 10)
     * @param bankGuid Identifier for the bank. (optional)
     * @param guid Comma separated customer_guid to list customers for. (optional)
     * @return [CustomerListBankModel]
     */
    @GET("api/customers")
    suspend fun listCustomers(@Query("page") page: kotlin.Int? = null, @Query("per_page") perPage: kotlin.Int? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("guid") guid: kotlin.String? = null): Response<CustomerListBankModel>

}
