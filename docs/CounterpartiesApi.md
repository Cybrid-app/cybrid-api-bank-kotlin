# CounterpartiesApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCounterparty**](CounterpartiesApi.md#createCounterparty) | **POST** api/counterparties | Create Counterparty
[**getCounterparty**](CounterpartiesApi.md#getCounterparty) | **GET** api/counterparties/{counterparty_guid} | Get Counterparty
[**listCounterparties**](CounterpartiesApi.md#listCounterparties) | **GET** api/counterparties | Get counterparties list



Create Counterparty

Creates a counterparty.  ## Counterparty Type  Counterparty resources are an abstraction for real world individuals and businesses that are not directly on the Cybrid Platform.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the counterparty details in our private store | | unverified | The Platform has not yet verified the counterparty&#39;s identity | | verified | The Platform has verified the counterparty&#39;s identity | | rejected | The Platform was not able to successfully verify the counterparty&#39;s identity |    Required scope: **counterparties:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CounterpartiesApi::class.java)
val postCounterpartyBankModel : PostCounterpartyBankModel =  // PostCounterpartyBankModel | 

launch(Dispatchers.IO) {
    val result : CounterpartyBankModel = webService.createCounterparty(postCounterpartyBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCounterpartyBankModel** | [**PostCounterpartyBankModel**](PostCounterpartyBankModel.md)|  |

### Return type

[**CounterpartyBankModel**](CounterpartyBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Counterparty

Retrieves a counterparty.  Required scope: **counterparties:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CounterpartiesApi::class.java)
val counterpartyGuid : kotlin.String = counterpartyGuid_example // kotlin.String | Identifier for the counterparty.
val includePii : kotlin.Boolean = true // kotlin.Boolean | Include PII in the response.

launch(Dispatchers.IO) {
    val result : CounterpartyBankModel = webService.getCounterparty(counterpartyGuid, includePii)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterpartyGuid** | **kotlin.String**| Identifier for the counterparty. |
 **includePii** | **kotlin.Boolean**| Include PII in the response. | [optional]

### Return type

[**CounterpartyBankModel**](CounterpartyBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get counterparties list

Retrieves a listing of counterparties.  Required scope: **counterparties:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CounterpartiesApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | 
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | 
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list counterparties for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list counterparties for.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated counterparty_guids to list counterparties for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list counterparties for.

launch(Dispatchers.IO) {
    val result : CounterpartyListBankModel = webService.listCounterparties(page, perPage, bankGuid, customerGuid, guid, label)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**|  | [optional]
 **perPage** | **java.math.BigDecimal**|  | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list counterparties for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list counterparties for. | [optional]
 **guid** | **kotlin.String**| Comma separated counterparty_guids to list counterparties for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list counterparties for. | [optional]

### Return type

[**CounterpartyListBankModel**](CounterpartyListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

