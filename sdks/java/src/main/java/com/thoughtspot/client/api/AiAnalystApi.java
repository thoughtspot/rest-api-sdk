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


import com.thoughtspot.client.model.Analyst;
import com.thoughtspot.client.model.AnalystDeleteResponse;
import com.thoughtspot.client.model.AnalystSearchResponse;
import com.thoughtspot.client.model.CreateAnalystRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.SearchAnalystsRequest;
import com.thoughtspot.client.model.ShareAnalystRequest;
import com.thoughtspot.client.model.UpdateAnalystRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AiAnalystApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AiAnalystApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AiAnalystApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public AiAnalystApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createAnalyst
     * @param createAnalystRequest  (required)
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
    public okhttp3.Call createAnalystCall(CreateAnalystRequest createAnalystRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createAnalystRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/analysts/create";

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
    private okhttp3.Call createAnalystValidateBeforeCall(CreateAnalystRequest createAnalystRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createAnalystRequest' is set
        if (createAnalystRequest == null) {
            throw new ApiException("Missing the required parameter 'createAnalystRequest' when calling createAnalyst(Async)");
        }

        return createAnalystCall(createAnalystRequest, _callback);

    }

    /**
     * 
     *  Creates a Spotter Analyst: a configured agent with a name, description, at least one data source, and optional agent instructions, MCP connectors, and starter prompts. Analysts created via API use the default icon until one is set in the UI. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;.   Version: 26.10.0.cl or later   Creates a Spotter Analyst: a configured agent with a name, description, data sources, and optional agent instructions, MCP connectors, and starter prompts that your users converse with in Spotter.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;. Use a bearer token for the Org in which the analyst should be created.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior for this analyst. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). The caller must have view access to every referenced source. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors to link to the analyst. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts shown on the analyst landing page, each between 10 and 250 characters. Display order follows list position.  If the request is successful, the response contains the created analyst, including the server-assigned &#x60;id&#x60;. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;), the last-update time as &#x60;updated_time_in_millis&#x60; (epoch milliseconds), and the &#x60;created_by&#x60; and &#x60;updated_by&#x60; users.  #### Error conditions  - &#x60;403&#x60; — missing privileges, or no view access to a referenced data source. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      
     * @param createAnalystRequest  (required)
     * @return Analyst
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
    public Analyst createAnalyst(CreateAnalystRequest createAnalystRequest) throws ApiException {
        ApiResponse<Analyst> localVarResp = createAnalystWithHttpInfo(createAnalystRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Creates a Spotter Analyst: a configured agent with a name, description, at least one data source, and optional agent instructions, MCP connectors, and starter prompts. Analysts created via API use the default icon until one is set in the UI. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;.   Version: 26.10.0.cl or later   Creates a Spotter Analyst: a configured agent with a name, description, data sources, and optional agent instructions, MCP connectors, and starter prompts that your users converse with in Spotter.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;. Use a bearer token for the Org in which the analyst should be created.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior for this analyst. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). The caller must have view access to every referenced source. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors to link to the analyst. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts shown on the analyst landing page, each between 10 and 250 characters. Display order follows list position.  If the request is successful, the response contains the created analyst, including the server-assigned &#x60;id&#x60;. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;), the last-update time as &#x60;updated_time_in_millis&#x60; (epoch milliseconds), and the &#x60;created_by&#x60; and &#x60;updated_by&#x60; users.  #### Error conditions  - &#x60;403&#x60; — missing privileges, or no view access to a referenced data source. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      
     * @param createAnalystRequest  (required)
     * @return ApiResponse&lt;Analyst&gt;
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
    public ApiResponse<Analyst> createAnalystWithHttpInfo(CreateAnalystRequest createAnalystRequest) throws ApiException {
        okhttp3.Call localVarCall = createAnalystValidateBeforeCall(createAnalystRequest, null);
        Type localVarReturnType = new TypeToken<Analyst>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Creates a Spotter Analyst: a configured agent with a name, description, at least one data source, and optional agent instructions, MCP connectors, and starter prompts. Analysts created via API use the default icon until one is set in the UI. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;.   Version: 26.10.0.cl or later   Creates a Spotter Analyst: a configured agent with a name, description, data sources, and optional agent instructions, MCP connectors, and starter prompts that your users converse with in Spotter.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges, plus view access to every data source referenced in &#x60;sources&#x60;. Use a bearer token for the Org in which the analyst should be created.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior for this analyst. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). The caller must have view access to every referenced source. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors to link to the analyst. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts shown on the analyst landing page, each between 10 and 250 characters. Display order follows list position.  If the request is successful, the response contains the created analyst, including the server-assigned &#x60;id&#x60;. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;), the last-update time as &#x60;updated_time_in_millis&#x60; (epoch milliseconds), and the &#x60;created_by&#x60; and &#x60;updated_by&#x60; users.  #### Error conditions  - &#x60;403&#x60; — missing privileges, or no view access to a referenced data source. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      
     * @param createAnalystRequest  (required)
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
    public okhttp3.Call createAnalystAsync(CreateAnalystRequest createAnalystRequest, final ApiCallback<Analyst> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAnalystValidateBeforeCall(createAnalystRequest, _callback);
        Type localVarReturnType = new TypeToken<Analyst>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAnalyst
     * @param analystIdentifier Unique identifier of the analyst to delete. (required)
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
    public okhttp3.Call deleteAnalystCall(String analystIdentifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/ai/agent/analysts/{analyst_identifier}/delete"
            .replace("{" + "analyst_identifier" + "}", localVarApiClient.escapeString(analystIdentifier.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteAnalystValidateBeforeCall(String analystIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'analystIdentifier' is set
        if (analystIdentifier == null) {
            throw new ApiException("Missing the required parameter 'analystIdentifier' when calling deleteAnalyst(Async)");
        }

        return deleteAnalystCall(analystIdentifier, _callback);

    }

    /**
     * 
     *  Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered. The request has no body; the response contains the &#x60;id&#x60; of the deleted analyst. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot delete it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request has no body — the analyst to delete is identified by the &#x60;analyst_identifier&#x60; path parameter, as returned by the create analyst API.  A successful request returns the &#x60;id&#x60; of the deleted analyst.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to delete. (required)
     * @return AnalystDeleteResponse
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
    public AnalystDeleteResponse deleteAnalyst(String analystIdentifier) throws ApiException {
        ApiResponse<AnalystDeleteResponse> localVarResp = deleteAnalystWithHttpInfo(analystIdentifier);
        return localVarResp.getData();
    }

    /**
     * 
     *  Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered. The request has no body; the response contains the &#x60;id&#x60; of the deleted analyst. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot delete it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request has no body — the analyst to delete is identified by the &#x60;analyst_identifier&#x60; path parameter, as returned by the create analyst API.  A successful request returns the &#x60;id&#x60; of the deleted analyst.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to delete. (required)
     * @return ApiResponse&lt;AnalystDeleteResponse&gt;
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
    public ApiResponse<AnalystDeleteResponse> deleteAnalystWithHttpInfo(String analystIdentifier) throws ApiException {
        okhttp3.Call localVarCall = deleteAnalystValidateBeforeCall(analystIdentifier, null);
        Type localVarReturnType = new TypeToken<AnalystDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered. The request has no body; the response contains the &#x60;id&#x60; of the deleted analyst. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Permanently deletes a Spotter Analyst. This operation is irreversible — deleted analysts cannot be recovered.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot delete it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request has no body — the analyst to delete is identified by the &#x60;analyst_identifier&#x60; path parameter, as returned by the create analyst API.  A successful request returns the &#x60;id&#x60; of the deleted analyst.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to delete. (required)
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
    public okhttp3.Call deleteAnalystAsync(String analystIdentifier, final ApiCallback<AnalystDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAnalystValidateBeforeCall(analystIdentifier, _callback);
        Type localVarReturnType = new TypeToken<AnalystDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchAnalysts
     * @param searchAnalystsRequest  (required)
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
    public okhttp3.Call searchAnalystsCall(SearchAnalystsRequest searchAnalystsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchAnalystsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/analysts/search";

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
    private okhttp3.Call searchAnalystsValidateBeforeCall(SearchAnalystsRequest searchAnalystsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchAnalystsRequest' is set
        if (searchAnalystsRequest == null) {
            throw new ApiException("Missing the required parameter 'searchAnalystsRequest' when calling searchAnalysts(Async)");
        }

        return searchAnalystsCall(searchAnalystsRequest, _callback);

    }

    /**
     * 
     *  Searches Spotter Analysts. Two modes: - Fetch mode: when &#x60;analyst_identifier&#x60; is provided, the response contains   exactly that analyst and all other filters are ignored. - List mode: returns a paginated list of analysts visible to the caller,   optionally filtered by a case-insensitive substring match on the   analyst name (&#x60;query&#x60;) and by ownership (&#x60;type&#x60;). Results are ordered   by most recently accessed. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Searches Spotter Analysts. Use this endpoint to page through the analysts visible to you, or to fetch a single analyst by its identifier.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges. Use a bearer token for the Org whose analysts should be searched.  #### Usage guidelines  The endpoint operates in one of two modes:  **Fetch mode** — when &#x60;analyst_identifier&#x60; is provided, the response contains exactly that analyst (&#x60;total_size&#x60; is 1) and all other filters are ignored. The caller must have access to the analyst (owner, shared with, or admin/Spotter-management privileges).  **List mode** — when &#x60;analyst_identifier&#x60; is omitted, the response is a paginated list of analysts the caller can see, ordered by most recently accessed:  - &#x60;record_size&#x60; (optional): number of records per page. Default 50, between 1 and 500. - &#x60;record_offset&#x60; (optional): zero-based index of the first record. Default 0, maximum 10000. - &#x60;query&#x60; (optional): case-insensitive substring match applied to the analyst **name only**. - &#x60;type&#x60; (optional): ownership filter — &#x60;ALL&#x60; (default; created by or shared with me), &#x60;CREATED_BY_ME&#x60;, or &#x60;SHARED_TO_ME&#x60;.  The response contains &#x60;analysts&#x60; — the page of matching analysts — and &#x60;total_size&#x60;, the total number of matches before pagination. Each analyst includes its &#x60;id&#x60;, &#x60;name&#x60;, &#x60;description&#x60;, &#x60;instructions&#x60;, &#x60;sources&#x60; (with &#x60;id&#x60;, &#x60;type&#x60;, and display &#x60;name&#x60;), enriched &#x60;mcp_connectors&#x60; (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;icon_url&#x60;), &#x60;icon_id&#x60;, &#x60;starter_prompts&#x60; (including the server-managed fixed prompt, marked &#x60;is_fixed&#x60;), &#x60;updated_time_in_millis&#x60; and &#x60;last_accessed_time_in_millis&#x60; (epoch milliseconds), and &#x60;created_by&#x60; / &#x60;updated_by&#x60; user references (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;display_name&#x60;).  #### Error conditions  - &#x60;403&#x60; — missing privileges, or (fetch mode) no access to the requested analyst. - &#x60;404&#x60; — (fetch mode) no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as &#x60;record_size&#x60; or &#x60;record_offset&#x60; out of range.      
     * @param searchAnalystsRequest  (required)
     * @return AnalystSearchResponse
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
    public AnalystSearchResponse searchAnalysts(SearchAnalystsRequest searchAnalystsRequest) throws ApiException {
        ApiResponse<AnalystSearchResponse> localVarResp = searchAnalystsWithHttpInfo(searchAnalystsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Searches Spotter Analysts. Two modes: - Fetch mode: when &#x60;analyst_identifier&#x60; is provided, the response contains   exactly that analyst and all other filters are ignored. - List mode: returns a paginated list of analysts visible to the caller,   optionally filtered by a case-insensitive substring match on the   analyst name (&#x60;query&#x60;) and by ownership (&#x60;type&#x60;). Results are ordered   by most recently accessed. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Searches Spotter Analysts. Use this endpoint to page through the analysts visible to you, or to fetch a single analyst by its identifier.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges. Use a bearer token for the Org whose analysts should be searched.  #### Usage guidelines  The endpoint operates in one of two modes:  **Fetch mode** — when &#x60;analyst_identifier&#x60; is provided, the response contains exactly that analyst (&#x60;total_size&#x60; is 1) and all other filters are ignored. The caller must have access to the analyst (owner, shared with, or admin/Spotter-management privileges).  **List mode** — when &#x60;analyst_identifier&#x60; is omitted, the response is a paginated list of analysts the caller can see, ordered by most recently accessed:  - &#x60;record_size&#x60; (optional): number of records per page. Default 50, between 1 and 500. - &#x60;record_offset&#x60; (optional): zero-based index of the first record. Default 0, maximum 10000. - &#x60;query&#x60; (optional): case-insensitive substring match applied to the analyst **name only**. - &#x60;type&#x60; (optional): ownership filter — &#x60;ALL&#x60; (default; created by or shared with me), &#x60;CREATED_BY_ME&#x60;, or &#x60;SHARED_TO_ME&#x60;.  The response contains &#x60;analysts&#x60; — the page of matching analysts — and &#x60;total_size&#x60;, the total number of matches before pagination. Each analyst includes its &#x60;id&#x60;, &#x60;name&#x60;, &#x60;description&#x60;, &#x60;instructions&#x60;, &#x60;sources&#x60; (with &#x60;id&#x60;, &#x60;type&#x60;, and display &#x60;name&#x60;), enriched &#x60;mcp_connectors&#x60; (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;icon_url&#x60;), &#x60;icon_id&#x60;, &#x60;starter_prompts&#x60; (including the server-managed fixed prompt, marked &#x60;is_fixed&#x60;), &#x60;updated_time_in_millis&#x60; and &#x60;last_accessed_time_in_millis&#x60; (epoch milliseconds), and &#x60;created_by&#x60; / &#x60;updated_by&#x60; user references (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;display_name&#x60;).  #### Error conditions  - &#x60;403&#x60; — missing privileges, or (fetch mode) no access to the requested analyst. - &#x60;404&#x60; — (fetch mode) no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as &#x60;record_size&#x60; or &#x60;record_offset&#x60; out of range.      
     * @param searchAnalystsRequest  (required)
     * @return ApiResponse&lt;AnalystSearchResponse&gt;
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
    public ApiResponse<AnalystSearchResponse> searchAnalystsWithHttpInfo(SearchAnalystsRequest searchAnalystsRequest) throws ApiException {
        okhttp3.Call localVarCall = searchAnalystsValidateBeforeCall(searchAnalystsRequest, null);
        Type localVarReturnType = new TypeToken<AnalystSearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Searches Spotter Analysts. Two modes: - Fetch mode: when &#x60;analyst_identifier&#x60; is provided, the response contains   exactly that analyst and all other filters are ignored. - List mode: returns a paginated list of analysts visible to the caller,   optionally filtered by a case-insensitive substring match on the   analyst name (&#x60;query&#x60;) and by ownership (&#x60;type&#x60;). Results are ordered   by most recently accessed. Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Searches Spotter Analysts. Use this endpoint to page through the analysts visible to you, or to fetch a single analyst by its identifier.  Requires at least one of &#x60;ADMINISTRATION&#x60;, &#x60;CAN_MANAGE_SPOTTER&#x60;, or &#x60;CAN_USE_SPOTTER&#x60; privileges. Use a bearer token for the Org whose analysts should be searched.  #### Usage guidelines  The endpoint operates in one of two modes:  **Fetch mode** — when &#x60;analyst_identifier&#x60; is provided, the response contains exactly that analyst (&#x60;total_size&#x60; is 1) and all other filters are ignored. The caller must have access to the analyst (owner, shared with, or admin/Spotter-management privileges).  **List mode** — when &#x60;analyst_identifier&#x60; is omitted, the response is a paginated list of analysts the caller can see, ordered by most recently accessed:  - &#x60;record_size&#x60; (optional): number of records per page. Default 50, between 1 and 500. - &#x60;record_offset&#x60; (optional): zero-based index of the first record. Default 0, maximum 10000. - &#x60;query&#x60; (optional): case-insensitive substring match applied to the analyst **name only**. - &#x60;type&#x60; (optional): ownership filter — &#x60;ALL&#x60; (default; created by or shared with me), &#x60;CREATED_BY_ME&#x60;, or &#x60;SHARED_TO_ME&#x60;.  The response contains &#x60;analysts&#x60; — the page of matching analysts — and &#x60;total_size&#x60;, the total number of matches before pagination. Each analyst includes its &#x60;id&#x60;, &#x60;name&#x60;, &#x60;description&#x60;, &#x60;instructions&#x60;, &#x60;sources&#x60; (with &#x60;id&#x60;, &#x60;type&#x60;, and display &#x60;name&#x60;), enriched &#x60;mcp_connectors&#x60; (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;icon_url&#x60;), &#x60;icon_id&#x60;, &#x60;starter_prompts&#x60; (including the server-managed fixed prompt, marked &#x60;is_fixed&#x60;), &#x60;updated_time_in_millis&#x60; and &#x60;last_accessed_time_in_millis&#x60; (epoch milliseconds), and &#x60;created_by&#x60; / &#x60;updated_by&#x60; user references (with &#x60;id&#x60;, &#x60;name&#x60;, and &#x60;display_name&#x60;).  #### Error conditions  - &#x60;403&#x60; — missing privileges, or (fetch mode) no access to the requested analyst. - &#x60;404&#x60; — (fetch mode) no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as &#x60;record_size&#x60; or &#x60;record_offset&#x60; out of range.      
     * @param searchAnalystsRequest  (required)
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
    public okhttp3.Call searchAnalystsAsync(SearchAnalystsRequest searchAnalystsRequest, final ApiCallback<AnalystSearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchAnalystsValidateBeforeCall(searchAnalystsRequest, _callback);
        Type localVarReturnType = new TypeToken<AnalystSearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for shareAnalyst
     * @param analystIdentifier Unique identifier of the analyst to share. (required)
     * @param shareAnalystRequest  (required)
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
    public okhttp3.Call shareAnalystCall(String analystIdentifier, ShareAnalystRequest shareAnalystRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = shareAnalystRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/analysts/{analyst_identifier}/share"
            .replace("{" + "analyst_identifier" + "}", localVarApiClient.escapeString(analystIdentifier.toString()));

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
    private okhttp3.Call shareAnalystValidateBeforeCall(String analystIdentifier, ShareAnalystRequest shareAnalystRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'analystIdentifier' is set
        if (analystIdentifier == null) {
            throw new ApiException("Missing the required parameter 'analystIdentifier' when calling shareAnalyst(Async)");
        }

        // verify the required parameter 'shareAnalystRequest' is set
        if (shareAnalystRequest == null) {
            throw new ApiException("Missing the required parameter 'shareAnalystRequest' when calling shareAnalyst(Async)");
        }

        return shareAnalystCall(analystIdentifier, shareAnalystRequest, _callback);

    }

    /**
     * 
     *  Updates share permissions on a Spotter Analyst, one entry per principal (user or group). &#x60;READ_ONLY&#x60; and &#x60;MODIFY&#x60; grant or change the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it. Granting access also shares the analyst&#39;s data sources with the principal so the analyst keeps working for them. A successful share returns an empty &#x60;204 No Content&#x60; response. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Updates share permissions on a Spotter Analyst for one or more principals (users or groups).  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The analyst is identified by the &#x60;analyst_identifier&#x60; path parameter. The request body contains a &#x60;permissions&#x60; array with one entry per principal:  - &#x60;principal.identifier&#x60; (required): unique identifier of the user or group. - &#x60;principal.type&#x60; (required): &#x60;USER&#x60; or &#x60;USER_GROUP&#x60;. - &#x60;share_mode&#x60; (required): &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; grants (or changes) the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it.  A principal may appear at most once per request. When access is granted, the analyst&#39;s data sources are automatically shared with the principal as well, so the analyst keeps working for them.  A successful request returns an empty &#x60;204 No Content&#x60; response.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as an empty &#x60;permissions&#x60; array, a duplicate principal, or a missing field. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to share. (required)
     * @param shareAnalystRequest  (required)
     * @return Object
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
    public Object shareAnalyst(String analystIdentifier, ShareAnalystRequest shareAnalystRequest) throws ApiException {
        ApiResponse<Object> localVarResp = shareAnalystWithHttpInfo(analystIdentifier, shareAnalystRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Updates share permissions on a Spotter Analyst, one entry per principal (user or group). &#x60;READ_ONLY&#x60; and &#x60;MODIFY&#x60; grant or change the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it. Granting access also shares the analyst&#39;s data sources with the principal so the analyst keeps working for them. A successful share returns an empty &#x60;204 No Content&#x60; response. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Updates share permissions on a Spotter Analyst for one or more principals (users or groups).  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The analyst is identified by the &#x60;analyst_identifier&#x60; path parameter. The request body contains a &#x60;permissions&#x60; array with one entry per principal:  - &#x60;principal.identifier&#x60; (required): unique identifier of the user or group. - &#x60;principal.type&#x60; (required): &#x60;USER&#x60; or &#x60;USER_GROUP&#x60;. - &#x60;share_mode&#x60; (required): &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; grants (or changes) the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it.  A principal may appear at most once per request. When access is granted, the analyst&#39;s data sources are automatically shared with the principal as well, so the analyst keeps working for them.  A successful request returns an empty &#x60;204 No Content&#x60; response.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as an empty &#x60;permissions&#x60; array, a duplicate principal, or a missing field. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to share. (required)
     * @param shareAnalystRequest  (required)
     * @return ApiResponse&lt;Object&gt;
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
    public ApiResponse<Object> shareAnalystWithHttpInfo(String analystIdentifier, ShareAnalystRequest shareAnalystRequest) throws ApiException {
        okhttp3.Call localVarCall = shareAnalystValidateBeforeCall(analystIdentifier, shareAnalystRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Updates share permissions on a Spotter Analyst, one entry per principal (user or group). &#x60;READ_ONLY&#x60; and &#x60;MODIFY&#x60; grant or change the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it. Granting access also shares the analyst&#39;s data sources with the principal so the analyst keeps working for them. A successful share returns an empty &#x60;204 No Content&#x60; response. Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges.   Version: 26.10.0.cl or later   Updates share permissions on a Spotter Analyst for one or more principals (users or groups).  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The analyst is identified by the &#x60;analyst_identifier&#x60; path parameter. The request body contains a &#x60;permissions&#x60; array with one entry per principal:  - &#x60;principal.identifier&#x60; (required): unique identifier of the user or group. - &#x60;principal.type&#x60; (required): &#x60;USER&#x60; or &#x60;USER_GROUP&#x60;. - &#x60;share_mode&#x60; (required): &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; grants (or changes) the principal&#39;s access; &#x60;NO_ACCESS&#x60; revokes it.  A principal may appear at most once per request. When access is granted, the analyst&#39;s data sources are automatically shared with the principal as well, so the analyst keeps working for them.  A successful request returns an empty &#x60;204 No Content&#x60; response.  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;422&#x60; — validation failure, such as an empty &#x60;permissions&#x60; array, a duplicate principal, or a missing field. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to share. (required)
     * @param shareAnalystRequest  (required)
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
    public okhttp3.Call shareAnalystAsync(String analystIdentifier, ShareAnalystRequest shareAnalystRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = shareAnalystValidateBeforeCall(analystIdentifier, shareAnalystRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAnalyst
     * @param analystIdentifier Unique identifier of the analyst to update. (required)
     * @param updateAnalystRequest  (required)
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
    public okhttp3.Call updateAnalystCall(String analystIdentifier, UpdateAnalystRequest updateAnalystRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateAnalystRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/ai/agent/analysts/{analyst_identifier}/update"
            .replace("{" + "analyst_identifier" + "}", localVarApiClient.escapeString(analystIdentifier.toString()));

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
    private okhttp3.Call updateAnalystValidateBeforeCall(String analystIdentifier, UpdateAnalystRequest updateAnalystRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'analystIdentifier' is set
        if (analystIdentifier == null) {
            throw new ApiException("Missing the required parameter 'analystIdentifier' when calling updateAnalyst(Async)");
        }

        // verify the required parameter 'updateAnalystRequest' is set
        if (updateAnalystRequest == null) {
            throw new ApiException("Missing the required parameter 'updateAnalystRequest' when calling updateAnalyst(Async)");
        }

        return updateAnalystCall(analystIdentifier, updateAnalystRequest, _callback);

    }

    /**
     * 
     *  Updates a Spotter Analyst. The request body is identical to &#x60;createAnalyst&#x60; and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset (no instructions, no MCP connectors, no starter prompts). Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot edit it.   Version: 26.10.0.cl or later   Updates a Spotter Analyst. The request body is identical to the create analyst API, and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with can use it but cannot edit it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. Omitting this field clears any existing instructions. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). Replaces the existing list in full. When new sources are added, they are automatically shared with users the analyst was previously shared with, so those users keep a working analyst. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors. Replaces the existing list in full; omit or pass an empty array to clear. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts, each between 10 and 250 characters; display order follows list position. Replaces the existing list in full; omit or pass an empty array to clear.  If the request is successful, the response contains the updated analyst, including the refreshed &#x60;updated_time_in_millis&#x60; timestamp (epoch milliseconds) and &#x60;updated_by&#x60; user. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, and starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;).  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to update. (required)
     * @param updateAnalystRequest  (required)
     * @return Analyst
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
    public Analyst updateAnalyst(String analystIdentifier, UpdateAnalystRequest updateAnalystRequest) throws ApiException {
        ApiResponse<Analyst> localVarResp = updateAnalystWithHttpInfo(analystIdentifier, updateAnalystRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Updates a Spotter Analyst. The request body is identical to &#x60;createAnalyst&#x60; and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset (no instructions, no MCP connectors, no starter prompts). Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot edit it.   Version: 26.10.0.cl or later   Updates a Spotter Analyst. The request body is identical to the create analyst API, and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with can use it but cannot edit it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. Omitting this field clears any existing instructions. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). Replaces the existing list in full. When new sources are added, they are automatically shared with users the analyst was previously shared with, so those users keep a working analyst. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors. Replaces the existing list in full; omit or pass an empty array to clear. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts, each between 10 and 250 characters; display order follows list position. Replaces the existing list in full; omit or pass an empty array to clear.  If the request is successful, the response contains the updated analyst, including the refreshed &#x60;updated_time_in_millis&#x60; timestamp (epoch milliseconds) and &#x60;updated_by&#x60; user. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, and starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;).  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to update. (required)
     * @param updateAnalystRequest  (required)
     * @return ApiResponse&lt;Analyst&gt;
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
    public ApiResponse<Analyst> updateAnalystWithHttpInfo(String analystIdentifier, UpdateAnalystRequest updateAnalystRequest) throws ApiException {
        okhttp3.Call localVarCall = updateAnalystValidateBeforeCall(analystIdentifier, updateAnalystRequest, null);
        Type localVarReturnType = new TypeToken<Analyst>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Updates a Spotter Analyst. The request body is identical to &#x60;createAnalyst&#x60; and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset (no instructions, no MCP connectors, no starter prompts). Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with cannot edit it.   Version: 26.10.0.cl or later   Updates a Spotter Analyst. The request body is identical to the create analyst API, and the update is a full replace: the analyst is rewritten from the request, and optional fields omitted from the request are reset.  Requires ownership of the analyst, or &#x60;ADMINISTRATION&#x60; or &#x60;CAN_MANAGE_SPOTTER&#x60; privileges. Users the analyst is shared with can use it but cannot edit it. Use a bearer token for the Org in which the analyst exists.  #### Usage guidelines  The request body is flat — all fields are top-level:  - &#x60;name&#x60; (required): display name of the analyst. - &#x60;description&#x60; (required): up to 200 characters. - &#x60;instructions&#x60; (optional): natural-language instructions that guide the agent&#39;s behavior. Instructions that conflict with system guardrails are rejected with &#x60;409&#x60;. Omitting this field clears any existing instructions. - &#x60;sources&#x60; (required): at least one data source the analyst can query, each with an &#x60;identifier&#x60;, an optional &#x60;name&#x60;, and a &#x60;type&#x60; (&#x60;MODEL&#x60;, &#x60;ANSWER&#x60;, &#x60;LIVEBOARD&#x60;, or &#x60;CONVERSATION&#x60;). Replaces the existing list in full. When new sources are added, they are automatically shared with users the analyst was previously shared with, so those users keep a working analyst. - &#x60;mcp_connector_identifiers&#x60; (optional): identifiers of MCP connectors. Replaces the existing list in full; omit or pass an empty array to clear. - &#x60;starter_prompts&#x60; (optional): up to 4 plain-text prompts, each between 10 and 250 characters; display order follows list position. Replaces the existing list in full; omit or pass an empty array to clear.  If the request is successful, the response contains the updated analyst, including the refreshed &#x60;updated_time_in_millis&#x60; timestamp (epoch milliseconds) and &#x60;updated_by&#x60; user. In responses, sources are returned with &#x60;id&#x60; and &#x60;type&#x60;, connector identifiers as &#x60;mcp_connectors&#x60;, and starter prompts as structured objects (&#x60;label&#x60;, &#x60;text&#x60;, &#x60;order&#x60;, &#x60;is_ai_generated&#x60;).  #### Error conditions  - &#x60;400&#x60; — malformed analyst identifier. - &#x60;403&#x60; — the caller is not the analyst&#39;s author and lacks admin / Spotter-management privileges. - &#x60;404&#x60; — no analyst with the given identifier exists in the caller&#39;s Org. - &#x60;409&#x60; — &#x60;instructions&#x60; conflict with system guardrails. - &#x60;422&#x60; — validation failure, such as a missing required field (&#x60;name&#x60;, &#x60;description&#x60;, or &#x60;sources&#x60;), an empty &#x60;sources&#x60; list, too many starter prompts, or field-length violations. - &#x60;429&#x60; — rate limit exceeded.      
     * @param analystIdentifier Unique identifier of the analyst to update. (required)
     * @param updateAnalystRequest  (required)
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
    public okhttp3.Call updateAnalystAsync(String analystIdentifier, UpdateAnalystRequest updateAnalystRequest, final ApiCallback<Analyst> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAnalystValidateBeforeCall(analystIdentifier, updateAnalystRequest, _callback);
        Type localVarReturnType = new TypeToken<Analyst>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
