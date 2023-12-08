
# PostBankBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The bank&#39;s name. | 
**type** | [**inline**](#Type) | The bank&#39;s type. At present, only **sandbox** is supported. | 
**supportedTradingSymbols** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported trading symbols. | 
**features** | [**inline**](#kotlin.collections.List&lt;Features&gt;) | The bank&#39;s enabled features. | 
**supportedFiatAccountAssets** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported fiat assets. | 
**supportedCountryCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported country codes. |  [optional]
**routableAccounts** | [**inline**](#RoutableAccounts) | Configuration for supporting creating routable bank accounts. |  [optional]


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


<a name="RoutableAccounts"></a>
## Enum: routable_accounts
Name | Value
---- | -----
routableAccounts | unsupported, bank, customer



