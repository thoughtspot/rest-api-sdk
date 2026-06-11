# ThoughtSpotRestApiSdk.AIApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAgentConversation**](AIApi.md#createAgentConversation) | **POST** /api/rest/2.0/ai/agent/conversation/create | 
[**createConversation**](AIApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create | 
[**getDataSourceSuggestions**](AIApi.md#getDataSourceSuggestions) | **POST** /api/rest/2.0/ai/data-source-suggestions | 
[**getNLInstructions**](AIApi.md#getNLInstructions) | **POST** /api/rest/2.0/ai/instructions/get | 
[**getRelevantQuestions**](AIApi.md#getRelevantQuestions) | **POST** /api/rest/2.0/ai/relevant-questions/ | 
[**queryGetDecomposedQuery**](AIApi.md#queryGetDecomposedQuery) | **POST** /api/rest/2.0/ai/analytical-questions | 
[**sendAgentConversationMessage**](AIApi.md#sendAgentConversationMessage) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send | 
[**sendAgentConversationMessageStreaming**](AIApi.md#sendAgentConversationMessageStreaming) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream | 
[**sendAgentMessage**](AIApi.md#sendAgentMessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse | 
[**sendAgentMessageStreaming**](AIApi.md#sendAgentMessageStreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse | 
[**sendMessage**](AIApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse | 
[**setNLInstructions**](AIApi.md#setNLInstructions) | **POST** /api/rest/2.0/ai/instructions/set | 
[**singleAnswer**](AIApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create | 


# **createAgentConversation**
> AgentConversation createAgentConversation(createAgentConversationRequest)

  Version: 26.2.0.cl or later   Creates a new Spotter agent conversation based on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include the `metadata_context` parameter to define the conversation context. The context type can be one of:  - `DATA_SOURCE` *(available from 26.5.0.cl)*: targets a specific data source. Provide `data_source_identifier` in `data_source_context` for a single data source, or `data_source_identifiers` for multi-data-source context. The deprecated `guid` field is accepted for backwards compatibility. - `AUTO_MODE` *(available from 26.5.0.cl)*: automatically discovers and selects the most relevant datasets for the user\'s queries.  > **Note for callers on versions 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase `data_source` enum value with the `guid` field instead of the above. Example: `{ \"type\": \"data_source\", \"data_source_context\": { \"guid\": \"<worksheet-id>\" } }`.  The `conversation_settings` parameter controls which Spotter capabilities are enabled for the conversation:  - `enable_contextual_change_analysis` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_natural_language_answer_generation` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_reasoning` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_save_chat` (default: `false`, *available from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation history  If the request is successful, the response includes a unique `conversation_identifier` that must be passed to `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` to send messages within this conversation. The response also includes `conversation_id` with the same value for backwards compatibility; use `conversation_identifier` for new integrations.  #### Example request  ```json {   \"metadata_context\": {     \"type\": \"DATA_SOURCE\",     \"data_source_context\": {       \"data_source_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\"     }   },   \"conversation_settings\": {} } ```  #### Error responses  | Code | Description                                                                                                                             | | ---- | --------------------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > > - This endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version 26.5.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, CreateAgentConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.createAgentConversation(
  // CreateAgentConversationRequest
  {
    metadata_context: null,
    conversation_settings: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAgentConversationRequest** | **CreateAgentConversationRequest**|  |


### Return type

**AgentConversation**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createConversation**
> Conversation createConversation(createConversationRequest)

 Version: 10.4.0.cl or later   Creates a new conversation session tied to a specific data model for AI-driven natural language querying.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `metadata_identifier`: the unique ID of the data source that provides context for the conversation  Optionally, you can provide: - `tokens`: a token string to set initial context for the conversation (e.g., `\"[sales],[item type],[state]\"`)  If the request is successful, ThoughtSpot returns a unique `conversation_identifier` that must be passed to `sendMessage` to continue the conversation.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, CreateConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.createConversation(
  // CreateConversationRequest
  {
    metadata_identifier: "metadata_identifier_example",
    tokens: "tokens_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConversationRequest** | **CreateConversationRequest**|  |


### Return type

**Conversation**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getDataSourceSuggestions**
> EurekaDataSourceSuggestionResponse getDataSourceSuggestions(getDataSourceSuggestionsRequest)

 Version: 10.15.0.cl or later   Suggests the most relevant data sources for a given natural language query, ranked by confidence with LLM-generated reasoning.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include: - `query`: the natural language question to find relevant data sources for  If the request is successful, the API returns a ranked list of suggested data sources, each containing: - `confidence`: a float score indicating the model\'s confidence in the relevance of the suggestion - `details`: metadata about the data source   - `data_source_identifier`: the unique ID of the data source   - `data_source_name`: the display name of the data source   - `description`: a description of the data source - `reasoning`: LLM-generated rationale explaining why the data source was recommended  #### Error responses  | Code | Description                                                                                                                                | |------|--------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                       | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the underlying metadata entities. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, GetDataSourceSuggestionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.getDataSourceSuggestions(
  // GetDataSourceSuggestionsRequest
  {
    query: "query_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDataSourceSuggestionsRequest** | **GetDataSourceSuggestionsRequest**|  |


### Return type

**EurekaDataSourceSuggestionResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getNLInstructions**
> EurekaGetNLInstructionsResponse getNLInstructions(getNLInstructionsRequest)

 Version: 10.15.0.cl or later   Retrieves existing natural language (NL) instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - `data_source_identifier`: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - `nl_instructions_info`: an array of instruction objects, each containing:   - `instructions`: the configured text instructions for AI processing   - `scope`: the scope of the instruction — currently only `GLOBAL` is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Use this API to review currently configured instructions before modifying them with `setNLInstructions`.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, GetNLInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.getNLInstructions(
  // GetNLInstructionsRequest
  {
    data_source_identifier: "data_source_identifier_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getNLInstructionsRequest** | **GetNLInstructionsRequest**|  |


### Return type

**EurekaGetNLInstructionsResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getRelevantQuestions**
> EurekaGetRelevantQuestionsResponse getRelevantQuestions(getRelevantQuestionsRequest)

 Version: 10.13.0.cl or later   Breaks down a natural language query into a series of smaller analytical sub-questions, each mapped to a relevant data source.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request must include: - `query`: the natural language question to decompose into analytical sub-questions - `metadata_context`: at least one of the following context identifiers to guide question generation:   - `conversation_identifier` — an existing conversation session ID   - `answer_identifiers` — a list of Answer GUIDs   - `liveboard_identifiers` — a list of Liveboard GUIDs   - `data_source_identifiers` — a list of data source GUIDs  Optional parameters for refining the output: - `ai_context`: additional context to improve response quality   - `content` — supplementary text or CSV data as string input   - `instructions` — custom text instructions for the AI system - `limit_relevant_questions`: maximum number of questions to return (default: `5`) - `bypass_cache`: if `true`, forces fresh computation instead of returning cached results  If the request is successful, the API returns a list of relevant analytical questions, each containing: - `query`: the generated sub-question - `data_source_identifier`: the unique ID of the data source the question targets - `data_source_name`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, GetRelevantQuestionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.getRelevantQuestions(
  // GetRelevantQuestionsRequest
  {
    metadata_context: null,
    limit_relevant_questions: 1,
    bypass_cache: true,
    query: "query_example",
    ai_context: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getRelevantQuestionsRequest** | **GetRelevantQuestionsRequest**|  |


### Return type

**EurekaGetRelevantQuestionsResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **queryGetDecomposedQuery**
> EurekaDecomposeQueryResponse queryGetDecomposedQuery(queryGetDecomposedQueryRequest)

 Version: 10.7.0.cl or later   **Deprecated** — Use `getRelevantQuestions` instead (available from 10.13.0.cl).  Breaks down a topical or goal-oriented natural language question into smaller, actionable analytical sub-questions, each mapped to a relevant data source for independent execution.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request accepts the following parameters:  - `nlsRequest`: contains the user `query` to decompose, along with optional `instructions` and `bypassCache` flag - `worksheetIds`: list of data source identifiers to scope the decomposition - `answerIds`: list of Answer GUIDs whose data guides the response - `liveboardIds`: list of Liveboard GUIDs whose data guides the response - `conversationId`: an existing conversation session ID for context continuity - `content`: supplementary text or CSV data to improve response quality - `maxDecomposedQueries`: maximum number of sub-questions to return (default: `5`)  If the request is successful, the API returns a `decomposedQueryResponse` containing a list of `decomposedQueries`, each with: - `query`: the generated analytical sub-question - `worksheetId`: the unique ID of the data source the question targets - `worksheetName`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is deprecated since 10.13.0.cl. Use `getRelevantQuestions` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, QueryGetDecomposedQueryRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.queryGetDecomposedQuery(
  // QueryGetDecomposedQueryRequest
  {
    answerIds: [
      "answerIds_example",
    ],
    content: [
      "content_example",
    ],
    conversationId: "conversationId_example",
    liveboardIds: [
      "liveboardIds_example",
    ],
    maxDecomposedQueries: 1,
    nlsRequest: null,
    worksheetIds: [
      "worksheetIds_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryGetDecomposedQueryRequest** | **QueryGetDecomposedQueryRequest**|  |


### Return type

**EurekaDecomposeQueryResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendAgentConversationMessage**
> any sendAgentConversationMessage(sendAgentConversationMessageRequest)

  Version: 26.5.0.cl or later   Sends natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - `type`: the kind of response — `text`, `answer`, or `error` - `message`: the main content of the response - `metadata`: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - For real-time streamed responses, use `sendAgentConversationMessageStreaming` instead.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SendAgentConversationMessageRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.sendAgentConversationMessage(
  // string | Unique identifier for the conversation (used to track context)
  "conversation_identifier_example" , 
  // SendAgentConversationMessageRequest
  {
    messages: [
      "messages_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendAgentConversationMessageRequest** | **SendAgentConversationMessageRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier for the conversation (used to track context) | defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendAgentConversationMessageStreaming**
> SendAgentMessageResponse sendAgentConversationMessageStreaming(sendAgentConversationMessageStreamingRequest)

  Version: 26.5.0.cl or later   Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form `data: [{\"type\": \"...\", ...}]` — a JSON array of event objects. Event types include:  - `ack`: confirms receipt of the request (`node_id`) - `conv_title`: conversation title (`title`, `conv_id`) - `notification`: status updates on operations (`group_id`, `metadata`, `code` — e.g. `TOOL_CALL_NOTIFICATION`, `nls_start`, `FINAL_RESPONSE_NOTIFICATION`) - `text-chunk`: incremental content chunks (`id`, `group_id`, `metadata` with `format` and `type` such as `thinking` or `text`, `content`) - `text`: full text block with same structure as `text-chunk` - `answer`: structured answer with metadata (`id`, `group_id`, `metadata` with `sage_query`, `session_id`, `title`, etc., `title`) - `error`: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | | ---- | -------------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - The streaming protocol uses Server-Sent Events (SSE). > - For the complete response in a single payload, use `sendAgentConversationMessage` instead.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SendAgentConversationMessageStreamingRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.sendAgentConversationMessageStreaming(
  // string | Unique identifier for the conversation (used to track context)
  "conversation_identifier_example" , 
  // SendAgentConversationMessageStreamingRequest
  {
    messages: [
      "messages_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendAgentConversationMessageStreamingRequest** | **SendAgentConversationMessageStreamingRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier for the conversation (used to track context) | defaults to undefined


### Return type

**SendAgentMessageResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendAgentMessage**
> any sendAgentMessage(sendAgentMessageRequest)

 Version: 26.2.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead.  Send natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - `type`: the kind of response — `text`, `answer`, or `error` - `message`: the main content of the response - `metadata`: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is deprecated. Use `sendAgentConversationMessage` for new integrations. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SendAgentMessageRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.sendAgentMessage(
  // string | Unique identifier for the conversation (used to track context)
  "conversation_identifier_example" , 
  // SendAgentMessageRequest
  {
    messages: [
      "messages_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendAgentMessageRequest** | **SendAgentMessageRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier for the conversation (used to track context) | defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendAgentMessageStreaming**
> SendAgentMessageResponse sendAgentMessageStreaming(sendAgentMessageStreamingRequest)

 Version: 26.2.0.cl or later   **Deprecated** — Use `sendAgentConversationMessageStreaming` instead.  Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form `data: [{\"type\": \"...\", ...}]` — a JSON array of event objects. Event types include:  - `ack`: confirms receipt of the request (`node_id`) - `conv_title`: conversation title (`title`, `conv_id`) - `notification`: status updates on operations (`group_id`, `metadata`, `code` — e.g. `TOOL_CALL_NOTIFICATION`, `nls_start`, `FINAL_RESPONSE_NOTIFICATION`) - `text-chunk`: incremental content chunks (`id`, `group_id`, `metadata` with `format` and `type` such as `thinking` or `text`, `content`) - `text`: full text block with same structure as `text-chunk` - `answer`: structured answer with metadata (`id`, `group_id`, `metadata` with `sage_query`, `session_id`, `title`, etc., `title`) - `error`: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is deprecated. Use `sendAgentConversationMessageStreaming` for new integrations. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - The streaming protocol uses Server-Sent Events (SSE).      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SendAgentMessageStreamingRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.sendAgentMessageStreaming(
  // SendAgentMessageStreamingRequest
  {
    conversation_identifier: "conversation_identifier_example",
    messages: [
      "messages_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendAgentMessageStreamingRequest** | **SendAgentMessageStreamingRequest**|  |


### Return type

**SendAgentMessageResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendMessage**
> Array<ResponseMessage> sendMessage(sendMessageRequest)

 Version: 10.4.0.cl or later   Sends a follow-up message to an existing conversation within the context of a data model.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request. A conversation must first be created using the `createConversation` API.  #### Usage guidelines  The request must include: - `conversation_identifier`: the unique session ID returned by `createConversation` - `metadata_identifier`: the unique ID of the data source used for the conversation - `message`: a natural language string with the follow-up question  If the request is successful, the API returns an array of response messages, each containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SendMessageRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.sendMessage(
  // string | Unique identifier of the conversation.
  "conversation_identifier_example" , 
  // SendMessageRequest
  {
    metadata_identifier: "metadata_identifier_example",
    message: "message_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendMessageRequest** | **SendMessageRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation. | defaults to undefined


### Return type

**Array<ResponseMessage>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **setNLInstructions**
> EurekaSetNLInstructionsResponse setNLInstructions(setNLInstructionsRequest)

 Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - `data_source_identifier`: The unique ID of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - `success`: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SetNLInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.setNLInstructions(
  // SetNLInstructionsRequest
  {
    data_source_identifier: "data_source_identifier_example",
    nl_instructions_info: [
      {
        instructions: [
          "instructions_example",
        ],
        scope: "GLOBAL",
      },
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setNLInstructionsRequest** | **SetNLInstructionsRequest**|  |


### Return type

**EurekaSetNLInstructionsResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)

 Version: 10.4.0.cl or later   Processes a natural language query against a specified data model and returns a single AI-generated answer without requiring a conversation session.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `query`: a natural language question (e.g., \"What were total sales last quarter?\") - `metadata_identifier`: the unique ID of the data source to query against  If the request is successful, the API returns a response message containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SingleAnswerRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.singleAnswer(
  // SingleAnswerRequest
  {
    query: "query_example",
    metadata_identifier: "metadata_identifier_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **singleAnswerRequest** | **SingleAnswerRequest**|  |


### Return type

**ResponseMessage**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Common successful response |  -  |
**201** | Common error response |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

