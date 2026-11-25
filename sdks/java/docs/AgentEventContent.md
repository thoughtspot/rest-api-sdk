

# AgentEventContent

The content of one agent event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | **String** | Always &#x60;model&#x60;: the events a caller sees are Spotter speaking. Mirrors the agent wire format, and is reserved for conversations with more than one speaker.    Version: 26.12.0.cl or later  |  |
|**parts** | [**List&lt;AgentEventPart&gt;**](AgentEventPart.md) | The text this event carries. Empty when &#x60;error_code&#x60; is set.    Version: 26.12.0.cl or later  |  |


## Implemented Interfaces

* Serializable


