# ThoughtSpot.RestApi.Sdk.Model.GetRelevantQuestionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataContext** | [**MetadataContext**](MetadataContext.md) | metadata for the query to enable generation of relevant sub-questions; at least one context identifier is required. | 
**LimitRelevantQuestions** | **int** | Maximum number of relevant questions that is allowed in the response, default &#x3D; 5. | [optional] 
**BypassCache** | **bool?** | If true, results are not returned from cache &amp; calculated every time. | [optional] 
**Query** | **string** | A user query that requires breaking down into smaller, more manageable analytical questions to facilitate better understanding and analysis. Must be a non-empty string. | 
**AiContext** | [**AIContext**](AIContext.md) | Additional context to guide the response. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

