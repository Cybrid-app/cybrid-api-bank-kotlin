
# AccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **kotlin.String** | The account type; one of trading, fee, fiat, gas, reserve, or invoice_operations. |  [optional]
**guid** | **kotlin.String** | Auto-generated unique identifier for the account. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**name** | **kotlin.String** | The name of the account. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier associated with the account. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier associated with the account. |  [optional]
**platformBalance** | **java.math.BigDecimal** | The amount of funds that are in the account, in base units of the asset. |  [optional]
**platformAvailable** | **java.math.BigDecimal** | The amount of funds that are in the account, in base units of the asset, that are available for use on the platform. |  [optional]
**state** | **kotlin.String** | The state of the account; one of storing or created. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the account. |  [optional]



