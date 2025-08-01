# ReportsApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**exportAnswerReport**](ReportsApi.md#exportAnswerReport) | **POST** /api/rest/2.0/report/answer |
| [**exportLiveboardReport**](ReportsApi.md#exportLiveboardReport) | **POST** /api/rest/2.0/report/liveboard |


<a id="exportAnswerReport"></a>
# **exportAnswerReport**
> File exportAnswerReport(exportAnswerReportRequest)



  Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires at least view access to the Answer.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set &#x60;file_format&#x60;. The default file format is CSV.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.       

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportAnswerReportRequest** | [**ExportAnswerReportRequest**](ExportAnswerReportRequest.md)

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
| **200** | Export report file of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="exportLiveboardReport"></a>
# **exportLiveboardReport**
> File exportLiveboardReport(exportLiveboardReportRequest)



  Version: 9.0.0.cl or later   Exports a Liveboard and its visualizations in PDF or PNG file format.  Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default &#x60;file_format&#x60; is PDF. For PDF downloads, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  **NOTE**: The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).       

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportLiveboardReportRequest** | [**ExportLiveboardReportRequest**](ExportLiveboardReportRequest.md)

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
| **200** | Export report file of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

