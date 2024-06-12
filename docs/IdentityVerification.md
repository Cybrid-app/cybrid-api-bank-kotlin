
# IdentityVerificationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**type** | **kotlin.String** | The identity verification type; one of kyc, bank_account, or counterparty. |  [optional]
**method** | **kotlin.String** | The identity verification method; one of business_registration, id_and_selfie, tax_id_and_selfie, attested, attested_ownership, account_ownership, plaid_identity_match, document_submission, or watchlists. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**customerGuid** | **kotlin.String** | The identity verification&#39;s identifier. |  [optional]
**counterpartyGuid** | **kotlin.String** | The identity verification&#39;s identifier. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The identity verification&#39;s identifier. |  [optional]
**state** | **kotlin.String** | The identity verification state; one of storing, waiting, pending, reviewing, expired, or completed. |  [optional]
**outcome** | **kotlin.String** | The identity verification outcome; one of passed or failed. |  [optional]
**failureCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The reason codes explaining the outcome. |  [optional]
**complianceDecisions** | [**kotlin.collections.List&lt;ComplianceDecisionBankModel&gt;**](ComplianceDecisionBankModel.md) | The compliance decisions associated with the identity verification. |  [optional]



