
# BankBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the bank. | 
**organizationGuid** | **kotlin.String** | The organization&#39;s identifier. | 
**name** | **kotlin.String** | The bank&#39;s name. | 
**type** | **kotlin.String** | The bank type; one of sandbox or production. | 
**features** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s enabled features. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. | 
**supportedTradingSymbols** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported trading symbols. |  [optional]
**supportedPayoutSymbols** | [**kotlin.collections.List&lt;BankSupportedPayoutSymbolsInnerBankModel&gt;**](BankSupportedPayoutSymbolsInnerBankModel.md) | The bank&#39;s list of supported payout symbols. |  [optional]
**supportedFiatAccountAssets** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported fiat symbols. |  [optional]
**supportedCountryCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of supported country codes. |  [optional]
**corsAllowedOrigins** | **kotlin.collections.List&lt;kotlin.String&gt;** | The bank&#39;s list of CORS allowed origins. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]



