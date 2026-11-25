# ThoughtSpot.RestApi.Sdk.Model.AgentEventContent
The content of one agent event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **string** | Always &#x60;model&#x60;: the events a caller sees are Spotter speaking. Mirrors the agent wire format, and is reserved for conversations with more than one speaker.    Version: 26.12.0.cl or later  | 
**Parts** | [**List&lt;AgentEventPart&gt;**](AgentEventPart.md) | The text this event carries. Empty when &#x60;error_code&#x60; is set.    Version: 26.12.0.cl or later  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

