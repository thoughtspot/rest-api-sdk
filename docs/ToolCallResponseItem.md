# ThoughtSpot.Client.Model.ToolCallResponseItem
Agent invoked a tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Variant discriminator. Always &#x60;\&quot;tool_call\&quot;&#x60;. | 
**TimestampInMillis** | **Object** | Milliseconds since Unix epoch when this item was produced. | 
**IsThinking** | **bool?** | True when the item represents internal agent reasoning rather than user-facing output. | [optional] 
**StepTitle** | **string** | Human-readable label for the agent step producing this item. | [optional] 
**ToolCallId** | **string** | Identifier linking this tool call to its matching tool_result or answer. | [optional] 
**ToolName** | **string** | Name of the tool being invoked. | [optional] 
**Arguments** | **Object** | Input arguments passed to the tool. Shape depends on the tool. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

