
# PostFeeConfigurationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productType** | [**inline**](#ProductType) | The type of product being configured. | 
**asset** | **kotlin.String** | The asset code. | 
**fees** | [**kotlin.collections.List&lt;PostFeeBankModel&gt;**](PostFeeBankModel.md) | The fees associated with the configuration | 
**productProvider** | [**inline**](#ProductProvider) | The provider for the product being configured. |  [optional]


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



