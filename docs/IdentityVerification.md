
# IdentityVerificationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. |  [optional]
**type** | [**inline**](#Type) | The type of identity verification. |  [optional]
**method** | [**inline**](#Method) | The identity verification method. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the customer was created at. |  [optional]
**state** | [**inline**](#State) | The state of the verification process. |  [optional]
**outcome** | [**inline**](#Outcome) | The outcome of the verification process. |  [optional]
**failureCodes** | [**inline**](#kotlin.collections.List&lt;FailureCodes&gt;) | The reason codes explaining the outcome. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | kyc


<a name="Method"></a>
## Enum: method
Name | Value
---- | -----
method | id_and_selfie, attested


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


<a name="kotlin.collections.List<FailureCodes>"></a>
## Enum: failure_codes
Name | Value
---- | -----
failureCodes | requested_failure, id_check_failure, database_check_failure, selfie_failure, pep_check_failure, watchlist_check_failure, name_check_failure, address_check_failure, dob_check_failure, id_number_check_failure



