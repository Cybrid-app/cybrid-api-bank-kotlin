
# PostTransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. | 
**transferType** | [**inline**](#TransferType) | The type of transfer. | 
**externalBankAccountGuid** | **kotlin.String** | The customer&#39;s &#39;plaid&#39; or &#39;plaid_processor_token&#39; external bank account&#39;s identifier. |  [optional]
**oneTimeAddress** | [**PostOneTimeAddressBankModel**](PostOneTimeAddressBankModel.md) |  |  [optional]
**expectedError** | [**inline**](#ExpectedError) | The optional expected error to simulate transfer failure. |  [optional]


<a name="TransferType"></a>
## Enum: transfer_type
Name | Value
---- | -----
transferType | funding, book, crypto


<a name="ExpectedError"></a>
## Enum: expected_error
Name | Value
---- | -----
expectedError | pending, in_progress, completed, failed, cancelled, manual_intervention, reversed



