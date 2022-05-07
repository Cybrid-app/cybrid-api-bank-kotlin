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
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createcustomer) | **POST** api/customers | Create Customer
*CustomersApi* | [**getCustomer**](docs/CustomersApi.md#getcustomer) | **GET** api/customers/{customer_guid} | Get Customer
*CustomersApi* | [**listCustomers**](docs/CustomersApi.md#listcustomers) | **GET** api/customers | Get customers list
*IdentityRecordsApi* | [**createIdentityRecord**](docs/IdentityRecordsApi.md#createidentityrecord) | **POST** api/identity_records | Create Identity Record
*IdentityRecordsApi* | [**getIdentityRecord**](docs/IdentityRecordsApi.md#getidentityrecord) | **GET** api/identity_records/{identity_record_guid} | Get Identity Record
*PricesApi* | [**listPrices**](docs/PricesApi.md#listprices) | **GET** api/prices | Get Price
*QuotesApi* | [**createQuote**](docs/QuotesApi.md#createquote) | **POST** api/quotes | Create Quote
*QuotesApi* | [**getQuote**](docs/QuotesApi.md#getquote) | **GET** api/quotes/{quote_guid} | Get Quote
*QuotesApi* | [**listQuotes**](docs/QuotesApi.md#listquotes) | **GET** api/quotes | Get quotes list
*SymbolsApi* | [**listSymbols**](docs/SymbolsApi.md#listsymbols) | **GET** api/symbols | Get Symbols list
*TradesApi* | [**createTrade**](docs/TradesApi.md#createtrade) | **POST** api/trades | Create Trade
*TradesApi* | [**getTrade**](docs/TradesApi.md#gettrade) | **GET** api/trades/{trade_guid} | Get Trade
*TradesApi* | [**listTrades**](docs/TradesApi.md#listtrades) | **GET** api/trades | Get trades list
*TradingConfigurationsApi* | [**createTradingConfiguration**](docs/TradingConfigurationsApi.md#createtradingconfiguration) | **POST** api/trading_configurations | Create TradingConfiguration
*TradingConfigurationsApi* | [**getTradingConfiguration**](docs/TradingConfigurationsApi.md#gettradingconfiguration) | **GET** api/trading_configurations/{trading_configuration_guid} | Get TradingConfiguration
*TradingConfigurationsApi* | [**listTradingConfigurations**](docs/TradingConfigurationsApi.md#listtradingconfigurations) | **GET** api/trading_configurations | List trading configurations
*VerificationKeysApi* | [**createVerificationKey**](docs/VerificationKeysApi.md#createverificationkey) | **POST** api/banks/{bank_guid}/verification_keys | Create VerificationKey
*VerificationKeysApi* | [**getVerificationKey**](docs/VerificationKeysApi.md#getverificationkey) | **GET** api/banks/{bank_guid}/verification_keys/{verification_key_guid} | Get VerificationKey
*VerificationKeysApi* | [**listVerificationKeys**](docs/VerificationKeysApi.md#listverificationkeys) | **GET** api/banks/{bank_guid}/verification_keys | Get Verification Keys list


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
 - [app.cybrid.cybrid_api_bank.client.models.ExchangeAccountBankModel](docs/ExchangeAccountBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.ExchangeBankModel](docs/ExchangeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.FeeBankModel](docs/FeeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.IdentityRecordBankModel](docs/IdentityRecordBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostAccountBankModel](docs/PostAccountBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostBankBankModel](docs/PostBankBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostCustomerBankModel](docs/PostCustomerBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostFeeBankModel](docs/PostFeeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostIdentityRecordAttestationDetailsBankModel](docs/PostIdentityRecordAttestationDetailsBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostIdentityRecordBankModel](docs/PostIdentityRecordBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostQuoteBankModel](docs/PostQuoteBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostTradeBankModel](docs/PostTradeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostTradingConfigurationBankModel](docs/PostTradingConfigurationBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.PostVerificationKeyBankModel](docs/PostVerificationKeyBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.QuoteBankModel](docs/QuoteBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.QuoteListBankModel](docs/QuoteListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.SymbolPriceBankModel](docs/SymbolPriceBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.SystemAccountBankModel](docs/SystemAccountBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.TradeBankModel](docs/TradeBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.TradeListBankModel](docs/TradeListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.TradingConfigurationBankModel](docs/TradingConfigurationBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.TradingConfigurationListBankModel](docs/TradingConfigurationListBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.VerificationKeyBankModel](docs/VerificationKeyBankModel.md)
 - [app.cybrid.cybrid_api_bank.client.models.VerificationKeyListBankModel](docs/VerificationKeyListBankModel.md)


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

