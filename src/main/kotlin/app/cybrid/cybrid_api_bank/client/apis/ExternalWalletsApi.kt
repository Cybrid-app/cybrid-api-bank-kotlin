package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.ExternalWalletBankModel
import app.cybrid.cybrid_api_bank.client.models.ExternalWalletListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostExternalWalletBankModel

interface ExternalWalletsApi {
    /**
     * Create ExternalWallet
     * Create an ExternalWallet.  Required scope: **external_wallets:execute**
     * Responses:
     *  - 201: ExternalWallet created
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 409: Data already exists
     *  - 422: Unable to process request
     *
     * @param postExternalWalletBankModel 
     * @return [ExternalWalletBankModel]
     */
    @POST("api/external_wallets")
    suspend fun createExternalWallet(@Body postExternalWalletBankModel: PostExternalWalletBankModel): Response<ExternalWalletBankModel>

    /**
     * Delete External Wallet
     * Deletes an external wallet.  Required scope: **external_wallets:execute**
     * Responses:
     *  - 200: External wallet deleted
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: ExternalWallet not found
     *
     * @param externalWalletGuid Identifier for the external wallet.
     * @return [ExternalWalletBankModel]
     */
    @DELETE("api/external_wallets/{external_wallet_guid}")
    suspend fun deleteExternalWallet(@Path("external_wallet_guid") externalWalletGuid: kotlin.String): Response<ExternalWalletBankModel>

    /**
     * Get External Wallet
     * Retrieves an external_wallet.  Required scope: **external_wallets:read**
     * Responses:
     *  - 200: External wallet found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: ExternalWallet not found
     *
     * @param externalWalletGuid Identifier for the external_wallet.
     * @return [ExternalWalletBankModel]
     */
    @GET("api/external_wallets/{external_wallet_guid}")
    suspend fun getExternalWallet(@Path("external_wallet_guid") externalWalletGuid: kotlin.String): Response<ExternalWalletBankModel>

    /**
     * Get external wallets list
     * Retrieves a listing of external wallets.  Required scope: **external_wallets:read**
     * Responses:
     *  - 200: Get list of external_wallets
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated external_wallet_guids to list external_wallets for. (optional)
     * @param bankGuid Comma separated bank_guids to list external_wallets for. (optional)
     * @param customerGuid Comma separated customer_guids to list external_wallets for. (optional)
     * @return [ExternalWalletListBankModel]
     */
    @GET("api/external_wallets")
    suspend fun listExternalWallets(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<ExternalWalletListBankModel>

}