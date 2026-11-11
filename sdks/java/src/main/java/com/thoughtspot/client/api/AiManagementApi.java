/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiCallback;
import com.thoughtspot.client.ApiClient;
import com.thoughtspot.client.ApiClientConfiguration;
import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.ApiResponse;
import com.thoughtspot.client.Configuration;
import com.thoughtspot.client.Pair;
import com.thoughtspot.client.ProgressRequestBody;
import com.thoughtspot.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.thoughtspot.client.model.AgentConversationHistoryResponse;
import com.thoughtspot.client.model.AgentInstructions;
import com.thoughtspot.client.model.ConversationMessageResponse;
import com.thoughtspot.client.model.ConversationShareStatusResponse;
import com.thoughtspot.client.model.DeleteUsageDataRequest;
import com.thoughtspot.client.model.DeleteUsageDataResponse;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.EurekaGetNLInstructionsResponse;
import com.thoughtspot.client.model.EurekaSetNLInstructionsResponse;
import com.thoughtspot.client.model.ExportMemoryRequest;
import com.thoughtspot.client.model.ExportMemoryResponse;
import com.thoughtspot.client.model.GetNLInstructionsRequest;
import com.thoughtspot.client.model.ImportMemoryRequest;
import com.thoughtspot.client.model.ImportMemoryResponse;
import com.thoughtspot.client.model.SearchUsageDataRequest;
import com.thoughtspot.client.model.SetAgentInstructionsRequest;
import com.thoughtspot.client.model.SetNLInstructionsRequest;
import com.thoughtspot.client.model.ShareConversationRequest;
import com.thoughtspot.client.model.SharedConversationResponse;
import com.thoughtspot.client.model.UpdateConversationRequest;
import com.thoughtspot.client.model.UpdateUsageDataRequest;
import com.thoughtspot.client.model.UsageDataForUserResponse;
import com.thoughtspot.client.model.UsageDataResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AiManagementApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AiManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AiManagementApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public AiManagementApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for deleteConversation
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @param spotterExperienceVersion Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConversationCall(String conversationIdentifier, String spotterExperienceVersion, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete"
            .replace("{" + "conversation_identifier" + "}", localVarApiClient.escapeString(conversationIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (spotterExperienceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("spotter_experience_version", spotterExperienceVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteConversationValidateBeforeCall(String conversationIdentifier, String spotterExperienceVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'conversationIdentifier' when calling deleteConversation(Async)");
        }

        return deleteConversationCall(conversationIdentifier, spotterExperienceVersion, _callback);

    }

    /**
     * 
     *  Deletes an existing agent conversation.    Version: 26.7.0.cl or later   Permanently deletes an existing saved agent conversation and all its associated messages. This operation is irreversible — deleted conversations cannot be recovered.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being deleted.  #### Spotter version  &#x60;spotter_experience_version&#x60; *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - &#x60;V2&#x60;: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a &#x60;400&#x60;. - &#x60;V1&#x60; (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: &#x60;V1&#x60;.** A request that omits the parameter runs on &#x60;V1&#x60; on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request must include:  - &#x60;spotter_experience_version&#x60; *(query parameter; required for &#x60;V2&#x60;)*: the version the conversation was created on. A request that omits it runs on &#x60;V1&#x60;, the default, so a &#x60;V2&#x60; conversation is found only when the parameter is passed. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a &#x60;400&#x60;. - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to delete, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;  A successful request returns an empty &#x60;204 No Content&#x60; response. The deleted conversation no longer appears in &#x60;getConversationList&#x60;.  #### Example request  &#x60;&#x60;&#x60;bash DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — &#x60;spotter_experience_version&#x60; is &#x60;V2&#x60; and the cluster&#39;s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, or the conversation identifier is malformed on &#x60;V2&#x60; (it must be letters, digits, &#x60;-&#x60; and &#x60;_&#x60;). | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. |  &gt; ###### Note: &gt; &gt; - Deletion is permanent and cannot be undone. Ensure the correct &#x60;conversation_identifier&#x60; is used before calling this endpoint. &gt; - On &#x60;V1&#x60;, only conversations created with &#x60;enable_save_chat: true&#x60; are persisted and can be deleted via this endpoint. On &#x60;V2&#x60;, any conversation can be deleted by its identifier, including one created without &#x60;enable_save_chat: true&#x60;. &gt; - &#x60;spotter_experience_version&#x60; and &#x60;V2&#x60; support are in Beta from 26.12.0.cl. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @param spotterExperienceVersion Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public void deleteConversation(String conversationIdentifier, String spotterExperienceVersion) throws ApiException {
        deleteConversationWithHttpInfo(conversationIdentifier, spotterExperienceVersion);
    }

    /**
     * 
     *  Deletes an existing agent conversation.    Version: 26.7.0.cl or later   Permanently deletes an existing saved agent conversation and all its associated messages. This operation is irreversible — deleted conversations cannot be recovered.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being deleted.  #### Spotter version  &#x60;spotter_experience_version&#x60; *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - &#x60;V2&#x60;: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a &#x60;400&#x60;. - &#x60;V1&#x60; (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: &#x60;V1&#x60;.** A request that omits the parameter runs on &#x60;V1&#x60; on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request must include:  - &#x60;spotter_experience_version&#x60; *(query parameter; required for &#x60;V2&#x60;)*: the version the conversation was created on. A request that omits it runs on &#x60;V1&#x60;, the default, so a &#x60;V2&#x60; conversation is found only when the parameter is passed. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a &#x60;400&#x60;. - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to delete, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;  A successful request returns an empty &#x60;204 No Content&#x60; response. The deleted conversation no longer appears in &#x60;getConversationList&#x60;.  #### Example request  &#x60;&#x60;&#x60;bash DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — &#x60;spotter_experience_version&#x60; is &#x60;V2&#x60; and the cluster&#39;s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, or the conversation identifier is malformed on &#x60;V2&#x60; (it must be letters, digits, &#x60;-&#x60; and &#x60;_&#x60;). | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. |  &gt; ###### Note: &gt; &gt; - Deletion is permanent and cannot be undone. Ensure the correct &#x60;conversation_identifier&#x60; is used before calling this endpoint. &gt; - On &#x60;V1&#x60;, only conversations created with &#x60;enable_save_chat: true&#x60; are persisted and can be deleted via this endpoint. On &#x60;V2&#x60;, any conversation can be deleted by its identifier, including one created without &#x60;enable_save_chat: true&#x60;. &gt; - &#x60;spotter_experience_version&#x60; and &#x60;V2&#x60; support are in Beta from 26.12.0.cl. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @param spotterExperienceVersion Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteConversationWithHttpInfo(String conversationIdentifier, String spotterExperienceVersion) throws ApiException {
        okhttp3.Call localVarCall = deleteConversationValidateBeforeCall(conversationIdentifier, spotterExperienceVersion, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Deletes an existing agent conversation.    Version: 26.7.0.cl or later   Permanently deletes an existing saved agent conversation and all its associated messages. This operation is irreversible — deleted conversations cannot be recovered.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being deleted.  #### Spotter version  &#x60;spotter_experience_version&#x60; *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - &#x60;V2&#x60;: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a &#x60;400&#x60;. - &#x60;V1&#x60; (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: &#x60;V1&#x60;.** A request that omits the parameter runs on &#x60;V1&#x60; on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request must include:  - &#x60;spotter_experience_version&#x60; *(query parameter; required for &#x60;V2&#x60;)*: the version the conversation was created on. A request that omits it runs on &#x60;V1&#x60;, the default, so a &#x60;V2&#x60; conversation is found only when the parameter is passed. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a &#x60;400&#x60;. - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to delete, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;  A successful request returns an empty &#x60;204 No Content&#x60; response. The deleted conversation no longer appears in &#x60;getConversationList&#x60;.  #### Example request  &#x60;&#x60;&#x60;bash DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — &#x60;spotter_experience_version&#x60; is &#x60;V2&#x60; and the cluster&#39;s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**, or the conversation identifier is malformed on &#x60;V2&#x60; (it must be letters, digits, &#x60;-&#x60; and &#x60;_&#x60;). | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. |  &gt; ###### Note: &gt; &gt; - Deletion is permanent and cannot be undone. Ensure the correct &#x60;conversation_identifier&#x60; is used before calling this endpoint. &gt; - On &#x60;V1&#x60;, only conversations created with &#x60;enable_save_chat: true&#x60; are persisted and can be deleted via this endpoint. On &#x60;V2&#x60;, any conversation can be deleted by its identifier, including one created without &#x60;enable_save_chat: true&#x60;. &gt; - &#x60;spotter_experience_version&#x60; and &#x60;V2&#x60; support are in Beta from 26.12.0.cl. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to delete. (required)
     * @param spotterExperienceVersion Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConversationAsync(String conversationIdentifier, String spotterExperienceVersion, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteConversationValidateBeforeCall(conversationIdentifier, spotterExperienceVersion, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUsageData
     * @param deleteUsageDataRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUsageDataCall(DeleteUsageDataRequest deleteUsageDataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = deleteUsageDataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/usage-data/delete";

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
    private okhttp3.Call deleteUsageDataValidateBeforeCall(DeleteUsageDataRequest deleteUsageDataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'deleteUsageDataRequest' is set
        if (deleteUsageDataRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteUsageDataRequest' when calling deleteUsageData(Async)");
        }

        return deleteUsageDataCall(deleteUsageDataRequest, _callback);

    }

    /**
     * 
     *  Deletes Spotter usage pools. Users who no longer draw from any pool are no longer metered: their Spotter usage is unlimited, not blocked. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Deletes Spotter usage pools. Use this API to remove a limit from a user, user group, or Org, or to clear every pool before switching the scope the cluster meters at.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  The request must include &#x60;keys&#x60;, with at least one entry. Each key has an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org).  Deleting a pool removes its limit rather than blocking its users. A user who no longer draws from any pool is not metered and can use Spotter without a limit.  If the request is successful, the response contains &#x60;deleted_keys&#x60;, the keys of the pools that existed and were deleted. Keys that matched no pool are omitted.  #### Error conditions  - &#x60;400&#x60; — &#x60;keys&#x60; is empty, or a key is missing its &#x60;entity_type&#x60; or &#x60;entity_identifier&#x60;. - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - This operation cannot be undone. Recreate a pool with &#x60;updateUsageData&#x60;; its usage restarts from &#x60;0&#x60;.      
     * @param deleteUsageDataRequest  (required)
     * @return DeleteUsageDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public DeleteUsageDataResponse deleteUsageData(DeleteUsageDataRequest deleteUsageDataRequest) throws ApiException {
        ApiResponse<DeleteUsageDataResponse> localVarResp = deleteUsageDataWithHttpInfo(deleteUsageDataRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Deletes Spotter usage pools. Users who no longer draw from any pool are no longer metered: their Spotter usage is unlimited, not blocked. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Deletes Spotter usage pools. Use this API to remove a limit from a user, user group, or Org, or to clear every pool before switching the scope the cluster meters at.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  The request must include &#x60;keys&#x60;, with at least one entry. Each key has an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org).  Deleting a pool removes its limit rather than blocking its users. A user who no longer draws from any pool is not metered and can use Spotter without a limit.  If the request is successful, the response contains &#x60;deleted_keys&#x60;, the keys of the pools that existed and were deleted. Keys that matched no pool are omitted.  #### Error conditions  - &#x60;400&#x60; — &#x60;keys&#x60; is empty, or a key is missing its &#x60;entity_type&#x60; or &#x60;entity_identifier&#x60;. - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - This operation cannot be undone. Recreate a pool with &#x60;updateUsageData&#x60;; its usage restarts from &#x60;0&#x60;.      
     * @param deleteUsageDataRequest  (required)
     * @return ApiResponse&lt;DeleteUsageDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteUsageDataResponse> deleteUsageDataWithHttpInfo(DeleteUsageDataRequest deleteUsageDataRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteUsageDataValidateBeforeCall(deleteUsageDataRequest, null);
        Type localVarReturnType = new TypeToken<DeleteUsageDataResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Deletes Spotter usage pools. Users who no longer draw from any pool are no longer metered: their Spotter usage is unlimited, not blocked. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Deletes Spotter usage pools. Use this API to remove a limit from a user, user group, or Org, or to clear every pool before switching the scope the cluster meters at.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  The request must include &#x60;keys&#x60;, with at least one entry. Each key has an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org).  Deleting a pool removes its limit rather than blocking its users. A user who no longer draws from any pool is not metered and can use Spotter without a limit.  If the request is successful, the response contains &#x60;deleted_keys&#x60;, the keys of the pools that existed and were deleted. Keys that matched no pool are omitted.  #### Error conditions  - &#x60;400&#x60; — &#x60;keys&#x60; is empty, or a key is missing its &#x60;entity_type&#x60; or &#x60;entity_identifier&#x60;. - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - This operation cannot be undone. Recreate a pool with &#x60;updateUsageData&#x60;; its usage restarts from &#x60;0&#x60;.      
     * @param deleteUsageDataRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUsageDataAsync(DeleteUsageDataRequest deleteUsageDataRequest, final ApiCallback<DeleteUsageDataResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUsageDataValidateBeforeCall(deleteUsageDataRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteUsageDataResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportMemory
     * @param exportMemoryRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportMemoryCall(ExportMemoryRequest exportMemoryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = exportMemoryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/memory/export";

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
    private okhttp3.Call exportMemoryValidateBeforeCall(ExportMemoryRequest exportMemoryRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'exportMemoryRequest' is set
        if (exportMemoryRequest == null) {
            throw new ApiException("Missing the required parameter 'exportMemoryRequest' when calling exportMemory(Async)");
        }

        return exportMemoryCall(exportMemoryRequest, _callback);

    }

    /**
     * 
     *  Exports memory entries (rules, recipes, and always-apply rules) for the specified data-models as a single YAML payload. The payload can be edited locally and re-submitted through &#x60;importMemory&#x60;. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to export data-model memories for a given list of data-models. This exported yaml file can then be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To export memory for one or more data-models, the request may include: - &#x60;sources&#x60;: A list of typed scope groups identifying which data-models to export memory for. Each group contains:   - &#x60;type&#x60;: The source object type for this group — &#x60;DATA_MODEL&#x60;.   - &#x60;identifiers&#x60;: An array of GUIDs or human-readable &#x60;obj_id&#x60;s of the data-models to export memory for. obj_ids are resolved server-side before forwarding.  The API returns a response object with: - &#x60;content&#x60;: The serialized memory payload (YAML) — exactly the shape that the &#x60;importMemory&#x60; API consumes. Edit it locally and pass it back through &#x60;importMemory&#x60; to apply changes.  #### Source Type  - **DATA_MODEL**: The &#x60;identifiers&#x60; are data-model GUIDs. This is the default source type for Spotter memory and covers the rules, recipes and always-apply rules attached directly to a data-model.  #### File format  The exported &#x60;content&#x60; is a YAML document with a single top-level &#x60;memories&#x60; key holding a list of memory items — exactly the format the &#x60;importMemory&#x60; API consumes. The full format reference (an annotated example, memory item fields, per-type content, and &#x60;datamodel_sources&#x60; identification) is documented in the &#x60;importMemory&#x60; API&#39;s **File format** section. Exported files populate each source&#39;s &#x60;guid&#x60; and, if present, &#x60;obj_id&#x60; as well.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                         | | 403  | Forbidden — the authenticated user does not have necessary permissions, or lacks read access on a referenced data-model, or the bearer token does not correspond to the data-model&#39;s org. |  &gt; ###### Note: &gt; - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param exportMemoryRequest  (required)
     * @return ExportMemoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ExportMemoryResponse exportMemory(ExportMemoryRequest exportMemoryRequest) throws ApiException {
        ApiResponse<ExportMemoryResponse> localVarResp = exportMemoryWithHttpInfo(exportMemoryRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Exports memory entries (rules, recipes, and always-apply rules) for the specified data-models as a single YAML payload. The payload can be edited locally and re-submitted through &#x60;importMemory&#x60;. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to export data-model memories for a given list of data-models. This exported yaml file can then be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To export memory for one or more data-models, the request may include: - &#x60;sources&#x60;: A list of typed scope groups identifying which data-models to export memory for. Each group contains:   - &#x60;type&#x60;: The source object type for this group — &#x60;DATA_MODEL&#x60;.   - &#x60;identifiers&#x60;: An array of GUIDs or human-readable &#x60;obj_id&#x60;s of the data-models to export memory for. obj_ids are resolved server-side before forwarding.  The API returns a response object with: - &#x60;content&#x60;: The serialized memory payload (YAML) — exactly the shape that the &#x60;importMemory&#x60; API consumes. Edit it locally and pass it back through &#x60;importMemory&#x60; to apply changes.  #### Source Type  - **DATA_MODEL**: The &#x60;identifiers&#x60; are data-model GUIDs. This is the default source type for Spotter memory and covers the rules, recipes and always-apply rules attached directly to a data-model.  #### File format  The exported &#x60;content&#x60; is a YAML document with a single top-level &#x60;memories&#x60; key holding a list of memory items — exactly the format the &#x60;importMemory&#x60; API consumes. The full format reference (an annotated example, memory item fields, per-type content, and &#x60;datamodel_sources&#x60; identification) is documented in the &#x60;importMemory&#x60; API&#39;s **File format** section. Exported files populate each source&#39;s &#x60;guid&#x60; and, if present, &#x60;obj_id&#x60; as well.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                         | | 403  | Forbidden — the authenticated user does not have necessary permissions, or lacks read access on a referenced data-model, or the bearer token does not correspond to the data-model&#39;s org. |  &gt; ###### Note: &gt; - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param exportMemoryRequest  (required)
     * @return ApiResponse&lt;ExportMemoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExportMemoryResponse> exportMemoryWithHttpInfo(ExportMemoryRequest exportMemoryRequest) throws ApiException {
        okhttp3.Call localVarCall = exportMemoryValidateBeforeCall(exportMemoryRequest, null);
        Type localVarReturnType = new TypeToken<ExportMemoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Exports memory entries (rules, recipes, and always-apply rules) for the specified data-models as a single YAML payload. The payload can be edited locally and re-submitted through &#x60;importMemory&#x60;. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to export data-model memories for a given list of data-models. This exported yaml file can then be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To export memory for one or more data-models, the request may include: - &#x60;sources&#x60;: A list of typed scope groups identifying which data-models to export memory for. Each group contains:   - &#x60;type&#x60;: The source object type for this group — &#x60;DATA_MODEL&#x60;.   - &#x60;identifiers&#x60;: An array of GUIDs or human-readable &#x60;obj_id&#x60;s of the data-models to export memory for. obj_ids are resolved server-side before forwarding.  The API returns a response object with: - &#x60;content&#x60;: The serialized memory payload (YAML) — exactly the shape that the &#x60;importMemory&#x60; API consumes. Edit it locally and pass it back through &#x60;importMemory&#x60; to apply changes.  #### Source Type  - **DATA_MODEL**: The &#x60;identifiers&#x60; are data-model GUIDs. This is the default source type for Spotter memory and covers the rules, recipes and always-apply rules attached directly to a data-model.  #### File format  The exported &#x60;content&#x60; is a YAML document with a single top-level &#x60;memories&#x60; key holding a list of memory items — exactly the format the &#x60;importMemory&#x60; API consumes. The full format reference (an annotated example, memory item fields, per-type content, and &#x60;datamodel_sources&#x60; identification) is documented in the &#x60;importMemory&#x60; API&#39;s **File format** section. Exported files populate each source&#39;s &#x60;guid&#x60; and, if present, &#x60;obj_id&#x60; as well.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                         | | 403  | Forbidden — the authenticated user does not have necessary permissions, or lacks read access on a referenced data-model, or the bearer token does not correspond to the data-model&#39;s org. |  &gt; ###### Note: &gt; - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param exportMemoryRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportMemoryAsync(ExportMemoryRequest exportMemoryRequest, final ApiCallback<ExportMemoryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportMemoryValidateBeforeCall(exportMemoryRequest, _callback);
        Type localVarReturnType = new TypeToken<ExportMemoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAgentInstructions
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAgentInstructionsCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/instructions/get";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAgentInstructionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAgentInstructionsCall(_callback);

    }

    /**
     * 
     *  Version: 26.6.0.cl or later   Retrieves the admin instructions currently configured for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations.  Requires admin privileges. Only users with org admin access can retrieve agent instructions.  #### Usage guidelines  No input parameters are required. The API returns the stored &#x60;AgentInstructions&#x60; record for the caller&#39;s tenant and org.  If no instructions have been configured yet, the API returns a record with an empty &#x60;instructions&#x60; field and &#x60;null&#x60; values for &#x60;id&#x60;, &#x60;created_at&#x60;, &#x60;updated_at&#x60;, and &#x60;last_updated_by&#x60;.  If the request is successful, the response includes:  - &#x60;id&#x60;: unique identifier of the instructions record - &#x60;instructions&#x60;: the configured instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first saved - &#x60;updated_at&#x60;: ISO timestamp when the instructions were last updated - &#x60;last_updated_by&#x60;: user ID of the admin who last updated the instructions (may be &#x60;null&#x60; for older records)  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to read agent instructions. |  &gt; ###### Note: &gt; &gt; - Use &#x60;setAgentInstructions&#x60; to create or update agent instructions. &gt; - Available from version 26.6.0.cl and later.      
     * @return AgentInstructions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public AgentInstructions getAgentInstructions() throws ApiException {
        ApiResponse<AgentInstructions> localVarResp = getAgentInstructionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.6.0.cl or later   Retrieves the admin instructions currently configured for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations.  Requires admin privileges. Only users with org admin access can retrieve agent instructions.  #### Usage guidelines  No input parameters are required. The API returns the stored &#x60;AgentInstructions&#x60; record for the caller&#39;s tenant and org.  If no instructions have been configured yet, the API returns a record with an empty &#x60;instructions&#x60; field and &#x60;null&#x60; values for &#x60;id&#x60;, &#x60;created_at&#x60;, &#x60;updated_at&#x60;, and &#x60;last_updated_by&#x60;.  If the request is successful, the response includes:  - &#x60;id&#x60;: unique identifier of the instructions record - &#x60;instructions&#x60;: the configured instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first saved - &#x60;updated_at&#x60;: ISO timestamp when the instructions were last updated - &#x60;last_updated_by&#x60;: user ID of the admin who last updated the instructions (may be &#x60;null&#x60; for older records)  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to read agent instructions. |  &gt; ###### Note: &gt; &gt; - Use &#x60;setAgentInstructions&#x60; to create or update agent instructions. &gt; - Available from version 26.6.0.cl and later.      
     * @return ApiResponse&lt;AgentInstructions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AgentInstructions> getAgentInstructionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAgentInstructionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AgentInstructions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.6.0.cl or later   Retrieves the admin instructions currently configured for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations.  Requires admin privileges. Only users with org admin access can retrieve agent instructions.  #### Usage guidelines  No input parameters are required. The API returns the stored &#x60;AgentInstructions&#x60; record for the caller&#39;s tenant and org.  If no instructions have been configured yet, the API returns a record with an empty &#x60;instructions&#x60; field and &#x60;null&#x60; values for &#x60;id&#x60;, &#x60;created_at&#x60;, &#x60;updated_at&#x60;, and &#x60;last_updated_by&#x60;.  If the request is successful, the response includes:  - &#x60;id&#x60;: unique identifier of the instructions record - &#x60;instructions&#x60;: the configured instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first saved - &#x60;updated_at&#x60;: ISO timestamp when the instructions were last updated - &#x60;last_updated_by&#x60;: user ID of the admin who last updated the instructions (may be &#x60;null&#x60; for older records)  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to read agent instructions. |  &gt; ###### Note: &gt; &gt; - Use &#x60;setAgentInstructions&#x60; to create or update agent instructions. &gt; - Available from version 26.6.0.cl and later.      
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAgentInstructionsAsync(final ApiCallback<AgentInstructions> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAgentInstructionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AgentInstructions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConversation
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getConversationCall(String conversationIdentifier, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConversationValidateBeforeCall(String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'conversationIdentifier' when calling getConversation(Async)");
        }

        return getConversationCall(conversationIdentifier, _callback);

    }

    /**
     * 
     *  Retrieves the full public-safe content of a saved agent conversation: ordered turns (user messages and agent response items) and sanitized code-execution file metadata. Internal graph or branch state, Azure file identifiers, and messages with a &#x60;SYSTEM&#x60; source are omitted. The full answer payload is not embedded; fetch it separately via &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.    Version: 26.7.0.cl or later   **Deprecated** — Use &#x60;sendAgentConversationMessage&#x60; or &#x60;sendAgentConversationMessageStreaming&#x60; and keep the turns they return; list conversations with &#x60;getConversationList&#x60;. This endpoint will be removed in a future release.  Retrieves the full public-safe content of a saved agent conversation. Returns ordered conversation messages — each carrying an optional user prompt (the user&#39;s message and any attachments) and the agent response items produced for that turn — plus sanitized metadata for any files generated by the code-execution tool.   Use this endpoint to render a persisted conversation in a UI, build an audit trail, or post-process a completed conversation. The full answer payload is not embedded — fetch it separately via &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; _(path parameter)_: the unique ID of the conversation, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;.  If the request is successful, the response contains two top-level fields:  | Field                  | Type                                        | Description                                                                                                                                          | | ---------------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | | &#x60;messages&#x60;             | &#x60;ConversationMessage[]&#x60;                     | Ordered oldest to newest. Empty array when the conversation has no messages.                                                                         | | &#x60;code_execution_files&#x60; | &#x60;CodeExecutionFileMetadata[]&#x60;               | List of sanitized file metadata entries (one per &#x60;file_id&#x60;). Covers all code-execution-generated files referenced anywhere in the conversation. Empty array when there are none. |  No other top-level fields are returned.  #### ConversationMessage fields  | Field                 | Type                         | Description                                                                                                    | | --------------------- | ---------------------------- | -------------------------------------------------------------------------------------------------------------- | | &#x60;message_id&#x60;          | &#x60;String&#x60;                     | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;                       | Milliseconds since Unix epoch for the turn.                                                                    | | &#x60;user_prompt&#x60;         | &#x60;UserPrompt&#x60;                 | User-authored prompt that started the turn (message and attachments). &#x60;null&#x60; for liveboard-started synthetic first turns. | | &#x60;response_items&#x60;      | &#x60;ConversationResponseItem[]&#x60; | Agent-side output produced in response to this turn. Empty array for in-progress turns.                        |  #### UserPrompt fields  | Field         | Type                   | Description                                                                                          | | ------------- | ---------------------- | ---------------------------------------------------------------------------------------------------- | | &#x60;message&#x60;     | &#x60;UserMessage&#x60;          | User query that started the turn. &#x60;null&#x60; for liveboard-started synthetic first turns.                | | &#x60;attachments&#x60; | &#x60;UserAttachmentItem[]&#x60; | Files or connector resources attached to the user message. Empty array when there are no attachments. |  #### UserMessage fields  | Field        | Type     | Description                                   | | ------------ | -------- | --------------------------------------------- | | &#x60;message_id&#x60; | &#x60;String&#x60; | Unique identifier of the user-source message. | | &#x60;content&#x60;    | &#x60;String&#x60; | Text body of the user query.                  |  #### UserAttachmentItem fields  Discriminated by &#x60;type&#x60;. Only &#x60;\&quot;file\&quot;&#x60; or &#x60;\&quot;resource\&quot;&#x60; are valid values. Only the fields for the indicated variant are populated. See &#x60;ConversationResponseItem&#x60; below for the field definitions of the &#x60;file&#x60; and &#x60;resource&#x60; variants — &#x60;UserAttachmentItem&#x60; uses the same fields.  #### ConversationResponseItem fields  Every item carries a &#x60;type&#x60; discriminator and these shared fields:  | Field                 | Type      | Description                                                                                                                    | | --------------------- | --------- | ------------------------------------------------------------------------------------------------------------------------------ | | &#x60;type&#x60;                | &#x60;String&#x60;  | Discriminator. One of &#x60;\&quot;text\&quot;&#x60;, &#x60;\&quot;tool_call\&quot;&#x60;, &#x60;\&quot;tool_result\&quot;&#x60;, &#x60;\&quot;answer\&quot;&#x60;, &#x60;\&quot;file\&quot;&#x60;, &#x60;\&quot;resource\&quot;&#x60;, &#x60;\&quot;search_datasets\&quot;&#x60;.       | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when this item was produced.                                                                     | | &#x60;is_thinking&#x60;         | &#x60;Boolean&#x60; | &#x60;true&#x60; when the item represents internal agent reasoning rather than user-facing output. Consumers may hide or collapse these. | | &#x60;step_title&#x60;          | &#x60;String&#x60;  | Human-readable label for the agent step producing this item (e.g. &#x60;\&quot;Searching\&quot;&#x60;, &#x60;\&quot;Visualising\&quot;&#x60;).                             |  Variant-specific fields:  - **&#x60;text&#x60;** — agent text output: &#x60;content&#x60; (String), &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;file_reference&#x60; (FileReference). - **&#x60;tool_call&#x60;** — agent invoked a tool: &#x60;tool_call_id&#x60; (String), &#x60;tool_name&#x60; (String), &#x60;arguments&#x60; (JSON object). - **&#x60;tool_result&#x60;** — result returned from a tool invocation: &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;, &#x60;content&#x60;, &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;success&#x60; (Boolean). - **&#x60;answer&#x60;** — slim reference to a saved answer: &#x60;answer_id&#x60; (String), &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;. - **&#x60;file&#x60;** — uploaded or generated files: &#x60;files&#x60; (&#x60;PublicFileInfo[]&#x60;). - **&#x60;resource&#x60;** — MCP connector resource: &#x60;title&#x60;, &#x60;uri&#x60;, &#x60;name&#x60;, &#x60;mime_type&#x60;, &#x60;description&#x60;, &#x60;size&#x60; (Int), &#x60;connector_id&#x60;, &#x60;connector_name&#x60;, &#x60;connector_slug&#x60;, &#x60;transport_type&#x60; (&#x60;TransportType&#x60; enum). - **&#x60;search_datasets&#x60;** — dataset discovery result: &#x60;text&#x60; (String), &#x60;data_sources&#x60; (&#x60;DataSourceInfo[]&#x60;).  Clients should switch on &#x60;type&#x60; and ignore unknown variants for forward-compatibility.  #### content_type values  &#x60;content_type&#x60; is the &#x60;ContentMimeType&#x60; enum. The following values are defined:  | Value                       | Wire MIME                   | Meaning                                              | | --------------------------- | --------------------------- | ---------------------------------------------------- | | &#x60;TEXT_PLAIN&#x60;                | &#x60;text/plain&#x60;                | Plain text. Default for &#x60;tool_result&#x60;.               | | &#x60;TEXT_MARKDOWN&#x60;             | &#x60;text/markdown&#x60;             | Markdown. Default for &#x60;text&#x60;.                        | | &#x60;TEXT_X_MARKDOWN_WITH_CODE&#x60; | &#x60;text/x-markdown-with-code&#x60; | Markdown whose body starts with a fenced code block. | | &#x60;TEXT_HTML&#x60;                 | &#x60;text/html&#x60;                 | Raw HTML.                                            |  #### transport_type values  &#x60;transport_type&#x60; is the &#x60;TransportType&#x60; enum used on the &#x60;resource&#x60; variant.  | Value              | Meaning                                       | | ------------------ | --------------------------------------------- | | &#x60;STREAMABLE_HTTP&#x60;  | Streamable HTTP transport (default for MCP).  | | &#x60;SSE&#x60;              | Server-sent events transport.                 |  #### FileReference fields  | Field                    | Type     | Description                                                  | | ------------------------ | -------- | ------------------------------------------------------------ | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the code-execution-generated file.      | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                    | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created.     |  Cross-reference &#x60;file_id&#x60; against &#x60;code_execution_files&#x60; to retrieve full metadata including the &#x60;expired&#x60; flag before attempting a download.  #### PublicFileInfo fields  | Field                    | Type     | Description                                              | | ------------------------ | -------- | -------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the file.                           | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                | | &#x60;file_type&#x60;              | &#x60;String&#x60; | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created. | | &#x60;size_bytes&#x60;             | &#x60;Int&#x60;    | File size in bytes.                                      |  #### CodeExecutionFileMetadata fields  Each entry in the &#x60;code_execution_files&#x60; array contains:  | Field                    | Type      | Description                                                                                                                     | | ------------------------ | --------- | ------------------------------------------------------------------------------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60;  | Unique identifier of the file.                                                                                                  | | &#x60;display_name&#x60;           | &#x60;String&#x60;  | Human-readable file name.                                                                                                       | | &#x60;file_type&#x60;              | &#x60;String&#x60;  | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                                                                                       | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when the file was created.                                                                        | | &#x60;expired&#x60;                | &#x60;Boolean&#x60; | When &#x60;true&#x60;, the underlying file is no longer retrievable from code-execution storage; UIs should disable download and preview. |  #### Loading answer payloads  Each &#x60;AnswerResponseItem&#x60; in the response contains an &#x60;answer_id&#x60; field. Pass this value as the &#x60;answer_identifier&#x60; parameter to &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) to retrieve the full answer payload (TML tokens, visualization metadata) for that item.  #### Example request  &#x60;&#x60;&#x60;bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages &#x60;&#x60;&#x60;  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;node_u_01\&quot;,       \&quot;timestamp_in_millis\&quot;: 1744000000000,       \&quot;user_prompt\&quot;: {         \&quot;message\&quot;: {           \&quot;message_id\&quot;: \&quot;msg_u_01\&quot;,           \&quot;content\&quot;: \&quot;Show me revenue by region as a chart.\&quot;         },         \&quot;attachments\&quot;: []       },       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;tool_call\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_01ABC\&quot;,           \&quot;tool_name\&quot;: \&quot;search_datasets\&quot;,           \&quot;step_title\&quot;: \&quot;Searching datasets\&quot;,           \&quot;arguments\&quot;: { \&quot;query\&quot;: \&quot;revenue\&quot; },           \&quot;timestamp_in_millis\&quot;: 1744000001000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;ans_01XYZ\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_02DEF\&quot;,           \&quot;tool_name\&quot;: \&quot;fetch_and_visualize\&quot;,           \&quot;step_title\&quot;: \&quot;Visualising\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000004000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;text\&quot;,           \&quot;content\&quot;: \&quot;Revenue is highest in APAC.\&quot;,           \&quot;content_type\&quot;: \&quot;TEXT_MARKDOWN\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000005000,           \&quot;is_thinking\&quot;: false,           \&quot;step_title\&quot;: null,           \&quot;file_reference\&quot;: {             \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;created_time_in_millis\&quot;: 1744027200000           }         }       ]     }   ],   \&quot;code_execution_files\&quot;: [     {       \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;file_type\&quot;: \&quot;csv\&quot;,       \&quot;created_time_in_millis\&quot;: 1744027200000,       \&quot;expired\&quot;: false     }   ] } &#x60;&#x60;&#x60;  #### Example: liveboard-started conversation  When a conversation is initiated from a saved liveboard visualization rather than a user query, the first turn is synthetic. &#x60;user_prompt&#x60; is &#x60;null&#x60;, and &#x60;response_items&#x60; contains a single &#x60;answer&#x60; item referencing the seed visualization.  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;ROOT_NODE\&quot;,       \&quot;timestamp_in_millis\&quot;: 1743999000000,       \&quot;user_prompt\&quot;: null,       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;lb_seed_01\&quot;,           \&quot;tool_call_id\&quot;: null,           \&quot;tool_name\&quot;: null,           \&quot;step_title\&quot;: null,           \&quot;timestamp_in_millis\&quot;: 1743999000000,           \&quot;is_thinking\&quot;: false         }       ]     }   ],   \&quot;code_execution_files\&quot;: [] } &#x60;&#x60;&#x60;  Subsequent turns follow the normal user-to-agent pattern.  #### Error responses  | Code | Description                                                                                                                 | | ---- | --------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                        | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation exists with the given identifier for the authenticated user.                                    |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. &gt; - Messages with an internal &#x60;SYSTEM&#x60; source are always dropped from the response. &gt; - In-progress turns are still returned with an empty &#x60;response_items&#x60; array so clients can render the user message immediately. &gt; - Do not assume every &#x60;tool_call&#x60; has a paired &#x60;tool_result&#x60; or &#x60;answer&#x60; — an interrupted conversation can leave a dangling call. &gt; - Available from version 26.7.0.cl and later. &gt; - Supports &#x60;V1&#x60; conversations only. Conversations created with &#x60;spotter_experience_version: V2&#x60; are not found. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
     * @return ConversationMessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ConversationMessageResponse getConversation(String conversationIdentifier) throws ApiException {
        ApiResponse<ConversationMessageResponse> localVarResp = getConversationWithHttpInfo(conversationIdentifier);
        return localVarResp.getData();
    }

    /**
     * 
     *  Retrieves the full public-safe content of a saved agent conversation: ordered turns (user messages and agent response items) and sanitized code-execution file metadata. Internal graph or branch state, Azure file identifiers, and messages with a &#x60;SYSTEM&#x60; source are omitted. The full answer payload is not embedded; fetch it separately via &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.    Version: 26.7.0.cl or later   **Deprecated** — Use &#x60;sendAgentConversationMessage&#x60; or &#x60;sendAgentConversationMessageStreaming&#x60; and keep the turns they return; list conversations with &#x60;getConversationList&#x60;. This endpoint will be removed in a future release.  Retrieves the full public-safe content of a saved agent conversation. Returns ordered conversation messages — each carrying an optional user prompt (the user&#39;s message and any attachments) and the agent response items produced for that turn — plus sanitized metadata for any files generated by the code-execution tool.   Use this endpoint to render a persisted conversation in a UI, build an audit trail, or post-process a completed conversation. The full answer payload is not embedded — fetch it separately via &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; _(path parameter)_: the unique ID of the conversation, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;.  If the request is successful, the response contains two top-level fields:  | Field                  | Type                                        | Description                                                                                                                                          | | ---------------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | | &#x60;messages&#x60;             | &#x60;ConversationMessage[]&#x60;                     | Ordered oldest to newest. Empty array when the conversation has no messages.                                                                         | | &#x60;code_execution_files&#x60; | &#x60;CodeExecutionFileMetadata[]&#x60;               | List of sanitized file metadata entries (one per &#x60;file_id&#x60;). Covers all code-execution-generated files referenced anywhere in the conversation. Empty array when there are none. |  No other top-level fields are returned.  #### ConversationMessage fields  | Field                 | Type                         | Description                                                                                                    | | --------------------- | ---------------------------- | -------------------------------------------------------------------------------------------------------------- | | &#x60;message_id&#x60;          | &#x60;String&#x60;                     | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;                       | Milliseconds since Unix epoch for the turn.                                                                    | | &#x60;user_prompt&#x60;         | &#x60;UserPrompt&#x60;                 | User-authored prompt that started the turn (message and attachments). &#x60;null&#x60; for liveboard-started synthetic first turns. | | &#x60;response_items&#x60;      | &#x60;ConversationResponseItem[]&#x60; | Agent-side output produced in response to this turn. Empty array for in-progress turns.                        |  #### UserPrompt fields  | Field         | Type                   | Description                                                                                          | | ------------- | ---------------------- | ---------------------------------------------------------------------------------------------------- | | &#x60;message&#x60;     | &#x60;UserMessage&#x60;          | User query that started the turn. &#x60;null&#x60; for liveboard-started synthetic first turns.                | | &#x60;attachments&#x60; | &#x60;UserAttachmentItem[]&#x60; | Files or connector resources attached to the user message. Empty array when there are no attachments. |  #### UserMessage fields  | Field        | Type     | Description                                   | | ------------ | -------- | --------------------------------------------- | | &#x60;message_id&#x60; | &#x60;String&#x60; | Unique identifier of the user-source message. | | &#x60;content&#x60;    | &#x60;String&#x60; | Text body of the user query.                  |  #### UserAttachmentItem fields  Discriminated by &#x60;type&#x60;. Only &#x60;\&quot;file\&quot;&#x60; or &#x60;\&quot;resource\&quot;&#x60; are valid values. Only the fields for the indicated variant are populated. See &#x60;ConversationResponseItem&#x60; below for the field definitions of the &#x60;file&#x60; and &#x60;resource&#x60; variants — &#x60;UserAttachmentItem&#x60; uses the same fields.  #### ConversationResponseItem fields  Every item carries a &#x60;type&#x60; discriminator and these shared fields:  | Field                 | Type      | Description                                                                                                                    | | --------------------- | --------- | ------------------------------------------------------------------------------------------------------------------------------ | | &#x60;type&#x60;                | &#x60;String&#x60;  | Discriminator. One of &#x60;\&quot;text\&quot;&#x60;, &#x60;\&quot;tool_call\&quot;&#x60;, &#x60;\&quot;tool_result\&quot;&#x60;, &#x60;\&quot;answer\&quot;&#x60;, &#x60;\&quot;file\&quot;&#x60;, &#x60;\&quot;resource\&quot;&#x60;, &#x60;\&quot;search_datasets\&quot;&#x60;.       | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when this item was produced.                                                                     | | &#x60;is_thinking&#x60;         | &#x60;Boolean&#x60; | &#x60;true&#x60; when the item represents internal agent reasoning rather than user-facing output. Consumers may hide or collapse these. | | &#x60;step_title&#x60;          | &#x60;String&#x60;  | Human-readable label for the agent step producing this item (e.g. &#x60;\&quot;Searching\&quot;&#x60;, &#x60;\&quot;Visualising\&quot;&#x60;).                             |  Variant-specific fields:  - **&#x60;text&#x60;** — agent text output: &#x60;content&#x60; (String), &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;file_reference&#x60; (FileReference). - **&#x60;tool_call&#x60;** — agent invoked a tool: &#x60;tool_call_id&#x60; (String), &#x60;tool_name&#x60; (String), &#x60;arguments&#x60; (JSON object). - **&#x60;tool_result&#x60;** — result returned from a tool invocation: &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;, &#x60;content&#x60;, &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;success&#x60; (Boolean). - **&#x60;answer&#x60;** — slim reference to a saved answer: &#x60;answer_id&#x60; (String), &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;. - **&#x60;file&#x60;** — uploaded or generated files: &#x60;files&#x60; (&#x60;PublicFileInfo[]&#x60;). - **&#x60;resource&#x60;** — MCP connector resource: &#x60;title&#x60;, &#x60;uri&#x60;, &#x60;name&#x60;, &#x60;mime_type&#x60;, &#x60;description&#x60;, &#x60;size&#x60; (Int), &#x60;connector_id&#x60;, &#x60;connector_name&#x60;, &#x60;connector_slug&#x60;, &#x60;transport_type&#x60; (&#x60;TransportType&#x60; enum). - **&#x60;search_datasets&#x60;** — dataset discovery result: &#x60;text&#x60; (String), &#x60;data_sources&#x60; (&#x60;DataSourceInfo[]&#x60;).  Clients should switch on &#x60;type&#x60; and ignore unknown variants for forward-compatibility.  #### content_type values  &#x60;content_type&#x60; is the &#x60;ContentMimeType&#x60; enum. The following values are defined:  | Value                       | Wire MIME                   | Meaning                                              | | --------------------------- | --------------------------- | ---------------------------------------------------- | | &#x60;TEXT_PLAIN&#x60;                | &#x60;text/plain&#x60;                | Plain text. Default for &#x60;tool_result&#x60;.               | | &#x60;TEXT_MARKDOWN&#x60;             | &#x60;text/markdown&#x60;             | Markdown. Default for &#x60;text&#x60;.                        | | &#x60;TEXT_X_MARKDOWN_WITH_CODE&#x60; | &#x60;text/x-markdown-with-code&#x60; | Markdown whose body starts with a fenced code block. | | &#x60;TEXT_HTML&#x60;                 | &#x60;text/html&#x60;                 | Raw HTML.                                            |  #### transport_type values  &#x60;transport_type&#x60; is the &#x60;TransportType&#x60; enum used on the &#x60;resource&#x60; variant.  | Value              | Meaning                                       | | ------------------ | --------------------------------------------- | | &#x60;STREAMABLE_HTTP&#x60;  | Streamable HTTP transport (default for MCP).  | | &#x60;SSE&#x60;              | Server-sent events transport.                 |  #### FileReference fields  | Field                    | Type     | Description                                                  | | ------------------------ | -------- | ------------------------------------------------------------ | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the code-execution-generated file.      | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                    | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created.     |  Cross-reference &#x60;file_id&#x60; against &#x60;code_execution_files&#x60; to retrieve full metadata including the &#x60;expired&#x60; flag before attempting a download.  #### PublicFileInfo fields  | Field                    | Type     | Description                                              | | ------------------------ | -------- | -------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the file.                           | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                | | &#x60;file_type&#x60;              | &#x60;String&#x60; | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created. | | &#x60;size_bytes&#x60;             | &#x60;Int&#x60;    | File size in bytes.                                      |  #### CodeExecutionFileMetadata fields  Each entry in the &#x60;code_execution_files&#x60; array contains:  | Field                    | Type      | Description                                                                                                                     | | ------------------------ | --------- | ------------------------------------------------------------------------------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60;  | Unique identifier of the file.                                                                                                  | | &#x60;display_name&#x60;           | &#x60;String&#x60;  | Human-readable file name.                                                                                                       | | &#x60;file_type&#x60;              | &#x60;String&#x60;  | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                                                                                       | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when the file was created.                                                                        | | &#x60;expired&#x60;                | &#x60;Boolean&#x60; | When &#x60;true&#x60;, the underlying file is no longer retrievable from code-execution storage; UIs should disable download and preview. |  #### Loading answer payloads  Each &#x60;AnswerResponseItem&#x60; in the response contains an &#x60;answer_id&#x60; field. Pass this value as the &#x60;answer_identifier&#x60; parameter to &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) to retrieve the full answer payload (TML tokens, visualization metadata) for that item.  #### Example request  &#x60;&#x60;&#x60;bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages &#x60;&#x60;&#x60;  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;node_u_01\&quot;,       \&quot;timestamp_in_millis\&quot;: 1744000000000,       \&quot;user_prompt\&quot;: {         \&quot;message\&quot;: {           \&quot;message_id\&quot;: \&quot;msg_u_01\&quot;,           \&quot;content\&quot;: \&quot;Show me revenue by region as a chart.\&quot;         },         \&quot;attachments\&quot;: []       },       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;tool_call\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_01ABC\&quot;,           \&quot;tool_name\&quot;: \&quot;search_datasets\&quot;,           \&quot;step_title\&quot;: \&quot;Searching datasets\&quot;,           \&quot;arguments\&quot;: { \&quot;query\&quot;: \&quot;revenue\&quot; },           \&quot;timestamp_in_millis\&quot;: 1744000001000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;ans_01XYZ\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_02DEF\&quot;,           \&quot;tool_name\&quot;: \&quot;fetch_and_visualize\&quot;,           \&quot;step_title\&quot;: \&quot;Visualising\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000004000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;text\&quot;,           \&quot;content\&quot;: \&quot;Revenue is highest in APAC.\&quot;,           \&quot;content_type\&quot;: \&quot;TEXT_MARKDOWN\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000005000,           \&quot;is_thinking\&quot;: false,           \&quot;step_title\&quot;: null,           \&quot;file_reference\&quot;: {             \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;created_time_in_millis\&quot;: 1744027200000           }         }       ]     }   ],   \&quot;code_execution_files\&quot;: [     {       \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;file_type\&quot;: \&quot;csv\&quot;,       \&quot;created_time_in_millis\&quot;: 1744027200000,       \&quot;expired\&quot;: false     }   ] } &#x60;&#x60;&#x60;  #### Example: liveboard-started conversation  When a conversation is initiated from a saved liveboard visualization rather than a user query, the first turn is synthetic. &#x60;user_prompt&#x60; is &#x60;null&#x60;, and &#x60;response_items&#x60; contains a single &#x60;answer&#x60; item referencing the seed visualization.  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;ROOT_NODE\&quot;,       \&quot;timestamp_in_millis\&quot;: 1743999000000,       \&quot;user_prompt\&quot;: null,       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;lb_seed_01\&quot;,           \&quot;tool_call_id\&quot;: null,           \&quot;tool_name\&quot;: null,           \&quot;step_title\&quot;: null,           \&quot;timestamp_in_millis\&quot;: 1743999000000,           \&quot;is_thinking\&quot;: false         }       ]     }   ],   \&quot;code_execution_files\&quot;: [] } &#x60;&#x60;&#x60;  Subsequent turns follow the normal user-to-agent pattern.  #### Error responses  | Code | Description                                                                                                                 | | ---- | --------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                        | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation exists with the given identifier for the authenticated user.                                    |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. &gt; - Messages with an internal &#x60;SYSTEM&#x60; source are always dropped from the response. &gt; - In-progress turns are still returned with an empty &#x60;response_items&#x60; array so clients can render the user message immediately. &gt; - Do not assume every &#x60;tool_call&#x60; has a paired &#x60;tool_result&#x60; or &#x60;answer&#x60; — an interrupted conversation can leave a dangling call. &gt; - Available from version 26.7.0.cl and later. &gt; - Supports &#x60;V1&#x60; conversations only. Conversations created with &#x60;spotter_experience_version: V2&#x60; are not found. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
     * @return ApiResponse&lt;ConversationMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<ConversationMessageResponse> getConversationWithHttpInfo(String conversationIdentifier) throws ApiException {
        okhttp3.Call localVarCall = getConversationValidateBeforeCall(conversationIdentifier, null);
        Type localVarReturnType = new TypeToken<ConversationMessageResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Retrieves the full public-safe content of a saved agent conversation: ordered turns (user messages and agent response items) and sanitized code-execution file metadata. Internal graph or branch state, Azure file identifiers, and messages with a &#x60;SYSTEM&#x60; source are omitted. The full answer payload is not embedded; fetch it separately via &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.    Version: 26.7.0.cl or later   **Deprecated** — Use &#x60;sendAgentConversationMessage&#x60; or &#x60;sendAgentConversationMessageStreaming&#x60; and keep the turns they return; list conversations with &#x60;getConversationList&#x60;. This endpoint will be removed in a future release.  Retrieves the full public-safe content of a saved agent conversation. Returns ordered conversation messages — each carrying an optional user prompt (the user&#39;s message and any attachments) and the agent response items produced for that turn — plus sanitized metadata for any files generated by the code-execution tool.   Use this endpoint to render a persisted conversation in a UI, build an audit trail, or post-process a completed conversation. The full answer payload is not embedded — fetch it separately via &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; _(path parameter)_: the unique ID of the conversation, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;.  If the request is successful, the response contains two top-level fields:  | Field                  | Type                                        | Description                                                                                                                                          | | ---------------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | | &#x60;messages&#x60;             | &#x60;ConversationMessage[]&#x60;                     | Ordered oldest to newest. Empty array when the conversation has no messages.                                                                         | | &#x60;code_execution_files&#x60; | &#x60;CodeExecutionFileMetadata[]&#x60;               | List of sanitized file metadata entries (one per &#x60;file_id&#x60;). Covers all code-execution-generated files referenced anywhere in the conversation. Empty array when there are none. |  No other top-level fields are returned.  #### ConversationMessage fields  | Field                 | Type                         | Description                                                                                                    | | --------------------- | ---------------------------- | -------------------------------------------------------------------------------------------------------------- | | &#x60;message_id&#x60;          | &#x60;String&#x60;                     | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;                       | Milliseconds since Unix epoch for the turn.                                                                    | | &#x60;user_prompt&#x60;         | &#x60;UserPrompt&#x60;                 | User-authored prompt that started the turn (message and attachments). &#x60;null&#x60; for liveboard-started synthetic first turns. | | &#x60;response_items&#x60;      | &#x60;ConversationResponseItem[]&#x60; | Agent-side output produced in response to this turn. Empty array for in-progress turns.                        |  #### UserPrompt fields  | Field         | Type                   | Description                                                                                          | | ------------- | ---------------------- | ---------------------------------------------------------------------------------------------------- | | &#x60;message&#x60;     | &#x60;UserMessage&#x60;          | User query that started the turn. &#x60;null&#x60; for liveboard-started synthetic first turns.                | | &#x60;attachments&#x60; | &#x60;UserAttachmentItem[]&#x60; | Files or connector resources attached to the user message. Empty array when there are no attachments. |  #### UserMessage fields  | Field        | Type     | Description                                   | | ------------ | -------- | --------------------------------------------- | | &#x60;message_id&#x60; | &#x60;String&#x60; | Unique identifier of the user-source message. | | &#x60;content&#x60;    | &#x60;String&#x60; | Text body of the user query.                  |  #### UserAttachmentItem fields  Discriminated by &#x60;type&#x60;. Only &#x60;\&quot;file\&quot;&#x60; or &#x60;\&quot;resource\&quot;&#x60; are valid values. Only the fields for the indicated variant are populated. See &#x60;ConversationResponseItem&#x60; below for the field definitions of the &#x60;file&#x60; and &#x60;resource&#x60; variants — &#x60;UserAttachmentItem&#x60; uses the same fields.  #### ConversationResponseItem fields  Every item carries a &#x60;type&#x60; discriminator and these shared fields:  | Field                 | Type      | Description                                                                                                                    | | --------------------- | --------- | ------------------------------------------------------------------------------------------------------------------------------ | | &#x60;type&#x60;                | &#x60;String&#x60;  | Discriminator. One of &#x60;\&quot;text\&quot;&#x60;, &#x60;\&quot;tool_call\&quot;&#x60;, &#x60;\&quot;tool_result\&quot;&#x60;, &#x60;\&quot;answer\&quot;&#x60;, &#x60;\&quot;file\&quot;&#x60;, &#x60;\&quot;resource\&quot;&#x60;, &#x60;\&quot;search_datasets\&quot;&#x60;.       | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when this item was produced.                                                                     | | &#x60;is_thinking&#x60;         | &#x60;Boolean&#x60; | &#x60;true&#x60; when the item represents internal agent reasoning rather than user-facing output. Consumers may hide or collapse these. | | &#x60;step_title&#x60;          | &#x60;String&#x60;  | Human-readable label for the agent step producing this item (e.g. &#x60;\&quot;Searching\&quot;&#x60;, &#x60;\&quot;Visualising\&quot;&#x60;).                             |  Variant-specific fields:  - **&#x60;text&#x60;** — agent text output: &#x60;content&#x60; (String), &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;file_reference&#x60; (FileReference). - **&#x60;tool_call&#x60;** — agent invoked a tool: &#x60;tool_call_id&#x60; (String), &#x60;tool_name&#x60; (String), &#x60;arguments&#x60; (JSON object). - **&#x60;tool_result&#x60;** — result returned from a tool invocation: &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;, &#x60;content&#x60;, &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;success&#x60; (Boolean). - **&#x60;answer&#x60;** — slim reference to a saved answer: &#x60;answer_id&#x60; (String), &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;. - **&#x60;file&#x60;** — uploaded or generated files: &#x60;files&#x60; (&#x60;PublicFileInfo[]&#x60;). - **&#x60;resource&#x60;** — MCP connector resource: &#x60;title&#x60;, &#x60;uri&#x60;, &#x60;name&#x60;, &#x60;mime_type&#x60;, &#x60;description&#x60;, &#x60;size&#x60; (Int), &#x60;connector_id&#x60;, &#x60;connector_name&#x60;, &#x60;connector_slug&#x60;, &#x60;transport_type&#x60; (&#x60;TransportType&#x60; enum). - **&#x60;search_datasets&#x60;** — dataset discovery result: &#x60;text&#x60; (String), &#x60;data_sources&#x60; (&#x60;DataSourceInfo[]&#x60;).  Clients should switch on &#x60;type&#x60; and ignore unknown variants for forward-compatibility.  #### content_type values  &#x60;content_type&#x60; is the &#x60;ContentMimeType&#x60; enum. The following values are defined:  | Value                       | Wire MIME                   | Meaning                                              | | --------------------------- | --------------------------- | ---------------------------------------------------- | | &#x60;TEXT_PLAIN&#x60;                | &#x60;text/plain&#x60;                | Plain text. Default for &#x60;tool_result&#x60;.               | | &#x60;TEXT_MARKDOWN&#x60;             | &#x60;text/markdown&#x60;             | Markdown. Default for &#x60;text&#x60;.                        | | &#x60;TEXT_X_MARKDOWN_WITH_CODE&#x60; | &#x60;text/x-markdown-with-code&#x60; | Markdown whose body starts with a fenced code block. | | &#x60;TEXT_HTML&#x60;                 | &#x60;text/html&#x60;                 | Raw HTML.                                            |  #### transport_type values  &#x60;transport_type&#x60; is the &#x60;TransportType&#x60; enum used on the &#x60;resource&#x60; variant.  | Value              | Meaning                                       | | ------------------ | --------------------------------------------- | | &#x60;STREAMABLE_HTTP&#x60;  | Streamable HTTP transport (default for MCP).  | | &#x60;SSE&#x60;              | Server-sent events transport.                 |  #### FileReference fields  | Field                    | Type     | Description                                                  | | ------------------------ | -------- | ------------------------------------------------------------ | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the code-execution-generated file.      | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                    | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created.     |  Cross-reference &#x60;file_id&#x60; against &#x60;code_execution_files&#x60; to retrieve full metadata including the &#x60;expired&#x60; flag before attempting a download.  #### PublicFileInfo fields  | Field                    | Type     | Description                                              | | ------------------------ | -------- | -------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the file.                           | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                | | &#x60;file_type&#x60;              | &#x60;String&#x60; | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created. | | &#x60;size_bytes&#x60;             | &#x60;Int&#x60;    | File size in bytes.                                      |  #### CodeExecutionFileMetadata fields  Each entry in the &#x60;code_execution_files&#x60; array contains:  | Field                    | Type      | Description                                                                                                                     | | ------------------------ | --------- | ------------------------------------------------------------------------------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60;  | Unique identifier of the file.                                                                                                  | | &#x60;display_name&#x60;           | &#x60;String&#x60;  | Human-readable file name.                                                                                                       | | &#x60;file_type&#x60;              | &#x60;String&#x60;  | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                                                                                       | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when the file was created.                                                                        | | &#x60;expired&#x60;                | &#x60;Boolean&#x60; | When &#x60;true&#x60;, the underlying file is no longer retrievable from code-execution storage; UIs should disable download and preview. |  #### Loading answer payloads  Each &#x60;AnswerResponseItem&#x60; in the response contains an &#x60;answer_id&#x60; field. Pass this value as the &#x60;answer_identifier&#x60; parameter to &#x60;loadAnswer&#x60; (also deprecated from 26.12.0.cl) to retrieve the full answer payload (TML tokens, visualization metadata) for that item.  #### Example request  &#x60;&#x60;&#x60;bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages &#x60;&#x60;&#x60;  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;node_u_01\&quot;,       \&quot;timestamp_in_millis\&quot;: 1744000000000,       \&quot;user_prompt\&quot;: {         \&quot;message\&quot;: {           \&quot;message_id\&quot;: \&quot;msg_u_01\&quot;,           \&quot;content\&quot;: \&quot;Show me revenue by region as a chart.\&quot;         },         \&quot;attachments\&quot;: []       },       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;tool_call\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_01ABC\&quot;,           \&quot;tool_name\&quot;: \&quot;search_datasets\&quot;,           \&quot;step_title\&quot;: \&quot;Searching datasets\&quot;,           \&quot;arguments\&quot;: { \&quot;query\&quot;: \&quot;revenue\&quot; },           \&quot;timestamp_in_millis\&quot;: 1744000001000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;ans_01XYZ\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_02DEF\&quot;,           \&quot;tool_name\&quot;: \&quot;fetch_and_visualize\&quot;,           \&quot;step_title\&quot;: \&quot;Visualising\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000004000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;text\&quot;,           \&quot;content\&quot;: \&quot;Revenue is highest in APAC.\&quot;,           \&quot;content_type\&quot;: \&quot;TEXT_MARKDOWN\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000005000,           \&quot;is_thinking\&quot;: false,           \&quot;step_title\&quot;: null,           \&quot;file_reference\&quot;: {             \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;created_time_in_millis\&quot;: 1744027200000           }         }       ]     }   ],   \&quot;code_execution_files\&quot;: [     {       \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;file_type\&quot;: \&quot;csv\&quot;,       \&quot;created_time_in_millis\&quot;: 1744027200000,       \&quot;expired\&quot;: false     }   ] } &#x60;&#x60;&#x60;  #### Example: liveboard-started conversation  When a conversation is initiated from a saved liveboard visualization rather than a user query, the first turn is synthetic. &#x60;user_prompt&#x60; is &#x60;null&#x60;, and &#x60;response_items&#x60; contains a single &#x60;answer&#x60; item referencing the seed visualization.  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;ROOT_NODE\&quot;,       \&quot;timestamp_in_millis\&quot;: 1743999000000,       \&quot;user_prompt\&quot;: null,       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;lb_seed_01\&quot;,           \&quot;tool_call_id\&quot;: null,           \&quot;tool_name\&quot;: null,           \&quot;step_title\&quot;: null,           \&quot;timestamp_in_millis\&quot;: 1743999000000,           \&quot;is_thinking\&quot;: false         }       ]     }   ],   \&quot;code_execution_files\&quot;: [] } &#x60;&#x60;&#x60;  Subsequent turns follow the normal user-to-agent pattern.  #### Error responses  | Code | Description                                                                                                                 | | ---- | --------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                        | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation exists with the given identifier for the authenticated user.                                    |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. &gt; - Messages with an internal &#x60;SYSTEM&#x60; source are always dropped from the response. &gt; - In-progress turns are still returned with an empty &#x60;response_items&#x60; array so clients can render the user message immediately. &gt; - Do not assume every &#x60;tool_call&#x60; has a paired &#x60;tool_result&#x60; or &#x60;answer&#x60; — an interrupted conversation can leave a dangling call. &gt; - Available from version 26.7.0.cl and later. &gt; - Supports &#x60;V1&#x60; conversations only. Conversations created with &#x60;spotter_experience_version: V2&#x60; are not found. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to load. (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getConversationAsync(String conversationIdentifier, final ApiCallback<ConversationMessageResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConversationValidateBeforeCall(conversationIdentifier, _callback);
        Type localVarReturnType = new TypeToken<ConversationMessageResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConversationList
     * @param limit Maximum number of conversations to return. Used for pagination. (optional, default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination. (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true. (optional, default to true)
     * @param spotterExperienceVersion Version of the Spotter experience whose conversations to list. Each version lists only the conversations created on it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConversationListCall(Integer limit, Integer offset, Boolean skipEmpty, String spotterExperienceVersion, final ApiCallback _callback) throws ApiException {
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

        if (spotterExperienceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("spotter_experience_version", spotterExperienceVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConversationListValidateBeforeCall(Integer limit, Integer offset, Boolean skipEmpty, String spotterExperienceVersion, final ApiCallback _callback) throws ApiException {
        return getConversationListCall(limit, offset, skipEmpty, spotterExperienceVersion, _callback);

    }

    /**
     * 
     *  Retrieves the list of saved agent conversations for the currently authenticated user. Only conversations created with &#x60;enable_save_chat: true&#x60; are returned.    Version: 26.7.0.cl or later   Retrieves a paginated list of saved agent conversations for the currently authenticated user. Only conversations that were created with &#x60;enable_save_chat: true&#x60; in &#x60;createAgentConversation&#x60; are returned.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege.  #### Spotter version  &#x60;spotter_experience_version&#x60; *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - &#x60;V2&#x60;: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a &#x60;400&#x60;. - &#x60;V1&#x60; (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  Each version lists only its own conversations.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: &#x60;V1&#x60;.** A request that omits the parameter runs on &#x60;V1&#x60; on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request includes:  - &#x60;spotter_experience_version&#x60; *(query parameter; required for &#x60;V2&#x60;)*: the version whose conversations to list. A request that omits it lists &#x60;V1&#x60; conversations, the default, so pass &#x60;V2&#x60; to list conversations created on that version. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a &#x60;400&#x60;.  and supports the following optional query parameters:  - &#x60;limit&#x60;: maximum number of conversations to return. Use this together with &#x60;offset&#x60; for pagination. - &#x60;offset&#x60;: number of conversations to skip before returning results. Defaults to &#x60;0&#x60;. - &#x60;skip_empty&#x60;: when &#x60;true&#x60; (default), conversations with no messages are excluded from the results. Set to &#x60;false&#x60; to include empty conversations. Applies to &#x60;V1&#x60; only; &#x60;V2&#x60; always excludes conversations with no messages.  If the request is successful, the response includes a &#x60;conversations&#x60; array. Each entry contains:  - &#x60;conversation_identifier&#x60;: the unique ID of the conversation, used as input to &#x60;sendAgentConversationMessage&#x60;, &#x60;updateConversation&#x60;, &#x60;deleteConversation&#x60;, &#x60;stopConversation&#x60;, and &#x60;loadAnswer&#x60; (deprecated from 26.12.0.cl) - &#x60;conversation_title&#x60;: the display name of the conversation - &#x60;created_at&#x60;: ISO 8601 timestamp of when the conversation was created - &#x60;updated_at&#x60;: ISO 8601 timestamp of the most recent update to the conversation - &#x60;data_source_identifiers&#x60;: list of unique IDs of the data sources associated with the conversation - &#x60;data_source_names&#x60;: array of &#x60;{ id, name }&#x60; objects for the data sources associated with the conversation - &#x60;is_pinned&#x60;: whether the current user has pinned this conversation. Pinned conversations are surfaced first in the list. Available from version 26.10.0.cl. - &#x60;analyst_id&#x60;: unique identifier of the Spotter Analyst the conversation is associated with, or &#x60;null&#x60; when the conversation is not associated with an analyst. Available from version 26.10.0.cl.  #### Pagination  Use &#x60;limit&#x60; and &#x60;offset&#x60; to page through large result sets:  &#x60;&#x60;&#x60; GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;0   → first page GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;20  → second page &#x60;&#x60;&#x60;  #### Pagination and &#x60;has_more&#x60;  The response includes a &#x60;has_more: Boolean&#x60; field. When &#x60;true&#x60;, there are additional conversations beyond the current page — increment &#x60;offset&#x60; by &#x60;limit&#x60; to fetch the next page. When &#x60;has_more&#x60; is &#x60;false&#x60;, the current page is the last. Note that &#x60;total_count&#x60; is not returned; use &#x60;has_more&#x60; to drive paging controls.  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;conversations\&quot;: [     {       \&quot;conversation_identifier\&quot;: \&quot;abc123\&quot;,       \&quot;conversation_title\&quot;: \&quot;Sales by Region Q1\&quot;,       \&quot;created_at\&quot;: \&quot;2026-03-01T10:00:00Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2026-03-05T14:23:00Z\&quot;,       \&quot;data_source_identifiers\&quot;: [\&quot;ds-001\&quot;],       \&quot;data_source_names\&quot;: [{ \&quot;id\&quot;: \&quot;ds-001\&quot;, \&quot;name\&quot;: \&quot;Retail Sales\&quot; }],       \&quot;is_pinned\&quot;: true     }   ],   \&quot;has_more\&quot;: false } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — &#x60;spotter_experience_version&#x60; is &#x60;V2&#x60; and the cluster&#39;s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege. |  &gt; ###### Note: &gt; &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; appear in this list. On &#x60;V1&#x60;, conversations created with &#x60;enable_save_chat: false&#x60; (the default) are not persisted and cannot be retrieved. On &#x60;V2&#x60;, they are kept out of this list but can still be continued and deleted by their identifier. &gt; - &#x60;spotter_experience_version&#x60; and &#x60;V2&#x60; support are in Beta from 26.12.0.cl. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param limit Maximum number of conversations to return. Used for pagination. (optional, default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination. (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true. (optional, default to true)
     * @param spotterExperienceVersion Version of the Spotter experience whose conversations to list. Each version lists only the conversations created on it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
     * @return AgentConversationHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public AgentConversationHistoryResponse getConversationList(Integer limit, Integer offset, Boolean skipEmpty, String spotterExperienceVersion) throws ApiException {
        ApiResponse<AgentConversationHistoryResponse> localVarResp = getConversationListWithHttpInfo(limit, offset, skipEmpty, spotterExperienceVersion);
        return localVarResp.getData();
    }

    /**
     * 
     *  Retrieves the list of saved agent conversations for the currently authenticated user. Only conversations created with &#x60;enable_save_chat: true&#x60; are returned.    Version: 26.7.0.cl or later   Retrieves a paginated list of saved agent conversations for the currently authenticated user. Only conversations that were created with &#x60;enable_save_chat: true&#x60; in &#x60;createAgentConversation&#x60; are returned.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege.  #### Spotter version  &#x60;spotter_experience_version&#x60; *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - &#x60;V2&#x60;: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a &#x60;400&#x60;. - &#x60;V1&#x60; (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  Each version lists only its own conversations.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: &#x60;V1&#x60;.** A request that omits the parameter runs on &#x60;V1&#x60; on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request includes:  - &#x60;spotter_experience_version&#x60; *(query parameter; required for &#x60;V2&#x60;)*: the version whose conversations to list. A request that omits it lists &#x60;V1&#x60; conversations, the default, so pass &#x60;V2&#x60; to list conversations created on that version. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a &#x60;400&#x60;.  and supports the following optional query parameters:  - &#x60;limit&#x60;: maximum number of conversations to return. Use this together with &#x60;offset&#x60; for pagination. - &#x60;offset&#x60;: number of conversations to skip before returning results. Defaults to &#x60;0&#x60;. - &#x60;skip_empty&#x60;: when &#x60;true&#x60; (default), conversations with no messages are excluded from the results. Set to &#x60;false&#x60; to include empty conversations. Applies to &#x60;V1&#x60; only; &#x60;V2&#x60; always excludes conversations with no messages.  If the request is successful, the response includes a &#x60;conversations&#x60; array. Each entry contains:  - &#x60;conversation_identifier&#x60;: the unique ID of the conversation, used as input to &#x60;sendAgentConversationMessage&#x60;, &#x60;updateConversation&#x60;, &#x60;deleteConversation&#x60;, &#x60;stopConversation&#x60;, and &#x60;loadAnswer&#x60; (deprecated from 26.12.0.cl) - &#x60;conversation_title&#x60;: the display name of the conversation - &#x60;created_at&#x60;: ISO 8601 timestamp of when the conversation was created - &#x60;updated_at&#x60;: ISO 8601 timestamp of the most recent update to the conversation - &#x60;data_source_identifiers&#x60;: list of unique IDs of the data sources associated with the conversation - &#x60;data_source_names&#x60;: array of &#x60;{ id, name }&#x60; objects for the data sources associated with the conversation - &#x60;is_pinned&#x60;: whether the current user has pinned this conversation. Pinned conversations are surfaced first in the list. Available from version 26.10.0.cl. - &#x60;analyst_id&#x60;: unique identifier of the Spotter Analyst the conversation is associated with, or &#x60;null&#x60; when the conversation is not associated with an analyst. Available from version 26.10.0.cl.  #### Pagination  Use &#x60;limit&#x60; and &#x60;offset&#x60; to page through large result sets:  &#x60;&#x60;&#x60; GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;0   → first page GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;20  → second page &#x60;&#x60;&#x60;  #### Pagination and &#x60;has_more&#x60;  The response includes a &#x60;has_more: Boolean&#x60; field. When &#x60;true&#x60;, there are additional conversations beyond the current page — increment &#x60;offset&#x60; by &#x60;limit&#x60; to fetch the next page. When &#x60;has_more&#x60; is &#x60;false&#x60;, the current page is the last. Note that &#x60;total_count&#x60; is not returned; use &#x60;has_more&#x60; to drive paging controls.  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;conversations\&quot;: [     {       \&quot;conversation_identifier\&quot;: \&quot;abc123\&quot;,       \&quot;conversation_title\&quot;: \&quot;Sales by Region Q1\&quot;,       \&quot;created_at\&quot;: \&quot;2026-03-01T10:00:00Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2026-03-05T14:23:00Z\&quot;,       \&quot;data_source_identifiers\&quot;: [\&quot;ds-001\&quot;],       \&quot;data_source_names\&quot;: [{ \&quot;id\&quot;: \&quot;ds-001\&quot;, \&quot;name\&quot;: \&quot;Retail Sales\&quot; }],       \&quot;is_pinned\&quot;: true     }   ],   \&quot;has_more\&quot;: false } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — &#x60;spotter_experience_version&#x60; is &#x60;V2&#x60; and the cluster&#39;s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege. |  &gt; ###### Note: &gt; &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; appear in this list. On &#x60;V1&#x60;, conversations created with &#x60;enable_save_chat: false&#x60; (the default) are not persisted and cannot be retrieved. On &#x60;V2&#x60;, they are kept out of this list but can still be continued and deleted by their identifier. &gt; - &#x60;spotter_experience_version&#x60; and &#x60;V2&#x60; support are in Beta from 26.12.0.cl. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param limit Maximum number of conversations to return. Used for pagination. (optional, default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination. (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true. (optional, default to true)
     * @param spotterExperienceVersion Version of the Spotter experience whose conversations to list. Each version lists only the conversations created on it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
     * @return ApiResponse&lt;AgentConversationHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AgentConversationHistoryResponse> getConversationListWithHttpInfo(Integer limit, Integer offset, Boolean skipEmpty, String spotterExperienceVersion) throws ApiException {
        okhttp3.Call localVarCall = getConversationListValidateBeforeCall(limit, offset, skipEmpty, spotterExperienceVersion, null);
        Type localVarReturnType = new TypeToken<AgentConversationHistoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Retrieves the list of saved agent conversations for the currently authenticated user. Only conversations created with &#x60;enable_save_chat: true&#x60; are returned.    Version: 26.7.0.cl or later   Retrieves a paginated list of saved agent conversations for the currently authenticated user. Only conversations that were created with &#x60;enable_save_chat: true&#x60; in &#x60;createAgentConversation&#x60; are returned.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege.  #### Spotter version  &#x60;spotter_experience_version&#x60; *(available from 26.12.0.cl)* is a query parameter that selects the version of Spotter a conversation runs on:  - &#x60;V2&#x60;: the new Spotter experience, the same one behind the **Liveboard side panel (New)**. New Spotter capabilities ship here. Requires a cluster admin to set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise returns a &#x60;400&#x60;. - &#x60;V1&#x60; (default): the Spotter conversation API available before 26.12.0.cl. Used when the parameter is omitted. Use it explicitly only if your cluster must stay on the previous experience.  Each version lists only its own conversations.  **Keep the version consistent per conversation.** A conversation belongs to the version that created it. Pass the same value on every later request for that conversation, including when you continue it, stream a response, or retrieve its history. A request with a different value returns not found.  **Default: &#x60;V1&#x60;.** A request that omits the parameter runs on &#x60;V1&#x60; on every cluster, including one whose **Spotter 3 Liveboard experience** setting is **Liveboard side panel (New)**.  #### Usage guidelines  The request includes:  - &#x60;spotter_experience_version&#x60; *(query parameter; required for &#x60;V2&#x60;)*: the version whose conversations to list. A request that omits it lists &#x60;V1&#x60; conversations, the default, so pass &#x60;V2&#x60; to list conversations created on that version. Available only when a cluster admin has set **Spotter 3 Liveboard experience** to **Liveboard side panel (New)**; otherwise the request returns a &#x60;400&#x60;.  and supports the following optional query parameters:  - &#x60;limit&#x60;: maximum number of conversations to return. Use this together with &#x60;offset&#x60; for pagination. - &#x60;offset&#x60;: number of conversations to skip before returning results. Defaults to &#x60;0&#x60;. - &#x60;skip_empty&#x60;: when &#x60;true&#x60; (default), conversations with no messages are excluded from the results. Set to &#x60;false&#x60; to include empty conversations. Applies to &#x60;V1&#x60; only; &#x60;V2&#x60; always excludes conversations with no messages.  If the request is successful, the response includes a &#x60;conversations&#x60; array. Each entry contains:  - &#x60;conversation_identifier&#x60;: the unique ID of the conversation, used as input to &#x60;sendAgentConversationMessage&#x60;, &#x60;updateConversation&#x60;, &#x60;deleteConversation&#x60;, &#x60;stopConversation&#x60;, and &#x60;loadAnswer&#x60; (deprecated from 26.12.0.cl) - &#x60;conversation_title&#x60;: the display name of the conversation - &#x60;created_at&#x60;: ISO 8601 timestamp of when the conversation was created - &#x60;updated_at&#x60;: ISO 8601 timestamp of the most recent update to the conversation - &#x60;data_source_identifiers&#x60;: list of unique IDs of the data sources associated with the conversation - &#x60;data_source_names&#x60;: array of &#x60;{ id, name }&#x60; objects for the data sources associated with the conversation - &#x60;is_pinned&#x60;: whether the current user has pinned this conversation. Pinned conversations are surfaced first in the list. Available from version 26.10.0.cl. - &#x60;analyst_id&#x60;: unique identifier of the Spotter Analyst the conversation is associated with, or &#x60;null&#x60; when the conversation is not associated with an analyst. Available from version 26.10.0.cl.  #### Pagination  Use &#x60;limit&#x60; and &#x60;offset&#x60; to page through large result sets:  &#x60;&#x60;&#x60; GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;0   → first page GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;20  → second page &#x60;&#x60;&#x60;  #### Pagination and &#x60;has_more&#x60;  The response includes a &#x60;has_more: Boolean&#x60; field. When &#x60;true&#x60;, there are additional conversations beyond the current page — increment &#x60;offset&#x60; by &#x60;limit&#x60; to fetch the next page. When &#x60;has_more&#x60; is &#x60;false&#x60;, the current page is the last. Note that &#x60;total_count&#x60; is not returned; use &#x60;has_more&#x60; to drive paging controls.  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;conversations\&quot;: [     {       \&quot;conversation_identifier\&quot;: \&quot;abc123\&quot;,       \&quot;conversation_title\&quot;: \&quot;Sales by Region Q1\&quot;,       \&quot;created_at\&quot;: \&quot;2026-03-01T10:00:00Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2026-03-05T14:23:00Z\&quot;,       \&quot;data_source_identifiers\&quot;: [\&quot;ds-001\&quot;],       \&quot;data_source_names\&quot;: [{ \&quot;id\&quot;: \&quot;ds-001\&quot;, \&quot;name\&quot;: \&quot;Retail Sales\&quot; }],       \&quot;is_pinned\&quot;: true     }   ],   \&quot;has_more\&quot;: false } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — &#x60;spotter_experience_version&#x60; is &#x60;V2&#x60; and the cluster&#39;s **Spotter 3 Liveboard experience** setting is not **Liveboard side panel (New)**. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege. |  &gt; ###### Note: &gt; &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; appear in this list. On &#x60;V1&#x60;, conversations created with &#x60;enable_save_chat: false&#x60; (the default) are not persisted and cannot be retrieved. On &#x60;V2&#x60;, they are kept out of this list but can still be continued and deleted by their identifier. &gt; - &#x60;spotter_experience_version&#x60; and &#x60;V2&#x60; support are in Beta from 26.12.0.cl. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param limit Maximum number of conversations to return. Used for pagination. (optional, default to 30)
     * @param offset Number of conversations to skip before returning results. Used for pagination. (optional, default to 0)
     * @param skipEmpty When true, excludes conversations with no messages. Defaults to true. (optional, default to true)
     * @param spotterExperienceVersion Version of the Spotter experience whose conversations to list. Each version lists only the conversations created on it. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  (optional, default to V1)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConversationListAsync(Integer limit, Integer offset, Boolean skipEmpty, String spotterExperienceVersion, final ApiCallback<AgentConversationHistoryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConversationListValidateBeforeCall(limit, offset, skipEmpty, spotterExperienceVersion, _callback);
        Type localVarReturnType = new TypeToken<AgentConversationHistoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNLInstructions
     * @param getNLInstructionsRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNLInstructionsCall(GetNLInstructionsRequest getNLInstructionsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = getNLInstructionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/instructions/get";

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
    private okhttp3.Call getNLInstructionsValidateBeforeCall(GetNLInstructionsRequest getNLInstructionsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'getNLInstructionsRequest' is set
        if (getNLInstructionsRequest == null) {
            throw new ApiException("Missing the required parameter 'getNLInstructionsRequest' when calling getNLInstructions(Async)");
        }

        return getNLInstructionsCall(getNLInstructionsRequest, _callback);

    }

    /**
     * 
     *  Version: 10.15.0.cl or later   Retrieves the data model instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - &#x60;data_source_identifier&#x60;: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - &#x60;nl_instructions_info&#x60;: an array of instruction objects, each containing:   - &#x60;instructions&#x60;: the configured text instructions for AI processing   - &#x60;scope&#x60;: the scope of the instruction — currently only &#x60;GLOBAL&#x60; is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Use this API to review currently configured instructions before modifying them with &#x60;setNLInstructions&#x60;.      
     * @param getNLInstructionsRequest  (required)
     * @return EurekaGetNLInstructionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public EurekaGetNLInstructionsResponse getNLInstructions(GetNLInstructionsRequest getNLInstructionsRequest) throws ApiException {
        ApiResponse<EurekaGetNLInstructionsResponse> localVarResp = getNLInstructionsWithHttpInfo(getNLInstructionsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 10.15.0.cl or later   Retrieves the data model instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - &#x60;data_source_identifier&#x60;: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - &#x60;nl_instructions_info&#x60;: an array of instruction objects, each containing:   - &#x60;instructions&#x60;: the configured text instructions for AI processing   - &#x60;scope&#x60;: the scope of the instruction — currently only &#x60;GLOBAL&#x60; is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Use this API to review currently configured instructions before modifying them with &#x60;setNLInstructions&#x60;.      
     * @param getNLInstructionsRequest  (required)
     * @return ApiResponse&lt;EurekaGetNLInstructionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EurekaGetNLInstructionsResponse> getNLInstructionsWithHttpInfo(GetNLInstructionsRequest getNLInstructionsRequest) throws ApiException {
        okhttp3.Call localVarCall = getNLInstructionsValidateBeforeCall(getNLInstructionsRequest, null);
        Type localVarReturnType = new TypeToken<EurekaGetNLInstructionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 10.15.0.cl or later   Retrieves the data model instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - &#x60;data_source_identifier&#x60;: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - &#x60;nl_instructions_info&#x60;: an array of instruction objects, each containing:   - &#x60;instructions&#x60;: the configured text instructions for AI processing   - &#x60;scope&#x60;: the scope of the instruction — currently only &#x60;GLOBAL&#x60; is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Use this API to review currently configured instructions before modifying them with &#x60;setNLInstructions&#x60;.      
     * @param getNLInstructionsRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNLInstructionsAsync(GetNLInstructionsRequest getNLInstructionsRequest, final ApiCallback<EurekaGetNLInstructionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNLInstructionsValidateBeforeCall(getNLInstructionsRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaGetNLInstructionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getShareInfo
     * @param conversationIdentifier Unique identifier of the conversation. (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getShareInfoCall(String conversationIdentifier, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-share-info"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getShareInfoValidateBeforeCall(String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'conversationIdentifier' when calling getShareInfo(Async)");
        }

        return getShareInfoCall(conversationIdentifier, _callback);

    }

    /**
     * 
     *  Returns the current share state for a conversation the caller owns: whether the shared view is outdated relative to the latest conversation content, and the list of principals that currently have access. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @return ConversationShareStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ConversationShareStatusResponse getShareInfo(String conversationIdentifier) throws ApiException {
        ApiResponse<ConversationShareStatusResponse> localVarResp = getShareInfoWithHttpInfo(conversationIdentifier);
        return localVarResp.getData();
    }

    /**
     * 
     *  Returns the current share state for a conversation the caller owns: whether the shared view is outdated relative to the latest conversation content, and the list of principals that currently have access. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the conversation. (required)
     * @return ApiResponse&lt;ConversationShareStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<ConversationShareStatusResponse> getShareInfoWithHttpInfo(String conversationIdentifier) throws ApiException {
        okhttp3.Call localVarCall = getShareInfoValidateBeforeCall(conversationIdentifier, null);
        Type localVarReturnType = new TypeToken<ConversationShareStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Returns the current share state for a conversation the caller owns: whether the shared view is outdated relative to the latest conversation content, and the list of principals that currently have access. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the conversation. (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getShareInfoAsync(String conversationIdentifier, final ApiCallback<ConversationShareStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getShareInfoValidateBeforeCall(conversationIdentifier, _callback);
        Type localVarReturnType = new TypeToken<ConversationShareStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSharedContent
     * @param conversationIdentifier Unique identifier of the source conversation. (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getSharedContentCall(String conversationIdentifier, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-shared-content"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSharedContentValidateBeforeCall(String conversationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'conversationIdentifier' when calling getSharedContent(Async)");
        }

        return getSharedContentCall(conversationIdentifier, _callback);

    }

    /**
     * 
     *  Returns the full read-only view of a shared conversation, including ordered messages and data source metadata. Accessible by the conversation owner and any principal (user or group) that has been granted access. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the source conversation. (required)
     * @return SharedConversationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public SharedConversationResponse getSharedContent(String conversationIdentifier) throws ApiException {
        ApiResponse<SharedConversationResponse> localVarResp = getSharedContentWithHttpInfo(conversationIdentifier);
        return localVarResp.getData();
    }

    /**
     * 
     *  Returns the full read-only view of a shared conversation, including ordered messages and data source metadata. Accessible by the conversation owner and any principal (user or group) that has been granted access. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the source conversation. (required)
     * @return ApiResponse&lt;SharedConversationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<SharedConversationResponse> getSharedContentWithHttpInfo(String conversationIdentifier) throws ApiException {
        okhttp3.Call localVarCall = getSharedContentValidateBeforeCall(conversationIdentifier, null);
        Type localVarReturnType = new TypeToken<SharedConversationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Returns the full read-only view of a shared conversation, including ordered messages and data source metadata. Accessible by the conversation owner and any principal (user or group) that has been granted access. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the source conversation. (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getSharedContentAsync(String conversationIdentifier, final ApiCallback<SharedConversationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSharedContentValidateBeforeCall(conversationIdentifier, _callback);
        Type localVarReturnType = new TypeToken<SharedConversationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUsageDataForUser
     * @param userIdentifier GUID of the user whose usage to retrieve. Defaults to the authenticated user. Passing another user&#39;s GUID requires &#x60;ADMINISTRATION&#x60; privilege. (optional)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUsageDataForUserCall(String userIdentifier, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/usage-data/user";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (userIdentifier != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_identifier", userIdentifier));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUsageDataForUserValidateBeforeCall(String userIdentifier, final ApiCallback _callback) throws ApiException {
        return getUsageDataForUserCall(userIdentifier, _callback);

    }

    /**
     * 
     *  Retrieves a user&#39;s combined Spotter usage position: every pool the user draws from, with usage, warning limits, and limits summed across them. Any user can retrieve their own usage. Retrieving another user&#39;s usage requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Retrieves a user&#39;s combined Spotter usage: every usage pool the user draws from, with usage, warning limits, and limits summed across them. Use this API to show users how many Spotter questions they have left, or to check whether a user is blocked by a usage limit.  Any user can retrieve their own usage. Retrieving another user&#39;s usage requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege; &#x60;CAN_MANAGE_SPOTTER&#x60; is not sufficient.  #### Usage guidelines  - Omit &#x60;user_identifier&#x60; to retrieve the usage of the authenticated user. - Pass &#x60;user_identifier&#x60; with a user GUID to retrieve that user&#39;s usage.  A user draws from every pool that meters them: their own pool, the pools of the user groups they belong to (including inherited groups), or their Org&#39;s pool, depending on the scope the cluster meters at. The totals in the response are sums over those pools. For example, a user in two groups with limits of 100 and 50 has a &#x60;total_limit&#x60; of 150.  If the request is successful, the response contains &#x60;summary&#x60;:  - &#x60;pools&#x60;: the individual pools the user draws from. - &#x60;total_usage&#x60;, &#x60;total_warning_limit&#x60;, and &#x60;total_limit&#x60;: sums across the pools. - &#x60;total_remaining&#x60;: questions the user can still ask. Absent when &#x60;has_unlimited_pool&#x60; is &#x60;true&#x60;. - &#x60;is_at_warning&#x60;: &#x60;true&#x60; when usage has reached the combined warning limit. - &#x60;is_at_limit&#x60;: &#x60;true&#x60; when usage has reached the combined limit and further Spotter questions are blocked. - &#x60;has_unlimited_pool&#x60;: &#x60;true&#x60; when any of the user&#39;s pools has no limit, which makes the user unlimited.  A user who draws from no pool is not metered: &#x60;pools&#x60; is empty and &#x60;is_at_limit&#x60; is &#x60;false&#x60;.  #### Error conditions  - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller requested another user&#39;s usage without &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available.      
     * @param userIdentifier GUID of the user whose usage to retrieve. Defaults to the authenticated user. Passing another user&#39;s GUID requires &#x60;ADMINISTRATION&#x60; privilege. (optional)
     * @return UsageDataForUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public UsageDataForUserResponse getUsageDataForUser(String userIdentifier) throws ApiException {
        ApiResponse<UsageDataForUserResponse> localVarResp = getUsageDataForUserWithHttpInfo(userIdentifier);
        return localVarResp.getData();
    }

    /**
     * 
     *  Retrieves a user&#39;s combined Spotter usage position: every pool the user draws from, with usage, warning limits, and limits summed across them. Any user can retrieve their own usage. Retrieving another user&#39;s usage requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Retrieves a user&#39;s combined Spotter usage: every usage pool the user draws from, with usage, warning limits, and limits summed across them. Use this API to show users how many Spotter questions they have left, or to check whether a user is blocked by a usage limit.  Any user can retrieve their own usage. Retrieving another user&#39;s usage requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege; &#x60;CAN_MANAGE_SPOTTER&#x60; is not sufficient.  #### Usage guidelines  - Omit &#x60;user_identifier&#x60; to retrieve the usage of the authenticated user. - Pass &#x60;user_identifier&#x60; with a user GUID to retrieve that user&#39;s usage.  A user draws from every pool that meters them: their own pool, the pools of the user groups they belong to (including inherited groups), or their Org&#39;s pool, depending on the scope the cluster meters at. The totals in the response are sums over those pools. For example, a user in two groups with limits of 100 and 50 has a &#x60;total_limit&#x60; of 150.  If the request is successful, the response contains &#x60;summary&#x60;:  - &#x60;pools&#x60;: the individual pools the user draws from. - &#x60;total_usage&#x60;, &#x60;total_warning_limit&#x60;, and &#x60;total_limit&#x60;: sums across the pools. - &#x60;total_remaining&#x60;: questions the user can still ask. Absent when &#x60;has_unlimited_pool&#x60; is &#x60;true&#x60;. - &#x60;is_at_warning&#x60;: &#x60;true&#x60; when usage has reached the combined warning limit. - &#x60;is_at_limit&#x60;: &#x60;true&#x60; when usage has reached the combined limit and further Spotter questions are blocked. - &#x60;has_unlimited_pool&#x60;: &#x60;true&#x60; when any of the user&#39;s pools has no limit, which makes the user unlimited.  A user who draws from no pool is not metered: &#x60;pools&#x60; is empty and &#x60;is_at_limit&#x60; is &#x60;false&#x60;.  #### Error conditions  - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller requested another user&#39;s usage without &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available.      
     * @param userIdentifier GUID of the user whose usage to retrieve. Defaults to the authenticated user. Passing another user&#39;s GUID requires &#x60;ADMINISTRATION&#x60; privilege. (optional)
     * @return ApiResponse&lt;UsageDataForUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UsageDataForUserResponse> getUsageDataForUserWithHttpInfo(String userIdentifier) throws ApiException {
        okhttp3.Call localVarCall = getUsageDataForUserValidateBeforeCall(userIdentifier, null);
        Type localVarReturnType = new TypeToken<UsageDataForUserResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Retrieves a user&#39;s combined Spotter usage position: every pool the user draws from, with usage, warning limits, and limits summed across them. Any user can retrieve their own usage. Retrieving another user&#39;s usage requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Retrieves a user&#39;s combined Spotter usage: every usage pool the user draws from, with usage, warning limits, and limits summed across them. Use this API to show users how many Spotter questions they have left, or to check whether a user is blocked by a usage limit.  Any user can retrieve their own usage. Retrieving another user&#39;s usage requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege; &#x60;CAN_MANAGE_SPOTTER&#x60; is not sufficient.  #### Usage guidelines  - Omit &#x60;user_identifier&#x60; to retrieve the usage of the authenticated user. - Pass &#x60;user_identifier&#x60; with a user GUID to retrieve that user&#39;s usage.  A user draws from every pool that meters them: their own pool, the pools of the user groups they belong to (including inherited groups), or their Org&#39;s pool, depending on the scope the cluster meters at. The totals in the response are sums over those pools. For example, a user in two groups with limits of 100 and 50 has a &#x60;total_limit&#x60; of 150.  If the request is successful, the response contains &#x60;summary&#x60;:  - &#x60;pools&#x60;: the individual pools the user draws from. - &#x60;total_usage&#x60;, &#x60;total_warning_limit&#x60;, and &#x60;total_limit&#x60;: sums across the pools. - &#x60;total_remaining&#x60;: questions the user can still ask. Absent when &#x60;has_unlimited_pool&#x60; is &#x60;true&#x60;. - &#x60;is_at_warning&#x60;: &#x60;true&#x60; when usage has reached the combined warning limit. - &#x60;is_at_limit&#x60;: &#x60;true&#x60; when usage has reached the combined limit and further Spotter questions are blocked. - &#x60;has_unlimited_pool&#x60;: &#x60;true&#x60; when any of the user&#39;s pools has no limit, which makes the user unlimited.  A user who draws from no pool is not metered: &#x60;pools&#x60; is empty and &#x60;is_at_limit&#x60; is &#x60;false&#x60;.  #### Error conditions  - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller requested another user&#39;s usage without &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available.      
     * @param userIdentifier GUID of the user whose usage to retrieve. Defaults to the authenticated user. Passing another user&#39;s GUID requires &#x60;ADMINISTRATION&#x60; privilege. (optional)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUsageDataForUserAsync(String userIdentifier, final ApiCallback<UsageDataForUserResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUsageDataForUserValidateBeforeCall(userIdentifier, _callback);
        Type localVarReturnType = new TypeToken<UsageDataForUserResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importMemory
     * @param importMemoryRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importMemoryCall(ImportMemoryRequest importMemoryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = importMemoryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/memory/import";

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
    private okhttp3.Call importMemoryValidateBeforeCall(ImportMemoryRequest importMemoryRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'importMemoryRequest' is set
        if (importMemoryRequest == null) {
            throw new ApiException("Missing the required parameter 'importMemoryRequest' when calling importMemory(Async)");
        }

        return importMemoryCall(importMemoryRequest, _callback);

    }

    /**
     * 
     *  Imports memory entries (rules, recipes, and always-apply rules) from a YAML payload, typically a payload produced by &#x60;exportMemory&#x60; and edited locally. The imported entries replace the existing memory for the data-models referenced in the payload. &#x60;dry_run&#x60; is required. Pass &#x60;true&#x60; first to validate the payload and review the preview counts and any row-level failures without making changes, then re-run with &#x60;dry_run &#x3D; false&#x60; to apply the import. An import is not applied if any row fails validation. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to import data-model memories using a given yaml file. This yaml file can be obtained from the export memory API in source env and can be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To import memory, the request must include: - &#x60;content&#x60;: The full serialized memory payload to import (YAML). Typically the &#x60;content&#x60; value returned by the &#x60;exportMemory&#x60; API, edited locally and re-submitted. The payload itself identifies which data-models the memory applies to, so no separate identifier list is required. - &#x60;dry_run&#x60;: Required. When &#x60;true&#x60;, validate the payload and return preview counts without writing anything; when &#x60;false&#x60;, apply the import. Always run with &#x60;dry_run &#x3D; true&#x60; first, then re-run with &#x60;dry_run &#x3D; false&#x60; once you are satisfied with the preview.  The import replaces the existing global memories on the data-models referenced in the payload with the entries supplied in the payload.  The API returns a response object with: - &#x60;status&#x60;: The terminal status of the import (&#x60;SUCCESS&#x60;, &#x60;VALIDATION_FAILED&#x60;, or &#x60;FAILED&#x60;). - &#x60;summary&#x60;: Per &#x60;(memory_type, source)&#x60; counts. In a dry run the &#x60;deleted_record_count&#x60;/&#x60;inserted_record_count&#x60; are previews; in a real import they are actuals. On &#x60;VALIDATION_FAILED&#x60;, &#x60;summary&#x60; is &#x60;null&#x60; when validation fails before any item is processed (e.g. an unresolved or inaccessible data-model source) and an empty list otherwise — treat both as \&quot;no counts available\&quot;. - &#x60;validation_failures&#x60;: Per-item validation failures, each with &#x60;line_number&#x60;, &#x60;reason&#x60;, &#x60;field_name&#x60;, and &#x60;message&#x60; for click-to-locate and inline highlighting. - &#x60;diagnostics&#x60;: Groups of diagnostic messages, each with a &#x60;sub_status&#x60; (&#x60;WARNING&#x60;, &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;, or &#x60;UNKNOWN&#x60;) and a &#x60;messages&#x60; list. This is the single channel for both non-fatal warnings (under &#x60;WARNING&#x60;, e.g. when some older memory entries could not be fully cleaned up) and fatal causes (e.g. the failure reason under &#x60;FAILURE&#x60;, or a &#x60;ROLLED_BACK&#x60; group when new entries were undone). - &#x60;operation_id&#x60;: A server-generated identifier for this import operation; include it when contacting support to help correlate server-side logs. Populated once the server registers the import operation; &#x60;null&#x60; when the request fails earlier (e.g. while parsing the payload or resolving its data-model sources).  #### File format  The payload is a YAML document with a single top-level &#x60;memories&#x60; key holding a list of memory items. Each item is self-contained: a &#x60;type&#x60;, a typed &#x60;content&#x60; block, a &#x60;datamodel_sources&#x60; list, and optional &#x60;tags&#x60;. Typically you don&#39;t hand-author this file — you obtain it from &#x60;exportMemory&#x60;, edit it, and submit it back through &#x60;importMemory&#x60;.  &#x60;&#x60;&#x60;yaml memories: - type: RULE   content:     rule_definition: \&quot;Always filter revenue to closed-won deals.\&quot;   datamodel_sources:   - guid: 11111111-1111-1111-1111-111111111111     obj_id: sales_data_model   tags:   - finance - type: RULE   content:     rule_definition: \&quot;Exclude internal test accounts from all results.\&quot;   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \&quot;top accounts by revenue\&quot;     recipe: |       {\&quot;steps\&quot;: [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \&quot;monthly new customer count\&quot;     recipe: |       {\&quot;steps\&quot;: [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: ALWAYS_APPLY_RULES   content:     rules:     - \&quot;Never show internal test accounts.\&quot;     - \&quot;Round currency to whole dollars.\&quot;   datamodel_sources:   - guid: 22222222-2222-2222-2222-222222222222 &#x60;&#x60;&#x60;  A file can contain multiple &#x60;RULE&#x60; and multiple &#x60;RECIPE&#x60; items for a data-model, but at most one &#x60;ALWAYS_APPLY_RULES&#x60; item per data-model.  ##### Memory item fields  | Field | Required | Type | Description | |-------|----------|------|-------------| | &#x60;type&#x60; | Yes | String enum | One of &#x60;RULE&#x60;, &#x60;RECIPE&#x60;, or &#x60;ALWAYS_APPLY_RULES&#x60;. | | &#x60;content&#x60; | Yes | Mapping | Type-specific content block (see below). | | &#x60;datamodel_sources&#x60; | Yes | Non-empty list | The data-model(s) the memory attaches to. | | &#x60;tags&#x60; | No | List of strings | Free-form labels. |  ##### Memory types and content  | &#x60;type&#x60; | Content fields | Notes | |--------|----------------|-------| | &#x60;RULE&#x60; | &#x60;rule_definition&#x60; — required, non-empty string | A single semantic rule. | | &#x60;RECIPE&#x60; | &#x60;recipe&#x60; and &#x60;user_query&#x60; — both required, non-empty strings | &#x60;recipe&#x60; is an opaque serialized blob; &#x60;user_query&#x60; is the natural-language query it answers. | | &#x60;ALWAYS_APPLY_RULES&#x60; | &#x60;rules&#x60; — required, non-empty list of non-empty strings | Data-model-wide always-apply rules. At most one &#x60;ALWAYS_APPLY_RULES&#x60; item per data-model. |  ##### Identifying data-models (&#x60;datamodel_sources&#x60;)  Each item must list at least one source. Each entry identifies a data-model by at least one of: - &#x60;guid&#x60; — the data-model GUID. - &#x60;obj_id&#x60; — a stable object ID, resolved to a GUID server-side.  If both are supplied, &#x60;obj_id&#x60; takes precedence and &#x60;guid&#x60; is ignored entirely; &#x60;guid&#x60; takes effect only when &#x60;obj_id&#x60; is absent. Exported files populate &#x60;guid&#x60; and, if present, &#x60;obj_id&#x60; as well.  &gt; ⚠️ **Cross-environment import:** When &#x60;obj_id&#x60; is present it is &gt; authoritative — the accompanying &#x60;guid&#x60; is **not** used as a fallback. &gt; If an &#x60;obj_id&#x60; does not exist in the target environment, that item &gt; fails with &#x60;UNRESOLVED_SOURCE&#x60;. Remove or correct stale &#x60;obj_id&#x60; &gt; values before importing across environments.  #### Validations reference  The payload is fully validated before anything is written. This applies to &#x60;dry_run &#x3D; true&#x60; and &#x60;dry_run &#x3D; false&#x60; alike: if any item fails validation, the entire import is rejected — no partial writes — and all failures are returned together so you can fix them in one pass.  ##### Limits  Default limits (may be adjusted in future if the need arises):  | Limit | Default | |-------|---------| | Uploaded file size | 10 MiB | | Total memory items | 10,000 | | &#x60;rule_definition&#x60; length | 1,000 characters | | &#x60;user_query&#x60; length | 1,000 characters | | &#x60;recipe&#x60; length | 2,000 characters | | &#x60;rules&#x60; combined length (&#x60;ALWAYS_APPLY_RULES&#x60;) | 2,000 characters | | Tags per item | 10 | | Characters per tag | 50 |  The &#x60;rules&#x60; limit in &#x60;ALWAYS_APPLY_RULES&#x60; is a combined budget across all entries in the list, not per entry.  ##### Structural rules  - The document must be a mapping with a &#x60;memories&#x60; key whose value is a list. - Unknown keys — at the top level, within an item, or under &#x60;content&#x60; — are rejected. - Each item&#39;s &#x60;type&#x60; must be one of the three supported values, and &#x60;content&#x60; must match that type&#39;s shape. - Null, empty-string, or wrong-typed values in a required field are treated as missing. - Non-string or empty &#x60;tags&#x60; entries are dropped silently; certain tags reserved for internal use are stripped automatically before the item is stored.  ##### Cross-item rules  - A data-model referenced by more than one &#x60;ALWAYS_APPLY_RULES&#x60; item is rejected — combine them into a single item&#39;s &#x60;rules&#x60; list.  ##### Failure reasons  Each entry in &#x60;validation_failures&#x60; carries one of:  | Reason | Meaning | |--------|---------| | &#x60;SCHEMA&#x60; | YAML structure is invalid or unsupported. | | &#x60;VALIDATION&#x60; | A required field is missing/empty, a count exceeds a limit, or a GUID is malformed. | | &#x60;CHAR_LIMIT&#x60; | A content field or tag exceeds its size limit. | | &#x60;UNRESOLVED_SOURCE&#x60; | A &#x60;guid&#x60; or &#x60;obj_id&#x60; could not be resolved to an existing data-model. | | &#x60;ACCESS_DENIED&#x60; | The caller lacks sufficient access on the referenced data-model. |  #### Dry run  &#x60;dry_run&#x60; is required and has no default, so the import is always a deliberate two-step flow:  1. **First, call with &#x60;dry_run &#x3D; true&#x60;.** This validates the payload and previews what would happen — the counts in &#x60;summary&#x60; and any &#x60;validation_failures&#x60; — without writing anything. 2. **Then, after reviewing a clean preview, call again with &#x60;dry_run &#x3D; false&#x60;** (same &#x60;content&#x60;). This applies the import. It refuses to write when any item fails validation, so fix the reported &#x60;validation_failures&#x60; and resubmit.  &gt; ###### Important: &gt; Never call &#x60;dry_run &#x3D; false&#x60; without first inspecting a &#x60;dry_run &#x3D; true&#x60; preview. A real import deletes and replaces existing global memories on the referenced data-models.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                        | | 403  | Forbidden — the authenticated user does not have the necessary Spotter permissions, or the bearer token does not correspond to the data-model&#39;s org. Per-data-model access failures do not use this code — they surface as &#x60;ACCESS_DENIED&#x60; validation failures with HTTP &#x60;200&#x60; (see Logical failures below). |  #### Logical failures  Validation and write failures are not returned in the error envelope. The call returns &#x60;200&#x60; with a terminal &#x60;status&#x60; of &#x60;VALIDATION_FAILED&#x60; or &#x60;FAILED&#x60;, and the details live in &#x60;validation_failures&#x60; / &#x60;diagnostics&#x60;:  - **VALIDATION_FAILED** — one or more items failed schema/semantic validation; nothing was written. Inspect &#x60;validation_failures&#x60;, fix the items, and resubmit. - **FAILED** — the import did not complete. Inspect &#x60;diagnostics&#x60;: a &#x60;ROLLED_BACK&#x60; group means writing the new entries failed and any entries written before the failure were undone (existing memory is intact, no destructive change), while a &#x60;FAILURE&#x60; group carries another non-validation cause.  Sample &#x60;VALIDATION_FAILED&#x60; responses (HTTP 200):  **Invalid data-model (unresolved source):**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: null,     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 2,             \&quot;reason\&quot;: \&quot;UNRESOLVED_SOURCE\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0].guid\&quot;,             \&quot;message\&quot;: \&quot;unknown datamodel guid: 55555555-5555-5555-5555-555555555555\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;unknown datamodel guid: 55555555-5555-5555-5555-555555555555\&quot;             ]         }     ],     \&quot;operation_id\&quot;: null } &#x60;&#x60;&#x60;  **Inaccessible data-models:**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: null,     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 2,             \&quot;reason\&quot;: \&quot;ACCESS_DENIED\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0]\&quot;,             \&quot;message\&quot;: \&quot;Insufficient permissions on datamodel &#39;44444444-4444-4444-4444-444444444444&#39;\&quot;         },         {             \&quot;line_number\&quot;: 8,             \&quot;reason\&quot;: \&quot;ACCESS_DENIED\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0]\&quot;,             \&quot;message\&quot;: \&quot;Insufficient permissions on datamodel &#39;33333333-3333-3333-3333-333333333333&#39;\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;Memory import validation failed with 2 error(s): Insufficient permissions on datamodel &#39;44444444-4444-4444-4444-444444444444&#39;; Insufficient permissions on datamodel &#39;33333333-3333-3333-3333-333333333333&#39;\&quot;             ]         }     ],     \&quot;operation_id\&quot;: null } &#x60;&#x60;&#x60;  **Character-limit validations:**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: [],     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 3,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.rule_definition\&quot;,             \&quot;message\&quot;: \&quot;content.rule_definition is 1073 characters; max allowed is 1000\&quot;         },         {             \&quot;line_number\&quot;: 49,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.user_query\&quot;,             \&quot;message\&quot;: \&quot;content.user_query is 1150 characters; max allowed is 1000\&quot;         },         {             \&quot;line_number\&quot;: 49,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.recipe\&quot;,             \&quot;message\&quot;: \&quot;content.recipe is 3574 characters; max allowed is 2000\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;Validation failures present; fix them and re-run to see the DRY_RUN preview.\&quot;             ]         }     ],     \&quot;operation_id\&quot;: \&quot;66666666-6666-6666-6666-666666666666\&quot; } &#x60;&#x60;&#x60;  &gt; ###### Note: &gt; - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param importMemoryRequest  (required)
     * @return ImportMemoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ImportMemoryResponse importMemory(ImportMemoryRequest importMemoryRequest) throws ApiException {
        ApiResponse<ImportMemoryResponse> localVarResp = importMemoryWithHttpInfo(importMemoryRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Imports memory entries (rules, recipes, and always-apply rules) from a YAML payload, typically a payload produced by &#x60;exportMemory&#x60; and edited locally. The imported entries replace the existing memory for the data-models referenced in the payload. &#x60;dry_run&#x60; is required. Pass &#x60;true&#x60; first to validate the payload and review the preview counts and any row-level failures without making changes, then re-run with &#x60;dry_run &#x3D; false&#x60; to apply the import. An import is not applied if any row fails validation. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to import data-model memories using a given yaml file. This yaml file can be obtained from the export memory API in source env and can be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To import memory, the request must include: - &#x60;content&#x60;: The full serialized memory payload to import (YAML). Typically the &#x60;content&#x60; value returned by the &#x60;exportMemory&#x60; API, edited locally and re-submitted. The payload itself identifies which data-models the memory applies to, so no separate identifier list is required. - &#x60;dry_run&#x60;: Required. When &#x60;true&#x60;, validate the payload and return preview counts without writing anything; when &#x60;false&#x60;, apply the import. Always run with &#x60;dry_run &#x3D; true&#x60; first, then re-run with &#x60;dry_run &#x3D; false&#x60; once you are satisfied with the preview.  The import replaces the existing global memories on the data-models referenced in the payload with the entries supplied in the payload.  The API returns a response object with: - &#x60;status&#x60;: The terminal status of the import (&#x60;SUCCESS&#x60;, &#x60;VALIDATION_FAILED&#x60;, or &#x60;FAILED&#x60;). - &#x60;summary&#x60;: Per &#x60;(memory_type, source)&#x60; counts. In a dry run the &#x60;deleted_record_count&#x60;/&#x60;inserted_record_count&#x60; are previews; in a real import they are actuals. On &#x60;VALIDATION_FAILED&#x60;, &#x60;summary&#x60; is &#x60;null&#x60; when validation fails before any item is processed (e.g. an unresolved or inaccessible data-model source) and an empty list otherwise — treat both as \&quot;no counts available\&quot;. - &#x60;validation_failures&#x60;: Per-item validation failures, each with &#x60;line_number&#x60;, &#x60;reason&#x60;, &#x60;field_name&#x60;, and &#x60;message&#x60; for click-to-locate and inline highlighting. - &#x60;diagnostics&#x60;: Groups of diagnostic messages, each with a &#x60;sub_status&#x60; (&#x60;WARNING&#x60;, &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;, or &#x60;UNKNOWN&#x60;) and a &#x60;messages&#x60; list. This is the single channel for both non-fatal warnings (under &#x60;WARNING&#x60;, e.g. when some older memory entries could not be fully cleaned up) and fatal causes (e.g. the failure reason under &#x60;FAILURE&#x60;, or a &#x60;ROLLED_BACK&#x60; group when new entries were undone). - &#x60;operation_id&#x60;: A server-generated identifier for this import operation; include it when contacting support to help correlate server-side logs. Populated once the server registers the import operation; &#x60;null&#x60; when the request fails earlier (e.g. while parsing the payload or resolving its data-model sources).  #### File format  The payload is a YAML document with a single top-level &#x60;memories&#x60; key holding a list of memory items. Each item is self-contained: a &#x60;type&#x60;, a typed &#x60;content&#x60; block, a &#x60;datamodel_sources&#x60; list, and optional &#x60;tags&#x60;. Typically you don&#39;t hand-author this file — you obtain it from &#x60;exportMemory&#x60;, edit it, and submit it back through &#x60;importMemory&#x60;.  &#x60;&#x60;&#x60;yaml memories: - type: RULE   content:     rule_definition: \&quot;Always filter revenue to closed-won deals.\&quot;   datamodel_sources:   - guid: 11111111-1111-1111-1111-111111111111     obj_id: sales_data_model   tags:   - finance - type: RULE   content:     rule_definition: \&quot;Exclude internal test accounts from all results.\&quot;   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \&quot;top accounts by revenue\&quot;     recipe: |       {\&quot;steps\&quot;: [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \&quot;monthly new customer count\&quot;     recipe: |       {\&quot;steps\&quot;: [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: ALWAYS_APPLY_RULES   content:     rules:     - \&quot;Never show internal test accounts.\&quot;     - \&quot;Round currency to whole dollars.\&quot;   datamodel_sources:   - guid: 22222222-2222-2222-2222-222222222222 &#x60;&#x60;&#x60;  A file can contain multiple &#x60;RULE&#x60; and multiple &#x60;RECIPE&#x60; items for a data-model, but at most one &#x60;ALWAYS_APPLY_RULES&#x60; item per data-model.  ##### Memory item fields  | Field | Required | Type | Description | |-------|----------|------|-------------| | &#x60;type&#x60; | Yes | String enum | One of &#x60;RULE&#x60;, &#x60;RECIPE&#x60;, or &#x60;ALWAYS_APPLY_RULES&#x60;. | | &#x60;content&#x60; | Yes | Mapping | Type-specific content block (see below). | | &#x60;datamodel_sources&#x60; | Yes | Non-empty list | The data-model(s) the memory attaches to. | | &#x60;tags&#x60; | No | List of strings | Free-form labels. |  ##### Memory types and content  | &#x60;type&#x60; | Content fields | Notes | |--------|----------------|-------| | &#x60;RULE&#x60; | &#x60;rule_definition&#x60; — required, non-empty string | A single semantic rule. | | &#x60;RECIPE&#x60; | &#x60;recipe&#x60; and &#x60;user_query&#x60; — both required, non-empty strings | &#x60;recipe&#x60; is an opaque serialized blob; &#x60;user_query&#x60; is the natural-language query it answers. | | &#x60;ALWAYS_APPLY_RULES&#x60; | &#x60;rules&#x60; — required, non-empty list of non-empty strings | Data-model-wide always-apply rules. At most one &#x60;ALWAYS_APPLY_RULES&#x60; item per data-model. |  ##### Identifying data-models (&#x60;datamodel_sources&#x60;)  Each item must list at least one source. Each entry identifies a data-model by at least one of: - &#x60;guid&#x60; — the data-model GUID. - &#x60;obj_id&#x60; — a stable object ID, resolved to a GUID server-side.  If both are supplied, &#x60;obj_id&#x60; takes precedence and &#x60;guid&#x60; is ignored entirely; &#x60;guid&#x60; takes effect only when &#x60;obj_id&#x60; is absent. Exported files populate &#x60;guid&#x60; and, if present, &#x60;obj_id&#x60; as well.  &gt; ⚠️ **Cross-environment import:** When &#x60;obj_id&#x60; is present it is &gt; authoritative — the accompanying &#x60;guid&#x60; is **not** used as a fallback. &gt; If an &#x60;obj_id&#x60; does not exist in the target environment, that item &gt; fails with &#x60;UNRESOLVED_SOURCE&#x60;. Remove or correct stale &#x60;obj_id&#x60; &gt; values before importing across environments.  #### Validations reference  The payload is fully validated before anything is written. This applies to &#x60;dry_run &#x3D; true&#x60; and &#x60;dry_run &#x3D; false&#x60; alike: if any item fails validation, the entire import is rejected — no partial writes — and all failures are returned together so you can fix them in one pass.  ##### Limits  Default limits (may be adjusted in future if the need arises):  | Limit | Default | |-------|---------| | Uploaded file size | 10 MiB | | Total memory items | 10,000 | | &#x60;rule_definition&#x60; length | 1,000 characters | | &#x60;user_query&#x60; length | 1,000 characters | | &#x60;recipe&#x60; length | 2,000 characters | | &#x60;rules&#x60; combined length (&#x60;ALWAYS_APPLY_RULES&#x60;) | 2,000 characters | | Tags per item | 10 | | Characters per tag | 50 |  The &#x60;rules&#x60; limit in &#x60;ALWAYS_APPLY_RULES&#x60; is a combined budget across all entries in the list, not per entry.  ##### Structural rules  - The document must be a mapping with a &#x60;memories&#x60; key whose value is a list. - Unknown keys — at the top level, within an item, or under &#x60;content&#x60; — are rejected. - Each item&#39;s &#x60;type&#x60; must be one of the three supported values, and &#x60;content&#x60; must match that type&#39;s shape. - Null, empty-string, or wrong-typed values in a required field are treated as missing. - Non-string or empty &#x60;tags&#x60; entries are dropped silently; certain tags reserved for internal use are stripped automatically before the item is stored.  ##### Cross-item rules  - A data-model referenced by more than one &#x60;ALWAYS_APPLY_RULES&#x60; item is rejected — combine them into a single item&#39;s &#x60;rules&#x60; list.  ##### Failure reasons  Each entry in &#x60;validation_failures&#x60; carries one of:  | Reason | Meaning | |--------|---------| | &#x60;SCHEMA&#x60; | YAML structure is invalid or unsupported. | | &#x60;VALIDATION&#x60; | A required field is missing/empty, a count exceeds a limit, or a GUID is malformed. | | &#x60;CHAR_LIMIT&#x60; | A content field or tag exceeds its size limit. | | &#x60;UNRESOLVED_SOURCE&#x60; | A &#x60;guid&#x60; or &#x60;obj_id&#x60; could not be resolved to an existing data-model. | | &#x60;ACCESS_DENIED&#x60; | The caller lacks sufficient access on the referenced data-model. |  #### Dry run  &#x60;dry_run&#x60; is required and has no default, so the import is always a deliberate two-step flow:  1. **First, call with &#x60;dry_run &#x3D; true&#x60;.** This validates the payload and previews what would happen — the counts in &#x60;summary&#x60; and any &#x60;validation_failures&#x60; — without writing anything. 2. **Then, after reviewing a clean preview, call again with &#x60;dry_run &#x3D; false&#x60;** (same &#x60;content&#x60;). This applies the import. It refuses to write when any item fails validation, so fix the reported &#x60;validation_failures&#x60; and resubmit.  &gt; ###### Important: &gt; Never call &#x60;dry_run &#x3D; false&#x60; without first inspecting a &#x60;dry_run &#x3D; true&#x60; preview. A real import deletes and replaces existing global memories on the referenced data-models.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                        | | 403  | Forbidden — the authenticated user does not have the necessary Spotter permissions, or the bearer token does not correspond to the data-model&#39;s org. Per-data-model access failures do not use this code — they surface as &#x60;ACCESS_DENIED&#x60; validation failures with HTTP &#x60;200&#x60; (see Logical failures below). |  #### Logical failures  Validation and write failures are not returned in the error envelope. The call returns &#x60;200&#x60; with a terminal &#x60;status&#x60; of &#x60;VALIDATION_FAILED&#x60; or &#x60;FAILED&#x60;, and the details live in &#x60;validation_failures&#x60; / &#x60;diagnostics&#x60;:  - **VALIDATION_FAILED** — one or more items failed schema/semantic validation; nothing was written. Inspect &#x60;validation_failures&#x60;, fix the items, and resubmit. - **FAILED** — the import did not complete. Inspect &#x60;diagnostics&#x60;: a &#x60;ROLLED_BACK&#x60; group means writing the new entries failed and any entries written before the failure were undone (existing memory is intact, no destructive change), while a &#x60;FAILURE&#x60; group carries another non-validation cause.  Sample &#x60;VALIDATION_FAILED&#x60; responses (HTTP 200):  **Invalid data-model (unresolved source):**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: null,     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 2,             \&quot;reason\&quot;: \&quot;UNRESOLVED_SOURCE\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0].guid\&quot;,             \&quot;message\&quot;: \&quot;unknown datamodel guid: 55555555-5555-5555-5555-555555555555\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;unknown datamodel guid: 55555555-5555-5555-5555-555555555555\&quot;             ]         }     ],     \&quot;operation_id\&quot;: null } &#x60;&#x60;&#x60;  **Inaccessible data-models:**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: null,     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 2,             \&quot;reason\&quot;: \&quot;ACCESS_DENIED\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0]\&quot;,             \&quot;message\&quot;: \&quot;Insufficient permissions on datamodel &#39;44444444-4444-4444-4444-444444444444&#39;\&quot;         },         {             \&quot;line_number\&quot;: 8,             \&quot;reason\&quot;: \&quot;ACCESS_DENIED\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0]\&quot;,             \&quot;message\&quot;: \&quot;Insufficient permissions on datamodel &#39;33333333-3333-3333-3333-333333333333&#39;\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;Memory import validation failed with 2 error(s): Insufficient permissions on datamodel &#39;44444444-4444-4444-4444-444444444444&#39;; Insufficient permissions on datamodel &#39;33333333-3333-3333-3333-333333333333&#39;\&quot;             ]         }     ],     \&quot;operation_id\&quot;: null } &#x60;&#x60;&#x60;  **Character-limit validations:**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: [],     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 3,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.rule_definition\&quot;,             \&quot;message\&quot;: \&quot;content.rule_definition is 1073 characters; max allowed is 1000\&quot;         },         {             \&quot;line_number\&quot;: 49,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.user_query\&quot;,             \&quot;message\&quot;: \&quot;content.user_query is 1150 characters; max allowed is 1000\&quot;         },         {             \&quot;line_number\&quot;: 49,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.recipe\&quot;,             \&quot;message\&quot;: \&quot;content.recipe is 3574 characters; max allowed is 2000\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;Validation failures present; fix them and re-run to see the DRY_RUN preview.\&quot;             ]         }     ],     \&quot;operation_id\&quot;: \&quot;66666666-6666-6666-6666-666666666666\&quot; } &#x60;&#x60;&#x60;  &gt; ###### Note: &gt; - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param importMemoryRequest  (required)
     * @return ApiResponse&lt;ImportMemoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImportMemoryResponse> importMemoryWithHttpInfo(ImportMemoryRequest importMemoryRequest) throws ApiException {
        okhttp3.Call localVarCall = importMemoryValidateBeforeCall(importMemoryRequest, null);
        Type localVarReturnType = new TypeToken<ImportMemoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Imports memory entries (rules, recipes, and always-apply rules) from a YAML payload, typically a payload produced by &#x60;exportMemory&#x60; and edited locally. The imported entries replace the existing memory for the data-models referenced in the payload. &#x60;dry_run&#x60; is required. Pass &#x60;true&#x60; first to validate the payload and review the preview counts and any row-level failures without making changes, then re-run with &#x60;dry_run &#x3D; false&#x60; to apply the import. An import is not applied if any row fails validation. Requires Spotter access (use/manage) and either edit or memory access on corresponding data model sources.   Version: 26.8.0.cl or later   This API allows users to import data-model memories using a given yaml file. This yaml file can be obtained from the export memory API in source env and can be modified and used as input to the import API in target env.  This API enables customers to migrate memories from a source env to a target env. This improves memory adoption for Spotter by giving the users a chance to develop their memories in one env and replicate the same in another env.  #### Usage guidelines  To import memory, the request must include: - &#x60;content&#x60;: The full serialized memory payload to import (YAML). Typically the &#x60;content&#x60; value returned by the &#x60;exportMemory&#x60; API, edited locally and re-submitted. The payload itself identifies which data-models the memory applies to, so no separate identifier list is required. - &#x60;dry_run&#x60;: Required. When &#x60;true&#x60;, validate the payload and return preview counts without writing anything; when &#x60;false&#x60;, apply the import. Always run with &#x60;dry_run &#x3D; true&#x60; first, then re-run with &#x60;dry_run &#x3D; false&#x60; once you are satisfied with the preview.  The import replaces the existing global memories on the data-models referenced in the payload with the entries supplied in the payload.  The API returns a response object with: - &#x60;status&#x60;: The terminal status of the import (&#x60;SUCCESS&#x60;, &#x60;VALIDATION_FAILED&#x60;, or &#x60;FAILED&#x60;). - &#x60;summary&#x60;: Per &#x60;(memory_type, source)&#x60; counts. In a dry run the &#x60;deleted_record_count&#x60;/&#x60;inserted_record_count&#x60; are previews; in a real import they are actuals. On &#x60;VALIDATION_FAILED&#x60;, &#x60;summary&#x60; is &#x60;null&#x60; when validation fails before any item is processed (e.g. an unresolved or inaccessible data-model source) and an empty list otherwise — treat both as \&quot;no counts available\&quot;. - &#x60;validation_failures&#x60;: Per-item validation failures, each with &#x60;line_number&#x60;, &#x60;reason&#x60;, &#x60;field_name&#x60;, and &#x60;message&#x60; for click-to-locate and inline highlighting. - &#x60;diagnostics&#x60;: Groups of diagnostic messages, each with a &#x60;sub_status&#x60; (&#x60;WARNING&#x60;, &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;, or &#x60;UNKNOWN&#x60;) and a &#x60;messages&#x60; list. This is the single channel for both non-fatal warnings (under &#x60;WARNING&#x60;, e.g. when some older memory entries could not be fully cleaned up) and fatal causes (e.g. the failure reason under &#x60;FAILURE&#x60;, or a &#x60;ROLLED_BACK&#x60; group when new entries were undone). - &#x60;operation_id&#x60;: A server-generated identifier for this import operation; include it when contacting support to help correlate server-side logs. Populated once the server registers the import operation; &#x60;null&#x60; when the request fails earlier (e.g. while parsing the payload or resolving its data-model sources).  #### File format  The payload is a YAML document with a single top-level &#x60;memories&#x60; key holding a list of memory items. Each item is self-contained: a &#x60;type&#x60;, a typed &#x60;content&#x60; block, a &#x60;datamodel_sources&#x60; list, and optional &#x60;tags&#x60;. Typically you don&#39;t hand-author this file — you obtain it from &#x60;exportMemory&#x60;, edit it, and submit it back through &#x60;importMemory&#x60;.  &#x60;&#x60;&#x60;yaml memories: - type: RULE   content:     rule_definition: \&quot;Always filter revenue to closed-won deals.\&quot;   datamodel_sources:   - guid: 11111111-1111-1111-1111-111111111111     obj_id: sales_data_model   tags:   - finance - type: RULE   content:     rule_definition: \&quot;Exclude internal test accounts from all results.\&quot;   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \&quot;top accounts by revenue\&quot;     recipe: |       {\&quot;steps\&quot;: [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: RECIPE   content:     user_query: \&quot;monthly new customer count\&quot;     recipe: |       {\&quot;steps\&quot;: [...serialized recipe blob...]}   datamodel_sources:   - obj_id: sales_data_model - type: ALWAYS_APPLY_RULES   content:     rules:     - \&quot;Never show internal test accounts.\&quot;     - \&quot;Round currency to whole dollars.\&quot;   datamodel_sources:   - guid: 22222222-2222-2222-2222-222222222222 &#x60;&#x60;&#x60;  A file can contain multiple &#x60;RULE&#x60; and multiple &#x60;RECIPE&#x60; items for a data-model, but at most one &#x60;ALWAYS_APPLY_RULES&#x60; item per data-model.  ##### Memory item fields  | Field | Required | Type | Description | |-------|----------|------|-------------| | &#x60;type&#x60; | Yes | String enum | One of &#x60;RULE&#x60;, &#x60;RECIPE&#x60;, or &#x60;ALWAYS_APPLY_RULES&#x60;. | | &#x60;content&#x60; | Yes | Mapping | Type-specific content block (see below). | | &#x60;datamodel_sources&#x60; | Yes | Non-empty list | The data-model(s) the memory attaches to. | | &#x60;tags&#x60; | No | List of strings | Free-form labels. |  ##### Memory types and content  | &#x60;type&#x60; | Content fields | Notes | |--------|----------------|-------| | &#x60;RULE&#x60; | &#x60;rule_definition&#x60; — required, non-empty string | A single semantic rule. | | &#x60;RECIPE&#x60; | &#x60;recipe&#x60; and &#x60;user_query&#x60; — both required, non-empty strings | &#x60;recipe&#x60; is an opaque serialized blob; &#x60;user_query&#x60; is the natural-language query it answers. | | &#x60;ALWAYS_APPLY_RULES&#x60; | &#x60;rules&#x60; — required, non-empty list of non-empty strings | Data-model-wide always-apply rules. At most one &#x60;ALWAYS_APPLY_RULES&#x60; item per data-model. |  ##### Identifying data-models (&#x60;datamodel_sources&#x60;)  Each item must list at least one source. Each entry identifies a data-model by at least one of: - &#x60;guid&#x60; — the data-model GUID. - &#x60;obj_id&#x60; — a stable object ID, resolved to a GUID server-side.  If both are supplied, &#x60;obj_id&#x60; takes precedence and &#x60;guid&#x60; is ignored entirely; &#x60;guid&#x60; takes effect only when &#x60;obj_id&#x60; is absent. Exported files populate &#x60;guid&#x60; and, if present, &#x60;obj_id&#x60; as well.  &gt; ⚠️ **Cross-environment import:** When &#x60;obj_id&#x60; is present it is &gt; authoritative — the accompanying &#x60;guid&#x60; is **not** used as a fallback. &gt; If an &#x60;obj_id&#x60; does not exist in the target environment, that item &gt; fails with &#x60;UNRESOLVED_SOURCE&#x60;. Remove or correct stale &#x60;obj_id&#x60; &gt; values before importing across environments.  #### Validations reference  The payload is fully validated before anything is written. This applies to &#x60;dry_run &#x3D; true&#x60; and &#x60;dry_run &#x3D; false&#x60; alike: if any item fails validation, the entire import is rejected — no partial writes — and all failures are returned together so you can fix them in one pass.  ##### Limits  Default limits (may be adjusted in future if the need arises):  | Limit | Default | |-------|---------| | Uploaded file size | 10 MiB | | Total memory items | 10,000 | | &#x60;rule_definition&#x60; length | 1,000 characters | | &#x60;user_query&#x60; length | 1,000 characters | | &#x60;recipe&#x60; length | 2,000 characters | | &#x60;rules&#x60; combined length (&#x60;ALWAYS_APPLY_RULES&#x60;) | 2,000 characters | | Tags per item | 10 | | Characters per tag | 50 |  The &#x60;rules&#x60; limit in &#x60;ALWAYS_APPLY_RULES&#x60; is a combined budget across all entries in the list, not per entry.  ##### Structural rules  - The document must be a mapping with a &#x60;memories&#x60; key whose value is a list. - Unknown keys — at the top level, within an item, or under &#x60;content&#x60; — are rejected. - Each item&#39;s &#x60;type&#x60; must be one of the three supported values, and &#x60;content&#x60; must match that type&#39;s shape. - Null, empty-string, or wrong-typed values in a required field are treated as missing. - Non-string or empty &#x60;tags&#x60; entries are dropped silently; certain tags reserved for internal use are stripped automatically before the item is stored.  ##### Cross-item rules  - A data-model referenced by more than one &#x60;ALWAYS_APPLY_RULES&#x60; item is rejected — combine them into a single item&#39;s &#x60;rules&#x60; list.  ##### Failure reasons  Each entry in &#x60;validation_failures&#x60; carries one of:  | Reason | Meaning | |--------|---------| | &#x60;SCHEMA&#x60; | YAML structure is invalid or unsupported. | | &#x60;VALIDATION&#x60; | A required field is missing/empty, a count exceeds a limit, or a GUID is malformed. | | &#x60;CHAR_LIMIT&#x60; | A content field or tag exceeds its size limit. | | &#x60;UNRESOLVED_SOURCE&#x60; | A &#x60;guid&#x60; or &#x60;obj_id&#x60; could not be resolved to an existing data-model. | | &#x60;ACCESS_DENIED&#x60; | The caller lacks sufficient access on the referenced data-model. |  #### Dry run  &#x60;dry_run&#x60; is required and has no default, so the import is always a deliberate two-step flow:  1. **First, call with &#x60;dry_run &#x3D; true&#x60;.** This validates the payload and previews what would happen — the counts in &#x60;summary&#x60; and any &#x60;validation_failures&#x60; — without writing anything. 2. **Then, after reviewing a clean preview, call again with &#x60;dry_run &#x3D; false&#x60;** (same &#x60;content&#x60;). This applies the import. It refuses to write when any item fails validation, so fix the reported &#x60;validation_failures&#x60; and resubmit.  &gt; ###### Important: &gt; Never call &#x60;dry_run &#x3D; false&#x60; without first inspecting a &#x60;dry_run &#x3D; true&#x60; preview. A real import deletes and replaces existing global memories on the referenced data-models.  #### Error responses  | Code | Description                                                                                                                                                                                  | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                        | | 403  | Forbidden — the authenticated user does not have the necessary Spotter permissions, or the bearer token does not correspond to the data-model&#39;s org. Per-data-model access failures do not use this code — they surface as &#x60;ACCESS_DENIED&#x60; validation failures with HTTP &#x60;200&#x60; (see Logical failures below). |  #### Logical failures  Validation and write failures are not returned in the error envelope. The call returns &#x60;200&#x60; with a terminal &#x60;status&#x60; of &#x60;VALIDATION_FAILED&#x60; or &#x60;FAILED&#x60;, and the details live in &#x60;validation_failures&#x60; / &#x60;diagnostics&#x60;:  - **VALIDATION_FAILED** — one or more items failed schema/semantic validation; nothing was written. Inspect &#x60;validation_failures&#x60;, fix the items, and resubmit. - **FAILED** — the import did not complete. Inspect &#x60;diagnostics&#x60;: a &#x60;ROLLED_BACK&#x60; group means writing the new entries failed and any entries written before the failure were undone (existing memory is intact, no destructive change), while a &#x60;FAILURE&#x60; group carries another non-validation cause.  Sample &#x60;VALIDATION_FAILED&#x60; responses (HTTP 200):  **Invalid data-model (unresolved source):**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: null,     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 2,             \&quot;reason\&quot;: \&quot;UNRESOLVED_SOURCE\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0].guid\&quot;,             \&quot;message\&quot;: \&quot;unknown datamodel guid: 55555555-5555-5555-5555-555555555555\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;unknown datamodel guid: 55555555-5555-5555-5555-555555555555\&quot;             ]         }     ],     \&quot;operation_id\&quot;: null } &#x60;&#x60;&#x60;  **Inaccessible data-models:**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: null,     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 2,             \&quot;reason\&quot;: \&quot;ACCESS_DENIED\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0]\&quot;,             \&quot;message\&quot;: \&quot;Insufficient permissions on datamodel &#39;44444444-4444-4444-4444-444444444444&#39;\&quot;         },         {             \&quot;line_number\&quot;: 8,             \&quot;reason\&quot;: \&quot;ACCESS_DENIED\&quot;,             \&quot;field_name\&quot;: \&quot;datamodel_sources[0]\&quot;,             \&quot;message\&quot;: \&quot;Insufficient permissions on datamodel &#39;33333333-3333-3333-3333-333333333333&#39;\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;Memory import validation failed with 2 error(s): Insufficient permissions on datamodel &#39;44444444-4444-4444-4444-444444444444&#39;; Insufficient permissions on datamodel &#39;33333333-3333-3333-3333-333333333333&#39;\&quot;             ]         }     ],     \&quot;operation_id\&quot;: null } &#x60;&#x60;&#x60;  **Character-limit validations:**  &#x60;&#x60;&#x60;json {     \&quot;status\&quot;: \&quot;VALIDATION_FAILED\&quot;,     \&quot;summary\&quot;: [],     \&quot;validation_failures\&quot;: [         {             \&quot;line_number\&quot;: 3,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.rule_definition\&quot;,             \&quot;message\&quot;: \&quot;content.rule_definition is 1073 characters; max allowed is 1000\&quot;         },         {             \&quot;line_number\&quot;: 49,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.user_query\&quot;,             \&quot;message\&quot;: \&quot;content.user_query is 1150 characters; max allowed is 1000\&quot;         },         {             \&quot;line_number\&quot;: 49,             \&quot;reason\&quot;: \&quot;CHAR_LIMIT\&quot;,             \&quot;field_name\&quot;: \&quot;content.recipe\&quot;,             \&quot;message\&quot;: \&quot;content.recipe is 3574 characters; max allowed is 2000\&quot;         }     ],     \&quot;diagnostics\&quot;: [         {             \&quot;sub_status\&quot;: \&quot;FAILURE\&quot;,             \&quot;messages\&quot;: [                 \&quot;Validation failures present; fix them and re-run to see the DRY_RUN preview.\&quot;             ]         }     ],     \&quot;operation_id\&quot;: \&quot;66666666-6666-6666-6666-666666666666\&quot; } &#x60;&#x60;&#x60;  &gt; ###### Note: &gt; - To use this API, the user needs Spotter access (use/manage) and either edit or memory access on the data-model and they must use corresponding org related bearerToken where the data-model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 26.8.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param importMemoryRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importMemoryAsync(ImportMemoryRequest importMemoryRequest, final ApiCallback<ImportMemoryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = importMemoryValidateBeforeCall(importMemoryRequest, _callback);
        Type localVarReturnType = new TypeToken<ImportMemoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchUsageData
     * @param searchUsageDataRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchUsageDataCall(SearchUsageDataRequest searchUsageDataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchUsageDataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/usage-data/search";

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
    private okhttp3.Call searchUsageDataValidateBeforeCall(SearchUsageDataRequest searchUsageDataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchUsageDataRequest' is set
        if (searchUsageDataRequest == null) {
            throw new ApiException("Missing the required parameter 'searchUsageDataRequest' when calling searchUsageData(Async)");
        }

        return searchUsageDataCall(searchUsageDataRequest, _callback);

    }

    /**
     * 
     *  Retrieves Spotter usage pools: the question allowance configured for each user, user group, or Org and how much of it has been consumed. Pass &#x60;keys&#x60; to fetch specific pools, or omit it to fetch every pool on the cluster. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Retrieves Spotter usage pools. A usage pool is the Spotter question allowance configured for a user, user group, or Org, together with how many questions have been consumed from it. Use this API to monitor usage across your users, for example to find pools that are close to their limit.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  A cluster meters Spotter usage at exactly one scope: per user, per user group, or per Org. Every pool on a cluster therefore has the same &#x60;entity_type&#x60;.  - To retrieve every pool on the cluster, send an empty request body. - To retrieve specific pools, pass &#x60;keys&#x60;, each with an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org). Keys that match no pool are omitted from the response.  If the request is successful, the response contains &#x60;usage_data&#x60;, one entry per pool:  - &#x60;key&#x60;: the entity the pool meters. - &#x60;usage&#x60;: questions consumed from the pool. - &#x60;warning_limit&#x60;: usage level at which users are warned. Absent when no warning is configured. - &#x60;limit&#x60;: maximum questions the pool allows. Absent when the pool is unlimited. - &#x60;updated_time_in_millis&#x60; and &#x60;updated_by&#x60;: when and by whom the pool was last configured.  #### Error conditions  - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Use &#x60;getUsageDataForUser&#x60; to see the combined usage of a single user across every pool they draw from.      
     * @param searchUsageDataRequest  (required)
     * @return UsageDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public UsageDataResponse searchUsageData(SearchUsageDataRequest searchUsageDataRequest) throws ApiException {
        ApiResponse<UsageDataResponse> localVarResp = searchUsageDataWithHttpInfo(searchUsageDataRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Retrieves Spotter usage pools: the question allowance configured for each user, user group, or Org and how much of it has been consumed. Pass &#x60;keys&#x60; to fetch specific pools, or omit it to fetch every pool on the cluster. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Retrieves Spotter usage pools. A usage pool is the Spotter question allowance configured for a user, user group, or Org, together with how many questions have been consumed from it. Use this API to monitor usage across your users, for example to find pools that are close to their limit.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  A cluster meters Spotter usage at exactly one scope: per user, per user group, or per Org. Every pool on a cluster therefore has the same &#x60;entity_type&#x60;.  - To retrieve every pool on the cluster, send an empty request body. - To retrieve specific pools, pass &#x60;keys&#x60;, each with an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org). Keys that match no pool are omitted from the response.  If the request is successful, the response contains &#x60;usage_data&#x60;, one entry per pool:  - &#x60;key&#x60;: the entity the pool meters. - &#x60;usage&#x60;: questions consumed from the pool. - &#x60;warning_limit&#x60;: usage level at which users are warned. Absent when no warning is configured. - &#x60;limit&#x60;: maximum questions the pool allows. Absent when the pool is unlimited. - &#x60;updated_time_in_millis&#x60; and &#x60;updated_by&#x60;: when and by whom the pool was last configured.  #### Error conditions  - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Use &#x60;getUsageDataForUser&#x60; to see the combined usage of a single user across every pool they draw from.      
     * @param searchUsageDataRequest  (required)
     * @return ApiResponse&lt;UsageDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UsageDataResponse> searchUsageDataWithHttpInfo(SearchUsageDataRequest searchUsageDataRequest) throws ApiException {
        okhttp3.Call localVarCall = searchUsageDataValidateBeforeCall(searchUsageDataRequest, null);
        Type localVarReturnType = new TypeToken<UsageDataResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Retrieves Spotter usage pools: the question allowance configured for each user, user group, or Org and how much of it has been consumed. Pass &#x60;keys&#x60; to fetch specific pools, or omit it to fetch every pool on the cluster. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Retrieves Spotter usage pools. A usage pool is the Spotter question allowance configured for a user, user group, or Org, together with how many questions have been consumed from it. Use this API to monitor usage across your users, for example to find pools that are close to their limit.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  A cluster meters Spotter usage at exactly one scope: per user, per user group, or per Org. Every pool on a cluster therefore has the same &#x60;entity_type&#x60;.  - To retrieve every pool on the cluster, send an empty request body. - To retrieve specific pools, pass &#x60;keys&#x60;, each with an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org). Keys that match no pool are omitted from the response.  If the request is successful, the response contains &#x60;usage_data&#x60;, one entry per pool:  - &#x60;key&#x60;: the entity the pool meters. - &#x60;usage&#x60;: questions consumed from the pool. - &#x60;warning_limit&#x60;: usage level at which users are warned. Absent when no warning is configured. - &#x60;limit&#x60;: maximum questions the pool allows. Absent when the pool is unlimited. - &#x60;updated_time_in_millis&#x60; and &#x60;updated_by&#x60;: when and by whom the pool was last configured.  #### Error conditions  - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Use &#x60;getUsageDataForUser&#x60; to see the combined usage of a single user across every pool they draw from.      
     * @param searchUsageDataRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchUsageDataAsync(SearchUsageDataRequest searchUsageDataRequest, final ApiCallback<UsageDataResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchUsageDataValidateBeforeCall(searchUsageDataRequest, _callback);
        Type localVarReturnType = new TypeToken<UsageDataResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setAgentInstructions
     * @param setAgentInstructionsRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setAgentInstructionsCall(SetAgentInstructionsRequest setAgentInstructionsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = setAgentInstructionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/instructions/set";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setAgentInstructionsValidateBeforeCall(SetAgentInstructionsRequest setAgentInstructionsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'setAgentInstructionsRequest' is set
        if (setAgentInstructionsRequest == null) {
            throw new ApiException("Missing the required parameter 'setAgentInstructionsRequest' when calling setAgentInstructions(Async)");
        }

        return setAgentInstructionsCall(setAgentInstructionsRequest, _callback);

    }

    /**
     * 
     *  Version: 26.6.0.cl or later   Creates or updates the admin instructions for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations. If instructions already exist for the org, they are replaced (upsert semantics).  Requires admin privileges. Only users with org admin access can set agent instructions.  #### Usage guidelines  The request must include:  - &#x60;instructions&#x60;: the instructions text to apply to the agent (maximum 5000 characters)  Instructions are validated against system guardrails before being saved. If the instructions contain content that conflicts with guardrails, the request is rejected with a &#x60;409&#x60; error and the existing instructions remain unchanged.  If the request is successful, the response includes the saved &#x60;AgentInstructions&#x60; record:  - &#x60;id&#x60;: unique identifier of the record - &#x60;instructions&#x60;: the saved instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first created - &#x60;updated_at&#x60;: ISO timestamp of this update - &#x60;last_updated_by&#x60;: user ID of the admin who performed this update  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — the request body is missing required fields or the &#x60;instructions&#x60; field exceeds the maximum allowed length of 5000 characters. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to set agent instructions. | | 409  | Conflict — the provided instructions conflict with system guardrails. Review and revise the instructions text before retrying. | | 500  | Internal server error. |  &gt; ###### Note: &gt; &gt; - This operation uses upsert semantics: it creates the instructions record if none exists, or replaces the existing one. &gt; - Instructions take effect immediately for new conversations created after the update. &gt; - Use &#x60;getAgentInstructions&#x60; to retrieve the current instructions before making changes. &gt; - Available from version 26.6.0.cl and later.      
     * @param setAgentInstructionsRequest  (required)
     * @return AgentInstructions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public AgentInstructions setAgentInstructions(SetAgentInstructionsRequest setAgentInstructionsRequest) throws ApiException {
        ApiResponse<AgentInstructions> localVarResp = setAgentInstructionsWithHttpInfo(setAgentInstructionsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.6.0.cl or later   Creates or updates the admin instructions for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations. If instructions already exist for the org, they are replaced (upsert semantics).  Requires admin privileges. Only users with org admin access can set agent instructions.  #### Usage guidelines  The request must include:  - &#x60;instructions&#x60;: the instructions text to apply to the agent (maximum 5000 characters)  Instructions are validated against system guardrails before being saved. If the instructions contain content that conflicts with guardrails, the request is rejected with a &#x60;409&#x60; error and the existing instructions remain unchanged.  If the request is successful, the response includes the saved &#x60;AgentInstructions&#x60; record:  - &#x60;id&#x60;: unique identifier of the record - &#x60;instructions&#x60;: the saved instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first created - &#x60;updated_at&#x60;: ISO timestamp of this update - &#x60;last_updated_by&#x60;: user ID of the admin who performed this update  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — the request body is missing required fields or the &#x60;instructions&#x60; field exceeds the maximum allowed length of 5000 characters. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to set agent instructions. | | 409  | Conflict — the provided instructions conflict with system guardrails. Review and revise the instructions text before retrying. | | 500  | Internal server error. |  &gt; ###### Note: &gt; &gt; - This operation uses upsert semantics: it creates the instructions record if none exists, or replaces the existing one. &gt; - Instructions take effect immediately for new conversations created after the update. &gt; - Use &#x60;getAgentInstructions&#x60; to retrieve the current instructions before making changes. &gt; - Available from version 26.6.0.cl and later.      
     * @param setAgentInstructionsRequest  (required)
     * @return ApiResponse&lt;AgentInstructions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AgentInstructions> setAgentInstructionsWithHttpInfo(SetAgentInstructionsRequest setAgentInstructionsRequest) throws ApiException {
        okhttp3.Call localVarCall = setAgentInstructionsValidateBeforeCall(setAgentInstructionsRequest, null);
        Type localVarReturnType = new TypeToken<AgentInstructions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.6.0.cl or later   Creates or updates the admin instructions for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations. If instructions already exist for the org, they are replaced (upsert semantics).  Requires admin privileges. Only users with org admin access can set agent instructions.  #### Usage guidelines  The request must include:  - &#x60;instructions&#x60;: the instructions text to apply to the agent (maximum 5000 characters)  Instructions are validated against system guardrails before being saved. If the instructions contain content that conflicts with guardrails, the request is rejected with a &#x60;409&#x60; error and the existing instructions remain unchanged.  If the request is successful, the response includes the saved &#x60;AgentInstructions&#x60; record:  - &#x60;id&#x60;: unique identifier of the record - &#x60;instructions&#x60;: the saved instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first created - &#x60;updated_at&#x60;: ISO timestamp of this update - &#x60;last_updated_by&#x60;: user ID of the admin who performed this update  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — the request body is missing required fields or the &#x60;instructions&#x60; field exceeds the maximum allowed length of 5000 characters. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to set agent instructions. | | 409  | Conflict — the provided instructions conflict with system guardrails. Review and revise the instructions text before retrying. | | 500  | Internal server error. |  &gt; ###### Note: &gt; &gt; - This operation uses upsert semantics: it creates the instructions record if none exists, or replaces the existing one. &gt; - Instructions take effect immediately for new conversations created after the update. &gt; - Use &#x60;getAgentInstructions&#x60; to retrieve the current instructions before making changes. &gt; - Available from version 26.6.0.cl and later.      
     * @param setAgentInstructionsRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setAgentInstructionsAsync(SetAgentInstructionsRequest setAgentInstructionsRequest, final ApiCallback<AgentInstructions> _callback) throws ApiException {

        okhttp3.Call localVarCall = setAgentInstructionsValidateBeforeCall(setAgentInstructionsRequest, _callback);
        Type localVarReturnType = new TypeToken<AgentInstructions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setNLInstructions
     * @param setNLInstructionsRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setNLInstructionsCall(SetNLInstructionsRequest setNLInstructionsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = setNLInstructionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/instructions/set";

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
    private okhttp3.Call setNLInstructionsValidateBeforeCall(SetNLInstructionsRequest setNLInstructionsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'setNLInstructionsRequest' is set
        if (setNLInstructionsRequest == null) {
            throw new ApiException("Missing the required parameter 'setNLInstructionsRequest' when calling setNLInstructions(Async)");
        }

        return setNLInstructionsCall(setNLInstructionsRequest, _callback);

    }

    /**
     * 
     *  Version: 10.15.0.cl or later   Sets the data model instructions for a specific data model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - &#x60;data_source_identifier&#x60;: The unique ID of the data-model for which to set NL instructions - &#x60;nl_instructions_info&#x60;: An array of instruction objects, each containing:   - &#x60;instructions&#x60;: Array of text instructions for the LLM   - &#x60;scope&#x60;: The scope of the instruction (&#x60;GLOBAL&#x60;). Currently only &#x60;GLOBAL&#x60; is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - &#x60;success&#x60;: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      
     * @param setNLInstructionsRequest  (required)
     * @return EurekaSetNLInstructionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public EurekaSetNLInstructionsResponse setNLInstructions(SetNLInstructionsRequest setNLInstructionsRequest) throws ApiException {
        ApiResponse<EurekaSetNLInstructionsResponse> localVarResp = setNLInstructionsWithHttpInfo(setNLInstructionsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 10.15.0.cl or later   Sets the data model instructions for a specific data model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - &#x60;data_source_identifier&#x60;: The unique ID of the data-model for which to set NL instructions - &#x60;nl_instructions_info&#x60;: An array of instruction objects, each containing:   - &#x60;instructions&#x60;: Array of text instructions for the LLM   - &#x60;scope&#x60;: The scope of the instruction (&#x60;GLOBAL&#x60;). Currently only &#x60;GLOBAL&#x60; is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - &#x60;success&#x60;: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      
     * @param setNLInstructionsRequest  (required)
     * @return ApiResponse&lt;EurekaSetNLInstructionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EurekaSetNLInstructionsResponse> setNLInstructionsWithHttpInfo(SetNLInstructionsRequest setNLInstructionsRequest) throws ApiException {
        okhttp3.Call localVarCall = setNLInstructionsValidateBeforeCall(setNLInstructionsRequest, null);
        Type localVarReturnType = new TypeToken<EurekaSetNLInstructionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 10.15.0.cl or later   Sets the data model instructions for a specific data model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - &#x60;data_source_identifier&#x60;: The unique ID of the data-model for which to set NL instructions - &#x60;nl_instructions_info&#x60;: An array of instruction objects, each containing:   - &#x60;instructions&#x60;: Array of text instructions for the LLM   - &#x60;scope&#x60;: The scope of the instruction (&#x60;GLOBAL&#x60;). Currently only &#x60;GLOBAL&#x60; is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - &#x60;success&#x60;: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      
     * @param setNLInstructionsRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setNLInstructionsAsync(SetNLInstructionsRequest setNLInstructionsRequest, final ApiCallback<EurekaSetNLInstructionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setNLInstructionsValidateBeforeCall(setNLInstructionsRequest, _callback);
        Type localVarReturnType = new TypeToken<EurekaSetNLInstructionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for shareConversation
     * @param conversationIdentifier Unique identifier of the conversation to share. (required)
     * @param shareConversationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the share access for the conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shareConversationCall(String conversationIdentifier, ShareConversationRequest shareConversationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = shareConversationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/share"
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
    private okhttp3.Call shareConversationValidateBeforeCall(String conversationIdentifier, ShareConversationRequest shareConversationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'conversationIdentifier' when calling shareConversation(Async)");
        }

        // verify the required parameter 'shareConversationRequest' is set
        if (shareConversationRequest == null) {
            throw new ApiException("Missing the required parameter 'shareConversationRequest' when calling shareConversation(Async)");
        }

        return shareConversationCall(conversationIdentifier, shareConversationRequest, _callback);

    }

    /**
     * 
     *  Grants or revokes access to a shared conversation for one or more principals (users or groups). When principals are added, a read-only shared view of the conversation is created from its current state. Use &#x60;refresh_shared_content&#x60; to regenerate the shared view with the latest conversation content. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the conversation to share. (required)
     * @param shareConversationRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the share access for the conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public void shareConversation(String conversationIdentifier, ShareConversationRequest shareConversationRequest) throws ApiException {
        shareConversationWithHttpInfo(conversationIdentifier, shareConversationRequest);
    }

    /**
     * 
     *  Grants or revokes access to a shared conversation for one or more principals (users or groups). When principals are added, a read-only shared view of the conversation is created from its current state. Use &#x60;refresh_shared_content&#x60; to regenerate the shared view with the latest conversation content. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the conversation to share. (required)
     * @param shareConversationRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the share access for the conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> shareConversationWithHttpInfo(String conversationIdentifier, ShareConversationRequest shareConversationRequest) throws ApiException {
        okhttp3.Call localVarCall = shareConversationValidateBeforeCall(conversationIdentifier, shareConversationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Grants or revokes access to a shared conversation for one or more principals (users or groups). When principals are added, a read-only shared view of the conversation is created from its current state. Use &#x60;refresh_shared_content&#x60; to regenerate the shared view with the latest conversation content. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the specified conversation.    Version: 26.9.0.cl or later       
     * @param conversationIdentifier Unique identifier of the conversation to share. (required)
     * @param shareConversationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the share access for the conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shareConversationAsync(String conversationIdentifier, ShareConversationRequest shareConversationRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = shareConversationValidateBeforeCall(conversationIdentifier, shareConversationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConversation
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call updateConversationCall(String conversationIdentifier, UpdateConversationRequest updateConversationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateConversationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update"
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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateConversationValidateBeforeCall(String conversationIdentifier, UpdateConversationRequest updateConversationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'conversationIdentifier' is set
        if (conversationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'conversationIdentifier' when calling updateConversation(Async)");
        }

        // verify the required parameter 'updateConversationRequest' is set
        if (updateConversationRequest == null) {
            throw new ApiException("Missing the required parameter 'updateConversationRequest' when calling updateConversation(Async)");
        }

        return updateConversationCall(conversationIdentifier, updateConversationRequest, _callback);

    }

    /**
     * 
     *  Updates attributes of an existing agent conversation. Supports updating the display title and the pinned state; additional conversation attributes may be supported in future versions. At least one updatable attribute must be provided in the request body. Each attribute is applied independently, so omitted attributes are left unchanged.    Version: 26.7.0.cl or later   **Deprecated** — Spotter names conversations automatically; read the title with &#x60;getConversationList&#x60;. This endpoint will be removed in a future release.  Updates attributes of an existing saved agent conversation. Supports updating the conversation&#39;s display &#x60;title&#x60; and its &#x60;is_pinned&#x60; state; additional updatable attributes may be supported in future versions. At least one updatable attribute must be supplied in the request body.  Use this endpoint to rename a conversation, or to pin a conversation so that it is surfaced first in the conversation list for quick access.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being updated.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to update, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60; - At least one updatable attribute in the request body:     - &#x60;title&#x60; *(optional)*: the new display name for the conversation. An empty or whitespace-only value is replaced with a default title rather than rejected.     - &#x60;is_pinned&#x60; *(optional)*: &#x60;true&#x60; to pin the conversation, &#x60;false&#x60; to unpin it. Available from version 26.10.0.cl.  Each attribute is applied independently: omitted attributes are left unchanged, so you can update the title and the pinned state in a single request or in separate requests. Updating &#x60;is_pinned&#x60; is idempotent — pinning an already-pinned conversation, or unpinning an already-unpinned one, succeeds with no side effects.  A successful request returns an empty &#x60;204 No Content&#x60; response. Updated attributes are reflected immediately in subsequent calls to &#x60;getConversationList&#x60;.  #### Example request  Rename a conversation:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot; } &#x60;&#x60;&#x60;  Pin a conversation:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;is_pinned\&quot;: true } &#x60;&#x60;&#x60;  Update both attributes in a single request:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot;,   \&quot;is_pinned\&quot;: true } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad Request — the request body supplies neither &#x60;title&#x60; nor &#x60;is_pinned&#x60;, or &#x60;is_pinned&#x60; is not a boolean. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. | | 422  | Unprocessable Entity — the request body is malformed or contains an invalid field value. |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; can be updated. Unsaved conversations are not persisted and do not have a retrievable identifier. &gt; - There is no limit on the number of conversations a user can pin. &gt; - Available from version 26.7.0.cl and later. The &#x60;is_pinned&#x60; attribute is available from version 26.10.0.cl and later. &gt; - Supports &#x60;V1&#x60; conversations only. Conversations created with &#x60;spotter_experience_version: V2&#x60; are not found. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public void updateConversation(String conversationIdentifier, UpdateConversationRequest updateConversationRequest) throws ApiException {
        updateConversationWithHttpInfo(conversationIdentifier, updateConversationRequest);
    }

    /**
     * 
     *  Updates attributes of an existing agent conversation. Supports updating the display title and the pinned state; additional conversation attributes may be supported in future versions. At least one updatable attribute must be provided in the request body. Each attribute is applied independently, so omitted attributes are left unchanged.    Version: 26.7.0.cl or later   **Deprecated** — Spotter names conversations automatically; read the title with &#x60;getConversationList&#x60;. This endpoint will be removed in a future release.  Updates attributes of an existing saved agent conversation. Supports updating the conversation&#39;s display &#x60;title&#x60; and its &#x60;is_pinned&#x60; state; additional updatable attributes may be supported in future versions. At least one updatable attribute must be supplied in the request body.  Use this endpoint to rename a conversation, or to pin a conversation so that it is surfaced first in the conversation list for quick access.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being updated.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to update, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60; - At least one updatable attribute in the request body:     - &#x60;title&#x60; *(optional)*: the new display name for the conversation. An empty or whitespace-only value is replaced with a default title rather than rejected.     - &#x60;is_pinned&#x60; *(optional)*: &#x60;true&#x60; to pin the conversation, &#x60;false&#x60; to unpin it. Available from version 26.10.0.cl.  Each attribute is applied independently: omitted attributes are left unchanged, so you can update the title and the pinned state in a single request or in separate requests. Updating &#x60;is_pinned&#x60; is idempotent — pinning an already-pinned conversation, or unpinning an already-unpinned one, succeeds with no side effects.  A successful request returns an empty &#x60;204 No Content&#x60; response. Updated attributes are reflected immediately in subsequent calls to &#x60;getConversationList&#x60;.  #### Example request  Rename a conversation:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot; } &#x60;&#x60;&#x60;  Pin a conversation:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;is_pinned\&quot;: true } &#x60;&#x60;&#x60;  Update both attributes in a single request:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot;,   \&quot;is_pinned\&quot;: true } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad Request — the request body supplies neither &#x60;title&#x60; nor &#x60;is_pinned&#x60;, or &#x60;is_pinned&#x60; is not a boolean. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. | | 422  | Unprocessable Entity — the request body is malformed or contains an invalid field value. |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; can be updated. Unsaved conversations are not persisted and do not have a retrievable identifier. &gt; - There is no limit on the number of conversations a user can pin. &gt; - Available from version 26.7.0.cl and later. The &#x60;is_pinned&#x60; attribute is available from version 26.10.0.cl and later. &gt; - Supports &#x60;V1&#x60; conversations only. Conversations created with &#x60;spotter_experience_version: V2&#x60; are not found. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> updateConversationWithHttpInfo(String conversationIdentifier, UpdateConversationRequest updateConversationRequest) throws ApiException {
        okhttp3.Call localVarCall = updateConversationValidateBeforeCall(conversationIdentifier, updateConversationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Updates attributes of an existing agent conversation. Supports updating the display title and the pinned state; additional conversation attributes may be supported in future versions. At least one updatable attribute must be provided in the request body. Each attribute is applied independently, so omitted attributes are left unchanged.    Version: 26.7.0.cl or later   **Deprecated** — Spotter names conversations automatically; read the title with &#x60;getConversationList&#x60;. This endpoint will be removed in a future release.  Updates attributes of an existing saved agent conversation. Supports updating the conversation&#39;s display &#x60;title&#x60; and its &#x60;is_pinned&#x60; state; additional updatable attributes may be supported in future versions. At least one updatable attribute must be supplied in the request body.  Use this endpoint to rename a conversation, or to pin a conversation so that it is surfaced first in the conversation list for quick access.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being updated.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to update, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60; - At least one updatable attribute in the request body:     - &#x60;title&#x60; *(optional)*: the new display name for the conversation. An empty or whitespace-only value is replaced with a default title rather than rejected.     - &#x60;is_pinned&#x60; *(optional)*: &#x60;true&#x60; to pin the conversation, &#x60;false&#x60; to unpin it. Available from version 26.10.0.cl.  Each attribute is applied independently: omitted attributes are left unchanged, so you can update the title and the pinned state in a single request or in separate requests. Updating &#x60;is_pinned&#x60; is idempotent — pinning an already-pinned conversation, or unpinning an already-unpinned one, succeeds with no side effects.  A successful request returns an empty &#x60;204 No Content&#x60; response. Updated attributes are reflected immediately in subsequent calls to &#x60;getConversationList&#x60;.  #### Example request  Rename a conversation:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot; } &#x60;&#x60;&#x60;  Pin a conversation:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;is_pinned\&quot;: true } &#x60;&#x60;&#x60;  Update both attributes in a single request:  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot;,   \&quot;is_pinned\&quot;: true } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad Request — the request body supplies neither &#x60;title&#x60; nor &#x60;is_pinned&#x60;, or &#x60;is_pinned&#x60; is not a boolean. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. | | 422  | Unprocessable Entity — the request body is malformed or contains an invalid field value. |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated from 26.12.0.cl and will be removed in a future release. &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; can be updated. Unsaved conversations are not persisted and do not have a retrievable identifier. &gt; - There is no limit on the number of conversations a user can pin. &gt; - Available from version 26.7.0.cl and later. The &#x60;is_pinned&#x60; attribute is available from version 26.10.0.cl and later. &gt; - Supports &#x60;V1&#x60; conversations only. Conversations created with &#x60;spotter_experience_version: V2&#x60; are not found. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation to update. (required)
     * @param updateConversationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the agent conversation. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call updateConversationAsync(String conversationIdentifier, UpdateConversationRequest updateConversationRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateConversationValidateBeforeCall(conversationIdentifier, updateConversationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUsageData
     * @param updateUsageDataRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUsageDataCall(UpdateUsageDataRequest updateUsageDataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateUsageDataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/usage-data/update";

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
    private okhttp3.Call updateUsageDataValidateBeforeCall(UpdateUsageDataRequest updateUsageDataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateUsageDataRequest' is set
        if (updateUsageDataRequest == null) {
            throw new ApiException("Missing the required parameter 'updateUsageDataRequest' when calling updateUsageData(Async)");
        }

        return updateUsageDataCall(updateUsageDataRequest, _callback);

    }

    /**
     * 
     *  Creates or updates Spotter usage pools, setting the question allowance for a user, user group, or Org. A pool that does not exist is created; fields omitted from an update keep their current value. Every key must use the scope the cluster meters at. Switching scope requires deleting the existing pools first. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Creates or updates Spotter usage pools. A usage pool sets how many Spotter questions a user, user group, or Org can ask. Use this API to provision limits for new users or groups, raise or lower an existing limit, or reset usage at the start of a billing period.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  The request must include &#x60;updates&#x60;, with at least one entry. Each entry contains:  - &#x60;key&#x60; (required): the pool to create or update, with an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org). - &#x60;limit&#x60; (optional): maximum Spotter questions the pool allows. - &#x60;warning_limit&#x60; (optional): usage level at which users are warned that they are approaching the limit. - &#x60;usage&#x60; (optional): questions consumed so far. Set to &#x60;0&#x60; to reset the pool.  A pool that does not exist is created. Fields omitted from an entry keep their current value.  A cluster meters Spotter usage at exactly one scope. The first pool created sets the scope, and every later key must use the same &#x60;entity_type&#x60;. To switch scope, delete the existing pools with &#x60;deleteUsageData&#x60; first.  If the request is successful, the response contains &#x60;usage_data&#x60;, with each updated pool as it stands after the change.  #### Error conditions  - &#x60;400&#x60; — &#x60;updates&#x60; is empty, a key is missing its &#x60;entity_type&#x60; or &#x60;entity_identifier&#x60;, or a key uses a different &#x60;entity_type&#x60; from the cluster&#39;s existing pools. - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available.      
     * @param updateUsageDataRequest  (required)
     * @return UsageDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public UsageDataResponse updateUsageData(UpdateUsageDataRequest updateUsageDataRequest) throws ApiException {
        ApiResponse<UsageDataResponse> localVarResp = updateUsageDataWithHttpInfo(updateUsageDataRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Creates or updates Spotter usage pools, setting the question allowance for a user, user group, or Org. A pool that does not exist is created; fields omitted from an update keep their current value. Every key must use the scope the cluster meters at. Switching scope requires deleting the existing pools first. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Creates or updates Spotter usage pools. A usage pool sets how many Spotter questions a user, user group, or Org can ask. Use this API to provision limits for new users or groups, raise or lower an existing limit, or reset usage at the start of a billing period.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  The request must include &#x60;updates&#x60;, with at least one entry. Each entry contains:  - &#x60;key&#x60; (required): the pool to create or update, with an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org). - &#x60;limit&#x60; (optional): maximum Spotter questions the pool allows. - &#x60;warning_limit&#x60; (optional): usage level at which users are warned that they are approaching the limit. - &#x60;usage&#x60; (optional): questions consumed so far. Set to &#x60;0&#x60; to reset the pool.  A pool that does not exist is created. Fields omitted from an entry keep their current value.  A cluster meters Spotter usage at exactly one scope. The first pool created sets the scope, and every later key must use the same &#x60;entity_type&#x60;. To switch scope, delete the existing pools with &#x60;deleteUsageData&#x60; first.  If the request is successful, the response contains &#x60;usage_data&#x60;, with each updated pool as it stands after the change.  #### Error conditions  - &#x60;400&#x60; — &#x60;updates&#x60; is empty, a key is missing its &#x60;entity_type&#x60; or &#x60;entity_identifier&#x60;, or a key uses a different &#x60;entity_type&#x60; from the cluster&#39;s existing pools. - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available.      
     * @param updateUsageDataRequest  (required)
     * @return ApiResponse&lt;UsageDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Common successful response </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Common error response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UsageDataResponse> updateUsageDataWithHttpInfo(UpdateUsageDataRequest updateUsageDataRequest) throws ApiException {
        okhttp3.Call localVarCall = updateUsageDataValidateBeforeCall(updateUsageDataRequest, null);
        Type localVarReturnType = new TypeToken<UsageDataResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Creates or updates Spotter usage pools, setting the question allowance for a user, user group, or Org. A pool that does not exist is created; fields omitted from an update keep their current value. Every key must use the scope the cluster meters at. Switching scope requires deleting the existing pools first. Requires &#x60;ADMINISTRATION&#x60; privilege.   Version: 26.11.0.cl or later   Creates or updates Spotter usage pools. A usage pool sets how many Spotter questions a user, user group, or Org can ask. Use this API to provision limits for new users or groups, raise or lower an existing limit, or reset usage at the start of a billing period.  Requires &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot) privilege. Users with only &#x60;CAN_MANAGE_SPOTTER&#x60;, and Org administrators without cluster-level &#x60;ADMINISTRATION&#x60;, cannot call this API.  #### Usage guidelines  The request must include &#x60;updates&#x60;, with at least one entry. Each entry contains:  - &#x60;key&#x60; (required): the pool to create or update, with an &#x60;entity_type&#x60; (&#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;) and an &#x60;entity_identifier&#x60; (the GUID of the user or user group, or the ID of the Org). - &#x60;limit&#x60; (optional): maximum Spotter questions the pool allows. - &#x60;warning_limit&#x60; (optional): usage level at which users are warned that they are approaching the limit. - &#x60;usage&#x60; (optional): questions consumed so far. Set to &#x60;0&#x60; to reset the pool.  A pool that does not exist is created. Fields omitted from an entry keep their current value.  A cluster meters Spotter usage at exactly one scope. The first pool created sets the scope, and every later key must use the same &#x60;entity_type&#x60;. To switch scope, delete the existing pools with &#x60;deleteUsageData&#x60; first.  If the request is successful, the response contains &#x60;usage_data&#x60;, with each updated pool as it stands after the change.  #### Error conditions  - &#x60;400&#x60; — &#x60;updates&#x60; is empty, a key is missing its &#x60;entity_type&#x60; or &#x60;entity_identifier&#x60;, or a key uses a different &#x60;entity_type&#x60; from the cluster&#39;s existing pools. - &#x60;401&#x60; — authentication token is missing, expired, or invalid. - &#x60;403&#x60; — the caller does not have &#x60;ADMINISTRATION&#x60; privilege.  &gt; ###### Note: &gt; &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available.      
     * @param updateUsageDataRequest  (required)
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
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUsageDataAsync(UpdateUsageDataRequest updateUsageDataRequest, final ApiCallback<UsageDataResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateUsageDataValidateBeforeCall(updateUsageDataRequest, _callback);
        Type localVarReturnType = new TypeToken<UsageDataResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
