// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AnswerDataResponse } from '../models/AnswerDataResponse';
import { AssignChangeAuthorRequest } from '../models/AssignChangeAuthorRequest';
import { AssignTagRequest } from '../models/AssignTagRequest';
import { ChangeUserPasswordRequest } from '../models/ChangeUserPasswordRequest';
import { CreateOrgRequest } from '../models/CreateOrgRequest';
import { CreateTagRequest } from '../models/CreateTagRequest';
import { CreateUserGroupRequest } from '../models/CreateUserGroupRequest';
import { CreateUserRequest } from '../models/CreateUserRequest';
import { DeleteMetadataRequest } from '../models/DeleteMetadataRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { ExportAnswerReportRequest } from '../models/ExportAnswerReportRequest';
import { ExportLiveboardReportRequest } from '../models/ExportLiveboardReportRequest';
import { ExportMetadataTMLRequest } from '../models/ExportMetadataTMLRequest';
import { FetchAnswerDataRequest } from '../models/FetchAnswerDataRequest';
import { FetchAnswerSqlQueryRequest } from '../models/FetchAnswerSqlQueryRequest';
import { FetchLiveboardDataRequest } from '../models/FetchLiveboardDataRequest';
import { FetchLiveboardSqlQueryRequest } from '../models/FetchLiveboardSqlQueryRequest';
import { FetchLogsRequest } from '../models/FetchLogsRequest';
import { FetchPermissionsOfPrincipalsRequest } from '../models/FetchPermissionsOfPrincipalsRequest';
import { FetchPermissionsOnMetadataRequest } from '../models/FetchPermissionsOnMetadataRequest';
import { ForceLogoutUsersRequest } from '../models/ForceLogoutUsersRequest';
import { GetFullAccessTokenRequest } from '../models/GetFullAccessTokenRequest';
import { GetObjectAccessTokenRequest } from '../models/GetObjectAccessTokenRequest';
import { ImportMetadataTMLRequest } from '../models/ImportMetadataTMLRequest';
import { ImportUserGroupsRequest } from '../models/ImportUserGroupsRequest';
import { ImportUserGroupsResponse } from '../models/ImportUserGroupsResponse';
import { ImportUsersRequest } from '../models/ImportUsersRequest';
import { ImportUsersResponse } from '../models/ImportUsersResponse';
import { LiveboardDataResponse } from '../models/LiveboardDataResponse';
import { LogResponse } from '../models/LogResponse';
import { LoginRequest } from '../models/LoginRequest';
import { MetadataSearchResponse } from '../models/MetadataSearchResponse';
import { OrgResponse } from '../models/OrgResponse';
import { ResetUserPasswordRequest } from '../models/ResetUserPasswordRequest';
import { RevokeTokenRequest } from '../models/RevokeTokenRequest';
import { SearchDataRequest } from '../models/SearchDataRequest';
import { SearchDataResponse } from '../models/SearchDataResponse';
import { SearchMetadataRequest } from '../models/SearchMetadataRequest';
import { SearchOrgsRequest } from '../models/SearchOrgsRequest';
import { SearchTagsRequest } from '../models/SearchTagsRequest';
import { SearchUserGroupsRequest } from '../models/SearchUserGroupsRequest';
import { SearchUsersRequest } from '../models/SearchUsersRequest';
import { ShareMetadataRequest } from '../models/ShareMetadataRequest';
import { SqlQueryResponse } from '../models/SqlQueryResponse';
import { SystemConfig } from '../models/SystemConfig';
import { SystemInfo } from '../models/SystemInfo';
import { Tag } from '../models/Tag';
import { Token } from '../models/Token';
import { UpdateOrgRequest } from '../models/UpdateOrgRequest';
import { UpdateTagRequest } from '../models/UpdateTagRequest';
import { UpdateUserGroupRequest } from '../models/UpdateUserGroupRequest';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { User } from '../models/User';
import { UserGroupResponse } from '../models/UserGroupResponse';

