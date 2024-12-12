
# PostIdentityVerificationNameBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first** | **kotlin.String** | The customer&#39;s first name. Required when type is kyc and method is attested. Optional when type is bank_account and method is attested_ownership. |  [optional]
**middle** | **kotlin.String** | The customer&#39;s middle name. Optional when type is kyc and method is attested or type is bank_account and method is attested_ownership. |  [optional]
**last** | **kotlin.String** | The customer&#39;s last name. Required when type is kyc and method is attested. Optional when type is bank_account and method is attested_ownership. |  [optional]
**full** | **kotlin.String** | The customer&#39;s full name. Required when type is bank_account and method is attested_ownership. Optional when type is kyc and method is attested. |  [optional]



