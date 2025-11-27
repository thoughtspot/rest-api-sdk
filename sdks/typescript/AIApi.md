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
[**sendAgentMessage**](AIApi.md#sendAgentMessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse | 
[**sendAgentMessageStreaming**](AIApi.md#sendAgentMessageStreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse | 
[**sendMessage**](AIApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse | 
[**setNLInstructions**](AIApi.md#setNLInstructions) | **POST** /api/rest/2.0/ai/instructions/set | 
[**singleAnswer**](AIApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create | 


# **createAgentConversation**
> AgentConversation createAgentConversation(createAgentConversationRequest)

Version: 10.13.0.cl or later 

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createConversation**
> Conversation createConversation(createConversationRequest)

 Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getDataSourceSuggestions**
> EurekaDataSourceSuggestionResponse getDataSourceSuggestions(getDataSourceSuggestionsRequest)

 Version: 10.13.0.cl or later   Provides relevant data source recommendations for a user-submitted natural language query.  To use this API, the user must have at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include a `query` string via the request body.  The returned results include metadata such as: - `confidence`: a float indicating the model\'s confidence in the relevance of each recommendation - `details`: includes `data_source_identifier`, `data_source_name`, and `description` of each recommended data source - `reasoning`: rationale provided by the LLM to explain why each data source was recommended  If the API request is successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant reasoning.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getNLInstructions**
> EurekaGetNLInstructionsResponse getNLInstructions(getNLInstructionsRequest)

 Version: 10.15.0.cl or later   This API allows users to retrieve existing natural language (NL) instructions for a specific data-model. These instructions guide the AI system in understanding data context and generating more accurate responses when processing natural language queries.  #### Usage guidelines  To retrieve NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID or name of the data-model to retrieve NL instructions  The API returns a response object with: - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for natural language processing   - `scope`: The scope of the instruction (`GLOBAL`). It can be extended to data-model-user scope in future.  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  > ###### Note: > * To use this API, the user needs atleast view access on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Use this API to view currently configured instructions before modifying them with `setNLInstructions`.     

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getRelevantQuestions**
> EurekaGetRelevantQuestionsResponse getRelevantQuestions(getRelevantQuestionsRequest)

 Version: 10.13.0.cl or later   Breaks down a user-submitted query into a series of analytical sub-questions using relevant contextual metadata.  To use this API, the user must have at least view-level access to the referenced metadata objects.  #### Usage guidelines  To accurately generate relevant questions, the request must include at least one of the following metadata identifiers within `metadata_context` : `conversation_identifier`, `answer_identifiers`, `liveboard_identifiers`, or `data_source_identifiers`.  You can further enhance the quality and precision of breakdown by providing additional `ai_context` such as:  - `content`: User provided content like text data, csv data as a string message to provide context & potentially improve the quality of the response. - `instructions`: User specific text instructions sent to AI system for processing the query.  Additional optional parameters include:  - `limit_relevant_questions`: Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. - `bypass_cache`: If set to true, forces fresh computation instead of returning cached results.  If the API request is successful, ThoughtSpot returns a list of relevant analytical queries, each aligned with the user\'s original question. Each returned question includes the query string, along with the identifier and name of the corresponding data source.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **queryGetDecomposedQuery**
> EurekaDecomposeQueryResponse queryGetDecomposedQuery(queryGetDecomposedQueryRequest)

Version: 10.7.0.cl or later 

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendAgentMessage**
> any sendAgentMessage(sendAgentMessageRequest)

 Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  The API returns a array of object with a type, message, and metadata. - `type`: Type of the message — text, answer, or error. - `message`: Main content of the response. - `metadata`: Additional info depending on the message type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendAgentMessageStreaming**
> SendAgentMessageResponse sendAgentMessageStreaming(sendAgentMessageStreamingRequest)

 Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  Additionally, user can specify what tool can be included `conversation_settings` parameter, which supports: - `enable_contextual_change_analysis` (default: false) - `enable_natural_language_answer_generation` (default: true) - `enable_reasoning` (default: false)  If the request is valid, the API returns a stream of messages in real time, including: - `ack`: confirms receipt of the request - `text / text-chunk`: content chunks, optionally formatted (e.g., markdown) - `answer`: the final structured response with metadata and analytics - `error`: if a failure occurs - `notification`: notification messages for operation being performed  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > * The streaming protocol uses Server-Sent Events (SSE)     

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **sendMessage**
> Array<ResponseMessage> sendMessage(sendMessageRequest)

 Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **setNLInstructions**
> EurekaSetNLInstructionsResponse setNLInstructions(setNLInstructionsRequest)

 Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  #### Usage guidelines  To set NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID or name of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  The API returns a response object with: - `success`: Boolean indicating whether the operation was successful  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally for that data-model across the system  > ###### Note: > * To use this API, the user needs either edit access or SPOTTER_COACHING_PRIVILEGE on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)

 Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

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
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

