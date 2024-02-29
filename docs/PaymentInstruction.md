
# PaymentInstructionBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the payment instruction. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**invoiceGuid** | **kotlin.String** | The invoice identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**expiredAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the instructions expired at. |  [optional]
**failedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the instructions failed to be created at. |  [optional]
**networkAddress** | **kotlin.String** | The network address to pay the invoice to. |  [optional]
**expectedPaymentAsset** | **kotlin.String** | The asset the payor must pay the invoice in, e.g., BTC. |  [optional]
**expectedPaymentAmount** | **java.math.BigDecimal** | The amount to be paid in base units of expected_payment_asset. |  [optional]
**failureCode** | **kotlin.String** | The reason code explaining the failure; ond of invoice_paid, invoice_cancelled, or invalid_amount. |  [optional]
**state** | **kotlin.String** | The state of the payment instruction; one of storing, created, expired, or failed. |  [optional]



