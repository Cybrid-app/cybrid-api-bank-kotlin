
# PostIdentityVerificationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of identity verification. | 
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. |  [optional]
**expectedBehaviours** | [**inline**](#kotlin.collections.List&lt;ExpectedBehaviours&gt;) | The optional expected behaviour to simulate. |  [optional]
**method** | [**inline**](#Method) | The identity verification method. Required when type is counterparty, type is kyc, or type is bank_account. |  [optional]
**counterpartyGuid** | **kotlin.String** | The counterparty&#39;s identifier. Required when type is counterparty. |  [optional]
**countryCode** | **kotlin.String** | The ISO 3166 country 2-Alpha country the customer is being verified in. If not present, will default to the Bank&#39;s configured country code. Optional when type is kyc and method is id_and_selfie, type is kyc and method is tax_id_and_selfie, or type is kyc and method is business_registration. |  [optional]
**name** | [**PostIdentityVerificationNameBankModel**](PostIdentityVerificationNameBankModel.md) |  |  [optional]
**address** | [**PostIdentityVerificationAddressBankModel**](PostIdentityVerificationAddressBankModel.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s date of birth. Required when type is kyc and method is attested. |  [optional]
**identificationNumbers** | [**kotlin.collections.List&lt;PostIdentificationNumberBankModel&gt;**](PostIdentificationNumberBankModel.md) | The customer&#39;s identification numbers. Required when type is kyc and method is attested. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The external bank account&#39;s identifier. Required when type is bank_account. |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. Optional when type is bank_account and method is attested_ownership. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s email address. Optional when type is bank_account and method is attested_ownership. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | kyc, bank_account, counterparty


<a name="kotlin.collections.List<ExpectedBehaviours>"></a>
## Enum: expected_behaviours
Name | Value
---- | -----
expectedBehaviours | passed_immediately, failed_immediately, tax_id_not_checked


<a name="Method"></a>
## Enum: method
Name | Value
---- | -----
method | watchlists, attested, document_submission, id_and_selfie, tax_id_and_selfie, business_registration, attested_ownership, account_ownership



