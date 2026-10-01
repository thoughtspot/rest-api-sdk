// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { CreateInputTableColumnRequest } from '../models/CreateInputTableColumnRequest';
import { CreateInputTableRequest } from '../models/CreateInputTableRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { InputColumnResponse } from '../models/InputColumnResponse';
import { InputTableResponse } from '../models/InputTableResponse';
import { InputTableUpdateResponse } from '../models/InputTableUpdateResponse';
import { UpdateInputTableRequest } from '../models/UpdateInputTableRequest';

/**
 * no description
 */
export class InputTablesApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 26.11.0.cl or later   Creates an input table and links it to a ThoughtSpot model (worksheet). An input table is a user-editable table stored in the model\'s external Cloud Data Warehouse (CDW) connection. It lets analysts enter or import data directly from the ThoughtSpot UI without requiring access to the underlying warehouse.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the model named by `model_identifier`, because the new input table is attached to that model.  #### Usage guidelines  To create an input table, provide the following in the request body:  * **`table_name`** — Physical name of the table to create in the external warehouse. Must start with a letter or an underscore and contain only letters, digits, and underscores — no spaces or other punctuation — and be at most 128 characters. * **`model_identifier`** — GUID or name of the model (worksheet) to link the input table to. The connection, database, and schema used to create the physical table are derived from this model\'s metadata. * **`table_definition`** — Describes the table schema:   * `referenced_columns` — Names of the columns on the linked model to include as read-only reference columns in the input table, written exactly as they appear on the model. These become the input table\'s key columns: they are what the input table is joined to the model on, and what rows are matched on by `updateInputTable`. **At least one referenced column is required** — an empty array is rejected. Each name must match exactly one visible model column; a name that matches none, or more than one, is rejected. Each must also resolve to exactly one physical base column, so a formula, cohort, or constant model column cannot be referenced.   * `new_columns` — List of new editable columns to create. Each column requires:     * `name` — Column display name.     * `data_type` — Warehouse data type (for example, `VARCHAR`, `DOUBLE`, `DATE`).     * `type` — Semantic role of the column: `ATTRIBUTE` for dimension columns or `MEASURE` for numeric columns.     * `allowed_values` — Optional list of at most 500 permitted values, which turns the column into a fixed-choice column. Every non-empty value later written into it by `updateInputTable` must be an exact member of the list, and a write that is not is rejected. Each value must be non-empty, at most 8192 characters, and representable as the column\'s `data_type`: a number for the numeric types, `true` or `false` for `BOOL`, and an epoch integer for `DATE`, `DATE_TIME`, and `TIME`. Omit it to accept any value the data type supports.   * `referenced_column_time_dimensions` — Optional list that locks selected date columns to a specific time dimension (grain) at creation. Each entry has a `column_identifier` (the model column name, exactly as given in `referenced_columns`) and a `time_dimension` grain. Only date columns that need a grain require an entry; omit a column to apply no bucketing (detailed). Accepted `time_dimension` values are the calendar grains `HOURLY`, `DAILY`, `WEEKLY`, `MONTHLY`, `QUARTERLY`, and `YEARLY`. A date-part grain (day of week, month of year, and so on) is not accepted: it yields an integer position rather than a date, which cannot be joined back to the model column. Bucket a `DATE` or `DATE_TIME` column; a grain on a `TIME` (time-of-day) column has no meaning and is not supported. `HOURLY` needs a `DATE_TIME` column — on a plain `DATE` column it is ignored and the column stays detailed. This field applies to referenced model columns only; a column created through `new_columns` always starts detailed.  **Note**: The physical table is created in the same connection, database, and schema as the linked model. Ensure the connection user has `CREATE TABLE` permissions in the target schema.  #### Response  The response returns the new input table\'s GUID and the list of its columns, each with its name and unique ID:  * **`input_table_id`** — GUID of the newly created input table. Pass it as the `input_table_identifier` path parameter of the other input-table operations. * **`input_columns`** — Every column on the new table. Each entry has a `name`,   an `id` (the column\'s GUID), and `mapped_column_id` (the GUID of the model   column it is mapped from, present only for referenced columns). Use these IDs   to address specific columns in follow-up calls without a separate lookup. * **`message_info`** — Note set when a referenced column had to be renamed to   keep the input table\'s column names unique: a model column name that occurs   in more than one base table is prefixed with its base table name. Absent when   no column was renamed. The renamed column\'s final name is also its `name` in   `input_columns`, which is what `updateInputTable` matches on.      
     * @param createInputTableRequest 
     */
    public async createInputTable(createInputTableRequest: CreateInputTableRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createInputTableRequest' is not null or undefined
        if (createInputTableRequest === null || createInputTableRequest === undefined) {
            throw new RequiredError("InputTablesApi", "createInputTable", "createInputTableRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/input-tables/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.30.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.30.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createInputTableRequest, "CreateInputTableRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.11.0.cl or later   Adds one or more new editable columns to an existing input table. This widens the physical table in the external Cloud Data Warehouse (CDW) (`ALTER TABLE ... ADD COLUMN`) and refreshes the input table\'s ThoughtSpot metadata so the new columns are exposed on the linked model.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and describe the columns to add in the request body:  * **`column_definition.columns`** — List of new editable columns to create. Each column requires:   * `name` — Column display name. Must not collide with an existing column on the table.   * `data_type` — Warehouse data type (for example, `VARCHAR`, `DOUBLE`, `DATE`).   * `type` — Semantic role of the column: `ATTRIBUTE` for dimension columns or `MEASURE` for numeric columns.   * `allowed_values` — Optional list of at most 500 permitted values, which turns the column into a fixed-choice column. Every non-empty value later written into it by `updateInputTable` must be an exact member of the list, and a write that is not is rejected. Each value must be non-empty, at most 8192 characters, and representable as the column\'s `data_type`: a number for the numeric types, `true` or `false` for `BOOL`, and an epoch integer for `DATE`, `DATE_TIME`, and `TIME`. Omit it to accept any value the data type supports.  Unlike `createInputTable`, there are no referenced (model-projected) columns here — only brand-new columns are added, so a column added this way is never a key column and never carries a time dimension.  **Note**: The response returns the added columns with their generated GUIDs. Use these when targeting a column for deletion via `deleteInputTableColumn`.      
     * @param inputTableIdentifier Unique ID of the input table to add columns to.
     * @param createInputTableColumnRequest 
     */
    public async createInputTableColumn(inputTableIdentifier: string, createInputTableColumnRequest: CreateInputTableColumnRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'inputTableIdentifier' is not null or undefined
        if (inputTableIdentifier === null || inputTableIdentifier === undefined) {
            throw new RequiredError("InputTablesApi", "createInputTableColumn", "inputTableIdentifier");
        }


        // verify required parameter 'createInputTableColumnRequest' is not null or undefined
        if (createInputTableColumnRequest === null || createInputTableColumnRequest === undefined) {
            throw new RequiredError("InputTablesApi", "createInputTableColumn", "createInputTableColumnRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/input-tables/{input_table_identifier}/columns/create'
            .replace('{input_table_identifier}', encodeURIComponent(String(inputTableIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.30.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.30.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createInputTableColumnRequest, "CreateInputTableColumnRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.11.0.cl or later   Deletes an input table. This operation unlinks the input table from its owner model, removes it from the connection metadata, and drops the physical table from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in the input table is permanently deleted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the GUID of the input table to delete as the `input_table_identifier` path parameter. The owner model (worksheet) is derived from the input table\'s metadata and is used to locate and clean up the associated connection entry.  **Note**: Deleting an input table does not delete the linked model. However, any Answers or Liveboards that reference columns from the deleted input table will lose access to that data and may return errors until the affected visualizations are updated.      
     * @param inputTableIdentifier Unique ID of the input table to delete.
     */
    public async deleteInputTable(inputTableIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'inputTableIdentifier' is not null or undefined
        if (inputTableIdentifier === null || inputTableIdentifier === undefined) {
            throw new RequiredError("InputTablesApi", "deleteInputTable", "inputTableIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/input-tables/{input_table_identifier}/delete'
            .replace('{input_table_identifier}', encodeURIComponent(String(inputTableIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.30.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.30.0")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.11.0.cl or later   Deletes a single editable column from an input table. This removes the column from the input table\'s ThoughtSpot metadata and drops the physical column from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in that column is permanently deleted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and the column GUID as the `column_identifier` path parameter.  Only columns added directly to the input table (editable, non-referenced columns) may be deleted. The request is rejected if:  * the column is a referenced (model-projected) column, or * the column is still referenced by an existing Answer or Liveboard.  This endpoint has no request body.  **Note on obtaining `column_identifier`**: Use the `id` field returned for the column by `createInputTableColumn` (in `columns`) or by `createInputTable` (in `input_columns`) as the `column_identifier`.      
     * @param inputTableIdentifier Unique ID of the input table that owns the column.
     * @param columnIdentifier Unique ID of the column to delete.
     */
    public async deleteInputTableColumn(inputTableIdentifier: string, columnIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'inputTableIdentifier' is not null or undefined
        if (inputTableIdentifier === null || inputTableIdentifier === undefined) {
            throw new RequiredError("InputTablesApi", "deleteInputTableColumn", "inputTableIdentifier");
        }


        // verify required parameter 'columnIdentifier' is not null or undefined
        if (columnIdentifier === null || columnIdentifier === undefined) {
            throw new RequiredError("InputTablesApi", "deleteInputTableColumn", "columnIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/input-tables/{input_table_identifier}/columns/{column_identifier}/delete'
            .replace('{input_table_identifier}', encodeURIComponent(String(inputTableIdentifier)))
            .replace('{column_identifier}', encodeURIComponent(String(columnIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.30.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.30.0")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.11.0.cl or later   Writes rows into an existing input table. Each call performs a keyed upsert (MERGE): rows are matched against the input table\'s existing rows on its key columns — the columns mapped to the linked model (its join-key columns). A matched row is updated in place; a row whose key is not found is inserted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and provide the row data in the request body:  * **`columns`** — Ordered list of column names to write. Column names must exactly match the names defined when the input table was created. The payload **must include every key column** (the columns mapped from the linked model), because rows are matched on those columns, and **must also name at least one non-key column** — the key columns identify a row but are never assigned to, so a payload of key columns alone has nothing to write and is rejected. Beyond that you may include any subset of the non-key columns. * **`rows`** — List of rows to write. Each row is an array of string values in the same order as `columns`, and must contain exactly one value per column. All cell values are passed as strings regardless of the column\'s underlying data type. An empty value writes `NULL` into that cell.  #### Date values  Pass a `DATE` cell as an **ISO calendar date** — `yyyy-MM-dd`, for example `2025-01-01`. The value is stored exactly as written, with no time-zone conversion.  An epoch number (seconds or milliseconds) is also accepted, but it is resolved in the cluster\'s local time zone, so a UTC-midnight epoch can land on the previous day on a cluster west of UTC. Use the ISO form.  The date format is declared once per column, so every row must use the same form for a given column: a `DATE` column carrying an ISO date in one row and an epoch number in another is rejected.  The ISO form applies to `DATE` columns only. `DATE_TIME` and `TIME` columns accept an epoch number only, and an ISO value in one of them is rejected.  A date value in neither accepted form for its column — including a calendar-invalid ISO date such as `2026-02-30` — is rejected with a validation error.  #### Write semantics  * **Matched rows** (the key already exists): only the non-key columns present in `columns` are overwritten. Columns you do not include keep their existing values — this is how you update a subset of columns without disturbing the rest. At least one non-key column must be present for there to be anything to overwrite. * **New rows** (the key does not exist): a new row is inserted. Any non-key column you did not include is set to `NULL`. * This is **not** a full-table replace. Rows already in the table whose keys are not present in the payload are left untouched. * The `rows` array must contain at least one row; an empty `rows` array is rejected.  The request is rejected with a validation error when a column name does not match the table schema, a row\'s value count does not match the number of `columns`, a required key column is omitted, no non-key column is named, or a value is not compatible with its column\'s data type (including a date value in neither accepted form for its column).  #### Response  The response returns `rows_loaded` — the number of rows actually written, the sum of rows updated (matched) and rows inserted (new).  `rows_loaded` is the count the warehouse itself reports, so it reflects what was written rather than what was submitted. If the warehouse completes the load but reports no count, the call fails with `500` rather than returning a count it cannot stand behind. The write is a MERGE keyed on the input table\'s key columns, so it is idempotent — retrying the same payload is safe.      
     * @param inputTableIdentifier Unique ID of the input table to update.
     * @param updateInputTableRequest 
     */
    public async updateInputTable(inputTableIdentifier: string, updateInputTableRequest: UpdateInputTableRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'inputTableIdentifier' is not null or undefined
        if (inputTableIdentifier === null || inputTableIdentifier === undefined) {
            throw new RequiredError("InputTablesApi", "updateInputTable", "inputTableIdentifier");
        }


        // verify required parameter 'updateInputTableRequest' is not null or undefined
        if (updateInputTableRequest === null || updateInputTableRequest === undefined) {
            throw new RequiredError("InputTablesApi", "updateInputTable", "updateInputTableRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/input-tables/{input_table_identifier}/update'
            .replace('{input_table_identifier}', encodeURIComponent(String(inputTableIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.30.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.30.0")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateInputTableRequest, "UpdateInputTableRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class InputTablesApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createInputTable
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createInputTableWithHttpInfo(response: ResponseContext): Promise<HttpInfo<InputTableResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: InputTableResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InputTableResponse", ""
            ) as InputTableResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Bad request — invalid payload, no columns selected, or upload disabled on the connection.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden — caller does not have MODIFY permission on the model.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Model not found.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: InputTableResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InputTableResponse", ""
            ) as InputTableResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createInputTableColumn
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createInputTableColumnWithHttpInfo(response: ResponseContext): Promise<HttpInfo<InputColumnResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: InputColumnResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InputColumnResponse", ""
            ) as InputColumnResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Bad request — invalid payload or no columns supplied.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden — caller does not have MODIFY permission on the input table.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Input table not found.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: InputColumnResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InputColumnResponse", ""
            ) as InputColumnResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteInputTable
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteInputTableWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteInputTableColumn
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteInputTableColumnWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Operation failed", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateInputTable
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateInputTableWithHttpInfo(response: ResponseContext): Promise<HttpInfo<InputTableUpdateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: InputTableUpdateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InputTableUpdateResponse", ""
            ) as InputTableUpdateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Malformed request or unknown column name.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden — caller does not have MODIFY permission on the input table.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Input table not found.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: InputTableUpdateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InputTableUpdateResponse", ""
            ) as InputTableUpdateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
