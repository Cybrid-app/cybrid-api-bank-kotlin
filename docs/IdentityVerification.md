
# IdentityVerificationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. |  [optional]
**type** | [**inline**](#Type) | The type of identity verification. |  [optional]
**method** | [**inline**](#Method) | The identity verification method. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**state** | [**inline**](#State) | The state of the verification process. |  [optional]
**outcome** | [**inline**](#Outcome) | The outcome of the verification process. |  [optional]
**failureCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The reason codes explaining the outcome. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | kyc, bank_account


<a name="Method"></a>
## Enum: method
Name | Value
---- | -----
method | id_and_selfie, attested, plaid_identity_match


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, waiting, expired, completed


<a name="Outcome"></a>
## Enum: outcome
Name | Value
---- | -----
outcome | passed, failed



