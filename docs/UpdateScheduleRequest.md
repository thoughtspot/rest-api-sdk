# ThoughtSpot.Client.Model.UpdateScheduleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the scheduled job. | [optional] 
**Description** | **string** | Description of the scheduled job. | [optional] 
**MetadataType** | **string** | Type of metadata object. | [optional] 
**MetadataIdentifier** | **string** | Unique ID or name of the metadata object. | [optional] 
**FileFormat** | **string** | Export file format. | [optional] 
**LiveboardOptions** | [**LiveboardOptionsInput**](LiveboardOptionsInput.md) | Options to specify the details of a Liveboard. | [optional] 
**PdfOptions** | [**SchedulesPdfOptionsInput**](SchedulesPdfOptionsInput.md) | Options for PDF export. | [optional] 
**VarTimeZone** | **string** | Time zone | [optional] 
**Frequency** | [**FrequencyInput**](FrequencyInput.md) | Frequency of the scheduled job run. | [optional] 
**RecipientDetails** | [**RecipientDetailsInput**](RecipientDetailsInput.md) | Recipients of the scheduled job notifications. You can add the ID or name of the ThoughtSpot users or groups as recipients in the &#x60;principals&#x60; array. If a recipient is not a ThoughtSpot user, specify email address. | [optional] 
**Status** | **string** | Status of the schedule | [optional] 
**PersonalisedViewId** | **string** | Personalised view id of the liveboard to be scheduled. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

