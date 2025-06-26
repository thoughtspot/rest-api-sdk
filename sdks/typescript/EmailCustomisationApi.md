# ThoughtSpotRestApiSdk.EmailCustomisationApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailCustomisation**](EmailCustomisationApi.md#createEmailCustomisation) | **POST** /api/rest/2.0/customization/email | 
[**deleteEmailCustomisation**](EmailCustomisationApi.md#deleteEmailCustomisation) | **POST** /api/rest/2.0/customization/email/{template_identifier}/delete | 
[**searchEmailCustomisation**](EmailCustomisationApi.md#searchEmailCustomisation) | **POST** /api/rest/2.0/customization/email/search | 
[**validateEmailCustomisation**](EmailCustomisationApi.md#validateEmailCustomisation) | **POST** /api/rest/2.0/customization/email/validate | 


# **createEmailCustomisation**
> CreateEmailCustomisationResponse createEmailCustomisation(createEmailCustomisationRequest)

 Version: 10.10.0.cl or later   Creates a custom configuration for the email customisation  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To create a custom confuguration:  1. Pass these parameters in your API request.  - A JSON map of configuration attributes `template_properties`. The following example shows the configuration attribures for a csutom configuration:  ``` {     {     \"logoUrl\": \"<logo_url>\",     \"homeUrl\": \"<home_url>\",     \"productName\": \"<Company Name in the Mail>\",     \"footerAddress\": \"<address to be visible in the footer>\",     \"ctaButtonBgColor\": \"#444DEA\",     \"ctaTextFontColor\": \"#FFFFFF\",     \"primaryBgColor\": \"#D3DEF0\",     \"hideMobileAppNudge\": <true/false>,     \"hideTsVocabularyDefinitions\": <true/false>e,     \"hideProductName\": <true/false>,     \"hideFooterPhone\": <true/false>,     \"hideFooterAddress\": <true/false>,     \"hidePrivacyPolicy\": <true/false>,     \"hideManageNotification\": <true/false>,     \"fontfamily\": \"<to maintain a single font in the entire email>\"   } } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomisationApi, CreateEmailCustomisationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomisationApi(configuration);

apiInstance.createEmailCustomisation(
  // CreateEmailCustomisationRequest
  {
    template_properties: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmailCustomisationRequest** | **CreateEmailCustomisationRequest**|  |


### Return type

**CreateEmailCustomisationResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Invalid request. |  -  |
**403** | Unauthorized access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteEmailCustomisation**
> void deleteEmailCustomisation()

 Version: 10.10.0.cl or later   Deletes the configuration for the email customisation.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  Deletes the configuration available for the cluster/org. Pass the `template_identifier` in the API request.  Note: `template_identifier` can be fetched from search API request.      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomisationApi, DeleteEmailCustomisationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomisationApi(configuration);

apiInstance.deleteEmailCustomisation(
  // string | Unique ID or name of the email customization.
  "template_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateIdentifier** | [**string**] | Unique ID or name of the email customization. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Email Customization configuration successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**403** | Unauthorized access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchEmailCustomisation**
> Array<CreateEmailCustomisationResponse> searchEmailCustomisation()

 Version: 10.10.0.cl or later   Search the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To get the list of configurations set in the cluster/org.      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomisationApi, SearchEmailCustomisationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomisationApi(configuration);

apiInstance.searchEmailCustomisation().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<CreateEmailCustomisationResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Invalid request. |  -  |
**403** | Unauthorized access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **validateEmailCustomisation**
> void validateEmailCustomisation()

 Version: 10.10.0.cl or later   Validates the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomisationApi, ValidateEmailCustomisationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomisationApi(configuration);

apiInstance.validateEmailCustomisation().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Triggered test email for customization configuration |  -  |
**400** | Invalid request. |  -  |
**403** | Unauthorized access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

