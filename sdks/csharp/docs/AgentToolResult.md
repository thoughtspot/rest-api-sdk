# ThoughtSpot.RestApi.Sdk.Model.AgentToolResult
What a step produced, including any answer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Correlates with the &#x60;tool_call&#x60; and &#x60;progress&#x60; frames of the same step. Absent when that call has no &#x60;id&#x60;.    Version: 26.12.0.cl or later  | [optional] 
**Name** | **string** | The step that produced this result.    Version: 26.12.0.cl or later  | [optional] 
**IsError** | **bool?** | &#x60;true&#x60; when the step failed. Spotter usually explains the failure in the text that follows, so this is a signal to read rather than a reason to stop. Absent when the step did not report an outcome; treat absence as &#x60;false&#x60;.    Version: 26.12.0.cl or later  | [optional] 
**Text** | **string** | The step&#39;s own human-readable summary. For a data query it includes a sample of the rows — read &#x60;answer.table_data.total_rows&#x60; for the true count.    Version: 26.12.0.cl or later  | [optional] 
**Answer** | **Object** | The ThoughtSpot answer the step produced, forwarded as the backend produced it. Use &#x60;session_id&#x60; with &#x60;gen_no&#x60; to fetch or deep-link it.    Version: 26.12.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

