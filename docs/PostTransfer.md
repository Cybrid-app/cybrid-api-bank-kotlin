
# PostTransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. | 
**transferType** | [**inline**](#TransferType) | The type of transfer. | 
**sourceAccountGuid** | **kotlin.String** | The source account&#39;s identifier. Required for book transfers. |  [optional]
**destinationAccountGuid** | **kotlin.String** | The destination account&#39;s identifier. Required for book transfers. |  [optional]
**externalWalletGuid** | **kotlin.String** | The customer&#39;s external wallet&#39;s identifier. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The customer&#39;s &#39;plaid&#39; or &#39;plaid_processor_token&#39; external bank account&#39;s identifier. |  [optional]
**expectedError** | **kotlin.String** | The optional expected error to simulate transfer failure. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the transfer. |  [optional]


<a name="TransferType"></a>
## Enum: transfer_type
Name | Value
---- | -----
transferType | funding, book, crypto, instant_funding



