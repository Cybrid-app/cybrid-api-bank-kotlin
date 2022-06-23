
# ExchangeSettlementPaymentOrderBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the exchange settlement payment order. |  [optional]
**exchangeSettlementObligationGuid** | **kotlin.String** | The identifier of the exchange settlement obligation that this payment is associated with. |  [optional]
**sequenceNumber** | **kotlin.Int** | The sequence number of the payment order |  [optional]
**paymentAmount** | **kotlin.Int** | The amount expected to be received as part of this payment. |  [optional]
**internalAccountGuid** | **kotlin.String** | The identifier of the internal account that is expected to originate the payment. |  [optional]
**internalAccountType** | [**inline**](#InternalAccountType) | The type of the internal account that is expected to originate the payment. |  [optional]
**externalAccountGuid** | **kotlin.String** | The identifier of the external account that is expected to receive the payment. |  [optional]
**externalAccountType** | [**inline**](#ExternalAccountType) | The type of the external account that is expected to receive the payment. |  [optional]
**state** | [**inline**](#State) | The exchange settlement payment order&#39;s state |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the exchange settlement payment order was created at. |  [optional]


<a name="InternalAccountType"></a>
## Enum: internal_account_type
Name | Value
---- | -----
internalAccountType | internal_wallet, internal_bank_account


<a name="ExternalAccountType"></a>
## Enum: external_account_type
Name | Value
---- | -----
externalAccountType | external_wallet, external_bank_account


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending__created, pending__principal_reserved, pending__transactions_claimed, not_approved, in_progress, not_owing, amount_incorrect, invalid_principal, nsf, sent, rejected



