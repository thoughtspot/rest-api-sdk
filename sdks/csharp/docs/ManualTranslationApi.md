# ThoughtSpot.RestApi.Sdk.Api.ManualTranslationApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteManualTranslations**](ManualTranslationApi.md#deletemanualtranslations) | **POST** /api/rest/2.0/localizations/manual-translation/delete |  |
| [**ExportManualTranslations**](ManualTranslationApi.md#exportmanualtranslations) | **POST** /api/rest/2.0/localizations/manual-translation/export |  |
| [**GetManualTranslationBundle**](ManualTranslationApi.md#getmanualtranslationbundle) | **POST** /api/rest/2.0/localizations/manual-translation/locales/{locale}/export |  |
| [**ImportManualTranslations**](ManualTranslationApi.md#importmanualtranslations) | **POST** /api/rest/2.0/localizations/manual-translation/import |  |

<a id="deletemanualtranslations"></a>
# **DeleteManualTranslations**
> void DeleteManualTranslations (DeleteManualTranslationsRequest deleteManualTranslationsRequest)



 Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to `ORG` scope if not specified. - Set `scope` to `CLUSTER` to delete translations uploaded in the All-Org context.      

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
    public class DeleteManualTranslationsExample
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
            var apiInstance = new ManualTranslationApi(httpClient, config, httpClientHandler);
            var deleteManualTranslationsRequest = new DeleteManualTranslationsRequest(); // DeleteManualTranslationsRequest | 

            try
            {
                apiInstance.DeleteManualTranslations(deleteManualTranslationsRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ManualTranslationApi.DeleteManualTranslations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteManualTranslationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteManualTranslationsWithHttpInfo(deleteManualTranslationsRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ManualTranslationApi.DeleteManualTranslationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteManualTranslationsRequest** | [**DeleteManualTranslationsRequest**](DeleteManualTranslationsRequest.md) |  |  |

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
| **204** | Successfully deleted manual translations. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportmanualtranslations"></a>
# **ExportManualTranslations**
> FileParameter ExportManualTranslations (ExportManualTranslationsRequest exportManualTranslationsRequest)



 Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: `content`, `locale`, `translated-content`. - Defaults to `ORG` scope if not specified. - Set `scope` to `CLUSTER` to export translations from the All-Org context. - Returns a `404` error if no translations exist for the targeted org or cluster scope.      

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
    public class ExportManualTranslationsExample
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
            var apiInstance = new ManualTranslationApi(httpClient, config, httpClientHandler);
            var exportManualTranslationsRequest = new ExportManualTranslationsRequest(); // ExportManualTranslationsRequest | 

            try
            {
                FileParameter result = apiInstance.ExportManualTranslations(exportManualTranslationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ManualTranslationApi.ExportManualTranslations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportManualTranslationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FileParameter> response = apiInstance.ExportManualTranslationsWithHttpInfo(exportManualTranslationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ManualTranslationApi.ExportManualTranslationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportManualTranslationsRequest** | [**ExportManualTranslationsRequest**](ExportManualTranslationsRequest.md) |  |  |

### Return type

[**FileParameter**](FileParameter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CSV file downloaded successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | No translations file found. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getmanualtranslationbundle"></a>
# **GetManualTranslationBundle**
> Object GetManualTranslationBundle (string locale)



 Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - `locale` parameter must be a hyphenated locale code (for example, `fr-fr`, `de-de`, `JA-JP`). - Returns a JSON object with a `translations` map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty `translations` map (not an error) if no entries exist at either level.      

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
    public class GetManualTranslationBundleExample
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
            var apiInstance = new ManualTranslationApi(httpClient, config, httpClientHandler);
            var locale = "locale_example";  // string | Locale code for which to retrieve translations.  For example, `fr-fr`, `de-de`, `JA-JP`.

            try
            {
                Object result = apiInstance.GetManualTranslationBundle(locale);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ManualTranslationApi.GetManualTranslationBundle: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetManualTranslationBundleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.GetManualTranslationBundleWithHttpInfo(locale);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ManualTranslationApi.GetManualTranslationBundleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **locale** | **string** | Locale code for which to retrieve translations.  For example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;. |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Translation bundle retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | No translations found for the requested locale. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importmanualtranslations"></a>
# **ImportManualTranslations**
> void ImportManualTranslations (FileParameter translationsFile, string? scope = null)



 Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: `content`, `locale`, `translated-content`. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only `.csv` files are accepted. - The import performs an **upsert**: existing entries matched by `(org_id, locale, content)` are updated; new entries are inserted. Entries not in the upload are left untouched. - Set `scope` to `CLUSTER` to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale.      

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
    public class ImportManualTranslationsExample
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
            var apiInstance = new ManualTranslationApi(httpClient, config, httpClientHandler);
            var translationsFile = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter | CSV file containing translations. The file must have three columns: `content`, `locale`, `translated-content`. Max file size: 30 MB. Max rows: 10,000.
            var scope = "ORG";  // string? | Org scope for the import. `ORG` (default) targets the calling user's current org. `CLUSTER` targets the All-Org context. (optional)  (default to ORG)

            try
            {
                apiInstance.ImportManualTranslations(translationsFile, scope);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ManualTranslationApi.ImportManualTranslations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportManualTranslationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ImportManualTranslationsWithHttpInfo(translationsFile, scope);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ManualTranslationApi.ImportManualTranslationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **translationsFile** | **FileParameter****FileParameter** | CSV file containing translations. The file must have three columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Max file size: 30 MB. Max rows: 10,000. |  |
| **scope** | **string?** | Org scope for the import. &#x60;ORG&#x60; (default) targets the calling user&#39;s current org. &#x60;CLUSTER&#x60; targets the All-Org context. | [optional] [default to ORG] |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully imported manual translations. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

