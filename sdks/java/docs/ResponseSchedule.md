

# ResponseSchedule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**author** | [**Author**](Author.md) |  |  |
|**creationTimeInMillis** | **Object** | Schedule creation time in milliseconds. |  |
|**description** | **String** | Description of the job. |  [optional] |
|**fileFormat** | **String** | Export file format. |  |
|**frequency** | [**Frequency**](Frequency.md) |  |  |
|**id** | **String** | GUID of the scheduled job. |  |
|**liveboardOptions** | [**LiveboardOptions**](LiveboardOptions.md) |  |  [optional] |
|**metadata** | [**MetadataResponse**](MetadataResponse.md) |  |  |
|**name** | **String** | Name of the scheduled job. |  |
|**pdfOptions** | [**PdfOptions**](PdfOptions.md) |  |  [optional] |
|**recipientDetails** | [**RecipientDetails**](RecipientDetails.md) |  |  |
|**status** | **String** | Status of the job |  [optional] |
|**timeZone** | **String** | Time zone |  |
|**historyRuns** | [**List&lt;ResponseScheduleRun&gt;**](ResponseScheduleRun.md) | Schedule runs history records. |  [optional] |



