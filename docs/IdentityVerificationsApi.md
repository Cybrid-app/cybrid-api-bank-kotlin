# IdentityVerificationsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdentityVerification**](IdentityVerificationsApi.md#createIdentityVerification) | **POST** api/identity_verifications | Create Identity Verification
[**getIdentityVerification**](IdentityVerificationsApi.md#getIdentityVerification) | **GET** api/identity_verifications/{identity_verification_guid} | Get Identity Verification
[**listIdentityVerifications**](IdentityVerificationsApi.md#listIdentityVerifications) | **GET** api/identity_verifications | List Identity Verifications



Create Identity Verification

Create an Identity Verification.  Required scope: **customers:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(IdentityVerificationsApi::class.java)
val postIdentityVerificationBankModel : PostIdentityVerificationBankModel =  // PostIdentityVerificationBankModel | 

launch(Dispatchers.IO) {
    val result : IdentityVerificationBankModel = webService.createIdentityVerification(postIdentityVerificationBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postIdentityVerificationBankModel** | [**PostIdentityVerificationBankModel**](PostIdentityVerificationBankModel.md)|  |

### Return type

[**IdentityVerificationBankModel**](IdentityVerificationBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Identity Verification

Retrieves an identity verification.  Required scope: **customers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(IdentityVerificationsApi::class.java)
val identityVerificationGuid : kotlin.String = identityVerificationGuid_example // kotlin.String | Identifier for the identity verification.

launch(Dispatchers.IO) {
    val result : IdentityVerificationBankModel = webService.getIdentityVerification(identityVerificationGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityVerificationGuid** | **kotlin.String**| Identifier for the identity verification. |

### Return type

[**IdentityVerificationBankModel**](IdentityVerificationBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Identity Verifications

Retrieves a list of identity verifications.  Required scope: **customers:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(IdentityVerificationsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated guids to list identity verifications for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list identity verifications for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list identity verifications for.

launch(Dispatchers.IO) {
    val result : IdentityVerificationListBankModel = webService.listIdentityVerifications(page, perPage, guid, bankGuid, customerGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated guids to list identity verifications for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list identity verifications for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list identity verifications for. | [optional]

### Return type

[**IdentityVerificationListBankModel**](IdentityVerificationListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
