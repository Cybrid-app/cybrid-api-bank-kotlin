
# QuoteBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the quote. |  [optional]
**productType** | [**inline**](#ProductType) | The type of product the quote is for. |  [optional]
**customerGuid** | **kotlin.String** | The unique identifier for the customer. |  [optional]
**symbol** | **kotlin.String** | Symbol the quote was requested for. Format is \&quot;asset-counter_asset\&quot; in uppercase. Populated for trade quotes. |  [optional]
**side** | [**inline**](#Side) | The direction of the quote: either &#39;buy&#39; or &#39;sell&#39; for trade quotes. |  [optional]
**receiveAmount** | **java.math.BigDecimal** | The amount to be received in base units of the currency: currency is \&quot;asset\&quot; for buy and \&quot;counter_asset\&quot; for sell for trade quotes. |  [optional]
**deliverAmount** | **java.math.BigDecimal** | The amount to be delivered in base units of the currency: currency is \&quot;counter_asset\&quot; for buy and \&quot;asset\&quot; for sell for trade quotes. |  [optional]
**fee** | **java.math.BigDecimal** | The fee associated with the trade. Denominated in \&quot;counter_asset\&quot; base units for trade quotes. |  [optional]
**issuedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the quote was created at. |  [optional]
**expiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the quote is expiring at. Populated for trading quotes. |  [optional]
**asset** | **kotlin.String** | The asset code the quote was requested for. Populated for book transfer and funding quotes. |  [optional]


<a name="ProductType"></a>
## Enum: product_type
Name | Value
---- | -----
productType | trading, funding, book_transfer


<a name="Side"></a>
## Enum: side
Name | Value
---- | -----
side | buy, sell, deposit, withdrawal



