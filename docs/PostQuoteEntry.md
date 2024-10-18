
# PostQuoteEntryBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of account | 
**guid** | **kotlin.String** | The guid of the account | 
**receiveAmount** | **java.math.BigDecimal** | The amount to be received in base units of the currency: currency is \&quot;asset\&quot; for buy and \&quot;counter_asset\&quot; for sell for trade quotes. |  [optional]
**deliverAmount** | **java.math.BigDecimal** | The amount to be delivered in base units of the currency: currency is \&quot;counter_asset\&quot; for buy and \&quot;asset\&quot; for sell for trade quotes. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | external_wallet



