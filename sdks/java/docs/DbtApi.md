# DbtApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**dbtConnection**](DbtApi.md#dbtConnection) | **POST** /api/rest/2.0/dbt/dbt-connection |
| [**dbtGenerateSyncTml**](DbtApi.md#dbtGenerateSyncTml) | **POST** /api/rest/2.0/dbt/generate-sync-tml |
| [**dbtGenerateTml**](DbtApi.md#dbtGenerateTml) | **POST** /api/rest/2.0/dbt/generate-tml |
| [**dbtSearch**](DbtApi.md#dbtSearch) | **POST** /api/rest/2.0/dbt/search |
| [**deleteDbtConnection**](DbtApi.md#deleteDbtConnection) | **POST** /api/rest/2.0/dbt/{dbt_connection_identifier}/delete |
| [**updateDbtConnection**](DbtApi.md#updateDbtConnection) | **POST** /api/rest/2.0/dbt/update-dbt-connection |


<a id="dbtConnection"></a>
# **dbtConnection**
> Object dbtConnection(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent)



  Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionName** | **String**
| **databaseName** | **String**
| **importType** | **String**
| **accessToken** | **String**
| **dbtUrl** | **String**
| **accountId** | **String**
| **projectId** | **String**
| **dbtEnvId** | **String**
| **projectName** | **String**
| **fileContent** | **File**

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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
> Object dbtGenerateSyncTml(dbtConnectionIdentifier, fileContent)



  Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**
| **fileContent** | **File**

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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
> Object dbtGenerateTml(dbtConnectionIdentifier, importWorksheets, modelTables, worksheets, fileContent)



  Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**
| **importWorksheets** | **String**
| **modelTables** | **String**
| **worksheets** | **String**
| **fileContent** | **File**

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a id="deleteDbtConnection"></a>
# **deleteDbtConnection**
> deleteDbtConnection(dbtConnectionIdentifier)



  Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**

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

<a id="updateDbtConnection"></a>
# **updateDbtConnection**
> Object updateDbtConnection(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent)



  Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**
| **connectionName** | **String**
| **databaseName** | **String**
| **importType** | **String**
| **accessToken** | **String**
| **dbtUrl** | **String**
| **accountId** | **String**
| **projectId** | **String**
| **dbtEnvId** | **String**
| **projectName** | **String**
| **fileContent** | **File**

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DBT Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

