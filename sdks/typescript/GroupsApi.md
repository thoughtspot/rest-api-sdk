# ThoughtSpotRestApiSdk.GroupsApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserGroup**](GroupsApi.md#createUserGroup) | **POST** /api/rest/2.0/groups/create | 
[**deleteUserGroup**](GroupsApi.md#deleteUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/delete | 
[**importUserGroups**](GroupsApi.md#importUserGroups) | **POST** /api/rest/2.0/groups/import | 
[**searchUserGroups**](GroupsApi.md#searchUserGroups) | **POST** /api/rest/2.0/groups/search | 
[**updateUserGroup**](GroupsApi.md#updateUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/update | 


# **createUserGroup**
> UserGroupResponse createUserGroup(createUserGroupRequest)

  Version: 9.0.0.cl or later  Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      

### Example


```typescript
import { createBearerAuthenticationConfig, GroupsApi, CreateUserGroupRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new GroupsApi(configuration);

apiInstance.createUserGroup(
  // CreateUserGroupRequest
  {
    name: "name_example",
    display_name: "display_name_example",
    default_liveboard_identifiers: [
      "default_liveboard_identifiers_example",
    ],
    description: "description_example",
    privileges: [
      "ADMINISTRATION",
    ],
    sub_group_identifiers: [
      "sub_group_identifiers_example",
    ],
    type: "LOCAL_GROUP",
    user_identifiers: [
      "user_identifiers_example",
    ],
    visibility: "SHARABLE",
    role_identifiers: [
      "role_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserGroupRequest** | **CreateUserGroupRequest**|  |


### Return type

**UserGroupResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User group successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteUserGroup**
> void deleteUserGroup()

  Version: 9.0.0.cl or later  Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, GroupsApi, DeleteUserGroupRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new GroupsApi(configuration);

apiInstance.deleteUserGroup(
  // string | GUID or name of the group.
  "group_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIdentifier** | [**string**] | GUID or name of the group. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | User group successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **importUserGroups**
> ImportUserGroupsResponse importUserGroups()

  Version: 9.0.0.cl or later  Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      

### Example


```typescript
import { createBearerAuthenticationConfig, GroupsApi, ImportUserGroupsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new GroupsApi(configuration);

apiInstance.importUserGroups(
  // ImportUserGroupsRequest (optional)
  {
    groups: [
      {
        display_name: "display_name_example",
        group_identifier: "group_identifier_example",
        default_liveboard_identifiers: [
          "default_liveboard_identifiers_example",
        ],
        description: "description_example",
        privileges: [
          "ADMINISTRATION",
        ],
        sub_group_identifiers: [
          "sub_group_identifiers_example",
        ],
        type: "LOCAL_GROUP",
        user_identifiers: [
          "user_identifiers_example",
        ],
        visibility: "SHARABLE",
      },
    ],
    delete_unspecified_groups: false,
    dry_run: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importUserGroupsRequest** | **ImportUserGroupsRequest**|  |


### Return type

**ImportUserGroupsResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Import user groups operation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchUserGroups**
> Array<UserGroupResponse> searchUserGroups()

  Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.      

### Example


```typescript
import { createBearerAuthenticationConfig, GroupsApi, SearchUserGroupsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new GroupsApi(configuration);

apiInstance.searchUserGroups(
  // SearchUserGroupsRequest (optional)
  {
    default_liveboard_identifiers: [
      "default_liveboard_identifiers_example",
    ],
    description: "description_example",
    display_name: "display_name_example",
    name_pattern: "name_pattern_example",
    group_identifier: "group_identifier_example",
    org_identifiers: [
      "org_identifiers_example",
    ],
    privileges: [
      "ADMINISTRATION",
    ],
    sub_group_identifiers: [
      "sub_group_identifiers_example",
    ],
    type: "LOCAL_GROUP",
    user_identifiers: [
      "user_identifiers_example",
    ],
    visibility: "SHARABLE",
    role_identifiers: [
      "role_identifiers_example",
    ],
    record_offset: 0,
    record_size: 10,
    sort_options: {
      field_name: "NAME",
      order: "ASC",
    },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchUserGroupsRequest** | **SearchUserGroupsRequest**|  |


### Return type

**Array<UserGroupResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User group search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateUserGroup**
> void updateUserGroup()

  Version: 9.0.0.cl or later  Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      

### Example


```typescript
import { createBearerAuthenticationConfig, GroupsApi, UpdateUserGroupRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new GroupsApi(configuration);

apiInstance.updateUserGroup(
  // string | GUID or name of the group.
  "group_identifier_example" , 
  // UpdateUserGroupRequest (optional)
  {
    name: "name_example",
    default_liveboard_identifiers: [
      "default_liveboard_identifiers_example",
    ],
    description: "description_example",
    display_name: "display_name_example",
    privileges: [
      "ADMINISTRATION",
    ],
    sub_group_identifiers: [
      "sub_group_identifiers_example",
    ],
    type: "LOCAL_GROUP",
    user_identifiers: [
      "user_identifiers_example",
    ],
    visibility: "SHARABLE",
    role_identifiers: [
      "role_identifiers_example",
    ],
    operation: "REPLACE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserGroupRequest** | **UpdateUserGroupRequest**|  |
 **groupIdentifier** | [**string**] | GUID or name of the group. | defaults to undefined


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
**204** | User group successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

