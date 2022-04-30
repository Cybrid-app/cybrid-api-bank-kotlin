# BanksApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBank**](BanksApi.md#createBank) | **POST** api/banks | Create Bank
[**getBank**](BanksApi.md#getBank) | **GET** api/banks/{bank_guid} | Get Bank
[**listBanks**](BanksApi.md#listBanks) | **GET** api/banks | Get banks list



Create Bank

Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).  ## Backstopped Funding Source  A Backstopped Funding Source is an agreement between the Organization and Cybrid on transaction settlement. A Backstopped Funding Source is an escrow bank account that the Organization tops up on a regular basis and is drawn down by the Cybrid Platform when trades are executed by the Bank for its customers.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;backstopped_funding_source&#x60; flag. At present, backstopped funding sources is the supported method for funding trades on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.  ## Attestation Identity Records  Attestation Identity Records is a method the Cybrid Platform uses to verify the identity of a Bank&#39;s customers. Please see the documentation under the create Identity Record API for more technical detail.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;attestation_identity_records&#x60; flag. At present, attestation identity records is the supported method for verifying a customer&#39;s identity on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.    Required scope: **banks:execute**

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
val page : kotlin.Int = 56 // kotlin.Int | The page index to retrieve.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of entities per page to return.

launch(Dispatchers.IO) {
    val result : BankListBankModel = webService.listBanks(page, perPage)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

