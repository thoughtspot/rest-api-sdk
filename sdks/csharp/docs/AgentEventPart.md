# ThoughtSpot.RestApi.Sdk.Model.AgentEventPart
One piece of text from Spotter, with a flag marking reasoning apart from the answer itself.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **string** | The text to render. Text arrives incrementally, so concatenate parts in the order received.    Version: 26.12.0.cl or later  | 
**Thought** | **bool?** | &#x60;true&#x60; when this text is Spotter&#39;s reasoning rather than its answer. Use it to render reasoning separately, or to hide it. Absent otherwise; treat absence as &#x60;false&#x60;.    Version: 26.12.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

