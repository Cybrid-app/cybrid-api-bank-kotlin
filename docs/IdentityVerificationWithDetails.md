
# IdentityVerificationWithDetailsBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**type** | **kotlin.String** | The identity verification type; one of kyc, bank_account, or counterparty. |  [optional]
**method** | **kotlin.String** | The identity verification method; one of attested, document_submission, enhanced_due_diligence, id_and_selfie, tax_id_and_selfie, business_registration, attested_id_and_selfie, attested_business_registration, watchlists, attested_ownership, or account_ownership. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**customerGuid** | **kotlin.String** | The identity verification&#39;s identifier. |  [optional]
**counterpartyGuid** | **kotlin.String** | The identity verification&#39;s identifier. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The identity verification&#39;s identifier. |  [optional]
**state** | **kotlin.String** | The identity verification state; one of storing, waiting, pending, reviewing, expired, or completed. |  [optional]
**outcome** | **kotlin.String** | The identity verification outcome; one of passed or failed. |  [optional]
**failureCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The reason codes explaining the outcome. |  [optional]
**complianceChecks** | [**kotlin.collections.List&lt;ComplianceCheckBankModel&gt;**](ComplianceCheckBankModel.md) | The compliance checks associated with the identity verification. |  [optional]
**complianceDecisions** | [**kotlin.collections.List&lt;ComplianceDecisionBankModel&gt;**](ComplianceDecisionBankModel.md) | The compliance decisions associated with the identity verification. |  [optional]
**personaInquiryId** | **kotlin.String** | The Persona identifier of the backing inquiry. |  [optional]
**personaState** | **kotlin.String** | The Persona state of the backing inquiry; one of waiting, pending, reviewing, processing, expired, completed, or unknown. |  [optional]
**pii** | [**IdentityVerificationWithDetailsPiiBankModel**](IdentityVerificationWithDetailsPiiBankModel.md) |  |  [optional]
**documents** | [**kotlin.collections.List&lt;IdentityVerificationDocumentBankModel&gt;**](IdentityVerificationDocumentBankModel.md) | The documents associated with the identity verification. |  [optional]



