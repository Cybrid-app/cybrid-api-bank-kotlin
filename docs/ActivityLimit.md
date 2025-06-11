
# ActivityLimitBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **kotlin.String** | The type of the limit; one of rolling, daily, weekly, or monthly. |  [optional]
**name** | **kotlin.String** | The name of the limit. |  [optional]
**asset** | **kotlin.String** | The asset code for the limit. |  [optional]
**amount** | **java.math.BigDecimal** | The limit amount for the asset. |  [optional]
**interval** | **java.math.BigDecimal** | The limit interval in seconds for the asset. |  [optional]
**activities** | **kotlin.collections.List&lt;kotlin.String&gt;** | The activities associated with the limit. |  [optional]
**sides** | **kotlin.collections.List&lt;kotlin.String&gt;** | The sides associated with the limit. |  [optional]



