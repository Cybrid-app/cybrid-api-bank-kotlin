
# PostIdentityVerificationAddressBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street** | **kotlin.String** | The first line of the address. Required when type is kyc and method is attested, type is bank_account and method is attested, or type is bank_account and method is attested_ownership. |  [optional]
**street2** | **kotlin.String** | The optional second line of the address. Optional when type is kyc and method is attested, type is bank_account and method is attested, or type is bank_account and method is attested_ownership. |  [optional]
**city** | **kotlin.String** | The city of the address. Required when type is kyc and method is attested, type is bank_account and method is attested, or type is bank_account and method is attested_ownership. |  [optional]
**subdivision** | **kotlin.String** | The ISO 3166-2 subdivision code of the address; not used by all countries. Optional when type is kyc and method is attested, type is bank_account and method is attested, or type is bank_account and method is attested_ownership. |  [optional]
**postalCode** | **kotlin.String** | The postal/post/zip code of the address; not used by all countries. Optional when type is kyc and method is attested, type is bank_account and method is attested, or type is bank_account and method is attested_ownership. |  [optional]
**countryCode** | **kotlin.String** | The ISO 3166 country 2-Alpha country code of the address. Required when type is kyc and method is attested, type is bank_account and method is attested, or type is bank_account and method is attested_ownership. |  [optional]



