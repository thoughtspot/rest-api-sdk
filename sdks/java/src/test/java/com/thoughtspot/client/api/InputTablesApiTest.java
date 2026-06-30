/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateInputTableRequest;
import com.thoughtspot.client.model.InputTableResponse;
import com.thoughtspot.client.model.InputTableUpdateResponse;
import com.thoughtspot.client.model.UpdateInputTableRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for InputTablesApi */
@Disabled
public class InputTablesApiTest {

    private final InputTablesApi api = new InputTablesApi();

    /**
     * Version: 26.8.0.cl or later Creates an input table and links it to a ThoughtSpot model
     * (worksheet). An input table is a user-editable table stored in the model&#39;s external Cloud
     * Data Warehouse (CDW) connection. It lets analysts enter or import data directly from the
     * ThoughtSpot UI without requiring access to the underlying warehouse. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**) privilege is
     * required. #### Usage guidelines To create an input table, provide the following in the
     * request body: * **&#x60;table_name&#x60;** — Physical name of the table to create in the
     * external warehouse. * **&#x60;model_identifier&#x60;** — GUID or name of the model
     * (worksheet) to link the input table to. The connection, database, and schema used to create
     * the physical table are derived from this model&#39;s metadata. *
     * **&#x60;table_definition&#x60;** — Describes the table schema: *
     * &#x60;referenced_columns&#x60; — List of column GUIDs from the linked model to include as
     * read-only reference columns in the input table. These columns anchor the input data to
     * existing model dimensions. * &#x60;new_columns&#x60; — List of new editable columns to
     * create. Each column requires: * &#x60;name&#x60; — Column display name. *
     * &#x60;data_type&#x60; — Warehouse data type (for example, &#x60;VARCHAR&#x60;,
     * &#x60;DOUBLE&#x60;, &#x60;DATE&#x60;). * &#x60;type&#x60; — Semantic role of the column:
     * &#x60;ATTRIBUTE&#x60; for dimension columns or &#x60;MEASURE&#x60; for numeric columns.
     * **Note**: The physical table is created in the same connection, database, and schema as the
     * linked model. Ensure the connection user has &#x60;CREATE TABLE&#x60; permissions in the
     * target schema. #### Examples Create an input table with one referenced model column and one
     * new editable measure column: &#x60;&#x60;&#x60;json { \&quot;table_name\&quot;: \&quot;Sales
     * Region Targets\&quot;, \&quot;model_identifier\&quot;:
     * \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot;, \&quot;table_definition\&quot;: {
     * \&quot;referenced_columns\&quot;: [\&quot;c7d8e9f0-1234-5678-abcd-ef0987654321\&quot;],
     * \&quot;new_columns\&quot;: [ { \&quot;name\&quot;: \&quot;target_revenue\&quot;,
     * \&quot;data_type\&quot;: \&quot;DOUBLE\&quot;, \&quot;type\&quot;: \&quot;MEASURE\&quot; } ]
     * } } &#x60;&#x60;&#x60; Create an input table with multiple new editable columns and no
     * referenced columns: &#x60;&#x60;&#x60;json { \&quot;table_name\&quot;: \&quot;Budget
     * Adjustments\&quot;, \&quot;model_identifier\&quot;:
     * \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot;, \&quot;table_definition\&quot;: {
     * \&quot;referenced_columns\&quot;: [], \&quot;new_columns\&quot;: [ { \&quot;name\&quot;:
     * \&quot;region\&quot;, \&quot;data_type\&quot;: \&quot;VARCHAR\&quot;, \&quot;type\&quot;:
     * \&quot;ATTRIBUTE\&quot; }, { \&quot;name\&quot;: \&quot;adjustment_amount\&quot;,
     * \&quot;data_type\&quot;: \&quot;DOUBLE\&quot;, \&quot;type\&quot;: \&quot;MEASURE\&quot; }, {
     * \&quot;name\&quot;: \&quot;effective_date\&quot;, \&quot;data_type\&quot;:
     * \&quot;DATE\&quot;, \&quot;type\&quot;: \&quot;ATTRIBUTE\&quot; } ] } } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInputTableTest() throws ApiException {
        CreateInputTableRequest createInputTableRequest = null;
        InputTableResponse response = api.createInputTable(createInputTableRequest);
        // TODO: test validations
    }

    /**
     * Version: 26.8.0.cl or later Deletes an input table. This operation unlinks the input table
     * from its owner model, removes it from the connection metadata, and drops the physical table
     * from the Cloud Data Warehouse (CDW). This action is irreversible — all data stored in the
     * input table is permanently deleted. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**)
     * or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based
     * Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your
     * ThoughtSpot instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**)
     * privilege is required. #### Usage guidelines Specify the GUID of the input table to delete as
     * the &#x60;input_table_identifier&#x60; path parameter. The owner model (worksheet) is derived
     * from the input table&#39;s metadata and is used to locate and clean up the associated
     * connection entry. **Note**: Deleting an input table does not delete the linked model.
     * However, any Answers or Liveboards that reference columns from the deleted input table will
     * lose access to that data and may return errors until the affected visualizations are updated.
     * #### Example Pass the input table GUID as a path parameter. This endpoint has no request
     * body. &#x60;&#x60;&#x60; DELETE
     * /api/rest/2.0/input-tables/a1b2c3d4-e5f6-7890-abcd-ef1234567890/delete &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteInputTableTest() throws ApiException {
        String inputTableIdentifier = null;
        api.deleteInputTable(inputTableIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 26.8.0.cl or later Writes rows of data into an existing input table. The supplied
     * rows replace the current contents of the table: each call serializes the provided values to
     * CSV and loads them into the input table via DataManager, overwriting any previously stored
     * rows. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_INPUT_TABLES&#x60; (**Can manage input tables**) privilege is
     * required. The caller must also have &#x60;MODIFY&#x60; permission on the input table object.
     * #### Usage guidelines Specify the input table GUID as the &#x60;input_table_identifier&#x60;
     * path parameter and provide the row data in the request body: * **&#x60;columns&#x60;** —
     * Ordered list of column names to write. Column names must exactly match the names defined when
     * the input table was created. Only the listed columns are written; unlisted columns retain
     * their existing values. * **&#x60;rows&#x60;** — List of rows to load. Each row is an array of
     * string values in the same order as &#x60;columns&#x60;. All cell values must be passed as
     * strings regardless of the column&#39;s underlying data type. **Note**: Each call fully
     * replaces the previously loaded rows. To clear the table, send an empty &#x60;rows&#x60;
     * array. Partial updates to individual rows are not supported; re-submit all rows on every
     * write. #### Examples Write two rows to an input table. Pass the input table GUID as the
     * &#x60;input_table_identifier&#x60; path parameter: &#x60;&#x60;&#x60; POST
     * /api/rest/2.0/input-tables/{input_table_identifier}/update &#x60;&#x60;&#x60;
     * &#x60;&#x60;&#x60;json { \&quot;columns\&quot;: [\&quot;region\&quot;,
     * \&quot;target_revenue\&quot;, \&quot;effective_date\&quot;], \&quot;rows\&quot;: [
     * [\&quot;West\&quot;, \&quot;1500000\&quot;, \&quot;2025-01-01\&quot;], [\&quot;East\&quot;,
     * \&quot;2000000\&quot;, \&quot;2025-01-01\&quot;] ] } &#x60;&#x60;&#x60; The response returns
     * the number of rows written: &#x60;&#x60;&#x60;json { \&quot;rows_loaded\&quot;: 2 }
     * &#x60;&#x60;&#x60; Clear all rows from an input table: &#x60;&#x60;&#x60;json {
     * \&quot;columns\&quot;: [\&quot;region\&quot;, \&quot;target_revenue\&quot;],
     * \&quot;rows\&quot;: [] } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInputTableTest() throws ApiException {
        String inputTableIdentifier = null;
        UpdateInputTableRequest updateInputTableRequest = null;
        InputTableUpdateResponse response =
                api.updateInputTable(inputTableIdentifier, updateInputTableRequest);
        // TODO: test validations
    }
}
