package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PlatformFileBankModel
import app.cybrid.cybrid_api_bank.client.models.PlatformFileListBankModel
import app.cybrid.cybrid_api_bank.client.models.PostFileBankModel

interface FilesApi {
    /**
     * Create File
     * Creates a file.  #### This feature is currently in preview mode and is not yet available for partner use.  ## Data  The attribute contains the base64 encoded file content. The value needs to be smaller than 10MB otherwise the Platform will reject the request. To upload files larger than 10MB do not provide the content and use the returned upload URL to provide the file.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the file in our private store | | completed | The Platform has completed storing the file | | failed | The Platform failed to store the file |    Required scope: **files:execute**
     * Responses:
     *  - 201: file created
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postFileBankModel 
     * @return [PlatformFileBankModel]
     */
    @POST("api/files")
    suspend fun createFile(@Body postFileBankModel: PostFileBankModel): Response<PlatformFileBankModel>

    /**
     * Get File
     * Retrieves a file.  Required scope: **files:read**
     * Responses:
     *  - 200: file found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: file not found
     *
     * @param fileGuid Identifier for the file.
     * @param includeDownloadUrl Include download information in response. Note, the files:pii:read scope is required if this parameter is set. (optional)
     * @return [PlatformFileBankModel]
     */
    @GET("api/files/{file_guid}")
    suspend fun getFile(@Path("file_guid") fileGuid: kotlin.String, @Query("include_download_url") includeDownloadUrl: kotlin.String? = null): Response<PlatformFileBankModel>

    /**
     * List Files
     * Retrieves a list of files.  Required scope: **files:read**
     * Responses:
     *  - 200: get list of files
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated file_guids to list files for. (optional)
     * @param type Comma separated file types to list files for. (optional)
     * @param state Comma separated file states to list files for. (optional)
     * @param bankGuid Comma separated bank_guids to list files for. (optional)
     * @param customerGuid Comma separated customer_guids to list files for. (optional)
     * @return [PlatformFileListBankModel]
     */
    @GET("api/files")
    suspend fun listFiles(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("type") type: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<PlatformFileListBankModel>

}
