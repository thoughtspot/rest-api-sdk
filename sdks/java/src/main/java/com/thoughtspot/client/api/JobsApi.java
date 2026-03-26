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
import com.thoughtspot.client.model.SearchChannelHistoryRequest;
import com.thoughtspot.client.model.SearchChannelHistoryResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class JobsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public JobsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public JobsApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for searchChannelHistory
     *
     * @param searchChannelHistoryRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Channel status logs retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchChannelHistoryCall(
            SearchChannelHistoryRequest searchChannelHistoryRequest, final ApiCallback _callback)
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

        Object localVarPostBody = searchChannelHistoryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/jobs/history/communication-channels/search";

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
    private okhttp3.Call searchChannelHistoryValidateBeforeCall(
            SearchChannelHistoryRequest searchChannelHistoryRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchChannelHistoryRequest' is set
        if (searchChannelHistoryRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchChannelHistoryRequest' when calling"
                            + " searchChannelHistory(Async)");
        }

        return searchChannelHistoryCall(searchChannelHistoryRequest, _callback);
    }

    /**
     * Version: 26.4.0.cl or later Searches delivery history for communication channels such as
     * webhooks. Returns channel-level delivery status for each job execution record. Use this to
     * monitor channel health and delivery success rates across events. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to
     * perform this action. **NOTE**: When &#x60;channel_type&#x60; is &#x60;WEBHOOK&#x60;, the
     * following constraints apply: - &#x60;job_ids&#x60;, &#x60;channel_identifiers&#x60;, and
     * &#x60;events&#x60; each accept at most one element. - When &#x60;job_ids&#x60; is provided,
     * it is used as the sole lookup key and other filter fields are ignored. - When
     * &#x60;job_ids&#x60; is not provided, &#x60;channel_identifiers&#x60; and &#x60;events&#x60;
     * are both required. Each must contain exactly one element, and the event object must include
     * the &#x60;identifier&#x60; field. - Records older than the configured retention period are
     * not returned.
     *
     * @param searchChannelHistoryRequest (required)
     * @return SearchChannelHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Channel status logs retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public SearchChannelHistoryResponse searchChannelHistory(
            SearchChannelHistoryRequest searchChannelHistoryRequest) throws ApiException {
        ApiResponse<SearchChannelHistoryResponse> localVarResp =
                searchChannelHistoryWithHttpInfo(searchChannelHistoryRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.4.0.cl or later Searches delivery history for communication channels such as
     * webhooks. Returns channel-level delivery status for each job execution record. Use this to
     * monitor channel health and delivery success rates across events. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to
     * perform this action. **NOTE**: When &#x60;channel_type&#x60; is &#x60;WEBHOOK&#x60;, the
     * following constraints apply: - &#x60;job_ids&#x60;, &#x60;channel_identifiers&#x60;, and
     * &#x60;events&#x60; each accept at most one element. - When &#x60;job_ids&#x60; is provided,
     * it is used as the sole lookup key and other filter fields are ignored. - When
     * &#x60;job_ids&#x60; is not provided, &#x60;channel_identifiers&#x60; and &#x60;events&#x60;
     * are both required. Each must contain exactly one element, and the event object must include
     * the &#x60;identifier&#x60; field. - Records older than the configured retention period are
     * not returned.
     *
     * @param searchChannelHistoryRequest (required)
     * @return ApiResponse&lt;SearchChannelHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Channel status logs retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SearchChannelHistoryResponse> searchChannelHistoryWithHttpInfo(
            SearchChannelHistoryRequest searchChannelHistoryRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchChannelHistoryValidateBeforeCall(searchChannelHistoryRequest, null);
        Type localVarReturnType = new TypeToken<SearchChannelHistoryResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.4.0.cl or later Searches delivery history for communication
     * channels such as webhooks. Returns channel-level delivery status for each job execution
     * record. Use this to monitor channel health and delivery success rates across events. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to
     * perform this action. **NOTE**: When &#x60;channel_type&#x60; is &#x60;WEBHOOK&#x60;, the
     * following constraints apply: - &#x60;job_ids&#x60;, &#x60;channel_identifiers&#x60;, and
     * &#x60;events&#x60; each accept at most one element. - When &#x60;job_ids&#x60; is provided,
     * it is used as the sole lookup key and other filter fields are ignored. - When
     * &#x60;job_ids&#x60; is not provided, &#x60;channel_identifiers&#x60; and &#x60;events&#x60;
     * are both required. Each must contain exactly one element, and the event object must include
     * the &#x60;identifier&#x60; field. - Records older than the configured retention period are
     * not returned.
     *
     * @param searchChannelHistoryRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Channel status logs retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchChannelHistoryAsync(
            SearchChannelHistoryRequest searchChannelHistoryRequest,
            final ApiCallback<SearchChannelHistoryResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchChannelHistoryValidateBeforeCall(searchChannelHistoryRequest, _callback);
        Type localVarReturnType = new TypeToken<SearchChannelHistoryResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
