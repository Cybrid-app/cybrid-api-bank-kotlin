
# FeeConfigurationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the exchange. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier. |  [optional]
**productType** | [**inline**](#ProductType) | The type of product being configured. |  [optional]
**asset** | **kotlin.String** | The asset code. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the bank was created at. |  [optional]
**productProvider** | [**inline**](#ProductProvider) | The provider for the product being configured. |  [optional]
**fees** | [**kotlin.collections.List&lt;FeeBankModel&gt;**](FeeBankModel.md) | The fees associated with the configuration |  [optional]


<a name="ProductType"></a>
## Enum: product_type
Name | Value
---- | -----
productType | trading, savings


<a name="ProductProvider"></a>
## Enum: product_provider
Name | Value
---- | -----
productProvider | compound



