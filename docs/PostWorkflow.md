
# PostWorkflowBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The workflow type. | 
**kind** | [**inline**](#Kind) | The Plaid workflow kind. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier associated with the workflow. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The external bank account identifier associated with the workflow. |  [optional]
**language** | [**inline**](#Language) | The language to initialize Plaid link. |  [optional]
**linkCustomizationName** | **kotlin.String** | The customization name for Plaid link. Currently only supports the value \&quot;default\&quot;. |  [optional]
**redirectUri** | **kotlin.String** | The redirect URI for Plaid link. |  [optional]
**androidPackageName** | **kotlin.String** | The Android package name for Plaid link. |  [optional]


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



