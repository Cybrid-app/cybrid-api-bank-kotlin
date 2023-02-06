package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.DepositAddressBankModel
import app.cybrid.cybrid_api_bank.client.models.DepositAddressListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostDepositAddressBankModel

interface DepositAddressesApi {
    /**
     * Create Deposit Address
     * Create an Deposit Address.  Required scope: **deposit_addresses:execute**
     * Responses:
     *  - 201: Deposit Address created
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postDepositAddressBankModel 
     * @return [DepositAddressBankModel]
     */
    @POST("api/deposit_addresses")
    suspend fun createDepositAddress(@Body postDepositAddressBankModel: PostDepositAddressBankModel): Response<DepositAddressBankModel>

    /**
     * Get Deposit Address
     * Retrieves a deposit address.  Required scope: **deposit_addresses:read**
     * Responses:
     *  - 200: deposit address found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: deposit_address not found
     *
     * @param depositAddressGuid Identifier for the deposit address.
     * @return [DepositAddressBankModel]
     */
    @GET("api/deposit_addresses/{deposit_address_guid}")
    suspend fun getDepositAddress(@Path("deposit_address_guid") depositAddressGuid: kotlin.String): Response<DepositAddressBankModel>

    /**
     * List Deposit Addresses
     * Retrieves a list of deposit addresses.  Required scope: **deposit_addresses:read**
     * Responses:
     *  - 200: get list of deposit addresses
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated guids to list deposit addresses for. (optional)
     * @param bankGuid Comma separated bank_guids to list deposit addresses for. (optional)
     * @param customerGuid Comma separated customer_guids to list deposit addresses for. (optional)
     * @return [DepositAddressListBankModel]
     */
    @GET("api/deposit_addresses")
    suspend fun listDepositAddresses(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<DepositAddressListBankModel>

}
