# ThoughtSpot.Client.Model.SyncMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tables** | **Object** | Array of tables to sync. Each element can be: - String: Table identifier (GUID or name) to sync   all columns for that table. - Object: {tableId: [columnIds]} to sync specific   columns. If not provided, syncs all tables in the connection. | [optional] 
**SyncAttributes** | **List&lt;SyncMetadataRequest.SyncAttributesEnum&gt;** | List of sync_attributes to sync from CDW. The default value is DESCRIPTION. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

