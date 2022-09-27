# SymbolsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSymbols**](SymbolsApi.md#listSymbols) | **GET** api/symbols | Get Symbols list



Get Symbols list

Retrieves a listing of symbols.

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SymbolsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<kotlin.String> = webService.listSymbols()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

