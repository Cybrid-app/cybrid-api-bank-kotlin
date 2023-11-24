# DepositBankAccountsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDepositBankAccount**](DepositBankAccountsApi.md#createDepositBankAccount) | **POST** api/deposit_bank_accounts | Create Deposit Bank Account
[**getDepositBankAccount**](DepositBankAccountsApi.md#getDepositBankAccount) | **GET** api/deposit_bank_accounts/{deposit_bank_account_guid} | Get Deposit Bank Account
[**listDepositBankAccounts**](DepositBankAccountsApi.md#listDepositBankAccounts) | **GET** api/deposit_bank_accounts | List Deposit Bank Accounts



Create Deposit Bank Account

Creates a deposit bank account.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the deposit bank account details in our private store | | created | The Platform has created the deposit bank account |    Required scope: **deposit_bank_accounts:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(DepositBankAccountsApi::class.java)
val postDepositBankAccountBankModel : PostDepositBankAccountBankModel =  // PostDepositBankAccountBankModel | 

launch(Dispatchers.IO) {
    val result : DepositBankAccountBankModel = webService.createDepositBankAccount(postDepositBankAccountBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postDepositBankAccountBankModel** | [**PostDepositBankAccountBankModel**](PostDepositBankAccountBankModel.md)|  |

### Return type

[**DepositBankAccountBankModel**](DepositBankAccountBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Deposit Bank Account

Retrieves a deposit bank account.  Required scope: **deposit_bank_accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(DepositBankAccountsApi::class.java)
val depositBankAccountGuid : kotlin.String = depositBankAccountGuid_example // kotlin.String | Identifier for the deposit bank account.

launch(Dispatchers.IO) {
    val result : DepositBankAccountBankModel = webService.getDepositBankAccount(depositBankAccountGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositBankAccountGuid** | **kotlin.String**| Identifier for the deposit bank account. |

### Return type

[**DepositBankAccountBankModel**](DepositBankAccountBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Deposit Bank Accounts

Retrieves a list of deposit bank accounts.  Required scope: **deposit_bank_accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(DepositBankAccountsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated guids to list deposit bank accounts for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list deposit bank accounts for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list deposit bank accounts for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list deposit bank accounts for.
val uniqueMemoId : kotlin.String = uniqueMemoId_example // kotlin.String | Comma separated unique memo ids to list deposit bank accounts for.

launch(Dispatchers.IO) {
    val result : DepositBankAccountListBankModel = webService.listDepositBankAccounts(page, perPage, guid, bankGuid, customerGuid, label, uniqueMemoId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated guids to list deposit bank accounts for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list deposit bank accounts for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list deposit bank accounts for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list deposit bank accounts for. | [optional]
 **uniqueMemoId** | **kotlin.String**| Comma separated unique memo ids to list deposit bank accounts for. | [optional]

### Return type

[**DepositBankAccountListBankModel**](DepositBankAccountListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

