# FeeConfigurationsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFeeConfiguration**](FeeConfigurationsApi.md#createFeeConfiguration) | **POST** api/fee_configurations | Create Fee Configuration
[**getFeeConfiguration**](FeeConfigurationsApi.md#getFeeConfiguration) | **GET** api/fee_configurations/{fee_configuration_guid} | Get Fee Configuration
[**listFeeConfigurations**](FeeConfigurationsApi.md#listFeeConfigurations) | **GET** api/fee_configurations | List Fee Configurations



Create Fee Configuration

Creates a fee configuration.  Required scope: **banks:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(FeeConfigurationsApi::class.java)
val postFeeConfigurationBankModel : PostFeeConfigurationBankModel =  // PostFeeConfigurationBankModel | 

launch(Dispatchers.IO) {
    val result : FeeConfigurationBankModel = webService.createFeeConfiguration(postFeeConfigurationBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postFeeConfigurationBankModel** | [**PostFeeConfigurationBankModel**](PostFeeConfigurationBankModel.md)|  |

### Return type

[**FeeConfigurationBankModel**](FeeConfigurationBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Fee Configuration

Retrieves a fee configuration.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(FeeConfigurationsApi::class.java)
val feeConfigurationGuid : kotlin.String = feeConfigurationGuid_example // kotlin.String | Identifier for the fee configuration.

launch(Dispatchers.IO) {
    val result : FeeConfigurationBankModel = webService.getFeeConfiguration(feeConfigurationGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feeConfigurationGuid** | **kotlin.String**| Identifier for the fee configuration. |

### Return type

[**FeeConfigurationBankModel**](FeeConfigurationBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Fee Configurations

Retrieves a listing of fee configurations for a bank.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(FeeConfigurationsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | 
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | 

launch(Dispatchers.IO) {
    val result : FeeConfigurationListBankModel = webService.listFeeConfigurations(page, perPage)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**|  | [optional]
 **perPage** | **java.math.BigDecimal**|  | [optional]

### Return type

[**FeeConfigurationListBankModel**](FeeConfigurationListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

