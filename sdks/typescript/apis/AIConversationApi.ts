// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AgentConversation } from '../models/AgentConversation';
import { Conversation } from '../models/Conversation';
import { CreateAgentConversationRequest } from '../models/CreateAgentConversationRequest';
import { CreateConversationRequest } from '../models/CreateConversationRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { EurekaDataSourceSuggestionResponse } from '../models/EurekaDataSourceSuggestionResponse';
import { EurekaDecomposeQueryResponse } from '../models/EurekaDecomposeQueryResponse';
import { EurekaGetRelevantQuestionsResponse } from '../models/EurekaGetRelevantQuestionsResponse';
import { GetDataSourceSuggestionsRequest } from '../models/GetDataSourceSuggestionsRequest';
import { GetRelevantQuestionsRequest } from '../models/GetRelevantQuestionsRequest';
import { LoadAnswerResponse } from '../models/LoadAnswerResponse';
import { QueryGetDecomposedQueryRequest } from '../models/QueryGetDecomposedQueryRequest';
import { ResponseMessage } from '../models/ResponseMessage';
import { SendAgentConversationMessageRequest } from '../models/SendAgentConversationMessageRequest';
import { SendAgentConversationMessageStreaming200Response } from '../models/SendAgentConversationMessageStreaming200Response';
import { SendAgentConversationMessageStreamingRequest } from '../models/SendAgentConversationMessageStreamingRequest';
import { SendAgentMessageRequest } from '../models/SendAgentMessageRequest';
import { SendAgentMessageResponse } from '../models/SendAgentMessageResponse';
import { SendAgentMessageStreamingRequest } from '../models/SendAgentMessageStreamingRequest';
import { SendMessageRequest } from '../models/SendMessageRequest';
import { SingleAnswerRequest } from '../models/SingleAnswerRequest';
import { StopConversationRequest } from '../models/StopConversationRequest';

/**
 * no description
 */
