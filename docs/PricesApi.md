# PricesApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPrices**](PricesApi.md#listPrices) | **GET** api/prices | Get Price



Get Price

Retrieves a listing of symbol prices.  ## Symbols  Symbol are pairs and are in the format asset-counter_asset, e.g., &#39;BTC-USD&#39; for the Bitcoin/ USD pair. See the Symbols API for a complete list of cryptocurrencies supported.    Required scope: **prices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(PricesApi::class.java)
val symbol : kotlin.String = symbol_example // kotlin.String | Comma separated trading symbols to list prices for.
val tradingSymbol : kotlin.String = tradingSymbol_example // kotlin.String | Comma separated trading symbols to list prices for.
val payoutSymbol : kotlin.String = payoutSymbol_example // kotlin.String | Comma separated payout symbols to list prices for.
val payoutCountryCode : kotlin.String = payoutCountryCode_example // kotlin.String | Comma separated payout country codes to list prices for.
val payoutParticipantsType : kotlin.String = payoutParticipantsType_example // kotlin.String | Comma separated payout participants types to list prices for.
val payoutRoute : kotlin.String = payoutRoute_example // kotlin.String | Comma separated payout routes to list prices for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | The bank identifier to retrieve prices for.

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<SymbolPriceBankModel> = webService.listPrices(symbol, tradingSymbol, payoutSymbol, payoutCountryCode, payoutParticipantsType, payoutRoute, bankGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Comma separated trading symbols to list prices for. | [optional]
 **tradingSymbol** | **kotlin.String**| Comma separated trading symbols to list prices for. | [optional]
 **payoutSymbol** | **kotlin.String**| Comma separated payout symbols to list prices for. | [optional]
 **payoutCountryCode** | **kotlin.String**| Comma separated payout country codes to list prices for. | [optional]
 **payoutParticipantsType** | **kotlin.String**| Comma separated payout participants types to list prices for. | [optional]
 **payoutRoute** | **kotlin.String**| Comma separated payout routes to list prices for. | [optional]
 **bankGuid** | **kotlin.String**| The bank identifier to retrieve prices for. | [optional]

### Return type

[**kotlin.collections.List&lt;SymbolPriceBankModel&gt;**](SymbolPriceBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

