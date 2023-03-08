# BanksApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBank**](BanksApi.md#createBank) | **POST** api/banks | Create Bank
[**getBank**](BanksApi.md#getBank) | **GET** api/banks/{bank_guid} | Get Bank
[**listBanks**](BanksApi.md#listBanks) | **GET** api/banks | Get banks list
[**updateBank**](BanksApi.md#updateBank) | **PATCH** api/banks/{bank_guid} | Patch Bank



Create Bank

Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).  ## Backstopped Funding Source  A Backstopped Funding Source is an agreement between the Organization and Cybrid on transaction settlement. A Backstopped Funding Source is an escrow bank account that the Organization tops up on a regular basis and is drawn down by the Cybrid Platform when trades are executed by the Bank for its customers.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;backstopped_funding_source&#x60; flag.  To allow customers to trade in a bank that has a Backstopped Funding Source the customer&#39;s &#x60;fiat&#x60; account must be topped up using a &#x60;book transfer&#x60; prior to executing any trades.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.  ## Plaid Funding Source  A Plaid Funding Source allows customers to directly connect their TradFi bank accounts to the Cybrid platform.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;plaid_funding_source&#x60; flag.  To allow customers to trade in a bank that has a Plaid Funding Source the customer&#39;s &#x60;fiat&#x60; account must first be connected to the platform using Cybrid&#39;s &#x60;Workflows&#x60; and &#x60;ExternalBankAccounts&#x60; APIs. Once their &#x60;ExternalBankAccount&#x60; is created on the Cybrid Platform their &#x60;fiat&#x60; account must be topped up using a &#x60;funding&#x60; transfer prior to executing any trades.  ## Attestation Identity Records  Attestation Identity Records is a method the Cybrid Platform uses to verify the identity of a Bank&#39;s customers. Please see the documentation under the create Identity Record API for more technical detail.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;attestation_identity_records&#x60; flag. At present, attestation identity records is the supported method for verifying a customer&#39;s identity on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.    Required scope: **banks:execute**

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
val guid : kotlin.String = guid_example // kotlin.String | Comma separated bank_guids to list banks for.

launch(Dispatchers.IO) {
    val result : BankListBankModel = webService.listBanks(page, perPage, guid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
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

