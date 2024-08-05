
# DepositBankAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the identity verification. |  [optional]
**type** | **kotlin.String** | The account type; one of main or sub_account. |  [optional]
**bankGuid** | **kotlin.String** | The address&#39; bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The address&#39; customer identifier. |  [optional]
**accountGuid** | **kotlin.String** | The address&#39; account identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**asset** | **kotlin.String** | The asset the transfer is related to, e.g., USD. |  [optional]
**state** | **kotlin.String** | The state of the address; one of storing or created. |  [optional]
**uniqueMemoId** | **kotlin.String** | The unique memo identifier for the address. This is used to identify the recipient when sending funds to the account. This value MUST be included in all wire transfers to this account. |  [optional]
**counterpartyName** | **kotlin.String** | The name of the account holder. |  [optional]
**counterpartyAddress** | [**DepositBankAccountCounterpartyAddressBankModel**](DepositBankAccountCounterpartyAddressBankModel.md) |  |  [optional]
**accountDetails** | [**kotlin.collections.List&lt;DepositBankAccountAccountDetailsInnerBankModel&gt;**](DepositBankAccountAccountDetailsInnerBankModel.md) | The account details for the bank account. |  [optional]
**routingDetails** | [**kotlin.collections.List&lt;DepositBankAccountRoutingDetailsInnerBankModel&gt;**](DepositBankAccountRoutingDetailsInnerBankModel.md) | The account details for the bank account. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the address. |  [optional]



