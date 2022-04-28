
# AccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The account type. |  [optional]
**guid** | **kotlin.String** | Auto-generated unique identifier for the account. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the account was created at. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**name** | **kotlin.String** | The name of the account. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier associated with the account. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier associated with the account. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | backstopped, trading



