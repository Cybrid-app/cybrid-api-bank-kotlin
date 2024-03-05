
# InvoiceBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the payment instruction. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**accountGuid** | **kotlin.String** | The account payment will ultimately be received into. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**type** | **kotlin.String** | The type of invoice; one of lightning. |  [optional]
**asset** | **kotlin.String** | The asset code the customer will receive the funds in. |  [optional]
**receiveAmount** | **java.math.BigDecimal** | The amount to be received in base units of the asset, i.e., the amount the customer will receive after fees. ONLY one of receive_amount or deliver_amount is required. |  [optional]
**deliverAmount** | **java.math.BigDecimal** | The amount to be delivered in base units of the asset, i.e., the amount the customer will receive before fees. ONLY one of receive_amount or deliver_amount is required. |  [optional]
**fee** | **java.math.BigDecimal** | The fee associated with this invoice in base units of the asset. |  [optional]
**state** | **kotlin.String** | The state of the invoice; one of storing, unpaid, cancelling, cancelled, settling, or paid. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the invoice. |  [optional]



