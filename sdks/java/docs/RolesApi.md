# RolesApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole**](RolesApi.md#createRole) | **POST** /api/rest/2.0/roles/create |  |
| [**deleteRole**](RolesApi.md#deleteRole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete |  |
| [**searchRoles**](RolesApi.md#searchRoles) | **POST** /api/rest/2.0/roles/search |  |
| [**updateRole**](RolesApi.md#updateRole) | **POST** /api/rest/2.0/roles/{role_identifier}/update |  |


<a id="createRole"></a>
# **createRole**
> RoleResponse createRole(createRoleRequest)



  Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    CreateRoleRequest createRoleRequest = new CreateRoleRequest(); // CreateRoleRequest | 
    try {
      RoleResponse result = apiInstance.createRole(createRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#createRole");
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
| **createRoleRequest** | [**CreateRoleRequest**](CreateRoleRequest.md)|  | |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Role successfully created. |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Internal error |  -  |

<a id="deleteRole"></a>
# **deleteRole**
> deleteRole(roleIdentifier)



  Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String roleIdentifier = "roleIdentifier_example"; // String | Unique ID or name of the Role. ReadOnly roles cannot be deleted.
    try {
      apiInstance.deleteRole(roleIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#deleteRole");
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
| **roleIdentifier** | **String**| Unique ID or name of the Role. ReadOnly roles cannot be deleted. | |

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
| **204** | Role successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Internal error |  -  |

<a id="searchRoles"></a>
# **searchRoles**
> List&lt;SearchRoleResponse&gt; searchRoles(searchRolesRequest)



  Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    SearchRolesRequest searchRolesRequest = new SearchRolesRequest(); // SearchRolesRequest | 
    try {
      List<SearchRoleResponse> result = apiInstance.searchRoles(searchRolesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#searchRoles");
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
| **searchRolesRequest** | [**SearchRolesRequest**](SearchRolesRequest.md)|  | |

### Return type

[**List&lt;SearchRoleResponse&gt;**](SearchRoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Roles search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Internal error |  -  |

<a id="updateRole"></a>
# **updateRole**
> RoleResponse updateRole(roleIdentifier, updateRoleRequest)



  Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String roleIdentifier = "roleIdentifier_example"; // String | Unique ID or name of the Role.
    UpdateRoleRequest updateRoleRequest = new UpdateRoleRequest(); // UpdateRoleRequest | 
    try {
      RoleResponse result = apiInstance.updateRole(roleIdentifier, updateRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#updateRole");
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
| **roleIdentifier** | **String**| Unique ID or name of the Role. | |
| **updateRoleRequest** | [**UpdateRoleRequest**](UpdateRoleRequest.md)|  | |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Role successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

