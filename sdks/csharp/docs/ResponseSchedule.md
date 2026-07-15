# ThoughtSpot.RestApi.Sdk.Model.ResponseSchedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Author** | [**Author**](Author.md) |  | 
**CreationTimeInMillis** | **Object** | Schedule creation time in milliseconds. | 
**Description** | **string** | Description of the job. | [optional] 
**FileFormat** | **string** | Export file format. | 
**Frequency** | [**Frequency**](Frequency.md) |  | 
**Id** | **string** | GUID of the scheduled job. | 
**LiveboardOptions** | [**LiveboardOptions**](LiveboardOptions.md) |  | [optional] 
**Metadata** | [**MetadataResponse**](MetadataResponse.md) |  | 
**Name** | **string** | Name of the scheduled job. | 
**PdfOptions** | [**PdfOptions**](PdfOptions.md) |  | [optional] 
**RecipientDetails** | [**RecipientDetails**](RecipientDetails.md) |  | 
**Status** | **string** | Status of the job | [optional] 
**VarTimeZone** | **string** | Time zone | 
**HistoryRuns** | [**List&lt;ResponseScheduleRun&gt;**](ResponseScheduleRun.md) | Schedule runs history records. | [optional] 
**PersonalisedViewId** | **string** | Personalised view id of the liveboard to be scheduled. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

