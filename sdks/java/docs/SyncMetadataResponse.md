

# SyncMetadataResponse

Response from sync metadata operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Overall status of the sync operation. |  [optional] |
|**tablesUpdated** | **Integer** | Number of tables with metadata updates. |  [optional] |
|**columnsUpdated** | **Integer** | Number of columns with metadata updates. |  [optional] |
|**tablesFailed** | **Integer** | Number of tables that failed to sync (for PARTIAL_SUCCESS). |  [optional] |
|**columnsFailed** | **Integer** | Number of columns that failed to sync (for PARTIAL_SUCCESS). |  [optional] |
|**message** | **String** | Message describing the result. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| PARTIAL_SUCCESS | &quot;PARTIAL_SUCCESS&quot; |
| NO_UPDATE | &quot;NO_UPDATE&quot; |


## Implemented Interfaces

* Serializable


