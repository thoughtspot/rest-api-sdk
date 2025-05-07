# DataApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchAnswerData**](DataApi.md#fetchAnswerData) | **POST** /api/rest/2.0/metadata/answer/data |  |
| [**fetchLiveboardData**](DataApi.md#fetchLiveboardData) | **POST** /api/rest/2.0/metadata/liveboard/data |  |
| [**searchData**](DataApi.md#searchData) | **POST** /api/rest/2.0/searchdata |  |


<a id="fetchAnswerData"></a>
# **fetchAnswerData**
> AnswerDataResponse fetchAnswerData(fetchAnswerDataRequest)



  Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    FetchAnswerDataRequest fetchAnswerDataRequest = new FetchAnswerDataRequest(); // FetchAnswerDataRequest | 
    try {
      AnswerDataResponse result = apiInstance.fetchAnswerData(fetchAnswerDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#fetchAnswerData");
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
| **fetchAnswerDataRequest** | [**FetchAnswerDataRequest**](FetchAnswerDataRequest.md)|  | |

### Return type

[**AnswerDataResponse**](AnswerDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching data of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchLiveboardData"></a>
# **fetchLiveboardData**
> LiveboardDataResponse fetchLiveboardData(fetchLiveboardDataRequest)



  Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    FetchLiveboardDataRequest fetchLiveboardDataRequest = new FetchLiveboardDataRequest(); // FetchLiveboardDataRequest | 
    try {
      LiveboardDataResponse result = apiInstance.fetchLiveboardData(fetchLiveboardDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#fetchLiveboardData");
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
| **fetchLiveboardDataRequest** | [**FetchLiveboardDataRequest**](FetchLiveboardDataRequest.md)|  | |

### Return type

[**LiveboardDataResponse**](LiveboardDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching data of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchData"></a>
# **searchData**
> SearchDataResponse searchData(searchDataRequest)



  Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in &#x60;logical_table_identifier&#x60;. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the &#x60;query_string&#x60; attribute in the API request as shown in the following example:  &#x60;&#x60;&#x60; {   \&quot;query_string\&quot;: \&quot;[sales] by [store]\&quot;,   \&quot;logical_table_identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, } &#x60;&#x60;&#x60;  For more information about the &#x60;query_string&#x60; format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    SearchDataRequest searchDataRequest = new SearchDataRequest(); // SearchDataRequest | 
    try {
      SearchDataResponse result = apiInstance.searchData(searchDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#searchData");
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
| **searchDataRequest** | [**SearchDataRequest**](SearchDataRequest.md)|  | |

### Return type

[**SearchDataResponse**](SearchDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching data of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

