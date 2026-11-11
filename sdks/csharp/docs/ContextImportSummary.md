# ThoughtSpot.RestApi.Sdk.Model.ContextImportSummary
What an import changes for one owner, or would change in a dry run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scope** | [**ContextScope**](ContextScope.md) |  | [optional] 
**ExistingRecordCount** | **int?** | Number of entities with this owner in this environment before the import. | [optional] 
**DeletedRecordCount** | **int?** | Number of entities deleted, or to be deleted in a dry run. | [optional] 
**InsertedRecordCount** | **int?** | Number of entities inserted from the file, or to be inserted in a dry run. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

