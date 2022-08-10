# RewardsApi

All URIs are relative to *https://bank.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRewards**](RewardsApi.md#createRewards) | **POST** api/rewards | Create Reward



Create Reward

Creates a reward.  Required scope: **rewards:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(RewardsApi::class.java)
val postRewardBankModel : PostRewardBankModel =  // PostRewardBankModel | 

launch(Dispatchers.IO) {
    val result : RewardBankModel = webService.createRewards(postRewardBankModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postRewardBankModel** | [**PostRewardBankModel**](PostRewardBankModel.md)|  |

### Return type

[**RewardBankModel**](RewardBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

