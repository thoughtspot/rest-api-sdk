/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.api;

import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.model.DbtConnectionRequest;
import org.thoughtspot.client.model.DbtGenerateSyncTmlRequest;
import org.thoughtspot.client.model.DbtGenerateTmlRequest;
import org.thoughtspot.client.model.DbtSearchResponse;
import org.thoughtspot.client.model.ErrorResponse;
import org.thoughtspot.client.model.UpdateDbtConnectionRequest;
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
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege.  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtConnectionTest() throws ApiException {
        DbtConnectionRequest dbtConnectionRequest = null;
        Object response = api.dbtConnection(dbtConnectionRequest);
        // TODO: test validations
    }

    /**
     *  Version: 9.9.0.cl or later 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtGenerateSyncTmlTest() throws ApiException {
        DbtGenerateSyncTmlRequest dbtGenerateSyncTmlRequest = null;
        Object response = api.dbtGenerateSyncTml(dbtGenerateSyncTmlRequest);
        // TODO: test validations
    }

    /**
     *  Version: 9.9.0.cl or later 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtGenerateTmlTest() throws ApiException {
        DbtGenerateTmlRequest dbtGenerateTmlRequest = null;
        Object response = api.dbtGenerateTml(dbtGenerateTmlRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtSearchTest() throws ApiException {
        List<DbtSearchResponse> response = api.dbtSearch();
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege.      
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
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection.  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDbtConnectionTest() throws ApiException {
        UpdateDbtConnectionRequest updateDbtConnectionRequest = null;
        Object response = api.updateDbtConnection(updateDbtConnectionRequest);
        // TODO: test validations
    }

}
