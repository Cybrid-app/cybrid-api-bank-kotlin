
# PostDepositBankAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountGuid** | **kotlin.String** | The fiat account guid. | 
**type** | [**inline**](#Type) | The account type. |  [optional]
**customerGuid** | **kotlin.String** | The unique identifier for the customer. |  [optional]
**parentDepositBankAccountGuid** | **kotlin.String** | The unique identifier for the bank-level deposit bank account. This is only required for sub-accounts. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the address. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | main, sub_account



