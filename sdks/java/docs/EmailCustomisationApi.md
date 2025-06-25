# EmailCustomisationApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createEmailCustomisation**](EmailCustomisationApi.md#createEmailCustomisation) | **POST** /api/rest/2.0/customization/email |
| [**deleteEmailCustomisation**](EmailCustomisationApi.md#deleteEmailCustomisation) | **POST** /api/rest/2.0/customization/email/{template_identifier}/delete |
| [**searchEmailCustomisation**](EmailCustomisationApi.md#searchEmailCustomisation) | **POST** /api/rest/2.0/customization/email/search |
| [**validateEmailCustomisation**](EmailCustomisationApi.md#validateEmailCustomisation) | **POST** /api/rest/2.0/customization/email/validate |


<a id="createEmailCustomisation"></a>
# **createEmailCustomisation**
> CreateEmailCustomisationResponse createEmailCustomisation(createEmailCustomisationRequest)



 Version: 10.10.0.cl or later   Creates a custom configuration for the email customisation  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To create a custom confuguration:  1. Pass these parameters in your API request.  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows the configuration attribures for a csutom configuration:  &#x60;&#x60;&#x60; {     {     \&quot;logoUrl\&quot;: \&quot;&lt;logo_url&gt;\&quot;,     \&quot;homeUrl\&quot;: \&quot;&lt;home_url&gt;\&quot;,     \&quot;productName\&quot;: \&quot;&lt;Company Name in the Mail&gt;\&quot;,     \&quot;footerAddress\&quot;: \&quot;&lt;address to be visible in the footer&gt;\&quot;,     \&quot;ctaButtonBgColor\&quot;: \&quot;#444DEA\&quot;,     \&quot;ctaTextFontColor\&quot;: \&quot;#FFFFFF\&quot;,     \&quot;primaryBgColor\&quot;: \&quot;#D3DEF0\&quot;,     \&quot;hideMobileAppNudge\&quot;: &lt;true/false&gt;,     \&quot;hideTsVocabularyDefinitions\&quot;: &lt;true/false&gt;e,     \&quot;hideProductName\&quot;: &lt;true/false&gt;,     \&quot;hideFooterPhone\&quot;: &lt;true/false&gt;,     \&quot;hideFooterAddress\&quot;: &lt;true/false&gt;,     \&quot;hidePrivacyPolicy\&quot;: &lt;true/false&gt;,     \&quot;hideManageNotification\&quot;: &lt;true/false&gt;,     \&quot;fontfamily\&quot;: \&quot;&lt;to maintain a single font in the entire email&gt;\&quot;   } } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createEmailCustomisationRequest** | [**CreateEmailCustomisationRequest**](CreateEmailCustomisationRequest.md)

### Return type

[**CreateEmailCustomisationResponse**](CreateEmailCustomisationResponse.md)

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

<a id="deleteEmailCustomisation"></a>
# **deleteEmailCustomisation**
> deleteEmailCustomisation(templateIdentifier)



 Version: 10.10.0.cl or later   Deletes the configuration for the email customisation.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  Deletes the configuration available for the cluster/org. Pass the &#x60;template_identifier&#x60; in the API request.  Note: &#x60;template_identifier&#x60; can be fetched from search API request.      

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

<a id="searchEmailCustomisation"></a>
# **searchEmailCustomisation**
> List&lt;CreateEmailCustomisationResponse&gt; searchEmailCustomisation()



 Version: 10.10.0.cl or later   Search the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To get the list of configurations set in the cluster/org.      

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CreateEmailCustomisationResponse&gt;**](CreateEmailCustomisationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

<a id="validateEmailCustomisation"></a>
# **validateEmailCustomisation**
> validateEmailCustomisation()



 Version: 10.10.0.cl or later   Validates the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;_Has developer privilege&#x60; privilege is required. Coms should be enabled on the cluster.      

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

