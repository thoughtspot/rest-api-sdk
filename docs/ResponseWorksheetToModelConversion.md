# ThoughtSpot.Client.Model.ResponseWorksheetToModelConversion
Name of the conversion process, which involves converting worksheets to models.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** |  | 
**SuccessCount** | **int** | The number of worksheets successfully converted to models. | 
**FailureCount** | **int** | The number of worksheets that failed to convert. | 
**IncompleteCount** | **int** | The number of worksheets that were incomplete during the conversion process. | 
**PostUpgradeFailedCount** | **int** | The number of worksheets that failed after an upgrade during the conversion process. | 
**TotalTimeInMillis** | **int** | The total time taken to complete the conversion process in milliseconds. | 
**SuccessfulEntities** | [**ResponseSuccessfulEntities**](ResponseSuccessfulEntities.md) |  | 
**FailedEntities** | [**ResponseFailedEntities**](ResponseFailedEntities.md) |  | 
**IncompleteEntities** | [**ResponseIncompleteEntities**](ResponseIncompleteEntities.md) |  | 
**PostUpgradeFailedEntities** | [**ResponsePostUpgradeFailedEntities**](ResponsePostUpgradeFailedEntities.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

