# ThoughtSpot.RestApi.Sdk.Model.CollectionDeleteResponse
Response object for delete collection operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataDeleted** | [**List&lt;CollectionDeleteTypeIdentifiers&gt;**](CollectionDeleteTypeIdentifiers.md) | List of metadata objects that were successfully deleted. | [optional] 
**MetadataSkipped** | [**List&lt;CollectionDeleteTypeIdentifiers&gt;**](CollectionDeleteTypeIdentifiers.md) | List of metadata objects that were skipped during deletion. Objects may be skipped due to lack of permissions, dependencies, or other constraints. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

