# RewardsApi

All URIs are relative to *https://bank.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRewards**](RewardsApi.md#createRewards) | **POST** api/rewards | Create Reward
[**getReward**](RewardsApi.md#getReward) | **GET** api/rewards/{reward_guid} | Get Reward
[**listRewards**](RewardsApi.md#listRewards) | **GET** api/rewards | Get rewards list



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


Get Reward

Retrieves a reward.  Required scope: **rewards:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(RewardsApi::class.java)
val rewardGuid : kotlin.String = rewardGuid_example // kotlin.String | Identifier for the reward.

launch(Dispatchers.IO) {
    val result : RewardBankModel = webService.getReward(rewardGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rewardGuid** | **kotlin.String**| Identifier for the reward. |

### Return type

[**RewardBankModel**](RewardBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get rewards list

Retrieves a listing of rewards.  Required scope: **rewards:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_bank.client.*
//import app.cybrid.cybrid_api_bank.client.infrastructure.*
//import app.cybrid.cybrid_api_bank.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(RewardsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated reward_guids to list rewards for.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Comma separated bank_guids to list rewards for.
val customerGuid : kotlin.String = customerGuid_example // kotlin.String | Comma separated customer_guids to list rewards for.

launch(Dispatchers.IO) {
    val result : RewardListBankModel = webService.listRewards(page, perPage, guid, bankGuid, customerGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated reward_guids to list rewards for. | [optional]
 **bankGuid** | **kotlin.String**| Comma separated bank_guids to list rewards for. | [optional]
 **customerGuid** | **kotlin.String**| Comma separated customer_guids to list rewards for. | [optional]

### Return type

[**RewardListBankModel**](RewardListBankModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

