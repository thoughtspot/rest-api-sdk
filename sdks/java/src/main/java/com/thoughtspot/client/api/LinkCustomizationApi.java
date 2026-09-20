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
import com.thoughtspot.client.model.LinkPreference;
import com.thoughtspot.client.model.SearchLinkCustomizationsRequest;
import com.thoughtspot.client.model.UpdateLinkCustomizationsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class LinkCustomizationApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LinkCustomizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LinkCustomizationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public LinkCustomizationApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for searchLinkCustomizations
     * @param searchLinkCustomizationsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Link preferences retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchLinkCustomizationsCall(SearchLinkCustomizationsRequest searchLinkCustomizationsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchLinkCustomizationsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/links/search";

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
    private okhttp3.Call searchLinkCustomizationsValidateBeforeCall(SearchLinkCustomizationsRequest searchLinkCustomizationsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'searchLinkCustomizationsRequest' is set
        if (searchLinkCustomizationsRequest == null) {
            throw new ApiException("Missing the required parameter 'searchLinkCustomizationsRequest' when calling searchLinkCustomizations(Async)");
        }

        return searchLinkCustomizationsCall(searchLinkCustomizationsRequest, _callback);

    }

    /**
     * 
     *   Version: 26.11.0.cl or later   Retrieves the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to verify what an Org has customized before modifying it, or to confirm the destination URLs used in scheduled emails and the Share dialog.  Cluster-level templates serve as the default that Orgs inherit. Org-level templates override that default.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; returns the cluster templates, and is available only to callers in the primary Org. - &#x60;scope: ORG&#x60; returns the templates for the Org the caller is signed in to, and requires Orgs to be enabled. - Omit &#x60;scope&#x60; to return whichever of these the caller can access. - Every link type is always returned, customized or not. &#x60;is_overridden&#x60; is &#x60;true&#x60; when the scope you asked for stores a value that differs from the one it would otherwise inherit — the cluster template for &#x60;ORG&#x60;, the ThoughtSpot default for &#x60;CLUSTER&#x60; — and &#x60;false&#x60; when it matches.      
     * @param searchLinkCustomizationsRequest  (required)
     * @return List&lt;LinkPreference&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Link preferences retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<LinkPreference> searchLinkCustomizations(SearchLinkCustomizationsRequest searchLinkCustomizationsRequest) throws ApiException {
        ApiResponse<List<LinkPreference>> localVarResp = searchLinkCustomizationsWithHttpInfo(searchLinkCustomizationsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *   Version: 26.11.0.cl or later   Retrieves the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to verify what an Org has customized before modifying it, or to confirm the destination URLs used in scheduled emails and the Share dialog.  Cluster-level templates serve as the default that Orgs inherit. Org-level templates override that default.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; returns the cluster templates, and is available only to callers in the primary Org. - &#x60;scope: ORG&#x60; returns the templates for the Org the caller is signed in to, and requires Orgs to be enabled. - Omit &#x60;scope&#x60; to return whichever of these the caller can access. - Every link type is always returned, customized or not. &#x60;is_overridden&#x60; is &#x60;true&#x60; when the scope you asked for stores a value that differs from the one it would otherwise inherit — the cluster template for &#x60;ORG&#x60;, the ThoughtSpot default for &#x60;CLUSTER&#x60; — and &#x60;false&#x60; when it matches.      
     * @param searchLinkCustomizationsRequest  (required)
     * @return ApiResponse&lt;List&lt;LinkPreference&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Link preferences retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LinkPreference>> searchLinkCustomizationsWithHttpInfo(SearchLinkCustomizationsRequest searchLinkCustomizationsRequest) throws ApiException {
        okhttp3.Call localVarCall = searchLinkCustomizationsValidateBeforeCall(searchLinkCustomizationsRequest, null);
        Type localVarReturnType = new TypeToken<List<LinkPreference>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *   Version: 26.11.0.cl or later   Retrieves the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to verify what an Org has customized before modifying it, or to confirm the destination URLs used in scheduled emails and the Share dialog.  Cluster-level templates serve as the default that Orgs inherit. Org-level templates override that default.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; returns the cluster templates, and is available only to callers in the primary Org. - &#x60;scope: ORG&#x60; returns the templates for the Org the caller is signed in to, and requires Orgs to be enabled. - Omit &#x60;scope&#x60; to return whichever of these the caller can access. - Every link type is always returned, customized or not. &#x60;is_overridden&#x60; is &#x60;true&#x60; when the scope you asked for stores a value that differs from the one it would otherwise inherit — the cluster template for &#x60;ORG&#x60;, the ThoughtSpot default for &#x60;CLUSTER&#x60; — and &#x60;false&#x60; when it matches.      
     * @param searchLinkCustomizationsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Link preferences retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchLinkCustomizationsAsync(SearchLinkCustomizationsRequest searchLinkCustomizationsRequest, final ApiCallback<List<LinkPreference>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchLinkCustomizationsValidateBeforeCall(searchLinkCustomizationsRequest, _callback);
        Type localVarReturnType = new TypeToken<List<LinkPreference>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateLinkCustomizations
     * @param updateLinkCustomizationsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Link preferences updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLinkCustomizationsCall(UpdateLinkCustomizationsRequest updateLinkCustomizationsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateLinkCustomizationsRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/links/update";

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
    private okhttp3.Call updateLinkCustomizationsValidateBeforeCall(UpdateLinkCustomizationsRequest updateLinkCustomizationsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateLinkCustomizationsRequest' is set
        if (updateLinkCustomizationsRequest == null) {
            throw new ApiException("Missing the required parameter 'updateLinkCustomizationsRequest' when calling updateLinkCustomizations(Async)");
        }

        return updateLinkCustomizationsCall(updateLinkCustomizationsRequest, _callback);

    }

    /**
     * 
     *   Version: 26.11.0.cl or later   Updates the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to point shared links at your own embedding application, so a link in a scheduled email or a Share dialog opens your page instead of the ThoughtSpot application.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; changes the defaults inherited by all Orgs, and is available only to callers in the primary Org. - &#x60;scope: ORG&#x60; (default) changes the Org the caller is signed in to, and requires Orgs to be enabled. - This is a partial update. Only the types listed in &#x60;templates&#x60; change; every other type keeps its current value, whether set at this scope or inherited. A repeated type is rejected. - **REPLACE** (default) sets each listed type to the &#x60;value&#x60; provided in the request. - **RESET** clears each listed type, so an Org falls back to the cluster template and the cluster falls back to the ThoughtSpot default. Supply only &#x60;type&#x60;; a &#x60;value&#x60; alongside &#x60;RESET&#x60; is rejected. To clear every override, list all types with &#x60;RESET&#x60;. Resetting at cluster level changes only the cluster default: an Org that has set its own value keeps it.  #### Placeholders  A template is rejected unless it contains the placeholders its type requires.  | Link type | Required | Example | | --- | --- | --- | | &#x60;LIVEBOARD_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/dashboards/{object-id}?{ts-query-params}&#x60; | | &#x60;VISUALIZATION_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{sub-object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/dashboards/{object-id}/charts/{sub-object-id}?{ts-query-params}&#x60; | | &#x60;ANSWER_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/answers/{object-id}?{ts-query-params}&#x60; | | &#x60;SPOTIQ_ANALYSIS_URL&#x60; | &#x60;{object-id}&#x60; | &#x60;https://analytics.acme.com/insights/{object-id}&#x60; | | &#x60;UNSUBSCRIBE_URL&#x60; | none | &#x60;https://analytics.acme.com/account/email-preferences&#x60; | | &#x60;GENERIC_URL&#x60; | &#x60;{path}&#x60; | &#x60;https://analytics.acme.com/{path}&#x60; | | &#x60;CONVERSATION_SHARE_URL&#x60; | &#x60;{conversation-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/spotter/{conversation-id}?{ts-query-params}&#x60; |  &#x60;{ts-query-params}&#x60; is optional on any type that does not require it: it is substituted wherever it appears and removed when there is nothing to substitute, so it never reaches a generated link.      
     * @param updateLinkCustomizationsRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Link preferences updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void updateLinkCustomizations(UpdateLinkCustomizationsRequest updateLinkCustomizationsRequest) throws ApiException {
        updateLinkCustomizationsWithHttpInfo(updateLinkCustomizationsRequest);
    }

    /**
     * 
     *   Version: 26.11.0.cl or later   Updates the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to point shared links at your own embedding application, so a link in a scheduled email or a Share dialog opens your page instead of the ThoughtSpot application.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; changes the defaults inherited by all Orgs, and is available only to callers in the primary Org. - &#x60;scope: ORG&#x60; (default) changes the Org the caller is signed in to, and requires Orgs to be enabled. - This is a partial update. Only the types listed in &#x60;templates&#x60; change; every other type keeps its current value, whether set at this scope or inherited. A repeated type is rejected. - **REPLACE** (default) sets each listed type to the &#x60;value&#x60; provided in the request. - **RESET** clears each listed type, so an Org falls back to the cluster template and the cluster falls back to the ThoughtSpot default. Supply only &#x60;type&#x60;; a &#x60;value&#x60; alongside &#x60;RESET&#x60; is rejected. To clear every override, list all types with &#x60;RESET&#x60;. Resetting at cluster level changes only the cluster default: an Org that has set its own value keeps it.  #### Placeholders  A template is rejected unless it contains the placeholders its type requires.  | Link type | Required | Example | | --- | --- | --- | | &#x60;LIVEBOARD_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/dashboards/{object-id}?{ts-query-params}&#x60; | | &#x60;VISUALIZATION_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{sub-object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/dashboards/{object-id}/charts/{sub-object-id}?{ts-query-params}&#x60; | | &#x60;ANSWER_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/answers/{object-id}?{ts-query-params}&#x60; | | &#x60;SPOTIQ_ANALYSIS_URL&#x60; | &#x60;{object-id}&#x60; | &#x60;https://analytics.acme.com/insights/{object-id}&#x60; | | &#x60;UNSUBSCRIBE_URL&#x60; | none | &#x60;https://analytics.acme.com/account/email-preferences&#x60; | | &#x60;GENERIC_URL&#x60; | &#x60;{path}&#x60; | &#x60;https://analytics.acme.com/{path}&#x60; | | &#x60;CONVERSATION_SHARE_URL&#x60; | &#x60;{conversation-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/spotter/{conversation-id}?{ts-query-params}&#x60; |  &#x60;{ts-query-params}&#x60; is optional on any type that does not require it: it is substituted wherever it appears and removed when there is nothing to substitute, so it never reaches a generated link.      
     * @param updateLinkCustomizationsRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Link preferences updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateLinkCustomizationsWithHttpInfo(UpdateLinkCustomizationsRequest updateLinkCustomizationsRequest) throws ApiException {
        okhttp3.Call localVarCall = updateLinkCustomizationsValidateBeforeCall(updateLinkCustomizationsRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *   Version: 26.11.0.cl or later   Updates the URL templates ThoughtSpot uses when it generates a shareable link, at the cluster level or for the Org the caller is signed in to. Use this endpoint to point shared links at your own embedding application, so a link in a scheduled email or a Share dialog opens your page instead of the ThoughtSpot application.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - &#x60;scope: CLUSTER&#x60; changes the defaults inherited by all Orgs, and is available only to callers in the primary Org. - &#x60;scope: ORG&#x60; (default) changes the Org the caller is signed in to, and requires Orgs to be enabled. - This is a partial update. Only the types listed in &#x60;templates&#x60; change; every other type keeps its current value, whether set at this scope or inherited. A repeated type is rejected. - **REPLACE** (default) sets each listed type to the &#x60;value&#x60; provided in the request. - **RESET** clears each listed type, so an Org falls back to the cluster template and the cluster falls back to the ThoughtSpot default. Supply only &#x60;type&#x60;; a &#x60;value&#x60; alongside &#x60;RESET&#x60; is rejected. To clear every override, list all types with &#x60;RESET&#x60;. Resetting at cluster level changes only the cluster default: an Org that has set its own value keeps it.  #### Placeholders  A template is rejected unless it contains the placeholders its type requires.  | Link type | Required | Example | | --- | --- | --- | | &#x60;LIVEBOARD_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/dashboards/{object-id}?{ts-query-params}&#x60; | | &#x60;VISUALIZATION_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{sub-object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/dashboards/{object-id}/charts/{sub-object-id}?{ts-query-params}&#x60; | | &#x60;ANSWER_SHARE_URL&#x60; | &#x60;{object-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/answers/{object-id}?{ts-query-params}&#x60; | | &#x60;SPOTIQ_ANALYSIS_URL&#x60; | &#x60;{object-id}&#x60; | &#x60;https://analytics.acme.com/insights/{object-id}&#x60; | | &#x60;UNSUBSCRIBE_URL&#x60; | none | &#x60;https://analytics.acme.com/account/email-preferences&#x60; | | &#x60;GENERIC_URL&#x60; | &#x60;{path}&#x60; | &#x60;https://analytics.acme.com/{path}&#x60; | | &#x60;CONVERSATION_SHARE_URL&#x60; | &#x60;{conversation-id}&#x60;, &#x60;{ts-query-params}&#x60; | &#x60;https://analytics.acme.com/spotter/{conversation-id}?{ts-query-params}&#x60; |  &#x60;{ts-query-params}&#x60; is optional on any type that does not require it: it is substituted wherever it appears and removed when there is nothing to substitute, so it never reaches a generated link.      
     * @param updateLinkCustomizationsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Link preferences updated successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLinkCustomizationsAsync(UpdateLinkCustomizationsRequest updateLinkCustomizationsRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateLinkCustomizationsValidateBeforeCall(updateLinkCustomizationsRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
