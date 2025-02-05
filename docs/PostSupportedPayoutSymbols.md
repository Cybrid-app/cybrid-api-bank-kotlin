
# PostSupportedPayoutSymbolsBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryAsset** | **kotlin.String** | The primary asset of the payout symbol, e.g., MXN. | 
**counterAsset** | **kotlin.String** | The counter asset of the payout symbol, e.g., USD. | 
**countryCode** | **kotlin.String** | The ISO 3166 country 2-Alpha country code is permitted in, e.g., MX. | 
**participantsType** | [**inline**](#ParticipantsType) | The participants the symbol is permitted for. | 
**route** | [**inline**](#Route) | The route the symbol is permitted for. | 


<a name="ParticipantsType"></a>
## Enum: participants_type
Name | Value
---- | -----
participantsType | C2C, C2B, B2C, B2B


<a name="Route"></a>
## Enum: route
Name | Value
---- | -----
route | bank_account, mobile_wallet



