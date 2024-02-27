
# PostFeeBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The fee&#39;s type | 
**spreadFee** | **java.math.BigDecimal** | The percentage amount, in basis points, to apply when charging a fee. |  [optional]
**fixedFee** | **java.math.BigDecimal** | The fixed amount to apply when charging a fee; for trades, the fiat asset is used. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | spread, fixed



