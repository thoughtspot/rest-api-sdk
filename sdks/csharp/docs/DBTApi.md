# ThoughtSpot.RestApi.Sdk.Api.DBTApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DbtConnection**](DBTApi.md#dbtconnection) | **POST** /api/rest/2.0/dbt/dbt-connection |  |
| [**DbtGenerateSyncTml**](DBTApi.md#dbtgeneratesynctml) | **POST** /api/rest/2.0/dbt/generate-sync-tml |  |
| [**DbtGenerateTml**](DBTApi.md#dbtgeneratetml) | **POST** /api/rest/2.0/dbt/generate-tml |  |
| [**DbtSearch**](DBTApi.md#dbtsearch) | **POST** /api/rest/2.0/dbt/search |  |
| [**DeleteDbtConnection**](DBTApi.md#deletedbtconnection) | **POST** /api/rest/2.0/dbt/{dbt_connection_identifier}/delete |  |
| [**UpdateDbtConnection**](DBTApi.md#updatedbtconnection) | **POST** /api/rest/2.0/dbt/update-dbt-connection |  |

<a id="dbtconnection"></a>
# **DbtConnection**
> Object DbtConnection (string connectionName, string databaseName, string? importType = null, string? accessToken = null, string? dbtUrl = null, string? accountId = null, string? projectId = null, string? dbtEnvId = null, string? projectName = null, FileParameter? fileContent = null)



  Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      

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
    public class DbtConnectionExample
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
            var apiInstance = new DBTApi(httpClient, config, httpClientHandler);
            var connectionName = "connectionName_example";  // string | Name of the connection.
            var databaseName = "databaseName_example";  // string | Name of the Database.
            var importType = "DBT_CLOUD";  // string? | Mention type of Import (optional)  (default to DBT_CLOUD)
            var accessToken = "accessToken_example";  // string? | Access token is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var dbtUrl = "dbtUrl_example";  // string? | DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var accountId = "accountId_example";  // string? | Account ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var projectId = "projectId_example";  // string? | Project ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var dbtEnvId = "dbtEnvId_example";  // string? | DBT Environment ID\\\" (optional) 
            var projectName = "projectName_example";  // string? | Name of the project (optional) 
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is 'ZIP_FILE' (optional) 

            try
            {
                Object result = apiInstance.DbtConnection(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DBTApi.DbtConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.DbtConnectionWithHttpInfo(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DBTApi.DbtConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionName** | **string** | Name of the connection. |  |
| **databaseName** | **string** | Name of the Database. |  |
| **importType** | **string?** | Mention type of Import | [optional] [default to DBT_CLOUD] |
| **accessToken** | **string?** | Access token is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **dbtUrl** | **string?** | DBT URL is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **accountId** | **string?** | Account ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **projectId** | **string?** | Project ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **dbtEnvId** | **string?** | DBT Environment ID\\\&quot; | [optional]  |
| **projectName** | **string?** | Name of the project | [optional]  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is &#39;ZIP_FILE&#39; | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully created DBT Connection. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="dbtgeneratesynctml"></a>
# **DbtGenerateSyncTml**
> Object DbtGenerateSyncTml (string dbtConnectionIdentifier, FileParameter? fileContent = null, bool? includeSemanticReport = null)



  Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      

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
    public class DbtGenerateSyncTmlExample
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
            var apiInstance = new DBTApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT connection.
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional) 
            var includeSemanticReport = true;  // bool? | If true, includes a `semantic_report` per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. Note: supported only for Snowflake and Databricks connections. (optional) 

            try
            {
                Object result = apiInstance.DbtGenerateSyncTml(dbtConnectionIdentifier, fileContent, includeSemanticReport);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DBTApi.DbtGenerateSyncTml: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtGenerateSyncTmlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.DbtGenerateSyncTmlWithHttpInfo(dbtConnectionIdentifier, fileContent, includeSemanticReport);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DBTApi.DbtGenerateSyncTmlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT connection. |  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ | [optional]  |
| **includeSemanticReport** | **bool?** | If true, includes a &#x60;semantic_report&#x60; per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. Note: supported only for Snowflake and Databricks connections. | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync Table and Worksheet TML&#39;s are successfully generated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="dbtgeneratetml"></a>
# **DbtGenerateTml**
> Object DbtGenerateTml (string dbtConnectionIdentifier, string modelTables, string importWorksheets, string? worksheets = null, FileParameter? fileContent = null, bool? includeSemanticReport = null)



  Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      

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
    public class DbtGenerateTmlExample
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
            var apiInstance = new DBTApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT connection.
            var modelTables = "modelTables_example";  // string | List of Models and their respective Tables Example: '[{\\\"model_name\\\": \\\"model_name\\\", \\\"model_path\\\": \\\"model_path\\\", \\\"tables\\\": [\\\"table_name\\\"]}]'
            var importWorksheets = "ALL";  // string | Mention the worksheet tmls to import
            var worksheets = "worksheets_example";  // string? | List of worksheets is mandatory when import_Worksheets is type SELECTED Example: [\\\"worksheet_name\\\"] (optional) 
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional) 
            var includeSemanticReport = true;  // bool? | If true, includes a `semantic_report` per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. Note: supported only for Snowflake and Databricks connections. (optional) 

            try
            {
                Object result = apiInstance.DbtGenerateTml(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent, includeSemanticReport);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DBTApi.DbtGenerateTml: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtGenerateTmlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.DbtGenerateTmlWithHttpInfo(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent, includeSemanticReport);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DBTApi.DbtGenerateTmlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT connection. |  |
| **modelTables** | **string** | List of Models and their respective Tables Example: &#39;[{\\\&quot;model_name\\\&quot;: \\\&quot;model_name\\\&quot;, \\\&quot;model_path\\\&quot;: \\\&quot;model_path\\\&quot;, \\\&quot;tables\\\&quot;: [\\\&quot;table_name\\\&quot;]}]&#39; |  |
| **importWorksheets** | **string** | Mention the worksheet tmls to import |  |
| **worksheets** | **string?** | List of worksheets is mandatory when import_Worksheets is type SELECTED Example: [\\\&quot;worksheet_name\\\&quot;] | [optional]  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ | [optional]  |
| **includeSemanticReport** | **bool?** | If true, includes a &#x60;semantic_report&#x60; per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. Note: supported only for Snowflake and Databricks connections. | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Required Table and Worksheet TML&#39;s are successfully generated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="dbtsearch"></a>
# **DbtSearch**
> List&lt;DbtSearchResponse&gt; DbtSearch ()



  Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      

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
    public class DbtSearchExample
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
            var apiInstance = new DBTApi(httpClient, config, httpClientHandler);

            try
            {
                List<DbtSearchResponse> result = apiInstance.DbtSearch();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DBTApi.DbtSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<DbtSearchResponse>> response = apiInstance.DbtSearchWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DBTApi.DbtSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;DbtSearchResponse&gt;**](DbtSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved list of DBT connections successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletedbtconnection"></a>
# **DeleteDbtConnection**
> void DeleteDbtConnection (string dbtConnectionIdentifier)



  Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      

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
    public class DeleteDbtConnectionExample
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
            var apiInstance = new DBTApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT Connection.

            try
            {
                apiInstance.DeleteDbtConnection(dbtConnectionIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DBTApi.DeleteDbtConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteDbtConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteDbtConnectionWithHttpInfo(dbtConnectionIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DBTApi.DeleteDbtConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT Connection. |  |

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
| **204** | DBT Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatedbtconnection"></a>
# **UpdateDbtConnection**
> Object UpdateDbtConnection (string dbtConnectionIdentifier, string? connectionName = null, string? databaseName = null, string? importType = null, string? accessToken = null, string? dbtUrl = null, string? accountId = null, string? projectId = null, string? dbtEnvId = null, string? projectName = null, FileParameter? fileContent = null)



  Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      

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
    public class UpdateDbtConnectionExample
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
            var apiInstance = new DBTApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT Connection.
            var connectionName = "connectionName_example";  // string? | Name of the connection. (optional) 
            var databaseName = "databaseName_example";  // string? | Name of the Database. (optional) 
            var importType = "DBT_CLOUD";  // string? | Mention type of Import (optional)  (default to DBT_CLOUD)
            var accessToken = "accessToken_example";  // string? | Access token is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var dbtUrl = "dbtUrl_example";  // string? | DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var accountId = "accountId_example";  // string? | Account ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var projectId = "projectId_example";  // string? | Project ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var dbtEnvId = "dbtEnvId_example";  // string? | DBT Environment ID\\\" (optional) 
            var projectName = "projectName_example";  // string? | Name of the project (optional) 
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is 'ZIP_FILE' (optional) 

            try
            {
                Object result = apiInstance.UpdateDbtConnection(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DBTApi.UpdateDbtConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateDbtConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.UpdateDbtConnectionWithHttpInfo(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DBTApi.UpdateDbtConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT Connection. |  |
| **connectionName** | **string?** | Name of the connection. | [optional]  |
| **databaseName** | **string?** | Name of the Database. | [optional]  |
| **importType** | **string?** | Mention type of Import | [optional] [default to DBT_CLOUD] |
| **accessToken** | **string?** | Access token is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **dbtUrl** | **string?** | DBT URL is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **accountId** | **string?** | Account ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **projectId** | **string?** | Project ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **dbtEnvId** | **string?** | DBT Environment ID\\\&quot; | [optional]  |
| **projectName** | **string?** | Name of the project | [optional]  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is &#39;ZIP_FILE&#39; | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DBT Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

