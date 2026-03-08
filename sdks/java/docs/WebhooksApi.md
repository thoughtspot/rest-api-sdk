# WebhooksApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createWebhookConfiguration**](WebhooksApi.md#createWebhookConfiguration) | **POST** /api/rest/2.0/webhooks/create |
| [**deleteWebhookConfigurations**](WebhooksApi.md#deleteWebhookConfigurations) | **POST** /api/rest/2.0/webhooks/delete |
| [**searchWebhookConfigurations**](WebhooksApi.md#searchWebhookConfigurations) | **POST** /api/rest/2.0/webhooks/search |
| [**updateWebhookConfiguration**](WebhooksApi.md#updateWebhookConfiguration) | **POST** /api/rest/2.0/webhooks/{webhook_identifier}/update |


<a id="createWebhookConfiguration"></a>
# **createWebhookConfiguration**
> WebhookResponse createWebhookConfiguration(createWebhookConfigurationRequest)



 Version: 10.14.0.cl or later   Creates a new webhook configuration to receive notifications for specified events. The webhook will be triggered when the configured events occur in the system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createWebhookConfigurationRequest** | [**CreateWebhookConfigurationRequest**](CreateWebhookConfigurationRequest.md)

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook configuration created successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteWebhookConfigurations"></a>
# **deleteWebhookConfigurations**
> WebhookDeleteResponse deleteWebhookConfigurations(deleteWebhookConfigurationsRequest)



 Version: 10.14.0.cl or later   Deletes one or more webhook configurations by their unique id or name. Returns status of each deletion operation, including successfully deleted webhooks and any failures with error details.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteWebhookConfigurationsRequest** | [**DeleteWebhookConfigurationsRequest**](DeleteWebhookConfigurationsRequest.md)

### Return type

[**WebhookDeleteResponse**](WebhookDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook configurations deleted successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchWebhookConfigurations"></a>
# **searchWebhookConfigurations**
> WebhookSearchResponse searchWebhookConfigurations(searchWebhookConfigurationsRequest)



 Version: 10.14.0.cl or later   Searches for webhook configurations based on various criteria such as Org, webhook identifier, event type, with support for pagination and sorting. Returns matching webhook configurations with their complete details.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchWebhookConfigurationsRequest** | [**SearchWebhookConfigurationsRequest**](SearchWebhookConfigurationsRequest.md)

### Return type

[**WebhookSearchResponse**](WebhookSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook configurations retrieved successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateWebhookConfiguration"></a>
# **updateWebhookConfiguration**
> updateWebhookConfiguration(webhookIdentifier, updateWebhookConfigurationRequest)



 Version: 10.14.0.cl or later   Updates an existing webhook configuration by its unique id or name. Only the provided fields will be updated.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **webhookIdentifier** | **String**
| **updateWebhookConfigurationRequest** | [**UpdateWebhookConfigurationRequest**](UpdateWebhookConfigurationRequest.md)

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
| **204** | Webhook configuration updated successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

