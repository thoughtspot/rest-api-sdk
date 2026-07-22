# ThoughtSpot.RestApi.Sdk.Model.SyncMetadataResponse
Response from sync metadata operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **string** | Overall status of the sync operation. | [optional] 
**TablesUpdated** | **int?** | Number of tables with metadata updates. | [optional] 
**ColumnsUpdated** | **int?** | Number of columns with metadata updates. | [optional] 
**TablesFailed** | **int?** | Number of tables that failed to sync (for PARTIAL_SUCCESS). | [optional] 
**ColumnsFailed** | **int?** | Number of columns that failed to sync (for PARTIAL_SUCCESS). | [optional] 
**Message** | **string** | Message describing the result. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

