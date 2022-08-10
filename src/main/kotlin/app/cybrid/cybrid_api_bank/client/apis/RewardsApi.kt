package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostRewardBankModel
import app.cybrid.cybrid_api_bank.client.models.RewardBankModel

interface RewardsApi {
    /**
     * Create Reward
     * Creates a reward.  Required scope: **rewards:execute**
     * Responses:
     *  - 201: reward created
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postRewardBankModel 
     * @return [RewardBankModel]
     */
    @POST("api/rewards")
    suspend fun createRewards(@Body postRewardBankModel: PostRewardBankModel): Response<RewardBankModel>

}
