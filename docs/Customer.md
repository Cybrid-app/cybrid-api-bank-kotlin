
# CustomerBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the customer. |  [optional]
**bankGuid** | **kotlin.String** | Auto-generated unique identifier for the customer&#39;s bank. |  [optional]
**type** | [**inline**](#Type) | The customer&#39;s type. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the customer was created at. |  [optional]
**state** | [**inline**](#State) | The customer&#39;s state. |  [optional]
**name** | [**CustomerNameBankModel**](CustomerNameBankModel.md) |  |  [optional]
**address** | [**CustomerAddressBankModel**](CustomerAddressBankModel.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s date of birth. |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s phone number. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | individual


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, unverified, verified, rejected



