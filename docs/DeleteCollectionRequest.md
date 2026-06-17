# ThoughtSpot.Client.Model.DeleteCollectionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CollectionIdentifiers** | **List&lt;string&gt;** | Unique GUIDs of collections to delete. Note: Collection names cannot be used as identifiers since duplicate names are allowed. | 
**DeleteChildren** | **bool?** | Flag to delete child objects of the collection that the user has access to. | [optional] [default to false]
**DryRun** | **bool?** | Preview deletion without actually deleting. When set to true, returns what would be deleted without performing the actual deletion. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

