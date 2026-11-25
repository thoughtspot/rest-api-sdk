# ThoughtSpot.RestApi.Sdk.Model.SendAgentConversationMessageStreamingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | **List&lt;string&gt;** | messages to be sent to the agent | 
**SpotterExperienceVersion** | **string** | Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. Streams message events. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Streams   &#x60;AgentStreamFrame&#x60; events and can start a new conversation without   &#x60;conversation_identifier&#x60;. Requires a cluster admin to set Spotter 3   Liveboard experience to Liveboard side panel (New); otherwise the   request returns a 400.    Version: 26.12.0.cl or later  | [optional] [default to SpotterExperienceVersionEnum.V1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

