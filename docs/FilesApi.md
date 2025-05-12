# FilesApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** api/files | Create File
[**getFile**](FilesApi.md#getFile) | **GET** api/files/{file_guid} | Get File
[**listFiles**](FilesApi.md#listFiles) | **GET** api/files | List Files



Create File

Creates a file.  #### This feature is currently in preview mode and is not yet available for partner use.  ## Data  The attribute contains the base64 encoded file content. The value needs to be smaller than 10MB otherwise the Platform will reject the request. To upload files larger than 10MB do not provide the content and use the returned upload URL to provide the file.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the file in our private store | | completed | The Platform has completed storing the file | | failed | The Platform failed to store the file |    Required scope: **files:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(FilesApi::class.java)
val postFileBankModel : PostFileBankModel =  // PostFileBankModel | 

launch(Dispatchers.IO) {
    val result : PlatformFileBankModel = webService.createFile(postFileBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postFileBankModel** | [**PostFileBankModel**](PostFileBankModel.md)|  |

### Return type

[**PlatformFileBankModel**](PlatformFileBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get File

Retrieves a file.  Required scope: **files:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileGuid : kotlin.String = fileGuid_example // kotlin.String | Identifier for the file.
val includeDownloadUrl : kotlin.String = includeDownloadUrl_example // kotlin.String | Include download information in response. Note, the files:pii:read scope is required if this parameter is set.

launch(Dispatchers.IO) {
    val result : PlatformFileBankModel = webService.getFile(fileGuid, includeDownloadUrl)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileGuid** | **kotlin.String**| Identifier for the file. |
 **includeDownloadUrl** | **kotlin.String**| Include download information in response. Note, the files:pii:read scope is required if this parameter is set. | [optional]

### Return type

[**PlatformFileBankModel**](PlatformFileBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Files

Retrieves a list of files.  Required scope: **files:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(FilesApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated file_guids to list files for.
val type : kotlin.String = type_example // kotlin.String | Comma separated file types to list files for.
val state : kotlin.String = state_example // kotlin.String | Comma separated file states to list files for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list files for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list files for.

launch(Dispatchers.IO) {
    val result : PlatformFileListBankModel = webService.listFiles(page, perPage, guid, type, state, bankGuid, customerGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated file_guids to list files for. | [optional]
 **type** | **kotlin.String**| Comma separated file types to list files for. | [optional]
 **state** | **kotlin.String**| Comma separated file states to list files for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list files for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list files for. | [optional]

### Return type

[**PlatformFileListBankModel**](PlatformFileListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

