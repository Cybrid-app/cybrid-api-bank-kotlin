# WorkflowsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflow**](WorkflowsApi.md#createWorkflow) | **POST** api/workflows | Create Workflow
[**getWorkflow**](WorkflowsApi.md#getWorkflow) | **GET** api/workflows/{workflow_guid} | Get Workflow
[**listWorkflows**](WorkflowsApi.md#listWorkflows) | **GET** api/workflows | Get workflows list



Create Workflow

Creates a workflow.  Required scope: **workflows:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WorkflowsApi::class.java)
val postWorkflowBankModel : PostWorkflowBankModel =  // PostWorkflowBankModel | 

launch(Dispatchers.IO) {
    val result : WorkflowBankModel = webService.createWorkflow(postWorkflowBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postWorkflowBankModel** | [**PostWorkflowBankModel**](PostWorkflowBankModel.md)|  |

### Return type

[**WorkflowBankModel**](WorkflowBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Workflow

Retrieves a workflow.  Required scope: **workflows:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WorkflowsApi::class.java)
val workflowGuid : kotlin.String = workflowGuid_example // kotlin.String | Identifier for the workflow.

launch(Dispatchers.IO) {
    val result : WorkflowWithDetailsBankModel = webService.getWorkflow(workflowGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowGuid** | **kotlin.String**| Identifier for the workflow. |

### Return type

[**WorkflowWithDetailsBankModel**](WorkflowWithDetailsBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get workflows list

Retrieves a listing of workflows.  Required scope: **workflows:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(WorkflowsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated workflow_guids to list workflows for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list workflows for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list workflows for.

launch(Dispatchers.IO) {
    val result : WorkflowsListBankModel = webService.listWorkflows(page, perPage, guid, bankGuid, customerGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated workflow_guids to list workflows for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list workflows for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list workflows for. | [optional]

### Return type

[**WorkflowsListBankModel**](WorkflowsListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

