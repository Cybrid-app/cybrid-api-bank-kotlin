
# PostQuoteBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | [**inline**](#Side) | The direction of the quote: either &#39;buy&#39; or &#39;sell&#39; for trade quotes. | 
**productType** | [**inline**](#ProductType) | The type of product the quote is for. |  [optional]
**customerGuid** | **kotlin.String** | The unique identifier for the customer. |  [optional]
**symbol** | **kotlin.String** | Symbol the quote is being requested for. Format is \&quot;asset-counter_asset\&quot; in uppercase. See the Symbols API for a complete list of cryptocurrencies supported. |  [optional]
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
productType | trading



