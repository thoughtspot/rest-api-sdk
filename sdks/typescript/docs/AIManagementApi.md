# ThoughtSpotRestApiSdk.AIManagementApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConversation**](AIManagementApi.md#deleteConversation) | **DELETE** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete | 
[**deleteUsageData**](AIManagementApi.md#deleteUsageData) | **POST** /api/rest/2.0/ai/usage-data/delete | 
[**exportMemory**](AIManagementApi.md#exportMemory) | **POST** /api/rest/2.0/ai/memory/export | 
[**getAgentInstructions**](AIManagementApi.md#getAgentInstructions) | **GET** /api/rest/2.0/ai/agent/instructions/get | 
[**getConversation**](AIManagementApi.md#getConversation) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages | 
[**getConversationList**](AIManagementApi.md#getConversationList) | **GET** /api/rest/2.0/ai/agent/conversations | 
[**getNLInstructions**](AIManagementApi.md#getNLInstructions) | **POST** /api/rest/2.0/ai/instructions/get | 
[**getShareInfo**](AIManagementApi.md#getShareInfo) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-share-info | 
[**getSharedContent**](AIManagementApi.md#getSharedContent) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-shared-content | 
[**getUsageDataForUser**](AIManagementApi.md#getUsageDataForUser) | **GET** /api/rest/2.0/ai/usage-data/user | 
[**importMemory**](AIManagementApi.md#importMemory) | **POST** /api/rest/2.0/ai/memory/import | 
[**searchUsageData**](AIManagementApi.md#searchUsageData) | **POST** /api/rest/2.0/ai/usage-data/search | 
[**setAgentInstructions**](AIManagementApi.md#setAgentInstructions) | **PUT** /api/rest/2.0/ai/agent/instructions/set | 
[**setNLInstructions**](AIManagementApi.md#setNLInstructions) | **POST** /api/rest/2.0/ai/instructions/set | 
[**shareConversation**](AIManagementApi.md#shareConversation) | **POST** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/share | 
[**updateConversation**](AIManagementApi.md#updateConversation) | **POST** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update | 
[**updateUsageData**](AIManagementApi.md#updateUsageData) | **POST** /api/rest/2.0/ai/usage-data/update | 


# **deleteConversation**
> void deleteConversation()

 Deletes an existing agent conversation.    Version: 26.7.0.cl or later   Permanently deletes an existing saved agent conversation and all its associated messages. This operation is irreversible — deleted conversations cannot be recovered.  Requires `CAN_USE_SPOTTER` privilege and ownership of the conversation being deleted.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request must include:  - `spotter_experience_version` *(query parameter; required for `V2`)*: the version the conversation was created on. A request that omits it runs on `V1`, the default, so a `V2` conversation is found only when the parameter is passed. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - `conversation_identifier` *(path parameter)*: the unique ID of the conversation to delete, as returned by `createAgentConversation` or `getConversationList`  A successful request returns an empty `204 No Content` response. The deleted conversation no longer appears in `getConversationList`.  #### Example request  ```bash DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete ```  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, or the conversation identifier is malformed on `V2` (it must be letters, digits, `-` and `_`). | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given `conversation_identifier` for the authenticated user. |  > ###### Note: > > - Deletion is permanent and cannot be undone. Ensure the correct `conversation_identifier` is used before calling this endpoint. > - On `V1`, only conversations created with `enable_save_chat: true` are persisted and can be deleted via this endpoint. On `V2`, any conversation can be deleted by its identifier, including one created without `enable_save_chat: true`. > - `spotter_experience_version` and `V2` support are in Beta from 26.12.0.cl. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, DeleteConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.deleteConversation(
  // string | Unique identifier of the conversation to delete.
  "conversation_identifier_example" , 
  // 'V1' | 'V2' | Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - `V1` (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - `V2`: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional)
  "V1" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation to delete. | defaults to undefined
 **spotterExperienceVersion** | [**&#39;V1&#39; | &#39;V2&#39;**]**Array<&#39;V1&#39; &#124; &#39;V2&#39;>** | Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  | (optional) defaults to 'V1'


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

# **deleteUsageData**
> DeleteUsageDataResponse deleteUsageData(deleteUsageDataRequest)

 Deletes Spotter usage pools. Users who no longer draw from any pool are no longer metered: their Spotter usage is unlimited, not blocked. Requires `ADMINISTRATION` privilege.    Version: 26.11.0.cl or later   Deletes Spotter usage pools. Use this API to remove a limit from a user, user group, or Org, or to clear every pool before switching the scope the cluster meters at.  Requires `ADMINISTRATION` (Can administer ThoughtSpot) privilege. Users with only `CAN_MANAGE_SPOTTER`, and Org administrators without cluster-level `ADMINISTRATION`, cannot call this API.  #### Usage guidelines  The request must include `keys`, with at least one entry. Each key has an `entity_type` (`USER`, `USER_GROUP`, or `ORG`) and an `entity_identifier` (the GUID of the user or user group, or the ID of the Org).  Deleting a pool removes its limit rather than blocking its users. A user who no longer draws from any pool is not metered and can use Spotter without a limit.  If the request is successful, the response contains `deleted_keys`, the keys of the pools that existed and were deleted. Keys that matched no pool are omitted.  #### Error conditions  - `400` — `keys` is empty, or a key is missing its `entity_type` or `entity_identifier`. - `401` — authentication token is missing, expired, or invalid. - `403` — the caller does not have `ADMINISTRATION` privilege.  > ###### Note: > > - This operation cannot be undone. Recreate a pool with `updateUsageData`; its usage restarts from `0`.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, DeleteUsageDataRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.deleteUsageData(
  // DeleteUsageDataRequest
  {
    keys: [
      {
        entity_type: "USER",
        entity_identifier: "entity_identifier_example",
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
 **deleteUsageDataRequest** | **DeleteUsageDataRequest**|  |


### Return type

**DeleteUsageDataResponse**

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

# **exportMemory**
> ExportMemoryResponse exportMemory(exportMemoryRequest)

 Exports memory entries (rules, recipes, and always-apply rules) for the specified data-models as a single YAML payload. The payload can be edited locally and re-submitted through `importMemory`. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to export data-model memories for a given list of data-models. This exported yaml file can then be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To export memory for one or more data-models, the request may include: - `sources`: A list of typed scope groups identifying which data-models to export memory for. Each group contains:   - `type`: The source object type for this group — `DATA_MODEL`.   - `identifiers`: An array of GUIDs or human-readable `obj_id`s of the data-models to export memory for. obj_ids are resolved server-side before forwarding.  The API returns a response object with: - `content`: The serialized memory payload (YAML) — exactly the shape that the `importMemory` API consumes. Edit it locally and pass it back through `importMemory` to apply changes.  #### Source Type  - **DATA_MODEL**: The `identifiers` are data-model GUIDs. This is the default source type for Spotter memory and covers the rules, recipes and always-apply rules attached directly to a data-model.  #### File format  The exported `content` is a YAML document with a single top-level `memories` key holding a list of memory items — exactly the format the `importMemory` API consumes. The full format reference (an annotated example, memory item fields, per-type content, and `datamodel_sources` identification) is documented in the `importMemory` API\'s **File format** section. Exported files populate each source\'s `guid` and, if present, `obj_id` as well.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                         | | 403  | Forbidden — the authenticated user does not have necessary permissions, or lacks read access on a referenced data-model, or the bearer token does not correspond to the data-model\'s org. |  > ###### Note: > - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 26.8.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, ExportMemoryRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

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

**ExportMemoryResponse**

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
import { createBearerAuthenticationConfig, AIManagementApi, GetAgentInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

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

 Retrieves the full public-safe content of a saved agent conversation: ordered turns (user messages and agent response items) and sanitized code-execution file metadata. Internal graph or branch state, Azure file identifiers, and messages with a `SYSTEM` source are omitted. The full answer payload is not embedded; fetch it separately via `loadAnswer` (also deprecated from 26.12.0.cl) using the `answer_id` on each `answer` response item. Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.    Version: 26.7.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` and keep the turns they return; list conversations with `getConversationList`. This endpoint will be removed in a future release.  Retrieves the full public-safe content of a saved agent conversation. Returns ordered conversation messages — each carrying an optional user prompt (the user\'s message and any attachments) and the agent response items produced for that turn — plus sanitized metadata for any files generated by the code-execution tool.   Use this endpoint to render a persisted conversation in a UI, build an audit trail, or post-process a completed conversation. The full answer payload is not embedded — fetch it separately via `loadAnswer` (also deprecated from 26.12.0.cl) using the `answer_id` on each `answer` response item.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` _(path parameter)_: the unique ID of the conversation, as returned by `createAgentConversation` or `getConversationList`.  If the request is successful, the response contains two top-level fields:  | Field                  | Type                                        | Description                                                                                                                                          | | ---------------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | | `messages`             | `ConversationMessage[]`                     | Ordered oldest to newest. Empty array when the conversation has no messages.                                                                         | | `code_execution_files` | `CodeExecutionFileMetadata[]`               | List of sanitized file metadata entries (one per `file_id`). Covers all code-execution-generated files referenced anywhere in the conversation. Empty array when there are none. |  No other top-level fields are returned.  #### ConversationMessage fields  | Field                 | Type                         | Description                                                                                                    | | --------------------- | ---------------------------- | -------------------------------------------------------------------------------------------------------------- | | `message_id`          | `String`                     | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | | `timestamp_in_millis` | `Long`                       | Milliseconds since Unix epoch for the turn.                                                                    | | `user_prompt`         | `UserPrompt`                 | User-authored prompt that started the turn (message and attachments). `null` for liveboard-started synthetic first turns. | | `response_items`      | `ConversationResponseItem[]` | Agent-side output produced in response to this turn. Empty array for in-progress turns.                        |  #### UserPrompt fields  | Field         | Type                   | Description                                                                                          | | ------------- | ---------------------- | ---------------------------------------------------------------------------------------------------- | | `message`     | `UserMessage`          | User query that started the turn. `null` for liveboard-started synthetic first turns.                | | `attachments` | `UserAttachmentItem[]` | Files or connector resources attached to the user message. Empty array when there are no attachments. |  #### UserMessage fields  | Field        | Type     | Description                                   | | ------------ | -------- | --------------------------------------------- | | `message_id` | `String` | Unique identifier of the user-source message. | | `content`    | `String` | Text body of the user query.                  |  #### UserAttachmentItem fields  Discriminated by `type`. Only `\"file\"` or `\"resource\"` are valid values. Only the fields for the indicated variant are populated. See `ConversationResponseItem` below for the field definitions of the `file` and `resource` variants — `UserAttachmentItem` uses the same fields.  #### ConversationResponseItem fields  Every item carries a `type` discriminator and these shared fields:  | Field                 | Type      | Description                                                                                                                    | | --------------------- | --------- | ------------------------------------------------------------------------------------------------------------------------------ | | `type`                | `String`  | Discriminator. One of `\"text\"`, `\"tool_call\"`, `\"tool_result\"`, `\"answer\"`, `\"file\"`, `\"resource\"`, `\"search_datasets\"`.       | | `timestamp_in_millis` | `Long`    | Milliseconds since Unix epoch when this item was produced.                                                                     | | `is_thinking`         | `Boolean` | `true` when the item represents internal agent reasoning rather than user-facing output. Consumers may hide or collapse these. | | `step_title`          | `String`  | Human-readable label for the agent step producing this item (e.g. `\"Searching\"`, `\"Visualising\"`).                             |  Variant-specific fields:  - **`text`** — agent text output: `content` (String), `content_type` (`ContentMimeType` enum), `file_reference` (FileReference). - **`tool_call`** — agent invoked a tool: `tool_call_id` (String), `tool_name` (String), `arguments` (JSON object). - **`tool_result`** — result returned from a tool invocation: `tool_call_id`, `tool_name`, `content`, `content_type` (`ContentMimeType` enum), `success` (Boolean). - **`answer`** — slim reference to a saved answer: `answer_id` (String), `tool_call_id`, `tool_name`. - **`file`** — uploaded or generated files: `files` (`PublicFileInfo[]`). - **`resource`** — MCP connector resource: `title`, `uri`, `name`, `mime_type`, `description`, `size` (Int), `connector_id`, `connector_name`, `connector_slug`, `transport_type` (`TransportType` enum). - **`search_datasets`** — dataset discovery result: `text` (String), `data_sources` (`DataSourceInfo[]`).  Clients should switch on `type` and ignore unknown variants for forward-compatibility.  #### content_type values  `content_type` is the `ContentMimeType` enum. The following values are defined:  | Value                       | Wire MIME                   | Meaning                                              | | --------------------------- | --------------------------- | ---------------------------------------------------- | | `TEXT_PLAIN`                | `text/plain`                | Plain text. Default for `tool_result`.               | | `TEXT_MARKDOWN`             | `text/markdown`             | Markdown. Default for `text`.                        | | `TEXT_X_MARKDOWN_WITH_CODE` | `text/x-markdown-with-code` | Markdown whose body starts with a fenced code block. | | `TEXT_HTML`                 | `text/html`                 | Raw HTML.                                            |  #### transport_type values  `transport_type` is the `TransportType` enum used on the `resource` variant.  | Value              | Meaning                                       | | ------------------ | --------------------------------------------- | | `STREAMABLE_HTTP`  | Streamable HTTP transport (default for MCP).  | | `SSE`              | Server-sent events transport.                 |  #### FileReference fields  | Field                    | Type     | Description                                                  | | ------------------------ | -------- | ------------------------------------------------------------ | | `file_id`                | `String` | Unique identifier of the code-execution-generated file.      | | `display_name`           | `String` | Human-readable file name.                                    | | `created_time_in_millis` | `Long`   | Milliseconds since Unix epoch when the file was created.     |  Cross-reference `file_id` against `code_execution_files` to retrieve full metadata including the `expired` flag before attempting a download.  #### PublicFileInfo fields  | Field                    | Type     | Description                                              | | ------------------------ | -------- | -------------------------------------------------------- | | `file_id`                | `String` | Unique identifier of the file.                           | | `display_name`           | `String` | Human-readable file name.                                | | `file_type`              | `String` | File type such as `csv`, `pdf`, or `png`.                | | `created_time_in_millis` | `Long`   | Milliseconds since Unix epoch when the file was created. | | `size_bytes`             | `Int`    | File size in bytes.                                      |  #### CodeExecutionFileMetadata fields  Each entry in the `code_execution_files` array contains:  | Field                    | Type      | Description                                                                                                                     | | ------------------------ | --------- | ------------------------------------------------------------------------------------------------------------------------------- | | `file_id`                | `String`  | Unique identifier of the file.                                                                                                  | | `display_name`           | `String`  | Human-readable file name.                                                                                                       | | `file_type`              | `String`  | File type such as `csv`, `pdf`, or `png`.                                                                                       | | `created_time_in_millis` | `Long`    | Milliseconds since Unix epoch when the file was created.                                                                        | | `expired`                | `Boolean` | When `true`, the underlying file is no longer retrievable from code-execution storage; UIs should disable download and preview. |  #### Loading answer payloads  Each `AnswerResponseItem` in the response contains an `answer_id` field. Pass this value as the `answer_identifier` parameter to `loadAnswer` (also deprecated from 26.12.0.cl) to retrieve the full answer payload (TML tokens, visualization metadata) for that item.  #### Example request  ```bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages ```  #### Example response  ```json {   \"messages\": [     {       \"message_id\": \"node_u_01\",       \"timestamp_in_millis\": 1744000000000,       \"user_prompt\": {         \"message\": {           \"message_id\": \"msg_u_01\",           \"content\": \"Show me revenue by region as a chart.\"         },         \"attachments\": []       },       \"response_items\": [         {           \"type\": \"tool_call\",           \"tool_call_id\": \"toolu_01ABC\",           \"tool_name\": \"search_datasets\",           \"step_title\": \"Searching datasets\",           \"arguments\": { \"query\": \"revenue\" },           \"timestamp_in_millis\": 1744000001000,           \"is_thinking\": false         },         {           \"type\": \"answer\",           \"answer_id\": \"ans_01XYZ\",           \"tool_call_id\": \"toolu_02DEF\",           \"tool_name\": \"fetch_and_visualize\",           \"step_title\": \"Visualising\",           \"timestamp_in_millis\": 1744000004000,           \"is_thinking\": false         },         {           \"type\": \"text\",           \"content\": \"Revenue is highest in APAC.\",           \"content_type\": \"TEXT_MARKDOWN\",           \"timestamp_in_millis\": 1744000005000,           \"is_thinking\": false,           \"step_title\": null,           \"file_reference\": {             \"file_id\": \"revenue_by_region.csv\",             \"display_name\": \"revenue_by_region.csv\",             \"created_time_in_millis\": 1744027200000           }         }       ]     }   ],   \"code_execution_files\": [     {       \"file_id\": \"revenue_by_region.csv\",       \"display_name\": \"revenue_by_region.csv\",       \"file_type\": \"csv\",       \"created_time_in_millis\": 1744027200000,       \"expired\": false     }   ] } ```  #### Example: liveboard-started conversation  When a conversation is initiated from a saved liveboard visualization rather than a user query, the first turn is synthetic. `user_prompt` is `null`, and `response_items` contains a single `answer` item referencing the seed visualization.  ```json {   \"messages\": [     {       \"message_id\": \"ROOT_NODE\",       \"timestamp_in_millis\": 1743999000000,       \"user_prompt\": null,       \"response_items\": [         {           \"type\": \"answer\",           \"answer_id\": \"lb_seed_01\",           \"tool_call_id\": null,           \"tool_name\": null,           \"step_title\": null,           \"timestamp_in_millis\": 1743999000000,           \"is_thinking\": false         }       ]     }   ],   \"code_execution_files\": [] } ```  Subsequent turns follow the normal user-to-agent pattern.  #### Error responses  | Code | Description                                                                                                                 | | ---- | --------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                        | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation exists with the given identifier for the authenticated user.                                    |  > ###### Note: > > - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. > - Messages with an internal `SYSTEM` source are always dropped from the response. > - In-progress turns are still returned with an empty `response_items` array so clients can render the user message immediately. > - Do not assume every `tool_call` has a paired `tool_result` or `answer` — an interrupted conversation can leave a dangling call. > - Available from version 26.7.0.cl and later. > - Supports `V1` conversations only. Conversations created with `spotter_experience_version: V2` are not found. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, GetConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

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

 Retrieves the list of saved agent conversations for the currently authenticated user. Only conversations created with `enable_save_chat: true` are returned.    Version: 26.7.0.cl or later   Retrieves a paginated list of saved agent conversations for the currently authenticated user. Only conversations that were created with `enable_save_chat: true` in `createAgentConversation` are returned.  Requires `CAN_USE_SPOTTER` privilege.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  Each version lists only its own conversations.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request includes:  - `spotter_experience_version` *(query parameter; required for `V2`)*: the version whose conversations to list. A request that omits it lists `V1` conversations, the default, so pass `V2` to list conversations created on that version. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`.  and supports the following optional query parameters:  - `limit`: maximum number of conversations to return. Use this together with `offset` for pagination. - `offset`: number of conversations to skip before returning results. Defaults to `0`. - `skip_empty`: when `true` (default), conversations with no messages are excluded from the results. Set to `false` to include empty conversations. Applies to `V1` only; `V2` always excludes conversations with no messages.  If the request is successful, the response includes a `conversations` array. Each entry contains:  - `conversation_identifier`: the unique ID of the conversation, used as input to `sendAgentConversationMessage`, `updateConversation`, `deleteConversation`, `stopConversation`, and `loadAnswer` (deprecated from 26.12.0.cl) - `conversation_title`: the display name of the conversation - `created_at`: ISO 8601 timestamp of when the conversation was created - `updated_at`: ISO 8601 timestamp of the most recent update to the conversation - `data_source_identifiers`: list of unique IDs of the data sources associated with the conversation - `data_source_names`: array of `{ id, name }` objects for the data sources associated with the conversation - `is_pinned`: whether the current user has pinned this conversation. Pinned conversations are surfaced first in the list. Available from version 26.10.0.cl. - `analyst_id`: unique identifier of the Spotter Analyst the conversation is associated with, or `null` when the conversation is not associated with an analyst. Available from version 26.10.0.cl.  #### Pagination  Use `limit` and `offset` to page through large result sets:  ``` GET /api/rest/2.0/ai/agent/conversations?limit=20&offset=0   → first page GET /api/rest/2.0/ai/agent/conversations?limit=20&offset=20  → second page ```  #### Pagination and `has_more`  The response includes a `has_more: Boolean` field. When `true`, there are additional conversations beyond the current page — increment `offset` by `limit` to fetch the next page. When `has_more` is `false`, the current page is the last. Note that `total_count` is not returned; use `has_more` to drive paging controls.  #### Example response  ```json {   \"conversations\": [     {       \"conversation_identifier\": \"abc123\",       \"conversation_title\": \"Sales by Region Q1\",       \"created_at\": \"2026-03-01T10:00:00Z\",       \"updated_at\": \"2026-03-05T14:23:00Z\",       \"data_source_identifiers\": [\"ds-001\"],       \"data_source_names\": [{ \"id\": \"ds-001\", \"name\": \"Retail Sales\" }],       \"is_pinned\": true     }   ],   \"has_more\": false } ```  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege. |  > ###### Note: > > - Only conversations created with `enable_save_chat: true` appear in this list. On `V1`, conversations created with `enable_save_chat: false` (the default) are not persisted and cannot be retrieved. On `V2`, they are kept out of this list but can still be continued and deleted by their identifier. > - `spotter_experience_version` and `V2` support are in Beta from 26.12.0.cl. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, GetConversationListRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.getConversationList(
  // number | Maximum number of conversations to return. Used for pagination. (optional)
  30 , 
  // number | Number of conversations to skip before returning results. Used for pagination. (optional)
  0 , 
  // boolean | When true, excludes conversations with no messages. Defaults to true. (optional)
  true , 
  // 'V1' | 'V2' | Version of the Spotter experience whose conversations to list. Each version lists only the conversations created on it. - `V1` (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - `V2`: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional)
  "V1" 
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
 **spotterExperienceVersion** | [**&#39;V1&#39; | &#39;V2&#39;**]**Array<&#39;V1&#39; &#124; &#39;V2&#39;>** | Version of the Spotter experience whose conversations to list. Each version lists only the conversations created on it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  | (optional) defaults to 'V1'


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

# **getNLInstructions**
> EurekaGetNLInstructionsResponse getNLInstructions(getNLInstructionsRequest)

 Version: 10.15.0.cl or later   Retrieves the data model instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - `data_source_identifier`: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - `nl_instructions_info`: an array of instruction objects, each containing:   - `instructions`: the configured text instructions for AI processing   - `scope`: the scope of the instruction — currently only `GLOBAL` is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Use this API to review currently configured instructions before modifying them with `setNLInstructions`.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, GetNLInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

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

# **getShareInfo**
> ConversationShareStatusResponse getShareInfo()

 Returns the current share state for a conversation the caller owns: whether the shared view is outdated relative to the latest conversation content, and the list of principals that currently have access. Requires `CAN_USE_SPOTTER` privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, GetShareInfoRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.getShareInfo(
  // string | Unique identifier of the conversation.
  "conversation_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation. | defaults to undefined


### Return type

**ConversationShareStatusResponse**

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

# **getSharedContent**
> SharedConversationResponse getSharedContent()

 Returns the full read-only view of a shared conversation, including ordered messages and data source metadata. Accessible by the conversation owner and any principal (user or group) that has been granted access. Requires `CAN_USE_SPOTTER` privilege.    Version: 26.9.0.cl or later       

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, GetSharedContentRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.getSharedContent(
  // string | Unique identifier of the source conversation.
  "conversation_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationIdentifier** | [**string**] | Unique identifier of the source conversation. | defaults to undefined


### Return type

**SharedConversationResponse**

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

# **getUsageDataForUser**
> UsageDataForUserResponse getUsageDataForUser()

 Retrieves a user\'s combined Spotter usage position: every pool the user draws from, with usage, warning limits, and limits summed across them. Any user can retrieve their own usage. Retrieving another user\'s usage requires `ADMINISTRATION` privilege.    Version: 26.11.0.cl or later   Retrieves a user\'s combined Spotter usage: every usage pool the user draws from, with usage, warning limits, and limits summed across them. Use this API to show users how many Spotter questions they have left, or to check whether a user is blocked by a usage limit.  Any user can retrieve their own usage. Retrieving another user\'s usage requires `ADMINISTRATION` (Can administer ThoughtSpot) privilege; `CAN_MANAGE_SPOTTER` is not sufficient.  #### Usage guidelines  - Omit `user_identifier` to retrieve the usage of the authenticated user. - Pass `user_identifier` with a user GUID to retrieve that user\'s usage.  A user draws from every pool that meters them: their own pool, the pools of the user groups they belong to (including inherited groups), or their Org\'s pool, depending on the scope the cluster meters at. The totals in the response are sums over those pools. For example, a user in two groups with limits of 100 and 50 has a `total_limit` of 150.  If the request is successful, the response contains `summary`:  - `pools`: the individual pools the user draws from. - `total_usage`, `total_warning_limit`, and `total_limit`: sums across the pools. - `total_remaining`: questions the user can still ask. Absent when `has_unlimited_pool` is `true`. - `is_at_warning`: `true` when usage has reached the combined warning limit. - `is_at_limit`: `true` when usage has reached the combined limit and further Spotter questions are blocked. - `has_unlimited_pool`: `true` when any of the user\'s pools has no limit, which makes the user unlimited.  A user who draws from no pool is not metered: `pools` is empty and `is_at_limit` is `false`.  #### Error conditions  - `401` — authentication token is missing, expired, or invalid. - `403` — the caller requested another user\'s usage without `ADMINISTRATION` privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, GetUsageDataForUserRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.getUsageDataForUser(
  // string | GUID of the user whose usage to retrieve. Defaults to the authenticated user. Passing another user\'s GUID requires `ADMINISTRATION` privilege. (optional)
  "user_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdentifier** | [**string**] | GUID of the user whose usage to retrieve. Defaults to the authenticated user. Passing another user\&#39;s GUID requires &#x60;ADMINISTRATION&#x60; privilege. | (optional) defaults to undefined


### Return type

**UsageDataForUserResponse**

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

# **importMemory**
> ImportMemoryResponse importMemory(importMemoryRequest)

 Imports memory entries (rules, recipes, and always-apply rules) from a YAML payload, typically a payload produced by `exportMemory` and edited locally. The imported entries replace the existing memory for the data-models referenced in the payload. `dry_run` is required. Pass `true` first to validate the payload and review the preview counts and any row-level failures without making changes, then re-run with `dry_run = false` to apply the import. An import is not applied if any row fails validation. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to import data-model memories using a given yaml file. This yaml file can be obtained from the export memory API in source env and can be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To import memory, the request must include: - `content`: The full serialized memory payload to import (YAML). Typically the `content` value returned by the `exportMemory` API, edited locally and re-submitted. The payload itself identifies which data-models the memory applies to, so no separate identifier list is required. - `dry_run`: Required. When `true`, validate the payload and return preview counts without writing anything; when `false`, apply the import. Always run with `dry_run = true` first, then re-run with `dry_run = false` once you are satisfied with the preview.  The import replaces the existing global memories on the data-models referenced in the payload with the entries supplied in the payload.  The API returns a response object with: - `status`: The terminal status of the import (`SUCCESS`, `VALIDATION_FAILED`, or `FAILED`). - `summary`: Per `(memory_type, source)` counts. In a dry run the `deleted_record_count`/`inserted_record_count` are previews; in a real import they are actuals. On `VALIDATION_FAILED`, `summary` is `null` when validation fails before any item is processed (e.g. an unresolved or inaccessible data-model source) and an empty list otherwise — treat both as \"no counts available\". - `validation_failures`: Per-item validation failures, each with `line_number`, `reason`, `field_name`, and `message` for click-to-locate and inline highlighting. - `diagnostics`: Groups of diagnostic messages, each with a `sub_status` (`WARNING`, `FAILURE`, `ROLLED_BACK`, or `UNKNOWN`) and a `messages` list. This is the single channel for both non-fatal warnings (under `WARNING`, e.g. when some older memory entries could not be fully cleaned up) and fatal causes (e.g. the failure reason under `FAILURE`, or a `ROLLED_BACK` group when new entries were undone). - `operation_id`: A server-generated identifier for this import operation; include it when contacting support to help correlate server-side logs. Populated once the server registers the import operation; `null` when the request fails earlier (e.g. while parsing the payload or resolving its data-model sources).  #### File format  The payload is a YAML document with a single top-level `memories` key holding a list of memory items. Each item is self-contained: a `type`, a typed `content` block, a `datamodel_sources` list, and optional `tags`. Typically you don\'t hand-author this file — you obtain it from `exportMemory`, edit it, and submit it back through `importMemory`.  ```yaml memories: - type: RULE   content:     rule_definition: \"Always filter revenue to closed-won deals.\"   datamodel_sources:   - guid: 11111111-1111-1111-1111-111111111111     obj_id: sales_data_model   tags:   - finance - type: RULE   content:     rule_definition: \"Exclude internal test accounts from all results.\"   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \"top accounts by revenue\"     recipe: |       {\"steps\": [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \"monthly new customer count\"     recipe: |       {\"steps\": [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: ALWAYS_APPLY_RULES   content:     rules:     - \"Never show internal test accounts.\"     - \"Round currency to whole dollars.\"   datamodel_sources:   - guid: 22222222-2222-2222-2222-222222222222 ```  A file can contain multiple `RULE` and multiple `RECIPE` items for a data-model, but at most one `ALWAYS_APPLY_RULES` item per data-model.  ##### Memory item fields  | Field | Required | Type | Description | |-------|----------|------|-------------| | `type` | Yes | String enum | One of `RULE`, `RECIPE`, or `ALWAYS_APPLY_RULES`. | | `content` | Yes | Mapping | Type-specific content block (see below). | | `datamodel_sources` | Yes | Non-empty list | The data-model(s) the memory attaches to. | | `tags` | No | List of strings | Free-form labels. |  ##### Memory types and content  | `type` | Content fields | Notes | |--------|----------------|-------| | `RULE` | `rule_definition` — required, non-empty string | A single semantic rule. | | `RECIPE` | `recipe` and `user_query` — both required, non-empty strings | `recipe` is an opaque serialized blob; `user_query` is the natural-language query it answers. | | `ALWAYS_APPLY_RULES` | `rules` — required, non-empty list of non-empty strings | Data-model-wide always-apply rules. At most one `ALWAYS_APPLY_RULES` item per data-model. |  ##### Identifying data-models (`datamodel_sources`)  Each item must list at least one source. Each entry identifies a data-model by at least one of: - `guid` — the data-model GUID. - `obj_id` — a stable object ID, resolved to a GUID server-side.  If both are supplied, `obj_id` takes precedence and `guid` is ignored entirely; `guid` takes effect only when `obj_id` is absent. Exported files populate `guid` and, if present, `obj_id` as well.  > ⚠️ **Cross-environment import:** When `obj_id` is present it is > authoritative — the accompanying `guid` is **not** used as a fallback. > If an `obj_id` does not exist in the target environment, that item > fails with `UNRESOLVED_SOURCE`. Remove or correct stale `obj_id` > values before importing across environments.  #### Validations reference  The payload is fully validated before anything is written. This applies to `dry_run = true` and `dry_run = false` alike: if any item fails validation, the entire import is rejected — no partial writes — and all failures are returned together so you can fix them in one pass.  ##### Limits  Default limits (may be adjusted in future if the need arises):  | Limit | Default | |-------|---------| | Uploaded file size | 10 MiB | | Total memory items | 10,000 | | `rule_definition` length | 1,000 characters | | `user_query` length | 1,000 characters | | `recipe` length | 2,000 characters | | `rules` combined length (`ALWAYS_APPLY_RULES`) | 2,000 characters | | Tags per item | 10 | | Characters per tag | 50 |  The `rules` limit in `ALWAYS_APPLY_RULES` is a combined budget across all entries in the list, not per entry.  ##### Structural rules  - The document must be a mapping with a `memories` key whose value is a list. - Unknown keys — at the top level, within an item, or under `content` — are rejected. - Each item\'s `type` must be one of the three supported values, and `content` must match that type\'s shape. - Null, empty-string, or wrong-typed values in a required field are treated as missing. - Non-string or empty `tags` entries are dropped silently; certain tags reserved for internal use are stripped automatically before the item is stored.  ##### Cross-item rules  - A data-model referenced by more than one `ALWAYS_APPLY_RULES` item is rejected — combine them into a single item\'s `rules` list.  ##### Failure reasons  Each entry in `validation_failures` carries one of:  | Reason | Meaning | |--------|---------| | `SCHEMA` | YAML structure is invalid or unsupported. | | `VALIDATION` | A required field is missing/empty, a count exceeds a limit, or a GUID is malformed. | | `CHAR_LIMIT` | A content field or tag exceeds its size limit. | | `UNRESOLVED_SOURCE` | A `guid` or `obj_id` could not be resolved to an existing data-model. | | `ACCESS_DENIED` | The caller lacks sufficient access on the referenced data-model. |  #### Dry run  `dry_run` is required and has no default, so the import is always a deliberate two-step flow:  1. **First, call with `dry_run = true`.** This validates the payload and previews what would happen — the counts in `summary` and any `validation_failures` — without writing anything. 2. **Then, after reviewing a clean preview, call again with `dry_run = false`** (same `content`). This applies the import. It refuses to write when any item fails validation, so fix the reported `validation_failures` and resubmit.  > ###### Important: > Never call `dry_run = false` without first inspecting a `dry_run = true` preview. A real import deletes and replaces existing global memories on the referenced data-models.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                        | | 403  | Forbidden — the authenticated user does not have the necessary Spotter permissions, or the bearer token does not correspond to the data-model\'s org. Per-data-model access failures do not use this code — they surface as `ACCESS_DENIED` validation failures with HTTP `200` (see Logical failures below). |  #### Logical failures  Validation and write failures are not returned in the error envelope. The call returns `200` with a terminal `status` of `VALIDATION_FAILED` or `FAILED`, and the details live in `validation_failures` / `diagnostics`:  - **VALIDATION_FAILED** — one or more items failed schema/semantic validation; nothing was written. Inspect `validation_failures`, fix the items, and resubmit. - **FAILED** — the import did not complete. Inspect `diagnostics`: a `ROLLED_BACK` group means writing the new entries failed and any entries written before the failure were undone (existing memory is intact, no destructive change), while a `FAILURE` group carries another non-validation cause.  Sample `VALIDATION_FAILED` responses (HTTP 200):  **Invalid data-model (unresolved source):**  ```json {     \"status\": \"VALIDATION_FAILED\",     \"summary\": null,     \"validation_failures\": [         {             \"line_number\": 2,             \"reason\": \"UNRESOLVED_SOURCE\",             \"field_name\": \"datamodel_sources[0].guid\",             \"message\": \"unknown datamodel guid: 55555555-5555-5555-5555-555555555555\"         }     ],     \"diagnostics\": [         {             \"sub_status\": \"FAILURE\",             \"messages\": [                 \"unknown datamodel guid: 55555555-5555-5555-5555-555555555555\"             ]         }     ],     \"operation_id\": null } ```  **Inaccessible data-models:**  ```json {     \"status\": \"VALIDATION_FAILED\",     \"summary\": null,     \"validation_failures\": [         {             \"line_number\": 2,             \"reason\": \"ACCESS_DENIED\",             \"field_name\": \"datamodel_sources[0]\",             \"message\": \"Insufficient permissions on datamodel \'44444444-4444-4444-4444-444444444444\'\"         },         {             \"line_number\": 8,             \"reason\": \"ACCESS_DENIED\",             \"field_name\": \"datamodel_sources[0]\",             \"message\": \"Insufficient permissions on datamodel \'33333333-3333-3333-3333-333333333333\'\"         }     ],     \"diagnostics\": [         {             \"sub_status\": \"FAILURE\",             \"messages\": [                 \"Memory import validation failed with 2 error(s): Insufficient permissions on datamodel \'44444444-4444-4444-4444-444444444444\'; Insufficient permissions on datamodel \'33333333-3333-3333-3333-333333333333\'\"             ]         }     ],     \"operation_id\": null } ```  **Character-limit validations:**  ```json {     \"status\": \"VALIDATION_FAILED\",     \"summary\": [],     \"validation_failures\": [         {             \"line_number\": 3,             \"reason\": \"CHAR_LIMIT\",             \"field_name\": \"content.rule_definition\",             \"message\": \"content.rule_definition is 1073 characters; max allowed is 1000\"         },         {             \"line_number\": 49,             \"reason\": \"CHAR_LIMIT\",             \"field_name\": \"content.user_query\",             \"message\": \"content.user_query is 1150 characters; max allowed is 1000\"         },         {             \"line_number\": 49,             \"reason\": \"CHAR_LIMIT\",             \"field_name\": \"content.recipe\",             \"message\": \"content.recipe is 3574 characters; max allowed is 2000\"         }     ],     \"diagnostics\": [         {             \"sub_status\": \"FAILURE\",             \"messages\": [                 \"Validation failures present; fix them and re-run to see the DRY_RUN preview.\"             ]         }     ],     \"operation_id\": \"66666666-6666-6666-6666-666666666666\" } ```  > ###### Note: > - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 26.8.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, ImportMemoryRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

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

**ImportMemoryResponse**

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

# **searchUsageData**
> UsageDataResponse searchUsageData(searchUsageDataRequest)

 Retrieves Spotter usage pools: the question allowance configured for each user, user group, or Org and how much of it has been consumed. Pass `keys` to fetch specific pools, or omit it to fetch every pool on the cluster. Requires `ADMINISTRATION` privilege.    Version: 26.11.0.cl or later   Retrieves Spotter usage pools. A usage pool is the Spotter question allowance configured for a user, user group, or Org, together with how many questions have been consumed from it. Use this API to monitor usage across your users, for example to find pools that are close to their limit.  Requires `ADMINISTRATION` (Can administer ThoughtSpot) privilege. Users with only `CAN_MANAGE_SPOTTER`, and Org administrators without cluster-level `ADMINISTRATION`, cannot call this API.  #### Usage guidelines  A cluster meters Spotter usage at exactly one scope: per user, per user group, or per Org. Every pool on a cluster therefore has the same `entity_type`.  - To retrieve every pool on the cluster, send an empty request body. - To retrieve specific pools, pass `keys`, each with an `entity_type` (`USER`, `USER_GROUP`, or `ORG`) and an `entity_identifier` (the GUID of the user or user group, or the ID of the Org). Keys that match no pool are omitted from the response.  If the request is successful, the response contains `usage_data`, one entry per pool:  - `key`: the entity the pool meters. - `usage`: questions consumed from the pool. - `warning_limit`: usage level at which users are warned. Absent when no warning is configured. - `limit`: maximum questions the pool allows. Absent when the pool is unlimited. - `updated_time_in_millis` and `updated_by`: when and by whom the pool was last configured.  #### Error conditions  - `401` — authentication token is missing, expired, or invalid. - `403` — the caller does not have `ADMINISTRATION` privilege.  > ###### Note: > > - Use `getUsageDataForUser` to see the combined usage of a single user across every pool they draw from.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, SearchUsageDataRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.searchUsageData(
  // SearchUsageDataRequest
  {
    keys: [
      {
        entity_type: "USER",
        entity_identifier: "entity_identifier_example",
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
 **searchUsageDataRequest** | **SearchUsageDataRequest**|  |


### Return type

**UsageDataResponse**

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
import { createBearerAuthenticationConfig, AIManagementApi, SetAgentInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

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

 Version: 10.15.0.cl or later   Sets the data model instructions for a specific data model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - `data_source_identifier`: The unique ID of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - `success`: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, SetNLInstructionsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

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

# **shareConversation**
> void shareConversation(shareConversationRequest)

 Grants or revokes access to a shared conversation for one or more principals (users or groups). When principals are added, a read-only shared view of the conversation is created from its current state. Use `refresh_shared_content` to regenerate the shared view with the latest conversation content. Requires `CAN_USE_SPOTTER` privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, ShareConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.shareConversation(
  // string | Unique identifier of the conversation to share.
  "conversation_identifier_example" , 
  // ShareConversationRequest
  {
    refresh_shared_content: false,
    grant: [
      {
        principal_identifier: "principal_identifier_example",
        principal_type: "USER",
      },
    ],
    revoke: [
      {
        principal_identifier: "principal_identifier_example",
        principal_type: "USER",
      },
    ],
    notify_on_share: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareConversationRequest** | **ShareConversationRequest**|  |
 **conversationIdentifier** | [**string**] | Unique identifier of the conversation to share. | defaults to undefined


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
**204** | Successfully updated the share access for the conversation. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateConversation**
> void updateConversation(updateConversationRequest)

 Updates attributes of an existing agent conversation. Supports updating the display title and the pinned state; additional conversation attributes may be supported in future versions. At least one updatable attribute must be provided in the request body. Each attribute is applied independently, so omitted attributes are left unchanged.    Version: 26.7.0.cl or later   **Deprecated** — Spotter names conversations automatically; read the title with `getConversationList`. This endpoint will be removed in a future release.  Updates attributes of an existing saved agent conversation. Supports updating the conversation\'s display `title` and its `is_pinned` state; additional updatable attributes may be supported in future versions. At least one updatable attribute must be supplied in the request body.  Use this endpoint to rename a conversation, or to pin a conversation so that it is surfaced first in the conversation list for quick access.  Requires `CAN_USE_SPOTTER` privilege and ownership of the conversation being updated.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation to update, as returned by `createAgentConversation` or `getConversationList` - At least one updatable attribute in the request body:     - `title` *(optional)*: the new display name for the conversation. An empty or whitespace-only value is replaced with a default title rather than rejected.     - `is_pinned` *(optional)*: `true` to pin the conversation, `false` to unpin it. Available from version 26.10.0.cl.  Each attribute is applied independently: omitted attributes are left unchanged, so you can update the title and the pinned state in a single request or in separate requests. Updating `is_pinned` is idempotent — pinning an already-pinned conversation, or unpinning an already-unpinned one, succeeds with no side effects.  A successful request returns an empty `204 No Content` response. Updated attributes are reflected immediately in subsequent calls to `getConversationList`.  #### Example request  Rename a conversation:  ```bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \"title\": \"Revenue Breakdown by Product Line\" } ```  Pin a conversation:  ```bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \"is_pinned\": true } ```  Update both attributes in a single request:  ```bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \"title\": \"Revenue Breakdown by Product Line\",   \"is_pinned\": true } ```  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad Request — the request body supplies neither `title` nor `is_pinned`, or `is_pinned` is not a boolean. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given `conversation_identifier` for the authenticated user. | | 422  | Unprocessable Entity — the request body is malformed or contains an invalid field value. |  > ###### Note: > > - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. > - Only conversations created with `enable_save_chat: true` can be updated. Unsaved conversations are not persisted and do not have a retrievable identifier. > - There is no limit on the number of conversations a user can pin. > - Available from version 26.7.0.cl and later. The `is_pinned` attribute is available from version 26.10.0.cl and later. > - Supports `V1` conversations only. Conversations created with `spotter_experience_version: V2` are not found. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, UpdateConversationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.updateConversation(
  // string | Unique identifier of the conversation to update.
  "conversation_identifier_example" , 
  // UpdateConversationRequest
  {
    title: "title_example",
    is_pinned: true,
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

# **updateUsageData**
> UsageDataResponse updateUsageData(updateUsageDataRequest)

 Creates or updates Spotter usage pools, setting the question allowance for a user, user group, or Org. A pool that does not exist is created; fields omitted from an update keep their current value. Every key must use the scope the cluster meters at. Switching scope requires deleting the existing pools first. Requires `ADMINISTRATION` privilege.    Version: 26.11.0.cl or later   Creates or updates Spotter usage pools. A usage pool sets how many Spotter questions a user, user group, or Org can ask. Use this API to provision limits for new users or groups, raise or lower an existing limit, or reset usage at the start of a billing period.  Requires `ADMINISTRATION` (Can administer ThoughtSpot) privilege. Users with only `CAN_MANAGE_SPOTTER`, and Org administrators without cluster-level `ADMINISTRATION`, cannot call this API.  #### Usage guidelines  The request must include `updates`, with at least one entry. Each entry contains:  - `key` (required): the pool to create or update, with an `entity_type` (`USER`, `USER_GROUP`, or `ORG`) and an `entity_identifier` (the GUID of the user or user group, or the ID of the Org). - `limit` (optional): maximum Spotter questions the pool allows. - `warning_limit` (optional): usage level at which users are warned that they are approaching the limit. - `usage` (optional): questions consumed so far. Set to `0` to reset the pool.  A pool that does not exist is created. Fields omitted from an entry keep their current value.  A cluster meters Spotter usage at exactly one scope. The first pool created sets the scope, and every later key must use the same `entity_type`. To switch scope, delete the existing pools with `deleteUsageData` first.  If the request is successful, the response contains `usage_data`, with each updated pool as it stands after the change.  #### Error conditions  - `400` — `updates` is empty, a key is missing its `entity_type` or `entity_identifier`, or a key uses a different `entity_type` from the cluster\'s existing pools. - `401` — authentication token is missing, expired, or invalid. - `403` — the caller does not have `ADMINISTRATION` privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, AIManagementApi, UpdateUsageDataRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new AIManagementApi(configuration);

apiInstance.updateUsageData(
  // UpdateUsageDataRequest
  {
    updates: [
      {
        key: {
          entity_type: "USER",
          entity_identifier: "entity_identifier_example",
        },
        limit: null,
        warning_limit: null,
        usage: null,
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
 **updateUsageDataRequest** | **UpdateUsageDataRequest**|  |


### Return type

**UsageDataResponse**

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

