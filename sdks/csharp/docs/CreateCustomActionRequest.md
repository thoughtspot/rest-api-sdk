# ThoughtSpot.RestApi.Sdk.Model.CreateCustomActionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the custom action. The custom action name must be unique. | 
**ActionDetails** | [**ActionDetailsInputCreate**](ActionDetailsInputCreate.md) | Action details includes &#x60;Type&#x60; and Configuration data for Custom Actions, either Callback or URL is required. | 
**AssociateMetadata** | [**List&lt;AssociateMetadataInputCreate&gt;**](AssociateMetadataInputCreate.md) | Metadata objects to which the custom action needs to be associated. | [optional] 
**DefaultActionConfig** | [**DefaultActionConfigInputCreate**](DefaultActionConfigInputCreate.md) | Default Custom action configuration. This includes if the custom action is available on all visualizations. By default, a custom action is added to all visualizations and Answers. | [optional] 
**GroupIdentifiers** | **List&lt;string&gt;** | Unique ID or name of the groups that can view and access the custom action. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

