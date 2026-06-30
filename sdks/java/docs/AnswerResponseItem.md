

# AnswerResponseItem

Slim reference to a saved answer produced by the agent. Full answer payload (visualization spec, formulas, session info) is not embedded — fetch separately via `loadAnswer` using `answer_id`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Variant discriminator. Always &#x60;\&quot;answer\&quot;&#x60;. |  |
|**timestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. |  |
|**isThinking** | **Boolean** | True when the item represents internal agent reasoning rather than user-facing output. |  [optional] |
|**stepTitle** | **String** | Human-readable label for the agent step producing this item. |  [optional] |
|**answerId** | **String** | Identifier used to fetch the full answer payload separately. |  |
|**toolCallId** | **String** | Links to the originating tool_call, when applicable. |  [optional] |
|**toolName** | **String** | Tool that produced the answer, when applicable. |  [optional] |


## Implemented Interfaces

* Serializable


