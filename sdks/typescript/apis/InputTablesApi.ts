// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { CreateInputTableRequest } from '../models/CreateInputTableRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { InputTableResponse } from '../models/InputTableResponse';
import { InputTableUpdateResponse } from '../models/InputTableUpdateResponse';
import { UpdateInputTableRequest } from '../models/UpdateInputTableRequest';

/**
 * no description
 */
export class InputTablesApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 26.8.0.cl or later   Creates an input table and links it to a ThoughtSpot model (worksheet). An input table is a user-editable table stored in the model\'s external Cloud Data Warehouse (CDW) connection. It lets analysts enter or import data directly from the ThoughtSpot UI without requiring access to the underlying warehouse.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required.  #### Usage guidelines  To create an input table, provide the following in the request body:  * **`table_name`** — Physical name of the table to create in the external warehouse. * **`model_identifier`** — GUID or name of the model (worksheet) to link the input table to. The connection, database, and schema used to create the physical table are derived from this model\'s metadata. * **`table_definition`** — Describes the table schema:   * `referenced_columns` — List of column GUIDs from the linked model to include as read-only reference columns in the input table. These columns anchor the input data to existing model dimensions.   * `new_columns` — List of new editable columns to create. Each column requires:     * `name` — Column display name.     * `data_type` — Warehouse data type (for example, `VARCHAR`, `DOUBLE`, `DATE`).     * `type` — Semantic role of the column: `ATTRIBUTE` for dimension columns or `MEASURE` for numeric columns.  **Note**: The physical table is created in the same connection, database, and schema as the linked model. Ensure the connection user has `CREATE TABLE` permissions in the target schema.  #### Examples  Create an input table with one referenced model column and one new editable measure column:  ```json {   \"table_name\": \"Sales Region Targets\",   \"model_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",   \"table_definition\": {     \"referenced_columns\": [\"c7d8e9f0-1234-5678-abcd-ef0987654321\"],     \"new_columns\": [       {         \"name\": \"target_revenue\",         \"data_type\": \"DOUBLE\",         \"type\": \"MEASURE\"       }     ]   } } ```  Create an input table with multiple new editable columns and no referenced columns:  ```json {   \"table_name\": \"Budget Adjustments\",   \"model_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",   \"table_definition\": {     \"referenced_columns\": [],     \"new_columns\": [       {         \"name\": \"region\",         \"data_type\": \"VARCHAR\",         \"type\": \"ATTRIBUTE\"       },       {         \"name\": \"adjustment_amount\",         \"data_type\": \"DOUBLE\",         \"type\": \"MEASURE\"       },       {         \"name\": \"effective_date\",         \"data_type\": \"DATE\",         \"type\": \"ATTRIBUTE\"       }     ]   } } ```      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")


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
     *   Version: 26.8.0.cl or later   Deletes an input table. This operation unlinks the input table from its owner model, removes it from the connection metadata, and drops the physical table from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in the input table is permanently deleted.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required.  #### Usage guidelines  Specify the GUID of the input table to delete as the `input_table_identifier` path parameter. The owner model (worksheet) is derived from the input table\'s metadata and is used to locate and clean up the associated connection entry.  **Note**: Deleting an input table does not delete the linked model. However, any Answers or Liveboards that reference columns from the deleted input table will lose access to that data and may return errors until the affected visualizations are updated.  #### Example  Pass the input table GUID as a path parameter. This endpoint has no request body.  ``` DELETE /api/rest/2.0/input-tables/a1b2c3d4-e5f6-7890-abcd-ef1234567890/delete ```      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")


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
     *   Version: 26.8.0.cl or later   Writes rows of data into an existing input table. The supplied rows replace the current contents of the table: each call serializes the provided values to CSV and loads them into the input table via DataManager, overwriting any previously stored rows.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_INPUT_TABLES` (**Can manage input tables**) privilege is required. The caller must also have `MODIFY` permission on the input table object.  #### Usage guidelines  Specify the input table GUID as the `input_table_identifier` path parameter and provide the row data in the request body:  * **`columns`** — Ordered list of column names to write. Column names must exactly match the names defined when the input table was created. Only the listed columns are written; unlisted columns retain their existing values. * **`rows`** — List of rows to load. Each row is an array of string values in the same order as `columns`. All cell values must be passed as strings regardless of the column\'s underlying data type.  **Note**: Each call fully replaces the previously loaded rows. To clear the table, send an empty `rows` array. Partial updates to individual rows are not supported; re-submit all rows on every write.  #### Examples  Write two rows to an input table. Pass the input table GUID as the `input_table_identifier` path parameter:  ``` POST /api/rest/2.0/input-tables/{input_table_identifier}/update ```  ```json {   \"columns\": [\"region\", \"target_revenue\", \"effective_date\"],   \"rows\": [     [\"West\", \"1500000\", \"2025-01-01\"],     [\"East\", \"2000000\", \"2025-01-01\"]   ] } ```  The response returns the number of rows written:  ```json { \"rows_loaded\": 2 } ```  Clear all rows from an input table:  ```json {   \"columns\": [\"region\", \"target_revenue\"],   \"rows\": [] } ```      
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
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.27.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.27.0")


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
