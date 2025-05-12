/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.api;

import org.thoughtspot.client.ApiCallback;
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiClientConfiguration;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.ApiResponse;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.Pair;
import org.thoughtspot.client.ProgressRequestBody;
import org.thoughtspot.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.thoughtspot.client.model.Conversation;
import org.thoughtspot.client.model.CreateConversationRequest;
import org.thoughtspot.client.model.ErrorResponse;
import org.thoughtspot.client.model.EurekaDecomposeQueryResponse;
import org.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import org.thoughtspot.client.model.ResponseMessage;
import org.thoughtspot.client.model.SendMessageRequest;
import org.thoughtspot.client.model.SingleAnswerRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * Build call for createConversation
     * @param createConversationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConversationCall(CreateConversationRequest createConversationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
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

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createConversationValidateBeforeCall(CreateConversationRequest createConversationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createConversationRequest' is set
        if (createConversationRequest == null) {
            throw new ApiException("Missing the required parameter 'createConversationRequest' when calling createConversation(Async)");
        }

        return createConversationCall(createConversationRequest, _callback);

    }

    /**
     * 
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the &#x60;metadata_identifier&#x60; parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60;  If the API request is successful, ThoughtSpot returns the ID of the conversation.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest  (required)
     * @return Conversation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public Conversation createConversation(CreateConversationRequest createConversationRequest) throws ApiException {
        ApiResponse<Conversation> localVarResp = createConversationWithHttpInfo(createConversationRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the &#x60;metadata_identifier&#x60; parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60;  If the API request is successful, ThoughtSpot returns the ID of the conversation.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest  (required)
     * @return ApiResponse&lt;Conversation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Conversation> createConversationWithHttpInfo(CreateConversationRequest createConversationRequest) throws ApiException {
        okhttp3.Call localVarCall = createConversationValidateBeforeCall(createConversationRequest, null);
        Type localVarReturnType = new TypeToken<Conversation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the &#x60;metadata_identifier&#x60; parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60;  If the API request is successful, ThoughtSpot returns the ID of the conversation.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConversationAsync(CreateConversationRequest createConversationRequest, final ApiCallback<Conversation> _callback) throws ApiException {

        okhttp3.Call localVarCall = createConversationValidateBeforeCall(createConversationRequest, _callback);
        Type localVarReturnType = new TypeToken<Conversation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for queryGetDecomposedQuery
     * @param queryGetDecomposedQueryRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryGetDecomposedQueryCall(QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
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

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryGetDecomposedQueryValidateBeforeCall(QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'queryGetDecomposedQueryRequest' is set
        if (queryGetDecomposedQueryRequest == null) {
            throw new ApiException("Missing the required parameter 'queryGetDecomposedQueryRequest' when calling queryGetDecomposedQuery(Async)");
        }

        return queryGetDecomposedQueryCall(queryGetDecomposedQueryRequest, _callback);

    }

    /**
     * 
     * Version: 10.7.0.cl or later 
     * @param queryGetDecomposedQueryRequest  (required)
     * @return EurekaDecomposeQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public EurekaDecomposeQueryResponse queryGetDecomposedQuery(QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest) throws ApiException {
        ApiResponse<EurekaDecomposeQueryResponse> localVarResp = queryGetDecomposedQueryWithHttpInfo(queryGetDecomposedQueryRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Version: 10.7.0.cl or later 
     * @param queryGetDecomposedQueryRequest  (required)
     * @return ApiResponse&lt;EurekaDecomposeQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EurekaDecomposeQueryResponse> queryGetDecomposedQueryWithHttpInfo(QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest) throws ApiException {
        okhttp3.Call localVarCall = queryGetDecomposedQueryValidateBeforeCall(queryGetDecomposedQueryRequest, null);
        Type localVarReturnType = new TypeToken<EurekaDecomposeQueryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Version: 10.7.0.cl or later 
     * @param queryGetDecomposedQueryRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryGetDecomposedQueryAsync(QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest, final ApiCallback<EurekaDecomposeQueryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryGetDecomposedQueryValidateBeforeCall(queryGetDecomposedQueryRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaDecomposeQueryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendMessage
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendMessageCall(String conversationIdentifier, SendMessageRequest sendMessageRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = sendMessageRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/conversation/{conversation_identifier}/converse"
            .replace("{" + "conversation_identifier" + "}", localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendMessageValidateBeforeCall(String conversationIdentifier, SendMessageRequest sendMessageRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'conversationIdentifier' when calling sendMessage(Async)");
        }

        // verify the required parameter 'sendMessageRequest' is set
        if (sendMessageRequest == null) {
            throw new ApiException("Missing the required parameter 'sendMessageRequest' when calling sendMessage(Async)");
        }

        return sendMessageCall(conversationIdentifier, sendMessageRequest, _callback);

    }

    /**
     * 
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the &#x60;conversation_identifier&#x60; in the request path, and a &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest  (required)
     * @return List&lt;ResponseMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public List<ResponseMessage> sendMessage(String conversationIdentifier, SendMessageRequest sendMessageRequest) throws ApiException {
        ApiResponse<List<ResponseMessage>> localVarResp = sendMessageWithHttpInfo(conversationIdentifier, sendMessageRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the &#x60;conversation_identifier&#x60; in the request path, and a &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest  (required)
     * @return ApiResponse&lt;List&lt;ResponseMessage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ResponseMessage>> sendMessageWithHttpInfo(String conversationIdentifier, SendMessageRequest sendMessageRequest) throws ApiException {
        okhttp3.Call localVarCall = sendMessageValidateBeforeCall(conversationIdentifier, sendMessageRequest, null);
        Type localVarReturnType = new TypeToken<List<ResponseMessage>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the &#x60;conversation_identifier&#x60; in the request path, and a &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @param sendMessageRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendMessageAsync(String conversationIdentifier, SendMessageRequest sendMessageRequest, final ApiCallback<List<ResponseMessage>> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendMessageValidateBeforeCall(conversationIdentifier, sendMessageRequest, _callback);
        Type localVarReturnType = new TypeToken<List<ResponseMessage>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for singleAnswer
     * @param singleAnswerRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call singleAnswerCall(SingleAnswerRequest singleAnswerRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
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

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call singleAnswerValidateBeforeCall(SingleAnswerRequest singleAnswerRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'singleAnswerRequest' is set
        if (singleAnswerRequest == null) {
            throw new ApiException("Missing the required parameter 'singleAnswerRequest' when calling singleAnswer(Async)");
        }

        return singleAnswerCall(singleAnswerRequest, _callback);

    }

    /**
     * 
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest  (required)
     * @return ResponseMessage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ResponseMessage singleAnswer(SingleAnswerRequest singleAnswerRequest) throws ApiException {
        ApiResponse<ResponseMessage> localVarResp = singleAnswerWithHttpInfo(singleAnswerRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest  (required)
     * @return ApiResponse&lt;ResponseMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResponseMessage> singleAnswerWithHttpInfo(SingleAnswerRequest singleAnswerRequest) throws ApiException {
        okhttp3.Call localVarCall = singleAnswerValidateBeforeCall(singleAnswerRequest, null);
        Type localVarReturnType = new TypeToken<ResponseMessage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call singleAnswerAsync(SingleAnswerRequest singleAnswerRequest, final ApiCallback<ResponseMessage> _callback) throws ApiException {

        okhttp3.Call localVarCall = singleAnswerValidateBeforeCall(singleAnswerRequest, _callback);
        Type localVarReturnType = new TypeToken<ResponseMessage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