/**
 * no description
 */
export class Class900ClApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param assignChangeAuthorRequest 
     */
    public async assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assignChangeAuthorRequest' is not null or undefined
        if (assignChangeAuthorRequest === null || assignChangeAuthorRequest === undefined) {
            throw new RequiredError("Class900ClApi", "assignChangeAuthor", "assignChangeAuthorRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/assign';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assignChangeAuthorRequest, "AssignChangeAuthorRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.     #### Endpoint URL 
     * @param assignTagRequest 
     */
    public async assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assignTagRequest' is not null or undefined
        if (assignTagRequest === null || assignTagRequest === undefined) {
            throw new RequiredError("Class900ClApi", "assignTag", "assignTagRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/tags/assign';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assignTagRequest, "AssignTagRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param changeUserPasswordRequest 
     */
    public async changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'changeUserPasswordRequest' is not null or undefined
        if (changeUserPasswordRequest === null || changeUserPasswordRequest === undefined) {
            throw new RequiredError("Class900ClApi", "changeUserPassword", "changeUserPasswordRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/users/change-password';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(changeUserPasswordRequest, "ChangeUserPasswordRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.     #### Endpoint URL 
     * @param createOrgRequest 
     */
    public async createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createOrgRequest' is not null or undefined
        if (createOrgRequest === null || createOrgRequest === undefined) {
            throw new RequiredError("Class900ClApi", "createOrg", "createOrgRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/orgs/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createOrgRequest, "CreateOrgRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param createTagRequest 
     */
    public async createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createTagRequest' is not null or undefined
        if (createTagRequest === null || createTagRequest === undefined) {
            throw new RequiredError("Class900ClApi", "createTag", "createTagRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/tags/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createTagRequest, "CreateTagRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param createUserRequest 
     */
    public async createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createUserRequest' is not null or undefined
        if (createUserRequest === null || createUserRequest === undefined) {
            throw new RequiredError("Class900ClApi", "createUser", "createUserRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/users/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createUserRequest, "CreateUserRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard     #### Endpoint URL 
     * @param createUserGroupRequest 
     */
    public async createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createUserGroupRequest' is not null or undefined
        if (createUserGroupRequest === null || createUserGroupRequest === undefined) {
            throw new RequiredError("Class900ClApi", "createUserGroup", "createUserGroupRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/groups/create';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createUserGroupRequest, "CreateUserGroupRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param deleteMetadataRequest 
     */
    public async deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'deleteMetadataRequest' is not null or undefined
        if (deleteMetadataRequest === null || deleteMetadataRequest === undefined) {
            throw new RequiredError("Class900ClApi", "deleteMetadata", "deleteMetadataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/delete';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(deleteMetadataRequest, "DeleteMetadataRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.     #### Endpoint URL 
     * @param orgIdentifier ID or name of the Org.
     */
    public async deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'orgIdentifier' is not null or undefined
        if (orgIdentifier === null || orgIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "deleteOrg", "orgIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/orgs/{org_identifier}/delete'
            .replace('{' + 'org_identifier' + '}', encodeURIComponent(String(orgIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    public async deleteTag(tagIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tagIdentifier' is not null or undefined
        if (tagIdentifier === null || tagIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "deleteTag", "tagIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/tags/{tag_identifier}/delete'
            .replace('{' + 'tag_identifier' + '}', encodeURIComponent(String(tagIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param userIdentifier GUID / name of the user
     */
    public async deleteUser(userIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userIdentifier' is not null or undefined
        if (userIdentifier === null || userIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "deleteUser", "userIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/users/{user_identifier}/delete'
            .replace('{' + 'user_identifier' + '}', encodeURIComponent(String(userIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param groupIdentifier GUID or name of the group.
     */
    public async deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupIdentifier' is not null or undefined
        if (groupIdentifier === null || groupIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "deleteUserGroup", "groupIdentifier");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/groups/{group_identifier}/delete'
            .replace('{' + 'group_identifier' + '}', encodeURIComponent(String(groupIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.     #### Endpoint URL 
     * @param exportAnswerReportRequest 
     */
    public async exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'exportAnswerReportRequest' is not null or undefined
        if (exportAnswerReportRequest === null || exportAnswerReportRequest === undefined) {
            throw new RequiredError("Class900ClApi", "exportAnswerReport", "exportAnswerReportRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/report/answer';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(exportAnswerReportRequest, "ExportAnswerReportRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.     #### Endpoint URL 
     * @param exportLiveboardReportRequest 
     */
    public async exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'exportLiveboardReportRequest' is not null or undefined
        if (exportLiveboardReportRequest === null || exportLiveboardReportRequest === undefined) {
            throw new RequiredError("Class900ClApi", "exportLiveboardReport", "exportLiveboardReportRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/report/liveboard';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(exportLiveboardReportRequest, "ExportLiveboardReportRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.     #### Endpoint URL 
     * @param exportMetadataTMLRequest 
     */
    public async exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'exportMetadataTMLRequest' is not null or undefined
        if (exportMetadataTMLRequest === null || exportMetadataTMLRequest === undefined) {
            throw new RequiredError("Class900ClApi", "exportMetadataTML", "exportMetadataTMLRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/tml/export';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(exportMetadataTMLRequest, "ExportMetadataTMLRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches data from a saved Answer.  Requires at least view access to the saved Answer.     #### Endpoint URL 
     * @param fetchAnswerDataRequest 
     */
    public async fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchAnswerDataRequest' is not null or undefined
        if (fetchAnswerDataRequest === null || fetchAnswerDataRequest === undefined) {
            throw new RequiredError("Class900ClApi", "fetchAnswerData", "fetchAnswerDataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/answer/data';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchAnswerDataRequest, "FetchAnswerDataRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```     #### Endpoint URL 
     * @param fetchAnswerSqlQueryRequest 
     */
    public async fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchAnswerSqlQueryRequest' is not null or undefined
        if (fetchAnswerSqlQueryRequest === null || fetchAnswerSqlQueryRequest === undefined) {
            throw new RequiredError("Class900ClApi", "fetchAnswerSqlQuery", "fetchAnswerSqlQueryRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/answer/sql';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchAnswerSqlQueryRequest, "FetchAnswerSqlQueryRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.     #### Endpoint URL 
     * @param fetchLiveboardDataRequest 
     */
    public async fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchLiveboardDataRequest' is not null or undefined
        if (fetchLiveboardDataRequest === null || fetchLiveboardDataRequest === undefined) {
            throw new RequiredError("Class900ClApi", "fetchLiveboardData", "fetchLiveboardDataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/liveboard/data';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchLiveboardDataRequest, "FetchLiveboardDataRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```     #### Endpoint URL 
     * @param fetchLiveboardSqlQueryRequest 
     */
    public async fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchLiveboardSqlQueryRequest' is not null or undefined
        if (fetchLiveboardSqlQueryRequest === null || fetchLiveboardSqlQueryRequest === undefined) {
            throw new RequiredError("Class900ClApi", "fetchLiveboardSqlQuery", "fetchLiveboardSqlQueryRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/liveboard/sql';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchLiveboardSqlQueryRequest, "FetchLiveboardSqlQueryRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance     #### Endpoint URL 
     * @param fetchLogsRequest 
     */
    public async fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchLogsRequest' is not null or undefined
        if (fetchLogsRequest === null || fetchLogsRequest === undefined) {
            throw new RequiredError("Class900ClApi", "fetchLogs", "fetchLogsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/logs/fetch';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchLogsRequest, "FetchLogsRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.       #### Endpoint URL 
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public async fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchPermissionsOfPrincipalsRequest' is not null or undefined
        if (fetchPermissionsOfPrincipalsRequest === null || fetchPermissionsOfPrincipalsRequest === undefined) {
            throw new RequiredError("Class900ClApi", "fetchPermissionsOfPrincipals", "fetchPermissionsOfPrincipalsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/principals/fetch-permissions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchPermissionsOfPrincipalsRequest, "FetchPermissionsOfPrincipalsRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.     #### Endpoint URL 
     * @param fetchPermissionsOnMetadataRequest 
     */
    public async fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchPermissionsOnMetadataRequest' is not null or undefined
        if (fetchPermissionsOnMetadataRequest === null || fetchPermissionsOnMetadataRequest === undefined) {
            throw new RequiredError("Class900ClApi", "fetchPermissionsOnMetadata", "fetchPermissionsOnMetadataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/fetch-permissions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchPermissionsOnMetadataRequest, "FetchPermissionsOnMetadataRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param forceLogoutUsersRequest 
     */
    public async forceLogoutUsers(forceLogoutUsersRequest?: ForceLogoutUsersRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/users/force-logout';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(forceLogoutUsersRequest, "ForceLogoutUsersRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.     #### Endpoint URL 
     */
    public async getCurrentUserInfo(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/rest/2.0/auth/session/user';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param getFullAccessTokenRequest 
     */
    public async getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'getFullAccessTokenRequest' is not null or undefined
        if (getFullAccessTokenRequest === null || getFullAccessTokenRequest === undefined) {
            throw new RequiredError("Class900ClApi", "getFullAccessToken", "getFullAccessTokenRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/auth/token/full';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(getFullAccessTokenRequest, "GetFullAccessTokenRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param getObjectAccessTokenRequest 
     */
    public async getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'getObjectAccessTokenRequest' is not null or undefined
        if (getObjectAccessTokenRequest === null || getObjectAccessTokenRequest === undefined) {
            throw new RequiredError("Class900ClApi", "getObjectAccessToken", "getObjectAccessTokenRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/auth/token/object';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(getObjectAccessTokenRequest, "GetObjectAccessTokenRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.     #### Endpoint URL 
     */
    public async getSystemConfig(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/rest/2.0/system/config';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.       #### Endpoint URL 
     */
    public async getSystemInformation(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/rest/2.0/system';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.     #### Endpoint URL 
     * @param importMetadataTMLRequest 
     */
    public async importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'importMetadataTMLRequest' is not null or undefined
        if (importMetadataTMLRequest === null || importMetadataTMLRequest === undefined) {
            throw new RequiredError("Class900ClApi", "importMetadataTML", "importMetadataTMLRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/tml/import';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(importMetadataTMLRequest, "ImportMetadataTMLRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.     #### Endpoint URL 
     * @param importUserGroupsRequest 
     */
    public async importUserGroups(importUserGroupsRequest?: ImportUserGroupsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/groups/import';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(importUserGroupsRequest, "ImportUserGroupsRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param importUsersRequest 
     */
    public async importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'importUsersRequest' is not null or undefined
        if (importUsersRequest === null || importUsersRequest === undefined) {
            throw new RequiredError("Class900ClApi", "importUsers", "importUsersRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/users/import';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(importUsersRequest, "ImportUsersRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.     #### Endpoint URL 
     * @param loginRequest 
     */
    public async login(loginRequest?: LoginRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/auth/session/login';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(loginRequest, "LoginRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Logs out a user from their current session.     #### Endpoint URL 
     */
    public async logout(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/rest/2.0/auth/session/logout';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param resetUserPasswordRequest 
     */
    public async resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'resetUserPasswordRequest' is not null or undefined
        if (resetUserPasswordRequest === null || resetUserPasswordRequest === undefined) {
            throw new RequiredError("Class900ClApi", "resetUserPassword", "resetUserPasswordRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/users/reset-password';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resetUserPasswordRequest, "ResetUserPasswordRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).     #### Endpoint URL 
     * @param revokeTokenRequest 
     */
    public async revokeToken(revokeTokenRequest?: RevokeTokenRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/auth/token/revoke';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(revokeTokenRequest, "RevokeTokenRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```     #### Endpoint URL 
     * @param searchDataRequest 
     */
    public async searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'searchDataRequest' is not null or undefined
        if (searchDataRequest === null || searchDataRequest === undefined) {
            throw new RequiredError("Class900ClApi", "searchData", "searchDataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/searchdata';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchDataRequest, "SearchDataRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  * To get all metadata objects, send the API request without any attributes. * To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. * To get a specific metadata object, specify the GUID. * To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.     #### Endpoint URL 
     * @param searchMetadataRequest 
     */
    public async searchMetadata(searchMetadataRequest?: SearchMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/metadata/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchMetadataRequest, "SearchMetadataRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.     #### Endpoint URL 
     * @param searchOrgsRequest 
     */
    public async searchOrgs(searchOrgsRequest?: SearchOrgsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/orgs/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchOrgsRequest, "SearchOrgsRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.     #### Endpoint URL 
     * @param searchTagsRequest 
     */
    public async searchTags(searchTagsRequest?: SearchTagsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/tags/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchTagsRequest, "SearchTagsRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.     #### Endpoint URL 
     * @param searchUserGroupsRequest 
     */
    public async searchUserGroups(searchUserGroupsRequest?: SearchUserGroupsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/groups/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchUserGroupsRequest, "SearchUserGroupsRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.     #### Endpoint URL 
     * @param searchUsersRequest 
     */
    public async searchUsers(searchUsersRequest?: SearchUsersRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/rest/2.0/users/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(searchUsersRequest, "SearchUsersRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.     #### Endpoint URL 
     * @param shareMetadataRequest 
     */
    public async shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'shareMetadataRequest' is not null or undefined
        if (shareMetadataRequest === null || shareMetadataRequest === undefined) {
            throw new RequiredError("Class900ClApi", "shareMetadata", "shareMetadataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/share';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(shareMetadataRequest, "ShareMetadataRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.     #### Endpoint URL 
     * @param assignTagRequest 
     */
    public async unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assignTagRequest' is not null or undefined
        if (assignTagRequest === null || assignTagRequest === undefined) {
            throw new RequiredError("Class900ClApi", "unassignTag", "assignTagRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/tags/unassign';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assignTagRequest, "AssignTagRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.     #### Endpoint URL 
     * @param orgIdentifier ID or name of the Org.
     * @param updateOrgRequest 
     */
    public async updateOrg(orgIdentifier: string, updateOrgRequest?: UpdateOrgRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'orgIdentifier' is not null or undefined
        if (orgIdentifier === null || orgIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "updateOrg", "orgIdentifier");
        }



        // Path Params
        const localVarPath = '/api/rest/2.0/orgs/{org_identifier}/update'
            .replace('{' + 'org_identifier' + '}', encodeURIComponent(String(orgIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateOrgRequest, "UpdateOrgRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest 
     */
    public async updateTag(tagIdentifier: string, updateTagRequest?: UpdateTagRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tagIdentifier' is not null or undefined
        if (tagIdentifier === null || tagIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "updateTag", "tagIdentifier");
        }



        // Path Params
        const localVarPath = '/api/rest/2.0/tags/{tag_identifier}/update'
            .replace('{' + 'tag_identifier' + '}', encodeURIComponent(String(tagIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateTagRequest, "UpdateTagRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.     #### Endpoint URL 
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest 
     */
    public async updateUser(userIdentifier: string, updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'userIdentifier' is not null or undefined
        if (userIdentifier === null || userIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "updateUser", "userIdentifier");
        }



        // Path Params
        const localVarPath = '/api/rest/2.0/users/{user_identifier}/update'
            .replace('{' + 'user_identifier' + '}', encodeURIComponent(String(userIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateUserRequest, "UpdateUserRequest", ""),
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
     *   <span class=\"since-beta-tag\">Version: 9.0.0.cl or later</span>  Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings     #### Endpoint URL 
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest 
     */
    public async updateUserGroup(groupIdentifier: string, updateUserGroupRequest?: UpdateUserGroupRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'groupIdentifier' is not null or undefined
        if (groupIdentifier === null || groupIdentifier === undefined) {
            throw new RequiredError("Class900ClApi", "updateUserGroup", "groupIdentifier");
        }



        // Path Params
        const localVarPath = '/api/rest/2.0/groups/{group_identifier}/update'
            .replace('{' + 'group_identifier' + '}', encodeURIComponent(String(groupIdentifier)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client")
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateUserGroupRequest, "UpdateUserGroupRequest", ""),
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

export class Class900ClApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assignChangeAuthor
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assignChangeAuthor(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to assignTag
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assignTag(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to changeUserPassword
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async changeUserPassword(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to createOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createOrg(response: ResponseContext): Promise<OrgResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: OrgResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "OrgResponse", ""
            ) as OrgResponse;
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
            const body: OrgResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "OrgResponse", ""
            ) as OrgResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createTag
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createTag(response: ResponseContext): Promise<Tag > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Tag = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tag", ""
            ) as Tag;
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
            const body: Tag = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Tag", ""
            ) as Tag;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createUser(response: ResponseContext): Promise<User > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: User = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "User", ""
            ) as User;
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
            const body: User = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "User", ""
            ) as User;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createUserGroup(response: ResponseContext): Promise<UserGroupResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UserGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UserGroupResponse", ""
            ) as UserGroupResponse;
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
            const body: UserGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UserGroupResponse", ""
            ) as UserGroupResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteMetadata(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to deleteOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteOrg(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to deleteTag
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteTag(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to deleteUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteUser(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to deleteUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteUserGroup(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to exportAnswerReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async exportAnswerReport(response: ResponseContext): Promise<any > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
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
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportLiveboardReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async exportLiveboardReport(response: ResponseContext): Promise<any > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
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
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportMetadataTML
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async exportMetadataTML(response: ResponseContext): Promise<Array<any> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<any> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<any>", ""
            ) as Array<any>;
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
            const body: Array<any> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<any>", ""
            ) as Array<any>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAnswerData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchAnswerData(response: ResponseContext): Promise<AnswerDataResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AnswerDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnswerDataResponse", ""
            ) as AnswerDataResponse;
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
            const body: AnswerDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnswerDataResponse", ""
            ) as AnswerDataResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAnswerSqlQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchAnswerSqlQuery(response: ResponseContext): Promise<SqlQueryResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SqlQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SqlQueryResponse", ""
            ) as SqlQueryResponse;
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
            const body: SqlQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SqlQueryResponse", ""
            ) as SqlQueryResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLiveboardData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchLiveboardData(response: ResponseContext): Promise<LiveboardDataResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LiveboardDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LiveboardDataResponse", ""
            ) as LiveboardDataResponse;
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
            const body: LiveboardDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LiveboardDataResponse", ""
            ) as LiveboardDataResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLiveboardSqlQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchLiveboardSqlQuery(response: ResponseContext): Promise<SqlQueryResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SqlQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SqlQueryResponse", ""
            ) as SqlQueryResponse;
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
            const body: SqlQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SqlQueryResponse", ""
            ) as SqlQueryResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLogs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchLogs(response: ResponseContext): Promise<Array<LogResponse> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<LogResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<LogResponse>", ""
            ) as Array<LogResponse>;
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
            const body: Array<LogResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<LogResponse>", ""
            ) as Array<LogResponse>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOfPrincipals
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchPermissionsOfPrincipals(response: ResponseContext): Promise<any > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
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
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOnMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchPermissionsOnMetadata(response: ResponseContext): Promise<any > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
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
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to forceLogoutUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async forceLogoutUsers(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to getCurrentUserInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getCurrentUserInfo(response: ResponseContext): Promise<User > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: User = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "User", ""
            ) as User;
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
            const body: User = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "User", ""
            ) as User;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getFullAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getFullAccessToken(response: ResponseContext): Promise<Token > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Token = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Token", ""
            ) as Token;
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
            const body: Token = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Token", ""
            ) as Token;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getObjectAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getObjectAccessToken(response: ResponseContext): Promise<Token > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Token = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Token", ""
            ) as Token;
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
            const body: Token = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Token", ""
            ) as Token;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getSystemConfig(response: ResponseContext): Promise<SystemConfig > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SystemConfig = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SystemConfig", ""
            ) as SystemConfig;
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
            const body: SystemConfig = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SystemConfig", ""
            ) as SystemConfig;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemInformation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getSystemInformation(response: ResponseContext): Promise<SystemInfo > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SystemInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SystemInfo", ""
            ) as SystemInfo;
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
            const body: SystemInfo = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SystemInfo", ""
            ) as SystemInfo;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importMetadataTML
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async importMetadataTML(response: ResponseContext): Promise<Array<any> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<any> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<any>", ""
            ) as Array<any>;
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
            const body: Array<any> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<any>", ""
            ) as Array<any>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importUserGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async importUserGroups(response: ResponseContext): Promise<ImportUserGroupsResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ImportUserGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ImportUserGroupsResponse", ""
            ) as ImportUserGroupsResponse;
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
            const body: ImportUserGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ImportUserGroupsResponse", ""
            ) as ImportUserGroupsResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async importUsers(response: ResponseContext): Promise<ImportUsersResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ImportUsersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ImportUsersResponse", ""
            ) as ImportUsersResponse;
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
            const body: ImportUsersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ImportUsersResponse", ""
            ) as ImportUsersResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to login
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async login(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to logout
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async logout(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to resetUserPassword
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resetUserPassword(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to revokeToken
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async revokeToken(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to searchData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchData(response: ResponseContext): Promise<SearchDataResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: SearchDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SearchDataResponse", ""
            ) as SearchDataResponse;
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
            const body: SearchDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "SearchDataResponse", ""
            ) as SearchDataResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchMetadata(response: ResponseContext): Promise<Array<MetadataSearchResponse> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<MetadataSearchResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<MetadataSearchResponse>", ""
            ) as Array<MetadataSearchResponse>;
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
            const body: Array<MetadataSearchResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<MetadataSearchResponse>", ""
            ) as Array<MetadataSearchResponse>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchOrgs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchOrgs(response: ResponseContext): Promise<Array<OrgResponse> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<OrgResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<OrgResponse>", ""
            ) as Array<OrgResponse>;
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
            const body: Array<OrgResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<OrgResponse>", ""
            ) as Array<OrgResponse>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchTags
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchTags(response: ResponseContext): Promise<Array<Tag> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<Tag> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<Tag>", ""
            ) as Array<Tag>;
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
            const body: Array<Tag> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<Tag>", ""
            ) as Array<Tag>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchUserGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchUserGroups(response: ResponseContext): Promise<Array<UserGroupResponse> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<UserGroupResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<UserGroupResponse>", ""
            ) as Array<UserGroupResponse>;
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
            const body: Array<UserGroupResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<UserGroupResponse>", ""
            ) as Array<UserGroupResponse>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async searchUsers(response: ResponseContext): Promise<Array<User> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<User> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<User>", ""
            ) as Array<User>;
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
            const body: Array<User> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<User>", ""
            ) as Array<User>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to shareMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async shareMetadata(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to unassignTag
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async unassignTag(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to updateOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateOrg(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to updateTag
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateTag(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to updateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateUser(response: ResponseContext): Promise<void > {
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
     * @params response Response returned by the server for a request to updateUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateUserGroup(response: ResponseContext): Promise<void > {
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
