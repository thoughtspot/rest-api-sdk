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
import com.thoughtspot.client.model.CreateEmailCustomizationRequest;
import com.thoughtspot.client.model.CreateEmailCustomizationResponse;
import com.thoughtspot.client.model.DeleteOrgEmailCustomizationRequest;
import com.thoughtspot.client.model.SearchEmailCustomizationRequest;
import com.thoughtspot.client.model.UpdateEmailCustomizationRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EmailCustomizationApi {
    private ApiClient localVarApiClient;
    private ApiClientConfiguration localVarApiClientConfiguration;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmailCustomizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailCustomizationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public EmailCustomizationApi(ApiClientConfiguration apiClientConfiguration) {
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
     * Build call for createEmailCustomization
     *
     * @param createEmailCustomizationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createEmailCustomizationCall(
            CreateEmailCustomizationRequest createEmailCustomizationRequest,
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

        Object localVarPostBody = createEmailCustomizationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/email";

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
    private okhttp3.Call createEmailCustomizationValidateBeforeCall(
            CreateEmailCustomizationRequest createEmailCustomizationRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'createEmailCustomizationRequest' is set
        if (createEmailCustomizationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'createEmailCustomizationRequest' when calling"
                            + " createEmailCustomization(Async)");
        }

        return createEmailCustomizationCall(createEmailCustomizationRequest, _callback);
    }

    /**
     * Version: 10.10.0.cl or later Creates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To create a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @param createEmailCustomizationRequest (required)
     * @return CreateEmailCustomizationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public CreateEmailCustomizationResponse createEmailCustomization(
            CreateEmailCustomizationRequest createEmailCustomizationRequest) throws ApiException {
        ApiResponse<CreateEmailCustomizationResponse> localVarResp =
                createEmailCustomizationWithHttpInfo(createEmailCustomizationRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.10.0.cl or later Creates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To create a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @param createEmailCustomizationRequest (required)
     * @return ApiResponse&lt;CreateEmailCustomizationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CreateEmailCustomizationResponse> createEmailCustomizationWithHttpInfo(
            CreateEmailCustomizationRequest createEmailCustomizationRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createEmailCustomizationValidateBeforeCall(createEmailCustomizationRequest, null);
        Type localVarReturnType = new TypeToken<CreateEmailCustomizationResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.10.0.cl or later Creates a customization configuration for the
     * notification email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance. #### Usage guidelines To create a custom configuration pass these
     * parameters in your API request: - A JSON map of configuration attributes
     * &#x60;template_properties&#x60;. The following example shows a sample set of customization
     * configuration: &#x60;&#x60;&#x60; { { \&quot;cta_button_bg_color\&quot;:
     * \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;: \&quot;#FFFFFF\&quot;,
     * \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;, \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @param createEmailCustomizationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createEmailCustomizationAsync(
            CreateEmailCustomizationRequest createEmailCustomizationRequest,
            final ApiCallback<CreateEmailCustomizationResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createEmailCustomizationValidateBeforeCall(
                        createEmailCustomizationRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateEmailCustomizationResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteEmailCustomization
     *
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call deleteEmailCustomizationCall(
            String templateIdentifier, final ApiCallback _callback) throws ApiException {
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
                "/api/rest/2.0/customization/email/{template_identifier}/delete"
                        .replace(
                                "{" + "template_identifier" + "}",
                                localVarApiClient.escapeString(templateIdentifier.toString()));

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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteEmailCustomizationValidateBeforeCall(
            String templateIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'templateIdentifier' is set
        if (templateIdentifier == null) {
            throw new ApiException(
                    "Missing the required parameter 'templateIdentifier' when calling"
                            + " deleteEmailCustomization(Async)");
        }

        return deleteEmailCustomizationCall(templateIdentifier, _callback);
    }

    /**
     * Version: 10.10.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the
     * &#x60;template_identifier&#x60; from the response. - Use that &#x60;template_identifier&#x60;
     * as a parameter in this API request.
     *
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public void deleteEmailCustomization(String templateIdentifier) throws ApiException {
        deleteEmailCustomizationWithHttpInfo(templateIdentifier);
    }

    /**
     * Version: 10.10.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the
     * &#x60;template_identifier&#x60; from the response. - Use that &#x60;template_identifier&#x60;
     * as a parameter in this API request.
     *
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> deleteEmailCustomizationWithHttpInfo(String templateIdentifier)
            throws ApiException {
        okhttp3.Call localVarCall =
                deleteEmailCustomizationValidateBeforeCall(templateIdentifier, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.10.0.cl or later Deletes the configuration for the email
     * customization. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance. #### Usage guidelines - Call the search API endpoint to get the
     * &#x60;template_identifier&#x60; from the response. - Use that &#x60;template_identifier&#x60;
     * as a parameter in this API request.
     *
     * @param templateIdentifier Unique ID or name of the email customization. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     *
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call deleteEmailCustomizationAsync(
            String templateIdentifier, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall =
                deleteEmailCustomizationValidateBeforeCall(templateIdentifier, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteOrgEmailCustomization
     *
     * @param deleteOrgEmailCustomizationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteOrgEmailCustomizationCall(
            DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest,
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

        Object localVarPostBody = deleteOrgEmailCustomizationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/email/delete";

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
    private okhttp3.Call deleteOrgEmailCustomizationValidateBeforeCall(
            DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'deleteOrgEmailCustomizationRequest' is set
        if (deleteOrgEmailCustomizationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'deleteOrgEmailCustomizationRequest' when"
                            + " calling deleteOrgEmailCustomization(Async)");
        }

        return deleteOrgEmailCustomizationCall(deleteOrgEmailCustomizationRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the &#x60;org_identifier&#x60;
     * from the response. - Use that &#x60;org_identifier&#x60; as a parameter in this API request.
     *
     * @param deleteOrgEmailCustomizationRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void deleteOrgEmailCustomization(
            DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest)
            throws ApiException {
        deleteOrgEmailCustomizationWithHttpInfo(deleteOrgEmailCustomizationRequest);
    }

    /**
     * Version: 10.12.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the &#x60;org_identifier&#x60;
     * from the response. - Use that &#x60;org_identifier&#x60; as a parameter in this API request.
     *
     * @param deleteOrgEmailCustomizationRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> deleteOrgEmailCustomizationWithHttpInfo(
            DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                deleteOrgEmailCustomizationValidateBeforeCall(
                        deleteOrgEmailCustomizationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Deletes the configuration for the email
     * customization. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance. #### Usage guidelines - Call the search API endpoint to get the
     * &#x60;org_identifier&#x60; from the response. - Use that &#x60;org_identifier&#x60; as a
     * parameter in this API request.
     *
     * @param deleteOrgEmailCustomizationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully deleted. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteOrgEmailCustomizationAsync(
            DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteOrgEmailCustomizationValidateBeforeCall(
                        deleteOrgEmailCustomizationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchEmailCustomization
     *
     * @param searchEmailCustomizationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchEmailCustomizationCall(
            SearchEmailCustomizationRequest searchEmailCustomizationRequest,
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

        Object localVarPostBody = searchEmailCustomizationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/email/search";

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
    private okhttp3.Call searchEmailCustomizationValidateBeforeCall(
            SearchEmailCustomizationRequest searchEmailCustomizationRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'searchEmailCustomizationRequest' is set
        if (searchEmailCustomizationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'searchEmailCustomizationRequest' when calling"
                            + " searchEmailCustomization(Async)");
        }

        return searchEmailCustomizationCall(searchEmailCustomizationRequest, _callback);
    }

    /**
     * Version: 10.10.0.cl or later Search the email customization configuration if any set for the
     * ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @param searchEmailCustomizationRequest (required)
     * @return List&lt;CreateEmailCustomizationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public List<CreateEmailCustomizationResponse> searchEmailCustomization(
            SearchEmailCustomizationRequest searchEmailCustomizationRequest) throws ApiException {
        ApiResponse<List<CreateEmailCustomizationResponse>> localVarResp =
                searchEmailCustomizationWithHttpInfo(searchEmailCustomizationRequest);
        return localVarResp.getData();
    }

    /**
     * Version: 10.10.0.cl or later Search the email customization configuration if any set for the
     * ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @param searchEmailCustomizationRequest (required)
     * @return ApiResponse&lt;List&lt;CreateEmailCustomizationResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<List<CreateEmailCustomizationResponse>> searchEmailCustomizationWithHttpInfo(
            SearchEmailCustomizationRequest searchEmailCustomizationRequest) throws ApiException {
        okhttp3.Call localVarCall =
                searchEmailCustomizationValidateBeforeCall(searchEmailCustomizationRequest, null);
        Type localVarReturnType =
                new TypeToken<List<CreateEmailCustomizationResponse>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously) Version: 10.10.0.cl or later Search the email customization configuration if
     * any set for the ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has
     * developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     *
     * @param searchEmailCustomizationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchEmailCustomizationAsync(
            SearchEmailCustomizationRequest searchEmailCustomizationRequest,
            final ApiCallback<List<CreateEmailCustomizationResponse>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                searchEmailCustomizationValidateBeforeCall(
                        searchEmailCustomizationRequest, _callback);
        Type localVarReturnType =
                new TypeToken<List<CreateEmailCustomizationResponse>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateEmailCustomization
     *
     * @param updateEmailCustomizationRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateEmailCustomizationCall(
            UpdateEmailCustomizationRequest updateEmailCustomizationRequest,
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

        Object localVarPostBody = updateEmailCustomizationRequest;

        // create path and map variables
        String localVarPath = "/api/rest/2.0/customization/email/update";

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
    private okhttp3.Call updateEmailCustomizationValidateBeforeCall(
            UpdateEmailCustomizationRequest updateEmailCustomizationRequest,
            final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'updateEmailCustomizationRequest' is set
        if (updateEmailCustomizationRequest == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateEmailCustomizationRequest' when calling"
                            + " updateEmailCustomization(Async)");
        }

        return updateEmailCustomizationCall(updateEmailCustomizationRequest, _callback);
    }

    /**
     * Version: 10.12.0.cl or later Updates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To update a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @param updateEmailCustomizationRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void updateEmailCustomization(
            UpdateEmailCustomizationRequest updateEmailCustomizationRequest) throws ApiException {
        updateEmailCustomizationWithHttpInfo(updateEmailCustomizationRequest);
    }

    /**
     * Version: 10.12.0.cl or later Updates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To update a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @param updateEmailCustomizationRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> updateEmailCustomizationWithHttpInfo(
            UpdateEmailCustomizationRequest updateEmailCustomizationRequest) throws ApiException {
        okhttp3.Call localVarCall =
                updateEmailCustomizationValidateBeforeCall(updateEmailCustomizationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.12.0.cl or later Updates a customization configuration for the
     * notification email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance. #### Usage guidelines To update a custom configuration pass these
     * parameters in your API request: - A JSON map of configuration attributes
     * &#x60;template_properties&#x60;. The following example shows a sample set of customization
     * configuration: &#x60;&#x60;&#x60; { { \&quot;cta_button_bg_color\&quot;:
     * \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;: \&quot;#FFFFFF\&quot;,
     * \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;, \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @param updateEmailCustomizationRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Email Customization configuration successfully updated. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateEmailCustomizationAsync(
            UpdateEmailCustomizationRequest updateEmailCustomizationRequest,
            final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateEmailCustomizationValidateBeforeCall(
                        updateEmailCustomizationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateEmailCustomization
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call validateEmailCustomizationCall(final ApiCallback _callback)
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
        String localVarPath = "/api/rest/2.0/customization/email/validate";

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
    private okhttp3.Call validateEmailCustomizationValidateBeforeCall(final ApiCallback _callback)
            throws ApiException {
        return validateEmailCustomizationCall(_callback);
    }

    /**
     * Version: 10.10.0.cl or later Validates the email customization configuration if any set for
     * the ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public void validateEmailCustomization() throws ApiException {
        validateEmailCustomizationWithHttpInfo();
    }

    /**
     * Version: 10.10.0.cl or later Validates the email customization configuration if any set for
     * the ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> validateEmailCustomizationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = validateEmailCustomizationValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * (asynchronously) Version: 10.10.0.cl or later Validates the email customization configuration
     * if any set for the ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60;
     * (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Triggered test email for customization configuration </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Invalid request. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> Unauthorized access. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call validateEmailCustomizationAsync(final ApiCallback<Void> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = validateEmailCustomizationValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
