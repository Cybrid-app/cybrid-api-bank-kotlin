
# PostTradeBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. | 
**tradeType** | [**inline**](#TradeType) | The type of trade. |  [optional]
**fiatAccountGuid** | **kotlin.String** | The identifier for the fiat account to use for the trade. Required if the customer or bank has multiple fiat accounts. |  [optional]
**expectedError** | [**inline**](#ExpectedError) | The optional expected error to simulate trade failure. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the trade. |  [optional]


<a name="TradeType"></a>
## Enum: trade_type
Name | Value
---- | -----
tradeType | platform, exit


<a name="ExpectedError"></a>
## Enum: expected_error
Name | Value
---- | -----
expectedError | expired_quote, non_sufficient_funds



