
# ExternalBankAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the account. |  [optional]
**name** | **kotlin.String** | The name of the account. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**accountKind** | [**inline**](#AccountKind) | The type of account. |  [optional]
**environment** | [**inline**](#Environment) | The environment that the external bank account is operating in. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**plaidInstitutionId** | **kotlin.String** | The Plaid institution ID for the account. |  [optional]
**plaidAccountMask** | **kotlin.String** | The account number mask for the account. |  [optional]
**plaidAccountName** | **kotlin.String** | The name for the account. |  [optional]
**state** | [**inline**](#State) | The state of the external bank account. |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed transfers. |  [optional]
**balanceUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp that the balance information was last updated at. |  [optional]
**balances** | [**ExternalBankAccountBalancesBankModel**](ExternalBankAccountBalancesBankModel.md) |  |  [optional]
**pii** | [**kotlin.collections.List&lt;ExternalBankAccountPiiInnerBankModel&gt;**](ExternalBankAccountPiiInnerBankModel.md) | The account holder information. |  [optional]


<a name="AccountKind"></a>
## Enum: account_kind
Name | Value
---- | -----
accountKind | plaid, plaid_processor_token, raw_routing_details


<a name="Environment"></a>
## Enum: environment
Name | Value
---- | -----
environment | sandbox, production


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, completed, failed, refresh_required, unverified, deleting, deleted



