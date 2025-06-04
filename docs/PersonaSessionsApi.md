# PersonaSessionsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPersonaSession**](PersonaSessionsApi.md#createPersonaSession) | **POST** api/persona_sessions | Create Persona Session



Create Persona Session

Create a Persona session.  Required scope: **persona_sessions:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(PersonaSessionsApi::class.java)
val postPersonaSessionBankModel : PostPersonaSessionBankModel =  // PostPersonaSessionBankModel | 

launch(Dispatchers.IO) {
    val result : PersonaSessionBankModel = webService.createPersonaSession(postPersonaSessionBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postPersonaSessionBankModel** | [**PostPersonaSessionBankModel**](PostPersonaSessionBankModel.md)|  |

### Return type

[**PersonaSessionBankModel**](PersonaSessionBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

