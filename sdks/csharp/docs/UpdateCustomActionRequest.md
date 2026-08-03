# ThoughtSpot.RestApi.Sdk.Model.UpdateCustomActionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionDetails** | [**ActionDetailsInput**](ActionDetailsInput.md) | Action details includes &#x60;Type&#x60; and Configuration for Custom Actions, either Callback or URL is required. | [optional] 
**AssociateMetadata** | [**List&lt;AssociateMetadataInput&gt;**](AssociateMetadataInput.md) | Metadata objects to which the custom action needs to be associated. | [optional] 
**DefaultActionConfig** | [**DefaultActionConfigInput**](DefaultActionConfigInput.md) | Default Custom action configuration. This includes if the custom action available on visualizations and Answers. By default, a custom action is added to all visualizations and Answers. | [optional] 
**GroupIdentifiers** | **List&lt;string&gt;** | Unique ID or name of the groups that can view and access the custom action. | [optional] 
**Name** | **string** | Name of the custom action. The custom action name must be unique. | [optional] 
**Operation** | **string** | Type of update operation. Default operation type is ADD | [optional] [default to OperationEnum.ADD]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

