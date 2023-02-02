
# AttestationDetailsBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) | The state of an identity record attestation |  [optional]
**failureCode** | [**inline**](#FailureCode) | The failure code of an identity record attestation (if any) |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, expired, verified, failed


<a name="FailureCode"></a>
## Enum: failure_code
Name | Value
---- | -----
failureCode | invalid_key, invalid_algorithm, invalid_signature, invalid_issuer, invalid_audience, invalid_subject, jwt_expired, missing_jti, missing_keyid



