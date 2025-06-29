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
import com.thoughtspot.client.model.CreateCustomActionRequest;
import com.thoughtspot.client.model.ResponseCustomAction;
import com.thoughtspot.client.model.SearchCustomActionsRequest;
import com.thoughtspot.client.model.UpdateCustomActionRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CustomActionApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomActionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomActionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public CustomActionApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createCustomAction
     *
     * @param createCustomActionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCustomActionCall(
            CreateCustomActionRequest createCustomActionRequest, final ApiCallback _callback)
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

        Object localVarPostBody = createCustomActionRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/custom-actions";

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
    private okhttp3.Call createCustomActionValidateBeforeCall(
            CreateCustomActionRequest createCustomActionRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createCustomActionRequest' is set
        if (createCustomActionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createCustomActionRequest' when calling"
                            + " createCustomAction(Async)");
        }

        return createCustomActionCall(createCustomActionRequest, _callback);
    }

    /**
     * Version: 9.6.0.cl or later Creates a custom action that appears as a menu action on a saved
     * Answer or Liveboard visualization. Requires &#x60;DEVELOPER&#x60; (**Has Developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. #### Usage Guidelines The API lets you create the following types of custom
     * actions: * URL-based action Allows pushing data to an external URL. * Callback action
     * Triggers a callback to the host application and initiates a response payload on an embedded
     * ThoughtSpot instance. By default, custom actions are visible to only administrator or
     * developer users. To make a custom action available to other users, and specify the groups in
     * &#x60;group_identifiers&#x60;. By default, the custom action is set as a _global_ action on
     * all visualizations and saved Answers. To assign a custom action to specific Liveboard
     * visualization, saved Answer, or Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in
     * &#x60;default_action_config&#x60; property and specify the GUID or name of the object in
     * &#x60;associate_metadata&#x60;. For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @param createCustomActionRequest (required)
     * @return ResponseCustomAction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ResponseCustomAction createCustomAction(
            CreateCustomActionRequest createCustomActionRequest) throws ApiException {
        ApiResponse<ResponseCustomAction> localVarResp =
                createCustomActionWithHttpInfo(createCustomActionRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.6.0.cl or later Creates a custom action that appears as a menu action on a saved
     * Answer or Liveboard visualization. Requires &#x60;DEVELOPER&#x60; (**Has Developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. #### Usage Guidelines The API lets you create the following types of custom
     * actions: * URL-based action Allows pushing data to an external URL. * Callback action
     * Triggers a callback to the host application and initiates a response payload on an embedded
     * ThoughtSpot instance. By default, custom actions are visible to only administrator or
     * developer users. To make a custom action available to other users, and specify the groups in
     * &#x60;group_identifiers&#x60;. By default, the custom action is set as a _global_ action on
     * all visualizations and saved Answers. To assign a custom action to specific Liveboard
     * visualization, saved Answer, or Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in
     * &#x60;default_action_config&#x60; property and specify the GUID or name of the object in
     * &#x60;associate_metadata&#x60;. For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @param createCustomActionRequest (required)
     * @return ApiResponse&lt;ResponseCustomAction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ResponseCustomAction> createCustomActionWithHttpInfo(
            CreateCustomActionRequest createCustomActionRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createCustomActionValidateBeforeCall(createCustomActionRequest, null);
        Type localVarReturnType = new TypeToken<ResponseCustomAction>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.6.0.cl or later Creates a custom action that appears as a menu
     * action on a saved Answer or Liveboard visualization. Requires &#x60;DEVELOPER&#x60; (**Has
     * Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. #### Usage
     * Guidelines The API lets you create the following types of custom actions: * URL-based action
     * Allows pushing data to an external URL. * Callback action Triggers a callback to the host
     * application and initiates a response payload on an embedded ThoughtSpot instance. By default,
     * custom actions are visible to only administrator or developer users. To make a custom action
     * available to other users, and specify the groups in &#x60;group_identifiers&#x60;. By
     * default, the custom action is set as a _global_ action on all visualizations and saved
     * Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or
     * Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in
     * &#x60;default_action_config&#x60; property and specify the GUID or name of the object in
     * &#x60;associate_metadata&#x60;. For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @param createCustomActionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCustomActionAsync(
            CreateCustomActionRequest createCustomActionRequest,
            final ApiCallback<ResponseCustomAction> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createCustomActionValidateBeforeCall(createCustomActionRequest, _callback);
        Type localVarReturnType = new TypeToken<ResponseCustomAction>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCustomAction
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action is successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCustomActionCall(
            String customActionIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete"
                        .replace(
                                "{" + "custom_action_identifier" + "}",
                                localVarApiClient.escapeString(customActionIdentifier.toString()));

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
    private okhttp3.Call deleteCustomActionValidateBeforeCall(
            String customActionIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customActionIdentifier' is set
        if (customActionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'customActionIdentifier' when calling"
                            + " deleteCustomAction(Async)");
        }

        return deleteCustomActionCall(customActionIdentifier, _callback);
    }

    /**
     * Version: 9.6.0.cl or later Removes the custom action specified in the API request. Requires
     * &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action is successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteCustomAction(String customActionIdentifier) throws ApiException {
        deleteCustomActionWithHttpInfo(customActionIdentifier);
    }

    /**
     * Version: 9.6.0.cl or later Removes the custom action specified in the API request. Requires
     * &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action is successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteCustomActionWithHttpInfo(String customActionIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall =
                deleteCustomActionValidateBeforeCall(customActionIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.6.0.cl or later Removes the custom action specified in the API
     * request. Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action is successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCustomActionAsync(
            String customActionIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall =
                deleteCustomActionValidateBeforeCall(customActionIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchCustomActions
     *
     * @param searchCustomActionsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action search is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchCustomActionsCall(
            SearchCustomActionsRequest searchCustomActionsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = searchCustomActionsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/custom-actions/search";

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
    private okhttp3.Call searchCustomActionsValidateBeforeCall(
            SearchCustomActionsRequest searchCustomActionsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchCustomActionsRequest' is set
        if (searchCustomActionsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchCustomActionsRequest' when calling"
                            + " searchCustomActions(Async)");
        }

        return searchCustomActionsCall(searchCustomActionsRequest, _callback);
    }

    /**
     * Version: 9.6.0.cl or later Gets custom actions configured on the cluster. Requires
     * &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @param searchCustomActionsRequest (required)
     * @return List&lt;ResponseCustomAction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action search is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<ResponseCustomAction> searchCustomActions(
            SearchCustomActionsRequest searchCustomActionsRequest) throws ApiException {
        ApiResponse<List<ResponseCustomAction>> localVarResp =
                searchCustomActionsWithHttpInfo(searchCustomActionsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.6.0.cl or later Gets custom actions configured on the cluster. Requires
     * &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @param searchCustomActionsRequest (required)
     * @return ApiResponse&lt;List&lt;ResponseCustomAction&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action search is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<ResponseCustomAction>> searchCustomActionsWithHttpInfo(
            SearchCustomActionsRequest searchCustomActionsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchCustomActionsValidateBeforeCall(searchCustomActionsRequest, null);
        Type localVarReturnType = new TypeToken<List<ResponseCustomAction>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.6.0.cl or later Gets custom actions configured on the cluster.
     * Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @param searchCustomActionsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom action search is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchCustomActionsAsync(
            SearchCustomActionsRequest searchCustomActionsRequest,
            final ApiCallback<List<ResponseCustomAction>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchCustomActionsValidateBeforeCall(searchCustomActionsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<ResponseCustomAction>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCustomAction
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @param updateCustomActionRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCustomActionCall(
            String customActionIdentifier,
            UpdateCustomActionRequest updateCustomActionRequest,
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

        Object localVarPostBody = updateCustomActionRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update"
                        .replace(
                                "{" + "custom_action_identifier" + "}",
                                localVarApiClient.escapeString(customActionIdentifier.toString()));

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
    private okhttp3.Call updateCustomActionValidateBeforeCall(
            String customActionIdentifier,
            UpdateCustomActionRequest updateCustomActionRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'customActionIdentifier' is set
        if (customActionIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'customActionIdentifier' when calling"
                            + " updateCustomAction(Async)");
        }

        // verify the required parameter 'updateCustomActionRequest' is set
        if (updateCustomActionRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateCustomActionRequest' when calling"
                            + " updateCustomAction(Async)");
        }

        return updateCustomActionCall(customActionIdentifier, updateCustomActionRequest, _callback);
    }

    /**
     * Version: 9.6.0.cl or later Updates a custom action. Requires &#x60;DEVELOPER&#x60; (**Has
     * Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. #### Usage
     * Guidelines The API allows you to modify the following properties: * Name of the custom action
     * * Action availability to groups * Association to metadata objects * Authentication settings
     * for a URL-based action For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @param updateCustomActionRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateCustomAction(
            String customActionIdentifier, UpdateCustomActionRequest updateCustomActionRequest)
            throws ApiException {
        updateCustomActionWithHttpInfo(customActionIdentifier, updateCustomActionRequest);
    }

    /**
     * Version: 9.6.0.cl or later Updates a custom action. Requires &#x60;DEVELOPER&#x60; (**Has
     * Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. #### Usage
     * Guidelines The API allows you to modify the following properties: * Name of the custom action
     * * Action availability to groups * Association to metadata objects * Authentication settings
     * for a URL-based action For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @param updateCustomActionRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateCustomActionWithHttpInfo(
            String customActionIdentifier, UpdateCustomActionRequest updateCustomActionRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateCustomActionValidateBeforeCall(
                        customActionIdentifier, updateCustomActionRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.6.0.cl or later Updates a custom action. Requires
     * &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. #### Usage
     * Guidelines The API allows you to modify the following properties: * Name of the custom action
     * * Action availability to groups * Association to metadata objects * Authentication settings
     * for a URL-based action For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @param customActionIdentifier Unique ID or name of the custom action. (required)
     * @param updateCustomActionRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Custom action updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCustomActionAsync(
            String customActionIdentifier,
            UpdateCustomActionRequest updateCustomActionRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateCustomActionValidateBeforeCall(
                        customActionIdentifier, updateCustomActionRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
