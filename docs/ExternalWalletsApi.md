# ExternalWalletsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExternalWallet**](ExternalWalletsApi.md#createExternalWallet) | **POST** api/external_wallets | Create ExternalWallet
[**deleteExternalWallet**](ExternalWalletsApi.md#deleteExternalWallet) | **DELETE** api/external_wallets/{external_wallet_guid} | Delete External Wallet
[**getExternalWallet**](ExternalWalletsApi.md#getExternalWallet) | **GET** api/external_wallets/{external_wallet_guid} | Get External Wallet
[**listExternalWallets**](ExternalWalletsApi.md#listExternalWallets) | **GET** api/external_wallets | Get external wallets list



Create ExternalWallet

Create an ExternalWallet.  Required scope: **external_wallets:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalWalletsApi::class.java)
val postExternalWalletBankModel : PostExternalWalletBankModel =  // PostExternalWalletBankModel | 

launch(Dispatchers.IO) {
    val result : ExternalWalletBankModel = webService.createExternalWallet(postExternalWalletBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postExternalWalletBankModel** | [**PostExternalWalletBankModel**](PostExternalWalletBankModel.md)|  |

### Return type

[**ExternalWalletBankModel**](ExternalWalletBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete External Wallet

Deletes an external wallet.  Required scope: **external_wallets:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalWalletsApi::class.java)
val externalWalletGuid : kotlin.String = externalWalletGuid_example // kotlin.String | Identifier for the external wallet.

launch(Dispatchers.IO) {
    val result : ExternalWalletBankModel = webService.deleteExternalWallet(externalWalletGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalWalletGuid** | **kotlin.String**| Identifier for the external wallet. |

### Return type

[**ExternalWalletBankModel**](ExternalWalletBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get External Wallet

Retrieves an external_wallet.  Required scope: **external_wallets:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalWalletsApi::class.java)
val externalWalletGuid : kotlin.String = externalWalletGuid_example // kotlin.String | Identifier for the external_wallet.

launch(Dispatchers.IO) {
    val result : ExternalWalletBankModel = webService.getExternalWallet(externalWalletGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalWalletGuid** | **kotlin.String**| Identifier for the external_wallet. |

### Return type

[**ExternalWalletBankModel**](ExternalWalletBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get external wallets list

Retrieves a listing of external wallets.  Required scope: **external_wallets:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalWalletsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated external_wallet_guids to list external_wallets for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list external_wallets for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list external_wallets for.

launch(Dispatchers.IO) {
    val result : ExternalWalletListBankModel = webService.listExternalWallets(page, perPage, guid, bankGuid, customerGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated external_wallet_guids to list external_wallets for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list external_wallets for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list external_wallets for. | [optional]

### Return type

[**ExternalWalletListBankModel**](ExternalWalletListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

