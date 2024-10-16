
# PostBankBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of bank. | 
**name** | **kotlin.String** | The name of the bank. | 
**supportedTradingSymbols** | **kotlin.collections.List&lt;kotlin.String&gt;** | The trading symbols supported by the bank. | 
**supportedFiatAccountAssets** | **kotlin.collections.List&lt;kotlin.String&gt;** | The fiat account assets supported by the bank. | 
**supportedCountryCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The country codes supported by the bank. | 
**features** | [**inline**](#kotlin.collections.List&lt;Features&gt;) | The features supported by the bank. | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | sandbox


<a name="kotlin.collections.List<Features>"></a>
## Enum: features
Name | Value
---- | -----
features | attestation_identity_records, kyc_identity_verifications, business_customers, individual_customers



