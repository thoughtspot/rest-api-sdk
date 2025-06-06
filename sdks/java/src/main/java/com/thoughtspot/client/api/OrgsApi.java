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
import com.thoughtspot.client.model.CreateOrgRequest;
import com.thoughtspot.client.model.OrgResponse;
import com.thoughtspot.client.model.SearchOrgsRequest;
import com.thoughtspot.client.model.UpdateOrgRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OrgsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrgsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrgsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public OrgsApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createOrg
     *
     * @param createOrgRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createOrgCall(
            CreateOrgRequest createOrgRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createOrgRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/orgs/create";

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
    private okhttp3.Call createOrgValidateBeforeCall(
            CreateOrgRequest createOrgRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createOrgRequest' is set
        if (createOrgRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createOrgRequest' when calling"
                            + " createOrg(Async)");
        }

        return createOrgCall(createOrgRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Creates an Org object. To use this API, the
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in
     * your cluster. Requires cluster administration (**Can administer Org**) privileges. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is
     * required.
     *
     * @param createOrgRequest (required)
     * @return OrgResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public OrgResponse createOrg(CreateOrgRequest createOrgRequest) throws ApiException {
        ApiResponse<OrgResponse> localVarResp = createOrgWithHttpInfo(createOrgRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Creates an Org object. To use this API, the
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in
     * your cluster. Requires cluster administration (**Can administer Org**) privileges. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is
     * required.
     *
     * @param createOrgRequest (required)
     * @return ApiResponse&lt;OrgResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<OrgResponse> createOrgWithHttpInfo(CreateOrgRequest createOrgRequest)
            throws ApiException {
        okhttp3.Call localVarCall = createOrgValidateBeforeCall(createOrgRequest, null);
        Type localVarReturnType = new TypeToken<OrgResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Creates an Org object. To use this API, the
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in
     * your cluster. Requires cluster administration (**Can administer Org**) privileges. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is
     * required.
     *
     * @param createOrgRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization successfully created. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createOrgAsync(
            CreateOrgRequest createOrgRequest, final ApiCallback<OrgResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = createOrgValidateBeforeCall(createOrgRequest, _callback);
        Type localVarReturnType = new TypeToken<OrgResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteOrg
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteOrgCall(String orgIdentifier, final ApiCallback _callback)
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
                "/api/rest/2.0/orgs/{org_identifier}/delete"
                        .replace(
                                "{" + "org_identifier" + "}",
                                localVarApiClient.escapeString(orgIdentifier.toString()));

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
    private okhttp3.Call deleteOrgValidateBeforeCall(
            String orgIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgIdentifier' is set
        if (orgIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'orgIdentifier' when calling deleteOrg(Async)");
        }

        return deleteOrgCall(orgIdentifier, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Deletes an Org object from the ThoughtSpot system. Requires
     * cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required. When you delete
     * an Org, all its users and objects created in that Org context are removed. However, if the
     * users in the deleted Org also exists in other Orgs, they are removed only from the deleted
     * Org.
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteOrg(String orgIdentifier) throws ApiException {
        deleteOrgWithHttpInfo(orgIdentifier);
    }

    /**
     * Version: 9.0.0.cl or later Deletes an Org object from the ThoughtSpot system. Requires
     * cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required. When you delete
     * an Org, all its users and objects created in that Org context are removed. However, if the
     * users in the deleted Org also exists in other Orgs, they are removed only from the deleted
     * Org.
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteOrgWithHttpInfo(String orgIdentifier) throws ApiException {
        okhttp3.Call localVarCall = deleteOrgValidateBeforeCall(orgIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Deletes an Org object from the ThoughtSpot
     * system. Requires cluster administration (**Can administer Org**) privilege. If [Role-Based
     * Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your
     * instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     * When you delete an Org, all its users and objects created in that Org context are removed.
     * However, if the users in the deleted Org also exists in other Orgs, they are removed only
     * from the deleted Org.
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteOrgAsync(String orgIdentifier, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = deleteOrgValidateBeforeCall(orgIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchOrgs
     *
     * @param searchOrgsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchOrgsCall(
            SearchOrgsRequest searchOrgsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchOrgsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/orgs/search";

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
    private okhttp3.Call searchOrgsValidateBeforeCall(
            SearchOrgsRequest searchOrgsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchOrgsRequest' is set
        if (searchOrgsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchOrgsRequest' when calling"
                            + " searchOrgs(Async)");
        }

        return searchOrgsCall(searchOrgsRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of Orgs configured on the ThoughtSpot system. To get
     * details of a specific Org, specify the Org ID or name. You can also pass parameters such as
     * status, visibility, and user identifiers to get a specific list of Orgs. Requires cluster
     * administration (**Can administer Org**) privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @param searchOrgsRequest (required)
     * @return List&lt;OrgResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<OrgResponse> searchOrgs(SearchOrgsRequest searchOrgsRequest) throws ApiException {
        ApiResponse<List<OrgResponse>> localVarResp = searchOrgsWithHttpInfo(searchOrgsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of Orgs configured on the ThoughtSpot system. To get
     * details of a specific Org, specify the Org ID or name. You can also pass parameters such as
     * status, visibility, and user identifiers to get a specific list of Orgs. Requires cluster
     * administration (**Can administer Org**) privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @param searchOrgsRequest (required)
     * @return ApiResponse&lt;List&lt;OrgResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<OrgResponse>> searchOrgsWithHttpInfo(
            SearchOrgsRequest searchOrgsRequest) throws ApiException {
        okhttp3.Call localVarCall = searchOrgsValidateBeforeCall(searchOrgsRequest, null);
        Type localVarReturnType = new TypeToken<List<OrgResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Gets a list of Orgs configured on the ThoughtSpot
     * system. To get details of a specific Org, specify the Org ID or name. You can also pass
     * parameters such as status, visibility, and user identifiers to get a specific list of Orgs.
     * Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @param searchOrgsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Organization search result. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchOrgsAsync(
            SearchOrgsRequest searchOrgsRequest, final ApiCallback<List<OrgResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = searchOrgsValidateBeforeCall(searchOrgsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<OrgResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateOrg
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @param updateOrgRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateOrgCall(
            String orgIdentifier, UpdateOrgRequest updateOrgRequest, final ApiCallback _callback)
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

        Object localVarPostBody = updateOrgRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/orgs/{org_identifier}/update"
                        .replace(
                                "{" + "org_identifier" + "}",
                                localVarApiClient.escapeString(orgIdentifier.toString()));

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
    private okhttp3.Call updateOrgValidateBeforeCall(
            String orgIdentifier, UpdateOrgRequest updateOrgRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'orgIdentifier' is set
        if (orgIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'orgIdentifier' when calling updateOrg(Async)");
        }

        // verify the required parameter 'updateOrgRequest' is set
        if (updateOrgRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateOrgRequest' when calling"
                            + " updateOrg(Async)");
        }

        return updateOrgCall(orgIdentifier, updateOrgRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Updates an Org object. You can modify Org properties such as name,
     * description, and user associations. Requires cluster administration (**Can administer Org**)
     * privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @param updateOrgRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateOrg(String orgIdentifier, UpdateOrgRequest updateOrgRequest)
            throws ApiException {
        updateOrgWithHttpInfo(orgIdentifier, updateOrgRequest);
    }

    /**
     * Version: 9.0.0.cl or later Updates an Org object. You can modify Org properties such as name,
     * description, and user associations. Requires cluster administration (**Can administer Org**)
     * privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @param updateOrgRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateOrgWithHttpInfo(
            String orgIdentifier, UpdateOrgRequest updateOrgRequest) throws ApiException {
        okhttp3.Call localVarCall =
                updateOrgValidateBeforeCall(orgIdentifier, updateOrgRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Updates an Org object. You can modify Org
     * properties such as name, description, and user associations. Requires cluster administration
     * (**Can administer Org**) privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @param orgIdentifier ID or name of the Org (required)
     * @param updateOrgRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Organization successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateOrgAsync(
            String orgIdentifier,
            UpdateOrgRequest updateOrgRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateOrgValidateBeforeCall(orgIdentifier, updateOrgRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
