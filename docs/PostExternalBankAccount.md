
# PostExternalBankAccountBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the account. | 
**accountKind** | [**inline**](#AccountKind) | The account type | 
**asset** | **kotlin.String** | The asset code. If not set will try and default to the Bank&#39;s configured fiat asset. | 
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**plaidPublicToken** | **kotlin.String** | The public token for the account. Required for &#39;plaid&#39; accounts. |  [optional]
**plaidAccountId** | **kotlin.String** | The account identifier in plaid. Required for &#39;plaid&#39; accounts. |  [optional]
**plaidProcessorToken** | **kotlin.String** | The Plaid processor token used to access the account. Required for &#39;plaid_processor_token&#39; accounts. |  [optional]
**plaidInstitutionId** | **kotlin.String** | Plaid&#39;s institution ID for the account&#39;s institution. Required for &#39;plaid_processor_token&#39; accounts. |  [optional]
**plaidAccountMask** | **kotlin.String** | The account mask for the account. Required for &#39;plaid_processor_token&#39; accounts. |  [optional]
**plaidAccountName** | **kotlin.String** | The name of the account. Required for &#39;plaid_processor_token&#39; accounts. |  [optional]


<a name="AccountKind"></a>
## Enum: account_kind
Name | Value
---- | -----
accountKind | plaid, plaid_processor_token



