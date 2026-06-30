

# ToolCallResponseItem

Agent invoked a tool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Variant discriminator. Always &#x60;\&quot;tool_call\&quot;&#x60;. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. |  |
|**isThinking** | **Boolean** | True when the item represents internal agent reasoning rather than user-facing output. |  [optional] |
|**stepTitle** | **String** | Human-readable label for the agent step producing this item. |  [optional] |
|**toolCallId** | **String** | Identifier linking this tool call to its matching tool_result or answer. |  [optional] |
|**toolName** | **String** | Name of the tool being invoked. |  [optional] |
|**arguments** | **Object** | Input arguments passed to the tool. Shape depends on the tool. |  |


## Implemented Interfaces

* Serializable


