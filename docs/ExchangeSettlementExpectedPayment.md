
# ExchangeSettlementExpectedPaymentBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the exchange settlement expected payment. |  [optional]
**exchangeSettlementObligationGuid** | **kotlin.String** | The identifier of the exchange settlement obligation that this payment is associated with. |  [optional]
**sequenceNumber** | **java.math.BigDecimal** | The sequence number of the expected payment |  [optional]
**paymentAmount** | **java.math.BigDecimal** | The amount expected to be received as part of this payment. |  [optional]
**internalAccountGuid** | **kotlin.String** | The identifier of the internal account that is expected to originate the payment. |  [optional]
**internalAccountType** | [**inline**](#InternalAccountType) | The type of the internal account that is expected to originate the payment. |  [optional]
**state** | [**inline**](#State) | The exchange settlement expected payment&#39;s state |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the exchange settlement expected payment was created at. |  [optional]


<a name="InternalAccountType"></a>
## Enum: internal_account_type
Name | Value
---- | -----
internalAccountType | internal_wallet, internal_bank_account


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending__created, pending__transactions_claimed, not_approved, in_progress, not_owed, amount_incorrect, cancelled, received



