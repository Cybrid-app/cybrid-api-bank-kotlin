
# PostTransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. | 
**transferType** | [**inline**](#TransferType) | The type of transfer. | 
**externalBankAccountGuid** | **kotlin.String** | The customer&#39;s fiat asset external bank account&#39;s identifier. |  [optional]
**expectedError** | [**inline**](#ExpectedError) | The optional expected error to simulate transfer failure. |  [optional]


<a name="TransferType"></a>
## Enum: transfer_type
Name | Value
---- | -----
transferType | funding, book


<a name="ExpectedError"></a>
## Enum: expected_error
Name | Value
---- | -----
expectedError | pending, in_progress, completed, failed, cancelled, manual_intervention, reversed



