import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { APIKey } from '../models/APIKey';
import { APIKeyInput } from '../models/APIKeyInput';
import { ActionConfig } from '../models/ActionConfig';
import { ActionConfigInput } from '../models/ActionConfigInput';
import { ActionConfigInputCreate } from '../models/ActionConfigInputCreate';
import { ActionDetails } from '../models/ActionDetails';
import { ActionDetailsInput } from '../models/ActionDetailsInput';
import { ActionDetailsInputCreate } from '../models/ActionDetailsInputCreate';
import { AnswerContent } from '../models/AnswerContent';
import { AnswerDataResponse } from '../models/AnswerDataResponse';
import { AssignChangeAuthorRequest } from '../models/AssignChangeAuthorRequest';
import { AssignTagRequest } from '../models/AssignTagRequest';
import { AssociateMetadataInput } from '../models/AssociateMetadataInput';
import { AssociateMetadataInputCreate } from '../models/AssociateMetadataInputCreate';
import { Authentication } from '../models/Authentication';
import { AuthenticationInput } from '../models/AuthenticationInput';
import { Author } from '../models/Author';
import { AuthorMetadataTypeInput } from '../models/AuthorMetadataTypeInput';
import { AuthorType } from '../models/AuthorType';
import { BasicAuth } from '../models/BasicAuth';
import { BasicAuthInput } from '../models/BasicAuthInput';
import { CALLBACK } from '../models/CALLBACK';
import { CALLBACKInput } from '../models/CALLBACKInput';
import { CALLBACKInputMandatory } from '../models/CALLBACKInputMandatory';
import { ChangeUserPasswordRequest } from '../models/ChangeUserPasswordRequest';
import { Column } from '../models/Column';
import { CommitBranchRequest } from '../models/CommitBranchRequest';
import { CommitFileType } from '../models/CommitFileType';
import { CommitHistoryResponse } from '../models/CommitHistoryResponse';
import { CommitResponse } from '../models/CommitResponse';
import { CommiterType } from '../models/CommiterType';
import { ConnectionInput } from '../models/ConnectionInput';
import { CreateConfigRequest } from '../models/CreateConfigRequest';
import { CreateConnectionRequest } from '../models/CreateConnectionRequest';
import { CreateConnectionResponse } from '../models/CreateConnectionResponse';
import { CreateCustomActionRequest } from '../models/CreateCustomActionRequest';
import { CreateOrgRequest } from '../models/CreateOrgRequest';
import { CreateRoleRequest } from '../models/CreateRoleRequest';
import { CreateScheduleRequest } from '../models/CreateScheduleRequest';
import { CreateTagRequest } from '../models/CreateTagRequest';
import { CreateUserGroupRequest } from '../models/CreateUserGroupRequest';
import { CreateUserRequest } from '../models/CreateUserRequest';
import { CronExpression } from '../models/CronExpression';
import { CronExpressionInput } from '../models/CronExpressionInput';
import { CustomActionMetadataTypeInput } from '../models/CustomActionMetadataTypeInput';
import { DataWarehouseObjectInput } from '../models/DataWarehouseObjectInput';
import { DataWarehouseObjects } from '../models/DataWarehouseObjects';
import { Database } from '../models/Database';
import { DefaultActionConfig } from '../models/DefaultActionConfig';
import { DefaultActionConfigInput } from '../models/DefaultActionConfigInput';
import { DefaultActionConfigInputCreate } from '../models/DefaultActionConfigInputCreate';
import { DefaultActionConfigSearchInput } from '../models/DefaultActionConfigSearchInput';
import { DeleteConfigRequest } from '../models/DeleteConfigRequest';
import { DeleteConnectionRequest } from '../models/DeleteConnectionRequest';
import { DeleteMetadataRequest } from '../models/DeleteMetadataRequest';
import { DeleteMetadataTypeInput } from '../models/DeleteMetadataTypeInput';
import { DeployCommitRequest } from '../models/DeployCommitRequest';
import { DeployResponse } from '../models/DeployResponse';
import { ErrorResponse } from '../models/ErrorResponse';
import { ExcludeMetadataListItemInput } from '../models/ExcludeMetadataListItemInput';
import { ExportAnswerReportRequest } from '../models/ExportAnswerReportRequest';
import { ExportLiveboardReportRequest } from '../models/ExportLiveboardReportRequest';
import { ExportMetadataTMLRequest } from '../models/ExportMetadataTMLRequest';
import { ExportMetadataTypeInput } from '../models/ExportMetadataTypeInput';
import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
import { FavoriteMetadataItem } from '../models/FavoriteMetadataItem';
import { FavoriteObjectOptionsInput } from '../models/FavoriteObjectOptionsInput';
import { FetchAnswerDataRequest } from '../models/FetchAnswerDataRequest';
import { FetchAnswerSqlQueryRequest } from '../models/FetchAnswerSqlQueryRequest';
import { FetchLiveboardDataRequest } from '../models/FetchLiveboardDataRequest';
import { FetchLiveboardSqlQueryRequest } from '../models/FetchLiveboardSqlQueryRequest';
import { FetchLogsRequest } from '../models/FetchLogsRequest';
import { FetchPermissionsOfPrincipalsRequest } from '../models/FetchPermissionsOfPrincipalsRequest';
import { FetchPermissionsOnMetadataRequest } from '../models/FetchPermissionsOnMetadataRequest';
import { ForceLogoutUsersRequest } from '../models/ForceLogoutUsersRequest';
import { Frequency } from '../models/Frequency';
import { FrequencyInput } from '../models/FrequencyInput';
import { GenericInfo } from '../models/GenericInfo';
import { GetFullAccessTokenRequest } from '../models/GetFullAccessTokenRequest';
import { GetObjectAccessTokenRequest } from '../models/GetObjectAccessTokenRequest';
import { GetTokenResponse } from '../models/GetTokenResponse';
import { GroupsImportListInput } from '../models/GroupsImportListInput';
import { ImportMetadataTMLRequest } from '../models/ImportMetadataTMLRequest';
import { ImportUser } from '../models/ImportUser';
import { ImportUserGroupsRequest } from '../models/ImportUserGroupsRequest';
import { ImportUserGroupsResponse } from '../models/ImportUserGroupsResponse';
import { ImportUserType } from '../models/ImportUserType';
import { ImportUsersRequest } from '../models/ImportUsersRequest';
import { ImportUsersResponse } from '../models/ImportUsersResponse';
import { JWTMetadataObject } from '../models/JWTMetadataObject';
import { JWTParameter } from '../models/JWTParameter';
import { JWTUserOptions } from '../models/JWTUserOptions';
import { JWTUserOptionsParametersInner } from '../models/JWTUserOptionsParametersInner';
import { LiveboardContent } from '../models/LiveboardContent';
import { LiveboardDataResponse } from '../models/LiveboardDataResponse';
import { LiveboardOptions } from '../models/LiveboardOptions';
import { LiveboardOptionsInput } from '../models/LiveboardOptionsInput';
import { LogResponse } from '../models/LogResponse';
import { LoginRequest } from '../models/LoginRequest';
import { MetadataAssociationItem } from '../models/MetadataAssociationItem';
import { MetadataInput } from '../models/MetadataInput';
import { MetadataListItemInput } from '../models/MetadataListItemInput';
import { MetadataObject } from '../models/MetadataObject';
import { MetadataResponse } from '../models/MetadataResponse';
import { MetadataSearchResponse } from '../models/MetadataSearchResponse';
import { MetadataSearchSortOptions } from '../models/MetadataSearchSortOptions';
import { ModelTableList } from '../models/ModelTableList';
import { ObjectIDAndName } from '../models/ObjectIDAndName';
import { Org } from '../models/Org';
import { OrgResponse } from '../models/OrgResponse';
import { ParametersListItem } from '../models/ParametersListItem';
import { ParametersListItemInput } from '../models/ParametersListItemInput';
import { PdfOptions } from '../models/PdfOptions';
import { PdfOptionsInput } from '../models/PdfOptionsInput';
import { PermissionInput } from '../models/PermissionInput';
import { PermissionsMetadataTypeInput } from '../models/PermissionsMetadataTypeInput';
import { PngOptionsInput } from '../models/PngOptionsInput';
import { PrincipalsInput } from '../models/PrincipalsInput';
import { PrincipalsListItem } from '../models/PrincipalsListItem';
import { PrincipalsListItemInput } from '../models/PrincipalsListItemInput';
import { RecipientDetails } from '../models/RecipientDetails';
import { RecipientDetailsInput } from '../models/RecipientDetailsInput';
import { RepoConfigObject } from '../models/RepoConfigObject';
import { ResetUserPasswordRequest } from '../models/ResetUserPasswordRequest';
import { ResponseActivationURL } from '../models/ResponseActivationURL';
import { ResponseCustomAction } from '../models/ResponseCustomAction';
import { ResponseSchedule } from '../models/ResponseSchedule';
import { ResponseScheduleRun } from '../models/ResponseScheduleRun';
import { RevertCommitRequest } from '../models/RevertCommitRequest';
import { RevertResponse } from '../models/RevertResponse';
import { RevertedMetadata } from '../models/RevertedMetadata';
import { RevokeTokenRequest } from '../models/RevokeTokenRequest';
import { RiseSetter } from '../models/RiseSetter';
import { Role } from '../models/Role';
import { RoleResponse } from '../models/RoleResponse';
import { RuntimeFilter } from '../models/RuntimeFilter';
import { RuntimeParamOverride } from '../models/RuntimeParamOverride';
import { RuntimeSort } from '../models/RuntimeSort';
import { ScheduleHistoryRunsOptionsInput } from '../models/ScheduleHistoryRunsOptionsInput';
import { SchedulesPdfOptionsInput } from '../models/SchedulesPdfOptionsInput';
import { SchemaObject } from '../models/SchemaObject';
import { Scope } from '../models/Scope';
import { SearchCommitsRequest } from '../models/SearchCommitsRequest';
import { SearchConfigRequest } from '../models/SearchConfigRequest';
import { SearchConnectionRequest } from '../models/SearchConnectionRequest';
import { SearchConnectionResponse } from '../models/SearchConnectionResponse';
import { SearchCustomActionsRequest } from '../models/SearchCustomActionsRequest';
import { SearchDataRequest } from '../models/SearchDataRequest';
import { SearchDataResponse } from '../models/SearchDataResponse';
import { SearchMetadataRequest } from '../models/SearchMetadataRequest';
import { SearchOrgsRequest } from '../models/SearchOrgsRequest';
import { SearchRoleResponse } from '../models/SearchRoleResponse';
import { SearchRolesRequest } from '../models/SearchRolesRequest';
import { SearchSchedulesRequest } from '../models/SearchSchedulesRequest';
import { SearchTagsRequest } from '../models/SearchTagsRequest';
import { SearchUserGroupsRequest } from '../models/SearchUserGroupsRequest';
import { SearchUsersRequest } from '../models/SearchUsersRequest';
import { ShareMetadataRequest } from '../models/ShareMetadataRequest';
import { SharePermissionsInput } from '../models/SharePermissionsInput';
import { SortOptionInput } from '../models/SortOptionInput';
import { SortOptions } from '../models/SortOptions';
import { SortingOptions } from '../models/SortingOptions';
import { SqlQuery } from '../models/SqlQuery';
import { SqlQueryResponse } from '../models/SqlQueryResponse';
import { SystemConfig } from '../models/SystemConfig';
import { SystemInfo } from '../models/SystemInfo';
import { Table } from '../models/Table';
import { Tag } from '../models/Tag';
import { TagMetadataTypeInput } from '../models/TagMetadataTypeInput';
import { Token } from '../models/Token';
import { URL } from '../models/URL';
import { URLInput } from '../models/URLInput';
import { URLInputMandatory } from '../models/URLInputMandatory';
import { UpdateConfigRequest } from '../models/UpdateConfigRequest';
import { UpdateConnectionRequest } from '../models/UpdateConnectionRequest';
import { UpdateCustomActionRequest } from '../models/UpdateCustomActionRequest';
import { UpdateOrgRequest } from '../models/UpdateOrgRequest';
import { UpdateRoleRequest } from '../models/UpdateRoleRequest';
import { UpdateScheduleRequest } from '../models/UpdateScheduleRequest';
import { UpdateSystemConfigRequest } from '../models/UpdateSystemConfigRequest';
import { UpdateTagRequest } from '../models/UpdateTagRequest';
import { UpdateUserGroupRequest } from '../models/UpdateUserGroupRequest';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { User } from '../models/User';
import { UserGroup } from '../models/UserGroup';
import { UserGroupResponse } from '../models/UserGroupResponse';
import { ValidateMergeRequest } from '../models/ValidateMergeRequest';
import { ObservableAuthenticationApi } from './ObservableAPI';

