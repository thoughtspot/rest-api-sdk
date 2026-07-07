/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AgentConversation;
import com.thoughtspot.client.model.AgentConversationHistoryResponse;
import com.thoughtspot.client.model.AgentInstructions;
import com.thoughtspot.client.model.Conversation;
import com.thoughtspot.client.model.ConversationMessageResponse;
import com.thoughtspot.client.model.CreateAgentConversationRequest;
import com.thoughtspot.client.model.CreateConversationRequest;
import com.thoughtspot.client.model.EurekaDataSourceSuggestionResponse;
import com.thoughtspot.client.model.EurekaDecomposeQueryResponse;
import com.thoughtspot.client.model.EurekaGetNLInstructionsResponse;
import com.thoughtspot.client.model.EurekaGetRelevantQuestionsResponse;
import com.thoughtspot.client.model.EurekaSetNLInstructionsResponse;
import com.thoughtspot.client.model.GetDataSourceSuggestionsRequest;
import com.thoughtspot.client.model.GetNLInstructionsRequest;
import com.thoughtspot.client.model.GetRelevantQuestionsRequest;
import com.thoughtspot.client.model.LoadAnswerResponse;
import com.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import com.thoughtspot.client.model.ResponseMessage;
import com.thoughtspot.client.model.SendAgentConversationMessageRequest;
import com.thoughtspot.client.model.SendAgentConversationMessageStreamingRequest;
import com.thoughtspot.client.model.SendAgentMessageRequest;
import com.thoughtspot.client.model.SendAgentMessageStreamingRequest;
import com.thoughtspot.client.model.SendMessageRequest;
import com.thoughtspot.client.model.SetAgentInstructionsRequest;
import com.thoughtspot.client.model.SetNLInstructionsRequest;
import com.thoughtspot.client.model.SingleAnswerRequest;
import com.thoughtspot.client.model.UpdateConversationRequest;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for AiApi */
@Disabled
public class AiApiTest {

    private final AiApi api = new AiApi();

