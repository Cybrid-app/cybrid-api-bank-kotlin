
# DepositAddressBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**bankGuid** | **kotlin.String** | The address&#39; bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The address&#39; customer identifier. |  [optional]
**accountGuid** | **kotlin.String** | The address&#39; account identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**asset** | **kotlin.String** | The asset the transfer is related to, e.g., USD. |  [optional]
**state** | **kotlin.String** | The state of the address; one of storing or created. |  [optional]
**address** | **kotlin.String** | The blockchain address. |  [optional]
**format** | **kotlin.String** | The blockchain address format; one of standard or legacy. |  [optional]
**tag** | **kotlin.String** | The blockchain address tag. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the address. |  [optional]



