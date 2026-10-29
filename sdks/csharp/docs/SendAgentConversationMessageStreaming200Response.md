# ThoughtSpot.RestApi.Sdk.Model.SendAgentConversationMessageStreaming200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | **bool** | Indicates whether the agent response was received and processed successfully. | 
**Message** | **string** | Optional message providing additional context about the operation outcome. | [optional] 
**Event** | [**AgentEvent**](AgentEvent.md) |  | [optional] 
**ToolCall** | [**AgentToolCall**](AgentToolCall.md) |  | [optional] 
**Progress** | [**AgentProgress**](AgentProgress.md) |  | [optional] 
**ToolResult** | [**AgentToolResult**](AgentToolResult.md) |  | [optional] 
**Error** | [**AgentStreamError**](AgentStreamError.md) |  | [optional] 
**Done** | [**AgentStreamDone**](AgentStreamDone.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

