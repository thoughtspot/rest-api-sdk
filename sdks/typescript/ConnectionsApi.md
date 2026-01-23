# ThoughtSpotRestApiSdk.ConnectionsApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnection**](ConnectionsApi.md#createConnection) | **POST** /api/rest/2.0/connection/create | 
[**deleteConnection**](ConnectionsApi.md#deleteConnection) | **POST** /api/rest/2.0/connection/delete | 
[**deleteConnectionV2**](ConnectionsApi.md#deleteConnectionV2) | **POST** /api/rest/2.0/connections/{connection_identifier}/delete | 
[**downloadConnectionMetadataChanges**](ConnectionsApi.md#downloadConnectionMetadataChanges) | **POST** /api/rest/2.0/connections/download-connection-metadata-changes/{connection_identifier} | 
[**fetchConnectionDiffStatus**](ConnectionsApi.md#fetchConnectionDiffStatus) | **POST** /api/rest/2.0/connections/fetch-connection-diff-status/{connection_identifier} | 
[**revokeRefreshTokens**](ConnectionsApi.md#revokeRefreshTokens) | **POST** /api/rest/2.0/connections/{connection_identifier}/revoke-refresh-tokens | 
[**searchConnection**](ConnectionsApi.md#searchConnection) | **POST** /api/rest/2.0/connection/search | 
[**updateConnection**](ConnectionsApi.md#updateConnection) | **POST** /api/rest/2.0/connection/update | 
[**updateConnectionV2**](ConnectionsApi.md#updateConnectionV2) | **POST** /api/rest/2.0/connections/{connection_identifier}/update | 


# **createConnection**
> CreateConnectionResponse createConnection(createConnectionRequest)

  Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, CreateConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.createConnection(
  // CreateConnectionRequest
  {
    name: "name_example",
    description: "description_example",
    data_warehouse_type: "SNOWFLAKE",
    data_warehouse_config: {},
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

# **deleteConnection**
> void deleteConnection(deleteConnectionRequest)

  Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, DeleteConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.deleteConnection(
  // DeleteConnectionRequest
  {
    connection_identifier: "connection_identifier_example",
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

# **deleteConnectionV2**
> void deleteConnectionV2()

  Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, DeleteConnectionV2Request } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.deleteConnectionV2(
  // string | Unique ID or name of the connection.
  "connection_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionIdentifier** | [**string**] | Unique ID or name of the connection. | defaults to undefined


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
**204** | Connection successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **downloadConnectionMetadataChanges**
> HttpFile downloadConnectionMetadataChanges()

  Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, DownloadConnectionMetadataChangesRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.downloadConnectionMetadataChanges(
  // string | GUID of the connection
  "connection_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionIdentifier** | [**string**] | GUID of the connection | defaults to undefined


### Return type

**HttpFile**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Export metadata changes. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **fetchConnectionDiffStatus**
> FetchConnectionDiffStatusResponse fetchConnectionDiffStatus()

  Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, FetchConnectionDiffStatusRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.fetchConnectionDiffStatus(
  // string | GUID of the connection
  "connection_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionIdentifier** | [**string**] | GUID of the connection | defaults to undefined


### Return type

**FetchConnectionDiffStatusResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | true/false |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **revokeRefreshTokens**
> RevokeRefreshTokensResponse revokeRefreshTokens(revokeRefreshTokensRequest)

  Version: 26.2.0.cl or later   Revokes OAuth refresh tokens for users who no longer require access to a data warehouse connection. When a token is revoked, the affected user\'s session for that connection is terminated, and they must re-authenticate to regain access.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on the ThoughtSpot instance, users with `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege can also make API requests to revoke tokens for connection users.  #### Usage guidelines  You can specify different combinations of identifiers to control which refresh tokens are revoked.  - **connection_identifier**: Revokes refresh tokens for all users of the connection, except the connection author. - **connection_identifier** and **user_identifiers**: Revokes refresh tokens only for the users specified in the request. If the name or ID of the connection author is included in the request, their token will also be revoked. - **connection_identifier** and **configuration_identifiers**: Revokes refresh tokens for all users on the specified configurations, except the configuration author. - **connection_identifier**, **configuration_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users on the specified configurations. - **connection_identifier** and **org_identifiers**: Revokes refresh tokens for the specified Orgs. Applicable only for published connections. - **connection_identifier**, **org_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users in the specified Orgs. Applicable only for published connections.  **NOTE**: The `org_identifiers` parameter is only applicable for published connections. Using this parameter for unpublished connections will result in an error. Ensure that the connections are published before making the API request.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, RevokeRefreshTokensRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.revokeRefreshTokens(
  // string | Unique ID or name of the connection whose refresh tokens need to be revoked. All the users associated with the connection will have their refresh tokens revoked except the author.
  "connection_identifier_example" , 
  // RevokeRefreshTokensRequest
  {
    configuration_identifiers: [
      "configuration_identifiers_example",
    ],
    user_identifiers: [
      "user_identifiers_example",
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
 **revokeRefreshTokensRequest** | **RevokeRefreshTokensRequest**|  |
 **connectionIdentifier** | [**string**] | Unique ID or name of the connection whose refresh tokens need to be revoked. All the users associated with the connection will have their refresh tokens revoked except the author. | defaults to undefined


### Return type

**RevokeRefreshTokensResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Token(s) successfully revoked. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**404** | Object not found |  -  |
**409** | Conflict |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchConnection**
> Array<SearchConnectionResponse> searchConnection(searchConnectionRequest)

  Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth).   - `KEY_PAIR`: For connections that require Key Pair account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PKCE`: For connections that require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo  connections only.   - `EXTOAUTH_WITH_PKCE`: For connections that require External OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PEZ`: For connections that require OAuth With PEZ account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Amazon Redshift connections only.   - `OAUTH_WITH_SERVICE_PRINCIPAL`: For connections that require OAuth With Service Principal account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `PERSONAL_ACCESS_TOKEN`: For connections that require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `OAUTH_CLIENT_CREDENTIALS`: For connections that require OAuth Client Credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only. - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, SearchConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.searchConnection(
  // SearchConnectionRequest
  {
    connections: [
      {
        identifier: "identifier_example",
        name_pattern: "name_pattern_example",
        data_warehouse_objects: [
          {
            database: "database_example",
            schema: "schema_example",
            table: "table_example",
            column: "column_example",
          },
        ],
      },
    ],
    data_warehouse_types: [
      "SNOWFLAKE",
    ],
    record_offset: 0,
    record_size: 10,
    tag_identifiers: [
      "tag_identifiers_example",
    ],
    data_warehouse_object_type: "DATABASE",
    sort_options: null,
    include_details: true,
    configuration: {},
    authentication_type: "SERVICE_ACCOUNT",
    show_resolved_parameters: false,
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

# **updateConnection**
> void updateConnection(updateConnectionRequest)

  Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, UpdateConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.updateConnection(
  // UpdateConnectionRequest
  {
    connection_identifier: "connection_identifier_example",
    name: "name_example",
    description: "description_example",
    data_warehouse_config: {},
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

# **updateConnectionV2**
> void updateConnectionV2(updateConnectionV2Request)

  Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`.        **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.     * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:    * This is an example of updating a single table in a empty connection:           ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"DEMORENAME\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"Col1\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col2\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col3\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col312\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col4\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```        * This is an example of updating a single table in an existing connection with tables:            ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"CUSTOMER\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [],                     \"relationships\": []                   },                   {                     \"name\": \"tpch5k_falcon_default_schema_users\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"user_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"product_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"user_cost\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```  3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.    **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not  specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.    * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a Snowflake connection:    ```    {       \"configuration\":{          \"accountName\":\"thoughtspot_partner\",          \"user\":\"tsadmin\",          \"password\":\"TestConn123\",          \"role\":\"sysadmin\",          \"warehouse\":\"MEDIUM_WH\"       },       \"externalDatabases\":[        ]    }    ```      

### Example


```typescript
import { createBearerAuthenticationConfig, ConnectionsApi, UpdateConnectionV2Request } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new ConnectionsApi(configuration);

apiInstance.updateConnectionV2(
  // string | Unique ID or name of the connection.
  "connection_identifier_example" , 
  // UpdateConnectionV2Request
  {
    name: "name_example",
    description: "description_example",
    data_warehouse_config: {},
    validate: true,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConnectionV2Request** | **UpdateConnectionV2Request**|  |
 **connectionIdentifier** | [**string**] | Unique ID or name of the connection. | defaults to undefined


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

