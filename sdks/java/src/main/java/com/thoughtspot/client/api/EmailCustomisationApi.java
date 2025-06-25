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


import com.thoughtspot.client.model.CreateEmailCustomisationRequest;
import com.thoughtspot.client.model.CreateEmailCustomisationResponse;
import com.thoughtspot.client.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EmailCustomisationApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmailCustomisationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailCustomisationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public EmailCustomisationApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createEmailCustomisation
     * @param createEmailCustomisationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEmailCustomisationCall(CreateEmailCustomisationRequest createEmailCustomisationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createEmailCustomisationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/email";

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
    private okhttp3.Call createEmailCustomisationValidateBeforeCall(CreateEmailCustomisationRequest createEmailCustomisationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createEmailCustomisationRequest' is set
        if (createEmailCustomisationRequest == null) {
            throw new ApiException("Missing the required parameter 'createEmailCustomisationRequest' when calling createEmailCustomisation(Async)");
        }

        return createEmailCustomisationCall(createEmailCustomisationRequest, _callback);

    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Creates a custom configuration for the email customisation  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To create a custom confuguration:  1. Pass these parameters in your API request.  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows the configuration attribures for a csutom configuration:  &#x60;&#x60;&#x60; {     {     \&quot;logoUrl\&quot;: \&quot;&lt;logo_url&gt;\&quot;,     \&quot;homeUrl\&quot;: \&quot;&lt;home_url&gt;\&quot;,     \&quot;productName\&quot;: \&quot;&lt;Company Name in the Mail&gt;\&quot;,     \&quot;footerAddress\&quot;: \&quot;&lt;address to be visible in the footer&gt;\&quot;,     \&quot;ctaButtonBgColor\&quot;: \&quot;#444DEA\&quot;,     \&quot;ctaTextFontColor\&quot;: \&quot;#FFFFFF\&quot;,     \&quot;primaryBgColor\&quot;: \&quot;#D3DEF0\&quot;,     \&quot;hideMobileAppNudge\&quot;: &lt;true/false&gt;,     \&quot;hideTsVocabularyDefinitions\&quot;: &lt;true/false&gt;e,     \&quot;hideProductName\&quot;: &lt;true/false&gt;,     \&quot;hideFooterPhone\&quot;: &lt;true/false&gt;,     \&quot;hideFooterAddress\&quot;: &lt;true/false&gt;,     \&quot;hidePrivacyPolicy\&quot;: &lt;true/false&gt;,     \&quot;hideManageNotification\&quot;: &lt;true/false&gt;,     \&quot;fontfamily\&quot;: \&quot;&lt;to maintain a single font in the entire email&gt;\&quot;   } } &#x60;&#x60;&#x60;      
     * @param createEmailCustomisationRequest  (required)
     * @return CreateEmailCustomisationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public CreateEmailCustomisationResponse createEmailCustomisation(CreateEmailCustomisationRequest createEmailCustomisationRequest) throws ApiException {
        ApiResponse<CreateEmailCustomisationResponse> localVarResp = createEmailCustomisationWithHttpInfo(createEmailCustomisationRequest);
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Creates a custom configuration for the email customisation  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To create a custom confuguration:  1. Pass these parameters in your API request.  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows the configuration attribures for a csutom configuration:  &#x60;&#x60;&#x60; {     {     \&quot;logoUrl\&quot;: \&quot;&lt;logo_url&gt;\&quot;,     \&quot;homeUrl\&quot;: \&quot;&lt;home_url&gt;\&quot;,     \&quot;productName\&quot;: \&quot;&lt;Company Name in the Mail&gt;\&quot;,     \&quot;footerAddress\&quot;: \&quot;&lt;address to be visible in the footer&gt;\&quot;,     \&quot;ctaButtonBgColor\&quot;: \&quot;#444DEA\&quot;,     \&quot;ctaTextFontColor\&quot;: \&quot;#FFFFFF\&quot;,     \&quot;primaryBgColor\&quot;: \&quot;#D3DEF0\&quot;,     \&quot;hideMobileAppNudge\&quot;: &lt;true/false&gt;,     \&quot;hideTsVocabularyDefinitions\&quot;: &lt;true/false&gt;e,     \&quot;hideProductName\&quot;: &lt;true/false&gt;,     \&quot;hideFooterPhone\&quot;: &lt;true/false&gt;,     \&quot;hideFooterAddress\&quot;: &lt;true/false&gt;,     \&quot;hidePrivacyPolicy\&quot;: &lt;true/false&gt;,     \&quot;hideManageNotification\&quot;: &lt;true/false&gt;,     \&quot;fontfamily\&quot;: \&quot;&lt;to maintain a single font in the entire email&gt;\&quot;   } } &#x60;&#x60;&#x60;      
     * @param createEmailCustomisationRequest  (required)
     * @return ApiResponse&lt;CreateEmailCustomisationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateEmailCustomisationResponse> createEmailCustomisationWithHttpInfo(CreateEmailCustomisationRequest createEmailCustomisationRequest) throws ApiException {
        okhttp3.Call localVarCall = createEmailCustomisationValidateBeforeCall(createEmailCustomisationRequest, null);
        Type localVarReturnType = new TypeToken<CreateEmailCustomisationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 10.10.0.cl or later   Creates a custom configuration for the email customisation  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To create a custom confuguration:  1. Pass these parameters in your API request.  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows the configuration attribures for a csutom configuration:  &#x60;&#x60;&#x60; {     {     \&quot;logoUrl\&quot;: \&quot;&lt;logo_url&gt;\&quot;,     \&quot;homeUrl\&quot;: \&quot;&lt;home_url&gt;\&quot;,     \&quot;productName\&quot;: \&quot;&lt;Company Name in the Mail&gt;\&quot;,     \&quot;footerAddress\&quot;: \&quot;&lt;address to be visible in the footer&gt;\&quot;,     \&quot;ctaButtonBgColor\&quot;: \&quot;#444DEA\&quot;,     \&quot;ctaTextFontColor\&quot;: \&quot;#FFFFFF\&quot;,     \&quot;primaryBgColor\&quot;: \&quot;#D3DEF0\&quot;,     \&quot;hideMobileAppNudge\&quot;: &lt;true/false&gt;,     \&quot;hideTsVocabularyDefinitions\&quot;: &lt;true/false&gt;e,     \&quot;hideProductName\&quot;: &lt;true/false&gt;,     \&quot;hideFooterPhone\&quot;: &lt;true/false&gt;,     \&quot;hideFooterAddress\&quot;: &lt;true/false&gt;,     \&quot;hidePrivacyPolicy\&quot;: &lt;true/false&gt;,     \&quot;hideManageNotification\&quot;: &lt;true/false&gt;,     \&quot;fontfamily\&quot;: \&quot;&lt;to maintain a single font in the entire email&gt;\&quot;   } } &#x60;&#x60;&#x60;      
     * @param createEmailCustomisationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEmailCustomisationAsync(CreateEmailCustomisationRequest createEmailCustomisationRequest, final ApiCallback<CreateEmailCustomisationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createEmailCustomisationValidateBeforeCall(createEmailCustomisationRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateEmailCustomisationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteEmailCustomisation
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteEmailCustomisationCall(String templateIdentifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/customization/email/{template_identifier}/delete"
            .replace("{" + "template_identifier" + "}", localVarApiClient.escapeString(templateIdentifier.toString()));

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
    private okhttp3.Call deleteEmailCustomisationValidateBeforeCall(String templateIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'templateIdentifier' is set
        if (templateIdentifier == null) {
            throw new ApiException("Missing the required parameter 'templateIdentifier' when calling deleteEmailCustomisation(Async)");
        }

        return deleteEmailCustomisationCall(templateIdentifier, _callback);

    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Deletes the configuration for the email customisation.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  Deletes the configuration available for the cluster/org. Pass the &#x60;template_identifier&#x60; in the API request.  Note: &#x60;template_identifier&#x60; can be fetched from search API request.      
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void deleteEmailCustomisation(String templateIdentifier) throws ApiException {
        deleteEmailCustomisationWithHttpInfo(templateIdentifier);
    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Deletes the configuration for the email customisation.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  Deletes the configuration available for the cluster/org. Pass the &#x60;template_identifier&#x60; in the API request.  Note: &#x60;template_identifier&#x60; can be fetched from search API request.      
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteEmailCustomisationWithHttpInfo(String templateIdentifier) throws ApiException {
        okhttp3.Call localVarCall = deleteEmailCustomisationValidateBeforeCall(templateIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Version: 10.10.0.cl or later   Deletes the configuration for the email customisation.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  Deletes the configuration available for the cluster/org. Pass the &#x60;template_identifier&#x60; in the API request.  Note: &#x60;template_identifier&#x60; can be fetched from search API request.      
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteEmailCustomisationAsync(String templateIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteEmailCustomisationValidateBeforeCall(templateIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchEmailCustomisation
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchEmailCustomisationCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/customization/email/search";

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
    private okhttp3.Call searchEmailCustomisationValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return searchEmailCustomisationCall(_callback);

    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Search the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To get the list of configurations set in the cluster/org.      
     * @return List&lt;CreateEmailCustomisationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<CreateEmailCustomisationResponse> searchEmailCustomisation() throws ApiException {
        ApiResponse<List<CreateEmailCustomisationResponse>> localVarResp = searchEmailCustomisationWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Search the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To get the list of configurations set in the cluster/org.      
     * @return ApiResponse&lt;List&lt;CreateEmailCustomisationResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CreateEmailCustomisationResponse>> searchEmailCustomisationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = searchEmailCustomisationValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<CreateEmailCustomisationResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *  Version: 10.10.0.cl or later   Search the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To get the list of configurations set in the cluster/org.      
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchEmailCustomisationAsync(final ApiCallback<List<CreateEmailCustomisationResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchEmailCustomisationValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<CreateEmailCustomisationResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateEmailCustomisation
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateEmailCustomisationCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/rest/2.0/customization/email/validate";

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
    private okhttp3.Call validateEmailCustomisationValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return validateEmailCustomisationCall(_callback);

    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Validates the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.      
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void validateEmailCustomisation() throws ApiException {
        validateEmailCustomisationWithHttpInfo();
    }

    /**
     * 
     *  Version: 10.10.0.cl or later   Validates the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.      
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> validateEmailCustomisationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = validateEmailCustomisationValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     *  Version: 10.10.0.cl or later   Validates the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.      
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateEmailCustomisationAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateEmailCustomisationValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
