# ThoughtSpot.RestApi.Sdk.Api.InputTablesApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateInputTable**](InputTablesApi.md#createinputtable) | **POST** /api/rest/2.0/input-tables/create |  |
| [**CreateInputTableColumn**](InputTablesApi.md#createinputtablecolumn) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/columns/create |  |
| [**DeleteInputTable**](InputTablesApi.md#deleteinputtable) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/delete |  |
| [**DeleteInputTableColumn**](InputTablesApi.md#deleteinputtablecolumn) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/columns/{column_identifier}/delete |  |
| [**UpdateInputTable**](InputTablesApi.md#updateinputtable) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/update |  |

<a id="createinputtable"></a>
# **CreateInputTable**
> InputTableResponse CreateInputTable (CreateInputTableRequest createInputTableRequest)



  Version: 26.11.0.cl or later   Creates an input table and links it to a ThoughtSpot model (worksheet). An input table is a user-editable table stored in the model's external Cloud Data Warehouse (CDW) connection. It lets analysts enter or import data directly from the ThoughtSpot UI without requiring access to the underlying warehouse.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the model named by `model_identifier`, because the new input table is attached to that model.  #### Usage guidelines  To create an input table, provide the following in the request body:  * **`table_name`** — Physical name of the table to create in the external warehouse. Must start with a letter or an underscore and contain only letters, digits, and underscores — no spaces or other punctuation — and be at most 128 characters. * **`model_identifier`** — GUID or name of the model (worksheet) to link the input table to. The connection, database, and schema used to create the physical table are derived from this model's metadata. * **`table_definition`** — Describes the table schema:   * `referenced_columns` — Names of the columns on the linked model to include as read-only reference columns in the input table, written exactly as they appear on the model. These become the input table's key columns: they are what the input table is joined to the model on, and what rows are matched on by `updateInputTable`. **At least one referenced column is required** — an empty array is rejected. Each name must match exactly one visible model column; a name that matches none, or more than one, is rejected. Each must also resolve to exactly one physical base column, so a formula, cohort, or constant model column cannot be referenced.   * `new_columns` — List of new editable columns to create. Each column requires:     * `name` — Column display name.     * `data_type` — Warehouse data type (for example, `VARCHAR`, `DOUBLE`, `DATE`).     * `type` — Semantic role of the column: `ATTRIBUTE` for dimension columns or `MEASURE` for numeric columns.     * `allowed_values` — Optional list of at most 500 permitted values, which turns the column into a fixed-choice column. Every non-empty value later written into it by `updateInputTable` must be an exact member of the list, and a write that is not is rejected. Each value must be non-empty, at most 8192 characters, and representable as the column's `data_type`: a number for the numeric types, `true` or `false` for `BOOL`, and an epoch integer for `DATE`, `DATE_TIME`, and `TIME`. Omit it to accept any value the data type supports.   * `referenced_column_time_dimensions` — Optional list that locks selected date columns to a specific time dimension (grain) at creation. Each entry has a `column_identifier` (the model column name, exactly as given in `referenced_columns`) and a `time_dimension` grain. Only date columns that need a grain require an entry; omit a column to apply no bucketing (detailed). Accepted `time_dimension` values are the calendar grains `HOURLY`, `DAILY`, `WEEKLY`, `MONTHLY`, `QUARTERLY`, and `YEARLY`. A date-part grain (day of week, month of year, and so on) is not accepted: it yields an integer position rather than a date, which cannot be joined back to the model column. Bucket a `DATE` or `DATE_TIME` column; a grain on a `TIME` (time-of-day) column has no meaning and is not supported. `HOURLY` needs a `DATE_TIME` column — on a plain `DATE` column it is ignored and the column stays detailed. This field applies to referenced model columns only; a column created through `new_columns` always starts detailed.  **Note**: The physical table is created in the same connection, database, and schema as the linked model. Ensure the connection user has `CREATE TABLE` permissions in the target schema.  #### Response  The response returns the new input table's GUID and the list of its columns, each with its name and unique ID:  * **`input_table_id`** — GUID of the newly created input table. Pass it as the `input_table_identifier` path parameter of the other input-table operations. * **`input_columns`** — Every column on the new table. Each entry has a `name`,   an `id` (the column's GUID), and `mapped_column_id` (the GUID of the model   column it is mapped from, present only for referenced columns). Use these IDs   to address specific columns in follow-up calls without a separate lookup. * **`message_info`** — Note set when a referenced column had to be renamed to   keep the input table's column names unique: a model column name that occurs   in more than one base table is prefixed with its base table name. Absent when   no column was renamed. The renamed column's final name is also its `name` in   `input_columns`, which is what `updateInputTable` matches on.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateInputTableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new InputTablesApi(httpClient, config, httpClientHandler);
            var createInputTableRequest = new CreateInputTableRequest(); // CreateInputTableRequest | 

            try
            {
                InputTableResponse result = apiInstance.CreateInputTable(createInputTableRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling InputTablesApi.CreateInputTable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateInputTableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InputTableResponse> response = apiInstance.CreateInputTableWithHttpInfo(createInputTableRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InputTablesApi.CreateInputTableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createInputTableRequest** | [**CreateInputTableRequest**](CreateInputTableRequest.md) |  |  |

### Return type

[**InputTableResponse**](InputTableResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Input table created successfully. |  -  |
| **400** | Bad request — invalid payload, no columns selected, or upload disabled on the connection. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden — caller does not have MODIFY permission on the model. |  -  |
| **404** | Model not found. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createinputtablecolumn"></a>
# **CreateInputTableColumn**
> InputColumnResponse CreateInputTableColumn (string inputTableIdentifier, CreateInputTableColumnRequest createInputTableColumnRequest)



  Version: 26.11.0.cl or later   Adds one or more new editable columns to an existing input table. This widens the physical table in the external Cloud Data Warehouse (CDW) (`ALTER TABLE ... ADD COLUMN`) and refreshes the input table's ThoughtSpot metadata so the new columns are exposed on the linked model.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and describe the columns to add in the request body:  * **`column_definition.columns`** — List of new editable columns to create. Each column requires:   * `name` — Column display name. Must not collide with an existing column on the table.   * `data_type` — Warehouse data type (for example, `VARCHAR`, `DOUBLE`, `DATE`).   * `type` — Semantic role of the column: `ATTRIBUTE` for dimension columns or `MEASURE` for numeric columns.   * `allowed_values` — Optional list of at most 500 permitted values, which turns the column into a fixed-choice column. Every non-empty value later written into it by `updateInputTable` must be an exact member of the list, and a write that is not is rejected. Each value must be non-empty, at most 8192 characters, and representable as the column's `data_type`: a number for the numeric types, `true` or `false` for `BOOL`, and an epoch integer for `DATE`, `DATE_TIME`, and `TIME`. Omit it to accept any value the data type supports.  Unlike `createInputTable`, there are no referenced (model-projected) columns here — only brand-new columns are added, so a column added this way is never a key column and never carries a time dimension.  **Note**: The response returns the added columns with their generated GUIDs. Use these when targeting a column for deletion via `deleteInputTableColumn`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateInputTableColumnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new InputTablesApi(httpClient, config, httpClientHandler);
            var inputTableIdentifier = "inputTableIdentifier_example";  // string | Unique ID of the input table to add columns to.
            var createInputTableColumnRequest = new CreateInputTableColumnRequest(); // CreateInputTableColumnRequest | 

            try
            {
                InputColumnResponse result = apiInstance.CreateInputTableColumn(inputTableIdentifier, createInputTableColumnRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling InputTablesApi.CreateInputTableColumn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateInputTableColumnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InputColumnResponse> response = apiInstance.CreateInputTableColumnWithHttpInfo(inputTableIdentifier, createInputTableColumnRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InputTablesApi.CreateInputTableColumnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inputTableIdentifier** | **string** | Unique ID of the input table to add columns to. |  |
| **createInputTableColumnRequest** | [**CreateInputTableColumnRequest**](CreateInputTableColumnRequest.md) |  |  |

### Return type

[**InputColumnResponse**](InputColumnResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Columns added successfully. |  -  |
| **400** | Bad request — invalid payload or no columns supplied. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden — caller does not have MODIFY permission on the input table. |  -  |
| **404** | Input table not found. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteinputtable"></a>
# **DeleteInputTable**
> void DeleteInputTable (string inputTableIdentifier)



  Version: 26.11.0.cl or later   Deletes an input table. This operation unlinks the input table from its owner model, removes it from the connection metadata, and drops the physical table from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in the input table is permanently deleted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the GUID of the input table to delete as the `input_table_identifier` path parameter. The owner model (worksheet) is derived from the input table's metadata and is used to locate and clean up the associated connection entry.  **Note**: Deleting an input table does not delete the linked model. However, any Answers or Liveboards that reference columns from the deleted input table will lose access to that data and may return errors until the affected visualizations are updated.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteInputTableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new InputTablesApi(httpClient, config, httpClientHandler);
            var inputTableIdentifier = "inputTableIdentifier_example";  // string | Unique ID of the input table to delete.

            try
            {
                apiInstance.DeleteInputTable(inputTableIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling InputTablesApi.DeleteInputTable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteInputTableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteInputTableWithHttpInfo(inputTableIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InputTablesApi.DeleteInputTableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inputTableIdentifier** | **string** | Unique ID of the input table to delete. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted the input table and dropped the physical CDW table. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteinputtablecolumn"></a>
# **DeleteInputTableColumn**
> void DeleteInputTableColumn (string inputTableIdentifier, string columnIdentifier)



  Version: 26.11.0.cl or later   Deletes a single editable column from an input table. This removes the column from the input table's ThoughtSpot metadata and drops the physical column from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in that column is permanently deleted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and the column GUID as the `column_identifier` path parameter.  Only columns added directly to the input table (editable, non-referenced columns) may be deleted. The request is rejected if:  * the column is a referenced (model-projected) column, or * the column is still referenced by an existing Answer or Liveboard.  This endpoint has no request body.  **Note on obtaining `column_identifier`**: Use the `id` field returned for the column by `createInputTableColumn` (in `columns`) or by `createInputTable` (in `input_columns`) as the `column_identifier`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteInputTableColumnExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new InputTablesApi(httpClient, config, httpClientHandler);
            var inputTableIdentifier = "inputTableIdentifier_example";  // string | Unique ID of the input table that owns the column.
            var columnIdentifier = "columnIdentifier_example";  // string | Unique ID of the column to delete.

            try
            {
                apiInstance.DeleteInputTableColumn(inputTableIdentifier, columnIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling InputTablesApi.DeleteInputTableColumn: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteInputTableColumnWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteInputTableColumnWithHttpInfo(inputTableIdentifier, columnIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InputTablesApi.DeleteInputTableColumnWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inputTableIdentifier** | **string** | Unique ID of the input table that owns the column. |  |
| **columnIdentifier** | **string** | Unique ID of the column to delete. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted the input table column and dropped the physical CDW column. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateinputtable"></a>
# **UpdateInputTable**
> InputTableUpdateResponse UpdateInputTable (string inputTableIdentifier, UpdateInputTableRequest updateInputTableRequest)



  Version: 26.11.0.cl or later   Writes rows into an existing input table. Each call performs a keyed upsert (MERGE): rows are matched against the input table's existing rows on its key columns — the columns mapped to the linked model (its join-key columns). A matched row is updated in place; a row whose key is not found is inserted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and provide the row data in the request body:  * **`columns`** — Ordered list of column names to write. Column names must exactly match the names defined when the input table was created. The payload **must include every key column** (the columns mapped from the linked model), because rows are matched on those columns, and **must also name at least one non-key column** — the key columns identify a row but are never assigned to, so a payload of key columns alone has nothing to write and is rejected. Beyond that you may include any subset of the non-key columns. * **`rows`** — List of rows to write. Each row is an array of string values in the same order as `columns`, and must contain exactly one value per column. All cell values are passed as strings regardless of the column's underlying data type. An empty value writes `NULL` into that cell.  #### Date values  Pass a `DATE` cell as an **ISO calendar date** — `yyyy-MM-dd`, for example `2025-01-01`. The value is stored exactly as written, with no time-zone conversion.  An epoch number (seconds or milliseconds) is also accepted, but it is resolved in the cluster's local time zone, so a UTC-midnight epoch can land on the previous day on a cluster west of UTC. Use the ISO form.  The date format is declared once per column, so every row must use the same form for a given column: a `DATE` column carrying an ISO date in one row and an epoch number in another is rejected.  The ISO form applies to `DATE` columns only. `DATE_TIME` and `TIME` columns accept an epoch number only, and an ISO value in one of them is rejected.  A date value in neither accepted form for its column — including a calendar-invalid ISO date such as `2026-02-30` — is rejected with a validation error.  #### Write semantics  * **Matched rows** (the key already exists): only the non-key columns present in `columns` are overwritten. Columns you do not include keep their existing values — this is how you update a subset of columns without disturbing the rest. At least one non-key column must be present for there to be anything to overwrite. * **New rows** (the key does not exist): a new row is inserted. Any non-key column you did not include is set to `NULL`. * This is **not** a full-table replace. Rows already in the table whose keys are not present in the payload are left untouched. * The `rows` array must contain at least one row; an empty `rows` array is rejected.  The request is rejected with a validation error when a column name does not match the table schema, a row's value count does not match the number of `columns`, a required key column is omitted, no non-key column is named, or a value is not compatible with its column's data type (including a date value in neither accepted form for its column).  #### Response  The response returns `rows_loaded` — the number of rows actually written, the sum of rows updated (matched) and rows inserted (new).  `rows_loaded` is the count the warehouse itself reports, so it reflects what was written rather than what was submitted. If the warehouse completes the load but reports no count, the call fails with `500` rather than returning a count it cannot stand behind. The write is a MERGE keyed on the input table's key columns, so it is idempotent — retrying the same payload is safe.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateInputTableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new InputTablesApi(httpClient, config, httpClientHandler);
            var inputTableIdentifier = "inputTableIdentifier_example";  // string | Unique ID of the input table to update.
            var updateInputTableRequest = new UpdateInputTableRequest(); // UpdateInputTableRequest | 

            try
            {
                InputTableUpdateResponse result = apiInstance.UpdateInputTable(inputTableIdentifier, updateInputTableRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling InputTablesApi.UpdateInputTable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateInputTableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InputTableUpdateResponse> response = apiInstance.UpdateInputTableWithHttpInfo(inputTableIdentifier, updateInputTableRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InputTablesApi.UpdateInputTableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **inputTableIdentifier** | **string** | Unique ID of the input table to update. |  |
| **updateInputTableRequest** | [**UpdateInputTableRequest**](UpdateInputTableRequest.md) |  |  |

### Return type

[**InputTableUpdateResponse**](InputTableUpdateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rows loaded successfully. |  -  |
| **400** | Malformed request or unknown column name. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden — caller does not have MODIFY permission on the input table. |  -  |
| **404** | Input table not found. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

