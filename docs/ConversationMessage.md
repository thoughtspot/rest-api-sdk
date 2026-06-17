# ThoughtSpot.Client.Model.ConversationMessage
One conversational exchange: an optional user prompt (message and attachments), followed by the agent's response items for that turn.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageId** | **string** | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | 
**TimestampInMillis** | **Object** | Milliseconds since Unix epoch for the turn. | 
**UserPrompt** | [**UserPrompt**](UserPrompt.md) |  | [optional] 
**ResponseItems** | **List&lt;Object&gt;** | Agent-side output produced in response to this turn. Empty array for in-progress turns where the agent has not yet produced output. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

