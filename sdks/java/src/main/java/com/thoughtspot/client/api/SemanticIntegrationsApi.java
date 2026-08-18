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
import com.thoughtspot.client.model.CreateSemanticIntegrationRequest;
import com.thoughtspot.client.model.SearchSemanticIntegrationsRequest;
import com.thoughtspot.client.model.SemanticIntegrationResponse;
import com.thoughtspot.client.model.SemanticIntegrationSearchResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SemanticIntegrationsApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SemanticIntegrationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SemanticIntegrationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public SemanticIntegrationsApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createSemanticIntegration
     *
     * @param createSemanticIntegrationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Connection not found. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Duplicate integration name. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createSemanticIntegrationCall(
            CreateSemanticIntegrationRequest createSemanticIntegrationRequest,
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

        Object localVarPostBody = createSemanticIntegrationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/semantic-integrations/create";

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
    private okhttp3.Call createSemanticIntegrationValidateBeforeCall(
            CreateSemanticIntegrationRequest createSemanticIntegrationRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createSemanticIntegrationRequest' is set
        if (createSemanticIntegrationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createSemanticIntegrationRequest' when"
                            + " calling createSemanticIntegration(Async)");
        }

        return createSemanticIntegrationCall(createSemanticIntegrationRequest, _callback);
    }

    /**
     * Version: 26.9.0.cl or later Creates a new semantic integration in ThoughtSpot from a CDW
     * semantic view. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege
     * or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About create semantic integration A semantic integration imports an
     * externally defined semantic view from a Cloud Data Warehouse (CDW) into ThoughtSpot. The API
     * resolves the source semantic view from the specified &#x60;connection_identifier&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, and &#x60;semantic_view_name&#x60;,
     * generates a ThoughtSpot model from it, and returns the model GUID along with a per-formula
     * import report (&#x60;semantic_report&#x60;) summarizing how many formulas were successfully
     * imported, failed, or skipped. - &#x60;connection_identifier&#x60;, &#x60;name&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, &#x60;semantic_view_name&#x60;, and
     * &#x60;type&#x60; are required. - &#x60;name&#x60; must be unique across the user&#39;s
     * organization. The integration&#39;s display name is also used as the generated model name. -
     * Supported &#x60;type&#x60; values are listed in the &#x60;SemanticIntegrationType&#x60; enum.
     * - The response includes a &#x60;semantic_report.summary&#x60; with &#x60;total&#x60;,
     * &#x60;imported&#x60;, &#x60;failed&#x60;, and &#x60;skipped&#x60; counts, and a
     * &#x60;formulas&#x60; array with the per-formula translation details. &gt; **Note:** Creating
     * a semantic integration using a YAML file upload is not supported through the public API.
     *
     * @param createSemanticIntegrationRequest (required)
     * @return SemanticIntegrationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Connection not found. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Duplicate integration name. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public SemanticIntegrationResponse createSemanticIntegration(
            CreateSemanticIntegrationRequest createSemanticIntegrationRequest) throws ApiException {
        ApiResponse<SemanticIntegrationResponse> localVarResp =
                createSemanticIntegrationWithHttpInfo(createSemanticIntegrationRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.9.0.cl or later Creates a new semantic integration in ThoughtSpot from a CDW
     * semantic view. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege
     * or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About create semantic integration A semantic integration imports an
     * externally defined semantic view from a Cloud Data Warehouse (CDW) into ThoughtSpot. The API
     * resolves the source semantic view from the specified &#x60;connection_identifier&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, and &#x60;semantic_view_name&#x60;,
     * generates a ThoughtSpot model from it, and returns the model GUID along with a per-formula
     * import report (&#x60;semantic_report&#x60;) summarizing how many formulas were successfully
     * imported, failed, or skipped. - &#x60;connection_identifier&#x60;, &#x60;name&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, &#x60;semantic_view_name&#x60;, and
     * &#x60;type&#x60; are required. - &#x60;name&#x60; must be unique across the user&#39;s
     * organization. The integration&#39;s display name is also used as the generated model name. -
     * Supported &#x60;type&#x60; values are listed in the &#x60;SemanticIntegrationType&#x60; enum.
     * - The response includes a &#x60;semantic_report.summary&#x60; with &#x60;total&#x60;,
     * &#x60;imported&#x60;, &#x60;failed&#x60;, and &#x60;skipped&#x60; counts, and a
     * &#x60;formulas&#x60; array with the per-formula translation details. &gt; **Note:** Creating
     * a semantic integration using a YAML file upload is not supported through the public API.
     *
     * @param createSemanticIntegrationRequest (required)
     * @return ApiResponse&lt;SemanticIntegrationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Connection not found. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Duplicate integration name. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SemanticIntegrationResponse> createSemanticIntegrationWithHttpInfo(
            CreateSemanticIntegrationRequest createSemanticIntegrationRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createSemanticIntegrationValidateBeforeCall(createSemanticIntegrationRequest, null);
        Type localVarReturnType = new TypeToken<SemanticIntegrationResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.9.0.cl or later Creates a new semantic integration in
     * ThoughtSpot from a CDW semantic view. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About create semantic integration A semantic integration imports an
     * externally defined semantic view from a Cloud Data Warehouse (CDW) into ThoughtSpot. The API
     * resolves the source semantic view from the specified &#x60;connection_identifier&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, and &#x60;semantic_view_name&#x60;,
     * generates a ThoughtSpot model from it, and returns the model GUID along with a per-formula
     * import report (&#x60;semantic_report&#x60;) summarizing how many formulas were successfully
     * imported, failed, or skipped. - &#x60;connection_identifier&#x60;, &#x60;name&#x60;,
     * &#x60;database_name&#x60;, &#x60;schema_name&#x60;, &#x60;semantic_view_name&#x60;, and
     * &#x60;type&#x60; are required. - &#x60;name&#x60; must be unique across the user&#39;s
     * organization. The integration&#39;s display name is also used as the generated model name. -
     * Supported &#x60;type&#x60; values are listed in the &#x60;SemanticIntegrationType&#x60; enum.
     * - The response includes a &#x60;semantic_report.summary&#x60; with &#x60;total&#x60;,
     * &#x60;imported&#x60;, &#x60;failed&#x60;, and &#x60;skipped&#x60; counts, and a
     * &#x60;formulas&#x60; array with the per-formula translation details. &gt; **Note:** Creating
     * a semantic integration using a YAML file upload is not supported through the public API.
     *
     * @param createSemanticIntegrationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration created successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Connection not found. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> Duplicate integration name. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createSemanticIntegrationAsync(
            CreateSemanticIntegrationRequest createSemanticIntegrationRequest,
            final ApiCallback<SemanticIntegrationResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createSemanticIntegrationValidateBeforeCall(
                        createSemanticIntegrationRequest, _callback);
        Type localVarReturnType = new TypeToken<SemanticIntegrationResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSemanticIntegration
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to delete.
     *     (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Semantic integration deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteSemanticIntegrationCall(
            String semanticIntegrationIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/delete"
                        .replace(
                                "{" + "semantic_integration_identifier" + "}",
                                localVarApiClient.escapeString(
                                        semanticIntegrationIdentifier.toString()));

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
    private okhttp3.Call deleteSemanticIntegrationValidateBeforeCall(
            String semanticIntegrationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'semanticIntegrationIdentifier' is set
        if (semanticIntegrationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'semanticIntegrationIdentifier' when calling"
                            + " deleteSemanticIntegration(Async)");
        }

        return deleteSemanticIntegrationCall(semanticIntegrationIdentifier, _callback);
    }

    /**
     * Version: 26.9.0.cl or later Deletes a semantic integration and its associated ThoughtSpot
     * model. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About delete semantic integration Removes the specified semantic
     * integration and its generated ThoughtSpot model from the system. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to delete.
     * - Deletions cannot be undone. Re-import the integration with
     * &#x60;createSemanticIntegration&#x60; if needed.
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to delete.
     *     (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Semantic integration deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteSemanticIntegration(String semanticIntegrationIdentifier)
            throws ApiException {
        deleteSemanticIntegrationWithHttpInfo(semanticIntegrationIdentifier);
    }

    /**
     * Version: 26.9.0.cl or later Deletes a semantic integration and its associated ThoughtSpot
     * model. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About delete semantic integration Removes the specified semantic
     * integration and its generated ThoughtSpot model from the system. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to delete.
     * - Deletions cannot be undone. Re-import the integration with
     * &#x60;createSemanticIntegration&#x60; if needed.
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to delete.
     *     (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Semantic integration deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteSemanticIntegrationWithHttpInfo(
            String semanticIntegrationIdentifier) throws ApiException {
        okhttp3.Call localVarCall =
                deleteSemanticIntegrationValidateBeforeCall(semanticIntegrationIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 26.9.0.cl or later Deletes a semantic integration and its
     * associated ThoughtSpot model. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About delete semantic integration Removes the specified semantic
     * integration and its generated ThoughtSpot model from the system. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to delete.
     * - Deletions cannot be undone. Re-import the integration with
     * &#x60;createSemanticIntegration&#x60; if needed.
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to delete.
     *     (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Semantic integration deleted successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteSemanticIntegrationAsync(
            String semanticIntegrationIdentifier, final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteSemanticIntegrationValidateBeforeCall(
                        semanticIntegrationIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for importSemanticIntegration
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to import updates
     *     for. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration imported successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Semantic integration not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importSemanticIntegrationCall(
            String semanticIntegrationIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/import"
                        .replace(
                                "{" + "semantic_integration_identifier" + "}",
                                localVarApiClient.escapeString(
                                        semanticIntegrationIdentifier.toString()));

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
    private okhttp3.Call importSemanticIntegrationValidateBeforeCall(
            String semanticIntegrationIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'semanticIntegrationIdentifier' is set
        if (semanticIntegrationIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'semanticIntegrationIdentifier' when calling"
                            + " importSemanticIntegration(Async)");
        }

        return importSemanticIntegrationCall(semanticIntegrationIdentifier, _callback);
    }

    /**
     * Version: 26.9.0.cl or later Imports semantic updates for an existing semantic integration
     * from its CDW source and refreshes the associated ThoughtSpot model. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About import semantic integration Re-imports the semantic view from the
     * CDW for the specified integration and rebuilds the corresponding ThoughtSpot model. Use this
     * after the source semantic view has been updated in the CDW (added, removed, or modified
     * formulas, dimensions, or measures) to bring the ThoughtSpot model back in line. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to import
     * updates for. - Import preserves the integration&#39;s GUID, name, and &#x60;model_id&#x60;;
     * only the underlying formula set is refreshed. - The response includes the same
     * &#x60;semantic_report&#x60; as create, with an additional &#x60;change_status&#x60; per
     * formula indicating whether each formula is &#x60;NEW&#x60;, &#x60;UPDATED&#x60;, or
     * &#x60;UNCHANGED&#x60; since the previous import. &gt; **Note:** Importing updates for a
     * semantic integration that was created using the file upload option in the ThoughtSpot UI is
     * not supported. To refresh a file-upload-based integration, use the ThoughtSpot UI.
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to import updates
     *     for. (required)
     * @return SemanticIntegrationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration imported successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Semantic integration not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public SemanticIntegrationResponse importSemanticIntegration(
            String semanticIntegrationIdentifier) throws ApiException {
        ApiResponse<SemanticIntegrationResponse> localVarResp =
                importSemanticIntegrationWithHttpInfo(semanticIntegrationIdentifier);
        return localVarResp.getData();
    }

    /**
     * Version: 26.9.0.cl or later Imports semantic updates for an existing semantic integration
     * from its CDW source and refreshes the associated ThoughtSpot model. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About import semantic integration Re-imports the semantic view from the
     * CDW for the specified integration and rebuilds the corresponding ThoughtSpot model. Use this
     * after the source semantic view has been updated in the CDW (added, removed, or modified
     * formulas, dimensions, or measures) to bring the ThoughtSpot model back in line. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to import
     * updates for. - Import preserves the integration&#39;s GUID, name, and &#x60;model_id&#x60;;
     * only the underlying formula set is refreshed. - The response includes the same
     * &#x60;semantic_report&#x60; as create, with an additional &#x60;change_status&#x60; per
     * formula indicating whether each formula is &#x60;NEW&#x60;, &#x60;UPDATED&#x60;, or
     * &#x60;UNCHANGED&#x60; since the previous import. &gt; **Note:** Importing updates for a
     * semantic integration that was created using the file upload option in the ThoughtSpot UI is
     * not supported. To refresh a file-upload-based integration, use the ThoughtSpot UI.
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to import updates
     *     for. (required)
     * @return ApiResponse&lt;SemanticIntegrationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration imported successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Semantic integration not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SemanticIntegrationResponse> importSemanticIntegrationWithHttpInfo(
            String semanticIntegrationIdentifier) throws ApiException {
        okhttp3.Call localVarCall =
                importSemanticIntegrationValidateBeforeCall(semanticIntegrationIdentifier, null);
        Type localVarReturnType = new TypeToken<SemanticIntegrationResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.9.0.cl or later Imports semantic updates for an existing
     * semantic integration from its CDW source and refreshes the associated ThoughtSpot model.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About import semantic integration Re-imports the semantic view from the
     * CDW for the specified integration and rebuilds the corresponding ThoughtSpot model. Use this
     * after the source semantic view has been updated in the CDW (added, removed, or modified
     * formulas, dimensions, or measures) to bring the ThoughtSpot model back in line. -
     * &#x60;semantic_integration_identifier&#x60; is the GUID or name of the integration to import
     * updates for. - Import preserves the integration&#39;s GUID, name, and &#x60;model_id&#x60;;
     * only the underlying formula set is refreshed. - The response includes the same
     * &#x60;semantic_report&#x60; as create, with an additional &#x60;change_status&#x60; per
     * formula indicating whether each formula is &#x60;NEW&#x60;, &#x60;UPDATED&#x60;, or
     * &#x60;UNCHANGED&#x60; since the previous import. &gt; **Note:** Importing updates for a
     * semantic integration that was created using the file upload option in the ThoughtSpot UI is
     * not supported. To refresh a file-upload-based integration, use the ThoughtSpot UI.
     *
     * @param semanticIntegrationIdentifier ID or name of the semantic integration to import updates
     *     for. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integration imported successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Semantic integration not found. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call importSemanticIntegrationAsync(
            String semanticIntegrationIdentifier,
            final ApiCallback<SemanticIntegrationResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                importSemanticIntegrationValidateBeforeCall(
                        semanticIntegrationIdentifier, _callback);
        Type localVarReturnType = new TypeToken<SemanticIntegrationResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchSemanticIntegrations
     *
     * @param searchSemanticIntegrationsRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integrations retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchSemanticIntegrationsCall(
            SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest,
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

        Object localVarPostBody = searchSemanticIntegrationsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/semantic-integrations/search";

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
    private okhttp3.Call searchSemanticIntegrationsValidateBeforeCall(
            SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchSemanticIntegrationsRequest' is set
        if (searchSemanticIntegrationsRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchSemanticIntegrationsRequest' when"
                            + " calling searchSemanticIntegrations(Async)");
        }

        return searchSemanticIntegrationsCall(searchSemanticIntegrationsRequest, _callback);
    }

    /**
     * Version: 26.9.0.cl or later Searches and lists semantic integrations available to the
     * authenticated user in the current organization, with optional filters, sort, and pagination.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About search semantic integrations Returns a paginated batch of semantic
     * integrations, each with its identifier, name, description, source connection, generated model
     * identifier, author, creation/modification timestamps, and associated tags. Use the filters to
     * narrow results by author, connection, tag, or name pattern. - &#x60;pattern&#x60; matches the
     * integration name as a case-insensitive substring. - &#x60;author_identifiers&#x60; and
     * &#x60;connection_identifiers&#x60; accept either GUIDs or names. -
     * &#x60;sort_options.field_name&#x60; defaults to &#x60;MODIFIED_TIME&#x60;; set
     * &#x60;sort_options.order&#x60; to &#x60;ASC&#x60; or &#x60;DESC&#x60; to control sort
     * direction. - &#x60;record_offset&#x60; and &#x60;record_size&#x60; control pagination. Use
     * &#x60;record_size: 0&#x60; to return all matching records in a single response.
     *
     * @param searchSemanticIntegrationsRequest (required)
     * @return List&lt;SemanticIntegrationSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integrations retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<SemanticIntegrationSearchResponse> searchSemanticIntegrations(
            SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest)
            throws ApiException {
        ApiResponse<List<SemanticIntegrationSearchResponse>> localVarResp =
                searchSemanticIntegrationsWithHttpInfo(searchSemanticIntegrationsRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 26.9.0.cl or later Searches and lists semantic integrations available to the
     * authenticated user in the current organization, with optional filters, sort, and pagination.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About search semantic integrations Returns a paginated batch of semantic
     * integrations, each with its identifier, name, description, source connection, generated model
     * identifier, author, creation/modification timestamps, and associated tags. Use the filters to
     * narrow results by author, connection, tag, or name pattern. - &#x60;pattern&#x60; matches the
     * integration name as a case-insensitive substring. - &#x60;author_identifiers&#x60; and
     * &#x60;connection_identifiers&#x60; accept either GUIDs or names. -
     * &#x60;sort_options.field_name&#x60; defaults to &#x60;MODIFIED_TIME&#x60;; set
     * &#x60;sort_options.order&#x60; to &#x60;ASC&#x60; or &#x60;DESC&#x60; to control sort
     * direction. - &#x60;record_offset&#x60; and &#x60;record_size&#x60; control pagination. Use
     * &#x60;record_size: 0&#x60; to return all matching records in a single response.
     *
     * @param searchSemanticIntegrationsRequest (required)
     * @return ApiResponse&lt;List&lt;SemanticIntegrationSearchResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integrations retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<SemanticIntegrationSearchResponse>>
            searchSemanticIntegrationsWithHttpInfo(
                    SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest)
                    throws ApiException {
        okhttp3.Call localVarCall =
                searchSemanticIntegrationsValidateBeforeCall(
                        searchSemanticIntegrationsRequest, null);
        Type localVarReturnType =
                new TypeToken<List<SemanticIntegrationSearchResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 26.9.0.cl or later Searches and lists semantic integrations
     * available to the authenticated user in the current organization, with optional filters, sort,
     * and pagination. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based
     * Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your
     * instance, the following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - **Can manage
     * data models** #### About search semantic integrations Returns a paginated batch of semantic
     * integrations, each with its identifier, name, description, source connection, generated model
     * identifier, author, creation/modification timestamps, and associated tags. Use the filters to
     * narrow results by author, connection, tag, or name pattern. - &#x60;pattern&#x60; matches the
     * integration name as a case-insensitive substring. - &#x60;author_identifiers&#x60; and
     * &#x60;connection_identifiers&#x60; accept either GUIDs or names. -
     * &#x60;sort_options.field_name&#x60; defaults to &#x60;MODIFIED_TIME&#x60;; set
     * &#x60;sort_options.order&#x60; to &#x60;ASC&#x60; or &#x60;DESC&#x60; to control sort
     * direction. - &#x60;record_offset&#x60; and &#x60;record_size&#x60; control pagination. Use
     * &#x60;record_size: 0&#x60; to return all matching records in a single response.
     *
     * @param searchSemanticIntegrationsRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Semantic integrations retrieved successfully. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchSemanticIntegrationsAsync(
            SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest,
            final ApiCallback<List<SemanticIntegrationSearchResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchSemanticIntegrationsValidateBeforeCall(
                        searchSemanticIntegrationsRequest, _callback);
        Type localVarReturnType =
                new TypeToken<List<SemanticIntegrationSearchResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
