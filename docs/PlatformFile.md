
# PlatformFileBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | The unique identifier for the file. |  [optional]
**fileType** | [**inline**](#FileType) | The file type; one of drivers_license_front, drivers_license_back, passport, identification_card, residence_card, selfie, selfie_left, selfie_right, utility_bill, bank_statement, property_tax, tax_document, ein_letter, or incorporation_certificate. |  [optional]
**contentType** | [**inline**](#ContentType) | The media type; one of image/jpeg, image/png, or application/pdf. |  [optional]
**completedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The ISO8601 datetime the file was completed at. |  [optional]
**failedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The ISO8601 datetime the file failed at. |  [optional]
**state** | [**inline**](#State) | The state of the file. One of storing, completed, or failed. |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed files. |  [optional]


<a name="FileType"></a>
## Enum: file_type
Name | Value
---- | -----
fileType | drivers_license_front, drivers_license_back, passport, identification_card, residence_card, selfie, selfie_left, selfie_right, utility_bill, bank_statement, property_tax, tax_document, ein_letter, incorporation_certificate


<a name="ContentType"></a>
## Enum: content_type
Name | Value
---- | -----
contentType | image/jpeg, image/png, application/pdf


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, completed, failed



