package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.CounterpartyBankModel
import app.cybrid.cybrid_api_bank.client.models.CounterpartyListBankModel
import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostCounterpartyBankModel

interface CounterpartiesApi {
    /**
     * Create Counterparty
     * Creates a counterparty.  ## Counterparty Type  Counterparty resources are an abstraction for real world individuals and businesses that are not directly on the Cybrid Platform.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the counterparty details in our private store | | unverified | The Platform has not yet verified the counterparty&#39;s identity | | verified | The Platform has verified the counterparty&#39;s identity | | rejected | The Platform was not able to successfully verify the counterparty&#39;s identity |    Required scope: **counterparties:execute**
     * Responses:
     *  - 201: counterparty created
     *  - 422: Unprocessable Content
     *
     * @param postCounterpartyBankModel 
     * @return [CounterpartyBankModel]
     */
    @POST("api/counterparties")
    suspend fun createCounterparty(@Body postCounterpartyBankModel: PostCounterpartyBankModel): Response<CounterpartyBankModel>

    /**
     * Get Counterparty
     * Retrieves a counterparty.  Required scope: **counterparties:read**
     * Responses:
     *  - 200: counterparty found
     *
     * @param counterpartyGuid Identifier for the counterparty.
     * @param includePii Include PII in the response. (optional)
     * @return [CounterpartyBankModel]
     */
    @GET("api/counterparties/{counterparty_guid}")
    suspend fun getCounterparty(@Path("counterparty_guid") counterpartyGuid: kotlin.String, @Query("include_pii") includePii: kotlin.Boolean? = null): Response<CounterpartyBankModel>

    /**
     * Get counterparties list
     * Retrieves a listing of counterparties.  Required scope: **counterparties:read**
     * Responses:
     *  - 200: get list of counterparties
     *
     * @param page  (optional)
     * @param perPage  (optional)
     * @param bankGuid Comma separated bank_guids to list counterparties for. (optional)
     * @param customerGuid Comma separated customer_guids to list counterparties for. (optional)
     * @param guid Comma separated counterparty_guids to list counterparties for. (optional)
     * @param label Comma separated labels to list counterparties for. (optional)
     * @return [CounterpartyListBankModel]
     */
    @GET("api/counterparties")
    suspend fun listCounterparties(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("guid") guid: kotlin.String? = null, @Query("label") label: kotlin.String? = null): Response<CounterpartyListBankModel>

}
