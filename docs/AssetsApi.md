# AssetsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAssets**](AssetsApi.md#listAssets) | **GET** api/assets | Get assets list



Get assets list

Retrieves a listing of assets.

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AssetsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val code : kotlin.String = code_example // kotlin.String | Comma separated codes to list assets for.

launch(Dispatchers.IO) {
    val result : AssetListBankModel = webService.listAssets(page, perPage, code)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **code** | **kotlin.String**| Comma separated codes to list assets for. | [optional]

### Return type

[**AssetListBankModel**](AssetListBankModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

