# CustomersApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** /api/customers | Create Customer
[**getCustomer**](CustomersApi.md#getCustomer) | **GET** /api/customers/{customer_guid} | Get Customer
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** /api/customers | Get customers list


<a name="createCustomer"></a>
# **createCustomer**
> CustomerBankModel createCustomer(postCustomerBankModel)

Create Customer

Creates a customer.  ## Customer Type  Customer resources are an abstraction for real world individuals and businesses on the Cybrid Platform and are used throughout the platform to perform high level operations, e.g., create a quote, execute a trade, etc..  Customers can have additional resources attached to them, e.g., identity records, accounts, etc.  At present, Customer&#39;s can be created with type &#x60;individual&#x60;.    Required scope: **customers:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = CustomersApi()
val postCustomerBankModel : PostCustomerBankModel =  // PostCustomerBankModel | 
try {
    val result : CustomerBankModel = apiInstance.createCustomer(postCustomerBankModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomer")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> CustomerBankModel getCustomer(customerGuid)

Get Customer

Retrieves a customer.  Required scope: **customers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = CustomersApi()
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Identifier for the customer.
try {
    val result : CustomerBankModel = apiInstance.getCustomer(customerGuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerGuid** | **kotlin.String**| Identifier for the customer. |

### Return type

[**CustomerBankModel**](CustomerBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCustomers"></a>
# **listCustomers**
> CustomerListBankModel listCustomers(page, perPage)

Get customers list

Retrieves a listing of customers.  Required scope: **customers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiInstance = CustomersApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomerListBankModel = apiInstance.listCustomers(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listCustomers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listCustomers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 0]
 **perPage** | **kotlin.Int**|  | [optional] [default to 10]

### Return type

[**CustomerListBankModel**](CustomerListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

