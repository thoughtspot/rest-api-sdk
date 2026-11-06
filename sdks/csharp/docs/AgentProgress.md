# ThoughtSpot.RestApi.Sdk.Model.AgentProgress
A stage of a step in flight, so you can show what Spotter is doing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Stage code. Treat an unfamiliar value as \&quot;still working\&quot; rather than an error.    Version: 26.12.0.cl or later  | 
**Message** | **string** | Human-facing status text, when the backend supplies one.    Version: 26.12.0.cl or later  | [optional] 
**ToolCallId** | **string** | The &#x60;tool_call&#x60; this stage belongs to. Absent when that call has no &#x60;id&#x60;.    Version: 26.12.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

