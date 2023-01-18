
# DepositAddressBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. | 
**bankGuid** | **kotlin.String** | The address&#39; bank identifier. | 
**customerGuid** | **kotlin.String** | The address&#39; customer identifier. | 
**accountGuid** | **kotlin.String** | The address&#39; account identifier. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the address was created at. | 
**asset** | **kotlin.String** | The asset the transfer is related to, e.g., USD. | 
**state** | [**inline**](#State) | The state of the address. | 
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