export class AIConversationApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 26.2.0.cl or later   Creates a new Spotter agent conversation based on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  The two versions differ in which creation settings they accept and in how validation errors are reported. See the sections below for each version\'s requests and responses.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  <details> <summary>When <code>spotter_experience_version</code> is <code>V2</code></summary>  Conversations can carry `additional_instructions`, and of `conversation_settings` only `enable_save_chat` is used.  Before you send requests, confirm that the cluster\'s **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**. If it isn\'t, requests return a `400`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/create`  ```json {   \"spotter_experience_version\": \"V2\",   \"metadata_context\": {     \"type\": \"DATA_SOURCE\",     \"data_source_context\": {       \"data_source_identifiers\": [\"a1b2c3d4-e5f6-7890-abcd-ef1234567890\"]     }   },   \"additional_instructions\": \"Answer concisely and always report revenue in thousands.\",   \"conversation_settings\": { \"enable_save_chat\": true } } ```  - `spotter_experience_version` *(required for this version)*: `V2`. A request that omits it runs on `V1`, the default, so pass it here and on every later request for the conversation. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - The conversation context, defined by exactly one of:   - `metadata_context`: defines the conversation context by data source. The context type can be one of:     - `DATA_SOURCE`: targets a specific data source. Provide `data_source_identifier` in `data_source_context` for a single data source, or `data_source_identifiers` for multi-data-source context. The deprecated `guid` field is accepted for backwards compatibility.     - `AUTO_MODE`: automatically discovers and selects the most relevant datasets for the user\'s queries.   - `analyst_identifier`: unique identifier of a Spotter Analyst to start the conversation from. The conversation uses the analyst\'s configuration — its data sources, agent instructions, and connectors — so `metadata_context` must be omitted. The caller must be the analyst\'s author, have the analyst shared with them, or hold admin / Spotter-management privileges.    Passing both `analyst_identifier` and `metadata_context`, or neither, returns a `400`. - `additional_instructions` *(optional, this version only)*: guidance appended to the agent\'s instructions on every message in this conversation. Use it to set a persona, a preferred output format, or domain rules. It cannot be changed after the conversation is created, and it is sent with every message, so keep it short. Not allowed with `analyst_identifier`, since the analyst brings its own instructions. - `conversation_settings` *(optional)*: only `enable_save_chat` applies (default: `false`). When `true`, the conversation appears in `getConversationList` once it has messages. When `false`, it is kept out of the list but can still be continued and deleted by its identifier. The other settings are ignored.  ##### Response  ```json {   \"conversation_id\": \"8401773265129884672\",   \"conversation_identifier\": \"8401773265129884672\",   \"analyst_id\": null } ```  - `conversation_identifier`: pass it to `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` to send messages in this conversation, together with `spotter_experience_version` `V2`. Treat it as an opaque string: store and return it as received rather than parsing or validating its shape. - `conversation_id`: the same value, kept for backwards compatibility; use `conversation_identifier` for new integrations. - `analyst_id`: the analyst\'s ID when the conversation is started from an analyst; `null` otherwise.  Validation failures return `400`. A data source or analyst that does not exist or that the caller cannot view is reported as a `400` that lists those identifiers.  </details>  <details> <summary>When <code>spotter_experience_version</code> is <code>V1</code></summary>  Use this version only if your cluster must stay on the previous experience. New Spotter capabilities ship in `V2`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/create`  ```json {   \"spotter_experience_version\": \"V1\",   \"metadata_context\": {     \"type\": \"DATA_SOURCE\",     \"data_source_context\": {       \"data_source_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\"     }   },   \"conversation_settings\": { \"enable_save_chat\": true } } ```  - `spotter_experience_version` *(optional)*: `V1`, the default. A request that omits it runs on this version. - The conversation context, defined by exactly one of:   - `metadata_context`: defines the conversation context by data source. The context type can be one of:     - `DATA_SOURCE` *(available from 26.5.0.cl)*: targets a specific data source. Provide `data_source_identifier` in `data_source_context` for a single data source, or `data_source_identifiers` for multi-data-source context. The deprecated `guid` field is accepted for backwards compatibility.     - `AUTO_MODE` *(available from 26.5.0.cl)*: automatically discovers and selects the most relevant datasets for the user\'s queries.   - `analyst_identifier` *(available from 26.10.0.cl)*: unique identifier of a Spotter Analyst to start the conversation from. The conversation uses the analyst\'s configuration — its data sources, agent instructions, and connectors — so `metadata_context` must be omitted. The caller must be the analyst\'s author, have the analyst shared with them, or hold admin / Spotter-management privileges.    Passing both `analyst_identifier` and `metadata_context`, or neither, returns a `422`. - `conversation_settings` *(optional)*: controls which Spotter capabilities are enabled for the conversation:   - `enable_contextual_change_analysis` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled; setting this to `false` has no effect on versions >= 26.2.0.cl   - `enable_natural_language_answer_generation` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled; setting this to `false` has no effect on versions >= 26.2.0.cl   - `enable_reasoning` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled; setting this to `false` has no effect on versions >= 26.2.0.cl   - `enable_save_chat` (default: `false`, *available from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation history - `additional_instructions`: not available in this version; returns a `400`.  > **Note for callers on versions 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase `data_source` enum value with the `guid` field instead of the above. Example: `{ \"type\": \"data_source\", \"data_source_context\": { \"guid\": \"<worksheet-id>\" } }`.  ##### Response  ```json {   \"conversation_id\": \"wwHQ5j8O8dQC\",   \"conversation_identifier\": \"wwHQ5j8O8dQC\",   \"analyst_id\": null } ```  - `conversation_identifier`: pass it to `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` to send messages in this conversation. Treat it as an opaque string: store and return it as received rather than parsing or validating its shape. - `conversation_id`: the same value, kept for backwards compatibility; use `conversation_identifier` for new integrations. - `analyst_id`: the analyst\'s ID when the conversation is started from an analyst; `null` otherwise.  Validation failures return `422`, and an `analyst_identifier` that does not exist in the caller\'s Org returns `404`.  </details>  #### Error responses  | Code | Description                                                                                                                             | | ---- | --------------------------------------------------------------------------------------------------------------------------------------- | | 400  | Bad request — `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, `additional_instructions` is set on `V1` or with `analyst_identifier`, or, on `V2`, the request fails validation. | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks view permission on the specified metadata object, or has no access to the analyst specified in `analyst_identifier`. | | 404  | Not found — on `V1`, no analyst with the given `analyst_identifier` exists in the caller\'s Org.                                                          | | 422  | Unprocessable entity — on `V1`, the request fails validation: both `analyst_identifier` and `metadata_context` were provided, neither was provided, or `metadata_context` is malformed (for example, `DATA_SOURCE` context without a data source identifier). |  > ###### Note: > > - This endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version 26.5.0.cl. > - `spotter_experience_version`, `additional_instructions` and `V2` support are in Beta from 26.12.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createAgentConversationRequest 
     */
    public async createAgentConversation(createAgentConversationRequest: CreateAgentConversationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createAgentConversationRequest' is not null or undefined
        if (createAgentConversationRequest === null || createAgentConversationRequest === undefined) {
            throw new RequiredError("AIConversationApi", "createAgentConversation", "createAgentConversationRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/conversation/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createAgentConversationRequest, "CreateAgentConversationRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 10.4.0.cl or later   **Deprecated** — Use `createAgentConversation` instead.  Creates a new conversation session tied to a specific data model for AI-driven natural language querying.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `metadata_identifier`: the unique ID of the data source that provides context for the conversation  Optionally, you can provide: - `tokens`: a token string to set initial context for the conversation (e.g., `\"[sales],[item type],[state]\"`)  If the request is successful, ThoughtSpot returns a unique `conversation_identifier` that must be passed to `sendMessage` to continue the conversation.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl. Use `createAgentConversation` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest 
     */
    public async createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createConversationRequest' is not null or undefined
        if (createConversationRequest === null || createConversationRequest === undefined) {
            throw new RequiredError("AIConversationApi", "createConversation", "createConversationRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/conversation/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createConversationRequest, "CreateConversationRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 10.15.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead. Spotter selects the data source within the conversation.  Suggests the most relevant data sources for a given natural language query, ranked by confidence with LLM-generated reasoning.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include: - `query`: the natural language question to find relevant data sources for  If the request is successful, the API returns a ranked list of suggested data sources, each containing: - `confidence`: a float score indicating the model\'s confidence in the relevance of the suggestion - `details`: metadata about the data source   - `data_source_identifier`: the unique ID of the data source   - `data_source_name`: the display name of the data source   - `description`: a description of the data source - `reasoning`: LLM-generated rationale explaining why the data source was recommended  #### Error responses  | Code | Description                                                                                                                                | |------|--------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                       | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the underlying metadata entities. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param getDataSourceSuggestionsRequest 
     */
    public async getDataSourceSuggestions(getDataSourceSuggestionsRequest: GetDataSourceSuggestionsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'getDataSourceSuggestionsRequest' is not null or undefined
        if (getDataSourceSuggestionsRequest === null || getDataSourceSuggestionsRequest === undefined) {
            throw new RequiredError("AIConversationApi", "getDataSourceSuggestions", "getDataSourceSuggestionsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/data-source-suggestions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(getDataSourceSuggestionsRequest, "GetDataSourceSuggestionsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 10.13.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead. Spotter decomposes the question within the conversation.  Breaks down a natural language query into a series of smaller analytical sub-questions, each mapped to a relevant data source.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request must include: - `query`: the natural language question to decompose into analytical sub-questions - `metadata_context`: at least one of the following context identifiers to guide question generation:   - `conversation_identifier` — an existing conversation session ID   - `answer_identifiers` — a list of Answer GUIDs   - `liveboard_identifiers` — a list of Liveboard GUIDs   - `data_source_identifiers` — a list of data source GUIDs  Optional parameters for refining the output: - `ai_context`: additional context to improve response quality   - `content` — supplementary text or CSV data as string input   - `instructions` — custom text instructions for the AI system - `limit_relevant_questions`: maximum number of questions to return (default: `5`) - `bypass_cache`: if `true`, forces fresh computation instead of returning cached results  If the request is successful, the API returns a list of relevant analytical questions, each containing: - `query`: the generated sub-question - `data_source_identifier`: the unique ID of the data source the question targets - `data_source_name`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param getRelevantQuestionsRequest 
     */
    public async getRelevantQuestions(getRelevantQuestionsRequest: GetRelevantQuestionsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'getRelevantQuestionsRequest' is not null or undefined
        if (getRelevantQuestionsRequest === null || getRelevantQuestionsRequest === undefined) {
            throw new RequiredError("AIConversationApi", "getRelevantQuestions", "getRelevantQuestionsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/relevant-questions/';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(getRelevantQuestionsRequest, "GetRelevantQuestionsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Loads the full answer payload for a specific answer item in an agent conversation. Returns structured answer data including the TML query, token breakdown, visualization metadata, and agent context state. Pass the `answer_id` from an `AnswerResponseItem` in the `getConversation` response as the `answer_identifier` parameter. Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.    Version: 26.7.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead, which returns answers in the conversation response.  Loads the answer details for a specific answer item in an agent conversation. Returns structured answer data including the TML token list, visualization metadata, and agent context state. Use this endpoint to retrieve the full answer representation for an answer item — for example, to re-render a chart, export a query, or inspect the generated TML.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation, as returned by `createAgentConversation` - `answer_identifier` *(path parameter)*: the `answer_id` field from an `AnswerResponseItem` in the `getConversation` response  If the request is successful, the response contains an `answer` object with the following fields:  | Field | Type | Description | |-------|------|-------------| | `title` | `String` | Display title of the generated answer (e.g., `\"sales by month\"`). | | `description` | `String` | Optional description of the answer. | | `session_identifier` | `String` | Unique identifier of the session in which this answer was generated. | | `generation_number` | `Int` | Generation sequence number of this answer within the session. | | `tokens` | `[String]` | Ordered list of TML token strings that make up the answer query (e.g., `[\"[sales]\", \"[date].\'monthly\'\"]`). | | `visualization_type` | `VizType` | Suggested visualization type: `Chart`, `Table`, or `Undefined`. `null` if no suggestion is available. | | `formulas` | `[String]` | List of formula names referenced in the answer. Empty if none are used. | | `parameters` | `[String]` | List of parameter names applied to the answer. Empty if none are used. | | `sub_queries` | `[JSON]` | List of sub-query objects used in the answer. Empty if none are present. | | `ac_state` | `ACState` | Agent context state, including `transaction_identifier` and `generation_number`, used to correlate this answer with a specific agent turn. |  #### ACState fields  | Field | Type | Description | |-------|------|-------------| | `transaction_identifier` | `String` | Unique identifier of the agent transaction that produced this answer. | | `generation_number` | `Int` | Generation number within the transaction. |  #### Example request  ```bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details ```  #### Example response  ```json {   \"answer\": {     \"title\": \"sales by month\",     \"description\": \"\",     \"session_identifier\": \"7b00b801-73f4-4639-af5e-e775584ceba6\",     \"generation_number\": 1,     \"tokens\": [\"[sales]\", \"[date].\'monthly\'\"],     \"visualization_type\": null,     \"formulas\": [],     \"parameters\": [],     \"sub_queries\": [],     \"ac_state\": {       \"transaction_identifier\": \"7f6c9948-b4c7-4098-bb1f-6c67bc0e5699\",       \"generation_number\": 1     }   } } ```  #### Typical usage scenario  1. Call `getConversation` to retrieve the full conversation history. 2. Locate an `AnswerResponseItem` in `response_items` — note its `answer_id` field. 3. Call `loadAnswer` with the `conversation_identifier` and `answer_id` as `answer_identifier`. 4. The returned `tokens` array can be used to open the answer in the ThoughtSpot search interface or rendered as pill chips in the UI.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation or message exists with the given identifiers for the authenticated user. | | 422  | Unprocessable Entity — the message does not contain an answer of the expected type. |  > ###### Note: > > - This endpoint is deprecated from 26.12.0.cl. Use `sendAgentConversationMessage` for new integrations. > - This endpoint only loads answer-type messages. Other message types are not supported. > - `visualization_type` may be `null` if the agent did not produce a visualization suggestion for this answer. > - `formulas`, `parameters`, and `sub_queries` are returned as empty arrays when not applicable — they are never `null`. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param answerIdentifier Unique identifier of the answer to load. Use the &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; returned by &#x60;getConversation&#x60;.
     */
    public async loadAnswer(conversationIdentifier: string, answerIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIConversationApi", "loadAnswer", "conversationIdentifier");
        }


        // verify required parameter 'answerIdentifier' is not null or undefined
        if (answerIdentifier === null || answerIdentifier === undefined) {
            throw new RequiredError("AIConversationApi", "loadAnswer", "answerIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details'
            .replace('{conversation_identifier}', encodeURIComponent(String(conversationIdentifier)))
            .replace('{answer_identifier}', encodeURIComponent(String(answerIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 10.7.0.cl or later        
     * @param queryGetDecomposedQueryRequest 
     */
    public async queryGetDecomposedQuery(queryGetDecomposedQueryRequest: QueryGetDecomposedQueryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'queryGetDecomposedQueryRequest' is not null or undefined
        if (queryGetDecomposedQueryRequest === null || queryGetDecomposedQueryRequest === undefined) {
            throw new RequiredError("AIConversationApi", "queryGetDecomposedQuery", "queryGetDecomposedQueryRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/analytical-questions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(queryGetDecomposedQueryRequest, "QueryGetDecomposedQueryRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.5.0.cl or later   Sends natural language messages to a Spotter agent conversation and returns the complete response synchronously.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`.  Use this when you want the finished answer in a single response — a scheduled job, a server-side integration, or any caller that cannot consume Server-Sent Events. For a response that arrives progressively, use `sendAgentConversationMessageStreaming` instead.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  The two versions differ in the response shape: `AgentTurnResponse`, a list of events, on `V2`, and `AgentMessagesResponse`, a list of messages, on `V1`. See the sections below for each version\'s requests and responses.  The response is declared as a JSON object, so SDK methods return it untyped. For typed access, deserialize it into the `SendAgentConversationMessageResponse` schema, which is one of `AgentMessagesResponse` or `AgentTurnResponse`.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  <details> <summary>When <code>spotter_experience_version</code> is <code>V2</code></summary>  The response collects every event of the turn into one `events` array, and a message can be sent without a conversation identifier to start a new conversation.  Before you send requests, confirm that the cluster\'s **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**. If it isn\'t, requests return a `400`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send`, or `POST /api/rest/2.0/ai/agent/conversation/send` to start a new conversation  ```json {   \"spotter_experience_version\": \"V2\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(required for this version)*: `V2`. A request that omits it runs on `V1`, the default, so pass it on every request for the conversation. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - `conversation_identifier` *(path parameter, optional)*: the conversation to send the messages in, as returned by `createAgentConversation`. Omit the segment — `POST /api/rest/2.0/ai/agent/conversation/send` — to ask a one-off question. A conversation is created automatically, and its identifier is returned in the response body and in the `x-conversation-identifier` response header, so a follow-up can continue it. The new conversation is not saved: it does not appear in `getConversationList`, but it can be continued by its identifier. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  ##### Response  ```json {   \"conversation_identifier\": \"5612260428840173568\",   \"events\": [     { \"tool_call\": { \"id\": \"toolu_01AMjCrr\", \"name\": \"spotter_tools_fetch_and_visualize_data\" } },     { \"progress\": { \"code\": \"TML_GEN\", \"tool_call_id\": \"toolu_01AMjCrr\" } },     { \"tool_result\": { \"id\": \"toolu_01AMjCrr\", \"answer\": { \"session_id\": \"c5c25b33\" } } },     {       \"event\": {         \"content\": { \"role\": \"model\", \"parts\": [{ \"text\": \"Sales were highest in the West.\" }] }       }     },     { \"done\": { \"conversation_identifier\": \"5612260428840173568\" } }   ] } ```  This endpoint waits for Spotter to finish, so the request stays open for the length of the turn — commonly 10-60 seconds, longer for a question that runs several queries. Set your client\'s read timeout to several minutes; a turn that runs too long is ended with a `504`.  `events` contains exactly what the streaming endpoint publishes on `V2`, in the same order, collected into an array. Every key and its meaning is documented under `sendAgentConversationMessageStreaming` — `event`, `tool_call`, `progress`, `tool_result`, `error` and `done`.  To render the answer, concatenate `parts[].text` from each `event` frame in order, skipping parts marked `thought: true` if you do not want to show Spotter\'s reasoning. Text is published once — no part repeats content from an earlier one.  A turn that failed carries an `error` frame; `done` reports that the turn ended, not that it succeeded. An `event` can also carry an `error_code` when Spotter failed while producing that event; the streaming endpoint explains how the two differ.  </details>  <details> <summary>When <code>spotter_experience_version</code> is <code>V1</code></summary>  Use this version only if your cluster must stay on the previous experience. New Spotter capabilities ship in `V2`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send`  ```json {   \"spotter_experience_version\": \"V1\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(optional)*: `V1`, the default. A request that omits it runs on this version. - `conversation_identifier` *(path parameter, required)*: the conversation to send the messages in, as returned by `createAgentConversation`. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  ##### Response  ```json {   \"messages\": [     { \"type\": \"text\", \"text\": \"Sales were highest in the West.\", \"metadata\": {} }   ] } ```  The response contains a `messages` array, in order. Each message has:  - `type`: the kind of message — `text`, `answer`, `error`, and others - `metadata`: additional information depending on the type (for example, answer metadata includes analytics and visualization details) - the fields of that type: `text` for a `text` message, `title` and `session_id` for an `answer`, `code` and `message` for an `error`  </details>  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 400  | Bad request — `messages` is missing or invalid, `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, the conversation identifier is malformed on `V2` (it must be letters, digits, `-` and `_`), or the conversation identifier is omitted on `V1`. | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. | | 404  | Not found — on `V2`, no conversation with the given identifier exists for this user, or it belongs to another user. | | 504  | Gateway timeout — on `V2`, the turn did not finish in the time allowed. Retry, or use `sendAgentConversationMessageStreaming` for questions that run long. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - `spotter_experience_version`, the optional conversation identifier and `V2` support are in Beta from 26.12.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - For real-time streamed responses, use `sendAgentConversationMessageStreaming` instead.      
     * @param conversationIdentifier Unique identifier of the conversation. Optional: on V2, omit this path segment to start a new conversation; its identifier is returned in the response and the &#x60;x-conversation-identifier&#x60; header.
     * @param sendAgentConversationMessageRequest 
     */
    public async sendAgentConversationMessage(conversationIdentifier: string, sendAgentConversationMessageRequest: SendAgentConversationMessageRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIConversationApi", "sendAgentConversationMessage", "conversationIdentifier");
        }


        // verify required parameter 'sendAgentConversationMessageRequest' is not null or undefined
        if (sendAgentConversationMessageRequest === null || sendAgentConversationMessageRequest === undefined) {
            throw new RequiredError("AIConversationApi", "sendAgentConversationMessage", "sendAgentConversationMessageRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send'
            .replace('{conversation_identifier}', encodeURIComponent(String(conversationIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(sendAgentConversationMessageRequest, "SendAgentConversationMessageRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.5.0.cl or later   Sends one or more natural language messages to a Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  The two versions differ in the events the stream carries. See the sections below for each version\'s requests and responses.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  <details> <summary>When <code>spotter_experience_version</code> is <code>V2</code></summary>  Each event is a single JSON object with one top-level key, and a message can be sent without a conversation identifier to start a new conversation.  Before you send requests, confirm that the cluster\'s **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**. If it isn\'t, requests return a `400`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream`, or `POST /api/rest/2.0/ai/agent/conversation/send/stream` to start a new conversation  ```json {   \"spotter_experience_version\": \"V2\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(required for this version)*: `V2`. A request that omits it runs on `V1`, the default, so pass it on every request for the conversation. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - `conversation_identifier` *(path parameter, optional)*: the conversation to send the messages in, as returned by `createAgentConversation`. Omit the segment — `POST /api/rest/2.0/ai/agent/conversation/send/stream` — to ask a one-off question. A conversation is created automatically, and its identifier is returned in the `x-conversation-identifier` response header and in the final `done` event, so a follow-up can continue it. The new conversation is not saved: it does not appear in `getConversationList`, but it can be continued by its identifier. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  Send `Accept: text/event-stream` and read the response incrementally. With `curl`, use `-N` to disable buffering.  ##### Response  Each event is a `data:` line carrying a single JSON object, with exactly one top-level key:  | Key           | Meaning                                                             | | ------------- | ------------------------------------------------------------------- | | `event`       | Text from Spotter — its reasoning or its answer.                    | | `tool_call`   | Spotter started a step, such as querying a data source.             | | `progress`    | A stage of a step in flight, so you can show what Spotter is doing. | | `tool_result` | A step finished; carries its result, including any answer produced. | | `error`       | The turn failed.                                                    | | `done`        | End of turn. Always last.                                           |  A turn that queries data runs them in this order:  ``` tool_call  →  progress (several)  →  tool_result  →  event (the answer text)  →  done ```  `tool_call`, `progress` and `tool_result` for one step share a `tool_call_id`, so you can group them. A turn may run several steps, or none.  Ignore any key you don\'t recognise — new event types may be added.  Lines beginning with `:` are SSE keep-alive comments. They carry no data and exist only to hold the connection open while Spotter is thinking — standard SSE clients discard them automatically, and a hand-written client should skip any line starting with `:`.  An event with content has the shape:  ```json {   \"event\": {     \"id\": \"c506785a-0493-4273-97c0-128ab2bdd7aa\",     \"invocation_id\": \"e-613f7481-2ddf-4b6b-8b60-5e2d10c8c974\",     \"partial\": true,     \"content\": {       \"role\": \"model\",       \"parts\": [{ \"text\": \" asking for data\", \"thought\": true }]     }   } } ```  - `parts[].text` carries the text to render. Text arrives incrementally, so concatenate parts in the order received. - `parts[].thought` is `true` when the text is Spotter\'s reasoning rather than its answer. Use it to render reasoning separately, or to hide it. - `partial` is `true` for an incremental chunk and `false` for a frame that restates the accumulated text of a completed segment. - `invocation_id` is stable for one turn; `id` identifies a single event.  ###### Steps: tool_call, progress, tool_result  When Spotter needs to do something — query a data source, run code — it reports the step as it happens.  **`tool_call`** announces the step and the arguments it ran with:  ```json {   \"tool_call\": {     \"id\": \"toolu_01AMjCrr\",     \"name\": \"spotter_tools_fetch_and_visualize_data\",     \"args\": {       \"dataset_id\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\",       \"english_query\": \"total sales by region last quarter\"     }   } } ```  **`progress`** reports each stage while the step runs:  ```json {   \"progress\": {     \"code\": \"ANSWER_GEN\",     \"message\": \"Verifying results with the Trust Layer\",     \"tool_call_id\": \"toolu_01AMjCrr\"   } } ```  `message` is human-facing text you can show directly; it is absent for stages that have none. Treat an unfamiliar `code` as \"still working\" rather than an error.  **`tool_result`** carries what the step produced:  ```json {   \"tool_result\": {     \"id\": \"toolu_01AMjCrr\",     \"name\": \"spotter_tools_fetch_and_visualize_data\",     \"is_error\": false,     \"text\": \"**total sales by region last quarter**\\nTML query: `[sales] [region] [date] = \'last quarter\'`\\n...\",     \"answer\": {       \"title\": \"total sales by region last quarter\",       \"session_id\": \"c5c25b33-74b8-4e83-b7f3-f7f384323903\",       \"gen_no\": 2,       \"transaction_id\": \"6fafbc09-1b08-4c49-a017-fa331612a76f\",       \"worksheet_id\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\",       \"sage_query\": \"[sales] [region] [date] = \'last quarter\'\",       \"visualization\": { \"chart_type\": \"ADVANCED_COLUMN\" },       \"table_data\": { \"total_rows\": 5, \"columns\": [{ \"name\": \"region\", \"type\": \"ATTRIBUTE\" }] }     }   } } ```  - `text` is the step\'s own human-readable summary. For a data query it includes a sample of the rows — a sample, not the result set; read `answer.table_data.total_rows` for the true count. - `answer` is present when the step produced a ThoughtSpot answer. Use `session_id` with `gen_no` to fetch or deep-link it, and `sage_query` to show how the question was interpreted. - `is_error` is `true` when the step failed. Spotter usually explains the failure in the text that follows, so this is a signal to read rather than a reason to stop.  `args` and `answer` are forwarded as the backend produces them, so both may carry fields not listed here, and may gain more over time. Read the fields you need and ignore the rest.  ###### End of turn  The stream ends with a terminal event:  ```json { \"done\": { \"conversation_identifier\": \"5612260428840173568\" } } ```  Nothing follows it. Treat its arrival — not the socket closing — as the signal that the turn is complete: a stream that ends _without_ a `done` event was interrupted, and whatever text arrived before it is partial. This is the only way to distinguish a finished answer from a truncated one.  `done` reports that the stream completed, not that the turn succeeded; a turn that emitted an `error` event still ends with `done`. Check for an `error` event to determine the outcome.  The `conversation_identifier` is repeated here so a client that cannot read response headers — a browser `EventSource`, for example — can still continue a conversation it created by omitting the conversation identifier.  ###### Errors during a turn  If the turn fails after streaming has begun, an event carries an error instead of content:  ```json {   \"error\": {     \"code\": \"409\",     \"source\": \"transport\",     \"display_message\": \"Another request is still running in this conversation.\",     \"error_bucket\": \"RETRY\"   } } ```  Render `display_message`. `code` is always a string; quote it when reporting an issue. Branch on `error_bucket`: `RETRY` (retry the request), `REFRESH` (reload and retry), `NEW_CHAT` (start a new conversation), `SUPPORT` (contact support). Treat any unrecognized value as `SUPPORT`.  A conversation that does not exist, or that belongs to another user, is reported the same way: an `error` event with `code` `\"404\"` and `error_bucket` `NEW_CHAT`, after a `200` response has started. The two cases cannot be told apart.  A failure at the transport layer after streaming has begun cannot be surfaced as an HTTP error; in that case the stream will end with only a `done` event and no `error` event.  A failure can also be reported on an `event` itself, when Spotter fails while producing that event. Its `error_code` is set and its `parts` are empty:  ```json {   \"event\": {     \"id\": \"c506785a-0493-4273-97c0-128ab2bdd7aa\",     \"invocation_id\": \"e-613f7481-2ddf-4b6b-8b60-5e2d10c8c974\",     \"error_code\": \"MALFORMED_FUNCTION_CALL\",     \"content\": { \"role\": \"model\", \"parts\": [] }   } } ```  The two report different things:  | Where                     | What failed                                                                   | What to do                                                                   | | ------------------------- | ----------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | | `error` frame             | The turn as a whole. Carries `display_message` and `error_bucket`.            | Show `display_message` and act on `error_bucket`.                            | | `event` with `error_code` | One event, while Spotter was producing it. Carries only the code, no message. | Treat the event as having no text. If an `error` frame follows, act on that. |  `error_code` is diagnostic, not a fixed set of values: quote it when reporting an issue rather than branching on it.  </details>  <details> <summary>When <code>spotter_experience_version</code> is <code>V1</code></summary>  Use this version only if your cluster must stay on the previous experience. New Spotter capabilities ship in `V2`.  ##### Request  `POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream`  ```json {   \"spotter_experience_version\": \"V1\",   \"messages\": [\"Which region had the highest sales last quarter?\"] } ```  - `spotter_experience_version` *(optional)*: `V1`, the default. A request that omits it runs on this version. - `conversation_identifier` *(path parameter, required)*: the conversation to send the messages in, as returned by `createAgentConversation`. - `messages`: an array of one or more text messages to send to the agent. The messages are sent together as one turn.  Send `Accept: text/event-stream` and read the response incrementally. With `curl`, use `-N` to disable buffering.  ##### Response  Each line has the form `data: [{\"type\": \"...\", ...}]` — a JSON array of event objects. Event types include:  - `ack`: confirms receipt of the request (`node_id`) - `conv_title`: conversation title (`title`, `conv_id`) - `notification`: status updates on operations (`group_id`, `metadata`, `code` — e.g. `TOOL_CALL_NOTIFICATION`, `nls_start`, `FINAL_RESPONSE_NOTIFICATION`) - `text-chunk`: incremental content chunks (`id`, `group_id`, `metadata` with `format` and `type` such as `thinking` or `text`, `content`) - `text`: full text block with same structure as `text-chunk` - `answer`: structured answer with metadata (`id`, `group_id`, `metadata` with `sage_query`, `session_id`, `title`, etc., `title`) - `error`: if a failure occurs  </details>  #### Error responses  Errors detected before streaming begins are returned as a normal HTTP response.  | Code | Description                                                                                                                      | | ---- | -------------------------------------------------------------------------------------------------------------------------------- | | 400  | Bad request — `messages` is missing or invalid, `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, the conversation identifier is malformed on `V2` (it must be letters, digits, `-` and `_`), or the conversation identifier is omitted on `V1`. | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - `spotter_experience_version`, the optional conversation identifier and `V2` support are in Beta from 26.12.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - The streaming protocol uses Server-Sent Events (SSE). > - For the complete response in a single payload, use `sendAgentConversationMessage` instead.      
     * @param conversationIdentifier Unique identifier of the conversation. Optional: on V2, omit this path segment to start a new conversation; its identifier is returned in the response and the &#x60;x-conversation-identifier&#x60; header.
     * @param sendAgentConversationMessageStreamingRequest 
     */
    public async sendAgentConversationMessageStreaming(conversationIdentifier: string, sendAgentConversationMessageStreamingRequest: SendAgentConversationMessageStreamingRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIConversationApi", "sendAgentConversationMessageStreaming", "conversationIdentifier");
        }


        // verify required parameter 'sendAgentConversationMessageStreamingRequest' is not null or undefined
        if (sendAgentConversationMessageStreamingRequest === null || sendAgentConversationMessageStreamingRequest === undefined) {
            throw new RequiredError("AIConversationApi", "sendAgentConversationMessageStreaming", "sendAgentConversationMessageStreamingRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream'
            .replace('{conversation_identifier}', encodeURIComponent(String(conversationIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(sendAgentConversationMessageStreamingRequest, "SendAgentConversationMessageStreamingRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 26.2.0.cl or later        
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     * @param sendAgentMessageRequest 
     */
    public async sendAgentMessage(conversationIdentifier: string, sendAgentMessageRequest: SendAgentMessageRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIConversationApi", "sendAgentMessage", "conversationIdentifier");
        }


        // verify required parameter 'sendAgentMessageRequest' is not null or undefined
        if (sendAgentMessageRequest === null || sendAgentMessageRequest === undefined) {
            throw new RequiredError("AIConversationApi", "sendAgentMessage", "sendAgentMessageRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/{conversation_identifier}/converse'
            .replace('{conversation_identifier}', encodeURIComponent(String(conversationIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(sendAgentMessageRequest, "SendAgentMessageRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 26.2.0.cl or later        
     * @param sendAgentMessageStreamingRequest 
     */
    public async sendAgentMessageStreaming(sendAgentMessageStreamingRequest: SendAgentMessageStreamingRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'sendAgentMessageStreamingRequest' is not null or undefined
        if (sendAgentMessageStreamingRequest === null || sendAgentMessageStreamingRequest === undefined) {
            throw new RequiredError("AIConversationApi", "sendAgentMessageStreaming", "sendAgentMessageStreamingRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/converse/sse';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(sendAgentMessageStreamingRequest, "SendAgentMessageStreamingRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 10.4.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead.  Sends a follow-up message to an existing conversation within the context of a data model.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request. A conversation must first be created using the `createConversation` API.  #### Usage guidelines  The request must include: - `conversation_identifier`: the unique session ID returned by `createConversation` - `metadata_identifier`: the unique ID of the data source used for the conversation - `message`: a natural language string with the follow-up question  If the request is successful, the API returns an array of response messages, each containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl. Use `sendAgentConversationMessage` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest 
     */
    public async sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIConversationApi", "sendMessage", "conversationIdentifier");
        }


        // verify required parameter 'sendMessageRequest' is not null or undefined
        if (sendMessageRequest === null || sendMessageRequest === undefined) {
            throw new RequiredError("AIConversationApi", "sendMessage", "sendMessageRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/conversation/{conversation_identifier}/converse'
            .replace('{conversation_identifier}', encodeURIComponent(String(conversationIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(sendMessageRequest, "SendMessageRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * @deprecated
     *
     *  Version: 10.4.0.cl or later   **Deprecated** — Use `createAgentConversation` followed by `sendAgentConversationMessage` instead.  Processes a natural language query against a specified data model and returns a single AI-generated answer without requiring a conversation session.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `query`: a natural language question (e.g., \"What were total sales last quarter?\") - `metadata_identifier`: the unique ID of the data source to query against  If the request is successful, the API returns a response message containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is deprecated from 26.12.0.cl. Use `createAgentConversation` and `sendAgentConversationMessage` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest 
     */
    public async singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'singleAnswerRequest' is not null or undefined
        if (singleAnswerRequest === null || singleAnswerRequest === undefined) {
            throw new RequiredError("AIConversationApi", "singleAnswer", "singleAnswerRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/answer/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(singleAnswerRequest, "SingleAnswerRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Stops an in-progress agent conversation response.    Version: 26.6.0.cl or later   <span>Version: 26.6.0.cl or later   Stops an in-progress agent response for the specified conversation. Use this endpoint to cancel a response that is actively being generated — for example, when the user navigates away, reformulates their question, or no longer needs the current result.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Spotter version  `spotter_experience_version` *(available from 26.12.0.cl)* selects the version of Spotter a conversation runs on:  - `V2`: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a `400`. - `V1` (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: `V1`.** A request that omits the parameter runs on `V1` on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request must include:  - `spotter_experience_version` *(body parameter; required for `V2`)*: the version the conversation was created on. A request that omits it runs on `V1`, the default, so a `V2` conversation is found only when the parameter is passed. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a `400`. - `conversation_identifier` *(path parameter)*: the unique ID of the conversation whose active response should be stopped, as returned by `createAgentConversation`  A successful request returns an empty `204 No Content` response. If there is no active response in progress at the time of the call, the request is still treated as successful.  After stopping a response, the conversation session remains active. You can continue sending messages using `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming`.  #### Example request  ```bash POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response ```  #### Typical usage scenario  This endpoint is useful when integrating Spotter into a chat UI where users can cancel a long-running query. For example:  1. User sends a message via `sendAgentConversationMessageStreaming`. 2. User clicks a \"Stop generating\" button while the response is streaming. 3. Your client calls `stopConversation` with the active `conversation_identifier`. 4. The stream is terminated and the user can ask a new question.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 400  | Bad request — `spotter_experience_version` is `V2` and the cluster\'s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, the conversation identifier is malformed on `V2` (it must be letters, digits, `-` and `_`), or, on `V2`, no conversation with the given identifier exists for this user. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. |  > ###### Note: > > - Calling this endpoint when no response is in progress does not return an error. > - The conversation context is preserved after stopping — previous messages and answers remain accessible. > - Available from version 26.6.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - `spotter_experience_version` and `V2` support are in Beta from 26.12.0.cl.      
     * @param conversationIdentifier Unique identifier of the conversation to stop.
     * @param stopConversationRequest 
     */
    public async stopConversation(conversationIdentifier: string, stopConversationRequest?: StopConversationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIConversationApi", "stopConversation", "conversationIdentifier");
        }



        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response'
            .replace('{conversation_identifier}', encodeURIComponent(String(conversationIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.32.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.32.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(stopConversationRequest, "StopConversationRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class AIConversationApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createAgentConversation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createAgentConversationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<AgentConversation >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AgentConversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AgentConversation", ""
            ) as AgentConversation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: AgentConversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AgentConversation", ""
            ) as AgentConversation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: AgentConversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AgentConversation", ""
            ) as AgentConversation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConversation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createConversationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Conversation >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Conversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Conversation", ""
            ) as Conversation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Conversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Conversation", ""
            ) as Conversation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Conversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Conversation", ""
            ) as Conversation;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getDataSourceSuggestions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getDataSourceSuggestionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<EurekaDataSourceSuggestionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaDataSourceSuggestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDataSourceSuggestionResponse", ""
            ) as EurekaDataSourceSuggestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaDataSourceSuggestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDataSourceSuggestionResponse", ""
            ) as EurekaDataSourceSuggestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: EurekaDataSourceSuggestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDataSourceSuggestionResponse", ""
            ) as EurekaDataSourceSuggestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getRelevantQuestions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getRelevantQuestionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<EurekaGetRelevantQuestionsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaGetRelevantQuestionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetRelevantQuestionsResponse", ""
            ) as EurekaGetRelevantQuestionsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaGetRelevantQuestionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetRelevantQuestionsResponse", ""
            ) as EurekaGetRelevantQuestionsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: EurekaGetRelevantQuestionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetRelevantQuestionsResponse", ""
            ) as EurekaGetRelevantQuestionsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to loadAnswer
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async loadAnswerWithHttpInfo(response: ResponseContext): Promise<HttpInfo<LoadAnswerResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LoadAnswerResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LoadAnswerResponse", ""
            ) as LoadAnswerResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: LoadAnswerResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LoadAnswerResponse", ""
            ) as LoadAnswerResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: LoadAnswerResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LoadAnswerResponse", ""
            ) as LoadAnswerResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to queryGetDecomposedQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async queryGetDecomposedQueryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<EurekaDecomposeQueryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaDecomposeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDecomposeQueryResponse", ""
            ) as EurekaDecomposeQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaDecomposeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDecomposeQueryResponse", ""
            ) as EurekaDecomposeQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: EurekaDecomposeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDecomposeQueryResponse", ""
            ) as EurekaDecomposeQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendAgentConversationMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async sendAgentConversationMessageWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendAgentConversationMessageStreaming
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async sendAgentConversationMessageStreamingWithHttpInfo(response: ResponseContext): Promise<HttpInfo<SendAgentConversationMessageStreaming200Response | any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SendAgentConversationMessageStreaming200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentConversationMessageStreaming200Response", ""
            ) as SendAgentConversationMessageStreaming200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: SendAgentConversationMessageStreaming200Response | any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentConversationMessageStreaming200Response | any", ""
            ) as SendAgentConversationMessageStreaming200Response | any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendAgentMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async sendAgentMessageWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendAgentMessageStreaming
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async sendAgentMessageStreamingWithHttpInfo(response: ResponseContext): Promise<HttpInfo<SendAgentMessageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SendAgentMessageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentMessageResponse", ""
            ) as SendAgentMessageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: SendAgentMessageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentMessageResponse", ""
            ) as SendAgentMessageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: SendAgentMessageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentMessageResponse", ""
            ) as SendAgentMessageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async sendMessageWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<ResponseMessage> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<ResponseMessage> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ResponseMessage>", ""
            ) as Array<ResponseMessage>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Array<ResponseMessage> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ResponseMessage>", ""
            ) as Array<ResponseMessage>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<ResponseMessage> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ResponseMessage>", ""
            ) as Array<ResponseMessage>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to singleAnswer
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async singleAnswerWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ResponseMessage >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ResponseMessage = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ResponseMessage", ""
            ) as ResponseMessage;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: ResponseMessage = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ResponseMessage", ""
            ) as ResponseMessage;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ResponseMessage = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ResponseMessage", ""
            ) as ResponseMessage;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to stopConversation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async stopConversationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
