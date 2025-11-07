/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.DbtSearchResponse;
import com.thoughtspot.client.model.ErrorResponse;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DbtApi
 */
@Disabled
public class DbtApiTest {

    private final DbtApi api = new DbtApi();

    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtConnectionTest() throws ApiException {
        String connectionName = null;
        String databaseName = null;
        String importType = null;
        String accessToken = null;
        String dbtUrl = null;
        String accountId = null;
        String projectId = null;
        String dbtEnvId = null;
        String projectName = null;
        File fileContent = null;
        Object response = api.dbtConnection(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtGenerateSyncTmlTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        File fileContent = null;
        Object response = api.dbtGenerateSyncTml(dbtConnectionIdentifier, fileContent);
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtGenerateTmlTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        String importWorksheets = null;
        String modelTables = null;
        String worksheets = null;
        File fileContent = null;
        Object response = api.dbtGenerateTml(dbtConnectionIdentifier, importWorksheets, modelTables, worksheets, fileContent);
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtSearchTest() throws ApiException {
        List<DbtSearchResponse> response = api.dbtSearch();
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDbtConnectionTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        api.deleteDbtConnection(dbtConnectionIdentifier);
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDbtConnectionTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        String connectionName = null;
        String databaseName = null;
        String importType = null;
        String accessToken = null;
        String dbtUrl = null;
        String accountId = null;
        String projectId = null;
        String dbtEnvId = null;
        String projectName = null;
        File fileContent = null;
        Object response = api.updateDbtConnection(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
        // TODO: test validations
    }

}
