
# PostWorkflowBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The workflow type. | 
**kind** | [**inline**](#Kind) | The Plaid workflow kind. Required when type is plaid. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier associated with the workflow. Optional when type is plaid and kind is link_token_create. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The external bank account identifier associated with the workflow. Required when type is plaid and kind is link_token_update. |  [optional]
**language** | [**inline**](#Language) | The language to initialize Plaid link. Required when type is plaid. |  [optional]
**linkCustomizationName** | **kotlin.String** | The customization name for Plaid link. Currently only supports the value \&quot;default\&quot;. Required when type is plaid. |  [optional]
**redirectUri** | **kotlin.String** | The redirect URI for Plaid link. Optional when type is plaid. |  [optional]
**androidPackageName** | **kotlin.String** | The Android package name for Plaid link. Optional when type is plaid. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | plaid


<a name="Kind"></a>
## Enum: kind
Name | Value
---- | -----
kind | link_token_create, link_token_update


<a name="Language"></a>
## Enum: language
Name | Value
---- | -----
language | en, fr, es, nl, de



