# ThoughtSpot.RestApi.Sdk.Model.CreateAgentConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataContext** | [**ContextPayloadV2Input**](ContextPayloadV2Input.md) | Context for the conversation. Required unless &#x60;analyst_identifier&#x60; is provided; do not pass both. | [optional] 
**ConversationSettings** | [**ConversationSettingsInput**](ConversationSettingsInput.md) | Conversation settings. Applies to V1 only. | [optional] 
**AnalystIdentifier** | **string** | Unique identifier of the Spotter Analyst to start the conversation from. When provided, the conversation uses the analyst&#39;s configuration (data sources, agent instructions, and connectors), and &#x60;metadata_context&#x60; must be omitted.    Version: 26.10.0.cl or later  | [optional] 
**AdditionalInstructions** | **string** | Guidance appended to the agent&#39;s instructions on every message in this conversation, such as a persona, an output format or domain rules. Cannot be changed after the conversation is created. V2 only, and not with &#x60;analyst_identifier&#x60;.    Version: 26.12.0.cl or later  | [optional] 
**SpotterExperienceVersion** | **string** | Version of the Spotter experience the conversation runs on. The conversation stays on this version, so pass the same value on every later request for it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. Uses   &#x60;conversation_settings&#x60;. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Accepts   &#x60;additional_instructions&#x60;. Requires a cluster admin to set Spotter 3   Liveboard experience to Liveboard side panel (New); otherwise the   request returns a 400.    Version: 26.12.0.cl or later  | [optional] [default to SpotterExperienceVersionEnum.V1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

