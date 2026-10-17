# ThoughtSpot.RestApi.Sdk.Model.AgentTurnResponse
A completed agent turn: every frame the streaming endpoint publishes, collected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversationIdentifier** | **string** | The conversation the turn belongs to.    Version: 26.12.0.cl or later  | 
**Events** | [**List&lt;AgentStreamFrame&gt;**](AgentStreamFrame.md) | The frames of the turn, in the order Spotter produced them. The number of frames is not capped and the list is never truncated: a turn too large or too long to return whole fails with an HTTP error instead. For long turns, use the streaming endpoint.    Version: 26.12.0.cl or later  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

