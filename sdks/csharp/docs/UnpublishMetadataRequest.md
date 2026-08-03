# ThoughtSpot.RestApi.Sdk.Model.UnpublishMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Force** | **bool?** | Force unpublishes the object. This will break all the dependent objects in the unpublished orgs. | [optional] 
**IncludeDependencies** | **bool** | Should we unpublish all the dependencies for the objects specified. The dependencies will be unpublished if no other published object is using it. | 
**Metadata** | [**List&lt;PublishMetadataListItem&gt;**](PublishMetadataListItem.md) | Metadata objects. | 
**OrgIdentifiers** | **List&lt;string&gt;** | Unique ID or name of orgs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

