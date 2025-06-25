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


import com.thoughtspot.client.model.CreateVariableRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.SearchVariablesRequest;
import com.thoughtspot.client.model.UpdateVariableRequest;
import com.thoughtspot.client.model.UpdateVariableValuesRequest;
import com.thoughtspot.client.model.Variable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VariableApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VariableApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VariableApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public VariableApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createVariable
     * @param createVariableRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVariableCall(CreateVariableRequest createVariableRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createVariableRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/template/variables/create";

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
    private okhttp3.Call createVariableValidateBeforeCall(CreateVariableRequest createVariableRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createVariableRequest' is set
        if (createVariableRequest == null) {
            throw new ApiException("Missing the required parameter 'createVariableRequest' when calling createVariable(Async)");
        }

        return createVariableCall(createVariableRequest, _callback);

    }

    /**
     * 
     *  Create a variable which can be used for parameterizing metadata objects   Version: 10.9.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this.  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The variable values (optional)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid * The variable values are invalid for the specified type       
     * @param createVariableRequest  (required)
     * @return Variable
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Variable createVariable(CreateVariableRequest createVariableRequest) throws ApiException {
        ApiResponse<Variable> localVarResp = createVariableWithHttpInfo(createVariableRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Create a variable which can be used for parameterizing metadata objects   Version: 10.9.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this.  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The variable values (optional)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid * The variable values are invalid for the specified type       
     * @param createVariableRequest  (required)
     * @return ApiResponse&lt;Variable&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Variable> createVariableWithHttpInfo(CreateVariableRequest createVariableRequest) throws ApiException {
        okhttp3.Call localVarCall = createVariableValidateBeforeCall(createVariableRequest, null);
        Type localVarReturnType = new TypeToken<Variable>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Create a variable which can be used for parameterizing metadata objects   Version: 10.9.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this.  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The variable values (optional)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid * The variable values are invalid for the specified type       
     * @param createVariableRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVariableAsync(CreateVariableRequest createVariableRequest, final ApiCallback<Variable> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVariableValidateBeforeCall(createVariableRequest, _callback);
        Type localVarReturnType = new TypeToken<Variable>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVariable
     * @param identifier Unique id or name of the variable (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleting the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVariableCall(String identifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/template/variables/{identifier}/delete"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

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
    private okhttp3.Call deleteVariableValidateBeforeCall(String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deleteVariable(Async)");
        }

        return deleteVariableCall(identifier, _callback);

    }

    /**
     * 
     *  Delete a variable   Version: 10.9.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn&#39;t exist * The variable is being used by other objects      
     * @param identifier Unique id or name of the variable (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleting the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void deleteVariable(String identifier) throws ApiException {
        deleteVariableWithHttpInfo(identifier);
    }

    /**
     * 
     *  Delete a variable   Version: 10.9.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn&#39;t exist * The variable is being used by other objects      
     * @param identifier Unique id or name of the variable (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleting the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteVariableWithHttpInfo(String identifier) throws ApiException {
        okhttp3.Call localVarCall = deleteVariableValidateBeforeCall(identifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Delete a variable   Version: 10.9.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn&#39;t exist * The variable is being used by other objects      
     * @param identifier Unique id or name of the variable (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleting the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVariableAsync(String identifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVariableValidateBeforeCall(identifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchVariables
     * @param searchVariablesRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of variables is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchVariablesCall(SearchVariablesRequest searchVariablesRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchVariablesRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/template/variables/search";

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
    private okhttp3.Call searchVariablesValidateBeforeCall(SearchVariablesRequest searchVariablesRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchVariablesRequest' is set
        if (searchVariablesRequest == null) {
            throw new ApiException("Missing the required parameter 'searchVariablesRequest' when calling searchVariables(Async)");
        }

        return searchVariablesCall(searchVariablesRequest, _callback);

    }

    /**
     * 
     *  Search variables   Version: 10.9.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA_ONLY - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values * EDITABLE_METADATA_AND_VALUES - Returns only editable variable metadata and values       
     * @param searchVariablesRequest  (required)
     * @return List&lt;Variable&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of variables is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<Variable> searchVariables(SearchVariablesRequest searchVariablesRequest) throws ApiException {
        ApiResponse<List<Variable>> localVarResp = searchVariablesWithHttpInfo(searchVariablesRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Search variables   Version: 10.9.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA_ONLY - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values * EDITABLE_METADATA_AND_VALUES - Returns only editable variable metadata and values       
     * @param searchVariablesRequest  (required)
     * @return ApiResponse&lt;List&lt;Variable&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of variables is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Variable>> searchVariablesWithHttpInfo(SearchVariablesRequest searchVariablesRequest) throws ApiException {
        okhttp3.Call localVarCall = searchVariablesValidateBeforeCall(searchVariablesRequest, null);
        Type localVarReturnType = new TypeToken<List<Variable>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Search variables   Version: 10.9.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA_ONLY - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values * EDITABLE_METADATA_AND_VALUES - Returns only editable variable metadata and values       
     * @param searchVariablesRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of variables is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchVariablesAsync(SearchVariablesRequest searchVariablesRequest, final ApiCallback<List<Variable>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchVariablesValidateBeforeCall(searchVariablesRequest, _callback);
        Type localVarReturnType = new TypeToken<List<Variable>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVariable
     * @param identifier Unique id or name of the variable to update. (required)
     * @param updateVariableRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariableCall(String identifier, UpdateVariableRequest updateVariableRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateVariableRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/template/variables/{identifier}/update"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

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
    private okhttp3.Call updateVariableValidateBeforeCall(String identifier, UpdateVariableRequest updateVariableRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling updateVariable(Async)");
        }

        // verify the required parameter 'updateVariableRequest' is set
        if (updateVariableRequest == null) {
            throw new ApiException("Missing the required parameter 'updateVariableRequest' when calling updateVariable(Async)");
        }

        return updateVariableCall(identifier, updateVariableRequest, _callback);

    }

    /**
     * 
     *  Update a variable&#39;s properties   Version: 10.9.0.cl or later   Allows updating a variable&#39;s properties in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows updating: * The variable name * The variable values  When updating variable values, you need to specify: * The operation to perform (ADD, REPLACE, REMOVE) * The new values to add/replace/remove  When the operation is ADD, a value any pre-existing value with the same set of constraints will be replaced. When the operation is REPLACE, all values of the variable are replaced with the values specified. When the operation is REMOVE, all values with the given set of conditions are removed.      
     * @param identifier Unique id or name of the variable to update. (required)
     * @param updateVariableRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void updateVariable(String identifier, UpdateVariableRequest updateVariableRequest) throws ApiException {
        updateVariableWithHttpInfo(identifier, updateVariableRequest);
    }

    /**
     * 
     *  Update a variable&#39;s properties   Version: 10.9.0.cl or later   Allows updating a variable&#39;s properties in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows updating: * The variable name * The variable values  When updating variable values, you need to specify: * The operation to perform (ADD, REPLACE, REMOVE) * The new values to add/replace/remove  When the operation is ADD, a value any pre-existing value with the same set of constraints will be replaced. When the operation is REPLACE, all values of the variable are replaced with the values specified. When the operation is REMOVE, all values with the given set of conditions are removed.      
     * @param identifier Unique id or name of the variable to update. (required)
     * @param updateVariableRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateVariableWithHttpInfo(String identifier, UpdateVariableRequest updateVariableRequest) throws ApiException {
        okhttp3.Call localVarCall = updateVariableValidateBeforeCall(identifier, updateVariableRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Update a variable&#39;s properties   Version: 10.9.0.cl or later   Allows updating a variable&#39;s properties in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows updating: * The variable name * The variable values  When updating variable values, you need to specify: * The operation to perform (ADD, REPLACE, REMOVE) * The new values to add/replace/remove  When the operation is ADD, a value any pre-existing value with the same set of constraints will be replaced. When the operation is REPLACE, all values of the variable are replaced with the values specified. When the operation is REMOVE, all values with the given set of conditions are removed.      
     * @param identifier Unique id or name of the variable to update. (required)
     * @param updateVariableRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating the variable is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariableAsync(String identifier, UpdateVariableRequest updateVariableRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateVariableValidateBeforeCall(identifier, updateVariableRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVariableValues
     * @param updateVariableValuesRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating variable values is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariableValuesCall(UpdateVariableValuesRequest updateVariableValuesRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateVariableValuesRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/template/variables/update";

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
    private okhttp3.Call updateVariableValuesValidateBeforeCall(UpdateVariableValuesRequest updateVariableValuesRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateVariableValuesRequest' is set
        if (updateVariableValuesRequest == null) {
            throw new ApiException("Missing the required parameter 'updateVariableValuesRequest' when calling updateVariableValues(Async)");
        }

        return updateVariableValuesCall(updateVariableValuesRequest, _callback);

    }

    /**
     * 
     *  Update values for multiple variables   Version: 10.9.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE)  Behaviour based on operation type: * ADD - Adds values to the variable. Any pre-existing values with the same conditions are replaced. * REPLACE - Replaces all values of a given org with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables.      
     * @param updateVariableValuesRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating variable values is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void updateVariableValues(UpdateVariableValuesRequest updateVariableValuesRequest) throws ApiException {
        updateVariableValuesWithHttpInfo(updateVariableValuesRequest);
    }

    /**
     * 
     *  Update values for multiple variables   Version: 10.9.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE)  Behaviour based on operation type: * ADD - Adds values to the variable. Any pre-existing values with the same conditions are replaced. * REPLACE - Replaces all values of a given org with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables.      
     * @param updateVariableValuesRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating variable values is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateVariableValuesWithHttpInfo(UpdateVariableValuesRequest updateVariableValuesRequest) throws ApiException {
        okhttp3.Call localVarCall = updateVariableValuesValidateBeforeCall(updateVariableValuesRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Update values for multiple variables   Version: 10.9.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE)  Behaviour based on operation type: * ADD - Adds values to the variable. Any pre-existing values with the same conditions are replaced. * REPLACE - Replaces all values of a given org with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables.      
     * @param updateVariableValuesRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Updating variable values is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariableValuesAsync(UpdateVariableValuesRequest updateVariableValuesRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateVariableValuesValidateBeforeCall(updateVariableValuesRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
