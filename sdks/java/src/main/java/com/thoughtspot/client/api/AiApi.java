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
import com.thoughtspot.client.model.Conversation;
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
import com.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import com.thoughtspot.client.model.ResponseMessage;
import com.thoughtspot.client.model.SendAgentConversationMessageRequest;
import com.thoughtspot.client.model.SendAgentConversationMessageStreamingRequest;
import com.thoughtspot.client.model.SendAgentMessageRequest;
import com.thoughtspot.client.model.SendAgentMessageResponse;
import com.thoughtspot.client.model.SendAgentMessageStreamingRequest;
import com.thoughtspot.client.model.SendMessageRequest;
import com.thoughtspot.client.model.SetNLInstructionsRequest;
import com.thoughtspot.client.model.SingleAnswerRequest;
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
}
