# ThoughtSpot.RestApi.Sdk.Model.CreateAnalystRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Display name of the analyst. | 
**Description** | **string** | Description of the analyst. Maximum 200 characters. | 
**Instructions** | **string** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. | [optional] 
**Sources** | [**List&lt;AnalystSourceInput&gt;**](AnalystSourceInput.md) | Data sources the analyst can query. At least one is required, and the caller must have view access to every referenced source. | 
**McpConnectorIdentifiers** | **List&lt;string&gt;** | Identifiers of MCP connectors to link to this analyst. | [optional] 
**StarterPrompts** | **List&lt;string&gt;** | Plain-text starter prompts shown on the analyst landing page. Maximum 4, each between 10 and 250 characters; display order follows list position. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

