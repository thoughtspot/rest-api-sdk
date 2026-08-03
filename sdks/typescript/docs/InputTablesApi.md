# ThoughtSpotRestApiSdk.InputTablesApi

All URIs are relative to *CLUSTER_URL*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInputTable**](InputTablesApi.md#createInputTable) | **POST** /api/rest/2.0/input-tables/create | 
[**deleteInputTable**](InputTablesApi.md#deleteInputTable) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/delete | 
[**updateInputTable**](InputTablesApi.md#updateInputTable) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/update | 


# **createInputTable**
> InputTableResponse createInputTable(createInputTableRequest)

  Version: 26.8.0.cl or later   Creates an input table and links it to a ThoughtSpot model (worksheet). An input table is a user-editable table stored in the model\'s external Cloud Data Warehouse (CDW) connection. It lets analysts enter or import data directly from the ThoughtSpot UI without requiring access to the underlying warehouse.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required.  #### Usage guidelines  To create an input table, provide the following in the request body:  * **`table_name`** — Physical name of the table to create in the external warehouse. * **`model_identifier`** — GUID or name of the model (worksheet) to link the input table to. The connection, database, and schema used to create the physical table are derived from this model\'s metadata. * **`table_definition`** — Describes the table schema:   * `referenced_columns` — List of column GUIDs from the linked model to include as read-only reference columns in the input table. These columns anchor the input data to existing model dimensions.   * `new_columns` — List of new editable columns to create. Each column requires:     * `name` — Column display name.     * `data_type` — Warehouse data type (for example, `VARCHAR`, `DOUBLE`, `DATE`).     * `type` — Semantic role of the column: `ATTRIBUTE` for dimension columns or `MEASURE` for numeric columns.  **Note**: The physical table is created in the same connection, database, and schema as the linked model. Ensure the connection user has `CREATE TABLE` permissions in the target schema.  #### Examples  Create an input table with one referenced model column and one new editable measure column:  ```json {   \"table_name\": \"Sales Region Targets\",   \"model_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",   \"table_definition\": {     \"referenced_columns\": [\"c7d8e9f0-1234-5678-abcd-ef0987654321\"],     \"new_columns\": [       {         \"name\": \"target_revenue\",         \"data_type\": \"DOUBLE\",         \"type\": \"MEASURE\"       }     ]   } } ```  Create an input table with multiple new editable columns and no referenced columns:  ```json {   \"table_name\": \"Budget Adjustments\",   \"model_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",   \"table_definition\": {     \"referenced_columns\": [],     \"new_columns\": [       {         \"name\": \"region\",         \"data_type\": \"VARCHAR\",         \"type\": \"ATTRIBUTE\"       },       {         \"name\": \"adjustment_amount\",         \"data_type\": \"DOUBLE\",         \"type\": \"MEASURE\"       },       {         \"name\": \"effective_date\",         \"data_type\": \"DATE\",         \"type\": \"ATTRIBUTE\"       }     ]   } } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, InputTablesApi, CreateInputTableRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new InputTablesApi(configuration);

apiInstance.createInputTable(
  // CreateInputTableRequest
  {
    table_name: "table_name_example",
    model_identifier: "model_identifier_example",
    table_definition: null,
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInputTableRequest** | **CreateInputTableRequest**|  |


### Return type

**InputTableResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Input table created successfully. |  -  |
**400** | Bad request — invalid payload, no columns selected, or upload disabled on the connection. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden — caller does not have MODIFY permission on the model. |  -  |
**404** | Model not found. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteInputTable**
> void deleteInputTable()

  Version: 26.8.0.cl or later   Deletes an input table. This operation unlinks the input table from its owner model, removes it from the connection metadata, and drops the physical table from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in the input table is permanently deleted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required.  #### Usage guidelines  Specify the GUID of the input table to delete as the `input_table_identifier` path parameter. The owner model (worksheet) is derived from the input table\'s metadata and is used to locate and clean up the associated connection entry.  **Note**: Deleting an input table does not delete the linked model. However, any Answers or Liveboards that reference columns from the deleted input table will lose access to that data and may return errors until the affected visualizations are updated.  #### Example  Pass the input table GUID as a path parameter. This endpoint has no request body.  ``` DELETE /api/rest/2.0/input-tables/a1b2c3d4-e5f6-7890-abcd-ef1234567890/delete ```      

### Example


```typescript
import { createBearerAuthenticationConfig, InputTablesApi, DeleteInputTableRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new InputTablesApi(configuration);

apiInstance.deleteInputTable(
  // string | Unique ID of the input table to delete.
  "input_table_identifier_example" 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputTableIdentifier** | [**string**] | Unique ID of the input table to delete. | defaults to undefined


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
**204** | Successfully deleted the input table and dropped the physical CDW table. |  -  |
**400** | Operation failed |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden access. |  -  |
**500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateInputTable**
> InputTableUpdateResponse updateInputTable(updateInputTableRequest)

  Version: 26.8.0.cl or later   Writes rows of data into an existing input table. The supplied rows replace the current contents of the table: each call serializes the provided values to CSV and loads them into the input table via DataManager, overwriting any previously stored rows.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and provide the row data in the request body:  * **`columns`** — Ordered list of column names to write. Column names must exactly match the names defined when the input table was created. Only the listed columns are written; unlisted columns retain their existing values. * **`rows`** — List of rows to load. Each row is an array of string values in the same order as `columns`. All cell values must be passed as strings regardless of the column\'s underlying data type.  **Note**: Each call fully replaces the previously loaded rows. To clear the table, send an empty `rows` array. Partial updates to individual rows are not supported; re-submit all rows on every write.  #### Examples  Write two rows to an input table. Pass the input table GUID as the `input_table_identifier` path parameter:  ``` POST /api/rest/2.0/input-tables/{input_table_identifier}/update ```  ```json {   \"columns\": [\"region\", \"target_revenue\", \"effective_date\"],   \"rows\": [     [\"West\", \"1500000\", \"2025-01-01\"],     [\"East\", \"2000000\", \"2025-01-01\"]   ] } ```  The response returns the number of rows written:  ```json { \"rows_loaded\": 2 } ```  Clear all rows from an input table:  ```json {   \"columns\": [\"region\", \"target_revenue\"],   \"rows\": [] } ```      

### Example


```typescript
import { createBearerAuthenticationConfig, InputTablesApi, UpdateInputTableRequest } from '@thoughtspot/rest-api-sdk';

const configuration = createBearerAuthenticationConfig("CLUSTER_SERVER_URL", {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
});
const apiInstance = new InputTablesApi(configuration);

apiInstance.updateInputTable(
  // string | Unique ID of the input table to update.
  "input_table_identifier_example" , 
  // UpdateInputTableRequest
  {
    columns: [
      "columns_example",
    ],
    rows: [
      [
        "string_example",
      ],
    ],
  } 
).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));


```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateInputTableRequest** | **UpdateInputTableRequest**|  |
 **inputTableIdentifier** | [**string**] | Unique ID of the input table to update. | defaults to undefined


### Return type

**InputTableUpdateResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rows loaded successfully. |  -  |
**400** | Malformed request or unknown column name. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden — caller does not have MODIFY permission on the input table. |  -  |
**404** | Input table not found. |  -  |
**500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

