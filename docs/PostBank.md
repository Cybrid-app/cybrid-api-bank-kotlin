
# PostBankBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The bank&#39;s name. | 
**type** | [**inline**](#Type) | The bank&#39;s type. At present, only **sandbox** is supported. | 
**supportedTradingSymbols** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported trading symbols. | 
**features** | [**inline**](#kotlin.collections.List&lt;Features&gt;) | The bank&#39;s enabled features. At present, both **attestation_identity_records** and **backstopped_funding_source** must be set. | 
**supportedFiatAccountAssets** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported fiat assets. | 
**supportedCountryCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported country codes. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | sandbox, production


<a name="kotlin.collections.List<Features>"></a>
## Enum: features
Name | Value
---- | -----
features | attestation_identity_records, backstopped_funding_source, plaid_funding_source



