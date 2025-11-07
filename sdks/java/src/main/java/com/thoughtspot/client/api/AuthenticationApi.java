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
import com.thoughtspot.client.model.AccessToken;
import com.thoughtspot.client.model.GetCustomAccessTokenRequest;
import com.thoughtspot.client.model.GetFullAccessTokenRequest;
import com.thoughtspot.client.model.GetObjectAccessTokenRequest;
import com.thoughtspot.client.model.GetTokenResponse;
import com.thoughtspot.client.model.LoginRequest;
import com.thoughtspot.client.model.RevokeTokenRequest;
import com.thoughtspot.client.model.Token;
import com.thoughtspot.client.model.TokenValidationResponse;
import com.thoughtspot.client.model.User;
import com.thoughtspot.client.model.ValidateTokenRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AuthenticationApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public AuthenticationApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for getCurrentUserInfo
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch current session user detail successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCurrentUserInfoCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/auth/session/user";

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
                "GET",
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
    private okhttp3.Call getCurrentUserInfoValidateBeforeCall(final ApiCallback _callback)
            throws ApiException {
        return getCurrentUserInfoCall(_callback);
    }

    /**
     * Version: 9.0.0.cl or later Retrieves details of the current user session for the token
     * provided in the request header. Any ThoughtSpot user can access this endpoint and send an API
     * request. The data returned in the API response varies according to user&#39;s privilege and
     * object access permissions.
     *
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch current session user detail successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public User getCurrentUserInfo() throws ApiException {
        ApiResponse<User> localVarResp = getCurrentUserInfoWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Retrieves details of the current user session for the token
     * provided in the request header. Any ThoughtSpot user can access this endpoint and send an API
     * request. The data returned in the API response varies according to user&#39;s privilege and
     * object access permissions.
     *
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch current session user detail successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<User> getCurrentUserInfoWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCurrentUserInfoValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<User>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Retrieves details of the current user session for
     * the token provided in the request header. Any ThoughtSpot user can access this endpoint and
     * send an API request. The data returned in the API response varies according to user&#39;s
     * privilege and object access permissions.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch current session user detail successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCurrentUserInfoAsync(final ApiCallback<User> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getCurrentUserInfoValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<User>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCurrentUserToken
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching token for current user successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCurrentUserTokenCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/auth/session/token";

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
                "GET",
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
    private okhttp3.Call getCurrentUserTokenValidateBeforeCall(final ApiCallback _callback)
            throws ApiException {
        return getCurrentUserTokenCall(_callback);
    }

    /**
     * Version: 9.4.0.cl or later Retrieves details of the current session token for the bearer
     * token provided in the request header. This API endpoint does not create a new token. Instead,
     * it returns details about the token, including the token string, creation time, expiration
     * time, and the associated user. Use this endpoint to introspect your current session token,
     * debug authentication issues, or when a frontend application needs session token details. Any
     * ThoughtSpot user with a valid bearer token can access this endpoint and send an API request
     *
     * @return GetTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching token for current user successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public GetTokenResponse getCurrentUserToken() throws ApiException {
        ApiResponse<GetTokenResponse> localVarResp = getCurrentUserTokenWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Version: 9.4.0.cl or later Retrieves details of the current session token for the bearer
     * token provided in the request header. This API endpoint does not create a new token. Instead,
     * it returns details about the token, including the token string, creation time, expiration
     * time, and the associated user. Use this endpoint to introspect your current session token,
     * debug authentication issues, or when a frontend application needs session token details. Any
     * ThoughtSpot user with a valid bearer token can access this endpoint and send an API request
     *
     * @return ApiResponse&lt;GetTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching token for current user successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<GetTokenResponse> getCurrentUserTokenWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCurrentUserTokenValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetTokenResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.4.0.cl or later Retrieves details of the current session token
     * for the bearer token provided in the request header. This API endpoint does not create a new
     * token. Instead, it returns details about the token, including the token string, creation
     * time, expiration time, and the associated user. Use this endpoint to introspect your current
     * session token, debug authentication issues, or when a frontend application needs session
     * token details. Any ThoughtSpot user with a valid bearer token can access this endpoint and
     * send an API request
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching token for current user successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCurrentUserTokenAsync(final ApiCallback<GetTokenResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getCurrentUserTokenValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetTokenResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustomAccessToken
     *
     * @param getCustomAccessTokenRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> ABAC token creation was successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. This could be due to missing or incorrect parameters. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. The request could not be authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. The user does not have permission to access this resource. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred on the server. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCustomAccessTokenCall(
            GetCustomAccessTokenRequest getCustomAccessTokenRequest, final ApiCallback _callback)
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

        Object localVarPostBody = getCustomAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/auth/token/custom";

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

        String[] localVarAuthNames = new String[] {};
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
    private okhttp3.Call getCustomAccessTokenValidateBeforeCall(
            GetCustomAccessTokenRequest getCustomAccessTokenRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'getCustomAccessTokenRequest' is set
        if (getCustomAccessTokenRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'getCustomAccessTokenRequest' when calling"
                            + " getCustomAccessToken(Async)");
        }

        return getCustomAccessTokenCall(getCustomAccessTokenRequest, _callback);
    }

    /**
     * Version: 10.4.0.cl or later Gets an authentication token with custom rules and security
     * attributes and creates a full session in ThoughtSpot for a given user. By default, the token
     * obtained from ThoughtSpot remains valid for 5 mins. To add a new user and assign privileges
     * during auto creation, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. To assign security attributes with filter
     * rules and Parameters to the JWT token, you&#39;ll need administrator privileges and edit
     * access to the data source (Worksheet or Model). If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. #### Usage guidelines You can generate the
     * token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using
     * the cluster’s &#x60;secret_key&#x60;. To generate a &#x60;secret_key&#x60; on your cluster,
     * the administrator must enable [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)
     * in the **Develop** &gt; **Customizations** &gt; **Security Settings** page. **Note**: When
     * both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,
     * &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is enabled on
     * your instance, the API login request with basic authentication (&#x60;username&#x60; and
     * &#x60;password&#x60; ) returns an error. You can switch to token-based authentication with
     * &#x60;secret_key&#x60; or contact ThoughtSpot Support for assistance. ##### Attribute-Based
     * Access Control (ABAC) with tokens To implement Attribute-Based Access Control (ABAC) and
     * assign security entitlements to users during session creation, you can generate a token with
     * custom filtering rules and Parameters in the &#x60;filter_rules&#x60; and
     * &#x60;parameter_values&#x60; array respectively. These attributes can be configured to
     * persist on a specific set of objects for user sessions initiated using the token. Once
     * defined, the rules are added to the user&#39;s &#x60;access_control_properties&#x60; object,
     * after which all sessions will use the persisted values. Specify the object type as
     * &#x60;LOGICAL_TABLE&#x60;. For more information, see [ABAC via tokens
     * Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).
     * ##### Just-in-time provisioning For just-in-time user creation and provisioning, define the
     * following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60; Set &#x60;auto_create&#x60;
     * to &#x60;true&#x60; if the user is not available in ThoughtSpot. If the user already exists
     * in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60; in the
     * API request, the user properties such as the display name, email, Org and group assignment
     * will not be updated with new values. If &#x60;auto_create&#x60; is set to &#x60;true&#x60;,
     * it won&#39;t create formula variables and hence won&#39;t be applicable for
     * &#x60;variable_values&#x60;. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). #####
     * Important point to note All options in the token creation APIs that define access to the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created. Persist options such as &#x60;APPEND&#x60;,
     * &#x60;REPLACE&#x60;, &#x60;RESET&#x60; will persist security parameters on the user profile
     * when the token is created, while Persist option &#x60;NONE&#x60; will not persist anything
     * but will be honoured in the session. ##### Formula Variables Before using variables_values,
     * variables must be created using Create Variable API with type as Formula_Variable
     * (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used
     * when variable_values are provided in the request. If you are working with variable_values,
     * you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do
     * not pass any variable_values. In such cases, variable_values will remain unaffected. When
     * using object_id with variable_values, models are supported.
     *
     * @param getCustomAccessTokenRequest (required)
     * @return AccessToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> ABAC token creation was successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. This could be due to missing or incorrect parameters. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. The request could not be authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. The user does not have permission to access this resource. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred on the server. </td><td>  -  </td></tr>
     * </table>
     */
    public AccessToken getCustomAccessToken(GetCustomAccessTokenRequest getCustomAccessTokenRequest)
            throws ApiException {
        ApiResponse<AccessToken> localVarResp =
                getCustomAccessTokenWithHttpInfo(getCustomAccessTokenRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.4.0.cl or later Gets an authentication token with custom rules and security
     * attributes and creates a full session in ThoughtSpot for a given user. By default, the token
     * obtained from ThoughtSpot remains valid for 5 mins. To add a new user and assign privileges
     * during auto creation, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. To assign security attributes with filter
     * rules and Parameters to the JWT token, you&#39;ll need administrator privileges and edit
     * access to the data source (Worksheet or Model). If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. #### Usage guidelines You can generate the
     * token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using
     * the cluster’s &#x60;secret_key&#x60;. To generate a &#x60;secret_key&#x60; on your cluster,
     * the administrator must enable [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)
     * in the **Develop** &gt; **Customizations** &gt; **Security Settings** page. **Note**: When
     * both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,
     * &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is enabled on
     * your instance, the API login request with basic authentication (&#x60;username&#x60; and
     * &#x60;password&#x60; ) returns an error. You can switch to token-based authentication with
     * &#x60;secret_key&#x60; or contact ThoughtSpot Support for assistance. ##### Attribute-Based
     * Access Control (ABAC) with tokens To implement Attribute-Based Access Control (ABAC) and
     * assign security entitlements to users during session creation, you can generate a token with
     * custom filtering rules and Parameters in the &#x60;filter_rules&#x60; and
     * &#x60;parameter_values&#x60; array respectively. These attributes can be configured to
     * persist on a specific set of objects for user sessions initiated using the token. Once
     * defined, the rules are added to the user&#39;s &#x60;access_control_properties&#x60; object,
     * after which all sessions will use the persisted values. Specify the object type as
     * &#x60;LOGICAL_TABLE&#x60;. For more information, see [ABAC via tokens
     * Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).
     * ##### Just-in-time provisioning For just-in-time user creation and provisioning, define the
     * following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60; Set &#x60;auto_create&#x60;
     * to &#x60;true&#x60; if the user is not available in ThoughtSpot. If the user already exists
     * in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60; in the
     * API request, the user properties such as the display name, email, Org and group assignment
     * will not be updated with new values. If &#x60;auto_create&#x60; is set to &#x60;true&#x60;,
     * it won&#39;t create formula variables and hence won&#39;t be applicable for
     * &#x60;variable_values&#x60;. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). #####
     * Important point to note All options in the token creation APIs that define access to the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created. Persist options such as &#x60;APPEND&#x60;,
     * &#x60;REPLACE&#x60;, &#x60;RESET&#x60; will persist security parameters on the user profile
     * when the token is created, while Persist option &#x60;NONE&#x60; will not persist anything
     * but will be honoured in the session. ##### Formula Variables Before using variables_values,
     * variables must be created using Create Variable API with type as Formula_Variable
     * (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used
     * when variable_values are provided in the request. If you are working with variable_values,
     * you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do
     * not pass any variable_values. In such cases, variable_values will remain unaffected. When
     * using object_id with variable_values, models are supported.
     *
     * @param getCustomAccessTokenRequest (required)
     * @return ApiResponse&lt;AccessToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> ABAC token creation was successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. This could be due to missing or incorrect parameters. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. The request could not be authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. The user does not have permission to access this resource. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred on the server. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AccessToken> getCustomAccessTokenWithHttpInfo(
            GetCustomAccessTokenRequest getCustomAccessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall =
                getCustomAccessTokenValidateBeforeCall(getCustomAccessTokenRequest, null);
        Type localVarReturnType = new TypeToken<AccessToken>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.4.0.cl or later Gets an authentication token with custom rules
     * and security attributes and creates a full session in ThoughtSpot for a given user. By
     * default, the token obtained from ThoughtSpot remains valid for 5 mins. To add a new user and
     * assign privileges during auto creation, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. To assign security attributes with filter
     * rules and Parameters to the JWT token, you&#39;ll need administrator privileges and edit
     * access to the data source (Worksheet or Model). If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. #### Usage guidelines You can generate the
     * token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using
     * the cluster’s &#x60;secret_key&#x60;. To generate a &#x60;secret_key&#x60; on your cluster,
     * the administrator must enable [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)
     * in the **Develop** &gt; **Customizations** &gt; **Security Settings** page. **Note**: When
     * both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,
     * &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is enabled on
     * your instance, the API login request with basic authentication (&#x60;username&#x60; and
     * &#x60;password&#x60; ) returns an error. You can switch to token-based authentication with
     * &#x60;secret_key&#x60; or contact ThoughtSpot Support for assistance. ##### Attribute-Based
     * Access Control (ABAC) with tokens To implement Attribute-Based Access Control (ABAC) and
     * assign security entitlements to users during session creation, you can generate a token with
     * custom filtering rules and Parameters in the &#x60;filter_rules&#x60; and
     * &#x60;parameter_values&#x60; array respectively. These attributes can be configured to
     * persist on a specific set of objects for user sessions initiated using the token. Once
     * defined, the rules are added to the user&#39;s &#x60;access_control_properties&#x60; object,
     * after which all sessions will use the persisted values. Specify the object type as
     * &#x60;LOGICAL_TABLE&#x60;. For more information, see [ABAC via tokens
     * Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).
     * ##### Just-in-time provisioning For just-in-time user creation and provisioning, define the
     * following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60; Set &#x60;auto_create&#x60;
     * to &#x60;true&#x60; if the user is not available in ThoughtSpot. If the user already exists
     * in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60; in the
     * API request, the user properties such as the display name, email, Org and group assignment
     * will not be updated with new values. If &#x60;auto_create&#x60; is set to &#x60;true&#x60;,
     * it won&#39;t create formula variables and hence won&#39;t be applicable for
     * &#x60;variable_values&#x60;. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). #####
     * Important point to note All options in the token creation APIs that define access to the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created. Persist options such as &#x60;APPEND&#x60;,
     * &#x60;REPLACE&#x60;, &#x60;RESET&#x60; will persist security parameters on the user profile
     * when the token is created, while Persist option &#x60;NONE&#x60; will not persist anything
     * but will be honoured in the session. ##### Formula Variables Before using variables_values,
     * variables must be created using Create Variable API with type as Formula_Variable
     * (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used
     * when variable_values are provided in the request. If you are working with variable_values,
     * you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do
     * not pass any variable_values. In such cases, variable_values will remain unaffected. When
     * using object_id with variable_values, models are supported.
     *
     * @param getCustomAccessTokenRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> ABAC token creation was successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. This could be due to missing or incorrect parameters. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. The request could not be authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. The user does not have permission to access this resource. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred on the server. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCustomAccessTokenAsync(
            GetCustomAccessTokenRequest getCustomAccessTokenRequest,
            final ApiCallback<AccessToken> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getCustomAccessTokenValidateBeforeCall(getCustomAccessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessToken>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFullAccessToken
     *
     * @param getFullAccessTokenRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getFullAccessTokenCall(
            GetFullAccessTokenRequest getFullAccessTokenRequest, final ApiCallback _callback)
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

        Object localVarPostBody = getFullAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/auth/token/full";

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

        String[] localVarAuthNames = new String[] {};
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
    private okhttp3.Call getFullAccessTokenValidateBeforeCall(
            GetFullAccessTokenRequest getFullAccessTokenRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'getFullAccessTokenRequest' is set
        if (getFullAccessTokenRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'getFullAccessTokenRequest' when calling"
                            + " getFullAccessToken(Async)");
        }

        return getFullAccessTokenCall(getFullAccessTokenRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Gets an authentication token and creates a full session in
     * ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid
     * for 5 mins. You can generate the token for a user by providing a &#x60;username&#x60; and
     * &#x60;password&#x60;, or by using the cluster’s &#x60;secret_key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * For more information, see [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable).
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @param getFullAccessTokenRequest (required)
     * @return Token
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Token getFullAccessToken(GetFullAccessTokenRequest getFullAccessTokenRequest)
            throws ApiException {
        ApiResponse<Token> localVarResp = getFullAccessTokenWithHttpInfo(getFullAccessTokenRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Gets an authentication token and creates a full session in
     * ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid
     * for 5 mins. You can generate the token for a user by providing a &#x60;username&#x60; and
     * &#x60;password&#x60;, or by using the cluster’s &#x60;secret_key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * For more information, see [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable).
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @param getFullAccessTokenRequest (required)
     * @return ApiResponse&lt;Token&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Token> getFullAccessTokenWithHttpInfo(
            GetFullAccessTokenRequest getFullAccessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall =
                getFullAccessTokenValidateBeforeCall(getFullAccessTokenRequest, null);
        Type localVarReturnType = new TypeToken<Token>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Gets an authentication token and creates a full
     * session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot
     * remains valid for 5 mins. You can generate the token for a user by providing a
     * &#x60;username&#x60; and &#x60;password&#x60;, or by using the cluster’s
     * &#x60;secret_key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * For more information, see [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable).
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @param getFullAccessTokenRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getFullAccessTokenAsync(
            GetFullAccessTokenRequest getFullAccessTokenRequest, final ApiCallback<Token> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getFullAccessTokenValidateBeforeCall(getFullAccessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Token>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getObjectAccessToken
     *
     * @param getObjectAccessTokenRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getObjectAccessTokenCall(
            GetObjectAccessTokenRequest getObjectAccessTokenRequest, final ApiCallback _callback)
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

        Object localVarPostBody = getObjectAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/auth/token/object";

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

        String[] localVarAuthNames = new String[] {};
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
    private okhttp3.Call getObjectAccessTokenValidateBeforeCall(
            GetObjectAccessTokenRequest getObjectAccessTokenRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'getObjectAccessTokenRequest' is set
        if (getObjectAccessTokenRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'getObjectAccessTokenRequest' when calling"
                            + " getObjectAccessToken(Async)");
        }

        return getObjectAccessTokenCall(getObjectAccessTokenRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Gets an authentication token that provides access to a specific
     * metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.
     * You can generate the token for a user by providing a &#x60;username&#x60; and
     * &#x60;password&#x60;, or by using the cluster’s &#x60;secret key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @param getObjectAccessTokenRequest (required)
     * @return Token
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public Token getObjectAccessToken(GetObjectAccessTokenRequest getObjectAccessTokenRequest)
            throws ApiException {
        ApiResponse<Token> localVarResp =
                getObjectAccessTokenWithHttpInfo(getObjectAccessTokenRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Gets an authentication token that provides access to a specific
     * metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.
     * You can generate the token for a user by providing a &#x60;username&#x60; and
     * &#x60;password&#x60;, or by using the cluster’s &#x60;secret key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @param getObjectAccessTokenRequest (required)
     * @return ApiResponse&lt;Token&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Token> getObjectAccessTokenWithHttpInfo(
            GetObjectAccessTokenRequest getObjectAccessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall =
                getObjectAccessTokenValidateBeforeCall(getObjectAccessTokenRequest, null);
        Type localVarReturnType = new TypeToken<Token>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Gets an authentication token that provides access
     * to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid
     * for 5 mins. You can generate the token for a user by providing a &#x60;username&#x60; and
     * &#x60;password&#x60;, or by using the cluster’s &#x60;secret key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @param getObjectAccessTokenRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Bearer auth token creation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getObjectAccessTokenAsync(
            GetObjectAccessTokenRequest getObjectAccessTokenRequest,
            final ApiCallback<Token> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getObjectAccessTokenValidateBeforeCall(getObjectAccessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Token>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for login
     *
     * @param loginRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User login successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call loginCall(LoginRequest loginRequest, final ApiCallback _callback)
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

        Object localVarPostBody = loginRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/auth/session/login";

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
    private okhttp3.Call loginValidateBeforeCall(
            LoginRequest loginRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'loginRequest' is set
        if (loginRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'loginRequest' when calling login(Async)");
        }

        return loginCall(loginRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Creates a login session for a ThoughtSpot user with Basic
     * authentication. In Basic authentication method, REST clients log in to ThoughtSpot using
     * &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with
     * Orgs, users can pass the ID of the Org in the API request to log in to a specific Org
     * context. **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API
     * login request with basic authentication (&#x60;username&#x60; and &#x60;password&#x60; )
     * returns an error. Contact ThoughtSpot Support for assistance. A successful login returns a
     * session cookie that can be used in your subsequent API requests.
     *
     * @param loginRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User login successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void login(LoginRequest loginRequest) throws ApiException {
        loginWithHttpInfo(loginRequest);
    }

    /**
     * Version: 9.0.0.cl or later Creates a login session for a ThoughtSpot user with Basic
     * authentication. In Basic authentication method, REST clients log in to ThoughtSpot using
     * &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with
     * Orgs, users can pass the ID of the Org in the API request to log in to a specific Org
     * context. **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API
     * login request with basic authentication (&#x60;username&#x60; and &#x60;password&#x60; )
     * returns an error. Contact ThoughtSpot Support for assistance. A successful login returns a
     * session cookie that can be used in your subsequent API requests.
     *
     * @param loginRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User login successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> loginWithHttpInfo(LoginRequest loginRequest) throws ApiException {
        okhttp3.Call localVarCall = loginValidateBeforeCall(loginRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Creates a login session for a ThoughtSpot user
     * with Basic authentication. In Basic authentication method, REST clients log in to ThoughtSpot
     * using &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster
     * with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org
     * context. **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API
     * login request with basic authentication (&#x60;username&#x60; and &#x60;password&#x60; )
     * returns an error. Contact ThoughtSpot Support for assistance. A successful login returns a
     * session cookie that can be used in your subsequent API requests.
     *
     * @param loginRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User login successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call loginAsync(LoginRequest loginRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = loginValidateBeforeCall(loginRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for logout
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User logout successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call logoutCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/auth/session/logout";

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
    private okhttp3.Call logoutValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return logoutCall(_callback);
    }

    /**
     * Version: 9.0.0.cl or later Logs out a user from their current session.
     *
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User logout successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void logout() throws ApiException {
        logoutWithHttpInfo();
    }

    /**
     * Version: 9.0.0.cl or later Logs out a user from their current session.
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User logout successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> logoutWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = logoutValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Logs out a user from their current session.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> User logout successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call logoutAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = logoutValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for revokeToken
     *
     * @param revokeTokenRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Token successfully revoked. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call revokeTokenCall(
            RevokeTokenRequest revokeTokenRequest, final ApiCallback _callback)
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

        Object localVarPostBody = revokeTokenRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/auth/token/revoke";

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
    private okhttp3.Call revokeTokenValidateBeforeCall(
            RevokeTokenRequest revokeTokenRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'revokeTokenRequest' is set
        if (revokeTokenRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'revokeTokenRequest' when calling"
                            + " revokeToken(Async)");
        }

        return revokeTokenCall(revokeTokenRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Revokes the authentication token issued for current user session.
     * The token of your current session expires when you make a call to the
     * &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access
     * ThoughtSpot objects until a new token is obtained. To restart your session, request for a new
     * token from ThoughtSpot. See [Get Full Access
     * Token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @param revokeTokenRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Token successfully revoked. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void revokeToken(RevokeTokenRequest revokeTokenRequest) throws ApiException {
        revokeTokenWithHttpInfo(revokeTokenRequest);
    }

    /**
     * Version: 9.0.0.cl or later Revokes the authentication token issued for current user session.
     * The token of your current session expires when you make a call to the
     * &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access
     * ThoughtSpot objects until a new token is obtained. To restart your session, request for a new
     * token from ThoughtSpot. See [Get Full Access
     * Token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @param revokeTokenRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Token successfully revoked. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> revokeTokenWithHttpInfo(RevokeTokenRequest revokeTokenRequest)
            throws ApiException {
        okhttp3.Call localVarCall = revokeTokenValidateBeforeCall(revokeTokenRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Revokes the authentication token issued for
     * current user session. The token of your current session expires when you make a call to the
     * &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access
     * ThoughtSpot objects until a new token is obtained. To restart your session, request for a new
     * token from ThoughtSpot. See [Get Full Access
     * Token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @param revokeTokenRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Token successfully revoked. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call revokeTokenAsync(
            RevokeTokenRequest revokeTokenRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = revokeTokenValidateBeforeCall(revokeTokenRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateToken
     *
     * @param validateTokenRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Token validation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call validateTokenCall(
            ValidateTokenRequest validateTokenRequest, final ApiCallback _callback)
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

        Object localVarPostBody = validateTokenRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/auth/token/validate";

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
    private okhttp3.Call validateTokenValidateBeforeCall(
            ValidateTokenRequest validateTokenRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'validateTokenRequest' is set
        if (validateTokenRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'validateTokenRequest' when calling"
                            + " validateToken(Async)");
        }

        return validateTokenCall(validateTokenRequest, _callback);
    }

    /**
     * Version: 9.12.0.cl or later Validates the authentication token specified in the API request.
     * If your token is not valid, [Get a new
     * token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @param validateTokenRequest (required)
     * @return TokenValidationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Token validation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public TokenValidationResponse validateToken(ValidateTokenRequest validateTokenRequest)
            throws ApiException {
        ApiResponse<TokenValidationResponse> localVarResp =
                validateTokenWithHttpInfo(validateTokenRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.12.0.cl or later Validates the authentication token specified in the API request.
     * If your token is not valid, [Get a new
     * token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @param validateTokenRequest (required)
     * @return ApiResponse&lt;TokenValidationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Token validation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<TokenValidationResponse> validateTokenWithHttpInfo(
            ValidateTokenRequest validateTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = validateTokenValidateBeforeCall(validateTokenRequest, null);
        Type localVarReturnType = new TypeToken<TokenValidationResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.12.0.cl or later Validates the authentication token specified in
     * the API request. If your token is not valid, [Get a new
     * token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @param validateTokenRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Token validation successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call validateTokenAsync(
            ValidateTokenRequest validateTokenRequest,
            final ApiCallback<TokenValidationResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                validateTokenValidateBeforeCall(validateTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<TokenValidationResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
