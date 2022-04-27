# AccountsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** /api/accounts | Create Account
[**getAccount**](AccountsApi.md#getAccount) | **GET** /api/accounts/{account_guid} | Get Account
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** /api/accounts | List Accounts


<a name="createAccount"></a>
# **createAccount**
> AccountBankModel createAccount(postAccountBankModel)

Create Account

Creates an account.  ## Account Type  An Account is tied to a specific cryptocurrency and is comprised of transactions and a current balance.  An account is required to allow a Customer to hold cryptocurrency on the Cybrid Platform.  At present, account&#39;s can be created as &#x60;trading&#x60; accounts and are required before a Customer can generate a quote and execute a trade.  ## Asset  The asset is the specific cryptocurrency that the account holds, e.g., &#39;BTC&#39; for Bitcoin. See the Symbols API for a complete list of cryptocurrencies supported.     Required scope: **accounts:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = AccountsApi()
val postAccountBankModel : PostAccountBankModel =  // PostAccountBankModel | 
try {
    val result : AccountBankModel = apiInstance.createAccount(postAccountBankModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccount")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccount"></a>
# **getAccount**
> AccountBankModel getAccount(accountGuid)

Get Account

Retrieves an account.  Required scope: **accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = AccountsApi()
val accountGuid : kotlin.String = accountGuid_example // kotlin.String | Identifier for the account.
try {
    val result : AccountBankModel = apiInstance.getAccount(accountGuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccount")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccounts"></a>
# **listAccounts**
> AccountListBankModel listAccounts(page, perPage, guid)

List Accounts

Retrieves a list of accounts.  Required scope: **accounts:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = AccountsApi()
val page : kotlin.Int = 56 // kotlin.Int | The page index to retrieve.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated account_guids to list accounts for.
try {
    val result : AccountListBankModel = apiInstance.listAccounts(page, perPage, guid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page index to retrieve. | [optional] [default to 0]
 **perPage** | **kotlin.Int**| The number of entities per page to return. | [optional] [default to 10]
 **guid** | **kotlin.String**| Comma separated account_guids to list accounts for. | [optional]

### Return type

[**AccountListBankModel**](AccountListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

