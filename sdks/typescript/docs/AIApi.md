# ThoughtSpotRestApiSdk.AIApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAgentConversation**](AIApi.md#createAgentConversation) | **POST** /api/rest/2.0/ai/agent/conversation/create | 
[**createConversation**](AIApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create | 
[**deleteConversation**](AIApi.md#deleteConversation) | **DELETE** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete | 
[**exportMemory**](AIApi.md#exportMemory) | **POST** /api/rest/2.0/ai/memory/export | 
[**getAgentInstructions**](AIApi.md#getAgentInstructions) | **GET** /api/rest/2.0/ai/agent/instructions/get | 
[**getConversation**](AIApi.md#getConversation) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages | 
[**getConversationList**](AIApi.md#getConversationList) | **GET** /api/rest/2.0/ai/agent/conversations | 
[**getDataSourceSuggestions**](AIApi.md#getDataSourceSuggestions) | **POST** /api/rest/2.0/ai/data-source-suggestions | 
[**getNLInstructions**](AIApi.md#getNLInstructions) | **POST** /api/rest/2.0/ai/instructions/get | 
[**getRelevantQuestions**](AIApi.md#getRelevantQuestions) | **POST** /api/rest/2.0/ai/relevant-questions/ | 
[**importMemory**](AIApi.md#importMemory) | **POST** /api/rest/2.0/ai/memory/import | 
[**loadAnswer**](AIApi.md#loadAnswer) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details | 
[**queryGetDecomposedQuery**](AIApi.md#queryGetDecomposedQuery) | **POST** /api/rest/2.0/ai/analytical-questions | 
[**sendAgentConversationMessage**](AIApi.md#sendAgentConversationMessage) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send | 
[**sendAgentConversationMessageStreaming**](AIApi.md#sendAgentConversationMessageStreaming) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream | 
[**sendAgentMessage**](AIApi.md#sendAgentMessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse | 
[**sendAgentMessageStreaming**](AIApi.md#sendAgentMessageStreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse | 
[**sendMessage**](AIApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse | 
[**setAgentInstructions**](AIApi.md#setAgentInstructions) | **PUT** /api/rest/2.0/ai/agent/instructions/set | 
[**setNLInstructions**](AIApi.md#setNLInstructions) | **POST** /api/rest/2.0/ai/instructions/set | 
[**singleAnswer**](AIApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create | 
[**stopConversation**](AIApi.md#stopConversation) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response | 
[**updateConversation**](AIApi.md#updateConversation) | **POST** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update | 


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

# **deleteConversation**
> void deleteConversation()

 Deletes an existing agent conversation.    Version: 26.7.0.cl or later   Permanently deletes an existing saved agent conversation and all its associated messages. This operation is irreversible — deleted conversations cannot be recovered.  Requires `CAN_USE_SPOTTER` privilege and ownership of the conversation being deleted.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation to delete, as returned by `createAgentConversation` or `getConversationList`  A successful request returns an empty `204 No Content` response. The deleted conversation no longer appears in `getConversationList`.  #### Example request  ```bash DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete ```  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given `conversation_identifier` for the authenticated user. |  > ###### Note: > > - Deletion is permanent and cannot be undone. Ensure the correct `conversation_identifier` is used before calling this endpoint. > - Only conversations created with `enable_save_chat: true` are persisted and can be deleted via this endpoint. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, DeleteConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.deleteConversation(
  // string | Unique identifier of the conversation to delete.
  "conversation_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation to delete. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully deleted the agent conversation. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **exportMemory**
> EurekaExportMemoryResponse exportMemory(exportMemoryRequest)

 Exports memory entries (rules, recipes, and non-semantic rules) for the specified data-models as a single YAML payload. Requires `CAN_USE_SPOTTER` privilege and read access on every referenced data-model. Routes through eureka-agent, which applies the same accessibility filtering and obj_id resolution as the internal GraphQL surface.   Version: 26.8.0.cl or later   This API allows users to export data-model memories (can be extended to agent memories in future) for a given list of data-models. This exported yaml file can then be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in a dev env and replicate the same in a prod env.  To use this API, the user needs either edit access or memory privilege on the data-model or manage-spotter privilege and they must use corresponding org related bearerToken where the data-model exists.  #### Usage guidelines  To export memory for one or more data-models, the request may include: - `sources`: A list of typed scope groups identifying which data-models to export memory for. Each group contains:   - `type`: The source object type for this group — `DATA_MODEL`.   - `identifiers`: An array of GUIDs or human-readable `obj_id`s of the data-models to export memory for. obj_ids are resolved server-side before forwarding.  The memory types (`RULES`, `RECIPES`, and `NON_SEMANTIC_RULES`) and the output format (`YAML`) are fixed for this endpoint and are not request parameters.  The API returns a response object with: - `content`: The serialized memory payload (currently YAML) — exactly the shape that the `importMemory` API consumes. Edit it locally and pass it back through `importMemory` to apply changes.  #### Source Type  - **DATA_MODEL**: The `identifiers` are data-model (worksheet) GUIDs. This is the default (and currently only) source type for Spotter memory and covers the rules and recipes attached directly to a data-model.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                         | | 403  | Forbidden — the authenticated user does not have necessary permissions, or lacks read access on a referenced data-model, or the bearer token does not correspond to the data-model\'s org. |  > ###### Note: > - To use this API, the user needs either edit access or memory privilege on the data-model or manage-spotter privilege and they must use corresponding org related bearerToken where the data-model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 26.8.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, ExportMemoryRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.exportMemory(
  // ExportMemoryRequest
  {
    sources: [
      {
        type: "DATA_MODEL",
        identifiers: [
          "identifiers_example",
        ],
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
 **exportMemoryRequest** | **ExportMemoryRequest**|  |


### Return type

**EurekaExportMemoryResponse**

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

# **getAgentInstructions**
> AgentInstructions getAgentInstructions()

 Version: 26.6.0.cl or later   Retrieves the admin instructions currently configured for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations.  Requires admin privileges. Only users with org admin access can retrieve agent instructions.  #### Usage guidelines  No input parameters are required. The API returns the stored `AgentInstructions` record for the caller\'s tenant and org.  If no instructions have been configured yet, the API returns a record with an empty `instructions` field and `null` values for `id`, `created_at`, `updated_at`, and `last_updated_by`.  If the request is successful, the response includes:  - `id`: unique identifier of the instructions record - `instructions`: the configured instructions text - `created_at`: ISO timestamp when the instructions were first saved - `updated_at`: ISO timestamp when the instructions were last updated - `last_updated_by`: user ID of the admin who last updated the instructions (may be `null` for older records)  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to read agent instructions. |  > ###### Note: > > - Use `setAgentInstructions` to create or update agent instructions. > - Available from version 26.6.0.cl and later.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, GetAgentInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.getAgentInstructions().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**AgentInstructions**

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

# **getConversation**
> ConversationMessageResponse getConversation()

 Retrieves the full public-safe content of a saved agent conversation: ordered turns (user messages and agent response items) and sanitized code-execution file metadata. Internal graph or branch state, Azure file identifiers, and messages with a `SYSTEM` source are omitted. The full answer payload is not embedded; fetch it separately via `loadAnswer` using the `answer_id` on each `answer` response item. Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.    Version: 26.7.0.cl or later   Retrieves the full public-safe content of a saved agent conversation. Returns ordered conversation messages — each carrying an optional user prompt (the user\'s message and any attachments) and the agent response items produced for that turn — plus sanitized metadata for any files generated by the code-execution tool.   Use this endpoint to render a persisted conversation in a UI, build an audit trail, or post-process a completed conversation. The full answer payload is not embedded — fetch it separately via `loadAnswer` using the `answer_id` on each `answer` response item.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` _(path parameter)_: the unique ID of the conversation, as returned by `createAgentConversation` or `getConversationList`.  If the request is successful, the response contains two top-level fields:  | Field                  | Type                                        | Description                                                                                                                                          | | ---------------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | | `messages`             | `ConversationMessage[]`                     | Ordered oldest to newest. Empty array when the conversation has no messages.                                                                         | | `code_execution_files` | `CodeExecutionFileMetadata[]`               | List of sanitized file metadata entries (one per `file_id`). Covers all code-execution-generated files referenced anywhere in the conversation. Empty array when there are none. |  No other top-level fields are returned.  #### ConversationMessage fields  | Field                 | Type                         | Description                                                                                                    | | --------------------- | ---------------------------- | -------------------------------------------------------------------------------------------------------------- | | `message_id`          | `String`                     | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | | `timestamp_in_millis` | `Long`                       | Milliseconds since Unix epoch for the turn.                                                                    | | `user_prompt`         | `UserPrompt`                 | User-authored prompt that started the turn (message and attachments). `null` for liveboard-started synthetic first turns. | | `response_items`      | `ConversationResponseItem[]` | Agent-side output produced in response to this turn. Empty array for in-progress turns.                        |  #### UserPrompt fields  | Field         | Type                   | Description                                                                                          | | ------------- | ---------------------- | ---------------------------------------------------------------------------------------------------- | | `message`     | `UserMessage`          | User query that started the turn. `null` for liveboard-started synthetic first turns.                | | `attachments` | `UserAttachmentItem[]` | Files or connector resources attached to the user message. Empty array when there are no attachments. |  #### UserMessage fields  | Field        | Type     | Description                                   | | ------------ | -------- | --------------------------------------------- | | `message_id` | `String` | Unique identifier of the user-source message. | | `content`    | `String` | Text body of the user query.                  |  #### UserAttachmentItem fields  Discriminated by `type`. Only `\"file\"` or `\"resource\"` are valid values. Only the fields for the indicated variant are populated. See `ConversationResponseItem` below for the field definitions of the `file` and `resource` variants — `UserAttachmentItem` uses the same fields.  #### ConversationResponseItem fields  Every item carries a `type` discriminator and these shared fields:  | Field                 | Type      | Description                                                                                                                    | | --------------------- | --------- | ------------------------------------------------------------------------------------------------------------------------------ | | `type`                | `String`  | Discriminator. One of `\"text\"`, `\"tool_call\"`, `\"tool_result\"`, `\"answer\"`, `\"file\"`, `\"resource\"`, `\"search_datasets\"`.       | | `timestamp_in_millis` | `Long`    | Milliseconds since Unix epoch when this item was produced.                                                                     | | `is_thinking`         | `Boolean` | `true` when the item represents internal agent reasoning rather than user-facing output. Consumers may hide or collapse these. | | `step_title`          | `String`  | Human-readable label for the agent step producing this item (e.g. `\"Searching\"`, `\"Visualising\"`).                             |  Variant-specific fields:  - **`text`** — agent text output: `content` (String), `content_type` (`ContentMimeType` enum), `file_reference` (FileReference). - **`tool_call`** — agent invoked a tool: `tool_call_id` (String), `tool_name` (String), `arguments` (JSON object). - **`tool_result`** — result returned from a tool invocation: `tool_call_id`, `tool_name`, `content`, `content_type` (`ContentMimeType` enum), `success` (Boolean). - **`answer`** — slim reference to a saved answer: `answer_id` (String), `tool_call_id`, `tool_name`. - **`file`** — uploaded or generated files: `files` (`PublicFileInfo[]`). - **`resource`** — MCP connector resource: `title`, `uri`, `name`, `mime_type`, `description`, `size` (Int), `connector_id`, `connector_name`, `connector_slug`, `transport_type` (`TransportType` enum). - **`search_datasets`** — dataset discovery result: `text` (String), `data_sources` (`DataSourceInfo[]`).  Clients should switch on `type` and ignore unknown variants for forward-compatibility.  #### content_type values  `content_type` is the `ContentMimeType` enum. The following values are defined:  | Value                       | Wire MIME                   | Meaning                                              | | --------------------------- | --------------------------- | ---------------------------------------------------- | | `TEXT_PLAIN`                | `text/plain`                | Plain text. Default for `tool_result`.               | | `TEXT_MARKDOWN`             | `text/markdown`             | Markdown. Default for `text`.                        | | `TEXT_X_MARKDOWN_WITH_CODE` | `text/x-markdown-with-code` | Markdown whose body starts with a fenced code block. | | `TEXT_HTML`                 | `text/html`                 | Raw HTML.                                            |  #### transport_type values  `transport_type` is the `TransportType` enum used on the `resource` variant.  | Value              | Meaning                                       | | ------------------ | --------------------------------------------- | | `STREAMABLE_HTTP`  | Streamable HTTP transport (default for MCP).  | | `SSE`              | Server-sent events transport.                 |  #### FileReference fields  | Field                    | Type     | Description                                                  | | ------------------------ | -------- | ------------------------------------------------------------ | | `file_id`                | `String` | Unique identifier of the code-execution-generated file.      | | `display_name`           | `String` | Human-readable file name.                                    | | `created_time_in_millis` | `Long`   | Milliseconds since Unix epoch when the file was created.     |  Cross-reference `file_id` against `code_execution_files` to retrieve full metadata including the `expired` flag before attempting a download.  #### PublicFileInfo fields  | Field                    | Type     | Description                                              | | ------------------------ | -------- | -------------------------------------------------------- | | `file_id`                | `String` | Unique identifier of the file.                           | | `display_name`           | `String` | Human-readable file name.                                | | `file_type`              | `String` | File type such as `csv`, `pdf`, or `png`.                | | `created_time_in_millis` | `Long`   | Milliseconds since Unix epoch when the file was created. | | `size_bytes`             | `Int`    | File size in bytes.                                      |  #### CodeExecutionFileMetadata fields  Each entry in the `code_execution_files` array contains:  | Field                    | Type      | Description                                                                                                                     | | ------------------------ | --------- | ------------------------------------------------------------------------------------------------------------------------------- | | `file_id`                | `String`  | Unique identifier of the file.                                                                                                  | | `display_name`           | `String`  | Human-readable file name.                                                                                                       | | `file_type`              | `String`  | File type such as `csv`, `pdf`, or `png`.                                                                                       | | `created_time_in_millis` | `Long`    | Milliseconds since Unix epoch when the file was created.                                                                        | | `expired`                | `Boolean` | When `true`, the underlying file is no longer retrievable from code-execution storage; UIs should disable download and preview. |  #### Loading answer payloads  Each `AnswerResponseItem` in the response contains an `answer_id` field. Pass this value as the `answer_identifier` parameter to `loadAnswer` to retrieve the full answer payload (TML tokens, visualization metadata) for that item.  #### Example request  ```bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages ```  #### Example response  ```json {   \"messages\": [     {       \"message_id\": \"node_u_01\",       \"timestamp_in_millis\": 1744000000000,       \"user_prompt\": {         \"message\": {           \"message_id\": \"msg_u_01\",           \"content\": \"Show me revenue by region as a chart.\"         },         \"attachments\": []       },       \"response_items\": [         {           \"type\": \"tool_call\",           \"tool_call_id\": \"toolu_01ABC\",           \"tool_name\": \"search_datasets\",           \"step_title\": \"Searching datasets\",           \"arguments\": { \"query\": \"revenue\" },           \"timestamp_in_millis\": 1744000001000,           \"is_thinking\": false         },         {           \"type\": \"answer\",           \"answer_id\": \"ans_01XYZ\",           \"tool_call_id\": \"toolu_02DEF\",           \"tool_name\": \"fetch_and_visualize\",           \"step_title\": \"Visualising\",           \"timestamp_in_millis\": 1744000004000,           \"is_thinking\": false         },         {           \"type\": \"text\",           \"content\": \"Revenue is highest in APAC.\",           \"content_type\": \"TEXT_MARKDOWN\",           \"timestamp_in_millis\": 1744000005000,           \"is_thinking\": false,           \"step_title\": null,           \"file_reference\": {             \"file_id\": \"revenue_by_region.csv\",             \"display_name\": \"revenue_by_region.csv\",             \"created_time_in_millis\": 1744027200000           }         }       ]     }   ],   \"code_execution_files\": [     {       \"file_id\": \"revenue_by_region.csv\",       \"display_name\": \"revenue_by_region.csv\",       \"file_type\": \"csv\",       \"created_time_in_millis\": 1744027200000,       \"expired\": false     }   ] } ```  #### Example: liveboard-started conversation  When a conversation is initiated from a saved liveboard visualization rather than a user query, the first turn is synthetic. `user_prompt` is `null`, and `response_items` contains a single `answer` item referencing the seed visualization.  ```json {   \"messages\": [     {       \"message_id\": \"ROOT_NODE\",       \"timestamp_in_millis\": 1743999000000,       \"user_prompt\": null,       \"response_items\": [         {           \"type\": \"answer\",           \"answer_id\": \"lb_seed_01\",           \"tool_call_id\": null,           \"tool_name\": null,           \"step_title\": null,           \"timestamp_in_millis\": 1743999000000,           \"is_thinking\": false         }       ]     }   ],   \"code_execution_files\": [] } ```  Subsequent turns follow the normal user-to-agent pattern.  #### Error responses  | Code | Description                                                                                                                 | | ---- | --------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                        | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation exists with the given identifier for the authenticated user.                                    |  > ###### Note: > > - Messages with an internal `SYSTEM` source are always dropped from the response. > - In-progress turns are still returned with an empty `response_items` array so clients can render the user message immediately. > - Do not assume every `tool_call` has a paired `tool_result` or `answer` — an interrupted conversation can leave a dangling call. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, GetConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.getConversation(
  // string | Unique identifier of the conversation to load.
  "conversation_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation to load. | defaults to undefined


### Return type

**ConversationMessageResponse**

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

# **getConversationList**
> AgentConversationHistoryResponse getConversationList()

 Retrieves the list of saved agent conversations for the currently authenticated user. Only conversations created with `enable_save_chat: true` are returned.    Version: 26.7.0.cl or later   Retrieves a paginated list of saved agent conversations for the currently authenticated user. Only conversations that were created with `enable_save_chat: true` in `createAgentConversation` are returned.  Requires `CAN_USE_SPOTTER` privilege.  #### Usage guidelines  The request supports the following optional query parameters:  - `limit`: maximum number of conversations to return. Use this together with `offset` for pagination. - `offset`: number of conversations to skip before returning results. Defaults to `0`. - `skip_empty`: when `true` (default), conversations with no messages are excluded from the results. Set to `false` to include empty conversations.  If the request is successful, the response includes a `conversations` array. Each entry contains:  - `conversation_identifier`: the unique ID of the conversation, used as input to `sendAgentConversationMessage`, `updateConversation`, `deleteConversation`, `stopConversation`, and `loadAnswer` - `conversation_title`: the display name of the conversation - `created_at`: ISO 8601 timestamp of when the conversation was created - `updated_at`: ISO 8601 timestamp of the most recent update to the conversation - `data_source_identifiers`: list of unique IDs of the data sources associated with the conversation - `data_source_names`: array of `{ id, name }` objects for the data sources associated with the conversation  #### Pagination  Use `limit` and `offset` to page through large result sets:  ``` GET /api/rest/2.0/ai/agent/conversations?limit=20&offset=0   → first page GET /api/rest/2.0/ai/agent/conversations?limit=20&offset=20  → second page ```  #### Pagination and `has_more`  The response includes a `has_more: Boolean` field. When `true`, there are additional conversations beyond the current page — increment `offset` by `limit` to fetch the next page. When `has_more` is `false`, the current page is the last. Note that `total_count` is not returned; use `has_more` to drive paging controls.  #### Example response  ```json {   \"conversations\": [     {       \"conversation_identifier\": \"abc123\",       \"conversation_title\": \"Sales by Region Q1\",       \"created_at\": \"2026-03-01T10:00:00Z\",       \"updated_at\": \"2026-03-05T14:23:00Z\",       \"data_source_identifiers\": [\"ds-001\"],       \"data_source_names\": [{ \"id\": \"ds-001\", \"name\": \"Retail Sales\" }]     }   ],   \"has_more\": false } ```  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege. |  > ###### Note: > > - Only conversations created with `enable_save_chat: true` appear in this list. Conversations created with `enable_save_chat: false` (the default) are not persisted and cannot be retrieved. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, GetConversationListRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.getConversationList(
  // number | Maximum number of conversations to return. Used for pagination. (optional)
  30 , 
  // number | Number of conversations to skip before returning results. Used for pagination. (optional)
  0 , 
  // boolean | When true, excludes conversations with no messages. Defaults to true. (optional)
  true 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Maximum number of conversations to return. Used for pagination. | (optional) defaults to 30
 **offset** | [**number**] | Number of conversations to skip before returning results. Used for pagination. | (optional) defaults to 0
 **skipEmpty** | [**boolean**] | When true, excludes conversations with no messages. Defaults to true. | (optional) defaults to true


### Return type

**AgentConversationHistoryResponse**

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

# **importMemory**
> EurekaImportMemoryResponse importMemory(importMemoryRequest)

 Imports memory entries from a YAML payload. Performs an atomic, exact-subset replacement on the target data-models declared in the payload itself: every existing memory whose `datamodel_sources` set is a subset of the payload\'s union is deleted, and every row in the payload is inserted. Phase 1 (insert) is all-or-nothing; any insert failure rolls back every prior insert and returns `ROLLED_BACK`. Phase 2 (delete old) is best-effort; partial delete failures surface as `RESIDUAL_ORPHAN` entries in `warnings` (a follow-up sweeper reconciles them). `dry_run` is required: pass `true` first to inspect the preview counts and row failures, then re-run with `dry_run = false` once the caller is satisfied. A real import refuses to write when any row failed validation. Requires `CAN_USE_SPOTTER` privilege and edit / coaching access on every referenced data-model.   Version: 26.8.0.cl or later   This API allows users to import data-model memories (can be extended to agent memories in future) using a given yaml file. This yaml file can be obtained from the export memory API in source env and can be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in a dev env and replicate the same in a prod env.  To use this API, the user needs either edit access or memory privilege on the data-model or manage-spotter privilege and they must use corresponding org related bearerToken where the data-model exists.  #### Usage guidelines  To import memory, the request must include: - `content`: The full serialized memory payload to import (currently YAML). Typically the `content` value returned by the `exportMemory` API, edited locally and re-submitted. The payload itself declares which data-models the memory applies to (via each row\'s `datamodel_sources`), so no separate identifier list is required. - `dry_run`: Required. When `true`, validate the payload and return preview counts without writing anything; when `false`, apply the atomic replacement. There is no default — always run with `dry_run = true` first, then re-run with `dry_run = false` once you are satisfied with the preview.  The import performs an atomic, exact-subset replacement on the data-models referenced in the payload: every existing memory whose `datamodel_sources` set is a subset of the payload\'s union is deleted, and every row in the payload is inserted.  The API returns a response object with: - `status`: The terminal status of the import (`SUCCESS`, `VALIDATION_FAILED`, or `FAILED`). - `summary`: Per `(memory_type, source)` counts. In a dry run the `deleted_record_count`/`inserted_record_count` are previews; in a real import they are actuals. - `validation_failures`: Per-item validation failures, each with `line_number`, `reason`, `field_name`, and `message` for click-to-locate and inline highlighting. - `diagnostics`: Groups of diagnostic messages, each with a `sub_status` (`WARNING`, `FAILURE`, `ROLLED_BACK`, or `UNKNOWN`) and a `messages` list. This is the single channel for both non-fatal observations (e.g. a `RESIDUAL_ORPHAN` entry under `WARNING` when a best-effort delete left an old doc behind, reconciled later by a sweeper using `operation_id`) and fatal causes (e.g. the failure reason under `FAILURE`, or a `ROLLED_BACK` group when inserts were undone). - `operation_id`: A server-minted UUID for log correlation and follow-up cleanup.  #### Dry run  `dry_run` is required and has no default, so the import is always a deliberate two-step flow:  1. **First, call with `dry_run = true`.** This validates the payload and previews what would happen — the counts in `summary` and any `validation_failures` — without writing anything. 2. **Then, after reviewing a clean preview, call again with `dry_run = false`** (same `content`). This performs the atomic replacement. It refuses to write when any item fails validation, so fix the reported `validation_failures` and resubmit.  > ###### Important: > Never call `dry_run = false` without first inspecting a `dry_run = true` preview. A real import deletes and replaces existing memories on the referenced data-models.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                    |  #### Logical failures  Validation and write failures are not returned in the error envelope. The call returns `200` with a terminal `status` of `VALIDATION_FAILED` or `FAILED`, and the details live in `validation_failures` / `diagnostics`:  - **VALIDATION_FAILED** — one or more items failed schema/semantic validation; nothing was written. Inspect `validation_failures`, fix the items, and resubmit. - **FAILED** — the import did not complete. This covers both internal errors and rollbacks. Inspect `diagnostics`: a `ROLLED_BACK` group means Phase-1 inserts failed and every successful insert was undone (the originals are intact, no destructive change), while a `FAILURE` group carries another non-validation cause (e.g. an internal error).  Sample `VALIDATION_FAILED` response (HTTP 200):  ```json {   \"status\": \"VALIDATION_FAILED\",   \"summary\": [     {       \"memory_type\": \"RULES\",       \"source\": {         \"identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",         \"type\": \"DATA_MODEL\"       },       \"existing_record_count\": 3,       \"deleted_record_count\": 0,       \"inserted_record_count\": 0,       \"failed_record_count\": 1     }   ],   \"validation_failures\": [     {       \"line_number\": 4,       \"reason\": \"CHAR_LIMIT\",       \"field_name\": \"content.rule_definition\",       \"message\": \"Rule definition exceeds the maximum allowed length.\"     }   ],   \"diagnostics\": [],   \"operation_id\": \"550e8400-e29b-41d4-a716-446655440000\" } ```  > ###### Note: > - To use this API, the user needs either edit access or memory privilege on the data-model or manage-spotter privilege and they must use corresponding org related bearerToken where the data-model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 26.8.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, ImportMemoryRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.importMemory(
  // ImportMemoryRequest
  {
    content: "content_example",
    dry_run: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importMemoryRequest** | **ImportMemoryRequest**|  |


### Return type

**EurekaImportMemoryResponse**

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

 Loads the full answer payload for a specific answer item in an agent conversation. Returns structured answer data including the TML query, token breakdown, visualization metadata, and agent context state. Pass the `answer_id` from an `AnswerResponseItem` in the `getConversation` response as the `answer_identifier` parameter. Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.    Version: 26.7.0.cl or later   Loads the answer details for a specific answer item in an agent conversation. Returns structured answer data including the TML token list, visualization metadata, and agent context state. Use this endpoint to retrieve the full answer representation for an answer item — for example, to re-render a chart, export a query, or inspect the generated TML.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation, as returned by `createAgentConversation` - `answer_identifier` *(path parameter)*: the `answer_id` field from an `AnswerResponseItem` in the `getConversation` response  If the request is successful, the response contains an `answer` object with the following fields:  | Field | Type | Description | |-------|------|-------------| | `title` | `String` | Display title of the generated answer (e.g., `\"sales by month\"`). | | `description` | `String` | Optional description of the answer. | | `session_identifier` | `String` | Unique identifier of the session in which this answer was generated. | | `generation_number` | `Int` | Generation sequence number of this answer within the session. | | `tokens` | `[String]` | Ordered list of TML token strings that make up the answer query (e.g., `[\"[sales]\", \"[date].\'monthly\'\"]`). | | `visualization_type` | `VizType` | Suggested visualization type: `Chart`, `Table`, or `Undefined`. `null` if no suggestion is available. | | `formulas` | `[String]` | List of formula names referenced in the answer. Empty if none are used. | | `parameters` | `[String]` | List of parameter names applied to the answer. Empty if none are used. | | `sub_queries` | `[JSON]` | List of sub-query objects used in the answer. Empty if none are present. | | `ac_state` | `ACState` | Agent context state, including `transaction_identifier` and `generation_number`, used to correlate this answer with a specific agent turn. |  #### ACState fields  | Field | Type | Description | |-------|------|-------------| | `transaction_identifier` | `String` | Unique identifier of the agent transaction that produced this answer. | | `generation_number` | `Int` | Generation number within the transaction. |  #### Example request  ```bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details ```  #### Example response  ```json {   \"answer\": {     \"title\": \"sales by month\",     \"description\": \"\",     \"session_identifier\": \"7b00b801-73f4-4639-af5e-e775584ceba6\",     \"generation_number\": 1,     \"tokens\": [\"[sales]\", \"[date].\'monthly\'\"],     \"visualization_type\": null,     \"formulas\": [],     \"parameters\": [],     \"sub_queries\": [],     \"ac_state\": {       \"transaction_identifier\": \"7f6c9948-b4c7-4098-bb1f-6c67bc0e5699\",       \"generation_number\": 1     }   } } ```  #### Typical usage scenario  1. Call `getConversation` to retrieve the full conversation history. 2. Locate an `AnswerResponseItem` in `response_items` — note its `answer_id` field. 3. Call `loadAnswer` with the `conversation_identifier` and `answer_id` as `answer_identifier`. 4. The returned `tokens` array can be used to open the answer in the ThoughtSpot search interface or rendered as pill chips in the UI.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation or message exists with the given identifiers for the authenticated user. | | 422  | Unprocessable Entity — the message does not contain an answer of the expected type. |  > ###### Note: > > - This endpoint only loads answer-type messages. Other message types are not supported. > - `visualization_type` may be `null` if the agent did not produce a visualization suggestion for this answer. > - `formulas`, `parameters`, and `sub_queries` are returned as empty arrays when not applicable — they are never `null`. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, LoadAnswerRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

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

# **setAgentInstructions**
> AgentInstructions setAgentInstructions(setAgentInstructionsRequest)

 Version: 26.6.0.cl or later   Creates or updates the admin instructions for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations. If instructions already exist for the org, they are replaced (upsert semantics).  Requires admin privileges. Only users with org admin access can set agent instructions.  #### Usage guidelines  The request must include:  - `instructions`: the instructions text to apply to the agent (maximum 5000 characters)  Instructions are validated against system guardrails before being saved. If the instructions contain content that conflicts with guardrails, the request is rejected with a `409` error and the existing instructions remain unchanged.  If the request is successful, the response includes the saved `AgentInstructions` record:  - `id`: unique identifier of the record - `instructions`: the saved instructions text - `created_at`: ISO timestamp when the instructions were first created - `updated_at`: ISO timestamp of this update - `last_updated_by`: user ID of the admin who performed this update  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — the request body is missing required fields or the `instructions` field exceeds the maximum allowed length of 5000 characters. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to set agent instructions. | | 409  | Conflict — the provided instructions conflict with system guardrails. Review and revise the instructions text before retrying. | | 500  | Internal server error. |  > ###### Note: > > - This operation uses upsert semantics: it creates the instructions record if none exists, or replaces the existing one. > - Instructions take effect immediately for new conversations created after the update. > - Use `getAgentInstructions` to retrieve the current instructions before making changes. > - Available from version 26.6.0.cl and later.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, SetAgentInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.setAgentInstructions(
  // SetAgentInstructionsRequest
  {
    instructions: "instructions_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setAgentInstructionsRequest** | **SetAgentInstructionsRequest**|  |


### Return type

**AgentInstructions**

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

# **stopConversation**
> void stopConversation()

 Stops an in-progress agent conversation response.    Version: 26.6.0.cl or later   <span>Version: 26.6.0.cl or later   Stops an in-progress agent response for the specified conversation. Use this endpoint to cancel a response that is actively being generated — for example, when the user navigates away, reformulates their question, or no longer needs the current result.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation whose active response should be stopped, as returned by `createAgentConversation`  A successful request returns an empty `204 No Content` response. If there is no active response in progress at the time of the call, the request is still treated as successful.  After stopping a response, the conversation session remains active. You can continue sending messages using `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming`.  #### Example request  ```bash POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response ```  #### Typical usage scenario  This endpoint is useful when integrating Spotter into a chat UI where users can cancel a long-running query. For example:  1. User sends a message via `sendAgentConversationMessageStreaming`. 2. User clicks a \"Stop generating\" button while the response is streaming. 3. Your client calls `stopConversation` with the active `conversation_identifier`. 4. The stream is terminated and the user can ask a new question.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. |  > ###### Note: > > - Calling this endpoint when no response is in progress does not return an error. > - The conversation context is preserved after stopping — previous messages and answers remain accessible. > - Available from version 26.6.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - This feature is available only for **Spotter 3** (`SPOTTER3`) version.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, StopConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.stopConversation(
  // string | Unique identifier of the conversation to stop.
  "conversation_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation to stop. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

# **updateConversation**
> void updateConversation(updateConversationRequest)

 Updates attributes of an existing agent conversation. Currently only the display title can be updated; additional conversation attributes may be supported in future versions. At least one updatable attribute must be provided in the request body.    Version: 26.7.0.cl or later   Updates attributes of an existing saved agent conversation. Currently only the conversation\'s display `title` can be updated; additional updatable attributes may be supported in future versions. At least one updatable attribute must be supplied in the request body.  Requires `CAN_USE_SPOTTER` privilege and ownership of the conversation being updated.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation to update, as returned by `createAgentConversation` or `getConversationList` - At least one updatable attribute in the request body:     - `title` *(optional)*: the new display name for the conversation. When provided, must be a non-empty string.  A successful request returns an empty `204 No Content` response. Updated attributes are reflected immediately in subsequent calls to `getConversationList`.  #### Example request  ```bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \"title\": \"Revenue Breakdown by Product Line\" } ```  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad Request — the request body is empty or `title` is provided as an empty string. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given `conversation_identifier` for the authenticated user. | | 422  | Unprocessable Entity — the request body is malformed or contains an invalid field value. |  > ###### Note: > > - Only conversations created with `enable_save_chat: true` can be updated. Unsaved conversations are not persisted and do not have a retrievable identifier. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIApi, UpdateConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIApi(configuration);

apiInstance.updateConversation(
  // string | Unique identifier of the conversation to update.
  "conversation_identifier_example" , 
  // UpdateConversationRequest
  {
    title: "title_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConversationRequest** | **UpdateConversationRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation to update. | defaults to undefined


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
**204** | Successfully updated the agent conversation. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

