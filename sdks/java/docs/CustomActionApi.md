# CustomActionApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomAction**](CustomActionApi.md#createCustomAction) | **POST** /api/rest/2.0/customization/custom-actions |  |
| [**deleteCustomAction**](CustomActionApi.md#deleteCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete |  |
| [**searchCustomActions**](CustomActionApi.md#searchCustomActions) | **POST** /api/rest/2.0/customization/custom-actions/search |  |
| [**updateCustomAction**](CustomActionApi.md#updateCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update |  |


<a id="createCustomAction"></a>
# **createCustomAction**
> ResponseCustomAction createCustomAction(createCustomActionRequest)



  Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in &#x60;group_identifiers&#x60;.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in &#x60;default_action_config&#x60; property and specify the GUID or name of the object in &#x60;associate_metadata&#x60;.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid&#x3D;custom-action-intro).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.CustomActionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomActionApi apiInstance = new CustomActionApi(defaultClient);
    CreateCustomActionRequest createCustomActionRequest = new CreateCustomActionRequest(); // CreateCustomActionRequest | 
    try {
      ResponseCustomAction result = apiInstance.createCustomAction(createCustomActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomActionApi#createCustomAction");
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
| **createCustomActionRequest** | [**CreateCustomActionRequest**](CreateCustomActionRequest.md)|  | |

### Return type

[**ResponseCustomAction**](ResponseCustomAction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom action created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteCustomAction"></a>
# **deleteCustomAction**
> deleteCustomAction(customActionIdentifier)



  Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.CustomActionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomActionApi apiInstance = new CustomActionApi(defaultClient);
    String customActionIdentifier = "customActionIdentifier_example"; // String | Unique ID or name of the custom action.
    try {
      apiInstance.deleteCustomAction(customActionIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomActionApi#deleteCustomAction");
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
| **customActionIdentifier** | **String**| Unique ID or name of the custom action. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Custom action is successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchCustomActions"></a>
# **searchCustomActions**
> List&lt;ResponseCustomAction&gt; searchCustomActions(searchCustomActionsRequest)



  Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.CustomActionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomActionApi apiInstance = new CustomActionApi(defaultClient);
    SearchCustomActionsRequest searchCustomActionsRequest = new SearchCustomActionsRequest(); // SearchCustomActionsRequest | 
    try {
      List<ResponseCustomAction> result = apiInstance.searchCustomActions(searchCustomActionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomActionApi#searchCustomActions");
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
| **searchCustomActionsRequest** | [**SearchCustomActionsRequest**](SearchCustomActionsRequest.md)|  | |

### Return type

[**List&lt;ResponseCustomAction&gt;**](ResponseCustomAction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom action search is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateCustomAction"></a>
# **updateCustomAction**
> updateCustomAction(customActionIdentifier, updateCustomActionRequest)



  Version: 9.6.0.cl or later   Updates a custom action.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid&#x3D;custom-action-intro).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.CustomActionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomActionApi apiInstance = new CustomActionApi(defaultClient);
    String customActionIdentifier = "customActionIdentifier_example"; // String | Unique ID or name of the custom action.
    UpdateCustomActionRequest updateCustomActionRequest = new UpdateCustomActionRequest(); // UpdateCustomActionRequest | 
    try {
      apiInstance.updateCustomAction(customActionIdentifier, updateCustomActionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomActionApi#updateCustomAction");
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
| **customActionIdentifier** | **String**| Unique ID or name of the custom action. | |
| **updateCustomActionRequest** | [**UpdateCustomActionRequest**](UpdateCustomActionRequest.md)|  | |

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
| **204** | Custom action updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

