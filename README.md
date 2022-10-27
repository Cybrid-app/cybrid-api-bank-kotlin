# app.cybrid.cybrid_api_bank.client - Kotlin client library for Cybrid Bank API

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

All URIs are relative to *https://bank.demo.cybrid.app*

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
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createcustomer) | **POST** api/customers | Create Customer
*CustomersApi* | [**getCustomer**](docs/CustomersApi.md#getcustomer) | **GET** api/customers/{customer_guid} | Get Customer
*CustomersApi* | [**listCustomers**](docs/CustomersApi.md#listcustomers) | **GET** api/customers | Get customers list
*ExternalBankAccountsApi* | [**createExternalBankAccount**](docs/ExternalBankAccountsApi.md#createexternalbankaccount) | **POST** api/external_bank_accounts | Create ExternalBankAccount
*ExternalBankAccountsApi* | [**getExternalBankAccount**](docs/ExternalBankAccountsApi.md#getexternalbankaccount) | **GET** api/external_bank_accounts/{external_bank_account_guid} | Get External Bank Account
*ExternalBankAccountsApi* | [**listExternalBankAccounts**](docs/ExternalBankAccountsApi.md#listexternalbankaccounts) | **GET** api/external_bank_accounts | Get external bank accounts list
*FeeConfigurationsApi* | [**createFeeConfiguration**](docs/FeeConfigurationsApi.md#createfeeconfiguration) | **POST** api/fee_configurations | Create Fee Configuration
*FeeConfigurationsApi* | [**getFeeConfiguration**](docs/FeeConfigurationsApi.md#getfeeconfiguration) | **GET** api/fee_configurations/{fee_configuration_guid} | Get Fee Configuration
*FeeConfigurationsApi* | [**listFeeConfigurations**](docs/FeeConfigurationsApi.md#listfeeconfigurations) | **GET** api/fee_configurations | List Fee Configurations
*IdentityRecordsApi* | [**createIdentityRecord**](docs/IdentityRecordsApi.md#createidentityrecord) | **POST** api/identity_records | Create Identity Record
*IdentityRecordsApi* | [**getIdentityRecord**](docs/IdentityRecordsApi.md#getidentityrecord) | **GET** api/identity_records/{identity_record_guid} | Get Identity Record
*IdentityRecordsApi* | [**listIdentityRecords**](docs/IdentityRecordsApi.md#listidentityrecords) | **GET** api/identity_records | List Identity Records
*IdentityVerificationsApi* | [**createIdentityVerification**](docs/IdentityVerificationsApi.md#createidentityverification) | **POST** api/identity_verifications | Create Identity Verification
*IdentityVerificationsApi* | [**getIdentityVerification**](docs/IdentityVerificationsApi.md#getidentityverification) | **GET** api/identity_verifications/{identity_verification_guid} | Get Identity Verification
*IdentityVerificationsApi* | [**listIdentityVerifications**](docs/IdentityVerificationsApi.md#listidentityverifications) | **GET** api/identity_verifications | List Identity Verifications
*PricesApi* | [**listPrices**](docs/PricesApi.md#listprices) | **GET** api/prices | Get Price
*QuotesApi* | [**createQuote**](docs/QuotesApi.md#createquote) | **POST** api/quotes | Create Quote
*QuotesApi* | [**getQuote**](docs/QuotesApi.md#getquote) | **GET** api/quotes/{quote_guid} | Get Quote
*QuotesApi* | [**listQuotes**](docs/QuotesApi.md#listquotes) | **GET** api/quotes | Get quotes list
*RewardsApi* | [**createRewards**](docs/RewardsApi.md#createrewards) | **POST** api/rewards | Create Reward
*RewardsApi* | [**getReward**](docs/RewardsApi.md#getreward) | **GET** api/rewards/{reward_guid} | Get Reward
*RewardsApi* | [**listRewards**](docs/RewardsApi.md#listrewards) | **GET** api/rewards | Get rewards list
*SymbolsApi* | [**listSymbols**](docs/SymbolsApi.md#listsymbols) | **GET** api/symbols | Get Symbols list
*TradesApi* | [**createTrade**](docs/TradesApi.md#createtrade) | **POST** api/trades | Create Trade
*TradesApi* | [**getTrade**](docs/TradesApi.md#gettrade) | **GET** api/trades/{trade_guid} | Get Trade
*TradesApi* | [**listTrades**](docs/TradesApi.md#listtrades) | **GET** api/trades | Get trades list
*VerificationKeysApi* | [**createVerificationKey**](docs/VerificationKeysApi.md#createverificationkey) | **POST** api/bank_verification_keys | Create VerificationKey
*VerificationKeysApi* | [**getVerificationKey**](docs/VerificationKeysApi.md#getverificationkey) | **GET** api/bank_verification_keys/{verification_key_guid} | Get VerificationKey
*VerificationKeysApi* | [**listVerificationKeys**](docs/VerificationKeysApi.md#listverificationkeys) | **GET** api/bank_verification_keys | Get Verification Keys list
*WorkflowsApi* | [**createWorkflow**](docs/WorkflowsApi.md#createworkflow) | **POST** api/workflows | Create Workflow
*WorkflowsApi* | [**getWorkflow**](docs/WorkflowsApi.md#getworkflow) | **GET** api/workflows/{workflow_guid} | Get Workflow
*WorkflowsApi* | [**listWorkflows**](docs/WorkflowsApi.md#listworkflows) | **GET** api/workflows | Get workflows list


<a name="documentation-for-models"></a>
## Documentation for Models

 - [app.cybrid.cybrid_api_bank.client.models.AccountBankModel](docs/AccountBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.AccountListBankModel](docs/AccountListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.AssetBankModel](docs/AssetBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.AssetListBankModel](docs/AssetListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.AttestationDetailsBankModel](docs/AttestationDetailsBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.BankBankModel](docs/BankBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.BankListBankModel](docs/BankListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.CustomerBankModel](docs/CustomerBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.CustomerListBankModel](docs/CustomerListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.ErrorResponseBankModel](docs/ErrorResponseBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.ExternalBankAccountBankModel](docs/ExternalBankAccountBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.ExternalBankAccountListBankModel](docs/ExternalBankAccountListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.FeeBankModel](docs/FeeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.FeeConfigurationBankModel](docs/FeeConfigurationBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.FeeConfigurationListBankModel](docs/FeeConfigurationListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.IdentityRecordBankModel](docs/IdentityRecordBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.IdentityRecordListBankModel](docs/IdentityRecordListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.IdentityVerificationBankModel](docs/IdentityVerificationBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.IdentityVerificationListBankModel](docs/IdentityVerificationListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PatchBankBankModel](docs/PatchBankBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostAccountBankModel](docs/PostAccountBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostBankBankModel](docs/PostBankBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostCustomerBankModel](docs/PostCustomerBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostExternalBankAccountBankModel](docs/PostExternalBankAccountBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostFeeBankModel](docs/PostFeeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostFeeConfigurationBankModel](docs/PostFeeConfigurationBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostIdentityRecordAttestationDetailsBankModel](docs/PostIdentityRecordAttestationDetailsBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostIdentityRecordBankModel](docs/PostIdentityRecordBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostIdentityVerificationBankModel](docs/PostIdentityVerificationBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostQuoteBankModel](docs/PostQuoteBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostRewardBankModel](docs/PostRewardBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostTradeBankModel](docs/PostTradeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostVerificationKeyBankModel](docs/PostVerificationKeyBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostWorkflowBankModel](docs/PostWorkflowBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.QuoteBankModel](docs/QuoteBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.QuoteListBankModel](docs/QuoteListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.RewardBankModel](docs/RewardBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.RewardListBankModel](docs/RewardListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.SymbolPriceBankModel](docs/SymbolPriceBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.TradeBankModel](docs/TradeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.TradeListBankModel](docs/TradeListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.VerificationKeyBankModel](docs/VerificationKeyBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.VerificationKeyListBankModel](docs/VerificationKeyListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.WorkflowBankModel](docs/WorkflowBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.WorkflowWithDetailsAllOfBankModel](docs/WorkflowWithDetailsAllOfBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.WorkflowWithDetailsBankModel](docs/WorkflowWithDetailsBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.WorkflowsListBankModel](docs/WorkflowsListBankModel.md)


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
  - accounts:read: accounts read
  - accounts:execute: accounts execute
  - customers:read: customers read
  - customers:write: customers write
  - customers:execute: customers execute
  - prices:read: prices read
  - quotes:execute: quotes execute
  - quotes:read: quotes read
  - trades:execute: trades execute
  - trades:read: trades read
  - rewards:execute: rewards execute
  - rewards:read: rewards read
  - external_bank_accounts:read: external_bank_accounts read
  - external_bank_accounts:execute: external_bank_accounts execute
  - workflows:read: workflows read
  - workflows:execute: workflows execute

