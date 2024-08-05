
# PostDepositBankAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountGuid** | **kotlin.String** | The fiat account guid. | 
**type** | [**inline**](#Type) | The account type. To generate deposit bank accounts with their own unique account number set this to \&quot;main\&quot;. To generate deposit bank accounts with the same account number as the parent deposit bank account set this to \&quot;sub_account\&quot;. This setting will only generate a unique identifier for the deposit bank and will not result in a unique account number being generated. \&quot;sub_account\&quot; is only  available for customer-level deposit bank accounts. |  [optional]
**customerGuid** | **kotlin.String** | The unique identifier for the customer. |  [optional]
**parentDepositBankAccountGuid** | **kotlin.String** | The unique identifier for the bank-level deposit bank account. This is only required for sub-accounts. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the address. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | main, sub_account



