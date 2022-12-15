# ExternalBankAccountsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExternalBankAccount**](ExternalBankAccountsApi.md#createExternalBankAccount) | **POST** api/external_bank_accounts | Create ExternalBankAccount
[**deleteExternalBankAccount**](ExternalBankAccountsApi.md#deleteExternalBankAccount) | **DELETE** api/external_bank_accounts/{external_bank_account_guid} | Delete External Bank Account
[**getExternalBankAccount**](ExternalBankAccountsApi.md#getExternalBankAccount) | **GET** api/external_bank_accounts/{external_bank_account_guid} | Get External Bank Account
[**listExternalBankAccounts**](ExternalBankAccountsApi.md#listExternalBankAccounts) | **GET** api/external_bank_accounts | Get external bank accounts list



Create ExternalBankAccount

Create an ExternalBankAccount.  Required scope: **external_bank_accounts:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalBankAccountsApi::class.java)
val postExternalBankAccountBankModel : PostExternalBankAccountBankModel =  // PostExternalBankAccountBankModel | 

launch(Dispatchers.IO) {
    val result : ExternalBankAccountBankModel = webService.createExternalBankAccount(postExternalBankAccountBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postExternalBankAccountBankModel** | [**PostExternalBankAccountBankModel**](PostExternalBankAccountBankModel.md)|  |

### Return type

[**ExternalBankAccountBankModel**](ExternalBankAccountBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete External Bank Account

Deletes an external bank account.  Required scope: **external_bank_accounts:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalBankAccountsApi::class.java)
val externalBankAccountGuid : kotlin.String = externalBankAccountGuid_example // kotlin.String | Identifier for the external bank account.

launch(Dispatchers.IO) {
    val result : ExternalBankAccountBankModel = webService.deleteExternalBankAccount(externalBankAccountGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBankAccountGuid** | **kotlin.String**| Identifier for the external bank account. |

### Return type

[**ExternalBankAccountBankModel**](ExternalBankAccountBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get External Bank Account

Retrieves an external bank account.  Required scope: **external_bank_accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalBankAccountsApi::class.java)
val externalBankAccountGuid : kotlin.String = externalBankAccountGuid_example // kotlin.String | Identifier for the external bank account.

launch(Dispatchers.IO) {
    val result : ExternalBankAccountBankModel = webService.getExternalBankAccount(externalBankAccountGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBankAccountGuid** | **kotlin.String**| Identifier for the external bank account. |

### Return type

[**ExternalBankAccountBankModel**](ExternalBankAccountBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get external bank accounts list

Retrieves a listing of external bank accounts.  Required scope: **external_bank_accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ExternalBankAccountsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated external_bank_account_guids to list external_bank_accounts for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list external_bank_accounts for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list external_bank_accounts for.

launch(Dispatchers.IO) {
    val result : ExternalBankAccountListBankModel = webService.listExternalBankAccounts(page, perPage, guid, bankGuid, customerGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated external_bank_account_guids to list external_bank_accounts for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list external_bank_accounts for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list external_bank_accounts for. | [optional]

### Return type

[**ExternalBankAccountListBankModel**](ExternalBankAccountListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

