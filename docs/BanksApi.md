# BanksApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBank**](BanksApi.md#createBank) | **POST** /api/banks | Create Bank
[**getBank**](BanksApi.md#getBank) | **GET** /api/banks/{bank_guid} | Get Bank
[**listBanks**](BanksApi.md#listBanks) | **GET** /api/banks | Get banks list


<a name="createBank"></a>
# **createBank**
> BankBankModel createBank(postBankBankModel)

Create Bank

Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).  ## Backstopped Funding Source  A Backstopped Funding Source is an agreement between the Organization and Cybrid on transaction settlement. A Backstopped Funding Source is an escrow bank account that the Organization tops up on a regular basis and is drawn down by the Cybrid Platform when trades are executed by the Bank for its customers.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;backstopped_funding_source&#x60; flag. At present, backstopped funding sources is the supported method for funding trades on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.  ## Attestation Identity Records  Attestation Identity Records is a method the Cybrid Platform uses to verify the identity of a Bank&#39;s customers. Please see the documentation under the create Identity Record API for more technical detail.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;attestation_identity_records&#x60; flag. At present, attestation identity records is the supported method for verifying a customer&#39;s identity on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.    Required scope: **banks:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = BanksApi()
val postBankBankModel : PostBankBankModel =  // PostBankBankModel | 
try {
    val result : BankBankModel = apiInstance.createBank(postBankBankModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BanksApi#createBank")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BanksApi#createBank")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBank"></a>
# **getBank**
> BankBankModel getBank(bankGuid)

Get Bank

Retrieves a bank.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = BanksApi()
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Identifier for the bank.
try {
    val result : BankBankModel = apiInstance.getBank(bankGuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BanksApi#getBank")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BanksApi#getBank")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBanks"></a>
# **listBanks**
> BankListBankModel listBanks(page, perPage)

Get banks list

Retrieves a listing of bank.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = BanksApi()
val page : kotlin.Int = 56 // kotlin.Int | The page index to retrieve.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of entities per page to return.
try {
    val result : BankListBankModel = apiInstance.listBanks(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BanksApi#listBanks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BanksApi#listBanks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page index to retrieve. | [optional] [default to 0]
 **perPage** | **kotlin.Int**| The number of entities per page to return. | [optional] [default to 10]

### Return type

[**BankListBankModel**](BankListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

