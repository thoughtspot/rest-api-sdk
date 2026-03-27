// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
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
import { EurekaGetNLInstructionsResponse } from '../models/EurekaGetNLInstructionsResponse';
import { EurekaGetRelevantQuestionsResponse } from '../models/EurekaGetRelevantQuestionsResponse';
import { EurekaSetNLInstructionsResponse } from '../models/EurekaSetNLInstructionsResponse';
import { GetDataSourceSuggestionsRequest } from '../models/GetDataSourceSuggestionsRequest';
import { GetNLInstructionsRequest } from '../models/GetNLInstructionsRequest';
import { GetRelevantQuestionsRequest } from '../models/GetRelevantQuestionsRequest';
import { QueryGetDecomposedQueryRequest } from '../models/QueryGetDecomposedQueryRequest';
import { ResponseMessage } from '../models/ResponseMessage';
import { SendAgentMessageRequest } from '../models/SendAgentMessageRequest';
import { SendAgentMessageResponse } from '../models/SendAgentMessageResponse';
import { SendAgentMessageStreamingRequest } from '../models/SendAgentMessageStreamingRequest';
import { SendMessageRequest } from '../models/SendMessageRequest';
import { SetNLInstructionsRequest } from '../models/SetNLInstructionsRequest';
import { SingleAnswerRequest } from '../models/SingleAnswerRequest';

/**
 * no description
 */
