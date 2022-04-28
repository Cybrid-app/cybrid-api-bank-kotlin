# SymbolsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSymbols**](SymbolsApi.md#listSymbols) | **GET** /api/symbols | Get Symbols list


<a name="listSymbols"></a>
# **listSymbols**
> kotlin.collections.List&lt;kotlin.String&gt; listSymbols()

Get Symbols list

Retrieves a listing of symbols.  Required scope: **prices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = SymbolsApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.listSymbols()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SymbolsApi#listSymbols")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SymbolsApi#listSymbols")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

