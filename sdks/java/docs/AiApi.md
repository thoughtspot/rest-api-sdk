# AiApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createAgentConversation**](AiApi.md#createAgentConversation) | **POST** /api/rest/2.0/ai/agent/conversation/create |
| [**createConversation**](AiApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create |
| [**getDataSourceSuggestions**](AiApi.md#getDataSourceSuggestions) | **POST** /api/rest/2.0/ai/data-source-suggestions |
| [**getRelevantQuestions**](AiApi.md#getRelevantQuestions) | **POST** /api/rest/2.0/ai/relevant-questions/ |
| [**queryGetDecomposedQuery**](AiApi.md#queryGetDecomposedQuery) | **POST** /api/rest/2.0/ai/analytical-questions |
| [**sendAgentMessage**](AiApi.md#sendAgentMessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse |
| [**sendAgentMessageStreaming**](AiApi.md#sendAgentMessageStreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse |
| [**sendMessage**](AiApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse |
| [**singleAnswer**](AiApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create |


<a id="createAgentConversation"></a>
# **createAgentConversation**
> AgentConversation createAgentConversation(createAgentConversationRequest)



Version: 10.13.0.cl or later 

### Parameters

| Name | Type |
|------------- | ------------- |
| **createAgentConversationRequest** | [**CreateAgentConversationRequest**](CreateAgentConversationRequest.md)

### Return type

[**AgentConversation**](AgentConversation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="createConversation"></a>
# **createConversation**
> Conversation createConversation(createConversationRequest)



 Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the &#x60;metadata_identifier&#x60; parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60;  If the API request is successful, ThoughtSpot returns the ID of the conversation.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createConversationRequest** | [**CreateConversationRequest**](CreateConversationRequest.md)

### Return type

[**Conversation**](Conversation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="getDataSourceSuggestions"></a>
# **getDataSourceSuggestions**
> EurekaDataSourceSuggestionResponse getDataSourceSuggestions(getDataSourceSuggestionsRequest)



 Version: 10.13.0.cl or later   Provides relevant data source recommendations for a user-submitted natural language query.  To use this API, the user must have at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include a &#x60;query&#x60; string via the request body.  The returned results include metadata such as: - &#x60;confidence&#x60;: a float indicating the model&#39;s confidence in the relevance of each recommendation - &#x60;details&#x60;: includes &#x60;data_source_identifier&#x60;, &#x60;data_source_name&#x60;, and &#x60;description&#x60; of each recommended data source - &#x60;reasoning&#x60;: rationale provided by the LLM to explain why each data source was recommended  If the API request is successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant reasoning.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. &gt; * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getDataSourceSuggestionsRequest** | [**GetDataSourceSuggestionsRequest**](GetDataSourceSuggestionsRequest.md)

### Return type

[**EurekaDataSourceSuggestionResponse**](EurekaDataSourceSuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="getRelevantQuestions"></a>
# **getRelevantQuestions**
> EurekaGetRelevantQuestionsResponse getRelevantQuestions(getRelevantQuestionsRequest)



 Version: 10.13.0.cl or later   Breaks down a user-submitted query into a series of analytical sub-questions using relevant contextual metadata.  To use this API, the user must have at least view-level access to the referenced metadata objects.  #### Usage guidelines  To accurately generate relevant questions, the request must include at least one of the following metadata identifiers within &#x60;metadata_context&#x60; : &#x60;conversation_identifier&#x60;, &#x60;answer_identifiers&#x60;, &#x60;liveboard_identifiers&#x60;, or &#x60;data_source_identifiers&#x60;.  You can further enhance the quality and precision of breakdown by providing additional &#x60;ai_context&#x60; such as:  - &#x60;content&#x60;: User provided content like text data, csv data as a string message to provide context &amp; potentially improve the quality of the response. - &#x60;instructions&#x60;: User specific text instructions sent to AI system for processing the query.  Additional optional parameters include:  - &#x60;limit_relevant_questions&#x60;: Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. - &#x60;bypass_cache&#x60;: If set to true, forces fresh computation instead of returning cached results.  If the API request is successful, ThoughtSpot returns a list of relevant analytical queries, each aligned with the user&#39;s original question. Each returned question includes the query string, along with the identifier and name of the corresponding data source.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **getRelevantQuestionsRequest** | [**GetRelevantQuestionsRequest**](GetRelevantQuestionsRequest.md)

### Return type

[**EurekaGetRelevantQuestionsResponse**](EurekaGetRelevantQuestionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="queryGetDecomposedQuery"></a>
# **queryGetDecomposedQuery**
> EurekaDecomposeQueryResponse queryGetDecomposedQuery(queryGetDecomposedQueryRequest)



Version: 10.7.0.cl or later 

### Parameters

| Name | Type |
|------------- | ------------- |
| **queryGetDecomposedQueryRequest** | [**QueryGetDecomposedQueryRequest**](QueryGetDecomposedQueryRequest.md)

### Return type

[**EurekaDecomposeQueryResponse**](EurekaDecomposeQueryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="sendAgentMessage"></a>
# **sendAgentMessage**
> Object sendAgentMessage(conversationIdentifier, sendAgentMessageRequest)



 Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages, each with a value and type  The API returns a array of object with a type, message, and metadata. - &#x60;type&#x60;: Type of the message — text, answer, or error. - &#x60;message&#x60;: Main content of the response. - &#x60;metadata&#x60;: Additional info depending on the message type.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendAgentMessageRequest** | [**SendAgentMessageRequest**](SendAgentMessageRequest.md)

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="sendAgentMessageStreaming"></a>
# **sendAgentMessageStreaming**
> SendAgentMessageResponse sendAgentMessageStreaming(sendAgentMessageStreamingRequest)



 Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages, each with a value and type  Additionally, user can specify what tool can be included &#x60;conversation_settings&#x60; parameter, which supports: - &#x60;enable_contextual_change_analysis&#x60; (default: false) - &#x60;enable_natural_language_answer_generation&#x60; (default: true) - &#x60;enable_reasoning&#x60; (default: false)  If the request is valid, the API returns a stream of messages in real time, including: - &#x60;ack&#x60;: confirms receipt of the request - &#x60;text / text-chunk&#x60;: content chunks, optionally formatted (e.g., markdown) - &#x60;answer&#x60;: the final structured response with metadata and analytics - &#x60;error&#x60;: if a failure occurs - &#x60;notification&#x60;: notification messages for operation being performed  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; * The streaming protocol uses Server-Sent Events (SSE)     

### Parameters

| Name | Type |
|------------- | ------------- |
| **sendAgentMessageStreamingRequest** | [**SendAgentMessageStreamingRequest**](SendAgentMessageStreamingRequest.md)

### Return type

[**SendAgentMessageResponse**](SendAgentMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="sendMessage"></a>
# **sendMessage**
> List&lt;ResponseMessage&gt; sendMessage(conversationIdentifier, sendMessageRequest)



 Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the &#x60;conversation_identifier&#x60; in the request path, and a &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendMessageRequest** | [**SendMessageRequest**](SendMessageRequest.md)

### Return type

[**List&lt;ResponseMessage&gt;**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="singleAnswer"></a>
# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)



 Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **singleAnswerRequest** | [**SingleAnswerRequest**](SingleAnswerRequest.md)

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

