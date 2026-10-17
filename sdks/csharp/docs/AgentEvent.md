# ThoughtSpot.RestApi.Sdk.Model.AgentEvent
Text from Spotter — its reasoning or its answer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifies a single event.    Version: 26.12.0.cl or later  | [optional] 
**InvocationId** | **string** | Stable for one turn; every event of the same turn shares it.    Version: 26.12.0.cl or later  | [optional] 
**Partial** | **bool?** | &#x60;true&#x60; for an incremental chunk, &#x60;false&#x60; for a frame restating a completed segment; absent on a complete event. Restated text is not republished, and frames arrive in order over a single response, so appending every part is safe.    Version: 26.12.0.cl or later  | [optional] 
**ErrorCode** | **string** | Set when the turn failed while producing this event.    Version: 26.12.0.cl or later  | [optional] 
**Content** | [**AgentEventContent**](AgentEventContent.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

