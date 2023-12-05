
# CustomerBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the customer. |  [optional]
**bankGuid** | **kotlin.String** | Auto-generated unique identifier for the customer&#39;s bank. |  [optional]
**type** | [**inline**](#Type) | The customer&#39;s type. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**state** | [**inline**](#State) | The customer&#39;s state. |  [optional]
**name** | [**CustomerNameBankModel**](CustomerNameBankModel.md) |  |  [optional]
**address** | [**CustomerAddressBankModel**](CustomerAddressBankModel.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s DOB. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s email address. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the customer. |  [optional]
**verificationChecks** | [**kotlin.collections.List&lt;VerificationCheckBankModel&gt;**](VerificationCheckBankModel.md) | The verification checks associated with the customer. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | business, individual


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, unverified, verified, rejected, frozen