export class AIApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *  Version: 26.2.0.cl or later   Creates a new Spotter agent conversation based on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include the `metadata_context` parameter to define the conversation context. The context type can be one of:  - `DATA_SOURCE` *(available from 26.5.0.cl)*: targets a specific data source. Provide `data_source_identifier` in `data_source_context` for a single data source, or `data_source_identifiers` for multi-data-source context. The deprecated `guid` field is accepted for backwards compatibility. - `AUTO_MODE` *(available from 26.5.0.cl)*: automatically discovers and selects the most relevant datasets for the user\'s queries.  > **Note for callers on versions 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase `data_source` enum value with the `guid` field instead of the above. Example: `{ \"type\": \"data_source\", \"data_source_context\": { \"guid\": \"<worksheet-id>\" } }`.  The `conversation_settings` parameter controls which Spotter capabilities are enabled for the conversation:  - `enable_contextual_change_analysis` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_natural_language_answer_generation` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_reasoning` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_save_chat` (default: `false`, *available from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation history  If the request is successful, the response includes a unique `conversation_identifier` that must be passed to `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` to send messages within this conversation. The response also includes `conversation_id` with the same value for backwards compatibility; use `conversation_identifier` for new integrations.  #### Example request  ```json {   \"metadata_context\": {     \"type\": \"DATA_SOURCE\",     \"data_source_context\": {       \"data_source_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\"     }   },   \"conversation_settings\": {} } ```  #### Error responses  | Code | Description                                                                                                                             | | ---- | --------------------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > > - This endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version 26.5.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createAgentConversationRequest 
     */
    public async createAgentConversation(createAgentConversationRequest: CreateAgentConversationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createAgentConversationRequest' is not null or undefined
        if (createAgentConversationRequest === null || createAgentConversationRequest === undefined) {
            throw new RequiredError("AIApi", "createAgentConversation", "createAgentConversationRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/conversation/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.4.0.cl or later   Creates a new conversation session tied to a specific data model for AI-driven natural language querying.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `metadata_identifier`: the unique ID of the data source that provides context for the conversation  Optionally, you can provide: - `tokens`: a token string to set initial context for the conversation (e.g., `\"[sales],[item type],[state]\"`)  If the request is successful, ThoughtSpot returns a unique `conversation_identifier` that must be passed to `sendMessage` to continue the conversation.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest 
     */
    public async createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createConversationRequest' is not null or undefined
        if (createConversationRequest === null || createConversationRequest === undefined) {
            throw new RequiredError("AIApi", "createConversation", "createConversationRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/conversation/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.15.0.cl or later   Suggests the most relevant data sources for a given natural language query, ranked by confidence with LLM-generated reasoning.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include: - `query`: the natural language question to find relevant data sources for  If the request is successful, the API returns a ranked list of suggested data sources, each containing: - `confidence`: a float score indicating the model\'s confidence in the relevance of the suggestion - `details`: metadata about the data source   - `data_source_identifier`: the unique ID of the data source   - `data_source_name`: the display name of the data source   - `description`: a description of the data source - `reasoning`: LLM-generated rationale explaining why the data source was recommended  #### Error responses  | Code | Description                                                                                                                                | |------|--------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                       | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the underlying metadata entities. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param getDataSourceSuggestionsRequest 
     */
    public async getDataSourceSuggestions(getDataSourceSuggestionsRequest: GetDataSourceSuggestionsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'getDataSourceSuggestionsRequest' is not null or undefined
        if (getDataSourceSuggestionsRequest === null || getDataSourceSuggestionsRequest === undefined) {
            throw new RequiredError("AIApi", "getDataSourceSuggestions", "getDataSourceSuggestionsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/data-source-suggestions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.15.0.cl or later   Retrieves existing natural language (NL) instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - `data_source_identifier`: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - `nl_instructions_info`: an array of instruction objects, each containing:   - `instructions`: the configured text instructions for AI processing   - `scope`: the scope of the instruction — currently only `GLOBAL` is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Use this API to review currently configured instructions before modifying them with `setNLInstructions`.      
     * @param getNLInstructionsRequest 
     */
    public async getNLInstructions(getNLInstructionsRequest: GetNLInstructionsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'getNLInstructionsRequest' is not null or undefined
        if (getNLInstructionsRequest === null || getNLInstructionsRequest === undefined) {
            throw new RequiredError("AIApi", "getNLInstructions", "getNLInstructionsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/instructions/get';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(getNLInstructionsRequest, "GetNLInstructionsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.13.0.cl or later   Breaks down a natural language query into a series of smaller analytical sub-questions, each mapped to a relevant data source.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request must include: - `query`: the natural language question to decompose into analytical sub-questions - `metadata_context`: at least one of the following context identifiers to guide question generation:   - `conversation_identifier` — an existing conversation session ID   - `answer_identifiers` — a list of Answer GUIDs   - `liveboard_identifiers` — a list of Liveboard GUIDs   - `data_source_identifiers` — a list of data source GUIDs  Optional parameters for refining the output: - `ai_context`: additional context to improve response quality   - `content` — supplementary text or CSV data as string input   - `instructions` — custom text instructions for the AI system - `limit_relevant_questions`: maximum number of questions to return (default: `5`) - `bypass_cache`: if `true`, forces fresh computation instead of returning cached results  If the request is successful, the API returns a list of relevant analytical questions, each containing: - `query`: the generated sub-question - `data_source_identifier`: the unique ID of the data source the question targets - `data_source_name`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param getRelevantQuestionsRequest 
     */
    public async getRelevantQuestions(getRelevantQuestionsRequest: GetRelevantQuestionsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'getRelevantQuestionsRequest' is not null or undefined
        if (getRelevantQuestionsRequest === null || getRelevantQuestionsRequest === undefined) {
            throw new RequiredError("AIApi", "getRelevantQuestions", "getRelevantQuestionsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/relevant-questions/';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.7.0.cl or later   **Deprecated** — Use `getRelevantQuestions` instead (available from 10.13.0.cl).  Breaks down a topical or goal-oriented natural language question into smaller, actionable analytical sub-questions, each mapped to a relevant data source for independent execution.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request accepts the following parameters:  - `nlsRequest`: contains the user `query` to decompose, along with optional `instructions` and `bypassCache` flag - `worksheetIds`: list of data source identifiers to scope the decomposition - `answerIds`: list of Answer GUIDs whose data guides the response - `liveboardIds`: list of Liveboard GUIDs whose data guides the response - `conversationId`: an existing conversation session ID for context continuity - `content`: supplementary text or CSV data to improve response quality - `maxDecomposedQueries`: maximum number of sub-questions to return (default: `5`)  If the request is successful, the API returns a `decomposedQueryResponse` containing a list of `decomposedQueries`, each with: - `query`: the generated analytical sub-question - `worksheetId`: the unique ID of the data source the question targets - `worksheetName`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is deprecated since 10.13.0.cl. Use `getRelevantQuestions` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param queryGetDecomposedQueryRequest 
     */
    public async queryGetDecomposedQuery(queryGetDecomposedQueryRequest: QueryGetDecomposedQueryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'queryGetDecomposedQueryRequest' is not null or undefined
        if (queryGetDecomposedQueryRequest === null || queryGetDecomposedQueryRequest === undefined) {
            throw new RequiredError("AIApi", "queryGetDecomposedQuery", "queryGetDecomposedQueryRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/analytical-questions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.15.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead.  Send natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - `type`: the kind of response — `text`, `answer`, or `error` - `message`: the main content of the response - `metadata`: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is deprecated. Use `sendAgentConversationMessage` for new integrations. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     * @param sendAgentMessageRequest 
     */
    public async sendAgentMessage(conversationIdentifier: string, sendAgentMessageRequest: SendAgentMessageRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIApi", "sendAgentMessage", "conversationIdentifier");
        }


        // verify required parameter 'sendAgentMessageRequest' is not null or undefined
        if (sendAgentMessageRequest === null || sendAgentMessageRequest === undefined) {
            throw new RequiredError("AIApi", "sendAgentMessage", "sendAgentMessageRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/{conversation_identifier}/converse'
            .replace('{' + 'conversation_identifier' + '}', encodeURIComponent(String(conversationIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.13.0.cl or later   **Deprecated** — Use `sendAgentConversationMessageStreaming` instead.  Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form `data: [{\"type\": \"...\", ...}]` — a JSON array of event objects. Event types include:  - `ack`: confirms receipt of the request (`node_id`) - `conv_title`: conversation title (`title`, `conv_id`) - `notification`: status updates on operations (`group_id`, `metadata`, `code` — e.g. `TOOL_CALL_NOTIFICATION`, `nls_start`, `FINAL_RESPONSE_NOTIFICATION`) - `text-chunk`: incremental content chunks (`id`, `group_id`, `metadata` with `format` and `type` such as `thinking` or `text`, `content`) - `text`: full text block with same structure as `text-chunk` - `answer`: structured answer with metadata (`id`, `group_id`, `metadata` with `sage_query`, `session_id`, `title`, etc., `title`) - `error`: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is deprecated. Use `sendAgentConversationMessageStreaming` for new integrations. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - The streaming protocol uses Server-Sent Events (SSE).      
     * @param sendAgentMessageStreamingRequest 
     */
    public async sendAgentMessageStreaming(sendAgentMessageStreamingRequest: SendAgentMessageStreamingRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'sendAgentMessageStreamingRequest' is not null or undefined
        if (sendAgentMessageStreamingRequest === null || sendAgentMessageStreamingRequest === undefined) {
            throw new RequiredError("AIApi", "sendAgentMessageStreaming", "sendAgentMessageStreamingRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/agent/converse/sse';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.4.0.cl or later   Sends a follow-up message to an existing conversation within the context of a data model.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request. A conversation must first be created using the `createConversation` API.  #### Usage guidelines  The request must include: - `conversation_identifier`: the unique session ID returned by `createConversation` - `metadata_identifier`: the unique ID of the data source used for the conversation - `message`: a natural language string with the follow-up question  If the request is successful, the API returns an array of response messages, each containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest 
     */
    public async sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'conversationIdentifier' is not null or undefined
        if (conversationIdentifier === null || conversationIdentifier === undefined) {
            throw new RequiredError("AIApi", "sendMessage", "conversationIdentifier");
        }


        // verify required parameter 'sendMessageRequest' is not null or undefined
        if (sendMessageRequest === null || sendMessageRequest === undefined) {
            throw new RequiredError("AIApi", "sendMessage", "sendMessageRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/conversation/{conversation_identifier}/converse'
            .replace('{' + 'conversation_identifier' + '}', encodeURIComponent(String(conversationIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - `data_source_identifier`: The unique ID of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - `success`: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      
     * @param setNLInstructionsRequest 
     */
    public async setNLInstructions(setNLInstructionsRequest: SetNLInstructionsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'setNLInstructionsRequest' is not null or undefined
        if (setNLInstructionsRequest === null || setNLInstructionsRequest === undefined) {
            throw new RequiredError("AIApi", "setNLInstructions", "setNLInstructionsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/instructions/set';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(setNLInstructionsRequest, "SetNLInstructionsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query against a specified data model and returns a single AI-generated answer without requiring a conversation session.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `query`: a natural language question (e.g., \"What were total sales last quarter?\") - `metadata_identifier`: the unique ID of the data source to query against  If the request is successful, the API returns a response message containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest 
     */
    public async singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'singleAnswerRequest' is not null or undefined
        if (singleAnswerRequest === null || singleAnswerRequest === undefined) {
            throw new RequiredError("AIApi", "singleAnswer", "singleAnswerRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/ai/answer/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



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
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class AIApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createAgentConversation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createAgentConversation(response: ResponseContext): Promise<AgentConversation > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AgentConversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AgentConversation", ""
            ) as AgentConversation;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: AgentConversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AgentConversation", ""
            ) as AgentConversation;
            return body;
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
            return body;
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
     public async createConversation(response: ResponseContext): Promise<Conversation > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Conversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Conversation", ""
            ) as Conversation;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Conversation = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Conversation", ""
            ) as Conversation;
            return body;
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
            return body;
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
     public async getDataSourceSuggestions(response: ResponseContext): Promise<EurekaDataSourceSuggestionResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaDataSourceSuggestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDataSourceSuggestionResponse", ""
            ) as EurekaDataSourceSuggestionResponse;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaDataSourceSuggestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDataSourceSuggestionResponse", ""
            ) as EurekaDataSourceSuggestionResponse;
            return body;
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
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getNLInstructions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getNLInstructions(response: ResponseContext): Promise<EurekaGetNLInstructionsResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaGetNLInstructionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetNLInstructionsResponse", ""
            ) as EurekaGetNLInstructionsResponse;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaGetNLInstructionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetNLInstructionsResponse", ""
            ) as EurekaGetNLInstructionsResponse;
            return body;
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
            const body: EurekaGetNLInstructionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetNLInstructionsResponse", ""
            ) as EurekaGetNLInstructionsResponse;
            return body;
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
     public async getRelevantQuestions(response: ResponseContext): Promise<EurekaGetRelevantQuestionsResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaGetRelevantQuestionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetRelevantQuestionsResponse", ""
            ) as EurekaGetRelevantQuestionsResponse;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaGetRelevantQuestionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaGetRelevantQuestionsResponse", ""
            ) as EurekaGetRelevantQuestionsResponse;
            return body;
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
            return body;
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
     public async queryGetDecomposedQuery(response: ResponseContext): Promise<EurekaDecomposeQueryResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaDecomposeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDecomposeQueryResponse", ""
            ) as EurekaDecomposeQueryResponse;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaDecomposeQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaDecomposeQueryResponse", ""
            ) as EurekaDecomposeQueryResponse;
            return body;
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
            return body;
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
     public async sendAgentMessage(response: ResponseContext): Promise<any > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return body;
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
            return body;
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
     public async sendAgentMessageStreaming(response: ResponseContext): Promise<SendAgentMessageResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SendAgentMessageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentMessageResponse", ""
            ) as SendAgentMessageResponse;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: SendAgentMessageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentMessageResponse", ""
            ) as SendAgentMessageResponse;
            return body;
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
            const body: SendAgentMessageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SendAgentMessageResponse", ""
            ) as SendAgentMessageResponse;
            return body;
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
     public async sendMessage(response: ResponseContext): Promise<Array<ResponseMessage> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<ResponseMessage> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ResponseMessage>", ""
            ) as Array<ResponseMessage>;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Array<ResponseMessage> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ResponseMessage>", ""
            ) as Array<ResponseMessage>;
            return body;
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
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to setNLInstructions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async setNLInstructions(response: ResponseContext): Promise<EurekaSetNLInstructionsResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: EurekaSetNLInstructionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaSetNLInstructionsResponse", ""
            ) as EurekaSetNLInstructionsResponse;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: EurekaSetNLInstructionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaSetNLInstructionsResponse", ""
            ) as EurekaSetNLInstructionsResponse;
            return body;
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
            const body: EurekaSetNLInstructionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "EurekaSetNLInstructionsResponse", ""
            ) as EurekaSetNLInstructionsResponse;
            return body;
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
     public async singleAnswer(response: ResponseContext): Promise<ResponseMessage > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ResponseMessage = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ResponseMessage", ""
            ) as ResponseMessage;
            return body;
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: ResponseMessage = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ResponseMessage", ""
            ) as ResponseMessage;
            return body;
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
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
