# ThoughtSpot.RestApi.Sdk.Api.SemanticIntegrationsApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateSemanticIntegration**](SemanticIntegrationsApi.md#createsemanticintegration) | **POST** /api/rest/2.0/semantic-integrations/create |  |
| [**DeleteSemanticIntegration**](SemanticIntegrationsApi.md#deletesemanticintegration) | **POST** /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/delete |  |
| [**ImportSemanticIntegration**](SemanticIntegrationsApi.md#importsemanticintegration) | **POST** /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/import |  |
| [**SearchSemanticIntegrations**](SemanticIntegrationsApi.md#searchsemanticintegrations) | **POST** /api/rest/2.0/semantic-integrations/search |  |

<a id="createsemanticintegration"></a>
# **CreateSemanticIntegration**
> SemanticIntegrationResponse CreateSemanticIntegration (CreateSemanticIntegrationRequest createSemanticIntegrationRequest)



  Version: 26.9.0.cl or later   Creates a new semantic integration in ThoughtSpot from a CDW semantic view.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About create semantic integration  A semantic integration imports an externally defined semantic view from a Cloud Data Warehouse (CDW) into ThoughtSpot. The API resolves the source semantic view from the specified `connection_identifier`, `database_name`, `schema_name`, and `semantic_view_name`, generates a ThoughtSpot model from it, and returns the model GUID along with a per-formula import report (`semantic_report`) summarizing how many formulas were successfully imported, failed, or skipped.  - `connection_identifier`, `name`, `database_name`, `schema_name`, `semantic_view_name`, and `type` are required. - `name` must be unique across the user's organization. The integration's display name is also used as the generated model name. - Supported `type` values are listed in the `SemanticIntegrationType` enum. - The response includes a `semantic_report.summary` with `total`, `imported`, `failed`, and `skipped` counts, and a `formulas` array with the per-formula translation details.  > **Note:** Creating a semantic integration using a YAML file upload is not supported through the public API.      

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
    public class CreateSemanticIntegrationExample
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
            var apiInstance = new SemanticIntegrationsApi(httpClient, config, httpClientHandler);
            var createSemanticIntegrationRequest = new CreateSemanticIntegrationRequest(); // CreateSemanticIntegrationRequest | 

            try
            {
                SemanticIntegrationResponse result = apiInstance.CreateSemanticIntegration(createSemanticIntegrationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticIntegrationsApi.CreateSemanticIntegration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateSemanticIntegrationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SemanticIntegrationResponse> response = apiInstance.CreateSemanticIntegrationWithHttpInfo(createSemanticIntegrationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticIntegrationsApi.CreateSemanticIntegrationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createSemanticIntegrationRequest** | [**CreateSemanticIntegrationRequest**](CreateSemanticIntegrationRequest.md) |  |  |

### Return type

[**SemanticIntegrationResponse**](SemanticIntegrationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Semantic integration created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Connection not found. |  -  |
| **409** | Duplicate integration name. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletesemanticintegration"></a>
# **DeleteSemanticIntegration**
> void DeleteSemanticIntegration (string semanticIntegrationIdentifier)



  Version: 26.9.0.cl or later   Deletes a semantic integration and its associated ThoughtSpot model.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About delete semantic integration  Removes the specified semantic integration and its generated ThoughtSpot model from the system.  - `semantic_integration_identifier` is the GUID or name of the integration to delete. - Deletions cannot be undone. Re-import the integration with `createSemanticIntegration` if needed.      

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
    public class DeleteSemanticIntegrationExample
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
            var apiInstance = new SemanticIntegrationsApi(httpClient, config, httpClientHandler);
            var semanticIntegrationIdentifier = "semanticIntegrationIdentifier_example";  // string | ID or name of the semantic integration to delete.

            try
            {
                apiInstance.DeleteSemanticIntegration(semanticIntegrationIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticIntegrationsApi.DeleteSemanticIntegration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteSemanticIntegrationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteSemanticIntegrationWithHttpInfo(semanticIntegrationIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticIntegrationsApi.DeleteSemanticIntegrationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **semanticIntegrationIdentifier** | **string** | ID or name of the semantic integration to delete. |  |

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
| **204** | Semantic integration deleted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importsemanticintegration"></a>
# **ImportSemanticIntegration**
> SemanticIntegrationResponse ImportSemanticIntegration (string semanticIntegrationIdentifier)



  Version: 26.9.0.cl or later   Imports semantic updates for an existing semantic integration from its CDW source and refreshes the associated ThoughtSpot model.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About import semantic integration  Re-imports the semantic view from the CDW for the specified integration and rebuilds the corresponding ThoughtSpot model. Use this after the source semantic view has been updated in the CDW (added, removed, or modified formulas, dimensions, or measures) to bring the ThoughtSpot model back in line.  - `semantic_integration_identifier` is the GUID or name of the integration to import updates for. - Import preserves the integration's GUID, name, and `model_id`; only the underlying formula set is refreshed. - The response includes the same `semantic_report` as create, with an additional `change_status` per formula indicating whether each formula is `NEW`, `UPDATED`, or `UNCHANGED` since the previous import.  > **Note:** Importing updates for a semantic integration that was created using the file upload option in the ThoughtSpot UI is not supported. To refresh a file-upload-based integration, use the ThoughtSpot UI.      

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
    public class ImportSemanticIntegrationExample
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
            var apiInstance = new SemanticIntegrationsApi(httpClient, config, httpClientHandler);
            var semanticIntegrationIdentifier = "semanticIntegrationIdentifier_example";  // string | ID or name of the semantic integration to import updates for.

            try
            {
                SemanticIntegrationResponse result = apiInstance.ImportSemanticIntegration(semanticIntegrationIdentifier);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticIntegrationsApi.ImportSemanticIntegration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportSemanticIntegrationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SemanticIntegrationResponse> response = apiInstance.ImportSemanticIntegrationWithHttpInfo(semanticIntegrationIdentifier);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticIntegrationsApi.ImportSemanticIntegrationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **semanticIntegrationIdentifier** | **string** | ID or name of the semantic integration to import updates for. |  |

### Return type

[**SemanticIntegrationResponse**](SemanticIntegrationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Semantic integration imported successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Semantic integration not found. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchsemanticintegrations"></a>
# **SearchSemanticIntegrations**
> List&lt;SemanticIntegrationSearchResponse&gt; SearchSemanticIntegrations (SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest)



  Version: 26.9.0.cl or later   Searches and lists semantic integrations available to the authenticated user in the current organization, with optional filters, sort, and pagination.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - **Can manage data models**  #### About search semantic integrations  Returns a paginated batch of semantic integrations, each with its identifier, name, description, source connection, generated model identifier, author, creation/modification timestamps, and associated tags. Use the filters to narrow results by author, connection, tag, or name pattern.  - `pattern` matches the integration name as a case-insensitive substring. - `author_identifiers` and `connection_identifiers` accept either GUIDs or names. - `sort_options.field_name` defaults to `MODIFIED_TIME`; set `sort_options.order` to `ASC` or `DESC` to control sort direction. - `record_offset` and `record_size` control pagination. Use `record_size: 0` to return all matching records in a single response.      

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
    public class SearchSemanticIntegrationsExample
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
            var apiInstance = new SemanticIntegrationsApi(httpClient, config, httpClientHandler);
            var searchSemanticIntegrationsRequest = new SearchSemanticIntegrationsRequest(); // SearchSemanticIntegrationsRequest | 

            try
            {
                List<SemanticIntegrationSearchResponse> result = apiInstance.SearchSemanticIntegrations(searchSemanticIntegrationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SemanticIntegrationsApi.SearchSemanticIntegrations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchSemanticIntegrationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<SemanticIntegrationSearchResponse>> response = apiInstance.SearchSemanticIntegrationsWithHttpInfo(searchSemanticIntegrationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SemanticIntegrationsApi.SearchSemanticIntegrationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchSemanticIntegrationsRequest** | [**SearchSemanticIntegrationsRequest**](SearchSemanticIntegrationsRequest.md) |  |  |

### Return type

[**List&lt;SemanticIntegrationSearchResponse&gt;**](SemanticIntegrationSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Semantic integrations retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

