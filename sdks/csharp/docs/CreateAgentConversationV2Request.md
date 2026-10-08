# ThoughtSpot.RestApi.Sdk.Model.CreateAgentConversationV2Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataSourceIdentifiers** | **List&lt;string&gt;** | Unique identifiers of the data sources to scope the conversation to. When empty, Spotter selects the most relevant data source for each question.    Version: 26.12.0.cl or later  | [optional] 
**AdditionalInstructions** | **string** | Guidance appended to the agent&#39;s instructions on every message in this conversation. Use it to set a persona, a preferred output format, or domain rules. Cannot be changed after the conversation is created.    Version: 26.12.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

