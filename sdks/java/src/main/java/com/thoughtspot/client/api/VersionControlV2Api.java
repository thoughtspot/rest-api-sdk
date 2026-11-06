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


import com.thoughtspot.client.model.CreateCommitRequest;
import com.thoughtspot.client.model.CreateVersionControlConfigRequest;
import com.thoughtspot.client.model.DeployRevisionRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.PromoteBranchRequest;
import com.thoughtspot.client.model.RestoreRevisionRequest;
import com.thoughtspot.client.model.SearchVersionControlRunsRequest;
import com.thoughtspot.client.model.UpdateVersionControlConfigRequest;
import com.thoughtspot.client.model.VersionControlCommitResponse;
import com.thoughtspot.client.model.VersionControlConfig;
import com.thoughtspot.client.model.VersionControlConfigList;
import com.thoughtspot.client.model.VersionControlDeployResponse;
import com.thoughtspot.client.model.VersionControlPromotionResponse;
import com.thoughtspot.client.model.VersionControlRestoreResponse;
import com.thoughtspot.client.model.VersionControlRunList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlV2Api {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VersionControlV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public VersionControlV2Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public VersionControlV2Api(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createCommit
     * @param createCommitRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the versioning run has started. The body is a receipt, not a result: nothing is committed or pushed yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, object ids not enabled, an object that does not resolve or has no object id, a name given without its type, a type that does not match the object, a paused repository, and an org whose disabled_operations holds COMMIT. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. A name matches more than one object of the given type; name the object by GUID or object id instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCommitCall(CreateCommitRequest createCommitRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createCommitRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/version-control/commit";

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
    private okhttp3.Call createCommitValidateBeforeCall(CreateCommitRequest createCommitRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createCommitRequest' is set
        if (createCommitRequest == null) {
            throw new ApiException("Missing the required parameter 'createCommitRequest' when calling createCommit(Async)");
        }

        return createCommitCall(createCommitRequest, _callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Starts a versioning run that exports the named objects, such as Liveboards and Answers, and commits them to the branch your Org versions to. Name each object by GUID, object ID, or name with its type; it is resolved in your Org and committed by its cross-Org object ID, so object IDs must be enabled on the cluster. An object named more than once is committed once. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60;, and nothing is committed or pushed before it returns.  Admission is all or nothing, so a 4xx means nothing was admitted and the request is safe to correct and retry. Read the per-object outcomes from the run search endpoint using the returned &#x60;run_id&#x60;.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param createCommitRequest  (required)
     * @return VersionControlCommitResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the versioning run has started. The body is a receipt, not a result: nothing is committed or pushed yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, object ids not enabled, an object that does not resolve or has no object id, a name given without its type, a type that does not match the object, a paused repository, and an org whose disabled_operations holds COMMIT. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. A name matches more than one object of the given type; name the object by GUID or object id instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public VersionControlCommitResponse createCommit(CreateCommitRequest createCommitRequest) throws ApiException {
        ApiResponse<VersionControlCommitResponse> localVarResp = createCommitWithHttpInfo(createCommitRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Starts a versioning run that exports the named objects, such as Liveboards and Answers, and commits them to the branch your Org versions to. Name each object by GUID, object ID, or name with its type; it is resolved in your Org and committed by its cross-Org object ID, so object IDs must be enabled on the cluster. An object named more than once is committed once. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60;, and nothing is committed or pushed before it returns.  Admission is all or nothing, so a 4xx means nothing was admitted and the request is safe to correct and retry. Read the per-object outcomes from the run search endpoint using the returned &#x60;run_id&#x60;.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param createCommitRequest  (required)
     * @return ApiResponse&lt;VersionControlCommitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the versioning run has started. The body is a receipt, not a result: nothing is committed or pushed yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, object ids not enabled, an object that does not resolve or has no object id, a name given without its type, a type that does not match the object, a paused repository, and an org whose disabled_operations holds COMMIT. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. A name matches more than one object of the given type; name the object by GUID or object id instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionControlCommitResponse> createCommitWithHttpInfo(CreateCommitRequest createCommitRequest) throws ApiException {
        okhttp3.Call localVarCall = createCommitValidateBeforeCall(createCommitRequest, null);
        Type localVarReturnType = new TypeToken<VersionControlCommitResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Starts a versioning run that exports the named objects, such as Liveboards and Answers, and commits them to the branch your Org versions to. Name each object by GUID, object ID, or name with its type; it is resolved in your Org and committed by its cross-Org object ID, so object IDs must be enabled on the cluster. An object named more than once is committed once. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60;, and nothing is committed or pushed before it returns.  Admission is all or nothing, so a 4xx means nothing was admitted and the request is safe to correct and retry. Read the per-object outcomes from the run search endpoint using the returned &#x60;run_id&#x60;.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param createCommitRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the versioning run has started. The body is a receipt, not a result: nothing is committed or pushed yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, object ids not enabled, an object that does not resolve or has no object id, a name given without its type, a type that does not match the object, a paused repository, and an org whose disabled_operations holds COMMIT. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. A name matches more than one object of the given type; name the object by GUID or object id instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCommitAsync(CreateCommitRequest createCommitRequest, final ApiCallback<VersionControlCommitResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createCommitValidateBeforeCall(createCommitRequest, _callback);
        Type localVarReturnType = new TypeToken<VersionControlCommitResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createVersionControlConfig
     * @param createVersionControlConfigRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The stored configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. The org is already configured, another org already commits to this repository and branch, or the org is still served by the legacy Callosum VCS surface. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVersionControlConfigCall(CreateVersionControlConfigRequest createVersionControlConfigRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createVersionControlConfigRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/version-control/config/create";

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
    private okhttp3.Call createVersionControlConfigValidateBeforeCall(CreateVersionControlConfigRequest createVersionControlConfigRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createVersionControlConfigRequest' is set
        if (createVersionControlConfigRequest == null) {
            throw new ApiException("Missing the required parameter 'createVersionControlConfigRequest' when calling createVersionControlConfig(Async)");
        }

        return createVersionControlConfigCall(createVersionControlConfigRequest, _callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Configures version control for your Org, connecting it to a Git repository and the branch that versioning runs commit to.  Use this once per Org before any commit, deploy or restore. To stop versioning without discarding the settings, send &#x60;disabled_operations&#x60; on the update endpoint instead of deleting the configuration.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param createVersionControlConfigRequest  (required)
     * @return VersionControlConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The stored configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. The org is already configured, another org already commits to this repository and branch, or the org is still served by the legacy Callosum VCS surface. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public VersionControlConfig createVersionControlConfig(CreateVersionControlConfigRequest createVersionControlConfigRequest) throws ApiException {
        ApiResponse<VersionControlConfig> localVarResp = createVersionControlConfigWithHttpInfo(createVersionControlConfigRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Configures version control for your Org, connecting it to a Git repository and the branch that versioning runs commit to.  Use this once per Org before any commit, deploy or restore. To stop versioning without discarding the settings, send &#x60;disabled_operations&#x60; on the update endpoint instead of deleting the configuration.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param createVersionControlConfigRequest  (required)
     * @return ApiResponse&lt;VersionControlConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The stored configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. The org is already configured, another org already commits to this repository and branch, or the org is still served by the legacy Callosum VCS surface. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionControlConfig> createVersionControlConfigWithHttpInfo(CreateVersionControlConfigRequest createVersionControlConfigRequest) throws ApiException {
        okhttp3.Call localVarCall = createVersionControlConfigValidateBeforeCall(createVersionControlConfigRequest, null);
        Type localVarReturnType = new TypeToken<VersionControlConfig>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Configures version control for your Org, connecting it to a Git repository and the branch that versioning runs commit to.  Use this once per Org before any commit, deploy or restore. To stop versioning without discarding the settings, send &#x60;disabled_operations&#x60; on the update endpoint instead of deleting the configuration.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param createVersionControlConfigRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The stored configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. The org is already configured, another org already commits to this repository and branch, or the org is still served by the legacy Callosum VCS surface. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVersionControlConfigAsync(CreateVersionControlConfigRequest createVersionControlConfigRequest, final ApiCallback<VersionControlConfig> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVersionControlConfigValidateBeforeCall(createVersionControlConfigRequest, _callback);
        Type localVarReturnType = new TypeToken<VersionControlConfig>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVersionControlConfig
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully revoked version control for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVersionControlConfigCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/version-control/config/delete";

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
    private okhttp3.Call deleteVersionControlConfigValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return deleteVersionControlConfigCall(_callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Revokes version control for your Org. The configuration is deleted, the stored credential is destroyed, and any versioning run in flight for the Org fails.  Use this to disconnect an Org from its repository for good. To stop versioning but keep the settings and credential, set &#x60;disabled_operations&#x60; on the update endpoint instead.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully revoked version control for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public void deleteVersionControlConfig() throws ApiException {
        deleteVersionControlConfigWithHttpInfo();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Revokes version control for your Org. The configuration is deleted, the stored credential is destroyed, and any versioning run in flight for the Org fails.  Use this to disconnect an Org from its repository for good. To stop versioning but keep the settings and credential, set &#x60;disabled_operations&#x60; on the update endpoint instead.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully revoked version control for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteVersionControlConfigWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = deleteVersionControlConfigValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Revokes version control for your Org. The configuration is deleted, the stored credential is destroyed, and any versioning run in flight for the Org fails.  Use this to disconnect an Org from its repository for good. To stop versioning but keep the settings and credential, set &#x60;disabled_operations&#x60; on the update endpoint instead.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully revoked version control for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVersionControlConfigAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVersionControlConfigValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deployRevision
     * @param deployRevisionRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the deploy run has started. The body is a receipt, not a result: nothing is imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, an unknown, ambiguous or unreachable target_revision, a paused repository, and an org whose disabled_operations holds DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another deploy, restore or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deployRevisionCall(DeployRevisionRequest deployRevisionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = deployRevisionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/version-control/deploy";

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
    private okhttp3.Call deployRevisionValidateBeforeCall(DeployRevisionRequest deployRevisionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'deployRevisionRequest' is set
        if (deployRevisionRequest == null) {
            throw new ApiException("Missing the required parameter 'deployRevisionRequest' when calling deployRevision(Async)");
        }

        return deployRevisionCall(deployRevisionRequest, _callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Starts a run that imports repository content from the branch your Org versions to into the Org itself. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60; and the pinned revision.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param deployRevisionRequest  (required)
     * @return VersionControlDeployResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the deploy run has started. The body is a receipt, not a result: nothing is imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, an unknown, ambiguous or unreachable target_revision, a paused repository, and an org whose disabled_operations holds DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another deploy, restore or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public VersionControlDeployResponse deployRevision(DeployRevisionRequest deployRevisionRequest) throws ApiException {
        ApiResponse<VersionControlDeployResponse> localVarResp = deployRevisionWithHttpInfo(deployRevisionRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Starts a run that imports repository content from the branch your Org versions to into the Org itself. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60; and the pinned revision.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param deployRevisionRequest  (required)
     * @return ApiResponse&lt;VersionControlDeployResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the deploy run has started. The body is a receipt, not a result: nothing is imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, an unknown, ambiguous or unreachable target_revision, a paused repository, and an org whose disabled_operations holds DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another deploy, restore or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionControlDeployResponse> deployRevisionWithHttpInfo(DeployRevisionRequest deployRevisionRequest) throws ApiException {
        okhttp3.Call localVarCall = deployRevisionValidateBeforeCall(deployRevisionRequest, null);
        Type localVarReturnType = new TypeToken<VersionControlDeployResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Starts a run that imports repository content from the branch your Org versions to into the Org itself. The run is asynchronous: the response is an admission receipt carrying a &#x60;run_id&#x60; and the pinned revision.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param deployRevisionRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the deploy run has started. The body is a receipt, not a result: nothing is imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, an unknown, ambiguous or unreachable target_revision, a paused repository, and an org whose disabled_operations holds DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another deploy, restore or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deployRevisionAsync(DeployRevisionRequest deployRevisionRequest, final ApiCallback<VersionControlDeployResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deployRevisionValidateBeforeCall(deployRevisionRequest, _callback);
        Type localVarReturnType = new TypeToken<VersionControlDeployResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for promoteBranch
     * @param promoteBranchRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The promotion was carried out, or with dry_run true would have been. Conflicting content appears here only when conflict_policy resolved it. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The promotion could not be carried out, and nothing was written. Covers a source that names both or neither of an org and a branch, a cherry-pick with no source_revision, a source org that versions to a different repository, a source_branch that no org in the caller&#39;s repository versions to, an unknown branch or commit, content that conflicts while conflict_policy is FAIL_REQUEST, which is equally a 400 on a dry run because the real promotion could not have completed either, branches with unrelated histories, and a target branch the provider protects. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. Also returned when the caller is neither a tenant administrator nor an administrator of the source org. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> An org involved has no version control configuration: the caller&#39;s org, which then has no branch to promote into, or the org named by source.org_identifier, which then has none to promote from. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promoteBranchCall(PromoteBranchRequest promoteBranchRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = promoteBranchRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/version-control/branch/promote";

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
    private okhttp3.Call promoteBranchValidateBeforeCall(PromoteBranchRequest promoteBranchRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'promoteBranchRequest' is set
        if (promoteBranchRequest == null) {
            throw new ApiException("Missing the required parameter 'promoteBranchRequest' when calling promoteBranch(Async)");
        }

        return promoteBranchCall(promoteBranchRequest, _callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Merges content from another Org&#39;s branch, or from a branch named directly, into the branch your Org versions to, and pushes the result. This is a repository-only operation: no Org&#39;s live content changes until a deploy.  &#x60;dry_run&#x60; defaults to true, so a request that omits it reports what would change and writes nothing. Name the source by Org or by branch; a branch must be the one some Org in your repository versions to, and the source Org must use the same repository as yours. Promoting from any Org other than your own also requires tenant administration privilege, or &#x60;ADMINISTRATION&#x60; privilege in the source Org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param promoteBranchRequest  (required)
     * @return VersionControlPromotionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The promotion was carried out, or with dry_run true would have been. Conflicting content appears here only when conflict_policy resolved it. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The promotion could not be carried out, and nothing was written. Covers a source that names both or neither of an org and a branch, a cherry-pick with no source_revision, a source org that versions to a different repository, a source_branch that no org in the caller&#39;s repository versions to, an unknown branch or commit, content that conflicts while conflict_policy is FAIL_REQUEST, which is equally a 400 on a dry run because the real promotion could not have completed either, branches with unrelated histories, and a target branch the provider protects. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. Also returned when the caller is neither a tenant administrator nor an administrator of the source org. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> An org involved has no version control configuration: the caller&#39;s org, which then has no branch to promote into, or the org named by source.org_identifier, which then has none to promote from. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public VersionControlPromotionResponse promoteBranch(PromoteBranchRequest promoteBranchRequest) throws ApiException {
        ApiResponse<VersionControlPromotionResponse> localVarResp = promoteBranchWithHttpInfo(promoteBranchRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Merges content from another Org&#39;s branch, or from a branch named directly, into the branch your Org versions to, and pushes the result. This is a repository-only operation: no Org&#39;s live content changes until a deploy.  &#x60;dry_run&#x60; defaults to true, so a request that omits it reports what would change and writes nothing. Name the source by Org or by branch; a branch must be the one some Org in your repository versions to, and the source Org must use the same repository as yours. Promoting from any Org other than your own also requires tenant administration privilege, or &#x60;ADMINISTRATION&#x60; privilege in the source Org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param promoteBranchRequest  (required)
     * @return ApiResponse&lt;VersionControlPromotionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The promotion was carried out, or with dry_run true would have been. Conflicting content appears here only when conflict_policy resolved it. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The promotion could not be carried out, and nothing was written. Covers a source that names both or neither of an org and a branch, a cherry-pick with no source_revision, a source org that versions to a different repository, a source_branch that no org in the caller&#39;s repository versions to, an unknown branch or commit, content that conflicts while conflict_policy is FAIL_REQUEST, which is equally a 400 on a dry run because the real promotion could not have completed either, branches with unrelated histories, and a target branch the provider protects. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. Also returned when the caller is neither a tenant administrator nor an administrator of the source org. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> An org involved has no version control configuration: the caller&#39;s org, which then has no branch to promote into, or the org named by source.org_identifier, which then has none to promote from. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionControlPromotionResponse> promoteBranchWithHttpInfo(PromoteBranchRequest promoteBranchRequest) throws ApiException {
        okhttp3.Call localVarCall = promoteBranchValidateBeforeCall(promoteBranchRequest, null);
        Type localVarReturnType = new TypeToken<VersionControlPromotionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Merges content from another Org&#39;s branch, or from a branch named directly, into the branch your Org versions to, and pushes the result. This is a repository-only operation: no Org&#39;s live content changes until a deploy.  &#x60;dry_run&#x60; defaults to true, so a request that omits it reports what would change and writes nothing. Name the source by Org or by branch; a branch must be the one some Org in your repository versions to, and the source Org must use the same repository as yours. Promoting from any Org other than your own also requires tenant administration privilege, or &#x60;ADMINISTRATION&#x60; privilege in the source Org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param promoteBranchRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The promotion was carried out, or with dry_run true would have been. Conflicting content appears here only when conflict_policy resolved it. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The promotion could not be carried out, and nothing was written. Covers a source that names both or neither of an org and a branch, a cherry-pick with no source_revision, a source org that versions to a different repository, a source_branch that no org in the caller&#39;s repository versions to, an unknown branch or commit, content that conflicts while conflict_policy is FAIL_REQUEST, which is equally a 400 on a dry run because the real promotion could not have completed either, branches with unrelated histories, and a target branch the provider protects. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. Also returned when the caller is neither a tenant administrator nor an administrator of the source org. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> An org involved has no version control configuration: the caller&#39;s org, which then has no branch to promote into, or the org named by source.org_identifier, which then has none to promote from. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call promoteBranchAsync(PromoteBranchRequest promoteBranchRequest, final ApiCallback<VersionControlPromotionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = promoteBranchValidateBeforeCall(promoteBranchRequest, _callback);
        Type localVarReturnType = new TypeToken<VersionControlPromotionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for restoreRevision
     * @param restoreRevisionRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the restore run has started. The body is a receipt, not a result: nothing is committed or imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, a target_revision that is unknown, ambiguous, unreachable from the branch or is its head, a paused repository, and an org whose disabled_operations holds COMMIT or DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another restore, deploy or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call restoreRevisionCall(RestoreRevisionRequest restoreRevisionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = restoreRevisionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/version-control/commit/restore";

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
    private okhttp3.Call restoreRevisionValidateBeforeCall(RestoreRevisionRequest restoreRevisionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'restoreRevisionRequest' is set
        if (restoreRevisionRequest == null) {
            throw new ApiException("Missing the required parameter 'restoreRevisionRequest' when calling restoreRevision(Async)");
        }

        return restoreRevisionCall(restoreRevisionRequest, _callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Starts a run that restores the branch your Org versions to, and the Org itself, to an earlier revision. The revision must be reachable from the configured branch and must not be its head. The run is asynchronous and returns an admission receipt carrying a &#x60;run_id&#x60;.  Use this to roll an Org back to a known-good revision. It both commits and deploys, so it carries the same consequences as a deploy: the Org is overwritten, and objects whose files are not present at the target revision are deleted.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param restoreRevisionRequest  (required)
     * @return VersionControlRestoreResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the restore run has started. The body is a receipt, not a result: nothing is committed or imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, a target_revision that is unknown, ambiguous, unreachable from the branch or is its head, a paused repository, and an org whose disabled_operations holds COMMIT or DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another restore, deploy or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public VersionControlRestoreResponse restoreRevision(RestoreRevisionRequest restoreRevisionRequest) throws ApiException {
        ApiResponse<VersionControlRestoreResponse> localVarResp = restoreRevisionWithHttpInfo(restoreRevisionRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Starts a run that restores the branch your Org versions to, and the Org itself, to an earlier revision. The revision must be reachable from the configured branch and must not be its head. The run is asynchronous and returns an admission receipt carrying a &#x60;run_id&#x60;.  Use this to roll an Org back to a known-good revision. It both commits and deploys, so it carries the same consequences as a deploy: the Org is overwritten, and objects whose files are not present at the target revision are deleted.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param restoreRevisionRequest  (required)
     * @return ApiResponse&lt;VersionControlRestoreResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the restore run has started. The body is a receipt, not a result: nothing is committed or imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, a target_revision that is unknown, ambiguous, unreachable from the branch or is its head, a paused repository, and an org whose disabled_operations holds COMMIT or DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another restore, deploy or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionControlRestoreResponse> restoreRevisionWithHttpInfo(RestoreRevisionRequest restoreRevisionRequest) throws ApiException {
        okhttp3.Call localVarCall = restoreRevisionValidateBeforeCall(restoreRevisionRequest, null);
        Type localVarReturnType = new TypeToken<VersionControlRestoreResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Starts a run that restores the branch your Org versions to, and the Org itself, to an earlier revision. The revision must be reachable from the configured branch and must not be its head. The run is asynchronous and returns an admission receipt carrying a &#x60;run_id&#x60;.  Use this to roll an Org back to a known-good revision. It both commits and deploys, so it carries the same consequences as a deploy: the Org is overwritten, and objects whose files are not present at the target revision are deleted.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param restoreRevisionRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was admitted and the restore run has started. The body is a receipt, not a result: nothing is committed or imported yet. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request, and nothing was admitted. Covers a malformed body, a target_revision that is unknown, ambiguous, unreachable from the branch or is its head, a paused repository, and an org whose disabled_operations holds COMMIT or DEPLOY. error.message names the reason. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The caller&#39;s org has no version control configuration. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict. Another restore, deploy or versioning run is already in flight for the caller&#39;s org. Nothing was started; retry once it finishes. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call restoreRevisionAsync(RestoreRevisionRequest restoreRevisionRequest, final ApiCallback<VersionControlRestoreResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = restoreRevisionValidateBeforeCall(restoreRevisionRequest, _callback);
        Type localVarReturnType = new TypeToken<VersionControlRestoreResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchVersionControlConfigs
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zero or one configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchVersionControlConfigsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/version-control/config/search";

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
    private okhttp3.Call searchVersionControlConfigsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return searchVersionControlConfigsCall(_callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Returns your Org&#39;s version control configuration, or an empty list when the Org is not configured. The stored credential is never included; only its type and username are reported.  Use this to confirm which repository and branch an Org versions to before starting a run. The response is a list because the scope will widen to several Orgs in a later release.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @return VersionControlConfigList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zero or one configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public VersionControlConfigList searchVersionControlConfigs() throws ApiException {
        ApiResponse<VersionControlConfigList> localVarResp = searchVersionControlConfigsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Returns your Org&#39;s version control configuration, or an empty list when the Org is not configured. The stored credential is never included; only its type and username are reported.  Use this to confirm which repository and branch an Org versions to before starting a run. The response is a list because the scope will widen to several Orgs in a later release.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @return ApiResponse&lt;VersionControlConfigList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zero or one configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionControlConfigList> searchVersionControlConfigsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = searchVersionControlConfigsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<VersionControlConfigList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Returns your Org&#39;s version control configuration, or an empty list when the Org is not configured. The stored credential is never included; only its type and username are reported.  Use this to confirm which repository and branch an Org versions to before starting a run. The response is a list because the scope will widen to several Orgs in a later release.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zero or one configuration. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchVersionControlConfigsAsync(final ApiCallback<VersionControlConfigList> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchVersionControlConfigsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<VersionControlConfigList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchVersionControlRuns
     * @param searchVersionControlRunsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The runs&#39; current outcomes. A run identifier that does not exist in the caller&#39;s org is left out, not reported as an error. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. Covers a malformed body, a run identifier that is not a UUID, more than 100 run_identifiers, more than 50 objects, an object identifier that is not a well-formed object id, an object type other than LIVEBOARD, ANSWER or LOGICAL_TABLE, an unknown run_type, and a record_offset or record_size out of range. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchVersionControlRunsCall(SearchVersionControlRunsRequest searchVersionControlRunsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchVersionControlRunsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/version-control/runs/search";

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
    private okhttp3.Call searchVersionControlRunsValidateBeforeCall(SearchVersionControlRunsRequest searchVersionControlRunsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchVersionControlRunsRequest' is set
        if (searchVersionControlRunsRequest == null) {
            throw new ApiException("Missing the required parameter 'searchVersionControlRunsRequest' when calling searchVersionControlRuns(Async)");
        }

        return searchVersionControlRunsCall(searchVersionControlRunsRequest, _callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Returns the commit, deploy and restore runs for your Org, newest first, each with its current state and its per-object outcomes. This is the only place per-object results are reported: a commit, deploy or restore receipt carries only a &#x60;run_id&#x60;.  Use this to follow a run to completion, to explain a &#x60;PARTIAL_SUCCESS&#x60;, or to read an Org&#39;s commit history by filtering on &#x60;run_type&#x60; &#x60;COMMIT&#x60;. Filters combine with AND. Filter by object using object IDs; a deleted object can still be named, so its history stays searchable. Page through the results with &#x60;record_offset&#x60; and &#x60;record_size&#x60;, which accepts between 1 and 100 runs.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param searchVersionControlRunsRequest  (required)
     * @return VersionControlRunList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The runs&#39; current outcomes. A run identifier that does not exist in the caller&#39;s org is left out, not reported as an error. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. Covers a malformed body, a run identifier that is not a UUID, more than 100 run_identifiers, more than 50 objects, an object identifier that is not a well-formed object id, an object type other than LIVEBOARD, ANSWER or LOGICAL_TABLE, an unknown run_type, and a record_offset or record_size out of range. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public VersionControlRunList searchVersionControlRuns(SearchVersionControlRunsRequest searchVersionControlRunsRequest) throws ApiException {
        ApiResponse<VersionControlRunList> localVarResp = searchVersionControlRunsWithHttpInfo(searchVersionControlRunsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Returns the commit, deploy and restore runs for your Org, newest first, each with its current state and its per-object outcomes. This is the only place per-object results are reported: a commit, deploy or restore receipt carries only a &#x60;run_id&#x60;.  Use this to follow a run to completion, to explain a &#x60;PARTIAL_SUCCESS&#x60;, or to read an Org&#39;s commit history by filtering on &#x60;run_type&#x60; &#x60;COMMIT&#x60;. Filters combine with AND. Filter by object using object IDs; a deleted object can still be named, so its history stays searchable. Page through the results with &#x60;record_offset&#x60; and &#x60;record_size&#x60;, which accepts between 1 and 100 runs.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param searchVersionControlRunsRequest  (required)
     * @return ApiResponse&lt;VersionControlRunList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The runs&#39; current outcomes. A run identifier that does not exist in the caller&#39;s org is left out, not reported as an error. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. Covers a malformed body, a run identifier that is not a UUID, more than 100 run_identifiers, more than 50 objects, an object identifier that is not a well-formed object id, an object type other than LIVEBOARD, ANSWER or LOGICAL_TABLE, an unknown run_type, and a record_offset or record_size out of range. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionControlRunList> searchVersionControlRunsWithHttpInfo(SearchVersionControlRunsRequest searchVersionControlRunsRequest) throws ApiException {
        okhttp3.Call localVarCall = searchVersionControlRunsValidateBeforeCall(searchVersionControlRunsRequest, null);
        Type localVarReturnType = new TypeToken<VersionControlRunList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Returns the commit, deploy and restore runs for your Org, newest first, each with its current state and its per-object outcomes. This is the only place per-object results are reported: a commit, deploy or restore receipt carries only a &#x60;run_id&#x60;.  Use this to follow a run to completion, to explain a &#x60;PARTIAL_SUCCESS&#x60;, or to read an Org&#39;s commit history by filtering on &#x60;run_type&#x60; &#x60;COMMIT&#x60;. Filters combine with AND. Filter by object using object IDs; a deleted object can still be named, so its history stays searchable. Page through the results with &#x60;record_offset&#x60; and &#x60;record_size&#x60;, which accepts between 1 and 100 runs.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param searchVersionControlRunsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The runs&#39; current outcomes. A run identifier that does not exist in the caller&#39;s org is left out, not reported as an error. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. Covers a malformed body, a run identifier that is not a UUID, more than 100 run_identifiers, more than 50 objects, an object identifier that is not a well-formed object id, an object type other than LIVEBOARD, ANSWER or LOGICAL_TABLE, an unknown run_type, and a record_offset or record_size out of range. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchVersionControlRunsAsync(SearchVersionControlRunsRequest searchVersionControlRunsRequest, final ApiCallback<VersionControlRunList> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchVersionControlRunsValidateBeforeCall(searchVersionControlRunsRequest, _callback);
        Type localVarReturnType = new TypeToken<VersionControlRunList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVersionControlConfig
     * @param updateVersionControlConfigRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the version control configuration for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVersionControlConfigCall(UpdateVersionControlConfigRequest updateVersionControlConfigRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateVersionControlConfigRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/version-control/config/update";

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
    private okhttp3.Call updateVersionControlConfigValidateBeforeCall(UpdateVersionControlConfigRequest updateVersionControlConfigRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateVersionControlConfigRequest' is set
        if (updateVersionControlConfigRequest == null) {
            throw new ApiException("Missing the required parameter 'updateVersionControlConfigRequest' when calling updateVersionControlConfig(Async)");
        }

        return updateVersionControlConfigCall(updateVersionControlConfigRequest, _callback);

    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Changes your Org&#39;s version control configuration. Every field is optional and an omitted field keeps its stored value, so nothing is reset by leaving it out.  Use this to rotate a credential, move to a different branch, or turn individual operations off through &#x60;disabled_operations&#x60;. Changing the provider, repository, branch, directory or credential fails any versioning run already in flight.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param updateVersionControlConfigRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the version control configuration for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public void updateVersionControlConfig(UpdateVersionControlConfigRequest updateVersionControlConfigRequest) throws ApiException {
        updateVersionControlConfigWithHttpInfo(updateVersionControlConfigRequest);
    }

    /**
     * 
     *  Version: 26.12.0.cl or later   Changes your Org&#39;s version control configuration. Every field is optional and an omitted field keeps its stored value, so nothing is reset by leaving it out.  Use this to rotate a credential, move to a different branch, or turn individual operations off through &#x60;disabled_operations&#x60;. Changing the provider, repository, branch, directory or credential fails any versioning run already in flight.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param updateVersionControlConfigRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the version control configuration for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateVersionControlConfigWithHttpInfo(UpdateVersionControlConfigRequest updateVersionControlConfigRequest) throws ApiException {
        okhttp3.Call localVarCall = updateVersionControlConfigValidateBeforeCall(updateVersionControlConfigRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Version: 26.12.0.cl or later   Changes your Org&#39;s version control configuration. Every field is optional and an omitted field keeps its stored value, so nothing is reset by leaving it out.  Use this to rotate a credential, move to a different branch, or turn individual operations off through &#x60;disabled_operations&#x60;. Changing the provider, repository, branch, directory or credential fails any versioning run already in flight.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     * @param updateVersionControlConfigRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully updated the version control configuration for the Org. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVersionControlConfigAsync(UpdateVersionControlConfigRequest updateVersionControlConfigRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateVersionControlConfigValidateBeforeCall(updateVersionControlConfigRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
