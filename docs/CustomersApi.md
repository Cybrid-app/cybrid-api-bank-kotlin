# CustomersApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** api/customers | Create Customer
[**getCustomer**](CustomersApi.md#getCustomer) | **GET** api/customers/{customer_guid} | Get Customer
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** api/customers | Get customers list
[**updateCustomer**](CustomersApi.md#updateCustomer) | **PATCH** api/customers/{customer_guid} | Patch Customer



Create Customer

Creates a customer.  ## Customer Type  Customer resources are an abstraction for real world individuals and businesses on the Cybrid Platform and are used throughout the platform to perform high level operations, e.g., create a quote, execute a trade, etc..  Customers can have additional resources attached to them, e.g., identity verifications, accounts, etc.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the customer details in our private store | | unverified | The Platform has not yet verified the customer&#39;s identity | | verified | The Platform has verified the customer&#39;s identity | | rejected | The Platform was not able to successfully verify the customer&#39;s identity | | frozen | The customer has been frozen on the Platform |    Required scope: **customers:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomersApi::class.java)
val postCustomerBankModel : PostCustomerBankModel =  // PostCustomerBankModel | 

launch(Dispatchers.IO) {
    val result : CustomerBankModel = webService.createCustomer(postCustomerBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCustomerBankModel** | [**PostCustomerBankModel**](PostCustomerBankModel.md)|  |

### Return type

[**CustomerBankModel**](CustomerBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Customer

Retrieves a customer.  Required scope: **customers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomersApi::class.java)
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Identifier for the customer.
val includePii : kotlin.Boolean = true // kotlin.Boolean | Include PII in the response.

launch(Dispatchers.IO) {
    val result : CustomerBankModel = webService.getCustomer(customerGuid, includePii)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerGuid** | **kotlin.String**| Identifier for the customer. |
 **includePii** | **kotlin.Boolean**| Include PII in the response. | [optional]

### Return type

[**CustomerBankModel**](CustomerBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get customers list

Retrieves a listing of customers.  Required scope: **customers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomersApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | 
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | 
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list customers for.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated customer_guids to list customers for.
val label : kotlin.String = label_example // kotlin.String | Comma separated labels to list customers for.

launch(Dispatchers.IO) {
    val result : CustomerListBankModel = webService.listCustomers(page, perPage, bankGuid, guid, label)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**|  | [optional]
 **perPage** | **java.math.BigDecimal**|  | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list customers for. | [optional]
 **guid** | **kotlin.String**| Comma separated customer_guids to list customers for. | [optional]
 **label** | **kotlin.String**| Comma separated labels to list customers for. | [optional]

### Return type

[**CustomerListBankModel**](CustomerListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Patch Customer

Update a customer.  Required scope: **customers:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomersApi::class.java)
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Identifier for the customer.
val patchCustomerBankModel : PatchCustomerBankModel =  // PatchCustomerBankModel | 

launch(Dispatchers.IO) {
    val result : CustomerBankModel = webService.updateCustomer(customerGuid, patchCustomerBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerGuid** | **kotlin.String**| Identifier for the customer. |
 **patchCustomerBankModel** | [**PatchCustomerBankModel**](PatchCustomerBankModel.md)|  |

### Return type

[**CustomerBankModel**](CustomerBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

