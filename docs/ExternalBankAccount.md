
# ExternalBankAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the account. |  [optional]
**name** | **kotlin.String** | The name of the account. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**accountKind** | **kotlin.String** | The type of account; one of plaid, plaid_processor_token, or raw_routing_details. |  [optional]
**environment** | **kotlin.String** | The environment that the external bank account is operating in; one of sandbox or production. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**plaidInstitutionId** | **kotlin.String** | The Plaid institution ID for the account. |  [optional]
**plaidAccountMask** | **kotlin.String** | The account number mask for the account. |  [optional]
**plaidAccountName** | **kotlin.String** | The name for the account. |  [optional]
**state** | **kotlin.String** | The state of the external bank account; one of storing, completed, failed, refresh_required, unverified, deleting, or deleted. |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed transfers. |  [optional]
**balanceUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp that the balance information was last updated at. |  [optional]
**balances** | [**ExternalBankAccountBalancesBankModel**](ExternalBankAccountBalancesBankModel.md) |  |  [optional]
**pii** | [**kotlin.collections.List&lt;ExternalBankAccountPiiInnerBankModel&gt;**](ExternalBankAccountPiiInnerBankModel.md) | The account holder information. |  [optional]



