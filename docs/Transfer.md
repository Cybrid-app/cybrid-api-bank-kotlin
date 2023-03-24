
# TransferBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the trade. |  [optional]
**transferType** | [**inline**](#TransferType) | The type of transfer. |  [optional]
**customerGuid** | **kotlin.String** | The associated customer&#39;s identifier. |  [optional]
**quoteGuid** | **kotlin.String** | The associated quote&#39;s identifier. |  [optional]
**asset** | **kotlin.String** | The asset the transfer is related to, e.g., USD. |  [optional]
**side** | [**inline**](#Side) | The direction of the quote: &#39;deposit&#39; or &#39;withdrawal&#39;. |  [optional]
**state** | [**inline**](#State) | The trade&#39;s state |  [optional]
**amount** | **java.math.BigDecimal** | The amount being transferred. |  [optional]
**fee** | **java.math.BigDecimal** | The fee associated with the trade. |  [optional]
**networkFee** | **java.math.BigDecimal** | The network fee in base units of network_fee_asset. Only present on &#x60;crypto&#x60; transfers. |  [optional]
**networkFeeAsset** | **kotlin.String** | The asset code of the network fee. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the bank was created at. |  [optional]


<a name="TransferType"></a>
## Enum: transfer_type
Name | Value
---- | -----
transferType | savings, funding, book, crypto


<a name="Side"></a>
## Enum: side
Name | Value
---- | -----
side | deposit, withdrawal


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, initiating, pending, completed, failed



