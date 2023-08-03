
# TransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the transfer. |  [optional]
**transferType** | [**inline**](#TransferType) | The type of transfer. |  [optional]
**bankGuid** | **kotlin.String** | The associated bank&#39;s identifier. |  [optional]
**customerGuid** | **kotlin.String** | The associated customer&#39;s identifier. |  [optional]
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The associated external bank account&#39;s identifier. |  [optional]
**asset** | **kotlin.String** | The asset the transfer is related to, e.g., USD. |  [optional]
**side** | [**inline**](#Side) | The direction of the quote: &#39;deposit&#39; or &#39;withdrawal&#39;. |  [optional]
**state** | [**inline**](#State) | The transfer&#39;s state |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed transfers. |  [optional]
**amount** | **java.math.BigDecimal** | The actual amount in base units of the asset. |  [optional]
**estimatedAmount** | **java.math.BigDecimal** | The estimated amount in base units of the asset. |  [optional]
**fee** | **java.math.BigDecimal** | The fee associated with the transfer. |  [optional]
**estimatedNetworkFee** | **java.math.BigDecimal** | The estimated network fee in base units of network_fee_asset. Only present on &#x60;crypto&#x60; transfers. |  [optional]
**networkFee** | **java.math.BigDecimal** | The actual network fee in base units of network_fee_asset. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**networkFeeAsset** | **kotlin.String** | The asset code of the network fee. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**networkFeeLiabilityAmount** | **java.math.BigDecimal** | The equivalent fiat network fee in base units of network_fee_liability_amount_asset. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**networkFeeLiabilityAmountAsset** | **kotlin.String** | The fiat asset the network_fee_liability_amount is denominated in. Only present on &#x60;crypto&#x60; transfers that have successfully completed. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the bank was created at. |  [optional]


<a name="TransferType"></a>
## Enum: transfer_type
Name | Value
---- | -----
transferType | savings, funding, book, crypto, internal_bank_rebalance, internal_wallet_rebalance


<a name="Side"></a>
## Enum: side
Name | Value
---- | -----
side | deposit, withdrawal


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending, completed, failed



