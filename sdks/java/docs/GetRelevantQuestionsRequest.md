

# GetRelevantQuestionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataContext** | [**MetadataContext**](MetadataContext.md) | metadata for the query to enable generation of relevant sub-questions; at least one context identifier is required. |  |
|**limitRelevantQuestions** | **Integer** | Maximum number of relevant questions that is allowed in the response, default &#x3D; 5. |  [optional] |
|**bypassCache** | **Boolean** | If true, results are not returned from cache &amp; calculated every time. |  [optional] |
|**query** | **String** | A user query that requires breaking down into smaller, more manageable analytical questions to facilitate better understanding and analysis. |  |
|**aiContext** | [**AIContext**](AIContext.md) | Additional context to guide the response. |  [optional] |


## Implemented Interfaces

* Serializable


