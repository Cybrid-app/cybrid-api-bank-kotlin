# TradesApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrade**](TradesApi.md#createTrade) | **POST** api/trades | Create Trade
[**getTrade**](TradesApi.md#getTrade) | **GET** api/trades/{trade_guid} | Get Trade
[**listTrades**](TradesApi.md#listTrades) | **GET** api/trades | Get trades list



Create Trade

Creates a trade.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | pending | The Platform is executing the trade | | cancelled | The Platform has cancelled the trade | | settling | The Platform is settling the trade | | completed | The Platform has successfully completed the trade | | failed | The Platform was not able to successfully complete the trade |  ## Failure codes  | Code | Description | |------|-------------| | non_sufficient_funds | The customer does not have enough funds to complete the trade | | unsupported | The trading pair is not supported for this customer | | limit_exceeded | The customer is over the limits that have been set for them for this activity |    Required scope: **trades:execute**

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
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated trade_guids to list trades for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list trades for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list trades for.
val accountGuid : kotlin.String = accountGuid_example // kotlin.String | Comma separated account_guids to list trades for.
val state : kotlin.String = state_example // kotlin.String | Comma separated states to list trades for.
val side : kotlin.String = side_example // kotlin.String | Comma separated sides to list trades for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list trades for.
val createdAtGte : kotlin.String = createdAtGte_example // kotlin.String | Created at start date inclusive lower bound, ISO8601.
val createdAtLt : kotlin.String = createdAtLt_example // kotlin.String | Created at end date exclusive upper bound, ISO8601.
val updatedAtGte : kotlin.String = updatedAtGte_example // kotlin.String | Updated at start date inclusive lower bound, ISO8601.
val updatedAtLt : kotlin.String = updatedAtLt_example // kotlin.String | Updated at end date exclusive upper bound, ISO8601.

launch(Dispatchers.IO) {
    val result : TradeListBankModel = webService.listTrades(page, perPage, guid, bankGuid, customerGuid, accountGuid, state, side, label, createdAtGte, createdAtLt, updatedAtGte, updatedAtLt)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated trade_guids to list trades for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list trades for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list trades for. | [optional]
 **accountGuid** | **kotlin.String**| Comma separated account_guids to list trades for. | [optional]
 **state** | **kotlin.String**| Comma separated states to list trades for. | [optional]
 **side** | **kotlin.String**| Comma separated sides to list trades for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list trades for. | [optional]
 **createdAtGte** | **kotlin.String**| Created at start date inclusive lower bound, ISO8601. | [optional]
 **createdAtLt** | **kotlin.String**| Created at end date exclusive upper bound, ISO8601. | [optional]
 **updatedAtGte** | **kotlin.String**| Updated at start date inclusive lower bound, ISO8601. | [optional]
 **updatedAtLt** | **kotlin.String**| Updated at end date exclusive upper bound, ISO8601. | [optional]

### Return type

[**TradeListBankModel**](TradeListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

