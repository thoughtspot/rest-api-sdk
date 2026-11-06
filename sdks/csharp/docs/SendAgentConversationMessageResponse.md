# ThoughtSpot.RestApi.Sdk.Model.SendAgentConversationMessageResponse
Shape of the JSON a non-streaming send returns: `AgentMessagesResponse` on V1, `AgentTurnResponse` on V2.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | **List&lt;Object&gt;** | The agent&#39;s response messages, in order. Each has a &#x60;type&#x60; (&#x60;text&#x60;, &#x60;answer&#x60;, &#x60;error&#x60;, ...) and the fields of that type.    Version: 26.12.0.cl or later  | 
**ConversationIdentifier** | **string** | The conversation the turn belongs to. When the request named no conversation, this is the one it created.    Version: 26.12.0.cl or later  | [optional] 
**Events** | [**List&lt;AgentStreamFrame&gt;**](AgentStreamFrame.md) | The frames of the turn, in the order Spotter produced them. The number of frames is not capped and the list is never truncated: a turn too large or too long to return whole fails with an HTTP error instead. For long turns, use the streaming endpoint.    Version: 26.12.0.cl or later  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

