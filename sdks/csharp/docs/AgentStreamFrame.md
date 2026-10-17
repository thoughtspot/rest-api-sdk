# ThoughtSpot.RestApi.Sdk.Model.AgentStreamFrame
One frame of an agent response. On the streaming endpoint each SSE `data:` line is one frame, and a turn streams many over a single connection. Exactly one field is set on any given frame: route on which one is present. New frame types are added as new fields, so a frame where none of the fields you know is set is a frame of a type you do not recognize: skip it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | [**AgentEvent**](AgentEvent.md) |  | [optional] 
**ToolCall** | [**AgentToolCall**](AgentToolCall.md) |  | [optional] 
**Progress** | [**AgentProgress**](AgentProgress.md) |  | [optional] 
**ToolResult** | [**AgentToolResult**](AgentToolResult.md) |  | [optional] 
**Error** | [**AgentStreamError**](AgentStreamError.md) |  | [optional] 
**Done** | [**AgentStreamDone**](AgentStreamDone.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

