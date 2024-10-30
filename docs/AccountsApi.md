# AccountsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** api/accounts | Create Account
[**getAccount**](AccountsApi.md#getAccount) | **GET** api/accounts/{account_guid} | Get Account
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** api/accounts | List Accounts



Create Account

Creates an account.  ## Account Type  An Account is tied to a specific cryptocurrency or fiat and is comprised of transactions and a current balance.  An account is required to allow a Bank or Customer to hold cryptocurrency or a Customer to hold fiat on the Cybrid Platform.  At present, accounts can be created as &#x60;trading&#x60;, &#x60;storage&#x60; or &#x60;fiat &#x60; accounts and are required before a Customer can generate quotes or execute a &#x60;trade&#x60; or &#x60;transfer&#x60;.  To create accounts for your Bank, omit the &#x60;customer_guid&#x60; parameter in the request body. To create accounts for your Customers, include the &#x60;customer_guid&#x60; parameter in the request body.  At the bank level, &#x60;invoice_operations&#x60; accounts can be configured to pre-fund your customers&#39; Lightning Network operations.  ## Asset  The asset is the specific cryptocurrency or fiat that the account holds, e.g., &#39;BTC&#39; for Bitcoin or &#x60;USD&#x60; for US dollars. See the Symbols API for a complete list of cryptocurrencies and fiat supported.   ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the account details in our private store | | created | The Platform has created the account |    Required scope: **accounts:execute**

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
val owner : kotlin.String = owner_example // kotlin.String | The owner of the entity.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated account_guids to list accounts for.
val type : kotlin.String = type_example // kotlin.String | Comma separated account_types to list accounts for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list accounts for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list accounts for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list accounts for.

launch(Dispatchers.IO) {
    val result : AccountListBankModel = webService.listAccounts(page, perPage, owner, guid, type, bankGuid, customerGuid, label)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **owner** | **kotlin.String**| The owner of the entity. | [optional]
 **guid** | **kotlin.String**| Comma separated account_guids to list accounts for. | [optional]
 **type** | **kotlin.String**| Comma separated account_types to list accounts for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list accounts for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list accounts for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list accounts for. | [optional]

### Return type

[**AccountListBankModel**](AccountListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

