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
import com.thoughtspot.client.model.DbtSearchResponse;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DbtApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DbtApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DbtApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public DbtApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for dbtConnection
     *
     * @param connectionName Name of the connection. (required)
     * @param databaseName Name of the Database. (required)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Succesfully created DBT Connection. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtConnectionCall(
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent,
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/dbt/dbt-connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (connectionName != null) {
            localVarFormParams.put("connection_name", connectionName);
        }

        if (databaseName != null) {
            localVarFormParams.put("database_name", databaseName);
        }

        if (importType != null) {
            localVarFormParams.put("import_type", importType);
        }

        if (accessToken != null) {
            localVarFormParams.put("access_token", accessToken);
        }

        if (dbtUrl != null) {
            localVarFormParams.put("dbt_url", dbtUrl);
        }

        if (accountId != null) {
            localVarFormParams.put("account_id", accountId);
        }

        if (projectId != null) {
            localVarFormParams.put("project_id", projectId);
        }

        if (dbtEnvId != null) {
            localVarFormParams.put("dbt_env_id", dbtEnvId);
        }

        if (projectName != null) {
            localVarFormParams.put("project_name", projectName);
        }

        if (fileContent != null) {
            localVarFormParams.put("file_content", fileContent);
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
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
    private okhttp3.Call dbtConnectionValidateBeforeCall(
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'connectionName' is set
        if (connectionName == null) {
            throw new ApiException(
                    "Missing the required parameter 'connectionName' when calling"
                            + " dbtConnection(Async)");
        }

        // verify the required parameter 'databaseName' is set
        if (databaseName == null) {
            throw new ApiException(
                    "Missing the required parameter 'databaseName' when calling"
                            + " dbtConnection(Async)");
        }

        return dbtConnectionCall(
                connectionName,
                databaseName,
                importType,
                accessToken,
                dbtUrl,
                accountId,
                projectId,
                dbtEnvId,
                projectName,
                fileContent,
                _callback);
    }

    /**
     * Version: 9.9.0.cl or later Creates a DBT connection object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About create
     * DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials
     * for cloud . The API needs embrace connection, embrace database name, DBT url, import type,
     * DBT account identifier, DBT project identifier, DBT access token and environment details (or)
     * embrace connection, embrace database name, import type, file_content to create a connection
     * object. To know more about DBT, see ThoughtSpot Product Documentation.
     *
     * @param connectionName Name of the connection. (required)
     * @param databaseName Name of the Database. (required)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Succesfully created DBT Connection. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Object dbtConnection(
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent)
            throws ApiException {
        ApiResponse<Object> localVarResp =
                dbtConnectionWithHttpInfo(
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent);
        return localVarResp.getData();
    }

    /**
     * Version: 9.9.0.cl or later Creates a DBT connection object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About create
     * DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials
     * for cloud . The API needs embrace connection, embrace database name, DBT url, import type,
     * DBT account identifier, DBT project identifier, DBT access token and environment details (or)
     * embrace connection, embrace database name, import type, file_content to create a connection
     * object. To know more about DBT, see ThoughtSpot Product Documentation.
     *
     * @param connectionName Name of the connection. (required)
     * @param databaseName Name of the Database. (required)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Succesfully created DBT Connection. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Object> dbtConnectionWithHttpInfo(
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent)
            throws ApiException {
        okhttp3.Call localVarCall =
                dbtConnectionValidateBeforeCall(
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent,
                        null);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Creates a DBT connection object in ThoughtSpot.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About create
     * DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials
     * for cloud . The API needs embrace connection, embrace database name, DBT url, import type,
     * DBT account identifier, DBT project identifier, DBT access token and environment details (or)
     * embrace connection, embrace database name, import type, file_content to create a connection
     * object. To know more about DBT, see ThoughtSpot Product Documentation.
     *
     * @param connectionName Name of the connection. (required)
     * @param databaseName Name of the Database. (required)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Succesfully created DBT Connection. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtConnectionAsync(
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent,
            final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                dbtConnectionValidateBeforeCall(
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent,
                        _callback);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dbtGenerateSyncTml
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sync Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtGenerateSyncTmlCall(
            String dbtConnectionIdentifier, File fileContent, final ApiCallback _callback)
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
        String localVarPath = "/api/rest/2.0/dbt/generate-sync-tml";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dbtConnectionIdentifier != null) {
            localVarFormParams.put("dbt_connection_identifier", dbtConnectionIdentifier);
        }

        if (fileContent != null) {
            localVarFormParams.put("file_content", fileContent);
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
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
    private okhttp3.Call dbtGenerateSyncTmlValidateBeforeCall(
            String dbtConnectionIdentifier, File fileContent, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'dbtConnectionIdentifier' is set
        if (dbtConnectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'dbtConnectionIdentifier' when calling"
                            + " dbtGenerateSyncTml(Async)");
        }

        return dbtGenerateSyncTmlCall(dbtConnectionIdentifier, fileContent, _callback);
    }

    /**
     * Version: 9.9.0.cl or later Resynchronize the existing list of models, tables, worksheet tml’s
     * and import them to Thoughtspot based on the DBT connection object. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sync Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Object dbtGenerateSyncTml(String dbtConnectionIdentifier, File fileContent)
            throws ApiException {
        ApiResponse<Object> localVarResp =
                dbtGenerateSyncTmlWithHttpInfo(dbtConnectionIdentifier, fileContent);
        return localVarResp.getData();
    }

    /**
     * Version: 9.9.0.cl or later Resynchronize the existing list of models, tables, worksheet tml’s
     * and import them to Thoughtspot based on the DBT connection object. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sync Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Object> dbtGenerateSyncTmlWithHttpInfo(
            String dbtConnectionIdentifier, File fileContent) throws ApiException {
        okhttp3.Call localVarCall =
                dbtGenerateSyncTmlValidateBeforeCall(dbtConnectionIdentifier, fileContent, null);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Resynchronize the existing list of models,
     * tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sync Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtGenerateSyncTmlAsync(
            String dbtConnectionIdentifier, File fileContent, final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                dbtGenerateSyncTmlValidateBeforeCall(
                        dbtConnectionIdentifier, fileContent, _callback);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dbtGenerateTml
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param importWorksheets Mention the worksheet tmls to import (required)
     * @param modelTables List of Models and their respective Tables (optional)
     * @param worksheets List of worksheets is mandatory when import_Worksheets is type SELECTED
     *     (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Required Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtGenerateTmlCall(
            String dbtConnectionIdentifier,
            String importWorksheets,
            String modelTables,
            String worksheets,
            File fileContent,
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/dbt/generate-tml";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dbtConnectionIdentifier != null) {
            localVarFormParams.put("dbt_connection_identifier", dbtConnectionIdentifier);
        }

        if (modelTables != null) {
            localVarFormParams.put("model_tables", modelTables);
        }

        if (importWorksheets != null) {
            localVarFormParams.put("import_worksheets", importWorksheets);
        }

        if (worksheets != null) {
            localVarFormParams.put("worksheets", worksheets);
        }

        if (fileContent != null) {
            localVarFormParams.put("file_content", fileContent);
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
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
    private okhttp3.Call dbtGenerateTmlValidateBeforeCall(
            String dbtConnectionIdentifier,
            String importWorksheets,
            String modelTables,
            String worksheets,
            File fileContent,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'dbtConnectionIdentifier' is set
        if (dbtConnectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'dbtConnectionIdentifier' when calling"
                            + " dbtGenerateTml(Async)");
        }

        // verify the required parameter 'importWorksheets' is set
        if (importWorksheets == null) {
            throw new ApiException(
                    "Missing the required parameter 'importWorksheets' when calling"
                            + " dbtGenerateTml(Async)");
        }

        return dbtGenerateTmlCall(
                dbtConnectionIdentifier,
                importWorksheets,
                modelTables,
                worksheets,
                fileContent,
                _callback);
    }

    /**
     * Version: 9.9.0.cl or later Generate required table and worksheet and import them. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About
     * generate TML Models and Worksheets to be imported can be selected by the user as part of the
     * API.
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param importWorksheets Mention the worksheet tmls to import (required)
     * @param modelTables List of Models and their respective Tables (optional)
     * @param worksheets List of worksheets is mandatory when import_Worksheets is type SELECTED
     *     (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Required Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Object dbtGenerateTml(
            String dbtConnectionIdentifier,
            String importWorksheets,
            String modelTables,
            String worksheets,
            File fileContent)
            throws ApiException {
        ApiResponse<Object> localVarResp =
                dbtGenerateTmlWithHttpInfo(
                        dbtConnectionIdentifier,
                        importWorksheets,
                        modelTables,
                        worksheets,
                        fileContent);
        return localVarResp.getData();
    }

    /**
     * Version: 9.9.0.cl or later Generate required table and worksheet and import them. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About
     * generate TML Models and Worksheets to be imported can be selected by the user as part of the
     * API.
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param importWorksheets Mention the worksheet tmls to import (required)
     * @param modelTables List of Models and their respective Tables (optional)
     * @param worksheets List of worksheets is mandatory when import_Worksheets is type SELECTED
     *     (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Required Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Object> dbtGenerateTmlWithHttpInfo(
            String dbtConnectionIdentifier,
            String importWorksheets,
            String modelTables,
            String worksheets,
            File fileContent)
            throws ApiException {
        okhttp3.Call localVarCall =
                dbtGenerateTmlValidateBeforeCall(
                        dbtConnectionIdentifier,
                        importWorksheets,
                        modelTables,
                        worksheets,
                        fileContent,
                        null);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Generate required table and worksheet and import
     * them. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About
     * generate TML Models and Worksheets to be imported can be selected by the user as part of the
     * API.
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT connection. (required)
     * @param importWorksheets Mention the worksheet tmls to import (required)
     * @param modelTables List of Models and their respective Tables (optional)
     * @param worksheets List of worksheets is mandatory when import_Worksheets is type SELECTED
     *     (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Required Table and Worksheet TML&#39;s are successfully generated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtGenerateTmlAsync(
            String dbtConnectionIdentifier,
            String importWorksheets,
            String modelTables,
            String worksheets,
            File fileContent,
            final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                dbtGenerateTmlValidateBeforeCall(
                        dbtConnectionIdentifier,
                        importWorksheets,
                        modelTables,
                        worksheets,
                        fileContent,
                        _callback);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dbtSearch
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Retrieved list of DBT connections successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtSearchCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/dbt/search";

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
    private okhttp3.Call dbtSearchValidateBeforeCall(final ApiCallback _callback)
            throws ApiException {
        return dbtSearchCall(_callback);
    }

    /**
     * Version: 9.9.0.cl or later Gets a list of DBT connection objects by user and organization,
     * available on the ThoughtSpot system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About search
     * DBT connection To get details of a specific DBT connection identifier, database connection
     * identifier, database connection name, database name, project name, project identifier,
     * environment identifier , import type and author.
     *
     * @return List&lt;DbtSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Retrieved list of DBT connections successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<DbtSearchResponse> dbtSearch() throws ApiException {
        ApiResponse<List<DbtSearchResponse>> localVarResp = dbtSearchWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Version: 9.9.0.cl or later Gets a list of DBT connection objects by user and organization,
     * available on the ThoughtSpot system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About search
     * DBT connection To get details of a specific DBT connection identifier, database connection
     * identifier, database connection name, database name, project name, project identifier,
     * environment identifier , import type and author.
     *
     * @return ApiResponse&lt;List&lt;DbtSearchResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Retrieved list of DBT connections successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<DbtSearchResponse>> dbtSearchWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = dbtSearchValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<DbtSearchResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Gets a list of DBT connection objects by user and
     * organization, available on the ThoughtSpot system. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About search
     * DBT connection To get details of a specific DBT connection identifier, database connection
     * identifier, database connection name, database name, project name, project identifier,
     * environment identifier , import type and author.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Retrieved list of DBT connections successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call dbtSearchAsync(final ApiCallback<List<DbtSearchResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = dbtSearchValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<DbtSearchResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteDbtConnection
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> DBT Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteDbtConnectionCall(
            String dbtConnectionIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/dbt/{dbt_connection_identifier}/delete"
                        .replace(
                                "{" + "dbt_connection_identifier" + "}",
                                localVarApiClient.escapeString(dbtConnectionIdentifier.toString()));

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
    private okhttp3.Call deleteDbtConnectionValidateBeforeCall(
            String dbtConnectionIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'dbtConnectionIdentifier' is set
        if (dbtConnectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'dbtConnectionIdentifier' when calling"
                            + " deleteDbtConnection(Async)");
        }

        return deleteDbtConnectionCall(dbtConnectionIdentifier, _callback);
    }

    /**
     * Version: 9.9.0.cl or later Removes the specified DBT connection object from the ThoughtSpot
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> DBT Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteDbtConnection(String dbtConnectionIdentifier) throws ApiException {
        deleteDbtConnectionWithHttpInfo(dbtConnectionIdentifier);
    }

    /**
     * Version: 9.9.0.cl or later Removes the specified DBT connection object from the ThoughtSpot
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> DBT Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteDbtConnectionWithHttpInfo(String dbtConnectionIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall =
                deleteDbtConnectionValidateBeforeCall(dbtConnectionIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Removes the specified DBT connection object from
     * the ThoughtSpot system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based
     * Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your
     * instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> DBT Connection successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteDbtConnectionAsync(
            String dbtConnectionIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall =
                deleteDbtConnectionValidateBeforeCall(dbtConnectionIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDbtConnection
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @param connectionName Name of the connection. (optional)
     * @param databaseName Name of the Database. (optional)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> DBT Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateDbtConnectionCall(
            String dbtConnectionIdentifier,
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent,
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/dbt/update-dbt-connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dbtConnectionIdentifier != null) {
            localVarFormParams.put("dbt_connection_identifier", dbtConnectionIdentifier);
        }

        if (connectionName != null) {
            localVarFormParams.put("connection_name", connectionName);
        }

        if (databaseName != null) {
            localVarFormParams.put("database_name", databaseName);
        }

        if (importType != null) {
            localVarFormParams.put("import_type", importType);
        }

        if (accessToken != null) {
            localVarFormParams.put("access_token", accessToken);
        }

        if (dbtUrl != null) {
            localVarFormParams.put("dbt_url", dbtUrl);
        }

        if (accountId != null) {
            localVarFormParams.put("account_id", accountId);
        }

        if (projectId != null) {
            localVarFormParams.put("project_id", projectId);
        }

        if (dbtEnvId != null) {
            localVarFormParams.put("dbt_env_id", dbtEnvId);
        }

        if (projectName != null) {
            localVarFormParams.put("project_name", projectName);
        }

        if (fileContent != null) {
            localVarFormParams.put("file_content", fileContent);
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
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
    private okhttp3.Call updateDbtConnectionValidateBeforeCall(
            String dbtConnectionIdentifier,
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'dbtConnectionIdentifier' is set
        if (dbtConnectionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'dbtConnectionIdentifier' when calling"
                            + " updateDbtConnection(Async)");
        }

        return updateDbtConnectionCall(
                dbtConnectionIdentifier,
                connectionName,
                databaseName,
                importType,
                accessToken,
                dbtUrl,
                accountId,
                projectId,
                dbtEnvId,
                projectName,
                fileContent,
                _callback);
    }

    /**
     * Version: 9.9.0.cl or later Updates a DBT connection object. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an
     * existing DBT connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About update
     * DBT connection You can modify DBT connection object properties such as embrace connection
     * name, embrace database name, import type, account identifier, access token, project
     * identifier and environment (or) embrace connection, embrace database name, import type,
     * file_content settings.
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @param connectionName Name of the connection. (optional)
     * @param databaseName Name of the Database. (optional)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> DBT Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Object updateDbtConnection(
            String dbtConnectionIdentifier,
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent)
            throws ApiException {
        ApiResponse<Object> localVarResp =
                updateDbtConnectionWithHttpInfo(
                        dbtConnectionIdentifier,
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent);
        return localVarResp.getData();
    }

    /**
     * Version: 9.9.0.cl or later Updates a DBT connection object. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an
     * existing DBT connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About update
     * DBT connection You can modify DBT connection object properties such as embrace connection
     * name, embrace database name, import type, account identifier, access token, project
     * identifier and environment (or) embrace connection, embrace database name, import type,
     * file_content settings.
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @param connectionName Name of the connection. (optional)
     * @param databaseName Name of the Database. (optional)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> DBT Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Object> updateDbtConnectionWithHttpInfo(
            String dbtConnectionIdentifier,
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateDbtConnectionValidateBeforeCall(
                        dbtConnectionIdentifier,
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent,
                        null);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.9.0.cl or later Updates a DBT connection object. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an
     * existing DBT connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About update
     * DBT connection You can modify DBT connection object properties such as embrace connection
     * name, embrace database name, import type, account identifier, access token, project
     * identifier and environment (or) embrace connection, embrace database name, import type,
     * file_content settings.
     *
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection. (required)
     * @param connectionName Name of the connection. (optional)
     * @param databaseName Name of the Database. (optional)
     * @param importType Mention type of Import (optional, default to DBT_CLOUD)
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
     * @param dbtEnvId DBT Environment ID\\\&quot; (optional)
     * @param projectName Name of the project (optional)
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field
     *     is Mandatory when Import Type is &#39;ZIP_FILE&#39; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> DBT Connection successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateDbtConnectionAsync(
            String dbtConnectionIdentifier,
            String connectionName,
            String databaseName,
            String importType,
            String accessToken,
            String dbtUrl,
            String accountId,
            String projectId,
            String dbtEnvId,
            String projectName,
            File fileContent,
            final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateDbtConnectionValidateBeforeCall(
                        dbtConnectionIdentifier,
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent,
                        _callback);
        Type localVarReturnType = new TypeToken<Object>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
