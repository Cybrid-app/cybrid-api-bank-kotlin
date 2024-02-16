package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PaymentInstructionBankModel
import app.cybrid.cybrid_api_bank.client.models.PaymentInstructionListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostPaymentInstructionBankModel

interface PaymentInstructionsApi {
    /**
     * Create Payment Instruction
     * Creates a payment instruction.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the payment instruction details in our private store | | created | The Platform has created the payment instruction | | expired | The PaymentInstruction is no longer valid |    Required scope: **invoices:write**
     * Responses:
     *  - 201: Payment Instruction created
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postPaymentInstructionBankModel 
     * @return [PaymentInstructionBankModel]
     */
    @POST("api/payment_instructions")
    suspend fun createPaymentInstruction(@Body postPaymentInstructionBankModel: PostPaymentInstructionBankModel): Response<PaymentInstructionBankModel>

    /**
     * Get Payment Instruction
     * Retrieves a payment_instruction.  Required scope: **invoices:read**
     * Responses:
     *  - 200: payment_instruction found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: payment_instruction not found
     *
     * @param paymentInstructionGuid Identifier for the payment instruction.
     * @return [PaymentInstructionBankModel]
     */
    @GET("api/payment_instructions/{payment_instruction_guid}")
    suspend fun getPaymentInstruction(@Path("payment_instruction_guid") paymentInstructionGuid: kotlin.String): Response<PaymentInstructionBankModel>

    /**
     * List Payment Instructions
     * Retrieves a list of payment instructions.  Required scope: **invoices:read**
     * Responses:
     *  - 200: get list of payment instructions
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated guids to list payment instructions for. (optional)
     * @param bankGuid Comma separated bank_guids to list payment instructions for. (optional)
     * @param customerGuid Comma separated customer_guids to list payment instructions for. (optional)
     * @param invoiceGuid Comma separated invoice_guids to list payment instructions for. (optional)
     * @return [PaymentInstructionListBankModel]
     */
    @GET("api/payment_instructions")
    suspend fun listPaymentInstructions(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null, @Query("invoice_guid") invoiceGuid: kotlin.String? = null): Response<PaymentInstructionListBankModel>

}
