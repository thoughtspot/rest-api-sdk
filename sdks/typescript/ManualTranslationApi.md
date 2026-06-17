# ThoughtSpotRestApiSdk.ManualTranslationApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteManualTranslations**](ManualTranslationApi.md#deleteManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/delete | 
[**exportManualTranslations**](ManualTranslationApi.md#exportManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/export | 
[**getManualTranslationBundle**](ManualTranslationApi.md#getManualTranslationBundle) | **POST** /api/rest/2.0/localizations/manual-translation/locales/{locale}/export | 
[**importManualTranslations**](ManualTranslationApi.md#importManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/import | 


# **deleteManualTranslations**
> void deleteManualTranslations(deleteManualTranslationsRequest)

 Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to `ORG` scope if not specified. - Set `scope` to `CLUSTER` to delete translations uploaded in the All-Org context.      

### Example


```typescript
import { createBearerAuthenticationConfig, ManualTranslationApi, DeleteManualTranslationsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ManualTranslationApi(configuration);

apiInstance.deleteManualTranslations(
  // DeleteManualTranslationsRequest
  {
    scope: "ORG",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteManualTranslationsRequest** | **DeleteManualTranslationsRequest**|  |


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
**204** | Successfully deleted manual translations. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **exportManualTranslations**
> HttpFile exportManualTranslations(exportManualTranslationsRequest)

 Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: `content`, `locale`, `translated-content`. - Defaults to `ORG` scope if not specified. - Set `scope` to `CLUSTER` to export translations from the All-Org context. - Returns a `404` error if no translations exist for the targeted org or cluster scope.      

### Example


```typescript
import { createBearerAuthenticationConfig, ManualTranslationApi, ExportManualTranslationsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ManualTranslationApi(configuration);

apiInstance.exportManualTranslations(
  // ExportManualTranslationsRequest
  {
    scope: "ORG",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportManualTranslationsRequest** | **ExportManualTranslationsRequest**|  |


### Return type

**HttpFile**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CSV file downloaded successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | No translations file found. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getManualTranslationBundle**
> any getManualTranslationBundle()

 Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - `locale` parameter must be a hyphenated locale code (for example, `fr-fr`, `de-de`, `JA-JP`). - Returns a JSON object with a `translations` map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty `translations` map (not an error) if no entries exist at either level.      

### Example


```typescript
import { createBearerAuthenticationConfig, ManualTranslationApi, GetManualTranslationBundleRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ManualTranslationApi(configuration);

apiInstance.getManualTranslationBundle(
  // string | Locale code for which to retrieve translations.  For example, `fr-fr`, `de-de`, `JA-JP`.
  "locale_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | [**string**] | Locale code for which to retrieve translations.  For example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;. | defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation bundle retrieved successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | No translations found for the requested locale. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **importManualTranslations**
> void importManualTranslations()

 Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: `content`, `locale`, `translated-content`. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only `.csv` files are accepted. - The import performs an **upsert**: existing entries matched by `(org_id, locale, content)` are updated; new entries are inserted. Entries not in the upload are left untouched. - Set `scope` to `CLUSTER` to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale.      

### Example


```typescript
import { createBearerAuthenticationConfig, ManualTranslationApi, ImportManualTranslationsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ManualTranslationApi(configuration);

apiInstance.importManualTranslations(
  // HttpFile | CSV file containing translations. The file must have three columns: `content`, `locale`, `translated-content`. Max file size: 30 MB. Max rows: 10,000.
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } , 
  // string | Org scope for the import. `ORG` (default) targets the calling user\\\'s current org. `CLUSTER` targets the All-Org context. (optional)
  "ORG" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **translationsFile** | [**HttpFile**] | CSV file containing translations. The file must have three columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Max file size: 30 MB. Max rows: 10,000. | defaults to undefined
 **scope** | [**string**]**Array<&#39;ORG&#39; &#124; &#39;CLUSTER&#39;>** | Org scope for the import. &#x60;ORG&#x60; (default) targets the calling user\\\&#39;s current org. &#x60;CLUSTER&#x60; targets the All-Org context. | (optional) defaults to 'ORG'


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully imported manual translations. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

