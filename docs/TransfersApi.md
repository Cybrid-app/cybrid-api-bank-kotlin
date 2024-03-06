# TransfersApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransfer**](TransfersApi.md#createTransfer) | **POST** api/transfers | Create Transfer
[**getTransfer**](TransfersApi.md#getTransfer) | **GET** api/transfers/{transfer_guid} | Get Transfer
[**listTransfers**](TransfersApi.md#listTransfers) | **GET** api/transfers | Get transfers list



Create Transfer

Creates a transfer.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | reviewing | The Platform is reviewing the transfer for compliance | | pending | The Platform is executing the transfer | | completed | The Platform has successfully completed the transfer | | failed | The Platform was not able to successfully complete the transfer |  ## Failure codes  | Code | Description | |------|-------------| | non_sufficient_funds | The customer does not have enough funds to complete the transfer | | refresh_required | The transfer&#39;s associated external_bank_account needs to be reconnected via Plaid | | party_name_invalid | The transfer&#39;s associated external bank account has an invalid party name | | limit_exceeded | The customer is over the limits that have been set for them for this activity | | compliance_rejection | The transfer was rejected for compliance reasons | | payment_rail_invalid | The payment rail specified for the transfer is not supported by the external bank account |    Required scope: **transfers:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TransfersApi::class.java)
val postTransferBankModel : PostTransferBankModel =  // PostTransferBankModel | 

launch(Dispatchers.IO) {
    val result : TransferBankModel = webService.createTransfer(postTransferBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postTransferBankModel** | [**PostTransferBankModel**](PostTransferBankModel.md)|  |

### Return type

[**TransferBankModel**](TransferBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Transfer

Retrieves a transfer.  Required scope: **transfers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TransfersApi::class.java)
val transferGuid : kotlin.String = transferGuid_example // kotlin.String | Identifier for the transfer.

launch(Dispatchers.IO) {
    val result : TransferBankModel = webService.getTransfer(transferGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferGuid** | **kotlin.String**| Identifier for the transfer. |

### Return type

[**TransferBankModel**](TransferBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get transfers list

Retrieves a listing of transfers.  Required scope: **transfers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TransfersApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated transfer_guids to list transfers for.
val transferType : kotlin.String = transferType_example // kotlin.String | Comma separated transfer_types to list accounts for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list transfers for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list transfers for.
val accountGuid : kotlin.String = accountGuid_example // kotlin.String | Comma separated account_guids to list transfers for.
val state : kotlin.String = state_example // kotlin.String | Comma separated states to list transfers for.
val side : kotlin.String = side_example // kotlin.String | Comma separated sides to list transfers for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list transfers for.
val createdAtGte : kotlin.String = createdAtGte_example // kotlin.String | Created at start date inclusive lower bound, ISO8601
val createdAtLt : kotlin.String = createdAtLt_example // kotlin.String | Created at end date exclusive upper bound, ISO8601.
val updatedAtGte : kotlin.String = updatedAtGte_example // kotlin.String | Created at start date inclusive lower bound, ISO8601
val updatedAtLt : kotlin.String = updatedAtLt_example // kotlin.String | Created at end date exclusive upper bound, ISO8601.

launch(Dispatchers.IO) {
    val result : TransferListBankModel = webService.listTransfers(page, perPage, guid, transferType, bankGuid, customerGuid, accountGuid, state, side, label, createdAtGte, createdAtLt, updatedAtGte, updatedAtLt)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated transfer_guids to list transfers for. | [optional]
 **transferType** | **kotlin.String**| Comma separated transfer_types to list accounts for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list transfers for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list transfers for. | [optional]
 **accountGuid** | **kotlin.String**| Comma separated account_guids to list transfers for. | [optional]
 **state** | **kotlin.String**| Comma separated states to list transfers for. | [optional]
 **side** | **kotlin.String**| Comma separated sides to list transfers for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list transfers for. | [optional]
 **createdAtGte** | **kotlin.String**| Created at start date inclusive lower bound, ISO8601 | [optional]
 **createdAtLt** | **kotlin.String**| Created at end date exclusive upper bound, ISO8601. | [optional]
 **updatedAtGte** | **kotlin.String**| Created at start date inclusive lower bound, ISO8601 | [optional]
 **updatedAtLt** | **kotlin.String**| Created at end date exclusive upper bound, ISO8601. | [optional]

### Return type

[**TransferListBankModel**](TransferListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

