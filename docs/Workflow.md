
# WorkflowBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the workflow. |  [optional]
**bankGuid** | **kotlin.String** | The associated banks&#39;s identifier. |  [optional]
**customerGuid** | **kotlin.String** | The associated customer&#39;s identifier. |  [optional]
**type** | **kotlin.String** | The type of workflow; one of plaid. |  [optional]
**state** | **kotlin.String** | The state of the workflow; one of storing, completed, or failed. |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed workflows. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]



