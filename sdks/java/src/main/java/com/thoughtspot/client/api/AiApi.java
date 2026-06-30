/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.google.gson.reflect.TypeToken;
import com.thoughtspot.client.ApiCallback;
import com.thoughtspot.client.ApiClient;
import com.thoughtspot.client.ApiClientConfiguration;
import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.ApiResponse;
import com.thoughtspot.client.Configuration;
import com.thoughtspot.client.Pair;
import com.thoughtspot.client.model.AgentConversation;
import com.thoughtspot.client.model.AgentConversationHistoryResponse;
import com.thoughtspot.client.model.AgentInstructions;
import com.thoughtspot.client.model.Conversation;
import com.thoughtspot.client.model.ConversationMessageResponse;
import com.thoughtspot.client.model.CreateAgentConversationRequest;
import com.thoughtspot.client.model.CreateConversationRequest;
import com.thoughtspot.client.model.EurekaDataSourceSuggestionResponse;
import com.thoughtspot.client.model.EurekaDecomposeQueryResponse;
import com.thoughtspot.client.model.EurekaExportMemoryResponse;
import com.thoughtspot.client.model.EurekaGetNLInstructionsResponse;
import com.thoughtspot.client.model.EurekaGetRelevantQuestionsResponse;
import com.thoughtspot.client.model.EurekaImportMemoryResponse;
import com.thoughtspot.client.model.EurekaSetNLInstructionsResponse;
import com.thoughtspot.client.model.ExportMemoryRequest;
import com.thoughtspot.client.model.GetDataSourceSuggestionsRequest;
import com.thoughtspot.client.model.GetNLInstructionsRequest;
import com.thoughtspot.client.model.GetRelevantQuestionsRequest;
import com.thoughtspot.client.model.ImportMemoryRequest;
import com.thoughtspot.client.model.LoadAnswerResponse;
import com.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import com.thoughtspot.client.model.ResponseMessage;
import com.thoughtspot.client.model.SendAgentConversationMessageRequest;
import com.thoughtspot.client.model.SendAgentConversationMessageStreamingRequest;
import com.thoughtspot.client.model.SendAgentMessageRequest;
import com.thoughtspot.client.model.SendAgentMessageResponse;
import com.thoughtspot.client.model.SendAgentMessageStreamingRequest;
import com.thoughtspot.client.model.SendMessageRequest;
import com.thoughtspot.client.model.SetAgentInstructionsRequest;
import com.thoughtspot.client.model.SetNLInstructionsRequest;
import com.thoughtspot.client.model.SingleAnswerRequest;
import com.thoughtspot.client.model.UpdateConversationRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AiApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AiApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public AiApi(ApiClientConfiguration apiClientConfiguration) {
        this.localVarApiClientConfiguration = apiClientConfiguration;
        this.localVarApiClient = new ApiClient(apiClientConfiguration);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClientConfiguration getApiClientConfiguration() {
        return localVarApiClientConfiguration;
    }

    public void applyApiClientConfiguration(ApiClientConfiguration apiClientConfiguration) {
        this.localVarApiClientConfiguration = apiClientConfiguration;
        if (localVarApiClient != null) {
            localVarApiClient.applyApiClientConfiguration(apiClientConfiguration);
        } else {
            localVarApiClient = new ApiClient(apiClientConfiguration);
        }
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createAgentConversation
     *
     * @param createAgentConversationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createAgentConversationCall(
            CreateAgentConversationRequest createAgentConversationRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createAgentConversationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversation/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAgentConversationValidateBeforeCall(
            CreateAgentConversationRequest createAgentConversationRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createAgentConversationRequest' is set
        if (createAgentConversationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createAgentConversationRequest' when calling"
                            + " createAgentConversation(Async)");
        }

        return createAgentConversationCall(createAgentConversationRequest, _callback);
    }

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
     * @param createAgentConversationRequest (required)
     * @return AgentConversation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public AgentConversation createAgentConversation(
            CreateAgentConversationRequest createAgentConversationRequest) throws ApiException {
        ApiResponse<AgentConversation> localVarResp =
                createAgentConversationWithHttpInfo(createAgentConversationRequest);
        return localVarResp.getData();
    }

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
     * @param createAgentConversationRequest (required)
     * @return ApiResponse&lt;AgentConversation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AgentConversation> createAgentConversationWithHttpInfo(
            CreateAgentConversationRequest createAgentConversationRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createAgentConversationValidateBeforeCall(createAgentConversationRequest, null);
        Type localVarReturnType = new TypeToken<AgentConversation>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.2.0.cl or later Creates a new Spotter agent conversation based
     * on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through
     * 26.4.0.cl. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the
     * metadata object specified in the request. #### Usage guidelines The request must include the
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
     * @param createAgentConversationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createAgentConversationAsync(
            CreateAgentConversationRequest createAgentConversationRequest,
            final ApiCallback<AgentConversation> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createAgentConversationValidateBeforeCall(
                        createAgentConversationRequest, _callback);
        Type localVarReturnType = new TypeToken<AgentConversation>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createConversation
     *
     * @param createConversationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createConversationCall(
            CreateConversationRequest createConversationRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createConversationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/conversation/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createConversationValidateBeforeCall(
            CreateConversationRequest createConversationRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createConversationRequest' is set
        if (createConversationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createConversationRequest' when calling"
                            + " createConversation(Async)");
        }

        return createConversationCall(createConversationRequest, _callback);
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
     * @param createConversationRequest (required)
     * @return Conversation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public Conversation createConversation(CreateConversationRequest createConversationRequest)
            throws ApiException {
        ApiResponse<Conversation> localVarResp =
                createConversationWithHttpInfo(createConversationRequest);
        return localVarResp.getData();
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
     * @param createConversationRequest (required)
     * @return ApiResponse&lt;Conversation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Conversation> createConversationWithHttpInfo(
            CreateConversationRequest createConversationRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createConversationValidateBeforeCall(createConversationRequest, null);
        Type localVarReturnType = new TypeToken<Conversation>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.4.0.cl or later Creates a new conversation session tied to a
     * specific data model for AI-driven natural language querying. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object
     * specified in the request. #### Usage guidelines The request must include: -
     * &#x60;metadata_identifier&#x60;: the unique ID of the data source that provides context for
     * the conversation Optionally, you can provide: - &#x60;tokens&#x60;: a token string to set
     * initial context for the conversation (e.g., &#x60;\&quot;[sales],[item
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
     * @param createConversationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createConversationAsync(
            CreateConversationRequest createConversationRequest,
            final ApiCallback<Conversation> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createConversationValidateBeforeCall(createConversationRequest, _callback);
        Type localVarReturnType = new TypeToken<Conversation>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConversation
     *
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteConversationCall(
            String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "DELETE",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteConversationValidateBeforeCall(
            String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " deleteConversation(Async)");
        }

        return deleteConversationCall(conversationIdentifier, _callback);
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
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteConversation(String conversationIdentifier) throws ApiException {
        deleteConversationWithHttpInfo(conversationIdentifier);
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
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteConversationWithHttpInfo(String conversationIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall =
                deleteConversationValidateBeforeCall(conversationIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Deletes an existing agent conversation. Version: 26.7.0.cl or later
     * Permanently deletes an existing saved agent conversation and all its associated messages.
     * This operation is irreversible — deleted conversations cannot be recovered. Requires
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
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteConversationAsync(
            String conversationIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall =
                deleteConversationValidateBeforeCall(conversationIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportMemory
     *
     * @param exportMemoryRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportMemoryCall(
            ExportMemoryRequest exportMemoryRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = exportMemoryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/memory/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call exportMemoryValidateBeforeCall(
            ExportMemoryRequest exportMemoryRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'exportMemoryRequest' is set
        if (exportMemoryRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'exportMemoryRequest' when calling"
                            + " exportMemory(Async)");
        }

        return exportMemoryCall(exportMemoryRequest, _callback);
    }

    /**
     * Exports memory entries (rules, recipes, and non-semantic rules) for the specified data-models
     * as a single YAML payload. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and read access on
     * every referenced data-model. Routes through eureka-agent, which applies the same
     * accessibility filtering and obj_id resolution as the internal GraphQL surface. Version:
     * 26.8.0.cl or later This API allows users to export data-model memories (can be extended to
     * agent memories in future) for a given list of data-models. This exported yaml file can then
     * be modified and used as input to the import API in target env. This API enables customers to
     * migrate memories from a source env to a target env. This improves memory adoption for Spotter
     * by giving the users a chance to develop their memories in a dev env and replicate the same in
     * a prod env. To use this API, the user needs either edit access or memory privilege on the
     * data-model or manage-spotter privilege and they must use corresponding org related
     * bearerToken where the data-model exists. #### Usage guidelines To export memory for one or
     * more data-models, the request may include: - &#x60;sources&#x60;: A list of typed scope
     * groups identifying which data-models to export memory for. Each group contains: -
     * &#x60;type&#x60;: The source object type for this group — &#x60;DATA_MODEL&#x60;. -
     * &#x60;identifiers&#x60;: An array of GUIDs or human-readable &#x60;obj_id&#x60;s of the
     * data-models to export memory for. obj_ids are resolved server-side before forwarding. The
     * memory types (&#x60;RULES&#x60;, &#x60;RECIPES&#x60;, and &#x60;NON_SEMANTIC_RULES&#x60;) and
     * the output format (&#x60;YAML&#x60;) are fixed for this endpoint and are not request
     * parameters. The API returns a response object with: - &#x60;content&#x60;: The serialized
     * memory payload (currently YAML) — exactly the shape that the &#x60;importMemory&#x60; API
     * consumes. Edit it locally and pass it back through &#x60;importMemory&#x60; to apply changes.
     * #### Source Type - **DATA_MODEL**: The &#x60;identifiers&#x60; are data-model (worksheet)
     * GUIDs. This is the default (and currently only) source type for Spotter memory and covers the
     * rules and recipes attached directly to a data-model. #### Error responses | Code |
     * Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have necessary permissions, or lacks read access
     * on a referenced data-model, or the bearer token does not correspond to the data-model&#39;s
     * org. | &gt; ###### Note: &gt; - To use this API, the user needs either edit access or memory
     * privilege on the data-model or manage-spotter privilege and they must use corresponding org
     * related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; -
     * Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please
     * contact ThoughtSpot Support to enable Spotter on your cluster.
     *
     * @param exportMemoryRequest (required)
     * @return EurekaExportMemoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public EurekaExportMemoryResponse exportMemory(ExportMemoryRequest exportMemoryRequest)
            throws ApiException {
        ApiResponse<EurekaExportMemoryResponse> localVarResp =
                exportMemoryWithHttpInfo(exportMemoryRequest);
        return localVarResp.getData();
    }

    /**
     * Exports memory entries (rules, recipes, and non-semantic rules) for the specified data-models
     * as a single YAML payload. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and read access on
     * every referenced data-model. Routes through eureka-agent, which applies the same
     * accessibility filtering and obj_id resolution as the internal GraphQL surface. Version:
     * 26.8.0.cl or later This API allows users to export data-model memories (can be extended to
     * agent memories in future) for a given list of data-models. This exported yaml file can then
     * be modified and used as input to the import API in target env. This API enables customers to
     * migrate memories from a source env to a target env. This improves memory adoption for Spotter
     * by giving the users a chance to develop their memories in a dev env and replicate the same in
     * a prod env. To use this API, the user needs either edit access or memory privilege on the
     * data-model or manage-spotter privilege and they must use corresponding org related
     * bearerToken where the data-model exists. #### Usage guidelines To export memory for one or
     * more data-models, the request may include: - &#x60;sources&#x60;: A list of typed scope
     * groups identifying which data-models to export memory for. Each group contains: -
     * &#x60;type&#x60;: The source object type for this group — &#x60;DATA_MODEL&#x60;. -
     * &#x60;identifiers&#x60;: An array of GUIDs or human-readable &#x60;obj_id&#x60;s of the
     * data-models to export memory for. obj_ids are resolved server-side before forwarding. The
     * memory types (&#x60;RULES&#x60;, &#x60;RECIPES&#x60;, and &#x60;NON_SEMANTIC_RULES&#x60;) and
     * the output format (&#x60;YAML&#x60;) are fixed for this endpoint and are not request
     * parameters. The API returns a response object with: - &#x60;content&#x60;: The serialized
     * memory payload (currently YAML) — exactly the shape that the &#x60;importMemory&#x60; API
     * consumes. Edit it locally and pass it back through &#x60;importMemory&#x60; to apply changes.
     * #### Source Type - **DATA_MODEL**: The &#x60;identifiers&#x60; are data-model (worksheet)
     * GUIDs. This is the default (and currently only) source type for Spotter memory and covers the
     * rules and recipes attached directly to a data-model. #### Error responses | Code |
     * Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have necessary permissions, or lacks read access
     * on a referenced data-model, or the bearer token does not correspond to the data-model&#39;s
     * org. | &gt; ###### Note: &gt; - To use this API, the user needs either edit access or memory
     * privilege on the data-model or manage-spotter privilege and they must use corresponding org
     * related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; -
     * Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please
     * contact ThoughtSpot Support to enable Spotter on your cluster.
     *
     * @param exportMemoryRequest (required)
     * @return ApiResponse&lt;EurekaExportMemoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<EurekaExportMemoryResponse> exportMemoryWithHttpInfo(
            ExportMemoryRequest exportMemoryRequest) throws ApiException {
        okhttp3.Call localVarCall = exportMemoryValidateBeforeCall(exportMemoryRequest, null);
        Type localVarReturnType = new TypeToken<EurekaExportMemoryResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Exports memory entries (rules, recipes, and non-semantic rules) for the
     * specified data-models as a single YAML payload. Requires &#x60;CAN_USE_SPOTTER&#x60;
     * privilege and read access on every referenced data-model. Routes through eureka-agent, which
     * applies the same accessibility filtering and obj_id resolution as the internal GraphQL
     * surface. Version: 26.8.0.cl or later This API allows users to export data-model memories (can
     * be extended to agent memories in future) for a given list of data-models. This exported yaml
     * file can then be modified and used as input to the import API in target env. This API enables
     * customers to migrate memories from a source env to a target env. This improves memory
     * adoption for Spotter by giving the users a chance to develop their memories in a dev env and
     * replicate the same in a prod env. To use this API, the user needs either edit access or
     * memory privilege on the data-model or manage-spotter privilege and they must use
     * corresponding org related bearerToken where the data-model exists. #### Usage guidelines To
     * export memory for one or more data-models, the request may include: - &#x60;sources&#x60;: A
     * list of typed scope groups identifying which data-models to export memory for. Each group
     * contains: - &#x60;type&#x60;: The source object type for this group — &#x60;DATA_MODEL&#x60;.
     * - &#x60;identifiers&#x60;: An array of GUIDs or human-readable &#x60;obj_id&#x60;s of the
     * data-models to export memory for. obj_ids are resolved server-side before forwarding. The
     * memory types (&#x60;RULES&#x60;, &#x60;RECIPES&#x60;, and &#x60;NON_SEMANTIC_RULES&#x60;) and
     * the output format (&#x60;YAML&#x60;) are fixed for this endpoint and are not request
     * parameters. The API returns a response object with: - &#x60;content&#x60;: The serialized
     * memory payload (currently YAML) — exactly the shape that the &#x60;importMemory&#x60; API
     * consumes. Edit it locally and pass it back through &#x60;importMemory&#x60; to apply changes.
     * #### Source Type - **DATA_MODEL**: The &#x60;identifiers&#x60; are data-model (worksheet)
     * GUIDs. This is the default (and currently only) source type for Spotter memory and covers the
     * rules and recipes attached directly to a data-model. #### Error responses | Code |
     * Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have necessary permissions, or lacks read access
     * on a referenced data-model, or the bearer token does not correspond to the data-model&#39;s
     * org. | &gt; ###### Note: &gt; - To use this API, the user needs either edit access or memory
     * privilege on the data-model or manage-spotter privilege and they must use corresponding org
     * related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; -
     * Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please
     * contact ThoughtSpot Support to enable Spotter on your cluster.
     *
     * @param exportMemoryRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportMemoryAsync(
            ExportMemoryRequest exportMemoryRequest,
            final ApiCallback<EurekaExportMemoryResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = exportMemoryValidateBeforeCall(exportMemoryRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaExportMemoryResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAgentInstructions
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAgentInstructionsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/instructions/get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAgentInstructionsValidateBeforeCall(final ApiCallback _callback)
            throws ApiException {
        return getAgentInstructionsCall(_callback);
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
     * @return AgentInstructions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public AgentInstructions getAgentInstructions() throws ApiException {
        ApiResponse<AgentInstructions> localVarResp = getAgentInstructionsWithHttpInfo();
        return localVarResp.getData();
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
     * @return ApiResponse&lt;AgentInstructions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AgentInstructions> getAgentInstructionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAgentInstructionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AgentInstructions>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.6.0.cl or later Retrieves the admin instructions currently
     * configured for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text
     * that guide agent behavior across all conversations. Requires admin privileges. Only users
     * with org admin access can retrieve agent instructions. #### Usage guidelines No input
     * parameters are required. The API returns the stored &#x60;AgentInstructions&#x60; record for
     * the caller&#39;s tenant and org. If no instructions have been configured yet, the API returns
     * a record with an empty &#x60;instructions&#x60; field and &#x60;null&#x60; values for
     * &#x60;id&#x60;, &#x60;created_at&#x60;, &#x60;updated_at&#x60;, and
     * &#x60;last_updated_by&#x60;. If the request is successful, the response includes: -
     * &#x60;id&#x60;: unique identifier of the instructions record - &#x60;instructions&#x60;: the
     * configured instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions
     * were first saved - &#x60;updated_at&#x60;: ISO timestamp when the instructions were last
     * updated - &#x60;last_updated_by&#x60;: user ID of the admin who last updated the instructions
     * (may be &#x60;null&#x60; for older records) #### Error responses | Code | Description |
     * |------|-------------| | 401 | Unauthorized — authentication token is missing, expired, or
     * invalid. | | 403 | Forbidden — the authenticated user does not have org admin privileges
     * required to read agent instructions. | &gt; ###### Note: &gt; &gt; - Use
     * &#x60;setAgentInstructions&#x60; to create or update agent instructions. &gt; - Available
     * from version 26.6.0.cl and later.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAgentInstructionsAsync(final ApiCallback<AgentInstructions> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getAgentInstructionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AgentInstructions>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConversation
     *
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getConversationCall(
            String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConversationValidateBeforeCall(
            String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " getConversation(Async)");
        }

        return getConversationCall(conversationIdentifier, _callback);
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
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
     * @return ConversationMessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ConversationMessageResponse getConversation(String conversationIdentifier)
            throws ApiException {
        ApiResponse<ConversationMessageResponse> localVarResp =
                getConversationWithHttpInfo(conversationIdentifier);
        return localVarResp.getData();
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
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
     * @return ApiResponse&lt;ConversationMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ConversationMessageResponse> getConversationWithHttpInfo(
            String conversationIdentifier) throws ApiException {
        okhttp3.Call localVarCall = getConversationValidateBeforeCall(conversationIdentifier, null);
        Type localVarReturnType = new TypeToken<ConversationMessageResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Retrieves the full public-safe content of a saved agent conversation:
     * ordered turns (user messages and agent response items) and sanitized code-execution file
     * metadata. Internal graph or branch state, Azure file identifiers, and messages with a
     * &#x60;SYSTEM&#x60; source are omitted. The full answer payload is not embedded; fetch it
     * separately via &#x60;loadAnswer&#x60; using the &#x60;answer_id&#x60; on each
     * &#x60;answer&#x60; response item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access
     * to the specified conversation. Version: 26.7.0.cl or later Retrieves the full public-safe
     * content of a saved agent conversation. Returns ordered conversation messages — each carrying
     * an optional user prompt (the user&#39;s message and any attachments) and the agent response
     * items produced for that turn — plus sanitized metadata for any files generated by the
     * code-execution tool. Use this endpoint to render a persisted conversation in a UI, build an
     * audit trail, or post-process a completed conversation. The full answer payload is not
     * embedded — fetch it separately via &#x60;loadAnswer&#x60; using the &#x60;answer_id&#x60; on
     * each &#x60;answer&#x60; response item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and
     * access to the specified conversation. #### Usage guidelines The request must include: -
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
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getConversationAsync(
            String conversationIdentifier, final ApiCallback<ConversationMessageResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getConversationValidateBeforeCall(conversationIdentifier, _callback);
        Type localVarReturnType = new TypeToken<ConversationMessageResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConversationList
     *
     * @param limit Maximum number of conversations to return. Used for pagination. (optional,
     *     default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination.
     *     (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true.
     *     (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getConversationListCall(
            Integer limit, Integer offset, Boolean skipEmpty, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (skipEmpty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("skip_empty", skipEmpty));
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConversationListValidateBeforeCall(
            Integer limit, Integer offset, Boolean skipEmpty, final ApiCallback _callback)
            throws ApiException {
        return getConversationListCall(limit, offset, skipEmpty, _callback);
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
     * @param limit Maximum number of conversations to return. Used for pagination. (optional,
     *     default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination.
     *     (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true.
     *     (optional, default to true)
     * @return AgentConversationHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public AgentConversationHistoryResponse getConversationList(
            Integer limit, Integer offset, Boolean skipEmpty) throws ApiException {
        ApiResponse<AgentConversationHistoryResponse> localVarResp =
                getConversationListWithHttpInfo(limit, offset, skipEmpty);
        return localVarResp.getData();
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
     * @param limit Maximum number of conversations to return. Used for pagination. (optional,
     *     default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination.
     *     (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true.
     *     (optional, default to true)
     * @return ApiResponse&lt;AgentConversationHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AgentConversationHistoryResponse> getConversationListWithHttpInfo(
            Integer limit, Integer offset, Boolean skipEmpty) throws ApiException {
        okhttp3.Call localVarCall =
                getConversationListValidateBeforeCall(limit, offset, skipEmpty, null);
        Type localVarReturnType = new TypeToken<AgentConversationHistoryResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Retrieves the list of saved agent conversations for the currently
     * authenticated user. Only conversations created with &#x60;enable_save_chat: true&#x60; are
     * returned. Version: 26.7.0.cl or later Retrieves a paginated list of saved agent conversations
     * for the currently authenticated user. Only conversations that were created with
     * &#x60;enable_save_chat: true&#x60; in &#x60;createAgentConversation&#x60; are returned.
     * Requires &#x60;CAN_USE_SPOTTER&#x60; privilege. #### Usage guidelines The request supports
     * the following optional query parameters: - &#x60;limit&#x60;: maximum number of conversations
     * to return. Use this together with &#x60;offset&#x60; for pagination. - &#x60;offset&#x60;:
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
     * @param limit Maximum number of conversations to return. Used for pagination. (optional,
     *     default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination.
     *     (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true.
     *     (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getConversationListAsync(
            Integer limit,
            Integer offset,
            Boolean skipEmpty,
            final ApiCallback<AgentConversationHistoryResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getConversationListValidateBeforeCall(limit, offset, skipEmpty, _callback);
        Type localVarReturnType = new TypeToken<AgentConversationHistoryResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDataSourceSuggestions
     *
     * @param getDataSourceSuggestionsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getDataSourceSuggestionsCall(
            GetDataSourceSuggestionsRequest getDataSourceSuggestionsRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getDataSourceSuggestionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/data-source-suggestions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDataSourceSuggestionsValidateBeforeCall(
            GetDataSourceSuggestionsRequest getDataSourceSuggestionsRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'getDataSourceSuggestionsRequest' is set
        if (getDataSourceSuggestionsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'getDataSourceSuggestionsRequest' when calling"
                            + " getDataSourceSuggestions(Async)");
        }

        return getDataSourceSuggestionsCall(getDataSourceSuggestionsRequest, _callback);
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
     * @param getDataSourceSuggestionsRequest (required)
     * @return EurekaDataSourceSuggestionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public EurekaDataSourceSuggestionResponse getDataSourceSuggestions(
            GetDataSourceSuggestionsRequest getDataSourceSuggestionsRequest) throws ApiException {
        ApiResponse<EurekaDataSourceSuggestionResponse> localVarResp =
                getDataSourceSuggestionsWithHttpInfo(getDataSourceSuggestionsRequest);
        return localVarResp.getData();
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
     * @param getDataSourceSuggestionsRequest (required)
     * @return ApiResponse&lt;EurekaDataSourceSuggestionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<EurekaDataSourceSuggestionResponse> getDataSourceSuggestionsWithHttpInfo(
            GetDataSourceSuggestionsRequest getDataSourceSuggestionsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                getDataSourceSuggestionsValidateBeforeCall(getDataSourceSuggestionsRequest, null);
        Type localVarReturnType = new TypeToken<EurekaDataSourceSuggestionResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.15.0.cl or later Suggests the most relevant data sources for a
     * given natural language query, ranked by confidence with LLM-generated reasoning. Requires
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
     * @param getDataSourceSuggestionsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getDataSourceSuggestionsAsync(
            GetDataSourceSuggestionsRequest getDataSourceSuggestionsRequest,
            final ApiCallback<EurekaDataSourceSuggestionResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getDataSourceSuggestionsValidateBeforeCall(
                        getDataSourceSuggestionsRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaDataSourceSuggestionResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNLInstructions
     *
     * @param getNLInstructionsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getNLInstructionsCall(
            GetNLInstructionsRequest getNLInstructionsRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getNLInstructionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/instructions/get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getNLInstructionsValidateBeforeCall(
            GetNLInstructionsRequest getNLInstructionsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'getNLInstructionsRequest' is set
        if (getNLInstructionsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'getNLInstructionsRequest' when calling"
                            + " getNLInstructions(Async)");
        }

        return getNLInstructionsCall(getNLInstructionsRequest, _callback);
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
     * @param getNLInstructionsRequest (required)
     * @return EurekaGetNLInstructionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public EurekaGetNLInstructionsResponse getNLInstructions(
            GetNLInstructionsRequest getNLInstructionsRequest) throws ApiException {
        ApiResponse<EurekaGetNLInstructionsResponse> localVarResp =
                getNLInstructionsWithHttpInfo(getNLInstructionsRequest);
        return localVarResp.getData();
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
     * @param getNLInstructionsRequest (required)
     * @return ApiResponse&lt;EurekaGetNLInstructionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<EurekaGetNLInstructionsResponse> getNLInstructionsWithHttpInfo(
            GetNLInstructionsRequest getNLInstructionsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                getNLInstructionsValidateBeforeCall(getNLInstructionsRequest, null);
        Type localVarReturnType = new TypeToken<EurekaGetNLInstructionsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.15.0.cl or later Retrieves existing natural language (NL)
     * instructions configured for a specific data model. These instructions guide the AI system in
     * understanding data context and generating more accurate responses. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege, at least view access on the data model, and a bearer
     * token corresponding to the org where the data model exists. #### Usage guidelines The request
     * must include: - &#x60;data_source_identifier&#x60;: the unique ID of the data model to
     * retrieve instructions for If the request is successful, the API returns: -
     * &#x60;nl_instructions_info&#x60;: an array of instruction objects, each containing: -
     * &#x60;instructions&#x60;: the configured text instructions for AI processing -
     * &#x60;scope&#x60;: the scope of the instruction — currently only &#x60;GLOBAL&#x60; is
     * supported #### Instructions scope - **GLOBAL**: Instructions that apply globally across the
     * system on the given data-model (currently only global instructions are supported) #### Error
     * responses | Code | Description |
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
     * @param getNLInstructionsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getNLInstructionsAsync(
            GetNLInstructionsRequest getNLInstructionsRequest,
            final ApiCallback<EurekaGetNLInstructionsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNLInstructionsValidateBeforeCall(getNLInstructionsRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaGetNLInstructionsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRelevantQuestions
     *
     * @param getRelevantQuestionsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getRelevantQuestionsCall(
            GetRelevantQuestionsRequest getRelevantQuestionsRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getRelevantQuestionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/relevant-questions/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRelevantQuestionsValidateBeforeCall(
            GetRelevantQuestionsRequest getRelevantQuestionsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'getRelevantQuestionsRequest' is set
        if (getRelevantQuestionsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'getRelevantQuestionsRequest' when calling"
                            + " getRelevantQuestions(Async)");
        }

        return getRelevantQuestionsCall(getRelevantQuestionsRequest, _callback);
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
     * @param getRelevantQuestionsRequest (required)
     * @return EurekaGetRelevantQuestionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public EurekaGetRelevantQuestionsResponse getRelevantQuestions(
            GetRelevantQuestionsRequest getRelevantQuestionsRequest) throws ApiException {
        ApiResponse<EurekaGetRelevantQuestionsResponse> localVarResp =
                getRelevantQuestionsWithHttpInfo(getRelevantQuestionsRequest);
        return localVarResp.getData();
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
     * @param getRelevantQuestionsRequest (required)
     * @return ApiResponse&lt;EurekaGetRelevantQuestionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<EurekaGetRelevantQuestionsResponse> getRelevantQuestionsWithHttpInfo(
            GetRelevantQuestionsRequest getRelevantQuestionsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                getRelevantQuestionsValidateBeforeCall(getRelevantQuestionsRequest, null);
        Type localVarReturnType = new TypeToken<EurekaGetRelevantQuestionsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.13.0.cl or later Breaks down a natural language query into a
     * series of smaller analytical sub-questions, each mapped to a relevant data source. Requires
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
     * @param getRelevantQuestionsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getRelevantQuestionsAsync(
            GetRelevantQuestionsRequest getRelevantQuestionsRequest,
            final ApiCallback<EurekaGetRelevantQuestionsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getRelevantQuestionsValidateBeforeCall(getRelevantQuestionsRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaGetRelevantQuestionsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importMemory
     *
     * @param importMemoryRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importMemoryCall(
            ImportMemoryRequest importMemoryRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = importMemoryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/memory/import";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call importMemoryValidateBeforeCall(
            ImportMemoryRequest importMemoryRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'importMemoryRequest' is set
        if (importMemoryRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'importMemoryRequest' when calling"
                            + " importMemory(Async)");
        }

        return importMemoryCall(importMemoryRequest, _callback);
    }

    /**
     * Imports memory entries from a YAML payload. Performs an atomic, exact-subset replacement on
     * the target data-models declared in the payload itself: every existing memory whose
     * &#x60;datamodel_sources&#x60; set is a subset of the payload&#39;s union is deleted, and
     * every row in the payload is inserted. Phase 1 (insert) is all-or-nothing; any insert failure
     * rolls back every prior insert and returns &#x60;ROLLED_BACK&#x60;. Phase 2 (delete old) is
     * best-effort; partial delete failures surface as &#x60;RESIDUAL_ORPHAN&#x60; entries in
     * &#x60;warnings&#x60; (a follow-up sweeper reconciles them). &#x60;dry_run&#x60; is required:
     * pass &#x60;true&#x60; first to inspect the preview counts and row failures, then re-run with
     * &#x60;dry_run &#x3D; false&#x60; once the caller is satisfied. A real import refuses to write
     * when any row failed validation. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and edit /
     * coaching access on every referenced data-model. Version: 26.8.0.cl or later This API allows
     * users to import data-model memories (can be extended to agent memories in future) using a
     * given yaml file. This yaml file can be obtained from the export memory API in source env and
     * can be modified and used as input to the import API in target env. This API enables customers
     * to migrate memories from a source env to a target env. This improves memory adoption for
     * Spotter by giving the users a chance to develop their memories in a dev env and replicate the
     * same in a prod env. To use this API, the user needs either edit access or memory privilege on
     * the data-model or manage-spotter privilege and they must use corresponding org related
     * bearerToken where the data-model exists. #### Usage guidelines To import memory, the request
     * must include: - &#x60;content&#x60;: The full serialized memory payload to import (currently
     * YAML). Typically the &#x60;content&#x60; value returned by the &#x60;exportMemory&#x60; API,
     * edited locally and re-submitted. The payload itself declares which data-models the memory
     * applies to (via each row&#39;s &#x60;datamodel_sources&#x60;), so no separate identifier list
     * is required. - &#x60;dry_run&#x60;: Required. When &#x60;true&#x60;, validate the payload and
     * return preview counts without writing anything; when &#x60;false&#x60;, apply the atomic
     * replacement. There is no default — always run with &#x60;dry_run &#x3D; true&#x60; first,
     * then re-run with &#x60;dry_run &#x3D; false&#x60; once you are satisfied with the preview.
     * The import performs an atomic, exact-subset replacement on the data-models referenced in the
     * payload: every existing memory whose &#x60;datamodel_sources&#x60; set is a subset of the
     * payload&#39;s union is deleted, and every row in the payload is inserted. The API returns a
     * response object with: - &#x60;status&#x60;: The terminal status of the import
     * (&#x60;SUCCESS&#x60;, &#x60;VALIDATION_FAILED&#x60;, or &#x60;FAILED&#x60;). -
     * &#x60;summary&#x60;: Per &#x60;(memory_type, source)&#x60; counts. In a dry run the
     * &#x60;deleted_record_count&#x60;/&#x60;inserted_record_count&#x60; are previews; in a real
     * import they are actuals. - &#x60;validation_failures&#x60;: Per-item validation failures,
     * each with &#x60;line_number&#x60;, &#x60;reason&#x60;, &#x60;field_name&#x60;, and
     * &#x60;message&#x60; for click-to-locate and inline highlighting. - &#x60;diagnostics&#x60;:
     * Groups of diagnostic messages, each with a &#x60;sub_status&#x60; (&#x60;WARNING&#x60;,
     * &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;, or &#x60;UNKNOWN&#x60;) and a
     * &#x60;messages&#x60; list. This is the single channel for both non-fatal observations (e.g. a
     * &#x60;RESIDUAL_ORPHAN&#x60; entry under &#x60;WARNING&#x60; when a best-effort delete left an
     * old doc behind, reconciled later by a sweeper using &#x60;operation_id&#x60;) and fatal
     * causes (e.g. the failure reason under &#x60;FAILURE&#x60;, or a &#x60;ROLLED_BACK&#x60; group
     * when inserts were undone). - &#x60;operation_id&#x60;: A server-minted UUID for log
     * correlation and follow-up cleanup. #### Dry run &#x60;dry_run&#x60; is required and has no
     * default, so the import is always a deliberate two-step flow: 1. **First, call with
     * &#x60;dry_run &#x3D; true&#x60;.** This validates the payload and previews what would happen
     * — the counts in &#x60;summary&#x60; and any &#x60;validation_failures&#x60; — without writing
     * anything. 2. **Then, after reviewing a clean preview, call again with &#x60;dry_run &#x3D;
     * false&#x60;** (same &#x60;content&#x60;). This performs the atomic replacement. It refuses to
     * write when any item fails validation, so fix the reported &#x60;validation_failures&#x60; and
     * resubmit. &gt; ###### Important: &gt; Never call &#x60;dry_run &#x3D; false&#x60; without
     * first inspecting a &#x60;dry_run &#x3D; true&#x60; preview. A real import deletes and
     * replaces existing memories on the referenced data-models. #### Error responses | Code |
     * Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | #### Logical
     * failures Validation and write failures are not returned in the error envelope. The call
     * returns &#x60;200&#x60; with a terminal &#x60;status&#x60; of &#x60;VALIDATION_FAILED&#x60;
     * or &#x60;FAILED&#x60;, and the details live in &#x60;validation_failures&#x60; /
     * &#x60;diagnostics&#x60;: - **VALIDATION_FAILED** — one or more items failed schema/semantic
     * validation; nothing was written. Inspect &#x60;validation_failures&#x60;, fix the items, and
     * resubmit. - **FAILED** — the import did not complete. This covers both internal errors and
     * rollbacks. Inspect &#x60;diagnostics&#x60;: a &#x60;ROLLED_BACK&#x60; group means Phase-1
     * inserts failed and every successful insert was undone (the originals are intact, no
     * destructive change), while a &#x60;FAILURE&#x60; group carries another non-validation cause
     * (e.g. an internal error). Sample &#x60;VALIDATION_FAILED&#x60; response (HTTP 200):
     * &#x60;&#x60;&#x60;json { \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,
     * \&quot;summary\&quot;: [ { \&quot;memory_type\&quot;: \&quot;RULES\&quot;,
     * \&quot;source\&quot;: { \&quot;identifier\&quot;:
     * \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot;, \&quot;type\&quot;:
     * \&quot;DATA_MODEL\&quot; }, \&quot;existing_record_count\&quot;: 3,
     * \&quot;deleted_record_count\&quot;: 0, \&quot;inserted_record_count\&quot;: 0,
     * \&quot;failed_record_count\&quot;: 1 } ], \&quot;validation_failures\&quot;: [ {
     * \&quot;line_number\&quot;: 4, \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,
     * \&quot;field_name\&quot;: \&quot;content.rule_definition\&quot;, \&quot;message\&quot;:
     * \&quot;Rule definition exceeds the maximum allowed length.\&quot; } ],
     * \&quot;diagnostics\&quot;: [], \&quot;operation_id\&quot;:
     * \&quot;550e8400-e29b-41d4-a716-446655440000\&quot; } &#x60;&#x60;&#x60; &gt; ###### Note:
     * &gt; - To use this API, the user needs either edit access or memory privilege on the
     * data-model or manage-spotter privilege and they must use corresponding org related
     * bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking
     * changes may be introduced before the endpoint is made Generally Available. &gt; - Available
     * from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact
     * ThoughtSpot Support to enable Spotter on your cluster.
     *
     * @param importMemoryRequest (required)
     * @return EurekaImportMemoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public EurekaImportMemoryResponse importMemory(ImportMemoryRequest importMemoryRequest)
            throws ApiException {
        ApiResponse<EurekaImportMemoryResponse> localVarResp =
                importMemoryWithHttpInfo(importMemoryRequest);
        return localVarResp.getData();
    }

    /**
     * Imports memory entries from a YAML payload. Performs an atomic, exact-subset replacement on
     * the target data-models declared in the payload itself: every existing memory whose
     * &#x60;datamodel_sources&#x60; set is a subset of the payload&#39;s union is deleted, and
     * every row in the payload is inserted. Phase 1 (insert) is all-or-nothing; any insert failure
     * rolls back every prior insert and returns &#x60;ROLLED_BACK&#x60;. Phase 2 (delete old) is
     * best-effort; partial delete failures surface as &#x60;RESIDUAL_ORPHAN&#x60; entries in
     * &#x60;warnings&#x60; (a follow-up sweeper reconciles them). &#x60;dry_run&#x60; is required:
     * pass &#x60;true&#x60; first to inspect the preview counts and row failures, then re-run with
     * &#x60;dry_run &#x3D; false&#x60; once the caller is satisfied. A real import refuses to write
     * when any row failed validation. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and edit /
     * coaching access on every referenced data-model. Version: 26.8.0.cl or later This API allows
     * users to import data-model memories (can be extended to agent memories in future) using a
     * given yaml file. This yaml file can be obtained from the export memory API in source env and
     * can be modified and used as input to the import API in target env. This API enables customers
     * to migrate memories from a source env to a target env. This improves memory adoption for
     * Spotter by giving the users a chance to develop their memories in a dev env and replicate the
     * same in a prod env. To use this API, the user needs either edit access or memory privilege on
     * the data-model or manage-spotter privilege and they must use corresponding org related
     * bearerToken where the data-model exists. #### Usage guidelines To import memory, the request
     * must include: - &#x60;content&#x60;: The full serialized memory payload to import (currently
     * YAML). Typically the &#x60;content&#x60; value returned by the &#x60;exportMemory&#x60; API,
     * edited locally and re-submitted. The payload itself declares which data-models the memory
     * applies to (via each row&#39;s &#x60;datamodel_sources&#x60;), so no separate identifier list
     * is required. - &#x60;dry_run&#x60;: Required. When &#x60;true&#x60;, validate the payload and
     * return preview counts without writing anything; when &#x60;false&#x60;, apply the atomic
     * replacement. There is no default — always run with &#x60;dry_run &#x3D; true&#x60; first,
     * then re-run with &#x60;dry_run &#x3D; false&#x60; once you are satisfied with the preview.
     * The import performs an atomic, exact-subset replacement on the data-models referenced in the
     * payload: every existing memory whose &#x60;datamodel_sources&#x60; set is a subset of the
     * payload&#39;s union is deleted, and every row in the payload is inserted. The API returns a
     * response object with: - &#x60;status&#x60;: The terminal status of the import
     * (&#x60;SUCCESS&#x60;, &#x60;VALIDATION_FAILED&#x60;, or &#x60;FAILED&#x60;). -
     * &#x60;summary&#x60;: Per &#x60;(memory_type, source)&#x60; counts. In a dry run the
     * &#x60;deleted_record_count&#x60;/&#x60;inserted_record_count&#x60; are previews; in a real
     * import they are actuals. - &#x60;validation_failures&#x60;: Per-item validation failures,
     * each with &#x60;line_number&#x60;, &#x60;reason&#x60;, &#x60;field_name&#x60;, and
     * &#x60;message&#x60; for click-to-locate and inline highlighting. - &#x60;diagnostics&#x60;:
     * Groups of diagnostic messages, each with a &#x60;sub_status&#x60; (&#x60;WARNING&#x60;,
     * &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;, or &#x60;UNKNOWN&#x60;) and a
     * &#x60;messages&#x60; list. This is the single channel for both non-fatal observations (e.g. a
     * &#x60;RESIDUAL_ORPHAN&#x60; entry under &#x60;WARNING&#x60; when a best-effort delete left an
     * old doc behind, reconciled later by a sweeper using &#x60;operation_id&#x60;) and fatal
     * causes (e.g. the failure reason under &#x60;FAILURE&#x60;, or a &#x60;ROLLED_BACK&#x60; group
     * when inserts were undone). - &#x60;operation_id&#x60;: A server-minted UUID for log
     * correlation and follow-up cleanup. #### Dry run &#x60;dry_run&#x60; is required and has no
     * default, so the import is always a deliberate two-step flow: 1. **First, call with
     * &#x60;dry_run &#x3D; true&#x60;.** This validates the payload and previews what would happen
     * — the counts in &#x60;summary&#x60; and any &#x60;validation_failures&#x60; — without writing
     * anything. 2. **Then, after reviewing a clean preview, call again with &#x60;dry_run &#x3D;
     * false&#x60;** (same &#x60;content&#x60;). This performs the atomic replacement. It refuses to
     * write when any item fails validation, so fix the reported &#x60;validation_failures&#x60; and
     * resubmit. &gt; ###### Important: &gt; Never call &#x60;dry_run &#x3D; false&#x60; without
     * first inspecting a &#x60;dry_run &#x3D; true&#x60; preview. A real import deletes and
     * replaces existing memories on the referenced data-models. #### Error responses | Code |
     * Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | #### Logical
     * failures Validation and write failures are not returned in the error envelope. The call
     * returns &#x60;200&#x60; with a terminal &#x60;status&#x60; of &#x60;VALIDATION_FAILED&#x60;
     * or &#x60;FAILED&#x60;, and the details live in &#x60;validation_failures&#x60; /
     * &#x60;diagnostics&#x60;: - **VALIDATION_FAILED** — one or more items failed schema/semantic
     * validation; nothing was written. Inspect &#x60;validation_failures&#x60;, fix the items, and
     * resubmit. - **FAILED** — the import did not complete. This covers both internal errors and
     * rollbacks. Inspect &#x60;diagnostics&#x60;: a &#x60;ROLLED_BACK&#x60; group means Phase-1
     * inserts failed and every successful insert was undone (the originals are intact, no
     * destructive change), while a &#x60;FAILURE&#x60; group carries another non-validation cause
     * (e.g. an internal error). Sample &#x60;VALIDATION_FAILED&#x60; response (HTTP 200):
     * &#x60;&#x60;&#x60;json { \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,
     * \&quot;summary\&quot;: [ { \&quot;memory_type\&quot;: \&quot;RULES\&quot;,
     * \&quot;source\&quot;: { \&quot;identifier\&quot;:
     * \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot;, \&quot;type\&quot;:
     * \&quot;DATA_MODEL\&quot; }, \&quot;existing_record_count\&quot;: 3,
     * \&quot;deleted_record_count\&quot;: 0, \&quot;inserted_record_count\&quot;: 0,
     * \&quot;failed_record_count\&quot;: 1 } ], \&quot;validation_failures\&quot;: [ {
     * \&quot;line_number\&quot;: 4, \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,
     * \&quot;field_name\&quot;: \&quot;content.rule_definition\&quot;, \&quot;message\&quot;:
     * \&quot;Rule definition exceeds the maximum allowed length.\&quot; } ],
     * \&quot;diagnostics\&quot;: [], \&quot;operation_id\&quot;:
     * \&quot;550e8400-e29b-41d4-a716-446655440000\&quot; } &#x60;&#x60;&#x60; &gt; ###### Note:
     * &gt; - To use this API, the user needs either edit access or memory privilege on the
     * data-model or manage-spotter privilege and they must use corresponding org related
     * bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking
     * changes may be introduced before the endpoint is made Generally Available. &gt; - Available
     * from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact
     * ThoughtSpot Support to enable Spotter on your cluster.
     *
     * @param importMemoryRequest (required)
     * @return ApiResponse&lt;EurekaImportMemoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<EurekaImportMemoryResponse> importMemoryWithHttpInfo(
            ImportMemoryRequest importMemoryRequest) throws ApiException {
        okhttp3.Call localVarCall = importMemoryValidateBeforeCall(importMemoryRequest, null);
        Type localVarReturnType = new TypeToken<EurekaImportMemoryResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Imports memory entries from a YAML payload. Performs an atomic, exact-subset
     * replacement on the target data-models declared in the payload itself: every existing memory
     * whose &#x60;datamodel_sources&#x60; set is a subset of the payload&#39;s union is deleted,
     * and every row in the payload is inserted. Phase 1 (insert) is all-or-nothing; any insert
     * failure rolls back every prior insert and returns &#x60;ROLLED_BACK&#x60;. Phase 2 (delete
     * old) is best-effort; partial delete failures surface as &#x60;RESIDUAL_ORPHAN&#x60; entries
     * in &#x60;warnings&#x60; (a follow-up sweeper reconciles them). &#x60;dry_run&#x60; is
     * required: pass &#x60;true&#x60; first to inspect the preview counts and row failures, then
     * re-run with &#x60;dry_run &#x3D; false&#x60; once the caller is satisfied. A real import
     * refuses to write when any row failed validation. Requires &#x60;CAN_USE_SPOTTER&#x60;
     * privilege and edit / coaching access on every referenced data-model. Version: 26.8.0.cl or
     * later This API allows users to import data-model memories (can be extended to agent memories
     * in future) using a given yaml file. This yaml file can be obtained from the export memory API
     * in source env and can be modified and used as input to the import API in target env. This API
     * enables customers to migrate memories from a source env to a target env. This improves memory
     * adoption for Spotter by giving the users a chance to develop their memories in a dev env and
     * replicate the same in a prod env. To use this API, the user needs either edit access or
     * memory privilege on the data-model or manage-spotter privilege and they must use
     * corresponding org related bearerToken where the data-model exists. #### Usage guidelines To
     * import memory, the request must include: - &#x60;content&#x60;: The full serialized memory
     * payload to import (currently YAML). Typically the &#x60;content&#x60; value returned by the
     * &#x60;exportMemory&#x60; API, edited locally and re-submitted. The payload itself declares
     * which data-models the memory applies to (via each row&#39;s &#x60;datamodel_sources&#x60;),
     * so no separate identifier list is required. - &#x60;dry_run&#x60;: Required. When
     * &#x60;true&#x60;, validate the payload and return preview counts without writing anything;
     * when &#x60;false&#x60;, apply the atomic replacement. There is no default — always run with
     * &#x60;dry_run &#x3D; true&#x60; first, then re-run with &#x60;dry_run &#x3D; false&#x60; once
     * you are satisfied with the preview. The import performs an atomic, exact-subset replacement
     * on the data-models referenced in the payload: every existing memory whose
     * &#x60;datamodel_sources&#x60; set is a subset of the payload&#39;s union is deleted, and
     * every row in the payload is inserted. The API returns a response object with: -
     * &#x60;status&#x60;: The terminal status of the import (&#x60;SUCCESS&#x60;,
     * &#x60;VALIDATION_FAILED&#x60;, or &#x60;FAILED&#x60;). - &#x60;summary&#x60;: Per
     * &#x60;(memory_type, source)&#x60; counts. In a dry run the
     * &#x60;deleted_record_count&#x60;/&#x60;inserted_record_count&#x60; are previews; in a real
     * import they are actuals. - &#x60;validation_failures&#x60;: Per-item validation failures,
     * each with &#x60;line_number&#x60;, &#x60;reason&#x60;, &#x60;field_name&#x60;, and
     * &#x60;message&#x60; for click-to-locate and inline highlighting. - &#x60;diagnostics&#x60;:
     * Groups of diagnostic messages, each with a &#x60;sub_status&#x60; (&#x60;WARNING&#x60;,
     * &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;, or &#x60;UNKNOWN&#x60;) and a
     * &#x60;messages&#x60; list. This is the single channel for both non-fatal observations (e.g. a
     * &#x60;RESIDUAL_ORPHAN&#x60; entry under &#x60;WARNING&#x60; when a best-effort delete left an
     * old doc behind, reconciled later by a sweeper using &#x60;operation_id&#x60;) and fatal
     * causes (e.g. the failure reason under &#x60;FAILURE&#x60;, or a &#x60;ROLLED_BACK&#x60; group
     * when inserts were undone). - &#x60;operation_id&#x60;: A server-minted UUID for log
     * correlation and follow-up cleanup. #### Dry run &#x60;dry_run&#x60; is required and has no
     * default, so the import is always a deliberate two-step flow: 1. **First, call with
     * &#x60;dry_run &#x3D; true&#x60;.** This validates the payload and previews what would happen
     * — the counts in &#x60;summary&#x60; and any &#x60;validation_failures&#x60; — without writing
     * anything. 2. **Then, after reviewing a clean preview, call again with &#x60;dry_run &#x3D;
     * false&#x60;** (same &#x60;content&#x60;). This performs the atomic replacement. It refuses to
     * write when any item fails validation, so fix the reported &#x60;validation_failures&#x60; and
     * resubmit. &gt; ###### Important: &gt; Never call &#x60;dry_run &#x3D; false&#x60; without
     * first inspecting a &#x60;dry_run &#x3D; true&#x60; preview. A real import deletes and
     * replaces existing memories on the referenced data-models. #### Error responses | Code |
     * Description |
     * |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | 401 | Unauthorized — authentication token is missing, expired, or invalid. | #### Logical
     * failures Validation and write failures are not returned in the error envelope. The call
     * returns &#x60;200&#x60; with a terminal &#x60;status&#x60; of &#x60;VALIDATION_FAILED&#x60;
     * or &#x60;FAILED&#x60;, and the details live in &#x60;validation_failures&#x60; /
     * &#x60;diagnostics&#x60;: - **VALIDATION_FAILED** — one or more items failed schema/semantic
     * validation; nothing was written. Inspect &#x60;validation_failures&#x60;, fix the items, and
     * resubmit. - **FAILED** — the import did not complete. This covers both internal errors and
     * rollbacks. Inspect &#x60;diagnostics&#x60;: a &#x60;ROLLED_BACK&#x60; group means Phase-1
     * inserts failed and every successful insert was undone (the originals are intact, no
     * destructive change), while a &#x60;FAILURE&#x60; group carries another non-validation cause
     * (e.g. an internal error). Sample &#x60;VALIDATION_FAILED&#x60; response (HTTP 200):
     * &#x60;&#x60;&#x60;json { \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,
     * \&quot;summary\&quot;: [ { \&quot;memory_type\&quot;: \&quot;RULES\&quot;,
     * \&quot;source\&quot;: { \&quot;identifier\&quot;:
     * \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot;, \&quot;type\&quot;:
     * \&quot;DATA_MODEL\&quot; }, \&quot;existing_record_count\&quot;: 3,
     * \&quot;deleted_record_count\&quot;: 0, \&quot;inserted_record_count\&quot;: 0,
     * \&quot;failed_record_count\&quot;: 1 } ], \&quot;validation_failures\&quot;: [ {
     * \&quot;line_number\&quot;: 4, \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,
     * \&quot;field_name\&quot;: \&quot;content.rule_definition\&quot;, \&quot;message\&quot;:
     * \&quot;Rule definition exceeds the maximum allowed length.\&quot; } ],
     * \&quot;diagnostics\&quot;: [], \&quot;operation_id\&quot;:
     * \&quot;550e8400-e29b-41d4-a716-446655440000\&quot; } &#x60;&#x60;&#x60; &gt; ###### Note:
     * &gt; - To use this API, the user needs either edit access or memory privilege on the
     * data-model or manage-spotter privilege and they must use corresponding org related
     * bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking
     * changes may be introduced before the endpoint is made Generally Available. &gt; - Available
     * from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact
     * ThoughtSpot Support to enable Spotter on your cluster.
     *
     * @param importMemoryRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importMemoryAsync(
            ImportMemoryRequest importMemoryRequest,
            final ApiCallback<EurekaImportMemoryResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = importMemoryValidateBeforeCall(importMemoryRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaImportMemoryResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for loadAnswer
     *
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param answerIdentifier Unique identifier of the answer to load. Use the
     *     &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; returned by
     *     &#x60;getConversation&#x60;. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call loadAnswerCall(
            String conversationIdentifier, String answerIdentifier, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()))
                        .replace(
                                "{" + "answer_identifier" + "}",
                                localVarApiClient.escapeString(answerIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call loadAnswerValidateBeforeCall(
            String conversationIdentifier, String answerIdentifier, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " loadAnswer(Async)");
        }

        // verify the required parameter 'answerIdentifier' is set
        if (answerIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'answerIdentifier' when calling"
                            + " loadAnswer(Async)");
        }

        return loadAnswerCall(conversationIdentifier, answerIdentifier, _callback);
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
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param answerIdentifier Unique identifier of the answer to load. Use the
     *     &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; returned by
     *     &#x60;getConversation&#x60;. (required)
     * @return LoadAnswerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public LoadAnswerResponse loadAnswer(String conversationIdentifier, String answerIdentifier)
            throws ApiException {
        ApiResponse<LoadAnswerResponse> localVarResp =
                loadAnswerWithHttpInfo(conversationIdentifier, answerIdentifier);
        return localVarResp.getData();
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
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param answerIdentifier Unique identifier of the answer to load. Use the
     *     &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; returned by
     *     &#x60;getConversation&#x60;. (required)
     * @return ApiResponse&lt;LoadAnswerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<LoadAnswerResponse> loadAnswerWithHttpInfo(
            String conversationIdentifier, String answerIdentifier) throws ApiException {
        okhttp3.Call localVarCall =
                loadAnswerValidateBeforeCall(conversationIdentifier, answerIdentifier, null);
        Type localVarReturnType = new TypeToken<LoadAnswerResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Loads the full answer payload for a specific answer item in an agent
     * conversation. Returns structured answer data including the TML query, token breakdown,
     * visualization metadata, and agent context state. Pass the &#x60;answer_id&#x60; from an
     * &#x60;AnswerResponseItem&#x60; in the &#x60;getConversation&#x60; response as the
     * &#x60;answer_identifier&#x60; parameter. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and
     * access to the specified conversation. Version: 26.7.0.cl or later Loads the answer details
     * for a specific answer item in an agent conversation. Returns structured answer data including
     * the TML token list, visualization metadata, and agent context state. Use this endpoint to
     * retrieve the full answer representation for an answer item — for example, to re-render a
     * chart, export a query, or inspect the generated TML. Requires &#x60;CAN_USE_SPOTTER&#x60;
     * privilege and access to the specified conversation. #### Usage guidelines The request must
     * include: - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the
     * conversation, as returned by &#x60;createAgentConversation&#x60; -
     * &#x60;answer_identifier&#x60; *(path parameter)*: the &#x60;answer_id&#x60; field from an
     * &#x60;AnswerResponseItem&#x60; in the &#x60;getConversation&#x60; response If the request is
     * successful, the response contains an &#x60;answer&#x60; object with the following fields: |
     * Field | Type | Description | |-------|------|-------------| | &#x60;title&#x60; |
     * &#x60;String&#x60; | Display title of the generated answer (e.g., &#x60;\&quot;sales by
     * month\&quot;&#x60;). | | &#x60;description&#x60; | &#x60;String&#x60; | Optional description
     * of the answer. | | &#x60;session_identifier&#x60; | &#x60;String&#x60; | Unique identifier of
     * the session in which this answer was generated. | | &#x60;generation_number&#x60; |
     * &#x60;Int&#x60; | Generation sequence number of this answer within the session. | |
     * &#x60;tokens&#x60; | &#x60;[String]&#x60; | Ordered list of TML token strings that make up
     * the answer query (e.g., &#x60;[\&quot;[sales]\&quot;,
     * \&quot;[date].&#39;monthly&#39;\&quot;]&#x60;). | | &#x60;visualization_type&#x60; |
     * &#x60;VizType&#x60; | Suggested visualization type: &#x60;Chart&#x60;, &#x60;Table&#x60;, or
     * &#x60;Undefined&#x60;. &#x60;null&#x60; if no suggestion is available. | |
     * &#x60;formulas&#x60; | &#x60;[String]&#x60; | List of formula names referenced in the answer.
     * Empty if none are used. | | &#x60;parameters&#x60; | &#x60;[String]&#x60; | List of parameter
     * names applied to the answer. Empty if none are used. | | &#x60;sub_queries&#x60; |
     * &#x60;[JSON]&#x60; | List of sub-query objects used in the answer. Empty if none are present.
     * | | &#x60;ac_state&#x60; | &#x60;ACState&#x60; | Agent context state, including
     * &#x60;transaction_identifier&#x60; and &#x60;generation_number&#x60;, used to correlate this
     * answer with a specific agent turn. | #### ACState fields | Field | Type | Description |
     * |-------|------|-------------| | &#x60;transaction_identifier&#x60; | &#x60;String&#x60; |
     * Unique identifier of the agent transaction that produced this answer. | |
     * &#x60;generation_number&#x60; | &#x60;Int&#x60; | Generation number within the transaction. |
     * #### Example request &#x60;&#x60;&#x60;bash GET
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
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param answerIdentifier Unique identifier of the answer to load. Use the
     *     &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; returned by
     *     &#x60;getConversation&#x60;. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call loadAnswerAsync(
            String conversationIdentifier,
            String answerIdentifier,
            final ApiCallback<LoadAnswerResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                loadAnswerValidateBeforeCall(conversationIdentifier, answerIdentifier, _callback);
        Type localVarReturnType = new TypeToken<LoadAnswerResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for queryGetDecomposedQuery
     *
     * @param queryGetDecomposedQueryRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call queryGetDecomposedQueryCall(
            QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = queryGetDecomposedQueryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/analytical-questions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryGetDecomposedQueryValidateBeforeCall(
            QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'queryGetDecomposedQueryRequest' is set
        if (queryGetDecomposedQueryRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'queryGetDecomposedQueryRequest' when calling"
                            + " queryGetDecomposedQuery(Async)");
        }

        return queryGetDecomposedQueryCall(queryGetDecomposedQueryRequest, _callback);
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
     * @param queryGetDecomposedQueryRequest (required)
     * @return EurekaDecomposeQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public EurekaDecomposeQueryResponse queryGetDecomposedQuery(
            QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest) throws ApiException {
        ApiResponse<EurekaDecomposeQueryResponse> localVarResp =
                queryGetDecomposedQueryWithHttpInfo(queryGetDecomposedQueryRequest);
        return localVarResp.getData();
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
     * @param queryGetDecomposedQueryRequest (required)
     * @return ApiResponse&lt;EurekaDecomposeQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public ApiResponse<EurekaDecomposeQueryResponse> queryGetDecomposedQueryWithHttpInfo(
            QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest) throws ApiException {
        okhttp3.Call localVarCall =
                queryGetDecomposedQueryValidateBeforeCall(queryGetDecomposedQueryRequest, null);
        Type localVarReturnType = new TypeToken<EurekaDecomposeQueryResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.7.0.cl or later **Deprecated** — Use
     * &#x60;getRelevantQuestions&#x60; instead (available from 10.13.0.cl). Breaks down a topical
     * or goal-oriented natural language question into smaller, actionable analytical sub-questions,
     * each mapped to a relevant data source for independent execution. Requires
     * &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the referenced
     * metadata objects. #### Usage guidelines The request accepts the following parameters: -
     * &#x60;nlsRequest&#x60;: contains the user &#x60;query&#x60; to decompose, along with optional
     * &#x60;instructions&#x60; and &#x60;bypassCache&#x60; flag - &#x60;worksheetIds&#x60;: list of
     * data source identifiers to scope the decomposition - &#x60;answerIds&#x60;: list of Answer
     * GUIDs whose data guides the response - &#x60;liveboardIds&#x60;: list of Liveboard GUIDs
     * whose data guides the response - &#x60;conversationId&#x60;: an existing conversation session
     * ID for context continuity - &#x60;content&#x60;: supplementary text or CSV data to improve
     * response quality - &#x60;maxDecomposedQueries&#x60;: maximum number of sub-questions to
     * return (default: &#x60;5&#x60;) If the request is successful, the API returns a
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
     * @param queryGetDecomposedQueryRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call queryGetDecomposedQueryAsync(
            QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest,
            final ApiCallback<EurekaDecomposeQueryResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                queryGetDecomposedQueryValidateBeforeCall(
                        queryGetDecomposedQueryRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaDecomposeQueryResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendAgentConversationMessage
     *
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call sendAgentConversationMessageCall(
            String conversationIdentifier,
            SendAgentConversationMessageRequest sendAgentConversationMessageRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendAgentConversationMessageRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendAgentConversationMessageValidateBeforeCall(
            String conversationIdentifier,
            SendAgentConversationMessageRequest sendAgentConversationMessageRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " sendAgentConversationMessage(Async)");
        }

        // verify the required parameter 'sendAgentConversationMessageRequest' is set
        if (sendAgentConversationMessageRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'sendAgentConversationMessageRequest' when"
                            + " calling sendAgentConversationMessage(Async)");
        }

        return sendAgentConversationMessageCall(
                conversationIdentifier, sendAgentConversationMessageRequest, _callback);
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageRequest (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public Object sendAgentConversationMessage(
            String conversationIdentifier,
            SendAgentConversationMessageRequest sendAgentConversationMessageRequest)
            throws ApiException {
        ApiResponse<Object> localVarResp =
                sendAgentConversationMessageWithHttpInfo(
                        conversationIdentifier, sendAgentConversationMessageRequest);
        return localVarResp.getData();
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageRequest (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Object> sendAgentConversationMessageWithHttpInfo(
            String conversationIdentifier,
            SendAgentConversationMessageRequest sendAgentConversationMessageRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                sendAgentConversationMessageValidateBeforeCall(
                        conversationIdentifier, sendAgentConversationMessageRequest, null);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.5.0.cl or later Sends natural language messages to an existing
     * Spotter agent conversation and returns the complete response synchronously. Requires
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call sendAgentConversationMessageAsync(
            String conversationIdentifier,
            SendAgentConversationMessageRequest sendAgentConversationMessageRequest,
            final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                sendAgentConversationMessageValidateBeforeCall(
                        conversationIdentifier, sendAgentConversationMessageRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendAgentConversationMessageStreaming
     *
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageStreamingRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call sendAgentConversationMessageStreamingCall(
            String conversationIdentifier,
            SendAgentConversationMessageStreamingRequest
                    sendAgentConversationMessageStreamingRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendAgentConversationMessageStreamingRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendAgentConversationMessageStreamingValidateBeforeCall(
            String conversationIdentifier,
            SendAgentConversationMessageStreamingRequest
                    sendAgentConversationMessageStreamingRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " sendAgentConversationMessageStreaming(Async)");
        }

        // verify the required parameter 'sendAgentConversationMessageStreamingRequest' is set
        if (sendAgentConversationMessageStreamingRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'sendAgentConversationMessageStreamingRequest'"
                            + " when calling sendAgentConversationMessageStreaming(Async)");
        }

        return sendAgentConversationMessageStreamingCall(
                conversationIdentifier, sendAgentConversationMessageStreamingRequest, _callback);
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageStreamingRequest (required)
     * @return SendAgentMessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public SendAgentMessageResponse sendAgentConversationMessageStreaming(
            String conversationIdentifier,
            SendAgentConversationMessageStreamingRequest
                    sendAgentConversationMessageStreamingRequest)
            throws ApiException {
        ApiResponse<SendAgentMessageResponse> localVarResp =
                sendAgentConversationMessageStreamingWithHttpInfo(
                        conversationIdentifier, sendAgentConversationMessageStreamingRequest);
        return localVarResp.getData();
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageStreamingRequest (required)
     * @return ApiResponse&lt;SendAgentMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SendAgentMessageResponse> sendAgentConversationMessageStreamingWithHttpInfo(
            String conversationIdentifier,
            SendAgentConversationMessageStreamingRequest
                    sendAgentConversationMessageStreamingRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                sendAgentConversationMessageStreamingValidateBeforeCall(
                        conversationIdentifier, sendAgentConversationMessageStreamingRequest, null);
        Type localVarReturnType = new TypeToken<SendAgentMessageResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.5.0.cl or later Sends one or more natural language messages to
     * an existing Spotter agent conversation and returns the response as a real-time Server-Sent
     * Events stream. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata
     * object associated with the conversation. The user must have access to the conversation
     * session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be
     * created using the &#x60;createAgentConversation&#x60; API. #### Usage guidelines The request
     * must include: - &#x60;conversation_identifier&#x60;: the unique session ID returned by
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentConversationMessageStreamingRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call sendAgentConversationMessageStreamingAsync(
            String conversationIdentifier,
            SendAgentConversationMessageStreamingRequest
                    sendAgentConversationMessageStreamingRequest,
            final ApiCallback<SendAgentMessageResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                sendAgentConversationMessageStreamingValidateBeforeCall(
                        conversationIdentifier,
                        sendAgentConversationMessageStreamingRequest,
                        _callback);
        Type localVarReturnType = new TypeToken<SendAgentMessageResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendAgentMessage
     *
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentMessageRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call sendAgentMessageCall(
            String conversationIdentifier,
            SendAgentMessageRequest sendAgentMessageRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendAgentMessageRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/{conversation_identifier}/converse"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendAgentMessageValidateBeforeCall(
            String conversationIdentifier,
            SendAgentMessageRequest sendAgentMessageRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " sendAgentMessage(Async)");
        }

        // verify the required parameter 'sendAgentMessageRequest' is set
        if (sendAgentMessageRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'sendAgentMessageRequest' when calling"
                            + " sendAgentMessage(Async)");
        }

        return sendAgentMessageCall(conversationIdentifier, sendAgentMessageRequest, _callback);
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentMessageRequest (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public Object sendAgentMessage(
            String conversationIdentifier, SendAgentMessageRequest sendAgentMessageRequest)
            throws ApiException {
        ApiResponse<Object> localVarResp =
                sendAgentMessageWithHttpInfo(conversationIdentifier, sendAgentMessageRequest);
        return localVarResp.getData();
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
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentMessageRequest (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Object> sendAgentMessageWithHttpInfo(
            String conversationIdentifier, SendAgentMessageRequest sendAgentMessageRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                sendAgentMessageValidateBeforeCall(
                        conversationIdentifier, sendAgentMessageRequest, null);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.2.0.cl or later **Deprecated** — Use
     * &#x60;sendAgentConversationMessage&#x60; instead. Send natural language messages to an
     * existing Spotter agent conversation and returns the complete response synchronously. Requires
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
     * endpoint is deprecated. Use &#x60;sendAgentConversationMessage&#x60; for new integrations.
     * &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the
     * endpoint is made Generally Available. &gt; - This endpoint requires Spotter - please contact
     * ThoughtSpot support to enable Spotter on your cluster.
     *
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     *     (required)
     * @param sendAgentMessageRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call sendAgentMessageAsync(
            String conversationIdentifier,
            SendAgentMessageRequest sendAgentMessageRequest,
            final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                sendAgentMessageValidateBeforeCall(
                        conversationIdentifier, sendAgentMessageRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendAgentMessageStreaming
     *
     * @param sendAgentMessageStreamingRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call sendAgentMessageStreamingCall(
            SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendAgentMessageStreamingRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/converse/sse";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendAgentMessageStreamingValidateBeforeCall(
            SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'sendAgentMessageStreamingRequest' is set
        if (sendAgentMessageStreamingRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'sendAgentMessageStreamingRequest' when"
                            + " calling sendAgentMessageStreaming(Async)");
        }

        return sendAgentMessageStreamingCall(sendAgentMessageStreamingRequest, _callback);
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
     * @param sendAgentMessageStreamingRequest (required)
     * @return SendAgentMessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public SendAgentMessageResponse sendAgentMessageStreaming(
            SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest) throws ApiException {
        ApiResponse<SendAgentMessageResponse> localVarResp =
                sendAgentMessageStreamingWithHttpInfo(sendAgentMessageStreamingRequest);
        return localVarResp.getData();
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
     * @param sendAgentMessageStreamingRequest (required)
     * @return ApiResponse&lt;SendAgentMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public ApiResponse<SendAgentMessageResponse> sendAgentMessageStreamingWithHttpInfo(
            SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest) throws ApiException {
        okhttp3.Call localVarCall =
                sendAgentMessageStreamingValidateBeforeCall(sendAgentMessageStreamingRequest, null);
        Type localVarReturnType = new TypeToken<SendAgentMessageResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.2.0.cl or later **Deprecated** — Use
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
     * @param sendAgentMessageStreamingRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call sendAgentMessageStreamingAsync(
            SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest,
            final ApiCallback<SendAgentMessageResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                sendAgentMessageStreamingValidateBeforeCall(
                        sendAgentMessageStreamingRequest, _callback);
        Type localVarReturnType = new TypeToken<SendAgentMessageResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendMessage
     *
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call sendMessageCall(
            String conversationIdentifier,
            SendMessageRequest sendMessageRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendMessageRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/conversation/{conversation_identifier}/converse"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendMessageValidateBeforeCall(
            String conversationIdentifier,
            SendMessageRequest sendMessageRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " sendMessage(Async)");
        }

        // verify the required parameter 'sendMessageRequest' is set
        if (sendMessageRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'sendMessageRequest' when calling"
                            + " sendMessage(Async)");
        }

        return sendMessageCall(conversationIdentifier, sendMessageRequest, _callback);
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
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest (required)
     * @return List&lt;ResponseMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public List<ResponseMessage> sendMessage(
            String conversationIdentifier, SendMessageRequest sendMessageRequest)
            throws ApiException {
        ApiResponse<List<ResponseMessage>> localVarResp =
                sendMessageWithHttpInfo(conversationIdentifier, sendMessageRequest);
        return localVarResp.getData();
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
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest (required)
     * @return ApiResponse&lt;List&lt;ResponseMessage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<ResponseMessage>> sendMessageWithHttpInfo(
            String conversationIdentifier, SendMessageRequest sendMessageRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                sendMessageValidateBeforeCall(conversationIdentifier, sendMessageRequest, null);
        Type localVarReturnType = new TypeToken<List<ResponseMessage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.4.0.cl or later Sends a follow-up message to an existing
     * conversation within the context of a data model. Requires &#x60;CAN_USE_SPOTTER&#x60;
     * privilege and at least view access to the metadata object specified in the request. A
     * conversation must first be created using the &#x60;createConversation&#x60; API. #### Usage
     * guidelines The request must include: - &#x60;conversation_identifier&#x60;: the unique
     * session ID returned by &#x60;createConversation&#x60; - &#x60;metadata_identifier&#x60;: the
     * unique ID of the data source used for the conversation - &#x60;message&#x60;: a natural
     * language string with the follow-up question If the request is successful, the API returns an
     * array of response messages, each containing: - &#x60;session_identifier&#x60;: the unique ID
     * of the generated response - &#x60;generation_number&#x60;: the generation number of the
     * response - &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) -
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
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call sendMessageAsync(
            String conversationIdentifier,
            SendMessageRequest sendMessageRequest,
            final ApiCallback<List<ResponseMessage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                sendMessageValidateBeforeCall(
                        conversationIdentifier, sendMessageRequest, _callback);
        Type localVarReturnType = new TypeToken<List<ResponseMessage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setAgentInstructions
     *
     * @param setAgentInstructionsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call setAgentInstructionsCall(
            SetAgentInstructionsRequest setAgentInstructionsRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = setAgentInstructionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/instructions/set";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setAgentInstructionsValidateBeforeCall(
            SetAgentInstructionsRequest setAgentInstructionsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'setAgentInstructionsRequest' is set
        if (setAgentInstructionsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'setAgentInstructionsRequest' when calling"
                            + " setAgentInstructions(Async)");
        }

        return setAgentInstructionsCall(setAgentInstructionsRequest, _callback);
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
     * @param setAgentInstructionsRequest (required)
     * @return AgentInstructions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public AgentInstructions setAgentInstructions(
            SetAgentInstructionsRequest setAgentInstructionsRequest) throws ApiException {
        ApiResponse<AgentInstructions> localVarResp =
                setAgentInstructionsWithHttpInfo(setAgentInstructionsRequest);
        return localVarResp.getData();
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
     * @param setAgentInstructionsRequest (required)
     * @return ApiResponse&lt;AgentInstructions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AgentInstructions> setAgentInstructionsWithHttpInfo(
            SetAgentInstructionsRequest setAgentInstructionsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                setAgentInstructionsValidateBeforeCall(setAgentInstructionsRequest, null);
        Type localVarReturnType = new TypeToken<AgentInstructions>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.6.0.cl or later Creates or updates the admin instructions for
     * the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent
     * behavior across all conversations. If instructions already exist for the org, they are
     * replaced (upsert semantics). Requires admin privileges. Only users with org admin access can
     * set agent instructions. #### Usage guidelines The request must include: -
     * &#x60;instructions&#x60;: the instructions text to apply to the agent (maximum 5000
     * characters) Instructions are validated against system guardrails before being saved. If the
     * instructions contain content that conflicts with guardrails, the request is rejected with a
     * &#x60;409&#x60; error and the existing instructions remain unchanged. If the request is
     * successful, the response includes the saved &#x60;AgentInstructions&#x60; record: -
     * &#x60;id&#x60;: unique identifier of the record - &#x60;instructions&#x60;: the saved
     * instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first
     * created - &#x60;updated_at&#x60;: ISO timestamp of this update - &#x60;last_updated_by&#x60;:
     * user ID of the admin who performed this update #### Error responses | Code | Description |
     * |------|-------------| | 400 | Bad request — the request body is missing required fields or
     * the &#x60;instructions&#x60; field exceeds the maximum allowed length of 5000 characters. | |
     * 401 | Unauthorized — authentication token is missing, expired, or invalid. | | 403 |
     * Forbidden — the authenticated user does not have org admin privileges required to set agent
     * instructions. | | 409 | Conflict — the provided instructions conflict with system guardrails.
     * Review and revise the instructions text before retrying. | | 500 | Internal server error. |
     * &gt; ###### Note: &gt; &gt; - This operation uses upsert semantics: it creates the
     * instructions record if none exists, or replaces the existing one. &gt; - Instructions take
     * effect immediately for new conversations created after the update. &gt; - Use
     * &#x60;getAgentInstructions&#x60; to retrieve the current instructions before making changes.
     * &gt; - Available from version 26.6.0.cl and later.
     *
     * @param setAgentInstructionsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call setAgentInstructionsAsync(
            SetAgentInstructionsRequest setAgentInstructionsRequest,
            final ApiCallback<AgentInstructions> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                setAgentInstructionsValidateBeforeCall(setAgentInstructionsRequest, _callback);
        Type localVarReturnType = new TypeToken<AgentInstructions>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setNLInstructions
     *
     * @param setNLInstructionsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call setNLInstructionsCall(
            SetNLInstructionsRequest setNLInstructionsRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = setNLInstructionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/instructions/set";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setNLInstructionsValidateBeforeCall(
            SetNLInstructionsRequest setNLInstructionsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'setNLInstructionsRequest' is set
        if (setNLInstructionsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'setNLInstructionsRequest' when calling"
                            + " setNLInstructions(Async)");
        }

        return setNLInstructionsCall(setNLInstructionsRequest, _callback);
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
     * @param setNLInstructionsRequest (required)
     * @return EurekaSetNLInstructionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public EurekaSetNLInstructionsResponse setNLInstructions(
            SetNLInstructionsRequest setNLInstructionsRequest) throws ApiException {
        ApiResponse<EurekaSetNLInstructionsResponse> localVarResp =
                setNLInstructionsWithHttpInfo(setNLInstructionsRequest);
        return localVarResp.getData();
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
     * @param setNLInstructionsRequest (required)
     * @return ApiResponse&lt;EurekaSetNLInstructionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<EurekaSetNLInstructionsResponse> setNLInstructionsWithHttpInfo(
            SetNLInstructionsRequest setNLInstructionsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                setNLInstructionsValidateBeforeCall(setNLInstructionsRequest, null);
        Type localVarReturnType = new TypeToken<EurekaSetNLInstructionsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.15.0.cl or later This API allows users to set natural language
     * (NL) instructions for a specific data-model to improve AI-generated answers and query
     * processing. These instructions help guide the AI system to better understand the data context
     * and provide more accurate responses. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, either
     * edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and a bearer token
     * corresponding to the org where the data model exists. #### Usage guidelines To set NL
     * instructions for a data-model, the request must include: -
     * &#x60;data_source_identifier&#x60;: The unique ID of the data-model for which to set NL
     * instructions - &#x60;nl_instructions_info&#x60;: An array of instruction objects, each
     * containing: - &#x60;instructions&#x60;: Array of text instructions for the LLM -
     * &#x60;scope&#x60;: The scope of the instruction (&#x60;GLOBAL&#x60;). Currently only
     * &#x60;GLOBAL&#x60; is supported. It can be extended to data-model-user scope in future. ####
     * Instructions scope - **GLOBAL**: instructions that apply to all users querying this data
     * model If the request is successful, the API returns: - &#x60;success&#x60;: a boolean
     * indicating whether the operation completed successfully #### Error responses | Code |
     * Description |
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
     * @param setNLInstructionsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call setNLInstructionsAsync(
            SetNLInstructionsRequest setNLInstructionsRequest,
            final ApiCallback<EurekaSetNLInstructionsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                setNLInstructionsValidateBeforeCall(setNLInstructionsRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaSetNLInstructionsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for singleAnswer
     *
     * @param singleAnswerRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call singleAnswerCall(
            SingleAnswerRequest singleAnswerRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = singleAnswerRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/answer/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call singleAnswerValidateBeforeCall(
            SingleAnswerRequest singleAnswerRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'singleAnswerRequest' is set
        if (singleAnswerRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'singleAnswerRequest' when calling"
                            + " singleAnswer(Async)");
        }

        return singleAnswerCall(singleAnswerRequest, _callback);
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
     * @param singleAnswerRequest (required)
     * @return ResponseMessage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ResponseMessage singleAnswer(SingleAnswerRequest singleAnswerRequest)
            throws ApiException {
        ApiResponse<ResponseMessage> localVarResp = singleAnswerWithHttpInfo(singleAnswerRequest);
        return localVarResp.getData();
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
     * @param singleAnswerRequest (required)
     * @return ApiResponse&lt;ResponseMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ResponseMessage> singleAnswerWithHttpInfo(
            SingleAnswerRequest singleAnswerRequest) throws ApiException {
        okhttp3.Call localVarCall = singleAnswerValidateBeforeCall(singleAnswerRequest, null);
        Type localVarReturnType = new TypeToken<ResponseMessage>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.4.0.cl or later Processes a natural language query against a
     * specified data model and returns a single AI-generated answer without requiring a
     * conversation session. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access
     * to the metadata object specified in the request. #### Usage guidelines The request must
     * include: - &#x60;query&#x60;: a natural language question (e.g., \&quot;What were total sales
     * last quarter?\&quot;) - &#x60;metadata_identifier&#x60;: the unique ID of the data source to
     * query against If the request is successful, the API returns a response message containing: -
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
     * @param singleAnswerRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
     * <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call singleAnswerAsync(
            SingleAnswerRequest singleAnswerRequest, final ApiCallback<ResponseMessage> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = singleAnswerValidateBeforeCall(singleAnswerRequest, _callback);
        Type localVarReturnType = new TypeToken<ResponseMessage>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for stopConversation
     *
     * @param conversationIdentifier Unique identifier of the conversation to stop. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully stopped the in-progress agent conversation response for the given. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call stopConversationCall(
            String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call stopConversationValidateBeforeCall(
            String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " stopConversation(Async)");
        }

        return stopConversationCall(conversationIdentifier, _callback);
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
     * @param conversationIdentifier Unique identifier of the conversation to stop. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully stopped the in-progress agent conversation response for the given. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public void stopConversation(String conversationIdentifier) throws ApiException {
        stopConversationWithHttpInfo(conversationIdentifier);
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
     * @param conversationIdentifier Unique identifier of the conversation to stop. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully stopped the in-progress agent conversation response for the given. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> stopConversationWithHttpInfo(String conversationIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall =
                stopConversationValidateBeforeCall(conversationIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Stops an in-progress agent conversation response. Version: 26.6.0.cl or
     * later &lt;span&gt;Version: 26.6.0.cl or later Stops an in-progress agent response for the
     * specified conversation. Use this endpoint to cancel a response that is actively being
     * generated — for example, when the user navigates away, reformulates their question, or no
     * longer needs the current result. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to
     * the specified conversation. #### Usage guidelines The request must include: -
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
     * @param conversationIdentifier Unique identifier of the conversation to stop. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully stopped the in-progress agent conversation response for the given. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call stopConversationAsync(
            String conversationIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall =
                stopConversationValidateBeforeCall(conversationIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConversation
     *
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateConversationCall(
            String conversationIdentifier,
            UpdateConversationRequest updateConversationRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = updateConversationRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update"
                        .replace(
                                "{" + "conversation_identifier" + "}",
                                localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"bearerAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateConversationValidateBeforeCall(
            String conversationIdentifier,
            UpdateConversationRequest updateConversationRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'conversationIdentifier' when calling"
                            + " updateConversation(Async)");
        }

        // verify the required parameter 'updateConversationRequest' is set
        if (updateConversationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateConversationRequest' when calling"
                            + " updateConversation(Async)");
        }

        return updateConversationCall(conversationIdentifier, updateConversationRequest, _callback);
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
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public void updateConversation(
            String conversationIdentifier, UpdateConversationRequest updateConversationRequest)
            throws ApiException {
        updateConversationWithHttpInfo(conversationIdentifier, updateConversationRequest);
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
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateConversationWithHttpInfo(
            String conversationIdentifier, UpdateConversationRequest updateConversationRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateConversationValidateBeforeCall(
                        conversationIdentifier, updateConversationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Updates attributes of an existing agent conversation. Currently only the
     * display title can be updated; additional conversation attributes may be supported in future
     * versions. At least one updatable attribute must be provided in the request body. Version:
     * 26.7.0.cl or later Updates attributes of an existing saved agent conversation. Currently only
     * the conversation&#39;s display &#x60;title&#x60; can be updated; additional updatable
     * attributes may be supported in future versions. At least one updatable attribute must be
     * supplied in the request body. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of
     * the conversation being updated. #### Usage guidelines The request must include: -
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
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateConversationAsync(
            String conversationIdentifier,
            UpdateConversationRequest updateConversationRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateConversationValidateBeforeCall(
                        conversationIdentifier, updateConversationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
