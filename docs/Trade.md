
# TradeBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the trade. |  [optional]
**tradeType** | **kotlin.String** | The type of trade; one of platform, liquidation, or exit. |  [optional]
**customerGuid** | **kotlin.String** | The associated customer&#39;s identifier. |  [optional]
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. |  [optional]
**symbol** | **kotlin.String** | The trade symbol the pricing is related to. Format is asset-counter_asset, e.g., BTC-USD. |  [optional]
**side** | **kotlin.String** | The direction of the trade; one of buy or sell. |  [optional]
**state** | **kotlin.String** | The state of the trade; one of storing, pending, cancelled, completed, settling, or failed. |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed trades; one of non_sufficient_funds, unsupported, limit_exceeded, expired_quote, or market_volatility. |  [optional]
**receiveAmount** | **java.math.BigDecimal** | The amount to be received in base units of the currency: currency is \&quot;asset\&quot; for buy and \&quot;counter_asset\&quot; for sell. |  [optional]
**deliverAmount** | **java.math.BigDecimal** | The amount to be delivered in base units of the currency: currency is \&quot;counter_asset\&quot; for buy and \&quot;asset\&quot; for sell. |  [optional]
**fee** | **java.math.BigDecimal** | The fee associated with the trade. Denominated in \&quot;counter_asset\&quot; base units |  [optional]
**referenceTradeGuid** | **kotlin.String** | The guid of the related trade. Only present on &#x60;exit&#x60; trades. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the trade. |  [optional]



