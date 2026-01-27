# ThoughtSpotRestApiSdk.SecurityApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignChangeAuthor**](SecurityApi.md#assignChangeAuthor) | **POST** /api/rest/2.0/security/metadata/assign | 
[**fetchColumnSecurityRules**](SecurityApi.md#fetchColumnSecurityRules) | **POST** /api/rest/2.0/security/column/rules/fetch | 
[**fetchPermissionsOfPrincipals**](SecurityApi.md#fetchPermissionsOfPrincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions | 
[**fetchPermissionsOnMetadata**](SecurityApi.md#fetchPermissionsOnMetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions | 
[**publishMetadata**](SecurityApi.md#publishMetadata) | **POST** /api/rest/2.0/security/metadata/publish | 
[**shareMetadata**](SecurityApi.md#shareMetadata) | **POST** /api/rest/2.0/security/metadata/share | 
[**unpublishMetadata**](SecurityApi.md#unpublishMetadata) | **POST** /api/rest/2.0/security/metadata/unpublish | 
[**updateColumnSecurityRules**](SecurityApi.md#updateColumnSecurityRules) | **POST** /api/rest/2.0/security/column/rules/update | 


# **assignChangeAuthor**
> void assignChangeAuthor(assignChangeAuthorRequest)

  Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.      

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, AssignChangeAuthorRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

apiInstance.assignChangeAuthor(
  // AssignChangeAuthorRequest
  {
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    user_identifier: "user_identifier_example",
    current_owner_identifier: "current_owner_identifier_example",
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

# **fetchColumnSecurityRules**
> Array<ColumnSecurityRuleResponse> fetchColumnSecurityRules(fetchColumnSecurityRulesRequest)

 Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either `identifier` (GUID or name) or `obj_identifier` (object ID) - At least one of `identifier` or `obj_identifier` must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables  #### Example request  ```json {   \"tables\": [     {       \"identifier\": \"table-guid\",       \"obj_identifier\": \"table-object-id\"     }   ] } ```  #### Response format  The API returns an array of `ColumnSecurityRuleResponse` objects wrapped in a `data` field. Each `ColumnSecurityRuleResponse` object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  ```json {   \"data\": [     {       \"guid\": \"table-guid\",       \"objId\": \"table-object-id\",       \"columnSecurityRules\": [         {           \"column\": {             \"id\": \"col_123\",             \"name\": \"Salary\"           },           \"groups\": [             {               \"id\": \"group_1\",               \"name\": \"HR Department\"             }           ],           \"sourceTableDetails\": {             \"id\": \"source-table-guid\",             \"name\": \"Employee_Data\"           }         }       ]     }   ] } ```     

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, FetchColumnSecurityRulesRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

apiInstance.fetchColumnSecurityRules(
  // FetchColumnSecurityRulesRequest
  {
    tables: [
      {
        identifier: "identifier_example",
        obj_identifier: "obj_identifier_example",
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
 **fetchColumnSecurityRulesRequest** | **FetchColumnSecurityRulesRequest**|  |


### Return type

**Array<ColumnSecurityRuleResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully fetched column security rules |  -  |
**400** | Bad request - Table not found or invalid parameters |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden - User doesn\&#39;t have permission to access security rules for this table |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchPermissionsOfPrincipals**
> PermissionOfPrincipalsResponse fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest)

  Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, FetchPermissionsOfPrincipalsRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

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
    record_offset: 0,
    record_size: -1,
    default_metadata_type: "ALL",
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

**PermissionOfPrincipalsResponse**

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
> PermissionOfMetadataResponse fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest)

  Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, FetchPermissionsOnMetadataRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

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
    include_dependent_objects: false,
    record_offset: 0,
    record_size: -1,
    permission_type: "permission_type_example",
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

**PermissionOfMetadataResponse**

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

# **publishMetadata**
> void publishMetadata(publishMetadataRequest)

 Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it\'s dependencies to the org admins of the orgs to which it is being published.      

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, PublishMetadataRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

apiInstance.publishMetadata(
  // PublishMetadataRequest
  {
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    org_identifiers: [
      "org_identifiers_example",
    ],
    skip_validation: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publishMetadataRequest** | **PublishMetadataRequest**|  |


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
**204** | Publishing metadata objects is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **shareMetadata**
> void shareMetadata(shareMetadataRequest)

  Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  #### Supported metadata objects: * Liveboards * Visualizations * Answers * Models * Views * Connections  #### Object permissions  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. The `READ_ONLY` permission grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.  #### Sharing a visualization  * Sharing a visualization implicitly shares the entire Liveboard with the recipient.   * Object permissions set for a shared visualization also apply to the Liveboard unless overridden by another API request or via UI. * If email notifications for object sharing are enabled, a notification with a link to the shared visualization will be sent to the recipient’s email address. Although this link opens the shared visualization, recipients can also access other visualizations in the Liveboard.      

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, ShareMetadataRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

apiInstance.shareMetadata(
  // ShareMetadataRequest
  {
    metadata_type: "LIVEBOARD",
    metadata_identifiers: [
      "metadata_identifiers_example",
    ],
    metadata: [
      {
        type: "LIVEBOARD",
        identifier: "identifier_example",
      },
    ],
    permissions: [
      {
        principal: {
          identifier: "identifier_example",
          type: "USER",
        },
        share_mode: "READ_ONLY",
      },
    ],
    visualization_identifiers: [
      "visualization_identifiers_example",
    ],
    emails: [],
    message: "message_example",
    enable_custom_url: false,
    notify_on_share: true,
    has_lenient_discoverability: false,
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

# **unpublishMetadata**
> void unpublishMetadata(unpublishMetadataRequest)

 Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting `include_dependencies` to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting `force` to true - this will break all dependent objects in the unpublished organizations      

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, UnpublishMetadataRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

apiInstance.unpublishMetadata(
  // UnpublishMetadataRequest
  {
    force: true,
    include_dependencies: true,
    metadata: [
      {
        identifier: "identifier_example",
        type: "LIVEBOARD",
      },
    ],
    org_identifiers: [
      "org_identifiers_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unpublishMetadataRequest** | **UnpublishMetadataRequest**|  |


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
**204** | Unpublishing metadata objects is successful. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateColumnSecurityRules**
> void updateColumnSecurityRules(updateColumnSecurityRulesRequest)

 Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \"all or none\" policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either `identifier` (GUID or name) or `obj_identifier` (object ID) - Use `clear_csr: true` to remove all column security rules from the table - For each column, specify the security rule using `column_security_rules` array - Use `is_unsecured: true` to mark a specific column as unprotected - Use `group_access` operations to manage group associations:   - `ADD`: Add groups to the column\'s access list   - `REMOVE`: Remove groups from the column\'s access list   - `REPLACE`: Replace all existing groups with the specified groups  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data (if RBAC is disabled) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  ```json {   \"identifier\": \"table-guid\",   \"obj_identifier\": \"table-object-id\",   \"clear_csr\": false,   \"column_security_rules\": [     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"ADD\",           \"group_identifiers\": [\"hr_group_id\", \"hr_group_name\", \"finance_group_id\"]         }       ]     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": true     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"REPLACE\",           \"group_identifiers\": [\"management_group_id\", \"management_group_name\"]         }       ]     }   ] } ```  #### Request Body Schema  - `identifier` (string, optional): GUID or name of the table for which we want to create column security rules - `obj_identifier` (string, optional): The object ID of the table - `clear_csr` (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - `column_security_rules` (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - `column_identifier` (string, required): Column identifier (col_id or name) - `is_unsecured` (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - `group_access` (array of objects, optional): Array of group operation objects  Each group operation object contains: - `operation` (string, required): Operation type - ADD, REMOVE, or REPLACE - `group_identifiers` (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column\'s access list - **REMOVE**: Removes the specified groups from the column\'s access list   - **REPLACE**: Replaces all existing groups with the specified groups      

### Example


```typescript
import { createBearerAuthenticationConfig, SecurityApi, UpdateColumnSecurityRulesRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new SecurityApi(configuration);

apiInstance.updateColumnSecurityRules(
  // UpdateColumnSecurityRulesRequest
  {
    identifier: "identifier_example",
    obj_identifier: "obj_identifier_example",
    clear_csr: true,
    column_security_rules: [
      {
        column_identifier: "column_identifier_example",
        is_unsecured: true,
        group_access: [
          {
            operation: "ADD",
            group_identifiers: [
              "group_identifiers_example",
            ],
          },
        ],
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
 **updateColumnSecurityRulesRequest** | **UpdateColumnSecurityRulesRequest**|  |


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
**204** | Successfully updated column security rules |  -  |
**400** | Bad request - Invalid parameters or table not found |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden - User doesn\&#39;t have permission to modify security rules for this table |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

