# InvoicesApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelInvoice**](InvoicesApi.md#cancelInvoice) | **DELETE** api/invoices/{invoice_guid} | Cancel Invoice
[**createInvoice**](InvoicesApi.md#createInvoice) | **POST** api/invoices | Create Invoice
[**getInvoice**](InvoicesApi.md#getInvoice) | **GET** api/invoices/{invoice_guid} | Get Invoice
[**listInvoices**](InvoicesApi.md#listInvoices) | **GET** api/invoices | List Invoices



Cancel Invoice

Cancels an invoice.  Required scope: **invoices:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(InvoicesApi::class.java)
val invoiceGuid : kotlin.String = invoiceGuid_example // kotlin.String | Identifier for the invoice.

launch(Dispatchers.IO) {
    val result : InvoiceBankModel = webService.cancelInvoice(invoiceGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceGuid** | **kotlin.String**| Identifier for the invoice. |

### Return type

[**InvoiceBankModel**](InvoiceBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Create Invoice

Creates a invoice.  ## State  | State | Description | |-------|-------------| | storing    | The Platform is storing the invoice details in our private store | | unpaid     | The invoice is unpaid. Payment instructions can be generated for an invoice in this state | | cancelling | The invocie is in the process of being cancelled | | cancelled  | The invoice has been cancelled |  | settling   | The invoice has been paid and the funds associated with this invoice are in the process of being settled | | paid       | The invoice has been paid and the funds associated with this invoice have been settled |     Required scope: **invoices:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(InvoicesApi::class.java)
val postInvoiceBankModel : PostInvoiceBankModel =  // PostInvoiceBankModel | 

launch(Dispatchers.IO) {
    val result : InvoiceBankModel = webService.createInvoice(postInvoiceBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postInvoiceBankModel** | [**PostInvoiceBankModel**](PostInvoiceBankModel.md)|  |

### Return type

[**InvoiceBankModel**](InvoiceBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Invoice

Retrieves a invoice.  Required scope: **invoices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(InvoicesApi::class.java)
val invoiceGuid : kotlin.String = invoiceGuid_example // kotlin.String | Identifier for the payment instruction.

launch(Dispatchers.IO) {
    val result : InvoiceBankModel = webService.getInvoice(invoiceGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceGuid** | **kotlin.String**| Identifier for the payment instruction. |

### Return type

[**InvoiceBankModel**](InvoiceBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Invoices

Retrieves a list of invoices.  Required scope: **invoices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(InvoicesApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated guids to list invoices for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list invoices for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list invoices for.
val accountGuid : kotlin.String = accountGuid_example // kotlin.String | Comma separated account_guids to list invoices for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list invoices for.

launch(Dispatchers.IO) {
    val result : InvoiceListBankModel = webService.listInvoices(page, perPage, guid, bankGuid, customerGuid, accountGuid, label)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated guids to list invoices for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list invoices for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list invoices for. | [optional]
 **accountGuid** | **kotlin.String**| Comma separated account_guids to list invoices for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list invoices for. | [optional]

### Return type

[**InvoiceListBankModel**](InvoiceListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

