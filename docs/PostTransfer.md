
# PostTransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. | 
**transferType** | [**inline**](#TransferType) | The type of transfer. | 
**externalBankAccountGuid** | **kotlin.String** | The customer&#39;s &#39;plaid&#39; or &#39;plaid_processor_token&#39; external bank account&#39;s identifier. Required when transfer_type is funding or transfer_type is instant_funding. |  [optional]
**fiatAccountGuid** | **kotlin.String** | The identifier for the fiat account to use for the transfer. Required if the customer or bank has multiple fiat accounts. Optional when transfer_type is funding. |  [optional]
**sendAsDepositBankAccountGuid** | **kotlin.String** | The deposit bank account&#39;s identifier. Only valid for withdrawals. The deposit bank account must be owned by the customer or bank initiating the transfer. Optional when transfer_type is funding. |  [optional]
**paymentRail** | [**inline**](#PaymentRail) | The desired payment rail to initiate the transfer for. Optional when transfer_type is funding. |  [optional]
**beneficiaryMemo** | **kotlin.String** | The memo to send to the counterparty. Optional when transfer_type is funding. |  [optional]
**sourceParticipants** | [**kotlin.collections.List&lt;PostTransferParticipantBankModel&gt;**](PostTransferParticipantBankModel.md) | The source participants for the transfer. Optional when transfer_type is funding, transfer_type is instant_funding, transfer_type is book, transfer_type is crypto, or transfer_type is lightning. |  [optional]
**destinationParticipants** | [**kotlin.collections.List&lt;PostTransferParticipantBankModel&gt;**](PostTransferParticipantBankModel.md) | The destination participants for the transfer. Optional when transfer_type is funding, transfer_type is instant_funding, transfer_type is book, transfer_type is crypto, or transfer_type is lightning. |  [optional]
**bankFiatAccountGuid** | **kotlin.String** | The identifier for the fiat account to use for the transfer. Required if the bank has multiple fiat accounts. Optional when transfer_type is instant_funding or transfer_type is lightning. |  [optional]
**customerFiatAccountGuid** | **kotlin.String** | The identifier for the fiat account to use for the transfer. Required if the customer has multiple fiat accounts. Optional when transfer_type is instant_funding or transfer_type is lightning. |  [optional]
**sourceAccountGuid** | **kotlin.String** | The source account&#39;s identifier. Required when transfer_type is book or transfer_type is inter_account. |  [optional]
**destinationAccountGuid** | **kotlin.String** | The destination account&#39;s identifier. Required when transfer_type is book or transfer_type is inter_account. |  [optional]
**externalWalletGuid** | **kotlin.String** | The customer&#39;s external wallet&#39;s identifier. Required when transfer_type is crypto. |  [optional]
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. Required when transfer_type is lightning. |  [optional]
**networkFeeAccountGuid** | **kotlin.String** | The network fee account&#39;s identifier. Required for network fee transfers. Must be the identifier for the customer&#39;s or bank&#39;s fiat or trading account. For customer&#39;s to pay the network fees, include the customer&#39;s fiat or trading account guid. For bank&#39;s to pay the network fees, include the bank&#39;s fiat or trading account guid. Required when transfer_type is lightning. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the transfer. |  [optional]


<a name="TransferType"></a>
## Enum: transfer_type
Name | Value
---- | -----
transferType | funding, book, crypto, instant_funding, inter_account, lightning


<a name="PaymentRail"></a>
## Enum: payment_rail
Name | Value
---- | -----
paymentRail | ach, eft, wire, rtp



