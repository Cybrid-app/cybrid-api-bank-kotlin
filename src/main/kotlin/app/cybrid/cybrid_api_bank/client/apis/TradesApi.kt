/**
 * Cybrid Bank API
 *
 * # Welcome  Welcome to the Cybrid platform; enabling turnkey crypto banking services!  In these documents, you will find information on the operations provided by our platform, as well as details on how our REST API operates more generally.  Our complete set of APIs allows you to manage all your resources: your Organization, your banks and your identities. The complete set of APIs can be found on the following pages:  | API                                                            | Description                  | |----------------------------------------------------------------|------------------------------| | [Organization API](https://organization.demo.cybrid.app/api/schema/swagger-ui) | APIs to manage organizations | | [Bank API](https://bank.demo.cybrid.app/api/schema/swagger-ui)                 | APIs to manage banks         | | [Identities API](https://id.demo.cybrid.app/api/schema/swagger-ui)                     | APIs to manage identities    |  When you're ready, [request access](https://www.cybrid.xyz/access) to your Dashboard to view and administer your Organization. Once you've logged in, you can begin creating Banks, either for sandbox or production usage, and start enabling your customers to leverage DeFi and web3 with confidence.  If you have any questions, please contact [Support](mailto:support@cybrid.app) at any time so that we can help.  ## Authentication  The Cybrid Platform uses OAuth 2.0 Bearer Tokens to authenticate requests to the platform. Credentials to create Organization and Bank tokens can be generated via your Dashboard ([request access](https://www.cybrid.xyz/access)).  An Organization Token applies broadly to the whole Organization and all of its Banks, whereas, a Bank Token is specific to an individual Bank.  Both Organization and Bank tokens can be created using the OAuth Client Credential Grant flow. Each Organization and Bank has its own unique Client ID and Secret that allows for machine-to-machine authentication.  **Never share your Client ID or Secret publicly or in your source code repository**  Your Client ID and Secret can be exchanged for a time-limited Bearer Token by interacting with the Cybrid Identity Provider or through interacting with the **Authorize** button in this document:  ``` curl -X POST https://id.demo.cybrid.app/oauth/token -d '{     \"grant_type\": \"client_credentials\",     \"client_id\": \"<Your Client ID>\",     \"client_secret\": \"<Your Secret>\",     \"scope\": \"<Your requested scopes -- space separated>\"   }' -H \"Content-Type: application/json\" ```  ## Scopes  The Cybrid platform supports the use of scopes to control the level of access a token is limited to. Scopes do not grant access to resources; instead, they provide limits, in support of the least privilege principal.  The following scopes are available on the platform and can be requested when generating either an Organization or a Bank token. Generally speaking, the _Read_ scope is required to read and list resources, the _Write_ scope is required to update a resource and the _Execute_ scope is required to create a resource.  | Resource      | Read scope         | Write scope          | Execute scope     | Token Type         | |---------------|--------------------|----------------------|-------------------|--------------------| | Organizations | organizations:read | organizations:write  |                   | Organization/ Bank | | Banks         | banks:read         | banks:write          | banks:execute     | Organization/ Bank | | Customers     | customers:read     | customers:write      | customers:execute | Bank               | | Assets        | prices:read        |                      |                   | Bank               | | Accounts      | accounts:read      |                      | accounts:execute  | Bank               | | Prices        | prices:read        |                      |                   | Bank               | | Symbols       | prices:read        |                      |                   | Bank               | | Quotes        | quotes:read        |                      | quotes:execute    | Bank               | | Trades        | trades:read        |                      | trades:execute    | Bank               |  ## Organizations  An Organization is meant to model the organization partnering with Cybrid to use our platform.  An Organization does not directly interact with customers. Instead, an Organization has one or more banks, which encompass the financial service offerings of the platform.  ## Banks  A Bank is owned by an Organization and can be thought of as an environment or container for Customers and product offerings. An example of a Bank would be your customer facing banking website, or an internal staging environment for testing and integration.  An Organization can have multiple banks, in sandbox or production environments. A sandbox Bank will be backed by stubbed data and process flows. For instance, identity record and funding source processes will be simulated rather than performed.  ## Customers  Customers represent your banking users on the platform. At present, we offer support for Individuals as Customers.  Customers must be verified in our system before they can play any part on the platform. See the Identity Records section for more details on how a customer can be verified.  Customers must also have an account to be able to transact. See the Accounts APIs for more details on setting up accounts for the customer. 
 *
 * The version of the OpenAPI document: v0.1.2
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

import app.cybrid.cybrid_api_bank.client.models.PostTradeBankModel
import app.cybrid.cybrid_api_bank.client.models.TradeBankModel
import app.cybrid.cybrid_api_bank.client.models.TradeListBankModel

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

class TradesApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://bank.demo.cybrid.app")
        }
    }

    /**
    * Create Trade
    * Creates a trade.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | initiating | The Platform has begun to perform the trade | | pending | The Platform is executing the trade | | completed | The Platform has successfully completed the trade | | failed | The Platform was not able to successfully complete the trade |    Required scope: **trades:execute**
    * @param postTradeBankModel  
    * @return TradeBankModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createTrade(postTradeBankModel: PostTradeBankModel) : TradeBankModel = withContext(Dispatchers.IO) {
        val localVarResponse = createTradeWithHttpInfo(postTradeBankModel = postTradeBankModel)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TradeBankModel
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
    * Create Trade
    * Creates a trade.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the trade details in our private store | | initiating | The Platform has begun to perform the trade | | pending | The Platform is executing the trade | | completed | The Platform has successfully completed the trade | | failed | The Platform was not able to successfully complete the trade |    Required scope: **trades:execute**
    * @param postTradeBankModel  
    * @return ApiResponse<TradeBankModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun createTradeWithHttpInfo(postTradeBankModel: PostTradeBankModel) : ApiResponse<TradeBankModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createTradeRequestConfig(postTradeBankModel = postTradeBankModel)

        return@withContext request<PostTradeBankModel, TradeBankModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation createTrade
    *
    * @param postTradeBankModel  
    * @return RequestConfig
    */
    fun createTradeRequestConfig(postTradeBankModel: PostTradeBankModel) : RequestConfig<PostTradeBankModel> {
        val localVariableBody = postTradeBankModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/trades",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Trade
    * Retrieves a trade.  Required scope: **trades:read**
    * @param tradeGuid Identifier for the trade. 
    * @return TradeBankModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun getTrade(tradeGuid: kotlin.String) : TradeBankModel = withContext(Dispatchers.IO) {
        val localVarResponse = getTradeWithHttpInfo(tradeGuid = tradeGuid)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TradeBankModel
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
    * Get Trade
    * Retrieves a trade.  Required scope: **trades:read**
    * @param tradeGuid Identifier for the trade. 
    * @return ApiResponse<TradeBankModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun getTradeWithHttpInfo(tradeGuid: kotlin.String) : ApiResponse<TradeBankModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = getTradeRequestConfig(tradeGuid = tradeGuid)

        return@withContext request<Unit, TradeBankModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation getTrade
    *
    * @param tradeGuid Identifier for the trade. 
    * @return RequestConfig
    */
    fun getTradeRequestConfig(tradeGuid: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/trades/{trade_guid}".replace("{"+"trade_guid"+"}", "$tradeGuid"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get trades list
    * Retrieves a listing of trades.  Required scope: **trades:read**
    * @param customerGuid The customer&#39;s identifier. 
    * @param accountGuid The account&#39;s identifier. 
    * @param page The page index to retrieve. (optional, default to 0)
    * @param perPage The number of entities per page to return. (optional, default to 10)
    * @param guid Comma separated trade_guids to list trades for. (optional)
    * @return TradeListBankModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun listTrades(customerGuid: kotlin.String, accountGuid: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?, guid: kotlin.String?) : TradeListBankModel = withContext(Dispatchers.IO) {
        val localVarResponse = listTradesWithHttpInfo(customerGuid = customerGuid, accountGuid = accountGuid, page = page, perPage = perPage, guid = guid)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TradeListBankModel
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
    * Get trades list
    * Retrieves a listing of trades.  Required scope: **trades:read**
    * @param customerGuid The customer&#39;s identifier. 
    * @param accountGuid The account&#39;s identifier. 
    * @param page The page index to retrieve. (optional, default to 0)
    * @param perPage The number of entities per page to return. (optional, default to 10)
    * @param guid Comma separated trade_guids to list trades for. (optional)
    * @return ApiResponse<TradeListBankModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun listTradesWithHttpInfo(customerGuid: kotlin.String, accountGuid: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?, guid: kotlin.String?) : ApiResponse<TradeListBankModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = listTradesRequestConfig(customerGuid = customerGuid, accountGuid = accountGuid, page = page, perPage = perPage, guid = guid)

        return@withContext request<Unit, TradeListBankModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation listTrades
    *
    * @param customerGuid The customer&#39;s identifier. 
    * @param accountGuid The account&#39;s identifier. 
    * @param page The page index to retrieve. (optional, default to 0)
    * @param perPage The number of entities per page to return. (optional, default to 10)
    * @param guid Comma separated trade_guids to list trades for. (optional)
    * @return RequestConfig
    */
    fun listTradesRequestConfig(customerGuid: kotlin.String, accountGuid: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?, guid: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
                if (guid != null) {
                    put("guid", listOf(guid.toString()))
                }
                put("customer_guid", listOf(customerGuid.toString()))
                put("account_guid", listOf(accountGuid.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/trades",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
