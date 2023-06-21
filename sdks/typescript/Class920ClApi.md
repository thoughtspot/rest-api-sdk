# ThoughtSpotRestApiSdk.Class920ClApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnection**](Class920ClApi.md#createConnection) | **POST** /api/rest/2.0/connection/create | 
[**deleteConnection**](Class920ClApi.md#deleteConnection) | **POST** /api/rest/2.0/connection/delete | 
[**getSystemOverrideInfo**](Class920ClApi.md#getSystemOverrideInfo) | **GET** /api/rest/2.0/system/config-overrides | 
[**searchConnection**](Class920ClApi.md#searchConnection) | **POST** /api/rest/2.0/connection/search | 
[**updateConnection**](Class920ClApi.md#updateConnection) | **POST** /api/rest/2.0/connection/update | 
[**updateSystemConfig**](Class920ClApi.md#updateSystemConfig) | **POST** /api/rest/2.0/system/config-update | 


# **createConnection**
> CreateConnectionResponse createConnection(createConnectionRequest)

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class920ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class920ClApiCreateConnectionRequest = {
  // CreateConnectionRequest
  createConnectionRequest: {
    name: "name_example",
    description: "description_example",
    dataWarehouseType: "SNOWFLAKE",
    dataWarehouseConfig: {},
    validate: true,
  },
};

apiInstance.createConnection(body).then((data:any) => {
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

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class920ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class920ClApiDeleteConnectionRequest = {
  // DeleteConnectionRequest
  deleteConnectionRequest: {
    connectionIdentifier: "connectionIdentifier_example",
  },
};

apiInstance.deleteConnection(body).then((data:any) => {
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

# **getSystemOverrideInfo**
> any getSystemOverrideInfo()

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.       #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class920ClApi(configuration);

let body:any = {};

apiInstance.getSystemOverrideInfo(body).then((data:any) => {
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

# **searchConnection**
> Array<SearchConnectionResponse> searchConnection()

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Gets connection objects configured on the ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  * To get a list of all connection objects available in the ThoughtSpot system, send a `POST` request with no attributes in the request body. * To get the connection objects created for a specific type of data warehouse, set the type in `data_warehouse_types`. * To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. * To get details of the database, schemas, tables, or columns from a data connection object, specify the `data_warehouse_object_type` attribute. * To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`). ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ``` * To include more details about connection objects in the API response, set `include_details` to `true`. * You can also sort the output by field names and filter connections by tags.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class920ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class920ClApiSearchConnectionRequest = {
  // SearchConnectionRequest (optional)
  searchConnectionRequest: {
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
  },
};

apiInstance.searchConnection(body).then((data:any) => {
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

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class920ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class920ClApiUpdateConnectionRequest = {
  // UpdateConnectionRequest
  updateConnectionRequest: {
    connectionIdentifier: "connectionIdentifier_example",
    name: "name_example",
    description: "description_example",
    dataWarehouseConfig: {},
    validate: true,
  },
};

apiInstance.updateConnection(body).then((data:any) => {
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

# **updateSystemConfig**
> void updateSystemConfig(updateSystemConfigRequest)

  <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>  Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.     #### Endpoint URL 

### Example


```typescript
import * as ThoughtSpotRestApiSdk from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = ThoughtSpotRestApiSdk.createConfiguration();
const apiInstance = new ThoughtSpotRestApiSdk.Class920ClApi(configuration);

let body:ThoughtSpotRestApiSdk.Class920ClApiUpdateSystemConfigRequest = {
  // UpdateSystemConfigRequest
  updateSystemConfigRequest: {
    configuration: {},
  },
};

apiInstance.updateSystemConfig(body).then((data:any) => {
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

