
# PostQuoteBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | [**inline**](#Side) | The direction for trade quotes: either &#39;buy&#39; or &#39;sell&#39;. The direction for funding quotes: either &#39;deposit&#39; or &#39;withdrawal&#39;. The direction for book transfer quotes: either &#39;deposit&#39; or &#39;withdrawal&#39;. The direction for crypto transfer quotes: &#39;withdrawal&#39;.  | 
**productType** | [**inline**](#ProductType) | The type of product the quote is for. |  [optional]
**customerGuid** | **kotlin.String** | The unique identifier for the customer. |  [optional]
**asset** | **kotlin.String** | The asset code the quote was requested for. Populated for funding, book transfer and crypto transfer quotes. |  [optional]
**symbol** | **kotlin.String** | Symbol the quote is being requested for. Format is \&quot;asset-counter_asset\&quot; in uppercase. See the Symbols API for a complete list of cryptocurrencies supported. Populated for trade quotes. |  [optional]
**receiveAmount** | **java.math.BigDecimal** | The amount to be received in base units of the currency: currency is \&quot;asset\&quot; for buy and \&quot;counter_asset\&quot; for sell for trade quotes. |  [optional]
**deliverAmount** | **java.math.BigDecimal** | The amount to be delivered in base units of the currency: currency is \&quot;counter_asset\&quot; for buy and \&quot;asset\&quot; for sell for trade quotes. |  [optional]


<a name="Side"></a>
## Enum: side
Name | Value
---- | -----
side | buy, sell, deposit, withdrawal


<a name="ProductType"></a>
## Enum: product_type
Name | Value
---- | -----
productType | trading, funding, book_transfer, crypto_transfer



