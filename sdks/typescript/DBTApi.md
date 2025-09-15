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
> any dbtConnection()

  Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DbtConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.dbtConnection(
  // string | Name of the connection.
  "connectionName_example" , 
  // string | Name of the Database.
  "databaseName_example" , 
  // string | Mention type of Import (optional)
  "DBT_CLOUD" , 
  // string | Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
  "accessToken_example" , 
  // string | DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
  "dbtUrl_example" , 
  // string | Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
  "accountId_example" , 
  // string | Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
  "projectId_example" , 
  // string | DBT Environment ID\\\" (optional)
  "dbtEnvId_example" , 
  // string | Name of the project (optional)
  "projectName_example" , 
  // HttpFile | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\'ZIP_FILE\\\' (optional)
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionName** | [**string**] | Name of the connection. | defaults to undefined
 **databaseName** | [**string**] | Name of the Database. | defaults to undefined
 **importType** | [**string**]**Array<&#39;DBT_CLOUD&#39; &#124; &#39;ZIP_FILE&#39;>** | Mention type of Import | (optional) defaults to 'DBT_CLOUD'
 **accessToken** | [**string**] | Access token is mandatory when Import_Type is DBT_CLOUD. | (optional) defaults to undefined
 **dbtUrl** | [**string**] | DBT URL is mandatory when Import_Type is DBT_CLOUD. | (optional) defaults to undefined
 **accountId** | [**string**] | Account ID is mandatory when Import_Type is DBT_CLOUD | (optional) defaults to undefined
 **projectId** | [**string**] | Project ID is mandatory when Import_Type is DBT_CLOUD | (optional) defaults to undefined
 **dbtEnvId** | [**string**] | DBT Environment ID\\\&quot; | (optional) defaults to undefined
 **projectName** | [**string**] | Name of the project | (optional) defaults to undefined
 **fileContent** | [**HttpFile**] | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\&#39;ZIP_FILE\\\&#39; | (optional) defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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
> any dbtGenerateSyncTml()

  Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DbtGenerateSyncTmlRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.dbtGenerateSyncTml(
  // string | Unique ID of the DBT connection.
  "dbtConnectionIdentifier_example" , 
  // HttpFile | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbtConnectionIdentifier** | [**string**] | Unique ID of the DBT connection. | defaults to undefined
 **fileContent** | [**HttpFile**] | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ | (optional) defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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
> any dbtGenerateTml()

  Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, DbtGenerateTmlRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.dbtGenerateTml(
  // string | Unique ID of the DBT connection.
  "dbtConnectionIdentifier_example" , 
  // string | Mention the worksheet tmls to import
  "ALL" , 
  // string | List of Models and their respective Tables (optional)
  "modelTables_example" , 
  // string | List of worksheets is mandatory when import_Worksheets is type SELECTED (optional)
  "worksheets_example" , 
  // HttpFile | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional)
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbtConnectionIdentifier** | [**string**] | Unique ID of the DBT connection. | defaults to undefined
 **importWorksheets** | [**string**]**Array<&#39;ALL&#39; &#124; &#39;NONE&#39; &#124; &#39;SELECTED&#39;>** | Mention the worksheet tmls to import | defaults to undefined
 **modelTables** | [**string**] | List of Models and their respective Tables | (optional) defaults to undefined
 **worksheets** | [**string**] | List of worksheets is mandatory when import_Worksheets is type SELECTED | (optional) defaults to undefined
 **fileContent** | [**HttpFile**] | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ | (optional) defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

  Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      

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

  Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      

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
> any updateDbtConnection()

  Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      

### Example


```typescript
import { createBearerAuthenticationConfig, DBTApi, UpdateDbtConnectionRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new DBTApi(configuration);

apiInstance.updateDbtConnection(
  // string | Unique ID of the DBT Connection.
  "dbtConnectionIdentifier_example" , 
  // string | Name of the connection. (optional)
  "connectionName_example" , 
  // string | Name of the Database. (optional)
  "databaseName_example" , 
  // string | Mention type of Import (optional)
  "DBT_CLOUD" , 
  // string | Access token is mandatory when Import_Type is DBT_CLOUD. (optional)
  "accessToken_example" , 
  // string | DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional)
  "dbtUrl_example" , 
  // string | Account ID is mandatory when Import_Type is DBT_CLOUD (optional)
  "accountId_example" , 
  // string | Project ID is mandatory when Import_Type is DBT_CLOUD (optional)
  "projectId_example" , 
  // string | DBT Environment ID\\\" (optional)
  "dbtEnvId_example" , 
  // string | Name of the project (optional)
  "projectName_example" , 
  // HttpFile | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\'ZIP_FILE\\\' (optional)
  { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dbtConnectionIdentifier** | [**string**] | Unique ID of the DBT Connection. | defaults to undefined
 **connectionName** | [**string**] | Name of the connection. | (optional) defaults to undefined
 **databaseName** | [**string**] | Name of the Database. | (optional) defaults to undefined
 **importType** | [**string**]**Array<&#39;DBT_CLOUD&#39; &#124; &#39;ZIP_FILE&#39;>** | Mention type of Import | (optional) defaults to 'DBT_CLOUD'
 **accessToken** | [**string**] | Access token is mandatory when Import_Type is DBT_CLOUD. | (optional) defaults to undefined
 **dbtUrl** | [**string**] | DBT URL is mandatory when Import_Type is DBT_CLOUD. | (optional) defaults to undefined
 **accountId** | [**string**] | Account ID is mandatory when Import_Type is DBT_CLOUD | (optional) defaults to undefined
 **projectId** | [**string**] | Project ID is mandatory when Import_Type is DBT_CLOUD | (optional) defaults to undefined
 **dbtEnvId** | [**string**] | DBT Environment ID\\\&quot; | (optional) defaults to undefined
 **projectName** | [**string**] | Name of the project | (optional) defaults to undefined
 **fileContent** | [**HttpFile**] | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\&#39;ZIP_FILE\\\&#39; | (optional) defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

