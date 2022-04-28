
# ExchangeBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the exchange. |  [optional]
**name** | **kotlin.String** | The name of the exchange. |  [optional]
**provider** | [**inline**](#Provider) | The provider for the exchange. |  [optional]
**environment** | [**inline**](#Environment) | The environment that the exchange is operating in. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the exchange was created at. |  [optional]


<a name="Provider"></a>
## Enum: provider
Name | Value
---- | -----
provider | aquanow, dv_chain


<a name="Environment"></a>
## Enum: environment
Name | Value
---- | -----
environment | sandbox, production



