
# PostCustomerBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The customer&#39;s type. | 
**name** | [**PostCustomerNameBankModel**](PostCustomerNameBankModel.md) |  |  [optional]
**address** | [**PostCustomerAddressBankModel**](PostCustomerAddressBankModel.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s date of birth. |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s email address. |  [optional]
**identificationNumbers** | [**kotlin.collections.List&lt;PostIdentificationNumberBankModel&gt;**](PostIdentificationNumberBankModel.md) | The customer&#39;s identification numbers. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the customer. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | individual



