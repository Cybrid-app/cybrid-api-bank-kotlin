
# ExternalWalletBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the wallet. |  [optional]
**name** | **kotlin.String** | The name of the wallet. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**environment** | [**inline**](#Environment) | The environment that the wallet is configured for. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**address** | **kotlin.String** | The blockchain wallet address for the wallet. |  [optional]
**tag** | **kotlin.String** | The blockchain tag to use when transferring crypto to the wallet. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the wallet was created at. |  [optional]
**state** | [**inline**](#State) | The state of an external wallet |  [optional]
**failureCode** | **kotlin.String** | The failure code of an external wallet (if any) |  [optional]


<a name="Environment"></a>
## Enum: environment
Name | Value
---- | -----
environment | sandbox, production


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending, failed, completed, deleting, deleted



