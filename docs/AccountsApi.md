# AccountsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** api/accounts | Create Account
[**getAccount**](AccountsApi.md#getAccount) | **GET** api/accounts/{account_guid} | Get Account
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** api/accounts | List Accounts



Create Account

Creates an account.  ## Account Type  An Account is tied to a specific cryptocurrency or fiat and is comprised of transactions and a current balance.  An account is required to allow a Customer to hold cryptocurrency or fiat on the Cybrid Platform.  At present, account&#39;s can be created as &#x60;trading&#x60; or &#x60;fiat &#x60; accounts and are required before a Customer can generate quotes or execute a &#x60;trade&#x60; or &#x60;transfer&#x60;.  ## Asset  The asset is the specific cryptocurrency or fiat that the account holds, e.g., &#39;BTC&#39; for Bitcoin or &#x60;USD&#x60; for US dollars. See the Symbols API for a complete list of cryptocurrencies and fiat supported.   ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the account details in our private store | | created | The Platform has created the account |    Required scope: **accounts:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AccountsApi::class.java)
val postAccountBankModel : PostAccountBankModel =  // PostAccountBankModel | 

launch(Dispatchers.IO) {
    val result : AccountBankModel = webService.createAccount(postAccountBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postAccountBankModel** | [**PostAccountBankModel**](PostAccountBankModel.md)|  |

### Return type

[**AccountBankModel**](AccountBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Account

Retrieves an account.  Required scope: **accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AccountsApi::class.java)
val accountGuid : kotlin.String = accountGuid_example // kotlin.String | Identifier for the account.

launch(Dispatchers.IO) {
    val result : AccountBankModel = webService.getAccount(accountGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountGuid** | **kotlin.String**| Identifier for the account. |

### Return type

[**AccountBankModel**](AccountBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Accounts

Retrieves a list of accounts.  Required scope: **accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AccountsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated account_guids to list accounts for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list accounts for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list accounts for.

launch(Dispatchers.IO) {
    val result : AccountListBankModel = webService.listAccounts(page, perPage, guid, bankGuid, customerGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated account_guids to list accounts for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list accounts for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list accounts for. | [optional]

### Return type

[**AccountListBankModel**](AccountListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

