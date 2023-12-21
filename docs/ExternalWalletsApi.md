# ExternalWalletsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExternalWallet**](ExternalWalletsApi.md#createExternalWallet) | **POST** api/external_wallets | Create ExternalWallet
[**deleteExternalWallet**](ExternalWalletsApi.md#deleteExternalWallet) | **DELETE** api/external_wallets/{external_wallet_guid} | Delete External Wallet
[**getExternalWallet**](ExternalWalletsApi.md#getExternalWallet) | **GET** api/external_wallets/{external_wallet_guid} | Get External Wallet
[**listExternalWallets**](ExternalWalletsApi.md#listExternalWallets) | **GET** api/external_wallets | Get external wallets list



Create ExternalWallet

Create an ExternalWallet.  ## Wallet creation  External Wallets can be created for a Bank or a Customer.  To create a wallet for your Bank, omit the &#x60;customer_guid&#x60; parameter in the request body. To create a wallet for your Customers, include the &#x60;customer_guid&#x60; parameter in the request body.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the external wallet details in our private store | | pending | The Platform is waiting for the external wallet to be created | | completed | The Platform has created the external wallet | | failed | The Platform was not able to successfully create the external wallet | | deleting | The Platform is deleting the external wallet | | deleted | The Platform has deleted the external wallet |    External wallets can be added to the bank by leaving the customer_guid blank. External wallets added to the bank can be used by any customer of the bank.  External wallets can also be added to a specific customer by providing the customer_guid. External wallets added to a customer can only be used by that customer.  Required scope: **external_wallets:execute**

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
val owner : kotlin.String = owner_example // kotlin.String | The owner of the entity.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated external_wallet_guids to list external_wallets for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list external_wallets for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list external_wallets for.
val asset : kotlin.String = asset_example // kotlin.String | Comma separated assets to list external_wallets for.
val state : kotlin.String = state_example // kotlin.String | Comma separated states to list external_wallets for.

launch(Dispatchers.IO) {
    val result : ExternalWalletListBankModel = webService.listExternalWallets(page, perPage, owner, guid, bankGuid, customerGuid, asset, state)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **owner** | **kotlin.String**| The owner of the entity. | [optional]
 **guid** | **kotlin.String**| Comma separated external_wallet_guids to list external_wallets for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list external_wallets for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list external_wallets for. | [optional]
 **asset** | **kotlin.String**| Comma separated assets to list external_wallets for. | [optional]
 **state** | **kotlin.String**| Comma separated states to list external_wallets for. | [optional]

### Return type

[**ExternalWalletListBankModel**](ExternalWalletListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

