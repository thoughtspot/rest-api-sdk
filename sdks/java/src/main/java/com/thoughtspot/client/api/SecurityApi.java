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
import com.thoughtspot.client.model.AssignChangeAuthorRequest;
import com.thoughtspot.client.model.ColumnSecurityRuleResponse;
import com.thoughtspot.client.model.FetchColumnSecurityRulesRequest;
import com.thoughtspot.client.model.FetchPermissionsOfPrincipalsRequest;
import com.thoughtspot.client.model.FetchPermissionsOnMetadataRequest;
import com.thoughtspot.client.model.PermissionOfMetadataResponse;
import com.thoughtspot.client.model.PermissionOfPrincipalsResponse;
import com.thoughtspot.client.model.PublishMetadataRequest;
import com.thoughtspot.client.model.ShareMetadataRequest;
import com.thoughtspot.client.model.UnpublishMetadataRequest;
import com.thoughtspot.client.model.UpdateColumnSecurityRulesRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SecurityApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SecurityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public SecurityApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for assignChangeAuthor
     *
     * @param assignChangeAuthorRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Author assignment for given metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call assignChangeAuthorCall(
            AssignChangeAuthorRequest assignChangeAuthorRequest, final ApiCallback _callback)
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

        Object localVarPostBody = assignChangeAuthorRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/metadata/assign";

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
    private okhttp3.Call assignChangeAuthorValidateBeforeCall(
            AssignChangeAuthorRequest assignChangeAuthorRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'assignChangeAuthorRequest' is set
        if (assignChangeAuthorRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'assignChangeAuthorRequest' when calling"
                            + " assignChangeAuthor(Async)");
        }

        return assignChangeAuthorCall(assignChangeAuthorRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Transfers the ownership of one or several objects from one user to
     * another. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and
     * edit access to the objects are required.
     *
     * @param assignChangeAuthorRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Author assignment for given metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void assignChangeAuthor(AssignChangeAuthorRequest assignChangeAuthorRequest)
            throws ApiException {
        assignChangeAuthorWithHttpInfo(assignChangeAuthorRequest);
    }

    /**
     * Version: 9.0.0.cl or later Transfers the ownership of one or several objects from one user to
     * another. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and
     * edit access to the objects are required.
     *
     * @param assignChangeAuthorRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Author assignment for given metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> assignChangeAuthorWithHttpInfo(
            AssignChangeAuthorRequest assignChangeAuthorRequest) throws ApiException {
        okhttp3.Call localVarCall =
                assignChangeAuthorValidateBeforeCall(assignChangeAuthorRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Transfers the ownership of one or several objects
     * from one user to another. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and edit access to the
     * objects are required.
     *
     * @param assignChangeAuthorRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Author assignment for given metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call assignChangeAuthorAsync(
            AssignChangeAuthorRequest assignChangeAuthorRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                assignChangeAuthorValidateBeforeCall(assignChangeAuthorRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchColumnSecurityRules
     *
     * @param fetchColumnSecurityRulesRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully fetched column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Table not found or invalid parameters </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to access security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchColumnSecurityRulesCall(
            FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest,
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

        Object localVarPostBody = fetchColumnSecurityRulesRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/column/rules/fetch";

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
    private okhttp3.Call fetchColumnSecurityRulesValidateBeforeCall(
            FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'fetchColumnSecurityRulesRequest' is set
        if (fetchColumnSecurityRulesRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'fetchColumnSecurityRulesRequest' when calling"
                            + " fetchColumnSecurityRules(Async)");
        }

        return fetchColumnSecurityRulesCall(fetchColumnSecurityRulesRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Fetches column security rules for specified tables. This API
     * endpoint retrieves column-level security rules configured for tables. It returns information
     * about which columns are secured and which groups have access to those columns. #### Usage
     * guidelines - Provide an array of table identifiers using either &#x60;identifier&#x60; (GUID
     * or name) or &#x60;obj_identifier&#x60; (object ID) - At least one of &#x60;identifier&#x60;
     * or &#x60;obj_identifier&#x60; must be provided for each table - The API returns column
     * security rules for all specified tables - Users must have appropriate permissions to access
     * security rules for the specified tables #### Required permissions -
     * &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can
     * manage data - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and
     * tables #### Example request &#x60;&#x60;&#x60;json { \&quot;tables\&quot;: [ {
     * \&quot;identifier\&quot;: \&quot;table-guid\&quot;, \&quot;obj_identifier\&quot;:
     * \&quot;table-object-id\&quot; } ] } &#x60;&#x60;&#x60; #### Response format The API returns
     * an array of &#x60;ColumnSecurityRuleResponse&#x60; objects wrapped in a &#x60;data&#x60;
     * field. Each &#x60;ColumnSecurityRuleResponse&#x60; object contains: - Table information (GUID
     * and object ID) - Array of column security rules with column details, group access, and source
     * table information #### Example response &#x60;&#x60;&#x60;json { \&quot;data\&quot;: [ {
     * \&quot;guid\&quot;: \&quot;table-guid\&quot;, \&quot;objId\&quot;:
     * \&quot;table-object-id\&quot;, \&quot;columnSecurityRules\&quot;: [ { \&quot;column\&quot;: {
     * \&quot;id\&quot;: \&quot;col_123\&quot;, \&quot;name\&quot;: \&quot;Salary\&quot; },
     * \&quot;groups\&quot;: [ { \&quot;id\&quot;: \&quot;group_1\&quot;, \&quot;name\&quot;:
     * \&quot;HR Department\&quot; } ], \&quot;sourceTableDetails\&quot;: { \&quot;id\&quot;:
     * \&quot;source-table-guid\&quot;, \&quot;name\&quot;: \&quot;Employee_Data\&quot; } } ] } ] }
     * &#x60;&#x60;&#x60;
     *
     * @param fetchColumnSecurityRulesRequest (required)
     * @return List&lt;ColumnSecurityRuleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully fetched column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Table not found or invalid parameters </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to access security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public List<ColumnSecurityRuleResponse> fetchColumnSecurityRules(
            FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest) throws ApiException {
        ApiResponse<List<ColumnSecurityRuleResponse>> localVarResp =
                fetchColumnSecurityRulesWithHttpInfo(fetchColumnSecurityRulesRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.12.0.cl or later Fetches column security rules for specified tables. This API
     * endpoint retrieves column-level security rules configured for tables. It returns information
     * about which columns are secured and which groups have access to those columns. #### Usage
     * guidelines - Provide an array of table identifiers using either &#x60;identifier&#x60; (GUID
     * or name) or &#x60;obj_identifier&#x60; (object ID) - At least one of &#x60;identifier&#x60;
     * or &#x60;obj_identifier&#x60; must be provided for each table - The API returns column
     * security rules for all specified tables - Users must have appropriate permissions to access
     * security rules for the specified tables #### Required permissions -
     * &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can
     * manage data - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and
     * tables #### Example request &#x60;&#x60;&#x60;json { \&quot;tables\&quot;: [ {
     * \&quot;identifier\&quot;: \&quot;table-guid\&quot;, \&quot;obj_identifier\&quot;:
     * \&quot;table-object-id\&quot; } ] } &#x60;&#x60;&#x60; #### Response format The API returns
     * an array of &#x60;ColumnSecurityRuleResponse&#x60; objects wrapped in a &#x60;data&#x60;
     * field. Each &#x60;ColumnSecurityRuleResponse&#x60; object contains: - Table information (GUID
     * and object ID) - Array of column security rules with column details, group access, and source
     * table information #### Example response &#x60;&#x60;&#x60;json { \&quot;data\&quot;: [ {
     * \&quot;guid\&quot;: \&quot;table-guid\&quot;, \&quot;objId\&quot;:
     * \&quot;table-object-id\&quot;, \&quot;columnSecurityRules\&quot;: [ { \&quot;column\&quot;: {
     * \&quot;id\&quot;: \&quot;col_123\&quot;, \&quot;name\&quot;: \&quot;Salary\&quot; },
     * \&quot;groups\&quot;: [ { \&quot;id\&quot;: \&quot;group_1\&quot;, \&quot;name\&quot;:
     * \&quot;HR Department\&quot; } ], \&quot;sourceTableDetails\&quot;: { \&quot;id\&quot;:
     * \&quot;source-table-guid\&quot;, \&quot;name\&quot;: \&quot;Employee_Data\&quot; } } ] } ] }
     * &#x60;&#x60;&#x60;
     *
     * @param fetchColumnSecurityRulesRequest (required)
     * @return ApiResponse&lt;List&lt;ColumnSecurityRuleResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully fetched column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Table not found or invalid parameters </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to access security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<ColumnSecurityRuleResponse>> fetchColumnSecurityRulesWithHttpInfo(
            FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest) throws ApiException {
        okhttp3.Call localVarCall =
                fetchColumnSecurityRulesValidateBeforeCall(fetchColumnSecurityRulesRequest, null);
        Type localVarReturnType = new TypeToken<List<ColumnSecurityRuleResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Fetches column security rules for specified
     * tables. This API endpoint retrieves column-level security rules configured for tables. It
     * returns information about which columns are secured and which groups have access to those
     * columns. #### Usage guidelines - Provide an array of table identifiers using either
     * &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - At least
     * one of &#x60;identifier&#x60; or &#x60;obj_identifier&#x60; must be provided for each table -
     * The API returns column security rules for all specified tables - Users must have appropriate
     * permissions to access security rules for the specified tables #### Required permissions -
     * &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can
     * manage data - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and
     * tables #### Example request &#x60;&#x60;&#x60;json { \&quot;tables\&quot;: [ {
     * \&quot;identifier\&quot;: \&quot;table-guid\&quot;, \&quot;obj_identifier\&quot;:
     * \&quot;table-object-id\&quot; } ] } &#x60;&#x60;&#x60; #### Response format The API returns
     * an array of &#x60;ColumnSecurityRuleResponse&#x60; objects wrapped in a &#x60;data&#x60;
     * field. Each &#x60;ColumnSecurityRuleResponse&#x60; object contains: - Table information (GUID
     * and object ID) - Array of column security rules with column details, group access, and source
     * table information #### Example response &#x60;&#x60;&#x60;json { \&quot;data\&quot;: [ {
     * \&quot;guid\&quot;: \&quot;table-guid\&quot;, \&quot;objId\&quot;:
     * \&quot;table-object-id\&quot;, \&quot;columnSecurityRules\&quot;: [ { \&quot;column\&quot;: {
     * \&quot;id\&quot;: \&quot;col_123\&quot;, \&quot;name\&quot;: \&quot;Salary\&quot; },
     * \&quot;groups\&quot;: [ { \&quot;id\&quot;: \&quot;group_1\&quot;, \&quot;name\&quot;:
     * \&quot;HR Department\&quot; } ], \&quot;sourceTableDetails\&quot;: { \&quot;id\&quot;:
     * \&quot;source-table-guid\&quot;, \&quot;name\&quot;: \&quot;Employee_Data\&quot; } } ] } ] }
     * &#x60;&#x60;&#x60;
     *
     * @param fetchColumnSecurityRulesRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successfully fetched column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Table not found or invalid parameters </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to access security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchColumnSecurityRulesAsync(
            FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest,
            final ApiCallback<List<ColumnSecurityRuleResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                fetchColumnSecurityRulesValidateBeforeCall(
                        fetchColumnSecurityRulesRequest, _callback);
        Type localVarReturnType = new TypeToken<List<ColumnSecurityRuleResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchPermissionsOfPrincipals
     *
     * @param fetchPermissionsOfPrincipalsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of principals is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchPermissionsOfPrincipalsCall(
            FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest,
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

        Object localVarPostBody = fetchPermissionsOfPrincipalsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/principals/fetch-permissions";

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
    private okhttp3.Call fetchPermissionsOfPrincipalsValidateBeforeCall(
            FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'fetchPermissionsOfPrincipalsRequest' is set
        if (fetchPermissionsOfPrincipalsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'fetchPermissionsOfPrincipalsRequest' when"
                            + " calling fetchPermissionsOfPrincipals(Async)");
        }

        return fetchPermissionsOfPrincipalsCall(fetchPermissionsOfPrincipalsRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Fetches object permission details for a given principal object
     * such as a user and group. Requires view access to the metadata object. #### Usage guidelines
     * * To get a list of all metadata objects that a user or group can access, specify the
     * &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a
     * specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API
     * request. Upon successful execution, the API returns a list of metadata objects and permission
     * details for each object.
     *
     * @param fetchPermissionsOfPrincipalsRequest (required)
     * @return PermissionOfPrincipalsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of principals is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public PermissionOfPrincipalsResponse fetchPermissionsOfPrincipals(
            FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest)
            throws ApiException {
        ApiResponse<PermissionOfPrincipalsResponse> localVarResp =
                fetchPermissionsOfPrincipalsWithHttpInfo(fetchPermissionsOfPrincipalsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Fetches object permission details for a given principal object
     * such as a user and group. Requires view access to the metadata object. #### Usage guidelines
     * * To get a list of all metadata objects that a user or group can access, specify the
     * &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a
     * specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API
     * request. Upon successful execution, the API returns a list of metadata objects and permission
     * details for each object.
     *
     * @param fetchPermissionsOfPrincipalsRequest (required)
     * @return ApiResponse&lt;PermissionOfPrincipalsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of principals is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<PermissionOfPrincipalsResponse> fetchPermissionsOfPrincipalsWithHttpInfo(
            FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                fetchPermissionsOfPrincipalsValidateBeforeCall(
                        fetchPermissionsOfPrincipalsRequest, null);
        Type localVarReturnType = new TypeToken<PermissionOfPrincipalsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Fetches object permission details for a given
     * principal object such as a user and group. Requires view access to the metadata object. ####
     * Usage guidelines * To get a list of all metadata objects that a user or group can access,
     * specify the &#x60;type&#x60; and GUID or name of the principal. * To get permission details
     * for a specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to
     * your API request. Upon successful execution, the API returns a list of metadata objects and
     * permission details for each object.
     *
     * @param fetchPermissionsOfPrincipalsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of principals is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchPermissionsOfPrincipalsAsync(
            FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest,
            final ApiCallback<PermissionOfPrincipalsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                fetchPermissionsOfPrincipalsValidateBeforeCall(
                        fetchPermissionsOfPrincipalsRequest, _callback);
        Type localVarReturnType = new TypeToken<PermissionOfPrincipalsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchPermissionsOnMetadata
     *
     * @param fetchPermissionsOnMetadataRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchPermissionsOnMetadataCall(
            FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest,
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

        Object localVarPostBody = fetchPermissionsOnMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/metadata/fetch-permissions";

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
    private okhttp3.Call fetchPermissionsOnMetadataValidateBeforeCall(
            FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'fetchPermissionsOnMetadataRequest' is set
        if (fetchPermissionsOnMetadataRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'fetchPermissionsOnMetadataRequest' when"
                            + " calling fetchPermissionsOnMetadata(Async)");
        }

        return fetchPermissionsOnMetadataCall(fetchPermissionsOnMetadataRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Fetches permission details for a given metadata object. Requires
     * view access to the metadata object. #### Usage guidelines * To fetch a list of users and
     * groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the metadata
     * object. * To get permission details for a specific user or group, add &#x60;type&#x60; and
     * GUID or name of the principal object to your API request. Upon successful execution, the API
     * returns permission details and principal information for the object specified in the API
     * request.
     *
     * @param fetchPermissionsOnMetadataRequest (required)
     * @return PermissionOfMetadataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public PermissionOfMetadataResponse fetchPermissionsOnMetadata(
            FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest)
            throws ApiException {
        ApiResponse<PermissionOfMetadataResponse> localVarResp =
                fetchPermissionsOnMetadataWithHttpInfo(fetchPermissionsOnMetadataRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Fetches permission details for a given metadata object. Requires
     * view access to the metadata object. #### Usage guidelines * To fetch a list of users and
     * groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the metadata
     * object. * To get permission details for a specific user or group, add &#x60;type&#x60; and
     * GUID or name of the principal object to your API request. Upon successful execution, the API
     * returns permission details and principal information for the object specified in the API
     * request.
     *
     * @param fetchPermissionsOnMetadataRequest (required)
     * @return ApiResponse&lt;PermissionOfMetadataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<PermissionOfMetadataResponse> fetchPermissionsOnMetadataWithHttpInfo(
            FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                fetchPermissionsOnMetadataValidateBeforeCall(
                        fetchPermissionsOnMetadataRequest, null);
        Type localVarReturnType = new TypeToken<PermissionOfMetadataResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Fetches permission details for a given metadata
     * object. Requires view access to the metadata object. #### Usage guidelines * To fetch a list
     * of users and groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the
     * metadata object. * To get permission details for a specific user or group, add
     * &#x60;type&#x60; and GUID or name of the principal object to your API request. Upon
     * successful execution, the API returns permission details and principal information for the
     * object specified in the API request.
     *
     * @param fetchPermissionsOnMetadataRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching permissions of metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchPermissionsOnMetadataAsync(
            FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest,
            final ApiCallback<PermissionOfMetadataResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                fetchPermissionsOnMetadataValidateBeforeCall(
                        fetchPermissionsOnMetadataRequest, _callback);
        Type localVarReturnType = new TypeToken<PermissionOfMetadataResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for publishMetadata
     *
     * @param publishMetadataRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Publishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call publishMetadataCall(
            PublishMetadataRequest publishMetadataRequest, final ApiCallback _callback)
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

        Object localVarPostBody = publishMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/metadata/publish";

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
    private okhttp3.Call publishMetadataValidateBeforeCall(
            PublishMetadataRequest publishMetadataRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'publishMetadataRequest' is set
        if (publishMetadataRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'publishMetadataRequest' when calling"
                            + " publishMetadata(Async)");
        }

        return publishMetadataCall(publishMetadataRequest, _callback);
    }

    /**
     * Version: 10.9.0.cl or later Allows publishing metadata objects across organizations in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint allows
     * publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables
     * This API will essentially share the objects along with it&#39;s dependencies to the org
     * admins of the orgs to which it is being published.
     *
     * @param publishMetadataRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Publishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void publishMetadata(PublishMetadataRequest publishMetadataRequest) throws ApiException {
        publishMetadataWithHttpInfo(publishMetadataRequest);
    }

    /**
     * Version: 10.9.0.cl or later Allows publishing metadata objects across organizations in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint allows
     * publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables
     * This API will essentially share the objects along with it&#39;s dependencies to the org
     * admins of the orgs to which it is being published.
     *
     * @param publishMetadataRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Publishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> publishMetadataWithHttpInfo(
            PublishMetadataRequest publishMetadataRequest) throws ApiException {
        okhttp3.Call localVarCall = publishMetadataValidateBeforeCall(publishMetadataRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.9.0.cl or later Allows publishing metadata objects across
     * organizations in ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint
     * allows publishing the following types of metadata objects: * Liveboards * Answers * Logical
     * Tables This API will essentially share the objects along with it&#39;s dependencies to the
     * org admins of the orgs to which it is being published.
     *
     * @param publishMetadataRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Publishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call publishMetadataAsync(
            PublishMetadataRequest publishMetadataRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                publishMetadataValidateBeforeCall(publishMetadataRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for shareMetadata
     *
     * @param shareMetadataRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Sharing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call shareMetadataCall(
            ShareMetadataRequest shareMetadataRequest, final ApiCallback _callback)
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

        Object localVarPostBody = shareMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/metadata/share";

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
    private okhttp3.Call shareMetadataValidateBeforeCall(
            ShareMetadataRequest shareMetadataRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'shareMetadataRequest' is set
        if (shareMetadataRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'shareMetadataRequest' when calling"
                            + " shareMetadata(Async)");
        }

        return shareMetadataCall(shareMetadataRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Allows sharing one or several metadata objects with users and
     * groups in ThoughtSpot. Requires edit access to the metadata object. #### Supported metadata
     * objects: * Liveboards * Visualizations * Answers * Models * Views * Connections #### Object
     * permissions You can provide &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; access when sharing
     * an object with another user or group. The &#x60;READ_ONLY&#x60; permission grants view access
     * to the shared object, whereas &#x60;MODIFY&#x60; provides edit access. To prevent a user or
     * group from accessing the shared object, specify the GUID or name of the principal and set
     * &#x60;shareMode&#x60; to &#x60;NO_ACCESS&#x60;. #### Sharing a visualization * Sharing a
     * visualization implicitly shares the entire Liveboard with the recipient. * Object permissions
     * set for a shared visualization also apply to the Liveboard unless overridden by another API
     * request or via UI. * If email notifications for object sharing are enabled, a notification
     * with a link to the shared visualization will be sent to the recipient’s email address.
     * Although this link opens the shared visualization, recipients can also access other
     * visualizations in the Liveboard.
     *
     * @param shareMetadataRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Sharing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void shareMetadata(ShareMetadataRequest shareMetadataRequest) throws ApiException {
        shareMetadataWithHttpInfo(shareMetadataRequest);
    }

    /**
     * Version: 9.0.0.cl or later Allows sharing one or several metadata objects with users and
     * groups in ThoughtSpot. Requires edit access to the metadata object. #### Supported metadata
     * objects: * Liveboards * Visualizations * Answers * Models * Views * Connections #### Object
     * permissions You can provide &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; access when sharing
     * an object with another user or group. The &#x60;READ_ONLY&#x60; permission grants view access
     * to the shared object, whereas &#x60;MODIFY&#x60; provides edit access. To prevent a user or
     * group from accessing the shared object, specify the GUID or name of the principal and set
     * &#x60;shareMode&#x60; to &#x60;NO_ACCESS&#x60;. #### Sharing a visualization * Sharing a
     * visualization implicitly shares the entire Liveboard with the recipient. * Object permissions
     * set for a shared visualization also apply to the Liveboard unless overridden by another API
     * request or via UI. * If email notifications for object sharing are enabled, a notification
     * with a link to the shared visualization will be sent to the recipient’s email address.
     * Although this link opens the shared visualization, recipients can also access other
     * visualizations in the Liveboard.
     *
     * @param shareMetadataRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Sharing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> shareMetadataWithHttpInfo(ShareMetadataRequest shareMetadataRequest)
            throws ApiException {
        okhttp3.Call localVarCall = shareMetadataValidateBeforeCall(shareMetadataRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Allows sharing one or several metadata objects
     * with users and groups in ThoughtSpot. Requires edit access to the metadata object. ####
     * Supported metadata objects: * Liveboards * Visualizations * Answers * Models * Views *
     * Connections #### Object permissions You can provide &#x60;READ_ONLY&#x60; or
     * &#x60;MODIFY&#x60; access when sharing an object with another user or group. The
     * &#x60;READ_ONLY&#x60; permission grants view access to the shared object, whereas
     * &#x60;MODIFY&#x60; provides edit access. To prevent a user or group from accessing the shared
     * object, specify the GUID or name of the principal and set &#x60;shareMode&#x60; to
     * &#x60;NO_ACCESS&#x60;. #### Sharing a visualization * Sharing a visualization implicitly
     * shares the entire Liveboard with the recipient. * Object permissions set for a shared
     * visualization also apply to the Liveboard unless overridden by another API request or via UI.
     * * If email notifications for object sharing are enabled, a notification with a link to the
     * shared visualization will be sent to the recipient’s email address. Although this link opens
     * the shared visualization, recipients can also access other visualizations in the Liveboard.
     *
     * @param shareMetadataRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Sharing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call shareMetadataAsync(
            ShareMetadataRequest shareMetadataRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                shareMetadataValidateBeforeCall(shareMetadataRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for unpublishMetadata
     *
     * @param unpublishMetadataRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Unpublishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call unpublishMetadataCall(
            UnpublishMetadataRequest unpublishMetadataRequest, final ApiCallback _callback)
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

        Object localVarPostBody = unpublishMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/metadata/unpublish";

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
    private okhttp3.Call unpublishMetadataValidateBeforeCall(
            UnpublishMetadataRequest unpublishMetadataRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'unpublishMetadataRequest' is set
        if (unpublishMetadataRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'unpublishMetadataRequest' when calling"
                            + " unpublishMetadata(Async)");
        }

        return unpublishMetadataCall(unpublishMetadataRequest, _callback);
    }

    /**
     * Version: 10.9.0.cl or later Allows unpublishing metadata objects from organizations in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint allows
     * unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables
     * When unpublishing objects, you can: * Include dependencies by setting
     * &#x60;include_dependencies&#x60; to true - this will unpublish all dependent objects if no
     * other published object is using them * Force unpublish by setting &#x60;force&#x60; to true -
     * this will break all dependent objects in the unpublished organizations
     *
     * @param unpublishMetadataRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Unpublishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void unpublishMetadata(UnpublishMetadataRequest unpublishMetadataRequest)
            throws ApiException {
        unpublishMetadataWithHttpInfo(unpublishMetadataRequest);
    }

    /**
     * Version: 10.9.0.cl or later Allows unpublishing metadata objects from organizations in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint allows
     * unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables
     * When unpublishing objects, you can: * Include dependencies by setting
     * &#x60;include_dependencies&#x60; to true - this will unpublish all dependent objects if no
     * other published object is using them * Force unpublish by setting &#x60;force&#x60; to true -
     * this will break all dependent objects in the unpublished organizations
     *
     * @param unpublishMetadataRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Unpublishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> unpublishMetadataWithHttpInfo(
            UnpublishMetadataRequest unpublishMetadataRequest) throws ApiException {
        okhttp3.Call localVarCall =
                unpublishMetadataValidateBeforeCall(unpublishMetadataRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.9.0.cl or later Allows unpublishing metadata objects from
     * organizations in ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint
     * allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical
     * Tables When unpublishing objects, you can: * Include dependencies by setting
     * &#x60;include_dependencies&#x60; to true - this will unpublish all dependent objects if no
     * other published object is using them * Force unpublish by setting &#x60;force&#x60; to true -
     * this will break all dependent objects in the unpublished organizations
     *
     * @param unpublishMetadataRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Unpublishing metadata objects is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call unpublishMetadataAsync(
            UnpublishMetadataRequest unpublishMetadataRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                unpublishMetadataValidateBeforeCall(unpublishMetadataRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateColumnSecurityRules
     *
     * @param updateColumnSecurityRulesRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Invalid parameters or table not found </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to modify security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateColumnSecurityRulesCall(
            UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest,
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

        Object localVarPostBody = updateColumnSecurityRulesRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/security/column/rules/update";

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
    private okhttp3.Call updateColumnSecurityRulesValidateBeforeCall(
            UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'updateColumnSecurityRulesRequest' is set
        if (updateColumnSecurityRulesRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateColumnSecurityRulesRequest' when"
                            + " calling updateColumnSecurityRules(Async)");
        }

        return updateColumnSecurityRulesCall(updateColumnSecurityRulesRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Creates, updates, or deletes column security rules for specified
     * tables. This API endpoint allows you to create, update, or delete column-level security rules
     * on columns of a table. The operation follows an \&quot;all or none\&quot; policy: if defining
     * security rules for any of the provided columns fails, the entire operation will be rolled
     * back, and no rules will be created. #### Usage guidelines - Provide table identifier using
     * either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - Use
     * &#x60;clear_csr: true&#x60; to remove all column security rules from the table - For each
     * column, specify the security rule using &#x60;column_security_rules&#x60; array - Use
     * &#x60;is_unsecured: true&#x60; to mark a specific column as unprotected - Use
     * &#x60;group_access&#x60; operations to manage group associations: - &#x60;ADD&#x60;: Add
     * groups to the column&#39;s access list - &#x60;REMOVE&#x60;: Remove groups from the
     * column&#39;s access list - &#x60;REPLACE&#x60;: Replace all existing groups with the
     * specified groups #### Required permissions - &#x60;ADMINISTRATION&#x60; - Can administer
     * ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data (if RBAC is disabled) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables (if
     * RBAC is enabled) #### Example request &#x60;&#x60;&#x60;json { \&quot;identifier\&quot;:
     * \&quot;table-guid\&quot;, \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;,
     * \&quot;clear_csr\&quot;: false, \&quot;column_security_rules\&quot;: [ {
     * \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,
     * \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ { \&quot;operation\&quot;:
     * \&quot;ADD\&quot;, \&quot;group_identifiers\&quot;: [\&quot;hr_group_id\&quot;,
     * \&quot;hr_group_name\&quot;, \&quot;finance_group_id\&quot;] } ] }, {
     * \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,
     * \&quot;is_unsecured\&quot;: true }, { \&quot;column_identifier\&quot;: \&quot;col id or col
     * name\&quot;, \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ {
     * \&quot;operation\&quot;: \&quot;REPLACE\&quot;, \&quot;group_identifiers\&quot;:
     * [\&quot;management_group_id\&quot;, \&quot;management_group_name\&quot;] } ] } ] }
     * &#x60;&#x60;&#x60; #### Request Body Schema - &#x60;identifier&#x60; (string, optional): GUID
     * or name of the table for which we want to create column security rules -
     * &#x60;obj_identifier&#x60; (string, optional): The object ID of the table -
     * &#x60;clear_csr&#x60; (boolean, optional): If true, then all the secured columns will be
     * marked as unprotected, and all the group associations will be removed -
     * &#x60;column_security_rules&#x60; (array of objects, required): An array where each object
     * defines the security rule for a specific column Each column security rule object contains: -
     * &#x60;column_identifier&#x60; (string, required): Column identifier (col_id or name) -
     * &#x60;is_unsecured&#x60; (boolean, optional): If true, the column will be marked as
     * unprotected and all groups associated with it will be removed - &#x60;group_access&#x60;
     * (array of objects, optional): Array of group operation objects Each group operation object
     * contains: - &#x60;operation&#x60; (string, required): Operation type - ADD, REMOVE, or
     * REPLACE - &#x60;group_identifiers&#x60; (array of strings, required): Array of group
     * identifiers (name or GUID) on which the operation will be performed #### Response This API
     * does not return any response body. A successful operation returns HTTP 200 status code. ####
     * Operation Types - **ADD**: Adds the specified groups to the column&#39;s access list -
     * **REMOVE**: Removes the specified groups from the column&#39;s access list - **REPLACE**:
     * Replaces all existing groups with the specified groups
     *
     * @param updateColumnSecurityRulesRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Invalid parameters or table not found </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to modify security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateColumnSecurityRules(
            UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest) throws ApiException {
        updateColumnSecurityRulesWithHttpInfo(updateColumnSecurityRulesRequest);
    }

    /**
     * Version: 10.12.0.cl or later Creates, updates, or deletes column security rules for specified
     * tables. This API endpoint allows you to create, update, or delete column-level security rules
     * on columns of a table. The operation follows an \&quot;all or none\&quot; policy: if defining
     * security rules for any of the provided columns fails, the entire operation will be rolled
     * back, and no rules will be created. #### Usage guidelines - Provide table identifier using
     * either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - Use
     * &#x60;clear_csr: true&#x60; to remove all column security rules from the table - For each
     * column, specify the security rule using &#x60;column_security_rules&#x60; array - Use
     * &#x60;is_unsecured: true&#x60; to mark a specific column as unprotected - Use
     * &#x60;group_access&#x60; operations to manage group associations: - &#x60;ADD&#x60;: Add
     * groups to the column&#39;s access list - &#x60;REMOVE&#x60;: Remove groups from the
     * column&#39;s access list - &#x60;REPLACE&#x60;: Replace all existing groups with the
     * specified groups #### Required permissions - &#x60;ADMINISTRATION&#x60; - Can administer
     * ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data (if RBAC is disabled) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables (if
     * RBAC is enabled) #### Example request &#x60;&#x60;&#x60;json { \&quot;identifier\&quot;:
     * \&quot;table-guid\&quot;, \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;,
     * \&quot;clear_csr\&quot;: false, \&quot;column_security_rules\&quot;: [ {
     * \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,
     * \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ { \&quot;operation\&quot;:
     * \&quot;ADD\&quot;, \&quot;group_identifiers\&quot;: [\&quot;hr_group_id\&quot;,
     * \&quot;hr_group_name\&quot;, \&quot;finance_group_id\&quot;] } ] }, {
     * \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,
     * \&quot;is_unsecured\&quot;: true }, { \&quot;column_identifier\&quot;: \&quot;col id or col
     * name\&quot;, \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ {
     * \&quot;operation\&quot;: \&quot;REPLACE\&quot;, \&quot;group_identifiers\&quot;:
     * [\&quot;management_group_id\&quot;, \&quot;management_group_name\&quot;] } ] } ] }
     * &#x60;&#x60;&#x60; #### Request Body Schema - &#x60;identifier&#x60; (string, optional): GUID
     * or name of the table for which we want to create column security rules -
     * &#x60;obj_identifier&#x60; (string, optional): The object ID of the table -
     * &#x60;clear_csr&#x60; (boolean, optional): If true, then all the secured columns will be
     * marked as unprotected, and all the group associations will be removed -
     * &#x60;column_security_rules&#x60; (array of objects, required): An array where each object
     * defines the security rule for a specific column Each column security rule object contains: -
     * &#x60;column_identifier&#x60; (string, required): Column identifier (col_id or name) -
     * &#x60;is_unsecured&#x60; (boolean, optional): If true, the column will be marked as
     * unprotected and all groups associated with it will be removed - &#x60;group_access&#x60;
     * (array of objects, optional): Array of group operation objects Each group operation object
     * contains: - &#x60;operation&#x60; (string, required): Operation type - ADD, REMOVE, or
     * REPLACE - &#x60;group_identifiers&#x60; (array of strings, required): Array of group
     * identifiers (name or GUID) on which the operation will be performed #### Response This API
     * does not return any response body. A successful operation returns HTTP 200 status code. ####
     * Operation Types - **ADD**: Adds the specified groups to the column&#39;s access list -
     * **REMOVE**: Removes the specified groups from the column&#39;s access list - **REPLACE**:
     * Replaces all existing groups with the specified groups
     *
     * @param updateColumnSecurityRulesRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Invalid parameters or table not found </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to modify security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateColumnSecurityRulesWithHttpInfo(
            UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest) throws ApiException {
        okhttp3.Call localVarCall =
                updateColumnSecurityRulesValidateBeforeCall(updateColumnSecurityRulesRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Creates, updates, or deletes column security
     * rules for specified tables. This API endpoint allows you to create, update, or delete
     * column-level security rules on columns of a table. The operation follows an \&quot;all or
     * none\&quot; policy: if defining security rules for any of the provided columns fails, the
     * entire operation will be rolled back, and no rules will be created. #### Usage guidelines -
     * Provide table identifier using either &#x60;identifier&#x60; (GUID or name) or
     * &#x60;obj_identifier&#x60; (object ID) - Use &#x60;clear_csr: true&#x60; to remove all column
     * security rules from the table - For each column, specify the security rule using
     * &#x60;column_security_rules&#x60; array - Use &#x60;is_unsecured: true&#x60; to mark a
     * specific column as unprotected - Use &#x60;group_access&#x60; operations to manage group
     * associations: - &#x60;ADD&#x60;: Add groups to the column&#39;s access list -
     * &#x60;REMOVE&#x60;: Remove groups from the column&#39;s access list - &#x60;REPLACE&#x60;:
     * Replace all existing groups with the specified groups #### Required permissions -
     * &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can
     * manage data (if RBAC is disabled) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can
     * manage worksheet views and tables (if RBAC is enabled) #### Example request
     * &#x60;&#x60;&#x60;json { \&quot;identifier\&quot;: \&quot;table-guid\&quot;,
     * \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;, \&quot;clear_csr\&quot;: false,
     * \&quot;column_security_rules\&quot;: [ { \&quot;column_identifier\&quot;: \&quot;col id or
     * col name\&quot;, \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ {
     * \&quot;operation\&quot;: \&quot;ADD\&quot;, \&quot;group_identifiers\&quot;:
     * [\&quot;hr_group_id\&quot;, \&quot;hr_group_name\&quot;, \&quot;finance_group_id\&quot;] } ]
     * }, { \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,
     * \&quot;is_unsecured\&quot;: true }, { \&quot;column_identifier\&quot;: \&quot;col id or col
     * name\&quot;, \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ {
     * \&quot;operation\&quot;: \&quot;REPLACE\&quot;, \&quot;group_identifiers\&quot;:
     * [\&quot;management_group_id\&quot;, \&quot;management_group_name\&quot;] } ] } ] }
     * &#x60;&#x60;&#x60; #### Request Body Schema - &#x60;identifier&#x60; (string, optional): GUID
     * or name of the table for which we want to create column security rules -
     * &#x60;obj_identifier&#x60; (string, optional): The object ID of the table -
     * &#x60;clear_csr&#x60; (boolean, optional): If true, then all the secured columns will be
     * marked as unprotected, and all the group associations will be removed -
     * &#x60;column_security_rules&#x60; (array of objects, required): An array where each object
     * defines the security rule for a specific column Each column security rule object contains: -
     * &#x60;column_identifier&#x60; (string, required): Column identifier (col_id or name) -
     * &#x60;is_unsecured&#x60; (boolean, optional): If true, the column will be marked as
     * unprotected and all groups associated with it will be removed - &#x60;group_access&#x60;
     * (array of objects, optional): Array of group operation objects Each group operation object
     * contains: - &#x60;operation&#x60; (string, required): Operation type - ADD, REMOVE, or
     * REPLACE - &#x60;group_identifiers&#x60; (array of strings, required): Array of group
     * identifiers (name or GUID) on which the operation will be performed #### Response This API
     * does not return any response body. A successful operation returns HTTP 200 status code. ####
     * Operation Types - **ADD**: Adds the specified groups to the column&#39;s access list -
     * **REMOVE**: Removes the specified groups from the column&#39;s access list - **REPLACE**:
     * Replaces all existing groups with the specified groups
     *
     * @param updateColumnSecurityRulesRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Successfully updated column security rules </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request - Invalid parameters or table not found </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden - User doesn&#39;t have permission to modify security rules for this table </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateColumnSecurityRulesAsync(
            UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateColumnSecurityRulesValidateBeforeCall(
                        updateColumnSecurityRulesRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
