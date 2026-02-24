# EmailCustomizationApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createEmailCustomization**](EmailCustomizationApi.md#createEmailCustomization) | **POST** /api/rest/2.0/customization/email |
| [**deleteEmailCustomization**](EmailCustomizationApi.md#deleteEmailCustomization) | **POST** /api/rest/2.0/customization/email/{template_identifier}/delete |
| [**deleteOrgEmailCustomization**](EmailCustomizationApi.md#deleteOrgEmailCustomization) | **POST** /api/rest/2.0/customization/email/delete |
| [**searchEmailCustomization**](EmailCustomizationApi.md#searchEmailCustomization) | **POST** /api/rest/2.0/customization/email/search |
| [**updateEmailCustomization**](EmailCustomizationApi.md#updateEmailCustomization) | **POST** /api/rest/2.0/customization/email/update |
| [**validateEmailCustomization**](EmailCustomizationApi.md#validateEmailCustomization) | **POST** /api/rest/2.0/customization/email/validate |


<a id="createEmailCustomization"></a>
# **createEmailCustomization**
> CreateEmailCustomizationResponse createEmailCustomization(createEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Creates a customization configuration for the notification email.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To create a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows a sample set of customization configuration:  &#x60;&#x60;&#x60; {   {       \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;,       \&quot;cta_text_font_color\&quot;: \&quot;#FFFFFF\&quot;,       \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,       \&quot;logo_url\&quot;: \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,      \&quot;font_family\&quot;: \&quot;\&quot;,       \&quot;product_name\&quot;: \&quot;ThoughtSpot\&quot;,       \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000 Mountain View, CA 94041\&quot;,    \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,       \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,       \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,       \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,       \&quot;hide_footer_phone\&quot;: false,       \&quot;hide_footer_address\&quot;: false,       \&quot;hide_product_name\&quot;: false,       \&quot;hide_manage_notification\&quot;: false,       \&quot;hide_mobile_app_nudge\&quot;: false,       \&quot;hide_privacy_policy\&quot;: false,       \&quot;hide_ts_vocabulary_definitions\&quot;: false,       \&quot;hide_error_message\&quot;: false,       \&quot;hide_unsubscribe_link\&quot;: false,       \&quot;hide_notification_status\&quot;: false,       \&quot;hide_modify_alert\&quot;: false,       \&quot;company_website_url\&quot;: \&quot;https://your-website.com/\&quot;,       \&quot;company_privacy_policy_url\&quot; : \&quot;https://link-to-privacy-policy.com/\&quot;,       \&quot;contact_support_url\&quot;: \&quot;https://link-to-contact-support.com/\&quot;,       \&quot;hide_contact_support_url\&quot;: false,    \&quot;hide_logo_url\&quot; : false   } } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createEmailCustomizationRequest** | [**CreateEmailCustomizationRequest**](CreateEmailCustomizationRequest.md)

### Return type

[**CreateEmailCustomizationResponse**](CreateEmailCustomizationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteEmailCustomization"></a>
# **deleteEmailCustomization**
> deleteEmailCustomization(templateIdentifier)



 Version: 10.10.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the &#x60;template_identifier&#x60; from the response. - Use that &#x60;template_identifier&#x60; as a parameter in this API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **templateIdentifier** | **String**

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Email Customization configuration successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteOrgEmailCustomization"></a>
# **deleteOrgEmailCustomization**
> deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the &#x60;org_identifier&#x60; from the response. - Use that &#x60;org_identifier&#x60; as a parameter in this API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteOrgEmailCustomizationRequest** | [**DeleteOrgEmailCustomizationRequest**](DeleteOrgEmailCustomizationRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Email Customization configuration successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchEmailCustomization"></a>
# **searchEmailCustomization**
> List&lt;CreateEmailCustomizationResponse&gt; searchEmailCustomization(searchEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Search the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchEmailCustomizationRequest** | [**SearchEmailCustomizationRequest**](SearchEmailCustomizationRequest.md)

### Return type

[**List&lt;CreateEmailCustomizationResponse&gt;**](CreateEmailCustomizationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateEmailCustomization"></a>
# **updateEmailCustomization**
> updateEmailCustomization(updateEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Updates a customization configuration for the notification email.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To update a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows a sample set of customization configuration:  &#x60;&#x60;&#x60; {   {       \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;,      \&quot;cta_text_font_color\&quot;: \&quot;#FFFFFF\&quot;,      \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,         \&quot;logo_url\&quot;: \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,        \&quot;font_family\&quot;: \&quot;\&quot;,      \&quot;product_name\&quot;: \&quot;ThoughtSpot\&quot;,      \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000 Mountain View, CA 94041\&quot;,      \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,         \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,      \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,      \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,         \&quot;hide_footer_phone\&quot;: false,         \&quot;hide_footer_address\&quot;: false,         \&quot;hide_product_name\&quot;: false,      \&quot;hide_manage_notification\&quot;: false,      \&quot;hide_mobile_app_nudge\&quot;: false,      \&quot;hide_privacy_policy\&quot;: false,       \&quot;hide_ts_vocabulary_definitions\&quot;: false,      \&quot;hide_error_message\&quot;: false,      \&quot;hide_unsubscribe_link\&quot;: false,         \&quot;hide_notification_status\&quot;: false,      \&quot;hide_modify_alert\&quot;: false,      \&quot;company_website_url\&quot;: \&quot;https://your-website.com/\&quot;,      \&quot;company_privacy_policy_url\&quot; : \&quot;https://link-to-privacy-policy.com/\&quot;,         \&quot;contact_support_url\&quot;: \&quot;https://link-to-contact-support.com/\&quot;,         \&quot;hide_contact_support_url\&quot;: false,      \&quot;hide_logo_url\&quot; : false   } } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateEmailCustomizationRequest** | [**UpdateEmailCustomizationRequest**](UpdateEmailCustomizationRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Email Customization configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

<a id="validateEmailCustomization"></a>
# **validateEmailCustomization**
> validateEmailCustomization()



 Version: 10.10.0.cl or later   Validates the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Triggered test email for customization configuration |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

