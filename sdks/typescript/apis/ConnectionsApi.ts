// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { CreateConnectionRequest } from '../models/CreateConnectionRequest';
import { CreateConnectionResponse } from '../models/CreateConnectionResponse';
import { DeleteConnectionRequest } from '../models/DeleteConnectionRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { FetchConnectionDiffStatusResponse } from '../models/FetchConnectionDiffStatusResponse';
import { SearchConnectionRequest } from '../models/SearchConnectionRequest';
import { SearchConnectionResponse } from '../models/SearchConnectionResponse';
import { UpdateConnectionRequest } from '../models/UpdateConnectionRequest';
import { UpdateConnectionV2Request } from '../models/UpdateConnectionV2Request';

/**
 * no description
 */
export class ConnectionsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      
     * @param createConnectionRequest 
     */
    public async createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createConnectionRequest' is not null or undefined
        if (createConnectionRequest === null || createConnectionRequest === undefined) {
            throw new RequiredError("ConnectionsApi", "createConnection", "createConnectionRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connection/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createConnectionRequest, "CreateConnectionRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     
     * @param deleteConnectionRequest 
     */
    public async deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'deleteConnectionRequest' is not null or undefined
        if (deleteConnectionRequest === null || deleteConnectionRequest === undefined) {
            throw new RequiredError("ConnectionsApi", "deleteConnection", "deleteConnectionRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connection/delete';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(deleteConnectionRequest, "DeleteConnectionRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    public async deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'connectionIdentifier' is not null or undefined
        if (connectionIdentifier === null || connectionIdentifier === undefined) {
            throw new RequiredError("ConnectionsApi", "deleteConnectionV2", "connectionIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connections/{connection_identifier}/delete'
            .replace('{' + 'connection_identifier' + '}', encodeURIComponent(String(connectionIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public async downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'connectionIdentifier' is not null or undefined
        if (connectionIdentifier === null || connectionIdentifier === undefined) {
            throw new RequiredError("ConnectionsApi", "downloadConnectionMetadataChanges", "connectionIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connections/download-connection-metadata-changes/{connection_identifier}'
            .replace('{' + 'connection_identifier' + '}', encodeURIComponent(String(connectionIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public async fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'connectionIdentifier' is not null or undefined
        if (connectionIdentifier === null || connectionIdentifier === undefined) {
            throw new RequiredError("ConnectionsApi", "fetchConnectionDiffStatus", "connectionIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connections/fetch-connection-diff-status/{connection_identifier}'
            .replace('{' + 'connection_identifier' + '}', encodeURIComponent(String(connectionIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth).   - `KEY_PAIR`: For connections that require Key Pair account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PKCE`: For connections that require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo  connections only.   - `EXTOAUTH_WITH_PKCE`: For connections that require External OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PEZ`: For connections that require OAuth With PEZ account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Amazon Redshift connections only.   - `OAUTH_WITH_SERVICE_PRINCIPAL`: For connections that require OAuth With Service Principal account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `PERSONAL_ACCESS_TOKEN`: For connections that require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `OAUTH_CLIENT_CREDENTIALS`: For connections that require OAuth Client Credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only. - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.      
     * @param searchConnectionRequest 
     */
    public async searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'searchConnectionRequest' is not null or undefined
        if (searchConnectionRequest === null || searchConnectionRequest === undefined) {
            throw new RequiredError("ConnectionsApi", "searchConnection", "searchConnectionRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connection/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchConnectionRequest, "SearchConnectionRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param updateConnectionRequest 
     */
    public async updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'updateConnectionRequest' is not null or undefined
        if (updateConnectionRequest === null || updateConnectionRequest === undefined) {
            throw new RequiredError("ConnectionsApi", "updateConnection", "updateConnectionRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connection/update';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateConnectionRequest, "UpdateConnectionRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`.        **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.     * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:     ```    {       \"configuration\":{          \"accountName\":\"thoughtspot_partner\",          \"user\":\"tsadmin\",          \"password\":\"TestConn123\",          \"role\":\"sysadmin\",          \"warehouse\":\"MEDIUM_WH\"       },       \"externalDatabases\":[          {             \"name\":\"AllDatatypes\",             \"isAutoCreated\":false,             \"schemas\":[                {                   \"name\":\"alldatatypes\",                   \"tables\":[                      {                         \"name\":\"allDatatypes\",                         \"type\":\"TABLE\",                         \"description\":\"\",                         \"selected\":true,                         \"linked\":true,                         \"columns\":[                            {                               \"name\":\"CNUMBER\",                               \"type\":\"INT64\",                               \"canImport\":true,                               \"selected\":true,                               \"isLinkedActive\":true,                               \"isImported\":false,                               \"tableName\":\"allDatatypes\",                               \"schemaName\":\"alldatatypes\",                               \"dbName\":\"AllDatatypes\"                            },                            {                               \"name\":\"CDECIMAL\",                               \"type\":\"INT64\",                               \"canImport\":true,                               \"selected\":true,                               \"isLinkedActive\":true,                               \"isImported\":false,                               \"tableName\":\"allDatatypes\",                               \"schemaName\":\"alldatatypes\",                               \"dbName\":\"AllDatatypes\"                            }                         ]                      }                   ]                }             ]          }       ]    }    ```  3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.    **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not  specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.    * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a Snowflake connection:    ```    {       \"configuration\":{          \"accountName\":\"thoughtspot_partner\",          \"user\":\"tsadmin\",          \"password\":\"TestConn123\",          \"role\":\"sysadmin\",          \"warehouse\":\"MEDIUM_WH\"       },       \"externalDatabases\":[        ]    }    ```      
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request 
     */
    public async updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'connectionIdentifier' is not null or undefined
        if (connectionIdentifier === null || connectionIdentifier === undefined) {
            throw new RequiredError("ConnectionsApi", "updateConnectionV2", "connectionIdentifier");
        }


        // verify required parameter 'updateConnectionV2Request' is not null or undefined
        if (updateConnectionV2Request === null || updateConnectionV2Request === undefined) {
            throw new RequiredError("ConnectionsApi", "updateConnectionV2", "updateConnectionV2Request");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/connections/{connection_identifier}/update'
            .replace('{' + 'connection_identifier' + '}', encodeURIComponent(String(connectionIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.13.2")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateConnectionV2Request, "UpdateConnectionV2Request", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class ConnectionsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createConnection(response: ResponseContext): Promise<CreateConnectionResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: CreateConnectionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateConnectionResponse", ""
            ) as CreateConnectionResponse;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: CreateConnectionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateConnectionResponse", ""
            ) as CreateConnectionResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteConnection(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConnectionV2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteConnectionV2(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to downloadConnectionMetadataChanges
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async downloadConnectionMetadataChanges(response: ResponseContext): Promise<HttpFile > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: HttpFile = await response.getBodyAsFile() as any as HttpFile;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", "binary"
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: HttpFile = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "HttpFile", "binary"
            ) as HttpFile;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchConnectionDiffStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchConnectionDiffStatus(response: ResponseContext): Promise<FetchConnectionDiffStatusResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: FetchConnectionDiffStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FetchConnectionDiffStatusResponse", ""
            ) as FetchConnectionDiffStatusResponse;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: FetchConnectionDiffStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "FetchConnectionDiffStatusResponse", ""
            ) as FetchConnectionDiffStatusResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchConnection(response: ResponseContext): Promise<Array<SearchConnectionResponse> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<SearchConnectionResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<SearchConnectionResponse>", ""
            ) as Array<SearchConnectionResponse>;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<SearchConnectionResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<SearchConnectionResponse>", ""
            ) as Array<SearchConnectionResponse>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateConnection(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConnectionV2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateConnectionV2(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
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
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
