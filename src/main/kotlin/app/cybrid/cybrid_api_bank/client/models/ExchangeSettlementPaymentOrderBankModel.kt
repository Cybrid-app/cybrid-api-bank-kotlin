/**
 * Cybrid Bank API
 *
 * # Welcome  Welcome to the Cybrid platform; enabling turnkey crypto banking services!  In these documents, you will find information on the operations provided by our platform, as well as details on how our REST API operates more generally.  Our complete set of APIs allows you to manage all your resources: your Organization, your banks and your identities. The complete set of APIs can be found on the following pages:  | API                                                            | Description                  | |----------------------------------------------------------------|------------------------------| | [Organization API](https://organization.demo.cybrid.app/api/schema/swagger-ui) | APIs to manage organizations | | [Bank API](https://bank.demo.cybrid.app/api/schema/swagger-ui)                 | APIs to manage banks         | | [Identities API](https://id.demo.cybrid.app/api/schema/swagger-ui)                     | APIs to manage identities    |  When you're ready, [request access](https://www.cybrid.xyz/access) to your Dashboard to view and administer your Organization. Once you've logged in, you can begin creating Banks, either for sandbox or production usage, and start enabling your customers to leverage DeFi and web3 with confidence.  If you have any questions, please contact [Support](mailto:support@cybrid.app) at any time so that we can help.  ## Authentication  The Cybrid Platform uses OAuth 2.0 Bearer Tokens to authenticate requests to the platform. Credentials to create Organization and Bank tokens can be generated via your Dashboard ([request access](https://www.cybrid.xyz/access)).  An Organization Token applies broadly to the whole Organization and all of its Banks, whereas, a Bank Token is specific to an individual Bank.  Both Organization and Bank tokens can be created using the OAuth Client Credential Grant flow. Each Organization and Bank has its own unique Client ID and Secret that allows for machine-to-machine authentication.  **Never share your Client ID or Secret publicly or in your source code repository**  Your Client ID and Secret can be exchanged for a time-limited Bearer Token by interacting with the Cybrid Identity Provider or through interacting with the **Authorize** button in this document:  ``` curl -X POST https://id.demo.cybrid.app/oauth/token -d '{     \"grant_type\": \"client_credentials\",     \"client_id\": \"<Your Client ID>\",     \"client_secret\": \"<Your Secret>\",     \"scope\": \"<Your requested scopes -- space separated>\"   }' -H \"Content-Type: application/json\" ```  ## Scopes  The Cybrid platform supports the use of scopes to control the level of access a token is limited to. Scopes do not grant access to resources; instead, they provide limits, in support of the least privilege principal.  The following scopes are available on the platform and can be requested when generating either an Organization or a Bank token. Generally speaking, the _Read_ scope is required to read and list resources, the _Write_ scope is required to update a resource and the _Execute_ scope is required to create a resource.  | Resource      | Read scope         | Write scope          | Execute scope     | Token Type         | |---------------|--------------------|----------------------|-------------------|--------------------| | Organizations | organizations:read | organizations:write  |                   | Organization/ Bank | | Banks         | banks:read         | banks:write          | banks:execute     | Organization/ Bank | | Customers     | customers:read     | customers:write      | customers:execute | Bank               | | Assets        | prices:read        |                      |                   | Bank               | | Accounts      | accounts:read      |                      | accounts:execute  | Bank               | | Prices        | prices:read        |                      |                   | Bank               | | Symbols       | prices:read        |                      |                   | Bank               | | Quotes        | quotes:read        |                      | quotes:execute    | Bank               | | Trades        | trades:read        |                      | trades:execute    | Bank               |  ## Organizations  An Organization is meant to model the organization partnering with Cybrid to use our platform.  An Organization does not directly interact with customers. Instead, an Organization has one or more banks, which encompass the financial service offerings of the platform.  ## Banks  A Bank is owned by an Organization and can be thought of as an environment or container for Customers and product offerings. An example of a Bank would be your customer facing banking website, or an internal staging environment for testing and integration.  An Organization can have multiple banks, in sandbox or production environments. A sandbox Bank will be backed by stubbed data and process flows. For instance, identity record and funding source processes will be simulated rather than performed.  ## Customers  Customers represent your banking users on the platform. At present, we offer support for Individuals as Customers.  Customers must be verified in our system before they can play any part on the platform. See the Identity Records section for more details on how a customer can be verified.  Customers must also have an account to be able to transact. See the Accounts APIs for more details on setting up accounts for the customer. 
 *
 * The version of the OpenAPI document: v0.30.40
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

package app.cybrid.cybrid_api_bank.client.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param guid Auto-generated unique identifier for the exchange settlement payment order.
 * @param exchangeSettlementObligationGuid The identifier of the exchange settlement obligation that this payment is associated with.
 * @param sequenceNumber The sequence number of the payment order
 * @param paymentAmount The amount expected to be received as part of this payment.
 * @param internalAccountGuid The identifier of the internal account that is expected to originate the payment.
 * @param internalAccountType The type of the internal account that is expected to originate the payment.
 * @param externalAccountGuid The identifier of the external account that is expected to receive the payment.
 * @param externalAccountType The type of the external account that is expected to receive the payment.
 * @param state The exchange settlement payment order's state
 * @param createdAt ISO8601 datetime the exchange settlement payment order was created at.
 */

