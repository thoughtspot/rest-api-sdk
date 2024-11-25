# ReportsApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportAnswerReport**](ReportsApi.md#exportAnswerReport) | **POST** /api/rest/2.0/report/answer |  |
| [**exportLiveboardReport**](ReportsApi.md#exportLiveboardReport) | **POST** /api/rest/2.0/report/liveboard |  |


<a id="exportAnswerReport"></a>
# **exportAnswerReport**
> File exportAnswerReport(exportAnswerReportRequest)



  Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set &#x60;file_format&#x60;. The default file format is CSV.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).        

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    ExportAnswerReportRequest exportAnswerReportRequest = new ExportAnswerReportRequest(); // ExportAnswerReportRequest | 
    try {
      File result = apiInstance.exportAnswerReport(exportAnswerReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#exportAnswerReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exportAnswerReportRequest** | [**ExportAnswerReportRequest**](ExportAnswerReportRequest.md)|  | |

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



  Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default &#x60;file_format&#x60; is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).        

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    ExportLiveboardReportRequest exportLiveboardReportRequest = new ExportLiveboardReportRequest(); // ExportLiveboardReportRequest | 
    try {
      File result = apiInstance.exportLiveboardReport(exportLiveboardReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#exportLiveboardReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exportLiveboardReportRequest** | [**ExportLiveboardReportRequest**](ExportLiveboardReportRequest.md)|  | |

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

