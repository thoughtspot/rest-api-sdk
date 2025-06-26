/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateVariableRequest;
import com.thoughtspot.client.model.SearchVariablesRequest;
import com.thoughtspot.client.model.UpdateVariableRequest;
import com.thoughtspot.client.model.UpdateVariableValuesRequest;
import com.thoughtspot.client.model.Variable;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for VariableApi */
@Disabled
public class VariableApiTest {

    private final VariableApi api = new VariableApi();

    /**
     * Create a variable which can be used for parameterizing metadata objects Version: 10.9.0.cl or
     * later Allows creating a variable which can be used for parameterizing metadata objects in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint supports the
     * following types of variables: * CONNECTION_PROPERTY - For connection properties *
     * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection
     * properties per principal. In order to use this please contact support to enable this. When
     * creating a variable, you need to specify: * The variable type * A unique name for the
     * variable * Whether the variable contains sensitive values (defaults to false) * The variable
     * values (optional) The operation will fail if: * The user lacks required permissions * The
     * variable name already exists * The variable type is invalid * The variable values are invalid
     * for the specified type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVariableTest() throws ApiException {
        CreateVariableRequest createVariableRequest = null;
        Variable response = api.createVariable(createVariableRequest);
        // TODO: test validations
    }

    /**
     * Delete a variable Version: 10.9.0.cl or later Allows deleting a variable from ThoughtSpot.
     * Requires ADMINISTRATION role and TENANT scope. The API endpoint requires: * The variable
     * identifier (ID or name) The operation will fail if: * The user lacks required permissions *
     * The variable doesn&#39;t exist * The variable is being used by other objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVariableTest() throws ApiException {
        String identifier = null;
        api.deleteVariable(identifier);
        // TODO: test validations
    }

    /**
     * Search variables Version: 10.9.0.cl or later Allows searching for variables in ThoughtSpot.
     * Requires ADMINISTRATION role. The API endpoint supports searching variables by: * Variable
     * identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for
     * wildcard) The search results can be formatted in three ways: * METADATA_ONLY - Returns only
     * variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values *
     * EDITABLE_METADATA_AND_VALUES - Returns only editable variable metadata and values
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchVariablesTest() throws ApiException {
        SearchVariablesRequest searchVariablesRequest = null;
        List<Variable> response = api.searchVariables(searchVariablesRequest);
        // TODO: test validations
    }

    /**
     * Update a variable&#39;s properties Version: 10.9.0.cl or later Allows updating a
     * variable&#39;s properties in ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The
     * API endpoint allows updating: * The variable name * The variable values When updating
     * variable values, you need to specify: * The operation to perform (ADD, REPLACE, REMOVE) * The
     * new values to add/replace/remove When the operation is ADD, a value any pre-existing value
     * with the same set of constraints will be replaced. When the operation is REPLACE, all values
     * of the variable are replaced with the values specified. When the operation is REMOVE, all
     * values with the given set of conditions are removed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVariableTest() throws ApiException {
        String identifier = null;
        UpdateVariableRequest updateVariableRequest = null;
        api.updateVariable(identifier, updateVariableRequest);
        // TODO: test validations
    }

    /**
     * Update values for multiple variables Version: 10.9.0.cl or later Allows updating values for
     * multiple variables in ThoughtSpot. Requires ADMINISTRATION role. The API endpoint allows: *
     * Adding new values to variables * Replacing existing values * Deleting values from variables
     * When updating variable values, you need to specify: * The variable identifiers * The values
     * to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE)
     * Behaviour based on operation type: * ADD - Adds values to the variable. Any pre-existing
     * values with the same conditions are replaced. * REPLACE - Replaces all values of a given org
     * with the current set of values. * REMOVE - Removes any values which match the set of
     * conditions of the variables.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVariableValuesTest() throws ApiException {
        UpdateVariableValuesRequest updateVariableValuesRequest = null;
        api.updateVariableValues(updateVariableValuesRequest);
        // TODO: test validations
    }
}
