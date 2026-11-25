/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiCallback;
import com.thoughtspot.client.ApiClient;
import com.thoughtspot.client.ApiClientConfiguration;
import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.ApiResponse;
import com.thoughtspot.client.Configuration;
import com.thoughtspot.client.Pair;
import com.thoughtspot.client.ProgressRequestBody;
import com.thoughtspot.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.thoughtspot.client.model.DeleteManualTranslationsRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.ExportManualTranslationTemplateRequest;
import com.thoughtspot.client.model.ExportManualTranslationsRequest;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ManualTranslationApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ManualTranslationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManualTranslationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ManualTranslationApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for deleteManualTranslations
     * @param deleteManualTranslationsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteManualTranslationsCall(DeleteManualTranslationsRequest deleteManualTranslationsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteManualTranslationsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/localizations/manual-translation/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteManualTranslationsValidateBeforeCall(DeleteManualTranslationsRequest deleteManualTranslationsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'deleteManualTranslationsRequest' is set
        if (deleteManualTranslationsRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteManualTranslationsRequest' when calling deleteManualTranslations(Async)");
        }

        return deleteManualTranslationsCall(deleteManualTranslationsRequest, _callback);

    }

    /**
     * 
     *  Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete translations uploaded in the All-Org context.      
     * @param deleteManualTranslationsRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public void deleteManualTranslations(DeleteManualTranslationsRequest deleteManualTranslationsRequest) throws ApiException {
        deleteManualTranslationsWithHttpInfo(deleteManualTranslationsRequest);
    }

    /**
     * 
     *  Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete translations uploaded in the All-Org context.      
     * @param deleteManualTranslationsRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteManualTranslationsWithHttpInfo(DeleteManualTranslationsRequest deleteManualTranslationsRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteManualTranslationsValidateBeforeCall(deleteManualTranslationsRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete translations uploaded in the All-Org context.      
     * @param deleteManualTranslationsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteManualTranslationsAsync(DeleteManualTranslationsRequest deleteManualTranslationsRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteManualTranslationsValidateBeforeCall(deleteManualTranslationsRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportManualTranslationTemplate
     * @param exportManualTranslationTemplateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation template downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  * X-ThoughtSpot-Excluded-Content-Count - Number of strings left out of the template because the import would reject them. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or a Liveboard was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access, or no access to a Liveboard. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> More than one Liveboard has the given name. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportManualTranslationTemplateCall(ExportManualTranslationTemplateRequest exportManualTranslationTemplateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = exportManualTranslationTemplateRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/localizations/manual-translation/template/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/csv",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call exportManualTranslationTemplateValidateBeforeCall(ExportManualTranslationTemplateRequest exportManualTranslationTemplateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'exportManualTranslationTemplateRequest' is set
        if (exportManualTranslationTemplateRequest == null) {
            throw new ApiException("Missing the required parameter 'exportManualTranslationTemplateRequest' when calling exportManualTranslationTemplate(Async)");
        }

        return exportManualTranslationTemplateCall(exportManualTranslationTemplateRequest, _callback);

    }

    /**
     * 
     *  Export a CSV template of the translatable strings of Liveboards.    Version: 27.1.0.cl or later   Exports a CSV template with the translatable strings of one or more Liveboards. Translate the strings in the template and upload it with the API that imports manual translations.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file has the same columns as the import file: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Each row lists one string in &#x60;content&#x60; and leaves &#x60;locale&#x60; and &#x60;translated-content&#x60; empty. Fill them in, then upload the file with &#x60;POST /api/rest/2.0/localizations/manual-translation/import&#x60;. - The template includes the Liveboard title and description, tab names, the names of the Liveboard&#39;s personalized views, the titles and descriptions of visualizations and groups, and the text of note tiles. - Note tile text is listed the way it is matched when the Liveboard is displayed: each heading, paragraph, list item, table cell, and line is a separate row, and so is each part of a line that has its own formatting or link. Manual translations are applied to a note tile only when every one of its rows is translated. - A string that appears more than once is listed once. - Strings that the import does not accept are left out: text longer than 2000 characters, text that starts with &#x60;&#x3D;&#x60;, &#x60;+&#x60;, &#x60;-&#x60;, &#x60;@&#x60;, a tab, or a carriage return, and text that contains HTML tags, script content, or control characters. The number of strings left out is returned in the &#x60;X-ThoughtSpot-Excluded-Content-Count&#x60; response header. - Specify 1 to 50 Liveboards by GUID or name. Names are resolved in the current Org; if more than one Liveboard has the given name, use its GUID. If a Liveboard is not found or you cannot access it, the request fails and no file is returned.      
     * @param exportManualTranslationTemplateRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation template downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  * X-ThoughtSpot-Excluded-Content-Count - Number of strings left out of the template because the import would reject them. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or a Liveboard was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access, or no access to a Liveboard. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> More than one Liveboard has the given name. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public void exportManualTranslationTemplate(ExportManualTranslationTemplateRequest exportManualTranslationTemplateRequest) throws ApiException {
        exportManualTranslationTemplateWithHttpInfo(exportManualTranslationTemplateRequest);
    }

    /**
     * 
     *  Export a CSV template of the translatable strings of Liveboards.    Version: 27.1.0.cl or later   Exports a CSV template with the translatable strings of one or more Liveboards. Translate the strings in the template and upload it with the API that imports manual translations.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file has the same columns as the import file: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Each row lists one string in &#x60;content&#x60; and leaves &#x60;locale&#x60; and &#x60;translated-content&#x60; empty. Fill them in, then upload the file with &#x60;POST /api/rest/2.0/localizations/manual-translation/import&#x60;. - The template includes the Liveboard title and description, tab names, the names of the Liveboard&#39;s personalized views, the titles and descriptions of visualizations and groups, and the text of note tiles. - Note tile text is listed the way it is matched when the Liveboard is displayed: each heading, paragraph, list item, table cell, and line is a separate row, and so is each part of a line that has its own formatting or link. Manual translations are applied to a note tile only when every one of its rows is translated. - A string that appears more than once is listed once. - Strings that the import does not accept are left out: text longer than 2000 characters, text that starts with &#x60;&#x3D;&#x60;, &#x60;+&#x60;, &#x60;-&#x60;, &#x60;@&#x60;, a tab, or a carriage return, and text that contains HTML tags, script content, or control characters. The number of strings left out is returned in the &#x60;X-ThoughtSpot-Excluded-Content-Count&#x60; response header. - Specify 1 to 50 Liveboards by GUID or name. Names are resolved in the current Org; if more than one Liveboard has the given name, use its GUID. If a Liveboard is not found or you cannot access it, the request fails and no file is returned.      
     * @param exportManualTranslationTemplateRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation template downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  * X-ThoughtSpot-Excluded-Content-Count - Number of strings left out of the template because the import would reject them. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or a Liveboard was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access, or no access to a Liveboard. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> More than one Liveboard has the given name. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> exportManualTranslationTemplateWithHttpInfo(ExportManualTranslationTemplateRequest exportManualTranslationTemplateRequest) throws ApiException {
        okhttp3.Call localVarCall = exportManualTranslationTemplateValidateBeforeCall(exportManualTranslationTemplateRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Export a CSV template of the translatable strings of Liveboards.    Version: 27.1.0.cl or later   Exports a CSV template with the translatable strings of one or more Liveboards. Translate the strings in the template and upload it with the API that imports manual translations.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file has the same columns as the import file: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Each row lists one string in &#x60;content&#x60; and leaves &#x60;locale&#x60; and &#x60;translated-content&#x60; empty. Fill them in, then upload the file with &#x60;POST /api/rest/2.0/localizations/manual-translation/import&#x60;. - The template includes the Liveboard title and description, tab names, the names of the Liveboard&#39;s personalized views, the titles and descriptions of visualizations and groups, and the text of note tiles. - Note tile text is listed the way it is matched when the Liveboard is displayed: each heading, paragraph, list item, table cell, and line is a separate row, and so is each part of a line that has its own formatting or link. Manual translations are applied to a note tile only when every one of its rows is translated. - A string that appears more than once is listed once. - Strings that the import does not accept are left out: text longer than 2000 characters, text that starts with &#x60;&#x3D;&#x60;, &#x60;+&#x60;, &#x60;-&#x60;, &#x60;@&#x60;, a tab, or a carriage return, and text that contains HTML tags, script content, or control characters. The number of strings left out is returned in the &#x60;X-ThoughtSpot-Excluded-Content-Count&#x60; response header. - Specify 1 to 50 Liveboards by GUID or name. Names are resolved in the current Org; if more than one Liveboard has the given name, use its GUID. If a Liveboard is not found or you cannot access it, the request fails and no file is returned.      
     * @param exportManualTranslationTemplateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation template downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  * X-ThoughtSpot-Excluded-Content-Count - Number of strings left out of the template because the import would reject them. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or a Liveboard was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access, or no access to a Liveboard. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> More than one Liveboard has the given name. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportManualTranslationTemplateAsync(ExportManualTranslationTemplateRequest exportManualTranslationTemplateRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportManualTranslationTemplateValidateBeforeCall(exportManualTranslationTemplateRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportManualTranslations
     * @param exportManualTranslationsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> CSV file downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or no translations exist for the requested scope. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportManualTranslationsCall(ExportManualTranslationsRequest exportManualTranslationsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = exportManualTranslationsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/localizations/manual-translation/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call exportManualTranslationsValidateBeforeCall(ExportManualTranslationsRequest exportManualTranslationsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'exportManualTranslationsRequest' is set
        if (exportManualTranslationsRequest == null) {
            throw new ApiException("Missing the required parameter 'exportManualTranslationsRequest' when calling exportManualTranslations(Async)");
        }

        return exportManualTranslationsCall(exportManualTranslationsRequest, _callback);

    }

    /**
     * 
     *  Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to export translations from the All-Org context. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error. - Returns a &#x60;400&#x60; error if no translations exist for the targeted org or cluster scope.      
     * @param exportManualTranslationsRequest  (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> CSV file downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or no translations exist for the requested scope. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public File exportManualTranslations(ExportManualTranslationsRequest exportManualTranslationsRequest) throws ApiException {
        ApiResponse<File> localVarResp = exportManualTranslationsWithHttpInfo(exportManualTranslationsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to export translations from the All-Org context. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error. - Returns a &#x60;400&#x60; error if no translations exist for the targeted org or cluster scope.      
     * @param exportManualTranslationsRequest  (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> CSV file downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or no translations exist for the requested scope. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> exportManualTranslationsWithHttpInfo(ExportManualTranslationsRequest exportManualTranslationsRequest) throws ApiException {
        okhttp3.Call localVarCall = exportManualTranslationsValidateBeforeCall(exportManualTranslationsRequest, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to export translations from the All-Org context. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error. - Returns a &#x60;400&#x60; error if no translations exist for the targeted org or cluster scope.      
     * @param exportManualTranslationsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> CSV file downloaded successfully. </td><td>  * Content-Disposition - Indicates that the response is a file attachment. <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request, or no translations exist for the requested scope. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportManualTranslationsAsync(ExportManualTranslationsRequest exportManualTranslationsRequest, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportManualTranslationsValidateBeforeCall(exportManualTranslationsRequest, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getManualTranslationBundle
     * @param locale Locale code for which to retrieve translations.  For example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation bundle retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No translations found for the requested locale. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getManualTranslationBundleCall(String locale, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/localizations/manual-translation/locales/{locale}/export"
            .replace("{" + "locale" + "}", localVarApiClient.escapeString(locale.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getManualTranslationBundleValidateBeforeCall(String locale, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException("Missing the required parameter 'locale' when calling getManualTranslationBundle(Async)");
        }

        return getManualTranslationBundleCall(locale, _callback);

    }

    /**
     * 
     *  Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - &#x60;locale&#x60; parameter must be a hyphenated locale code, in any case (for example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;). - Returns a JSON object with a &#x60;translations&#x60; map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty &#x60;translations&#x60; map (not an error) if no entries exist at either level.      
     * @param locale Locale code for which to retrieve translations.  For example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation bundle retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No translations found for the requested locale. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public Object getManualTranslationBundle(String locale) throws ApiException {
        ApiResponse<Object> localVarResp = getManualTranslationBundleWithHttpInfo(locale);
        return localVarResp.getData();
    }

    /**
     * 
     *  Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - &#x60;locale&#x60; parameter must be a hyphenated locale code, in any case (for example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;). - Returns a JSON object with a &#x60;translations&#x60; map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty &#x60;translations&#x60; map (not an error) if no entries exist at either level.      
     * @param locale Locale code for which to retrieve translations.  For example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation bundle retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No translations found for the requested locale. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getManualTranslationBundleWithHttpInfo(String locale) throws ApiException {
        okhttp3.Call localVarCall = getManualTranslationBundleValidateBeforeCall(locale, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - &#x60;locale&#x60; parameter must be a hyphenated locale code, in any case (for example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;). - Returns a JSON object with a &#x60;translations&#x60; map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty &#x60;translations&#x60; map (not an error) if no entries exist at either level.      
     * @param locale Locale code for which to retrieve translations.  For example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation bundle retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No translations found for the requested locale. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getManualTranslationBundleAsync(String locale, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getManualTranslationBundleValidateBeforeCall(locale, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importManualTranslations
     * @param translationsFile CSV file containing translations. The file must have three columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Max file size: 30 MB. Max rows: 10,000. (required)
     * @param scope Org scope for the import. &#x60;ORG&#x60; (default) targets the calling user&#39;s current org. &#x60;CLUSTER&#x60; targets the All-Org context. (optional, default to ORG)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully imported manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importManualTranslationsCall(File translationsFile, String scope, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/localizations/manual-translation/import";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (translationsFile != null) {
            localVarFormParams.put("translations_file", translationsFile);
        }

        if (scope != null) {
            localVarFormParams.put("scope", scope);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call importManualTranslationsValidateBeforeCall(File translationsFile, String scope, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'translationsFile' is set
        if (translationsFile == null) {
            throw new ApiException("Missing the required parameter 'translationsFile' when calling importManualTranslations(Async)");
        }

        return importManualTranslationsCall(translationsFile, scope, _callback);

    }

    /**
     * 
     *  Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only &#x60;.csv&#x60; files are accepted. - The import performs an **upsert**: existing entries matched by &#x60;(org_id, locale, content)&#x60; are updated; new entries are inserted. Entries not in the upload are left untouched. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error.      
     * @param translationsFile CSV file containing translations. The file must have three columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Max file size: 30 MB. Max rows: 10,000. (required)
     * @param scope Org scope for the import. &#x60;ORG&#x60; (default) targets the calling user&#39;s current org. &#x60;CLUSTER&#x60; targets the All-Org context. (optional, default to ORG)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully imported manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public void importManualTranslations(File translationsFile, String scope) throws ApiException {
        importManualTranslationsWithHttpInfo(translationsFile, scope);
    }

    /**
     * 
     *  Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only &#x60;.csv&#x60; files are accepted. - The import performs an **upsert**: existing entries matched by &#x60;(org_id, locale, content)&#x60; are updated; new entries are inserted. Entries not in the upload are left untouched. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error.      
     * @param translationsFile CSV file containing translations. The file must have three columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Max file size: 30 MB. Max rows: 10,000. (required)
     * @param scope Org scope for the import. &#x60;ORG&#x60; (default) targets the calling user&#39;s current org. &#x60;CLUSTER&#x60; targets the All-Org context. (optional, default to ORG)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully imported manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> importManualTranslationsWithHttpInfo(File translationsFile, String scope) throws ApiException {
        okhttp3.Call localVarCall = importManualTranslationsValidateBeforeCall(translationsFile, scope, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only &#x60;.csv&#x60; files are accepted. - The import performs an **upsert**: existing entries matched by &#x60;(org_id, locale, content)&#x60; are updated; new entries are inserted. Entries not in the upload are left untouched. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error.      
     * @param translationsFile CSV file containing translations. The file must have three columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Max file size: 30 MB. Max rows: 10,000. (required)
     * @param scope Org scope for the import. &#x60;ORG&#x60; (default) targets the calling user&#39;s current org. &#x60;CLUSTER&#x60; targets the All-Org context. (optional, default to ORG)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully imported manual translations. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importManualTranslationsAsync(File translationsFile, String scope, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = importManualTranslationsValidateBeforeCall(translationsFile, scope, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
