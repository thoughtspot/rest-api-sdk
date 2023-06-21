# ThoughtSpotRestApiSdk.ThoughtSpotRestApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignChangeAuthor**](ThoughtSpotRestApi.md#assignChangeAuthor) | **POST** /api/rest/2.0/security/metadata/assign | 
[**assignTag**](ThoughtSpotRestApi.md#assignTag) | **POST** /api/rest/2.0/tags/assign | 
[**changeUserPassword**](ThoughtSpotRestApi.md#changeUserPassword) | **POST** /api/rest/2.0/users/change-password | 
[**commitBranch**](ThoughtSpotRestApi.md#commitBranch) | **POST** /api/rest/2.0/vcs/git/branches/commit | 
[**createConfig**](ThoughtSpotRestApi.md#createConfig) | **POST** /api/rest/2.0/vcs/git/config/create | 
[**createConnection**](ThoughtSpotRestApi.md#createConnection) | **POST** /api/rest/2.0/connection/create | 
[**createCustomAction**](ThoughtSpotRestApi.md#createCustomAction) | **POST** /api/rest/2.0/customization/custom-actions | 
[**createOrg**](ThoughtSpotRestApi.md#createOrg) | **POST** /api/rest/2.0/orgs/create | 
[**createRole**](ThoughtSpotRestApi.md#createRole) | **POST** /api/rest/2.0/roles/create | 
[**createSchedule**](ThoughtSpotRestApi.md#createSchedule) | **POST** /api/rest/2.0/schedules/create | 
[**createTag**](ThoughtSpotRestApi.md#createTag) | **POST** /api/rest/2.0/tags/create | 
[**createUser**](ThoughtSpotRestApi.md#createUser) | **POST** /api/rest/2.0/users/create | 
[**createUserGroup**](ThoughtSpotRestApi.md#createUserGroup) | **POST** /api/rest/2.0/groups/create | 
[**deleteConfig**](ThoughtSpotRestApi.md#deleteConfig) | **POST** /api/rest/2.0/vcs/git/config/delete | 
[**deleteConnection**](ThoughtSpotRestApi.md#deleteConnection) | **POST** /api/rest/2.0/connection/delete | 
[**deleteCustomAction**](ThoughtSpotRestApi.md#deleteCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete | 
[**deleteMetadata**](ThoughtSpotRestApi.md#deleteMetadata) | **POST** /api/rest/2.0/metadata/delete | 
[**deleteOrg**](ThoughtSpotRestApi.md#deleteOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/delete | 
[**deleteRole**](ThoughtSpotRestApi.md#deleteRole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete | 
[**deleteSchedule**](ThoughtSpotRestApi.md#deleteSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete | 
[**deleteTag**](ThoughtSpotRestApi.md#deleteTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/delete | 
[**deleteUser**](ThoughtSpotRestApi.md#deleteUser) | **POST** /api/rest/2.0/users/{user_identifier}/delete | 
[**deleteUserGroup**](ThoughtSpotRestApi.md#deleteUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/delete | 
[**deployCommit**](ThoughtSpotRestApi.md#deployCommit) | **POST** /api/rest/2.0/vcs/git/commits/deploy | 
[**exportAnswerReport**](ThoughtSpotRestApi.md#exportAnswerReport) | **POST** /api/rest/2.0/report/answer | 
[**exportLiveboardReport**](ThoughtSpotRestApi.md#exportLiveboardReport) | **POST** /api/rest/2.0/report/liveboard | 
[**exportMetadataTML**](ThoughtSpotRestApi.md#exportMetadataTML) | **POST** /api/rest/2.0/metadata/tml/export | 
[**fetchAnswerData**](ThoughtSpotRestApi.md#fetchAnswerData) | **POST** /api/rest/2.0/metadata/answer/data | 
[**fetchAnswerSqlQuery**](ThoughtSpotRestApi.md#fetchAnswerSqlQuery) | **POST** /api/rest/2.0/metadata/answer/sql | 
[**fetchLiveboardData**](ThoughtSpotRestApi.md#fetchLiveboardData) | **POST** /api/rest/2.0/metadata/liveboard/data | 
[**fetchLiveboardSqlQuery**](ThoughtSpotRestApi.md#fetchLiveboardSqlQuery) | **POST** /api/rest/2.0/metadata/liveboard/sql | 
[**fetchLogs**](ThoughtSpotRestApi.md#fetchLogs) | **POST** /api/rest/2.0/logs/fetch | 
[**fetchPermissionsOfPrincipals**](ThoughtSpotRestApi.md#fetchPermissionsOfPrincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions | 
[**fetchPermissionsOnMetadata**](ThoughtSpotRestApi.md#fetchPermissionsOnMetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions | 
[**forceLogoutUsers**](ThoughtSpotRestApi.md#forceLogoutUsers) | **POST** /api/rest/2.0/users/force-logout | 
[**getCurrentUserInfo**](ThoughtSpotRestApi.md#getCurrentUserInfo) | **GET** /api/rest/2.0/auth/session/user | 
[**getCurrentUserToken**](ThoughtSpotRestApi.md#getCurrentUserToken) | **GET** /api/rest/2.0/auth/session/token | 
[**getFullAccessToken**](ThoughtSpotRestApi.md#getFullAccessToken) | **POST** /api/rest/2.0/auth/token/full | 
[**getObjectAccessToken**](ThoughtSpotRestApi.md#getObjectAccessToken) | **POST** /api/rest/2.0/auth/token/object | 
[**getSystemConfig**](ThoughtSpotRestApi.md#getSystemConfig) | **GET** /api/rest/2.0/system/config | 
[**getSystemInformation**](ThoughtSpotRestApi.md#getSystemInformation) | **GET** /api/rest/2.0/system | 
[**getSystemOverrideInfo**](ThoughtSpotRestApi.md#getSystemOverrideInfo) | **GET** /api/rest/2.0/system/config-overrides | 
[**importMetadataTML**](ThoughtSpotRestApi.md#importMetadataTML) | **POST** /api/rest/2.0/metadata/tml/import | 
[**importUserGroups**](ThoughtSpotRestApi.md#importUserGroups) | **POST** /api/rest/2.0/groups/import | 
[**importUsers**](ThoughtSpotRestApi.md#importUsers) | **POST** /api/rest/2.0/users/import | 
[**login**](ThoughtSpotRestApi.md#login) | **POST** /api/rest/2.0/auth/session/login | 
[**logout**](ThoughtSpotRestApi.md#logout) | **POST** /api/rest/2.0/auth/session/logout | 
[**resetUserPassword**](ThoughtSpotRestApi.md#resetUserPassword) | **POST** /api/rest/2.0/users/reset-password | 
[**revertCommit**](ThoughtSpotRestApi.md#revertCommit) | **POST** /api/rest/2.0/vcs/git/commits/{commit_id}/revert | 
[**revokeToken**](ThoughtSpotRestApi.md#revokeToken) | **POST** /api/rest/2.0/auth/token/revoke | 
[**searchCommits**](ThoughtSpotRestApi.md#searchCommits) | **POST** /api/rest/2.0/vcs/git/commits/search | 
[**searchConfig**](ThoughtSpotRestApi.md#searchConfig) | **POST** /api/rest/2.0/vcs/git/config/search | 
[**searchConnection**](ThoughtSpotRestApi.md#searchConnection) | **POST** /api/rest/2.0/connection/search | 
[**searchCustomActions**](ThoughtSpotRestApi.md#searchCustomActions) | **POST** /api/rest/2.0/customization/custom-actions/search | 
[**searchData**](ThoughtSpotRestApi.md#searchData) | **POST** /api/rest/2.0/searchdata | 
[**searchMetadata**](ThoughtSpotRestApi.md#searchMetadata) | **POST** /api/rest/2.0/metadata/search | 
[**searchOrgs**](ThoughtSpotRestApi.md#searchOrgs) | **POST** /api/rest/2.0/orgs/search | 
[**searchRoles**](ThoughtSpotRestApi.md#searchRoles) | **POST** /api/rest/2.0/roles/search | 
[**searchSchedules**](ThoughtSpotRestApi.md#searchSchedules) | **POST** /api/rest/2.0/schedules/search | 
[**searchTags**](ThoughtSpotRestApi.md#searchTags) | **POST** /api/rest/2.0/tags/search | 
[**searchUserGroups**](ThoughtSpotRestApi.md#searchUserGroups) | **POST** /api/rest/2.0/groups/search | 
[**searchUsers**](ThoughtSpotRestApi.md#searchUsers) | **POST** /api/rest/2.0/users/search | 
[**shareMetadata**](ThoughtSpotRestApi.md#shareMetadata) | **POST** /api/rest/2.0/security/metadata/share | 
[**unassignTag**](ThoughtSpotRestApi.md#unassignTag) | **POST** /api/rest/2.0/tags/unassign | 
[**updateConfig**](ThoughtSpotRestApi.md#updateConfig) | **POST** /api/rest/2.0/vcs/git/config/update | 
[**updateConnection**](ThoughtSpotRestApi.md#updateConnection) | **POST** /api/rest/2.0/connection/update | 
[**updateCustomAction**](ThoughtSpotRestApi.md#updateCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update | 
[**updateOrg**](ThoughtSpotRestApi.md#updateOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/update | 
[**updateRole**](ThoughtSpotRestApi.md#updateRole) | **POST** /api/rest/2.0/roles/{role_identifier}/update | 
[**updateSchedule**](ThoughtSpotRestApi.md#updateSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update | 
[**updateSystemConfig**](ThoughtSpotRestApi.md#updateSystemConfig) | **POST** /api/rest/2.0/system/config-update | 
[**updateTag**](ThoughtSpotRestApi.md#updateTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/update | 
[**updateUser**](ThoughtSpotRestApi.md#updateUser) | **POST** /api/rest/2.0/users/{user_identifier}/update | 
[**updateUserGroup**](ThoughtSpotRestApi.md#updateUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/update | 
[**validateMerge**](ThoughtSpotRestApi.md#validateMerge) | **POST** /api/rest/2.0/vcs/git/branches/validate | 


# **assignChangeAuthor**
> void assignChangeAuthor(assignChangeAuthorRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, AssignChangeAuthorRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.assignChangeAuthor(
  // AssignChangeAuthorRequest
  {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    userIdentifier: "userIdentifier_example",
    currentOwnerIdentifier: "currentOwnerIdentifier_example",
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, AssignTagRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.assignTag(
  // AssignTagRequest
  {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, ChangeUserPasswordRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.changeUserPassword(
  // ChangeUserPasswordRequest
  {
    currentPassword: "currentPassword_example",
    newPassword: "newPassword_example",
    userIdentifier: "userIdentifier_example",
  } 
).then((data:any) => {
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

# **commitBranch**
> CommitResponse commitBranch(commitBranchRequest)

   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, CommitBranchRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.commitBranch(
  // CommitBranchRequest
  {
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    branchName: "branchName_example",
    comment: "comment_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitBranchRequest** | **CommitBranchRequest**|  |


### Return type

**CommitResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully committed the metadata objects |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createConfig**
> RepoConfigObject createConfig(createConfigRequest)

   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, CreateConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createConfig(
  // CreateConfigRequest
  {
    repositoryUrl: "repositoryUrl_example",
    username: "username_example",
    accessToken: "accessToken_example",
    orgIdentifier: "orgIdentifier_example",
    branchNames: [
      "branchNames_example",
    ],
    defaultBranchName: "defaultBranchName_example",
    enableGuidMapping: false,
    guidMappingBranchName: "guidMappingBranchName_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConfigRequest** | **CreateConfigRequest**|  |


### Return type

**RepoConfigObject**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully configured local repository |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createConnection**
> CreateConnectionResponse createConnection(createConnectionRequest)

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, CreateConnectionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createConnection(
  // CreateConnectionRequest
  {
    name: "name_example",
    description: "description_example",
    dataWarehouseType: "SNOWFLAKE",
    dataWarehouseConfig: {},
    validate: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConnectionRequest** | **CreateConnectionRequest**|  |


### Return type

**CreateConnectionResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Connection to the datasource successfully created. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createCustomAction**
> ResponseCustomAction createCustomAction(createCustomActionRequest)

Create a custom action  Equivalent to POST /customization/custom-actions <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, CreateCustomActionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createCustomAction(
  // CreateCustomActionRequest
  {
    name: "name_example",
    actionDetails: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          aPIKey: {
            key: "key_example",
            value: "value_example",
          },
          basicAuth: {
            password: "password_example",
            username: "username_example",
          },
          bearerToken: "bearerToken_example",
          noAuth: "noAuth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
      },
    },
    associateMetadata: [
      {
        actionConfig: {
          position: "position_example",
          visibility: true,
        },
        identifier: "identifier_example",
        type: "type_example",
      },
    ],
    defaultActionConfig: {
      visibility: true,
    },
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCustomActionRequest** | **CreateCustomActionRequest**|  |


### Return type

**ResponseCustomAction**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom action created successfully. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, CreateOrgRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createOrg(
  // CreateOrgRequest
  {
    name: "name_example",
    description: "description_example",
  } 
).then((data:any) => {
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

# **createRole**
> RoleResponse createRole(createRoleRequest)

Creates a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, CreateRoleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createRole(
  // CreateRoleRequest
  {
    name: "name_example",
    description: "description_example",
    privileges: [
      "USERDATAUPLOADING",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRoleRequest** | **CreateRoleRequest**|  |


### Return type

**RoleResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Role successfully created. |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createSchedule**
> ResponseSchedule createSchedule(createScheduleRequest)

Create schedule. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, CreateScheduleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createSchedule(
  // CreateScheduleRequest
  {
    name: "name_example",
    description: "description_example",
    metadataType: "LIVEBOARD",
    metadataIdentifier: "metadataIdentifier_example",
    fileFormat: "PDF",
    liveboardOptions: {
      visualizationIdentifiers: [
        "visualizationIdentifiers_example",
      ],
    },
    pdfOptions: {
      completeLiveboard: true,
      includeCoverPage: true,
      includeCustomLogo: true,
      includeFilterPage: true,
      includePageNumber: true,
      pageFooterText: "pageFooterText_example",
      pageOrientation: "pageOrientation_example",
      pageSize: "A4",
      truncateTable: true,
    },
    timeZone: "America/Los_Angeles",
    frequency: {
      cronExpression: {
        dayOfMonth: "dayOfMonth_example",
        dayOfWeek: "dayOfWeek_example",
        hour: "hour_example",
        minute: "minute_example",
        month: "month_example",
        second: "second_example",
      },
    },
    recipientDetails: {
      emails: [
        "emails_example",
      ],
      principals: [
        {
          identifier: "identifier_example",
          type: "type_example",
        },
      ],
    },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createScheduleRequest** | **CreateScheduleRequest**|  |


### Return type

**ResponseSchedule**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Schedule successfully created. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, CreateTagRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createTag(
  // CreateTagRequest
  {
    name: "name_example",
    color: "color_example",
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, CreateUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createUser(
  // CreateUserRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, CreateUserGroupRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.createUserGroup(
  // CreateUserGroupRequest
  {
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

# **deleteConfig**
> void deleteConfig()

   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, DeleteConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteConfig(
  // DeleteConfigRequest (optional)
  {
    clusterLevel: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteConfigRequest** | **DeleteConfigRequest**|  |


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
**204** | Successfully deleted local repository configuration |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteConnection**
> void deleteConnection(deleteConnectionRequest)

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, DeleteConnectionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteConnection(
  // DeleteConnectionRequest
  {
    connectionIdentifier: "connectionIdentifier_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteConnectionRequest** | **DeleteConnectionRequest**|  |


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
**204** | Connection successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteCustomAction**
> void deleteCustomAction()

Deletes a custom action from the current organization  Equivalent to DELETE /customization/custom-actions/{custom_action_identifier} <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, DeleteCustomActionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteCustomAction(
  // string | Unique ID or name of the Custom action.
  "custom_action_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customActionIdentifier** | [**string**] | Unique ID or name of the Custom action. | defaults to undefined


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
**204** | Custom action is successfully deleted. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, DeleteMetadataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteMetadata(
  // DeleteMetadataRequest
  {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    deleteDisabledObjects: false,
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, DeleteOrgRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteOrg(
  // string | ID or name of the Org.
  "org_identifier_example" 
).then((data:any) => {
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

# **deleteRole**
> void deleteRole()

Deletes a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, DeleteRoleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteRole(
  // string | Unique ID or name of the role.
  "role_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleIdentifier** | [**string**] | Unique ID or name of the role. | defaults to undefined


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
**204** | Role successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteSchedule**
> void deleteSchedule()

Deletes a schedule <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, DeleteScheduleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteSchedule(
  // string | Unique ID or name of the schedule.
  "schedule_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleIdentifier** | [**string**] | Unique ID or name of the schedule. | defaults to undefined


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
**204** | Schedule successfully deleted. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, DeleteTagRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteTag(
  // string | Tag identifier Tag name or Tag id.
  "tag_identifier_example" 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, DeleteUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deleteUser(
  // string | GUID / name of the user
  "user_identifier_example" 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, DeleteUserGroupRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

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

# **deployCommit**
> Array<DeployResponse> deployCommit()

   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, DeployCommitRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.deployCommit(
  // DeployCommitRequest (optional)
  {
    commitId: "commitId_example",
    branchName: "branchName_example",
    deployType: "DELTA",
    deployPolicy: "ALL_OR_NONE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployCommitRequest** | **DeployCommitRequest**|  |


### Return type

**Array<DeployResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deployed the changes |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, ExportAnswerReportRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.exportAnswerReport(
  // ExportAnswerReportRequest
  {
    metadataIdentifier: "metadataIdentifier_example",
    fileFormat: "CSV",
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
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
import { createConfiguration, ThoughtSpotRestApi, ExportLiveboardReportRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.exportLiveboardReport(
  // ExportLiveboardReportRequest
  {
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
import { createConfiguration, ThoughtSpotRestApi, ExportMetadataTMLRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.exportMetadataTML(
  // ExportMetadataTMLRequest
  {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    exportAssociated: false,
    exportFqn: false,
    edocFormat: "JSON",
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, FetchAnswerDataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.fetchAnswerData(
  // FetchAnswerDataRequest
  {
    metadataIdentifier: "metadataIdentifier_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, FetchAnswerSqlQueryRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.fetchAnswerSqlQuery(
  // FetchAnswerSqlQueryRequest
  {
    metadataIdentifier: "metadataIdentifier_example",
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, FetchLiveboardDataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.fetchLiveboardData(
  // FetchLiveboardDataRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, FetchLiveboardSqlQueryRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.fetchLiveboardSqlQuery(
  // FetchLiveboardSqlQueryRequest
  {
    metadataIdentifier: "metadataIdentifier_example",
    visualizationIdentifiers: [
      "visualizationIdentifiers_example",
    ],
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, FetchLogsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.fetchLogs(
  // FetchLogsRequest
  {
    logType: "SECURITY_AUDIT",
    startEpochTimeInMillis: 3.14,
    endEpochTimeInMillis: 3.14,
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, FetchPermissionsOfPrincipalsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.fetchPermissionsOfPrincipals(
  // FetchPermissionsOfPrincipalsRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, FetchPermissionsOnMetadataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.fetchPermissionsOnMetadata(
  // FetchPermissionsOnMetadataRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, ForceLogoutUsersRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.forceLogoutUsers(
  // ForceLogoutUsersRequest (optional)
  {
    userIdentifiers: [
      "userIdentifiers_example",
    ],
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, GetCurrentUserInfoRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.getCurrentUserInfo().then((data:any) => {
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

# **getCurrentUserToken**
> GetTokenResponse getCurrentUserToken()

 Get token for the currently logged-in user. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>  Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, GetCurrentUserTokenRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.getCurrentUserToken().then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**GetTokenResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetching token for current user successful. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, GetFullAccessTokenRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.getFullAccessToken(
  // GetFullAccessTokenRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, GetObjectAccessTokenRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.getObjectAccessToken(
  // GetObjectAccessTokenRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, GetSystemConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.getSystemConfig().then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, GetSystemInformationRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.getSystemInformation().then((data:any) => {
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

# **getSystemOverrideInfo**
> any getSystemOverrideInfo()

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.       #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, GetSystemOverrideInfoRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.getSystemOverrideInfo().then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cluster configuration which can be overridden. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, ImportMetadataTMLRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.importMetadataTML(
  // ImportMetadataTMLRequest
  {
    metadataTmls: [
      "metadataTmls_example",
    ],
    importPolicy: "PARTIAL",
    createNew: false,
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, ImportUserGroupsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.importUserGroups(
  // ImportUserGroupsRequest (optional)
  {
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

# **importUsers**
> ImportUsersResponse importUsers(importUsersRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, ImportUsersRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.importUsers(
  // ImportUsersRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, LoginRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.login(
  // LoginRequest (optional)
  {
    username: "username_example",
    password: "password_example",
    orgIdentifier: "orgIdentifier_example",
    rememberMe: false,
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, LogoutRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.logout().then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, ResetUserPasswordRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.resetUserPassword(
  // ResetUserPasswordRequest
  {
    newPassword: "newPassword_example",
    userIdentifier: "userIdentifier_example",
  } 
).then((data:any) => {
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

# **revertCommit**
> RevertResponse revertCommit()

   Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, RevertCommitRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.revertCommit(
  // string | Commit id to which the object should be reverted
  "commit_id_example" , 
  // RevertCommitRequest (optional)
  {
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    branchName: "branchName_example",
    revertPolicy: "ALL_OR_NONE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revertCommitRequest** | **RevertCommitRequest**|  |
 **commitId** | [**string**] | Commit id to which the object should be reverted | defaults to undefined


### Return type

**RevertResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Reverted the object to the commit point specified |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, RevokeTokenRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.revokeToken(
  // RevokeTokenRequest (optional)
  {
    userIdentifier: "userIdentifier_example",
    token: "token_example",
  } 
).then((data:any) => {
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

# **searchCommits**
> Array<CommitHistoryResponse> searchCommits(searchCommitsRequest)

   Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, SearchCommitsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchCommits(
  // SearchCommitsRequest
  {
    metadataIdentifier: "metadataIdentifier_example",
    metadataType: "LIVEBOARD",
    branchName: "branchName_example",
    recordOffset: 1,
    recordSize: 1,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCommitsRequest** | **SearchCommitsRequest**|  |


### Return type

**Array<CommitHistoryResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Commit history of the metadata object |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchConfig**
> Array<RepoConfigObject> searchConfig()

   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, SearchConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchConfig(
  // SearchConfigRequest (optional)
  {
    orgIdentifiers: [
      "orgIdentifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchConfigRequest** | **SearchConfigRequest**|  |


### Return type

**Array<RepoConfigObject>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Details of local repository configuration |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchConnection**
> Array<SearchConnectionResponse> searchConnection()

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Gets connection objects configured on the ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  * To get a list of all connection objects available in the ThoughtSpot system, send a `POST` request with no attributes in the request body. * To get the connection objects created for a specific type of data warehouse, set the type in `data_warehouse_types`. * To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. * To get details of the database, schemas, tables, or columns from a data connection object, specify the `data_warehouse_object_type` attribute. * To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`). ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ``` * To include more details about connection objects in the API response, set `include_details` to `true`. * You can also sort the output by field names and filter connections by tags.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, SearchConnectionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchConnection(
  // SearchConnectionRequest (optional)
  {
    connections: [
      {
        identifier: "identifier_example",
        namePattern: "namePattern_example",
        dataWarehouseObjects: [
          {
            database: "database_example",
            schema: "schema_example",
            table: "table_example",
            column: "column_example",
          },
        ],
      },
    ],
    dataWarehouseTypes: [
      "SNOWFLAKE",
    ],
    recordOffset: 0,
    recordSize: 10,
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
    dataWarehouseObjectType: "DATABASE",
    sortOptions: {
      fieldName: "NAME",
      order: "ASC",
    },
    includeDetails: true,
    configuration: {},
    authenticationType: "SERVICE_ACCOUNT",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchConnectionRequest** | **SearchConnectionRequest**|  |


### Return type

**Array<SearchConnectionResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of connections to the datasource. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchCustomActions**
> Array<ResponseCustomAction> searchCustomActions()

Search custom actions  Equivalent to POST /customization/custom-actions/search <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, SearchCustomActionsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchCustomActions(
  // SearchCustomActionsRequest (optional)
  {
    customActionIdentifier: "customActionIdentifier_example",
    defaultActionConfig: {
      visibility: true,
    },
    includeGroupAssociations: true,
    includeMetadataAssociations: true,
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    type: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          aPIKey: {
            key: "key_example",
            value: "value_example",
          },
          basicAuth: {
            password: "password_example",
            username: "username_example",
          },
          bearerToken: "bearerToken_example",
          noAuth: "noAuth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
      },
    },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCustomActionsRequest** | **SearchCustomActionsRequest**|  |


### Return type

**Array<ResponseCustomAction>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom action search is successful. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, SearchDataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchData(
  // SearchDataRequest
  {
    queryString: "queryString_example",
    logicalTableIdentifier: "logicalTableIdentifier_example",
    dataFormat: "COMPACT",
    recordOffset: 0,
    recordSize: 10,
    runtimeFilter: {},
    runtimeSort: {},
    runtimeParamOverride: {},
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, SearchMetadataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchMetadata(
  // SearchMetadataRequest (optional)
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, SearchOrgsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchOrgs(
  // SearchOrgsRequest (optional)
  {
    orgIdentifier: "orgIdentifier_example",
    description: "description_example",
    visibility: "SHOW",
    status: "ACTIVE",
    userIdentifiers: [
      "userIdentifiers_example",
    ],
  } 
).then((data:any) => {
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

# **searchRoles**
> Array<SearchRoleResponse> searchRoles()

Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, SearchRolesRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchRoles(
  // SearchRolesRequest (optional)
  {
    roleIdentifiers: [
      "roleIdentifiers_example",
    ],
    orgIdentifiers: [
      "orgIdentifiers_example",
    ],
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
    privileges: [
      "UNKNOWN",
    ],
    deprecated: true,
    external: true,
    sharedViaConnection: true,
    permissions: [
      "READ_ONLY",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRolesRequest** | **SearchRolesRequest**|  |


### Return type

**Array<SearchRoleResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Roles search result. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchSchedules**
> Array<ResponseSchedule> searchSchedules()

Search Schedules <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, SearchSchedulesRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchSchedules(
  // SearchSchedulesRequest (optional)
  {
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    recordOffset: 1,
    recordSize: 1,
    sortOptions: {
      fieldName: "fieldName_example",
      order: "order_example",
    },
    historyRunsOptions: {
      includeHistoryRuns: false,
      recordSize: 10,
      recordOffset: 0,
    },
    scheduleIdentifiers: [
      "scheduleIdentifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchSchedulesRequest** | **SearchSchedulesRequest**|  |


### Return type

**Array<ResponseSchedule>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Schedule search result. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, SearchTagsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchTags(
  // SearchTagsRequest (optional)
  {
    tagIdentifier: "tagIdentifier_example",
    color: "color_example",
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, SearchUserGroupsRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchUserGroups(
  // SearchUserGroupsRequest (optional)
  {
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

# **searchUsers**
> Array<User> searchUsers()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, SearchUsersRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.searchUsers(
  // SearchUsersRequest (optional)
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, ShareMetadataRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.shareMetadata(
  // ShareMetadataRequest
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, UnassignTagRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.unassignTag(
  // AssignTagRequest
  {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    tagIdentifiers: [
      "tagIdentifiers_example",
    ],
  } 
).then((data:any) => {
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

# **updateConfig**
> RepoConfigObject updateConfig()

   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, UpdateConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateConfig(
  // UpdateConfigRequest (optional)
  {
    username: "username_example",
    accessToken: "accessToken_example",
    orgIdentifier: "orgIdentifier_example",
    branchNames: [
      "branchNames_example",
    ],
    defaultBranchName: "defaultBranchName_example",
    enableGuidMapping: true,
    guidMappingBranchName: "guidMappingBranchName_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConfigRequest** | **UpdateConfigRequest**|  |


### Return type

**RepoConfigObject**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated local repository configuration |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateConnection**
> void updateConnection(updateConnectionRequest)

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, UpdateConnectionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateConnection(
  // UpdateConnectionRequest
  {
    connectionIdentifier: "connectionIdentifier_example",
    name: "name_example",
    description: "description_example",
    dataWarehouseConfig: {},
    validate: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConnectionRequest** | **UpdateConnectionRequest**|  |


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
**204** | Connection successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateCustomAction**
> void updateCustomAction()

Update a custom action for the current organization. Equivalent to PUT /customization/custom-actions/{custom_action_identifier} <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, UpdateCustomActionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateCustomAction(
  // string | Unique ID or name of the custom action.
  "custom_action_identifier_example" , 
  // UpdateCustomActionRequest (optional)
  {
    actionDetails: {
      CALLBACK: {
        reference: "reference_example",
      },
      URL: {
        authentication: {
          aPIKey: {
            key: "key_example",
            value: "value_example",
          },
          basicAuth: {
            password: "password_example",
            username: "username_example",
          },
          bearerToken: "bearerToken_example",
          noAuth: "noAuth_example",
        },
        parameters: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        url: "url_example",
      },
    },
    associateMetadata: [
      {
        actionConfig: {
          position: "position_example",
          visibility: true,
        },
        identifier: "identifier_example",
        type: "type_example",
      },
    ],
    defaultActionConfig: {
      visibility: true,
    },
    groupIdentifiers: [
      "groupIdentifiers_example",
    ],
    name: "name_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustomActionRequest** | **UpdateCustomActionRequest**|  |
 **customActionIdentifier** | [**string**] | Unique ID or name of the custom action. | defaults to undefined


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
**204** | Custom action updated successfully. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, UpdateOrgRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateOrg(
  // string | ID or name of the Org.
  "org_identifier_example" , 
  // UpdateOrgRequest (optional)
  {
    name: "name_example",
    description: "description_example",
    userIdentifiers: [
      "userIdentifiers_example",
    ],
    operation: "ADD",
  } 
).then((data:any) => {
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

# **updateRole**
> RoleResponse updateRole(updateRoleRequest)

Updates a Role. Requires cluster Administration or Role Administration privileges. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, UpdateRoleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateRole(
  // string | Unique ID or name of the role.
  "role_identifier_example" , 
  // UpdateRoleRequest
  {
    name: "name_example",
    description: "description_example",
    privileges: [
      "USERDATAUPLOADING",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateRoleRequest** | **UpdateRoleRequest**|  |
 **roleIdentifier** | [**string**] | Unique ID or name of the role. | defaults to undefined


### Return type

**RoleResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Role successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateSchedule**
> void updateSchedule()

Update schedule. <br/>  <span class=\"since-beta-tag\">Version: 9.4.0.cl or later</span>

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, UpdateScheduleRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateSchedule(
  // string | Unique ID or name of the schedule.
  "schedule_identifier_example" , 
  // UpdateScheduleRequest (optional)
  {
    name: "name_example",
    description: "description_example",
    metadataType: "LIVEBOARD",
    metadataIdentifier: "metadataIdentifier_example",
    fileFormat: "CSV",
    liveboardOptions: {
      visualizationIdentifiers: [
        "visualizationIdentifiers_example",
      ],
    },
    pdfOptions: {
      completeLiveboard: true,
      includeCoverPage: true,
      includeCustomLogo: true,
      includeFilterPage: true,
      includePageNumber: true,
      pageFooterText: "pageFooterText_example",
      pageOrientation: "pageOrientation_example",
      pageSize: "A4",
      truncateTable: true,
    },
    timeZone: "timeZone_example",
    frequency: {
      cronExpression: {
        dayOfMonth: "dayOfMonth_example",
        dayOfWeek: "dayOfWeek_example",
        hour: "hour_example",
        minute: "minute_example",
        month: "month_example",
        second: "second_example",
      },
    },
    recipientDetails: {
      emails: [
        "emails_example",
      ],
      principals: [
        {
          identifier: "identifier_example",
          type: "type_example",
        },
      ],
    },
    status: "ACTIVE",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateScheduleRequest** | **UpdateScheduleRequest**|  |
 **scheduleIdentifier** | [**string**] | Unique ID or name of the schedule. | defaults to undefined


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
**204** | Schedule successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateSystemConfig**
> void updateSystemConfig(updateSystemConfigRequest)

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, UpdateSystemConfigRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateSystemConfig(
  // UpdateSystemConfigRequest
  {
    configuration: {},
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSystemConfigRequest** | **UpdateSystemConfigRequest**|  |


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
**204** | Configuration successfully updated. |  -  |
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
import { createConfiguration, ThoughtSpotRestApi, UpdateTagRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateTag(
  // string | Name or Id of the tag.
  "tag_identifier_example" , 
  // UpdateTagRequest (optional)
  {
    name: "name_example",
    color: "color_example",
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, UpdateUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateUser(
  // string | GUID / name of the user
  "user_identifier_example" , 
  // UpdateUserRequest (optional)
  {
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
  } 
).then((data:any) => {
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
import { createConfiguration, ThoughtSpotRestApi, UpdateUserGroupRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.updateUserGroup(
  // string | GUID or name of the group.
  "group_identifier_example" , 
  // UpdateUserGroupRequest (optional)
  {
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

# **validateMerge**
> Array<DeployResponse> validateMerge(validateMergeRequest)

   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, ThoughtSpotRestApi, ValidateMergeRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new ThoughtSpotRestApi(configuration);

apiInstance.validateMerge(
  // ValidateMergeRequest
  {
    sourceBranchName: "sourceBranchName_example",
    targetBranchName: "targetBranchName_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validateMergeRequest** | **ValidateMergeRequest**|  |


### Return type

**Array<DeployResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | validation done successfully |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

