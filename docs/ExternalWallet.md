
# ExternalWalletBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the account. |  [optional]
**name** | **kotlin.String** | The name of the account. |  [optional]
**assetCode** | **kotlin.String** | The asset code. |  [optional]
**accountKind** | [**inline**](#AccountKind) | The type of account. |  [optional]
**environment** | [**inline**](#Environment) | The environment that the exchange is operating in. |  [optional]
**exchangeGuid** | **kotlin.String** | The exchange identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the exchange was created at. |  [optional]
**state** | [**inline**](#State) | The state of an external wallet |  [optional]
**failureCode** | **kotlin.String** | The failure code of an external wallet (if any) |  [optional]


<a name="AccountKind"></a>
## Enum: account_kind
Name | Value
---- | -----
accountKind | fireblocks_external_wallet, circle_wire_external_wallet


<a name="Environment"></a>
## Enum: environment
Name | Value
---- | -----
environment | sandbox, production


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, pending, failed, completed



