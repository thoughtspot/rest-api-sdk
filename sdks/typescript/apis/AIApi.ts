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
     * Version: 10.13.0.cl or later 
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.13.0.cl or later   Provides relevant data source recommendations for a user-submitted natural language query.  To use this API, the user must have at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include a `query` string via the request body.  The returned results include metadata such as: - `confidence`: a float indicating the model\'s confidence in the relevance of each recommendation - `details`: includes `data_source_identifier`, `data_source_name`, and `description` of each recommended data source - `reasoning`: rationale provided by the LLM to explain why each data source was recommended  If the API request is successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant reasoning.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.15.0.cl or later   This API allows users to retrieve existing natural language (NL) instructions for a specific data-model. These instructions guide the AI system in understanding data context and generating more accurate responses when processing natural language queries.  #### Usage guidelines  To retrieve NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID or name of the data-model to retrieve NL instructions  The API returns a response object with: - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for natural language processing   - `scope`: The scope of the instruction (`GLOBAL`). It can be extended to data-model-user scope in future.  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  > ###### Note: > * To use this API, the user needs atleast view access on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Use this API to view currently configured instructions before modifying them with `setNLInstructions`.     
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.13.0.cl or later   Breaks down a user-submitted query into a series of analytical sub-questions using relevant contextual metadata.  To use this API, the user must have at least view-level access to the referenced metadata objects.  #### Usage guidelines  To accurately generate relevant questions, the request must include at least one of the following metadata identifiers within `metadata_context` : `conversation_identifier`, `answer_identifiers`, `liveboard_identifiers`, or `data_source_identifiers`.  You can further enhance the quality and precision of breakdown by providing additional `ai_context` such as:  - `content`: User provided content like text data, csv data as a string message to provide context & potentially improve the quality of the response. - `instructions`: User specific text instructions sent to AI system for processing the query.  Additional optional parameters include:  - `limit_relevant_questions`: Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. - `bypass_cache`: If set to true, forces fresh computation instead of returning cached results.  If the API request is successful, ThoughtSpot returns a list of relevant analytical queries, each aligned with the user\'s original question. Each returned question includes the query string, along with the identifier and name of the corresponding data source.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     * Version: 10.7.0.cl or later 
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  The API returns a array of object with a type, message, and metadata. - `type`: Type of the message — text, answer, or error. - `message`: Main content of the response. - `metadata`: Additional info depending on the message type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  Additionally, user can specify what tool can be included `conversation_settings` parameter, which supports: - `enable_contextual_change_analysis` (default: false) - `enable_natural_language_answer_generation` (default: true) - `enable_reasoning` (default: false)  If the request is valid, the API returns a stream of messages in real time, including: - `ack`: confirms receipt of the request - `text / text-chunk`: content chunks, optionally formatted (e.g., markdown) - `answer`: the final structured response with metadata and analytics - `error`: if a failure occurs - `notification`: notification messages for operation being performed  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > * The streaming protocol uses Server-Sent Events (SSE)     
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  #### Usage guidelines  To set NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID or name of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  The API returns a response object with: - `success`: Boolean indicating whether the operation was successful  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally for that data-model across the system  > ###### Note: > * To use this API, the user needs either edit access or SPOTTER_COACHING_PRIVILEGE on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.20.0")
      



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
