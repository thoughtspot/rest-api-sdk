# ThoughtSpotRestApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUser**](ThoughtSpotRestApi.md#activateUser) | **POST** /api/rest/2.0/users/activate |  |
| [**assignChangeAuthor**](ThoughtSpotRestApi.md#assignChangeAuthor) | **POST** /api/rest/2.0/security/metadata/assign |  |
| [**assignTag**](ThoughtSpotRestApi.md#assignTag) | **POST** /api/rest/2.0/tags/assign |  |
| [**changeUserPassword**](ThoughtSpotRestApi.md#changeUserPassword) | **POST** /api/rest/2.0/users/change-password |  |
| [**commitBranch**](ThoughtSpotRestApi.md#commitBranch) | **POST** /api/rest/2.0/vcs/git/branches/commit |  |
| [**copyObject**](ThoughtSpotRestApi.md#copyObject) | **POST** /api/rest/2.0/metadata/copyobject |  |
| [**createConfig**](ThoughtSpotRestApi.md#createConfig) | **POST** /api/rest/2.0/vcs/git/config/create |  |
| [**createConnection**](ThoughtSpotRestApi.md#createConnection) | **POST** /api/rest/2.0/connection/create |  |
| [**createConversation**](ThoughtSpotRestApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create |  |
| [**createCustomAction**](ThoughtSpotRestApi.md#createCustomAction) | **POST** /api/rest/2.0/customization/custom-actions |  |
| [**createOrg**](ThoughtSpotRestApi.md#createOrg) | **POST** /api/rest/2.0/orgs/create |  |
| [**createRole**](ThoughtSpotRestApi.md#createRole) | **POST** /api/rest/2.0/roles/create |  |
| [**createSchedule**](ThoughtSpotRestApi.md#createSchedule) | **POST** /api/rest/2.0/schedules/create |  |
| [**createTag**](ThoughtSpotRestApi.md#createTag) | **POST** /api/rest/2.0/tags/create |  |
| [**createUser**](ThoughtSpotRestApi.md#createUser) | **POST** /api/rest/2.0/users/create |  |
| [**createUserGroup**](ThoughtSpotRestApi.md#createUserGroup) | **POST** /api/rest/2.0/groups/create |  |
| [**dbtConnection**](ThoughtSpotRestApi.md#dbtConnection) | **POST** /api/rest/2.0/dbt/dbt-connection |  |
| [**dbtGenerateSyncTml**](ThoughtSpotRestApi.md#dbtGenerateSyncTml) | **POST** /api/rest/2.0/dbt/generate-sync-tml |  |
| [**dbtGenerateTml**](ThoughtSpotRestApi.md#dbtGenerateTml) | **POST** /api/rest/2.0/dbt/generate-tml |  |
| [**dbtSearch**](ThoughtSpotRestApi.md#dbtSearch) | **POST** /api/rest/2.0/dbt/search |  |
| [**deactivateUser**](ThoughtSpotRestApi.md#deactivateUser) | **POST** /api/rest/2.0/users/deactivate |  |
| [**deleteConfig**](ThoughtSpotRestApi.md#deleteConfig) | **POST** /api/rest/2.0/vcs/git/config/delete |  |
| [**deleteConnection**](ThoughtSpotRestApi.md#deleteConnection) | **POST** /api/rest/2.0/connection/delete |  |
| [**deleteConnectionV2**](ThoughtSpotRestApi.md#deleteConnectionV2) | **POST** /api/rest/2.0/connections/{connection_identifier}/delete |  |
| [**deleteCustomAction**](ThoughtSpotRestApi.md#deleteCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete |  |
| [**deleteDbtConnection**](ThoughtSpotRestApi.md#deleteDbtConnection) | **POST** /api/rest/2.0/dbt/{dbt_connection_identifier}/delete |  |
| [**deleteMetadata**](ThoughtSpotRestApi.md#deleteMetadata) | **POST** /api/rest/2.0/metadata/delete |  |
| [**deleteOrg**](ThoughtSpotRestApi.md#deleteOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/delete |  |
| [**deleteRole**](ThoughtSpotRestApi.md#deleteRole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete |  |
| [**deleteSchedule**](ThoughtSpotRestApi.md#deleteSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete |  |
| [**deleteTag**](ThoughtSpotRestApi.md#deleteTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/delete |  |
| [**deleteUser**](ThoughtSpotRestApi.md#deleteUser) | **POST** /api/rest/2.0/users/{user_identifier}/delete |  |
| [**deleteUserGroup**](ThoughtSpotRestApi.md#deleteUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/delete |  |
| [**deployCommit**](ThoughtSpotRestApi.md#deployCommit) | **POST** /api/rest/2.0/vcs/git/commits/deploy |  |
| [**downloadConnectionMetadataChanges**](ThoughtSpotRestApi.md#downloadConnectionMetadataChanges) | **POST** /api/rest/2.0/connections/download-connection-metadata-changes/{connection_identifier} |  |
| [**exportAnswerReport**](ThoughtSpotRestApi.md#exportAnswerReport) | **POST** /api/rest/2.0/report/answer |  |
| [**exportLiveboardReport**](ThoughtSpotRestApi.md#exportLiveboardReport) | **POST** /api/rest/2.0/report/liveboard |  |
| [**exportMetadataTML**](ThoughtSpotRestApi.md#exportMetadataTML) | **POST** /api/rest/2.0/metadata/tml/export |  |
| [**exportMetadataTMLBatched**](ThoughtSpotRestApi.md#exportMetadataTMLBatched) | **POST** /api/rest/2.0/metadata/tml/export/batch |  |
| [**fetchAnswerData**](ThoughtSpotRestApi.md#fetchAnswerData) | **POST** /api/rest/2.0/metadata/answer/data |  |
| [**fetchAnswerSqlQuery**](ThoughtSpotRestApi.md#fetchAnswerSqlQuery) | **POST** /api/rest/2.0/metadata/answer/sql |  |
| [**fetchAsyncImportTaskStatus**](ThoughtSpotRestApi.md#fetchAsyncImportTaskStatus) | **POST** /api/rest/2.0/metadata/tml/async/status |  |
| [**fetchConnectionDiffStatus**](ThoughtSpotRestApi.md#fetchConnectionDiffStatus) | **POST** /api/rest/2.0/connections/fetch-connection-diff-status/{connection_identifier} |  |
| [**fetchLiveboardData**](ThoughtSpotRestApi.md#fetchLiveboardData) | **POST** /api/rest/2.0/metadata/liveboard/data |  |
| [**fetchLiveboardSqlQuery**](ThoughtSpotRestApi.md#fetchLiveboardSqlQuery) | **POST** /api/rest/2.0/metadata/liveboard/sql |  |
| [**fetchLogs**](ThoughtSpotRestApi.md#fetchLogs) | **POST** /api/rest/2.0/logs/fetch |  |
| [**fetchPermissionsOfPrincipals**](ThoughtSpotRestApi.md#fetchPermissionsOfPrincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions |  |
| [**fetchPermissionsOnMetadata**](ThoughtSpotRestApi.md#fetchPermissionsOnMetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions |  |
| [**forceLogoutUsers**](ThoughtSpotRestApi.md#forceLogoutUsers) | **POST** /api/rest/2.0/users/force-logout |  |
| [**getCurrentUserInfo**](ThoughtSpotRestApi.md#getCurrentUserInfo) | **GET** /api/rest/2.0/auth/session/user |  |
| [**getCurrentUserToken**](ThoughtSpotRestApi.md#getCurrentUserToken) | **GET** /api/rest/2.0/auth/session/token |  |
| [**getCustomAccessToken**](ThoughtSpotRestApi.md#getCustomAccessToken) | **POST** /api/rest/2.0/auth/token/custom |  |
| [**getFullAccessToken**](ThoughtSpotRestApi.md#getFullAccessToken) | **POST** /api/rest/2.0/auth/token/full |  |
| [**getObjectAccessToken**](ThoughtSpotRestApi.md#getObjectAccessToken) | **POST** /api/rest/2.0/auth/token/object |  |
| [**getSystemConfig**](ThoughtSpotRestApi.md#getSystemConfig) | **GET** /api/rest/2.0/system/config |  |
| [**getSystemInformation**](ThoughtSpotRestApi.md#getSystemInformation) | **GET** /api/rest/2.0/system |  |
| [**getSystemOverrideInfo**](ThoughtSpotRestApi.md#getSystemOverrideInfo) | **GET** /api/rest/2.0/system/config-overrides |  |
| [**importMetadataTML**](ThoughtSpotRestApi.md#importMetadataTML) | **POST** /api/rest/2.0/metadata/tml/import |  |
| [**importMetadataTMLAsync**](ThoughtSpotRestApi.md#importMetadataTMLAsync) | **POST** /api/rest/2.0/metadata/tml/async/import |  |
| [**importUserGroups**](ThoughtSpotRestApi.md#importUserGroups) | **POST** /api/rest/2.0/groups/import |  |
| [**importUsers**](ThoughtSpotRestApi.md#importUsers) | **POST** /api/rest/2.0/users/import |  |
| [**login**](ThoughtSpotRestApi.md#login) | **POST** /api/rest/2.0/auth/session/login |  |
| [**logout**](ThoughtSpotRestApi.md#logout) | **POST** /api/rest/2.0/auth/session/logout |  |
| [**resetUserPassword**](ThoughtSpotRestApi.md#resetUserPassword) | **POST** /api/rest/2.0/users/reset-password |  |
| [**revertCommit**](ThoughtSpotRestApi.md#revertCommit) | **POST** /api/rest/2.0/vcs/git/commits/{commit_id}/revert |  |
| [**revokeToken**](ThoughtSpotRestApi.md#revokeToken) | **POST** /api/rest/2.0/auth/token/revoke |  |
| [**searchCommits**](ThoughtSpotRestApi.md#searchCommits) | **POST** /api/rest/2.0/vcs/git/commits/search |  |
| [**searchConfig**](ThoughtSpotRestApi.md#searchConfig) | **POST** /api/rest/2.0/vcs/git/config/search |  |
| [**searchConnection**](ThoughtSpotRestApi.md#searchConnection) | **POST** /api/rest/2.0/connection/search |  |
| [**searchCustomActions**](ThoughtSpotRestApi.md#searchCustomActions) | **POST** /api/rest/2.0/customization/custom-actions/search |  |
| [**searchData**](ThoughtSpotRestApi.md#searchData) | **POST** /api/rest/2.0/searchdata |  |
| [**searchMetadata**](ThoughtSpotRestApi.md#searchMetadata) | **POST** /api/rest/2.0/metadata/search |  |
| [**searchOrgs**](ThoughtSpotRestApi.md#searchOrgs) | **POST** /api/rest/2.0/orgs/search |  |
| [**searchRoles**](ThoughtSpotRestApi.md#searchRoles) | **POST** /api/rest/2.0/roles/search |  |
| [**searchSchedules**](ThoughtSpotRestApi.md#searchSchedules) | **POST** /api/rest/2.0/schedules/search |  |
| [**searchTags**](ThoughtSpotRestApi.md#searchTags) | **POST** /api/rest/2.0/tags/search |  |
| [**searchUserGroups**](ThoughtSpotRestApi.md#searchUserGroups) | **POST** /api/rest/2.0/groups/search |  |
| [**searchUsers**](ThoughtSpotRestApi.md#searchUsers) | **POST** /api/rest/2.0/users/search |  |
| [**sendMessage**](ThoughtSpotRestApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse |  |
| [**shareMetadata**](ThoughtSpotRestApi.md#shareMetadata) | **POST** /api/rest/2.0/security/metadata/share |  |
| [**singleAnswer**](ThoughtSpotRestApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create |  |
| [**unassignTag**](ThoughtSpotRestApi.md#unassignTag) | **POST** /api/rest/2.0/tags/unassign |  |
| [**updateConfig**](ThoughtSpotRestApi.md#updateConfig) | **POST** /api/rest/2.0/vcs/git/config/update |  |
| [**updateConnection**](ThoughtSpotRestApi.md#updateConnection) | **POST** /api/rest/2.0/connection/update |  |
| [**updateConnectionV2**](ThoughtSpotRestApi.md#updateConnectionV2) | **POST** /api/rest/2.0/connections/{connection_identifier}/update |  |
| [**updateCustomAction**](ThoughtSpotRestApi.md#updateCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update |  |
| [**updateDbtConnection**](ThoughtSpotRestApi.md#updateDbtConnection) | **POST** /api/rest/2.0/dbt/update-dbt-connection |  |
| [**updateOrg**](ThoughtSpotRestApi.md#updateOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/update |  |
| [**updateRole**](ThoughtSpotRestApi.md#updateRole) | **POST** /api/rest/2.0/roles/{role_identifier}/update |  |
| [**updateSchedule**](ThoughtSpotRestApi.md#updateSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update |  |
| [**updateSystemConfig**](ThoughtSpotRestApi.md#updateSystemConfig) | **POST** /api/rest/2.0/system/config-update |  |
| [**updateTag**](ThoughtSpotRestApi.md#updateTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/update |  |
| [**updateUser**](ThoughtSpotRestApi.md#updateUser) | **POST** /api/rest/2.0/users/{user_identifier}/update |  |
| [**updateUserGroup**](ThoughtSpotRestApi.md#updateUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/update |  |
| [**validateMerge**](ThoughtSpotRestApi.md#validateMerge) | **POST** /api/rest/2.0/vcs/git/branches/validate |  |
| [**validateToken**](ThoughtSpotRestApi.md#validateToken) | **POST** /api/rest/2.0/auth/token/validate |  |


<a id="activateUser"></a>
# **activateUser**
> User activateUser(activateUserRequest)



  Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ActivateUserRequest activateUserRequest = new ActivateUserRequest(); // ActivateUserRequest | 
    try {
      User result = apiInstance.activateUser(activateUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#activateUser");
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
| **activateUserRequest** | [**ActivateUserRequest**](ActivateUserRequest.md)|  | |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User activated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="assignChangeAuthor"></a>
# **assignChangeAuthor**
> assignChangeAuthor(assignChangeAuthorRequest)



  Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and edit access to the objects are required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    AssignChangeAuthorRequest assignChangeAuthorRequest = new AssignChangeAuthorRequest(); // AssignChangeAuthorRequest | 
    try {
      apiInstance.assignChangeAuthor(assignChangeAuthorRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#assignChangeAuthor");
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
| **assignChangeAuthorRequest** | [**AssignChangeAuthorRequest**](AssignChangeAuthorRequest.md)|  | |

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

<a id="assignTag"></a>
# **assignTag**
> assignTag(assignTagRequest)



  Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    AssignTagRequest assignTagRequest = new AssignTagRequest(); // AssignTagRequest | 
    try {
      apiInstance.assignTag(assignTagRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#assignTag");
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
| **assignTagRequest** | [**AssignTagRequest**](AssignTagRequest.md)|  | |

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
| **204** | Tags successfully assigned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="changeUserPassword"></a>
# **changeUserPassword**
> changeUserPassword(changeUserPasswordRequest)



  Version: 9.0.0.cl or later   Updates the current password of the user.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ChangeUserPasswordRequest changeUserPasswordRequest = new ChangeUserPasswordRequest(); // ChangeUserPasswordRequest | 
    try {
      apiInstance.changeUserPassword(changeUserPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#changeUserPassword");
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
| **changeUserPasswordRequest** | [**ChangeUserPasswordRequest**](ChangeUserPasswordRequest.md)|  | |

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
| **204** | User password change operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="commitBranch"></a>
# **commitBranch**
> CommitResponse commitBranch(commitBranchRequest)



  Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CommitBranchRequest commitBranchRequest = new CommitBranchRequest(); // CommitBranchRequest | 
    try {
      CommitResponse result = apiInstance.commitBranch(commitBranchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#commitBranch");
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
| **commitBranchRequest** | [**CommitBranchRequest**](CommitBranchRequest.md)|  | |

### Return type

[**CommitResponse**](CommitResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully committed the metadata objects |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="copyObject"></a>
# **copyObject**
> ResponseCopyObject copyObject(copyObjectRequest)



 Makes a copy of an Answer or Liveboard saved in Atlas    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CopyObjectRequest copyObjectRequest = new CopyObjectRequest(); // CopyObjectRequest | 
    try {
      ResponseCopyObject result = apiInstance.copyObject(copyObjectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#copyObject");
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
| **copyObjectRequest** | [**CopyObjectRequest**](CopyObjectRequest.md)|  | |

### Return type

[**ResponseCopyObject**](ResponseCopyObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a copy of the object |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Object not found |  -  |
| **500** | Unexpected error |  -  |

<a id="createConfig"></a>
# **createConfig**
> RepoConfigObject createConfig(createConfigRequest)



  Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_VERSION_CONTROL&#x60; (**Can toggle version control for objects**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has &#x60;repo&#x60; scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid&#x3D;git-integration).  **Note**: ThoughtSpot supports only GitHub / GitHub Enterprise for CI/CD.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateConfigRequest createConfigRequest = new CreateConfigRequest(); // CreateConfigRequest | 
    try {
      RepoConfigObject result = apiInstance.createConfig(createConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createConfig");
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
| **createConfigRequest** | [**CreateConfigRequest**](CreateConfigRequest.md)|  | |

### Return type

[**RepoConfigObject**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully configured local repository |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createConnection"></a>
# **createConnection**
> CreateConnectionResponse createConnection(createConnectionRequest)



  Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes for a SnowFlake connection:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;externalDatabases\&quot;:[       ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;false&#x60;.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;externalDatabases\&quot;:[         {            \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,            \&quot;isAutoCreated\&quot;:false,            \&quot;schemas\&quot;:[               {                  \&quot;name\&quot;:\&quot;alldatatypes\&quot;,                  \&quot;tables\&quot;:[                     {                        \&quot;name\&quot;:\&quot;allDatatypes\&quot;,                        \&quot;type\&quot;:\&quot;TABLE\&quot;,                        \&quot;description\&quot;:\&quot;\&quot;,                        \&quot;selected\&quot;:true,                        \&quot;linked\&quot;:true,                        \&quot;columns\&quot;:[                           {                              \&quot;name\&quot;:\&quot;CNUMBER\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           },                           {                              \&quot;name\&quot;:\&quot;CDECIMAL\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           }                        ]                     }                  ]               }            ]         }      ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;true&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateConnectionRequest createConnectionRequest = new CreateConnectionRequest(); // CreateConnectionRequest | 
    try {
      CreateConnectionResponse result = apiInstance.createConnection(createConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createConnection");
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
| **createConnectionRequest** | [**CreateConnectionRequest**](CreateConnectionRequest.md)|  | |

### Return type

[**CreateConnectionResponse**](CreateConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection to the datasource successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createConversation"></a>
# **createConversation**
> Conversation createConversation(createConversationRequest)



 Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the &#x60;metadata_identifier&#x60; parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60;  If the API request is successful, ThoughtSpot returns the ID of the conversation.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateConversationRequest createConversationRequest = new CreateConversationRequest(); // CreateConversationRequest | 
    try {
      Conversation result = apiInstance.createConversation(createConversationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createConversation");
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
| **createConversationRequest** | [**CreateConversationRequest**](CreateConversationRequest.md)|  | |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="createCustomAction"></a>
# **createCustomAction**
> ResponseCustomAction createCustomAction(createCustomActionRequest)



  Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in &#x60;group_identifiers&#x60;.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in &#x60;default_action_config&#x60; property and specify the GUID or name of the object in &#x60;associate_metadata&#x60;.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateCustomActionRequest createCustomActionRequest = new CreateCustomActionRequest(); // CreateCustomActionRequest | 
    try {
      ResponseCustomAction result = apiInstance.createCustomAction(createCustomActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createCustomAction");
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

<a id="createOrg"></a>
# **createOrg**
> OrgResponse createOrg(createOrgRequest)



  Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateOrgRequest createOrgRequest = new CreateOrgRequest(); // CreateOrgRequest | 
    try {
      OrgResponse result = apiInstance.createOrg(createOrgRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createOrg");
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
| **createOrgRequest** | [**CreateOrgRequest**](CreateOrgRequest.md)|  | |

### Return type

[**OrgResponse**](OrgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createRole"></a>
# **createRole**
> RoleResponse createRole(createRoleRequest)



 Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateRoleRequest createRoleRequest = new CreateRoleRequest(); // CreateRoleRequest | 
    try {
      RoleResponse result = apiInstance.createRole(createRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createRole");
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

<a id="createSchedule"></a>
# **createSchedule**
> ResponseSchedule createSchedule(createScheduleRequest)



 Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: &lt;your content&gt;** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If &#x60;PDF&#x60; is set as the &#x60;file_format&#x60;, enable &#x60;pdf_options&#x60; to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the &#x60;visualization_identifiers&#x60; array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the &#x60;frequency&#x60; parameters are defined, you can set the time zone to a value that matches your server&#39;s time zone. For example, &#x60;US/Central&#x60;, &#x60;Etc/UTC&#x60;, &#x60;CET&#x60;. The default time zone is &#x60;America/Los_Angeles&#x60;.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateScheduleRequest createScheduleRequest = new CreateScheduleRequest(); // CreateScheduleRequest | 
    try {
      ResponseSchedule result = apiInstance.createSchedule(createScheduleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createSchedule");
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
| **createScheduleRequest** | [**CreateScheduleRequest**](CreateScheduleRequest.md)|  | |

### Return type

[**ResponseSchedule**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createTag"></a>
# **createTag**
> Tag createTag(createTagRequest)



  Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateTagRequest createTagRequest = new CreateTagRequest(); // CreateTagRequest | 
    try {
      Tag result = apiInstance.createTag(createTagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createTag");
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
| **createTagRequest** | [**CreateTagRequest**](CreateTagRequest.md)|  | |

### Return type

[**Tag**](Tag.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tag successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createUser"></a>
# **createUser**
> User createUser(createUserRequest)



  Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
    try {
      User result = apiInstance.createUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createUser");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="createUserGroup"></a>
# **createUserGroup**
> UserGroupResponse createUserGroup(createUserGroupRequest)



  Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    CreateUserGroupRequest createUserGroupRequest = new CreateUserGroupRequest(); // CreateUserGroupRequest | 
    try {
      UserGroupResponse result = apiInstance.createUserGroup(createUserGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#createUserGroup");
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
| **createUserGroupRequest** | [**CreateUserGroupRequest**](CreateUserGroupRequest.md)|  | |

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

<a id="dbtConnection"></a>
# **dbtConnection**
> Object dbtConnection(dbtConnectionRequest)



  Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DbtConnectionRequest dbtConnectionRequest = new DbtConnectionRequest(); // DbtConnectionRequest | 
    try {
      Object result = apiInstance.dbtConnection(dbtConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#dbtConnection");
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
| **dbtConnectionRequest** | [**DbtConnectionRequest**](DbtConnectionRequest.md)|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully created DBT Connection. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="dbtGenerateSyncTml"></a>
# **dbtGenerateSyncTml**
> Object dbtGenerateSyncTml(dbtGenerateSyncTmlRequest)



  Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DbtGenerateSyncTmlRequest dbtGenerateSyncTmlRequest = new DbtGenerateSyncTmlRequest(); // DbtGenerateSyncTmlRequest | 
    try {
      Object result = apiInstance.dbtGenerateSyncTml(dbtGenerateSyncTmlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#dbtGenerateSyncTml");
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
| **dbtGenerateSyncTmlRequest** | [**DbtGenerateSyncTmlRequest**](DbtGenerateSyncTmlRequest.md)|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync Table and Worksheet TML&#39;s are successfully generated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="dbtGenerateTml"></a>
# **dbtGenerateTml**
> Object dbtGenerateTml(dbtGenerateTmlRequest)



  Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DbtGenerateTmlRequest dbtGenerateTmlRequest = new DbtGenerateTmlRequest(); // DbtGenerateTmlRequest | 
    try {
      Object result = apiInstance.dbtGenerateTml(dbtGenerateTmlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#dbtGenerateTml");
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
| **dbtGenerateTmlRequest** | [**DbtGenerateTmlRequest**](DbtGenerateTmlRequest.md)|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Required Table and Worksheet TML&#39;s are successfully generated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="dbtSearch"></a>
# **dbtSearch**
> List&lt;DbtSearchResponse&gt; dbtSearch()



  Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    try {
      List<DbtSearchResponse> result = apiInstance.dbtSearch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#dbtSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DbtSearchResponse&gt;**](DbtSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved list of DBT connections successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deactivateUser"></a>
# **deactivateUser**
> ResponseActivationURL deactivateUser(deactivateUserRequest)



  Version: 9.7.0.cl or later   Deactivates a user account.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DeactivateUserRequest deactivateUserRequest = new DeactivateUserRequest(); // DeactivateUserRequest | 
    try {
      ResponseActivationURL result = apiInstance.deactivateUser(deactivateUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deactivateUser");
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
| **deactivateUserRequest** | [**DeactivateUserRequest**](DeactivateUserRequest.md)|  | |

### Return type

[**ResponseActivationURL**](ResponseActivationURL.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User deactivated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteConfig"></a>
# **deleteConfig**
> deleteConfig(deleteConfigRequest)



  Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_VERSION_CONTROL&#x60; (**Can toggle version control for objects**) privilege.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DeleteConfigRequest deleteConfigRequest = new DeleteConfigRequest(); // DeleteConfigRequest | 
    try {
      apiInstance.deleteConfig(deleteConfigRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteConfig");
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
| **deleteConfigRequest** | [**DeleteConfigRequest**](DeleteConfigRequest.md)|  | |

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
| **204** | Successfully deleted local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteConnection"></a>
# **deleteConnection**
> deleteConnection(deleteConnectionRequest)



  Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DeleteConnectionRequest deleteConnectionRequest = new DeleteConnectionRequest(); // DeleteConnectionRequest | 
    try {
      apiInstance.deleteConnection(deleteConnectionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteConnection");
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
| **deleteConnectionRequest** | [**DeleteConnectionRequest**](DeleteConnectionRequest.md)|  | |

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
| **204** | Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteConnectionV2"></a>
# **deleteConnectionV2**
> deleteConnectionV2(connectionIdentifier)



  Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String connectionIdentifier = "connectionIdentifier_example"; // String | Unique ID or name of the connection.
    try {
      apiInstance.deleteConnectionV2(connectionIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteConnectionV2");
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
| **connectionIdentifier** | **String**| Unique ID or name of the connection. | |

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
| **204** | Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteCustomAction"></a>
# **deleteCustomAction**
> deleteCustomAction(customActionIdentifier)



  Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String customActionIdentifier = "customActionIdentifier_example"; // String | Unique ID or name of the custom action.
    try {
      apiInstance.deleteCustomAction(customActionIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteCustomAction");
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

<a id="deleteDbtConnection"></a>
# **deleteDbtConnection**
> deleteDbtConnection(dbtConnectionIdentifier)



  Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String dbtConnectionIdentifier = "dbtConnectionIdentifier_example"; // String | Unique ID of the DBT Connection.
    try {
      apiInstance.deleteDbtConnection(dbtConnectionIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteDbtConnection");
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
| **dbtConnectionIdentifier** | **String**| Unique ID of the DBT Connection. | |

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
| **204** | DBT Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteMetadata"></a>
# **deleteMetadata**
> deleteMetadata(deleteMetadataRequest)



  Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DeleteMetadataRequest deleteMetadataRequest = new DeleteMetadataRequest(); // DeleteMetadataRequest | 
    try {
      apiInstance.deleteMetadata(deleteMetadataRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteMetadata");
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
| **deleteMetadataRequest** | [**DeleteMetadataRequest**](DeleteMetadataRequest.md)|  | |

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
| **204** | Metadata objects successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteOrg"></a>
# **deleteOrg**
> deleteOrg(orgIdentifier)



  Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String orgIdentifier = "orgIdentifier_example"; // String | ID or name of the Org
    try {
      apiInstance.deleteOrg(orgIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteOrg");
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
| **orgIdentifier** | **String**| ID or name of the Org | |

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
| **204** | Organization successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteRole"></a>
# **deleteRole**
> deleteRole(roleIdentifier)



 Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String roleIdentifier = "roleIdentifier_example"; // String | Unique ID or name of the Role.
    try {
      apiInstance.deleteRole(roleIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteRole");
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

<a id="deleteSchedule"></a>
# **deleteSchedule**
> deleteSchedule(scheduleIdentifier)



 Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or &#x60;ADMINISTRATION&#x60; (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String scheduleIdentifier = "scheduleIdentifier_example"; // String | Unique ID or name of the scheduled job.
    try {
      apiInstance.deleteSchedule(scheduleIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteSchedule");
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
| **scheduleIdentifier** | **String**| Unique ID or name of the scheduled job. | |

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
| **204** | Schedule successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteTag"></a>
# **deleteTag**
> deleteTag(tagIdentifier)



  Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String tagIdentifier = "tagIdentifier_example"; // String | Tag identifier Tag name or Tag id.
    try {
      apiInstance.deleteTag(tagIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteTag");
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
| **tagIdentifier** | **String**| Tag identifier Tag name or Tag id. | |

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
| **204** | Tag successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(userIdentifier)



  Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String userIdentifier = "userIdentifier_example"; // String | GUID / name of the user
    try {
      apiInstance.deleteUser(userIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteUser");
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
| **userIdentifier** | **String**| GUID / name of the user | |

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
| **204** | User successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteUserGroup"></a>
# **deleteUserGroup**
> deleteUserGroup(groupIdentifier)



  Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String groupIdentifier = "groupIdentifier_example"; // String | GUID or name of the group.
    try {
      apiInstance.deleteUserGroup(groupIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deleteUserGroup");
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
| **groupIdentifier** | **String**| GUID or name of the group. | |

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

<a id="deployCommit"></a>
# **deployCommit**
> List&lt;DeployResponse&gt; deployCommit(deployCommitRequest)



  Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a &#x60;commit_id&#x60; is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    DeployCommitRequest deployCommitRequest = new DeployCommitRequest(); // DeployCommitRequest | 
    try {
      List<DeployResponse> result = apiInstance.deployCommit(deployCommitRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#deployCommit");
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
| **deployCommitRequest** | [**DeployCommitRequest**](DeployCommitRequest.md)|  | |

### Return type

[**List&lt;DeployResponse&gt;**](DeployResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deployed the changes |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="downloadConnectionMetadataChanges"></a>
# **downloadConnectionMetadataChanges**
> File downloadConnectionMetadataChanges(connectionIdentifier)



  Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String connectionIdentifier = "connectionIdentifier_example"; // String | GUID of the connection
    try {
      File result = apiInstance.downloadConnectionMetadataChanges(connectionIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#downloadConnectionMetadataChanges");
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
| **connectionIdentifier** | **String**| GUID of the connection | |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export metadata changes. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="exportAnswerReport"></a>
# **exportAnswerReport**
> File exportAnswerReport(exportAnswerReportRequest)



  Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download data**) privilege and view access to the Answer.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set &#x60;file_format&#x60;. The default file format is CSV.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ExportAnswerReportRequest exportAnswerReportRequest = new ExportAnswerReportRequest(); // ExportAnswerReportRequest | 
    try {
      File result = apiInstance.exportAnswerReport(exportAnswerReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#exportAnswerReport");
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



  Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download data**) privilege and view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default &#x60;file_format&#x60; is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  **NOTE**: The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ExportLiveboardReportRequest exportLiveboardReportRequest = new ExportLiveboardReportRequest(); // ExportLiveboardReportRequest | 
    try {
      File result = apiInstance.exportLiveboardReport(exportLiveboardReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#exportLiveboardReport");
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

<a id="exportMetadataTML"></a>
# **exportMetadataTML**
> List&lt;Object&gt; exportMetadataTML(exportMetadataTMLRequest)



  Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the &#x60;metadata&#x60; array. * When exporting TML content for a Liveboard or Answer object, you can set &#x60;export_associated&#x60; to &#x60;true&#x60; to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   &#x60;export_associated&#x60; is set to &#x60;true&#x60;, consider retrieving one metadata object at a time. * Set &#x60;export_fqns&#x60; to &#x60;true&#x60; to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ExportMetadataTMLRequest exportMetadataTMLRequest = new ExportMetadataTMLRequest(); // ExportMetadataTMLRequest | 
    try {
      List<Object> result = apiInstance.exportMetadataTML(exportMetadataTMLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#exportMetadataTML");
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
| **exportMetadataTMLRequest** | [**ExportMetadataTMLRequest**](ExportMetadataTMLRequest.md)|  | |

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export TMLs of specified metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="exportMetadataTMLBatched"></a>
# **exportMetadataTMLBatched**
> Object exportMetadataTMLBatched(exportMetadataTMLBatchedRequest)



  Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the &#x60;metadata&#x60; array. * When exporting TML content for a Liveboard or Answer object, you can set &#x60;export_associated&#x60; to &#x60;true&#x60; to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   &#x60;export_associated&#x60; is set to &#x60;true&#x60;, consider retrieving one metadata object at a time. * Set &#x60;export_fqns&#x60; to &#x60;true&#x60; to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest = new ExportMetadataTMLBatchedRequest(); // ExportMetadataTMLBatchedRequest | 
    try {
      Object result = apiInstance.exportMetadataTMLBatched(exportMetadataTMLBatchedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#exportMetadataTMLBatched");
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
| **exportMetadataTMLBatchedRequest** | [**ExportMetadataTMLBatchedRequest**](ExportMetadataTMLBatchedRequest.md)|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export TMLs of specified metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchAnswerData"></a>
# **fetchAnswerData**
> AnswerDataResponse fetchAnswerData(fetchAnswerDataRequest)



  Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer and the &#x60;DATADOWNLOADING&#x60; privilege.  The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchAnswerDataRequest fetchAnswerDataRequest = new FetchAnswerDataRequest(); // FetchAnswerDataRequest | 
    try {
      AnswerDataResponse result = apiInstance.fetchAnswerData(fetchAnswerDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchAnswerData");
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

<a id="fetchAnswerSqlQuery"></a>
# **fetchAnswerSqlQuery**
> SqlQueryResponse fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest)



  Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {    \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,    \&quot;metadata_name\&quot;:\&quot;Total sales\&quot;,    \&quot;metadata_type\&quot;:\&quot;ANSWER\&quot;,    \&quot;sql_queries\&quot;:[       {          \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,          \&quot;metadata_name\&quot;:\&quot;Total sales -test\&quot;,          \&quot;sql_query\&quot;:\&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTNAME\\\&quot; \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;STORENAME\\\&quot; \\\&quot;ca_3\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_4\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_5\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_3\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_PRODUCTS\\\&quot; \\\&quot;ta_2\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;PRODUCTID\\\&quot; &#x3D; \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTID\\\&quot;\\nGROUP BY \\n  \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ca_3\\\&quot;\\n\&quot;       }    ] } &#x60;&#x60;&#x60;      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest = new FetchAnswerSqlQueryRequest(); // FetchAnswerSqlQueryRequest | 
    try {
      SqlQueryResponse result = apiInstance.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchAnswerSqlQuery");
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
| **fetchAnswerSqlQueryRequest** | [**FetchAnswerSqlQueryRequest**](FetchAnswerSqlQueryRequest.md)|  | |

### Return type

[**SqlQueryResponse**](SqlQueryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching SQL query of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchAsyncImportTaskStatus"></a>
# **fetchAsyncImportTaskStatus**
> GetAsyncImportStatusResponse fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest)



  Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest = new FetchAsyncImportTaskStatusRequest(); // FetchAsyncImportTaskStatusRequest | 
    try {
      GetAsyncImportStatusResponse result = apiInstance.fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchAsyncImportTaskStatus");
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
| **fetchAsyncImportTaskStatusRequest** | [**FetchAsyncImportTaskStatusRequest**](FetchAsyncImportTaskStatusRequest.md)|  | |

### Return type

[**GetAsyncImportStatusResponse**](GetAsyncImportStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Async TML Import Task statuses fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchConnectionDiffStatus"></a>
# **fetchConnectionDiffStatus**
> FetchConnectionDiffStatusResponse fetchConnectionDiffStatus(connectionIdentifier)



  Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String connectionIdentifier = "connectionIdentifier_example"; // String | GUID of the connection
    try {
      FetchConnectionDiffStatusResponse result = apiInstance.fetchConnectionDiffStatus(connectionIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchConnectionDiffStatus");
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
| **connectionIdentifier** | **String**| GUID of the connection | |

### Return type

[**FetchConnectionDiffStatusResponse**](FetchConnectionDiffStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | true/false |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchLiveboardData"></a>
# **fetchLiveboardData**
> LiveboardDataResponse fetchLiveboardData(fetchLiveboardDataRequest)



  Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard and the &#x60;DATADOWNLOADING&#x60; privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchLiveboardDataRequest fetchLiveboardDataRequest = new FetchLiveboardDataRequest(); // FetchLiveboardDataRequest | 
    try {
      LiveboardDataResponse result = apiInstance.fetchLiveboardData(fetchLiveboardDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchLiveboardData");
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

<a id="fetchLiveboardSqlQuery"></a>
# **fetchLiveboardSqlQuery**
> SqlQueryResponse fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest)



  Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {   \&quot;metadata_id\&quot;: \&quot;fa68ae91-7588-4136-bacd-d71fb12dda69\&quot;,   \&quot;metadata_name\&quot;: \&quot;Total Sales\&quot;,   \&quot;metadata_type\&quot;: \&quot;LIVEBOARD\&quot;,   \&quot;sql_queries\&quot;: [     {       \&quot;metadata_id\&quot;: \&quot;b3b6d2b9-089a-490c-8e16-b144650b7843\&quot;,       \&quot;metadata_name\&quot;: \&quot;Total quantity purchased, Total sales by region\&quot;,       \&quot;sql_query\&quot;: \&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_2\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_3\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_2\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_2\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\nGROUP BY \\\&quot;ca_1\\\&quot;\&quot;     }   ] } &#x60;&#x60;&#x60;      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest = new FetchLiveboardSqlQueryRequest(); // FetchLiveboardSqlQueryRequest | 
    try {
      SqlQueryResponse result = apiInstance.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchLiveboardSqlQuery");
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
| **fetchLiveboardSqlQueryRequest** | [**FetchLiveboardSqlQueryRequest**](FetchLiveboardSqlQueryRequest.md)|  | |

### Return type

[**SqlQueryResponse**](SqlQueryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching SQL query of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchLogs"></a>
# **fetchLogs**
> List&lt;LogResponse&gt; fetchLogs(fetchLogsRequest)



  Version: 9.0.0.cl or later   Fetches security audit logs.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchLogsRequest fetchLogsRequest = new FetchLogsRequest(); // FetchLogsRequest | 
    try {
      List<LogResponse> result = apiInstance.fetchLogs(fetchLogsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchLogs");
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
| **fetchLogsRequest** | [**FetchLogsRequest**](FetchLogsRequest.md)|  | |

### Return type

[**List&lt;LogResponse&gt;**](LogResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Log fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchPermissionsOfPrincipals"></a>
# **fetchPermissionsOfPrincipals**
> PermissionOfPrincipalsResponse fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest)



  Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest = new FetchPermissionsOfPrincipalsRequest(); // FetchPermissionsOfPrincipalsRequest | 
    try {
      PermissionOfPrincipalsResponse result = apiInstance.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchPermissionsOfPrincipals");
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
| **fetchPermissionsOfPrincipalsRequest** | [**FetchPermissionsOfPrincipalsRequest**](FetchPermissionsOfPrincipalsRequest.md)|  | |

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

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest = new FetchPermissionsOnMetadataRequest(); // FetchPermissionsOnMetadataRequest | 
    try {
      PermissionOfMetadataResponse result = apiInstance.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#fetchPermissionsOnMetadata");
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
| **fetchPermissionsOnMetadataRequest** | [**FetchPermissionsOnMetadataRequest**](FetchPermissionsOnMetadataRequest.md)|  | |

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

<a id="forceLogoutUsers"></a>
# **forceLogoutUsers**
> forceLogoutUsers(forceLogoutUsersRequest)



  Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ForceLogoutUsersRequest forceLogoutUsersRequest = new ForceLogoutUsersRequest(); // ForceLogoutUsersRequest | 
    try {
      apiInstance.forceLogoutUsers(forceLogoutUsersRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#forceLogoutUsers");
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
| **forceLogoutUsersRequest** | [**ForceLogoutUsersRequest**](ForceLogoutUsersRequest.md)|  | |

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
| **204** | Force logging out of users operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getCurrentUserInfo"></a>
# **getCurrentUserInfo**
> User getCurrentUserInfo()



  Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user&#39;s privilege and object access permissions.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    try {
      User result = apiInstance.getCurrentUserInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getCurrentUserInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch current session user detail successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getCurrentUserToken"></a>
# **getCurrentUserToken**
> GetTokenResponse getCurrentUserToken()



 Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user&#39;s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    try {
      GetTokenResponse result = apiInstance.getCurrentUserToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getCurrentUserToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetTokenResponse**](GetTokenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching token for current user successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getCustomAccessToken"></a>
# **getCustomAccessToken**
> AccessToken getCustomAccessToken(getCustomAccessTokenRequest)



  Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you&#39;ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the cluster’s &#x60;secret_key&#x60;.  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable) in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the &#x60;filter_rules&#x60; and &#x60;parameter_values&#x60; array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user&#39;s &#x60;access_control_properties&#x60; object, after which all sessions will use the persisted values.   Specify the object type as &#x60;LOGICAL_TABLE&#x60;.  The &#x60;LIVEBOARD&#x60; and &#x60;ANSWER&#x60; object types are not supported.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60;  Set &#x60;auto_create&#x60; to &#x60;true&#x60; if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60; in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created. Persist options such as  &#x60;APPEND&#x60;, &#x60;REPLACE&#x60;, &#x60;RESET&#x60; will persist security parameters on the user profile when the token is created, while Persist option &#x60;NONE&#x60; will not persist anything but will be honoured in the session.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    GetCustomAccessTokenRequest getCustomAccessTokenRequest = new GetCustomAccessTokenRequest(); // GetCustomAccessTokenRequest | 
    try {
      AccessToken result = apiInstance.getCustomAccessToken(getCustomAccessTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getCustomAccessToken");
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
| **getCustomAccessTokenRequest** | [**GetCustomAccessTokenRequest**](GetCustomAccessTokenRequest.md)|  | |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ABAC token creation was successful. |  -  |
| **400** | Invalid request. This could be due to missing or incorrect parameters. |  -  |
| **401** | Unauthorized access. The request could not be authenticated. |  -  |
| **403** | Forbidden access. The user does not have permission to access this resource. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |

<a id="getFullAccessToken"></a>
# **getFullAccessToken**
> Token getFullAccessToken(getFullAccessTokenRequest)



  Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the cluster’s &#x60;secret_key&#x60; (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable).  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60;  Set &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60;, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created. Similarly, using &#x60;user_parameters&#x60; with &#x60;persist: true&#x60; persists security parameters on the user profile when the token is created and not during authentication.   Specify the object type as &#x60;LOGICAL_TABLE&#x60;.  The &#x60;LIVEBOARD&#x60; and &#x60;ANSWER&#x60; object types are not supported.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    GetFullAccessTokenRequest getFullAccessTokenRequest = new GetFullAccessTokenRequest(); // GetFullAccessTokenRequest | 
    try {
      Token result = apiInstance.getFullAccessToken(getFullAccessTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getFullAccessToken");
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
| **getFullAccessTokenRequest** | [**GetFullAccessTokenRequest**](GetFullAccessTokenRequest.md)|  | |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bearer auth token creation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getObjectAccessToken"></a>
# **getObjectAccessToken**
> Token getObjectAccessToken(getObjectAccessTokenRequest)



  Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the cluster’s &#x60;secret key&#x60; (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,  &#x60;password&#x60; takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60;  Set &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60;, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).   Specify the object type as &#x60;LOGICAL_TABLE&#x60;.  The &#x60;LIVEBOARD&#x60; and &#x60;ANSWER&#x60; object types are not supported.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created. Similarly, using &#x60;user_parameters&#x60; with &#x60;persist: true&#x60; persists security parameters on the user profile when the token is created and not during authentication.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    GetObjectAccessTokenRequest getObjectAccessTokenRequest = new GetObjectAccessTokenRequest(); // GetObjectAccessTokenRequest | 
    try {
      Token result = apiInstance.getObjectAccessToken(getObjectAccessTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getObjectAccessToken");
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
| **getObjectAccessTokenRequest** | [**GetObjectAccessTokenRequest**](GetObjectAccessTokenRequest.md)|  | |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bearer auth token creation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getSystemConfig"></a>
# **getSystemConfig**
> SystemConfig getSystemConfig()



  Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires &#x60;ADMINISTRATION&#x60;(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    try {
      SystemConfig result = apiInstance.getSystemConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getSystemConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemConfig**](SystemConfig.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster config information. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getSystemInformation"></a>
# **getSystemInformation**
> SystemInfo getSystemInformation()



  Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    try {
      SystemInfo result = apiInstance.getSystemInformation();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getSystemInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemInfo**](SystemInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster information. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="getSystemOverrideInfo"></a>
# **getSystemOverrideInfo**
> Object getSystemOverrideInfo()



  Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    try {
      Object result = apiInstance.getSystemOverrideInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#getSystemOverrideInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster configuration which can be overridden. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="importMetadataTML"></a>
# **importMetadataTML**
> List&lt;Object&gt; importMetadataTML(importMetadataTMLRequest)



  Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the &#x60;fqn&#x60; property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding &#x60;fqn&#x60; helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ImportMetadataTMLRequest importMetadataTMLRequest = new ImportMetadataTMLRequest(); // ImportMetadataTMLRequest | 
    try {
      List<Object> result = apiInstance.importMetadataTML(importMetadataTMLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#importMetadataTML");
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
| **importMetadataTMLRequest** | [**ImportMetadataTMLRequest**](ImportMetadataTMLRequest.md)|  | |

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import metadata objects using specified TMLs is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="importMetadataTMLAsync"></a>
# **importMetadataTMLAsync**
> ImportEPackAsyncTaskStatus importMetadataTMLAsync(importMetadataTMLAsyncRequest)



  Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via &#x60;/api/rest/2.0/metadata/tml/async/status&#x60; API endpoint.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest = new ImportMetadataTMLAsyncRequest(); // ImportMetadataTMLAsyncRequest | 
    try {
      ImportEPackAsyncTaskStatus result = apiInstance.importMetadataTMLAsync(importMetadataTMLAsyncRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#importMetadataTMLAsync");
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
| **importMetadataTMLAsyncRequest** | [**ImportMetadataTMLAsyncRequest**](ImportMetadataTMLAsyncRequest.md)|  | |

### Return type

[**ImportEPackAsyncTaskStatus**](ImportEPackAsyncTaskStatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Async TML Import Task submitted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="importUserGroups"></a>
# **importUserGroups**
> ImportUserGroupsResponse importUserGroups(importUserGroupsRequest)



  Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is set to &#x60;true&#x60;, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ImportUserGroupsRequest importUserGroupsRequest = new ImportUserGroupsRequest(); // ImportUserGroupsRequest | 
    try {
      ImportUserGroupsResponse result = apiInstance.importUserGroups(importUserGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#importUserGroups");
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
| **importUserGroupsRequest** | [**ImportUserGroupsRequest**](ImportUserGroupsRequest.md)|  | |

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

<a id="importUsers"></a>
# **importUsers**
> ImportUsersResponse importUsers(importUsersRequest)



  Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a &#x60;default_password&#x60; in the API request is optional. * If &#x60;delete_unspecified_users&#x60; is set to &#x60;true&#x60;, the users not specified in the API request, excluding the &#x60;tsadmin&#x60;, &#x60;guest&#x60;, &#x60;system&#x60; and &#x60;su&#x60; users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ImportUsersRequest importUsersRequest = new ImportUsersRequest(); // ImportUsersRequest | 
    try {
      ImportUsersResponse result = apiInstance.importUsers(importUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#importUsers");
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
| **importUsersRequest** | [**ImportUsersRequest**](ImportUsersRequest.md)|  | |

### Return type

[**ImportUsersResponse**](ImportUsersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import users operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="login"></a>
# **login**
> login(loginRequest)



  Version: 9.0.0.cl or later    Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
    try {
      apiInstance.login(loginRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#login");
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
| **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | |

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
| **204** | User login successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="logout"></a>
# **logout**
> logout()



  Version: 9.0.0.cl or later    Logs out a user from their current session.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    try {
      apiInstance.logout();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#logout");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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
| **204** | User logout successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="resetUserPassword"></a>
# **resetUserPassword**
> resetUserPassword(resetUserPasswordRequest)



  Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ResetUserPasswordRequest resetUserPasswordRequest = new ResetUserPasswordRequest(); // ResetUserPasswordRequest | 
    try {
      apiInstance.resetUserPassword(resetUserPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#resetUserPassword");
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
| **resetUserPasswordRequest** | [**ResetUserPasswordRequest**](ResetUserPasswordRequest.md)|  | |

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
| **204** | User password reset operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="revertCommit"></a>
# **revertCommit**
> RevertResponse revertCommit(commitId, revertCommitRequest)



  Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the &#x60;commit_id&#x60;. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String commitId = "commitId_example"; // String | Commit id to which the object should be reverted
    RevertCommitRequest revertCommitRequest = new RevertCommitRequest(); // RevertCommitRequest | 
    try {
      RevertResponse result = apiInstance.revertCommit(commitId, revertCommitRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#revertCommit");
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
| **commitId** | **String**| Commit id to which the object should be reverted | |
| **revertCommitRequest** | [**RevertCommitRequest**](RevertCommitRequest.md)|  | |

### Return type

[**RevertResponse**](RevertResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reverted the object to the commit point specified |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="revokeToken"></a>
# **revokeToken**
> revokeToken(revokeTokenRequest)



  Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    RevokeTokenRequest revokeTokenRequest = new RevokeTokenRequest(); // RevokeTokenRequest | 
    try {
      apiInstance.revokeToken(revokeTokenRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#revokeToken");
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
| **revokeTokenRequest** | [**RevokeTokenRequest**](RevokeTokenRequest.md)|  | |

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
| **204** | Token successfully revoked. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchCommits"></a>
# **searchCommits**
> List&lt;CommitHistoryResponse&gt; searchCommits(searchCommitsRequest)



  Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege and edit access to the metadata objects.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchCommitsRequest searchCommitsRequest = new SearchCommitsRequest(); // SearchCommitsRequest | 
    try {
      List<CommitHistoryResponse> result = apiInstance.searchCommits(searchCommitsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchCommits");
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
| **searchCommitsRequest** | [**SearchCommitsRequest**](SearchCommitsRequest.md)|  | |

### Return type

[**List&lt;CommitHistoryResponse&gt;**](CommitHistoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Commit history of the metadata object |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchConfig"></a>
# **searchConfig**
> List&lt;RepoConfigObject&gt; searchConfig(searchConfigRequest)



  Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_VERSION_CONTROL&#x60; (**Can toggle version control for objects**) privilege.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchConfigRequest searchConfigRequest = new SearchConfigRequest(); // SearchConfigRequest | 
    try {
      List<RepoConfigObject> result = apiInstance.searchConfig(searchConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchConfig");
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
| **searchConfigRequest** | [**SearchConfigRequest**](SearchConfigRequest.md)|  | |

### Return type

[**List&lt;RepoConfigObject&gt;**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchConnection"></a>
# **searchConnection**
> List&lt;SearchConnectionResponse&gt; searchConnection(searchConnectionRequest)



  Version: 9.2.0.cl or later   Gets connection objects. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To fetch details of a connection object, specify the connection object GUID or name. The &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific database, schema, table, or column from a connection object, define the object type in &#x60;data_warehouse_object_type&#x60; and object properties in the &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (&#x60;database&#x60; &gt; &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;).  &#x60;&#x60;&#x60; {   \&quot;connections\&quot;: [     {       \&quot;identifier\&quot;: \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;,       \&quot;data_warehouse_objects\&quot;: [         {           \&quot;database\&quot;: \&quot;NEBULADEV\&quot;,           \&quot;schema\&quot;: \&quot;INFORMATION_SCHEMA\&quot;,           \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,           \&quot;column\&quot;: \&quot;ROLE_NAME\&quot;         }       ]     }   ],   \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60;  - To fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the &#x60;configuration&#x60; string as &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a specific table, specify the table, for example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;. - To query connections by &#x60;authentication_type&#x60;, specify &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60; are:   - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - &#x60;OAUTH&#x60;: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - &#x60;EXTOAUTH&#x60;: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than &#x60;data_warehouse_types&#x60; or &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchConnectionRequest searchConnectionRequest = new SearchConnectionRequest(); // SearchConnectionRequest | 
    try {
      List<SearchConnectionResponse> result = apiInstance.searchConnection(searchConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchConnection");
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
| **searchConnectionRequest** | [**SearchConnectionRequest**](SearchConnectionRequest.md)|  | |

### Return type

[**List&lt;SearchConnectionResponse&gt;**](SearchConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of connections to the datasource. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchCustomActions"></a>
# **searchCustomActions**
> List&lt;ResponseCustomAction&gt; searchCustomActions(searchCustomActionsRequest)



  Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchCustomActionsRequest searchCustomActionsRequest = new SearchCustomActionsRequest(); // SearchCustomActionsRequest | 
    try {
      List<ResponseCustomAction> result = apiInstance.searchCustomActions(searchCustomActionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchCustomActions");
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

<a id="searchData"></a>
# **searchData**
> SearchDataResponse searchData(searchDataRequest)



  Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View) and the &#x60;DATADOWNLOADING&#x60; privilege.  #### Usage guidelines  To search data, specify the data source GUID in &#x60;logical_table_identifier&#x60;. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the &#x60;query_string&#x60; attribute in the API request as shown in the following example:  &#x60;&#x60;&#x60; {   \&quot;query_string\&quot;: \&quot;[sales] by [store]\&quot;,   \&quot;logical_table_identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, } &#x60;&#x60;&#x60;  For more information about the &#x60;query_string&#x60; format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).     

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchDataRequest searchDataRequest = new SearchDataRequest(); // SearchDataRequest | 
    try {
      SearchDataResponse result = apiInstance.searchData(searchDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchData");
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

<a id="searchMetadata"></a>
# **searchMetadata**
> List&lt;MetadataSearchResponse&gt; searchMetadata(searchMetadataRequest)



  Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the &#x60;type&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60;. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like &#x60;include_auto_created_objects&#x60;, &#x60;include_dependent_objects&#x60;, &#x60;include_headers&#x60;, &#x60;include_incomplete_objects&#x60;, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records:  - &#x60;tag_identifiers&#x60; - &#x60;type&#x60; - &#x60;created_by_user_identifiers&#x60; - &#x60;modified_by_user_identifiers&#x60; - &#x60;owned_by_user_identifiers&#x60; - &#x60;exclude_objects&#x60; - &#x60;include_auto_created_objects&#x60; - &#x60;favorite_object_options&#x60; If you are using other parameters to search metadata, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchMetadataRequest searchMetadataRequest = new SearchMetadataRequest(); // SearchMetadataRequest | 
    try {
      List<MetadataSearchResponse> result = apiInstance.searchMetadata(searchMetadataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchMetadata");
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
| **searchMetadataRequest** | [**SearchMetadataRequest**](SearchMetadataRequest.md)|  | |

### Return type

[**List&lt;MetadataSearchResponse&gt;**](MetadataSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata objects search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchOrgs"></a>
# **searchOrgs**
> List&lt;OrgResponse&gt; searchOrgs(searchOrgsRequest)



  Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchOrgsRequest searchOrgsRequest = new SearchOrgsRequest(); // SearchOrgsRequest | 
    try {
      List<OrgResponse> result = apiInstance.searchOrgs(searchOrgsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchOrgs");
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
| **searchOrgsRequest** | [**SearchOrgsRequest**](SearchOrgsRequest.md)|  | |

### Return type

[**List&lt;OrgResponse&gt;**](OrgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchRoles"></a>
# **searchRoles**
> List&lt;SearchRoleResponse&gt; searchRoles(searchRolesRequest)



 Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchRolesRequest searchRolesRequest = new SearchRolesRequest(); // SearchRolesRequest | 
    try {
      List<SearchRoleResponse> result = apiInstance.searchRoles(searchRolesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchRoles");
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

<a id="searchSchedules"></a>
# **searchSchedules**
> List&lt;ResponseSchedule&gt; searchSchedules(searchSchedulesRequest)



 Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than &#x60;metadata&#x60;, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for accurate results.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchSchedulesRequest searchSchedulesRequest = new SearchSchedulesRequest(); // SearchSchedulesRequest | 
    try {
      List<ResponseSchedule> result = apiInstance.searchSchedules(searchSchedulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchSchedules");
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
| **searchSchedulesRequest** | [**SearchSchedulesRequest**](SearchSchedulesRequest.md)|  | |

### Return type

[**List&lt;ResponseSchedule&gt;**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchTags"></a>
# **searchTags**
> List&lt;Tag&gt; searchTags(searchTagsRequest)



  Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchTagsRequest searchTagsRequest = new SearchTagsRequest(); // SearchTagsRequest | 
    try {
      List<Tag> result = apiInstance.searchTags(searchTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchTags");
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
| **searchTagsRequest** | [**SearchTagsRequest**](SearchTagsRequest.md)|  | |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchUserGroups"></a>
# **searchUserGroups**
> List&lt;UserGroupResponse&gt; searchUserGroups(searchUserGroupsRequest)



  Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchUserGroupsRequest searchUserGroupsRequest = new SearchUserGroupsRequest(); // SearchUserGroupsRequest | 
    try {
      List<UserGroupResponse> result = apiInstance.searchUserGroups(searchUserGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchUserGroups");
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
| **searchUserGroupsRequest** | [**SearchUserGroupsRequest**](SearchUserGroupsRequest.md)|  | |

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

<a id="searchUsers"></a>
# **searchUsers**
> List&lt;User&gt; searchUsers(searchUsersRequest)



  Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60; parameter. To search across all available users, set &#x60;record_size&#x60; to &#x60;-1&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SearchUsersRequest searchUsersRequest = new SearchUsersRequest(); // SearchUsersRequest | 
    try {
      List<User> result = apiInstance.searchUsers(searchUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#searchUsers");
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
| **searchUsersRequest** | [**SearchUsersRequest**](SearchUsersRequest.md)|  | |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="sendMessage"></a>
# **sendMessage**
> List&lt;ResponseMessage&gt; sendMessage(conversationIdentifier, sendMessageRequest)



 Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the &#x60;conversation_identifier&#x60; in the request path, and a &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String conversationIdentifier = "conversationIdentifier_example"; // String | Unique identifier of the conversation.
    SendMessageRequest sendMessageRequest = new SendMessageRequest(); // SendMessageRequest | 
    try {
      List<ResponseMessage> result = apiInstance.sendMessage(conversationIdentifier, sendMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#sendMessage");
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
| **conversationIdentifier** | **String**| Unique identifier of the conversation. | |
| **sendMessageRequest** | [**SendMessageRequest**](SendMessageRequest.md)|  | |

### Return type

[**List&lt;ResponseMessage&gt;**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="shareMetadata"></a>
# **shareMetadata**
> shareMetadata(shareMetadataRequest)



  Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; access when sharing an object with another user or group. With &#x60;READ_ONLY&#x60; access grants view access to the shared object, whereas &#x60;MODIFY&#x60; provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set &#x60;shareMode&#x60; to &#x60;NO_ACCESS&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ShareMetadataRequest shareMetadataRequest = new ShareMetadataRequest(); // ShareMetadataRequest | 
    try {
      apiInstance.shareMetadata(shareMetadataRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#shareMetadata");
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
| **shareMetadataRequest** | [**ShareMetadataRequest**](ShareMetadataRequest.md)|  | |

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

<a id="singleAnswer"></a>
# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)



 Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    SingleAnswerRequest singleAnswerRequest = new SingleAnswerRequest(); // SingleAnswerRequest | 
    try {
      ResponseMessage result = apiInstance.singleAnswer(singleAnswerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#singleAnswer");
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
| **singleAnswerRequest** | [**SingleAnswerRequest**](SingleAnswerRequest.md)|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **500** | Operation failed |  -  |

<a id="unassignTag"></a>
# **unassignTag**
> unassignTag(assignTagRequest)



  Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    AssignTagRequest assignTagRequest = new AssignTagRequest(); // AssignTagRequest | 
    try {
      apiInstance.unassignTag(assignTagRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#unassignTag");
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
| **assignTagRequest** | [**AssignTagRequest**](AssignTagRequest.md)|  | |

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
| **204** | Tags successfully unassigned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateConfig"></a>
# **updateConfig**
> RepoConfigObject updateConfig(updateConfigRequest)



  Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_VERSION_CONTROL&#x60; (**Can toggle version control for objects**) privilege.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    UpdateConfigRequest updateConfigRequest = new UpdateConfigRequest(); // UpdateConfigRequest | 
    try {
      RepoConfigObject result = apiInstance.updateConfig(updateConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateConfig");
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
| **updateConfigRequest** | [**UpdateConfigRequest**](UpdateConfigRequest.md)|  | |

### Return type

[**RepoConfigObject**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateConnection"></a>
# **updateConnection**
> updateConnection(updateConnectionRequest)



  Version: 9.2.0.cl or later   Updates a connection object.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in &#x60;data_warehouse_config&#x60;.    b. Set &#x60;validate&#x60; to &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    UpdateConnectionRequest updateConnectionRequest = new UpdateConnectionRequest(); // UpdateConnectionRequest | 
    try {
      apiInstance.updateConnection(updateConnectionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateConnection");
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
| **updateConnectionRequest** | [**UpdateConnectionRequest**](UpdateConnectionRequest.md)|  | |

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
| **204** | Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateConnectionV2"></a>
# **updateConnectionV2**
> updateConnectionV2(connectionIdentifier, updateConnectionV2Request)



  Version: 10.4.0.cl or later   Updates a connection object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in &#x60;data_warehouse_config&#x60;.    b. Set &#x60;validate&#x60; to &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String connectionIdentifier = "connectionIdentifier_example"; // String | Unique ID or name of the connection.
    UpdateConnectionV2Request updateConnectionV2Request = new UpdateConnectionV2Request(); // UpdateConnectionV2Request | 
    try {
      apiInstance.updateConnectionV2(connectionIdentifier, updateConnectionV2Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateConnectionV2");
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
| **connectionIdentifier** | **String**| Unique ID or name of the connection. | |
| **updateConnectionV2Request** | [**UpdateConnectionV2Request**](UpdateConnectionV2Request.md)|  | |

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
| **204** | Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateCustomAction"></a>
# **updateCustomAction**
> updateCustomAction(customActionIdentifier, updateCustomActionRequest)



  Version: 9.6.0.cl or later   Updates a custom action.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String customActionIdentifier = "customActionIdentifier_example"; // String | Unique ID or name of the custom action.
    UpdateCustomActionRequest updateCustomActionRequest = new UpdateCustomActionRequest(); // UpdateCustomActionRequest | 
    try {
      apiInstance.updateCustomAction(customActionIdentifier, updateCustomActionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateCustomAction");
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

<a id="updateDbtConnection"></a>
# **updateDbtConnection**
> Object updateDbtConnection(updateDbtConnectionRequest)



  Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    UpdateDbtConnectionRequest updateDbtConnectionRequest = new UpdateDbtConnectionRequest(); // UpdateDbtConnectionRequest | 
    try {
      Object result = apiInstance.updateDbtConnection(updateDbtConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateDbtConnection");
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
| **updateDbtConnectionRequest** | [**UpdateDbtConnectionRequest**](UpdateDbtConnectionRequest.md)|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DBT Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateOrg"></a>
# **updateOrg**
> updateOrg(orgIdentifier, updateOrgRequest)



  Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String orgIdentifier = "orgIdentifier_example"; // String | ID or name of the Org
    UpdateOrgRequest updateOrgRequest = new UpdateOrgRequest(); // UpdateOrgRequest | 
    try {
      apiInstance.updateOrg(orgIdentifier, updateOrgRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateOrg");
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
| **orgIdentifier** | **String**| ID or name of the Org | |
| **updateOrgRequest** | [**UpdateOrgRequest**](UpdateOrgRequest.md)|  | |

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
| **204** | Organization successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateRole"></a>
# **updateRole**
> RoleResponse updateRole(roleIdentifier, updateRoleRequest)



 Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String roleIdentifier = "roleIdentifier_example"; // String | Unique ID or name of the Role.
    UpdateRoleRequest updateRoleRequest = new UpdateRoleRequest(); // UpdateRoleRequest | 
    try {
      RoleResponse result = apiInstance.updateRole(roleIdentifier, updateRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateRole");
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

<a id="updateSchedule"></a>
# **updateSchedule**
> updateSchedule(scheduleIdentifier, updateScheduleRequest)



 Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String scheduleIdentifier = "scheduleIdentifier_example"; // String | Unique ID or name of the schedule.
    UpdateScheduleRequest updateScheduleRequest = new UpdateScheduleRequest(); // UpdateScheduleRequest | 
    try {
      apiInstance.updateSchedule(scheduleIdentifier, updateScheduleRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateSchedule");
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
| **scheduleIdentifier** | **String**| Unique ID or name of the schedule. | |
| **updateScheduleRequest** | [**UpdateScheduleRequest**](UpdateScheduleRequest.md)|  | |

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
| **204** | Schedule successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateSystemConfig"></a>
# **updateSystemConfig**
> updateSystemConfig(updateSystemConfigRequest)



  Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    UpdateSystemConfigRequest updateSystemConfigRequest = new UpdateSystemConfigRequest(); // UpdateSystemConfigRequest | 
    try {
      apiInstance.updateSystemConfig(updateSystemConfigRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateSystemConfig");
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
| **updateSystemConfigRequest** | [**UpdateSystemConfigRequest**](UpdateSystemConfigRequest.md)|  | |

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
| **204** | Configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateTag"></a>
# **updateTag**
> updateTag(tagIdentifier, updateTagRequest)



  Version: 9.0.0.cl or later   Updates a tag object.  You can modify the &#x60;name&#x60; and &#x60;color&#x60; properties of a tag object.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String tagIdentifier = "tagIdentifier_example"; // String | Name or Id of the tag.
    UpdateTagRequest updateTagRequest = new UpdateTagRequest(); // UpdateTagRequest | 
    try {
      apiInstance.updateTag(tagIdentifier, updateTagRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateTag");
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
| **tagIdentifier** | **String**| Name or Id of the tag. | |
| **updateTagRequest** | [**UpdateTagRequest**](UpdateTagRequest.md)|  | |

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
| **204** | Tag successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateUser"></a>
# **updateUser**
> updateUser(userIdentifier, updateUserRequest)



  Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String userIdentifier = "userIdentifier_example"; // String | GUID / name of the user
    UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | 
    try {
      apiInstance.updateUser(userIdentifier, updateUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateUser");
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
| **userIdentifier** | **String**| GUID / name of the user | |
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | |

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
| **204** | User successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateUserGroup"></a>
# **updateUserGroup**
> updateUserGroup(groupIdentifier, updateUserGroupRequest)



  Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    String groupIdentifier = "groupIdentifier_example"; // String | GUID or name of the group.
    UpdateUserGroupRequest updateUserGroupRequest = new UpdateUserGroupRequest(); // UpdateUserGroupRequest | 
    try {
      apiInstance.updateUserGroup(groupIdentifier, updateUserGroupRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#updateUserGroup");
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
| **groupIdentifier** | **String**| GUID or name of the group. | |
| **updateUserGroupRequest** | [**UpdateUserGroupRequest**](UpdateUserGroupRequest.md)|  | |

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

<a id="validateMerge"></a>
# **validateMerge**
> List&lt;DeployResponse&gt; validateMerge(validateMergeRequest)



  Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege and edit access to the metadata objects.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ValidateMergeRequest validateMergeRequest = new ValidateMergeRequest(); // ValidateMergeRequest | 
    try {
      List<DeployResponse> result = apiInstance.validateMerge(validateMergeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#validateMerge");
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
| **validateMergeRequest** | [**ValidateMergeRequest**](ValidateMergeRequest.md)|  | |

### Return type

[**List&lt;DeployResponse&gt;**](DeployResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | validation done successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="validateToken"></a>
# **validateToken**
> TokenValidationResponse validateToken(validateTokenRequest)



  Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ThoughtSpotRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ThoughtSpotRestApi apiInstance = new ThoughtSpotRestApi(defaultClient);
    ValidateTokenRequest validateTokenRequest = new ValidateTokenRequest(); // ValidateTokenRequest | 
    try {
      TokenValidationResponse result = apiInstance.validateToken(validateTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThoughtSpotRestApi#validateToken");
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
| **validateTokenRequest** | [**ValidateTokenRequest**](ValidateTokenRequest.md)|  | |

### Return type

[**TokenValidationResponse**](TokenValidationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token validation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

