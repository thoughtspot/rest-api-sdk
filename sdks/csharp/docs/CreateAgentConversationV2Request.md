# ThoughtSpot.RestApi.Sdk.Model.CreateAgentConversationV2Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Source** | **string** | What the conversation is grounded in. &#x60;DATA_SOURCE&#x60; scopes it to &#x60;data_source_identifiers&#x60;; &#x60;ANALYST&#x60; creates it from the saved analyst in &#x60;analyst_identifier&#x60;.    Version: 26.12.0.cl or later  | [optional] [default to SourceEnum.DATASOURCE]
**DataSourceIdentifiers** | **List&lt;string&gt;** | Unique identifiers of the data sources to scope the conversation to. When empty, Spotter selects the most relevant data source for each question. Only valid when &#x60;source&#x60; is &#x60;DATA_SOURCE&#x60;.    Version: 26.12.0.cl or later  | [optional] 
**AdditionalInstructions** | **string** | Guidance appended to the agent&#39;s instructions on every message in this conversation. Use it to set a persona, a preferred output format, or domain rules. Cannot be changed after the conversation is created. Only valid when &#x60;source&#x60; is &#x60;DATA_SOURCE&#x60;.    Version: 26.12.0.cl or later  | [optional] 
**AnalystIdentifier** | **string** | Unique identifier of the saved analyst to create the conversation from. Required when &#x60;source&#x60; is &#x60;ANALYST&#x60;, and not allowed otherwise.    Version: 26.12.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

