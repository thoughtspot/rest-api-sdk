

# AgentToolCall

A step Spotter started, such as querying a data source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Correlates this call with its &#x60;progress&#x60; and &#x60;tool_result&#x60; frames. Absent when the backend did not assign one; a step&#39;s frames then arrive in order, so match them by position.    Version: 26.12.0.cl or later  |  [optional] |
|**name** | **String** | Name of the step that ran.    Version: 26.12.0.cl or later  |  [optional] |
|**args** | **Object** | The arguments the step ran with, forwarded as the backend produced them.    Version: 26.12.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