import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";
export class PromiseAuthenticationApi {
    private api: ObservableAuthenticationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthenticationApiRequestFactory,
        responseProcessor?: AuthenticationApiResponseProcessor
    ) {
        this.api = new ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.      
     */
    public getCurrentUserInfo(_options?: Configuration): Promise<User> {
        const result = this.api.getCurrentUserInfo(_options);
        return result.toPromise();
    }

    /**
     *  Get token for the currently logged-in user. /n  Version: 9.4.0.cl or later  Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.      
     */
    public getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse> {
        const result = this.api.getCurrentUserToken(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param getFullAccessTokenRequest 
     */
    public getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getFullAccessToken(getFullAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param getObjectAccessTokenRequest 
     */
    public getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getObjectAccessToken(getObjectAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.      
     * @param loginRequest 
     */
    public login(loginRequest?: LoginRequest, _options?: Configuration): Promise<void> {
        const result = this.api.login(loginRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Logs out a user from their current session.      
     */
    public logout(_options?: Configuration): Promise<void> {
        const result = this.api.logout(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param revokeTokenRequest 
     */
    public revokeToken(revokeTokenRequest?: RevokeTokenRequest, _options?: Configuration): Promise<void> {
        const result = this.api.revokeToken(revokeTokenRequest, _options);
        return result.toPromise();
    }


}



import { ObservableConnectionsApi } from './ObservableAPI';

import { ConnectionsApiRequestFactory, ConnectionsApiResponseProcessor} from "../apis/ConnectionsApi";
export class PromiseConnectionsApi {
    private api: ObservableConnectionsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ConnectionsApiRequestFactory,
        responseProcessor?: ConnectionsApiResponseProcessor
    ) {
        this.api = new ObservableConnectionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.2.0.cl or later  Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      
     * @param createConnectionRequest 
     */
    public createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse> {
        const result = this.api.createConnection(createConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param deleteConnectionRequest 
     */
    public deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConnection(deleteConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`). ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ``` - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   * `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   * `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   * `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   * `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.     
     * @param searchConnectionRequest 
     */
    public searchConnection(searchConnectionRequest?: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>> {
        const result = this.api.searchConnection(searchConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param updateConnectionRequest 
     */
    public updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateConnection(updateConnectionRequest, _options);
        return result.toPromise();
    }


}



import { ObservableCustomActionApi } from './ObservableAPI';

import { CustomActionApiRequestFactory, CustomActionApiResponseProcessor} from "../apis/CustomActionApi";
export class PromiseCustomActionApi {
    private api: ObservableCustomActionApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CustomActionApiRequestFactory,
        responseProcessor?: CustomActionApiResponseProcessor
    ) {
        this.api = new ObservableCustomActionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.6.0.cl or later  Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).      
     * @param createCustomActionRequest 
     */
    public createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction> {
        const result = this.api.createCustomAction(createCustomActionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later  Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    public deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteCustomAction(customActionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later  Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param searchCustomActionsRequest 
     */
    public searchCustomActions(searchCustomActionsRequest?: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>> {
        const result = this.api.searchCustomActions(searchCustomActionsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later  Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).      
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest 
     */
    public updateCustomAction(customActionIdentifier: string, updateCustomActionRequest?: UpdateCustomActionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);
        return result.toPromise();
    }


}



import { ObservableDataApi } from './ObservableAPI';

import { DataApiRequestFactory, DataApiResponseProcessor} from "../apis/DataApi";
export class PromiseDataApi {
    private api: ObservableDataApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DataApiRequestFactory,
        responseProcessor?: DataApiResponseProcessor
    ) {
        this.api = new ObservableDataApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches data from a saved Answer.  Requires at least view access to the saved Answer.      
     * @param fetchAnswerDataRequest 
     */
    public fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse> {
        const result = this.api.fetchAnswerData(fetchAnswerDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.      
     * @param fetchLiveboardDataRequest 
     */
    public fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse> {
        const result = this.api.fetchLiveboardData(fetchLiveboardDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```      
     * @param searchDataRequest 
     */
    public searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse> {
        const result = this.api.searchData(searchDataRequest, _options);
        return result.toPromise();
    }


}



import { ObservableGroupsApi } from './ObservableAPI';

import { GroupsApiRequestFactory, GroupsApiResponseProcessor} from "../apis/GroupsApi";
export class PromiseGroupsApi {
    private api: ObservableGroupsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GroupsApiRequestFactory,
        responseProcessor?: GroupsApiResponseProcessor
    ) {
        this.api = new ObservableGroupsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      
     * @param createUserGroupRequest 
     */
    public createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse> {
        const result = this.api.createUserGroup(createUserGroupRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param groupIdentifier GUID or name of the group.
     */
    public deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUserGroup(groupIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      
     * @param importUserGroupsRequest 
     */
    public importUserGroups(importUserGroupsRequest?: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse> {
        const result = this.api.importUserGroups(importUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.      
     * @param searchUserGroupsRequest 
     */
    public searchUserGroups(searchUserGroupsRequest?: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>> {
        const result = this.api.searchUserGroups(searchUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest 
     */
    public updateUserGroup(groupIdentifier: string, updateUserGroupRequest?: UpdateUserGroupRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);
        return result.toPromise();
    }


}



import { ObservableLogApi } from './ObservableAPI';

import { LogApiRequestFactory, LogApiResponseProcessor} from "../apis/LogApi";
export class PromiseLogApi {
    private api: ObservableLogApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LogApiRequestFactory,
        responseProcessor?: LogApiResponseProcessor
    ) {
        this.api = new ObservableLogApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance      
     * @param fetchLogsRequest 
     */
    public fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>> {
        const result = this.api.fetchLogs(fetchLogsRequest, _options);
        return result.toPromise();
    }


}



import { ObservableMetadataApi } from './ObservableAPI';

import { MetadataApiRequestFactory, MetadataApiResponseProcessor} from "../apis/MetadataApi";
export class PromiseMetadataApi {
    private api: ObservableMetadataApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MetadataApiRequestFactory,
        responseProcessor?: MetadataApiResponseProcessor
    ) {
        this.api = new ObservableMetadataApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param deleteMetadataRequest 
     */
    public deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteMetadata(deleteMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.      
     * @param exportMetadataTMLRequest 
     */
    public exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.exportMetadataTML(exportMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```      
     * @param fetchAnswerSqlQueryRequest 
     */
    public fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```      
     * @param fetchLiveboardSqlQueryRequest 
     */
    public fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.      
     * @param importMetadataTMLRequest 
     */
    public importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.importMetadataTML(importMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  * To get all metadata objects, send the API request without any attributes. * To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. * To get a specific metadata object, specify the GUID. * To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.      
     * @param searchMetadataRequest 
     */
    public searchMetadata(searchMetadataRequest?: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>> {
        const result = this.api.searchMetadata(searchMetadataRequest, _options);
        return result.toPromise();
    }


}



import { ObservableOrgsApi } from './ObservableAPI';

import { OrgsApiRequestFactory, OrgsApiResponseProcessor} from "../apis/OrgsApi";
export class PromiseOrgsApi {
    private api: ObservableOrgsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: OrgsApiRequestFactory,
        responseProcessor?: OrgsApiResponseProcessor
    ) {
        this.api = new ObservableOrgsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.      
     * @param createOrgRequest 
     */
    public createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse> {
        const result = this.api.createOrg(createOrgRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      
     * @param orgIdentifier ID or name of the Org
     */
    public deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteOrg(orgIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.      
     * @param searchOrgsRequest 
     */
    public searchOrgs(searchOrgsRequest?: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>> {
        const result = this.api.searchOrgs(searchOrgsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.      
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest 
     */
    public updateOrg(orgIdentifier: string, updateOrgRequest?: UpdateOrgRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateOrg(orgIdentifier, updateOrgRequest, _options);
        return result.toPromise();
    }


}



import { ObservableReportsApi } from './ObservableAPI';

import { ReportsApiRequestFactory, ReportsApiResponseProcessor} from "../apis/ReportsApi";
export class PromiseReportsApi {
    private api: ObservableReportsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ReportsApiRequestFactory,
        responseProcessor?: ReportsApiResponseProcessor
    ) {
        this.api = new ObservableReportsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.      
     * @param exportAnswerReportRequest 
     */
    public exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<void> {
        const result = this.api.exportAnswerReport(exportAnswerReportRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.      
     * @param exportLiveboardReportRequest 
     */
    public exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<void> {
        const result = this.api.exportLiveboardReport(exportLiveboardReportRequest, _options);
        return result.toPromise();
    }


}



import { ObservableRolesApi } from './ObservableAPI';

import { RolesApiRequestFactory, RolesApiResponseProcessor} from "../apis/RolesApi";
export class PromiseRolesApi {
    private api: ObservableRolesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RolesApiRequestFactory,
        responseProcessor?: RolesApiResponseProcessor
    ) {
        this.api = new ObservableRolesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later
     * @param createRoleRequest 
     */
    public createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.createRole(createRoleRequest, _options);
        return result.toPromise();
    }

    /**
     * Deletes a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     */
    public deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteRole(roleIdentifier, _options);
        return result.toPromise();
    }

    /**
     * Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges. /n  Version: 9.5.0.cl or later
     * @param searchRolesRequest 
     */
    public searchRoles(searchRolesRequest?: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>> {
        const result = this.api.searchRoles(searchRolesRequest, _options);
        return result.toPromise();
    }

    /**
     * Updates a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     * @param updateRoleRequest 
     */
    public updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.updateRole(roleIdentifier, updateRoleRequest, _options);
        return result.toPromise();
    }


}



import { ObservableSchedulesApi } from './ObservableAPI';

import { SchedulesApiRequestFactory, SchedulesApiResponseProcessor} from "../apis/SchedulesApi";
export class PromiseSchedulesApi {
    private api: ObservableSchedulesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SchedulesApiRequestFactory,
        responseProcessor?: SchedulesApiResponseProcessor
    ) {
        this.api = new ObservableSchedulesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *  Create schedule. /n  Version: 9.4.0.cl or later  Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).      
     * @param createScheduleRequest 
     */
    public createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule> {
        const result = this.api.createSchedule(createScheduleRequest, _options);
        return result.toPromise();
    }

    /**
     *  Deletes a scheduled job. /n  Version: 9.4.0.cl or later  Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.         
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    public deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteSchedule(scheduleIdentifier, _options);
        return result.toPromise();
    }

    /**
     *  Search Schedules /n  Version: 9.4.0.cl or later  Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.      
     * @param searchSchedulesRequest 
     */
    public searchSchedules(searchSchedulesRequest?: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>> {
        const result = this.api.searchSchedules(searchSchedulesRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update schedule. /n  Version: 9.4.0.cl or later  Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest 
     */
    public updateSchedule(scheduleIdentifier: string, updateScheduleRequest?: UpdateScheduleRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);
        return result.toPromise();
    }


}



import { ObservableSecurityApi } from './ObservableAPI';

import { SecurityApiRequestFactory, SecurityApiResponseProcessor} from "../apis/SecurityApi";
export class PromiseSecurityApi {
    private api: ObservableSecurityApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SecurityApiRequestFactory,
        responseProcessor?: SecurityApiResponseProcessor
    ) {
        this.api = new ObservableSecurityApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param assignChangeAuthorRequest 
     */
    public assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignChangeAuthor(assignChangeAuthorRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<any> {
        const result = this.api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     * @param fetchPermissionsOnMetadataRequest 
     */
    public fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<any> {
        const result = this.api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.      
     * @param shareMetadataRequest 
     */
    public shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.shareMetadata(shareMetadataRequest, _options);
        return result.toPromise();
    }


}



import { ObservableSystemApi } from './ObservableAPI';

import { SystemApiRequestFactory, SystemApiResponseProcessor} from "../apis/SystemApi";
export class PromiseSystemApi {
    private api: ObservableSystemApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SystemApiRequestFactory,
        responseProcessor?: SystemApiResponseProcessor
    ) {
        this.api = new ObservableSystemApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.      
     */
    public getSystemConfig(_options?: Configuration): Promise<SystemConfig> {
        const result = this.api.getSystemConfig(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemInformation(_options?: Configuration): Promise<SystemInfo> {
        const result = this.api.getSystemInformation(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemOverrideInfo(_options?: Configuration): Promise<any> {
        const result = this.api.getSystemOverrideInfo(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.      
     * @param updateSystemConfigRequest 
     */
    public updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSystemConfig(updateSystemConfigRequest, _options);
        return result.toPromise();
    }


}



import { ObservableTagsApi } from './ObservableAPI';

import { TagsApiRequestFactory, TagsApiResponseProcessor} from "../apis/TagsApi";
export class PromiseTagsApi {
    private api: ObservableTagsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TagsApiRequestFactory,
        responseProcessor?: TagsApiResponseProcessor
    ) {
        this.api = new ObservableTagsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param createTagRequest 
     */
    public createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag> {
        const result = this.api.createTag(createTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    public deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteTag(tagIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      
     * @param searchTagsRequest 
     */
    public searchTags(searchTagsRequest?: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>> {
        const result = this.api.searchTags(searchTagsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unassignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest 
     */
    public updateTag(tagIdentifier: string, updateTagRequest?: UpdateTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateTag(tagIdentifier, updateTagRequest, _options);
        return result.toPromise();
    }


}



import { ObservableThoughtSpotRestApi } from './ObservableAPI';

import { ThoughtSpotRestApiRequestFactory, ThoughtSpotRestApiResponseProcessor} from "../apis/ThoughtSpotRestApi";
export class PromiseThoughtSpotRestApi {
    private api: ObservableThoughtSpotRestApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ThoughtSpotRestApiRequestFactory,
        responseProcessor?: ThoughtSpotRestApiResponseProcessor
    ) {
        this.api = new ObservableThoughtSpotRestApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param assignChangeAuthorRequest 
     */
    public assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignChangeAuthor(assignChangeAuthorRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param changeUserPasswordRequest 
     */
    public changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.changeUserPassword(changeUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).      
     * @param commitBranchRequest 
     */
    public commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse> {
        const result = this.api.commitBranch(commitBranchRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).      
     * @param createConfigRequest 
     */
    public createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.createConfig(createConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      
     * @param createConnectionRequest 
     */
    public createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse> {
        const result = this.api.createConnection(createConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later  Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).      
     * @param createCustomActionRequest 
     */
    public createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction> {
        const result = this.api.createCustomAction(createCustomActionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.      
     * @param createOrgRequest 
     */
    public createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse> {
        const result = this.api.createOrg(createOrgRequest, _options);
        return result.toPromise();
    }

    /**
     * Creates a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later
     * @param createRoleRequest 
     */
    public createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.createRole(createRoleRequest, _options);
        return result.toPromise();
    }

    /**
     *  Create schedule. /n  Version: 9.4.0.cl or later  Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).      
     * @param createScheduleRequest 
     */
    public createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule> {
        const result = this.api.createSchedule(createScheduleRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param createTagRequest 
     */
    public createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag> {
        const result = this.api.createTag(createTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param createUserRequest 
     */
    public createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User> {
        const result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      
     * @param createUserGroupRequest 
     */
    public createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse> {
        const result = this.api.createUserGroup(createUserGroupRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param deleteConfigRequest 
     */
    public deleteConfig(deleteConfigRequest?: DeleteConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConfig(deleteConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param deleteConnectionRequest 
     */
    public deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConnection(deleteConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later  Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    public deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteCustomAction(customActionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param deleteMetadataRequest 
     */
    public deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteMetadata(deleteMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      
     * @param orgIdentifier ID or name of the Org
     */
    public deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteOrg(orgIdentifier, _options);
        return result.toPromise();
    }

    /**
     * Deletes a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     */
    public deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteRole(roleIdentifier, _options);
        return result.toPromise();
    }

    /**
     *  Deletes a scheduled job. /n  Version: 9.4.0.cl or later  Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.         
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    public deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteSchedule(scheduleIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    public deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteTag(tagIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param userIdentifier GUID / name of the user
     */
    public deleteUser(userIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUser(userIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param groupIdentifier GUID or name of the group.
     */
    public deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUserGroup(groupIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.      
     * @param deployCommitRequest 
     */
    public deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.deployCommit(deployCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.      
     * @param exportAnswerReportRequest 
     */
    public exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<void> {
        const result = this.api.exportAnswerReport(exportAnswerReportRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.      
     * @param exportLiveboardReportRequest 
     */
    public exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<void> {
        const result = this.api.exportLiveboardReport(exportLiveboardReportRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.      
     * @param exportMetadataTMLRequest 
     */
    public exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.exportMetadataTML(exportMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches data from a saved Answer.  Requires at least view access to the saved Answer.      
     * @param fetchAnswerDataRequest 
     */
    public fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse> {
        const result = this.api.fetchAnswerData(fetchAnswerDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```      
     * @param fetchAnswerSqlQueryRequest 
     */
    public fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.      
     * @param fetchLiveboardDataRequest 
     */
    public fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse> {
        const result = this.api.fetchLiveboardData(fetchLiveboardDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```      
     * @param fetchLiveboardSqlQueryRequest 
     */
    public fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance      
     * @param fetchLogsRequest 
     */
    public fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>> {
        const result = this.api.fetchLogs(fetchLogsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<any> {
        const result = this.api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     * @param fetchPermissionsOnMetadataRequest 
     */
    public fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<any> {
        const result = this.api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param forceLogoutUsersRequest 
     */
    public forceLogoutUsers(forceLogoutUsersRequest?: ForceLogoutUsersRequest, _options?: Configuration): Promise<void> {
        const result = this.api.forceLogoutUsers(forceLogoutUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.      
     */
    public getCurrentUserInfo(_options?: Configuration): Promise<User> {
        const result = this.api.getCurrentUserInfo(_options);
        return result.toPromise();
    }

    /**
     *  Get token for the currently logged-in user. /n  Version: 9.4.0.cl or later  Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.      
     */
    public getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse> {
        const result = this.api.getCurrentUserToken(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param getFullAccessTokenRequest 
     */
    public getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getFullAccessToken(getFullAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param getObjectAccessTokenRequest 
     */
    public getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getObjectAccessToken(getObjectAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.      
     */
    public getSystemConfig(_options?: Configuration): Promise<SystemConfig> {
        const result = this.api.getSystemConfig(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemInformation(_options?: Configuration): Promise<SystemInfo> {
        const result = this.api.getSystemInformation(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemOverrideInfo(_options?: Configuration): Promise<any> {
        const result = this.api.getSystemOverrideInfo(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.      
     * @param importMetadataTMLRequest 
     */
    public importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.importMetadataTML(importMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      
     * @param importUserGroupsRequest 
     */
    public importUserGroups(importUserGroupsRequest?: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse> {
        const result = this.api.importUserGroups(importUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param importUsersRequest 
     */
    public importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse> {
        const result = this.api.importUsers(importUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.      
     * @param loginRequest 
     */
    public login(loginRequest?: LoginRequest, _options?: Configuration): Promise<void> {
        const result = this.api.login(loginRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Logs out a user from their current session.      
     */
    public logout(_options?: Configuration): Promise<void> {
        const result = this.api.logout(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param resetUserPasswordRequest 
     */
    public resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.resetUserPassword(resetUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.      
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest 
     */
    public revertCommit(commitId: string, revertCommitRequest?: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse> {
        const result = this.api.revertCommit(commitId, revertCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param revokeTokenRequest 
     */
    public revokeToken(revokeTokenRequest?: RevokeTokenRequest, _options?: Configuration): Promise<void> {
        const result = this.api.revokeToken(revokeTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param searchCommitsRequest 
     */
    public searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>> {
        const result = this.api.searchCommits(searchCommitsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param searchConfigRequest 
     */
    public searchConfig(searchConfigRequest?: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>> {
        const result = this.api.searchConfig(searchConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`). ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ``` - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   * `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   * `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   * `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   * `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.     
     * @param searchConnectionRequest 
     */
    public searchConnection(searchConnectionRequest?: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>> {
        const result = this.api.searchConnection(searchConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later  Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param searchCustomActionsRequest 
     */
    public searchCustomActions(searchCustomActionsRequest?: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>> {
        const result = this.api.searchCustomActions(searchCustomActionsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```      
     * @param searchDataRequest 
     */
    public searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse> {
        const result = this.api.searchData(searchDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  * To get all metadata objects, send the API request without any attributes. * To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. * To get a specific metadata object, specify the GUID. * To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.      
     * @param searchMetadataRequest 
     */
    public searchMetadata(searchMetadataRequest?: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>> {
        const result = this.api.searchMetadata(searchMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.      
     * @param searchOrgsRequest 
     */
    public searchOrgs(searchOrgsRequest?: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>> {
        const result = this.api.searchOrgs(searchOrgsRequest, _options);
        return result.toPromise();
    }

    /**
     * Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges. /n  Version: 9.5.0.cl or later
     * @param searchRolesRequest 
     */
    public searchRoles(searchRolesRequest?: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>> {
        const result = this.api.searchRoles(searchRolesRequest, _options);
        return result.toPromise();
    }

    /**
     *  Search Schedules /n  Version: 9.4.0.cl or later  Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.      
     * @param searchSchedulesRequest 
     */
    public searchSchedules(searchSchedulesRequest?: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>> {
        const result = this.api.searchSchedules(searchSchedulesRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      
     * @param searchTagsRequest 
     */
    public searchTags(searchTagsRequest?: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>> {
        const result = this.api.searchTags(searchTagsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.      
     * @param searchUserGroupsRequest 
     */
    public searchUserGroups(searchUserGroupsRequest?: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>> {
        const result = this.api.searchUserGroups(searchUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.      
     * @param searchUsersRequest 
     */
    public searchUsers(searchUsersRequest?: SearchUsersRequest, _options?: Configuration): Promise<Array<User>> {
        const result = this.api.searchUsers(searchUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.      
     * @param shareMetadataRequest 
     */
    public shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.shareMetadata(shareMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unassignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param updateConfigRequest 
     */
    public updateConfig(updateConfigRequest?: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.updateConfig(updateConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param updateConnectionRequest 
     */
    public updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateConnection(updateConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later  Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).      
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest 
     */
    public updateCustomAction(customActionIdentifier: string, updateCustomActionRequest?: UpdateCustomActionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.      
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest 
     */
    public updateOrg(orgIdentifier: string, updateOrgRequest?: UpdateOrgRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateOrg(orgIdentifier, updateOrgRequest, _options);
        return result.toPromise();
    }

    /**
     * Updates a Role. Requires cluster Administration or Role Administration privileges. /n  Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     * @param updateRoleRequest 
     */
    public updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.updateRole(roleIdentifier, updateRoleRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update schedule. /n  Version: 9.4.0.cl or later  Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest 
     */
    public updateSchedule(scheduleIdentifier: string, updateScheduleRequest?: UpdateScheduleRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.      
     * @param updateSystemConfigRequest 
     */
    public updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSystemConfig(updateSystemConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest 
     */
    public updateTag(tagIdentifier: string, updateTagRequest?: UpdateTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateTag(tagIdentifier, updateTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest 
     */
    public updateUser(userIdentifier: string, updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUser(userIdentifier, updateUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest 
     */
    public updateUserGroup(groupIdentifier: string, updateUserGroupRequest?: UpdateUserGroupRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param validateMergeRequest 
     */
    public validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.validateMerge(validateMergeRequest, _options);
        return result.toPromise();
    }


}



import { ObservableUsersApi } from './ObservableAPI';

import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";
export class PromiseUsersApi {
    private api: ObservableUsersApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UsersApiRequestFactory,
        responseProcessor?: UsersApiResponseProcessor
    ) {
        this.api = new ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later  Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param changeUserPasswordRequest 
     */
    public changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.changeUserPassword(changeUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param createUserRequest 
     */
    public createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User> {
        const result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param userIdentifier GUID / name of the user
     */
    public deleteUser(userIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUser(userIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param forceLogoutUsersRequest 
     */
    public forceLogoutUsers(forceLogoutUsersRequest?: ForceLogoutUsersRequest, _options?: Configuration): Promise<void> {
        const result = this.api.forceLogoutUsers(forceLogoutUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param importUsersRequest 
     */
    public importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse> {
        const result = this.api.importUsers(importUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param resetUserPasswordRequest 
     */
    public resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.resetUserPassword(resetUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.      
     * @param searchUsersRequest 
     */
    public searchUsers(searchUsersRequest?: SearchUsersRequest, _options?: Configuration): Promise<Array<User>> {
        const result = this.api.searchUsers(searchUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later  Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest 
     */
    public updateUser(userIdentifier: string, updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUser(userIdentifier, updateUserRequest, _options);
        return result.toPromise();
    }


}



import { ObservableVersionControlApi } from './ObservableAPI';

import { VersionControlApiRequestFactory, VersionControlApiResponseProcessor} from "../apis/VersionControlApi";
export class PromiseVersionControlApi {
    private api: ObservableVersionControlApi

    public constructor(
        configuration: Configuration,
        requestFactory?: VersionControlApiRequestFactory,
        responseProcessor?: VersionControlApiResponseProcessor
    ) {
        this.api = new ObservableVersionControlApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.2.0.cl or later  Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).      
     * @param commitBranchRequest 
     */
    public commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse> {
        const result = this.api.commitBranch(commitBranchRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).      
     * @param createConfigRequest 
     */
    public createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.createConfig(createConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param deleteConfigRequest 
     */
    public deleteConfig(deleteConfigRequest?: DeleteConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConfig(deleteConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.      
     * @param deployCommitRequest 
     */
    public deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.deployCommit(deployCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.      
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest 
     */
    public revertCommit(commitId: string, revertCommitRequest?: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse> {
        const result = this.api.revertCommit(commitId, revertCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param searchCommitsRequest 
     */
    public searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>> {
        const result = this.api.searchCommits(searchCommitsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param searchConfigRequest 
     */
    public searchConfig(searchConfigRequest?: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>> {
        const result = this.api.searchConfig(searchConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param updateConfigRequest 
     */
    public updateConfig(updateConfigRequest?: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.updateConfig(updateConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later  Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.      
     * @param validateMergeRequest 
     */
    public validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.validateMerge(validateMergeRequest, _options);
        return result.toPromise();
    }


}