    /**
     * Version: 26.2.0.cl or later Creates a new Spotter agent conversation based on the provided
     * context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object
     * specified in the request. #### Usage guidelines The request must include the
     * &#x60;metadata_context&#x60; parameter to define the conversation context. The context type
     * can be one of: - &#x60;DATA_SOURCE&#x60; *(available from 26.5.0.cl)*: targets a specific
     * data source. Provide &#x60;data_source_identifier&#x60; in &#x60;data_source_context&#x60;
     * for a single data source, or &#x60;data_source_identifiers&#x60; for multi-data-source
     * context. The deprecated &#x60;guid&#x60; field is accepted for backwards compatibility. -
     * &#x60;AUTO_MODE&#x60; *(available from 26.5.0.cl)*: automatically discovers and selects the
     * most relevant datasets for the user&#39;s queries. &gt; **Note for callers on versions
     * 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase &#x60;data_source&#x60; enum value with the
     * &#x60;guid&#x60; field instead of the above. Example: &#x60;{ \&quot;type\&quot;:
     * \&quot;data_source\&quot;, \&quot;data_source_context\&quot;: { \&quot;guid\&quot;:
     * \&quot;&lt;worksheet-id&gt;\&quot; } }&#x60;. The &#x60;conversation_settings&#x60; parameter
     * controls which Spotter capabilities are enabled for the conversation: -
     * &#x60;enable_contextual_change_analysis&#x60; (default: &#x60;true&#x60;, **deprecated from
     * 26.2.0.cl**) — always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect
     * on versions &gt;&#x3D; 26.2.0.cl - &#x60;enable_natural_language_answer_generation&#x60;
     * (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3;
     * setting this to &#x60;false&#x60; has no effect on versions &gt;&#x3D; 26.2.0.cl -
     * &#x60;enable_reasoning&#x60; (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) —
     * always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect on versions
     * &gt;&#x3D; 26.2.0.cl - &#x60;enable_save_chat&#x60; (default: &#x60;false&#x60;, *available
     * from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation
     * history If the request is successful, the response includes a unique
     * &#x60;conversation_identifier&#x60; that must be passed to
     * &#x60;sendAgentConversationMessage&#x60; or &#x60;sendAgentConversationMessageStreaming&#x60;
     * to send messages within this conversation. The response also includes
     * &#x60;conversation_id&#x60; with the same value for backwards compatibility; use
     * &#x60;conversation_identifier&#x60; for new integrations. #### Example request
     * &#x60;&#x60;&#x60;json { \&quot;metadata_context\&quot;: { \&quot;type\&quot;:
     * \&quot;DATA_SOURCE\&quot;, \&quot;data_source_context\&quot;: {
     * \&quot;data_source_identifier\&quot;: \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot; } },
     * \&quot;conversation_settings\&quot;: {} } &#x60;&#x60;&#x60; #### Error responses | Code |
     * Description | | ---- |
     * ---------------------------------------------------------------------------------------------------------------------------------------
     * | | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the specified metadata object. | &gt; ###### Note: &gt; &gt; - This
     * endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version
     * 26.5.0.cl. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to
     * enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAgentConversationTest() throws ApiException {
        CreateAgentConversationRequest createAgentConversationRequest = null;
        AgentConversation response = api.createAgentConversation(createAgentConversationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Creates a new conversation session tied to a specific data model
     * for AI-driven natural language querying. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and
     * at least view access to the metadata object specified in the request. #### Usage guidelines
     * The request must include: - &#x60;metadata_identifier&#x60;: the unique ID of the data source
     * that provides context for the conversation Optionally, you can provide: - &#x60;tokens&#x60;:
     * a token string to set initial context for the conversation (e.g., &#x60;\&quot;[sales],[item
     * type],[state]\&quot;&#x60;) If the request is successful, ThoughtSpot returns a unique
     * &#x60;conversation_identifier&#x60; that must be passed to &#x60;sendMessage&#x60; to
     * continue the conversation. #### Error responses | Code | Description | |------|-------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the specified metadata object. | &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConversationTest() throws ApiException {
        CreateConversationRequest createConversationRequest = null;
        Conversation response = api.createConversation(createConversationRequest);
        // TODO: test validations
    }

    /**
     * Deletes an existing agent conversation. Version: 26.7.0.cl or later Permanently deletes an
     * existing saved agent conversation and all its associated messages. This operation is
     * irreversible — deleted conversations cannot be recovered. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being deleted. ####
     * Usage guidelines The request must include: - &#x60;conversation_identifier&#x60; *(path
     * parameter)*: the unique ID of the conversation to delete, as returned by
     * &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60; A successful request
     * returns an empty &#x60;204 No Content&#x60; response. The deleted conversation no longer
     * appears in &#x60;getConversationList&#x60;. #### Example request &#x60;&#x60;&#x60;bash
     * DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete
     * &#x60;&#x60;&#x60; #### Error responses | Code | Description | |------|-------------| | 401 |
     * Unauthorized — authentication token is missing, expired, or invalid. | | 403 | Forbidden —
     * the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own
     * the specified conversation. | | 404 | Not Found — no conversation exists with the given
     * &#x60;conversation_identifier&#x60; for the authenticated user. | &gt; ###### Note: &gt; &gt;
     * - Deletion is permanent and cannot be undone. Ensure the correct
     * &#x60;conversation_identifier&#x60; is used before calling this endpoint. &gt; - Only
     * conversations created with &#x60;enable_save_chat: true&#x60; are persisted and can be
     * deleted via this endpoint. &gt; - Available from version 26.7.0.cl and later. &gt; - This
     * endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your
     * cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConversationTest() throws ApiException {
        String conversationIdentifier = null;
        api.deleteConversation(conversationIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 26.6.0.cl or later Retrieves the admin instructions currently configured for the AI
     * agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior
     * across all conversations. Requires admin privileges. Only users with org admin access can
     * retrieve agent instructions. #### Usage guidelines No input parameters are required. The API
     * returns the stored &#x60;AgentInstructions&#x60; record for the caller&#39;s tenant and org.
     * If no instructions have been configured yet, the API returns a record with an empty
     * &#x60;instructions&#x60; field and &#x60;null&#x60; values for &#x60;id&#x60;,
     * &#x60;created_at&#x60;, &#x60;updated_at&#x60;, and &#x60;last_updated_by&#x60;. If the
     * request is successful, the response includes: - &#x60;id&#x60;: unique identifier of the
     * instructions record - &#x60;instructions&#x60;: the configured instructions text -
     * &#x60;created_at&#x60;: ISO timestamp when the instructions were first saved -
     * &#x60;updated_at&#x60;: ISO timestamp when the instructions were last updated -
     * &#x60;last_updated_by&#x60;: user ID of the admin who last updated the instructions (may be
     * &#x60;null&#x60; for older records) #### Error responses | Code | Description |
     * |------|-------------| | 401 | Unauthorized — authentication token is missing, expired, or
     * invalid. | | 403 | Forbidden — the authenticated user does not have org admin privileges
     * required to read agent instructions. | &gt; ###### Note: &gt; &gt; - Use
     * &#x60;setAgentInstructions&#x60; to create or update agent instructions. &gt; - Available
     * from version 26.6.0.cl and later.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgentInstructionsTest() throws ApiException {
        AgentInstructions response = api.getAgentInstructions();
        // TODO: test validations
    }

    /**
     * Retrieves the full public-safe content of a saved agent conversation: ordered turns (user
     * messages and agent response items) and sanitized code-execution file metadata. Internal graph
     * or branch state, Azure file identifiers, and messages with a &#x60;SYSTEM&#x60; source are
     * omitted. The full answer payload is not embedded; fetch it separately via
     * &#x60;loadAnswer&#x60; using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response
     * item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified
     * conversation. Version: 26.7.0.cl or later Retrieves the full public-safe content of a saved
     * agent conversation. Returns ordered conversation messages — each carrying an optional user
     * prompt (the user&#39;s message and any attachments) and the agent response items produced for
     * that turn — plus sanitized metadata for any files generated by the code-execution tool. Use
     * this endpoint to render a persisted conversation in a UI, build an audit trail, or
     * post-process a completed conversation. The full answer payload is not embedded — fetch it
     * separately via &#x60;loadAnswer&#x60; using the &#x60;answer_id&#x60; on each
     * &#x60;answer&#x60; response item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access
     * to the specified conversation. #### Usage guidelines The request must include: -
     * &#x60;conversation_identifier&#x60; _(path parameter)_: the unique ID of the conversation, as
     * returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;. If the
     * request is successful, the response contains two top-level fields: | Field | Type |
     * Description | | ---------------------- | ------------------------------------------- |
     * ----------------------------------------------------------------------------------------------------------------------------------------------------
     * | | &#x60;messages&#x60; | &#x60;ConversationMessage[]&#x60; | Ordered oldest to newest.
     * Empty array when the conversation has no messages. | | &#x60;code_execution_files&#x60; |
     * &#x60;CodeExecutionFileMetadata[]&#x60; | List of sanitized file metadata entries (one per
     * &#x60;file_id&#x60;). Covers all code-execution-generated files referenced anywhere in the
     * conversation. Empty array when there are none. | No other top-level fields are returned. ####
     * ConversationMessage fields | Field | Type | Description | | --------------------- |
     * ---------------------------- |
     * --------------------------------------------------------------------------------------------------------------
     * | | &#x60;message_id&#x60; | &#x60;String&#x60; | Stable identifier for the turn. For
     * liveboard-started synthetic first turns, this is the root node identifier. | |
     * &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60; | Milliseconds since Unix epoch for the
     * turn. | | &#x60;user_prompt&#x60; | &#x60;UserPrompt&#x60; | User-authored prompt that
     * started the turn (message and attachments). &#x60;null&#x60; for liveboard-started synthetic
     * first turns. | | &#x60;response_items&#x60; | &#x60;ConversationResponseItem[]&#x60; |
     * Agent-side output produced in response to this turn. Empty array for in-progress turns. |
     * #### UserPrompt fields | Field | Type | Description | | ------------- |
     * ---------------------- |
     * ----------------------------------------------------------------------------------------------------
     * | | &#x60;message&#x60; | &#x60;UserMessage&#x60; | User query that started the turn.
     * &#x60;null&#x60; for liveboard-started synthetic first turns. | | &#x60;attachments&#x60; |
     * &#x60;UserAttachmentItem[]&#x60; | Files or connector resources attached to the user message.
     * Empty array when there are no attachments. | #### UserMessage fields | Field | Type |
     * Description | | ------------ | -------- | --------------------------------------------- | |
     * &#x60;message_id&#x60; | &#x60;String&#x60; | Unique identifier of the user-source message. |
     * | &#x60;content&#x60; | &#x60;String&#x60; | Text body of the user query. | ####
     * UserAttachmentItem fields Discriminated by &#x60;type&#x60;. Only
     * &#x60;\&quot;file\&quot;&#x60; or &#x60;\&quot;resource\&quot;&#x60; are valid values. Only
     * the fields for the indicated variant are populated. See &#x60;ConversationResponseItem&#x60;
     * below for the field definitions of the &#x60;file&#x60; and &#x60;resource&#x60; variants —
     * &#x60;UserAttachmentItem&#x60; uses the same fields. #### ConversationResponseItem fields
     * Every item carries a &#x60;type&#x60; discriminator and these shared fields: | Field | Type |
     * Description | | --------------------- | --------- |
     * ------------------------------------------------------------------------------------------------------------------------------
     * | | &#x60;type&#x60; | &#x60;String&#x60; | Discriminator. One of
     * &#x60;\&quot;text\&quot;&#x60;, &#x60;\&quot;tool_call\&quot;&#x60;,
     * &#x60;\&quot;tool_result\&quot;&#x60;, &#x60;\&quot;answer\&quot;&#x60;,
     * &#x60;\&quot;file\&quot;&#x60;, &#x60;\&quot;resource\&quot;&#x60;,
     * &#x60;\&quot;search_datasets\&quot;&#x60;. | | &#x60;timestamp_in_millis&#x60; |
     * &#x60;Long&#x60; | Milliseconds since Unix epoch when this item was produced. | |
     * &#x60;is_thinking&#x60; | &#x60;Boolean&#x60; | &#x60;true&#x60; when the item represents
     * internal agent reasoning rather than user-facing output. Consumers may hide or collapse
     * these. | | &#x60;step_title&#x60; | &#x60;String&#x60; | Human-readable label for the agent
     * step producing this item (e.g. &#x60;\&quot;Searching\&quot;&#x60;,
     * &#x60;\&quot;Visualising\&quot;&#x60;). | Variant-specific fields: - **&#x60;text&#x60;** —
     * agent text output: &#x60;content&#x60; (String), &#x60;content_type&#x60;
     * (&#x60;ContentMimeType&#x60; enum), &#x60;file_reference&#x60; (FileReference). -
     * **&#x60;tool_call&#x60;** — agent invoked a tool: &#x60;tool_call_id&#x60; (String),
     * &#x60;tool_name&#x60; (String), &#x60;arguments&#x60; (JSON object). -
     * **&#x60;tool_result&#x60;** — result returned from a tool invocation:
     * &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;, &#x60;content&#x60;,
     * &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;success&#x60; (Boolean). -
     * **&#x60;answer&#x60;** — slim reference to a saved answer: &#x60;answer_id&#x60; (String),
     * &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;. - **&#x60;file&#x60;** — uploaded or
     * generated files: &#x60;files&#x60; (&#x60;PublicFileInfo[]&#x60;). - **&#x60;resource&#x60;**
     * — MCP connector resource: &#x60;title&#x60;, &#x60;uri&#x60;, &#x60;name&#x60;,
     * &#x60;mime_type&#x60;, &#x60;description&#x60;, &#x60;size&#x60; (Int),
     * &#x60;connector_id&#x60;, &#x60;connector_name&#x60;, &#x60;connector_slug&#x60;,
     * &#x60;transport_type&#x60; (&#x60;TransportType&#x60; enum). -
     * **&#x60;search_datasets&#x60;** — dataset discovery result: &#x60;text&#x60; (String),
     * &#x60;data_sources&#x60; (&#x60;DataSourceInfo[]&#x60;). Clients should switch on
     * &#x60;type&#x60; and ignore unknown variants for forward-compatibility. #### content_type
     * values &#x60;content_type&#x60; is the &#x60;ContentMimeType&#x60; enum. The following values
     * are defined: | Value | Wire MIME | Meaning | | --------------------------- |
     * --------------------------- | ---------------------------------------------------- | |
     * &#x60;TEXT_PLAIN&#x60; | &#x60;text/plain&#x60; | Plain text. Default for
     * &#x60;tool_result&#x60;. | | &#x60;TEXT_MARKDOWN&#x60; | &#x60;text/markdown&#x60; |
     * Markdown. Default for &#x60;text&#x60;. | | &#x60;TEXT_X_MARKDOWN_WITH_CODE&#x60; |
     * &#x60;text/x-markdown-with-code&#x60; | Markdown whose body starts with a fenced code block.
     * | | &#x60;TEXT_HTML&#x60; | &#x60;text/html&#x60; | Raw HTML. | #### transport_type values
     * &#x60;transport_type&#x60; is the &#x60;TransportType&#x60; enum used on the
     * &#x60;resource&#x60; variant. | Value | Meaning | | ------------------ |
     * --------------------------------------------- | | &#x60;STREAMABLE_HTTP&#x60; | Streamable
     * HTTP transport (default for MCP). | | &#x60;SSE&#x60; | Server-sent events transport. | ####
     * FileReference fields | Field | Type | Description | | ------------------------ | -------- |
     * ------------------------------------------------------------ | | &#x60;file_id&#x60; |
     * &#x60;String&#x60; | Unique identifier of the code-execution-generated file. | |
     * &#x60;display_name&#x60; | &#x60;String&#x60; | Human-readable file name. | |
     * &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60; | Milliseconds since Unix epoch when
     * the file was created. | Cross-reference &#x60;file_id&#x60; against
     * &#x60;code_execution_files&#x60; to retrieve full metadata including the &#x60;expired&#x60;
     * flag before attempting a download. #### PublicFileInfo fields | Field | Type | Description |
     * | ------------------------ | -------- |
     * -------------------------------------------------------- | | &#x60;file_id&#x60; |
     * &#x60;String&#x60; | Unique identifier of the file. | | &#x60;display_name&#x60; |
     * &#x60;String&#x60; | Human-readable file name. | | &#x60;file_type&#x60; | &#x60;String&#x60;
     * | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;. | |
     * &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60; | Milliseconds since Unix epoch when
     * the file was created. | | &#x60;size_bytes&#x60; | &#x60;Int&#x60; | File size in bytes. |
     * #### CodeExecutionFileMetadata fields Each entry in the &#x60;code_execution_files&#x60;
     * array contains: | Field | Type | Description | | ------------------------ | --------- |
     * -------------------------------------------------------------------------------------------------------------------------------
     * | | &#x60;file_id&#x60; | &#x60;String&#x60; | Unique identifier of the file. | |
     * &#x60;display_name&#x60; | &#x60;String&#x60; | Human-readable file name. | |
     * &#x60;file_type&#x60; | &#x60;String&#x60; | File type such as &#x60;csv&#x60;,
     * &#x60;pdf&#x60;, or &#x60;png&#x60;. | | &#x60;created_time_in_millis&#x60; |
     * &#x60;Long&#x60; | Milliseconds since Unix epoch when the file was created. | |
     * &#x60;expired&#x60; | &#x60;Boolean&#x60; | When &#x60;true&#x60;, the underlying file is no
     * longer retrievable from code-execution storage; UIs should disable download and preview. |
     * #### Loading answer payloads Each &#x60;AnswerResponseItem&#x60; in the response contains an
     * &#x60;answer_id&#x60; field. Pass this value as the &#x60;answer_identifier&#x60; parameter
     * to &#x60;loadAnswer&#x60; to retrieve the full answer payload (TML tokens, visualization
     * metadata) for that item. #### Example request &#x60;&#x60;&#x60;bash GET
     * /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages &#x60;&#x60;&#x60;
     * #### Example response &#x60;&#x60;&#x60;json { \&quot;messages\&quot;: [ {
     * \&quot;message_id\&quot;: \&quot;node_u_01\&quot;, \&quot;timestamp_in_millis\&quot;:
     * 1744000000000, \&quot;user_prompt\&quot;: { \&quot;message\&quot;: {
     * \&quot;message_id\&quot;: \&quot;msg_u_01\&quot;, \&quot;content\&quot;: \&quot;Show me
     * revenue by region as a chart.\&quot; }, \&quot;attachments\&quot;: [] },
     * \&quot;response_items\&quot;: [ { \&quot;type\&quot;: \&quot;tool_call\&quot;,
     * \&quot;tool_call_id\&quot;: \&quot;toolu_01ABC\&quot;, \&quot;tool_name\&quot;:
     * \&quot;search_datasets\&quot;, \&quot;step_title\&quot;: \&quot;Searching datasets\&quot;,
     * \&quot;arguments\&quot;: { \&quot;query\&quot;: \&quot;revenue\&quot; },
     * \&quot;timestamp_in_millis\&quot;: 1744000001000, \&quot;is_thinking\&quot;: false }, {
     * \&quot;type\&quot;: \&quot;answer\&quot;, \&quot;answer_id\&quot;: \&quot;ans_01XYZ\&quot;,
     * \&quot;tool_call_id\&quot;: \&quot;toolu_02DEF\&quot;, \&quot;tool_name\&quot;:
     * \&quot;fetch_and_visualize\&quot;, \&quot;step_title\&quot;: \&quot;Visualising\&quot;,
     * \&quot;timestamp_in_millis\&quot;: 1744000004000, \&quot;is_thinking\&quot;: false }, {
     * \&quot;type\&quot;: \&quot;text\&quot;, \&quot;content\&quot;: \&quot;Revenue is highest in
     * APAC.\&quot;, \&quot;content_type\&quot;: \&quot;TEXT_MARKDOWN\&quot;,
     * \&quot;timestamp_in_millis\&quot;: 1744000005000, \&quot;is_thinking\&quot;: false,
     * \&quot;step_title\&quot;: null, \&quot;file_reference\&quot;: { \&quot;file_id\&quot;:
     * \&quot;revenue_by_region.csv\&quot;, \&quot;display_name\&quot;:
     * \&quot;revenue_by_region.csv\&quot;, \&quot;created_time_in_millis\&quot;: 1744027200000 } }
     * ] } ], \&quot;code_execution_files\&quot;: [ { \&quot;file_id\&quot;:
     * \&quot;revenue_by_region.csv\&quot;, \&quot;display_name\&quot;:
     * \&quot;revenue_by_region.csv\&quot;, \&quot;file_type\&quot;: \&quot;csv\&quot;,
     * \&quot;created_time_in_millis\&quot;: 1744027200000, \&quot;expired\&quot;: false } ] }
     * &#x60;&#x60;&#x60; #### Example: liveboard-started conversation When a conversation is
     * initiated from a saved liveboard visualization rather than a user query, the first turn is
     * synthetic. &#x60;user_prompt&#x60; is &#x60;null&#x60;, and &#x60;response_items&#x60;
     * contains a single &#x60;answer&#x60; item referencing the seed visualization.
     * &#x60;&#x60;&#x60;json { \&quot;messages\&quot;: [ { \&quot;message_id\&quot;:
     * \&quot;ROOT_NODE\&quot;, \&quot;timestamp_in_millis\&quot;: 1743999000000,
     * \&quot;user_prompt\&quot;: null, \&quot;response_items\&quot;: [ { \&quot;type\&quot;:
     * \&quot;answer\&quot;, \&quot;answer_id\&quot;: \&quot;lb_seed_01\&quot;,
     * \&quot;tool_call_id\&quot;: null, \&quot;tool_name\&quot;: null, \&quot;step_title\&quot;:
     * null, \&quot;timestamp_in_millis\&quot;: 1743999000000, \&quot;is_thinking\&quot;: false } ]
     * } ], \&quot;code_execution_files\&quot;: [] } &#x60;&#x60;&#x60; Subsequent turns follow the
     * normal user-to-agent pattern. #### Error responses | Code | Description | | ---- |
     * ---------------------------------------------------------------------------------------------------------------------------
     * | | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks access to the specified conversation. | | 404 | Not Found — no conversation exists with
     * the given identifier for the authenticated user. | &gt; ###### Note: &gt; &gt; - Messages
     * with an internal &#x60;SYSTEM&#x60; source are always dropped from the response. &gt; -
     * In-progress turns are still returned with an empty &#x60;response_items&#x60; array so
     * clients can render the user message immediately. &gt; - Do not assume every
     * &#x60;tool_call&#x60; has a paired &#x60;tool_result&#x60; or &#x60;answer&#x60; — an
     * interrupted conversation can leave a dangling call. &gt; - Available from version 26.7.0.cl
     * and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to
     * enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConversationTest() throws ApiException {
        String conversationIdentifier = null;
        ConversationMessageResponse response = api.getConversation(conversationIdentifier);
        // TODO: test validations
    }

    /**
     * Retrieves the list of saved agent conversations for the currently authenticated user. Only
     * conversations created with &#x60;enable_save_chat: true&#x60; are returned. Version:
     * 26.7.0.cl or later Retrieves a paginated list of saved agent conversations for the currently
     * authenticated user. Only conversations that were created with &#x60;enable_save_chat:
     * true&#x60; in &#x60;createAgentConversation&#x60; are returned. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege. #### Usage guidelines The request supports the
     * following optional query parameters: - &#x60;limit&#x60;: maximum number of conversations to
     * return. Use this together with &#x60;offset&#x60; for pagination. - &#x60;offset&#x60;:
     * number of conversations to skip before returning results. Defaults to &#x60;0&#x60;. -
     * &#x60;skip_empty&#x60;: when &#x60;true&#x60; (default), conversations with no messages are
     * excluded from the results. Set to &#x60;false&#x60; to include empty conversations. If the
     * request is successful, the response includes a &#x60;conversations&#x60; array. Each entry
     * contains: - &#x60;conversation_identifier&#x60;: the unique ID of the conversation, used as
     * input to &#x60;sendAgentConversationMessage&#x60;, &#x60;updateConversation&#x60;,
     * &#x60;deleteConversation&#x60;, &#x60;stopConversation&#x60;, and &#x60;loadAnswer&#x60; -
     * &#x60;conversation_title&#x60;: the display name of the conversation -
     * &#x60;created_at&#x60;: ISO 8601 timestamp of when the conversation was created -
     * &#x60;updated_at&#x60;: ISO 8601 timestamp of the most recent update to the conversation -
     * &#x60;data_source_identifiers&#x60;: list of unique IDs of the data sources associated with
     * the conversation - &#x60;data_source_names&#x60;: array of &#x60;{ id, name }&#x60; objects
     * for the data sources associated with the conversation #### Pagination Use &#x60;limit&#x60;
     * and &#x60;offset&#x60; to page through large result sets: &#x60;&#x60;&#x60; GET
     * /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;0 → first page GET
     * /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;20 → second page
     * &#x60;&#x60;&#x60; #### Pagination and &#x60;has_more&#x60; The response includes a
     * &#x60;has_more: Boolean&#x60; field. When &#x60;true&#x60;, there are additional
     * conversations beyond the current page — increment &#x60;offset&#x60; by &#x60;limit&#x60; to
     * fetch the next page. When &#x60;has_more&#x60; is &#x60;false&#x60;, the current page is the
     * last. Note that &#x60;total_count&#x60; is not returned; use &#x60;has_more&#x60; to drive
     * paging controls. #### Example response &#x60;&#x60;&#x60;json { \&quot;conversations\&quot;:
     * [ { \&quot;conversation_identifier\&quot;: \&quot;abc123\&quot;,
     * \&quot;conversation_title\&quot;: \&quot;Sales by Region Q1\&quot;, \&quot;created_at\&quot;:
     * \&quot;2026-03-01T10:00:00Z\&quot;, \&quot;updated_at\&quot;:
     * \&quot;2026-03-05T14:23:00Z\&quot;, \&quot;data_source_identifiers\&quot;:
     * [\&quot;ds-001\&quot;], \&quot;data_source_names\&quot;: [{ \&quot;id\&quot;:
     * \&quot;ds-001\&quot;, \&quot;name\&quot;: \&quot;Retail Sales\&quot; }] } ],
     * \&quot;has_more\&quot;: false } &#x60;&#x60;&#x60; #### Error responses | Code | Description
     * | |------|-------------| | 401 | Unauthorized — authentication token is missing, expired, or
     * invalid. | | 403 | Forbidden — the authenticated user does not have
     * &#x60;CAN_USE_SPOTTER&#x60; privilege. | &gt; ###### Note: &gt; &gt; - Only conversations
     * created with &#x60;enable_save_chat: true&#x60; appear in this list. Conversations created
     * with &#x60;enable_save_chat: false&#x60; (the default) are not persisted and cannot be
     * retrieved. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires
     * Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConversationListTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        Boolean skipEmpty = null;
        AgentConversationHistoryResponse response =
                api.getConversationList(limit, offset, skipEmpty);
        // TODO: test validations
    }

    /**
     * Version: 10.15.0.cl or later Suggests the most relevant data sources for a given natural
     * language query, ranked by confidence with LLM-generated reasoning. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the underlying
     * metadata entities referenced in the response. #### Usage guidelines The request must include:
     * - &#x60;query&#x60;: the natural language question to find relevant data sources for If the
     * request is successful, the API returns a ranked list of suggested data sources, each
     * containing: - &#x60;confidence&#x60;: a float score indicating the model&#39;s confidence in
     * the relevance of the suggestion - &#x60;details&#x60;: metadata about the data source -
     * &#x60;data_source_identifier&#x60;: the unique ID of the data source -
     * &#x60;data_source_name&#x60;: the display name of the data source - &#x60;description&#x60;:
     * a description of the data source - &#x60;reasoning&#x60;: LLM-generated rationale explaining
     * why the data source was recommended #### Error responses | Code | Description |
     * |------|--------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the underlying metadata entities. | &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally
     * Available. &gt; * This endpoint requires Spotter — please contact ThoughtSpot Support to
     * enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataSourceSuggestionsTest() throws ApiException {
        GetDataSourceSuggestionsRequest getDataSourceSuggestionsRequest = null;
        EurekaDataSourceSuggestionResponse response =
                api.getDataSourceSuggestions(getDataSourceSuggestionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.15.0.cl or later Retrieves existing natural language (NL) instructions configured
     * for a specific data model. These instructions guide the AI system in understanding data
     * context and generating more accurate responses. Requires &#x60;CAN_USE_SPOTTER&#x60;
     * privilege, at least view access on the data model, and a bearer token corresponding to the
     * org where the data model exists. #### Usage guidelines The request must include: -
     * &#x60;data_source_identifier&#x60;: the unique ID of the data model to retrieve instructions
     * for If the request is successful, the API returns: - &#x60;nl_instructions_info&#x60;: an
     * array of instruction objects, each containing: - &#x60;instructions&#x60;: the configured
     * text instructions for AI processing - &#x60;scope&#x60;: the scope of the instruction —
     * currently only &#x60;GLOBAL&#x60; is supported #### Instructions scope - **GLOBAL**:
     * Instructions that apply globally across the system on the given data-model (currently only
     * global instructions are supported) #### Error responses | Code | Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks
     * view access on the data model, or the bearer token does not correspond to the org where the
     * data model exists. | &gt; ###### Note: &gt; &gt; - To use this API, the user needs at least
     * view access on the data model, and must use the bearer token corresponding to the org where
     * the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be
     * introduced before the endpoint is made Generally Available. &gt; - Available from version
     * 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot
     * Support to enable Spotter on your cluster. &gt; - Use this API to review currently configured
     * instructions before modifying them with &#x60;setNLInstructions&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNLInstructionsTest() throws ApiException {
        GetNLInstructionsRequest getNLInstructionsRequest = null;
        EurekaGetNLInstructionsResponse response = api.getNLInstructions(getNLInstructionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.13.0.cl or later Breaks down a natural language query into a series of smaller
     * analytical sub-questions, each mapped to a relevant data source. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the referenced
     * metadata objects. #### Usage guidelines The request must include: - &#x60;query&#x60;: the
     * natural language question to decompose into analytical sub-questions -
     * &#x60;metadata_context&#x60;: at least one of the following context identifiers to guide
     * question generation: - &#x60;conversation_identifier&#x60; — an existing conversation session
     * ID - &#x60;answer_identifiers&#x60; — a list of Answer GUIDs -
     * &#x60;liveboard_identifiers&#x60; — a list of Liveboard GUIDs -
     * &#x60;data_source_identifiers&#x60; — a list of data source GUIDs Optional parameters for
     * refining the output: - &#x60;ai_context&#x60;: additional context to improve response quality
     * - &#x60;content&#x60; — supplementary text or CSV data as string input -
     * &#x60;instructions&#x60; — custom text instructions for the AI system -
     * &#x60;limit_relevant_questions&#x60;: maximum number of questions to return (default:
     * &#x60;5&#x60;) - &#x60;bypass_cache&#x60;: if &#x60;true&#x60;, forces fresh computation
     * instead of returning cached results If the request is successful, the API returns a list of
     * relevant analytical questions, each containing: - &#x60;query&#x60;: the generated
     * sub-question - &#x60;data_source_identifier&#x60;: the unique ID of the data source the
     * question targets - &#x60;data_source_name&#x60;: the display name of the corresponding data
     * source #### Error responses | Code | Description |
     * |------|---------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view access to the referenced metadata objects. | &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRelevantQuestionsTest() throws ApiException {
        GetRelevantQuestionsRequest getRelevantQuestionsRequest = null;
        EurekaGetRelevantQuestionsResponse response =
                api.getRelevantQuestions(getRelevantQuestionsRequest);
        // TODO: test validations
    }

    /**
     * Loads the full answer payload for a specific answer item in an agent conversation. Returns
     * structured answer data including the TML query, token breakdown, visualization metadata, and
     * agent context state. Pass the &#x60;answer_id&#x60; from an &#x60;AnswerResponseItem&#x60; in
     * the &#x60;getConversation&#x60; response as the &#x60;answer_identifier&#x60; parameter.
     * Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.
     * Version: 26.7.0.cl or later Loads the answer details for a specific answer item in an agent
     * conversation. Returns structured answer data including the TML token list, visualization
     * metadata, and agent context state. Use this endpoint to retrieve the full answer
     * representation for an answer item — for example, to re-render a chart, export a query, or
     * inspect the generated TML. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the
     * specified conversation. #### Usage guidelines The request must include: -
     * &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation, as
     * returned by &#x60;createAgentConversation&#x60; - &#x60;answer_identifier&#x60; *(path
     * parameter)*: the &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; in the
     * &#x60;getConversation&#x60; response If the request is successful, the response contains an
     * &#x60;answer&#x60; object with the following fields: | Field | Type | Description |
     * |-------|------|-------------| | &#x60;title&#x60; | &#x60;String&#x60; | Display title of
     * the generated answer (e.g., &#x60;\&quot;sales by month\&quot;&#x60;). | |
     * &#x60;description&#x60; | &#x60;String&#x60; | Optional description of the answer. | |
     * &#x60;session_identifier&#x60; | &#x60;String&#x60; | Unique identifier of the session in
     * which this answer was generated. | | &#x60;generation_number&#x60; | &#x60;Int&#x60; |
     * Generation sequence number of this answer within the session. | | &#x60;tokens&#x60; |
     * &#x60;[String]&#x60; | Ordered list of TML token strings that make up the answer query (e.g.,
     * &#x60;[\&quot;[sales]\&quot;, \&quot;[date].&#39;monthly&#39;\&quot;]&#x60;). | |
     * &#x60;visualization_type&#x60; | &#x60;VizType&#x60; | Suggested visualization type:
     * &#x60;Chart&#x60;, &#x60;Table&#x60;, or &#x60;Undefined&#x60;. &#x60;null&#x60; if no
     * suggestion is available. | | &#x60;formulas&#x60; | &#x60;[String]&#x60; | List of formula
     * names referenced in the answer. Empty if none are used. | | &#x60;parameters&#x60; |
     * &#x60;[String]&#x60; | List of parameter names applied to the answer. Empty if none are used.
     * | | &#x60;sub_queries&#x60; | &#x60;[JSON]&#x60; | List of sub-query objects used in the
     * answer. Empty if none are present. | | &#x60;ac_state&#x60; | &#x60;ACState&#x60; | Agent
     * context state, including &#x60;transaction_identifier&#x60; and
     * &#x60;generation_number&#x60;, used to correlate this answer with a specific agent turn. |
     * #### ACState fields | Field | Type | Description | |-------|------|-------------| |
     * &#x60;transaction_identifier&#x60; | &#x60;String&#x60; | Unique identifier of the agent
     * transaction that produced this answer. | | &#x60;generation_number&#x60; | &#x60;Int&#x60; |
     * Generation number within the transaction. | #### Example request &#x60;&#x60;&#x60;bash GET
     * /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details
     * &#x60;&#x60;&#x60; #### Example response &#x60;&#x60;&#x60;json { \&quot;answer\&quot;: {
     * \&quot;title\&quot;: \&quot;sales by month\&quot;, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;session_identifier\&quot;: \&quot;7b00b801-73f4-4639-af5e-e775584ceba6\&quot;,
     * \&quot;generation_number\&quot;: 1, \&quot;tokens\&quot;: [\&quot;[sales]\&quot;,
     * \&quot;[date].&#39;monthly&#39;\&quot;], \&quot;visualization_type\&quot;: null,
     * \&quot;formulas\&quot;: [], \&quot;parameters\&quot;: [], \&quot;sub_queries\&quot;: [],
     * \&quot;ac_state\&quot;: { \&quot;transaction_identifier\&quot;:
     * \&quot;7f6c9948-b4c7-4098-bb1f-6c67bc0e5699\&quot;, \&quot;generation_number\&quot;: 1 } } }
     * &#x60;&#x60;&#x60; #### Typical usage scenario 1. Call &#x60;getConversation&#x60; to
     * retrieve the full conversation history. 2. Locate an &#x60;AnswerResponseItem&#x60; in
     * &#x60;response_items&#x60; — note its &#x60;answer_id&#x60; field. 3. Call
     * &#x60;loadAnswer&#x60; with the &#x60;conversation_identifier&#x60; and &#x60;answer_id&#x60;
     * as &#x60;answer_identifier&#x60;. 4. The returned &#x60;tokens&#x60; array can be used to
     * open the answer in the ThoughtSpot search interface or rendered as pill chips in the UI. ####
     * Error responses | Code | Description | |------|-------------| | 401 | Unauthorized —
     * authentication token is missing, expired, or invalid. | | 403 | Forbidden — the authenticated
     * user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified
     * conversation. | | 404 | Not Found — no conversation or message exists with the given
     * identifiers for the authenticated user. | | 422 | Unprocessable Entity — the message does not
     * contain an answer of the expected type. | &gt; ###### Note: &gt; &gt; - This endpoint only
     * loads answer-type messages. Other message types are not supported. &gt; -
     * &#x60;visualization_type&#x60; may be &#x60;null&#x60; if the agent did not produce a
     * visualization suggestion for this answer. &gt; - &#x60;formulas&#x60;,
     * &#x60;parameters&#x60;, and &#x60;sub_queries&#x60; are returned as empty arrays when not
     * applicable — they are never &#x60;null&#x60;. &gt; - Available from version 26.7.0.cl and
     * later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable
     * Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadAnswerTest() throws ApiException {
        String conversationIdentifier = null;
        String answerIdentifier = null;
        LoadAnswerResponse response = api.loadAnswer(conversationIdentifier, answerIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 10.7.0.cl or later **Deprecated** — Use &#x60;getRelevantQuestions&#x60; instead
     * (available from 10.13.0.cl). Breaks down a topical or goal-oriented natural language question
     * into smaller, actionable analytical sub-questions, each mapped to a relevant data source for
     * independent execution. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level
     * access to the referenced metadata objects. #### Usage guidelines The request accepts the
     * following parameters: - &#x60;nlsRequest&#x60;: contains the user &#x60;query&#x60; to
     * decompose, along with optional &#x60;instructions&#x60; and &#x60;bypassCache&#x60; flag -
     * &#x60;worksheetIds&#x60;: list of data source identifiers to scope the decomposition -
     * &#x60;answerIds&#x60;: list of Answer GUIDs whose data guides the response -
     * &#x60;liveboardIds&#x60;: list of Liveboard GUIDs whose data guides the response -
     * &#x60;conversationId&#x60;: an existing conversation session ID for context continuity -
     * &#x60;content&#x60;: supplementary text or CSV data to improve response quality -
     * &#x60;maxDecomposedQueries&#x60;: maximum number of sub-questions to return (default:
     * &#x60;5&#x60;) If the request is successful, the API returns a
     * &#x60;decomposedQueryResponse&#x60; containing a list of &#x60;decomposedQueries&#x60;, each
     * with: - &#x60;query&#x60;: the generated analytical sub-question - &#x60;worksheetId&#x60;:
     * the unique ID of the data source the question targets - &#x60;worksheetName&#x60;: the
     * display name of the corresponding data source #### Error responses | Code | Description |
     * |------|---------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view access to the referenced metadata objects. | &gt; ###### Note: &gt; * This
     * endpoint is deprecated since 10.13.0.cl. Use &#x60;getRelevantQuestions&#x60; for new
     * integrations. &gt; * This endpoint is currently in Beta. Breaking changes may be introduced
     * before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter —
     * please contact ThoughtSpot support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryGetDecomposedQueryTest() throws ApiException {
        QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest = null;
        EurekaDecomposeQueryResponse response =
                api.queryGetDecomposedQuery(queryGetDecomposedQueryRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.5.0.cl or later Sends natural language messages to an existing Spotter agent
     * conversation and returns the complete response synchronously. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the
     * conversation. The user must have access to the conversation session referenced by
     * &#x60;conversation_identifier&#x60;. A conversation must first be created using the
     * &#x60;createAgentConversation&#x60; API. #### Usage guidelines The request must include: -
     * &#x60;conversation_identifier&#x60;: the unique session ID returned by
     * &#x60;createAgentConversation&#x60;, used for context continuity and message tracking -
     * &#x60;messages&#x60;: an array of one or more text messages to send to the agent The API
     * returns an array of response objects, each containing: - &#x60;type&#x60;: the kind of
     * response — &#x60;text&#x60;, &#x60;answer&#x60;, or &#x60;error&#x60; - &#x60;message&#x60;:
     * the main content of the response - &#x60;metadata&#x60;: additional information depending on
     * the message type (e.g., answer metadata includes analytics and visualization details) ####
     * Error responses | Code | Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks permission on the referenced conversation. | &gt; ###### Note: &gt; &gt; - This
     * endpoint is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter
     * - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - For real-time
     * streamed responses, use &#x60;sendAgentConversationMessageStreaming&#x60; instead.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendAgentConversationMessageTest() throws ApiException {
        String conversationIdentifier = null;
        SendAgentConversationMessageRequest sendAgentConversationMessageRequest = null;
        Object response =
                api.sendAgentConversationMessage(
                        conversationIdentifier, sendAgentConversationMessageRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.5.0.cl or later Sends one or more natural language messages to an existing
     * Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.
     * Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated
     * with the conversation. The user must have access to the conversation session referenced by
     * &#x60;conversation_identifier&#x60;. A conversation must first be created using the
     * &#x60;createAgentConversation&#x60; API. #### Usage guidelines The request must include: -
     * &#x60;conversation_identifier&#x60;: the unique session ID returned by
     * &#x60;createAgentConversation&#x60;, used for context continuity and message tracking -
     * &#x60;messages&#x60;: an array of one or more text messages to send to the agent If the
     * request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form
     * &#x60;data: [{\&quot;type\&quot;: \&quot;...\&quot;, ...}]&#x60; — a JSON array of event
     * objects. Event types include: - &#x60;ack&#x60;: confirms receipt of the request
     * (&#x60;node_id&#x60;) - &#x60;conv_title&#x60;: conversation title (&#x60;title&#x60;,
     * &#x60;conv_id&#x60;) - &#x60;notification&#x60;: status updates on operations
     * (&#x60;group_id&#x60;, &#x60;metadata&#x60;, &#x60;code&#x60; — e.g.
     * &#x60;TOOL_CALL_NOTIFICATION&#x60;, &#x60;nls_start&#x60;,
     * &#x60;FINAL_RESPONSE_NOTIFICATION&#x60;) - &#x60;text-chunk&#x60;: incremental content chunks
     * (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;format&#x60; and
     * &#x60;type&#x60; such as &#x60;thinking&#x60; or &#x60;text&#x60;, &#x60;content&#x60;) -
     * &#x60;text&#x60;: full text block with same structure as &#x60;text-chunk&#x60; -
     * &#x60;answer&#x60;: structured answer with metadata (&#x60;id&#x60;, &#x60;group_id&#x60;,
     * &#x60;metadata&#x60; with &#x60;sage_query&#x60;, &#x60;session_id&#x60;, &#x60;title&#x60;,
     * etc., &#x60;title&#x60;) - &#x60;error&#x60;: if a failure occurs #### Error responses | Code
     * | Description | | ---- |
     * --------------------------------------------------------------------------------------------------------------------------------
     * | | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks permission on the referenced conversation. | &gt; ###### Note: &gt; &gt; - This
     * endpoint is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter
     * - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - The streaming
     * protocol uses Server-Sent Events (SSE). &gt; - For the complete response in a single payload,
     * use &#x60;sendAgentConversationMessage&#x60; instead.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendAgentConversationMessageStreamingTest() throws ApiException {
        String conversationIdentifier = null;
        SendAgentConversationMessageStreamingRequest sendAgentConversationMessageStreamingRequest =
                null;
        InputStream response =
                api.sendAgentConversationMessageStreaming(
                        conversationIdentifier, sendAgentConversationMessageStreamingRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.2.0.cl or later **Deprecated** — Use &#x60;sendAgentConversationMessage&#x60;
     * instead. Send natural language messages to an existing Spotter agent conversation and returns
     * the complete response synchronously. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and
     * access to the metadata object associated with the conversation. The user must have access to
     * the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation
     * must first be created using the &#x60;createAgentConversation&#x60; API. #### Usage
     * guidelines The request must include: - &#x60;conversation_identifier&#x60;: the unique
     * session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and
     * message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the
     * agent The API returns an array of response objects, each containing: - &#x60;type&#x60;: the
     * kind of response — &#x60;text&#x60;, &#x60;answer&#x60;, or &#x60;error&#x60; -
     * &#x60;message&#x60;: the main content of the response - &#x60;metadata&#x60;: additional
     * information depending on the message type (e.g., answer metadata includes analytics and
     * visualization details) #### Error responses | Code | Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks permission on the referenced conversation. | &gt; ###### Note: &gt; &gt; - This
     * endpoint is deprecated. Use &#x60;sendAgentConversationMessage&#x60; for new integrations.
     * &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the
     * endpoint is made Generally Available. &gt; - This endpoint requires Spotter - please contact
     * ThoughtSpot support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendAgentMessageTest() throws ApiException {
        String conversationIdentifier = null;
        SendAgentMessageRequest sendAgentMessageRequest = null;
        Object response = api.sendAgentMessage(conversationIdentifier, sendAgentMessageRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.2.0.cl or later **Deprecated** — Use
     * &#x60;sendAgentConversationMessageStreaming&#x60; instead. Sends one or more natural language
     * messages to an existing Spotter agent conversation and returns the response as a real-time
     * Server-Sent Events stream. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the
     * metadata object associated with the conversation. The user must have access to the
     * conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must
     * first be created using the &#x60;createAgentConversation&#x60; API. #### Usage guidelines The
     * request must include: - &#x60;conversation_identifier&#x60;: the unique session ID returned
     * by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking -
     * &#x60;messages&#x60;: an array of one or more text messages to send to the agent If the
     * request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form
     * &#x60;data: [{\&quot;type\&quot;: \&quot;...\&quot;, ...}]&#x60; — a JSON array of event
     * objects. Event types include: - &#x60;ack&#x60;: confirms receipt of the request
     * (&#x60;node_id&#x60;) - &#x60;conv_title&#x60;: conversation title (&#x60;title&#x60;,
     * &#x60;conv_id&#x60;) - &#x60;notification&#x60;: status updates on operations
     * (&#x60;group_id&#x60;, &#x60;metadata&#x60;, &#x60;code&#x60; — e.g.
     * &#x60;TOOL_CALL_NOTIFICATION&#x60;, &#x60;nls_start&#x60;,
     * &#x60;FINAL_RESPONSE_NOTIFICATION&#x60;) - &#x60;text-chunk&#x60;: incremental content chunks
     * (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;format&#x60; and
     * &#x60;type&#x60; such as &#x60;thinking&#x60; or &#x60;text&#x60;, &#x60;content&#x60;) -
     * &#x60;text&#x60;: full text block with same structure as &#x60;text-chunk&#x60; -
     * &#x60;answer&#x60;: structured answer with metadata (&#x60;id&#x60;, &#x60;group_id&#x60;,
     * &#x60;metadata&#x60; with &#x60;sage_query&#x60;, &#x60;session_id&#x60;, &#x60;title&#x60;,
     * etc., &#x60;title&#x60;) - &#x60;error&#x60;: if a failure occurs #### Error responses | Code
     * | Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks permission on the referenced conversation. | &gt; ###### Note: &gt; &gt; - This
     * endpoint is deprecated. Use &#x60;sendAgentConversationMessageStreaming&#x60; for new
     * integrations. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced
     * before the endpoint is made Generally Available. &gt; - This endpoint requires Spotter -
     * please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - The streaming
     * protocol uses Server-Sent Events (SSE).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendAgentMessageStreamingTest() throws ApiException {
        SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest = null;
        InputStream response = api.sendAgentMessageStreaming(sendAgentMessageStreamingRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Sends a follow-up message to an existing conversation within the
     * context of a data model. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view
     * access to the metadata object specified in the request. A conversation must first be created
     * using the &#x60;createConversation&#x60; API. #### Usage guidelines The request must include:
     * - &#x60;conversation_identifier&#x60;: the unique session ID returned by
     * &#x60;createConversation&#x60; - &#x60;metadata_identifier&#x60;: the unique ID of the data
     * source used for the conversation - &#x60;message&#x60;: a natural language string with the
     * follow-up question If the request is successful, the API returns an array of response
     * messages, each containing: - &#x60;session_identifier&#x60;: the unique ID of the generated
     * response - &#x60;generation_number&#x60;: the generation number of the response -
     * &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) -
     * &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;,
     * &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; /
     * &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the
     * response #### Error responses | Code | Description |
     * |------|-----------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the specified metadata object. | &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        String conversationIdentifier = null;
        SendMessageRequest sendMessageRequest = null;
        List<ResponseMessage> response =
                api.sendMessage(conversationIdentifier, sendMessageRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.6.0.cl or later Creates or updates the admin instructions for the AI agent
     * (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior
     * across all conversations. If instructions already exist for the org, they are replaced
     * (upsert semantics). Requires admin privileges. Only users with org admin access can set agent
     * instructions. #### Usage guidelines The request must include: - &#x60;instructions&#x60;: the
     * instructions text to apply to the agent (maximum 5000 characters) Instructions are validated
     * against system guardrails before being saved. If the instructions contain content that
     * conflicts with guardrails, the request is rejected with a &#x60;409&#x60; error and the
     * existing instructions remain unchanged. If the request is successful, the response includes
     * the saved &#x60;AgentInstructions&#x60; record: - &#x60;id&#x60;: unique identifier of the
     * record - &#x60;instructions&#x60;: the saved instructions text - &#x60;created_at&#x60;: ISO
     * timestamp when the instructions were first created - &#x60;updated_at&#x60;: ISO timestamp of
     * this update - &#x60;last_updated_by&#x60;: user ID of the admin who performed this update
     * #### Error responses | Code | Description | |------|-------------| | 400 | Bad request — the
     * request body is missing required fields or the &#x60;instructions&#x60; field exceeds the
     * maximum allowed length of 5000 characters. | | 401 | Unauthorized — authentication token is
     * missing, expired, or invalid. | | 403 | Forbidden — the authenticated user does not have org
     * admin privileges required to set agent instructions. | | 409 | Conflict — the provided
     * instructions conflict with system guardrails. Review and revise the instructions text before
     * retrying. | | 500 | Internal server error. | &gt; ###### Note: &gt; &gt; - This operation
     * uses upsert semantics: it creates the instructions record if none exists, or replaces the
     * existing one. &gt; - Instructions take effect immediately for new conversations created after
     * the update. &gt; - Use &#x60;getAgentInstructions&#x60; to retrieve the current instructions
     * before making changes. &gt; - Available from version 26.6.0.cl and later.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setAgentInstructionsTest() throws ApiException {
        SetAgentInstructionsRequest setAgentInstructionsRequest = null;
        AgentInstructions response = api.setAgentInstructions(setAgentInstructionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.15.0.cl or later This API allows users to set natural language (NL) instructions
     * for a specific data-model to improve AI-generated answers and query processing. These
     * instructions help guide the AI system to better understand the data context and provide more
     * accurate responses. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, either edit access or
     * &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and a bearer token corresponding to
     * the org where the data model exists. #### Usage guidelines To set NL instructions for a
     * data-model, the request must include: - &#x60;data_source_identifier&#x60;: The unique ID of
     * the data-model for which to set NL instructions - &#x60;nl_instructions_info&#x60;: An array
     * of instruction objects, each containing: - &#x60;instructions&#x60;: Array of text
     * instructions for the LLM - &#x60;scope&#x60;: The scope of the instruction
     * (&#x60;GLOBAL&#x60;). Currently only &#x60;GLOBAL&#x60; is supported. It can be extended to
     * data-model-user scope in future. #### Instructions scope - **GLOBAL**: instructions that
     * apply to all users querying this data model If the request is successful, the API returns: -
     * &#x60;success&#x60;: a boolean indicating whether the operation completed successfully ####
     * Error responses | Code | Description |
     * |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks
     * edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, or the bearer token
     * does not correspond to the org where the data model exists. | &gt; ###### Note: &gt; &gt; -
     * To use this API, the user needs either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60;
     * on the data model, and must use the bearer token corresponding to the org where the data
     * model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced
     * before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and
     * later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable
     * Spotter on your cluster. &gt; - Instructions help improve the accuracy and relevance of
     * AI-generated responses for the specified data-model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setNLInstructionsTest() throws ApiException {
        SetNLInstructionsRequest setNLInstructionsRequest = null;
        EurekaSetNLInstructionsResponse response = api.setNLInstructions(setNLInstructionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Processes a natural language query against a specified data model
     * and returns a single AI-generated answer without requiring a conversation session. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object
     * specified in the request. #### Usage guidelines The request must include: -
     * &#x60;query&#x60;: a natural language question (e.g., \&quot;What were total sales last
     * quarter?\&quot;) - &#x60;metadata_identifier&#x60;: the unique ID of the data source to query
     * against If the request is successful, the API returns a response message containing: -
     * &#x60;session_identifier&#x60;: the unique ID of the generated response -
     * &#x60;generation_number&#x60;: the generation number of the response -
     * &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) -
     * &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;,
     * &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; /
     * &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the
     * response #### Error responses | Code | Description |
     * |------|-----------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * lacks view permission on the specified metadata object. | &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void singleAnswerTest() throws ApiException {
        SingleAnswerRequest singleAnswerRequest = null;
        ResponseMessage response = api.singleAnswer(singleAnswerRequest);
        // TODO: test validations
    }

    /**
     * Stops an in-progress agent conversation response. Version: 26.6.0.cl or later
     * &lt;span&gt;Version: 26.6.0.cl or later Stops an in-progress agent response for the specified
     * conversation. Use this endpoint to cancel a response that is actively being generated — for
     * example, when the user navigates away, reformulates their question, or no longer needs the
     * current result. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified
     * conversation. #### Usage guidelines The request must include: -
     * &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation
     * whose active response should be stopped, as returned by &#x60;createAgentConversation&#x60; A
     * successful request returns an empty &#x60;204 No Content&#x60; response. If there is no
     * active response in progress at the time of the call, the request is still treated as
     * successful. After stopping a response, the conversation session remains active. You can
     * continue sending messages using &#x60;sendAgentConversationMessage&#x60; or
     * &#x60;sendAgentConversationMessageStreaming&#x60;. #### Example request
     * &#x60;&#x60;&#x60;bash POST
     * /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response
     * &#x60;&#x60;&#x60; #### Typical usage scenario This endpoint is useful when integrating
     * Spotter into a chat UI where users can cancel a long-running query. For example: 1. User
     * sends a message via &#x60;sendAgentConversationMessageStreaming&#x60;. 2. User clicks a
     * \&quot;Stop generating\&quot; button while the response is streaming. 3. Your client calls
     * &#x60;stopConversation&#x60; with the active &#x60;conversation_identifier&#x60;. 4. The
     * stream is terminated and the user can ask a new question. #### Error responses | Code |
     * Description | |------|-------------| | 401 | Unauthorized — authentication token is missing,
     * expired, or invalid. | | 403 | Forbidden — the authenticated user does not have
     * &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified conversation. | &gt;
     * ###### Note: &gt; &gt; - Calling this endpoint when no response is in progress does not
     * return an error. &gt; - The conversation context is preserved after stopping — previous
     * messages and answers remain accessible. &gt; - Available from version 26.6.0.cl and later.
     * &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter
     * on your cluster. &gt; - This feature is available only for **Spotter 3**
     * (&#x60;SPOTTER3&#x60;) version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stopConversationTest() throws ApiException {
        String conversationIdentifier = null;
        api.stopConversation(conversationIdentifier);
        // TODO: test validations
    }

    /**
     * Updates attributes of an existing agent conversation. Currently only the display title can be
     * updated; additional conversation attributes may be supported in future versions. At least one
     * updatable attribute must be provided in the request body. Version: 26.7.0.cl or later Updates
     * attributes of an existing saved agent conversation. Currently only the conversation&#39;s
     * display &#x60;title&#x60; can be updated; additional updatable attributes may be supported in
     * future versions. At least one updatable attribute must be supplied in the request body.
     * Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being
     * updated. #### Usage guidelines The request must include: -
     * &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to
     * update, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;
     * - At least one updatable attribute in the request body: - &#x60;title&#x60; *(optional)*: the
     * new display name for the conversation. When provided, must be a non-empty string. A
     * successful request returns an empty &#x60;204 No Content&#x60; response. Updated attributes
     * are reflected immediately in subsequent calls to &#x60;getConversationList&#x60;. ####
     * Example request &#x60;&#x60;&#x60;bash POST
     * /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type:
     * application/json { \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot; }
     * &#x60;&#x60;&#x60; #### Error responses | Code | Description | |------|-------------| | 400 |
     * Bad Request — the request body is empty or &#x60;title&#x60; is provided as an empty string.
     * | | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or
     * does not own the specified conversation. | | 404 | Not Found — no conversation exists with
     * the given &#x60;conversation_identifier&#x60; for the authenticated user. | | 422 |
     * Unprocessable Entity — the request body is malformed or contains an invalid field value. |
     * &gt; ###### Note: &gt; &gt; - Only conversations created with &#x60;enable_save_chat:
     * true&#x60; can be updated. Unsaved conversations are not persisted and do not have a
     * retrievable identifier. &gt; - Available from version 26.7.0.cl and later. &gt; - This
     * endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your
     * cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConversationTest() throws ApiException {
        String conversationIdentifier = null;
        UpdateConversationRequest updateConversationRequest = null;
        api.updateConversation(conversationIdentifier, updateConversationRequest);
        // TODO: test validations
    }
}
