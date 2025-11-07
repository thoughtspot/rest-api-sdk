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
import com.thoughtspot.client.model.EurekaGetRelevantQuestionsResponse;
import com.thoughtspot.client.model.GetDataSourceSuggestionsRequest;
import com.thoughtspot.client.model.GetRelevantQuestionsRequest;
import com.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import com.thoughtspot.client.model.ResponseMessage;
import com.thoughtspot.client.model.SendAgentMessageRequest;
import com.thoughtspot.client.model.SendAgentMessageResponse;
import com.thoughtspot.client.model.SendAgentMessageStreamingRequest;
import com.thoughtspot.client.model.SendMessageRequest;
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
     * Version: 10.13.0.cl or later
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
     * Version: 10.13.0.cl or later
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
     * (asynchronously) Version: 10.13.0.cl or later
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
     * Version: 10.4.0.cl or later Creates a Conversation object to start an AI-driven conversation
     * based on a specific data model. Requires at least view access to the metadata object
     * specified in the request. #### Usage guidelines This API requires the
     * &#x60;metadata_identifier&#x60; parameter to define the context for the conversation. You can
     * also specify the tokens to initiate the conversation as shown in this example:
     * &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60; If the API request is
     * successful, ThoughtSpot returns the ID of the conversation. &gt; ###### Note: &gt; * This
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
     * Version: 10.4.0.cl or later Creates a Conversation object to start an AI-driven conversation
     * based on a specific data model. Requires at least view access to the metadata object
     * specified in the request. #### Usage guidelines This API requires the
     * &#x60;metadata_identifier&#x60; parameter to define the context for the conversation. You can
     * also specify the tokens to initiate the conversation as shown in this example:
     * &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60; If the API request is
     * successful, ThoughtSpot returns the ID of the conversation. &gt; ###### Note: &gt; * This
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
     * (asynchronously) Version: 10.4.0.cl or later Creates a Conversation object to start an
     * AI-driven conversation based on a specific data model. Requires at least view access to the
     * metadata object specified in the request. #### Usage guidelines This API requires the
     * &#x60;metadata_identifier&#x60; parameter to define the context for the conversation. You can
     * also specify the tokens to initiate the conversation as shown in this example:
     * &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60; If the API request is
     * successful, ThoughtSpot returns the ID of the conversation. &gt; ###### Note: &gt; * This
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
     * Version: 10.13.0.cl or later Provides relevant data source recommendations for a
     * user-submitted natural language query. To use this API, the user must have at least
     * view-level access to the underlying metadata entities referenced in the response. #### Usage
     * guidelines The request must include a &#x60;query&#x60; string via the request body. The
     * returned results include metadata such as: - &#x60;confidence&#x60;: a float indicating the
     * model&#39;s confidence in the relevance of each recommendation - &#x60;details&#x60;:
     * includes &#x60;data_source_identifier&#x60;, &#x60;data_source_name&#x60;, and
     * &#x60;description&#x60; of each recommended data source - &#x60;reasoning&#x60;: rationale
     * provided by the LLM to explain why each data source was recommended If the API request is
     * successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant
     * reasoning. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may
     * be introduced before it is made Generally Available. &gt; * This endpoint requires Spotter —
     * please contact ThoughtSpot Support to enable Spotter on your cluster.
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
     * Version: 10.13.0.cl or later Provides relevant data source recommendations for a
     * user-submitted natural language query. To use this API, the user must have at least
     * view-level access to the underlying metadata entities referenced in the response. #### Usage
     * guidelines The request must include a &#x60;query&#x60; string via the request body. The
     * returned results include metadata such as: - &#x60;confidence&#x60;: a float indicating the
     * model&#39;s confidence in the relevance of each recommendation - &#x60;details&#x60;:
     * includes &#x60;data_source_identifier&#x60;, &#x60;data_source_name&#x60;, and
     * &#x60;description&#x60; of each recommended data source - &#x60;reasoning&#x60;: rationale
     * provided by the LLM to explain why each data source was recommended If the API request is
     * successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant
     * reasoning. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may
     * be introduced before it is made Generally Available. &gt; * This endpoint requires Spotter —
     * please contact ThoughtSpot Support to enable Spotter on your cluster.
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
     * (asynchronously) Version: 10.13.0.cl or later Provides relevant data source recommendations
     * for a user-submitted natural language query. To use this API, the user must have at least
     * view-level access to the underlying metadata entities referenced in the response. #### Usage
     * guidelines The request must include a &#x60;query&#x60; string via the request body. The
     * returned results include metadata such as: - &#x60;confidence&#x60;: a float indicating the
     * model&#39;s confidence in the relevance of each recommendation - &#x60;details&#x60;:
     * includes &#x60;data_source_identifier&#x60;, &#x60;data_source_name&#x60;, and
     * &#x60;description&#x60; of each recommended data source - &#x60;reasoning&#x60;: rationale
     * provided by the LLM to explain why each data source was recommended If the API request is
     * successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant
     * reasoning. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may
     * be introduced before it is made Generally Available. &gt; * This endpoint requires Spotter —
     * please contact ThoughtSpot Support to enable Spotter on your cluster.
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
     * Version: 10.13.0.cl or later Breaks down a user-submitted query into a series of analytical
     * sub-questions using relevant contextual metadata. To use this API, the user must have at
     * least view-level access to the referenced metadata objects. #### Usage guidelines To
     * accurately generate relevant questions, the request must include at least one of the
     * following metadata identifiers within &#x60;metadata_context&#x60; :
     * &#x60;conversation_identifier&#x60;, &#x60;answer_identifiers&#x60;,
     * &#x60;liveboard_identifiers&#x60;, or &#x60;data_source_identifiers&#x60;. You can further
     * enhance the quality and precision of breakdown by providing additional &#x60;ai_context&#x60;
     * such as: - &#x60;content&#x60;: User provided content like text data, csv data as a string
     * message to provide context &amp; potentially improve the quality of the response. -
     * &#x60;instructions&#x60;: User specific text instructions sent to AI system for processing
     * the query. Additional optional parameters include: - &#x60;limit_relevant_questions&#x60;:
     * Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. -
     * &#x60;bypass_cache&#x60;: If set to true, forces fresh computation instead of returning
     * cached results. If the API request is successful, ThoughtSpot returns a list of relevant
     * analytical queries, each aligned with the user&#39;s original question. Each returned
     * question includes the query string, along with the identifier and name of the corresponding
     * data source. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes
     * may be introduced before the endpoint is made Generally Available. &gt; * This endpoint
     * requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
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
     * Version: 10.13.0.cl or later Breaks down a user-submitted query into a series of analytical
     * sub-questions using relevant contextual metadata. To use this API, the user must have at
     * least view-level access to the referenced metadata objects. #### Usage guidelines To
     * accurately generate relevant questions, the request must include at least one of the
     * following metadata identifiers within &#x60;metadata_context&#x60; :
     * &#x60;conversation_identifier&#x60;, &#x60;answer_identifiers&#x60;,
     * &#x60;liveboard_identifiers&#x60;, or &#x60;data_source_identifiers&#x60;. You can further
     * enhance the quality and precision of breakdown by providing additional &#x60;ai_context&#x60;
     * such as: - &#x60;content&#x60;: User provided content like text data, csv data as a string
     * message to provide context &amp; potentially improve the quality of the response. -
     * &#x60;instructions&#x60;: User specific text instructions sent to AI system for processing
     * the query. Additional optional parameters include: - &#x60;limit_relevant_questions&#x60;:
     * Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. -
     * &#x60;bypass_cache&#x60;: If set to true, forces fresh computation instead of returning
     * cached results. If the API request is successful, ThoughtSpot returns a list of relevant
     * analytical queries, each aligned with the user&#39;s original question. Each returned
     * question includes the query string, along with the identifier and name of the corresponding
     * data source. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes
     * may be introduced before the endpoint is made Generally Available. &gt; * This endpoint
     * requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
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
     * (asynchronously) Version: 10.13.0.cl or later Breaks down a user-submitted query into a
     * series of analytical sub-questions using relevant contextual metadata. To use this API, the
     * user must have at least view-level access to the referenced metadata objects. #### Usage
     * guidelines To accurately generate relevant questions, the request must include at least one
     * of the following metadata identifiers within &#x60;metadata_context&#x60; :
     * &#x60;conversation_identifier&#x60;, &#x60;answer_identifiers&#x60;,
     * &#x60;liveboard_identifiers&#x60;, or &#x60;data_source_identifiers&#x60;. You can further
     * enhance the quality and precision of breakdown by providing additional &#x60;ai_context&#x60;
     * such as: - &#x60;content&#x60;: User provided content like text data, csv data as a string
     * message to provide context &amp; potentially improve the quality of the response. -
     * &#x60;instructions&#x60;: User specific text instructions sent to AI system for processing
     * the query. Additional optional parameters include: - &#x60;limit_relevant_questions&#x60;:
     * Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. -
     * &#x60;bypass_cache&#x60;: If set to true, forces fresh computation instead of returning
     * cached results. If the API request is successful, ThoughtSpot returns a list of relevant
     * analytical queries, each aligned with the user&#39;s original question. Each returned
     * question includes the query string, along with the identifier and name of the corresponding
     * data source. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes
     * may be introduced before the endpoint is made Generally Available. &gt; * This endpoint
     * requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
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
     * Version: 10.7.0.cl or later
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
     * Version: 10.7.0.cl or later
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
     * (asynchronously) Version: 10.7.0.cl or later
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
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
     * Version: 10.13.0.cl or later This API allows users to initiate or continue an agent (Spotter)
     * conversation by submitting one or more natural language messages. To use this API, the user
     * must have access to the relevant conversational session (via conversation_identifier) and
     * submit at least one message. #### Usage guidelines To initiate or continue a conversation,
     * the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for
     * continuity and message tracking - &#x60;messages&#x60;: an array of one or more text
     * messages, each with a value and type The API returns a array of object with a type, message,
     * and metadata. - &#x60;type&#x60;: Type of the message — text, answer, or error. -
     * &#x60;message&#x60;: Main content of the response. - &#x60;metadata&#x60;: Additional info
     * depending on the message type. &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster.
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public Object sendAgentMessage(
            String conversationIdentifier, SendAgentMessageRequest sendAgentMessageRequest)
            throws ApiException {
        ApiResponse<Object> localVarResp =
                sendAgentMessageWithHttpInfo(conversationIdentifier, sendAgentMessageRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.13.0.cl or later This API allows users to initiate or continue an agent (Spotter)
     * conversation by submitting one or more natural language messages. To use this API, the user
     * must have access to the relevant conversational session (via conversation_identifier) and
     * submit at least one message. #### Usage guidelines To initiate or continue a conversation,
     * the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for
     * continuity and message tracking - &#x60;messages&#x60;: an array of one or more text
     * messages, each with a value and type The API returns a array of object with a type, message,
     * and metadata. - &#x60;type&#x60;: Type of the message — text, answer, or error. -
     * &#x60;message&#x60;: Main content of the response. - &#x60;metadata&#x60;: Additional info
     * depending on the message type. &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster.
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
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
     * (asynchronously) Version: 10.13.0.cl or later This API allows users to initiate or continue
     * an agent (Spotter) conversation by submitting one or more natural language messages. To use
     * this API, the user must have access to the relevant conversational session (via
     * conversation_identifier) and submit at least one message. #### Usage guidelines To initiate
     * or continue a conversation, the request must include: - &#x60;conversation_identifier&#x60;:
     * a unique session ID for continuity and message tracking - &#x60;messages&#x60;: an array of
     * one or more text messages, each with a value and type The API returns a array of object with
     * a type, message, and metadata. - &#x60;type&#x60;: Type of the message — text, answer, or
     * error. - &#x60;message&#x60;: Main content of the response. - &#x60;metadata&#x60;:
     * Additional info depending on the message type. &gt; ###### Note: &gt; * This endpoint is
     * currently in Beta. Breaking changes may be introduced before the endpoint is made Generally
     * Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to
     * enable Spotter on your cluster.
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
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
     * Version: 10.13.0.cl or later This API allows users to initiate or continue an agent (Spotter)
     * conversation by submitting one or more natural language messages. To use this API, the user
     * must have access to the relevant conversational session (via conversation_identifier) and
     * submit at least one message. #### Usage guidelines To initiate or continue a conversation,
     * the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for
     * continuity and message tracking - &#x60;messages&#x60;: an array of one or more text
     * messages, each with a value and type Additionally, user can specify what tool can be included
     * &#x60;conversation_settings&#x60; parameter, which supports: -
     * &#x60;enable_contextual_change_analysis&#x60; (default: false) -
     * &#x60;enable_natural_language_answer_generation&#x60; (default: true) -
     * &#x60;enable_reasoning&#x60; (default: false) If the request is valid, the API returns a
     * stream of messages in real time, including: - &#x60;ack&#x60;: confirms receipt of the
     * request - &#x60;text / text-chunk&#x60;: content chunks, optionally formatted (e.g.,
     * markdown) - &#x60;answer&#x60;: the final structured response with metadata and analytics -
     * &#x60;error&#x60;: if a failure occurs - &#x60;notification&#x60;: notification messages for
     * operation being performed &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster. &gt; * The streaming protocol uses Server-Sent Events (SSE)
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public SendAgentMessageResponse sendAgentMessageStreaming(
            SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest) throws ApiException {
        ApiResponse<SendAgentMessageResponse> localVarResp =
                sendAgentMessageStreamingWithHttpInfo(sendAgentMessageStreamingRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.13.0.cl or later This API allows users to initiate or continue an agent (Spotter)
     * conversation by submitting one or more natural language messages. To use this API, the user
     * must have access to the relevant conversational session (via conversation_identifier) and
     * submit at least one message. #### Usage guidelines To initiate or continue a conversation,
     * the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for
     * continuity and message tracking - &#x60;messages&#x60;: an array of one or more text
     * messages, each with a value and type Additionally, user can specify what tool can be included
     * &#x60;conversation_settings&#x60; parameter, which supports: -
     * &#x60;enable_contextual_change_analysis&#x60; (default: false) -
     * &#x60;enable_natural_language_answer_generation&#x60; (default: true) -
     * &#x60;enable_reasoning&#x60; (default: false) If the request is valid, the API returns a
     * stream of messages in real time, including: - &#x60;ack&#x60;: confirms receipt of the
     * request - &#x60;text / text-chunk&#x60;: content chunks, optionally formatted (e.g.,
     * markdown) - &#x60;answer&#x60;: the final structured response with metadata and analytics -
     * &#x60;error&#x60;: if a failure occurs - &#x60;notification&#x60;: notification messages for
     * operation being performed &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster. &gt; * The streaming protocol uses Server-Sent Events (SSE)
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SendAgentMessageResponse> sendAgentMessageStreamingWithHttpInfo(
            SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest) throws ApiException {
        okhttp3.Call localVarCall =
                sendAgentMessageStreamingValidateBeforeCall(sendAgentMessageStreamingRequest, null);
        Type localVarReturnType = new TypeToken<SendAgentMessageResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.13.0.cl or later This API allows users to initiate or continue
     * an agent (Spotter) conversation by submitting one or more natural language messages. To use
     * this API, the user must have access to the relevant conversational session (via
     * conversation_identifier) and submit at least one message. #### Usage guidelines To initiate
     * or continue a conversation, the request must include: - &#x60;conversation_identifier&#x60;:
     * a unique session ID for continuity and message tracking - &#x60;messages&#x60;: an array of
     * one or more text messages, each with a value and type Additionally, user can specify what
     * tool can be included &#x60;conversation_settings&#x60; parameter, which supports: -
     * &#x60;enable_contextual_change_analysis&#x60; (default: false) -
     * &#x60;enable_natural_language_answer_generation&#x60; (default: true) -
     * &#x60;enable_reasoning&#x60; (default: false) If the request is valid, the API returns a
     * stream of messages in real time, including: - &#x60;ack&#x60;: confirms receipt of the
     * request - &#x60;text / text-chunk&#x60;: content chunks, optionally formatted (e.g.,
     * markdown) - &#x60;answer&#x60;: the final structured response with metadata and analytics -
     * &#x60;error&#x60;: if a failure occurs - &#x60;notification&#x60;: notification messages for
     * operation being performed &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster. &gt; * The streaming protocol uses Server-Sent Events (SSE)
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
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
     * Version: 10.4.0.cl or later Allows sending a follow-up message to an ongoing conversation
     * within the context of the metadata model. Requires at least view access to the metadata
     * object specified in the request. #### Usage guidelines The API requires you to specify the
     * &#x60;conversation_identifier&#x60; in the request path, and a
     * &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body. If the
     * API request is successful, ThoughtSpot returns the session ID, tokens used in the
     * conversation, and visualization type. &gt; ###### Note: &gt; * This endpoint is currently in
     * Beta. Breaking changes may be introduced before the endpoint is made Generally Available.
     * &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter
     * on your cluster.
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
     * Version: 10.4.0.cl or later Allows sending a follow-up message to an ongoing conversation
     * within the context of the metadata model. Requires at least view access to the metadata
     * object specified in the request. #### Usage guidelines The API requires you to specify the
     * &#x60;conversation_identifier&#x60; in the request path, and a
     * &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body. If the
     * API request is successful, ThoughtSpot returns the session ID, tokens used in the
     * conversation, and visualization type. &gt; ###### Note: &gt; * This endpoint is currently in
     * Beta. Breaking changes may be introduced before the endpoint is made Generally Available.
     * &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter
     * on your cluster.
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
     * (asynchronously) Version: 10.4.0.cl or later Allows sending a follow-up message to an ongoing
     * conversation within the context of the metadata model. Requires at least view access to the
     * metadata object specified in the request. #### Usage guidelines The API requires you to
     * specify the &#x60;conversation_identifier&#x60; in the request path, and a
     * &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body. If the
     * API request is successful, ThoughtSpot returns the session ID, tokens used in the
     * conversation, and visualization type. &gt; ###### Note: &gt; * This endpoint is currently in
     * Beta. Breaking changes may be introduced before the endpoint is made Generally Available.
     * &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter
     * on your cluster.
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
     * Version: 10.4.0.cl or later Processes a natural language query and returns an AI-generated
     * response based on a specified data model. Requires at least view access to the metadata
     * object specified in the request. &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster.
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
     * <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     * </table>
     */
    public ResponseMessage singleAnswer(SingleAnswerRequest singleAnswerRequest)
            throws ApiException {
        ApiResponse<ResponseMessage> localVarResp = singleAnswerWithHttpInfo(singleAnswerRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.4.0.cl or later Processes a natural language query and returns an AI-generated
     * response based on a specified data model. Requires at least view access to the metadata
     * object specified in the request. &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster.
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
     * (asynchronously) Version: 10.4.0.cl or later Processes a natural language query and returns
     * an AI-generated response based on a specified data model. Requires at least view access to
     * the metadata object specified in the request. &gt; ###### Note: &gt; * This endpoint is
     * currently in Beta. Breaking changes may be introduced before the endpoint is made Generally
     * Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to
     * enable Spotter on your cluster.
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
