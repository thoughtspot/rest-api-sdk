# ThoughtSpotRestApiSdk.EmailCustomizationApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailCustomization**](EmailCustomizationApi.md#createEmailCustomization) | **POST** /api/rest/2.0/customization/email | 
[**deleteEmailCustomization**](EmailCustomizationApi.md#deleteEmailCustomization) | **POST** /api/rest/2.0/customization/email/{template_identifier}/delete | 
[**deleteOrgEmailCustomization**](EmailCustomizationApi.md#deleteOrgEmailCustomization) | **POST** /api/rest/2.0/customization/email/delete | 
[**searchEmailCustomization**](EmailCustomizationApi.md#searchEmailCustomization) | **POST** /api/rest/2.0/customization/email/search | 
[**updateEmailCustomization**](EmailCustomizationApi.md#updateEmailCustomization) | **POST** /api/rest/2.0/customization/email/update | 
[**validateEmailCustomization**](EmailCustomizationApi.md#validateEmailCustomization) | **POST** /api/rest/2.0/customization/email/validate | 


# **createEmailCustomization**
> CreateEmailCustomizationResponse createEmailCustomization(createEmailCustomizationRequest)

 Version: 10.10.0.cl or later   Creates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To create a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {     \"ctaButtonBgColor\": \"#444DEA\",     \"ctaTextFontColor\": \"#FFFFFF\",     \"primaryBgColor\": \"#D3DEF0\",     \"hideMobileAppNudge\": false,     \"fontFamily\" : \"\",     \"hideProductName\" : false,     \"hideFooterPhone\" : false,     \"hideFooterAddress\" : false,     \"hidePrivacyPolicy\" : false,     \"hideManageNotification\" : false,     \"hideTsVocabularyDefinitions\": false,     \"hideNotificationStatus\" : false,     \"hideErrorMessage\": false,     \"hideUnsubscribeLink\" : false,     \"hideModifyAlert\": false,     \"textTransform\": \"\",     \"replacementValueForLiveboard\": \"LB dashboard\",     \"replacementValueForAnswer\": \"Answer dashboard\",     \"replacementValueForSpotIQ\": \"SpotIQ dashboard\",     \"logoUrl\":\"\",     \"productName\":\"ThoughtSpot\",     \"footerPhone\":\"(800) 508-7008\",     \"footerAddress\":\"444 Castro St, Suite 1000 Mountain View, CA 94041\",     \"companyWebsiteUrl\":\"\",     \"companyPrivacyPolicyUrl\":\"\"   } } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomizationApi, CreateEmailCustomizationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomizationApi(configuration);

apiInstance.createEmailCustomization(
  // CreateEmailCustomizationRequest
  {
    template_properties: null,
    org_identifier: "org_identifier_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmailCustomizationRequest** | **CreateEmailCustomizationRequest**|  |


### Return type

**CreateEmailCustomizationResponse**

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

# **deleteEmailCustomization**
> void deleteEmailCustomization()

 Version: 10.10.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `template_identifier` from the response. - Use that `template_identifier` as a parameter in this API request.      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomizationApi, DeleteEmailCustomizationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomizationApi(configuration);

apiInstance.deleteEmailCustomization(
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

# **deleteOrgEmailCustomization**
> void deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest)

 Version: 10.12.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `org_identifier` from the response. - Use that `org_identifier` as a parameter in this API request.      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomizationApi, DeleteOrgEmailCustomizationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomizationApi(configuration);

apiInstance.deleteOrgEmailCustomization(
  // DeleteOrgEmailCustomizationRequest
  {
    org_identifiers: [
      "org_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteOrgEmailCustomizationRequest** | **DeleteOrgEmailCustomizationRequest**|  |


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Email Customization configuration successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Unauthorized access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchEmailCustomization**
> Array<CreateEmailCustomizationResponse> searchEmailCustomization(searchEmailCustomizationRequest)

 Version: 10.10.0.cl or later   Search the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomizationApi, SearchEmailCustomizationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomizationApi(configuration);

apiInstance.searchEmailCustomization(
  // SearchEmailCustomizationRequest
  {
    org_identifiers: [
      "org_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchEmailCustomizationRequest** | **SearchEmailCustomizationRequest**|  |


### Return type

**Array<CreateEmailCustomizationResponse>**

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

# **updateEmailCustomization**
> void updateEmailCustomization(updateEmailCustomizationRequest)

 Version: 10.12.0.cl or later   Updates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To update a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {     \"ctaButtonBgColor\": \"#444DEA\",     \"ctaTextFontColor\": \"#FFFFFF\",     \"primaryBgColor\": \"#D3DEF0\",     \"hideMobileAppNudge\": false,     \"fontFamily\" : \"\",     \"hideProductName\" : false,     \"hideFooterPhone\" : false,     \"hideFooterAddress\" : false,     \"hidePrivacyPolicy\" : false,     \"hideManageNotification\" : false,     \"hideTsVocabularyDefinitions\": false,     \"hideNotificationStatus\" : false,     \"hideErrorMessage\": false,     \"hideUnsubscribeLink\" : false,     \"hideModifyAlert\": false,     \"textTransform\": \"\",     \"replacementValueForLiveboard\": \"LB dashboard\",     \"replacementValueForAnswer\": \"Answer dashboard\",     \"replacementValueForSpotIQ\": \"SpotIQ dashboard\",     \"logoUrl\":\"\",     \"productName\":\"ThoughtSpot\",     \"footerPhone\":\"(800) 508-7008\",     \"footerAddress\":\"444 Castro St, Suite 1000 Mountain View, CA 94041\",     \"companyWebsiteUrl\":\"\",     \"companyPrivacyPolicyUrl\":\"\"   } } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomizationApi, UpdateEmailCustomizationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomizationApi(configuration);

apiInstance.updateEmailCustomization(
  // UpdateEmailCustomizationRequest
  {
    template_properties: null,
    org_identifier: "org_identifier_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateEmailCustomizationRequest** | **UpdateEmailCustomizationRequest**|  |


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Email Customization configuration successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Unauthorized access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **validateEmailCustomization**
> void validateEmailCustomization()

 Version: 10.10.0.cl or later   Validates the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Example


```typescript
import { createBearerAuthenticationConfig, EmailCustomizationApi, ValidateEmailCustomizationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new EmailCustomizationApi(configuration);

apiInstance.validateEmailCustomization().then((data:any) => {
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

