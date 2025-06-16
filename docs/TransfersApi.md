# TransfersApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransfer**](TransfersApi.md#createTransfer) | **POST** api/transfers | Create Transfer
[**getTransfer**](TransfersApi.md#getTransfer) | **GET** api/transfers/{transfer_guid} | Get Transfer
[**listTransfers**](TransfersApi.md#listTransfers) | **GET** api/transfers | Get transfers list
[**updateTransfer**](TransfersApi.md#updateTransfer) | **PATCH** api/transfers/{transfer_guid} | Patch Transfer



Create Transfer

Creates a transfer.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the transfer details in our private store | | reviewing | The Platform is reviewing the transfer for compliance | | pending | The Platform is executing the transfer | | completed | The Platform has successfully completed the transfer | | failed | The Platform was not able to successfully complete the transfer |  ## Failure codes  | Code | Description | |------|-------------| | amount_too_low | The transfer was rejected due to the amount being too low | | cancelled | The transfer was manually cancelled | | compliance_rejection | The transfer was rejected for compliance reasons | | internal_error | An internal error occurred while processing the transfer, please try again | | invalid_address | The destination address is invalid for transfer | | invalid_balance | There was insufficient balance for all required currencies to complete the transfer | | limit_exceeded | The customer is over the limits that have been set for them for this activity | | network_fee_too_low | The transfer was rejected due to the network fee being too low | | non_sufficient_funds | The customer does not have enough funds to complete the transfer | | party_name_invalid | The transfer&#39;s associated external bank account has an invalid party name | | payment_rail_invalid | The payment rail specified for the transfer is not supported by the external bank account | | plaid_access_not_granted | See the description from Plaid [here](https://plaid.com/docs/errors/item/#access_not_granted) | | plaid_institution_not_responding | See the description from Plaid [here](https://plaid.com/docs/errors/institution/#institution_not_responding) | | plaid_internal_server_error | See the description from Plaid [here](https://plaid.com/docs/errors/api/#internal_server_error-or-plaid-internal-error) | | plaid_item_not_found | See the description from Plaid [here](https://plaid.com/docs/errors/item/#item_not_found) | | plaid_item_not_supported | See the description from Plaid [here](https://plaid.com/docs/errors/item/#item_not_supported) | | plaid_multiple_accounts | Multiple accounts were selected through Plaid Link. | | plaid_no_accounts | See the description from Plaid [here](https://plaid.com/docs/errors/item/#no_accounts) | | plaid_none_balances_error | The transfer was rejected due to an error with the balances retrieved by Plaid | | plaid_unknown_error | See the description from Plaid [here](https://plaid.com/docs/errors/api/#unknown_error) | | refresh_required | The transfer&#39;s associated external_bank_account needs to be reconnected via Plaid | | invalid_destination | Issues with the destination details (invalid, closed, blocked) | | customer_action_required | Authorization declined or customer action required | | external_vendor_error | Unexpected error occurred with an external vendor or partner service during transfer processing  | | reversed | The transfer was reversed |  ## Failure codes that will result in a state change for the associated external bank account  | Code | Description | |------|-------------| | refresh_required | The transfer was rejected due to the external bank account needing to be refreshed. The external bank account will be put in the state &#x60;refresh_required&#x60; | | plaid_access_not_granted | The transfer was rejected due to the external bank account needing to be reconnected via Plaid. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_item_not_found | The transfer was rejected due to the external bank account needing to be reconnected via Plaid. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_item_not_supported | The transfer was rejected because the account is not supported. A different account should be connected via Plaid. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_multiple_accounts | The transfer was rejected because multiple accounts were selected through Plaid Link. Only one account must be selected. The external bank account will be put in the state &#x60;deleted&#x60; | | plaid_no_accounts | The transfer was rejected because no compatible accounts could be found. The external bank account will be put in the state &#x60;deleted&#x60; |    Required scope: **transfers:execute**

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
val txnHash : kotlin.String = txnHash_example // kotlin.String | Comma separated transaction hashes to list transfers for.
val createdAtGte : kotlin.String = createdAtGte_example // kotlin.String | Created at start date-time inclusive lower bound, ISO8601
val createdAtLt : kotlin.String = createdAtLt_example // kotlin.String | Created at end date-time exclusive upper bound, ISO8601.
val updatedAtGte : kotlin.String = updatedAtGte_example // kotlin.String | Created at start date-time inclusive lower bound, ISO8601
val updatedAtLt : kotlin.String = updatedAtLt_example // kotlin.String | Created at end date-time exclusive upper bound, ISO8601.

launch(Dispatchers.IO) {
    val result : TransferListBankModel = webService.listTransfers(page, perPage, guid, transferType, bankGuid, customerGuid, accountGuid, state, side, label, txnHash, createdAtGte, createdAtLt, updatedAtGte, updatedAtLt)
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
 **txnHash** | **kotlin.String**| Comma separated transaction hashes to list transfers for. | [optional]
 **createdAtGte** | **kotlin.String**| Created at start date-time inclusive lower bound, ISO8601 | [optional]
 **createdAtLt** | **kotlin.String**| Created at end date-time exclusive upper bound, ISO8601. | [optional]
 **updatedAtGte** | **kotlin.String**| Created at start date-time inclusive lower bound, ISO8601 | [optional]
 **updatedAtLt** | **kotlin.String**| Created at end date-time exclusive upper bound, ISO8601. | [optional]

### Return type

[**TransferListBankModel**](TransferListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Patch Transfer

Update a transfer.  Required scope: **transfers:write**

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
val patchTransferBankModel : PatchTransferBankModel =  // PatchTransferBankModel | 

launch(Dispatchers.IO) {
    val result : TransferBankModel = webService.updateTransfer(transferGuid, patchTransferBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferGuid** | **kotlin.String**| Identifier for the transfer. |
 **patchTransferBankModel** | [**PatchTransferBankModel**](PatchTransferBankModel.md)|  |

### Return type

[**TransferBankModel**](TransferBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

