
# PostTransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. | 
**transferType** | [**inline**](#TransferType) | The type of transfer. | 
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. |  [optional]
**fiatAccountGuid** | **kotlin.String** | The identifier for the fiat account to use for the transfer. Required if the customer or bank has multiple fiat accounts. Only valid for funding transfers. |  [optional]
**customerFiatAccountGuid** | **kotlin.String** | The identifier for the fiat account to use for the transfer. Required if the customer has multiple fiat accounts. Only valid for instant funding and lightning transfers. |  [optional]
**bankFiatAccountGuid** | **kotlin.String** | The identifier for the fiat account to use for the transfer. Required if the bank has multiple fiat accounts. Only valid for instant funding and lightning transfers. |  [optional]
**sourceAccountGuid** | **kotlin.String** | The source account&#39;s identifier. Required for book transfers. |  [optional]
**sourceParticipants** | [**kotlin.collections.List&lt;PostTransferParticipantBankModel&gt;**](PostTransferParticipantBankModel.md) | The source participants for the transfer. Not supported for \&quot;inter_account\&quot; transfers. |  [optional]
**destinationAccountGuid** | **kotlin.String** | The destination account&#39;s identifier. Required for book transfers. |  [optional]
**destinationParticipants** | [**kotlin.collections.List&lt;PostTransferParticipantBankModel&gt;**](PostTransferParticipantBankModel.md) | The destination participants for the transfer. Not supported for \&quot;inter_account\&quot; transfers. |  [optional]
**externalWalletGuid** | **kotlin.String** | The customer&#39;s external wallet&#39;s identifier. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The customer&#39;s &#39;plaid&#39; or &#39;plaid_processor_token&#39; external bank account&#39;s identifier. |  [optional]
**networkFeeAccountGuid** | **kotlin.String** | The network fee account&#39;s identifier. Required for network fee transfers. Must be the identifier for the customer&#39;s or bank&#39;s fiat or trading account. For customer&#39;s to pay the network fees, include the customer&#39;s fiat or trading account guid. For bank&#39;s to pay the network fees, include the bank&#39;s fiat or trading account guid. |  [optional]
**paymentRail** | **kotlin.String** | The desired payment rail to initiate the transfer for. Valid values are: ach, eft, wire. Valid for funding transfers only. |  [optional]
**beneficiaryMemo** | **kotlin.String** | The memo to send to the counterparty. |  [optional]
**sendAsDepositBankAccountGuid** | **kotlin.String** | The deposit bank account&#39;s identifier. Optional for funding transfers. Only valid for withdrawals. The deposit bank account must be owned by the customer or bank initiating the transfer. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the transfer. |  [optional]


<a name="TransferType"></a>
## Enum: transfer_type
Name | Value
---- | -----
transferType | funding, book, crypto, instant_funding, inter_account, lightning



