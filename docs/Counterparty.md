
# CounterpartyBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the counterparty. |  [optional]
**type** | **kotlin.String** | The counterparty type; one of business or individual. |  [optional]
**bankGuid** | **kotlin.String** | Auto-generated unique identifier for the counterparty&#39;s bank. |  [optional]
**customerGuid** | **kotlin.String** | Auto-generated unique identifier for the counterparty&#39;s customer. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]
**state** | **kotlin.String** | The counterparty state; one of storing, unverified, verified, or rejected. |  [optional]
**name** | [**CounterpartyNameBankModel**](CounterpartyNameBankModel.md) |  |  [optional]
**address** | [**CounterpartyAddressBankModel**](CounterpartyAddressBankModel.md) |  |  [optional]
**aliases** | [**kotlin.collections.List&lt;CounterpartyAliasesInnerBankModel&gt;**](CounterpartyAliasesInnerBankModel.md) | The counterparty&#39;s aliases. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The counterparty&#39;s DOB. Only available for GET operations when &#39;include_pii&#39; is set. |  [optional]
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | The labels associated with the counterparty. |  [optional]
**complianceDecisions** | [**kotlin.collections.List&lt;ComplianceDecisionBankModel&gt;**](ComplianceDecisionBankModel.md) | The compliance decisions associated with the counterparty. |  [optional]
**verificationChecks** | [**kotlin.collections.List&lt;ComplianceDecisionBankModel&gt;**](ComplianceDecisionBankModel.md) | Deprecated; use compliance_decisions instead. |  [optional]



