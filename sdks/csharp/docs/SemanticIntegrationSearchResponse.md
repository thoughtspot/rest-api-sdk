# ThoughtSpot.RestApi.Sdk.Model.SemanticIntegrationSearchResponse
Single semantic integration entry returned by search.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier of the semantic integration. | [optional] 
**Name** | **string** | Name of the semantic integration. | [optional] 
**Description** | **string** | Optional description of the semantic integration. | [optional] 
**ModelId** | **string** | GUID of the associated ThoughtSpot model generated for this integration. | [optional] 
**ModelName** | **string** | Name of the associated ThoughtSpot model. | [optional] 
**ImportType** | **string** | How the semantic definition was sourced. | [optional] 
**Type** | **string** | CDW connector type. | [optional] 
**ConnectionId** | **string** | GUID of the CDW connection backing the integration. | [optional] 
**ConnectionName** | **string** | Display name of the CDW connection backing the integration. | [optional] 
**AuthorId** | **string** | GUID of the user who created the integration. | [optional] 
**AuthorName** | **string** | Username of the user who created the integration. | [optional] 
**CreationTimeInMillis** | **float?** | Creation time in Unix epoch milliseconds. | [optional] 
**ModificationTimeInMillis** | **float?** | Last modification time in Unix epoch milliseconds. | [optional] 
**Tags** | [**List&lt;SemanticIntegrationTagReference&gt;**](SemanticIntegrationTagReference.md) | Tags associated with the integration. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

