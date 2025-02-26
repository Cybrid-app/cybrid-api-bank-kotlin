
# PostFileBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of file. | 
**customerGuid** | **kotlin.String** | The customer identifier. | 
**filename** | **kotlin.String** | The name of the file. | 
**contentType** | [**inline**](#ContentType) | The content type of the file. | 
**&#x60;data&#x60;** | **kotlin.String** | Base64 encoded file content |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | drivers_license_front, drivers_license_back, passport, visa, identification_card, residence_card, selfie, selfie_video, selfie_left, selfie_right, utility_bill, bank_statement, property_tax, tax_document, ein_letter, incorporation_certificate


<a name="ContentType"></a>
## Enum: content_type
Name | Value
---- | -----
contentType | image/jpeg, image/png, application/pdf, video/mp4



