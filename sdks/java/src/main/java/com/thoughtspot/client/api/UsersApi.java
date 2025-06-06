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
import com.thoughtspot.client.model.ActivateUserRequest;
import com.thoughtspot.client.model.ChangeUserPasswordRequest;
import com.thoughtspot.client.model.CreateUserRequest;
import com.thoughtspot.client.model.DeactivateUserRequest;
import com.thoughtspot.client.model.ForceLogoutUsersRequest;
import com.thoughtspot.client.model.ImportUsersRequest;
import com.thoughtspot.client.model.ImportUsersResponse;
import com.thoughtspot.client.model.ResetUserPasswordRequest;
import com.thoughtspot.client.model.ResponseActivationURL;
import com.thoughtspot.client.model.SearchUsersRequest;
import com.thoughtspot.client.model.UpdateUserRequest;
import com.thoughtspot.client.model.User;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UsersApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public UsersApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for activateUser
     *
     * @param activateUserRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User activated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call activateUserCall(
            ActivateUserRequest activateUserRequest, final ApiCallback _callback)
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

        Object localVarPostBody = activateUserRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/activate";

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
    private okhttp3.Call activateUserValidateBeforeCall(
            ActivateUserRequest activateUserRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'activateUserRequest' is set
        if (activateUserRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'activateUserRequest' when calling"
                            + " activateUser(Async)");
        }

        return activateUserCall(activateUserRequest, _callback);
    }

    /**
     * Version: 9.7.0.cl or later Activates a deactivated user account. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To activate
     * an inactive user account, the API request body must include the following information: -
     * Username or the GUID of the user account. - Auth token generated for the deactivated user.
     * The auth token is sent in the API response when a user is deactivated. - Password for the
     * user account.
     *
     * @param activateUserRequest (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User activated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public User activateUser(ActivateUserRequest activateUserRequest) throws ApiException {
        ApiResponse<User> localVarResp = activateUserWithHttpInfo(activateUserRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.7.0.cl or later Activates a deactivated user account. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To activate
     * an inactive user account, the API request body must include the following information: -
     * Username or the GUID of the user account. - Auth token generated for the deactivated user.
     * The auth token is sent in the API response when a user is deactivated. - Password for the
     * user account.
     *
     * @param activateUserRequest (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User activated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<User> activateUserWithHttpInfo(ActivateUserRequest activateUserRequest)
            throws ApiException {
        okhttp3.Call localVarCall = activateUserValidateBeforeCall(activateUserRequest, null);
        Type localVarReturnType = new TypeToken<User>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.7.0.cl or later Activates a deactivated user account. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To activate
     * an inactive user account, the API request body must include the following information: -
     * Username or the GUID of the user account. - Auth token generated for the deactivated user.
     * The auth token is sent in the API response when a user is deactivated. - Password for the
     * user account.
     *
     * @param activateUserRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User activated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call activateUserAsync(
            ActivateUserRequest activateUserRequest, final ApiCallback<User> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = activateUserValidateBeforeCall(activateUserRequest, _callback);
        Type localVarReturnType = new TypeToken<User>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for changeUserPassword
     *
     * @param changeUserPasswordRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password change operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call changeUserPasswordCall(
            ChangeUserPasswordRequest changeUserPasswordRequest, final ApiCallback _callback)
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

        Object localVarPostBody = changeUserPasswordRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/change-password";

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
    private okhttp3.Call changeUserPasswordValidateBeforeCall(
            ChangeUserPasswordRequest changeUserPasswordRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'changeUserPasswordRequest' is set
        if (changeUserPasswordRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'changeUserPasswordRequest' when calling"
                            + " changeUserPassword(Async)");
        }

        return changeUserPasswordCall(changeUserPasswordRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Updates the current password of the user. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param changeUserPasswordRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password change operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void changeUserPassword(ChangeUserPasswordRequest changeUserPasswordRequest)
            throws ApiException {
        changeUserPasswordWithHttpInfo(changeUserPasswordRequest);
    }

    /**
     * Version: 9.0.0.cl or later Updates the current password of the user. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param changeUserPasswordRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password change operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> changeUserPasswordWithHttpInfo(
            ChangeUserPasswordRequest changeUserPasswordRequest) throws ApiException {
        okhttp3.Call localVarCall =
                changeUserPasswordValidateBeforeCall(changeUserPasswordRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Updates the current password of the user.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @param changeUserPasswordRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password change operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call changeUserPasswordAsync(
            ChangeUserPasswordRequest changeUserPasswordRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                changeUserPasswordValidateBeforeCall(changeUserPasswordRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for createUser
     *
     * @param createUserRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createUserCall(
            CreateUserRequest createUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createUserRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/create";

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
    private okhttp3.Call createUserValidateBeforeCall(
            CreateUserRequest createUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createUserRequest' is set
        if (createUserRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createUserRequest' when calling"
                            + " createUser(Async)");
        }

        return createUserCall(createUserRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Creates a user in ThoughtSpot. The API endpoint allows you to
     * configure several user properties such as email address, account status, share notification
     * preferences, and sharing visibility. You can provision the user to
     * [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard,
     * Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for
     * the user, and set user preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param createUserRequest (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public User createUser(CreateUserRequest createUserRequest) throws ApiException {
        ApiResponse<User> localVarResp = createUserWithHttpInfo(createUserRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Creates a user in ThoughtSpot. The API endpoint allows you to
     * configure several user properties such as email address, account status, share notification
     * preferences, and sharing visibility. You can provision the user to
     * [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard,
     * Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for
     * the user, and set user preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param createUserRequest (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<User> createUserWithHttpInfo(CreateUserRequest createUserRequest)
            throws ApiException {
        okhttp3.Call localVarCall = createUserValidateBeforeCall(createUserRequest, null);
        Type localVarReturnType = new TypeToken<User>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Creates a user in ThoughtSpot. The API endpoint
     * allows you to configure several user properties such as email address, account status, share
     * notification preferences, and sharing visibility. You can provision the user to
     * [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard,
     * Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for
     * the user, and set user preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param createUserRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createUserAsync(
            CreateUserRequest createUserRequest, final ApiCallback<User> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = createUserValidateBeforeCall(createUserRequest, _callback);
        Type localVarReturnType = new TypeToken<User>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deactivateUser
     *
     * @param deactivateUserRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User deactivated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deactivateUserCall(
            DeactivateUserRequest deactivateUserRequest, final ApiCallback _callback)
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

        Object localVarPostBody = deactivateUserRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/deactivate";

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
    private okhttp3.Call deactivateUserValidateBeforeCall(
            DeactivateUserRequest deactivateUserRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'deactivateUserRequest' is set
        if (deactivateUserRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'deactivateUserRequest' when calling"
                            + " deactivateUser(Async)");
        }

        return deactivateUserCall(deactivateUserRequest, _callback);
    }

    /**
     * Version: 9.7.0.cl or later Deactivates a user account. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To deactivate a
     * user account, the API request body must include the following information: - Username or the
     * GUID of the user account - Base URL of the ThoughtSpot instance If the API request is
     * successful, ThoughtSpot returns the activation URL in the response. The activation URL is
     * valid for 14 days and can be used to re-activate the account and reset the password of the
     * deactivated account.
     *
     * @param deactivateUserRequest (required)
     * @return ResponseActivationURL
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User deactivated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ResponseActivationURL deactivateUser(DeactivateUserRequest deactivateUserRequest)
            throws ApiException {
        ApiResponse<ResponseActivationURL> localVarResp =
                deactivateUserWithHttpInfo(deactivateUserRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.7.0.cl or later Deactivates a user account. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To deactivate a
     * user account, the API request body must include the following information: - Username or the
     * GUID of the user account - Base URL of the ThoughtSpot instance If the API request is
     * successful, ThoughtSpot returns the activation URL in the response. The activation URL is
     * valid for 14 days and can be used to re-activate the account and reset the password of the
     * deactivated account.
     *
     * @param deactivateUserRequest (required)
     * @return ApiResponse&lt;ResponseActivationURL&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User deactivated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ResponseActivationURL> deactivateUserWithHttpInfo(
            DeactivateUserRequest deactivateUserRequest) throws ApiException {
        okhttp3.Call localVarCall = deactivateUserValidateBeforeCall(deactivateUserRequest, null);
        Type localVarReturnType = new TypeToken<ResponseActivationURL>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.7.0.cl or later Deactivates a user account. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To
     * deactivate a user account, the API request body must include the following information: -
     * Username or the GUID of the user account - Base URL of the ThoughtSpot instance If the API
     * request is successful, ThoughtSpot returns the activation URL in the response. The activation
     * URL is valid for 14 days and can be used to re-activate the account and reset the password of
     * the deactivated account.
     *
     * @param deactivateUserRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User deactivated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deactivateUserAsync(
            DeactivateUserRequest deactivateUserRequest,
            final ApiCallback<ResponseActivationURL> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deactivateUserValidateBeforeCall(deactivateUserRequest, _callback);
        Type localVarReturnType = new TypeToken<ResponseActivationURL>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUser
     *
     * @param userIdentifier GUID / name of the user (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteUserCall(String userIdentifier, final ApiCallback _callback)
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
                "/api/rest/2.0/users/{user_identifier}/delete"
                        .replace(
                                "{" + "user_identifier" + "}",
                                localVarApiClient.escapeString(userIdentifier.toString()));

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
    private okhttp3.Call deleteUserValidateBeforeCall(
            String userIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userIdentifier' is set
        if (userIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'userIdentifier' when calling"
                            + " deleteUser(Async)");
        }

        return deleteUserCall(userIdentifier, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Deletes a user from the ThoughtSpot system. If you want to remove
     * a user from a specific Org but not from ThoughtSpot, update the group and Org mapping
     * properties of the user object via a POST API call to the
     * [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user)
     * endpoint. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @param userIdentifier GUID / name of the user (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteUser(String userIdentifier) throws ApiException {
        deleteUserWithHttpInfo(userIdentifier);
    }

    /**
     * Version: 9.0.0.cl or later Deletes a user from the ThoughtSpot system. If you want to remove
     * a user from a specific Org but not from ThoughtSpot, update the group and Org mapping
     * properties of the user object via a POST API call to the
     * [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user)
     * endpoint. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @param userIdentifier GUID / name of the user (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteUserWithHttpInfo(String userIdentifier) throws ApiException {
        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(userIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Deletes a user from the ThoughtSpot system. If
     * you want to remove a user from a specific Org but not from ThoughtSpot, update the group and
     * Org mapping properties of the user object via a POST API call to the
     * [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user)
     * endpoint. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @param userIdentifier GUID / name of the user (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteUserAsync(String userIdentifier, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(userIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for forceLogoutUsers
     *
     * @param forceLogoutUsersRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Force logging out of users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call forceLogoutUsersCall(
            ForceLogoutUsersRequest forceLogoutUsersRequest, final ApiCallback _callback)
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

        Object localVarPostBody = forceLogoutUsersRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/force-logout";

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
    private okhttp3.Call forceLogoutUsersValidateBeforeCall(
            ForceLogoutUsersRequest forceLogoutUsersRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'forceLogoutUsersRequest' is set
        if (forceLogoutUsersRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'forceLogoutUsersRequest' when calling"
                            + " forceLogoutUsers(Async)");
        }

        return forceLogoutUsersCall(forceLogoutUsersRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Enforces logout on current user sessions. Use this API with
     * caution as it may invalidate active user sessions and force users to re-login. Make sure you
     * specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on
     * your cluster become invalid, and the users are forced to re-login. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param forceLogoutUsersRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Force logging out of users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void forceLogoutUsers(ForceLogoutUsersRequest forceLogoutUsersRequest)
            throws ApiException {
        forceLogoutUsersWithHttpInfo(forceLogoutUsersRequest);
    }

    /**
     * Version: 9.0.0.cl or later Enforces logout on current user sessions. Use this API with
     * caution as it may invalidate active user sessions and force users to re-login. Make sure you
     * specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on
     * your cluster become invalid, and the users are forced to re-login. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param forceLogoutUsersRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Force logging out of users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> forceLogoutUsersWithHttpInfo(
            ForceLogoutUsersRequest forceLogoutUsersRequest) throws ApiException {
        okhttp3.Call localVarCall =
                forceLogoutUsersValidateBeforeCall(forceLogoutUsersRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Enforces logout on current user sessions. Use
     * this API with caution as it may invalidate active user sessions and force users to re-login.
     * Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all
     * user sessions on your cluster become invalid, and the users are forced to re-login. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param forceLogoutUsersRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Force logging out of users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call forceLogoutUsersAsync(
            ForceLogoutUsersRequest forceLogoutUsersRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                forceLogoutUsersValidateBeforeCall(forceLogoutUsersRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for importUsers
     *
     * @param importUsersRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importUsersCall(
            ImportUsersRequest importUsersRequest, final ApiCallback _callback)
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

        Object localVarPostBody = importUsersRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/import";

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
    private okhttp3.Call importUsersValidateBeforeCall(
            ImportUsersRequest importUsersRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'importUsersRequest' is set
        if (importUsersRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'importUsersRequest' when calling"
                            + " importUsers(Async)");
        }

        return importUsersCall(importUsersRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Imports user data from external databases into ThoughtSpot. During
     * the user import operation: * If the specified users are not available in ThoughtSpot, the
     * users are created and assigned a default password. Defining a &#x60;default_password&#x60; in
     * the API request is optional. * If &#x60;delete_unspecified_users&#x60; is set to
     * &#x60;true&#x60;, the users not specified in the API request, excluding the
     * &#x60;tsadmin&#x60;, &#x60;guest&#x60;, &#x60;system&#x60; and &#x60;su&#x60; users, are
     * deleted. * If the specified user objects are already available in ThoughtSpot, the object
     * properties are updated and synchronized as per the input data in the API request. A
     * successful API call returns the object that represents the changes made in the ThoughtSpot
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @param importUsersRequest (required)
     * @return ImportUsersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ImportUsersResponse importUsers(ImportUsersRequest importUsersRequest)
            throws ApiException {
        ApiResponse<ImportUsersResponse> localVarResp = importUsersWithHttpInfo(importUsersRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Imports user data from external databases into ThoughtSpot. During
     * the user import operation: * If the specified users are not available in ThoughtSpot, the
     * users are created and assigned a default password. Defining a &#x60;default_password&#x60; in
     * the API request is optional. * If &#x60;delete_unspecified_users&#x60; is set to
     * &#x60;true&#x60;, the users not specified in the API request, excluding the
     * &#x60;tsadmin&#x60;, &#x60;guest&#x60;, &#x60;system&#x60; and &#x60;su&#x60; users, are
     * deleted. * If the specified user objects are already available in ThoughtSpot, the object
     * properties are updated and synchronized as per the input data in the API request. A
     * successful API call returns the object that represents the changes made in the ThoughtSpot
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @param importUsersRequest (required)
     * @return ApiResponse&lt;ImportUsersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ImportUsersResponse> importUsersWithHttpInfo(
            ImportUsersRequest importUsersRequest) throws ApiException {
        okhttp3.Call localVarCall = importUsersValidateBeforeCall(importUsersRequest, null);
        Type localVarReturnType = new TypeToken<ImportUsersResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Imports user data from external databases into
     * ThoughtSpot. During the user import operation: * If the specified users are not available in
     * ThoughtSpot, the users are created and assigned a default password. Defining a
     * &#x60;default_password&#x60; in the API request is optional. * If
     * &#x60;delete_unspecified_users&#x60; is set to &#x60;true&#x60;, the users not specified in
     * the API request, excluding the &#x60;tsadmin&#x60;, &#x60;guest&#x60;, &#x60;system&#x60; and
     * &#x60;su&#x60; users, are deleted. * If the specified user objects are already available in
     * ThoughtSpot, the object properties are updated and synchronized as per the input data in the
     * API request. A successful API call returns the object that represents the changes made in the
     * ThoughtSpot system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param importUsersRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Import users operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importUsersAsync(
            ImportUsersRequest importUsersRequest, final ApiCallback<ImportUsersResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = importUsersValidateBeforeCall(importUsersRequest, _callback);
        Type localVarReturnType = new TypeToken<ImportUsersResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for resetUserPassword
     *
     * @param resetUserPasswordRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password reset operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call resetUserPasswordCall(
            ResetUserPasswordRequest resetUserPasswordRequest, final ApiCallback _callback)
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

        Object localVarPostBody = resetUserPasswordRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/reset-password";

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
    private okhttp3.Call resetUserPasswordValidateBeforeCall(
            ResetUserPasswordRequest resetUserPasswordRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'resetUserPasswordRequest' is set
        if (resetUserPasswordRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'resetUserPasswordRequest' when calling"
                            + " resetUserPassword(Async)");
        }

        return resetUserPasswordCall(resetUserPasswordRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Resets the password of a user account. Administrators can reset
     * password on behalf of a user. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param resetUserPasswordRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password reset operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void resetUserPassword(ResetUserPasswordRequest resetUserPasswordRequest)
            throws ApiException {
        resetUserPasswordWithHttpInfo(resetUserPasswordRequest);
    }

    /**
     * Version: 9.0.0.cl or later Resets the password of a user account. Administrators can reset
     * password on behalf of a user. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param resetUserPasswordRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password reset operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> resetUserPasswordWithHttpInfo(
            ResetUserPasswordRequest resetUserPasswordRequest) throws ApiException {
        okhttp3.Call localVarCall =
                resetUserPasswordValidateBeforeCall(resetUserPasswordRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Resets the password of a user account.
     * Administrators can reset password on behalf of a user. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param resetUserPasswordRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User password reset operation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call resetUserPasswordAsync(
            ResetUserPasswordRequest resetUserPasswordRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                resetUserPasswordValidateBeforeCall(resetUserPasswordRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchUsers
     *
     * @param searchUsersRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchUsersCall(
            SearchUsersRequest searchUsersRequest, final ApiCallback _callback)
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

        Object localVarPostBody = searchUsersRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/users/search";

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
    private okhttp3.Call searchUsersValidateBeforeCall(
            SearchUsersRequest searchUsersRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchUsersRequest' is set
        if (searchUsersRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchUsersRequest' when calling"
                            + " searchUsers(Async)");
        }

        return searchUsersCall(searchUsersRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of users available on the ThoughtSpot system. To get
     * details of a specific user, specify the user GUID or name. You can also filter the API
     * response based on groups, Org ID, user visibility, account status, user type, and user
     * preference settings and favorites. Available to all users. Users with
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users
     * properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. **NOTE**: If
     * the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60;
     * parameter. To search across all available users, set &#x60;record_size&#x60; to
     * &#x60;-1&#x60;.
     *
     * @param searchUsersRequest (required)
     * @return List&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<User> searchUsers(SearchUsersRequest searchUsersRequest) throws ApiException {
        ApiResponse<List<User>> localVarResp = searchUsersWithHttpInfo(searchUsersRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of users available on the ThoughtSpot system. To get
     * details of a specific user, specify the user GUID or name. You can also filter the API
     * response based on groups, Org ID, user visibility, account status, user type, and user
     * preference settings and favorites. Available to all users. Users with
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users
     * properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. **NOTE**: If
     * the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60;
     * parameter. To search across all available users, set &#x60;record_size&#x60; to
     * &#x60;-1&#x60;.
     *
     * @param searchUsersRequest (required)
     * @return ApiResponse&lt;List&lt;User&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<User>> searchUsersWithHttpInfo(SearchUsersRequest searchUsersRequest)
            throws ApiException {
        okhttp3.Call localVarCall = searchUsersValidateBeforeCall(searchUsersRequest, null);
        Type localVarReturnType = new TypeToken<List<User>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Gets a list of users available on the ThoughtSpot
     * system. To get details of a specific user, specify the user GUID or name. You can also filter
     * the API response based on groups, Org ID, user visibility, account status, user type, and
     * user preference settings and favorites. Available to all users. Users with
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users
     * properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. **NOTE**: If
     * the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60;
     * parameter. To search across all available users, set &#x60;record_size&#x60; to
     * &#x60;-1&#x60;.
     *
     * @param searchUsersRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchUsersAsync(
            SearchUsersRequest searchUsersRequest, final ApiCallback<List<User>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = searchUsersValidateBeforeCall(searchUsersRequest, _callback);
        Type localVarReturnType = new TypeToken<List<User>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUser
     *
     * @param userIdentifier GUID / name of the user (required)
     * @param updateUserRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateUserCall(
            String userIdentifier, UpdateUserRequest updateUserRequest, final ApiCallback _callback)
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

        Object localVarPostBody = updateUserRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/users/{user_identifier}/update"
                        .replace(
                                "{" + "user_identifier" + "}",
                                localVarApiClient.escapeString(userIdentifier.toString()));

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
    private okhttp3.Call updateUserValidateBeforeCall(
            String userIdentifier, UpdateUserRequest updateUserRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'userIdentifier' is set
        if (userIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'userIdentifier' when calling"
                            + " updateUser(Async)");
        }

        // verify the required parameter 'updateUserRequest' is set
        if (updateUserRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateUserRequest' when calling"
                            + " updateUser(Async)");
        }

        return updateUserCall(userIdentifier, updateUserRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Updates the properties of a user object. You can modify user
     * properties such as username, email, and share notification settings. You can also assign new
     * groups and Orgs, remove the user from a group or Org, reset password, and modify user
     * preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**)
     * privilege is required.
     *
     * @param userIdentifier GUID / name of the user (required)
     * @param updateUserRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateUser(String userIdentifier, UpdateUserRequest updateUserRequest)
            throws ApiException {
        updateUserWithHttpInfo(userIdentifier, updateUserRequest);
    }

    /**
     * Version: 9.0.0.cl or later Updates the properties of a user object. You can modify user
     * properties such as username, email, and share notification settings. You can also assign new
     * groups and Orgs, remove the user from a group or Org, reset password, and modify user
     * preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**)
     * privilege is required.
     *
     * @param userIdentifier GUID / name of the user (required)
     * @param updateUserRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateUserWithHttpInfo(
            String userIdentifier, UpdateUserRequest updateUserRequest) throws ApiException {
        okhttp3.Call localVarCall =
                updateUserValidateBeforeCall(userIdentifier, updateUserRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Updates the properties of a user object. You can
     * modify user properties such as username, email, and share notification settings. You can also
     * assign new groups and Orgs, remove the user from a group or Org, reset password, and modify
     * user preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @param userIdentifier GUID / name of the user (required)
     * @param updateUserRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateUserAsync(
            String userIdentifier,
            UpdateUserRequest updateUserRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateUserValidateBeforeCall(userIdentifier, updateUserRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
