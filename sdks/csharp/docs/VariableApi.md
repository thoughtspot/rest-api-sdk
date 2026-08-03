# ThoughtSpot.RestApi.Sdk.Api.VariableApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateVariable**](VariableApi.md#createvariable) | **POST** /api/rest/2.0/template/variables/create |  |
| [**DeleteVariable**](VariableApi.md#deletevariable) | **POST** /api/rest/2.0/template/variables/{identifier}/delete |  |
| [**DeleteVariables**](VariableApi.md#deletevariables) | **POST** /api/rest/2.0/template/variables/delete |  |
| [**PutVariableValues**](VariableApi.md#putvariablevalues) | **POST** /api/rest/2.0/template/variables/{identifier}/update-values |  |
| [**SearchVariables**](VariableApi.md#searchvariables) | **POST** /api/rest/2.0/template/variables/search |  |
| [**UpdateVariable**](VariableApi.md#updatevariable) | **POST** /api/rest/2.0/template/variables/{identifier}/update |  |
| [**UpdateVariableValues**](VariableApi.md#updatevariablevalues) | **POST** /api/rest/2.0/template/variables/update-values |  |

<a id="createvariable"></a>
# **CreateVariable**
> Variable CreateVariable (CreateVariableRequest createVariableRequest)



 Create a variable which can be used for parameterizing metadata objects    Version: 26.4.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this. * FORMULA_VARIABLE - For Formula variables, introduced in 10.15.0.cl  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The data type of the variable, only specify for formula variables (defaults to null)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid     

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
    public class CreateVariableExample
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
            var apiInstance = new VariableApi(httpClient, config, httpClientHandler);
            var createVariableRequest = new CreateVariableRequest(); // CreateVariableRequest | 

            try
            {
                Variable result = apiInstance.CreateVariable(createVariableRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VariableApi.CreateVariable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateVariableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Variable> response = apiInstance.CreateVariableWithHttpInfo(createVariableRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VariableApi.CreateVariableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createVariableRequest** | [**CreateVariableRequest**](CreateVariableRequest.md) |  |  |

### Return type

[**Variable**](Variable.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create variable is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletevariable"></a>
# **DeleteVariable**
> void DeleteVariable (string identifier)



 Delete a variable    Version: 10.14.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/template/variables/delete](/api/rest/2.0/template/variables/delete) instead.  Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn't exist * The variable is being used by other objects      

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
    public class DeleteVariableExample
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
            var apiInstance = new VariableApi(httpClient, config, httpClientHandler);
            var identifier = "identifier_example";  // string | Unique id or name of the variable

            try
            {
                apiInstance.DeleteVariable(identifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VariableApi.DeleteVariable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteVariableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteVariableWithHttpInfo(identifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VariableApi.DeleteVariableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **identifier** | **string** | Unique id or name of the variable |  |

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
| **204** | Deleting the variable is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletevariables"></a>
# **DeleteVariables**
> void DeleteVariables (DeleteVariablesRequest deleteVariablesRequest)



 Delete variable(s)    Version: 26.4.0.cl or later   Allows deleting multiple variables from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifiers (IDs or names)  The operation will fail if: * The user lacks required permissions * Any of the variables don't exist * Any of the variables are being used by other objects      

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
    public class DeleteVariablesExample
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
            var apiInstance = new VariableApi(httpClient, config, httpClientHandler);
            var deleteVariablesRequest = new DeleteVariablesRequest(); // DeleteVariablesRequest | 

            try
            {
                apiInstance.DeleteVariables(deleteVariablesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VariableApi.DeleteVariables: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteVariablesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteVariablesWithHttpInfo(deleteVariablesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VariableApi.DeleteVariablesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteVariablesRequest** | [**DeleteVariablesRequest**](DeleteVariablesRequest.md) |  |  |

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
| **204** | Deletion of variable(s) is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="putvariablevalues"></a>
# **PutVariableValues**
> void PutVariableValues (string identifier, PutVariableValuesRequest putVariableValuesRequest)



 Update values for a variable    Version: 26.4.0.cl or later   Allows updating values for a specific variable in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to the variable * Replacing existing values * Deleting values from the variable * Resetting all values  When updating variable values, you need to specify: * The variable identifier (ID or name) * The values to add/replace/remove * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constraints for the given variable, scope is ignored      

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
    public class PutVariableValuesExample
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
            var apiInstance = new VariableApi(httpClient, config, httpClientHandler);
            var identifier = "identifier_example";  // string | Unique ID or name of the variable
            var putVariableValuesRequest = new PutVariableValuesRequest(); // PutVariableValuesRequest | 

            try
            {
                apiInstance.PutVariableValues(identifier, putVariableValuesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VariableApi.PutVariableValues: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PutVariableValuesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.PutVariableValuesWithHttpInfo(identifier, putVariableValuesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VariableApi.PutVariableValuesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **identifier** | **string** | Unique ID or name of the variable |  |
| **putVariableValuesRequest** | [**PutVariableValuesRequest**](PutVariableValuesRequest.md) |  |  |

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
| **204** | Variable values updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchvariables"></a>
# **SearchVariables**
> List&lt;Variable&gt; SearchVariables (SearchVariablesRequest searchVariablesRequest)



 Search variables    Version: 26.4.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values  The values can be filtered by scope: * org_identifier * principal_identifier * model_identifier      

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
    public class SearchVariablesExample
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
            var apiInstance = new VariableApi(httpClient, config, httpClientHandler);
            var searchVariablesRequest = new SearchVariablesRequest(); // SearchVariablesRequest | 

            try
            {
                List<Variable> result = apiInstance.SearchVariables(searchVariablesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VariableApi.SearchVariables: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchVariablesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Variable>> response = apiInstance.SearchVariablesWithHttpInfo(searchVariablesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VariableApi.SearchVariablesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchVariablesRequest** | [**SearchVariablesRequest**](SearchVariablesRequest.md) |  |  |

### Return type

[**List&lt;Variable&gt;**](Variable.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of variables is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatevariable"></a>
# **UpdateVariable**
> void UpdateVariable (string identifier, UpdateVariableRequest updateVariableRequest)



 Update a variable's name    Version: 26.4.0.cl or later   Allows updating a variable's name in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows updating: * The variable name     

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
    public class UpdateVariableExample
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
            var apiInstance = new VariableApi(httpClient, config, httpClientHandler);
            var identifier = "identifier_example";  // string | Unique id or name of the variable to update.
            var updateVariableRequest = new UpdateVariableRequest(); // UpdateVariableRequest | 

            try
            {
                apiInstance.UpdateVariable(identifier, updateVariableRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VariableApi.UpdateVariable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateVariableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateVariableWithHttpInfo(identifier, updateVariableRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VariableApi.UpdateVariableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **identifier** | **string** | Unique id or name of the variable to update. |  |
| **updateVariableRequest** | [**UpdateVariableRequest**](UpdateVariableRequest.md) |  |  |

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
| **204** | Variable name updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatevariablevalues"></a>
# **UpdateVariableValues**
> void UpdateVariableValues (UpdateVariableValuesRequest updateVariableValuesRequest)



 Update values for multiple variables    Version: 10.14.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/template/variables/{identifier}/update-values](/api/rest/2.0/template/variables/%7Bidentifier%7D/update-values) instead.  Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constrains for a given variable, scope is ignored      

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
    public class UpdateVariableValuesExample
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
            var apiInstance = new VariableApi(httpClient, config, httpClientHandler);
            var updateVariableValuesRequest = new UpdateVariableValuesRequest(); // UpdateVariableValuesRequest | 

            try
            {
                apiInstance.UpdateVariableValues(updateVariableValuesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VariableApi.UpdateVariableValues: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateVariableValuesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateVariableValuesWithHttpInfo(updateVariableValuesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling VariableApi.UpdateVariableValuesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateVariableValuesRequest** | [**UpdateVariableValuesRequest**](UpdateVariableValuesRequest.md) |  |  |

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
| **204** | Variable values updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

