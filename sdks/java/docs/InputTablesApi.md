# InputTablesApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**createInputTable**](InputTablesApi.md#createInputTable) | **POST** /api/rest/2.0/input-tables/create |
| [**createInputTableColumn**](InputTablesApi.md#createInputTableColumn) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/columns/create |
| [**deleteInputTable**](InputTablesApi.md#deleteInputTable) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/delete |
| [**deleteInputTableColumn**](InputTablesApi.md#deleteInputTableColumn) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/columns/{column_identifier}/delete |
| [**updateInputTable**](InputTablesApi.md#updateInputTable) | **POST** /api/rest/2.0/input-tables/{input_table_identifier}/update |


<a id="createInputTable"></a>
# **createInputTable**
> InputTableResponse createInputTable(createInputTableRequest)



  Version: 26.11.0.cl or later   Creates an input table and links it to a ThoughtSpot model (worksheet). An input table is a user-editable table stored in the model&#39;s external Cloud Data Warehouse (CDW) connection. It lets analysts enter or import data directly from the ThoughtSpot UI without requiring access to the underlying warehouse.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**) privilege is required. The caller must also have &#x60;MODIFY&#x60; permission on the model named by &#x60;model_identifier&#x60;, because the new input table is attached to that model.  #### Usage guidelines  To create an input table, provide the following in the request body:  * **&#x60;table_name&#x60;** — Physical name of the table to create in the external warehouse. Must start with a letter or an underscore and contain only letters, digits, and underscores — no spaces or other punctuation — and be at most 128 characters. * **&#x60;model_identifier&#x60;** — GUID or name of the model (worksheet) to link the input table to. The connection, database, and schema used to create the physical table are derived from this model&#39;s metadata. * **&#x60;table_definition&#x60;** — Describes the table schema:   * &#x60;referenced_columns&#x60; — Names of the columns on the linked model to include as read-only reference columns in the input table, written exactly as they appear on the model. These become the input table&#39;s key columns: they are what the input table is joined to the model on, and what rows are matched on by &#x60;updateInputTable&#x60;. **At least one referenced column is required** — an empty array is rejected. Each name must match exactly one visible model column; a name that matches none, or more than one, is rejected. Each must also resolve to exactly one physical base column, so a formula, cohort, or constant model column cannot be referenced.   * &#x60;new_columns&#x60; — List of new editable columns to create. Each column requires:     * &#x60;name&#x60; — Column display name.     * &#x60;data_type&#x60; — Warehouse data type (for example, &#x60;VARCHAR&#x60;, &#x60;DOUBLE&#x60;, &#x60;DATE&#x60;).     * &#x60;type&#x60; — Semantic role of the column: &#x60;ATTRIBUTE&#x60; for dimension columns or &#x60;MEASURE&#x60; for numeric columns.     * &#x60;allowed_values&#x60; — Optional list of at most 500 permitted values, which turns the column into a fixed-choice column. Every non-empty value later written into it by &#x60;updateInputTable&#x60; must be an exact member of the list, and a write that is not is rejected. Each value must be non-empty, at most 8192 characters, and representable as the column&#39;s &#x60;data_type&#x60;: a number for the numeric types, &#x60;true&#x60; or &#x60;false&#x60; for &#x60;BOOL&#x60;, and an epoch integer for &#x60;DATE&#x60;, &#x60;DATE_TIME&#x60;, and &#x60;TIME&#x60;. Omit it to accept any value the data type supports.   * &#x60;referenced_column_time_dimensions&#x60; — Optional list that locks selected date columns to a specific time dimension (grain) at creation. Each entry has a &#x60;column_identifier&#x60; (the model column name, exactly as given in &#x60;referenced_columns&#x60;) and a &#x60;time_dimension&#x60; grain. Only date columns that need a grain require an entry; omit a column to apply no bucketing (detailed). Accepted &#x60;time_dimension&#x60; values are the calendar grains &#x60;HOURLY&#x60;, &#x60;DAILY&#x60;, &#x60;WEEKLY&#x60;, &#x60;MONTHLY&#x60;, &#x60;QUARTERLY&#x60;, and &#x60;YEARLY&#x60;. A date-part grain (day of week, month of year, and so on) is not accepted: it yields an integer position rather than a date, which cannot be joined back to the model column. Bucket a &#x60;DATE&#x60; or &#x60;DATE_TIME&#x60; column; a grain on a &#x60;TIME&#x60; (time-of-day) column has no meaning and is not supported. &#x60;HOURLY&#x60; needs a &#x60;DATE_TIME&#x60; column — on a plain &#x60;DATE&#x60; column it is ignored and the column stays detailed. This field applies to referenced model columns only; a column created through &#x60;new_columns&#x60; always starts detailed.  **Note**: The physical table is created in the same connection, database, and schema as the linked model. Ensure the connection user has &#x60;CREATE TABLE&#x60; permissions in the target schema.  #### Response  The response returns the new input table&#39;s GUID and the list of its columns, each with its name and unique ID:  * **&#x60;input_table_id&#x60;** — GUID of the newly created input table. Pass it as the &#x60;input_table_identifier&#x60; path parameter of the other input-table operations. * **&#x60;input_columns&#x60;** — Every column on the new table. Each entry has a &#x60;name&#x60;,   an &#x60;id&#x60; (the column&#39;s GUID), and &#x60;mapped_column_id&#x60; (the GUID of the model   column it is mapped from, present only for referenced columns). Use these IDs   to address specific columns in follow-up calls without a separate lookup. * **&#x60;message_info&#x60;** — Note set when a referenced column had to be renamed to   keep the input table&#39;s column names unique: a model column name that occurs   in more than one base table is prefixed with its base table name. Absent when   no column was renamed. The renamed column&#39;s final name is also its &#x60;name&#x60; in   &#x60;input_columns&#x60;, which is what &#x60;updateInputTable&#x60; matches on.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createInputTableRequest** | [**CreateInputTableRequest**](CreateInputTableRequest.md)

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

<a id="createInputTableColumn"></a>
# **createInputTableColumn**
> InputColumnResponse createInputTableColumn(inputTableIdentifier, createInputTableColumnRequest)



  Version: 26.11.0.cl or later   Adds one or more new editable columns to an existing input table. This widens the physical table in the external Cloud Data Warehouse (CDW) (&#x60;ALTER TABLE ... ADD COLUMN&#x60;) and refreshes the input table&#39;s ThoughtSpot metadata so the new columns are exposed on the linked model.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**) privilege is required. The caller must also have &#x60;MODIFY&#x60; permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the &#x60;input_table_identifier&#x60; path parameter and describe the columns to add in the request body:  * **&#x60;column_definition.columns&#x60;** — List of new editable columns to create. Each column requires:   * &#x60;name&#x60; — Column display name. Must not collide with an existing column on the table.   * &#x60;data_type&#x60; — Warehouse data type (for example, &#x60;VARCHAR&#x60;, &#x60;DOUBLE&#x60;, &#x60;DATE&#x60;).   * &#x60;type&#x60; — Semantic role of the column: &#x60;ATTRIBUTE&#x60; for dimension columns or &#x60;MEASURE&#x60; for numeric columns.   * &#x60;allowed_values&#x60; — Optional list of at most 500 permitted values, which turns the column into a fixed-choice column. Every non-empty value later written into it by &#x60;updateInputTable&#x60; must be an exact member of the list, and a write that is not is rejected. Each value must be non-empty, at most 8192 characters, and representable as the column&#39;s &#x60;data_type&#x60;: a number for the numeric types, &#x60;true&#x60; or &#x60;false&#x60; for &#x60;BOOL&#x60;, and an epoch integer for &#x60;DATE&#x60;, &#x60;DATE_TIME&#x60;, and &#x60;TIME&#x60;. Omit it to accept any value the data type supports.  Unlike &#x60;createInputTable&#x60;, there are no referenced (model-projected) columns here — only brand-new columns are added, so a column added this way is never a key column and never carries a time dimension.  **Note**: The response returns the added columns with their generated GUIDs. Use these when targeting a column for deletion via &#x60;deleteInputTableColumn&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **inputTableIdentifier** | **String**
| **createInputTableColumnRequest** | [**CreateInputTableColumnRequest**](CreateInputTableColumnRequest.md)

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

<a id="deleteInputTable"></a>
# **deleteInputTable**
> deleteInputTable(inputTableIdentifier)



  Version: 26.11.0.cl or later   Deletes an input table. This operation unlinks the input table from its owner model, removes it from the connection metadata, and drops the physical table from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in the input table is permanently deleted.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**) privilege is required. The caller must also have &#x60;MODIFY&#x60; permission on the input table object.  #### Usage guidelines  Specify the GUID of the input table to delete as the &#x60;input_table_identifier&#x60; path parameter. The owner model (worksheet) is derived from the input table&#39;s metadata and is used to locate and clean up the associated connection entry.  **Note**: Deleting an input table does not delete the linked model. However, any Answers or Liveboards that reference columns from the deleted input table will lose access to that data and may return errors until the affected visualizations are updated.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **inputTableIdentifier** | **String**

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
| **204** | Successfully deleted the input table and dropped the physical CDW table. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="deleteInputTableColumn"></a>
# **deleteInputTableColumn**
> deleteInputTableColumn(inputTableIdentifier, columnIdentifier)



  Version: 26.11.0.cl or later   Deletes a single editable column from an input table. This removes the column from the input table&#39;s ThoughtSpot metadata and drops the physical column from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in that column is permanently deleted.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**) privilege is required. The caller must also have &#x60;MODIFY&#x60; permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the &#x60;input_table_identifier&#x60; path parameter and the column GUID as the &#x60;column_identifier&#x60; path parameter.  Only columns added directly to the input table (editable, non-referenced columns) may be deleted. The request is rejected if:  * the column is a referenced (model-projected) column, or * the column is still referenced by an existing Answer or Liveboard.  This endpoint has no request body.  **Note on obtaining &#x60;column_identifier&#x60;**: Use the &#x60;id&#x60; field returned for the column by &#x60;createInputTableColumn&#x60; (in &#x60;columns&#x60;) or by &#x60;createInputTable&#x60; (in &#x60;input_columns&#x60;) as the &#x60;column_identifier&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **inputTableIdentifier** | **String**
| **columnIdentifier** | **String**

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
| **204** | Successfully deleted the input table column and dropped the physical CDW column. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

<a id="updateInputTable"></a>
# **updateInputTable**
> InputTableUpdateResponse updateInputTable(inputTableIdentifier, updateInputTableRequest)



  Version: 26.11.0.cl or later   Writes rows into an existing input table. Each call performs a keyed upsert (MERGE): rows are matched against the input table&#39;s existing rows on its key columns — the columns mapped to the linked model (its join-key columns). A matched row is updated in place; a row whose key is not found is inserted.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**) privilege is required. The caller must also have &#x60;MODIFY&#x60; permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the &#x60;input_table_identifier&#x60; path parameter and provide the row data in the request body:  * **&#x60;columns&#x60;** — Ordered list of column names to write. Column names must exactly match the names defined when the input table was created. The payload **must include every key column** (the columns mapped from the linked model), because rows are matched on those columns, and **must also name at least one non-key column** — the key columns identify a row but are never assigned to, so a payload of key columns alone has nothing to write and is rejected. Beyond that you may include any subset of the non-key columns. * **&#x60;rows&#x60;** — List of rows to write. Each row is an array of string values in the same order as &#x60;columns&#x60;, and must contain exactly one value per column. All cell values are passed as strings regardless of the column&#39;s underlying data type. An empty value writes &#x60;NULL&#x60; into that cell.  #### Date values  Pass a &#x60;DATE&#x60; cell as an **ISO calendar date** — &#x60;yyyy-MM-dd&#x60;, for example &#x60;2025-01-01&#x60;. The value is stored exactly as written, with no time-zone conversion.  An epoch number (seconds or milliseconds) is also accepted, but it is resolved in the cluster&#39;s local time zone, so a UTC-midnight epoch can land on the previous day on a cluster west of UTC. Use the ISO form.  The date format is declared once per column, so every row must use the same form for a given column: a &#x60;DATE&#x60; column carrying an ISO date in one row and an epoch number in another is rejected.  The ISO form applies to &#x60;DATE&#x60; columns only. &#x60;DATE_TIME&#x60; and &#x60;TIME&#x60; columns accept an epoch number only, and an ISO value in one of them is rejected.  A date value in neither accepted form for its column — including a calendar-invalid ISO date such as &#x60;2026-02-30&#x60; — is rejected with a validation error.  #### Write semantics  * **Matched rows** (the key already exists): only the non-key columns present in &#x60;columns&#x60; are overwritten. Columns you do not include keep their existing values — this is how you update a subset of columns without disturbing the rest. At least one non-key column must be present for there to be anything to overwrite. * **New rows** (the key does not exist): a new row is inserted. Any non-key column you did not include is set to &#x60;NULL&#x60;. * This is **not** a full-table replace. Rows already in the table whose keys are not present in the payload are left untouched. * The &#x60;rows&#x60; array must contain at least one row; an empty &#x60;rows&#x60; array is rejected.  The request is rejected with a validation error when a column name does not match the table schema, a row&#39;s value count does not match the number of &#x60;columns&#x60;, a required key column is omitted, no non-key column is named, or a value is not compatible with its column&#39;s data type (including a date value in neither accepted form for its column).  #### Response  The response returns &#x60;rows_loaded&#x60; — the number of rows actually written, the sum of rows updated (matched) and rows inserted (new).  &#x60;rows_loaded&#x60; is the count the warehouse itself reports, so it reflects what was written rather than what was submitted. If the warehouse completes the load but reports no count, the call fails with &#x60;500&#x60; rather than returning a count it cannot stand behind. The write is a MERGE keyed on the input table&#39;s key columns, so it is idempotent — retrying the same payload is safe.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **inputTableIdentifier** | **String**
| **updateInputTableRequest** | [**UpdateInputTableRequest**](UpdateInputTableRequest.md)

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

