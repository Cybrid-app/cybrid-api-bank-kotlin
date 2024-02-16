# PaymentInstructionsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentInstruction**](PaymentInstructionsApi.md#createPaymentInstruction) | **POST** api/payment_instructions | Create Payment Instruction
[**getPaymentInstruction**](PaymentInstructionsApi.md#getPaymentInstruction) | **GET** api/payment_instructions/{payment_instruction_guid} | Get Payment Instruction
[**listPaymentInstructions**](PaymentInstructionsApi.md#listPaymentInstructions) | **GET** api/payment_instructions | List Payment Instructions



Create Payment Instruction

Creates a payment instruction.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the payment instruction details in our private store | | created | The Platform has created the payment instruction | | expired | The PaymentInstruction is no longer valid |    Required scope: **invoices:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(PaymentInstructionsApi::class.java)
val postPaymentInstructionBankModel : PostPaymentInstructionBankModel =  // PostPaymentInstructionBankModel | 

launch(Dispatchers.IO) {
    val result : PaymentInstructionBankModel = webService.createPaymentInstruction(postPaymentInstructionBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postPaymentInstructionBankModel** | [**PostPaymentInstructionBankModel**](PostPaymentInstructionBankModel.md)|  |

### Return type

[**PaymentInstructionBankModel**](PaymentInstructionBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Payment Instruction

Retrieves a payment_instruction.  Required scope: **invoices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(PaymentInstructionsApi::class.java)
val paymentInstructionGuid : kotlin.String = paymentInstructionGuid_example // kotlin.String | Identifier for the payment instruction.

launch(Dispatchers.IO) {
    val result : PaymentInstructionBankModel = webService.getPaymentInstruction(paymentInstructionGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstructionGuid** | **kotlin.String**| Identifier for the payment instruction. |

### Return type

[**PaymentInstructionBankModel**](PaymentInstructionBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Payment Instructions

Retrieves a list of payment instructions.  Required scope: **invoices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(PaymentInstructionsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated guids to list payment instructions for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list payment instructions for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list payment instructions for.
val invoiceGuid : kotlin.String = invoiceGuid_example // kotlin.String | Comma separated invoice_guids to list payment instructions for.

launch(Dispatchers.IO) {
    val result : PaymentInstructionListBankModel = webService.listPaymentInstructions(page, perPage, guid, bankGuid, customerGuid, invoiceGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated guids to list payment instructions for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list payment instructions for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list payment instructions for. | [optional]
 **invoiceGuid** | **kotlin.String**| Comma separated invoice_guids to list payment instructions for. | [optional]

### Return type

[**PaymentInstructionListBankModel**](PaymentInstructionListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

