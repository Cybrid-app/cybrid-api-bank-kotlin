
# VerificationCheckBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of verification check. | 
**state** | [**inline**](#State) | The state of the verification check. | 
**failureCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The reason codes explaining the outcome. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | business_watchlists, business_verification, business_tax_id_verification, person_attested, person_tax_id_attested, person_watchlists, person_verification, person_authentication, person_gov_id_verification, person_tax_id_verification


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | passed, failed, expired, invalidated



