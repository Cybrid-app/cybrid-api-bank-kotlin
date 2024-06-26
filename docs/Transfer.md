
# TransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the transfer. |  [optional]
**transferType** | **kotlin.String** | The type of transfer; one of funding, book, crypto, instant_funding, funding_return, crypto_return, loss_recovery, inter_account, lightning, or instant_funding_return. |  [optional]
**bankGuid** | **kotlin.String** | The associated bank&#39;s identifier. |  [optional]
**customerGuid** | **kotlin.String** | The associated customer&#39;s identifier. |  [optional]
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The associated external bank account&#39;s identifier. |  [optional]
**asset** | **kotlin.String** | The asset the transfer is related to, e.g., USD. |  [optional]
**side** | **kotlin.String** | The direction of the quote; one of deposit or withdrawal. |  [optional]
**state** | **kotlin.String** | The state of the transfer; one of storing, pending, reviewing, completed, or failed. |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed transfers; one of non_sufficient_funds, refresh_required, party_name_invalid, payment_rail_invalid, compliance_rejection, cancelled, reversed, limit_exceeded, network_fee_too_low, or amount_too_low. |  [optional]
**amount** | **java.math.BigDecimal** | The actual amount in base units of the asset. |  [optional]
**estimatedAmount** | **java.math.BigDecimal** | The estimated amount in base units of the asset. |  [optional]
**fee** | **java.math.BigDecimal** | The fee associated with the transfer. |  [optional]
**estimatedNetworkFee** | **java.math.BigDecimal** | The estimated network fee in base units of network_fee_asset. Only present on &#x60;crypto&#x60; transfers. |  [optional]
**networkFee** | **java.math.BigDecimal** | The actual network fee in base units of network_fee_asset. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**networkFeeAsset** | **kotlin.String** | The asset code of the network fee. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**networkFeeLiabilityAmount** | **java.math.BigDecimal** | The equivalent fiat network fee in base units of network_fee_liability_amount_asset. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**networkFeeLiabilityAmountAsset** | **kotlin.String** | The fiat asset the network_fee_liability_amount is denominated in. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**txnHash** | **kotlin.String** | The hash of the blockchain transaction |  [optional]
**referenceTransferGuid** | **kotlin.String** | The guid of the related transfer. Only present on &#x60;funding_return&#x60; transfers. |  [optional]
**sourceAccount** | [**TransferSourceAccountBankModel**](TransferSourceAccountBankModel.md) |  |  [optional]
**sourceParticipants** | [**kotlin.collections.List&lt;TransferParticipantBankModel&gt;**](TransferParticipantBankModel.md) | The participants in the source account. |  [optional]
**destinationAccount** | [**TransferDestinationAccountBankModel**](TransferDestinationAccountBankModel.md) |  |  [optional]
**destinationParticipants** | [**kotlin.collections.List&lt;TransferParticipantBankModel&gt;**](TransferParticipantBankModel.md) | The participants in the source account. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**transferDetails** | [**kotlin.Any**](.md) | The raw details on the transfer from the bank. |  [optional]
**paymentRail** | **kotlin.String** | The rail the payment was done on. One of: ach, eft, wire, rtp |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the transfer. |  [optional]



