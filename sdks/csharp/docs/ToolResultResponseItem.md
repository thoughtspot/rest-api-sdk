# ThoughtSpot.RestApi.Sdk.Model.ToolResultResponseItem
Result returned from a tool invocation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Variant discriminator. Always &#x60;\&quot;tool_result\&quot;&#x60;. | 
**TimestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. | 
**IsThinking** | **bool?** | True when the item represents internal agent reasoning rather than user-facing output. | [optional] 
**StepTitle** | **string** | Human-readable label for the agent step producing this item. | [optional] 
**ToolCallId** | **string** | Matches the originating tool_call. | [optional] 
**ToolName** | **string** | Name of the tool that produced this result. | [optional] 
**Content** | **string** | Result body (tool output, or &#x60;\&quot;&lt;code&gt;: &lt;message&gt;\&quot;&#x60; for errors). | 
**ContentType** | **string** | Rendering hint for the result content; defaults to &#x60;TEXT_PLAIN&#x60; for tool results. See &#x60;ContentMimeType&#x60; for accepted values. | [optional] 
**Success** | **bool?** | False when the tool invocation errored; true otherwise. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

