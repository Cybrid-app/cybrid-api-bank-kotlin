
# IdentityVerificationWithDetailsBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**customerGuid** | **kotlin.String** | The identity verification&#39;s identifier. |  [optional]
**type** | **kotlin.String** | The identity verification type; one of kyc or bank_account. |  [optional]
**method** | **kotlin.String** | The identity verification method; one of business_registration, id_and_selfie, tax_id_and_selfie, attested, plaid_identity_match, or document_submission. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**state** | **kotlin.String** | The identity verification state; one of storing, waiting, expired, or completed. |  [optional]
**outcome** | **kotlin.String** | The identity verification outcome; one of passed or failed. |  [optional]
**failureCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The reason codes explaining the outcome. |  [optional]
**verificationChecks** | [**kotlin.collections.List&lt;VerificationCheckBankModel&gt;**](VerificationCheckBankModel.md) | The checks associated with the identity verification. |  [optional]
**personaInquiryId** | **kotlin.String** | The Persona identifier of the backing inquiry. |  [optional]
**personaState** | **kotlin.String** | The Persona state of the backing inquiry; one of waiting, pending, reviewing, processing, expired, completed, or unknown. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The external bank account&#39;s identifier. |  [optional]



