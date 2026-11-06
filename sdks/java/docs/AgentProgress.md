

# AgentProgress

A stage of a step in flight, so you can show what Spotter is doing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Stage code. Treat an unfamiliar value as \&quot;still working\&quot; rather than an error.    Version: 26.12.0.cl or later  |  |
|**message** | **String** | Human-facing status text, when the backend supplies one.    Version: 26.12.0.cl or later  |  [optional] |
|**toolCallId** | **String** | The &#x60;tool_call&#x60; this stage belongs to. Absent when that call has no &#x60;id&#x60;.    Version: 26.12.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


