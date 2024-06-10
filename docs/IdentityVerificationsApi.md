# IdentityVerificationsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdentityVerification**](IdentityVerificationsApi.md#createIdentityVerification) | **POST** api/identity_verifications | Create Identity Verification
[**getIdentityVerification**](IdentityVerificationsApi.md#getIdentityVerification) | **GET** api/identity_verifications/{identity_verification_guid} | Get Identity Verification
[**listIdentityVerifications**](IdentityVerificationsApi.md#listIdentityVerifications) | **GET** api/identity_verifications | List Identity Verifications



Create Identity Verification

Creates an Identity Verification.  ## Identity Verifications  Identity Verifications confirm an individual&#39;s identity with for the purpose of inclusion on the platform. This know-your-customer (KYC) process is a requirement for individuals to be able to transact. At present, we offer support for Cybrid performing the verification or working with partners to accept their KYC/AML process and have it attested to in our platform.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the identity verification details in our private store | | waiting | The Platform is waiting for the customer to start the identity verification process | | pending | The Platform is waiting for the customer to finish the identity verification process | | reviewing | The Platform is waiting for compliance to review the identity verification results | | expired | The identity verification process has expired | | completed | The identity verification process has been completed |  ## Outcome  | State | Description | |-------|-------------| | passed | The customer has passed the identity verification process | | failed | The customer has failed the identity verification process |  ## Failure Codes  | Code | Description | |-------|-------------| | id_check_failure | Failure due to an issue verifying the provided ID | | id_quality_check_failure | Failure due to an issue verifying the provided ID based on the image quality | | id_barcode_check_failure | Failure due to an issue verifying the provided ID based on the barcode | | id_mrz_check_failure | Failure due to an issue verifying the provided ID based on the machine-readable zone (MRZ) | | id_presence_check_failure | Failure due to an issue verifying the provided ID based on the presence of the ID | | id_expiration_check_failure | Failure due to an issue verifying the provided ID based on the expiration date | | id_double_side_check_failure | Failure due to an issue verifying the provided ID based on both sides not being provided | | id_type_allowed_check_failure | Failure due to an issue verifying the provided ID based on the type provided | | id_country_allowed_check_failure | Failure due to an issue verifying the provided ID based on the issuing country | | id_digital_replica_check_failure | Failure due to an issue verifying the provided ID based on it being a digital replica | | database_check_failure | Failure due to an issue verifying the provided information against authoritative data sources | | selfie_failure | Failure due to an issue verifying the provided selfie photo | | duplicate_person_check_failure | Failure due to a customer already existing for this person | | name_check_failure | Failure due to an issue verifying the name of the person | | address_check_failure | Failure due to an issue verifying the address of the person | | dob_check_failure | Failure due to an issue verifying the date of birth of the person | | id_number_check_failure | Failure due to an issue verifying an identification number of the person | | phone_number_check_failure | Failure due to an issue verifying the phone number of the person | | email_address_check_failure | Failure due to an issue verifying the email address of the person | | plaid_failure | Failure due to an issue interacting with Plaid | | plaid_item_login_required | Failure due to the Plaid token for the account requiring re-login | | plaid_invalid_product | Failure due to the Plaid product not being supported (contact support) | | plaid_no_accounts | Failure due to the Plaid token having access to no accounts | | plaid_item_not_found | Failure due to Plaid not being able to find the associated account | | decision_timeout | Failure due to an issue verifying the email address of the person | | requested_failure | In sandbox, the caller requested that the process failed | | deleted_account | Failure due to the bank account having been deleted before a decision was made |    Required scope: **identity_verifications:execute**

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

Retrieves an identity verification.  Required scope: **identity_verifications:read**

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
val includePii : kotlin.Boolean = true // kotlin.Boolean | Include PII in the response.

launch(Dispatchers.IO) {
    val result : IdentityVerificationWithDetailsBankModel = webService.getIdentityVerification(identityVerificationGuid, includePii)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityVerificationGuid** | **kotlin.String**| Identifier for the identity verification. |
 **includePii** | **kotlin.Boolean**| Include PII in the response. | [optional]

### Return type

[**IdentityVerificationWithDetailsBankModel**](IdentityVerificationWithDetailsBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Identity Verifications

Retrieves a list of identity verifications.  Required scope: **identity_verifications:read**

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
val state : kotlin.String = state_example // kotlin.String | Comma separated states to list identity verifications for.
val type : kotlin.String = type_example // kotlin.String | Comma separated types to list identity verifications for.

launch(Dispatchers.IO) {
    val result : IdentityVerificationListBankModel = webService.listIdentityVerifications(page, perPage, guid, bankGuid, customerGuid, state, type)
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
 **state** | **kotlin.String**| Comma separated states to list identity verifications for. | [optional]
 **type** | **kotlin.String**| Comma separated types to list identity verifications for. | [optional]

### Return type

[**IdentityVerificationListBankModel**](IdentityVerificationListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

