# SecurityApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**assignChangeAuthor**](SecurityApi.md#assignChangeAuthor) | **POST** /api/rest/2.0/security/metadata/assign |
| [**fetchColumnSecurityRules**](SecurityApi.md#fetchColumnSecurityRules) | **POST** /api/rest/2.0/security/column/rules/fetch |
| [**fetchPermissionsOfPrincipals**](SecurityApi.md#fetchPermissionsOfPrincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions |
| [**fetchPermissionsOnMetadata**](SecurityApi.md#fetchPermissionsOnMetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions |
| [**publishMetadata**](SecurityApi.md#publishMetadata) | **POST** /api/rest/2.0/security/metadata/publish |
| [**shareMetadata**](SecurityApi.md#shareMetadata) | **POST** /api/rest/2.0/security/metadata/share |
| [**unpublishMetadata**](SecurityApi.md#unpublishMetadata) | **POST** /api/rest/2.0/security/metadata/unpublish |
| [**updateColumnSecurityRules**](SecurityApi.md#updateColumnSecurityRules) | **POST** /api/rest/2.0/security/column/rules/update |


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

<a id="fetchColumnSecurityRules"></a>
# **fetchColumnSecurityRules**
> List&lt;ColumnSecurityRuleResponse&gt; fetchColumnSecurityRules(fetchColumnSecurityRulesRequest)



 Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - At least one of &#x60;identifier&#x60; or &#x60;obj_identifier&#x60; must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;tables\&quot;: [     {       \&quot;identifier\&quot;: \&quot;table-guid\&quot;,       \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;     }   ] } &#x60;&#x60;&#x60;  #### Response format  The API returns an array of &#x60;ColumnSecurityRuleResponse&#x60; objects wrapped in a &#x60;data&#x60; field. Each &#x60;ColumnSecurityRuleResponse&#x60; object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;data\&quot;: [     {       \&quot;guid\&quot;: \&quot;table-guid\&quot;,       \&quot;objId\&quot;: \&quot;table-object-id\&quot;,       \&quot;columnSecurityRules\&quot;: [         {           \&quot;column\&quot;: {             \&quot;id\&quot;: \&quot;col_123\&quot;,             \&quot;name\&quot;: \&quot;Salary\&quot;           },           \&quot;groups\&quot;: [             {               \&quot;id\&quot;: \&quot;group_1\&quot;,               \&quot;name\&quot;: \&quot;HR Department\&quot;             }           ],           \&quot;sourceTableDetails\&quot;: {             \&quot;id\&quot;: \&quot;source-table-guid\&quot;,             \&quot;name\&quot;: \&quot;Employee_Data\&quot;           }         }       ]     }   ] } &#x60;&#x60;&#x60;     

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchColumnSecurityRulesRequest** | [**FetchColumnSecurityRulesRequest**](FetchColumnSecurityRulesRequest.md)

### Return type

[**List&lt;ColumnSecurityRuleResponse&gt;**](ColumnSecurityRuleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched column security rules |  -  |
| **400** | Bad request - Table not found or invalid parameters |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden - User doesn&#39;t have permission to access security rules for this table |  -  |
| **500** | Internal server error |  -  |

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

<a id="publishMetadata"></a>
# **publishMetadata**
> publishMetadata(publishMetadataRequest)



 Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it&#39;s dependencies to the org admins of the orgs to which it is being published.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **publishMetadataRequest** | [**PublishMetadataRequest**](PublishMetadataRequest.md)

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
| **204** | Publishing metadata objects is successful. |  -  |
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

<a id="unpublishMetadata"></a>
# **unpublishMetadata**
> unpublishMetadata(unpublishMetadataRequest)



 Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting &#x60;include_dependencies&#x60; to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting &#x60;force&#x60; to true - this will break all dependent objects in the unpublished organizations      

### Parameters

| Name | Type |
|------------- | ------------- |
| **unpublishMetadataRequest** | [**UnpublishMetadataRequest**](UnpublishMetadataRequest.md)

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
| **204** | Unpublishing metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateColumnSecurityRules"></a>
# **updateColumnSecurityRules**
> updateColumnSecurityRules(updateColumnSecurityRulesRequest)



 Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \&quot;all or none\&quot; policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - Use &#x60;clear_csr: true&#x60; to remove all column security rules from the table - For each column, specify the security rule using &#x60;column_security_rules&#x60; array - Use &#x60;is_unsecured: true&#x60; to mark a specific column as unprotected - Use &#x60;group_access&#x60; operations to manage group associations:   - &#x60;ADD&#x60;: Add groups to the column&#39;s access list   - &#x60;REMOVE&#x60;: Remove groups from the column&#39;s access list   - &#x60;REPLACE&#x60;: Replace all existing groups with the specified groups  #### Required permissions  - &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data (if RBAC is disabled) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;identifier\&quot;: \&quot;table-guid\&quot;,   \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;,   \&quot;clear_csr\&quot;: false,   \&quot;column_security_rules\&quot;: [     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: false,       \&quot;group_access\&quot;: [         {           \&quot;operation\&quot;: \&quot;ADD\&quot;,           \&quot;group_identifiers\&quot;: [\&quot;hr_group_id\&quot;, \&quot;hr_group_name\&quot;, \&quot;finance_group_id\&quot;]         }       ]     },     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: true     },     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: false,       \&quot;group_access\&quot;: [         {           \&quot;operation\&quot;: \&quot;REPLACE\&quot;,           \&quot;group_identifiers\&quot;: [\&quot;management_group_id\&quot;, \&quot;management_group_name\&quot;]         }       ]     }   ] } &#x60;&#x60;&#x60;  #### Request Body Schema  - &#x60;identifier&#x60; (string, optional): GUID or name of the table for which we want to create column security rules - &#x60;obj_identifier&#x60; (string, optional): The object ID of the table - &#x60;clear_csr&#x60; (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - &#x60;column_security_rules&#x60; (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - &#x60;column_identifier&#x60; (string, required): Column identifier (col_id or name) - &#x60;is_unsecured&#x60; (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - &#x60;group_access&#x60; (array of objects, optional): Array of group operation objects  Each group operation object contains: - &#x60;operation&#x60; (string, required): Operation type - ADD, REMOVE, or REPLACE - &#x60;group_identifiers&#x60; (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column&#39;s access list - **REMOVE**: Removes the specified groups from the column&#39;s access list   - **REPLACE**: Replaces all existing groups with the specified groups      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateColumnSecurityRulesRequest** | [**UpdateColumnSecurityRulesRequest**](UpdateColumnSecurityRulesRequest.md)

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
| **204** | Successfully updated column security rules |  -  |
| **400** | Bad request - Invalid parameters or table not found |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden - User doesn&#39;t have permission to modify security rules for this table |  -  |
| **500** | Internal server error |  -  |

