
# PostCounterpartyBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The counterparty&#39;s type. | 
**customerGuid** | **kotlin.String** | The owning customer&#39;s identifier. |  [optional]
**name** | [**PostCounterpartyNameBankModel**](PostCounterpartyNameBankModel.md) |  |  [optional]
**address** | [**PostCustomerAddressBankModel**](PostCustomerAddressBankModel.md) |  |  [optional]
**aliases** | [**kotlin.collections.List&lt;CounterpartyAliasesInnerBankModel&gt;**](CounterpartyAliasesInnerBankModel.md) | The counterparty&#39;s aliases. |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The counterparty&#39;s date of birth. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the counterparty. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | business, individual



