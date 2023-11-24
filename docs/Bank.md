
# BankBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the bank. | 
**organizationGuid** | **kotlin.String** | The organization&#39;s identifier. | 
**name** | **kotlin.String** | The bank&#39;s name. | 
**type** | [**inline**](#Type) | The bank&#39;s type. | 
**features** | [**inline**](#kotlin.collections.List&lt;Features&gt;) | The bank&#39;s enabled features. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. | 
**supportedTradingSymbols** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported trading symbols. |  [optional]
**supportedFiatAccountAssets** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported fiat symbols. |  [optional]
**supportedCountryCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported country codes. |  [optional]
**routableAccounts** | [**inline**](#RoutableAccounts) | Configuration for supporting creating routable bank accounts. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | sandbox, production


<a name="kotlin.collections.List<Features>"></a>
## Enum: features
Name | Value
---- | -----
features | attestation_identity_records, kyc_identity_verifications, raw_routing_details


<a name="RoutableAccounts"></a>
## Enum: routable_accounts
Name | Value
---- | -----
routableAccounts | unsupported, bank, customer



