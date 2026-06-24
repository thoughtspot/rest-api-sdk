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
import com.thoughtspot.client.model.DeleteStyleFontsRequest;
import com.thoughtspot.client.model.ExportStyleLogosRequest;
import com.thoughtspot.client.model.NavigationPanelInput;
import com.thoughtspot.client.model.SearchStyleCustomizationsRequest;
import com.thoughtspot.client.model.SearchStyleFontsRequest;
import com.thoughtspot.client.model.StyleColorPaletteInput;
import com.thoughtspot.client.model.StyleFontDeleteData;
import com.thoughtspot.client.model.StyleFontRecord;
import com.thoughtspot.client.model.StyleFontUploadData;
import com.thoughtspot.client.model.StylePreference;
import com.thoughtspot.client.model.StyleResetOptionsInput;
import com.thoughtspot.client.model.UpdateStyleFontRequest;
import com.thoughtspot.client.model.VisualizationFontsInput;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleCustomizationApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StyleCustomizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StyleCustomizationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public StyleCustomizationApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for deleteStyleFonts
     *
     * @param deleteStyleFontsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteStyleFontsCall(
            DeleteStyleFontsRequest deleteStyleFontsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = deleteStyleFontsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/styles/fonts/delete";

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
    private okhttp3.Call deleteStyleFontsValidateBeforeCall(
            DeleteStyleFontsRequest deleteStyleFontsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'deleteStyleFontsRequest' is set
        if (deleteStyleFontsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'deleteStyleFontsRequest' when calling"
                            + " deleteStyleFonts(Async)");
        }

        return deleteStyleFontsCall(deleteStyleFontsRequest, _callback);
    }

    /**
     * Version: 26.7.0.cl or later Deletes one or more custom fonts from the cluster-level or
     * org-level font library. If a deleted font is assigned to visualization areas, those
     * assignments automatically fallback to the cluster/system default font. The response lists all
     * affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually
     * delete fonts, you must explicitly pass dry_run: false. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**)
     * privilege. #### Usage guidelines - Provide one or more font UUIDs or names in
     * &#x60;font_identifiers&#x60;. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete from
     * the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to delete from
     * the authenticated user&#39;s org library. - Use &#x60;dry_run: true&#x60; to preview which
     * visualization areas would be affected without actually deleting the font. The response lists
     * affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the
     * font file using &#x60;uploadStyleFont&#x60; if needed.
     *
     * @param deleteStyleFontsRequest (required)
     * @return StyleFontDeleteData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public StyleFontDeleteData deleteStyleFonts(DeleteStyleFontsRequest deleteStyleFontsRequest)
            throws ApiException {
        ApiResponse<StyleFontDeleteData> localVarResp =
                deleteStyleFontsWithHttpInfo(deleteStyleFontsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.7.0.cl or later Deletes one or more custom fonts from the cluster-level or
     * org-level font library. If a deleted font is assigned to visualization areas, those
     * assignments automatically fallback to the cluster/system default font. The response lists all
     * affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually
     * delete fonts, you must explicitly pass dry_run: false. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**)
     * privilege. #### Usage guidelines - Provide one or more font UUIDs or names in
     * &#x60;font_identifiers&#x60;. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete from
     * the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to delete from
     * the authenticated user&#39;s org library. - Use &#x60;dry_run: true&#x60; to preview which
     * visualization areas would be affected without actually deleting the font. The response lists
     * affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the
     * font file using &#x60;uploadStyleFont&#x60; if needed.
     *
     * @param deleteStyleFontsRequest (required)
     * @return ApiResponse&lt;StyleFontDeleteData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<StyleFontDeleteData> deleteStyleFontsWithHttpInfo(
            DeleteStyleFontsRequest deleteStyleFontsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                deleteStyleFontsValidateBeforeCall(deleteStyleFontsRequest, null);
        Type localVarReturnType = new TypeToken<StyleFontDeleteData>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.7.0.cl or later Deletes one or more custom fonts from the
     * cluster-level or org-level font library. If a deleted font is assigned to visualization
     * areas, those assignments automatically fallback to the cluster/system default font. The
     * response lists all affected areas where the font was explicitly set. Note: dry_run defaults
     * to true. To actually delete fonts, you must explicitly pass dry_run: false. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. #### Usage guidelines - Provide one or more font UUIDs or
     * names in &#x60;font_identifiers&#x60;. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to
     * delete from the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to
     * delete from the authenticated user&#39;s org library. - Use &#x60;dry_run: true&#x60; to
     * preview which visualization areas would be affected without actually deleting the font. The
     * response lists affected assignments; no changes are applied. - Deletions cannot be undone.
     * Re-upload the font file using &#x60;uploadStyleFont&#x60; if needed.
     *
     * @param deleteStyleFontsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteStyleFontsAsync(
            DeleteStyleFontsRequest deleteStyleFontsRequest,
            final ApiCallback<StyleFontDeleteData> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteStyleFontsValidateBeforeCall(deleteStyleFontsRequest, _callback);
        Type localVarReturnType = new TypeToken<StyleFontDeleteData>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportStyleLogos
     *
     * @param exportStyleLogosRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Logo ZIP archive retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportStyleLogosCall(
            ExportStyleLogosRequest exportStyleLogosRequest, final ApiCallback _callback)
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

        Object localVarPostBody = exportStyleLogosRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/styles/logos/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/zip", "application/json"};
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
    private okhttp3.Call exportStyleLogosValidateBeforeCall(
            ExportStyleLogosRequest exportStyleLogosRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'exportStyleLogosRequest' is set
        if (exportStyleLogosRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'exportStyleLogosRequest' when calling"
                            + " exportStyleLogos(Async)");
        }

        return exportStyleLogosCall(exportStyleLogosRequest, _callback);
    }

    /**
     * Version: 26.7.0.cl or later Downloads the active logos (default and wide slots) at the
     * requested scope as a single ZIP archive containing both logo image files. If no custom logo
     * has been uploaded at the ORG scope, the archive contains the resolved logo falling through
     * from the cluster. If no cluster logo has been uploaded, no file is returned. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. #### Usage guidelines - Set &#x60;scope&#x60; to
     * &#x60;CLUSTER&#x60; to download cluster-level logos. - Set &#x60;scope&#x60; to
     * &#x60;ORG&#x60; (default) to download logos for the authenticated user&#39;s org. - The
     * response is a ZIP archive (&#x60;application/zip&#x60;). Save the response body directly to a
     * &#x60;.zip&#x60; file. - The archive always contains two files — one for the DEFAULT slot and
     * one for the WIDE slot — even if no custom logo is set at the requested scope.
     *
     * @param exportStyleLogosRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Logo ZIP archive retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void exportStyleLogos(ExportStyleLogosRequest exportStyleLogosRequest)
            throws ApiException {
        exportStyleLogosWithHttpInfo(exportStyleLogosRequest);
    }

    /**
     * Version: 26.7.0.cl or later Downloads the active logos (default and wide slots) at the
     * requested scope as a single ZIP archive containing both logo image files. If no custom logo
     * has been uploaded at the ORG scope, the archive contains the resolved logo falling through
     * from the cluster. If no cluster logo has been uploaded, no file is returned. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. #### Usage guidelines - Set &#x60;scope&#x60; to
     * &#x60;CLUSTER&#x60; to download cluster-level logos. - Set &#x60;scope&#x60; to
     * &#x60;ORG&#x60; (default) to download logos for the authenticated user&#39;s org. - The
     * response is a ZIP archive (&#x60;application/zip&#x60;). Save the response body directly to a
     * &#x60;.zip&#x60; file. - The archive always contains two files — one for the DEFAULT slot and
     * one for the WIDE slot — even if no custom logo is set at the requested scope.
     *
     * @param exportStyleLogosRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Logo ZIP archive retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> exportStyleLogosWithHttpInfo(
            ExportStyleLogosRequest exportStyleLogosRequest) throws ApiException {
        okhttp3.Call localVarCall =
                exportStyleLogosValidateBeforeCall(exportStyleLogosRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 26.7.0.cl or later Downloads the active logos (default and wide
     * slots) at the requested scope as a single ZIP archive containing both logo image files. If no
     * custom logo has been uploaded at the ORG scope, the archive contains the resolved logo
     * falling through from the cluster. If no cluster logo has been uploaded, no file is returned.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60;
     * (**Has developer privilege**) privilege. #### Usage guidelines - Set &#x60;scope&#x60; to
     * &#x60;CLUSTER&#x60; to download cluster-level logos. - Set &#x60;scope&#x60; to
     * &#x60;ORG&#x60; (default) to download logos for the authenticated user&#39;s org. - The
     * response is a ZIP archive (&#x60;application/zip&#x60;). Save the response body directly to a
     * &#x60;.zip&#x60; file. - The archive always contains two files — one for the DEFAULT slot and
     * one for the WIDE slot — even if no custom logo is set at the requested scope.
     *
     * @param exportStyleLogosRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Logo ZIP archive retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call exportStyleLogosAsync(
            ExportStyleLogosRequest exportStyleLogosRequest, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                exportStyleLogosValidateBeforeCall(exportStyleLogosRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchStyleCustomizations
     *
     * @param searchStyleCustomizationsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Style preferences retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchStyleCustomizationsCall(
            SearchStyleCustomizationsRequest searchStyleCustomizationsRequest,
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

        Object localVarPostBody = searchStyleCustomizationsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/styles/search";

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
    private okhttp3.Call searchStyleCustomizationsValidateBeforeCall(
            SearchStyleCustomizationsRequest searchStyleCustomizationsRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchStyleCustomizationsRequest' is set
        if (searchStyleCustomizationsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchStyleCustomizationsRequest' when"
                            + " calling searchStyleCustomizations(Async)");
        }

        return searchStyleCustomizationsCall(searchStyleCustomizationsRequest, _callback);
    }

    /**
     * Version: 26.7.0.cl or later Retrieves style preferences at cluster level or for the
     * authenticated user&#39;s org. Cluster-level preferences serve as defaults for all orgs.
     * Org-level preferences override cluster defaults. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to retrieve
     * cluster-level style defaults. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to
     * retrieve preferences for the authenticated user&#39;s org. - Each field in the response
     * includes an &#x60;is_overridden&#x60; flag indicating whether the value was explicitly set at
     * the requested scope or inherited from a parent scope (cluster or system default).
     *
     * @param searchStyleCustomizationsRequest (required)
     * @return List&lt;StylePreference&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Style preferences retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<StylePreference> searchStyleCustomizations(
            SearchStyleCustomizationsRequest searchStyleCustomizationsRequest) throws ApiException {
        ApiResponse<List<StylePreference>> localVarResp =
                searchStyleCustomizationsWithHttpInfo(searchStyleCustomizationsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.7.0.cl or later Retrieves style preferences at cluster level or for the
     * authenticated user&#39;s org. Cluster-level preferences serve as defaults for all orgs.
     * Org-level preferences override cluster defaults. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to retrieve
     * cluster-level style defaults. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to
     * retrieve preferences for the authenticated user&#39;s org. - Each field in the response
     * includes an &#x60;is_overridden&#x60; flag indicating whether the value was explicitly set at
     * the requested scope or inherited from a parent scope (cluster or system default).
     *
     * @param searchStyleCustomizationsRequest (required)
     * @return ApiResponse&lt;List&lt;StylePreference&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Style preferences retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<StylePreference>> searchStyleCustomizationsWithHttpInfo(
            SearchStyleCustomizationsRequest searchStyleCustomizationsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchStyleCustomizationsValidateBeforeCall(searchStyleCustomizationsRequest, null);
        Type localVarReturnType = new TypeToken<List<StylePreference>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.7.0.cl or later Retrieves style preferences at cluster level or
     * for the authenticated user&#39;s org. Cluster-level preferences serve as defaults for all
     * orgs. Org-level preferences override cluster defaults. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**)
     * privilege. #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to retrieve
     * cluster-level style defaults. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to
     * retrieve preferences for the authenticated user&#39;s org. - Each field in the response
     * includes an &#x60;is_overridden&#x60; flag indicating whether the value was explicitly set at
     * the requested scope or inherited from a parent scope (cluster or system default).
     *
     * @param searchStyleCustomizationsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Style preferences retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchStyleCustomizationsAsync(
            SearchStyleCustomizationsRequest searchStyleCustomizationsRequest,
            final ApiCallback<List<StylePreference>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchStyleCustomizationsValidateBeforeCall(
                        searchStyleCustomizationsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<StylePreference>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchStyleFonts
     *
     * @param searchStyleFontsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom fonts retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchStyleFontsCall(
            SearchStyleFontsRequest searchStyleFontsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = searchStyleFontsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/styles/fonts/search";

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
    private okhttp3.Call searchStyleFontsValidateBeforeCall(
            SearchStyleFontsRequest searchStyleFontsRequest, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchStyleFontsRequest' is set
        if (searchStyleFontsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchStyleFontsRequest' when calling"
                            + " searchStyleFonts(Async)");
        }

        return searchStyleFontsCall(searchStyleFontsRequest, _callback);
    }

    /**
     * Version: 26.7.0.cl or later Returns custom fonts from the cluster-level or org-level font
     * library. Omitting all filter fields returns all fonts in the target scope. When
     * &#x60;include_font_assignments&#x60; is &#x60;true&#x60;, the response includes only the
     * visualization areas explicitly assigned to each font. For cluster-scoped fonts,
     * &#x60;org&#x60; is returned as &#x60;null&#x60;. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to search the
     * cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to search the
     * authenticated user&#39;s org library. - Use &#x60;font_identifier&#x60; to look up a specific
     * font by UUID or name. - Use &#x60;name_pattern&#x60; for partial, case-insensitive name
     * matching. - Set &#x60;include_font_assignments&#x60; to &#x60;true&#x60; to include
     * visualization areas this font is currently assigned to. Defaults to &#x60;false&#x60;.
     *
     * @param searchStyleFontsRequest (required)
     * @return List&lt;StyleFontRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom fonts retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<StyleFontRecord> searchStyleFonts(SearchStyleFontsRequest searchStyleFontsRequest)
            throws ApiException {
        ApiResponse<List<StyleFontRecord>> localVarResp =
                searchStyleFontsWithHttpInfo(searchStyleFontsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.7.0.cl or later Returns custom fonts from the cluster-level or org-level font
     * library. Omitting all filter fields returns all fonts in the target scope. When
     * &#x60;include_font_assignments&#x60; is &#x60;true&#x60;, the response includes only the
     * visualization areas explicitly assigned to each font. For cluster-scoped fonts,
     * &#x60;org&#x60; is returned as &#x60;null&#x60;. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to search the
     * cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to search the
     * authenticated user&#39;s org library. - Use &#x60;font_identifier&#x60; to look up a specific
     * font by UUID or name. - Use &#x60;name_pattern&#x60; for partial, case-insensitive name
     * matching. - Set &#x60;include_font_assignments&#x60; to &#x60;true&#x60; to include
     * visualization areas this font is currently assigned to. Defaults to &#x60;false&#x60;.
     *
     * @param searchStyleFontsRequest (required)
     * @return ApiResponse&lt;List&lt;StyleFontRecord&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom fonts retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<StyleFontRecord>> searchStyleFontsWithHttpInfo(
            SearchStyleFontsRequest searchStyleFontsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchStyleFontsValidateBeforeCall(searchStyleFontsRequest, null);
        Type localVarReturnType = new TypeToken<List<StyleFontRecord>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.7.0.cl or later Returns custom fonts from the cluster-level or
     * org-level font library. Omitting all filter fields returns all fonts in the target scope.
     * When &#x60;include_font_assignments&#x60; is &#x60;true&#x60;, the response includes only the
     * visualization areas explicitly assigned to each font. For cluster-scoped fonts,
     * &#x60;org&#x60; is returned as &#x60;null&#x60;. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to search the
     * cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to search the
     * authenticated user&#39;s org library. - Use &#x60;font_identifier&#x60; to look up a specific
     * font by UUID or name. - Use &#x60;name_pattern&#x60; for partial, case-insensitive name
     * matching. - Set &#x60;include_font_assignments&#x60; to &#x60;true&#x60; to include
     * visualization areas this font is currently assigned to. Defaults to &#x60;false&#x60;.
     *
     * @param searchStyleFontsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom fonts retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchStyleFontsAsync(
            SearchStyleFontsRequest searchStyleFontsRequest,
            final ApiCallback<List<StyleFontRecord>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchStyleFontsValidateBeforeCall(searchStyleFontsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<StyleFontRecord>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateStyleCustomization
     *
     * @param scope Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for
     *     all orgs. ORG applies to the authenticated user&#39;s org. (required)
     * @param operation Operation to perform. REPLACE (default) applies the provided fields and
     *     leaves omitted fields unchanged. RESET reverts fields listed in reset_options to
     *     defaults. (optional, default to REPLACE)
     * @param resetOptions Fields to reset when operation is RESET. Specify style fields and
     *     visualization areas to revert to defaults. (optional)
     * @param navigationPanel Navigation panel color. Provide theme and, when theme is CUSTOM, also
     *     provide base_color. (optional)
     * @param chartColorPalette Chart color palette. When provided with operation REPLACE, exactly 8
     *     color entries must be specified in colors. (optional)
     * @param embeddedFooterText Custom footer text for the embedded application. An empty string
     *     clears the footer. (optional)
     * @param visualizationFonts Font assignments per visualization area. Provide only the areas to
     *     update; omitted areas remain unchanged. (optional)
     * @param defaultLogo Binary image for the DEFAULT logo slot (square app icon and favicon;
     *     recommended 140x140 px). Accepted formats: PNG, JPG. (optional)
     * @param wideLogo Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended
     *     230x45 px). Accepted formats: PNG, JPG. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Style preferences updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateStyleCustomizationCall(
            String scope,
            String operation,
            StyleResetOptionsInput resetOptions,
            NavigationPanelInput navigationPanel,
            StyleColorPaletteInput chartColorPalette,
            String embeddedFooterText,
            VisualizationFontsInput visualizationFonts,
            File defaultLogo,
            File wideLogo,
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/styles/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (scope != null) {
            localVarFormParams.put("scope", scope);
        }

        if (operation != null) {
            localVarFormParams.put("operation", operation);
        }

        if (resetOptions != null) {
            localVarFormParams.put("reset_options", resetOptions);
        }

        if (navigationPanel != null) {
            localVarFormParams.put("navigation_panel", navigationPanel);
        }

        if (chartColorPalette != null) {
            localVarFormParams.put("chart_color_palette", chartColorPalette);
        }

        if (embeddedFooterText != null) {
            localVarFormParams.put("embedded_footer_text", embeddedFooterText);
        }

        if (visualizationFonts != null) {
            localVarFormParams.put("visualization_fonts", visualizationFonts);
        }

        if (defaultLogo != null) {
            localVarFormParams.put("default_logo", defaultLogo);
        }

        if (wideLogo != null) {
            localVarFormParams.put("wide_logo", wideLogo);
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
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
    private okhttp3.Call updateStyleCustomizationValidateBeforeCall(
            String scope,
            String operation,
            StyleResetOptionsInput resetOptions,
            NavigationPanelInput navigationPanel,
            StyleColorPaletteInput chartColorPalette,
            String embeddedFooterText,
            VisualizationFontsInput visualizationFonts,
            File defaultLogo,
            File wideLogo,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException(
                    "Missing the required parameter 'scope' when calling"
                            + " updateStyleCustomization(Async)");
        }

        return updateStyleCustomizationCall(
                scope,
                operation,
                resetOptions,
                navigationPanel,
                chartColorPalette,
                embeddedFooterText,
                visualizationFonts,
                defaultLogo,
                wideLogo,
                _callback);
    }

    /**
     * Version: 26.7.0.cl or later Updates style preferences at cluster level or for the
     * authenticated user&#39;s org, including navigation panel color, chart color palette, embedded
     * footer text, logo, and font assignments per visualization area. Cluster-level preferences
     * serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an
     * Org-level preference falls back to Cluster-level preference, which on reset falls back to
     * system defaults. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. #### Usage guidelines Two
     * operations are supported via the &#x60;operation&#x60; field: - **REPLACE** (default):
     * Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**:
     * Reverts specific fields to defaults. Specify which fields to reset using
     * &#x60;reset_options.style&#x60; (for style fields) and
     * &#x60;reset_options.visualization_areas&#x60; (for font assignments). Fields not listed in
     * &#x60;reset_options&#x60; are not affected. #### Logo upload Logo files are uploaded as
     * binary fields using &#x60;multipart/form-data&#x60;: - &#x60;default_logo&#x60;: Square app
     * icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. -
     * &#x60;wide_logo&#x60;: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted
     * formats: PNG, JPG. To reset a logo to the default, use &#x60;operation: RESET&#x60; with
     * &#x60;reset_options.style&#x60; set to &#x60;DEFAULT_LOGO&#x60; or &#x60;WIDE_LOGO&#x60;.
     * #### Navigation panel color Set &#x60;navigation_panel.theme&#x60; to one of: -
     * &#x60;DARK&#x60;: Default dark theme. - &#x60;TWO_TONE&#x60;: Dual-tone panel style. -
     * &#x60;CUSTOM&#x60;: User-defined color. Provide &#x60;navigation_panel.base_color&#x60; as a
     * 6-digit hex string (e.g. &#x60;#2359B6&#x60;). #### Chart color palette Provide exactly 8
     * color entries in &#x60;chart_color_palette.colors&#x60;. Each entry requires a
     * &#x60;primary&#x60; hex color. If &#x60;secondary&#x60; shades are omitted, the server
     * auto-generates 4 shades from the primary color. #### Font assignments Specify
     * &#x60;visualization_fonts.chart_visualization_fonts&#x60;,
     * &#x60;visualization_fonts.table_visualization_fonts&#x60;, and
     * &#x60;visualization_fonts.advanced_chart_visualization_fonts&#x60; to assign custom fonts to
     * specific visualization areas. Only provide the areas you want to update; omitted areas remain
     * unchanged.
     *
     * @param scope Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for
     *     all orgs. ORG applies to the authenticated user&#39;s org. (required)
     * @param operation Operation to perform. REPLACE (default) applies the provided fields and
     *     leaves omitted fields unchanged. RESET reverts fields listed in reset_options to
     *     defaults. (optional, default to REPLACE)
     * @param resetOptions Fields to reset when operation is RESET. Specify style fields and
     *     visualization areas to revert to defaults. (optional)
     * @param navigationPanel Navigation panel color. Provide theme and, when theme is CUSTOM, also
     *     provide base_color. (optional)
     * @param chartColorPalette Chart color palette. When provided with operation REPLACE, exactly 8
     *     color entries must be specified in colors. (optional)
     * @param embeddedFooterText Custom footer text for the embedded application. An empty string
     *     clears the footer. (optional)
     * @param visualizationFonts Font assignments per visualization area. Provide only the areas to
     *     update; omitted areas remain unchanged. (optional)
     * @param defaultLogo Binary image for the DEFAULT logo slot (square app icon and favicon;
     *     recommended 140x140 px). Accepted formats: PNG, JPG. (optional)
     * @param wideLogo Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended
     *     230x45 px). Accepted formats: PNG, JPG. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Style preferences updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateStyleCustomization(
            String scope,
            String operation,
            StyleResetOptionsInput resetOptions,
            NavigationPanelInput navigationPanel,
            StyleColorPaletteInput chartColorPalette,
            String embeddedFooterText,
            VisualizationFontsInput visualizationFonts,
            File defaultLogo,
            File wideLogo)
            throws ApiException {
        updateStyleCustomizationWithHttpInfo(
                scope,
                operation,
                resetOptions,
                navigationPanel,
                chartColorPalette,
                embeddedFooterText,
                visualizationFonts,
                defaultLogo,
                wideLogo);
    }

    /**
     * Version: 26.7.0.cl or later Updates style preferences at cluster level or for the
     * authenticated user&#39;s org, including navigation panel color, chart color palette, embedded
     * footer text, logo, and font assignments per visualization area. Cluster-level preferences
     * serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an
     * Org-level preference falls back to Cluster-level preference, which on reset falls back to
     * system defaults. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. #### Usage guidelines Two
     * operations are supported via the &#x60;operation&#x60; field: - **REPLACE** (default):
     * Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**:
     * Reverts specific fields to defaults. Specify which fields to reset using
     * &#x60;reset_options.style&#x60; (for style fields) and
     * &#x60;reset_options.visualization_areas&#x60; (for font assignments). Fields not listed in
     * &#x60;reset_options&#x60; are not affected. #### Logo upload Logo files are uploaded as
     * binary fields using &#x60;multipart/form-data&#x60;: - &#x60;default_logo&#x60;: Square app
     * icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. -
     * &#x60;wide_logo&#x60;: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted
     * formats: PNG, JPG. To reset a logo to the default, use &#x60;operation: RESET&#x60; with
     * &#x60;reset_options.style&#x60; set to &#x60;DEFAULT_LOGO&#x60; or &#x60;WIDE_LOGO&#x60;.
     * #### Navigation panel color Set &#x60;navigation_panel.theme&#x60; to one of: -
     * &#x60;DARK&#x60;: Default dark theme. - &#x60;TWO_TONE&#x60;: Dual-tone panel style. -
     * &#x60;CUSTOM&#x60;: User-defined color. Provide &#x60;navigation_panel.base_color&#x60; as a
     * 6-digit hex string (e.g. &#x60;#2359B6&#x60;). #### Chart color palette Provide exactly 8
     * color entries in &#x60;chart_color_palette.colors&#x60;. Each entry requires a
     * &#x60;primary&#x60; hex color. If &#x60;secondary&#x60; shades are omitted, the server
     * auto-generates 4 shades from the primary color. #### Font assignments Specify
     * &#x60;visualization_fonts.chart_visualization_fonts&#x60;,
     * &#x60;visualization_fonts.table_visualization_fonts&#x60;, and
     * &#x60;visualization_fonts.advanced_chart_visualization_fonts&#x60; to assign custom fonts to
     * specific visualization areas. Only provide the areas you want to update; omitted areas remain
     * unchanged.
     *
     * @param scope Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for
     *     all orgs. ORG applies to the authenticated user&#39;s org. (required)
     * @param operation Operation to perform. REPLACE (default) applies the provided fields and
     *     leaves omitted fields unchanged. RESET reverts fields listed in reset_options to
     *     defaults. (optional, default to REPLACE)
     * @param resetOptions Fields to reset when operation is RESET. Specify style fields and
     *     visualization areas to revert to defaults. (optional)
     * @param navigationPanel Navigation panel color. Provide theme and, when theme is CUSTOM, also
     *     provide base_color. (optional)
     * @param chartColorPalette Chart color palette. When provided with operation REPLACE, exactly 8
     *     color entries must be specified in colors. (optional)
     * @param embeddedFooterText Custom footer text for the embedded application. An empty string
     *     clears the footer. (optional)
     * @param visualizationFonts Font assignments per visualization area. Provide only the areas to
     *     update; omitted areas remain unchanged. (optional)
     * @param defaultLogo Binary image for the DEFAULT logo slot (square app icon and favicon;
     *     recommended 140x140 px). Accepted formats: PNG, JPG. (optional)
     * @param wideLogo Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended
     *     230x45 px). Accepted formats: PNG, JPG. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Style preferences updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateStyleCustomizationWithHttpInfo(
            String scope,
            String operation,
            StyleResetOptionsInput resetOptions,
            NavigationPanelInput navigationPanel,
            StyleColorPaletteInput chartColorPalette,
            String embeddedFooterText,
            VisualizationFontsInput visualizationFonts,
            File defaultLogo,
            File wideLogo)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateStyleCustomizationValidateBeforeCall(
                        scope,
                        operation,
                        resetOptions,
                        navigationPanel,
                        chartColorPalette,
                        embeddedFooterText,
                        visualizationFonts,
                        defaultLogo,
                        wideLogo,
                        null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 26.7.0.cl or later Updates style preferences at cluster level or
     * for the authenticated user&#39;s org, including navigation panel color, chart color palette,
     * embedded footer text, logo, and font assignments per visualization area. Cluster-level
     * preferences serve as defaults for all orgs. Org-level preferences override cluster defaults.
     * Resetting an Org-level preference falls back to Cluster-level preference, which on reset
     * falls back to system defaults. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. #### Usage
     * guidelines Two operations are supported via the &#x60;operation&#x60; field: - **REPLACE**
     * (default): Applies the fields provided in the request. Omitted fields remain unchanged. -
     * **RESET**: Reverts specific fields to defaults. Specify which fields to reset using
     * &#x60;reset_options.style&#x60; (for style fields) and
     * &#x60;reset_options.visualization_areas&#x60; (for font assignments). Fields not listed in
     * &#x60;reset_options&#x60; are not affected. #### Logo upload Logo files are uploaded as
     * binary fields using &#x60;multipart/form-data&#x60;: - &#x60;default_logo&#x60;: Square app
     * icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. -
     * &#x60;wide_logo&#x60;: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted
     * formats: PNG, JPG. To reset a logo to the default, use &#x60;operation: RESET&#x60; with
     * &#x60;reset_options.style&#x60; set to &#x60;DEFAULT_LOGO&#x60; or &#x60;WIDE_LOGO&#x60;.
     * #### Navigation panel color Set &#x60;navigation_panel.theme&#x60; to one of: -
     * &#x60;DARK&#x60;: Default dark theme. - &#x60;TWO_TONE&#x60;: Dual-tone panel style. -
     * &#x60;CUSTOM&#x60;: User-defined color. Provide &#x60;navigation_panel.base_color&#x60; as a
     * 6-digit hex string (e.g. &#x60;#2359B6&#x60;). #### Chart color palette Provide exactly 8
     * color entries in &#x60;chart_color_palette.colors&#x60;. Each entry requires a
     * &#x60;primary&#x60; hex color. If &#x60;secondary&#x60; shades are omitted, the server
     * auto-generates 4 shades from the primary color. #### Font assignments Specify
     * &#x60;visualization_fonts.chart_visualization_fonts&#x60;,
     * &#x60;visualization_fonts.table_visualization_fonts&#x60;, and
     * &#x60;visualization_fonts.advanced_chart_visualization_fonts&#x60; to assign custom fonts to
     * specific visualization areas. Only provide the areas you want to update; omitted areas remain
     * unchanged.
     *
     * @param scope Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for
     *     all orgs. ORG applies to the authenticated user&#39;s org. (required)
     * @param operation Operation to perform. REPLACE (default) applies the provided fields and
     *     leaves omitted fields unchanged. RESET reverts fields listed in reset_options to
     *     defaults. (optional, default to REPLACE)
     * @param resetOptions Fields to reset when operation is RESET. Specify style fields and
     *     visualization areas to revert to defaults. (optional)
     * @param navigationPanel Navigation panel color. Provide theme and, when theme is CUSTOM, also
     *     provide base_color. (optional)
     * @param chartColorPalette Chart color palette. When provided with operation REPLACE, exactly 8
     *     color entries must be specified in colors. (optional)
     * @param embeddedFooterText Custom footer text for the embedded application. An empty string
     *     clears the footer. (optional)
     * @param visualizationFonts Font assignments per visualization area. Provide only the areas to
     *     update; omitted areas remain unchanged. (optional)
     * @param defaultLogo Binary image for the DEFAULT logo slot (square app icon and favicon;
     *     recommended 140x140 px). Accepted formats: PNG, JPG. (optional)
     * @param wideLogo Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended
     *     230x45 px). Accepted formats: PNG, JPG. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Style preferences updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateStyleCustomizationAsync(
            String scope,
            String operation,
            StyleResetOptionsInput resetOptions,
            NavigationPanelInput navigationPanel,
            StyleColorPaletteInput chartColorPalette,
            String embeddedFooterText,
            VisualizationFontsInput visualizationFonts,
            File defaultLogo,
            File wideLogo,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateStyleCustomizationValidateBeforeCall(
                        scope,
                        operation,
                        resetOptions,
                        navigationPanel,
                        chartColorPalette,
                        embeddedFooterText,
                        visualizationFonts,
                        defaultLogo,
                        wideLogo,
                        _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateStyleFont
     *
     * @param fontIdentifier UUID or name of the font to update. (required)
     * @param updateStyleFontRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Font metadata updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateStyleFontCall(
            String fontIdentifier,
            UpdateStyleFontRequest updateStyleFontRequest,
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

        Object localVarPostBody = updateStyleFontRequest;

        // create path and map variables
        String localVarPath =
                "/api/rest/2.0/customization/styles/fonts/{font_identifier}/update"
                        .replace(
                                "{" + "font_identifier" + "}",
                                localVarApiClient.escapeString(fontIdentifier.toString()));

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
    private okhttp3.Call updateStyleFontValidateBeforeCall(
            String fontIdentifier,
            UpdateStyleFontRequest updateStyleFontRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'fontIdentifier' is set
        if (fontIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'fontIdentifier' when calling"
                            + " updateStyleFont(Async)");
        }

        // verify the required parameter 'updateStyleFontRequest' is set
        if (updateStyleFontRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateStyleFontRequest' when calling"
                            + " updateStyleFont(Async)");
        }

        return updateStyleFontCall(fontIdentifier, updateStyleFontRequest, _callback);
    }

    /**
     * Version: 26.7.0.cl or later Updates the metadata of an existing custom font in the
     * cluster-level or org-level font library. Only the fields provided in the request are
     * modified; omitted fields remain unchanged. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Identify the font using &#x60;font_identifier&#x60; (UUID or name). -
     * Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to target the cluster-level library. Set
     * &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to target the authenticated user&#39;s org
     * library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and
     * re-upload using &#x60;uploadStyleFont&#x60;. - &#x60;color&#x60; must be a valid 6-digit hex
     * string (e.g. &#x60;#333333&#x60;) if provided.
     *
     * @param fontIdentifier UUID or name of the font to update. (required)
     * @param updateStyleFontRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Font metadata updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     * </table>
     */
    public void updateStyleFont(
            String fontIdentifier, UpdateStyleFontRequest updateStyleFontRequest)
            throws ApiException {
        updateStyleFontWithHttpInfo(fontIdentifier, updateStyleFontRequest);
    }

    /**
     * Version: 26.7.0.cl or later Updates the metadata of an existing custom font in the
     * cluster-level or org-level font library. Only the fields provided in the request are
     * modified; omitted fields remain unchanged. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Identify the font using &#x60;font_identifier&#x60; (UUID or name). -
     * Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to target the cluster-level library. Set
     * &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to target the authenticated user&#39;s org
     * library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and
     * re-upload using &#x60;uploadStyleFont&#x60;. - &#x60;color&#x60; must be a valid 6-digit hex
     * string (e.g. &#x60;#333333&#x60;) if provided.
     *
     * @param fontIdentifier UUID or name of the font to update. (required)
     * @param updateStyleFontRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Font metadata updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateStyleFontWithHttpInfo(
            String fontIdentifier, UpdateStyleFontRequest updateStyleFontRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateStyleFontValidateBeforeCall(fontIdentifier, updateStyleFontRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 26.7.0.cl or later Updates the metadata of an existing custom font
     * in the cluster-level or org-level font library. Only the fields provided in the request are
     * modified; omitted fields remain unchanged. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Identify the font using &#x60;font_identifier&#x60; (UUID or name). -
     * Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to target the cluster-level library. Set
     * &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to target the authenticated user&#39;s org
     * library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and
     * re-upload using &#x60;uploadStyleFont&#x60;. - &#x60;color&#x60; must be a valid 6-digit hex
     * string (e.g. &#x60;#333333&#x60;) if provided.
     *
     * @param fontIdentifier UUID or name of the font to update. (required)
     * @param updateStyleFontRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Font metadata updated successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateStyleFontAsync(
            String fontIdentifier,
            UpdateStyleFontRequest updateStyleFontRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateStyleFontValidateBeforeCall(
                        fontIdentifier, updateStyleFontRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadStyleFont
     *
     * @param name Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). (required)
     * @param fileContent Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are
     *     accepted; TTF and OTF are rejected. The file is validated on upload. (required)
     * @param scope Scope of the font library to upload to. CLUSTER uploads to the cluster-level
     *     library, making the font available as a default for all orgs. ORG uploads to the
     *     authenticated user&#39;s org library. Defaults to ORG if omitted. (optional, default to
     *     ORG)
     * @param weight Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param style Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param color Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;).
     *     Defaults to #000000 (black) if omitted. Returns an error if the value is malformed.
     *     (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font uploaded successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call uploadStyleFontCall(
            String name,
            File fileContent,
            String scope,
            String weight,
            String style,
            String color,
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/styles/fonts/upload";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (scope != null) {
            localVarFormParams.put("scope", scope);
        }

        if (name != null) {
            localVarFormParams.put("name", name);
        }

        if (weight != null) {
            localVarFormParams.put("weight", weight);
        }

        if (style != null) {
            localVarFormParams.put("style", style);
        }

        if (color != null) {
            localVarFormParams.put("color", color);
        }

        if (fileContent != null) {
            localVarFormParams.put("file_content", fileContent);
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
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
    private okhttp3.Call uploadStyleFontValidateBeforeCall(
            String name,
            File fileContent,
            String scope,
            String weight,
            String style,
            String color,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException(
                    "Missing the required parameter 'name' when calling uploadStyleFont(Async)");
        }

        // verify the required parameter 'fileContent' is set
        if (fileContent == null) {
            throw new ApiException(
                    "Missing the required parameter 'fileContent' when calling"
                            + " uploadStyleFont(Async)");
        }

        return uploadStyleFontCall(name, fileContent, scope, weight, style, color, _callback);
    }

    /**
     * Version: 26.7.0.cl or later Uploads a custom font to the cluster-level or org-level font
     * library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only
     * available within that org. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. #### Usage
     * guidelines - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are
     * rejected with an error. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload to the
     * cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to upload to the
     * authenticated user&#39;s org library. - &#x60;weight&#x60; defaults to &#x60;NORMAL&#x60; if
     * omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;LIGHT&#x60;, &#x60;BOLD&#x60;. -
     * &#x60;style&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values:
     * &#x60;NORMAL&#x60;, &#x60;ITALIC&#x60;, &#x60;OBLIQUE&#x60;. - &#x60;color&#x60; defaults to
     * &#x60;#000000&#x60; (black) if omitted. Provide as a 6-digit hex string (e.g.
     * &#x60;#333333&#x60;). - The uploaded font can be assigned to visualization areas using the
     * &#x60;updateStyleCustomization&#x60; endpoint.
     *
     * @param name Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). (required)
     * @param fileContent Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are
     *     accepted; TTF and OTF are rejected. The file is validated on upload. (required)
     * @param scope Scope of the font library to upload to. CLUSTER uploads to the cluster-level
     *     library, making the font available as a default for all orgs. ORG uploads to the
     *     authenticated user&#39;s org library. Defaults to ORG if omitted. (optional, default to
     *     ORG)
     * @param weight Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param style Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param color Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;).
     *     Defaults to #000000 (black) if omitted. Returns an error if the value is malformed.
     *     (optional)
     * @return StyleFontUploadData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font uploaded successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public StyleFontUploadData uploadStyleFont(
            String name, File fileContent, String scope, String weight, String style, String color)
            throws ApiException {
        ApiResponse<StyleFontUploadData> localVarResp =
                uploadStyleFontWithHttpInfo(name, fileContent, scope, weight, style, color);
        return localVarResp.getData();
    }

    /**
     * Version: 26.7.0.cl or later Uploads a custom font to the cluster-level or org-level font
     * library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only
     * available within that org. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. #### Usage
     * guidelines - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are
     * rejected with an error. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload to the
     * cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to upload to the
     * authenticated user&#39;s org library. - &#x60;weight&#x60; defaults to &#x60;NORMAL&#x60; if
     * omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;LIGHT&#x60;, &#x60;BOLD&#x60;. -
     * &#x60;style&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values:
     * &#x60;NORMAL&#x60;, &#x60;ITALIC&#x60;, &#x60;OBLIQUE&#x60;. - &#x60;color&#x60; defaults to
     * &#x60;#000000&#x60; (black) if omitted. Provide as a 6-digit hex string (e.g.
     * &#x60;#333333&#x60;). - The uploaded font can be assigned to visualization areas using the
     * &#x60;updateStyleCustomization&#x60; endpoint.
     *
     * @param name Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). (required)
     * @param fileContent Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are
     *     accepted; TTF and OTF are rejected. The file is validated on upload. (required)
     * @param scope Scope of the font library to upload to. CLUSTER uploads to the cluster-level
     *     library, making the font available as a default for all orgs. ORG uploads to the
     *     authenticated user&#39;s org library. Defaults to ORG if omitted. (optional, default to
     *     ORG)
     * @param weight Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param style Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param color Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;).
     *     Defaults to #000000 (black) if omitted. Returns an error if the value is malformed.
     *     (optional)
     * @return ApiResponse&lt;StyleFontUploadData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font uploaded successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<StyleFontUploadData> uploadStyleFontWithHttpInfo(
            String name, File fileContent, String scope, String weight, String style, String color)
            throws ApiException {
        okhttp3.Call localVarCall =
                uploadStyleFontValidateBeforeCall(
                        name, fileContent, scope, weight, style, color, null);
        Type localVarReturnType = new TypeToken<StyleFontUploadData>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.7.0.cl or later Uploads a custom font to the cluster-level or
     * org-level font library. Cluster-level fonts are available as defaults for all orgs. Org-level
     * fonts are only available within that org. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * #### Usage guidelines - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF
     * files are rejected with an error. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload to
     * the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to upload to
     * the authenticated user&#39;s org library. - &#x60;weight&#x60; defaults to &#x60;NORMAL&#x60;
     * if omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;LIGHT&#x60;, &#x60;BOLD&#x60;. -
     * &#x60;style&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values:
     * &#x60;NORMAL&#x60;, &#x60;ITALIC&#x60;, &#x60;OBLIQUE&#x60;. - &#x60;color&#x60; defaults to
     * &#x60;#000000&#x60; (black) if omitted. Provide as a 6-digit hex string (e.g.
     * &#x60;#333333&#x60;). - The uploaded font can be assigned to visualization areas using the
     * &#x60;updateStyleCustomization&#x60; endpoint.
     *
     * @param name Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). (required)
     * @param fileContent Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are
     *     accepted; TTF and OTF are rejected. The file is validated on upload. (required)
     * @param scope Scope of the font library to upload to. CLUSTER uploads to the cluster-level
     *     library, making the font available as a default for all orgs. ORG uploads to the
     *     authenticated user&#39;s org library. Defaults to ORG if omitted. (optional, default to
     *     ORG)
     * @param weight Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param style Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL
     *     if omitted. (optional, default to NORMAL)
     * @param color Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;).
     *     Defaults to #000000 (black) if omitted. Returns an error if the value is malformed.
     *     (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Font uploaded successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call uploadStyleFontAsync(
            String name,
            File fileContent,
            String scope,
            String weight,
            String style,
            String color,
            final ApiCallback<StyleFontUploadData> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                uploadStyleFontValidateBeforeCall(
                        name, fileContent, scope, weight, style, color, _callback);
        Type localVarReturnType = new TypeToken<StyleFontUploadData>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
