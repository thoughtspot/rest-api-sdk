# SecurityApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**assignChangeAuthor**](SecurityApi.md#assignChangeAuthor) | **POST** /api/rest/2.0/security/metadata/assign |
| [**fetchPermissionsOfPrincipals**](SecurityApi.md#fetchPermissionsOfPrincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions |
| [**fetchPermissionsOnMetadata**](SecurityApi.md#fetchPermissionsOnMetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions |
| [**shareMetadata**](SecurityApi.md#shareMetadata) | **POST** /api/rest/2.0/security/metadata/share |


<a id="assignChangeAuthor"></a>
# **assignChangeAuthor**
> assignChangeAuthor(assignChangeAuthorRequest)



  Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and edit access to the objects are required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **assignChangeAuthorRequest** | [**AssignChangeAuthorRequest**](AssignChangeAuthorRequest.md)

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
| **204** | Author assignment for given metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchPermissionsOfPrincipals"></a>
# **fetchPermissionsOfPrincipals**
> PermissionOfPrincipalsResponse fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest)



  Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchPermissionsOfPrincipalsRequest** | [**FetchPermissionsOfPrincipalsRequest**](FetchPermissionsOfPrincipalsRequest.md)

### Return type

[**PermissionOfPrincipalsResponse**](PermissionOfPrincipalsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching permissions of principals is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchPermissionsOnMetadata"></a>
# **fetchPermissionsOnMetadata**
> PermissionOfMetadataResponse fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest)



  Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the metadata object. * To get permission details for a specific user or group, add &#x60;type&#x60; and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchPermissionsOnMetadataRequest** | [**FetchPermissionsOnMetadataRequest**](FetchPermissionsOnMetadataRequest.md)

### Return type

[**PermissionOfMetadataResponse**](PermissionOfMetadataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching permissions of metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="shareMetadata"></a>
# **shareMetadata**
> shareMetadata(shareMetadataRequest)



  Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views * Connections  You can provide &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; access when sharing an object with another user or group. With &#x60;READ_ONLY&#x60; access grants view access to the shared object, whereas &#x60;MODIFY&#x60; provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set &#x60;shareMode&#x60; to &#x60;NO_ACCESS&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **shareMetadataRequest** | [**ShareMetadataRequest**](ShareMetadataRequest.md)

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
| **204** | Sharing metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

