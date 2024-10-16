
# PostCounterpartyBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The counterparty&#39;s type. | 
**address** | [**PostCounterpartyAddressBankModel**](PostCounterpartyAddressBankModel.md) |  | 
**customerGuid** | **kotlin.String** | The owning customer&#39;s identifier. |  [optional]
**name** | [**PostCounterpartyNameBankModel**](PostCounterpartyNameBankModel.md) |  |  [optional]
**aliases** | [**kotlin.collections.List&lt;PostCounterpartyAliasesInnerBankModel&gt;**](PostCounterpartyAliasesInnerBankModel.md) | The aliases of the counterparty. Optional when type is business. |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The counterparty&#39;s date of birth. Optional when type is individual. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the counterparty. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | business, individual



