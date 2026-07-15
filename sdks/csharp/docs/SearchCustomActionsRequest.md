# ThoughtSpot.RestApi.Sdk.Model.SearchCustomActionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomActionIdentifier** | **string** | Name or ID of the custom action. | [optional] 
**NamePattern** | **string** | A pattern to match case-insensitive name of the custom-action object. | [optional] 
**DefaultActionConfig** | [**DefaultActionConfigSearchInput**](DefaultActionConfigSearchInput.md) | Default Custom action configuration. This includes if the custom action is available on all visualizations. By default, a custom action is added to all visualizations and Answers. | [optional] 
**IncludeGroupAssociations** | **bool?** | When set to true, returns the associated groups for a custom action. | [optional] [default to false]
**IncludeMetadataAssociations** | **bool?** | When set to true, returns the associated metadata for a custom action. | [optional] [default to false]
**Metadata** | [**List&lt;CustomActionMetadataTypeInput&gt;**](CustomActionMetadataTypeInput.md) | Search with a given metadata identifier. | [optional] 
**Type** | **string** | Filter the action objects based on type | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

