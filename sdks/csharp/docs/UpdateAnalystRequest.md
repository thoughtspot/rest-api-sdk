# ThoughtSpot.RestApi.Sdk.Model.UpdateAnalystRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Display name of the analyst. | 
**Description** | **string** | Description of the analyst. Maximum 200 characters. | 
**Instructions** | **string** | Natural-language instructions that guide the agent&#39;s behavior for this analyst. Omitting this field clears any existing instructions. | [optional] 
**Sources** | [**List&lt;AnalystSourceInput&gt;**](AnalystSourceInput.md) | Data sources the analyst can query. At least one is required, and the caller must have view access to every referenced source. Replaces the existing list in full. | 
**McpConnectorIdentifiers** | **List&lt;string&gt;** | Identifiers of MCP connectors linked to this analyst. Replaces the existing list in full; omit or pass an empty array to clear. | [optional] 
**StarterPrompts** | **List&lt;string&gt;** | Plain-text starter prompts (max 4, each between 10 and 250 characters; display order follows list position). Replaces the existing list in full; omit or pass an empty array to clear. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

