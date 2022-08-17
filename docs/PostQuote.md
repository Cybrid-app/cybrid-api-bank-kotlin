
# PostQuoteBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerGuid** | **kotlin.String** | The unique identifier for the customer. | 
**side** | [**inline**](#Side) | The direction of the quote: either &#39;buy&#39; or &#39;sell&#39; for trade quotes; &#39;deposit&#39; or &#39;withdrawal&#39; for savings quotes. | 
**productType** | [**inline**](#ProductType) | The type of product the quote is for. |  [optional]
**symbol** | **kotlin.String** | Symbol the quote is being requested for. Format is \&quot;asset-counter_asset\&quot; in uppercase. See the Symbols API for a complete list of cryptocurrencies supported. |  [optional]
**asset** | **kotlin.String** | The asset code the quote was requested for. Populated for savings quotes. |  [optional]
**receiveAmount** | **java.math.BigDecimal** | The amount to be received in base units of the currency: currency is \&quot;asset\&quot; for buy and \&quot;counter_asset\&quot; for sell for trade quotes and currency is always \&quot;asset\&quot; for savings quotes. |  [optional]
**deliverAmount** | **java.math.BigDecimal** | The amount to be delivered in base units of the currency: currency is \&quot;counter_asset\&quot; for buy and \&quot;asset\&quot; for sell for trade quotes and currency is always \&quot;asset\&quot; for savings quotes. |  [optional]
**productProvider** | [**inline**](#ProductProvider) | The provider for the product being quoted. Populated for savings quotes. |  [optional]


<a name="Side"></a>
## Enum: side
Name | Value
---- | -----
side | buy, sell, deposit, withdrawal


<a name="ProductType"></a>
## Enum: product_type
Name | Value
---- | -----
productType | trading, savings


<a name="ProductProvider"></a>
## Enum: product_provider
Name | Value
---- | -----
productProvider | compound



