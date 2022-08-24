package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostRewardBankModel
import app.cybrid.cybrid_api_bank.client.models.RewardBankModel
import app.cybrid.cybrid_api_bank.client.models.RewardListBankModel

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

    /**
     * Get Reward
     * Retrieves a reward.  Required scope: **rewards:read**
     * Responses:
     *  - 200: reward found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: reward not found
     *
     * @param rewardGuid Identifier for the reward.
     * @return [RewardBankModel]
     */
    @GET("api/rewards/{reward_guid}")
    suspend fun getReward(@Path("reward_guid") rewardGuid: kotlin.String): Response<RewardBankModel>

    /**
     * Get rewards list
     * Retrieves a listing of rewards.  Required scope: **rewards:read**
     * Responses:
     *  - 200: get list of rewards
     *  - 400: Invalid requests - malformed authentication header
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated reward_guids to list rewards for. (optional)
     * @param bankGuid Comma separated bank_guids to list rewards for. (optional)
     * @param customerGuid Comma separated customer_guids to list rewards for. (optional)
     * @return [RewardListBankModel]
     */
    @GET("api/rewards")
    suspend fun listRewards(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<RewardListBankModel>

}
