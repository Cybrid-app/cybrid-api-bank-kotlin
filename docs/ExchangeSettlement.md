
# ExchangeSettlementBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the exchange settlement. |  [optional]
**exchangeGuid** | **kotlin.String** | The identifier of the exchange that corresponds to this settlement. |  [optional]
**name** | **kotlin.String** | The name of the exchange settlement. |  [optional]
**tradeGuids** | **kotlin.collections.List&lt;kotlin.String&gt;** | The exchange settlement&#39;s set of included trade guids. |  [optional]
**exchangeSettlementObligationGuids** | **kotlin.collections.List&lt;kotlin.String&gt;** | The exchange settlement&#39;s set of obligation guids. |  [optional]
**state** | [**inline**](#State) | The exchange settlement&#39;s state |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the exchange settlement was created at. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending__created, pending__approved, failed_creation, trades_completed



