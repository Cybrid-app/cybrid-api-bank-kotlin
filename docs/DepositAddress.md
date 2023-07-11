
# DepositAddressBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**bankGuid** | **kotlin.String** | The address&#39; bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The address&#39; customer identifier. |  [optional]
**accountGuid** | **kotlin.String** | The address&#39; account identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the address was created at. |  [optional]
**asset** | **kotlin.String** | The asset the transfer is related to, e.g., USD. |  [optional]
**state** | [**inline**](#State) | The state of the address. |  [optional]
**address** | **kotlin.String** | The blockchain address. |  [optional]
**format** | [**inline**](#Format) | The blockchain address format. |  [optional]
**tag** | **kotlin.String** | The blockchain address tag. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, created


<a name="Format"></a>
## Enum: format
Name | Value
---- | -----
format | standard, legacy



