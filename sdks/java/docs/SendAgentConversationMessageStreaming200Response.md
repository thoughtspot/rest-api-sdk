

# SendAgentConversationMessageStreaming200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | Indicates whether the agent response was received and processed successfully. |  |
|**message** | **String** | Optional message providing additional context about the operation outcome. |  [optional] |
|**event** | [**AgentEvent**](AgentEvent.md) |  |  [optional] |
|**toolCall** | [**AgentToolCall**](AgentToolCall.md) |  |  [optional] |
|**progress** | [**AgentProgress**](AgentProgress.md) |  |  [optional] |
|**toolResult** | [**AgentToolResult**](AgentToolResult.md) |  |  [optional] |
|**error** | [**AgentStreamError**](AgentStreamError.md) |  |  [optional] |
|**done** | [**AgentStreamDone**](AgentStreamDone.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


