# ThoughtSpotRestApiSdk.ReportsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportAnswerReport**](ReportsApi.md#exportAnswerReport) | **POST** /api/rest/2.0/report/answer | 
[**exportLiveboardReport**](ReportsApi.md#exportLiveboardReport) | **POST** /api/rest/2.0/report/liveboard | 


# **exportAnswerReport**
> void exportAnswerReport(exportAnswerReportRequest)

  Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).        

### Example


```typescript
import { createBearerAuthenticationConfig, ReportsApi, ExportAnswerReportRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ReportsApi(configuration);

apiInstance.exportAnswerReport(
  // ExportAnswerReportRequest
  {
    metadata_identifier: "metadata_identifier_example",
    file_format: "CSV",
    runtime_filter: {},
    runtime_sort: {},
    runtime_param_override: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportAnswerReportRequest** | **ExportAnswerReportRequest**|  |


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Export report file of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **exportLiveboardReport**
> void exportLiveboardReport(exportLiveboardReportRequest)

  Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).        

### Example


```typescript
import { createBearerAuthenticationConfig, ReportsApi, ExportLiveboardReportRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ReportsApi(configuration);

apiInstance.exportLiveboardReport(
  // ExportLiveboardReportRequest
  {
    metadata_identifier: "metadata_identifier_example",
    visualization_identifiers: [
      "visualization_identifiers_example",
    ],
    transient_content: "transient_content_example",
    file_format: "CSV",
    runtime_filter: {},
    runtime_sort: {},
    pdf_options: {
      include_cover_page: true,
      include_custom_logo: true,
      include_filter_page: true,
      include_page_number: true,
      page_orientation: "PORTRAIT",
      truncate_table: false,
      page_footer_text: "page_footer_text_example",
    },
    png_options: {
      include_cover_page: false,
      include_filter_page: false,
    },
    runtime_param_override: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportLiveboardReportRequest** | **ExportLiveboardReportRequest**|  |


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Export report file of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

