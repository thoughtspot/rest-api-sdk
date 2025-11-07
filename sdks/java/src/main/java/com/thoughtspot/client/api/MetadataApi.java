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


import com.thoughtspot.client.model.ConvertWorksheetToModelRequest;
import com.thoughtspot.client.model.CopyObjectRequest;
import com.thoughtspot.client.model.DeleteMetadataRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.ExportMetadataTMLBatchedRequest;
import com.thoughtspot.client.model.ExportMetadataTMLRequest;
import com.thoughtspot.client.model.FetchAnswerSqlQueryRequest;
import com.thoughtspot.client.model.FetchAsyncImportTaskStatusRequest;
import com.thoughtspot.client.model.FetchLiveboardSqlQueryRequest;
import com.thoughtspot.client.model.GetAsyncImportStatusResponse;
import com.thoughtspot.client.model.ImportEPackAsyncTaskStatus;
import com.thoughtspot.client.model.ImportMetadataTMLAsyncRequest;
import com.thoughtspot.client.model.ImportMetadataTMLRequest;
import com.thoughtspot.client.model.MetadataSearchResponse;
import com.thoughtspot.client.model.ParameterizeMetadataRequest;
import com.thoughtspot.client.model.ResponseCopyObject;
import com.thoughtspot.client.model.ResponseWorksheetToModelConversion;
import com.thoughtspot.client.model.SearchMetadataRequest;
import com.thoughtspot.client.model.SqlQueryResponse;
import com.thoughtspot.client.model.UnparameterizeMetadataRequest;
import com.thoughtspot.client.model.UpdateMetadataHeaderRequest;
import com.thoughtspot.client.model.UpdateMetadataObjIdRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class MetadataApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetadataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetadataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public MetadataApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for convertWorksheetToModel
     * @param convertWorksheetToModelRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Conversion of worksheets to model done successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call convertWorksheetToModelCall(ConvertWorksheetToModelRequest convertWorksheetToModelRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = convertWorksheetToModelRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/worksheets/convert";

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
    private okhttp3.Call convertWorksheetToModelValidateBeforeCall(ConvertWorksheetToModelRequest convertWorksheetToModelRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'convertWorksheetToModelRequest' is set
        if (convertWorksheetToModelRequest == null) {
            throw new ApiException("Missing the required parameter 'convertWorksheetToModelRequest' when calling convertWorksheetToModel(Async)");
        }

        return convertWorksheetToModelCall(convertWorksheetToModelRequest, _callback);

    }

    /**
     * 
     *  Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when &#x60;convert_all&#x60; is set to &#x60;false&#x60;.        - Leave empty or omit when &#x60;convert_all&#x60; is set to &#x60;true&#x60;.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when &#x60;convert_all&#x60; is set to &#x60;true&#x60; and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - &#x60;true&#x60;: Converts all Worksheets in the system, except those specified in &#x60;exclude_worksheet_ids&#x60;.        - &#x60;false&#x60;: Converts only the Worksheets listed in &#x60;worksheet_ids&#x60;.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - &#x60;true&#x60;: Applies conversion changes directly to ThoughtSpot.      - &#x60;false&#x60;: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting &#x60;convert_all&#x60; to &#x60;false&#x60; and specifying a small number of &#x60;worksheet_ids&#x60;.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use &#x60;apply_changes: false&#x60; to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [\&quot;guid1\&quot;, \&quot;guid2\&quot;, \&quot;guid3\&quot;],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: false,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Convert All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Exclude Specific Worksheets While Converting All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [\&quot;abc\&quot;],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;     
     * @param convertWorksheetToModelRequest  (required)
     * @return ResponseWorksheetToModelConversion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Conversion of worksheets to model done successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ResponseWorksheetToModelConversion convertWorksheetToModel(ConvertWorksheetToModelRequest convertWorksheetToModelRequest) throws ApiException {
        ApiResponse<ResponseWorksheetToModelConversion> localVarResp = convertWorksheetToModelWithHttpInfo(convertWorksheetToModelRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when &#x60;convert_all&#x60; is set to &#x60;false&#x60;.        - Leave empty or omit when &#x60;convert_all&#x60; is set to &#x60;true&#x60;.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when &#x60;convert_all&#x60; is set to &#x60;true&#x60; and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - &#x60;true&#x60;: Converts all Worksheets in the system, except those specified in &#x60;exclude_worksheet_ids&#x60;.        - &#x60;false&#x60;: Converts only the Worksheets listed in &#x60;worksheet_ids&#x60;.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - &#x60;true&#x60;: Applies conversion changes directly to ThoughtSpot.      - &#x60;false&#x60;: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting &#x60;convert_all&#x60; to &#x60;false&#x60; and specifying a small number of &#x60;worksheet_ids&#x60;.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use &#x60;apply_changes: false&#x60; to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [\&quot;guid1\&quot;, \&quot;guid2\&quot;, \&quot;guid3\&quot;],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: false,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Convert All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Exclude Specific Worksheets While Converting All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [\&quot;abc\&quot;],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;     
     * @param convertWorksheetToModelRequest  (required)
     * @return ApiResponse&lt;ResponseWorksheetToModelConversion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Conversion of worksheets to model done successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResponseWorksheetToModelConversion> convertWorksheetToModelWithHttpInfo(ConvertWorksheetToModelRequest convertWorksheetToModelRequest) throws ApiException {
        okhttp3.Call localVarCall = convertWorksheetToModelValidateBeforeCall(convertWorksheetToModelRequest, null);
        Type localVarReturnType = new TypeToken<ResponseWorksheetToModelConversion>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when &#x60;convert_all&#x60; is set to &#x60;false&#x60;.        - Leave empty or omit when &#x60;convert_all&#x60; is set to &#x60;true&#x60;.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when &#x60;convert_all&#x60; is set to &#x60;true&#x60; and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - &#x60;true&#x60;: Converts all Worksheets in the system, except those specified in &#x60;exclude_worksheet_ids&#x60;.        - &#x60;false&#x60;: Converts only the Worksheets listed in &#x60;worksheet_ids&#x60;.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - &#x60;true&#x60;: Applies conversion changes directly to ThoughtSpot.      - &#x60;false&#x60;: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting &#x60;convert_all&#x60; to &#x60;false&#x60; and specifying a small number of &#x60;worksheet_ids&#x60;.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use &#x60;apply_changes: false&#x60; to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [\&quot;guid1\&quot;, \&quot;guid2\&quot;, \&quot;guid3\&quot;],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: false,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Convert All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Exclude Specific Worksheets While Converting All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [\&quot;abc\&quot;],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;     
     * @param convertWorksheetToModelRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Conversion of worksheets to model done successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call convertWorksheetToModelAsync(ConvertWorksheetToModelRequest convertWorksheetToModelRequest, final ApiCallback<ResponseWorksheetToModelConversion> _callback) throws ApiException {

        okhttp3.Call localVarCall = convertWorksheetToModelValidateBeforeCall(convertWorksheetToModelRequest, _callback);
        Type localVarReturnType = new TypeToken<ResponseWorksheetToModelConversion>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for copyObject
     * @param copyObjectRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a copy of the object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Object not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call copyObjectCall(CopyObjectRequest copyObjectRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = copyObjectRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/copyobject";

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
    private okhttp3.Call copyObjectValidateBeforeCall(CopyObjectRequest copyObjectRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'copyObjectRequest' is set
        if (copyObjectRequest == null) {
            throw new ApiException("Missing the required parameter 'copyObjectRequest' when calling copyObject(Async)");
        }

        return copyObjectCall(copyObjectRequest, _callback);

    }

    /**
     * 
     *  Makes a copy of an Answer or Liveboard    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      
     * @param copyObjectRequest  (required)
     * @return ResponseCopyObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a copy of the object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Object not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ResponseCopyObject copyObject(CopyObjectRequest copyObjectRequest) throws ApiException {
        ApiResponse<ResponseCopyObject> localVarResp = copyObjectWithHttpInfo(copyObjectRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Makes a copy of an Answer or Liveboard    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      
     * @param copyObjectRequest  (required)
     * @return ApiResponse&lt;ResponseCopyObject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a copy of the object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Object not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResponseCopyObject> copyObjectWithHttpInfo(CopyObjectRequest copyObjectRequest) throws ApiException {
        okhttp3.Call localVarCall = copyObjectValidateBeforeCall(copyObjectRequest, null);
        Type localVarReturnType = new TypeToken<ResponseCopyObject>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Makes a copy of an Answer or Liveboard    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      
     * @param copyObjectRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a copy of the object </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Object not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call copyObjectAsync(CopyObjectRequest copyObjectRequest, final ApiCallback<ResponseCopyObject> _callback) throws ApiException {

        okhttp3.Call localVarCall = copyObjectValidateBeforeCall(copyObjectRequest, _callback);
        Type localVarReturnType = new TypeToken<ResponseCopyObject>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteMetadata
     * @param deleteMetadataRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Metadata objects successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMetadataCall(DeleteMetadataRequest deleteMetadataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = deleteMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/delete";

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
    private okhttp3.Call deleteMetadataValidateBeforeCall(DeleteMetadataRequest deleteMetadataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'deleteMetadataRequest' is set
        if (deleteMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteMetadataRequest' when calling deleteMetadata(Async)");
        }

        return deleteMetadataCall(deleteMetadataRequest, _callback);

    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       
     * @param deleteMetadataRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Metadata objects successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void deleteMetadata(DeleteMetadataRequest deleteMetadataRequest) throws ApiException {
        deleteMetadataWithHttpInfo(deleteMetadataRequest);
    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       
     * @param deleteMetadataRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Metadata objects successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteMetadataWithHttpInfo(DeleteMetadataRequest deleteMetadataRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteMetadataValidateBeforeCall(deleteMetadataRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       
     * @param deleteMetadataRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Metadata objects successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMetadataAsync(DeleteMetadataRequest deleteMetadataRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteMetadataValidateBeforeCall(deleteMetadataRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportMetadataTML
     * @param exportMetadataTMLRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportMetadataTMLCall(ExportMetadataTMLRequest exportMetadataTMLRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = exportMetadataTMLRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/tml/export";

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
    private okhttp3.Call exportMetadataTMLValidateBeforeCall(ExportMetadataTMLRequest exportMetadataTMLRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'exportMetadataTMLRequest' is set
        if (exportMetadataTMLRequest == null) {
            throw new ApiException("Missing the required parameter 'exportMetadataTMLRequest' when calling exportMetadataTML(Async)");
        }

        return exportMetadataTMLCall(exportMetadataTMLRequest, _callback);

    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the &#x60;metadata&#x60; array. * When exporting TML content for a Liveboard or Answer object, you can set &#x60;export_associated&#x60; to &#x60;true&#x60; to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   &#x60;export_associated&#x60; is set to &#x60;true&#x60;, consider retrieving one metadata object at a time. * Set &#x60;export_fqns&#x60; to &#x60;true&#x60; to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as &#x60;identifier&#x60;, and set the &#x60;type&#x60; as &#x60;FEEDBACK&#x60; in the &#x60;metadata&#x60; array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as &#x60;identifier&#x60;, set the &#x60;type&#x60; as &#x60;LOGIAL_TABLE&#x60; in the &#x60;metadata&#x60; array, and set &#x60;export_with_associated_feedbacks&#x60; in &#x60;export_options&#x60; to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     
     * @param exportMetadataTMLRequest  (required)
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<Object> exportMetadataTML(ExportMetadataTMLRequest exportMetadataTMLRequest) throws ApiException {
        ApiResponse<List<Object>> localVarResp = exportMetadataTMLWithHttpInfo(exportMetadataTMLRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the &#x60;metadata&#x60; array. * When exporting TML content for a Liveboard or Answer object, you can set &#x60;export_associated&#x60; to &#x60;true&#x60; to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   &#x60;export_associated&#x60; is set to &#x60;true&#x60;, consider retrieving one metadata object at a time. * Set &#x60;export_fqns&#x60; to &#x60;true&#x60; to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as &#x60;identifier&#x60;, and set the &#x60;type&#x60; as &#x60;FEEDBACK&#x60; in the &#x60;metadata&#x60; array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as &#x60;identifier&#x60;, set the &#x60;type&#x60; as &#x60;LOGIAL_TABLE&#x60; in the &#x60;metadata&#x60; array, and set &#x60;export_with_associated_feedbacks&#x60; in &#x60;export_options&#x60; to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     
     * @param exportMetadataTMLRequest  (required)
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Object>> exportMetadataTMLWithHttpInfo(ExportMetadataTMLRequest exportMetadataTMLRequest) throws ApiException {
        okhttp3.Call localVarCall = exportMetadataTMLValidateBeforeCall(exportMetadataTMLRequest, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the &#x60;metadata&#x60; array. * When exporting TML content for a Liveboard or Answer object, you can set &#x60;export_associated&#x60; to &#x60;true&#x60; to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   &#x60;export_associated&#x60; is set to &#x60;true&#x60;, consider retrieving one metadata object at a time. * Set &#x60;export_fqns&#x60; to &#x60;true&#x60; to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as &#x60;identifier&#x60;, and set the &#x60;type&#x60; as &#x60;FEEDBACK&#x60; in the &#x60;metadata&#x60; array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as &#x60;identifier&#x60;, set the &#x60;type&#x60; as &#x60;LOGIAL_TABLE&#x60; in the &#x60;metadata&#x60; array, and set &#x60;export_with_associated_feedbacks&#x60; in &#x60;export_options&#x60; to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     
     * @param exportMetadataTMLRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportMetadataTMLAsync(ExportMetadataTMLRequest exportMetadataTMLRequest, final ApiCallback<List<Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportMetadataTMLValidateBeforeCall(exportMetadataTMLRequest, _callback);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportMetadataTMLBatched
     * @param exportMetadataTMLBatchedRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportMetadataTMLBatchedCall(ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = exportMetadataTMLBatchedRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/tml/export/batch";

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
    private okhttp3.Call exportMetadataTMLBatchedValidateBeforeCall(ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'exportMetadataTMLBatchedRequest' is set
        if (exportMetadataTMLBatchedRequest == null) {
            throw new ApiException("Missing the required parameter 'exportMetadataTMLBatchedRequest' when calling exportMetadataTMLBatched(Async)");
        }

        return exportMetadataTMLBatchedCall(exportMetadataTMLBatchedRequest, _callback);

    }

    /**
     * 
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and &#x60;USERMANAGEMENT&#x60; (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for &#x60;USER&#x60;, &#x60;GROUP&#x60;, and &#x60;ROLES&#x60; metadata types.  - &#x60;batch_offset&#x60; Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - &#x60;batch_size&#x60; Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - &#x60;edoc_format&#x60; Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - &#x60;export_dependent&#x60; Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - &#x60;all_orgs_override&#x60; Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      
     * @param exportMetadataTMLBatchedRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Object exportMetadataTMLBatched(ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest) throws ApiException {
        ApiResponse<Object> localVarResp = exportMetadataTMLBatchedWithHttpInfo(exportMetadataTMLBatchedRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and &#x60;USERMANAGEMENT&#x60; (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for &#x60;USER&#x60;, &#x60;GROUP&#x60;, and &#x60;ROLES&#x60; metadata types.  - &#x60;batch_offset&#x60; Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - &#x60;batch_size&#x60; Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - &#x60;edoc_format&#x60; Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - &#x60;export_dependent&#x60; Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - &#x60;all_orgs_override&#x60; Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      
     * @param exportMetadataTMLBatchedRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> exportMetadataTMLBatchedWithHttpInfo(ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest) throws ApiException {
        okhttp3.Call localVarCall = exportMetadataTMLBatchedValidateBeforeCall(exportMetadataTMLBatchedRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and &#x60;USERMANAGEMENT&#x60; (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for &#x60;USER&#x60;, &#x60;GROUP&#x60;, and &#x60;ROLES&#x60; metadata types.  - &#x60;batch_offset&#x60; Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - &#x60;batch_size&#x60; Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - &#x60;edoc_format&#x60; Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - &#x60;export_dependent&#x60; Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - &#x60;all_orgs_override&#x60; Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      
     * @param exportMetadataTMLBatchedRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export TMLs of specified metadata objects is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportMetadataTMLBatchedAsync(ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportMetadataTMLBatchedValidateBeforeCall(exportMetadataTMLBatchedRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchAnswerSqlQuery
     * @param fetchAnswerSqlQueryRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchAnswerSqlQueryCall(FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fetchAnswerSqlQueryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/answer/sql";

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
    private okhttp3.Call fetchAnswerSqlQueryValidateBeforeCall(FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fetchAnswerSqlQueryRequest' is set
        if (fetchAnswerSqlQueryRequest == null) {
            throw new ApiException("Missing the required parameter 'fetchAnswerSqlQueryRequest' when calling fetchAnswerSqlQuery(Async)");
        }

        return fetchAnswerSqlQueryCall(fetchAnswerSqlQueryRequest, _callback);

    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {    \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,    \&quot;metadata_name\&quot;:\&quot;Total sales\&quot;,    \&quot;metadata_type\&quot;:\&quot;ANSWER\&quot;,    \&quot;sql_queries\&quot;:[       {          \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,          \&quot;metadata_name\&quot;:\&quot;Total sales -test\&quot;,          \&quot;sql_query\&quot;:\&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTNAME\\\&quot; \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;STORENAME\\\&quot; \\\&quot;ca_3\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_4\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_5\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_3\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_PRODUCTS\\\&quot; \\\&quot;ta_2\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;PRODUCTID\\\&quot; &#x3D; \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTID\\\&quot;\\nGROUP BY \\n  \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ca_3\\\&quot;\\n\&quot;       }    ] } &#x60;&#x60;&#x60;      
     * @param fetchAnswerSqlQueryRequest  (required)
     * @return SqlQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public SqlQueryResponse fetchAnswerSqlQuery(FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest) throws ApiException {
        ApiResponse<SqlQueryResponse> localVarResp = fetchAnswerSqlQueryWithHttpInfo(fetchAnswerSqlQueryRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {    \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,    \&quot;metadata_name\&quot;:\&quot;Total sales\&quot;,    \&quot;metadata_type\&quot;:\&quot;ANSWER\&quot;,    \&quot;sql_queries\&quot;:[       {          \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,          \&quot;metadata_name\&quot;:\&quot;Total sales -test\&quot;,          \&quot;sql_query\&quot;:\&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTNAME\\\&quot; \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;STORENAME\\\&quot; \\\&quot;ca_3\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_4\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_5\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_3\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_PRODUCTS\\\&quot; \\\&quot;ta_2\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;PRODUCTID\\\&quot; &#x3D; \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTID\\\&quot;\\nGROUP BY \\n  \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ca_3\\\&quot;\\n\&quot;       }    ] } &#x60;&#x60;&#x60;      
     * @param fetchAnswerSqlQueryRequest  (required)
     * @return ApiResponse&lt;SqlQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SqlQueryResponse> fetchAnswerSqlQueryWithHttpInfo(FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest) throws ApiException {
        okhttp3.Call localVarCall = fetchAnswerSqlQueryValidateBeforeCall(fetchAnswerSqlQueryRequest, null);
        Type localVarReturnType = new TypeToken<SqlQueryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {    \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,    \&quot;metadata_name\&quot;:\&quot;Total sales\&quot;,    \&quot;metadata_type\&quot;:\&quot;ANSWER\&quot;,    \&quot;sql_queries\&quot;:[       {          \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,          \&quot;metadata_name\&quot;:\&quot;Total sales -test\&quot;,          \&quot;sql_query\&quot;:\&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTNAME\\\&quot; \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;STORENAME\\\&quot; \\\&quot;ca_3\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_4\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_5\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_3\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_PRODUCTS\\\&quot; \\\&quot;ta_2\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;PRODUCTID\\\&quot; &#x3D; \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTID\\\&quot;\\nGROUP BY \\n  \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ca_3\\\&quot;\\n\&quot;       }    ] } &#x60;&#x60;&#x60;      
     * @param fetchAnswerSqlQueryRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchAnswerSqlQueryAsync(FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest, final ApiCallback<SqlQueryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchAnswerSqlQueryValidateBeforeCall(fetchAnswerSqlQueryRequest, _callback);
        Type localVarReturnType = new TypeToken<SqlQueryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchAsyncImportTaskStatus
     * @param fetchAsyncImportTaskStatusRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task statuses fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchAsyncImportTaskStatusCall(FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fetchAsyncImportTaskStatusRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/tml/async/status";

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
    private okhttp3.Call fetchAsyncImportTaskStatusValidateBeforeCall(FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fetchAsyncImportTaskStatusRequest' is set
        if (fetchAsyncImportTaskStatusRequest == null) {
            throw new ApiException("Missing the required parameter 'fetchAsyncImportTaskStatusRequest' when calling fetchAsyncImportTaskStatus(Async)");
        }

        return fetchAsyncImportTaskStatusCall(fetchAsyncImportTaskStatusRequest, _callback);

    }

    /**
     * 
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     
     * @param fetchAsyncImportTaskStatusRequest  (required)
     * @return GetAsyncImportStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task statuses fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public GetAsyncImportStatusResponse fetchAsyncImportTaskStatus(FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest) throws ApiException {
        ApiResponse<GetAsyncImportStatusResponse> localVarResp = fetchAsyncImportTaskStatusWithHttpInfo(fetchAsyncImportTaskStatusRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     
     * @param fetchAsyncImportTaskStatusRequest  (required)
     * @return ApiResponse&lt;GetAsyncImportStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task statuses fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetAsyncImportStatusResponse> fetchAsyncImportTaskStatusWithHttpInfo(FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest) throws ApiException {
        okhttp3.Call localVarCall = fetchAsyncImportTaskStatusValidateBeforeCall(fetchAsyncImportTaskStatusRequest, null);
        Type localVarReturnType = new TypeToken<GetAsyncImportStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     
     * @param fetchAsyncImportTaskStatusRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task statuses fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchAsyncImportTaskStatusAsync(FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest, final ApiCallback<GetAsyncImportStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchAsyncImportTaskStatusValidateBeforeCall(fetchAsyncImportTaskStatusRequest, _callback);
        Type localVarReturnType = new TypeToken<GetAsyncImportStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchLiveboardSqlQuery
     * @param fetchLiveboardSqlQueryRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchLiveboardSqlQueryCall(FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fetchLiveboardSqlQueryRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/liveboard/sql";

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
    private okhttp3.Call fetchLiveboardSqlQueryValidateBeforeCall(FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fetchLiveboardSqlQueryRequest' is set
        if (fetchLiveboardSqlQueryRequest == null) {
            throw new ApiException("Missing the required parameter 'fetchLiveboardSqlQueryRequest' when calling fetchLiveboardSqlQuery(Async)");
        }

        return fetchLiveboardSqlQueryCall(fetchLiveboardSqlQueryRequest, _callback);

    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {   \&quot;metadata_id\&quot;: \&quot;fa68ae91-7588-4136-bacd-d71fb12dda69\&quot;,   \&quot;metadata_name\&quot;: \&quot;Total Sales\&quot;,   \&quot;metadata_type\&quot;: \&quot;LIVEBOARD\&quot;,   \&quot;sql_queries\&quot;: [     {       \&quot;metadata_id\&quot;: \&quot;b3b6d2b9-089a-490c-8e16-b144650b7843\&quot;,       \&quot;metadata_name\&quot;: \&quot;Total quantity purchased, Total sales by region\&quot;,       \&quot;sql_query\&quot;: \&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_2\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_3\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_2\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_2\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\nGROUP BY \\\&quot;ca_1\\\&quot;\&quot;     }   ] } &#x60;&#x60;&#x60;      
     * @param fetchLiveboardSqlQueryRequest  (required)
     * @return SqlQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public SqlQueryResponse fetchLiveboardSqlQuery(FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest) throws ApiException {
        ApiResponse<SqlQueryResponse> localVarResp = fetchLiveboardSqlQueryWithHttpInfo(fetchLiveboardSqlQueryRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {   \&quot;metadata_id\&quot;: \&quot;fa68ae91-7588-4136-bacd-d71fb12dda69\&quot;,   \&quot;metadata_name\&quot;: \&quot;Total Sales\&quot;,   \&quot;metadata_type\&quot;: \&quot;LIVEBOARD\&quot;,   \&quot;sql_queries\&quot;: [     {       \&quot;metadata_id\&quot;: \&quot;b3b6d2b9-089a-490c-8e16-b144650b7843\&quot;,       \&quot;metadata_name\&quot;: \&quot;Total quantity purchased, Total sales by region\&quot;,       \&quot;sql_query\&quot;: \&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_2\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_3\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_2\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_2\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\nGROUP BY \\\&quot;ca_1\\\&quot;\&quot;     }   ] } &#x60;&#x60;&#x60;      
     * @param fetchLiveboardSqlQueryRequest  (required)
     * @return ApiResponse&lt;SqlQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SqlQueryResponse> fetchLiveboardSqlQueryWithHttpInfo(FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest) throws ApiException {
        okhttp3.Call localVarCall = fetchLiveboardSqlQueryValidateBeforeCall(fetchLiveboardSqlQueryRequest, null);
        Type localVarReturnType = new TypeToken<SqlQueryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {   \&quot;metadata_id\&quot;: \&quot;fa68ae91-7588-4136-bacd-d71fb12dda69\&quot;,   \&quot;metadata_name\&quot;: \&quot;Total Sales\&quot;,   \&quot;metadata_type\&quot;: \&quot;LIVEBOARD\&quot;,   \&quot;sql_queries\&quot;: [     {       \&quot;metadata_id\&quot;: \&quot;b3b6d2b9-089a-490c-8e16-b144650b7843\&quot;,       \&quot;metadata_name\&quot;: \&quot;Total quantity purchased, Total sales by region\&quot;,       \&quot;sql_query\&quot;: \&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_2\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_3\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_2\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_2\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\nGROUP BY \\\&quot;ca_1\\\&quot;\&quot;     }   ] } &#x60;&#x60;&#x60;      
     * @param fetchLiveboardSqlQueryRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Fetching SQL query of specified metadata object is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchLiveboardSqlQueryAsync(FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest, final ApiCallback<SqlQueryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchLiveboardSqlQueryValidateBeforeCall(fetchLiveboardSqlQueryRequest, _callback);
        Type localVarReturnType = new TypeToken<SqlQueryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importMetadataTML
     * @param importMetadataTMLRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Import metadata objects using specified TMLs is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importMetadataTMLCall(ImportMetadataTMLRequest importMetadataTMLRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = importMetadataTMLRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/tml/import";

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
    private okhttp3.Call importMetadataTMLValidateBeforeCall(ImportMetadataTMLRequest importMetadataTMLRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'importMetadataTMLRequest' is set
        if (importMetadataTMLRequest == null) {
            throw new ApiException("Missing the required parameter 'importMetadataTMLRequest' when calling importMetadataTML(Async)");
        }

        return importMetadataTMLCall(importMetadataTMLRequest, _callback);

    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the &#x60;fqn&#x60; property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding &#x60;fqn&#x60; helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      
     * @param importMetadataTMLRequest  (required)
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Import metadata objects using specified TMLs is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<Object> importMetadataTML(ImportMetadataTMLRequest importMetadataTMLRequest) throws ApiException {
        ApiResponse<List<Object>> localVarResp = importMetadataTMLWithHttpInfo(importMetadataTMLRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the &#x60;fqn&#x60; property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding &#x60;fqn&#x60; helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      
     * @param importMetadataTMLRequest  (required)
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Import metadata objects using specified TMLs is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Object>> importMetadataTMLWithHttpInfo(ImportMetadataTMLRequest importMetadataTMLRequest) throws ApiException {
        okhttp3.Call localVarCall = importMetadataTMLValidateBeforeCall(importMetadataTMLRequest, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the &#x60;fqn&#x60; property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding &#x60;fqn&#x60; helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      
     * @param importMetadataTMLRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Import metadata objects using specified TMLs is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importMetadataTMLAsync(ImportMetadataTMLRequest importMetadataTMLRequest, final ApiCallback<List<Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = importMetadataTMLValidateBeforeCall(importMetadataTMLRequest, _callback);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importMetadataTMLAsync
     * @param importMetadataTMLAsyncRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task submitted successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importMetadataTMLAsyncCall(ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = importMetadataTMLAsyncRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/tml/async/import";

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
    private okhttp3.Call importMetadataTMLAsyncValidateBeforeCall(ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'importMetadataTMLAsyncRequest' is set
        if (importMetadataTMLAsyncRequest == null) {
            throw new ApiException("Missing the required parameter 'importMetadataTMLAsyncRequest' when calling importMetadataTMLAsync(Async)");
        }

        return importMetadataTMLAsyncCall(importMetadataTMLAsyncRequest, _callback);

    }

    /**
     * 
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via &#x60;/api/rest/2.0/metadata/tml/async/status&#x60; API endpoint.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      
     * @param importMetadataTMLAsyncRequest  (required)
     * @return ImportEPackAsyncTaskStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task submitted successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ImportEPackAsyncTaskStatus importMetadataTMLAsync(ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest) throws ApiException {
        ApiResponse<ImportEPackAsyncTaskStatus> localVarResp = importMetadataTMLAsyncWithHttpInfo(importMetadataTMLAsyncRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via &#x60;/api/rest/2.0/metadata/tml/async/status&#x60; API endpoint.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      
     * @param importMetadataTMLAsyncRequest  (required)
     * @return ApiResponse&lt;ImportEPackAsyncTaskStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task submitted successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImportEPackAsyncTaskStatus> importMetadataTMLAsyncWithHttpInfo(ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest) throws ApiException {
        okhttp3.Call localVarCall = importMetadataTMLAsyncValidateBeforeCall(importMetadataTMLAsyncRequest, null);
        Type localVarReturnType = new TypeToken<ImportEPackAsyncTaskStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via &#x60;/api/rest/2.0/metadata/tml/async/status&#x60; API endpoint.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      
     * @param importMetadataTMLAsyncRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Async TML Import Task submitted successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importMetadataTMLAsyncAsync(ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest, final ApiCallback<ImportEPackAsyncTaskStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = importMetadataTMLAsyncValidateBeforeCall(importMetadataTMLAsyncRequest, _callback);
        Type localVarReturnType = new TypeToken<ImportEPackAsyncTaskStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for parameterizeMetadata
     * @param parameterizeMetadataRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Parameterize successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parameterizeMetadataCall(ParameterizeMetadataRequest parameterizeMetadataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = parameterizeMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/parameterize";

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
    private okhttp3.Call parameterizeMetadataValidateBeforeCall(ParameterizeMetadataRequest parameterizeMetadataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'parameterizeMetadataRequest' is set
        if (parameterizeMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'parameterizeMetadataRequest' when calling parameterizeMetadata(Async)");
        }

        return parameterizeMetadataCall(parameterizeMetadataRequest, _callback);

    }

    /**
     * 
     *  Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always &#x60;CONNECTION_PROPERTY&#x60;. We use the field_name in this case to specify the exact property of a connection which needs to be parameterized.      
     * @param parameterizeMetadataRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Parameterize successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void parameterizeMetadata(ParameterizeMetadataRequest parameterizeMetadataRequest) throws ApiException {
        parameterizeMetadataWithHttpInfo(parameterizeMetadataRequest);
    }

    /**
     * 
     *  Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always &#x60;CONNECTION_PROPERTY&#x60;. We use the field_name in this case to specify the exact property of a connection which needs to be parameterized.      
     * @param parameterizeMetadataRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Parameterize successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> parameterizeMetadataWithHttpInfo(ParameterizeMetadataRequest parameterizeMetadataRequest) throws ApiException {
        okhttp3.Call localVarCall = parameterizeMetadataValidateBeforeCall(parameterizeMetadataRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always &#x60;CONNECTION_PROPERTY&#x60;. We use the field_name in this case to specify the exact property of a connection which needs to be parameterized.      
     * @param parameterizeMetadataRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Parameterize successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parameterizeMetadataAsync(ParameterizeMetadataRequest parameterizeMetadataRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = parameterizeMetadataValidateBeforeCall(parameterizeMetadataRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchMetadata
     * @param searchMetadataRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Metadata objects search result. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchMetadataCall(SearchMetadataRequest searchMetadataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/search";

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
    private okhttp3.Call searchMetadataValidateBeforeCall(SearchMetadataRequest searchMetadataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchMetadataRequest' is set
        if (searchMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'searchMetadataRequest' when calling searchMetadata(Async)");
        }

        return searchMetadataCall(searchMetadataRequest, _callback);

    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the &#x60;type&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60;. - To filter metadata objects within type &#x60;LOGICAL_TABLE&#x60;, set the &#x60;subtypes&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60; &amp; subtypes as &#x60;[WORKSHEET]&#x60;. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like &#x60;include_auto_created_objects&#x60;, &#x60;include_dependent_objects&#x60;, &#x60;include_headers&#x60;, &#x60;include_incomplete_objects&#x60;, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use &#x60;include_discoverable_objects&#x60; as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the &#x60;liveboard_response_format&#x60; as V2. Default value is V1. - To retrieve only objects that are published, set the &#x60;include_only_published_objects&#x60; as true. Default value is false.  **NOTE**: The following parameters support pagination of metadata records:  - &#x60;tag_identifiers&#x60; - &#x60;type&#x60; - &#x60;subtypes&#x60; - &#x60;created_by_user_identifiers&#x60; - &#x60;modified_by_user_identifiers&#x60; - &#x60;owned_by_user_identifiers&#x60; - &#x60;exclude_objects&#x60; - &#x60;include_auto_created_objects&#x60; - &#x60;favorite_object_options&#x60; - &#x60;include_only_published_objects&#x60; If you are using other parameters to search metadata, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      
     * @param searchMetadataRequest  (required)
     * @return List&lt;MetadataSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Metadata objects search result. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<MetadataSearchResponse> searchMetadata(SearchMetadataRequest searchMetadataRequest) throws ApiException {
        ApiResponse<List<MetadataSearchResponse>> localVarResp = searchMetadataWithHttpInfo(searchMetadataRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the &#x60;type&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60;. - To filter metadata objects within type &#x60;LOGICAL_TABLE&#x60;, set the &#x60;subtypes&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60; &amp; subtypes as &#x60;[WORKSHEET]&#x60;. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like &#x60;include_auto_created_objects&#x60;, &#x60;include_dependent_objects&#x60;, &#x60;include_headers&#x60;, &#x60;include_incomplete_objects&#x60;, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use &#x60;include_discoverable_objects&#x60; as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the &#x60;liveboard_response_format&#x60; as V2. Default value is V1. - To retrieve only objects that are published, set the &#x60;include_only_published_objects&#x60; as true. Default value is false.  **NOTE**: The following parameters support pagination of metadata records:  - &#x60;tag_identifiers&#x60; - &#x60;type&#x60; - &#x60;subtypes&#x60; - &#x60;created_by_user_identifiers&#x60; - &#x60;modified_by_user_identifiers&#x60; - &#x60;owned_by_user_identifiers&#x60; - &#x60;exclude_objects&#x60; - &#x60;include_auto_created_objects&#x60; - &#x60;favorite_object_options&#x60; - &#x60;include_only_published_objects&#x60; If you are using other parameters to search metadata, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      
     * @param searchMetadataRequest  (required)
     * @return ApiResponse&lt;List&lt;MetadataSearchResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Metadata objects search result. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MetadataSearchResponse>> searchMetadataWithHttpInfo(SearchMetadataRequest searchMetadataRequest) throws ApiException {
        okhttp3.Call localVarCall = searchMetadataValidateBeforeCall(searchMetadataRequest, null);
        Type localVarReturnType = new TypeToken<List<MetadataSearchResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the &#x60;type&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60;. - To filter metadata objects within type &#x60;LOGICAL_TABLE&#x60;, set the &#x60;subtypes&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60; &amp; subtypes as &#x60;[WORKSHEET]&#x60;. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like &#x60;include_auto_created_objects&#x60;, &#x60;include_dependent_objects&#x60;, &#x60;include_headers&#x60;, &#x60;include_incomplete_objects&#x60;, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use &#x60;include_discoverable_objects&#x60; as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the &#x60;liveboard_response_format&#x60; as V2. Default value is V1. - To retrieve only objects that are published, set the &#x60;include_only_published_objects&#x60; as true. Default value is false.  **NOTE**: The following parameters support pagination of metadata records:  - &#x60;tag_identifiers&#x60; - &#x60;type&#x60; - &#x60;subtypes&#x60; - &#x60;created_by_user_identifiers&#x60; - &#x60;modified_by_user_identifiers&#x60; - &#x60;owned_by_user_identifiers&#x60; - &#x60;exclude_objects&#x60; - &#x60;include_auto_created_objects&#x60; - &#x60;favorite_object_options&#x60; - &#x60;include_only_published_objects&#x60; If you are using other parameters to search metadata, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      
     * @param searchMetadataRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Metadata objects search result. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchMetadataAsync(SearchMetadataRequest searchMetadataRequest, final ApiCallback<List<MetadataSearchResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchMetadataValidateBeforeCall(searchMetadataRequest, _callback);
        Type localVarReturnType = new TypeToken<List<MetadataSearchResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unparameterizeMetadata
     * @param unparameterizeMetadataRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfuly removed parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unparameterizeMetadataCall(UnparameterizeMetadataRequest unparameterizeMetadataRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = unparameterizeMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/unparameterize";

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
    private okhttp3.Call unparameterizeMetadataValidateBeforeCall(UnparameterizeMetadataRequest unparameterizeMetadataRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'unparameterizeMetadataRequest' is set
        if (unparameterizeMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'unparameterizeMetadataRequest' when calling unparameterizeMetadata(Async)");
        }

        return unparameterizeMetadataCall(unparameterizeMetadataRequest, _callback);

    }

    /**
     * 
     *  Remove parameterization from fields in metadata objects.   Version: 10.9.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always &#x60;CONNECTION_PROPERTY&#x60;. We use the field_name in this case to specify the exact property of a connection which needs to be unparameterized.      
     * @param unparameterizeMetadataRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfuly removed parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void unparameterizeMetadata(UnparameterizeMetadataRequest unparameterizeMetadataRequest) throws ApiException {
        unparameterizeMetadataWithHttpInfo(unparameterizeMetadataRequest);
    }

    /**
     * 
     *  Remove parameterization from fields in metadata objects.   Version: 10.9.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always &#x60;CONNECTION_PROPERTY&#x60;. We use the field_name in this case to specify the exact property of a connection which needs to be unparameterized.      
     * @param unparameterizeMetadataRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfuly removed parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> unparameterizeMetadataWithHttpInfo(UnparameterizeMetadataRequest unparameterizeMetadataRequest) throws ApiException {
        okhttp3.Call localVarCall = unparameterizeMetadataValidateBeforeCall(unparameterizeMetadataRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Remove parameterization from fields in metadata objects.   Version: 10.9.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always &#x60;CONNECTION_PROPERTY&#x60;. We use the field_name in this case to specify the exact property of a connection which needs to be unparameterized.      
     * @param unparameterizeMetadataRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfuly removed parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unparameterizeMetadataAsync(UnparameterizeMetadataRequest unparameterizeMetadataRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unparameterizeMetadataValidateBeforeCall(unparameterizeMetadataRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateMetadataHeader
     * @param updateMetadataHeaderRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMetadataHeaderCall(UpdateMetadataHeaderRequest updateMetadataHeaderRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateMetadataHeaderRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/headers/update";

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
    private okhttp3.Call updateMetadataHeaderValidateBeforeCall(UpdateMetadataHeaderRequest updateMetadataHeaderRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateMetadataHeaderRequest' is set
        if (updateMetadataHeaderRequest == null) {
            throw new ApiException("Missing the required parameter 'updateMetadataHeaderRequest' when calling updateMetadataHeader(Async)");
        }

        return updateMetadataHeaderCall(updateMetadataHeaderRequest, _callback);

    }

    /**
     * 
     *  Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either &#x60;identifier&#x60; or &#x60;obj_identifier&#x60;, but not both. Both fields cannot be empty.       - When &#x60;org_identifier&#x60; is set to &#x60;-1&#x60;, only the &#x60;identifier&#x60; value is accepted; &#x60;obj_identifier&#x60; is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide &#x60;org_guid&#x60; or &#x60;org_name&#x60; to uniquely identify the organization where changes need to be applied. .      - Provide &#x60;-1&#x60; if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the &#x60;obj_identifier&#x60; attribute. Only &#x60;text&#x60; will be allowed in attribute&#39;s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only &#x60;identifier&#x60; is given  &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;obj_identifier\&quot;: \&quot;\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_COLUMN\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgGuid\&quot; } &#x60;&#x60;&#x60;  ### Only &#x60;obj_identifier&#x60; is given &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;obj_identifier\&quot;: \&quot;custom_object_id\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgName\&quot; } &#x60;&#x60;&#x60;  ### Executing update for all org &#x60;-1&#x60; &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;  ### Optional &#x60;type&#x60; is not provided &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;     
     * @param updateMetadataHeaderRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void updateMetadataHeader(UpdateMetadataHeaderRequest updateMetadataHeaderRequest) throws ApiException {
        updateMetadataHeaderWithHttpInfo(updateMetadataHeaderRequest);
    }

    /**
     * 
     *  Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either &#x60;identifier&#x60; or &#x60;obj_identifier&#x60;, but not both. Both fields cannot be empty.       - When &#x60;org_identifier&#x60; is set to &#x60;-1&#x60;, only the &#x60;identifier&#x60; value is accepted; &#x60;obj_identifier&#x60; is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide &#x60;org_guid&#x60; or &#x60;org_name&#x60; to uniquely identify the organization where changes need to be applied. .      - Provide &#x60;-1&#x60; if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the &#x60;obj_identifier&#x60; attribute. Only &#x60;text&#x60; will be allowed in attribute&#39;s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only &#x60;identifier&#x60; is given  &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;obj_identifier\&quot;: \&quot;\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_COLUMN\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgGuid\&quot; } &#x60;&#x60;&#x60;  ### Only &#x60;obj_identifier&#x60; is given &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;obj_identifier\&quot;: \&quot;custom_object_id\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgName\&quot; } &#x60;&#x60;&#x60;  ### Executing update for all org &#x60;-1&#x60; &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;  ### Optional &#x60;type&#x60; is not provided &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;     
     * @param updateMetadataHeaderRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateMetadataHeaderWithHttpInfo(UpdateMetadataHeaderRequest updateMetadataHeaderRequest) throws ApiException {
        okhttp3.Call localVarCall = updateMetadataHeaderValidateBeforeCall(updateMetadataHeaderRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either &#x60;identifier&#x60; or &#x60;obj_identifier&#x60;, but not both. Both fields cannot be empty.       - When &#x60;org_identifier&#x60; is set to &#x60;-1&#x60;, only the &#x60;identifier&#x60; value is accepted; &#x60;obj_identifier&#x60; is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide &#x60;org_guid&#x60; or &#x60;org_name&#x60; to uniquely identify the organization where changes need to be applied. .      - Provide &#x60;-1&#x60; if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the &#x60;obj_identifier&#x60; attribute. Only &#x60;text&#x60; will be allowed in attribute&#39;s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only &#x60;identifier&#x60; is given  &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;obj_identifier\&quot;: \&quot;\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_COLUMN\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgGuid\&quot; } &#x60;&#x60;&#x60;  ### Only &#x60;obj_identifier&#x60; is given &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;obj_identifier\&quot;: \&quot;custom_object_id\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgName\&quot; } &#x60;&#x60;&#x60;  ### Executing update for all org &#x60;-1&#x60; &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;  ### Optional &#x60;type&#x60; is not provided &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;     
     * @param updateMetadataHeaderRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMetadataHeaderAsync(UpdateMetadataHeaderRequest updateMetadataHeaderRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateMetadataHeaderValidateBeforeCall(updateMetadataHeaderRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateMetadataObjId
     * @param updateMetadataObjIdRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMetadataObjIdCall(UpdateMetadataObjIdRequest updateMetadataObjIdRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateMetadataObjIdRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/metadata/update-obj-id";

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
    private okhttp3.Call updateMetadataObjIdValidateBeforeCall(UpdateMetadataObjIdRequest updateMetadataObjIdRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateMetadataObjIdRequest' is set
        if (updateMetadataObjIdRequest == null) {
            throw new ApiException("Missing the required parameter 'updateMetadataObjIdRequest' when calling updateMetadataObjId(Async)");
        }

        return updateMetadataObjIdCall(updateMetadataObjIdRequest, _callback);

    }

    /**
     * 
     *  Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either &#x60;current_obj_id&#x60; alone OR use &#x60;metadata_identifier&#x60; with &#x60;type&#x60; (when needed).       - When using &#x60;metadata_identifier&#x60;, the &#x60;type&#x60; field is required if using a name instead of a GUID.       - The &#x60;new_obj_id&#x60; field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using &#x60;current_obj_id&#x60;, ensure it matches the existing object ID exactly.    - When using &#x60;metadata_identifier&#x60; with a name, ensure the &#x60;type&#x60; is specified correctly.    - Verify that the &#x60;new_obj_id&#x60; follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with GUID &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;01234567-89ab-cdef-0123-456789abcdef\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with name and type &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;My Answer\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Multiple objects update &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id_1\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_1\&quot;     },     {       \&quot;metadata_identifier\&quot;: \&quot;My Worksheet\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_TABLE\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_2\&quot;     }   ] } &#x60;&#x60;&#x60;      
     * @param updateMetadataObjIdRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void updateMetadataObjId(UpdateMetadataObjIdRequest updateMetadataObjIdRequest) throws ApiException {
        updateMetadataObjIdWithHttpInfo(updateMetadataObjIdRequest);
    }

    /**
     * 
     *  Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either &#x60;current_obj_id&#x60; alone OR use &#x60;metadata_identifier&#x60; with &#x60;type&#x60; (when needed).       - When using &#x60;metadata_identifier&#x60;, the &#x60;type&#x60; field is required if using a name instead of a GUID.       - The &#x60;new_obj_id&#x60; field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using &#x60;current_obj_id&#x60;, ensure it matches the existing object ID exactly.    - When using &#x60;metadata_identifier&#x60; with a name, ensure the &#x60;type&#x60; is specified correctly.    - Verify that the &#x60;new_obj_id&#x60; follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with GUID &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;01234567-89ab-cdef-0123-456789abcdef\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with name and type &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;My Answer\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Multiple objects update &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id_1\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_1\&quot;     },     {       \&quot;metadata_identifier\&quot;: \&quot;My Worksheet\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_TABLE\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_2\&quot;     }   ] } &#x60;&#x60;&#x60;      
     * @param updateMetadataObjIdRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateMetadataObjIdWithHttpInfo(UpdateMetadataObjIdRequest updateMetadataObjIdRequest) throws ApiException {
        okhttp3.Call localVarCall = updateMetadataObjIdValidateBeforeCall(updateMetadataObjIdRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either &#x60;current_obj_id&#x60; alone OR use &#x60;metadata_identifier&#x60; with &#x60;type&#x60; (when needed).       - When using &#x60;metadata_identifier&#x60;, the &#x60;type&#x60; field is required if using a name instead of a GUID.       - The &#x60;new_obj_id&#x60; field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using &#x60;current_obj_id&#x60;, ensure it matches the existing object ID exactly.    - When using &#x60;metadata_identifier&#x60; with a name, ensure the &#x60;type&#x60; is specified correctly.    - Verify that the &#x60;new_obj_id&#x60; follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with GUID &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;01234567-89ab-cdef-0123-456789abcdef\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with name and type &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;My Answer\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Multiple objects update &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id_1\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_1\&quot;     },     {       \&quot;metadata_identifier\&quot;: \&quot;My Worksheet\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_TABLE\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_2\&quot;     }   ] } &#x60;&#x60;&#x60;      
     * @param updateMetadataObjIdRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Headers update was successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMetadataObjIdAsync(UpdateMetadataObjIdRequest updateMetadataObjIdRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateMetadataObjIdValidateBeforeCall(updateMetadataObjIdRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
