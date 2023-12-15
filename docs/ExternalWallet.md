
# ExternalWalletBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the wallet. |  [optional]
**name** | **kotlin.String** | The name of the wallet. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**environment** | **kotlin.String** | The environment that the wallet is configured for; one of sandbox or production. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**address** | **kotlin.String** | The blockchain wallet address for the wallet. |  [optional]
**tag** | **kotlin.String** | The blockchain tag to use when transferring crypto to the wallet. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**state** | **kotlin.String** | The state of the external wallet; one of storing, pending, failed, completed, deleting, or deleted. |  [optional]
**failureCode** | **kotlin.String** | The failure code of an external wallet (if any) |  [optional]



