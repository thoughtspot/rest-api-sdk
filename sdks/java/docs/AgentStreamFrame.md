

# AgentStreamFrame

One frame of an agent response. On the streaming endpoint each SSE `data:` line is one frame, and a turn streams many over a single connection. Exactly one field is set on any given frame: route on which one is present. New frame types are added as new fields, so a frame where none of the fields you know is set is a frame of a type you do not recognize: skip it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**event** | [**AgentEvent**](AgentEvent.md) |  |  [optional] |
|**toolCall** | [**AgentToolCall**](AgentToolCall.md) |  |  [optional] |
|**progress** | [**AgentProgress**](AgentProgress.md) |  |  [optional] |
|**toolResult** | [**AgentToolResult**](AgentToolResult.md) |  |  [optional] |
|**error** | [**AgentStreamError**](AgentStreamError.md) |  |  [optional] |
|**done** | [**AgentStreamDone**](AgentStreamDone.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


