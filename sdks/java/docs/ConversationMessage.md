

# ConversationMessage

One conversational exchange: an optional user prompt (message and attachments), followed by the agent's response items for that turn.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch for the turn. |  |
|**userPrompt** | [**UserPrompt**](UserPrompt.md) |  |  [optional] |
|**responseItems** | **List&lt;Object&gt;** | Agent-side output produced in response to this turn. Empty array for in-progress turns where the agent has not yet produced output. |  [optional] |


## Implemented Interfaces

* Serializable


