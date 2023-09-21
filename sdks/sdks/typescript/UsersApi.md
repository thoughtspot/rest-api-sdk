# ThoughtSpotRestApiSdk.UsersApi

All URIs are relative to the basePath

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateUser**](UsersApi.md#activateUser) | **POST** /api/rest/2.0/users/activate | 
[**changeUserPassword**](UsersApi.md#changeUserPassword) | **POST** /api/rest/2.0/users/change-password | 
[**createUser**](UsersApi.md#createUser) | **POST** /api/rest/2.0/users/create | 
[**deactivateUser**](UsersApi.md#deactivateUser) | **POST** /api/rest/2.0/users/deactivate | 
[**deleteUser**](UsersApi.md#deleteUser) | **POST** /api/rest/2.0/users/{user_identifier}/delete | 
[**forceLogoutUsers**](UsersApi.md#forceLogoutUsers) | **POST** /api/rest/2.0/users/force-logout | 
[**importUsers**](UsersApi.md#importUsers) | **POST** /api/rest/2.0/users/import | 
[**resetUserPassword**](UsersApi.md#resetUserPassword) | **POST** /api/rest/2.0/users/reset-password | 
[**searchUsers**](UsersApi.md#searchUsers) | **POST** /api/rest/2.0/users/search | 
[**updateUser**](UsersApi.md#updateUser) | **POST** /api/rest/2.0/users/{user_identifier}/update | 


# **activateUser**
> User activateUser(activateUserRequest)

 <span class=\"since-beta-tag\">Version: 9.7.0.cl or later</span>

### Example


```typescript
import { createConfiguration, UsersApi, ActivateUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.activateUser(
  // ActivateUserRequest
  {
    user_identifier: "user_identifier_example",
    auth_token: "auth_token_example",
    password: "password_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activateUserRequest** | **ActivateUserRequest**|  |


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
**200** | User activated successfully. |  -  |
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
import { createConfiguration, UsersApi, ChangeUserPasswordRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.changeUserPassword(
  // ChangeUserPasswordRequest
  {
    current_password: "current_password_example",
    new_password: "new_password_example",
    user_identifier: "user_identifier_example",
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

# **createUser**
> User createUser(createUserRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, UsersApi, CreateUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.createUser(
  // CreateUserRequest
  {
    name: "name_example",
    display_name: "display_name_example",
    password: "password_example",
    email: "email_example",
    account_type: "LOCAL_USER",
    account_status: "ACTIVE",
    org_identifiers: [
      "org_identifiers_example",
    ],
    group_identifiers: [
      "group_identifiers_example",
    ],
    visibility: "SHARABLE",
    notify_on_share: true,
    show_onboarding_experience: true,
    onboarding_experience_completed: false,
    home_liveboard_identifier: "home_liveboard_identifier_example",
    favorite_metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    preferred_locale: "en-CA",
    extended_properties: {},
    extended_preferences: {},
    trigger_welcome_email: true,
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

# **deactivateUser**
> ResponseActivationURL deactivateUser(deactivateUserRequest)

 <span class=\"since-beta-tag\">Version: 9.7.0.cl or later</span>

### Example


```typescript
import { createConfiguration, UsersApi, DeactivateUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.deactivateUser(
  // DeactivateUserRequest
  {
    user_identifier: "user_identifier_example",
    base_url: "base_url_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deactivateUserRequest** | **DeactivateUserRequest**|  |


### Return type

**ResponseActivationURL**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User deactivated successfully. |  -  |
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
import { createConfiguration, UsersApi, DeleteUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

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

# **forceLogoutUsers**
> void forceLogoutUsers()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, UsersApi, ForceLogoutUsersRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.forceLogoutUsers(
  // ForceLogoutUsersRequest (optional)
  {
    user_identifiers: [
      "user_identifiers_example",
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

# **importUsers**
> ImportUsersResponse importUsers(importUsersRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, UsersApi, ImportUsersRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.importUsers(
  // ImportUsersRequest
  {
    users: [
      {
        user_identifier: "user_identifier_example",
        display_name: "display_name_example",
        password: "password_example",
        account_type: "LOCAL_USER",
        account_status: "ACTIVE",
        email: "email_example",
        org_identifiers: [
          "org_identifiers_example",
        ],
        group_identifiers: [
          "group_identifiers_example",
        ],
        visibility: "SHARABLE",
        notify_on_share: true,
        show_onboarding_experience: true,
        onboarding_experience_completed: true,
        home_liveboard_identifier: "home_liveboard_identifier_example",
        favorite_metadata: [
          {
            identifier: "identifier_example",
            type: "LIVEBOARD",
          },
        ],
      },
    ],
    default_password: "default_password_example",
    dry_run: true,
    delete_unspecified_users: false,
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

# **resetUserPassword**
> void resetUserPassword(resetUserPasswordRequest)

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, UsersApi, ResetUserPasswordRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.resetUserPassword(
  // ResetUserPasswordRequest
  {
    new_password: "new_password_example",
    user_identifier: "user_identifier_example",
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

# **searchUsers**
> Array<User> searchUsers()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, UsersApi, SearchUsersRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.searchUsers(
  // SearchUsersRequest (optional)
  {
    user_identifier: "user_identifier_example",
    display_name: "display_name_example",
    name_pattern: "name_pattern_example",
    visibility: "SHARABLE",
    email: "email_example",
    group_identifiers: [
      "group_identifiers_example",
    ],
    privileges: [
      "ADMINISTRATION",
    ],
    account_type: "LOCAL_USER",
    account_status: "ACTIVE",
    notify_on_share: true,
    show_onboarding_experience: true,
    onboarding_experience_completed: true,
    org_identifiers: [
      "org_identifiers_example",
    ],
    home_liveboard_identifier: "home_liveboard_identifier_example",
    favorite_metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    record_offset: 0,
    record_size: 10,
    sort_options: {
      field_name: "NAME",
      order: "ASC",
    },
    role_identifiers: [
      "role_identifiers_example",
    ],
    include_favorite_metadata: false,
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

# **updateUser**
> void updateUser()

  <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, UsersApi, UpdateUserRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

apiInstance.updateUser(
  // string | GUID / name of the user
  "user_identifier_example" , 
  // UpdateUserRequest (optional)
  {
    name: "name_example",
    display_name: "display_name_example",
    visibility: "SHARABLE",
    email: "email_example",
    account_status: "ACTIVE",
    notify_on_share: true,
    show_onboarding_experience: true,
    onboarding_experience_completed: true,
    account_type: "LOCAL_USER",
    group_identifiers: [
      "group_identifiers_example",
    ],
    home_liveboard_identifier: "home_liveboard_identifier_example",
    favorite_metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    org_identifiers: [
      "org_identifiers_example",
    ],
    operation: "REPLACE",
    preferred_locale: "en-CA",
    extended_properties: {},
    extended_preferences: {},
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

