
# PostCustomerBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of customer. | 
**address** | [**PostCustomerAddressBankModel**](PostCustomerAddressBankModel.md) |  |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s email address. |  [optional]
**identificationNumbers** | [**kotlin.collections.List&lt;PostIdentificationNumberBankModel&gt;**](PostIdentificationNumberBankModel.md) | The customer&#39;s identification numbers. |  [optional]
**name** | [**PostCustomerNameBankModel**](PostCustomerNameBankModel.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s date of birth. Optional when type is individual. |  [optional]
**aliases** | [**kotlin.collections.List&lt;PostCustomerAliasesInnerBankModel&gt;**](PostCustomerAliasesInnerBankModel.md) | The aliases of the customer. Optional when type is business. |  [optional]
**website** | **kotlin.String** | The customer&#39;s website. Optional when type is business. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the customer. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | business, individual



