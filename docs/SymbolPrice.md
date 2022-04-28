
# SymbolPriceBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **kotlin.String** | The trade symbol the pricing is related to. Format is asset-counter_asset, e.g., BTC-USD. |  [optional]
**buyPrice** | **kotlin.Int** | The purchase price (in base units) for the asset denominated in the counter asset currency. |  [optional]
**sellPrice** | **kotlin.Int** | The sale price (in base units) for the asset denominated in the counter asset currency. |  [optional]
**buyPriceLastUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the purchase price was generated at. |  [optional]
**sellPriceLastUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the sale price was generated at. |  [optional]



