package app.cybrid.cybrid_api_bank.client.apis

import app.cybrid.cybrid_api_bank.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel
import app.cybrid.cybrid_api_bank.client.models.PostWorkflowBankModel
import app.cybrid.cybrid_api_bank.client.models.WorkflowBankModel
import app.cybrid.cybrid_api_bank.client.models.WorkflowWithDetailsBankModel
import app.cybrid.cybrid_api_bank.client.models.WorkflowsListBankModel

interface WorkflowsApi {
    /**
     * Create Workflow
     * Creates a workflow.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the workflow details in our private store | | completed | The Platform has created the workflow | | failed | The workflow was not completed successfully |    Required scope: **workflows:execute**
     * Responses:
     *  - 201: Workflow created
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 422: Unable to process request
     *
     * @param postWorkflowBankModel 
     * @return [WorkflowBankModel]
     */
    @POST("api/workflows")
    suspend fun createWorkflow(@Body postWorkflowBankModel: PostWorkflowBankModel): Response<WorkflowBankModel>

    /**
     * Get Workflow
     * Retrieves a workflow.  Required scope: **workflows:read**
     * Responses:
     *  - 200: trade found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: workflow not found
     *
     * @param workflowGuid Identifier for the workflow.
     * @return [WorkflowWithDetailsBankModel]
     */
    @GET("api/workflows/{workflow_guid}")
    suspend fun getWorkflow(@Path("workflow_guid") workflowGuid: kotlin.String): Response<WorkflowWithDetailsBankModel>

    /**
     * Get workflows list
     * Retrieves a listing of workflows.  Required scope: **workflows:read**
     * Responses:
     *  - 200: get list of workflows
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated workflow_guids to list workflows for. (optional)
     * @param bankGuid Comma separated bank_guids to list workflows for. (optional)
     * @param customerGuid Comma separated customer_guids to list workflows for. (optional)
     * @return [WorkflowsListBankModel]
     */
    @GET("api/workflows")
    suspend fun listWorkflows(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("bank_guid") bankGuid: kotlin.String? = null, @Query("customer_guid") customerGuid: kotlin.String? = null): Response<WorkflowsListBankModel>

}
