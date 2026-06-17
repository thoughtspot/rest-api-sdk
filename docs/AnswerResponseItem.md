# ThoughtSpot.Client.Model.AnswerResponseItem
Slim reference to a saved answer produced by the agent. Full answer payload (visualization spec, formulas, session info) is not embedded — fetch separately via `loadAnswer` using `answer_id`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Variant discriminator. Always &#x60;\&quot;answer\&quot;&#x60;. | 
**TimestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. | 
**IsThinking** | **bool?** | True when the item represents internal agent reasoning rather than user-facing output. | [optional] 
**StepTitle** | **string** | Human-readable label for the agent step producing this item. | [optional] 
**AnswerId** | **string** | Identifier used to fetch the full answer payload separately. | 
**ToolCallId** | **string** | Links to the originating tool_call, when applicable. | [optional] 
**ToolName** | **string** | Tool that produced the answer, when applicable. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

