# ThoughtSpot.Client.Api.EmailCustomizationApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateEmailCustomization**](EmailCustomizationApi.md#createemailcustomization) | **POST** /api/rest/2.0/customization/email |  |
| [**DeleteEmailCustomization**](EmailCustomizationApi.md#deleteemailcustomization) | **POST** /api/rest/2.0/customization/email/{template_identifier}/delete |  |
| [**DeleteOrgEmailCustomization**](EmailCustomizationApi.md#deleteorgemailcustomization) | **POST** /api/rest/2.0/customization/email/delete |  |
| [**SearchEmailCustomization**](EmailCustomizationApi.md#searchemailcustomization) | **POST** /api/rest/2.0/customization/email/search |  |
| [**UpdateEmailCustomization**](EmailCustomizationApi.md#updateemailcustomization) | **POST** /api/rest/2.0/customization/email/update |  |
| [**ValidateEmailCustomization**](EmailCustomizationApi.md#validateemailcustomization) | **POST** /api/rest/2.0/customization/email/validate |  |

<a id="createemailcustomization"></a>
# **CreateEmailCustomization**
> CreateEmailCustomizationResponse CreateEmailCustomization (CreateEmailCustomizationRequest createEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Creates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To create a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",       \"cta_text_font_color\": \"#FFFFFF\",       \"primary_bg_color\": \"#D3DEF0\",       \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",      \"font_family\": \"\",       \"product_name\": \"ThoughtSpot\",       \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",    \"footer_phone\": \"(800) 508-7008\",       \"replacement_value_for_liveboard\": \"Dashboard\",       \"replacement_value_for_answer\": \"Chart\",       \"replacement_value_for_spot_iq\": \"AI Insights\",       \"hide_footer_phone\": false,       \"hide_footer_address\": false,       \"hide_product_name\": false,       \"hide_manage_notification\": false,       \"hide_mobile_app_nudge\": false,       \"hide_privacy_policy\": false,       \"hide_ts_vocabulary_definitions\": false,       \"hide_error_message\": false,       \"hide_unsubscribe_link\": false,       \"hide_notification_status\": false,       \"hide_modify_alert\": false,       \"company_website_url\": \"https://your-website.com/\",       \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",       \"contact_support_url\": \"https://link-to-contact-support.com/\",       \"hide_contact_support_url\": false,    \"hide_logo_url\" : false   } } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class CreateEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new EmailCustomizationApi(httpClient, config, httpClientHandler);
            var createEmailCustomizationRequest = new CreateEmailCustomizationRequest(); // CreateEmailCustomizationRequest | 

            try
            {
                CreateEmailCustomizationResponse result = apiInstance.CreateEmailCustomization(createEmailCustomizationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EmailCustomizationApi.CreateEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CreateEmailCustomizationResponse> response = apiInstance.CreateEmailCustomizationWithHttpInfo(createEmailCustomizationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EmailCustomizationApi.CreateEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createEmailCustomizationRequest** | [**CreateEmailCustomizationRequest**](CreateEmailCustomizationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteemailcustomization"></a>
# **DeleteEmailCustomization**
> void DeleteEmailCustomization (string templateIdentifier)



 Version: 10.10.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `template_identifier` from the response. - Use that `template_identifier` as a parameter in this API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class DeleteEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new EmailCustomizationApi(httpClient, config, httpClientHandler);
            var templateIdentifier = "templateIdentifier_example";  // string | Unique ID or name of the email customization.

            try
            {
                apiInstance.DeleteEmailCustomization(templateIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EmailCustomizationApi.DeleteEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteEmailCustomizationWithHttpInfo(templateIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EmailCustomizationApi.DeleteEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateIdentifier** | **string** | Unique ID or name of the email customization. |  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteorgemailcustomization"></a>
# **DeleteOrgEmailCustomization**
> void DeleteOrgEmailCustomization (DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `org_identifier` from the response. - Use that `org_identifier` as a parameter in this API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class DeleteOrgEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new EmailCustomizationApi(httpClient, config, httpClientHandler);
            var deleteOrgEmailCustomizationRequest = new DeleteOrgEmailCustomizationRequest(); // DeleteOrgEmailCustomizationRequest | 

            try
            {
                apiInstance.DeleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EmailCustomizationApi.DeleteOrgEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteOrgEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteOrgEmailCustomizationWithHttpInfo(deleteOrgEmailCustomizationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EmailCustomizationApi.DeleteOrgEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteOrgEmailCustomizationRequest** | [**DeleteOrgEmailCustomizationRequest**](DeleteOrgEmailCustomizationRequest.md) |  |  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchemailcustomization"></a>
# **SearchEmailCustomization**
> List&lt;CreateEmailCustomizationResponse&gt; SearchEmailCustomization (SearchEmailCustomizationRequest searchEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Search the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class SearchEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new EmailCustomizationApi(httpClient, config, httpClientHandler);
            var searchEmailCustomizationRequest = new SearchEmailCustomizationRequest(); // SearchEmailCustomizationRequest | 

            try
            {
                List<CreateEmailCustomizationResponse> result = apiInstance.SearchEmailCustomization(searchEmailCustomizationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EmailCustomizationApi.SearchEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<CreateEmailCustomizationResponse>> response = apiInstance.SearchEmailCustomizationWithHttpInfo(searchEmailCustomizationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EmailCustomizationApi.SearchEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchEmailCustomizationRequest** | [**SearchEmailCustomizationRequest**](SearchEmailCustomizationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateemailcustomization"></a>
# **UpdateEmailCustomization**
> void UpdateEmailCustomization (UpdateEmailCustomizationRequest updateEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Updates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To update a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",      \"cta_text_font_color\": \"#FFFFFF\",      \"primary_bg_color\": \"#D3DEF0\",         \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",        \"font_family\": \"\",      \"product_name\": \"ThoughtSpot\",      \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",      \"footer_phone\": \"(800) 508-7008\",         \"replacement_value_for_liveboard\": \"Dashboard\",      \"replacement_value_for_answer\": \"Chart\",      \"replacement_value_for_spot_iq\": \"AI Insights\",         \"hide_footer_phone\": false,         \"hide_footer_address\": false,         \"hide_product_name\": false,      \"hide_manage_notification\": false,      \"hide_mobile_app_nudge\": false,      \"hide_privacy_policy\": false,       \"hide_ts_vocabulary_definitions\": false,      \"hide_error_message\": false,      \"hide_unsubscribe_link\": false,         \"hide_notification_status\": false,      \"hide_modify_alert\": false,      \"company_website_url\": \"https://your-website.com/\",      \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",         \"contact_support_url\": \"https://link-to-contact-support.com/\",         \"hide_contact_support_url\": false,      \"hide_logo_url\" : false   } } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class UpdateEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new EmailCustomizationApi(httpClient, config, httpClientHandler);
            var updateEmailCustomizationRequest = new UpdateEmailCustomizationRequest(); // UpdateEmailCustomizationRequest | 

            try
            {
                apiInstance.UpdateEmailCustomization(updateEmailCustomizationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EmailCustomizationApi.UpdateEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateEmailCustomizationWithHttpInfo(updateEmailCustomizationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EmailCustomizationApi.UpdateEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateEmailCustomizationRequest** | [**UpdateEmailCustomizationRequest**](UpdateEmailCustomizationRequest.md) |  |  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="validateemailcustomization"></a>
# **ValidateEmailCustomization**
> void ValidateEmailCustomization ()



 Version: 10.10.0.cl or later   Validates the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.Client.Api;
using ThoughtSpot.Client.Client;
using ThoughtSpot.Client.Model;

namespace Example
{
    public class ValidateEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new EmailCustomizationApi(httpClient, config, httpClientHandler);

            try
            {
                apiInstance.ValidateEmailCustomization();
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EmailCustomizationApi.ValidateEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ValidateEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ValidateEmailCustomizationWithHttpInfo();
}
catch (ApiException e)
{
    Debug.Print("Exception when calling EmailCustomizationApi.ValidateEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

