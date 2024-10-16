
# PostCustomerBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of customer. | 
**name** | [**PostCustomerNameBankModel**](PostCustomerNameBankModel.md) |  |  [optional]
**address** | [**PostCustomerAddressBankModel**](PostCustomerAddressBankModel.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s date of birth. Optional when type is individual. |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. Optional when type is individual. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s email address. Optional when type is individual. |  [optional]
**identificationNumbers** | [**kotlin.collections.List&lt;PostIdentificationNumberBankModel&gt;**](PostIdentificationNumberBankModel.md) | The customer&#39;s identification numbers. Optional when type is individual. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the customer. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | business, individual