data class ExchangeSettlementPaymentOrderBankModel (

    /* Auto-generated unique identifier for the exchange settlement payment order. */
    @SerializedName("guid")
    val guid: kotlin.String? = null,

    /* The identifier of the exchange settlement obligation that this payment is associated with. */
    @SerializedName("exchange_settlement_obligation_guid")
    val exchangeSettlementObligationGuid: kotlin.String? = null,

    /* The sequence number of the payment order */
    @SerializedName("sequence_number")
    val sequenceNumber: java.math.BigDecimal? = null,

    /* The amount expected to be received as part of this payment. */
    @SerializedName("payment_amount")
    val paymentAmount: java.math.BigDecimal? = null,

    /* The identifier of the internal account that is expected to originate the payment. */
    @SerializedName("internal_account_guid")
    val internalAccountGuid: kotlin.String? = null,

    /* The type of the internal account that is expected to originate the payment. */
    @SerializedName("internal_account_type")
    val internalAccountType: ExchangeSettlementPaymentOrderBankModel.InternalAccountType? = null,

    /* The identifier of the external account that is expected to receive the payment. */
    @SerializedName("external_account_guid")
    val externalAccountGuid: kotlin.String? = null,

    /* The type of the external account that is expected to receive the payment. */
    @SerializedName("external_account_type")
    val externalAccountType: ExchangeSettlementPaymentOrderBankModel.ExternalAccountType? = null,

    /* The exchange settlement payment order's state */
    @SerializedName("state")
    val state: ExchangeSettlementPaymentOrderBankModel.State? = null,

    /* ISO8601 datetime the exchange settlement payment order was created at. */
    @SerializedName("created_at")
    val createdAt: java.time.OffsetDateTime? = null

) {

    /**
     * The type of the internal account that is expected to originate the payment.
     *
     * Values: wallet,bankAccount
     */
    enum class InternalAccountType(val value: kotlin.String) {
        @SerializedName(value = "internal_wallet") wallet("internal_wallet"),
        @SerializedName(value = "internal_bank_account") bankAccount("internal_bank_account");
    }
    /**
     * The type of the external account that is expected to receive the payment.
     *
     * Values: wallet,bankAccount
     */
    enum class ExternalAccountType(val value: kotlin.String) {
        @SerializedName(value = "external_wallet") wallet("external_wallet"),
        @SerializedName(value = "external_bank_account") bankAccount("external_bank_account");
    }
    /**
     * The exchange settlement payment order's state
     *
     * Values: storing,pendingCreated,pendingPrincipalReserved,pendingTransactionsClaimed,notApproved,inProgress,notOwing,amountIncorrect,invalidPrincipal,nsf,sent,rejected
     */
    enum class State(val value: kotlin.String) {
        @SerializedName(value = "storing") storing("storing"),
        @SerializedName(value = "pending__created") pendingCreated("pending__created"),
        @SerializedName(value = "pending__principal_reserved") pendingPrincipalReserved("pending__principal_reserved"),
        @SerializedName(value = "pending__transactions_claimed") pendingTransactionsClaimed("pending__transactions_claimed"),
        @SerializedName(value = "not_approved") notApproved("not_approved"),
        @SerializedName(value = "in_progress") inProgress("in_progress"),
        @SerializedName(value = "not_owing") notOwing("not_owing"),
        @SerializedName(value = "amount_incorrect") amountIncorrect("amount_incorrect"),
        @SerializedName(value = "invalid_principal") invalidPrincipal("invalid_principal"),
        @SerializedName(value = "nsf") nsf("nsf"),
        @SerializedName(value = "sent") sent("sent"),
        @SerializedName(value = "rejected") rejected("rejected");
    }
}
