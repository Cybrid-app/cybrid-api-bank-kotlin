
# CybridAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The account type. |  [optional]
**guid** | **kotlin.String** | Auto-generated unique identifier for the account. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the account was created at. |  [optional]
**assetCode** | **kotlin.String** | The asset code. |  [optional]
**name** | **kotlin.String** | The name of the account. |  [optional]
**environment** | [**inline**](#Environment) | The environment the account is configured for. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | fee


<a name="Environment"></a>
## Enum: environment
Name | Value
---- | -----
environment | sandbox, production



