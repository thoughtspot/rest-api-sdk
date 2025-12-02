# ConnectionConfigurationsApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**connectionConfigurationSearch**](ConnectionConfigurationsApi.md#connectionConfigurationSearch) | **POST** /api/rest/2.0/connection-configurations/search |
| [**createConnectionConfiguration**](ConnectionConfigurationsApi.md#createConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/create |
| [**deleteConnectionConfiguration**](ConnectionConfigurationsApi.md#deleteConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/delete |
| [**updateConnectionConfiguration**](ConnectionConfigurationsApi.md#updateConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/{configuration_identifier}/update |


<a id="connectionConfigurationSearch"></a>
# **connectionConfigurationSearch**
> List&lt;ConnectionConfigurationResponse&gt; connectionConfigurationSearch(connectionConfigurationSearchRequest)



  Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionConfigurationSearchRequest** | [**ConnectionConfigurationSearchRequest**](ConnectionConfigurationSearchRequest.md)

### Return type

[**List&lt;ConnectionConfigurationResponse&gt;**](ConnectionConfigurationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Configuration fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createConnectionConfiguration"></a>
# **createConnectionConfiguration**
> ConnectionConfigurationResponse createConnectionConfiguration(createConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in &#x60;configuration&#x60;. The following example shows the configuration attributes:   &#x60;&#x60;&#x60;    {      \&quot;user\&quot;:\&quot;DEV_USER\&quot;,      \&quot;password\&quot;:\&quot;TestConn123\&quot;,      \&quot;role\&quot;:\&quot;DEV\&quot;,      \&quot;warehouse\&quot;:\&quot;DEV_WH\&quot;     }   &#x60;&#x60;&#x60;  * If the &#x60;policy_type&#x60; is &#x60;PRINCIPALS&#x60;, then &#x60;policy_principals&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;PROCESSES&#x60;, then &#x60;policy_processes&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;NO_POLICY&#x60;, then &#x60;policy_principals&#x60; and &#x60;policy_processes&#x60; are not required fields.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createConnectionConfigurationRequest** | [**CreateConnectionConfigurationRequest**](CreateConnectionConfigurationRequest.md)

### Return type

[**ConnectionConfigurationResponse**](ConnectionConfigurationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection configuration successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteConnectionConfiguration"></a>
# **deleteConnectionConfiguration**
> deleteConnectionConfiguration(deleteConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteConnectionConfigurationRequest** | [**DeleteConnectionConfigurationRequest**](DeleteConnectionConfigurationRequest.md)

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
| **204** | Connection Configurations successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateConnectionConfiguration"></a>
# **updateConnectionConfiguration**
> updateConnectionConfiguration(configurationIdentifier, updateConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the &#x60;policy_type&#x60;  * Edit the type of authentication  * Enable or disable a configuration   **NOTE**: When updating a configuration where &#x60;disabled&#x60; is &#x60;true&#x60;, you must reset &#x60;disabled&#x60; to &#x60;true&#x60; in your update request payload. If not explicitly set again, the API will default &#x60;disabled&#x60; to &#x60;false&#x60;.       

### Parameters

| Name | Type |
|------------- | ------------- |
| **configurationIdentifier** | **String**
| **updateConnectionConfigurationRequest** | [**UpdateConnectionConfigurationRequest**](UpdateConnectionConfigurationRequest.md)

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
| **204** | Connection configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

