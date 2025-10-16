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
import com.thoughtspot.client.model.ExportAnswerReportRequest;
import com.thoughtspot.client.model.ExportLiveboardReportRequest;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ReportsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ReportsApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for exportAnswerReport
     *
     * @param exportAnswerReportRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportAnswerReportCall(
            ExportAnswerReportRequest exportAnswerReportRequest, final ApiCallback _callback)
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

        Object localVarPostBody = exportAnswerReportRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/report/answer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/octet-stream", "application/json"};
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
    private okhttp3.Call exportAnswerReportValidateBeforeCall(
            ExportAnswerReportRequest exportAnswerReportRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'exportAnswerReportRequest' is set
        if (exportAnswerReportRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'exportAnswerReportRequest' when calling"
                            + " exportAnswerReport(Async)");
        }

        return exportAnswerReportCall(exportAnswerReportRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Exports an Answer in the given file format. You can download the
     * Answer data as a PDF, PNG, CSV, or XLSX file. Requires at least view access to the Answer.
     * #### Usage guidelines In the request body, the GUID or name of the Answer and set
     * &#x60;file_format&#x60;. The default file format is CSV. **NOTE**: * The downloadable file
     * returned in API response file is extensionless. Please rename the downloaded file by typing
     * in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with
     * tables. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data.
     *
     * @param exportAnswerReportRequest (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public File exportAnswerReport(ExportAnswerReportRequest exportAnswerReportRequest)
            throws ApiException {
        ApiResponse<File> localVarResp = exportAnswerReportWithHttpInfo(exportAnswerReportRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Exports an Answer in the given file format. You can download the
     * Answer data as a PDF, PNG, CSV, or XLSX file. Requires at least view access to the Answer.
     * #### Usage guidelines In the request body, the GUID or name of the Answer and set
     * &#x60;file_format&#x60;. The default file format is CSV. **NOTE**: * The downloadable file
     * returned in API response file is extensionless. Please rename the downloaded file by typing
     * in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with
     * tables. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data.
     *
     * @param exportAnswerReportRequest (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<File> exportAnswerReportWithHttpInfo(
            ExportAnswerReportRequest exportAnswerReportRequest) throws ApiException {
        okhttp3.Call localVarCall =
                exportAnswerReportValidateBeforeCall(exportAnswerReportRequest, null);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Exports an Answer in the given file format. You
     * can download the Answer data as a PDF, PNG, CSV, or XLSX file. Requires at least view access
     * to the Answer. #### Usage guidelines In the request body, the GUID or name of the Answer and
     * set &#x60;file_format&#x60;. The default file format is CSV. **NOTE**: * The downloadable
     * file returned in API response file is extensionless. Please rename the downloaded file by
     * typing in the relevant extension. * HTML rendering is not supported for PDF exports of
     * Answers with tables. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data.
     *
     * @param exportAnswerReportRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportAnswerReportAsync(
            ExportAnswerReportRequest exportAnswerReportRequest, final ApiCallback<File> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                exportAnswerReportValidateBeforeCall(exportAnswerReportRequest, _callback);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportLiveboardReport
     *
     * @param exportLiveboardReportRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportLiveboardReportCall(
            ExportLiveboardReportRequest exportLiveboardReportRequest, final ApiCallback _callback)
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

        Object localVarPostBody = exportLiveboardReportRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/report/liveboard";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/octet-stream", "application/json"};
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
    private okhttp3.Call exportLiveboardReportValidateBeforeCall(
            ExportLiveboardReportRequest exportLiveboardReportRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'exportLiveboardReportRequest' is set
        if (exportLiveboardReportRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'exportLiveboardReportRequest' when calling"
                            + " exportLiveboardReport(Async)");
        }

        return exportLiveboardReportCall(exportLiveboardReportRequest, _callback);
    }

    /**
     * Version: 9.0.0.cl or later Exports a Liveboard and its visualizations in PDF or PNG file
     * format. Requires at least view access to the Liveboard. #### Usage guidelines In the request
     * body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific
     * visualizations, add GUIDs or names of the visualizations. The default &#x60;file_format&#x60;
     * is PDF. For PDF downloads, you can specify additional parameters to customize the page
     * orientation and include or exclude the cover page, logo, footer text, and page numbers.
     * Similar customization options are also available for PNG output. **NOTE**: The downloadable
     * file returned in API response file is extensionless. Please rename the downloaded file by
     * typing in the relevant extension. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data. To include unsaved changes in the report, pass the
     * &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes, including ad hoc
     * changes to visualizations. For more information, see [Liveboard Report
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * **NOTE**: Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in
     * the PNG format in the resolution of your choice. To enable this on your instance, contact
     * ThoughtSpot support. When this feature is enabled, the options
     * &#x60;include_cover_page&#x60;,&#x60;include_filter_page&#x60; within the
     * &#x60;png_options&#x60; will not be available for PNG exports.
     *
     * @param exportLiveboardReportRequest (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public File exportLiveboardReport(ExportLiveboardReportRequest exportLiveboardReportRequest)
            throws ApiException {
        ApiResponse<File> localVarResp =
                exportLiveboardReportWithHttpInfo(exportLiveboardReportRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 9.0.0.cl or later Exports a Liveboard and its visualizations in PDF or PNG file
     * format. Requires at least view access to the Liveboard. #### Usage guidelines In the request
     * body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific
     * visualizations, add GUIDs or names of the visualizations. The default &#x60;file_format&#x60;
     * is PDF. For PDF downloads, you can specify additional parameters to customize the page
     * orientation and include or exclude the cover page, logo, footer text, and page numbers.
     * Similar customization options are also available for PNG output. **NOTE**: The downloadable
     * file returned in API response file is extensionless. Please rename the downloaded file by
     * typing in the relevant extension. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data. To include unsaved changes in the report, pass the
     * &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes, including ad hoc
     * changes to visualizations. For more information, see [Liveboard Report
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * **NOTE**: Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in
     * the PNG format in the resolution of your choice. To enable this on your instance, contact
     * ThoughtSpot support. When this feature is enabled, the options
     * &#x60;include_cover_page&#x60;,&#x60;include_filter_page&#x60; within the
     * &#x60;png_options&#x60; will not be available for PNG exports.
     *
     * @param exportLiveboardReportRequest (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<File> exportLiveboardReportWithHttpInfo(
            ExportLiveboardReportRequest exportLiveboardReportRequest) throws ApiException {
        okhttp3.Call localVarCall =
                exportLiveboardReportValidateBeforeCall(exportLiveboardReportRequest, null);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 9.0.0.cl or later Exports a Liveboard and its visualizations in PDF
     * or PNG file format. Requires at least view access to the Liveboard. #### Usage guidelines In
     * the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report
     * with specific visualizations, add GUIDs or names of the visualizations. The default
     * &#x60;file_format&#x60; is PDF. For PDF downloads, you can specify additional parameters to
     * customize the page orientation and include or exclude the cover page, logo, footer text, and
     * page numbers. Similar customization options are also available for PNG output. **NOTE**: The
     * downloadable file returned in API response file is extensionless. Please rename the
     * downloaded file by typing in the relevant extension. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data. To include unsaved changes in the report, pass the
     * &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes, including ad hoc
     * changes to visualizations. For more information, see [Liveboard Report
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * **NOTE**: Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in
     * the PNG format in the resolution of your choice. To enable this on your instance, contact
     * ThoughtSpot support. When this feature is enabled, the options
     * &#x60;include_cover_page&#x60;,&#x60;include_filter_page&#x60; within the
     * &#x60;png_options&#x60; will not be available for PNG exports.
     *
     * @param exportLiveboardReportRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Export report file of specified metadata object is successful. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportLiveboardReportAsync(
            ExportLiveboardReportRequest exportLiveboardReportRequest,
            final ApiCallback<File> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                exportLiveboardReportValidateBeforeCall(exportLiveboardReportRequest, _callback);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
