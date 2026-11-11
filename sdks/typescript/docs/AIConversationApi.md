# ThoughtSpotRestApiSdk.AIConversationApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAgentConversation**](AIConversationApi.md#createAgentConversation) | **POST** /api/rest/2.0/ai/agent/conversation/create | 
[**createConversation**](AIConversationApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create | 
[**getDataSourceSuggestions**](AIConversationApi.md#getDataSourceSuggestions) | **POST** /api/rest/2.0/ai/data-source-suggestions | 
[**getRelevantQuestions**](AIConversationApi.md#getRelevantQuestions) | **POST** /api/rest/2.0/ai/relevant-questions/ | 
[**loadAnswer**](AIConversationApi.md#loadAnswer) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details | 
[**queryGetDecomposedQuery**](AIConversationApi.md#queryGetDecomposedQuery) | **POST** /api/rest/2.0/ai/analytical-questions | 
[**sendAgentConversationMessage**](AIConversationApi.md#sendAgentConversationMessage) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send | 
[**sendAgentConversationMessageStreaming**](AIConversationApi.md#sendAgentConversationMessageStreaming) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream | 
[**sendAgentMessage**](AIConversationApi.md#sendAgentMessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse | 
[**sendAgentMessageStreaming**](AIConversationApi.md#sendAgentMessageStreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse | 
[**sendMessage**](AIConversationApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse | 
[**singleAnswer**](AIConversationApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create | 
[**stopConversation**](AIConversationApi.md#stopConversation) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response | 


# **createAgentConversation**
> AgentConversation createAgentConversation(createAgentConversationRequest)

  Version: 26.2.0.cl or later   Creates a new Spotter agent conversation based on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  The two versions differ in which creation settings they accept and in how validation errors are reported. See the sections below for each version\'s requests and responses.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  <details> <summary>When <code>spotter_experience_version</code> is <code>V2</code></summary>  Conversations can carry `additional_instructions`, and of `conversation_settings` only `enable_save_chat` is used.  Before you send requests, confirm that the cluster\'s **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**. If it isn\'t, requests return a `400`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/create`  ```json {   \"spotter_experience_version\": \"V2\",   \"metadata_context\": {     \"type\": \"DATA_SOURCE\",     \"data_source_context\": {       \"data_source_identifiers\": [\"a1b2c3d4-e5f6-7890-abcd-ef1234567890\"]     }   },   \"additional_instructions\": \"Answer concisely and always report revenue in thousands.\",   \"conversation_settings\": { \"enable_save_chat\": true } } ```  - `spotter_experience_version` *(required for this version)*: `V2`. A request that omits it runs on `V1`, the default, so pass it here and on every later request for the conversation. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - The conversation context, defined by exactly one of:   - `metadata_context`: defines the conversation context by data source. The context type can be one of:     - `DATA_SOURCE`: targets a specific data source. Provide `data_source_identifier` in `data_source_context` for a single data source, or `data_source_identifiers` for multi-data-source context. The deprecated `guid` field is accepted for backwards compatibility.     - `AUTO_MODE`: automatically discovers and selects the most relevant datasets for the user\'s queries.   - `analyst_identifier`: unique identifier of a Spotter Analyst to start the conversation from. The conversation uses the analyst\'s configuration — its data sources, agent instructions, and connectors — so `metadata_context` must be omitted. The caller must be the analyst\'s author, have the analyst shared with them, or hold admin / Spotter-management privileges.    Passing both `analyst_identifier` and `metadata_context`, or neither, returns a `400`. - `additional_instructions` *(optional, this version only)*: guidance appended to the agent\'s instructions on every message in this conversation. Use it to set a persona, a preferred output format, or domain rules. It cannot be changed after the conversation is created, and it is sent with every message, so keep it short. Not allowed with `analyst_identifier`, since the analyst brings its own instructions. - `conversation_settings` *(optional)*: only `enable_save_chat` applies (default: `false`). When `true`, the conversation appears in `getConversationList` once it has messages. When `false`, it is kept out of the list but can still be continued and deleted by its identifier. The other settings are ignored.  ##### Response  ```json {   \"conversation_id\": \"8401773265129884672\",   \"conversation_identifier\": \"8401773265129884672\",   \"analyst_id\": null } ```  - `conversation_identifier`: pass it to `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` to send messages in this conversation, together with `spotter_experience_version` `V2`. Treat it as an opaque string: store and return it as received rather than parsing or validating its shape. - `conversation_id`: the same value, kept for backwards compatibility; use `conversation_identifier` for new integrations. - `analyst_id`: the analyst\'s ID when the conversation is started from an analyst; `null` otherwise.  Validation failures return `400`. A data source or analyst that does not exist or that the caller cannot view is reported as a `400` that lists those identifiers.  </details>  <details> <summary>When <code>spotter_experience_version</code> is <code>V1</code></summary>  Use this version only if your cluster must stay on the previous experience. New Spotter capabilities ship in `V2`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/create`  ```json {   \"spotter_experience_version\": \"V1\",   \"metadata_context\": {     \"type\": \"DATA_SOURCE\",     \"data_source_context\": {       \"data_source_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\"     }   },   \"conversation_settings\": { \"enable_save_chat\": true } } ```  - `spotter_experience_version` *(optional)*: `V1`, the default. A request that omits it runs on this version. - The conversation context, defined by exactly one of:   - `metadata_context`: defines the conversation context by data source. The context type can be one of:     - `DATA_SOURCE` *(available from 26.5.0.cl)*: targets a specific data source. Provide `data_source_identifier` in `data_source_context` for a single data source, or `data_source_identifiers` for multi-data-source context. The deprecated `guid` field is accepted for backwards compatibility.     - `AUTO_MODE` *(available from 26.5.0.cl)*: automatically discovers and selects the most relevant datasets for the user\'s queries.   - `analyst_identifier` *(available from 26.10.0.cl)*: unique identifier of a Spotter Analyst to start the conversation from. The conversation uses the analyst\'s configuration — its data sources, agent instructions, and connectors — so `metadata_context` must be omitted. The caller must be the analyst\'s author, have the analyst shared with them, or hold admin / Spotter-management privileges.    Passing both `analyst_identifier` and `metadata_context`, or neither, returns a `422`. - `conversation_settings` *(optional)*: controls which Spotter capabilities are enabled for the conversation:   - `enable_contextual_change_analysis` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled; setting this to `false` has no effect on versions >= 26.2.0.cl   - `enable_natural_language_answer_generation` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled; setting this to `false` has no effect on versions >= 26.2.0.cl   - `enable_reasoning` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled; setting this to `false` has no effect on versions >= 26.2.0.cl   - `enable_save_chat` (default: `false`, *available from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation history - `additional_instructions`: not available in this version; returns a `400`.  > **Note for callers on versions 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase `data_source` enum value with the `guid` field instead of the above. Example: `{ \"type\": \"data_source\", \"data_source_context\": { \"guid\": \"<worksheet-id>\" } }`.  ##### Response  ```json {   \"conversation_id\": \"wwHQ5j8O8dQC\",   \"conversation_identifier\": \"wwHQ5j8O8dQC\",   \"analyst_id\": null } ```  - `conversation_identifier`: pass it to `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` to send messages in this conversation. Treat it as an opaque string: store and return it as received rather than parsing or validating its shape. - `conversation_id`: the same value, kept for backwards compatibility; use `conversation_identifier` for new integrations. - `analyst_id`: the analyst\'s ID when the conversation is started from an analyst; `null` otherwise.  Validation failures return `422`, and an `analyst_identifier` that does not exist in the caller\'s Org returns `404`.  </details>  #### Error responses  | Code | Description                                                                                                                             | | ---- | --------------------------------------------------------------------------------------------------------------------------------------- | | 400  | Bad request — `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, `additional_instructions` is set on `V1` or with `analyst_identifier`, or, on `V2`, the request fails validation. | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks view permission on the specified metadata object, or has no access to the analyst specified in `analyst_identifier`. | | 404  | Not found — on `V1`, no analyst with the given `analyst_identifier` exists in the caller\'s Org.                                                          | | 422  | Unprocessable entity — on `V1`, the request fails validation: both `analyst_identifier` and `metadata_context` were provided, neither was provided, or `metadata_context` is malformed (for example, `DATA_SOURCE` context without a data source identifier). |  > ###### Note: > > - This endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version 26.5.0.cl. > - `spotter_experience_version`, `additional_instructions` and `V2` support are in Beta from 26.12.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, CreateAgentConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

apiInstance.createAgentConversation(
  // CreateAgentConversationRequest
  {
    metadata_context: null,
    conversation_settings: null,
    analyst_identifier: "analyst_identifier_example",
    additional_instructions: "additional_instructions_example",
    spotter_experience_version: "V1",
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

 Version: 10.4.0.cl or later   **Deprecated** — Use `createAgentConversation` instead.  Creates a new conversation session tied to a specific data model for AI-driven natural language querying.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `metadata_identifier`: the unique ID of the data source that provides context for the conversation  Optionally, you can provide: - `tokens`: a token string to set initial context for the conversation (e.g., `\"[sales],[item type],[state]\"`)  If the request is successful, ThoughtSpot returns a unique `conversation_identifier` that must be passed to `sendMessage` to continue the conversation.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl. Use `createAgentConversation` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, CreateConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

 Version: 10.15.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead. Spotter selects the data source within the conversation.  Suggests the most relevant data sources for a given natural language query, ranked by confidence with LLM-generated reasoning.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include: - `query`: the natural language question to find relevant data sources for  If the request is successful, the API returns a ranked list of suggested data sources, each containing: - `confidence`: a float score indicating the model\'s confidence in the relevance of the suggestion - `details`: metadata about the data source   - `data_source_identifier`: the unique ID of the data source   - `data_source_name`: the display name of the data source   - `description`: a description of the data source - `reasoning`: LLM-generated rationale explaining why the data source was recommended  #### Error responses  | Code | Description                                                                                                                                | |------|--------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                       | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the underlying metadata entities. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, GetDataSourceSuggestionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

# **getRelevantQuestions**
> EurekaGetRelevantQuestionsResponse getRelevantQuestions(getRelevantQuestionsRequest)

 Version: 10.13.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead. Spotter decomposes the question within the conversation.  Breaks down a natural language query into a series of smaller analytical sub-questions, each mapped to a relevant data source.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request must include: - `query`: the natural language question to decompose into analytical sub-questions - `metadata_context`: at least one of the following context identifiers to guide question generation:   - `conversation_identifier` — an existing conversation session ID   - `answer_identifiers` — a list of Answer GUIDs   - `liveboard_identifiers` — a list of Liveboard GUIDs   - `data_source_identifiers` — a list of data source GUIDs  Optional parameters for refining the output: - `ai_context`: additional context to improve response quality   - `content` — supplementary text or CSV data as string input   - `instructions` — custom text instructions for the AI system - `limit_relevant_questions`: maximum number of questions to return (default: `5`) - `bypass_cache`: if `true`, forces fresh computation instead of returning cached results  If the request is successful, the API returns a list of relevant analytical questions, each containing: - `query`: the generated sub-question - `data_source_identifier`: the unique ID of the data source the question targets - `data_source_name`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, GetRelevantQuestionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

# **loadAnswer**
> LoadAnswerResponse loadAnswer()

 Loads the full answer payload for a specific answer item in an agent conversation. Returns structured answer data including the TML query, token breakdown, visualization metadata, and agent context state. Pass the `answer_id` from an `AnswerResponseItem` in the `getConversation` response as the `answer_identifier` parameter. Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.    Version: 26.7.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead, which returns answers in the conversation response.  Loads the answer details for a specific answer item in an agent conversation. Returns structured answer data including the TML token list, visualization metadata, and agent context state. Use this endpoint to retrieve the full answer representation for an answer item — for example, to re-render a chart, export a query, or inspect the generated TML.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation, as returned by `createAgentConversation` - `answer_identifier` *(path parameter)*: the `answer_id` field from an `AnswerResponseItem` in the `getConversation` response  If the request is successful, the response contains an `answer` object with the following fields:  | Field | Type | Description | |-------|------|-------------| | `title` | `String` | Display title of the generated answer (e.g., `\"sales by month\"`). | | `description` | `String` | Optional description of the answer. | | `session_identifier` | `String` | Unique identifier of the session in which this answer was generated. | | `generation_number` | `Int` | Generation sequence number of this answer within the session. | | `tokens` | `[String]` | Ordered list of TML token strings that make up the answer query (e.g., `[\"[sales]\", \"[date].\'monthly\'\"]`). | | `visualization_type` | `VizType` | Suggested visualization type: `Chart`, `Table`, or `Undefined`. `null` if no suggestion is available. | | `formulas` | `[String]` | List of formula names referenced in the answer. Empty if none are used. | | `parameters` | `[String]` | List of parameter names applied to the answer. Empty if none are used. | | `sub_queries` | `[JSON]` | List of sub-query objects used in the answer. Empty if none are present. | | `ac_state` | `ACState` | Agent context state, including `transaction_identifier` and `generation_number`, used to correlate this answer with a specific agent turn. |  #### ACState fields  | Field | Type | Description | |-------|------|-------------| | `transaction_identifier` | `String` | Unique identifier of the agent transaction that produced this answer. | | `generation_number` | `Int` | Generation number within the transaction. |  #### Example request  ```bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details ```  #### Example response  ```json {   \"answer\": {     \"title\": \"sales by month\",     \"description\": \"\",     \"session_identifier\": \"7b00b801-73f4-4639-af5e-e775584ceba6\",     \"generation_number\": 1,     \"tokens\": [\"[sales]\", \"[date].\'monthly\'\"],     \"visualization_type\": null,     \"formulas\": [],     \"parameters\": [],     \"sub_queries\": [],     \"ac_state\": {       \"transaction_identifier\": \"7f6c9948-b4c7-4098-bb1f-6c67bc0e5699\",       \"generation_number\": 1     }   } } ```  #### Typical usage scenario  1. Call `getConversation` to retrieve the full conversation history. 2. Locate an `AnswerResponseItem` in `response_items` — note its `answer_id` field. 3. Call `loadAnswer` with the `conversation_identifier` and `answer_id` as `answer_identifier`. 4. The returned `tokens` array can be used to open the answer in the ThoughtSpot search interface or rendered as pill chips in the UI.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation or message exists with the given identifiers for the authenticated user. | | 422  | Unprocessable Entity — the message does not contain an answer of the expected type. |  > ###### Note: > > - This endpoint is deprecated from 26.12.0.cl. Use `sendAgentConversationMessage` for new integrations. > - This endpoint only loads answer-type messages. Other message types are not supported. > - `visualization_type` may be `null` if the agent did not produce a visualization suggestion for this answer. > - `formulas`, `parameters`, and `sub_queries` are returned as empty arrays when not applicable — they are never `null`. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, LoadAnswerRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

apiInstance.loadAnswer(
  // string | Unique identifier of the conversation.
  "conversation_identifier_example" , 
  // string | Unique identifier of the answer to load. Use the `answer_id` field from an `AnswerResponseItem` returned by `getConversation`.
  "answer_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation. | defaults to undefined
 **answerIdentifier** | [**string**] | Unique identifier of the answer to load. Use the &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; returned by &#x60;getConversation&#x60;. | defaults to undefined


### Return type

**LoadAnswerResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

 Version: 10.7.0.cl or later        

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, QueryGetDecomposedQueryRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

  Version: 26.5.0.cl or later   Sends natural language messages to a Spotter agent conversation and returns the complete response synchronously.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`.  Use this when you want the finished answer in a single response — a scheduled job, a server-side integration, or any caller that cannot consume Server-Sent Events. For a response that arrives progressively, use `sendAgentConversationMessageStreaming` instead.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  The two versions differ in the response shape: `AgentTurnResponse`, a list of events, on `V2`, and `AgentMessagesResponse`, a list of messages, on `V1`. See the sections below for each version\'s requests and responses.  The response is declared as a JSON object, so SDK methods return it untyped. For typed access, deserialize it into the `SendAgentConversationMessageResponse` schema, which is one of `AgentMessagesResponse` or `AgentTurnResponse`.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  <details> <summary>When <code>spotter_experience_version</code> is <code>V2</code></summary>  The response collects every event of the turn into one `events` array, and a message can be sent without a conversation identifier to start a new conversation.  Before you send requests, confirm that the cluster\'s **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**. If it isn\'t, requests return a `400`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send`, or `POST /api/rest/2.0/ai/agent/conversation/send` to start a new conversation  ```json {   \"spotter_experience_version\": \"V2\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(required for this version)*: `V2`. A request that omits it runs on `V1`, the default, so pass it on every request for the conversation. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - `conversation_identifier` *(path parameter, optional)*: the conversation to send the messages in, as returned by `createAgentConversation`. Omit the segment — `POST /api/rest/2.0/ai/agent/conversation/send` — to ask a one-off question. A conversation is created automatically, and its identifier is returned in the response body and in the `x-conversation-identifier` response header, so a follow-up can continue it. The new conversation is not saved: it does not appear in `getConversationList`, but it can be continued by its identifier. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  ##### Response  ```json {   \"conversation_identifier\": \"5612260428840173568\",   \"events\": [     { \"tool_call\": { \"id\": \"toolu_01AMjCrr\", \"name\": \"spotter_tools_fetch_and_visualize_data\" } },     { \"progress\": { \"code\": \"TML_GEN\", \"tool_call_id\": \"toolu_01AMjCrr\" } },     { \"tool_result\": { \"id\": \"toolu_01AMjCrr\", \"answer\": { \"session_id\": \"c5c25b33\" } } },     {       \"event\": {         \"content\": { \"role\": \"model\", \"parts\": [{ \"text\": \"Sales were highest in the West.\" }] }       }     },     { \"done\": { \"conversation_identifier\": \"5612260428840173568\" } }   ] } ```  This endpoint waits for Spotter to finish, so the request stays open for the length of the turn — commonly 10-60 seconds, longer for a question that runs several queries. Set your client\'s read timeout to several minutes; a turn that runs too long is ended with a `504`.  `events` contains exactly what the streaming endpoint publishes on `V2`, in the same order, collected into an array. Every key and its meaning is documented under `sendAgentConversationMessageStreaming` — `event`, `tool_call`, `progress`, `tool_result`, `error` and `done`.  To render the answer, concatenate `parts[].text` from each `event` frame in order, skipping parts marked `thought: true` if you do not want to show Spotter\'s reasoning. Text is published once — no part repeats content from an earlier one.  A turn that failed carries an `error` frame; `done` reports that the turn ended, not that it succeeded. An `event` can also carry an `error_code` when Spotter failed while producing that event; the streaming endpoint explains how the two differ.  </details>  <details> <summary>When <code>spotter_experience_version</code> is <code>V1</code></summary>  Use this version only if your cluster must stay on the previous experience. New Spotter capabilities ship in `V2`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send`  ```json {   \"spotter_experience_version\": \"V1\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(optional)*: `V1`, the default. A request that omits it runs on this version. - `conversation_identifier` *(path parameter, required)*: the conversation to send the messages in, as returned by `createAgentConversation`. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  ##### Response  ```json {   \"messages\": [     { \"type\": \"text\", \"text\": \"Sales were highest in the West.\", \"metadata\": {} }   ] } ```  The response contains a `messages` array, in order. Each message has:  - `type`: the kind of message — `text`, `answer`, `error`, and others - `metadata`: additional information depending on the type (for example, answer metadata includes analytics and visualization details) - the fields of that type: `text` for a `text` message, `title` and `session_id` for an `answer`, `code` and `message` for an `error`  </details>  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 400  | Bad request — `messages` is missing or invalid, `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, the conversation identifier is malformed on `V2` (it must be letters, digits, `-` and `_`), or the conversation identifier is omitted on `V1`. | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. | | 404  | Not found — on `V2`, no conversation with the given identifier exists for this user, or it belongs to another user. | | 504  | Gateway timeout — on `V2`, the turn did not finish in the time allowed. Retry, or use `sendAgentConversationMessageStreaming` for questions that run long. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - `spotter_experience_version`, the optional conversation identifier and `V2` support are in Beta from 26.12.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - For real-time streamed responses, use `sendAgentConversationMessageStreaming` instead.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, SendAgentConversationMessageRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

apiInstance.sendAgentConversationMessage(
  // string | Unique identifier of the conversation. Optional: on V2, omit this path segment to start a new conversation; its identifier is returned in the response and the `x-conversation-identifier` header.
  "conversation_identifier_example" , 
  // SendAgentConversationMessageRequest
  {
    messages: [
      "messages_example",
    ],
    spotter_experience_version: "V1",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendAgentConversationMessageRequest** | **SendAgentConversationMessageRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation. Optional: on V2, omit this path segment to start a new conversation; its identifier is returned in the response and the &#x60;x-conversation-identifier&#x60; header. | defaults to undefined


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
> SendAgentConversationMessageStreaming200Response | any sendAgentConversationMessageStreaming(sendAgentConversationMessageStreamingRequest)

  Version: 26.5.0.cl or later   Sends one or more natural language messages to a Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  The two versions differ in the events the stream carries. See the sections below for each version\'s requests and responses.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  <details> <summary>When <code>spotter_experience_version</code> is <code>V2</code></summary>  Each event is a single JSON object with one top-level key, and a message can be sent without a conversation identifier to start a new conversation.  Before you send requests, confirm that the cluster\'s **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**. If it isn\'t, requests return a `400`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream`, or `POST /api/rest/2.0/ai/agent/conversation/send/stream` to start a new conversation  ```json {   \"spotter_experience_version\": \"V2\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(required for this version)*: `V2`. A request that omits it runs on `V1`, the default, so pass it on every request for the conversation. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - `conversation_identifier` *(path parameter, optional)*: the conversation to send the messages in, as returned by `createAgentConversation`. Omit the segment — `POST /api/rest/2.0/ai/agent/conversation/send/stream` — to ask a one-off question. A conversation is created automatically, and its identifier is returned in the `x-conversation-identifier` response header and in the final `done` event, so a follow-up can continue it. The new conversation is not saved: it does not appear in `getConversationList`, but it can be continued by its identifier. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  Send `Accept: text/event-stream` and read the response incrementally. With `curl`, use `-N` to disable buffering.  ##### Response  Each event is a `data:` line carrying a single JSON object, with exactly one top-level key:  | Key           | Meaning                                                             | | ------------- | ------------------------------------------------------------------- | | `event`       | Text from Spotter — its reasoning or its answer.                    | | `tool_call`   | Spotter started a step, such as querying a data source.             | | `progress`    | A stage of a step in flight, so you can show what Spotter is doing. | | `tool_result` | A step finished; carries its result, including any answer produced. | | `error`       | The turn failed.                                                    | | `done`        | End of turn. Always last.                                           |  A turn that queries data runs them in this order:  ``` tool_call  →  progress (several)  →  tool_result  →  event (the answer text)  →  done ```  `tool_call`, `progress` and `tool_result` for one step share a `tool_call_id`, so you can group them. A turn may run several steps, or none.  Ignore any key you don\'t recognise — new event types may be added.  Lines beginning with `:` are SSE keep-alive comments. They carry no data and exist only to hold the connection open while Spotter is thinking — standard SSE clients discard them automatically, and a hand-written client should skip any line starting with `:`.  An event with content has the shape:  ```json {   \"event\": {     \"id\": \"c506785a-0493-4273-97c0-128ab2bdd7aa\",     \"invocation_id\": \"e-613f7481-2ddf-4b6b-8b60-5e2d10c8c974\",     \"partial\": true,     \"content\": {       \"role\": \"model\",       \"parts\": [{ \"text\": \" asking for data\", \"thought\": true }]     }   } } ```  - `parts[].text` carries the text to render. Text arrives incrementally, so concatenate parts in the order received. - `parts[].thought` is `true` when the text is Spotter\'s reasoning rather than its answer. Use it to render reasoning separately, or to hide it. - `partial` is `true` for an incremental chunk and `false` for a frame that restates the accumulated text of a completed segment. - `invocation_id` is stable for one turn; `id` identifies a single event.  ###### Steps: tool_call, progress, tool_result  When Spotter needs to do something — query a data source, run code — it reports the step as it happens.  **`tool_call`** announces the step and the arguments it ran with:  ```json {   \"tool_call\": {     \"id\": \"toolu_01AMjCrr\",     \"name\": \"spotter_tools_fetch_and_visualize_data\",     \"args\": {       \"dataset_id\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\",       \"english_query\": \"total sales by region last quarter\"     }   } } ```  **`progress`** reports each stage while the step runs:  ```json {   \"progress\": {     \"code\": \"ANSWER_GEN\",     \"message\": \"Verifying results with the Trust Layer\",     \"tool_call_id\": \"toolu_01AMjCrr\"   } } ```  `message` is human-facing text you can show directly; it is absent for stages that have none. Treat an unfamiliar `code` as \"still working\" rather than an error.  **`tool_result`** carries what the step produced:  ```json {   \"tool_result\": {     \"id\": \"toolu_01AMjCrr\",     \"name\": \"spotter_tools_fetch_and_visualize_data\",     \"is_error\": false,     \"text\": \"**total sales by region last quarter**\\nTML query: `[sales] [region] [date] = \'last quarter\'`\\n...\",     \"answer\": {       \"title\": \"total sales by region last quarter\",       \"session_id\": \"c5c25b33-74b8-4e83-b7f3-f7f384323903\",       \"gen_no\": 2,       \"transaction_id\": \"6fafbc09-1b08-4c49-a017-fa331612a76f\",       \"worksheet_id\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\",       \"sage_query\": \"[sales] [region] [date] = \'last quarter\'\",       \"visualization\": { \"chart_type\": \"ADVANCED_COLUMN\" },       \"table_data\": { \"total_rows\": 5, \"columns\": [{ \"name\": \"region\", \"type\": \"ATTRIBUTE\" }] }     }   } } ```  - `text` is the step\'s own human-readable summary. For a data query it includes a sample of the rows — a sample, not the result set; read `answer.table_data.total_rows` for the true count. - `answer` is present when the step produced a ThoughtSpot answer. Use `session_id` with `gen_no` to fetch or deep-link it, and `sage_query` to show how the question was interpreted. - `is_error` is `true` when the step failed. Spotter usually explains the failure in the text that follows, so this is a signal to read rather than a reason to stop.  `args` and `answer` are forwarded as the backend produces them, so both may carry fields not listed here, and may gain more over time. Read the fields you need and ignore the rest.  ###### End of turn  The stream ends with a terminal event:  ```json { \"done\": { \"conversation_identifier\": \"5612260428840173568\" } } ```  Nothing follows it. Treat its arrival — not the socket closing — as the signal that the turn is complete: a stream that ends _without_ a `done` event was interrupted, and whatever text arrived before it is partial. This is the only way to distinguish a finished answer from a truncated one.  `done` reports that the stream completed, not that the turn succeeded; a turn that emitted an `error` event still ends with `done`. Check for an `error` event to determine the outcome.  The `conversation_identifier` is repeated here so a client that cannot read response headers — a browser `EventSource`, for example — can still continue a conversation it created by omitting the conversation identifier.  ###### Errors during a turn  If the turn fails after streaming has begun, an event carries an error instead of content:  ```json {   \"error\": {     \"code\": \"409\",     \"source\": \"transport\",     \"display_message\": \"Another request is still running in this conversation.\",     \"error_bucket\": \"RETRY\"   } } ```  Render `display_message`. `code` is always a string; quote it when reporting an issue. Branch on `error_bucket`: `RETRY` (retry the request), `REFRESH` (reload and retry), `NEW_CHAT` (start a new conversation), `SUPPORT` (contact support). Treat any unrecognized value as `SUPPORT`.  A conversation that does not exist, or that belongs to another user, is reported the same way: an `error` event with `code` `\"404\"` and `error_bucket` `NEW_CHAT`, after a `200` response has started. The two cases cannot be told apart.  A failure at the transport layer after streaming has begun cannot be surfaced as an HTTP error; in that case the stream will end with only a `done` event and no `error` event.  A failure can also be reported on an `event` itself, when Spotter fails while producing that event. Its `error_code` is set and its `parts` are empty:  ```json {   \"event\": {     \"id\": \"c506785a-0493-4273-97c0-128ab2bdd7aa\",     \"invocation_id\": \"e-613f7481-2ddf-4b6b-8b60-5e2d10c8c974\",     \"error_code\": \"MALFORMED_FUNCTION_CALL\",     \"content\": { \"role\": \"model\", \"parts\": [] }   } } ```  The two report different things:  | Where                     | What failed                                                                   | What to do                                                                   | | ------------------------- | ----------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | | `error` frame             | The turn as a whole. Carries `display_message` and `error_bucket`.            | Show `display_message` and act on `error_bucket`.                            | | `event` with `error_code` | One event, while Spotter was producing it. Carries only the code, no message. | Treat the event as having no text. If an `error` frame follows, act on that. |  `error_code` is diagnostic, not a fixed set of values: quote it when reporting an issue rather than branching on it.  </details>  <details> <summary>When <code>spotter_experience_version</code> is <code>V1</code></summary>  Use this version only if your cluster must stay on the previous experience. New Spotter capabilities ship in `V2`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream`  ```json {   \"spotter_experience_version\": \"V1\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(optional)*: `V1`, the default. A request that omits it runs on this version. - `conversation_identifier` *(path parameter, required)*: the conversation to send the messages in, as returned by `createAgentConversation`. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  Send `Accept: text/event-stream` and read the response incrementally. With `curl`, use `-N` to disable buffering.  ##### Response  Each line has the form `data: [{\"type\": \"...\", ...}]` — a JSON array of event objects. Event types include:  - `ack`: confirms receipt of the request (`node_id`) - `conv_title`: conversation title (`title`, `conv_id`) - `notification`: status updates on operations (`group_id`, `metadata`, `code` — e.g. `TOOL_CALL_NOTIFICATION`, `nls_start`, `FINAL_RESPONSE_NOTIFICATION`) - `text-chunk`: incremental content chunks (`id`, `group_id`, `metadata` with `format` and `type` such as `thinking` or `text`, `content`) - `text`: full text block with same structure as `text-chunk` - `answer`: structured answer with metadata (`id`, `group_id`, `metadata` with `sage_query`, `session_id`, `title`, etc., `title`) - `error`: if a failure occurs  </details>  #### Error responses  Errors detected before streaming begins are returned as a normal HTTP response.  | Code | Description                                                                                                                      | | ---- | -------------------------------------------------------------------------------------------------------------------------------- | | 400  | Bad request — `messages` is missing or invalid, `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, the conversation identifier is malformed on `V2` (it must be letters, digits, `-` and `_`), or the conversation identifier is omitted on `V1`. | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - `spotter_experience_version`, the optional conversation identifier and `V2` support are in Beta from 26.12.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - The streaming protocol uses Server-Sent Events (SSE). > - For the complete response in a single payload, use `sendAgentConversationMessage` instead.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, SendAgentConversationMessageStreamingRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

apiInstance.sendAgentConversationMessageStreaming(
  // string | Unique identifier of the conversation. Optional: on V2, omit this path segment to start a new conversation; its identifier is returned in the response and the `x-conversation-identifier` header.
  "conversation_identifier_example" , 
  // SendAgentConversationMessageStreamingRequest
  {
    messages: [
      "messages_example",
    ],
    spotter_experience_version: "V1",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendAgentConversationMessageStreamingRequest** | **SendAgentConversationMessageStreamingRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation. Optional: on V2, omit this path segment to start a new conversation; its identifier is returned in the response and the &#x60;x-conversation-identifier&#x60; header. | defaults to undefined


### Return type

**SendAgentConversationMessageStreaming200Response | any**

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

 Version: 26.2.0.cl or later        

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, SendAgentMessageRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

 Version: 26.2.0.cl or later        

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, SendAgentMessageStreamingRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

 Version: 10.4.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead.  Sends a follow-up message to an existing conversation within the context of a data model.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request. A conversation must first be created using the `createConversation` API.  #### Usage guidelines  The request must include: - `conversation_identifier`: the unique session ID returned by `createConversation` - `metadata_identifier`: the unique ID of the data source used for the conversation - `message`: a natural language string with the follow-up question  If the request is successful, the API returns an array of response messages, each containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl. Use `sendAgentConversationMessage` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, SendMessageRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)

 Version: 10.4.0.cl or later   **Deprecated** — Use `createAgentConversation` followed by `sendAgentConversationMessage` instead.  Processes a natural language query against a specified data model and returns a single AI-generated answer without requiring a conversation session.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `query`: a natural language question (e.g., \"What were total sales last quarter?\") - `metadata_identifier`: the unique ID of the data source to query against  If the request is successful, the API returns a response message containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl. Use `createAgentConversation` and `sendAgentConversationMessage` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, SingleAnswerRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

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

# **stopConversation**
> void stopConversation()

 Stops an in-progress agent conversation response.    Version: 26.6.0.cl or later   <span>Version: 26.6.0.cl or later   Stops an in-progress agent response for the specified conversation. Use this endpoint to cancel a response that is actively being generated — for example, when the user navigates away, reformulates their question, or no longer needs the current result.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request must include:  - `spotter_experience_version` *(body parameter; required for `V2`)*: the version the conversation was created on. A request that omits it runs on `V1`, the default, so a `V2` conversation is found only when the parameter is passed. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - `conversation_identifier` *(path parameter)*: the unique ID of the conversation whose active response should be stopped, as returned by `createAgentConversation`  A successful request returns an empty `204 No Content` response. If there is no active response in progress at the time of the call, the request is still treated as successful.  After stopping a response, the conversation session remains active. You can continue sending messages using `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming`.  #### Example request  ```bash POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response ```  #### Typical usage scenario  This endpoint is useful when integrating Spotter into a chat UI where users can cancel a long-running query. For example:  1. User sends a message via `sendAgentConversationMessageStreaming`. 2. User clicks a \"Stop generating\" button while the response is streaming. 3. Your client calls `stopConversation` with the active `conversation_identifier`. 4. The stream is terminated and the user can ask a new question.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 400  | Bad request — `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, the conversation identifier is malformed on `V2` (it must be letters, digits, `-` and `_`), or, on `V2`, no conversation with the given identifier exists for this user. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. |  > ###### Note: > > - Calling this endpoint when no response is in progress does not return an error. > - The conversation context is preserved after stopping — previous messages and answers remain accessible. > - Available from version 26.6.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - `spotter_experience_version` and `V2` support are in Beta from 26.12.0.cl.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIConversationApi, StopConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIConversationApi(configuration);

apiInstance.stopConversation(
  // string | Unique identifier of the conversation to stop.
  "conversation_identifier_example" , 
  // StopConversationRequest (optional)
  {
    spotter_experience_version: "V1",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stopConversationRequest** | **StopConversationRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation to stop. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully stopped the in-progress agent conversation response for the given. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

