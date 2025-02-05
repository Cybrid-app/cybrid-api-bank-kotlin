
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
**supportedPayoutSymbols** | [**kotlin.collections.List&lt;PostSupportedPayoutSymbolsBankModel&gt;**](PostSupportedPayoutSymbolsBankModel.md) | The payout symbols supported by the bank. This is not yet supported and should be nil or empty. |  [optional]
**corsAllowedOrigins** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of allowed CORS origin URIs. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | sandbox


<a name="kotlin.collections.List<Features>"></a>
## Enum: features
Name | Value
---- | -----
features | attestation_identity_records, attestation_identity_records_v2, kyc_identity_verifications, business_customers, individual_customers



