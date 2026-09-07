# ThoughtSpot.RestApi.Sdk.Model.PublishMetadataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | [**List&lt;PublishMetadataListItem&gt;**](PublishMetadataListItem.md) | Metadata objects to be published. | 
**OrgIdentifiers** | **List&lt;string&gt;** | Unique ID or name of orgs to which metadata objects should be published. | 
**SkipValidation** | **bool?** | Skip parameterization validation. By default publishing requires an underlying LOGICAL_TABLE or DATA_SOURCE to carry a template variable with a value for every target org, so each org resolves its own data. Without parameterization every target org reads the owner org&#39;s data through the owner org&#39;s connection. Set this to true only when that is intended. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

