# GroupsApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createUserGroup**](GroupsApi.md#createUserGroup) | **POST** /api/rest/2.0/groups/create |
| [**deleteUserGroup**](GroupsApi.md#deleteUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/delete |
| [**importUserGroups**](GroupsApi.md#importUserGroups) | **POST** /api/rest/2.0/groups/import |
| [**searchUserGroups**](GroupsApi.md#searchUserGroups) | **POST** /api/rest/2.0/groups/search |
| [**updateUserGroup**](GroupsApi.md#updateUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/update |


<a id="createUserGroup"></a>
# **createUserGroup**
> UserGroupResponse createUserGroup(createUserGroupRequest)



  Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createUserGroupRequest** | [**CreateUserGroupRequest**](CreateUserGroupRequest.md)

### Return type

[**UserGroupResponse**](UserGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User group successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteUserGroup"></a>
# **deleteUserGroup**
> deleteUserGroup(groupIdentifier)



  Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **groupIdentifier** | **String**

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
| **204** | User group successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="importUserGroups"></a>
# **importUserGroups**
> ImportUserGroupsResponse importUserGroups(importUserGroupsRequest)



  Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is set to &#x60;true&#x60;, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **importUserGroupsRequest** | [**ImportUserGroupsRequest**](ImportUserGroupsRequest.md)

### Return type

[**ImportUserGroupsResponse**](ImportUserGroupsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import user groups operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchUserGroups"></a>
# **searchUserGroups**
> List&lt;UserGroupResponse&gt; searchUserGroups(searchUserGroupsRequest)



  Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchUserGroupsRequest** | [**SearchUserGroupsRequest**](SearchUserGroupsRequest.md)

### Return type

[**List&lt;UserGroupResponse&gt;**](UserGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User group search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateUserGroup"></a>
# **updateUserGroup**
> updateUserGroup(groupIdentifier, updateUserGroupRequest)



  Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      

### Parameters

| Name | Type |
|------------- | ------------- |
| **groupIdentifier** | **String**
| **updateUserGroupRequest** | [**UpdateUserGroupRequest**](UpdateUserGroupRequest.md)

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
| **204** | User group successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

