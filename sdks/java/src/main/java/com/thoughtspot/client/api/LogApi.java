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
import com.thoughtspot.client.model.FetchLogsRequest;
import com.thoughtspot.client.model.LogResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class LogApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public LogApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for fetchLogs
     *
     * @param fetchLogsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Log fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchLogsCall(
            FetchLogsRequest fetchLogsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fetchLogsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/logs/fetch";

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
    private okhttp3.Call fetchLogsValidateBeforeCall(
            FetchLogsRequest fetchLogsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fetchLogsRequest' is set
        if (fetchLogsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'fetchLogsRequest' when calling"
                            + " fetchLogs(Async)");
        }

        return fetchLogsCall(fetchLogsRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Fetches security audit logs. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin
     * Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are
     * required. #### Usage guidelines By default, the API retrieves logs for the last 24 hours. You
     * can set a custom duration in EPOCH time. Make sure the log duration specified in your API
     * request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the
     * duration and make multiple sequential API requests. Upon successful execution, the API
     * returns logs with the following information: * timestamp of the event * event ID * event type
     * * name and GUID of the user * IP address of ThoughtSpot instance For more information see
     * [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     *
     * @param fetchLogsRequest (required)
     * @return List&lt;LogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Log fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<LogResponse> fetchLogs(FetchLogsRequest fetchLogsRequest) throws ApiException {
        ApiResponse<List<LogResponse>> localVarResp = fetchLogsWithHttpInfo(fetchLogsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Fetches security audit logs. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin
     * Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are
     * required. #### Usage guidelines By default, the API retrieves logs for the last 24 hours. You
     * can set a custom duration in EPOCH time. Make sure the log duration specified in your API
     * request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the
     * duration and make multiple sequential API requests. Upon successful execution, the API
     * returns logs with the following information: * timestamp of the event * event ID * event type
     * * name and GUID of the user * IP address of ThoughtSpot instance For more information see
     * [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     *
     * @param fetchLogsRequest (required)
     * @return ApiResponse&lt;List&lt;LogResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Log fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<LogResponse>> fetchLogsWithHttpInfo(FetchLogsRequest fetchLogsRequest)
            throws ApiException {
        okhttp3.Call localVarCall = fetchLogsValidateBeforeCall(fetchLogsRequest, null);
        Type localVarReturnType = new TypeToken<List<LogResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Fetches security audit logs. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges
     * are required. #### Usage guidelines By default, the API retrieves logs for the last 24 hours.
     * You can set a custom duration in EPOCH time. Make sure the log duration specified in your API
     * request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the
     * duration and make multiple sequential API requests. Upon successful execution, the API
     * returns logs with the following information: * timestamp of the event * event ID * event type
     * * name and GUID of the user * IP address of ThoughtSpot instance For more information see
     * [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     *
     * @param fetchLogsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Log fetched successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchLogsAsync(
            FetchLogsRequest fetchLogsRequest, final ApiCallback<List<LogResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = fetchLogsValidateBeforeCall(fetchLogsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<LogResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
