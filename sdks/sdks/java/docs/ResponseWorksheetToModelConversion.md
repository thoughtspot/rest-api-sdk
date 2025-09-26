

# ResponseWorksheetToModelConversion

Name of the conversion process, which involves converting worksheets to models.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**successCount** | **Integer** | The number of worksheets successfully converted to models. |  |
|**failureCount** | **Integer** | The number of worksheets that failed to convert. |  |
|**incompleteCount** | **Integer** | The number of worksheets that were incomplete during the conversion process. |  |
|**postUpgradeFailedCount** | **Integer** | The number of worksheets that failed after an upgrade during the conversion process. |  |
|**totalTimeInMillis** | **Integer** | The total time taken to complete the conversion process in milliseconds. |  |
|**successfulEntities** | [**ResponseSuccessfulEntities**](ResponseSuccessfulEntities.md) |  |  |
|**failedEntities** | [**ResponseFailedEntities**](ResponseFailedEntities.md) |  |  |
|**incompleteEntities** | [**ResponseIncompleteEntities**](ResponseIncompleteEntities.md) |  |  |
|**postUpgradeFailedEntities** | [**ResponsePostUpgradeFailedEntities**](ResponsePostUpgradeFailedEntities.md) |  |  |


## Implemented Interfaces

* Serializable


