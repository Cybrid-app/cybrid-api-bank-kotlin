
# ExchangeSettlementObligationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the exchange settlement obligation. |  [optional]
**exchangeSettlementGuid** | **kotlin.String** | The identifier of the exchange settlement that corresponds to this obligation. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**state** | [**inline**](#State) | The exchange settlement&#39;s state |  [optional]
**payableAmountEstimate** | **kotlin.Int** | The account&#39;s payable estimate for this obligation. |  [optional]
**receivableAmountEstimate** | **kotlin.Int** | The account&#39;s receivable estimate for this obligation. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending__created, pending__approved, failed_creation, trades_completed



