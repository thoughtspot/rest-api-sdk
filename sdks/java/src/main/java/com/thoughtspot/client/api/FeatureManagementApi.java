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


import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.FeatureAssignmentResponse;
import com.thoughtspot.client.model.FeatureGroup;
import com.thoughtspot.client.model.FeatureValueResponse;
import com.thoughtspot.client.model.SearchFeaturesRequest;
import com.thoughtspot.client.model.UpdateFeatureAssignmentsRequest;
import com.thoughtspot.client.model.UpdateFeatureValueRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class FeatureManagementApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FeatureManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FeatureManagementApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public FeatureManagementApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for searchFeatures
     * @param searchFeaturesRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feature groups returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchFeaturesCall(SearchFeaturesRequest searchFeaturesRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchFeaturesRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/configurations/features/search";

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
    private okhttp3.Call searchFeaturesValidateBeforeCall(SearchFeaturesRequest searchFeaturesRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchFeaturesRequest' is set
        if (searchFeaturesRequest == null) {
            throw new ApiException("Missing the required parameter 'searchFeaturesRequest' when calling searchFeatures(Async)");
        }

        return searchFeaturesCall(searchFeaturesRequest, _callback);

    }

    /**
     * 
     *   Version: 26.10.0.cl or later   Returns the feature configurations available on the ThoughtSpot system, grouped by feature group.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To retrieve feature configurations, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the administrative view. Use &#x60;CLUSTER&#x60; for the cluster-admin view (returns the Orgs assigned to each feature); use &#x60;ORG&#x60; for the org-admin view (returns the current value of each feature for a single Org). - &#x60;org_identifier&#x60; — Numeric ID of the Org. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;category&#x60; — Availability category of the features to return. &#x60;GENERAL_ACCESS&#x60; returns generally available features; &#x60;EARLY_ACCESS&#x60; returns features still in early access. Defaults to &#x60;GENERAL_ACCESS&#x60;.  The response fields populated depend on the requested scope. In the cluster-admin view (&#x60;scope&#x3D;CLUSTER&#x60;), each feature includes &#x60;assigned_orgs&#x60;, &#x60;is_org_aware&#x60;, and (for non-org-aware features) &#x60;feature_value&#x60;. In the org-admin view (&#x60;scope&#x3D;ORG&#x60;), each feature includes &#x60;element_type&#x60;, &#x60;element_config&#x60;, and &#x60;element_value&#x60;.  The following example retrieves the general-access features for the cluster-admin view:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;  For the org-admin view, set &#x60;scope&#x60; to &#x60;ORG&#x60; and pass the &#x60;org_identifier&#x60; of the Org to scope the search to (&#x60;org_identifier&#x60; is required when &#x60;scope&#x60; is &#x60;ORG&#x60;; omitting it returns a 400 error):  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;      
     * @param searchFeaturesRequest  (required)
     * @return List&lt;FeatureGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feature groups returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public List<FeatureGroup> searchFeatures(SearchFeaturesRequest searchFeaturesRequest) throws ApiException {
        ApiResponse<List<FeatureGroup>> localVarResp = searchFeaturesWithHttpInfo(searchFeaturesRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 26.10.0.cl or later   Returns the feature configurations available on the ThoughtSpot system, grouped by feature group.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To retrieve feature configurations, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the administrative view. Use &#x60;CLUSTER&#x60; for the cluster-admin view (returns the Orgs assigned to each feature); use &#x60;ORG&#x60; for the org-admin view (returns the current value of each feature for a single Org). - &#x60;org_identifier&#x60; — Numeric ID of the Org. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;category&#x60; — Availability category of the features to return. &#x60;GENERAL_ACCESS&#x60; returns generally available features; &#x60;EARLY_ACCESS&#x60; returns features still in early access. Defaults to &#x60;GENERAL_ACCESS&#x60;.  The response fields populated depend on the requested scope. In the cluster-admin view (&#x60;scope&#x3D;CLUSTER&#x60;), each feature includes &#x60;assigned_orgs&#x60;, &#x60;is_org_aware&#x60;, and (for non-org-aware features) &#x60;feature_value&#x60;. In the org-admin view (&#x60;scope&#x3D;ORG&#x60;), each feature includes &#x60;element_type&#x60;, &#x60;element_config&#x60;, and &#x60;element_value&#x60;.  The following example retrieves the general-access features for the cluster-admin view:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;  For the org-admin view, set &#x60;scope&#x60; to &#x60;ORG&#x60; and pass the &#x60;org_identifier&#x60; of the Org to scope the search to (&#x60;org_identifier&#x60; is required when &#x60;scope&#x60; is &#x60;ORG&#x60;; omitting it returns a 400 error):  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;      
     * @param searchFeaturesRequest  (required)
     * @return ApiResponse&lt;List&lt;FeatureGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feature groups returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<FeatureGroup>> searchFeaturesWithHttpInfo(SearchFeaturesRequest searchFeaturesRequest) throws ApiException {
        okhttp3.Call localVarCall = searchFeaturesValidateBeforeCall(searchFeaturesRequest, null);
        Type localVarReturnType = new TypeToken<List<FeatureGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 26.10.0.cl or later   Returns the feature configurations available on the ThoughtSpot system, grouped by feature group.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To retrieve feature configurations, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the administrative view. Use &#x60;CLUSTER&#x60; for the cluster-admin view (returns the Orgs assigned to each feature); use &#x60;ORG&#x60; for the org-admin view (returns the current value of each feature for a single Org). - &#x60;org_identifier&#x60; — Numeric ID of the Org. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;category&#x60; — Availability category of the features to return. &#x60;GENERAL_ACCESS&#x60; returns generally available features; &#x60;EARLY_ACCESS&#x60; returns features still in early access. Defaults to &#x60;GENERAL_ACCESS&#x60;.  The response fields populated depend on the requested scope. In the cluster-admin view (&#x60;scope&#x3D;CLUSTER&#x60;), each feature includes &#x60;assigned_orgs&#x60;, &#x60;is_org_aware&#x60;, and (for non-org-aware features) &#x60;feature_value&#x60;. In the org-admin view (&#x60;scope&#x3D;ORG&#x60;), each feature includes &#x60;element_type&#x60;, &#x60;element_config&#x60;, and &#x60;element_value&#x60;.  The following example retrieves the general-access features for the cluster-admin view:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;  For the org-admin view, set &#x60;scope&#x60; to &#x60;ORG&#x60; and pass the &#x60;org_identifier&#x60; of the Org to scope the search to (&#x60;org_identifier&#x60; is required when &#x60;scope&#x60; is &#x60;ORG&#x60;; omitting it returns a 400 error):  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;category\&quot;: \&quot;GENERAL_ACCESS\&quot; } &#x60;&#x60;&#x60;      
     * @param searchFeaturesRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feature groups returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchFeaturesAsync(SearchFeaturesRequest searchFeaturesRequest, final ApiCallback<List<FeatureGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchFeaturesValidateBeforeCall(searchFeaturesRequest, _callback);
        Type localVarReturnType = new TypeToken<List<FeatureGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateFeatureAssignments
     * @param updateFeatureAssignmentsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Assignments updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFeatureAssignmentsCall(UpdateFeatureAssignmentsRequest updateFeatureAssignmentsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateFeatureAssignmentsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/configurations/features/assignments/update";

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
    private okhttp3.Call updateFeatureAssignmentsValidateBeforeCall(UpdateFeatureAssignmentsRequest updateFeatureAssignmentsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateFeatureAssignmentsRequest' is set
        if (updateFeatureAssignmentsRequest == null) {
            throw new ApiException("Missing the required parameter 'updateFeatureAssignmentsRequest' when calling updateFeatureAssignments(Async)");
        }

        return updateFeatureAssignmentsCall(updateFeatureAssignmentsRequest, _callback);

    }

    /**
     * 
     *   Version: 26.10.0.cl or later   Updates the Org assignments for a feature. Available to cluster admins only.  #### Pre-requisites  Requires the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege in the cluster-admin (All-Org / default-org) context. This endpoint manages Org assignments across the cluster, so it must be called by a cluster admin; org-scoped admins cannot call it. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To update the Org assignments for a feature, pass these parameters in your API request:  - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature to update. - &#x60;org_identifiers&#x60; — Numeric IDs of the Orgs to assign. Send an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; to clear all Org assignments for this feature. - &#x60;operation&#x60; — Type of update to apply. &#x60;ADD&#x60; assigns the given Orgs in addition to the existing ones; &#x60;REMOVE&#x60; unassigns the given Orgs; &#x60;REPLACE&#x60; sets the assignment to exactly the given Orgs. Defaults to &#x60;REPLACE&#x60;.  The following example assigns Orgs &#x60;1&#x60; and &#x60;2&#x60; to a feature, in addition to any Orgs already assigned:  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [1, 2],   \&quot;operation\&quot;: \&quot;ADD\&quot; } &#x60;&#x60;&#x60;  Clear all Org assignments for a feature by sending an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; (this is the only way to unassign every Org at once):  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [],   \&quot;operation\&quot;: \&quot;REPLACE\&quot; } &#x60;&#x60;&#x60;      
     * @param updateFeatureAssignmentsRequest  (required)
     * @return FeatureAssignmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Assignments updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public FeatureAssignmentResponse updateFeatureAssignments(UpdateFeatureAssignmentsRequest updateFeatureAssignmentsRequest) throws ApiException {
        ApiResponse<FeatureAssignmentResponse> localVarResp = updateFeatureAssignmentsWithHttpInfo(updateFeatureAssignmentsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 26.10.0.cl or later   Updates the Org assignments for a feature. Available to cluster admins only.  #### Pre-requisites  Requires the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege in the cluster-admin (All-Org / default-org) context. This endpoint manages Org assignments across the cluster, so it must be called by a cluster admin; org-scoped admins cannot call it. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To update the Org assignments for a feature, pass these parameters in your API request:  - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature to update. - &#x60;org_identifiers&#x60; — Numeric IDs of the Orgs to assign. Send an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; to clear all Org assignments for this feature. - &#x60;operation&#x60; — Type of update to apply. &#x60;ADD&#x60; assigns the given Orgs in addition to the existing ones; &#x60;REMOVE&#x60; unassigns the given Orgs; &#x60;REPLACE&#x60; sets the assignment to exactly the given Orgs. Defaults to &#x60;REPLACE&#x60;.  The following example assigns Orgs &#x60;1&#x60; and &#x60;2&#x60; to a feature, in addition to any Orgs already assigned:  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [1, 2],   \&quot;operation\&quot;: \&quot;ADD\&quot; } &#x60;&#x60;&#x60;  Clear all Org assignments for a feature by sending an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; (this is the only way to unassign every Org at once):  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [],   \&quot;operation\&quot;: \&quot;REPLACE\&quot; } &#x60;&#x60;&#x60;      
     * @param updateFeatureAssignmentsRequest  (required)
     * @return ApiResponse&lt;FeatureAssignmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Assignments updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FeatureAssignmentResponse> updateFeatureAssignmentsWithHttpInfo(UpdateFeatureAssignmentsRequest updateFeatureAssignmentsRequest) throws ApiException {
        okhttp3.Call localVarCall = updateFeatureAssignmentsValidateBeforeCall(updateFeatureAssignmentsRequest, null);
        Type localVarReturnType = new TypeToken<FeatureAssignmentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 26.10.0.cl or later   Updates the Org assignments for a feature. Available to cluster admins only.  #### Pre-requisites  Requires the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege in the cluster-admin (All-Org / default-org) context. This endpoint manages Org assignments across the cluster, so it must be called by a cluster admin; org-scoped admins cannot call it. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To update the Org assignments for a feature, pass these parameters in your API request:  - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature to update. - &#x60;org_identifiers&#x60; — Numeric IDs of the Orgs to assign. Send an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; to clear all Org assignments for this feature. - &#x60;operation&#x60; — Type of update to apply. &#x60;ADD&#x60; assigns the given Orgs in addition to the existing ones; &#x60;REMOVE&#x60; unassigns the given Orgs; &#x60;REPLACE&#x60; sets the assignment to exactly the given Orgs. Defaults to &#x60;REPLACE&#x60;.  The following example assigns Orgs &#x60;1&#x60; and &#x60;2&#x60; to a feature, in addition to any Orgs already assigned:  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [1, 2],   \&quot;operation\&quot;: \&quot;ADD\&quot; } &#x60;&#x60;&#x60;  Clear all Org assignments for a feature by sending an empty array with &#x60;operation&#x60; set to &#x60;REPLACE&#x60; (this is the only way to unassign every Org at once):  &#x60;&#x60;&#x60; {   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;org_identifiers\&quot;: [],   \&quot;operation\&quot;: \&quot;REPLACE\&quot; } &#x60;&#x60;&#x60;      
     * @param updateFeatureAssignmentsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Assignments updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFeatureAssignmentsAsync(UpdateFeatureAssignmentsRequest updateFeatureAssignmentsRequest, final ApiCallback<FeatureAssignmentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFeatureAssignmentsValidateBeforeCall(updateFeatureAssignmentsRequest, _callback);
        Type localVarReturnType = new TypeToken<FeatureAssignmentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateFeatureValue
     * @param updateFeatureValueRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Value updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges or org not assigned to feature. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFeatureValueCall(UpdateFeatureValueRequest updateFeatureValueRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateFeatureValueRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/configurations/features/values/update";

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
    private okhttp3.Call updateFeatureValueValidateBeforeCall(UpdateFeatureValueRequest updateFeatureValueRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateFeatureValueRequest' is set
        if (updateFeatureValueRequest == null) {
            throw new ApiException("Missing the required parameter 'updateFeatureValueRequest' when calling updateFeatureValue(Async)");
        }

        return updateFeatureValueCall(updateFeatureValueRequest, _callback);

    }

    /**
     * 
     *   Version: 26.10.0.cl or later   Sets the value of a feature at the cluster or Org scope.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To set a feature value, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the scope at which the value is set. Use &#x60;CLUSTER&#x60; to set the cluster-level value; use &#x60;ORG&#x60; to set a per-Org value override. - &#x60;org_identifier&#x60; — Numeric ID of the Org for which to set the value. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature whose value should be set. - &#x60;feature_value&#x60; — New value to set for the feature. - &#x60;reset_org_overrides&#x60; — Applicable only when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. When &#x60;true&#x60;, any existing per-Org value overrides for this feature are also removed so that all Orgs inherit the new cluster-level value. Required when &#x60;scope&#x60; is &#x60;CLUSTER&#x60; for an org-aware feature. Must be omitted when &#x60;scope&#x60; is &#x60;ORG&#x60;; passing it at &#x60;ORG&#x60; scope returns a 400 error.  The following example sets a per-Org value override for Org &#x60;1&#x60;:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot; } &#x60;&#x60;&#x60;  Set the cluster-level value and clear all per-Org overrides so every Org inherits the new value (CLUSTER scope). &#x60;reset_org_overrides: true&#x60; is destructive — it strips existing per-Org overrides cluster-wide:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot;,   \&quot;reset_org_overrides\&quot;: true } &#x60;&#x60;&#x60;      
     * @param updateFeatureValueRequest  (required)
     * @return FeatureValueResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Value updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges or org not assigned to feature. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public FeatureValueResponse updateFeatureValue(UpdateFeatureValueRequest updateFeatureValueRequest) throws ApiException {
        ApiResponse<FeatureValueResponse> localVarResp = updateFeatureValueWithHttpInfo(updateFeatureValueRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 26.10.0.cl or later   Sets the value of a feature at the cluster or Org scope.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To set a feature value, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the scope at which the value is set. Use &#x60;CLUSTER&#x60; to set the cluster-level value; use &#x60;ORG&#x60; to set a per-Org value override. - &#x60;org_identifier&#x60; — Numeric ID of the Org for which to set the value. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature whose value should be set. - &#x60;feature_value&#x60; — New value to set for the feature. - &#x60;reset_org_overrides&#x60; — Applicable only when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. When &#x60;true&#x60;, any existing per-Org value overrides for this feature are also removed so that all Orgs inherit the new cluster-level value. Required when &#x60;scope&#x60; is &#x60;CLUSTER&#x60; for an org-aware feature. Must be omitted when &#x60;scope&#x60; is &#x60;ORG&#x60;; passing it at &#x60;ORG&#x60; scope returns a 400 error.  The following example sets a per-Org value override for Org &#x60;1&#x60;:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot; } &#x60;&#x60;&#x60;  Set the cluster-level value and clear all per-Org overrides so every Org inherits the new value (CLUSTER scope). &#x60;reset_org_overrides: true&#x60; is destructive — it strips existing per-Org overrides cluster-wide:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot;,   \&quot;reset_org_overrides\&quot;: true } &#x60;&#x60;&#x60;      
     * @param updateFeatureValueRequest  (required)
     * @return ApiResponse&lt;FeatureValueResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Value updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges or org not assigned to feature. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FeatureValueResponse> updateFeatureValueWithHttpInfo(UpdateFeatureValueRequest updateFeatureValueRequest) throws ApiException {
        okhttp3.Call localVarCall = updateFeatureValueValidateBeforeCall(updateFeatureValueRequest, null);
        Type localVarReturnType = new TypeToken<FeatureValueResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 26.10.0.cl or later   Sets the value of a feature at the cluster or Org scope.  #### Pre-requisites  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required.  #### Usage guidelines  To set a feature value, pass these parameters in your API request:  - &#x60;scope&#x60; — Determines the scope at which the value is set. Use &#x60;CLUSTER&#x60; to set the cluster-level value; use &#x60;ORG&#x60; to set a per-Org value override. - &#x60;org_identifier&#x60; — Numeric ID of the Org for which to set the value. Required when &#x60;scope&#x60; is &#x60;ORG&#x60;; ignored when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. - &#x60;feature_identifier&#x60; — User-friendly feature name (&#x60;feature_name&#x60;) or the underlying feature ID (&#x60;feature_id&#x60;) of the feature whose value should be set. - &#x60;feature_value&#x60; — New value to set for the feature. - &#x60;reset_org_overrides&#x60; — Applicable only when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. When &#x60;true&#x60;, any existing per-Org value overrides for this feature are also removed so that all Orgs inherit the new cluster-level value. Required when &#x60;scope&#x60; is &#x60;CLUSTER&#x60; for an org-aware feature. Must be omitted when &#x60;scope&#x60; is &#x60;ORG&#x60;; passing it at &#x60;ORG&#x60; scope returns a 400 error.  The following example sets a per-Org value override for Org &#x60;1&#x60;:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;ORG\&quot;,   \&quot;org_identifier\&quot;: 1,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot; } &#x60;&#x60;&#x60;  Set the cluster-level value and clear all per-Org overrides so every Org inherits the new value (CLUSTER scope). &#x60;reset_org_overrides: true&#x60; is destructive — it strips existing per-Org overrides cluster-wide:  &#x60;&#x60;&#x60; {   \&quot;scope\&quot;: \&quot;CLUSTER\&quot;,   \&quot;feature_identifier\&quot;: \&quot;index_columns\&quot;,   \&quot;feature_value\&quot;: \&quot;true\&quot;,   \&quot;reset_org_overrides\&quot;: true } &#x60;&#x60;&#x60;      
     * @param updateFeatureValueRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Value updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Insufficient privileges or org not assigned to feature. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Feature not found or feature management not enabled. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFeatureValueAsync(UpdateFeatureValueRequest updateFeatureValueRequest, final ApiCallback<FeatureValueResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFeatureValueValidateBeforeCall(updateFeatureValueRequest, _callback);
        Type localVarReturnType = new TypeToken<FeatureValueResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
