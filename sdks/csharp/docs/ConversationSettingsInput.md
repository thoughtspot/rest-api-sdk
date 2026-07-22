# ThoughtSpot.RestApi.Sdk.Model.ConversationSettingsInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnableContextualChangeAnalysis** | **bool?** | Enable contextual change analysis. Default changed from &#x60;false&#x60; to &#x60;true&#x60; in 26.2.0.cl. Ignored on versions &gt;&#x3D; 26.2.0.cl where it is always enabled.    Version: 10.4.0.cl or later  | [optional] [default to true]
**EnableNaturalLanguageAnswerGeneration** | **bool?** | Enable natural language to answer generation. Default changed from &#x60;false&#x60; to &#x60;true&#x60; in 26.2.0.cl. Ignored on versions &gt;&#x3D; 26.2.0.cl where it is always enabled.    Version: 10.4.0.cl or later  | [optional] [default to true]
**EnableReasoning** | **bool?** | Enable reasoning. Default changed from &#x60;false&#x60; to &#x60;true&#x60; in 26.2.0.cl. Ignored on versions &gt;&#x3D; 26.2.0.cl where it is always enabled.    Version: 10.4.0.cl or later  | [optional] [default to true]
**EnableSaveChat** | **bool?** | Enable save conversation. When &#x60;true&#x60;, the conversation is persisted and can be retrieved later via conversation history.    Version: 26.5.0.cl or later  | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

