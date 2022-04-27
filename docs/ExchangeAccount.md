
# ExchangeAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The exchange account type. |  [optional]
**guid** | **kotlin.String** | Auto-generated unique identifier for exchange account. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the exchange account was created at. |  [optional]
**exchangeGuid** | **kotlin.String** | The identifier of the exchange that owns this exchange account. |  [optional]
**assetCode** | **kotlin.String** | The asset code of the exchange account. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | fiat, crypto



