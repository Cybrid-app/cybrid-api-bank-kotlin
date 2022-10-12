
# ExternalBankAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the account. |  [optional]
**name** | **kotlin.String** | The name of the account. |  [optional]
**assetCode** | **kotlin.String** | The asset code. |  [optional]
**accountKind** | [**inline**](#AccountKind) | The type of account. |  [optional]
**environment** | [**inline**](#Environment) | The environment that the external bank account is operating in. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the exchange was created at. |  [optional]
**plaidAccessToken** | **kotlin.String** | The Plaid access token for the account. |  [optional]


<a name="AccountKind"></a>
## Enum: account_kind
Name | Value
---- | -----
accountKind | plaid


<a name="Environment"></a>
## Enum: environment
Name | Value
---- | -----
environment | sandbox, production



