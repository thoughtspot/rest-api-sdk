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
import com.thoughtspot.client.model.CreateUserGroupRequest;
import com.thoughtspot.client.model.ImportUserGroupsRequest;
import com.thoughtspot.client.model.ImportUserGroupsResponse;
import com.thoughtspot.client.model.SearchUserGroupsRequest;
import com.thoughtspot.client.model.UpdateUserGroupRequest;
import com.thoughtspot.client.model.UserGroupResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GroupsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GroupsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public GroupsApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createUserGroup
     *
     * @param createUserGroupRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createUserGroupCall(
            CreateUserGroupRequest createUserGroupRequest, final ApiCallback _callback)
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

        Object localVarPostBody = createUserGroupRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/groups/create";

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
    private okhttp3.Call createUserGroupValidateBeforeCall(
            CreateUserGroupRequest createUserGroupRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createUserGroupRequest' is set
        if (createUserGroupRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createUserGroupRequest' when calling"
                            + " createUserGroup(Async)");
        }

        return createUserGroupCall(createUserGroupRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Creates a group object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. ####
     * About groups Groups in ThoughtSpot are used by the administrators to define privileges and
     * organize users based on their roles and access requirements. To know more about groups and
     * privileges, see [ThoughtSpot Product
     * Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges). #### Supported
     * operations The API endpoint lets you perform the following operations: * Assign privileges *
     * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     *
     * @param createUserGroupRequest (required)
     * @return UserGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public UserGroupResponse createUserGroup(CreateUserGroupRequest createUserGroupRequest)
            throws ApiException {
        ApiResponse<UserGroupResponse> localVarResp =
                createUserGroupWithHttpInfo(createUserGroupRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Creates a group object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. ####
     * About groups Groups in ThoughtSpot are used by the administrators to define privileges and
     * organize users based on their roles and access requirements. To know more about groups and
     * privileges, see [ThoughtSpot Product
     * Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges). #### Supported
     * operations The API endpoint lets you perform the following operations: * Assign privileges *
     * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     *
     * @param createUserGroupRequest (required)
     * @return ApiResponse&lt;UserGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<UserGroupResponse> createUserGroupWithHttpInfo(
            CreateUserGroupRequest createUserGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = createUserGroupValidateBeforeCall(createUserGroupRequest, null);
        Type localVarReturnType = new TypeToken<UserGroupResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Creates a group object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. ####
     * About groups Groups in ThoughtSpot are used by the administrators to define privileges and
     * organize users based on their roles and access requirements. To know more about groups and
     * privileges, see [ThoughtSpot Product
     * Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges). #### Supported
     * operations The API endpoint lets you perform the following operations: * Assign privileges *
     * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     *
     * @param createUserGroupRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createUserGroupAsync(
            CreateUserGroupRequest createUserGroupRequest,
            final ApiCallback<UserGroupResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createUserGroupValidateBeforeCall(createUserGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<UserGroupResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUserGroup
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteUserGroupCall(String groupIdentifier, final ApiCallback _callback)
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
        String localVarPath =
                "/api/rest/2.0/groups/{group_identifier}/delete"
                        .replace(
                                "{" + "group_identifier" + "}",
                                localVarApiClient.escapeString(groupIdentifier.toString()));

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
    private okhttp3.Call deleteUserGroupValidateBeforeCall(
            String groupIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'groupIdentifier' when calling"
                            + " deleteUserGroup(Async)");
        }

        return deleteUserGroupCall(groupIdentifier, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Removes the specified group object from the ThoughtSpot system.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is
     * required.
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteUserGroup(String groupIdentifier) throws ApiException {
        deleteUserGroupWithHttpInfo(groupIdentifier);
    }

    /**
     * Version: 9.0.0.cl or later Removes the specified group object from the ThoughtSpot system.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is
     * required.
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteUserGroupWithHttpInfo(String groupIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall = deleteUserGroupValidateBeforeCall(groupIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Removes the specified group object from the
     * ThoughtSpot system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteUserGroupAsync(
            String groupIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUserGroupValidateBeforeCall(groupIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for importUserGroups
     *
     * @param importUserGroupsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import user groups operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importUserGroupsCall(
            ImportUserGroupsRequest importUserGroupsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = importUserGroupsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/groups/import";

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
    private okhttp3.Call importUserGroupsValidateBeforeCall(
            ImportUserGroupsRequest importUserGroupsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'importUserGroupsRequest' is set
        if (importUserGroupsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'importUserGroupsRequest' when calling"
                            + " importUserGroups(Async)");
        }

        return importUserGroupsCall(importUserGroupsRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Imports group objects from external databases into ThoughtSpot.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is
     * required. During the import operation: * If the specified group is not available in
     * ThoughtSpot, it will be added to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is
     * set to &#x60;true&#x60;, the groups not specified in the API request, excluding administrator
     * and system user groups, are deleted. * If the specified groups are already available in
     * ThoughtSpot, the object properties of these groups are modified and synchronized as per the
     * input data in the API request. A successful API call returns the object that represents the
     * changes made in the ThoughtSpot system.
     *
     * @param importUserGroupsRequest (required)
     * @return ImportUserGroupsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import user groups operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ImportUserGroupsResponse importUserGroups(
            ImportUserGroupsRequest importUserGroupsRequest) throws ApiException {
        ApiResponse<ImportUserGroupsResponse> localVarResp =
                importUserGroupsWithHttpInfo(importUserGroupsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Imports group objects from external databases into ThoughtSpot.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is
     * required. During the import operation: * If the specified group is not available in
     * ThoughtSpot, it will be added to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is
     * set to &#x60;true&#x60;, the groups not specified in the API request, excluding administrator
     * and system user groups, are deleted. * If the specified groups are already available in
     * ThoughtSpot, the object properties of these groups are modified and synchronized as per the
     * input data in the API request. A successful API call returns the object that represents the
     * changes made in the ThoughtSpot system.
     *
     * @param importUserGroupsRequest (required)
     * @return ApiResponse&lt;ImportUserGroupsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import user groups operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ImportUserGroupsResponse> importUserGroupsWithHttpInfo(
            ImportUserGroupsRequest importUserGroupsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                importUserGroupsValidateBeforeCall(importUserGroupsRequest, null);
        Type localVarReturnType = new TypeToken<ImportUserGroupsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Imports group objects from external databases
     * into ThoughtSpot. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. During the
     * import operation: * If the specified group is not available in ThoughtSpot, it will be added
     * to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is set to &#x60;true&#x60;, the
     * groups not specified in the API request, excluding administrator and system user groups, are
     * deleted. * If the specified groups are already available in ThoughtSpot, the object
     * properties of these groups are modified and synchronized as per the input data in the API
     * request. A successful API call returns the object that represents the changes made in the
     * ThoughtSpot system.
     *
     * @param importUserGroupsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import user groups operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importUserGroupsAsync(
            ImportUserGroupsRequest importUserGroupsRequest,
            final ApiCallback<ImportUserGroupsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                importUserGroupsValidateBeforeCall(importUserGroupsRequest, _callback);
        Type localVarReturnType = new TypeToken<ImportUserGroupsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchUserGroups
     *
     * @param searchUserGroupsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchUserGroupsCall(
            SearchUserGroupsRequest searchUserGroupsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = searchUserGroupsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/groups/search";

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
    private okhttp3.Call searchUserGroupsValidateBeforeCall(
            SearchUserGroupsRequest searchUserGroupsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchUserGroupsRequest' is set
        if (searchUserGroupsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchUserGroupsRequest' when calling"
                            + " searchUserGroups(Async)");
        }

        return searchUserGroupsCall(searchUserGroupsRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of user group objects from the ThoughtSpot system. To
     * get details of a specific user group, specify the user group GUID or name. You can also
     * filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility,
     * privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.
     * Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. **NOTE**: If
     * you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and
     * &#x60;record_offset&#x60; to &#x60;0&#x60;.
     *
     * @param searchUserGroupsRequest (required)
     * @return List&lt;UserGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<UserGroupResponse> searchUserGroups(SearchUserGroupsRequest searchUserGroupsRequest)
            throws ApiException {
        ApiResponse<List<UserGroupResponse>> localVarResp =
                searchUserGroupsWithHttpInfo(searchUserGroupsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of user group objects from the ThoughtSpot system. To
     * get details of a specific user group, specify the user group GUID or name. You can also
     * filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility,
     * privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.
     * Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. **NOTE**: If
     * you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and
     * &#x60;record_offset&#x60; to &#x60;0&#x60;.
     *
     * @param searchUserGroupsRequest (required)
     * @return ApiResponse&lt;List&lt;UserGroupResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<UserGroupResponse>> searchUserGroupsWithHttpInfo(
            SearchUserGroupsRequest searchUserGroupsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchUserGroupsValidateBeforeCall(searchUserGroupsRequest, null);
        Type localVarReturnType = new TypeToken<List<UserGroupResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Gets a list of user group objects from the
     * ThoughtSpot system. To get details of a specific user group, specify the user group GUID or
     * name. You can also filter the API response based on User ID, Org ID, Role ID, type of group,
     * sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the
     * users in the group. Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. **NOTE**:
     * If you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and
     * &#x60;record_offset&#x60; to &#x60;0&#x60;.
     *
     * @param searchUserGroupsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User group search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchUserGroupsAsync(
            SearchUserGroupsRequest searchUserGroupsRequest,
            final ApiCallback<List<UserGroupResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchUserGroupsValidateBeforeCall(searchUserGroupsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<UserGroupResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUserGroup
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @param updateUserGroupRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateUserGroupCall(
            String groupIdentifier,
            UpdateUserGroupRequest updateUserGroupRequest,
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

        Object localVarPostBody = updateUserGroupRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/groups/{group_identifier}/update"
                        .replace(
                                "{" + "group_identifier" + "}",
                                localVarApiClient.escapeString(groupIdentifier.toString()));

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
    private okhttp3.Call updateUserGroupValidateBeforeCall(
            String groupIdentifier,
            UpdateUserGroupRequest updateUserGroupRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'groupIdentifier' when calling"
                            + " updateUserGroup(Async)");
        }

        // verify the required parameter 'updateUserGroupRequest' is set
        if (updateUserGroupRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateUserGroupRequest' when calling"
                            + " updateUserGroup(Async)");
        }

        return updateUserGroupCall(groupIdentifier, updateUserGroupRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Updates the properties of a group object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. ####
     * Supported operations This API endpoint lets you perform the following operations in a single
     * API request: * Edit
     * [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges)
     * * Add or remove users * Change sharing visibility settings * Add or remove sub-groups *
     * Assign a default Liveboard or update the existing settings
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @param updateUserGroupRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateUserGroup(
            String groupIdentifier, UpdateUserGroupRequest updateUserGroupRequest)
            throws ApiException {
        updateUserGroupWithHttpInfo(groupIdentifier, updateUserGroupRequest);
    }

    /**
     * Version: 9.0.0.cl or later Updates the properties of a group object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. ####
     * Supported operations This API endpoint lets you perform the following operations in a single
     * API request: * Edit
     * [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges)
     * * Add or remove users * Change sharing visibility settings * Add or remove sub-groups *
     * Assign a default Liveboard or update the existing settings
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @param updateUserGroupRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateUserGroupWithHttpInfo(
            String groupIdentifier, UpdateUserGroupRequest updateUserGroupRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateUserGroupValidateBeforeCall(groupIdentifier, updateUserGroupRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Updates the properties of a group object in
     * ThoughtSpot. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**)
     * privilege is required. #### Supported operations This API endpoint lets you perform the
     * following operations in a single API request: * Edit
     * [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges)
     * * Add or remove users * Change sharing visibility settings * Add or remove sub-groups *
     * Assign a default Liveboard or update the existing settings
     *
     * @param groupIdentifier GUID or name of the group. (required)
     * @param updateUserGroupRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User group successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateUserGroupAsync(
            String groupIdentifier,
            UpdateUserGroupRequest updateUserGroupRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateUserGroupValidateBeforeCall(
                        groupIdentifier, updateUserGroupRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
