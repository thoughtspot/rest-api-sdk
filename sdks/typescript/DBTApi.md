# ThoughtSpotRestApiSdk.DBTApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dbtConnection**](DBTApi.md#dbtConnection) | **POST** /api/rest/2.0/dbt/dbt-connection | 
[**dbtGenerateSyncTml**](DBTApi.md#dbtGenerateSyncTml) | **POST** /api/rest/2.0/dbt/generate-sync-tml | 
[**dbtGenerateTml**](DBTApi.md#dbtGenerateTml) | **POST** /api/rest/2.0/dbt/generate-tml | 
[**dbtSearch**](DBTApi.md#dbtSearch) | **POST** /api/rest/2.0/dbt/search | 
[**deleteDbtConnection**](DBTApi.md#deleteDbtConnection) | **POST** /api/rest/2.0/dbt/{dbt_connection_identifier}/delete | 
[**updateDbtConnection**](DBTApi.md#updateDbtConnection) | **POST** /api/rest/2.0/dbt/update-dbt-connection | 


# **dbtConnection**
> any dbtConnection(dbtConnectionRequest)

  Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege.  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DbtConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.dbtConnection(
  // DbtConnectionRequest
  {
    connection_name: "connection_name_example",
    database_name: "database_name_example",
    import_type: "DBT_CLOUD",
    access_token: "access_token_example",
    dbt_url: "dbt_url_example",
    account_id: "account_id_example",
    project_id: "project_id_example",
    dbt_env_id: "dbt_env_id_example",
    project_name: "project_name_example",
    file_content: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbtConnectionRequest** | **DbtConnectionRequest**|  |


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
**200** | Succesfully created DBT Connection. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **dbtGenerateSyncTml**
> any dbtGenerateSyncTml(dbtGenerateSyncTmlRequest)

 Version: 9.9.0.cl or later 

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DbtGenerateSyncTmlRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.dbtGenerateSyncTml(
  // DbtGenerateSyncTmlRequest
  {
    dbt_connection_identifier: "dbt_connection_identifier_example",
    file_content: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbtGenerateSyncTmlRequest** | **DbtGenerateSyncTmlRequest**|  |


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
**200** | Sync Table and Worksheet TML\&#39;s are successfully generated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **dbtGenerateTml**
> any dbtGenerateTml(dbtGenerateTmlRequest)

 Version: 9.9.0.cl or later 

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DbtGenerateTmlRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.dbtGenerateTml(
  // DbtGenerateTmlRequest
  {
    dbt_connection_identifier: "dbt_connection_identifier_example",
    model_tables: [
      {
        model_name: "model_name_example",
        model_path: "model_path_example",
        tables: [
          "tables_example",
        ],
      },
    ],
    import_worksheets: "ALL",
    worksheets: [
      "worksheets_example",
    ],
    file_content: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbtGenerateTmlRequest** | **DbtGenerateTmlRequest**|  |


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
**200** | Required Table and Worksheet TML\&#39;s are successfully generated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **dbtSearch**
> Array<DbtSearchResponse> dbtSearch()

  Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DbtSearchRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.dbtSearch().then((data:any) => {
  console.log('API called successfully. Returned data: ' + JSON.stringify(data));
}).catch((error:any) => console.error(error));


```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<DbtSearchResponse>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved list of DBT connections successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteDbtConnection**
> void deleteDbtConnection()

  Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege.      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DeleteDbtConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.deleteDbtConnection(
  // string | Unique ID of the DBT Connection.
  "dbt_connection_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbtConnectionIdentifier** | [**string**] | Unique ID of the DBT Connection. | defaults to undefined


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
**204** | DBT Connection successfully deleted. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateDbtConnection**
> any updateDbtConnection(updateDbtConnectionRequest)

  Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection.  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, UpdateDbtConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.updateDbtConnection(
  // UpdateDbtConnectionRequest
  {
    dbt_connection_identifier: "dbt_connection_identifier_example",
    connection_name: "connection_name_example",
    database_name: "database_name_example",
    import_type: "DBT_CLOUD",
    access_token: "access_token_example",
    dbt_url: "dbt_url_example",
    account_id: "account_id_example",
    project_id: "project_id_example",
    dbt_env_id: "dbt_env_id_example",
    project_name: "project_name_example",
    file_content: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateDbtConnectionRequest** | **UpdateDbtConnectionRequest**|  |


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
**200** | DBT Connection successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

