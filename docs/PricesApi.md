# PricesApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPrices**](PricesApi.md#listPrices) | **GET** /api/prices | Get Price


<a name="listPrices"></a>
# **listPrices**
> kotlin.collections.List&lt;SymbolPriceBankModel&gt; listPrices(symbol)

Get Price

Retrieves a listing of symbol prices.  ## Symbols  Symbol are pairs and are in the format asset-counter_asset, e.g., &#39;BTC-USD&#39; for the Bitcoin/ USD pair. See the Symbols API for a complete list of cryptocurrencies supported.    Required scope: **prices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = PricesApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Comma separated symbols to list prices for.
try {
    val result : kotlin.collections.List<SymbolPriceBankModel> = apiInstance.listPrices(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#listPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#listPrices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Comma separated symbols to list prices for. | [optional]

### Return type

[**kotlin.collections.List&lt;SymbolPriceBankModel&gt;**](SymbolPriceBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

