# ThoughtSpot.RestApi.Sdk.Model.AnalystItem
A Spotter Analyst as returned in search results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier of the analyst. | 
**Name** | **string** | Display name of the analyst. | [optional] 
**Description** | **string** | Description of the analyst. | [optional] 
**Instructions** | **string** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. | [optional] 
**Sources** | [**List&lt;AnalystItemSource&gt;**](AnalystItemSource.md) | Data sources the analyst can query. | 
**McpConnectors** | [**List&lt;AnalystMcpConnector&gt;**](AnalystMcpConnector.md) | MCP connectors linked to this analyst. | 
**IconId** | **string** | Icon identifier. Empty string means the default icon. | 
**StarterPrompts** | [**List&lt;AnalystItemStarterPrompt&gt;**](AnalystItemStarterPrompt.md) | Starter prompts in display order, including the fixed prompt. | 
**UpdatedTimeInMillis** | **Object** | Epoch milliseconds of the last update. | [optional] 
**LastAccessedTimeInMillis** | **Object** | Epoch milliseconds of the caller&#39;s last interaction with the analyst. | [optional] 
**CreatedBy** | [**AnalystUser**](AnalystUser.md) |  | [optional] 
**UpdatedBy** | [**AnalystUser**](AnalystUser.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

