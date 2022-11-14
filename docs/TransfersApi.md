# TransfersApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransfer**](TransfersApi.md#createTransfer) | **POST** api/transfers | Create Transfer
[**getTransfer**](TransfersApi.md#getTransfer) | **GET** api/transfers/{transfer_guid} | Get Transfer
[**listTransfers**](TransfersApi.md#listTransfers) | **GET** api/transfers | Get transfers list



Create Transfer

Creates a transfer.  Required scope: **transfers:execute**

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
val guid : kotlin.String = guid_example // kotlin.String | Comma separated trade_guids to list transfers for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list transfers for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list transfers for.
val accountGuid : kotlin.String = accountGuid_example // kotlin.String | Comma separated account_guids to list transfers for.

launch(Dispatchers.IO) {
    val result : TransferListBankModel = webService.listTransfers(page, perPage, guid, bankGuid, customerGuid, accountGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated trade_guids to list transfers for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list transfers for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list transfers for. | [optional]
 **accountGuid** | **kotlin.String**| Comma separated account_guids to list transfers for. | [optional]

### Return type

[**TransferListBankModel**](TransferListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

