/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.CreateConnectionRequest;
import com.thoughtspot.client.model.CreateConnectionResponse;
import com.thoughtspot.client.model.DeleteConnectionRequest;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.FetchConnectionDiffStatusResponse;
import java.io.File;
import com.thoughtspot.client.model.SearchConnectionRequest;
import com.thoughtspot.client.model.SearchConnectionResponse;
import com.thoughtspot.client.model.UpdateConnectionRequest;
import com.thoughtspot.client.model.UpdateConnectionV2Request;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionsApi
 */
@Disabled
public class ConnectionsApiTest {

    private final ConnectionsApi api = new ConnectionsApi();

    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes for a SnowFlake connection:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;externalDatabases\&quot;:[       ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;false&#x60;.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;externalDatabases\&quot;:[         {            \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,            \&quot;isAutoCreated\&quot;:false,            \&quot;schemas\&quot;:[               {                  \&quot;name\&quot;:\&quot;alldatatypes\&quot;,                  \&quot;tables\&quot;:[                     {                        \&quot;name\&quot;:\&quot;allDatatypes\&quot;,                        \&quot;type\&quot;:\&quot;TABLE\&quot;,                        \&quot;description\&quot;:\&quot;\&quot;,                        \&quot;selected\&quot;:true,                        \&quot;linked\&quot;:true,                        \&quot;columns\&quot;:[                           {                              \&quot;name\&quot;:\&quot;CNUMBER\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           },                           {                              \&quot;name\&quot;:\&quot;CDECIMAL\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           }                        ]                     }                  ]               }            ]         }      ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;true&#x60;.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConnectionTest() throws ApiException {
        CreateConnectionRequest createConnectionRequest = null;
        CreateConnectionResponse response = api.createConnection(createConnectionRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectionTest() throws ApiException {
        DeleteConnectionRequest deleteConnectionRequest = null;
        api.deleteConnection(deleteConnectionRequest);
        // TODO: test validations
    }

    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectionV2Test() throws ApiException {
        String connectionIdentifier = null;
        api.deleteConnectionV2(connectionIdentifier);
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadConnectionMetadataChangesTest() throws ApiException {
        String connectionIdentifier = null;
        File response = api.downloadConnectionMetadataChanges(connectionIdentifier);
        // TODO: test validations
    }

    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchConnectionDiffStatusTest() throws ApiException {
        String connectionIdentifier = null;
        FetchConnectionDiffStatusResponse response = api.fetchConnectionDiffStatus(connectionIdentifier);
        // TODO: test validations
    }

    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To fetch details of a connection object, specify the connection object GUID or name. The &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific database, schema, table, or column from a connection object, define the object type in &#x60;data_warehouse_object_type&#x60; and object properties in the &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (&#x60;database&#x60; &gt; &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;).  &#x60;&#x60;&#x60; {   \&quot;connections\&quot;: [     {       \&quot;identifier\&quot;: \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;,       \&quot;data_warehouse_objects\&quot;: [         {           \&quot;database\&quot;: \&quot;NEBULADEV\&quot;,           \&quot;schema\&quot;: \&quot;INFORMATION_SCHEMA\&quot;,           \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,           \&quot;column\&quot;: \&quot;ROLE_NAME\&quot;         }       ]     }   ],   \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60;  - To fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the &#x60;configuration&#x60; string as &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a specific table, specify the table, for example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;. - To query connections by &#x60;authentication_type&#x60;, specify &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60; are:   - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - &#x60;OAUTH&#x60;: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - &#x60;EXTOAUTH&#x60;: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than &#x60;data_warehouse_types&#x60; or &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchConnectionTest() throws ApiException {
        SearchConnectionRequest searchConnectionRequest = null;
        List<SearchConnectionResponse> response = api.searchConnection(searchConnectionRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in &#x60;data_warehouse_config&#x60;.    b. Set &#x60;validate&#x60; to &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConnectionTest() throws ApiException {
        UpdateConnectionRequest updateConnectionRequest = null;
        api.updateConnection(updateConnectionRequest);
        // TODO: test validations
    }

    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in &#x60;data_warehouse_config&#x60;.    b. Set &#x60;validate&#x60; to &#x60;true&#x60;.    * A JSON map of configuration attributes, database details, and table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:     &#x60;&#x60;&#x60;    {       \&quot;configuration\&quot;:{          \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,          \&quot;user\&quot;:\&quot;tsadmin\&quot;,          \&quot;password\&quot;:\&quot;TestConn123\&quot;,          \&quot;role\&quot;:\&quot;sysadmin\&quot;,          \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;       },       \&quot;externalDatabases\&quot;:[          {             \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,             \&quot;isAutoCreated\&quot;:false,             \&quot;schemas\&quot;:[                {                   \&quot;name\&quot;:\&quot;alldatatypes\&quot;,                   \&quot;tables\&quot;:[                      {                         \&quot;name\&quot;:\&quot;allDatatypes\&quot;,                         \&quot;type\&quot;:\&quot;TABLE\&quot;,                         \&quot;description\&quot;:\&quot;\&quot;,                         \&quot;selected\&quot;:true,                         \&quot;linked\&quot;:true,                         \&quot;columns\&quot;:[                            {                               \&quot;name\&quot;:\&quot;CNUMBER\&quot;,                               \&quot;type\&quot;:\&quot;INT64\&quot;,                               \&quot;canImport\&quot;:true,                               \&quot;selected\&quot;:true,                               \&quot;isLinkedActive\&quot;:true,                               \&quot;isImported\&quot;:false,                               \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                               \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                               \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                            },                            {                               \&quot;name\&quot;:\&quot;CDECIMAL\&quot;,                               \&quot;type\&quot;:\&quot;INT64\&quot;,                               \&quot;canImport\&quot;:true,                               \&quot;selected\&quot;:true,                               \&quot;isLinkedActive\&quot;:true,                               \&quot;isImported\&quot;:false,                               \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                               \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                               \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                            }                         ]                      }                   ]                }             ]          }       ]    }    &#x60;&#x60;&#x60;  3. If you are updating a configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to &#x60;false&#x60;. * A JSON map of configuration attributes in &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes for a Snowflake connection:  &#x60;&#x60;&#x60;  {     \&quot;configuration\&quot;:{        \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,        \&quot;user\&quot;:\&quot;tsadmin\&quot;,        \&quot;password\&quot;:\&quot;TestConn123\&quot;,        \&quot;role\&quot;:\&quot;sysadmin\&quot;,        \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;     },     \&quot;externalDatabases\&quot;:[      ]  }  &#x60;&#x60;&#x60;      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConnectionV2Test() throws ApiException {
        String connectionIdentifier = null;
        UpdateConnectionV2Request updateConnectionV2Request = null;
        api.updateConnectionV2(connectionIdentifier, updateConnectionV2Request);
        // TODO: test validations
    }

}
