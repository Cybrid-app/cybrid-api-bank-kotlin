
# PostBankBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The bank&#39;s name. | 
**type** | [**inline**](#Type) | The bank&#39;s type. At present, only **sandbox** is supported. | 
**features** | [**inline**](#kotlin.collections.List&lt;Features&gt;) | The bank&#39;s enabled features. At present, both **attestation_identity_records** and **backstopped_funding_source** must be set. | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | sandbox


<a name="kotlin.collections.List<Features>"></a>
## Enum: features
Name | Value
---- | -----
features | attestation_identity_records, backstopped_funding_source



