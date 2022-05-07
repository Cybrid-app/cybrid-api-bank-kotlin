# TradingConfigurationsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTradingConfiguration**](TradingConfigurationsApi.md#createTradingConfiguration) | **POST** api/trading_configurations | Create TradingConfiguration
[**getTradingConfiguration**](TradingConfigurationsApi.md#getTradingConfiguration) | **GET** api/trading_configurations/{trading_configuration_guid} | Get TradingConfiguration
[**listTradingConfigurations**](TradingConfigurationsApi.md#listTradingConfigurations) | **GET** api/trading_configurations | List trading configurations



Create TradingConfiguration

Creates a trading configuration.  Required scope: **banks:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TradingConfigurationsApi::class.java)
val postTradingConfigurationBankModel : PostTradingConfigurationBankModel =  // PostTradingConfigurationBankModel | 

launch(Dispatchers.IO) {
    val result : TradingConfigurationBankModel = webService.createTradingConfiguration(postTradingConfigurationBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postTradingConfigurationBankModel** | [**PostTradingConfigurationBankModel**](PostTradingConfigurationBankModel.md)|  |

### Return type

[**TradingConfigurationBankModel**](TradingConfigurationBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get TradingConfiguration

Retrieves a trading configuration.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TradingConfigurationsApi::class.java)
val tradingConfigurationGuid : kotlin.String = tradingConfigurationGuid_example // kotlin.String | Identifier for the trading configuration.

launch(Dispatchers.IO) {
    val result : TradingConfigurationBankModel = webService.getTradingConfiguration(tradingConfigurationGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradingConfigurationGuid** | **kotlin.String**| Identifier for the trading configuration. |

### Return type

[**TradingConfigurationBankModel**](TradingConfigurationBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List trading configurations

Retrieves a listing of trading configurations for a bank.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TradingConfigurationsApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : TradingConfigurationListBankModel = webService.listTradingConfigurations(page, perPage)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 0]
 **perPage** | **kotlin.Int**|  | [optional] [default to 10]

### Return type

[**TradingConfigurationListBankModel**](TradingConfigurationListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

