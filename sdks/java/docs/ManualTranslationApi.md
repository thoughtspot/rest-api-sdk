# ManualTranslationApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**deleteManualTranslations**](ManualTranslationApi.md#deleteManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/delete |
| [**exportManualTranslationTemplate**](ManualTranslationApi.md#exportManualTranslationTemplate) | **POST** /api/rest/2.0/localizations/manual-translation/template/export |
| [**exportManualTranslations**](ManualTranslationApi.md#exportManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/export |
| [**getManualTranslationBundle**](ManualTranslationApi.md#getManualTranslationBundle) | **POST** /api/rest/2.0/localizations/manual-translation/locales/{locale}/export |
| [**importManualTranslations**](ManualTranslationApi.md#importManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/import |


<a id="deleteManualTranslations"></a>
# **deleteManualTranslations**
> deleteManualTranslations(deleteManualTranslationsRequest)



 Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete translations uploaded in the All-Org context.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteManualTranslationsRequest** | [**DeleteManualTranslationsRequest**](DeleteManualTranslationsRequest.md)

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
| **204** | Successfully deleted manual translations. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="exportManualTranslationTemplate"></a>
# **exportManualTranslationTemplate**
> exportManualTranslationTemplate(exportManualTranslationTemplateRequest)



 Export a CSV template of the translatable strings of Liveboards.    Version: 27.1.0.cl or later   Exports a CSV template with the translatable strings of one or more Liveboards. Translate the strings in the template and upload it with the API that imports manual translations.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file has the same columns as the import file: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Each row lists one string in &#x60;content&#x60; and leaves &#x60;locale&#x60; and &#x60;translated-content&#x60; empty. Fill them in, then upload the file with &#x60;POST /api/rest/2.0/localizations/manual-translation/import&#x60;. - The template includes the Liveboard title and description, tab names, the names of the Liveboard&#39;s personalized views, the titles and descriptions of visualizations and groups, and the text of note tiles. - Note tile text is listed the way it is matched when the Liveboard is displayed: each heading, paragraph, list item, table cell, and line is a separate row, and so is each part of a line that has its own formatting or link. Manual translations are applied to a note tile only when every one of its rows is translated. - A string that appears more than once is listed once. - Strings that the import does not accept are left out: text longer than 2000 characters, text that starts with &#x60;&#x3D;&#x60;, &#x60;+&#x60;, &#x60;-&#x60;, &#x60;@&#x60;, a tab, or a carriage return, and text that contains HTML tags, script content, or control characters. The number of strings left out is returned in the &#x60;X-ThoughtSpot-Excluded-Content-Count&#x60; response header. - Specify 1 to 50 Liveboards by GUID or name. Names are resolved in the current Org; if more than one Liveboard has the given name, use its GUID. If a Liveboard is not found or you cannot access it, the request fails and no file is returned.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportManualTranslationTemplateRequest** | [**ExportManualTranslationTemplateRequest**](ExportManualTranslationTemplateRequest.md)

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Translation template downloaded successfully. |  * Content-Disposition - Indicates that the response is a file attachment. <br>  * X-ThoughtSpot-Excluded-Content-Count - Number of strings left out of the template because the import would reject them. <br>  |
| **400** | Invalid request, or a Liveboard was not found. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access, or no access to a Liveboard. |  -  |
| **409** | More than one Liveboard has the given name. |  -  |
| **500** | Unexpected error. |  -  |

<a id="exportManualTranslations"></a>
# **exportManualTranslations**
> File exportManualTranslations(exportManualTranslationsRequest)



 Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to export translations from the All-Org context. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error. - Returns a &#x60;400&#x60; error if no translations exist for the targeted org or cluster scope.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportManualTranslationsRequest** | [**ExportManualTranslationsRequest**](ExportManualTranslationsRequest.md)

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CSV file downloaded successfully. |  * Content-Disposition - Indicates that the response is a file attachment. <br>  |
| **400** | Invalid request, or no translations exist for the requested scope. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error. |  -  |

<a id="getManualTranslationBundle"></a>
# **getManualTranslationBundle**
> Object getManualTranslationBundle(locale)



 Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - &#x60;locale&#x60; parameter must be a hyphenated locale code, in any case (for example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;). - Returns a JSON object with a &#x60;translations&#x60; map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty &#x60;translations&#x60; map (not an error) if no entries exist at either level.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **locale** | **String**

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

<a id="importManualTranslations"></a>
# **importManualTranslations**
> importManualTranslations(translationsFile, scope)



 Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only &#x60;.csv&#x60; files are accepted. - The import performs an **upsert**: existing entries matched by &#x60;(org_id, locale, content)&#x60; are updated; new entries are inserted. Entries not in the upload are left untouched. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale. - &#x60;scope&#x60; accepts only &#x60;ORG&#x60; (default) and &#x60;CLUSTER&#x60;, in uppercase. Any other value returns a &#x60;400&#x60; error.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **translationsFile** | **File**
| **scope** | **String**

### Return type

null (empty response body)

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

