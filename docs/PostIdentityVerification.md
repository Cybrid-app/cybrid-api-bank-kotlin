
# PostIdentityVerificationBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of identity verification. | 
**method** | [**inline**](#Method) | The identity verification method. | 
**customerGuid** | **kotlin.String** | The customer&#39;s identifier. |  [optional]
**countryCode** | **kotlin.String** | The ISO 3166 country 2-Alpha country the customer is being verified in; required when method is set to &#39;id_and_selfie&#39;. If not present, will default to the Bank&#39;s configured country code. |  [optional]
**name** | [**PostIdentityVerificationNameBankModel**](PostIdentityVerificationNameBankModel.md) |  |  [optional]
**address** | [**PostIdentityVerificationAddressBankModel**](PostIdentityVerificationAddressBankModel.md) |  |  [optional]
**dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) | The customer&#39;s date of birth; required when method is set to &#39;attested&#39;. |  [optional]
**phoneNumber** | **kotlin.String** | The customer&#39;s phone number. |  [optional]
**emailAddress** | **kotlin.String** | The customer&#39;s email address. |  [optional]
**identificationNumbers** | [**kotlin.collections.List&lt;PostIdentificationNumberBankModel&gt;**](PostIdentificationNumberBankModel.md) | The customer&#39;s identification numbers; required when method is set to &#39;attested&#39;. |  [optional]
**externalBankAccountGuid** | **kotlin.String** | The external bank account&#39;s identifier. Required for &#39;bank_account&#39; type. |  [optional]
**expectedBehaviours** | [**inline**](#kotlin.collections.List&lt;ExpectedBehaviours&gt;) | The optional expected behaviour to simulate. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | kyc, bank_account


<a name="Method"></a>
## Enum: method
Name | Value
---- | -----
method | business_registration, id_and_selfie, attested, plaid_identity_match


<a name="kotlin.collections.List<ExpectedBehaviours>"></a>
## Enum: expected_behaviours
Name | Value
---- | -----
expectedBehaviours | passed_immediately, failed_immediately, tax_id_not_checked



