
# QuoteBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the quote. |  [optional]
**productType** | **kotlin.String** | The type of product the quote is for; one of trading, trading_exit, funding, book_transfer, crypto_transfer, inter_account, or lightning_transfer. |  [optional]
**bankGuid** | **kotlin.String** | The unique identifier for the bank. |  [optional]
**customerGuid** | **kotlin.String** | The unique identifier for the customer. |  [optional]
**symbol** | **kotlin.String** | Symbol the quote was requested for. Format is \&quot;asset-counter_asset\&quot; in uppercase. Populated for trade quotes. |  [optional]
**side** | **kotlin.String** | The direction of the quote; one of buy, sell, deposit, or withdrawal. |  [optional]
**receiveAmount** | **java.math.BigDecimal** | The amount to be received in base units of the currency: currency is \&quot;asset\&quot; for buy and \&quot;counter_asset\&quot; for sell for trade quotes. |  [optional]
**deliverAmount** | **java.math.BigDecimal** | The amount to be delivered in base units of the currency: currency is \&quot;counter_asset\&quot; for buy and \&quot;asset\&quot; for sell for trade quotes. |  [optional]
**fee** | **java.math.BigDecimal** | The fee associated with the trade. Denominated in \&quot;counter_asset\&quot; base units for trade quotes. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**issuedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the quote was created at. |  [optional]
**expiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the quote is expiring at. Populated for trading quotes. |  [optional]
**asset** | **kotlin.String** | The asset code the quote was requested for. Populated for book transfer and funding quotes. |  [optional]
**networkFee** | **java.math.BigDecimal** | The network fee in base units of network_fee_asset. Only present on &#x60;crypto_transfer&#x60; quotes. |  [optional]
**networkFeeAsset** | **kotlin.String** | The asset code of the network fee. |  [optional]
**networkAddress** | **kotlin.String** | The network address to pay the invoice to. Populated for lightning_transfer quotes. |  [optional]



