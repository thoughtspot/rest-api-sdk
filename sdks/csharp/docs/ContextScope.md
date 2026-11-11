# ThoughtSpot.RestApi.Sdk.Model.ContextScope
The owner of a group of context entities: a kind of owner and its identifiers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | What owns the entities: models, Spotter analysts or the Org. | [optional] 
**Identifiers** | **List&lt;string&gt;** | GUIDs of the models for &#x60;DATA_MODEL&#x60;, IDs of the analysts for &#x60;ANALYST&#x60;, and empty for &#x60;ORG&#x60;. More than one when the entities are owned jointly. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

