# ThoughtSpotRestApiSdk.Class900ClApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignChangeAuthor**](Class900ClApi.md#assignChangeAuthor) | **POST** /api/rest/2.0/security/metadata/assign | 
[**assignTag**](Class900ClApi.md#assignTag) | **POST** /api/rest/2.0/tags/assign | 
[**changeUserPassword**](Class900ClApi.md#changeUserPassword) | **POST** /api/rest/2.0/users/change-password | 
[**createOrg**](Class900ClApi.md#createOrg) | **POST** /api/rest/2.0/orgs/create | 
[**createTag**](Class900ClApi.md#createTag) | **POST** /api/rest/2.0/tags/create | 
[**createUser**](Class900ClApi.md#createUser) | **POST** /api/rest/2.0/users/create | 
[**createUserGroup**](Class900ClApi.md#createUserGroup) | **POST** /api/rest/2.0/groups/create | 
[**deleteMetadata**](Class900ClApi.md#deleteMetadata) | **POST** /api/rest/2.0/metadata/delete | 
[**deleteOrg**](Class900ClApi.md#deleteOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/delete | 
[**deleteTag**](Class900ClApi.md#deleteTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/delete | 
[**deleteUser**](Class900ClApi.md#deleteUser) | **POST** /api/rest/2.0/users/{user_identifier}/delete | 
[**deleteUserGroup**](Class900ClApi.md#deleteUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/delete | 
[**exportAnswerReport**](Class900ClApi.md#exportAnswerReport) | **POST** /api/rest/2.0/report/answer | 
[**exportLiveboardReport**](Class900ClApi.md#exportLiveboardReport) | **POST** /api/rest/2.0/report/liveboard | 
[**exportMetadataTML**](Class900ClApi.md#exportMetadataTML) | **POST** /api/rest/2.0/metadata/tml/export | 
[**fetchAnswerData**](Class900ClApi.md#fetchAnswerData) | **POST** /api/rest/2.0/metadata/answer/data | 
[**fetchAnswerSqlQuery**](Class900ClApi.md#fetchAnswerSqlQuery) | **POST** /api/rest/2.0/metadata/answer/sql | 
[**fetchLiveboardData**](Class900ClApi.md#fetchLiveboardData) | **POST** /api/rest/2.0/metadata/liveboard/data | 
[**fetchLiveboardSqlQuery**](Class900ClApi.md#fetchLiveboardSqlQuery) | **POST** /api/rest/2.0/metadata/liveboard/sql | 
[**fetchLogs**](Class900ClApi.md#fetchLogs) | **POST** /api/rest/2.0/logs/fetch | 
[**fetchPermissionsOfPrincipals**](Class900ClApi.md#fetchPermissionsOfPrincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions | 
[**fetchPermissionsOnMetadata**](Class900ClApi.md#fetchPermissionsOnMetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions | 
[**forceLogoutUsers**](Class900ClApi.md#forceLogoutUsers) | **POST** /api/rest/2.0/users/force-logout | 
[**getCurrentUserInfo**](Class900ClApi.md#getCurrentUserInfo) | **GET** /api/rest/2.0/auth/session/user | 
[**getFullAccessToken**](Class900ClApi.md#getFullAccessToken) | **POST** /api/rest/2.0/auth/token/full | 
[**getObjectAccessToken**](Class900ClApi.md#getObjectAccessToken) | **POST** /api/rest/2.0/auth/token/object | 
[**getSystemConfig**](Class900ClApi.md#getSystemConfig) | **GET** /api/rest/2.0/system/config | 
[**getSystemInformation**](Class900ClApi.md#getSystemInformation) | **GET** /api/rest/2.0/system | 
[**importMetadataTML**](Class900ClApi.md#importMetadataTML) | **POST** /api/rest/2.0/metadata/tml/import | 
[**importUserGroups**](Class900ClApi.md#importUserGroups) | **POST** /api/rest/2.0/groups/import | 
[**importUsers**](Class900ClApi.md#importUsers) | **POST** /api/rest/2.0/users/import | 
[**login**](Class900ClApi.md#login) | **POST** /api/rest/2.0/auth/session/login | 
[**logout**](Class900ClApi.md#logout) | **POST** /api/rest/2.0/auth/session/logout | 
[**resetUserPassword**](Class900ClApi.md#resetUserPassword) | **POST** /api/rest/2.0/users/reset-password | 
[**revokeToken**](Class900ClApi.md#revokeToken) | **POST** /api/rest/2.0/auth/token/revoke | 
[**searchData**](Class900ClApi.md#searchData) | **POST** /api/rest/2.0/searchdata | 
[**searchMetadata**](Class900ClApi.md#searchMetadata) | **POST** /api/rest/2.0/metadata/search | 
[**searchOrgs**](Class900ClApi.md#searchOrgs) | **POST** /api/rest/2.0/orgs/search | 
[**searchTags**](Class900ClApi.md#searchTags) | **POST** /api/rest/2.0/tags/search | 
[**searchUserGroups**](Class900ClApi.md#searchUserGroups) | **POST** /api/rest/2.0/groups/search | 
[**searchUsers**](Class900ClApi.md#searchUsers) | **POST** /api/rest/2.0/users/search | 
[**shareMetadata**](Class900ClApi.md#shareMetadata) | **POST** /api/rest/2.0/security/metadata/share | 
[**unassignTag**](Class900ClApi.md#unassignTag) | **POST** /api/rest/2.0/tags/unassign | 
[**updateOrg**](Class900ClApi.md#updateOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/update | 
[**updateTag**](Class900ClApi.md#updateTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/update | 
[**updateUser**](Class900ClApi.md#updateUser) | **POST** /api/rest/2.0/users/{user_identifier}/update | 
[**updateUserGroup**](Class900ClApi.md#updateUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/update | 


# **assignChangeAuthor**
> void assignChangeAuthor(assignChangeAuthorRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiAssignChangeAuthorRequest = {
  // AssignChangeAuthorRequest
  assignChangeAuthorRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    userIdentifier: "userIdentifier_example",
    currentOwnerIdentifier: "currentOwnerIdentifier_example",
  },
};

apiInstance.assignChangeAuthor(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignChangeAuthorRequest** | **AssignChangeAuthorRequest**|  |


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
**204** | Author assignment for given metadata objects is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **assignTag**
> void assignTag(assignTagRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiAssignTagRequest = {
  // AssignTagRequest
  assignTagRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
  },
};

apiInstance.assignTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignTagRequest** | **AssignTagRequest**|  |


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
**204** | Tags successfully assigned. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **changeUserPassword**
> void changeUserPassword(changeUserPasswordRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiChangeUserPasswordRequest = {
  // ChangeUserPasswordRequest
  changeUserPasswordRequest: {
    currentPassword: "currentPassword_example",
    newPassword: "newPassword_example",
    userIdentifier: "userIdentifier_example",
  },
};

apiInstance.changeUserPassword(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeUserPasswordRequest** | **ChangeUserPasswordRequest**|  |


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
**204** | User password change operation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createOrg**
> OrgResponse createOrg(createOrgRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiCreateOrgRequest = {
  // CreateOrgRequest
  createOrgRequest: {
    name: "name_example",
    description: "description_example",
  },
};

apiInstance.createOrg(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrgRequest** | **CreateOrgRequest**|  |


### Return type

**OrgResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createTag**
> Tag createTag(createTagRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiCreateTagRequest = {
  // CreateTagRequest
  createTagRequest: {
    name: "name_example",
    color: "color_example",
  },
};

apiInstance.createTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTagRequest** | **CreateTagRequest**|  |


### Return type

**Tag**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tag successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createUser**
> User createUser(createUserRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiCreateUserRequest = {
  // CreateUserRequest
  createUserRequest: {
    name: "name_example",
    displayName: "displayName_example",
    password: "password_example",
    email: "email_example",
    accountType: "LOCAL_USER",
    accountStatus: "ACTIVE",
    orgIdentifiers: [
      "orgIdentifiers_example",
    ],
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
    visibility: "SHARABLE",
    notifyOnShare: true,
    showOnboardingExperience: true,
    onboardingExperienceCompleted: false,
    homeLiveboardIdentifier: "homeLiveboardIdentifier_example",
    favoriteMetadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
  },
};

apiInstance.createUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserRequest** | **CreateUserRequest**|  |


### Return type

**User**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createUserGroup**
> UserGroupResponse createUserGroup(createUserGroupRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiCreateUserGroupRequest = {
  // CreateUserGroupRequest
  createUserGroupRequest: {
    name: "name_example",
    displayName: "displayName_example",
    defaultLiveboardIdentifiers: [
      "defaultLiveboardIdentifiers_example",
    ],
    description: "description_example",
    privileges: [
      "ADMINISTRATION",
    ],
    subGroupIdentifiers: [
      "subGroupIdentifiers_example",
    ],
    type: "LOCAL_GROUP",
    userIdentifiers: [
      "userIdentifiers_example",
    ],
    visibility: "SHARABLE",
    roleIdentifiers: [
      "roleIdentifiers_example",
    ],
  },
};

apiInstance.createUserGroup(body).then((data:any) => {
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

# **deleteMetadata**
> void deleteMetadata(deleteMetadataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiDeleteMetadataRequest = {
  // DeleteMetadataRequest
  deleteMetadataRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    deleteDisabledObjects: false,
  },
};

apiInstance.deleteMetadata(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteMetadataRequest** | **DeleteMetadataRequest**|  |


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
**204** | Metadata objects successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteOrg**
> void deleteOrg()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiDeleteOrgRequest = {
  // string | ID or name of the Org.
  orgIdentifier: "org_identifier_example",
};

apiInstance.deleteOrg(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgIdentifier** | [**string**] | ID or name of the Org. | defaults to undefined


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
**204** | Organization successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteTag**
> void deleteTag()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiDeleteTagRequest = {
  // string | Tag identifier Tag name or Tag id.
  tagIdentifier: "tag_identifier_example",
};

apiInstance.deleteTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagIdentifier** | [**string**] | Tag identifier Tag name or Tag id. | defaults to undefined


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
**204** | Tag successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteUser**
> void deleteUser()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiDeleteUserRequest = {
  // string | GUID / name of the user
  userIdentifier: "user_identifier_example",
};

apiInstance.deleteUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdentifier** | [**string**] | GUID / name of the user | defaults to undefined


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
**204** | User successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteUserGroup**
> void deleteUserGroup()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiDeleteUserGroupRequest = {
  // string | GUID or name of the group.
  groupIdentifier: "group_identifier_example",
};

apiInstance.deleteUserGroup(body).then((data:any) => {
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

# **exportAnswerReport**
> any exportAnswerReport(exportAnswerReportRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiExportAnswerReportRequest = {
  // ExportAnswerReportRequest
  exportAnswerReportRequest: {
    metadataIdentifier: "metadataIdentifier_example",
    fileFormat: "CSV",
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  },
};

apiInstance.exportAnswerReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportAnswerReportRequest** | **ExportAnswerReportRequest**|  |


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


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
> any exportLiveboardReport(exportLiveboardReportRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiExportLiveboardReportRequest = {
  // ExportLiveboardReportRequest
  exportLiveboardReportRequest: {
    metadataIdentifier: "metadataIdentifier_example",
    visualizationIdentifiers: [
      "visualizationIdentifiers_example",
    ],
    transientContent: "transientContent_example",
    fileFormat: "CSV",
    runtimeFilter: {},
    runtimeSort: {},
    pdfOptions: {
      includeCoverPage: true,
      includeCustomLogo: true,
      includeFilterPage: true,
      includePageNumber: true,
      pageOrientation: "PORTRAIT",
      truncateTable: false,
      pageFooterText: "pageFooterText_example",
    },
    pngOptions: {
      includeCoverPage: false,
      includeFilterPage: false,
    },
    runtimeParamOverride: {},
  },
};

apiInstance.exportLiveboardReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportLiveboardReportRequest** | **ExportLiveboardReportRequest**|  |


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Export report file of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **exportMetadataTML**
> Array<any> exportMetadataTML(exportMetadataTMLRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiExportMetadataTMLRequest = {
  // ExportMetadataTMLRequest
  exportMetadataTMLRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    exportAssociated: false,
    exportFqn: false,
    edocFormat: "JSON",
  },
};

apiInstance.exportMetadataTML(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportMetadataTMLRequest** | **ExportMetadataTMLRequest**|  |


### Return type

**Array<any>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Export TMLs of specified metadata objects is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchAnswerData**
> AnswerDataResponse fetchAnswerData(fetchAnswerDataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches data from a saved Answer.  Requires at least view access to the saved Answer.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiFetchAnswerDataRequest = {
  // FetchAnswerDataRequest
  fetchAnswerDataRequest: {
    metadataIdentifier: "metadataIdentifier_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  },
};

apiInstance.fetchAnswerData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchAnswerDataRequest** | **FetchAnswerDataRequest**|  |


### Return type

**AnswerDataResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching data of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchAnswerSqlQuery**
> SqlQueryResponse fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiFetchAnswerSqlQueryRequest = {
  // FetchAnswerSqlQueryRequest
  fetchAnswerSqlQueryRequest: {
    metadataIdentifier: "metadataIdentifier_example",
  },
};

apiInstance.fetchAnswerSqlQuery(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchAnswerSqlQueryRequest** | **FetchAnswerSqlQueryRequest**|  |


### Return type

**SqlQueryResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching SQL query of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchLiveboardData**
> LiveboardDataResponse fetchLiveboardData(fetchLiveboardDataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiFetchLiveboardDataRequest = {
  // FetchLiveboardDataRequest
  fetchLiveboardDataRequest: {
    metadataIdentifier: "metadataIdentifier_example",
    visualizationIdentifiers: [
      "visualizationIdentifiers_example",
    ],
    transientContent: "transientContent_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  },
};

apiInstance.fetchLiveboardData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchLiveboardDataRequest** | **FetchLiveboardDataRequest**|  |


### Return type

**LiveboardDataResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching data of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchLiveboardSqlQuery**
> SqlQueryResponse fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiFetchLiveboardSqlQueryRequest = {
  // FetchLiveboardSqlQueryRequest
  fetchLiveboardSqlQueryRequest: {
    metadataIdentifier: "metadataIdentifier_example",
    visualizationIdentifiers: [
      "visualizationIdentifiers_example",
    ],
  },
};

apiInstance.fetchLiveboardSqlQuery(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchLiveboardSqlQueryRequest** | **FetchLiveboardSqlQueryRequest**|  |


### Return type

**SqlQueryResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching SQL query of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchLogs**
> Array<LogResponse> fetchLogs(fetchLogsRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiFetchLogsRequest = {
  // FetchLogsRequest
  fetchLogsRequest: {
    logType: "SECURITY_AUDIT",
    startEpochTimeInMillis: 3.14,
    endEpochTimeInMillis: 3.14,
  },
};

apiInstance.fetchLogs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchLogsRequest** | **FetchLogsRequest**|  |


### Return type

**Array<LogResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Log fetched successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchPermissionsOfPrincipals**
> any fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.       #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiFetchPermissionsOfPrincipalsRequest = {
  // FetchPermissionsOfPrincipalsRequest
  fetchPermissionsOfPrincipalsRequest: {
    principals: [
      {
        identifier: "identifier_example",
        type: "USER",
      },
    ],
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
  },
};

apiInstance.fetchPermissionsOfPrincipals(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchPermissionsOfPrincipalsRequest** | **FetchPermissionsOfPrincipalsRequest**|  |


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching permissions of principals is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchPermissionsOnMetadata**
> any fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiFetchPermissionsOnMetadataRequest = {
  // FetchPermissionsOnMetadataRequest
  fetchPermissionsOnMetadataRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    principals: [
      {
        identifier: "identifier_example",
        type: "USER",
      },
    ],
    includeDependentObjects: false,
  },
};

apiInstance.fetchPermissionsOnMetadata(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fetchPermissionsOnMetadataRequest** | **FetchPermissionsOnMetadataRequest**|  |


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching permissions of metadata objects is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **forceLogoutUsers**
> void forceLogoutUsers()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiForceLogoutUsersRequest = {
  // ForceLogoutUsersRequest (optional)
  forceLogoutUsersRequest: {
    userIdentifiers: [
      "userIdentifiers_example",
    ],
  },
};

apiInstance.forceLogoutUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forceLogoutUsersRequest** | **ForceLogoutUsersRequest**|  |


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
**204** | Force logging out of users operation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getCurrentUserInfo**
> User getCurrentUserInfo()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:any = {};

apiInstance.getCurrentUserInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**User**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetch current session user detail successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getFullAccessToken**
> Token getFullAccessToken(getFullAccessTokenRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiGetFullAccessTokenRequest = {
  // GetFullAccessTokenRequest
  getFullAccessTokenRequest: {
    username: "username_example",
    password: "",
    secretKey: "",
    validityTimeInSec: 300,
    orgId: 0,
    email: "email_example",
    displayName: "displayName_example",
    autoCreate: false,
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
  },
};

apiInstance.getFullAccessToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getFullAccessTokenRequest** | **GetFullAccessTokenRequest**|  |


### Return type

**Token**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bearer auth token creation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getObjectAccessToken**
> Token getObjectAccessToken(getObjectAccessTokenRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiGetObjectAccessTokenRequest = {
  // GetObjectAccessTokenRequest
  getObjectAccessTokenRequest: {
    username: "username_example",
    objectId: "objectId_example",
    password: "",
    secretKey: "",
    validityTimeInSec: 300,
    orgId: 0,
    email: "email_example",
    displayName: "displayName_example",
    autoCreate: false,
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
  },
};

apiInstance.getObjectAccessToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getObjectAccessTokenRequest** | **GetObjectAccessTokenRequest**|  |


### Return type

**Token**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bearer auth token creation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSystemConfig**
> SystemConfig getSystemConfig()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:any = {};

apiInstance.getSystemConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**SystemConfig**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cluster config information. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSystemInformation**
> SystemInfo getSystemInformation()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.       #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:any = {};

apiInstance.getSystemInformation(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**SystemInfo**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cluster information. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **importMetadataTML**
> Array<any> importMetadataTML(importMetadataTMLRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiImportMetadataTMLRequest = {
  // ImportMetadataTMLRequest
  importMetadataTMLRequest: {
    metadataTmls: [
      "metadataTmls_example",
    ],
    importPolicy: "PARTIAL",
    createNew: false,
  },
};

apiInstance.importMetadataTML(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importMetadataTMLRequest** | **ImportMetadataTMLRequest**|  |


### Return type

**Array<any>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Import metadata objects using specified TMLs is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **importUserGroups**
> ImportUserGroupsResponse importUserGroups()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiImportUserGroupsRequest = {
  // ImportUserGroupsRequest (optional)
  importUserGroupsRequest: {
    groups: [
      {
        displayName: "displayName_example",
        groupIdentifier: "groupIdentifier_example",
        defaultLiveboardIdentifiers: [
          "defaultLiveboardIdentifiers_example",
        ],
        description: "description_example",
        privileges: [
          "ADMINISTRATION",
        ],
        subGroupIdentifiers: [
          "subGroupIdentifiers_example",
        ],
        type: "LOCAL_GROUP",
        userIdentifiers: [
          "userIdentifiers_example",
        ],
        visibility: "SHARABLE",
      },
    ],
    deleteUnspecifiedGroups: false,
    dryRun: true,
  },
};

apiInstance.importUserGroups(body).then((data:any) => {
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

# **importUsers**
> ImportUsersResponse importUsers(importUsersRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiImportUsersRequest = {
  // ImportUsersRequest
  importUsersRequest: {
    users: [
      {
        userIdentifier: "userIdentifier_example",
        displayName: "displayName_example",
        password: "password_example",
        accountType: "LOCAL_USER",
        accountStatus: "ACTIVE",
        email: "email_example",
        orgIdentifiers: [
          "orgIdentifiers_example",
        ],
        groupIdentifiers: [
          "groupIdentifiers_example",
        ],
        visibility: "SHARABLE",
        notifyOnShare: true,
        showOnboardingExperience: true,
        onboardingExperienceCompleted: true,
        homeLiveboardIdentifier: "homeLiveboardIdentifier_example",
        favoriteMetadata: [
          {
            identifier: "identifier_example",
            type: "LIVEBOARD",
          },
        ],
      },
    ],
    defaultPassword: "defaultPassword_example",
    dryRun: true,
    deleteUnspecifiedUsers: false,
  },
};

apiInstance.importUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importUsersRequest** | **ImportUsersRequest**|  |


### Return type

**ImportUsersResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Import users operation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **login**
> void login()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiLoginRequest = {
  // LoginRequest (optional)
  loginRequest: {
    username: "username_example",
    password: "password_example",
    orgIdentifier: "orgIdentifier_example",
    rememberMe: false,
  },
};

apiInstance.login(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginRequest** | **LoginRequest**|  |


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
**204** | User login successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **logout**
> void logout()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Logs out a user from their current session.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:any = {};

apiInstance.logout(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


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
**204** | User logout successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **resetUserPassword**
> void resetUserPassword(resetUserPasswordRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiResetUserPasswordRequest = {
  // ResetUserPasswordRequest
  resetUserPasswordRequest: {
    newPassword: "newPassword_example",
    userIdentifier: "userIdentifier_example",
  },
};

apiInstance.resetUserPassword(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resetUserPasswordRequest** | **ResetUserPasswordRequest**|  |


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
**204** | User password reset operation successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **revokeToken**
> void revokeToken()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiRevokeTokenRequest = {
  // RevokeTokenRequest (optional)
  revokeTokenRequest: {
    userIdentifier: "userIdentifier_example",
    token: "token_example",
  },
};

apiInstance.revokeToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revokeTokenRequest** | **RevokeTokenRequest**|  |


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
**204** | Token successfully revoked. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchData**
> SearchDataResponse searchData(searchDataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiSearchDataRequest = {
  // SearchDataRequest
  searchDataRequest: {
    queryString: "queryString_example",
    logicalTableIdentifier: "logicalTableIdentifier_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  },
};

apiInstance.searchData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchDataRequest** | **SearchDataRequest**|  |


### Return type

**SearchDataResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching data of specified metadata object is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchMetadata**
> Array<MetadataSearchResponse> searchMetadata()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  * To get all metadata objects, send the API request without any attributes. * To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. * To get a specific metadata object, specify the GUID. * To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiSearchMetadataRequest = {
  // SearchMetadataRequest (optional)
  searchMetadataRequest: {
    metadata: [
      {
        identifier: "identifier_example",
        namePattern: "namePattern_example",
        type: "LIVEBOARD",
      },
    ],
    permissions: [
      {
        principal: {
          identifier: "identifier_example",
          type: "USER",
        },
        shareMode: "READ_ONLY",
      },
    ],
    createdByUserIdentifiers: [
      "createdByUserIdentifiers_example",
    ],
    dependentObjectVersion: "V1",
    excludeObjects: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    favoriteObjectOptions: {
      include: false,
      userIdentifiers: [
        "userIdentifiers_example",
      ],
    },
    includeAutoCreatedObjects: false,
    includeDependentObjects: false,
    includeDetails: false,
    includeHeaders: true,
    includeHiddenObjects: false,
    includeIncompleteObjects: false,
    includeVisualizationHeaders: false,
    includeWorksheetSearchAssistData: true,
    modifiedByUserIdentifiers: [
      "modifiedByUserIdentifiers_example",
    ],
    recordOffset: 0,
    recordSize: 10,
    sortOptions: {
      fieldName: "NAME",
      order: "ASC",
    },
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
    includeStats: false,
  },
};

apiInstance.searchMetadata(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchMetadataRequest** | **SearchMetadataRequest**|  |


### Return type

**Array<MetadataSearchResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Metadata objects search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchOrgs**
> Array<OrgResponse> searchOrgs()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiSearchOrgsRequest = {
  // SearchOrgsRequest (optional)
  searchOrgsRequest: {
    orgIdentifier: "orgIdentifier_example",
    description: "description_example",
    visibility: "SHOW",
    status: "ACTIVE",
    userIdentifiers: [
      "userIdentifiers_example",
    ],
  },
};

apiInstance.searchOrgs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchOrgsRequest** | **SearchOrgsRequest**|  |


### Return type

**Array<OrgResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchTags**
> Array<Tag> searchTags()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiSearchTagsRequest = {
  // SearchTagsRequest (optional)
  searchTagsRequest: {
    tagIdentifier: "tagIdentifier_example",
    color: "color_example",
  },
};

apiInstance.searchTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTagsRequest** | **SearchTagsRequest**|  |


### Return type

**Array<Tag>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tags search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchUserGroups**
> Array<UserGroupResponse> searchUserGroups()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiSearchUserGroupsRequest = {
  // SearchUserGroupsRequest (optional)
  searchUserGroupsRequest: {
    defaultLiveboardIdentifiers: [
      "defaultLiveboardIdentifiers_example",
    ],
    description: "description_example",
    displayName: "displayName_example",
    groupIdentifier: "groupIdentifier_example",
    orgIdentifiers: [
      "orgIdentifiers_example",
    ],
    privileges: [
      "ADMINISTRATION",
    ],
    subGroupIdentifiers: [
      "subGroupIdentifiers_example",
    ],
    type: "LOCAL_GROUP",
    userIdentifiers: [
      "userIdentifiers_example",
    ],
    visibility: "SHARABLE",
    roleIdentifiers: [
      "roleIdentifiers_example",
    ],
    recordOffset: 0,
    recordSize: 10,
    sortOptions: {
      fieldName: "NAME",
      order: "ASC",
    },
  },
};

apiInstance.searchUserGroups(body).then((data:any) => {
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

# **searchUsers**
> Array<User> searchUsers()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiSearchUsersRequest = {
  // SearchUsersRequest (optional)
  searchUsersRequest: {
    userIdentifier: "userIdentifier_example",
    displayName: "displayName_example",
    visibility: "SHARABLE",
    email: "email_example",
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
    privileges: [
      "ADMINISTRATION",
    ],
    accountType: "LOCAL_USER",
    accountStatus: "ACTIVE",
    notifyOnShare: true,
    showOnboardingExperience: true,
    onboardingExperienceCompleted: true,
    orgIdentifiers: [
      "orgIdentifiers_example",
    ],
    homeLiveboardIdentifier: "homeLiveboardIdentifier_example",
    favoriteMetadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    recordOffset: 0,
    recordSize: 10,
    sortOptions: {
      fieldName: "NAME",
      order: "ASC",
    },
    roleIdentifiers: [
      "roleIdentifiers_example",
    ],
    includeFavoriteMetadata: false,
  },
};

apiInstance.searchUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchUsersRequest** | **SearchUsersRequest**|  |


### Return type

**Array<User>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **shareMetadata**
> void shareMetadata(shareMetadataRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiShareMetadataRequest = {
  // ShareMetadataRequest
  shareMetadataRequest: {
    metadataType: "LIVEBOARD",
    metadataIdentifiers: [
      "metadataIdentifiers_example",
    ],
    permissions: [
      {
        principal: {
          identifier: "identifier_example",
          type: "USER",
        },
        shareMode: "READ_ONLY",
      },
    ],
    visualizationIdentifiers: [
      "visualizationIdentifiers_example",
    ],
    emails: [
      "emails_example",
    ],
    message: "message_example",
    enableCustomUrl: false,
  },
};

apiInstance.shareMetadata(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareMetadataRequest** | **ShareMetadataRequest**|  |


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
**204** | Sharing metadata objects is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **unassignTag**
> void unassignTag(assignTagRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiUnassignTagRequest = {
  // AssignTagRequest
  assignTagRequest: {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
  },
};

apiInstance.unassignTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignTagRequest** | **AssignTagRequest**|  |


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
**204** | Tags successfully unassigned. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateOrg**
> void updateOrg()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiUpdateOrgRequest = {
  // string | ID or name of the Org.
  orgIdentifier: "org_identifier_example",
  // UpdateOrgRequest (optional)
  updateOrgRequest: {
    name: "name_example",
    description: "description_example",
    userIdentifiers: [
      "userIdentifiers_example",
    ],
    operation: "ADD",
  },
};

apiInstance.updateOrg(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateOrgRequest** | **UpdateOrgRequest**|  |
 **orgIdentifier** | [**string**] | ID or name of the Org. | defaults to undefined


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
**204** | Organization successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateTag**
> void updateTag()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiUpdateTagRequest = {
  // string | Name or Id of the tag.
  tagIdentifier: "tag_identifier_example",
  // UpdateTagRequest (optional)
  updateTagRequest: {
    name: "name_example",
    color: "color_example",
  },
};

apiInstance.updateTag(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateTagRequest** | **UpdateTagRequest**|  |
 **tagIdentifier** | [**string**] | Name or Id of the tag. | defaults to undefined


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
**204** | Tag successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateUser**
> void updateUser()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiUpdateUserRequest = {
  // string | GUID / name of the user
  userIdentifier: "user_identifier_example",
  // UpdateUserRequest (optional)
  updateUserRequest: {
    name: "name_example",
    displayName: "displayName_example",
    visibility: "SHARABLE",
    email: "email_example",
    accountStatus: "ACTIVE",
    notifyOnShare: true,
    showOnboardingExperience: true,
    onboardingExperienceCompleted: true,
    accountType: "LOCAL_USER",
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
    homeLiveboardIdentifier: "homeLiveboardIdentifier_example",
    favoriteMetadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    orgIdentifiers: [
      "orgIdentifiers_example",
    ],
    operation: "REPLACE",
  },
};

apiInstance.updateUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserRequest** | **UpdateUserRequest**|  |
 **userIdentifier** | [**string**] | GUID / name of the user | defaults to undefined


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
**204** | User successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateUserGroup**
> void updateUserGroup()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class900ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class900ClApiUpdateUserGroupRequest = {
  // string | GUID or name of the group.
  groupIdentifier: "group_identifier_example",
  // UpdateUserGroupRequest (optional)
  updateUserGroupRequest: {
    name: "name_example",
    defaultLiveboardIdentifiers: [
      "defaultLiveboardIdentifiers_example",
    ],
    description: "description_example",
    displayName: "displayName_example",
    privileges: [
      "ADMINISTRATION",
    ],
    subGroupIdentifiers: [
      "subGroupIdentifiers_example",
    ],
    type: "LOCAL_GROUP",
    userIdentifiers: [
      "userIdentifiers_example",
    ],
    visibility: "SHARABLE",
    roleIdentifiers: [
      "roleIdentifiers_example",
    ],
    operation: "REPLACE",
  },
};

apiInstance.updateUserGroup(body).then((data:any) => {
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

