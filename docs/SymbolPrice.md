
# SymbolPriceBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **kotlin.String** | The trade symbol the pricing is related to. Format is asset-counter_asset, e.g., BTC-USD. |  [optional]
**type** | **kotlin.String** | The type of price; one of trading or payout. |  [optional]
**buyPrice** | **java.math.BigDecimal** | The purchase price (in base units) for the asset denominated in the counter asset currency. |  [optional]
**sellPrice** | **java.math.BigDecimal** | The sale price (in base units) for the asset denominated in the counter asset currency. |  [optional]
**buyPriceLastUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the purchase price was generated at. |  [optional]
**sellPriceLastUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the sale price was generated at. |  [optional]
**countryCode** | **kotlin.String** | The ISO 3166 country 2-Alpha country code of the price. |  [optional]
**participantsType** | **kotlin.String** | The type of participants the price is for; one of C2C, C2B, B2C, or B2B. |  [optional]
**route** | **kotlin.String** | The route the price is for; one of bank_account or mobile_wallet. |  [optional]



