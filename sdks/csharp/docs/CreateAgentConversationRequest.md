# ThoughtSpot.RestApi.Sdk.Model.CreateAgentConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataContext** | [**ContextPayloadV2Input**](ContextPayloadV2Input.md) | Context for the conversation. Required unless &#x60;analyst_identifier&#x60; is provided; do not pass both. | [optional] 
**ConversationSettings** | [**ConversationSettingsInput**](ConversationSettingsInput.md) | Conversation settings. | 
**AnalystIdentifier** | **string** | Unique identifier of the Spotter Analyst to start the conversation from. When provided, the conversation uses the analyst&#39;s configuration (data sources, agent instructions, and connectors), and &#x60;metadata_context&#x60; must be omitted.    Version: 26.10.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

