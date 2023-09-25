# ThoughtSpotRestApiSdk.DBTApi

All URIs are relative to *https://localhost:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dbtConnection**](DBTApi.md#dbtConnection) | **POST** /api/rest/2.0/dbt/dbt-connection | 
[**dbtSearch**](DBTApi.md#dbtSearch) | **POST** /api/rest/2.0/dbt/search | 
[**generateSyncTml**](DBTApi.md#generateSyncTml) | **POST** /api/rest/2.0/dbt/generate-sync-tml | 
[**generateTml**](DBTApi.md#generateTml) | **POST** /api/rest/2.0/dbt/generate-tml | 
[**updateDbtConnection**](DBTApi.md#updateDbtConnection) | **POST** /api/rest/2.0/dbt/{dbt_connection_identifier} | 


# **dbtConnection**
> any dbtConnection(dbtConnectionRequest)

  Version: 9.8.0.cl or later  Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege.  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url ,import type, DBT account identifier , DBT project identifier, DBT access token and environment details to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DBTApi, DbtConnectionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
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

# **dbtSearch**
> any dbtSearch()

  Version: 9.8.0.cl or later  Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DBTApi, DbtSearchRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new DBTApi(configuration);

apiInstance.dbtSearch().then((data:any) => {
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
**200** | Retrieved list of DBT connections successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateSyncTml**
> any generateSyncTml(generateSyncTmlRequest)

  Version: 9.8.0.cl or later  Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DBTApi, GenerateSyncTmlRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new DBTApi(configuration);

apiInstance.generateSyncTml(
  // GenerateSyncTmlRequest
  {
    dbt_connection_identifier: "dbt_connection_identifier_example",
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateSyncTmlRequest** | **GenerateSyncTmlRequest**|  |


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

# **generateTml**
> any generateTml(generateTmlRequest)

  Version: 9.8.0.cl or later  Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection.  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DBTApi, GenerateTmlRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new DBTApi(configuration);

apiInstance.generateTml(
  // GenerateTmlRequest
  {
    dbt_connection_identifier: "dbt_connection_identifier_example",
    model_tables: [
      {
        model_name: "model_name_example",
        tables: [
          "tables_example",
        ],
      },
    ],
    import_worksheets: "ALL",
    worksheets: [
      "worksheets_example",
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateTmlRequest** | **GenerateTmlRequest**|  |


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

# **updateDbtConnection**
> void updateDbtConnection()

  Version: 9.8.0.cl or later  Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection.  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name,import type, account identifier, access token, project identifier and environment  settings.     #### Endpoint URL 

### Example


```typescript
import { createConfiguration, DBTApi, UpdateDbtConnectionRequest } from 'thoughtspot-rest-api-sdk';
import * as fs from 'fs';

const configuration = createConfiguration();
const apiInstance = new DBTApi(configuration);

apiInstance.updateDbtConnection(
  // string | Unique ID of the DBT Connection.
  "dbt_connection_identifier_example" , 
  // UpdateDbtConnectionRequest (optional)
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
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateDbtConnectionRequest** | **UpdateDbtConnectionRequest**|  |
 **dbtConnectionIdentifier** | [**string**] | Unique ID of the DBT Connection. | defaults to undefined


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
**204** | DBT Connection successfully updated. |  -  |
**400** | Invalid request. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

