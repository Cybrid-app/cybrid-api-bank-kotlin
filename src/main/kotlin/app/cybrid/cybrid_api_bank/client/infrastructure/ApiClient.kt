package app.cybrid.cybrid_api_bank.client.infrastructure

import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder
import app.cybrid.cybrid_api_bank.client.auth.OAuth
import app.cybrid.cybrid_api_bank.client.auth.OAuth.AccessTokenListener
import app.cybrid.cybrid_api_bank.client.auth.OAuthFlow
import app.cybrid.cybrid_api_bank.client.auth.HttpBearerAuth

import okhttp3.Call
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.converter.scalars.ScalarsConverterFactory
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.converter.gson.GsonConverterFactory


class ApiClient(
    private var baseUrl: String = defaultBasePath,
    private val okHttpClientBuilder: OkHttpClient.Builder? = null,
    private val serializerBuilder: GsonBuilder = Serializer.gsonBuilder,
    private val callFactory : Call.Factory? = null,
    private val converterFactory: Converter.Factory? = null,
) {
    private val apiAuthorizations = mutableMapOf<String, Interceptor>()
    var logger: ((String) -> Unit)? = null

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(serializerBuilder.create()))
            .apply {
                if (converterFactory != null) {
                    addConverterFactory(converterFactory)
                }
            }
    }

    private val clientBuilder: OkHttpClient.Builder by lazy {
        okHttpClientBuilder ?: defaultClientBuilder
    }

    private val defaultClientBuilder: OkHttpClient.Builder by lazy {
        OkHttpClient()
            .newBuilder()
            .addInterceptor(HttpLoggingInterceptor { message -> logger?.invoke(message) }
                .apply { level = HttpLoggingInterceptor.Level.BODY }
            )
    }

    init {
        normalizeBaseUrl()
    }

    constructor(
        baseUrl: String = defaultBasePath,
        okHttpClientBuilder: OkHttpClient.Builder? = null,
        serializerBuilder: GsonBuilder = Serializer.gsonBuilder,
        authNames: Array<String>
    ) : this(baseUrl, okHttpClientBuilder, serializerBuilder) {
        authNames.forEach { authName ->
            val auth = when (authName) {
                "BearerAuth" -> HttpBearerAuth("bearer")"oauth2" -> OAuth(OAuthFlow.application, "", "https://id.production.cybrid.app/oauth/token", "banks:read, banks:write, bank_applications:execute, accounts:read, accounts:execute, counterparties:read, counterparties:pii:read, counterparties:write, counterparties:execute, customers:read, customers:pii:read, customers:write, customers:execute, prices:read, quotes:execute, quotes:read, trades:execute, trades:read, transfers:execute, transfers:read, transfers:write, external_bank_accounts:read, external_bank_accounts:pii:read, external_bank_accounts:write, external_bank_accounts:execute, external_wallets:read, external_wallets:execute, workflows:read, workflows:execute, deposit_addresses:read, deposit_addresses:execute, deposit_bank_accounts:read, deposit_bank_accounts:execute, invoices:read, invoices:write, invoices:execute, identity_verifications:read, identity_verifications:pii:read, identity_verifications:write, identity_verifications:execute, persona_sessions:execute, files:read, files:pii:read, files:execute")
                else -> throw RuntimeException("auth name $authName not found in available auth names")
            }
            addAuthorization(authName, auth)
        }
    }

    constructor(
        baseUrl: String = defaultBasePath,
        okHttpClientBuilder: OkHttpClient.Builder? = null,
        serializerBuilder: GsonBuilder = Serializer.gsonBuilder,
        authName: String,
        bearerToken: String
    ) : this(baseUrl, okHttpClientBuilder, serializerBuilder, arrayOf(authName)) {
        setBearerToken(bearerToken)
    }

    constructor(
        baseUrl: String = defaultBasePath,
        okHttpClientBuilder: OkHttpClient.Builder? = null,
        serializerBuilder: GsonBuilder = Serializer.gsonBuilder,
        authName: String,
        clientId: String,
        secret: String,
        username: String,
        password: String
    ) : this(baseUrl, okHttpClientBuilder, serializerBuilder, arrayOf(authName)) {
        getTokenEndPoint()
            ?.setClientId(clientId)
            ?.setClientSecret(secret)
            ?.setUsername(username)
            ?.setPassword(password)
    }

    fun setCredentials(username: String, password: String): ApiClient {
        apiAuthorizations.values.runOnFirst<Interceptor, OAuth> {
            tokenRequestBuilder.setUsername(username).setPassword(password)
        }
        return this
    }
    fun setBearerToken(bearerToken: String): ApiClient {
        apiAuthorizations.values.runOnFirst<Interceptor, HttpBearerAuth> {
            this.bearerToken = bearerToken
        }
        return this
    }

    /**
    * Helper method to configure the token endpoint of the first oauth found in the apiAuthorizations (there should be only one)
    * @return Token request builder
    */
    fun getTokenEndPoint(): TokenRequestBuilder? {
        var result: TokenRequestBuilder? = null
        apiAuthorizations.values.runOnFirst<Interceptor, OAuth> {
            result = tokenRequestBuilder
        }
        return result
    }

    /**
    * Helper method to configure authorization endpoint of the first oauth found in the apiAuthorizations (there should be only one)
    * @return Authentication request builder
    */
    fun getAuthorizationEndPoint(): AuthenticationRequestBuilder? {
        var result: AuthenticationRequestBuilder? = null
        apiAuthorizations.values.runOnFirst<Interceptor, OAuth> {
            result = authenticationRequestBuilder
        }
        return result
    }

    /**
    * Helper method to pre-set the oauth access token of the first oauth found in the apiAuthorizations (there should be only one)
    * @param accessToken Access token
    * @return ApiClient
    */
    fun setAccessToken(accessToken: String): ApiClient {
        apiAuthorizations.values.runOnFirst<Interceptor, OAuth> {
            setAccessToken(accessToken)
        }
        return this
    }

    /**
    * Helper method to configure the oauth accessCode/implicit flow parameters
    * @param clientId Client ID
    * @param clientSecret Client secret
    * @param redirectURI Redirect URI
    * @return ApiClient
    */
    fun configureAuthorizationFlow(clientId: String, clientSecret: String, redirectURI: String): ApiClient {
        apiAuthorizations.values.runOnFirst<Interceptor, OAuth> {
            tokenRequestBuilder
                .setClientId(clientId)
                .setClientSecret(clientSecret)
                .setRedirectURI(redirectURI)
            authenticationRequestBuilder
                ?.setClientId(clientId)
                ?.setRedirectURI(redirectURI)
        }
        return this
    }

    /**
    * Configures a listener which is notified when a new access token is received.
    * @param accessTokenListener Access token listener
    * @return ApiClient
    */
    fun registerAccessTokenListener(accessTokenListener: AccessTokenListener): ApiClient {
        apiAuthorizations.values.runOnFirst<Interceptor, OAuth> {
            registerAccessTokenListener(accessTokenListener)
        }
        return this
    }

    /**
     * Adds an authorization to be used by the client
     * @param authName Authentication name
     * @param authorization Authorization interceptor
     * @return ApiClient
     */
    fun addAuthorization(authName: String, authorization: Interceptor): ApiClient {
        if (apiAuthorizations.containsKey(authName)) {
            throw RuntimeException("auth name $authName already in api authorizations")
        }
        apiAuthorizations[authName] = authorization
        clientBuilder.addInterceptor(authorization)
        return this
    }

    fun setLogger(logger: (String) -> Unit): ApiClient {
        this.logger = logger
        return this
    }

    fun <S> createService(serviceClass: Class<S>): S {
        val usedCallFactory = this.callFactory ?: clientBuilder.build()
        return retrofitBuilder.callFactory(usedCallFactory).build().create(serviceClass)
    }

    private fun normalizeBaseUrl() {
        if (!baseUrl.endsWith("/")) {
            baseUrl += "/"
        }
    }

    private inline fun <T, reified U> Iterable<T>.runOnFirst(callback: U.() -> Unit) {
        for (element in this) {
            if (element is U)  {
                callback.invoke(element)
                break
            }
        }
    }

    companion object {
        @JvmStatic
        protected val baseUrlKey = "app.cybrid.cybrid_api_bank.client.baseUrl"

        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(baseUrlKey, "https://bank.sandbox.cybrid.app")
        }
    }
}
