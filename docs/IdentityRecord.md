
# IdentityRecordBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity record. |  [optional]
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. |  [optional]
**type** | [**inline**](#Type) | The identity record&#39;s type. |  [optional]
**attestationDetails** | [**AttestationDetailsBankModel**](AttestationDetailsBankModel.md) |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the customer was created at. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | attestation



