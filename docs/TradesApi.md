# TradesApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrade**](TradesApi.md#createTrade) | **POST** api/trades | Create Trade
[**getTrade**](TradesApi.md#getTrade) | **GET** api/trades/{trade_guid} | Get Trade
[**listTrades**](TradesApi.md#listTrades) | **GET** api/trades | Get trades list



Create Trade

Creates a trade.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | initiating | The Platform has begun to perform the trade | | pending | The Platform is executing the trade | | settling | The Platform is settling the trade | | completed | The Platform has successfully completed the trade | | failed | The Platform was not able to successfully complete the trade |    Required scope: **trades:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TradesApi::class.java)
val postTradeBankModel : PostTradeBankModel =  // PostTradeBankModel | 

launch(Dispatchers.IO) {
    val result : TradeBankModel = webService.createTrade(postTradeBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postTradeBankModel** | [**PostTradeBankModel**](PostTradeBankModel.md)|  |

### Return type

[**TradeBankModel**](TradeBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Trade

Retrieves a trade.  Required scope: **trades:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TradesApi::class.java)
val tradeGuid : kotlin.String = tradeGuid_example // kotlin.String | Identifier for the trade.

launch(Dispatchers.IO) {
    val result : TradeBankModel = webService.getTrade(tradeGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeGuid** | **kotlin.String**| Identifier for the trade. |

### Return type

[**TradeBankModel**](TradeBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get trades list

Retrieves a listing of trades.  Required scope: **trades:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TradesApi::class.java)
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | The customer's identifier.
val accountGuid : kotlin.String = accountGuid_example // kotlin.String | The account's identifier.
val page : kotlin.Int = 56 // kotlin.Int | The page index to retrieve.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated trade_guids to list trades for.

launch(Dispatchers.IO) {
    val result : TradeListBankModel = webService.listTrades(customerGuid, accountGuid, page, perPage, guid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerGuid** | **kotlin.String**| The customer&#39;s identifier. |
 **accountGuid** | **kotlin.String**| The account&#39;s identifier. |
 **page** | **kotlin.Int**| The page index to retrieve. | [optional] [default to 0]
 **perPage** | **kotlin.Int**| The number of entities per page to return. | [optional] [default to 10]
 **guid** | **kotlin.String**| Comma separated trade_guids to list trades for. | [optional]

### Return type

[**TradeListBankModel**](TradeListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

