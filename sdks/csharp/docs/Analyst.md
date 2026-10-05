# ThoughtSpot.RestApi.Sdk.Model.Analyst
A Spotter Analyst: a configured agent with a name, description, agent instructions, data sources, MCP connectors, and starter prompts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier of the analyst. | 
**Name** | **string** | Display name of the analyst. | [optional] 
**Description** | **string** | Description of the analyst. | [optional] 
**Instructions** | **string** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. | [optional] 
**Sources** | [**List&lt;AnalystSource&gt;**](AnalystSource.md) | Data sources the analyst can query. | 
**McpConnectors** | **List&lt;string&gt;** | IDs of MCP connectors linked to this analyst. | 
**StarterPrompts** | [**List&lt;AnalystStarterPrompt&gt;**](AnalystStarterPrompt.md) | User-defined starter prompts, in display order. | 
**UpdatedTimeInMillis** | **Object** | Epoch milliseconds of the last update. | [optional] 
**CreatedBy** | **string** | ID of the user who created the analyst. | [optional] 
**UpdatedBy** | **string** | ID of the user who last updated the analyst. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

