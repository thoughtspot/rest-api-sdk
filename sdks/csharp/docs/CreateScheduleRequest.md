# ThoughtSpot.RestApi.Sdk.Model.CreateScheduleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the scheduled job. | 
**Description** | **string** | Description of the job. | 
**MetadataType** | **string** | Type of the metadata object. | 
**MetadataIdentifier** | **string** | Unique ID or name of the metadata object. | 
**FileFormat** | **string** | Export file format. | [optional] [default to FileFormatEnum.PDF]
**LiveboardOptions** | [**LiveboardOptionsInput**](LiveboardOptionsInput.md) | Options to specify details of Liveboard. | [optional] 
**PdfOptions** | [**SchedulesPdfOptionsInput**](SchedulesPdfOptionsInput.md) | PDF layout and orientation settings. Applicable only if the &#x60;file_format&#x60; is specified as &#x60;PDF&#x60;. | [optional] 
**VarTimeZone** | **string** | Time zone | [default to VarTimeZoneEnum.AmericaLosAngeles]
**Frequency** | [**FrequencyInput**](FrequencyInput.md) | Frequency settings for the scheduled job. | [optional] 
**RecipientDetails** | [**RecipientDetailsInput**](RecipientDetailsInput.md) | Recipients of the scheduled job notifications. Add the GUID or name of the ThoughtSpot users or groups as recipients in the &#x60;principals&#x60; array. If a recipient is not a ThoughtSpot user, specify email address. | 
**PersonalisedViewId** | **string** | Personalised view id of the liveboard to be scheduled. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

