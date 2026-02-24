# ThoughtSpotRestApiSdk.WebhooksApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookConfiguration**](WebhooksApi.md#createWebhookConfiguration) | **POST** /api/rest/2.0/webhooks/create | 
[**deleteWebhookConfigurations**](WebhooksApi.md#deleteWebhookConfigurations) | **POST** /api/rest/2.0/webhooks/delete | 
[**searchWebhookConfigurations**](WebhooksApi.md#searchWebhookConfigurations) | **POST** /api/rest/2.0/webhooks/search | 
[**updateWebhookConfiguration**](WebhooksApi.md#updateWebhookConfiguration) | **POST** /api/rest/2.0/webhooks/{webhook_identifier}/update | 


# **createWebhookConfiguration**
> WebhookResponse createWebhookConfiguration(createWebhookConfigurationRequest)

 Version: 10.14.0.cl or later   Creates a new webhook configuration to receive notifications for specified events. The webhook will be triggered when the configured events occur in the system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example


```typescript
import { createBearerAuthenticationConfig, WebhooksApi, CreateWebhookConfigurationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new WebhooksApi(configuration);

apiInstance.createWebhookConfiguration(
  // CreateWebhookConfigurationRequest
  {
    name: "name_example",
    description: "description_example",
    url: "url_example",
    url_params: {},
    events: [
      "LIVEBOARD_SCHEDULE",
    ],
    authentication: null,
    signature_verification: null,
    storage_destination: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWebhookConfigurationRequest** | **CreateWebhookConfigurationRequest**|  |


### Return type

**WebhookResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Webhook configuration created successfully |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteWebhookConfigurations**
> WebhookDeleteResponse deleteWebhookConfigurations(deleteWebhookConfigurationsRequest)

 Version: 10.14.0.cl or later   Deletes one or more webhook configurations by their unique id or name. Returns status of each deletion operation, including successfully deleted webhooks and any failures with error details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example


```typescript
import { createBearerAuthenticationConfig, WebhooksApi, DeleteWebhookConfigurationsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new WebhooksApi(configuration);

apiInstance.deleteWebhookConfigurations(
  // DeleteWebhookConfigurationsRequest
  {
    webhook_identifiers: [
      "webhook_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteWebhookConfigurationsRequest** | **DeleteWebhookConfigurationsRequest**|  |


### Return type

**WebhookDeleteResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Webhook configurations deleted successfully |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchWebhookConfigurations**
> WebhookSearchResponse searchWebhookConfigurations(searchWebhookConfigurationsRequest)

 Version: 10.14.0.cl or later   Searches for webhook configurations based on various criteria such as Org, webhook identifier, event type, with support for pagination and sorting. Returns matching webhook configurations with their complete details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example


```typescript
import { createBearerAuthenticationConfig, WebhooksApi, SearchWebhookConfigurationsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new WebhooksApi(configuration);

apiInstance.searchWebhookConfigurations(
  // SearchWebhookConfigurationsRequest
  {
    org_identifier: "org_identifier_example",
    webhook_identifier: "webhook_identifier_example",
    event_type: "LIVEBOARD_SCHEDULE",
    record_offset: 0,
    record_size: 50,
    sort_options: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchWebhookConfigurationsRequest** | **SearchWebhookConfigurationsRequest**|  |


### Return type

**WebhookSearchResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Webhook configurations retrieved successfully |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateWebhookConfiguration**
> void updateWebhookConfiguration(updateWebhookConfigurationRequest)

 Version: 10.14.0.cl or later   Updates an existing webhook configuration by its unique id or name. Only the provided fields will be updated.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example


```typescript
import { createBearerAuthenticationConfig, WebhooksApi, UpdateWebhookConfigurationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new WebhooksApi(configuration);

apiInstance.updateWebhookConfiguration(
  // string | Unique ID or name of the webhook configuration.
  "webhook_identifier_example" , 
  // UpdateWebhookConfigurationRequest
  {
    name: "name_example",
    description: "description_example",
    url: "url_example",
    url_params: {},
    events: [
      "LIVEBOARD_SCHEDULE",
    ],
    authentication: null,
    signature_verification: null,
    storage_destination: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateWebhookConfigurationRequest** | **UpdateWebhookConfigurationRequest**|  |
 **webhookIdentifier** | [**string**] | Unique ID or name of the webhook configuration. | defaults to undefined


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
**204** | Webhook configuration updated successfully |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

