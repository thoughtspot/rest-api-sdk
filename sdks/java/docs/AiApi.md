# AiApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createAgentConversation**](AiApi.md#createAgentConversation) | **POST** /api/rest/2.0/ai/agent/conversation/create |
| [**createConversation**](AiApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create |
| [**getDataSourceSuggestions**](AiApi.md#getDataSourceSuggestions) | **POST** /api/rest/2.0/ai/data-source-suggestions |
| [**getNLInstructions**](AiApi.md#getNLInstructions) | **POST** /api/rest/2.0/ai/instructions/get |
| [**getRelevantQuestions**](AiApi.md#getRelevantQuestions) | **POST** /api/rest/2.0/ai/relevant-questions/ |
| [**queryGetDecomposedQuery**](AiApi.md#queryGetDecomposedQuery) | **POST** /api/rest/2.0/ai/analytical-questions |
| [**sendAgentConversationMessage**](AiApi.md#sendAgentConversationMessage) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send |
| [**sendAgentConversationMessageStreaming**](AiApi.md#sendAgentConversationMessageStreaming) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream |
| [**sendAgentMessage**](AiApi.md#sendAgentMessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse |
| [**sendAgentMessageStreaming**](AiApi.md#sendAgentMessageStreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse |
| [**sendMessage**](AiApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse |
| [**setNLInstructions**](AiApi.md#setNLInstructions) | **POST** /api/rest/2.0/ai/instructions/set |
| [**singleAnswer**](AiApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create |


<a id="createAgentConversation"></a>
# **createAgentConversation**
> AgentConversation createAgentConversation(createAgentConversationRequest)



  Version: 26.2.0.cl or later   Creates a new Spotter agent conversation based on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include the &#x60;metadata_context&#x60; parameter to define the conversation context. The context type can be one of:  - &#x60;DATA_SOURCE&#x60; *(available from 26.5.0.cl)*: targets a specific data source. Provide &#x60;data_source_identifier&#x60; in &#x60;data_source_context&#x60; for a single data source, or &#x60;data_source_identifiers&#x60; for multi-data-source context. The deprecated &#x60;guid&#x60; field is accepted for backwards compatibility. - &#x60;AUTO_MODE&#x60; *(available from 26.5.0.cl)*: automatically discovers and selects the most relevant datasets for the user&#39;s queries.  &gt; **Note for callers on versions 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase &#x60;data_source&#x60; enum value with the &#x60;guid&#x60; field instead of the above. Example: &#x60;{ \&quot;type\&quot;: \&quot;data_source\&quot;, \&quot;data_source_context\&quot;: { \&quot;guid\&quot;: \&quot;&lt;worksheet-id&gt;\&quot; } }&#x60;.  The &#x60;conversation_settings&#x60; parameter controls which Spotter capabilities are enabled for the conversation:  - &#x60;enable_contextual_change_analysis&#x60; (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect on versions &gt;&#x3D; 26.2.0.cl - &#x60;enable_natural_language_answer_generation&#x60; (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect on versions &gt;&#x3D; 26.2.0.cl - &#x60;enable_reasoning&#x60; (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect on versions &gt;&#x3D; 26.2.0.cl - &#x60;enable_save_chat&#x60; (default: &#x60;false&#x60;, *available from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation history  If the request is successful, the response includes a unique &#x60;conversation_identifier&#x60; that must be passed to &#x60;sendAgentConversationMessage&#x60; or &#x60;sendAgentConversationMessageStreaming&#x60; to send messages within this conversation. The response also includes &#x60;conversation_id&#x60; with the same value for backwards compatibility; use &#x60;conversation_identifier&#x60; for new integrations.  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;metadata_context\&quot;: {     \&quot;type\&quot;: \&quot;DATA_SOURCE\&quot;,     \&quot;data_source_context\&quot;: {       \&quot;data_source_identifier\&quot;: \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot;     }   },   \&quot;conversation_settings\&quot;: {} } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description                                                                                                                             | | ---- | --------------------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; &gt; - This endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="createConversation"></a>
# **createConversation**
> Conversation createConversation(createConversationRequest)



 Version: 10.4.0.cl or later   Creates a new conversation session tied to a specific data model for AI-driven natural language querying.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - &#x60;metadata_identifier&#x60;: the unique ID of the data source that provides context for the conversation  Optionally, you can provide: - &#x60;tokens&#x60;: a token string to set initial context for the conversation (e.g., &#x60;\&quot;[sales],[item type],[state]\&quot;&#x60;)  If the request is successful, ThoughtSpot returns a unique &#x60;conversation_identifier&#x60; that must be passed to &#x60;sendMessage&#x60; to continue the conversation.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="getDataSourceSuggestions"></a>
# **getDataSourceSuggestions**
> EurekaDataSourceSuggestionResponse getDataSourceSuggestions(getDataSourceSuggestionsRequest)



 Version: 10.15.0.cl or later   Suggests the most relevant data sources for a given natural language query, ranked by confidence with LLM-generated reasoning.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include: - &#x60;query&#x60;: the natural language question to find relevant data sources for  If the request is successful, the API returns a ranked list of suggested data sources, each containing: - &#x60;confidence&#x60;: a float score indicating the model&#39;s confidence in the relevance of the suggestion - &#x60;details&#x60;: metadata about the data source   - &#x60;data_source_identifier&#x60;: the unique ID of the data source   - &#x60;data_source_name&#x60;: the display name of the data source   - &#x60;description&#x60;: a description of the data source - &#x60;reasoning&#x60;: LLM-generated rationale explaining why the data source was recommended  #### Error responses  | Code | Description                                                                                                                                | |------|--------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                       | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the underlying metadata entities. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. &gt; * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="getNLInstructions"></a>
# **getNLInstructions**
> EurekaGetNLInstructionsResponse getNLInstructions(getNLInstructionsRequest)



 Version: 10.15.0.cl or later   Retrieves existing natural language (NL) instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - &#x60;data_source_identifier&#x60;: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - &#x60;nl_instructions_info&#x60;: an array of instruction objects, each containing:   - &#x60;instructions&#x60;: the configured text instructions for AI processing   - &#x60;scope&#x60;: the scope of the instruction — currently only &#x60;GLOBAL&#x60; is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Use this API to review currently configured instructions before modifying them with &#x60;setNLInstructions&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getNLInstructionsRequest** | [**GetNLInstructionsRequest**](GetNLInstructionsRequest.md)

### Return type

[**EurekaGetNLInstructionsResponse**](EurekaGetNLInstructionsResponse.md)

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="getRelevantQuestions"></a>
# **getRelevantQuestions**
> EurekaGetRelevantQuestionsResponse getRelevantQuestions(getRelevantQuestionsRequest)



 Version: 10.13.0.cl or later   Breaks down a natural language query into a series of smaller analytical sub-questions, each mapped to a relevant data source.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request must include: - &#x60;query&#x60;: the natural language question to decompose into analytical sub-questions - &#x60;metadata_context&#x60;: at least one of the following context identifiers to guide question generation:   - &#x60;conversation_identifier&#x60; — an existing conversation session ID   - &#x60;answer_identifiers&#x60; — a list of Answer GUIDs   - &#x60;liveboard_identifiers&#x60; — a list of Liveboard GUIDs   - &#x60;data_source_identifiers&#x60; — a list of data source GUIDs  Optional parameters for refining the output: - &#x60;ai_context&#x60;: additional context to improve response quality   - &#x60;content&#x60; — supplementary text or CSV data as string input   - &#x60;instructions&#x60; — custom text instructions for the AI system - &#x60;limit_relevant_questions&#x60;: maximum number of questions to return (default: &#x60;5&#x60;) - &#x60;bypass_cache&#x60;: if &#x60;true&#x60;, forces fresh computation instead of returning cached results  If the request is successful, the API returns a list of relevant analytical questions, each containing: - &#x60;query&#x60;: the generated sub-question - &#x60;data_source_identifier&#x60;: the unique ID of the data source the question targets - &#x60;data_source_name&#x60;: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view access to the referenced metadata objects. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="queryGetDecomposedQuery"></a>
# **queryGetDecomposedQuery**
> EurekaDecomposeQueryResponse queryGetDecomposedQuery(queryGetDecomposedQueryRequest)



 Version: 10.7.0.cl or later   **Deprecated** — Use &#x60;getRelevantQuestions&#x60; instead (available from 10.13.0.cl).  Breaks down a topical or goal-oriented natural language question into smaller, actionable analytical sub-questions, each mapped to a relevant data source for independent execution.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request accepts the following parameters:  - &#x60;nlsRequest&#x60;: contains the user &#x60;query&#x60; to decompose, along with optional &#x60;instructions&#x60; and &#x60;bypassCache&#x60; flag - &#x60;worksheetIds&#x60;: list of data source identifiers to scope the decomposition - &#x60;answerIds&#x60;: list of Answer GUIDs whose data guides the response - &#x60;liveboardIds&#x60;: list of Liveboard GUIDs whose data guides the response - &#x60;conversationId&#x60;: an existing conversation session ID for context continuity - &#x60;content&#x60;: supplementary text or CSV data to improve response quality - &#x60;maxDecomposedQueries&#x60;: maximum number of sub-questions to return (default: &#x60;5&#x60;)  If the request is successful, the API returns a &#x60;decomposedQueryResponse&#x60; containing a list of &#x60;decomposedQueries&#x60;, each with: - &#x60;query&#x60;: the generated analytical sub-question - &#x60;worksheetId&#x60;: the unique ID of the data source the question targets - &#x60;worksheetName&#x60;: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view access to the referenced metadata objects. |  &gt; ###### Note: &gt; * This endpoint is deprecated since 10.13.0.cl. Use &#x60;getRelevantQuestions&#x60; for new integrations. &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter — please contact ThoughtSpot support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="sendAgentConversationMessage"></a>
# **sendAgentConversationMessage**
> Object sendAgentConversationMessage(conversationIdentifier, sendAgentConversationMessageRequest)



  Version: 26.5.0.cl or later   Sends natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - &#x60;type&#x60;: the kind of response — &#x60;text&#x60;, &#x60;answer&#x60;, or &#x60;error&#x60; - &#x60;message&#x60;: the main content of the response - &#x60;metadata&#x60;: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - For real-time streamed responses, use &#x60;sendAgentConversationMessageStreaming&#x60; instead.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendAgentConversationMessageRequest** | [**SendAgentConversationMessageRequest**](SendAgentConversationMessageRequest.md)

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="sendAgentConversationMessageStreaming"></a>
# **sendAgentConversationMessageStreaming**
> SendAgentMessageResponse sendAgentConversationMessageStreaming(conversationIdentifier, sendAgentConversationMessageStreamingRequest)



  Version: 26.5.0.cl or later   Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form &#x60;data: [{\&quot;type\&quot;: \&quot;...\&quot;, ...}]&#x60; — a JSON array of event objects. Event types include:  - &#x60;ack&#x60;: confirms receipt of the request (&#x60;node_id&#x60;) - &#x60;conv_title&#x60;: conversation title (&#x60;title&#x60;, &#x60;conv_id&#x60;) - &#x60;notification&#x60;: status updates on operations (&#x60;group_id&#x60;, &#x60;metadata&#x60;, &#x60;code&#x60; — e.g. &#x60;TOOL_CALL_NOTIFICATION&#x60;, &#x60;nls_start&#x60;, &#x60;FINAL_RESPONSE_NOTIFICATION&#x60;) - &#x60;text-chunk&#x60;: incremental content chunks (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;format&#x60; and &#x60;type&#x60; such as &#x60;thinking&#x60; or &#x60;text&#x60;, &#x60;content&#x60;) - &#x60;text&#x60;: full text block with same structure as &#x60;text-chunk&#x60; - &#x60;answer&#x60;: structured answer with metadata (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;sage_query&#x60;, &#x60;session_id&#x60;, &#x60;title&#x60;, etc., &#x60;title&#x60;) - &#x60;error&#x60;: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | | ---- | -------------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - The streaming protocol uses Server-Sent Events (SSE). &gt; - For the complete response in a single payload, use &#x60;sendAgentConversationMessage&#x60; instead.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendAgentConversationMessageStreamingRequest** | [**SendAgentConversationMessageStreamingRequest**](SendAgentConversationMessageStreamingRequest.md)

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="sendAgentMessage"></a>
# **sendAgentMessage**
> Object sendAgentMessage(conversationIdentifier, sendAgentMessageRequest)



 Version: 26.2.0.cl or later   **Deprecated** — Use &#x60;sendAgentConversationMessage&#x60; instead.  Send natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - &#x60;type&#x60;: the kind of response — &#x60;text&#x60;, &#x60;answer&#x60;, or &#x60;error&#x60; - &#x60;message&#x60;: the main content of the response - &#x60;metadata&#x60;: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated. Use &#x60;sendAgentConversationMessage&#x60; for new integrations. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="sendAgentMessageStreaming"></a>
# **sendAgentMessageStreaming**
> SendAgentMessageResponse sendAgentMessageStreaming(sendAgentMessageStreamingRequest)



 Version: 26.2.0.cl or later   **Deprecated** — Use &#x60;sendAgentConversationMessageStreaming&#x60; instead.  Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form &#x60;data: [{\&quot;type\&quot;: \&quot;...\&quot;, ...}]&#x60; — a JSON array of event objects. Event types include:  - &#x60;ack&#x60;: confirms receipt of the request (&#x60;node_id&#x60;) - &#x60;conv_title&#x60;: conversation title (&#x60;title&#x60;, &#x60;conv_id&#x60;) - &#x60;notification&#x60;: status updates on operations (&#x60;group_id&#x60;, &#x60;metadata&#x60;, &#x60;code&#x60; — e.g. &#x60;TOOL_CALL_NOTIFICATION&#x60;, &#x60;nls_start&#x60;, &#x60;FINAL_RESPONSE_NOTIFICATION&#x60;) - &#x60;text-chunk&#x60;: incremental content chunks (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;format&#x60; and &#x60;type&#x60; such as &#x60;thinking&#x60; or &#x60;text&#x60;, &#x60;content&#x60;) - &#x60;text&#x60;: full text block with same structure as &#x60;text-chunk&#x60; - &#x60;answer&#x60;: structured answer with metadata (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;sage_query&#x60;, &#x60;session_id&#x60;, &#x60;title&#x60;, etc., &#x60;title&#x60;) - &#x60;error&#x60;: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated. Use &#x60;sendAgentConversationMessageStreaming&#x60; for new integrations. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - The streaming protocol uses Server-Sent Events (SSE).      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="sendMessage"></a>
# **sendMessage**
> List&lt;ResponseMessage&gt; sendMessage(conversationIdentifier, sendMessageRequest)



 Version: 10.4.0.cl or later   Sends a follow-up message to an existing conversation within the context of a data model.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request. A conversation must first be created using the &#x60;createConversation&#x60; API.  #### Usage guidelines  The request must include: - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createConversation&#x60; - &#x60;metadata_identifier&#x60;: the unique ID of the data source used for the conversation - &#x60;message&#x60;: a natural language string with the follow-up question  If the request is successful, the API returns an array of response messages, each containing: - &#x60;session_identifier&#x60;: the unique ID of the generated response - &#x60;generation_number&#x60;: the generation number of the response - &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) - &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;, &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; / &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="setNLInstructions"></a>
# **setNLInstructions**
> EurekaSetNLInstructionsResponse setNLInstructions(setNLInstructionsRequest)



 Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - &#x60;data_source_identifier&#x60;: The unique ID of the data-model for which to set NL instructions - &#x60;nl_instructions_info&#x60;: An array of instruction objects, each containing:   - &#x60;instructions&#x60;: Array of text instructions for the LLM   - &#x60;scope&#x60;: The scope of the instruction (&#x60;GLOBAL&#x60;). Currently only &#x60;GLOBAL&#x60; is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - &#x60;success&#x60;: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **setNLInstructionsRequest** | [**SetNLInstructionsRequest**](SetNLInstructionsRequest.md)

### Return type

[**EurekaSetNLInstructionsResponse**](EurekaSetNLInstructionsResponse.md)

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="singleAnswer"></a>
# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)



 Version: 10.4.0.cl or later   Processes a natural language query against a specified data model and returns a single AI-generated answer without requiring a conversation session.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - &#x60;query&#x60;: a natural language question (e.g., \&quot;What were total sales last quarter?\&quot;) - &#x60;metadata_identifier&#x60;: the unique ID of the data source to query against  If the request is successful, the API returns a response message containing: - &#x60;session_identifier&#x60;: the unique ID of the generated response - &#x60;generation_number&#x60;: the generation number of the response - &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) - &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;, &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; / &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

