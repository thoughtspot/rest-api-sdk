# ThoughtSpot.RestApi.Sdk.Api.ConnectionConfigurationsApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ConnectionConfigurationSearch**](ConnectionConfigurationsApi.md#connectionconfigurationsearch) | **POST** /api/rest/2.0/connection-configurations/search |  |
| [**CreateConnectionConfiguration**](ConnectionConfigurationsApi.md#createconnectionconfiguration) | **POST** /api/rest/2.0/connection-configurations/create |  |
| [**DeleteConnectionConfiguration**](ConnectionConfigurationsApi.md#deleteconnectionconfiguration) | **POST** /api/rest/2.0/connection-configurations/delete |  |
| [**UpdateConnectionConfiguration**](ConnectionConfigurationsApi.md#updateconnectionconfiguration) | **POST** /api/rest/2.0/connection-configurations/{configuration_identifier}/update |  |

<a id="connectionconfigurationsearch"></a>
# **ConnectionConfigurationSearch**
> List&lt;ConnectionConfigurationResponse&gt; ConnectionConfigurationSearch (ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest)



  Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ConnectionConfigurationSearchExample
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
            var apiInstance = new ConnectionConfigurationsApi(httpClient, config, httpClientHandler);
            var connectionConfigurationSearchRequest = new ConnectionConfigurationSearchRequest(); // ConnectionConfigurationSearchRequest | 

            try
            {
                List<ConnectionConfigurationResponse> result = apiInstance.ConnectionConfigurationSearch(connectionConfigurationSearchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ConnectionConfigurationsApi.ConnectionConfigurationSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ConnectionConfigurationSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<ConnectionConfigurationResponse>> response = apiInstance.ConnectionConfigurationSearchWithHttpInfo(connectionConfigurationSearchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ConnectionConfigurationsApi.ConnectionConfigurationSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionConfigurationSearchRequest** | [**ConnectionConfigurationSearchRequest**](ConnectionConfigurationSearchRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createconnectionconfiguration"></a>
# **CreateConnectionConfiguration**
> ConnectionConfigurationResponse CreateConnectionConfiguration (CreateConnectionConfigurationRequest createConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in `configuration`. The following example shows the configuration attributes:   ```    {      \"user\":\"DEV_USER\",      \"password\":\"TestConn123\",      \"role\":\"DEV\",      \"warehouse\":\"DEV_WH\"     }   ```  * If the `policy_type` is `PRINCIPALS`, then `policy_principals` is a required field. * If the `policy_type` is `PROCESSES`, then `policy_processes` is a required field. * If the `policy_type` is `NO_POLICY`, then `policy_principals` and `policy_processes` are not required fields.  #### Parameterized Connection Support For parameterized connections that use OAuth authentication, only the same_as_parent and policy_process_options  attributes are allowed in the API request. These attributes are not applicable to connections that are not parameterized.       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateConnectionConfigurationExample
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
            var apiInstance = new ConnectionConfigurationsApi(httpClient, config, httpClientHandler);
            var createConnectionConfigurationRequest = new CreateConnectionConfigurationRequest(); // CreateConnectionConfigurationRequest | 

            try
            {
                ConnectionConfigurationResponse result = apiInstance.CreateConnectionConfiguration(createConnectionConfigurationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ConnectionConfigurationsApi.CreateConnectionConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateConnectionConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ConnectionConfigurationResponse> response = apiInstance.CreateConnectionConfigurationWithHttpInfo(createConnectionConfigurationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ConnectionConfigurationsApi.CreateConnectionConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createConnectionConfigurationRequest** | [**CreateConnectionConfigurationRequest**](CreateConnectionConfigurationRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteconnectionconfiguration"></a>
# **DeleteConnectionConfiguration**
> void DeleteConnectionConfiguration (DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteConnectionConfigurationExample
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
            var apiInstance = new ConnectionConfigurationsApi(httpClient, config, httpClientHandler);
            var deleteConnectionConfigurationRequest = new DeleteConnectionConfigurationRequest(); // DeleteConnectionConfigurationRequest | 

            try
            {
                apiInstance.DeleteConnectionConfiguration(deleteConnectionConfigurationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ConnectionConfigurationsApi.DeleteConnectionConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteConnectionConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteConnectionConfigurationWithHttpInfo(deleteConnectionConfigurationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ConnectionConfigurationsApi.DeleteConnectionConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteConnectionConfigurationRequest** | [**DeleteConnectionConfigurationRequest**](DeleteConnectionConfigurationRequest.md) |  |  |

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
| **204** | Connection Configurations successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateconnectionconfiguration"></a>
# **UpdateConnectionConfiguration**
> void UpdateConnectionConfiguration (string configurationIdentifier, UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the `policy_type`  * Edit the type of authentication  * Enable or disable a configuration  #### Parameterized Connection Support For parameterized oauth based connections, only the `same_as_parent` and `policy_process_options` attributes are allowed. These attributes are not applicable to connections that are not parameterized.   **NOTE**: When updating a configuration where `disabled` is `true`, you must reset `disabled` to `true` in your update request payload. If not explicitly set again, the API will default `disabled` to `false`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateConnectionConfigurationExample
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
            var apiInstance = new ConnectionConfigurationsApi(httpClient, config, httpClientHandler);
            var configurationIdentifier = "configurationIdentifier_example";  // string | Unique ID or name of the configuration.
            var updateConnectionConfigurationRequest = new UpdateConnectionConfigurationRequest(); // UpdateConnectionConfigurationRequest | 

            try
            {
                apiInstance.UpdateConnectionConfiguration(configurationIdentifier, updateConnectionConfigurationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ConnectionConfigurationsApi.UpdateConnectionConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateConnectionConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateConnectionConfigurationWithHttpInfo(configurationIdentifier, updateConnectionConfigurationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ConnectionConfigurationsApi.UpdateConnectionConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **configurationIdentifier** | **string** | Unique ID or name of the configuration. |  |
| **updateConnectionConfigurationRequest** | [**UpdateConnectionConfigurationRequest**](UpdateConnectionConfigurationRequest.md) |  |  |

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
| **204** | Connection configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

