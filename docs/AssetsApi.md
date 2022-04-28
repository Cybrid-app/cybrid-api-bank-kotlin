# AssetsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAssets**](AssetsApi.md#listAssets) | **GET** /api/assets | Get assets list


<a name="listAssets"></a>
# **listAssets**
> AssetListBankModel listAssets(page, perPage)

Get assets list

Retrieves a listing of assets.  Required scope: **prices:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = AssetsApi()
val page : kotlin.Int = 56 // kotlin.Int | The page index to retrieve.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of entities per page to return.
try {
    val result : AssetListBankModel = apiInstance.listAssets(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#listAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#listAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page index to retrieve. | [optional] [default to 0]
 **perPage** | **kotlin.Int**| The number of entities per page to return. | [optional] [default to 10]

### Return type

[**AssetListBankModel**](AssetListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

