
# QuoteBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the quote. |  [optional]
**customerGuid** | **kotlin.String** | The unique identifier for the customer. |  [optional]
**symbol** | **kotlin.String** | Symbol the quote is being requested for. Format is \&quot;asset-counter_asset\&quot; in uppercase. |  [optional]
**side** | [**inline**](#Side) | The direction of the quote: either &#39;buy&#39; or &#39;sell&#39;. |  [optional]
**receiveAmount** | **kotlin.Int** | The amount to be received in base units of the currency: currency is \&quot;asset\&quot; for buy and \&quot;counter_asset\&quot; for sell. |  [optional]
**deliverAmount** | **kotlin.Int** | The amount to be delivered in base units of the currency: currency is \&quot;counter_asset\&quot; for buy and \&quot;asset\&quot; for sell. |  [optional]
**fee** | **kotlin.Int** | The fee associated with the trade. Denominated in \&quot;counter_asset\&quot; base units |  [optional]
**issuedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the quote was created at. |  [optional]
**expiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the quote is expiring at. |  [optional]


<a name="Side"></a>
## Enum: side
Name | Value
---- | -----
side | buy, sell



