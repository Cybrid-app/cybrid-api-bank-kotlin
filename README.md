# app.cybrid.cybrid_api_bank.client - Kotlin client library for Cybrid Bank API
# 
# Cybrid API documentation

Welcome to Cybrid, an all-in-one crypto platform that enables you to easily **build** and **launch** white-label crypto products or services.

In these documents, you'll find details on how our REST API operates and generally how our platform functions.

If you're looking for our UI SDK Widgets for Web or Mobile (iOS/Android), generated API clients, or demo applications, head over to our [Github repo](https://github.com/Cybrid-app).

💡 We recommend bookmarking the [Cybrid LinkTree](https://linktr.ee/cybridtechnologies) which contains many helpful links to platform resources.

## Getting Started

This is Cybrid's public interactive API documentation, which allows you to fully test our APIs. If you'd like to use a different tool to exercise our APIs, you can download the [Open API 3.0 yaml](https://bank.production.cybrid.app/api/schema/v1/swagger.yaml) for import.

If you're new to our APIs and the Cybrid Platform, follow the below guides to get set up and familiar with the platform:

1. [Introduction](https://docs.cybrid.xyz/docs/introduction)
2. [Platform Introduction](https://docs.cybrid.xyz/docs/how-is-cybrid-architected)
3. [Testing with Hosted Web Demo App](https://docs.cybrid.xyz/docs/testing-with-hosted-web-demo-app)

In [Getting Started in the Cybrid Sandbox](https://docs.cybrid.xyz/docs/how-do-i-get-started-with-the-sandbox), we walk you through how to use the [Cybrid Sandbox](https://id.sandbox.cybrid.app/) to create a test bank and generate API keys. In [Getting Ready for Trading](https://kb.cybrid.xyz/getting-ready-for-trading), we walk through creating customers, customer identities, accounts, as well as executing quotes and trades.

## Working with the Cybrid Platform

There are three primary ways you can interact with the Cybrid platform:

1. Directly via our RESTful API (this documentation)
2. Using our API clients available in a variety of languages ([Angular](https://github.com/Cybrid-app/cybrid-api-bank-angular), [Java](https://github.com/Cybrid-app/cybrid-api-bank-java), [Kotlin](https://github.com/Cybrid-app/cybrid-api-bank-kotlin), [Python](https://github.com/Cybrid-app/cybrid-api-bank-python), [Ruby](https://github.com/Cybrid-app/cybrid-api-bank-ruby), [Swift](https://github.com/Cybrid-app/cybrid-api-bank-swift) or [Typescript](https://github.com/Cybrid-app/cybrid-api-bank-typescript))
3. Integrating a platform specific SDK ([Web](https://github.com/Cybrid-app/cybrid-sdk-web), [Android](https://github.com/Cybrid-app/cybrid-sdk-android), [iOS](https://github.com/Cybrid-app/cybrid-sdk-ios))

Our complete set of APIs allows you to manage resources across three distinct areas: your `Organization`, your `Banks` and your `Identities`. For most of your testing and interaction you'll be using the `Bank` API, which is where the majority of APIs reside.

*The complete set of APIs can be found on the following pages:*

| API                                                              | Description                                                 |
|------------------------------------------------------------------|-------------------------------------------------------------|
| [Organization API](https://organization.production.cybrid.app/api/schema/swagger-ui)   | APIs to manage organizations                                |
| [Bank API](https://bank.production.cybrid.app/api/schema/swagger-ui)                   | APIs to manage banks (and all downstream customer activity) |
| [Identities API](https://id.production.cybrid.app/api/schema/swagger-ui)                       | APIs to manage organization and bank identities             |

For questions please contact [Support](mailto:support@cybrid.xyz) at any time for assistance, or contact the [Product Team](mailto:product@cybrid.xyz) for product suggestions.

## Authenticating with the API

The Cybrid Platform uses OAuth 2.0 Bearer Tokens to authenticate requests to the platform. Credentials to create `Organization` and `Bank` tokens can be generated via the [Cybrid Sandbox](https://id.production.cybrid.app). Access tokens can be generated for a `Customer` as well via the [Cybrid IdP](https://id.production.cybrid.app) as well.

An `Organization` access token applies broadly to the whole Organization and all of its `Banks`, whereas, a `Bank` access token is specific to an individual Bank. `Customer` tokens, similarly, are scoped to a specific customer in a bank.

Both `Organization` and `Bank` tokens can be created using the OAuth Client Credential Grant flow. Each Organization and Bank has its own unique `Client ID` and `Secret` that allows for machine-to-machine authentication.

A `Bank` can then generate `Customer` access tokens via API using our [Identities API](https://id.production.cybrid.app/api/schema/swagger-ui).

<font color=\"orange\">**⚠️ Never share your Client ID or Secret publicly or in your source code repository.**</font>

Your `Client ID` and `Secret` can be exchanged for a time-limited `Bearer Token` by interacting with the Cybrid Identity Provider or through interacting with the **Authorize** button in this document.

The following curl command can be used to quickly generate a `Bearer Token` for use in testing the API or demo applications.

```
# Example request when using Bank credentials
curl -X POST https://id.production.cybrid.app/oauth/token -d '{
    \"grant_type\": \"client_credentials\",
    \"client_id\": \"<Your Client ID>\",
    \"client_secret\": \"<Your Secret>\",
    \"scope\": \"banks:read banks:write bank_applications:execute accounts:read accounts:execute counterparties:read counterparties:pii:read counterparties:write counterparties:execute customers:read customers:pii:read customers:write customers:execute prices:read quotes:execute quotes:read trades:execute trades:read transfers:execute transfers:read transfers:write external_bank_accounts:read external_bank_accounts:pii:read external_bank_accounts:write external_bank_accounts:execute external_wallets:read external_wallets:execute workflows:read workflows:execute deposit_addresses:read deposit_addresses:execute deposit_bank_accounts:read deposit_bank_accounts:execute invoices:read invoices:write invoices:execute identity_verifications:read identity_verifications:pii:read identity_verifications:write identity_verifications:execute persona_sessions:execute files:read files:pii:read files:execute\"
  }' -H \"Content-Type: application/json\"

# When using Organization credentials set `scope` to 'organizations:read organizations:write organization_applications:execute banks:read banks:write banks:execute bank_applications:execute users:read users:execute counterparties:read counterparties:pii:read customers:read customers:pii:read accounts:read prices:read quotes:execute quotes:read trades:execute trades:read transfers:read transfers:write transfers:execute external_bank_accounts:read external_bank_accounts:pii:read external_wallets:read workflows:read deposit_addresses:read deposit_bank_accounts:read invoices:read subscriptions:read subscriptions:write subscriptions:execute subscription_events:read subscription_events:execute identity_verifications:read identity_verifications:pii:read identity_verifications:execute persona_sessions:execute files:read files:pii:read files:execute'
```
<font color=\"orange\">**⚠️ Note: The above curl will create a bearer token with full scope access. Delete scopes if you'd like to restrict access.**</font>

## Authentication Scopes

The Cybrid platform supports the use of scopes to control the level of access a token is limited to. Scopes do not grant access to resources; instead, they provide limits, in support of the least privilege principal.

The following scopes are available on the platform and can be requested when generating either an Organization, Bank or Customer token. Generally speaking, the _Read_ scope is required to read and list resources, the _Write_ scope is required to update a resource and the _Execute_ scope is required to create a resource.

| Resource              | Read scope (Token Type)                                    | Write scope (Token Type)                      | Execute scope (Token Type)                       |
|-----------------------|------------------------------------------------------------|-----------------------------------------------|--------------------------------------------------|
| Account               | accounts:read (Organization, Bank, Customer)               |                                               | accounts:execute (Bank, Customer)                |
| Bank                  | banks:read (Organization, Bank)                            | banks:write (Organization, Bank)              | banks:execute (Organization)                     |
| Customer              | customers:read (Organization, Bank, Customer)              | customers:write (Bank, Customer)              | customers:execute (Bank)                         |
| Counterparty          | counterparties:read (Organization, Bank, Customer)         | counterparties:write (Bank, Customer)         | counterparties:execute (Bank)                    |
| Deposit Address       | deposit_addresses:read (Organization, Bank, Customer)      | deposit_addresses:write (Bank, Customer)      | deposit_addresses:execute (Bank, Customer)       |
| External Bank Account | external_bank_accounts:read (Organization, Bank, Customer) | external_bank_accounts:write (Bank, Customer) | external_bank_accounts:execute (Bank, Customer)  |
| External Wallet       | external_wallet:read (Organization, Bank, Customer)        |                                               | external_wallet:execute (Bank, Customer)         |
| Organization          | organizations:read (Organization)                          | organizations:write (Organization)            |                                                  |
| User                  | users:read (Organization)                                  |                                               | users:execute (Organization)                     |
| Price                 | prices:read (Bank, Customer)                               |                                               |                                                  |
| Quote                 | quotes:read (Organization, Bank, Customer)                 |                                               | quotes:execute (Organization, Bank, Customer)    |
| Trade                 | trades:read (Organization, Bank, Customer)                 |                                               | trades:execute (Organization, Bank, Customer)    |
| Transfer              | transfers:read (Organization, Bank, Customer)              |                                               | transfers:execute (Organization, Bank, Customer) |
| Workflow              | workflows:read (Organization, Bank, Customer)              |                                               | workflows:execute (Bank, Customer)               |
| Invoice               | invoices:read (Organization, Bank, Customer)               | invoices:write (Bank, Customer)               | invoices:execute (Bank, Customer)                |

## Available Endpoints

The available APIs for the [Identity](https://id.production.cybrid.app/api/schema/swagger-ui), [Organization](https://organization.production.cybrid.app/api/schema/swagger-ui) and [Bank](https://bank.production.cybrid.app/api/schema/swagger-ui) API services are listed below:

| API Service  | Model                | API Endpoint Path              | Description                                                                                       |
|--------------|----------------------|--------------------------------|---------------------------------------------------------------------------------------------------|
| Identity     | Bank                 | /api/bank_applications         | Create and list banks                                                                             |
| Identity     | CustomerToken        | /api/customer_tokens           | Create customer JWT access tokens                                                                 |
| Identity     | Organization         | /api/organization_applications | Create and list organizations                                                                     |
| Identity     | Organization         | /api/users                     | Create and list organization users                                                                |
| Organization | Organization         | /api/organizations             | APIs to retrieve and update organization name                                                     |
| Bank         | Account              | /api/accounts                  | Create and list accounts, which hold a specific asset for a customers                             |
| Bank         | Asset                | /api/assets                    | Get a list of assets supported by the platform (ex: BTC, ETH)                                     |
| Bank         | Bank                 | /api/banks                     | Create, update and list banks, the parent to customers, accounts, etc                             |
| Bank         | Customer             | /api/customers                 | Create and list customers                                                                         |
| Bank         | Counterparty         | /api/counterparties            | Create and list counterparties                                                                    |
| Bank         | DepositAddress       | /api/deposit_addresses         | Create, get and list deposit addresses                                                            |
| Bank         | ExternalBankAccount  | /api/external_bank_accounts    | Create, get and list external bank accounts, which connect customer bank accounts to the platform |
| Bank         | ExternalWallet       | /api/external_wallets          | Create, get, list and delete external wallets, which connect customer wallets to the platform     |
| Bank         | IdentityVerification | /api/identity_verifications    | Create and list identity verifications, which are performed on customers for KYC                  |
| Bank         | Invoice              | /api/invoices                  | Create, get, cancel and list invoices                                                             |
| Bank         | PaymentInstruction   | /api/payment_instructions      | Create, get and list payment instructions for invoices                                            |
| Bank         | Price                | /api/prices                    | Get the current prices for assets on the platform                                                 |
| Bank         | Quote                | /api/quotes                    | Create and list quotes, which are required to execute trades                                      |
| Bank         | Symbol               | /api/symbols                   | Get a list of symbols supported for trade (ex: BTC-USD)                                           |
| Bank         | Trade                | /api/trades                    | Create and list trades, which buy or sell cryptocurrency                                          |
| Bank         | Transfer             | /api/transfers                 | Create, get and list transfers (e.g., funding, book)                                              |
| Bank         | Workflow             | /api/workflows                 | Create, get and list workflows                                                                    |

## Understanding Object Models & Endpoints

**Organizations**

An `Organization` is meant to represent the organization partnering with Cybrid to use our platform.

An `Organization` typically does not directly interact with `customers`. Instead, an Organization has one or more `banks`, which encompass the financial service offerings of the platform.

**Banks**

A `Bank` is owned by an `Organization` and can be thought of as an environment or container for `customers` and product offerings. Banks are created in either `Sandbox` or `Production` mode, where `Sandbox` is the environment that you would test, prototype and build in prior to moving to `Production`.

An `Organization` can have multiple `banks`, in either `Sandbox` or `Production` environments. A `Sandbox Bank` will be backed by stubbed data and process flows. For instance, funding source transfer processes as well as trades will be simulated rather than performed, however asset prices are representative of real-world values. You have an unlimited amount of simulated fiat currency for testing purposes.

**Customers**

`Customers` represent your banking users on the platform. At present, we offer support for `Individuals` as Customers.

`Customers` must be verified (i.e., KYC'd) in our system before they can play any part on the platform, which means they must have an associated and a passing `Identity Verification`. See the Identity Verifications section for more details on how a customer can be verified.

`Customers` must also have an `Account` to be able to transact, in the desired asset class. See the Accounts APIs for more details on setting up accounts for the customer.


## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://bank.sandbox.cybrid.app*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**createAccount**](docs/AccountsApi.md#createaccount) | **POST** api/accounts | Create Account
*AccountsApi* | [**getAccount**](docs/AccountsApi.md#getaccount) | **GET** api/accounts/{account_guid} | Get Account
*AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listaccounts) | **GET** api/accounts | List Accounts
*AssetsApi* | [**listAssets**](docs/AssetsApi.md#listassets) | **GET** api/assets | Get assets list
*BanksApi* | [**createBank**](docs/BanksApi.md#createbank) | **POST** api/banks | Create Bank
*BanksApi* | [**getBank**](docs/BanksApi.md#getbank) | **GET** api/banks/{bank_guid} | Get Bank
*BanksApi* | [**listBanks**](docs/BanksApi.md#listbanks) | **GET** api/banks | Get banks list
*BanksApi* | [**updateBank**](docs/BanksApi.md#updatebank) | **PATCH** api/banks/{bank_guid} | Patch Bank
*CounterpartiesApi* | [**createCounterparty**](docs/CounterpartiesApi.md#createcounterparty) | **POST** api/counterparties | Create Counterparty
*CounterpartiesApi* | [**getCounterparty**](docs/CounterpartiesApi.md#getcounterparty) | **GET** api/counterparties/{counterparty_guid} | Get Counterparty
*CounterpartiesApi* | [**listCounterparties**](docs/CounterpartiesApi.md#listcounterparties) | **GET** api/counterparties | Get counterparties list
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createcustomer) | **POST** api/customers | Create Customer
*CustomersApi* | [**getCustomer**](docs/CustomersApi.md#getcustomer) | **GET** api/customers/{customer_guid} | Get Customer
*CustomersApi* | [**listCustomers**](docs/CustomersApi.md#listcustomers) | **GET** api/customers | Get customers list
*CustomersApi* | [**updateCustomer**](docs/CustomersApi.md#updatecustomer) | **PATCH** api/customers/{customer_guid} | Patch Customer
*DepositAddressesApi* | [**createDepositAddress**](docs/DepositAddressesApi.md#createdepositaddress) | **POST** api/deposit_addresses | Create Deposit Address
*DepositAddressesApi* | [**getDepositAddress**](docs/DepositAddressesApi.md#getdepositaddress) | **GET** api/deposit_addresses/{deposit_address_guid} | Get Deposit Address
*DepositAddressesApi* | [**listDepositAddresses**](docs/DepositAddressesApi.md#listdepositaddresses) | **GET** api/deposit_addresses | List Deposit Addresses
*DepositBankAccountsApi* | [**createDepositBankAccount**](docs/DepositBankAccountsApi.md#createdepositbankaccount) | **POST** api/deposit_bank_accounts | Create Deposit Bank Account
*DepositBankAccountsApi* | [**getDepositBankAccount**](docs/DepositBankAccountsApi.md#getdepositbankaccount) | **GET** api/deposit_bank_accounts/{deposit_bank_account_guid} | Get Deposit Bank Account
*DepositBankAccountsApi* | [**listDepositBankAccounts**](docs/DepositBankAccountsApi.md#listdepositbankaccounts) | **GET** api/deposit_bank_accounts | List Deposit Bank Accounts
*ExternalBankAccountsApi* | [**createExternalBankAccount**](docs/ExternalBankAccountsApi.md#createexternalbankaccount) | **POST** api/external_bank_accounts | Create ExternalBankAccount
*ExternalBankAccountsApi* | [**deleteExternalBankAccount**](docs/ExternalBankAccountsApi.md#deleteexternalbankaccount) | **DELETE** api/external_bank_accounts/{external_bank_account_guid} | Delete External Bank Account
*ExternalBankAccountsApi* | [**getExternalBankAccount**](docs/ExternalBankAccountsApi.md#getexternalbankaccount) | **GET** api/external_bank_accounts/{external_bank_account_guid} | Get External Bank Account
*ExternalBankAccountsApi* | [**listExternalBankAccounts**](docs/ExternalBankAccountsApi.md#listexternalbankaccounts) | **GET** api/external_bank_accounts | Get external bank accounts list
*ExternalBankAccountsApi* | [**patchExternalBankAccount**](docs/ExternalBankAccountsApi.md#patchexternalbankaccount) | **PATCH** api/external_bank_accounts/{external_bank_account_guid} | Patch ExternalBankAccount
*ExternalWalletsApi* | [**createExternalWallet**](docs/ExternalWalletsApi.md#createexternalwallet) | **POST** api/external_wallets | Create ExternalWallet
*ExternalWalletsApi* | [**deleteExternalWallet**](docs/ExternalWalletsApi.md#deleteexternalwallet) | **DELETE** api/external_wallets/{external_wallet_guid} | Delete External Wallet
*ExternalWalletsApi* | [**getExternalWallet**](docs/ExternalWalletsApi.md#getexternalwallet) | **GET** api/external_wallets/{external_wallet_guid} | Get External Wallet
*ExternalWalletsApi* | [**listExternalWallets**](docs/ExternalWalletsApi.md#listexternalwallets) | **GET** api/external_wallets | Get external wallets list
*FilesApi* | [**createFile**](docs/FilesApi.md#createfile) | **POST** api/files | Create File
*FilesApi* | [**getFile**](docs/FilesApi.md#getfile) | **GET** api/files/{file_guid} | Get File
*FilesApi* | [**listFiles**](docs/FilesApi.md#listfiles) | **GET** api/files | List Files
*IdentityVerificationsApi* | [**createIdentityVerification**](docs/IdentityVerificationsApi.md#createidentityverification) | **POST** api/identity_verifications | Create Identity Verification
*IdentityVerificationsApi* | [**getIdentityVerification**](docs/IdentityVerificationsApi.md#getidentityverification) | **GET** api/identity_verifications/{identity_verification_guid} | Get Identity Verification
*IdentityVerificationsApi* | [**listIdentityVerifications**](docs/IdentityVerificationsApi.md#listidentityverifications) | **GET** api/identity_verifications | List Identity Verifications
*InvoicesApi* | [**cancelInvoice**](docs/InvoicesApi.md#cancelinvoice) | **DELETE** api/invoices/{invoice_guid} | Cancel Invoice
*InvoicesApi* | [**createInvoice**](docs/InvoicesApi.md#createinvoice) | **POST** api/invoices | Create Invoice
*InvoicesApi* | [**getInvoice**](docs/InvoicesApi.md#getinvoice) | **GET** api/invoices/{invoice_guid} | Get Invoice
*InvoicesApi* | [**listInvoices**](docs/InvoicesApi.md#listinvoices) | **GET** api/invoices | List Invoices
*PaymentInstructionsApi* | [**createPaymentInstruction**](docs/PaymentInstructionsApi.md#createpaymentinstruction) | **POST** api/payment_instructions | Create Payment Instruction
*PaymentInstructionsApi* | [**getPaymentInstruction**](docs/PaymentInstructionsApi.md#getpaymentinstruction) | **GET** api/payment_instructions/{payment_instruction_guid} | Get Payment Instruction
*PaymentInstructionsApi* | [**listPaymentInstructions**](docs/PaymentInstructionsApi.md#listpaymentinstructions) | **GET** api/payment_instructions | List Payment Instructions
*PersonaSessionsApi* | [**createPersonaSession**](docs/PersonaSessionsApi.md#createpersonasession) | **POST** api/persona_sessions | Create Persona Session
*PricesApi* | [**listPrices**](docs/PricesApi.md#listprices) | **GET** api/prices | Get Price
*QuotesApi* | [**createQuote**](docs/QuotesApi.md#createquote) | **POST** api/quotes | Create Quote
*QuotesApi* | [**getQuote**](docs/QuotesApi.md#getquote) | **GET** api/quotes/{quote_guid} | Get Quote
*QuotesApi* | [**listQuotes**](docs/QuotesApi.md#listquotes) | **GET** api/quotes | Get quotes list
*SymbolsApi* | [**listSymbols**](docs/SymbolsApi.md#listsymbols) | **GET** api/symbols | Get Symbols list
*TradesApi* | [**createTrade**](docs/TradesApi.md#createtrade) | **POST** api/trades | Create Trade
*TradesApi* | [**getTrade**](docs/TradesApi.md#gettrade) | **GET** api/trades/{trade_guid} | Get Trade
*TradesApi* | [**listTrades**](docs/TradesApi.md#listtrades) | **GET** api/trades | Get trades list
*TransfersApi* | [**createTransfer**](docs/TransfersApi.md#createtransfer) | **POST** api/transfers | Create Transfer
*TransfersApi* | [**getTransfer**](docs/TransfersApi.md#gettransfer) | **GET** api/transfers/{transfer_guid} | Get Transfer
*TransfersApi* | [**listTransfers**](docs/TransfersApi.md#listtransfers) | **GET** api/transfers | Get transfers list
*TransfersApi* | [**updateTransfer**](docs/TransfersApi.md#updatetransfer) | **PATCH** api/transfers/{transfer_guid} | Patch Transfer
*WorkflowsApi* | [**createWorkflow**](docs/WorkflowsApi.md#createworkflow) | **POST** api/workflows | Create Workflow
*WorkflowsApi* | [**getWorkflow**](docs/WorkflowsApi.md#getworkflow) | **GET** api/workflows/{workflow_guid} | Get Workflow
*WorkflowsApi* | [**listWorkflows**](docs/WorkflowsApi.md#listworkflows) | **GET** api/workflows | Get workflows list


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerAuth"></a>
### BearerAuth

- **Type**: HTTP basic authentication

<a name="oauth2"></a>
### oauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - banks:read: banks read
  - banks:write: banks write
  - bank_applications:execute: bank_applications execute
  - accounts:read: accounts read
  - accounts:execute: accounts execute
  - counterparties:read: counterparties read
  - counterparties:pii:read: counterparties pii read
  - counterparties:write: counterparties write
  - counterparties:execute: counterparties execute
  - customers:read: customers read
  - customers:pii:read: customers pii read
  - customers:write: customers write
  - customers:execute: customers execute
  - prices:read: prices read
  - quotes:execute: quotes execute
  - quotes:read: quotes read
  - trades:execute: trades execute
  - trades:read: trades read
  - transfers:execute: transfers execute
  - transfers:read: transfers read
  - transfers:write: transfers write
  - external_bank_accounts:read: external_bank_accounts read
  - external_bank_accounts:pii:read: external_bank_accounts pii read
  - external_bank_accounts:write: external_bank_accounts write
  - external_bank_accounts:execute: external_bank_accounts execute
  - external_wallets:read: external_wallets read
  - external_wallets:execute: external_wallets execute
  - workflows:read: workflows read
  - workflows:execute: workflows execute
  - deposit_addresses:read: deposit_addresses read
  - deposit_addresses:execute: deposit_addresses execute
  - deposit_bank_accounts:read: deposit_bank_accounts read
  - deposit_bank_accounts:execute: deposit_bank_accounts execute
  - invoices:read: invoices read
  - invoices:write: invoices write
  - invoices:execute: invoices execute
  - identity_verifications:read: identity_verifications read
  - identity_verifications:pii:read: identity_verifications pii read
  - identity_verifications:write: identity_verifications write
  - identity_verifications:execute: identity_verifications execute
  - persona_sessions:execute: persona_sessions execute
  - files:read: files read
  - files:pii:read: files pii read
  - files:execute: files execute

