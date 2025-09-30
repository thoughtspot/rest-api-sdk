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
import com.thoughtspot.client.model.CreateConnectionRequest;
import com.thoughtspot.client.model.CreateConnectionResponse;
import com.thoughtspot.client.model.DeleteConnectionRequest;
import com.thoughtspot.client.model.FetchConnectionDiffStatusResponse;
import com.thoughtspot.client.model.SearchConnectionRequest;
import com.thoughtspot.client.model.SearchConnectionResponse;
import com.thoughtspot.client.model.UpdateConnectionRequest;
import com.thoughtspot.client.model.UpdateConnectionV2Request;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ConnectionsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConnectionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ConnectionsApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createConnection
     *
     * @param createConnectionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Connection to the datasource successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createConnectionCall(
            CreateConnectionRequest createConnectionRequest, final ApiCallback _callback)
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

        Object localVarPostBody = createConnectionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection/create";

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
    private okhttp3.Call createConnectionValidateBeforeCall(
            CreateConnectionRequest createConnectionRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createConnectionRequest' is set
        if (createConnectionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createConnectionRequest' when calling"
                            + " createConnection(Async)");
        }

        return createConnectionCall(createConnectionRequest, _callback);
    }

    /**
     * Version: 9.2.0.cl or later Creates a connection to a data warehouse for live query services.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. #### Create a connection without tables To create a connection without tables: 1.
     * Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a SnowFlake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to
     * &#x60;false&#x60;. #### Create a connection with tables To create a connection with tables:
     * 1. Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes, database details, and
     * table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ { \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,
     * \&quot;isAutoCreated\&quot;:false, \&quot;schemas\&quot;:[ {
     * \&quot;name\&quot;:\&quot;alldatatypes\&quot;, \&quot;tables\&quot;:[ {
     * \&quot;name\&quot;:\&quot;allDatatypes\&quot;, \&quot;type\&quot;:\&quot;TABLE\&quot;,
     * \&quot;description\&quot;:\&quot;\&quot;, \&quot;selected\&quot;:true,
     * \&quot;linked\&quot;:true, \&quot;columns\&quot;:[ {
     * \&quot;name\&quot;:\&quot;CNUMBER\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; }, {
     * \&quot;name\&quot;:\&quot;CDECIMAL\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; } ] } ] } ] } ] } &#x60;&#x60;&#x60; 2. Set
     * &#x60;validate&#x60; to &#x60;true&#x60;.
     *
     * @param createConnectionRequest (required)
     * @return CreateConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Connection to the datasource successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public CreateConnectionResponse createConnection(
            CreateConnectionRequest createConnectionRequest) throws ApiException {
        ApiResponse<CreateConnectionResponse> localVarResp =
                createConnectionWithHttpInfo(createConnectionRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.2.0.cl or later Creates a connection to a data warehouse for live query services.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. #### Create a connection without tables To create a connection without tables: 1.
     * Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a SnowFlake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to
     * &#x60;false&#x60;. #### Create a connection with tables To create a connection with tables:
     * 1. Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes, database details, and
     * table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ { \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,
     * \&quot;isAutoCreated\&quot;:false, \&quot;schemas\&quot;:[ {
     * \&quot;name\&quot;:\&quot;alldatatypes\&quot;, \&quot;tables\&quot;:[ {
     * \&quot;name\&quot;:\&quot;allDatatypes\&quot;, \&quot;type\&quot;:\&quot;TABLE\&quot;,
     * \&quot;description\&quot;:\&quot;\&quot;, \&quot;selected\&quot;:true,
     * \&quot;linked\&quot;:true, \&quot;columns\&quot;:[ {
     * \&quot;name\&quot;:\&quot;CNUMBER\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; }, {
     * \&quot;name\&quot;:\&quot;CDECIMAL\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; } ] } ] } ] } ] } &#x60;&#x60;&#x60; 2. Set
     * &#x60;validate&#x60; to &#x60;true&#x60;.
     *
     * @param createConnectionRequest (required)
     * @return ApiResponse&lt;CreateConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Connection to the datasource successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CreateConnectionResponse> createConnectionWithHttpInfo(
            CreateConnectionRequest createConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createConnectionValidateBeforeCall(createConnectionRequest, null);
        Type localVarReturnType = new TypeToken<CreateConnectionResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.2.0.cl or later Creates a connection to a data warehouse for live
     * query services. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. #### Create a connection without tables To create a connection without tables: 1.
     * Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a SnowFlake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to
     * &#x60;false&#x60;. #### Create a connection with tables To create a connection with tables:
     * 1. Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes, database details, and
     * table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ { \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,
     * \&quot;isAutoCreated\&quot;:false, \&quot;schemas\&quot;:[ {
     * \&quot;name\&quot;:\&quot;alldatatypes\&quot;, \&quot;tables\&quot;:[ {
     * \&quot;name\&quot;:\&quot;allDatatypes\&quot;, \&quot;type\&quot;:\&quot;TABLE\&quot;,
     * \&quot;description\&quot;:\&quot;\&quot;, \&quot;selected\&quot;:true,
     * \&quot;linked\&quot;:true, \&quot;columns\&quot;:[ {
     * \&quot;name\&quot;:\&quot;CNUMBER\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; }, {
     * \&quot;name\&quot;:\&quot;CDECIMAL\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; } ] } ] } ] } ] } &#x60;&#x60;&#x60; 2. Set
     * &#x60;validate&#x60; to &#x60;true&#x60;.
     *
     * @param createConnectionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Connection to the datasource successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createConnectionAsync(
            CreateConnectionRequest createConnectionRequest,
            final ApiCallback<CreateConnectionResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createConnectionValidateBeforeCall(createConnectionRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateConnectionResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConnection
     *
     * @param deleteConnectionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call deleteConnectionCall(
            DeleteConnectionRequest deleteConnectionRequest, final ApiCallback _callback)
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

        Object localVarPostBody = deleteConnectionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection/delete";

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
    private okhttp3.Call deleteConnectionValidateBeforeCall(
            DeleteConnectionRequest deleteConnectionRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'deleteConnectionRequest' is set
        if (deleteConnectionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'deleteConnectionRequest' when calling"
                            + " deleteConnection(Async)");
        }

        return deleteConnectionCall(deleteConnectionRequest, _callback);
    }

    /**
     * Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and will be removed
     * from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete
     * Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your
     * connection objects. #### Usage guidelines Deletes a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. **Note**: If a connection has dependent objects, make
     * sure you remove its associations before the delete operation.
     *
     * @param deleteConnectionRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public void deleteConnection(DeleteConnectionRequest deleteConnectionRequest)
            throws ApiException {
        deleteConnectionWithHttpInfo(deleteConnectionRequest);
    }

    /**
     * Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and will be removed
     * from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete
     * Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your
     * connection objects. #### Usage guidelines Deletes a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. **Note**: If a connection has dependent objects, make
     * sure you remove its associations before the delete operation.
     *
     * @param deleteConnectionRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> deleteConnectionWithHttpInfo(
            DeleteConnectionRequest deleteConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall =
                deleteConnectionValidateBeforeCall(deleteConnectionRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and
     * will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the
     * [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to
     * delete your connection objects. #### Usage guidelines Deletes a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. **Note**: If a connection has dependent objects, make
     * sure you remove its associations before the delete operation.
     *
     * @param deleteConnectionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call deleteConnectionAsync(
            DeleteConnectionRequest deleteConnectionRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteConnectionValidateBeforeCall(deleteConnectionRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConnectionV2
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteConnectionV2Call(
            String connectionIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/connections/{connection_identifier}/delete"
                        .replace(
                                "{" + "connection_identifier" + "}",
                                localVarApiClient.escapeString(connectionIdentifier.toString()));

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
    private okhttp3.Call deleteConnectionV2ValidateBeforeCall(
            String connectionIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectionIdentifier' is set
        if (connectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'connectionIdentifier' when calling"
                            + " deleteConnectionV2(Async)");
        }

        return deleteConnectionV2Call(connectionIdentifier, _callback);
    }

    /**
     * Version: 10.4.0.cl or later Deletes a connection object. **Note**: If a connection has
     * dependent objects, make sure you remove its associations before the delete operation.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the
     * connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required.
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteConnectionV2(String connectionIdentifier) throws ApiException {
        deleteConnectionV2WithHttpInfo(connectionIdentifier);
    }

    /**
     * Version: 10.4.0.cl or later Deletes a connection object. **Note**: If a connection has
     * dependent objects, make sure you remove its associations before the delete operation.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the
     * connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required.
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteConnectionV2WithHttpInfo(String connectionIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall =
                deleteConnectionV2ValidateBeforeCall(connectionIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.4.0.cl or later Deletes a connection object. **Note**: If a
     * connection has dependent objects, make sure you remove its associations before the delete
     * operation. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to
     * the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required.
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteConnectionV2Async(
            String connectionIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall =
                deleteConnectionV2ValidateBeforeCall(connectionIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for downloadConnectionMetadataChanges
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export metadata changes. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call downloadConnectionMetadataChangesCall(
            String connectionIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/connections/download-connection-metadata-changes/{connection_identifier}"
                        .replace(
                                "{" + "connection_identifier" + "}",
                                localVarApiClient.escapeString(connectionIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/octet-stream", "application/json"};
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
    private okhttp3.Call downloadConnectionMetadataChangesValidateBeforeCall(
            String connectionIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectionIdentifier' is set
        if (connectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'connectionIdentifier' when calling"
                            + " downloadConnectionMetadataChanges(Async)");
        }

        return downloadConnectionMetadataChangesCall(connectionIdentifier, _callback);
    }

    /**
     * Version: 9.9.0.cl or later Exports the difference in connection metadata between CDW and
     * ThoughtSpot Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) To download the
     * connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export metadata changes. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public File downloadConnectionMetadataChanges(String connectionIdentifier) throws ApiException {
        ApiResponse<File> localVarResp =
                downloadConnectionMetadataChangesWithHttpInfo(connectionIdentifier);
        return localVarResp.getData();
    }

    /**
     * Version: 9.9.0.cl or later Exports the difference in connection metadata between CDW and
     * ThoughtSpot Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) To download the
     * connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export metadata changes. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<File> downloadConnectionMetadataChangesWithHttpInfo(
            String connectionIdentifier) throws ApiException {
        okhttp3.Call localVarCall =
                downloadConnectionMetadataChangesValidateBeforeCall(connectionIdentifier, null);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Exports the difference in connection metadata
     * between CDW and ThoughtSpot Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) To download the
     * connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export metadata changes. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call downloadConnectionMetadataChangesAsync(
            String connectionIdentifier, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall =
                downloadConnectionMetadataChangesValidateBeforeCall(
                        connectionIdentifier, _callback);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchConnectionDiffStatus
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> true/false </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchConnectionDiffStatusCall(
            String connectionIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/connections/fetch-connection-diff-status/{connection_identifier}"
                        .replace(
                                "{" + "connection_identifier" + "}",
                                localVarApiClient.escapeString(connectionIdentifier.toString()));

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
    private okhttp3.Call fetchConnectionDiffStatusValidateBeforeCall(
            String connectionIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectionIdentifier' is set
        if (connectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'connectionIdentifier' when calling"
                            + " fetchConnectionDiffStatus(Async)");
        }

        return fetchConnectionDiffStatusCall(connectionIdentifier, _callback);
    }

    /**
     * Version: 9.9.0.cl or later Validates the difference in connection metadata between CDW and
     * ThoughtSpot. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) Returns a boolean
     * indicating whether there is any difference between the connection metadata at ThoughtSpot and
     * CDW. To get the connection metadata difference status, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @return FetchConnectionDiffStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> true/false </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public FetchConnectionDiffStatusResponse fetchConnectionDiffStatus(String connectionIdentifier)
            throws ApiException {
        ApiResponse<FetchConnectionDiffStatusResponse> localVarResp =
                fetchConnectionDiffStatusWithHttpInfo(connectionIdentifier);
        return localVarResp.getData();
    }

    /**
     * Version: 9.9.0.cl or later Validates the difference in connection metadata between CDW and
     * ThoughtSpot. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) Returns a boolean
     * indicating whether there is any difference between the connection metadata at ThoughtSpot and
     * CDW. To get the connection metadata difference status, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @return ApiResponse&lt;FetchConnectionDiffStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> true/false </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<FetchConnectionDiffStatusResponse> fetchConnectionDiffStatusWithHttpInfo(
            String connectionIdentifier) throws ApiException {
        okhttp3.Call localVarCall =
                fetchConnectionDiffStatusValidateBeforeCall(connectionIdentifier, null);
        Type localVarReturnType = new TypeToken<FetchConnectionDiffStatusResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Validates the difference in connection metadata
     * between CDW and ThoughtSpot. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) Returns a boolean
     * indicating whether there is any difference between the connection metadata at ThoughtSpot and
     * CDW. To get the connection metadata difference status, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @param connectionIdentifier GUID of the connection (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> true/false </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchConnectionDiffStatusAsync(
            String connectionIdentifier,
            final ApiCallback<FetchConnectionDiffStatusResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                fetchConnectionDiffStatusValidateBeforeCall(connectionIdentifier, _callback);
        Type localVarReturnType = new TypeToken<FetchConnectionDiffStatusResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchConnection
     *
     * @param searchConnectionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List of connections to the datasource. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchConnectionCall(
            SearchConnectionRequest searchConnectionRequest, final ApiCallback _callback)
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

        Object localVarPostBody = searchConnectionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection/search";

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
    private okhttp3.Call searchConnectionValidateBeforeCall(
            SearchConnectionRequest searchConnectionRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchConnectionRequest' is set
        if (searchConnectionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchConnectionRequest' when calling"
                            + " searchConnection(Async)");
        }

        return searchConnectionCall(searchConnectionRequest, _callback);
    }

    /**
     * Version: 9.2.0.cl or later Gets connection objects. Requires &#x60;DATAMANAGEMENT&#x60;
     * (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. - To get a list of all connections available in the ThoughtSpot system, send the
     * API request without any attributes in the request body. - To get the connection objects for a
     * specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To
     * fetch details of a connection object, specify the connection object GUID or name. The
     * &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a
     * wildcard match. - To get details of the database, schemas, tables, or columns from a data
     * connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific
     * database, schema, table, or column from a connection object, define the object type in
     * &#x60;data_warehouse_object_type&#x60; and object properties in the
     * &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass
     * the database, schema, and table names in the API request. Note that in the following example,
     * object properties are set in a hierarchical order (&#x60;database&#x60; &gt;
     * &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;). &#x60;&#x60;&#x60; {
     * \&quot;connections\&quot;: [ { \&quot;identifier\&quot;:
     * \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;, \&quot;data_warehouse_objects\&quot;: [ {
     * \&quot;database\&quot;: \&quot;NEBULADEV\&quot;, \&quot;schema\&quot;:
     * \&quot;INFORMATION_SCHEMA\&quot;, \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,
     * \&quot;column\&quot;: \&quot;ROLE_NAME\&quot; } ] } ],
     * \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60; - To
     * fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For
     * example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the
     * &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the
     * &#x60;configuration&#x60; string as
     * &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a
     * specific table, specify the table, for
     * example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;.
     * - To query connections by &#x60;authentication_type&#x60;, specify
     * &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60;
     * are: - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. - &#x60;OAUTH&#x60;: For
     * connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth
     * authentication type. - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This
     * authentication type is supported on Amazon Redshift connections only. - &#x60;EXTOAUTH&#x60;:
     * For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with
     * Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/
     * connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data
     * connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). -
     * &#x60;KEY_PAIR&#x60;: For connections that require Key Pair account credentials to
     * authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - &#x60;OAUTH_WITH_PKCE&#x60;: For connections that
     * require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo
     * connections only. - &#x60;EXTOAUTH_WITH_PKCE&#x60;: For connections that require External
     * OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch
     * data. This authentication type is supported on Snowflake connections only. -
     * &#x60;OAUTH_WITH_PEZ&#x60;: For connections that require OAuth With PEZ account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Amazon Redshift connections only. - &#x60;OAUTH_WITH_SERVICE_PRINCIPAL&#x60;:
     * For connections that require OAuth With Service Principal account credentials to authenticate
     * to the Cloud Data Warehouse and fetch data. This authentication type is supported on
     * Databricks connections only. - &#x60;PERSONAL_ACCESS_TOKEN&#x60;: For connections that
     * require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse
     * and fetch data. This authentication type is supported on Databricks connections only. -
     * &#x60;OAUTH_CLIENT_CREDENTIALS&#x60;: For connections that require OAuth Client Credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - To include more details about connection objects
     * in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort
     * the output by field names and filter connections by tags. **NOTE**: When filtering connection
     * records by parameters other than &#x60;data_warehouse_types&#x60; or
     * &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60;
     * and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.
     *
     * @param searchConnectionRequest (required)
     * @return List&lt;SearchConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List of connections to the datasource. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<SearchConnectionResponse> searchConnection(
            SearchConnectionRequest searchConnectionRequest) throws ApiException {
        ApiResponse<List<SearchConnectionResponse>> localVarResp =
                searchConnectionWithHttpInfo(searchConnectionRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.2.0.cl or later Gets connection objects. Requires &#x60;DATAMANAGEMENT&#x60;
     * (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. - To get a list of all connections available in the ThoughtSpot system, send the
     * API request without any attributes in the request body. - To get the connection objects for a
     * specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To
     * fetch details of a connection object, specify the connection object GUID or name. The
     * &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a
     * wildcard match. - To get details of the database, schemas, tables, or columns from a data
     * connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific
     * database, schema, table, or column from a connection object, define the object type in
     * &#x60;data_warehouse_object_type&#x60; and object properties in the
     * &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass
     * the database, schema, and table names in the API request. Note that in the following example,
     * object properties are set in a hierarchical order (&#x60;database&#x60; &gt;
     * &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;). &#x60;&#x60;&#x60; {
     * \&quot;connections\&quot;: [ { \&quot;identifier\&quot;:
     * \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;, \&quot;data_warehouse_objects\&quot;: [ {
     * \&quot;database\&quot;: \&quot;NEBULADEV\&quot;, \&quot;schema\&quot;:
     * \&quot;INFORMATION_SCHEMA\&quot;, \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,
     * \&quot;column\&quot;: \&quot;ROLE_NAME\&quot; } ] } ],
     * \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60; - To
     * fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For
     * example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the
     * &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the
     * &#x60;configuration&#x60; string as
     * &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a
     * specific table, specify the table, for
     * example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;.
     * - To query connections by &#x60;authentication_type&#x60;, specify
     * &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60;
     * are: - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. - &#x60;OAUTH&#x60;: For
     * connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth
     * authentication type. - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This
     * authentication type is supported on Amazon Redshift connections only. - &#x60;EXTOAUTH&#x60;:
     * For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with
     * Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/
     * connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data
     * connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). -
     * &#x60;KEY_PAIR&#x60;: For connections that require Key Pair account credentials to
     * authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - &#x60;OAUTH_WITH_PKCE&#x60;: For connections that
     * require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo
     * connections only. - &#x60;EXTOAUTH_WITH_PKCE&#x60;: For connections that require External
     * OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch
     * data. This authentication type is supported on Snowflake connections only. -
     * &#x60;OAUTH_WITH_PEZ&#x60;: For connections that require OAuth With PEZ account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Amazon Redshift connections only. - &#x60;OAUTH_WITH_SERVICE_PRINCIPAL&#x60;:
     * For connections that require OAuth With Service Principal account credentials to authenticate
     * to the Cloud Data Warehouse and fetch data. This authentication type is supported on
     * Databricks connections only. - &#x60;PERSONAL_ACCESS_TOKEN&#x60;: For connections that
     * require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse
     * and fetch data. This authentication type is supported on Databricks connections only. -
     * &#x60;OAUTH_CLIENT_CREDENTIALS&#x60;: For connections that require OAuth Client Credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - To include more details about connection objects
     * in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort
     * the output by field names and filter connections by tags. **NOTE**: When filtering connection
     * records by parameters other than &#x60;data_warehouse_types&#x60; or
     * &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60;
     * and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.
     *
     * @param searchConnectionRequest (required)
     * @return ApiResponse&lt;List&lt;SearchConnectionResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List of connections to the datasource. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<SearchConnectionResponse>> searchConnectionWithHttpInfo(
            SearchConnectionRequest searchConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchConnectionValidateBeforeCall(searchConnectionRequest, null);
        Type localVarReturnType = new TypeToken<List<SearchConnectionResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.2.0.cl or later Gets connection objects. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. - To get a list of all connections available in the ThoughtSpot system, send the
     * API request without any attributes in the request body. - To get the connection objects for a
     * specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To
     * fetch details of a connection object, specify the connection object GUID or name. The
     * &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a
     * wildcard match. - To get details of the database, schemas, tables, or columns from a data
     * connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific
     * database, schema, table, or column from a connection object, define the object type in
     * &#x60;data_warehouse_object_type&#x60; and object properties in the
     * &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass
     * the database, schema, and table names in the API request. Note that in the following example,
     * object properties are set in a hierarchical order (&#x60;database&#x60; &gt;
     * &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;). &#x60;&#x60;&#x60; {
     * \&quot;connections\&quot;: [ { \&quot;identifier\&quot;:
     * \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;, \&quot;data_warehouse_objects\&quot;: [ {
     * \&quot;database\&quot;: \&quot;NEBULADEV\&quot;, \&quot;schema\&quot;:
     * \&quot;INFORMATION_SCHEMA\&quot;, \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,
     * \&quot;column\&quot;: \&quot;ROLE_NAME\&quot; } ] } ],
     * \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60; - To
     * fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For
     * example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the
     * &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the
     * &#x60;configuration&#x60; string as
     * &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a
     * specific table, specify the table, for
     * example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;.
     * - To query connections by &#x60;authentication_type&#x60;, specify
     * &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60;
     * are: - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. - &#x60;OAUTH&#x60;: For
     * connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth
     * authentication type. - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This
     * authentication type is supported on Amazon Redshift connections only. - &#x60;EXTOAUTH&#x60;:
     * For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with
     * Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/
     * connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data
     * connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). -
     * &#x60;KEY_PAIR&#x60;: For connections that require Key Pair account credentials to
     * authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - &#x60;OAUTH_WITH_PKCE&#x60;: For connections that
     * require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo
     * connections only. - &#x60;EXTOAUTH_WITH_PKCE&#x60;: For connections that require External
     * OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch
     * data. This authentication type is supported on Snowflake connections only. -
     * &#x60;OAUTH_WITH_PEZ&#x60;: For connections that require OAuth With PEZ account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Amazon Redshift connections only. - &#x60;OAUTH_WITH_SERVICE_PRINCIPAL&#x60;:
     * For connections that require OAuth With Service Principal account credentials to authenticate
     * to the Cloud Data Warehouse and fetch data. This authentication type is supported on
     * Databricks connections only. - &#x60;PERSONAL_ACCESS_TOKEN&#x60;: For connections that
     * require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse
     * and fetch data. This authentication type is supported on Databricks connections only. -
     * &#x60;OAUTH_CLIENT_CREDENTIALS&#x60;: For connections that require OAuth Client Credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - To include more details about connection objects
     * in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort
     * the output by field names and filter connections by tags. **NOTE**: When filtering connection
     * records by parameters other than &#x60;data_warehouse_types&#x60; or
     * &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60;
     * and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.
     *
     * @param searchConnectionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List of connections to the datasource. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchConnectionAsync(
            SearchConnectionRequest searchConnectionRequest,
            final ApiCallback<List<SearchConnectionResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchConnectionValidateBeforeCall(searchConnectionRequest, _callback);
        Type localVarReturnType = new TypeToken<List<SearchConnectionResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConnection
     *
     * @param updateConnectionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call updateConnectionCall(
            UpdateConnectionRequest updateConnectionRequest, final ApiCallback _callback)
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

        Object localVarPostBody = updateConnectionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/connection/update";

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
    private okhttp3.Call updateConnectionValidateBeforeCall(
            UpdateConnectionRequest updateConnectionRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'updateConnectionRequest' is set
        if (updateConnectionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateConnectionRequest' when calling"
                            + " updateConnection(Async)");
        }

        return updateConnectionCall(updateConnectionRequest, _callback);
    }

    /**
     * Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and will be removed
     * from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update
     * connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your
     * connection objects. #### Usage guidelines Updates a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. To update a connection object, pass these parameters in
     * your API request: 1. GUID of the connection object. 2. If you are updating tables or database
     * schema of a connection object: a. Add the updated JSON map of metadata with database, schema,
     * and tables in &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to
     * &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or
     * description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.
     *
     * @param updateConnectionRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public void updateConnection(UpdateConnectionRequest updateConnectionRequest)
            throws ApiException {
        updateConnectionWithHttpInfo(updateConnectionRequest);
    }

    /**
     * Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and will be removed
     * from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update
     * connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your
     * connection objects. #### Usage guidelines Updates a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. To update a connection object, pass these parameters in
     * your API request: 1. GUID of the connection object. 2. If you are updating tables or database
     * schema of a connection object: a. Add the updated JSON map of metadata with database, schema,
     * and tables in &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to
     * &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or
     * description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.
     *
     * @param updateConnectionRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> updateConnectionWithHttpInfo(
            UpdateConnectionRequest updateConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall =
                updateConnectionValidateBeforeCall(updateConnectionRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and
     * will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the
     * [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to
     * update your connection objects. #### Usage guidelines Updates a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. To update a connection object, pass these parameters in
     * your API request: 1. GUID of the connection object. 2. If you are updating tables or database
     * schema of a connection object: a. Add the updated JSON map of metadata with database, schema,
     * and tables in &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to
     * &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or
     * description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.
     *
     * @param updateConnectionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call updateConnectionAsync(
            UpdateConnectionRequest updateConnectionRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateConnectionValidateBeforeCall(updateConnectionRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConnectionV2
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @param updateConnectionV2Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateConnectionV2Call(
            String connectionIdentifier,
            UpdateConnectionV2Request updateConnectionV2Request,
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

        Object localVarPostBody = updateConnectionV2Request;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/connections/{connection_identifier}/update"
                        .replace(
                                "{" + "connection_identifier" + "}",
                                localVarApiClient.escapeString(connectionIdentifier.toString()));

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
    private okhttp3.Call updateConnectionV2ValidateBeforeCall(
            String connectionIdentifier,
            UpdateConnectionV2Request updateConnectionV2Request,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'connectionIdentifier' is set
        if (connectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'connectionIdentifier' when calling"
                            + " updateConnectionV2(Async)");
        }

        // verify the required parameter 'updateConnectionV2Request' is set
        if (updateConnectionV2Request == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateConnectionV2Request' when calling"
                            + " updateConnectionV2(Async)");
        }

        return updateConnectionV2Call(connectionIdentifier, updateConnectionV2Request, _callback);
    }

    /**
     * Version: 10.4.0.cl or later Updates a connection object. Requires &#x60;DATAMANAGEMENT&#x60;
     * (**Can manage data**) and edit permissions to the connection object, or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. To update a connection object, pass these parameters in your API request: 1. GUID
     * of the connection object. 2. If you are updating tables or database schema of a connection
     * object: a. Add the updated JSON map of metadata with database, schema, and tables in
     * &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to &#x60;true&#x60;. **NOTE:**
     * If the &#x60;authentication_type&#x60; is anything other than SERVICE_ACCOUNT, you must
     * explicitly provide the authenticationType property in the payload. If you do not specify
     * authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type. * A
     * JSON map of configuration attributes, database details, and table properties in
     * &#x60;data_warehouse_config&#x60; as shown in the following example: &#x60;&#x60;&#x60; {
     * \&quot;configuration\&quot;:{ \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ { \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,
     * \&quot;isAutoCreated\&quot;:false, \&quot;schemas\&quot;:[ {
     * \&quot;name\&quot;:\&quot;alldatatypes\&quot;, \&quot;tables\&quot;:[ {
     * \&quot;name\&quot;:\&quot;allDatatypes\&quot;, \&quot;type\&quot;:\&quot;TABLE\&quot;,
     * \&quot;description\&quot;:\&quot;\&quot;, \&quot;selected\&quot;:true,
     * \&quot;linked\&quot;:true, \&quot;columns\&quot;:[ {
     * \&quot;name\&quot;:\&quot;CNUMBER\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; }, {
     * \&quot;name\&quot;:\&quot;CDECIMAL\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; } ] } ] } ] } ] } &#x60;&#x60;&#x60; 3. If
     * you are updating a configuration attribute, connection name, or description, you can set
     * &#x60;validate&#x60; to &#x60;false&#x60;. **NOTE:** If the &#x60;authentication_type&#x60;
     * is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType
     * property in the payload. If you do not specify authenticationType, the API will default to
     * SERVICE_ACCOUNT as the authentication type. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a Snowflake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60;
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @param updateConnectionV2Request (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateConnectionV2(
            String connectionIdentifier, UpdateConnectionV2Request updateConnectionV2Request)
            throws ApiException {
        updateConnectionV2WithHttpInfo(connectionIdentifier, updateConnectionV2Request);
    }

    /**
     * Version: 10.4.0.cl or later Updates a connection object. Requires &#x60;DATAMANAGEMENT&#x60;
     * (**Can manage data**) and edit permissions to the connection object, or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. To update a connection object, pass these parameters in your API request: 1. GUID
     * of the connection object. 2. If you are updating tables or database schema of a connection
     * object: a. Add the updated JSON map of metadata with database, schema, and tables in
     * &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to &#x60;true&#x60;. **NOTE:**
     * If the &#x60;authentication_type&#x60; is anything other than SERVICE_ACCOUNT, you must
     * explicitly provide the authenticationType property in the payload. If you do not specify
     * authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type. * A
     * JSON map of configuration attributes, database details, and table properties in
     * &#x60;data_warehouse_config&#x60; as shown in the following example: &#x60;&#x60;&#x60; {
     * \&quot;configuration\&quot;:{ \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ { \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,
     * \&quot;isAutoCreated\&quot;:false, \&quot;schemas\&quot;:[ {
     * \&quot;name\&quot;:\&quot;alldatatypes\&quot;, \&quot;tables\&quot;:[ {
     * \&quot;name\&quot;:\&quot;allDatatypes\&quot;, \&quot;type\&quot;:\&quot;TABLE\&quot;,
     * \&quot;description\&quot;:\&quot;\&quot;, \&quot;selected\&quot;:true,
     * \&quot;linked\&quot;:true, \&quot;columns\&quot;:[ {
     * \&quot;name\&quot;:\&quot;CNUMBER\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; }, {
     * \&quot;name\&quot;:\&quot;CDECIMAL\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; } ] } ] } ] } ] } &#x60;&#x60;&#x60; 3. If
     * you are updating a configuration attribute, connection name, or description, you can set
     * &#x60;validate&#x60; to &#x60;false&#x60;. **NOTE:** If the &#x60;authentication_type&#x60;
     * is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType
     * property in the payload. If you do not specify authenticationType, the API will default to
     * SERVICE_ACCOUNT as the authentication type. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a Snowflake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60;
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @param updateConnectionV2Request (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateConnectionV2WithHttpInfo(
            String connectionIdentifier, UpdateConnectionV2Request updateConnectionV2Request)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateConnectionV2ValidateBeforeCall(
                        connectionIdentifier, updateConnectionV2Request, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.4.0.cl or later Updates a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. To update a connection object, pass these parameters in
     * your API request: 1. GUID of the connection object. 2. If you are updating tables or database
     * schema of a connection object: a. Add the updated JSON map of metadata with database, schema,
     * and tables in &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to
     * &#x60;true&#x60;. **NOTE:** If the &#x60;authentication_type&#x60; is anything other than
     * SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload.
     * If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the
     * authentication type. * A JSON map of configuration attributes, database details, and table
     * properties in &#x60;data_warehouse_config&#x60; as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ { \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,
     * \&quot;isAutoCreated\&quot;:false, \&quot;schemas\&quot;:[ {
     * \&quot;name\&quot;:\&quot;alldatatypes\&quot;, \&quot;tables\&quot;:[ {
     * \&quot;name\&quot;:\&quot;allDatatypes\&quot;, \&quot;type\&quot;:\&quot;TABLE\&quot;,
     * \&quot;description\&quot;:\&quot;\&quot;, \&quot;selected\&quot;:true,
     * \&quot;linked\&quot;:true, \&quot;columns\&quot;:[ {
     * \&quot;name\&quot;:\&quot;CNUMBER\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; }, {
     * \&quot;name\&quot;:\&quot;CDECIMAL\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; } ] } ] } ] } ] } &#x60;&#x60;&#x60; 3. If
     * you are updating a configuration attribute, connection name, or description, you can set
     * &#x60;validate&#x60; to &#x60;false&#x60;. **NOTE:** If the &#x60;authentication_type&#x60;
     * is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType
     * property in the payload. If you do not specify authenticationType, the API will default to
     * SERVICE_ACCOUNT as the authentication type. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a Snowflake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60;
     *
     * @param connectionIdentifier Unique ID or name of the connection. (required)
     * @param updateConnectionV2Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateConnectionV2Async(
            String connectionIdentifier,
            UpdateConnectionV2Request updateConnectionV2Request,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateConnectionV2ValidateBeforeCall(
                        connectionIdentifier, updateConnectionV2Request, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
