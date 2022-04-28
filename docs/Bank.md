
# BankBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the bank. | 
**organizationGuid** | **kotlin.String** | The organization&#39;s identifier. | 
**name** | **kotlin.String** | The bank&#39;s name. | 
**type** | [**inline**](#Type) | The bank&#39;s type. | 
**features** | [**inline**](#kotlin.collections.List&lt;Features&gt;) | The bank&#39;s enabled features. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the bank was created at. | 


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



