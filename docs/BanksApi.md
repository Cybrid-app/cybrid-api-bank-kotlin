# BanksApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBank**](BanksApi.md#createBank) | **POST** api/banks | Create Bank
[**getBank**](BanksApi.md#getBank) | **GET** api/banks/{bank_guid} | Get Bank
[**listBanks**](BanksApi.md#listBanks) | **GET** api/banks | Get banks list
[**updateBank**](BanksApi.md#updateBank) | **PATCH** api/banks/{bank_guid} | Patch Bank



Create Bank

Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).    Required scope: **banks:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BanksApi::class.java)
val postBankBankModel : PostBankBankModel =  // PostBankBankModel | 

launch(Dispatchers.IO) {
    val result : BankBankModel = webService.createBank(postBankBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postBankBankModel** | [**PostBankBankModel**](PostBankBankModel.md)|  |

### Return type

[**BankBankModel**](BankBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Bank

Retrieves a bank.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BanksApi::class.java)
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Identifier for the bank.

launch(Dispatchers.IO) {
    val result : BankBankModel = webService.getBank(bankGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankGuid** | **kotlin.String**| Identifier for the bank. |

### Return type

[**BankBankModel**](BankBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get banks list

Retrieves a listing of bank.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BanksApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val type : kotlin.String = type_example // kotlin.String | Comma separated types to list banks for.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated bank_guids to list banks for.

launch(Dispatchers.IO) {
    val result : BankListBankModel = webService.listBanks(page, perPage, type, guid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **type** | **kotlin.String**| Comma separated types to list banks for. | [optional]
 **guid** | **kotlin.String**| Comma separated bank_guids to list banks for. | [optional]

### Return type

[**BankListBankModel**](BankListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Patch Bank

Update a bank.  Required scope: **banks:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BanksApi::class.java)
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Identifier for the bank.
val patchBankBankModel : PatchBankBankModel =  // PatchBankBankModel | 

launch(Dispatchers.IO) {
    val result : BankBankModel = webService.updateBank(bankGuid, patchBankBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankGuid** | **kotlin.String**| Identifier for the bank. |
 **patchBankBankModel** | [**PatchBankBankModel**](PatchBankBankModel.md)|  |

### Return type

[**BankBankModel**](BankBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

