
# CustomerBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the customer. |  [optional]
**bankGuid** | **kotlin.String** | Auto-generated unique identifier for the customer&#39;s bank. |  [optional]
**type** | **kotlin.String** | The customer type; one of business or individual. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**state** | **kotlin.String** | The customer state; one of storing, unverified, verified, rejected, or frozen. |  [optional]
**name** | [**CustomerNameBankModel**](CustomerNameBankModel.md) |  |  [optional]
**address** | [**CustomerAddressBankModel**](CustomerAddressBankModel.md) |  |  [optional]
**aliases** | [**kotlin.collections.List&lt;CustomerAliasesInnerBankModel&gt;**](CustomerAliasesInnerBankModel.md) | The customer&#39;s aliases. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**website** | **kotlin.String** | The customer&#39;s website. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s DOB. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s email address. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the customer. |  [optional]
**complianceDecisions** | [**kotlin.collections.List&lt;ComplianceDecisionBankModel&gt;**](ComplianceDecisionBankModel.md) | The compliance decisions associated with the customer. |  [optional]



