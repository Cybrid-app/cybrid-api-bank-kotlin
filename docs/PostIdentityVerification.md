
# PostIdentityVerificationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of identity verification. | 
**method** | [**inline**](#Method) | The identity verification method. | 
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. |  [optional]
**expectedBehaviours** | [**inline**](#kotlin.collections.List&lt;ExpectedBehaviours&gt;) | The optional expected behaviour to simulate. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | kyc


<a name="Method"></a>
## Enum: method
Name | Value
---- | -----
method | id_and_selfie


<a name="kotlin.collections.List<ExpectedBehaviours>"></a>
## Enum: expected_behaviours
Name | Value
---- | -----
expectedBehaviours | passed_immediately, failed_immediately



