
# PlatformFileBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | The unique identifier for the file. |  [optional]
**organizationGuid** | **kotlin.String** | The organization identifier. |  [optional]
**bankGuid** | **kotlin.String** | The bank identifier. |  [optional]
**customerGuid** | **kotlin.String** | The customer identifier. |  [optional]
**type** | **kotlin.String** | The file type; one of drivers_license_front, drivers_license_back, passport, passport_card, visa, identification_card, residence_card, selfie, selfie_video, selfie_left, selfie_right, utility_bill, proof_of_address, bank_statement, property_tax, tax_document, ein_letter, incorporation_certificate, persona_inquiry_report, or persona_inquiry_export. |  [optional]
**contentType** | **kotlin.String** | The media type; one of image/jpeg, image/png, application/pdf, application/json, or video/mp4. |  [optional]
**filename** | **kotlin.String** | The name of the file. |  [optional]
**completedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The ISO8601 datetime the file was completed at. |  [optional]
**failedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The ISO8601 datetime the file failed at. |  [optional]
**state** | [**inline**](#State) | The state of the file. One of storing, completed, or failed. |  [optional]
**failureCode** | **kotlin.String** | The failure code for failed files. |  [optional]
**uploadUrl** | [**java.net.URI**](java.net.URI.md) | The URL to upload the file to. |  [optional]
**uploadExpiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The ISO8601 datetime the upload URL expires at. |  [optional]
**downloadUrl** | [**java.net.URI**](java.net.URI.md) | The URL to download the file from. |  [optional]
**downloadExpiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The ISO8601 datetime the download URL expires at. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, completed, failed



