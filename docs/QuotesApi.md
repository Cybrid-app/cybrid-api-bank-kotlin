# QuotesApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuote**](QuotesApi.md#createQuote) | **POST** /api/quotes | Create Quote
[**getQuote**](QuotesApi.md#getQuote) | **GET** /api/quotes/{quote_guid} | Get Quote
[**listQuotes**](QuotesApi.md#listQuotes) | **GET** /api/quotes | Get quotes list


<a name="createQuote"></a>
# **createQuote**
> QuoteBankModel createQuote(postQuoteBankModel)

Create Quote

Creates a quote.  Required scope: **quotes:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = QuotesApi()
val postQuoteBankModel : PostQuoteBankModel =  // PostQuoteBankModel | 
try {
    val result : QuoteBankModel = apiInstance.createQuote(postQuoteBankModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#createQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#createQuote")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuote"></a>
# **getQuote**
> QuoteBankModel getQuote(quoteGuid)

Get Quote

Retrieves a quote.  Required scope: **quotes:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = QuotesApi()
val quoteGuid : kotlin.String = quoteGuid_example // kotlin.String | Identifier for the quote.
try {
    val result : QuoteBankModel = apiInstance.getQuote(quoteGuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuote")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listQuotes"></a>
# **listQuotes**
> QuoteListBankModel listQuotes(page, perPage)

Get quotes list

Retrieves a listing of quotes for all customers of a bank.  Required scope: **quotes:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = QuotesApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : QuoteListBankModel = apiInstance.listQuotes(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#listQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#listQuotes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 0]
 **perPage** | **kotlin.Int**|  | [optional] [default to 10]

### Return type

[**QuoteListBankModel**](QuoteListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

