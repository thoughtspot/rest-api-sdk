

# AgentEvent

Text from Spotter — its reasoning or its answer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifies a single event.    Version: 26.12.0.cl or later  |  [optional] |
|**invocationId** | **String** | Stable for one turn; every event of the same turn shares it.    Version: 26.12.0.cl or later  |  [optional] |
|**partial** | **Boolean** | &#x60;true&#x60; for an incremental chunk, &#x60;false&#x60; for a frame restating a completed segment; absent on a complete event. Restated text is not republished, and frames arrive in order over a single response, so appending every part is safe.    Version: 26.12.0.cl or later  |  [optional] |
|**errorCode** | **String** | Set when the turn failed while producing this event.    Version: 26.12.0.cl or later  |  [optional] |
|**content** | [**AgentEventContent**](AgentEventContent.md) |  |  |


## Implemented Interfaces

* Serializable


