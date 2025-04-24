
# IdentityVerificationDocumentBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the document. |  [optional]
**type** | **kotlin.String** | The document type; one of drivers_license, passport, passport_card, residence_card, visa, social_security_number, tax_identification_number, selfie, proof_of_address, formation_document, or employer_identification_number. |  [optional]
**validated** | **kotlin.Boolean** | Whether the document has been validated. |  [optional]
**expirationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The document expiration date. |  [optional]
**files** | [**kotlin.collections.List&lt;PlatformFileBankModel&gt;**](PlatformFileBankModel.md) | The files associated with the document. |  [optional]



