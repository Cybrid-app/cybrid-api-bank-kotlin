/**
 * Cybrid Bank API
 *
 * # Welcome  Welcome to the Cybrid platform; enabling turnkey crypto banking services!  In these documents, you will find information on the operations provided by our platform, as well as details on how our REST API operates more generally.  Our complete set of APIs allows you to manage all your resources: your Organization, your banks and your identities. The complete set of APIs can be found on the following pages:  | API                                                            | Description                  | |----------------------------------------------------------------|------------------------------| | [Organization API](https://organization.demo.cybrid.app/api/schema/swagger-ui) | APIs to manage organizations | | [Bank API](https://bank.demo.cybrid.app/api/schema/swagger-ui)                 | APIs to manage banks         | | [Identities API](https://id.demo.cybrid.app/api/schema/swagger-ui)                     | APIs to manage identities    |  When you're ready, [request access](https://www.cybrid.xyz/access) to your Dashboard to view and administer your Organization. Once you've logged in, you can begin creating Banks, either for sandbox or production usage, and start enabling your customers to leverage DeFi and web3 with confidence.  If you have any questions, please contact [Support](mailto:support@cybrid.app) at any time so that we can help.  ## Authentication  The Cybrid Platform uses OAuth 2.0 Bearer Tokens to authenticate requests to the platform. Credentials to create Organization and Bank tokens can be generated via your Dashboard ([request access](https://www.cybrid.xyz/access)).  An Organization Token applies broadly to the whole Organization and all of its Banks, whereas, a Bank Token is specific to an individual Bank.  Both Organization and Bank tokens can be created using the OAuth Client Credential Grant flow. Each Organization and Bank has its own unique Client ID and Secret that allows for machine-to-machine authentication.  **Never share your Client ID or Secret publicly or in your source code repository**  Your Client ID and Secret can be exchanged for a time-limited Bearer Token by interacting with the Cybrid Identity Provider or through interacting with the **Authorize** button in this document:  ``` curl -X POST https://id.demo.cybrid.app/oauth/token -d '{     \"grant_type\": \"client_credentials\",     \"client_id\": \"<Your Client ID>\",     \"client_secret\": \"<Your Secret>\",     \"scope\": \"<Your requested scopes -- space separated>\"   }' -H \"Content-Type: application/json\" ```  ## Scopes  The Cybrid platform supports the use of scopes to control the level of access a token is limited to. Scopes do not grant access to resources; instead, they provide limits, in support of the least privilege principal.  The following scopes are available on the platform and can be requested when generating either an Organization or a Bank token. Generally speaking, the _Read_ scope is required to read and list resources, the _Write_ scope is required to update a resource and the _Execute_ scope is required to create a resource.  | Resource      | Read scope         | Write scope          | Execute scope     | Token Type         | |---------------|--------------------|----------------------|-------------------|--------------------| | Organizations | organizations:read | organizations:write  |                   | Organization/ Bank | | Banks         | banks:read         | banks:write          | banks:execute     | Organization/ Bank | | Customers     | customers:read     | customers:write      | customers:execute | Bank               | | Assets        | prices:read        |                      |                   | Bank               | | Accounts      | accounts:read      |                      | accounts:execute  | Bank               | | Prices        | prices:read        |                      |                   | Bank               | | Symbols       | prices:read        |                      |                   | Bank               | | Quotes        | quotes:read        |                      | quotes:execute    | Bank               | | Trades        | trades:read        |                      | trades:execute    | Bank               |  ## Organizations  An Organization is meant to model the organization partnering with Cybrid to use our platform.  An Organization does not directly interact with customers. Instead, an Organization has one or more banks, which encompass the financial service offerings of the platform.  ## Banks  A Bank is owned by an Organization and can be thought of as an environment or container for Customers and product offerings. An example of a Bank would be your customer facing banking website, or an internal staging environment for testing and integration.  An Organization can have multiple banks, in sandbox or production environments. A sandbox Bank will be backed by stubbed data and process flows. For instance, identity record and funding source processes will be simulated rather than performed.  ## Customers  Customers represent your banking users on the platform. At present, we offer support for Individuals as Customers.  Customers must be verified in our system before they can play any part on the platform. See the Identity Records section for more details on how a customer can be verified.  Customers must also have an account to be able to transact. See the Accounts APIs for more details on setting up accounts for the customer. 
 *
 * The version of the OpenAPI document: v0.1.4
 * Contact: support@cybrid.app
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package app.cybrid.cybrid_api_bank.client.apis

import java.io.IOException

import app.cybrid.cybrid_api_bank.client.models.PostQuoteBankModel
import app.cybrid.cybrid_api_bank.client.models.QuoteBankModel
import app.cybrid.cybrid_api_bank.client.models.QuoteListBankModel

import com.google.gson.annotations.SerializedName

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import app.cybrid.cybrid_api_bank.client.infrastructure.ApiClient
import app.cybrid.cybrid_api_bank.client.infrastructure.ApiResponse
import app.cybrid.cybrid_api_bank.client.infrastructure.ClientException
import app.cybrid.cybrid_api_bank.client.infrastructure.ClientError
import app.cybrid.cybrid_api_bank.client.infrastructure.ServerException
import app.cybrid.cybrid_api_bank.client.infrastructure.ServerError
import app.cybrid.cybrid_api_bank.client.infrastructure.MultiValueMap
import app.cybrid.cybrid_api_bank.client.infrastructure.RequestConfig
import app.cybrid.cybrid_api_bank.client.infrastructure.RequestMethod
import app.cybrid.cybrid_api_bank.client.infrastructure.ResponseType
import app.cybrid.cybrid_api_bank.client.infrastructure.Success
import app.cybrid.cybrid_api_bank.client.infrastructure.toMultiValue

class QuotesApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://bank.demo.cybrid.app")
        }
    }

    /**
    * Create Quote
    * Creates a quote.  Required scope: **quotes:execute**
    * @param postQuoteBankModel  
    * @return QuoteBankModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createQuote(postQuoteBankModel: PostQuoteBankModel) : QuoteBankModel = withContext(Dispatchers.IO) {
        val localVarResponse = createQuoteWithHttpInfo(postQuoteBankModel = postQuoteBankModel)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QuoteBankModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Create Quote
    * Creates a quote.  Required scope: **quotes:execute**
    * @param postQuoteBankModel  
    * @return ApiResponse<QuoteBankModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun createQuoteWithHttpInfo(postQuoteBankModel: PostQuoteBankModel) : ApiResponse<QuoteBankModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createQuoteRequestConfig(postQuoteBankModel = postQuoteBankModel)

        return@withContext request<PostQuoteBankModel, QuoteBankModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation createQuote
    *
    * @param postQuoteBankModel  
    * @return RequestConfig
    */
    fun createQuoteRequestConfig(postQuoteBankModel: PostQuoteBankModel) : RequestConfig<PostQuoteBankModel> {
        val localVariableBody = postQuoteBankModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/quotes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Quote
    * Retrieves a quote.  Required scope: **quotes:read**
    * @param quoteGuid Identifier for the quote. 
    * @return QuoteBankModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun getQuote(quoteGuid: kotlin.String) : QuoteBankModel = withContext(Dispatchers.IO) {
        val localVarResponse = getQuoteWithHttpInfo(quoteGuid = quoteGuid)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QuoteBankModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get Quote
    * Retrieves a quote.  Required scope: **quotes:read**
    * @param quoteGuid Identifier for the quote. 
    * @return ApiResponse<QuoteBankModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun getQuoteWithHttpInfo(quoteGuid: kotlin.String) : ApiResponse<QuoteBankModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = getQuoteRequestConfig(quoteGuid = quoteGuid)

        return@withContext request<Unit, QuoteBankModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation getQuote
    *
    * @param quoteGuid Identifier for the quote. 
    * @return RequestConfig
    */
    fun getQuoteRequestConfig(quoteGuid: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/quotes/{quote_guid}".replace("{"+"quote_guid"+"}", "$quoteGuid"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get quotes list
    * Retrieves a listing of quotes for all customers of a bank.  Required scope: **quotes:read**
    * @param page  (optional, default to 0)
    * @param perPage  (optional, default to 10)
    * @return QuoteListBankModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun listQuotes(page: kotlin.Int?, perPage: kotlin.Int?) : QuoteListBankModel = withContext(Dispatchers.IO) {
        val localVarResponse = listQuotesWithHttpInfo(page = page, perPage = perPage)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QuoteListBankModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get quotes list
    * Retrieves a listing of quotes for all customers of a bank.  Required scope: **quotes:read**
    * @param page  (optional, default to 0)
    * @param perPage  (optional, default to 10)
    * @return ApiResponse<QuoteListBankModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun listQuotesWithHttpInfo(page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<QuoteListBankModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = listQuotesRequestConfig(page = page, perPage = perPage)

        return@withContext request<Unit, QuoteListBankModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation listQuotes
    *
    * @param page  (optional, default to 0)
    * @param perPage  (optional, default to 10)
    * @return RequestConfig
    */
    fun listQuotesRequestConfig(page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/quotes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
