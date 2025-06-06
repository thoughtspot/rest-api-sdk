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
import com.thoughtspot.client.model.AnswerDataResponse;
import com.thoughtspot.client.model.FetchAnswerDataRequest;
import com.thoughtspot.client.model.FetchLiveboardDataRequest;
import com.thoughtspot.client.model.LiveboardDataResponse;
import com.thoughtspot.client.model.SearchDataRequest;
import com.thoughtspot.client.model.SearchDataResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DataApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public DataApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for fetchAnswerData
     *
     * @param fetchAnswerDataRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchAnswerDataCall(
            FetchAnswerDataRequest fetchAnswerDataRequest, final ApiCallback _callback)
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

        Object localVarPostBody = fetchAnswerDataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/answer/data";

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
    private okhttp3.Call fetchAnswerDataValidateBeforeCall(
            FetchAnswerDataRequest fetchAnswerDataRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'fetchAnswerDataRequest' is set
        if (fetchAnswerDataRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'fetchAnswerDataRequest' when calling"
                            + " fetchAnswerData(Async)");
        }

        return fetchAnswerDataCall(fetchAnswerDataRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Fetches data from a saved Answer. Requires at least view access to
     * the saved Answer. The &#x60;record_size&#x60; attribute determines the number of records to
     * retrieve in an API call. For more information about pagination, record size, and maximum row
     * limit, see [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     *
     * @param fetchAnswerDataRequest (required)
     * @return AnswerDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public AnswerDataResponse fetchAnswerData(FetchAnswerDataRequest fetchAnswerDataRequest)
            throws ApiException {
        ApiResponse<AnswerDataResponse> localVarResp =
                fetchAnswerDataWithHttpInfo(fetchAnswerDataRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Fetches data from a saved Answer. Requires at least view access to
     * the saved Answer. The &#x60;record_size&#x60; attribute determines the number of records to
     * retrieve in an API call. For more information about pagination, record size, and maximum row
     * limit, see [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     *
     * @param fetchAnswerDataRequest (required)
     * @return ApiResponse&lt;AnswerDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AnswerDataResponse> fetchAnswerDataWithHttpInfo(
            FetchAnswerDataRequest fetchAnswerDataRequest) throws ApiException {
        okhttp3.Call localVarCall = fetchAnswerDataValidateBeforeCall(fetchAnswerDataRequest, null);
        Type localVarReturnType = new TypeToken<AnswerDataResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Fetches data from a saved Answer. Requires at
     * least view access to the saved Answer. The &#x60;record_size&#x60; attribute determines the
     * number of records to retrieve in an API call. For more information about pagination, record
     * size, and maximum row limit, see [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     *
     * @param fetchAnswerDataRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchAnswerDataAsync(
            FetchAnswerDataRequest fetchAnswerDataRequest,
            final ApiCallback<AnswerDataResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                fetchAnswerDataValidateBeforeCall(fetchAnswerDataRequest, _callback);
        Type localVarReturnType = new TypeToken<AnswerDataResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchLiveboardData
     *
     * @param fetchLiveboardDataRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchLiveboardDataCall(
            FetchLiveboardDataRequest fetchLiveboardDataRequest, final ApiCallback _callback)
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

        Object localVarPostBody = fetchLiveboardDataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/liveboard/data";

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
    private okhttp3.Call fetchLiveboardDataValidateBeforeCall(
            FetchLiveboardDataRequest fetchLiveboardDataRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'fetchLiveboardDataRequest' is set
        if (fetchLiveboardDataRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'fetchLiveboardDataRequest' when calling"
                            + " fetchLiveboardData(Async)");
        }

        return fetchLiveboardDataCall(fetchLiveboardDataRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Gets data from a Liveboard object and its visualization. Requires
     * at least view access to the Liveboard. #### Usage guidelines In the request body, specify the
     * GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or
     * names of the visualizations in the API request. To include unsaved changes in the report,
     * pass the &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes. If the new Liveboard
     * experience mode, the transient content includes ad hoc changes to visualizations such as
     * sorting, toggling of legends, and data drill down. For more information, and see [Liveboard
     * data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     *
     * @param fetchLiveboardDataRequest (required)
     * @return LiveboardDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public LiveboardDataResponse fetchLiveboardData(
            FetchLiveboardDataRequest fetchLiveboardDataRequest) throws ApiException {
        ApiResponse<LiveboardDataResponse> localVarResp =
                fetchLiveboardDataWithHttpInfo(fetchLiveboardDataRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Gets data from a Liveboard object and its visualization. Requires
     * at least view access to the Liveboard. #### Usage guidelines In the request body, specify the
     * GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or
     * names of the visualizations in the API request. To include unsaved changes in the report,
     * pass the &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes. If the new Liveboard
     * experience mode, the transient content includes ad hoc changes to visualizations such as
     * sorting, toggling of legends, and data drill down. For more information, and see [Liveboard
     * data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     *
     * @param fetchLiveboardDataRequest (required)
     * @return ApiResponse&lt;LiveboardDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<LiveboardDataResponse> fetchLiveboardDataWithHttpInfo(
            FetchLiveboardDataRequest fetchLiveboardDataRequest) throws ApiException {
        okhttp3.Call localVarCall =
                fetchLiveboardDataValidateBeforeCall(fetchLiveboardDataRequest, null);
        Type localVarReturnType = new TypeToken<LiveboardDataResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Gets data from a Liveboard object and its
     * visualization. Requires at least view access to the Liveboard. #### Usage guidelines In the
     * request body, specify the GUID or name of the Liveboard. To get data for specific
     * visualizations, add the GUIDs or names of the visualizations in the API request. To include
     * unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script
     * generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed
     * SDK. Upon successful execution, the API returns the report with unsaved changes. If the new
     * Liveboard experience mode, the transient content includes ad hoc changes to visualizations
     * such as sorting, toggling of legends, and data drill down. For more information, and see
     * [Liveboard data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     *
     * @param fetchLiveboardDataRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call fetchLiveboardDataAsync(
            FetchLiveboardDataRequest fetchLiveboardDataRequest,
            final ApiCallback<LiveboardDataResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                fetchLiveboardDataValidateBeforeCall(fetchLiveboardDataRequest, _callback);
        Type localVarReturnType = new TypeToken<LiveboardDataResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchData
     *
     * @param searchDataRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchDataCall(
            SearchDataRequest searchDataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchDataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/searchdata";

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
    private okhttp3.Call searchDataValidateBeforeCall(
            SearchDataRequest searchDataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchDataRequest' is set
        if (searchDataRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchDataRequest' when calling"
                            + " searchData(Async)");
        }

        return searchDataCall(searchDataRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Generates an Answer from a given data source. Requires at least
     * view access to the data source object (Worksheet or View). #### Usage guidelines To search
     * data, specify the data source GUID in &#x60;logical_table_identifier&#x60;. The data source
     * can be a Worksheet, View, Table, or SQL view. Pass search tokens in the
     * &#x60;query_string&#x60; attribute in the API request as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;query_string\&quot;: \&quot;[sales] by [store]\&quot;,
     * \&quot;logical_table_identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, }
     * &#x60;&#x60;&#x60; For more information about the &#x60;query_string&#x60; format and data
     * source attribute, see [Search data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).
     * The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API
     * call. For more information about pagination, record size, and maximum row limit, see
     * [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     *
     * @param searchDataRequest (required)
     * @return SearchDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public SearchDataResponse searchData(SearchDataRequest searchDataRequest) throws ApiException {
        ApiResponse<SearchDataResponse> localVarResp = searchDataWithHttpInfo(searchDataRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Generates an Answer from a given data source. Requires at least
     * view access to the data source object (Worksheet or View). #### Usage guidelines To search
     * data, specify the data source GUID in &#x60;logical_table_identifier&#x60;. The data source
     * can be a Worksheet, View, Table, or SQL view. Pass search tokens in the
     * &#x60;query_string&#x60; attribute in the API request as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;query_string\&quot;: \&quot;[sales] by [store]\&quot;,
     * \&quot;logical_table_identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, }
     * &#x60;&#x60;&#x60; For more information about the &#x60;query_string&#x60; format and data
     * source attribute, see [Search data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).
     * The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API
     * call. For more information about pagination, record size, and maximum row limit, see
     * [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     *
     * @param searchDataRequest (required)
     * @return ApiResponse&lt;SearchDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SearchDataResponse> searchDataWithHttpInfo(
            SearchDataRequest searchDataRequest) throws ApiException {
        okhttp3.Call localVarCall = searchDataValidateBeforeCall(searchDataRequest, null);
        Type localVarReturnType = new TypeToken<SearchDataResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Generates an Answer from a given data source.
     * Requires at least view access to the data source object (Worksheet or View). #### Usage
     * guidelines To search data, specify the data source GUID in
     * &#x60;logical_table_identifier&#x60;. The data source can be a Worksheet, View, Table, or SQL
     * view. Pass search tokens in the &#x60;query_string&#x60; attribute in the API request as
     * shown in the following example: &#x60;&#x60;&#x60; { \&quot;query_string\&quot;:
     * \&quot;[sales] by [store]\&quot;, \&quot;logical_table_identifier\&quot;:
     * \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, } &#x60;&#x60;&#x60; For more information
     * about the &#x60;query_string&#x60; format and data source attribute, see [Search data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).
     * The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API
     * call. For more information about pagination, record size, and maximum row limit, see
     * [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     *
     * @param searchDataRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetching data of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchDataAsync(
            SearchDataRequest searchDataRequest, final ApiCallback<SearchDataResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = searchDataValidateBeforeCall(searchDataRequest, _callback);
        Type localVarReturnType = new TypeToken<SearchDataResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
