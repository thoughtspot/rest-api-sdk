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


import com.thoughtspot.client.model.ConnectionConfigurationResponse;
import com.thoughtspot.client.model.ConnectionConfigurationSearchRequest;
import com.thoughtspot.client.model.CreateConnectionConfigurationRequest;
import com.thoughtspot.client.model.DeleteConnectionConfigurationRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.UpdateConnectionConfigurationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ConnectionConfigurationsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConnectionConfigurationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectionConfigurationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ConnectionConfigurationsApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for connectionConfigurationSearch
     * @param connectionConfigurationSearchRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Configuration fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call connectionConfigurationSearchCall(ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = connectionConfigurationSearchRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection-configurations/search";

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
    private okhttp3.Call connectionConfigurationSearchValidateBeforeCall(ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectionConfigurationSearchRequest' is set
        if (connectionConfigurationSearchRequest == null) {
            throw new ApiException("Missing the required parameter 'connectionConfigurationSearchRequest' when calling connectionConfigurationSearch(Async)");
        }

        return connectionConfigurationSearchCall(connectionConfigurationSearchRequest, _callback);

    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      
     * @param connectionConfigurationSearchRequest  (required)
     * @return List&lt;ConnectionConfigurationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Configuration fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<ConnectionConfigurationResponse> connectionConfigurationSearch(ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest) throws ApiException {
        ApiResponse<List<ConnectionConfigurationResponse>> localVarResp = connectionConfigurationSearchWithHttpInfo(connectionConfigurationSearchRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      
     * @param connectionConfigurationSearchRequest  (required)
     * @return ApiResponse&lt;List&lt;ConnectionConfigurationResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Configuration fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ConnectionConfigurationResponse>> connectionConfigurationSearchWithHttpInfo(ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest) throws ApiException {
        okhttp3.Call localVarCall = connectionConfigurationSearchValidateBeforeCall(connectionConfigurationSearchRequest, null);
        Type localVarReturnType = new TypeToken<List<ConnectionConfigurationResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      
     * @param connectionConfigurationSearchRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Configuration fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call connectionConfigurationSearchAsync(ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest, final ApiCallback<List<ConnectionConfigurationResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectionConfigurationSearchValidateBeforeCall(connectionConfigurationSearchRequest, _callback);
        Type localVarReturnType = new TypeToken<List<ConnectionConfigurationResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createConnectionConfiguration
     * @param createConnectionConfigurationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Connection configuration successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConnectionConfigurationCall(CreateConnectionConfigurationRequest createConnectionConfigurationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createConnectionConfigurationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection-configurations/create";

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
    private okhttp3.Call createConnectionConfigurationValidateBeforeCall(CreateConnectionConfigurationRequest createConnectionConfigurationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createConnectionConfigurationRequest' is set
        if (createConnectionConfigurationRequest == null) {
            throw new ApiException("Missing the required parameter 'createConnectionConfigurationRequest' when calling createConnectionConfiguration(Async)");
        }

        return createConnectionConfigurationCall(createConnectionConfigurationRequest, _callback);

    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in &#x60;configuration&#x60;. The following example shows the configuration attributes:   &#x60;&#x60;&#x60;    {      \&quot;user\&quot;:\&quot;DEV_USER\&quot;,      \&quot;password\&quot;:\&quot;TestConn123\&quot;,      \&quot;role\&quot;:\&quot;DEV\&quot;,      \&quot;warehouse\&quot;:\&quot;DEV_WH\&quot;     }   &#x60;&#x60;&#x60;  * If the &#x60;policy_type&#x60; is &#x60;PRINCIPALS&#x60;, then &#x60;policy_principals&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;PROCESSES&#x60;, then &#x60;policy_processes&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;NO_POLICY&#x60;, then &#x60;policy_principals&#x60; and &#x60;policy_processes&#x60; are not required fields.      
     * @param createConnectionConfigurationRequest  (required)
     * @return ConnectionConfigurationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Connection configuration successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ConnectionConfigurationResponse createConnectionConfiguration(CreateConnectionConfigurationRequest createConnectionConfigurationRequest) throws ApiException {
        ApiResponse<ConnectionConfigurationResponse> localVarResp = createConnectionConfigurationWithHttpInfo(createConnectionConfigurationRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in &#x60;configuration&#x60;. The following example shows the configuration attributes:   &#x60;&#x60;&#x60;    {      \&quot;user\&quot;:\&quot;DEV_USER\&quot;,      \&quot;password\&quot;:\&quot;TestConn123\&quot;,      \&quot;role\&quot;:\&quot;DEV\&quot;,      \&quot;warehouse\&quot;:\&quot;DEV_WH\&quot;     }   &#x60;&#x60;&#x60;  * If the &#x60;policy_type&#x60; is &#x60;PRINCIPALS&#x60;, then &#x60;policy_principals&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;PROCESSES&#x60;, then &#x60;policy_processes&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;NO_POLICY&#x60;, then &#x60;policy_principals&#x60; and &#x60;policy_processes&#x60; are not required fields.      
     * @param createConnectionConfigurationRequest  (required)
     * @return ApiResponse&lt;ConnectionConfigurationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Connection configuration successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConnectionConfigurationResponse> createConnectionConfigurationWithHttpInfo(CreateConnectionConfigurationRequest createConnectionConfigurationRequest) throws ApiException {
        okhttp3.Call localVarCall = createConnectionConfigurationValidateBeforeCall(createConnectionConfigurationRequest, null);
        Type localVarReturnType = new TypeToken<ConnectionConfigurationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in &#x60;configuration&#x60;. The following example shows the configuration attributes:   &#x60;&#x60;&#x60;    {      \&quot;user\&quot;:\&quot;DEV_USER\&quot;,      \&quot;password\&quot;:\&quot;TestConn123\&quot;,      \&quot;role\&quot;:\&quot;DEV\&quot;,      \&quot;warehouse\&quot;:\&quot;DEV_WH\&quot;     }   &#x60;&#x60;&#x60;  * If the &#x60;policy_type&#x60; is &#x60;PRINCIPALS&#x60;, then &#x60;policy_principals&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;PROCESSES&#x60;, then &#x60;policy_processes&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;NO_POLICY&#x60;, then &#x60;policy_principals&#x60; and &#x60;policy_processes&#x60; are not required fields.      
     * @param createConnectionConfigurationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Connection configuration successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConnectionConfigurationAsync(CreateConnectionConfigurationRequest createConnectionConfigurationRequest, final ApiCallback<ConnectionConfigurationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createConnectionConfigurationValidateBeforeCall(createConnectionConfigurationRequest, _callback);
        Type localVarReturnType = new TypeToken<ConnectionConfigurationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConnectionConfiguration
     * @param deleteConnectionConfigurationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection Configurations successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConnectionConfigurationCall(DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = deleteConnectionConfigurationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection-configurations/delete";

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
    private okhttp3.Call deleteConnectionConfigurationValidateBeforeCall(DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'deleteConnectionConfigurationRequest' is set
        if (deleteConnectionConfigurationRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteConnectionConfigurationRequest' when calling deleteConnectionConfiguration(Async)");
        }

        return deleteConnectionConfigurationCall(deleteConnectionConfigurationRequest, _callback);

    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      
     * @param deleteConnectionConfigurationRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection Configurations successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void deleteConnectionConfiguration(DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest) throws ApiException {
        deleteConnectionConfigurationWithHttpInfo(deleteConnectionConfigurationRequest);
    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      
     * @param deleteConnectionConfigurationRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection Configurations successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteConnectionConfigurationWithHttpInfo(DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteConnectionConfigurationValidateBeforeCall(deleteConnectionConfigurationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *   Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      
     * @param deleteConnectionConfigurationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection Configurations successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConnectionConfigurationAsync(DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteConnectionConfigurationValidateBeforeCall(deleteConnectionConfigurationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConnectionConfiguration
     * @param configurationIdentifier Unique ID or name of the configuration. (required)
     * @param updateConnectionConfigurationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection configuration successfully updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateConnectionConfigurationCall(String configurationIdentifier, UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateConnectionConfigurationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection-configurations/{configuration_identifier}/update"
            .replace("{" + "configuration_identifier" + "}", localVarApiClient.escapeString(configurationIdentifier.toString()));

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
    private okhttp3.Call updateConnectionConfigurationValidateBeforeCall(String configurationIdentifier, UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'configurationIdentifier' is set
        if (configurationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'configurationIdentifier' when calling updateConnectionConfiguration(Async)");
        }

        // verify the required parameter 'updateConnectionConfigurationRequest' is set
        if (updateConnectionConfigurationRequest == null) {
            throw new ApiException("Missing the required parameter 'updateConnectionConfigurationRequest' when calling updateConnectionConfiguration(Async)");
        }

        return updateConnectionConfigurationCall(configurationIdentifier, updateConnectionConfigurationRequest, _callback);

    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the &#x60;policy_type&#x60;  * Edit the type of authentication  * Enable or disable a configuration   **NOTE**: When updating a configuration where &#x60;disabled&#x60; is &#x60;true&#x60;, you must reset &#x60;disabled&#x60; to &#x60;true&#x60; in your update request payload. If not explicitly set again, the API will default &#x60;disabled&#x60; to &#x60;false&#x60;.       
     * @param configurationIdentifier Unique ID or name of the configuration. (required)
     * @param updateConnectionConfigurationRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection configuration successfully updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void updateConnectionConfiguration(String configurationIdentifier, UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest) throws ApiException {
        updateConnectionConfigurationWithHttpInfo(configurationIdentifier, updateConnectionConfigurationRequest);
    }

    /**
     * 
     *   Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the &#x60;policy_type&#x60;  * Edit the type of authentication  * Enable or disable a configuration   **NOTE**: When updating a configuration where &#x60;disabled&#x60; is &#x60;true&#x60;, you must reset &#x60;disabled&#x60; to &#x60;true&#x60; in your update request payload. If not explicitly set again, the API will default &#x60;disabled&#x60; to &#x60;false&#x60;.       
     * @param configurationIdentifier Unique ID or name of the configuration. (required)
     * @param updateConnectionConfigurationRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection configuration successfully updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateConnectionConfigurationWithHttpInfo(String configurationIdentifier, UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest) throws ApiException {
        okhttp3.Call localVarCall = updateConnectionConfigurationValidateBeforeCall(configurationIdentifier, updateConnectionConfigurationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *   Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the &#x60;policy_type&#x60;  * Edit the type of authentication  * Enable or disable a configuration   **NOTE**: When updating a configuration where &#x60;disabled&#x60; is &#x60;true&#x60;, you must reset &#x60;disabled&#x60; to &#x60;true&#x60; in your update request payload. If not explicitly set again, the API will default &#x60;disabled&#x60; to &#x60;false&#x60;.       
     * @param configurationIdentifier Unique ID or name of the configuration. (required)
     * @param updateConnectionConfigurationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Connection configuration successfully updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateConnectionConfigurationAsync(String configurationIdentifier, UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateConnectionConfigurationValidateBeforeCall(configurationIdentifier, updateConnectionConfigurationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
