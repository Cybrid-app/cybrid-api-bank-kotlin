# DepositAddressesApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDepositAddress**](DepositAddressesApi.md#createDepositAddress) | **POST** api/deposit_addresses | Create Deposit Address
[**getDepositAddress**](DepositAddressesApi.md#getDepositAddress) | **GET** api/deposit_addresses/{deposit_address_guid} | Get Deposit Address
[**listDepositAddresses**](DepositAddressesApi.md#listDepositAddresses) | **GET** api/deposit_addresses | List Deposit Addresses



Create Deposit Address

Creates a deposit address.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the deposit address details in our private store | | created | The Platform has created the deposit address |    Required scope: **deposit_addresses:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(DepositAddressesApi::class.java)
val postDepositAddressBankModel : PostDepositAddressBankModel =  // PostDepositAddressBankModel | 

launch(Dispatchers.IO) {
    val result : DepositAddressBankModel = webService.createDepositAddress(postDepositAddressBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postDepositAddressBankModel** | [**PostDepositAddressBankModel**](PostDepositAddressBankModel.md)|  |

### Return type

[**DepositAddressBankModel**](DepositAddressBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Deposit Address

Retrieves a deposit address.  Required scope: **deposit_addresses:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(DepositAddressesApi::class.java)
val depositAddressGuid : kotlin.String = depositAddressGuid_example // kotlin.String | Identifier for the deposit address.

launch(Dispatchers.IO) {
    val result : DepositAddressBankModel = webService.getDepositAddress(depositAddressGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositAddressGuid** | **kotlin.String**| Identifier for the deposit address. |

### Return type

[**DepositAddressBankModel**](DepositAddressBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Deposit Addresses

Retrieves a list of deposit addresses.  Required scope: **deposit_addresses:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(DepositAddressesApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated guids to list deposit addresses for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list deposit addresses for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list deposit addresses for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list deposit addresses for.

launch(Dispatchers.IO) {
    val result : DepositAddressListBankModel = webService.listDepositAddresses(page, perPage, guid, bankGuid, customerGuid, label)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated guids to list deposit addresses for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list deposit addresses for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list deposit addresses for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list deposit addresses for. | [optional]

### Return type

[**DepositAddressListBankModel**](DepositAddressListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

