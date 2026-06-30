# ThoughtSpotRestApiSdk.ConnectionConfigurationsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionConfigurationSearch**](ConnectionConfigurationsApi.md#connectionConfigurationSearch) | **POST** /api/rest/2.0/connection-configurations/search | 
[**createConnectionConfiguration**](ConnectionConfigurationsApi.md#createConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/create | 
[**deleteConnectionConfiguration**](ConnectionConfigurationsApi.md#deleteConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/delete | 
[**updateConnectionConfiguration**](ConnectionConfigurationsApi.md#updateConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/{configuration_identifier}/update | 


# **connectionConfigurationSearch**
> Array<ConnectionConfigurationResponse> connectionConfigurationSearch(connectionConfigurationSearchRequest)

  Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionConfigurationsApi, ConnectionConfigurationSearchRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionConfigurationsApi(configuration);

apiInstance.connectionConfigurationSearch(
  // ConnectionConfigurationSearchRequest
  {
    connection_identifier: "connection_identifier_example",
    configuration_identifier: "configuration_identifier_example",
    policy_type: "NO_POLICY",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionConfigurationSearchRequest** | **ConnectionConfigurationSearchRequest**|  |


### Return type

**Array<ConnectionConfigurationResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Configuration fetched successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createConnectionConfiguration**
> ConnectionConfigurationResponse createConnectionConfiguration(createConnectionConfigurationRequest)

  Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in `configuration`. The following example shows the configuration attributes:   ```    {      \"user\":\"DEV_USER\",      \"password\":\"TestConn123\",      \"role\":\"DEV\",      \"warehouse\":\"DEV_WH\"     }   ```  * If the `policy_type` is `PRINCIPALS`, then `policy_principals` is a required field. * If the `policy_type` is `PROCESSES`, then `policy_processes` is a required field. * If the `policy_type` is `NO_POLICY`, then `policy_principals` and `policy_processes` are not required fields.  #### Parameterized Connection Support For parameterized connections that use OAuth authentication, only the same_as_parent and policy_process_options  attributes are allowed in the API request. These attributes are not applicable to connections that are not parameterized.       

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionConfigurationsApi, CreateConnectionConfigurationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionConfigurationsApi(configuration);

apiInstance.createConnectionConfiguration(
  // CreateConnectionConfigurationRequest
  {
    name: "name_example",
    description: "description_example",
    connection_identifier: "connection_identifier_example",
    same_as_parent: false,
    policy_process_options: null,
    authentication_type: "SERVICE_ACCOUNT",
    configuration: {},
    policy_type: "NO_POLICY",
    policy_principals: [
      "policy_principals_example",
    ],
    policy_processes: [
      "SAGE_INDEXING",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConnectionConfigurationRequest** | **CreateConnectionConfigurationRequest**|  |


### Return type

**ConnectionConfigurationResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Connection configuration successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteConnectionConfiguration**
> void deleteConnectionConfiguration(deleteConnectionConfigurationRequest)

  Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionConfigurationsApi, DeleteConnectionConfigurationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionConfigurationsApi(configuration);

apiInstance.deleteConnectionConfiguration(
  // DeleteConnectionConfigurationRequest
  {
    configuration_identifier: "configuration_identifier_example",
    connection_identifier: "connection_identifier_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteConnectionConfigurationRequest** | **DeleteConnectionConfigurationRequest**|  |


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
**204** | Connection Configurations successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateConnectionConfiguration**
> void updateConnectionConfiguration(updateConnectionConfigurationRequest)

  Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the `policy_type`  * Edit the type of authentication  * Enable or disable a configuration  #### Parameterized Connection Support For parameterized oauth based connections, only the `same_as_parent` and `policy_process_options` attributes are allowed. These attributes are not applicable to connections that are not parameterized.   **NOTE**: When updating a configuration where `disabled` is `true`, you must reset `disabled` to `true` in your update request payload. If not explicitly set again, the API will default `disabled` to `false`.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionConfigurationsApi, UpdateConnectionConfigurationRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionConfigurationsApi(configuration);

apiInstance.updateConnectionConfiguration(
  // string | Unique ID or name of the configuration.
  "configuration_identifier_example" , 
  // UpdateConnectionConfigurationRequest
  {
    connection_identifier: "connection_identifier_example",
    name: "name_example",
    description: "description_example",
    same_as_parent: false,
    policy_process_options: null,
    authentication_type: "SERVICE_ACCOUNT",
    configuration: {},
    policy_type: "NO_POLICY",
    policy_principals: [
      "policy_principals_example",
    ],
    policy_processes: [
      "SAGE_INDEXING",
    ],
    disable: false,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConnectionConfigurationRequest** | **UpdateConnectionConfigurationRequest**|  |
 **configurationIdentifier** | [**string**] | Unique ID or name of the configuration. | defaults to undefined


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
**204** | Connection configuration successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

