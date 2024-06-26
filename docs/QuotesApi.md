# QuotesApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuote**](QuotesApi.md#createQuote) | **POST** api/quotes | Create Quote
[**getQuote**](QuotesApi.md#getQuote) | **GET** api/quotes/{quote_guid} | Get Quote
[**listQuotes**](QuotesApi.md#listQuotes) | **GET** api/quotes | Get quotes list



Create Quote

Creates a quote.  ## Quote creation  Quotes can be created for a Bank or a Customer.  To create quotes for your Bank, omit the &#x60;customer_guid&#x60; parameter in the request body. To create quotes for your Customers, include the &#x60;customer_guid&#x60; parameter in the request body.  ## Failure codes  | Code | Description | |------|-------------| | invalid_amount | The amount on the invoice is unprocessable | | insufficient_balance | There are insufficient funds to process the quote | | invalid_invoice | The invoice cannot be processed |    Required scope: **quotes:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(QuotesApi::class.java)
val postQuoteBankModel : PostQuoteBankModel =  // PostQuoteBankModel | 

launch(Dispatchers.IO) {
    val result : QuoteBankModel = webService.createQuote(postQuoteBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postQuoteBankModel** | [**PostQuoteBankModel**](PostQuoteBankModel.md)|  |

### Return type

[**QuoteBankModel**](QuoteBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Quote

Retrieves a quote.  Required scope: **quotes:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(QuotesApi::class.java)
val quoteGuid : kotlin.String = quoteGuid_example // kotlin.String | Identifier for the quote.

launch(Dispatchers.IO) {
    val result : QuoteBankModel = webService.getQuote(quoteGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteGuid** | **kotlin.String**| Identifier for the quote. |

### Return type

[**QuoteBankModel**](QuoteBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get quotes list

Retrieves a listing of quotes for all customers of a bank.  Required scope: **quotes:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(QuotesApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | 
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | 
val guid : kotlin.String = guid_example // kotlin.String | Comma separated quote_guids to list quotes for.
val productType : kotlin.String = productType_example // kotlin.String | Comma separated product_types to list accounts for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list quotes for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list quotes for.
val side : kotlin.String = side_example // kotlin.String | Comma separated sides to list quotes for.

launch(Dispatchers.IO) {
    val result : QuoteListBankModel = webService.listQuotes(page, perPage, guid, productType, bankGuid, customerGuid, side)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**|  | [optional]
 **perPage** | **java.math.BigDecimal**|  | [optional]
 **guid** | **kotlin.String**| Comma separated quote_guids to list quotes for. | [optional]
 **productType** | **kotlin.String**| Comma separated product_types to list accounts for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list quotes for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list quotes for. | [optional]
 **side** | **kotlin.String**| Comma separated sides to list quotes for. | [optional]

### Return type

[**QuoteListBankModel**](QuoteListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

