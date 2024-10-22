
# PostExternalBankAccountCounterpartyAddressBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street** | **kotlin.String** | The first line of the address. Required when account_kind is raw_routing_details and counterparty_guid is not present. |  [optional]
**street2** | **kotlin.String** | The optional second line of the address. Optional when account_kind is raw_routing_details and counterparty_guid is not present. |  [optional]
**city** | **kotlin.String** | The city of the address. Required when account_kind is raw_routing_details and counterparty_guid is not present. |  [optional]
**subdivision** | **kotlin.String** | The ISO 3166-2 subdivision code of the address. Applicable only for countries that use subnational states, provinces, lands, oblasts or regions. Optional when account_kind is raw_routing_details and counterparty_guid is not present. |  [optional]
**postalCode** | **kotlin.String** | The postal, zip or post code of the address. Applicable only for countries that use postal, zip or post codes. Optional when account_kind is raw_routing_details and counterparty_guid is not present. |  [optional]
**countryCode** | **kotlin.String** | The ISO 3166 country 2-Alpha country code of the address. Required when account_kind is raw_routing_details and counterparty_guid is not present. |  [optional]



