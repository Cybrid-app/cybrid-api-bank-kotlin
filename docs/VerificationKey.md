
# VerificationKeyBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the verification key. |  [optional]
**bankGuid** | **kotlin.String** | The banks&#39;s identifier. |  [optional]
**type** | [**inline**](#Type) | The verification key&#39;s type. |  [optional]
**state** | [**inline**](#State) | The verification key&#39;s state. |  [optional]
**algorithm** | [**inline**](#Algorithm) | The verification key&#39;s algorithm. |  [optional]
**fingerprint** | **kotlin.String** | The verification key&#39;s cryptographic fingerprint. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the verification key was created at. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | attestation


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending, verified, failed


<a name="Algorithm"></a>
## Enum: algorithm
Name | Value
---- | -----
algorithm | RS512



