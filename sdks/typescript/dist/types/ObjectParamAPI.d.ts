import { Configuration } from '../configuration';
import { AnswerDataResponse } from '../models/AnswerDataResponse';
import { AssignChangeAuthorRequest } from '../models/AssignChangeAuthorRequest';
import { AssignTagRequest } from '../models/AssignTagRequest';
import { ChangeUserPasswordRequest } from '../models/ChangeUserPasswordRequest';
import { CommitBranchRequest } from '../models/CommitBranchRequest';
import { CommitHistoryResponse } from '../models/CommitHistoryResponse';
import { CommitResponse } from '../models/CommitResponse';
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
import { DeleteConfigRequest } from '../models/DeleteConfigRequest';
import { DeleteConnectionRequest } from '../models/DeleteConnectionRequest';
import { DeleteMetadataRequest } from '../models/DeleteMetadataRequest';
import { DeployCommitRequest } from '../models/DeployCommitRequest';
import { DeployResponse } from '../models/DeployResponse';
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
import { GetTokenResponse } from '../models/GetTokenResponse';
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
import { RepoConfigObject } from '../models/RepoConfigObject';
import { ResetUserPasswordRequest } from '../models/ResetUserPasswordRequest';
import { ResponseCustomAction } from '../models/ResponseCustomAction';
import { ResponseSchedule } from '../models/ResponseSchedule';
import { RevertCommitRequest } from '../models/RevertCommitRequest';
import { RevertResponse } from '../models/RevertResponse';
import { RevokeTokenRequest } from '../models/RevokeTokenRequest';
import { RoleResponse } from '../models/RoleResponse';
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
import { SqlQueryResponse } from '../models/SqlQueryResponse';
import { SystemConfig } from '../models/SystemConfig';
import { SystemInfo } from '../models/SystemInfo';
import { Tag } from '../models/Tag';
import { Token } from '../models/Token';
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
import { UserGroupResponse } from '../models/UserGroupResponse';
import { ValidateMergeRequest } from '../models/ValidateMergeRequest';
import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor } from "../apis/AuthenticationApi";
export interface AuthenticationApiGetCurrentUserInfoRequest {
}
export interface AuthenticationApiGetCurrentUserTokenRequest {
}
export interface AuthenticationApiGetFullAccessTokenRequest {
    getFullAccessTokenRequest: GetFullAccessTokenRequest;
}
export interface AuthenticationApiGetObjectAccessTokenRequest {
    getObjectAccessTokenRequest: GetObjectAccessTokenRequest;
}
export interface AuthenticationApiLoginRequest {
    loginRequest?: LoginRequest;
}
export interface AuthenticationApiLogoutRequest {
}
export interface AuthenticationApiRevokeTokenRequest {
    revokeTokenRequest?: RevokeTokenRequest;
}
export declare class ObjectAuthenticationApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: AuthenticationApiRequestFactory, responseProcessor?: AuthenticationApiResponseProcessor);
    getCurrentUserInfo(param?: AuthenticationApiGetCurrentUserInfoRequest, options?: Configuration): Promise<User>;
    getCurrentUserToken(param?: AuthenticationApiGetCurrentUserTokenRequest, options?: Configuration): Promise<GetTokenResponse>;
    getFullAccessToken(param: AuthenticationApiGetFullAccessTokenRequest, options?: Configuration): Promise<Token>;
    getObjectAccessToken(param: AuthenticationApiGetObjectAccessTokenRequest, options?: Configuration): Promise<Token>;
    login(param?: AuthenticationApiLoginRequest, options?: Configuration): Promise<void>;
    logout(param?: AuthenticationApiLogoutRequest, options?: Configuration): Promise<void>;
    revokeToken(param?: AuthenticationApiRevokeTokenRequest, options?: Configuration): Promise<void>;
}
import { Class900ClApiRequestFactory, Class900ClApiResponseProcessor } from "../apis/Class900ClApi";
export interface Class900ClApiAssignChangeAuthorRequest {
    assignChangeAuthorRequest: AssignChangeAuthorRequest;
}
export interface Class900ClApiAssignTagRequest {
    assignTagRequest: AssignTagRequest;
}
export interface Class900ClApiChangeUserPasswordRequest {
    changeUserPasswordRequest: ChangeUserPasswordRequest;
}
export interface Class900ClApiCreateOrgRequest {
    createOrgRequest: CreateOrgRequest;
}
export interface Class900ClApiCreateTagRequest {
    createTagRequest: CreateTagRequest;
}
export interface Class900ClApiCreateUserRequest {
    createUserRequest: CreateUserRequest;
}
export interface Class900ClApiCreateUserGroupRequest {
    createUserGroupRequest: CreateUserGroupRequest;
}
export interface Class900ClApiDeleteMetadataRequest {
    deleteMetadataRequest: DeleteMetadataRequest;
}
export interface Class900ClApiDeleteOrgRequest {
    orgIdentifier: string;
}
export interface Class900ClApiDeleteTagRequest {
    tagIdentifier: string;
}
export interface Class900ClApiDeleteUserRequest {
    userIdentifier: string;
}
export interface Class900ClApiDeleteUserGroupRequest {
    groupIdentifier: string;
}
export interface Class900ClApiExportAnswerReportRequest {
    exportAnswerReportRequest: ExportAnswerReportRequest;
}
export interface Class900ClApiExportLiveboardReportRequest {
    exportLiveboardReportRequest: ExportLiveboardReportRequest;
}
export interface Class900ClApiExportMetadataTMLRequest {
    exportMetadataTMLRequest: ExportMetadataTMLRequest;
}
export interface Class900ClApiFetchAnswerDataRequest {
    fetchAnswerDataRequest: FetchAnswerDataRequest;
}
export interface Class900ClApiFetchAnswerSqlQueryRequest {
    fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest;
}
export interface Class900ClApiFetchLiveboardDataRequest {
    fetchLiveboardDataRequest: FetchLiveboardDataRequest;
}
export interface Class900ClApiFetchLiveboardSqlQueryRequest {
    fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest;
}
export interface Class900ClApiFetchLogsRequest {
    fetchLogsRequest: FetchLogsRequest;
}
export interface Class900ClApiFetchPermissionsOfPrincipalsRequest {
    fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest;
}
export interface Class900ClApiFetchPermissionsOnMetadataRequest {
    fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest;
}
export interface Class900ClApiForceLogoutUsersRequest {
    forceLogoutUsersRequest?: ForceLogoutUsersRequest;
}
export interface Class900ClApiGetCurrentUserInfoRequest {
}
export interface Class900ClApiGetFullAccessTokenRequest {
    getFullAccessTokenRequest: GetFullAccessTokenRequest;
}
export interface Class900ClApiGetObjectAccessTokenRequest {
    getObjectAccessTokenRequest: GetObjectAccessTokenRequest;
}
export interface Class900ClApiGetSystemConfigRequest {
}
export interface Class900ClApiGetSystemInformationRequest {
}
export interface Class900ClApiImportMetadataTMLRequest {
    importMetadataTMLRequest: ImportMetadataTMLRequest;
}
export interface Class900ClApiImportUserGroupsRequest {
    importUserGroupsRequest?: ImportUserGroupsRequest;
}
export interface Class900ClApiImportUsersRequest {
    importUsersRequest: ImportUsersRequest;
}
export interface Class900ClApiLoginRequest {
    loginRequest?: LoginRequest;
}
export interface Class900ClApiLogoutRequest {
}
export interface Class900ClApiResetUserPasswordRequest {
    resetUserPasswordRequest: ResetUserPasswordRequest;
}
export interface Class900ClApiRevokeTokenRequest {
    revokeTokenRequest?: RevokeTokenRequest;
}
export interface Class900ClApiSearchDataRequest {
    searchDataRequest: SearchDataRequest;
}
export interface Class900ClApiSearchMetadataRequest {
    searchMetadataRequest?: SearchMetadataRequest;
}
export interface Class900ClApiSearchOrgsRequest {
    searchOrgsRequest?: SearchOrgsRequest;
}
export interface Class900ClApiSearchTagsRequest {
    searchTagsRequest?: SearchTagsRequest;
}
export interface Class900ClApiSearchUserGroupsRequest {
    searchUserGroupsRequest?: SearchUserGroupsRequest;
}
export interface Class900ClApiSearchUsersRequest {
    searchUsersRequest?: SearchUsersRequest;
}
export interface Class900ClApiShareMetadataRequest {
    shareMetadataRequest: ShareMetadataRequest;
}
export interface Class900ClApiUnassignTagRequest {
    assignTagRequest: AssignTagRequest;
}
export interface Class900ClApiUpdateOrgRequest {
    orgIdentifier: string;
    updateOrgRequest?: UpdateOrgRequest;
}
export interface Class900ClApiUpdateTagRequest {
    tagIdentifier: string;
    updateTagRequest?: UpdateTagRequest;
}
export interface Class900ClApiUpdateUserRequest {
    userIdentifier: string;
    updateUserRequest?: UpdateUserRequest;
}
export interface Class900ClApiUpdateUserGroupRequest {
    groupIdentifier: string;
    updateUserGroupRequest?: UpdateUserGroupRequest;
}
export declare class ObjectClass900ClApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: Class900ClApiRequestFactory, responseProcessor?: Class900ClApiResponseProcessor);
    assignChangeAuthor(param: Class900ClApiAssignChangeAuthorRequest, options?: Configuration): Promise<void>;
    assignTag(param: Class900ClApiAssignTagRequest, options?: Configuration): Promise<void>;
    changeUserPassword(param: Class900ClApiChangeUserPasswordRequest, options?: Configuration): Promise<void>;
    createOrg(param: Class900ClApiCreateOrgRequest, options?: Configuration): Promise<OrgResponse>;
    createTag(param: Class900ClApiCreateTagRequest, options?: Configuration): Promise<Tag>;
    createUser(param: Class900ClApiCreateUserRequest, options?: Configuration): Promise<User>;
    createUserGroup(param: Class900ClApiCreateUserGroupRequest, options?: Configuration): Promise<UserGroupResponse>;
    deleteMetadata(param: Class900ClApiDeleteMetadataRequest, options?: Configuration): Promise<void>;
    deleteOrg(param: Class900ClApiDeleteOrgRequest, options?: Configuration): Promise<void>;
    deleteTag(param: Class900ClApiDeleteTagRequest, options?: Configuration): Promise<void>;
    deleteUser(param: Class900ClApiDeleteUserRequest, options?: Configuration): Promise<void>;
    deleteUserGroup(param: Class900ClApiDeleteUserGroupRequest, options?: Configuration): Promise<void>;
    exportAnswerReport(param: Class900ClApiExportAnswerReportRequest, options?: Configuration): Promise<any>;
    exportLiveboardReport(param: Class900ClApiExportLiveboardReportRequest, options?: Configuration): Promise<any>;
    exportMetadataTML(param: Class900ClApiExportMetadataTMLRequest, options?: Configuration): Promise<Array<any>>;
    fetchAnswerData(param: Class900ClApiFetchAnswerDataRequest, options?: Configuration): Promise<AnswerDataResponse>;
    fetchAnswerSqlQuery(param: Class900ClApiFetchAnswerSqlQueryRequest, options?: Configuration): Promise<SqlQueryResponse>;
    fetchLiveboardData(param: Class900ClApiFetchLiveboardDataRequest, options?: Configuration): Promise<LiveboardDataResponse>;
    fetchLiveboardSqlQuery(param: Class900ClApiFetchLiveboardSqlQueryRequest, options?: Configuration): Promise<SqlQueryResponse>;
    fetchLogs(param: Class900ClApiFetchLogsRequest, options?: Configuration): Promise<Array<LogResponse>>;
    fetchPermissionsOfPrincipals(param: Class900ClApiFetchPermissionsOfPrincipalsRequest, options?: Configuration): Promise<any>;
    fetchPermissionsOnMetadata(param: Class900ClApiFetchPermissionsOnMetadataRequest, options?: Configuration): Promise<any>;
    forceLogoutUsers(param?: Class900ClApiForceLogoutUsersRequest, options?: Configuration): Promise<void>;
    getCurrentUserInfo(param?: Class900ClApiGetCurrentUserInfoRequest, options?: Configuration): Promise<User>;
    getFullAccessToken(param: Class900ClApiGetFullAccessTokenRequest, options?: Configuration): Promise<Token>;
    getObjectAccessToken(param: Class900ClApiGetObjectAccessTokenRequest, options?: Configuration): Promise<Token>;
    getSystemConfig(param?: Class900ClApiGetSystemConfigRequest, options?: Configuration): Promise<SystemConfig>;
    getSystemInformation(param?: Class900ClApiGetSystemInformationRequest, options?: Configuration): Promise<SystemInfo>;
    importMetadataTML(param: Class900ClApiImportMetadataTMLRequest, options?: Configuration): Promise<Array<any>>;
    importUserGroups(param?: Class900ClApiImportUserGroupsRequest, options?: Configuration): Promise<ImportUserGroupsResponse>;
    importUsers(param: Class900ClApiImportUsersRequest, options?: Configuration): Promise<ImportUsersResponse>;
    login(param?: Class900ClApiLoginRequest, options?: Configuration): Promise<void>;
    logout(param?: Class900ClApiLogoutRequest, options?: Configuration): Promise<void>;
    resetUserPassword(param: Class900ClApiResetUserPasswordRequest, options?: Configuration): Promise<void>;
    revokeToken(param?: Class900ClApiRevokeTokenRequest, options?: Configuration): Promise<void>;
    searchData(param: Class900ClApiSearchDataRequest, options?: Configuration): Promise<SearchDataResponse>;
    searchMetadata(param?: Class900ClApiSearchMetadataRequest, options?: Configuration): Promise<Array<MetadataSearchResponse>>;
    searchOrgs(param?: Class900ClApiSearchOrgsRequest, options?: Configuration): Promise<Array<OrgResponse>>;
    searchTags(param?: Class900ClApiSearchTagsRequest, options?: Configuration): Promise<Array<Tag>>;
    searchUserGroups(param?: Class900ClApiSearchUserGroupsRequest, options?: Configuration): Promise<Array<UserGroupResponse>>;
    searchUsers(param?: Class900ClApiSearchUsersRequest, options?: Configuration): Promise<Array<User>>;
    shareMetadata(param: Class900ClApiShareMetadataRequest, options?: Configuration): Promise<void>;
    unassignTag(param: Class900ClApiUnassignTagRequest, options?: Configuration): Promise<void>;
    updateOrg(param: Class900ClApiUpdateOrgRequest, options?: Configuration): Promise<void>;
    updateTag(param: Class900ClApiUpdateTagRequest, options?: Configuration): Promise<void>;
    updateUser(param: Class900ClApiUpdateUserRequest, options?: Configuration): Promise<void>;
    updateUserGroup(param: Class900ClApiUpdateUserGroupRequest, options?: Configuration): Promise<void>;
}
import { Class920ClApiRequestFactory, Class920ClApiResponseProcessor } from "../apis/Class920ClApi";
export interface Class920ClApiCreateConnectionRequest {
    createConnectionRequest: CreateConnectionRequest;
}
export interface Class920ClApiDeleteConnectionRequest {
    deleteConnectionRequest: DeleteConnectionRequest;
}
export interface Class920ClApiGetSystemOverrideInfoRequest {
}
export interface Class920ClApiSearchConnectionRequest {
    searchConnectionRequest?: SearchConnectionRequest;
}
export interface Class920ClApiUpdateConnectionRequest {
    updateConnectionRequest: UpdateConnectionRequest;
}
export interface Class920ClApiUpdateSystemConfigRequest {
    updateSystemConfigRequest: UpdateSystemConfigRequest;
}
export declare class ObjectClass920ClApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: Class920ClApiRequestFactory, responseProcessor?: Class920ClApiResponseProcessor);
    createConnection(param: Class920ClApiCreateConnectionRequest, options?: Configuration): Promise<CreateConnectionResponse>;
    deleteConnection(param: Class920ClApiDeleteConnectionRequest, options?: Configuration): Promise<void>;
    getSystemOverrideInfo(param?: Class920ClApiGetSystemOverrideInfoRequest, options?: Configuration): Promise<any>;
    searchConnection(param?: Class920ClApiSearchConnectionRequest, options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    updateConnection(param: Class920ClApiUpdateConnectionRequest, options?: Configuration): Promise<void>;
    updateSystemConfig(param: Class920ClApiUpdateSystemConfigRequest, options?: Configuration): Promise<void>;
}
import { Class940ClApiRequestFactory, Class940ClApiResponseProcessor } from "../apis/Class940ClApi";
export interface Class940ClApiCreateScheduleRequest {
    createScheduleRequest: CreateScheduleRequest;
}
export interface Class940ClApiDeleteScheduleRequest {
    scheduleIdentifier: string;
}
export interface Class940ClApiGetCurrentUserTokenRequest {
}
export interface Class940ClApiSearchSchedulesRequest {
    searchSchedulesRequest?: SearchSchedulesRequest;
}
export interface Class940ClApiUpdateScheduleRequest {
    scheduleIdentifier: string;
    updateScheduleRequest?: UpdateScheduleRequest;
}
export declare class ObjectClass940ClApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: Class940ClApiRequestFactory, responseProcessor?: Class940ClApiResponseProcessor);
    createSchedule(param: Class940ClApiCreateScheduleRequest, options?: Configuration): Promise<ResponseSchedule>;
    deleteSchedule(param: Class940ClApiDeleteScheduleRequest, options?: Configuration): Promise<void>;
    getCurrentUserToken(param?: Class940ClApiGetCurrentUserTokenRequest, options?: Configuration): Promise<GetTokenResponse>;
    searchSchedules(param?: Class940ClApiSearchSchedulesRequest, options?: Configuration): Promise<Array<ResponseSchedule>>;
    updateSchedule(param: Class940ClApiUpdateScheduleRequest, options?: Configuration): Promise<void>;
}
import { Class950ClApiRequestFactory, Class950ClApiResponseProcessor } from "../apis/Class950ClApi";
export interface Class950ClApiCreateCustomActionRequest {
    createCustomActionRequest: CreateCustomActionRequest;
}
export interface Class950ClApiCreateRoleRequest {
    createRoleRequest: CreateRoleRequest;
}
export interface Class950ClApiDeleteCustomActionRequest {
    customActionIdentifier: string;
}
export interface Class950ClApiDeleteRoleRequest {
    roleIdentifier: string;
}
export interface Class950ClApiSearchCustomActionsRequest {
    searchCustomActionsRequest?: SearchCustomActionsRequest;
}
export interface Class950ClApiSearchRolesRequest {
    searchRolesRequest?: SearchRolesRequest;
}
export interface Class950ClApiUpdateCustomActionRequest {
    customActionIdentifier: string;
    updateCustomActionRequest?: UpdateCustomActionRequest;
}
export interface Class950ClApiUpdateRoleRequest {
    roleIdentifier: string;
    updateRoleRequest: UpdateRoleRequest;
}
export declare class ObjectClass950ClApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: Class950ClApiRequestFactory, responseProcessor?: Class950ClApiResponseProcessor);
    createCustomAction(param: Class950ClApiCreateCustomActionRequest, options?: Configuration): Promise<ResponseCustomAction>;
    createRole(param: Class950ClApiCreateRoleRequest, options?: Configuration): Promise<RoleResponse>;
    deleteCustomAction(param: Class950ClApiDeleteCustomActionRequest, options?: Configuration): Promise<void>;
    deleteRole(param: Class950ClApiDeleteRoleRequest, options?: Configuration): Promise<void>;
    searchCustomActions(param?: Class950ClApiSearchCustomActionsRequest, options?: Configuration): Promise<Array<ResponseCustomAction>>;
    searchRoles(param?: Class950ClApiSearchRolesRequest, options?: Configuration): Promise<Array<SearchRoleResponse>>;
    updateCustomAction(param: Class950ClApiUpdateCustomActionRequest, options?: Configuration): Promise<void>;
    updateRole(param: Class950ClApiUpdateRoleRequest, options?: Configuration): Promise<RoleResponse>;
}
import { ConnectionsApiRequestFactory, ConnectionsApiResponseProcessor } from "../apis/ConnectionsApi";
export interface ConnectionsApiCreateConnectionRequest {
    createConnectionRequest: CreateConnectionRequest;
}
export interface ConnectionsApiDeleteConnectionRequest {
    deleteConnectionRequest: DeleteConnectionRequest;
}
export interface ConnectionsApiSearchConnectionRequest {
    searchConnectionRequest?: SearchConnectionRequest;
}
export interface ConnectionsApiUpdateConnectionRequest {
    updateConnectionRequest: UpdateConnectionRequest;
}
export declare class ObjectConnectionsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ConnectionsApiRequestFactory, responseProcessor?: ConnectionsApiResponseProcessor);
    createConnection(param: ConnectionsApiCreateConnectionRequest, options?: Configuration): Promise<CreateConnectionResponse>;
    deleteConnection(param: ConnectionsApiDeleteConnectionRequest, options?: Configuration): Promise<void>;
    searchConnection(param?: ConnectionsApiSearchConnectionRequest, options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    updateConnection(param: ConnectionsApiUpdateConnectionRequest, options?: Configuration): Promise<void>;
}
import { CustomActionApiRequestFactory, CustomActionApiResponseProcessor } from "../apis/CustomActionApi";
export interface CustomActionApiCreateCustomActionRequest {
    createCustomActionRequest: CreateCustomActionRequest;
}
export interface CustomActionApiDeleteCustomActionRequest {
    customActionIdentifier: string;
}
export interface CustomActionApiSearchCustomActionsRequest {
    searchCustomActionsRequest?: SearchCustomActionsRequest;
}
export interface CustomActionApiUpdateCustomActionRequest {
    customActionIdentifier: string;
    updateCustomActionRequest?: UpdateCustomActionRequest;
}
export declare class ObjectCustomActionApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: CustomActionApiRequestFactory, responseProcessor?: CustomActionApiResponseProcessor);
    createCustomAction(param: CustomActionApiCreateCustomActionRequest, options?: Configuration): Promise<ResponseCustomAction>;
    deleteCustomAction(param: CustomActionApiDeleteCustomActionRequest, options?: Configuration): Promise<void>;
    searchCustomActions(param?: CustomActionApiSearchCustomActionsRequest, options?: Configuration): Promise<Array<ResponseCustomAction>>;
    updateCustomAction(param: CustomActionApiUpdateCustomActionRequest, options?: Configuration): Promise<void>;
}
import { DataApiRequestFactory, DataApiResponseProcessor } from "../apis/DataApi";
export interface DataApiFetchAnswerDataRequest {
    fetchAnswerDataRequest: FetchAnswerDataRequest;
}
export interface DataApiFetchLiveboardDataRequest {
    fetchLiveboardDataRequest: FetchLiveboardDataRequest;
}
export interface DataApiSearchDataRequest {
    searchDataRequest: SearchDataRequest;
}
export declare class ObjectDataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: DataApiRequestFactory, responseProcessor?: DataApiResponseProcessor);
    fetchAnswerData(param: DataApiFetchAnswerDataRequest, options?: Configuration): Promise<AnswerDataResponse>;
    fetchLiveboardData(param: DataApiFetchLiveboardDataRequest, options?: Configuration): Promise<LiveboardDataResponse>;
    searchData(param: DataApiSearchDataRequest, options?: Configuration): Promise<SearchDataResponse>;
}
import { GroupsApiRequestFactory, GroupsApiResponseProcessor } from "../apis/GroupsApi";
export interface GroupsApiCreateUserGroupRequest {
    createUserGroupRequest: CreateUserGroupRequest;
}
export interface GroupsApiDeleteUserGroupRequest {
    groupIdentifier: string;
}
export interface GroupsApiImportUserGroupsRequest {
    importUserGroupsRequest?: ImportUserGroupsRequest;
}
export interface GroupsApiSearchUserGroupsRequest {
    searchUserGroupsRequest?: SearchUserGroupsRequest;
}
export interface GroupsApiUpdateUserGroupRequest {
    groupIdentifier: string;
    updateUserGroupRequest?: UpdateUserGroupRequest;
}
export declare class ObjectGroupsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: GroupsApiRequestFactory, responseProcessor?: GroupsApiResponseProcessor);
    createUserGroup(param: GroupsApiCreateUserGroupRequest, options?: Configuration): Promise<UserGroupResponse>;
    deleteUserGroup(param: GroupsApiDeleteUserGroupRequest, options?: Configuration): Promise<void>;
    importUserGroups(param?: GroupsApiImportUserGroupsRequest, options?: Configuration): Promise<ImportUserGroupsResponse>;
    searchUserGroups(param?: GroupsApiSearchUserGroupsRequest, options?: Configuration): Promise<Array<UserGroupResponse>>;
    updateUserGroup(param: GroupsApiUpdateUserGroupRequest, options?: Configuration): Promise<void>;
}
import { LogApiRequestFactory, LogApiResponseProcessor } from "../apis/LogApi";
export interface LogApiFetchLogsRequest {
    fetchLogsRequest: FetchLogsRequest;
}
export declare class ObjectLogApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: LogApiRequestFactory, responseProcessor?: LogApiResponseProcessor);
    fetchLogs(param: LogApiFetchLogsRequest, options?: Configuration): Promise<Array<LogResponse>>;
}
import { MetadataApiRequestFactory, MetadataApiResponseProcessor } from "../apis/MetadataApi";
export interface MetadataApiDeleteMetadataRequest {
    deleteMetadataRequest: DeleteMetadataRequest;
}
export interface MetadataApiExportMetadataTMLRequest {
    exportMetadataTMLRequest: ExportMetadataTMLRequest;
}
export interface MetadataApiFetchAnswerSqlQueryRequest {
    fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest;
}
export interface MetadataApiFetchLiveboardSqlQueryRequest {
    fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest;
}
export interface MetadataApiImportMetadataTMLRequest {
    importMetadataTMLRequest: ImportMetadataTMLRequest;
}
export interface MetadataApiSearchMetadataRequest {
    searchMetadataRequest?: SearchMetadataRequest;
}
export declare class ObjectMetadataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: MetadataApiRequestFactory, responseProcessor?: MetadataApiResponseProcessor);
    deleteMetadata(param: MetadataApiDeleteMetadataRequest, options?: Configuration): Promise<void>;
    exportMetadataTML(param: MetadataApiExportMetadataTMLRequest, options?: Configuration): Promise<Array<any>>;
    fetchAnswerSqlQuery(param: MetadataApiFetchAnswerSqlQueryRequest, options?: Configuration): Promise<SqlQueryResponse>;
    fetchLiveboardSqlQuery(param: MetadataApiFetchLiveboardSqlQueryRequest, options?: Configuration): Promise<SqlQueryResponse>;
    importMetadataTML(param: MetadataApiImportMetadataTMLRequest, options?: Configuration): Promise<Array<any>>;
    searchMetadata(param?: MetadataApiSearchMetadataRequest, options?: Configuration): Promise<Array<MetadataSearchResponse>>;
}
import { OrgsApiRequestFactory, OrgsApiResponseProcessor } from "../apis/OrgsApi";
export interface OrgsApiCreateOrgRequest {
    createOrgRequest: CreateOrgRequest;
}
export interface OrgsApiDeleteOrgRequest {
    orgIdentifier: string;
}
export interface OrgsApiSearchOrgsRequest {
    searchOrgsRequest?: SearchOrgsRequest;
}
export interface OrgsApiUpdateOrgRequest {
    orgIdentifier: string;
    updateOrgRequest?: UpdateOrgRequest;
}
export declare class ObjectOrgsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: OrgsApiRequestFactory, responseProcessor?: OrgsApiResponseProcessor);
    createOrg(param: OrgsApiCreateOrgRequest, options?: Configuration): Promise<OrgResponse>;
    deleteOrg(param: OrgsApiDeleteOrgRequest, options?: Configuration): Promise<void>;
    searchOrgs(param?: OrgsApiSearchOrgsRequest, options?: Configuration): Promise<Array<OrgResponse>>;
    updateOrg(param: OrgsApiUpdateOrgRequest, options?: Configuration): Promise<void>;
}
import { ReportsApiRequestFactory, ReportsApiResponseProcessor } from "../apis/ReportsApi";
export interface ReportsApiExportAnswerReportRequest {
    exportAnswerReportRequest: ExportAnswerReportRequest;
}
export interface ReportsApiExportLiveboardReportRequest {
    exportLiveboardReportRequest: ExportLiveboardReportRequest;
}
export declare class ObjectReportsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ReportsApiRequestFactory, responseProcessor?: ReportsApiResponseProcessor);
    exportAnswerReport(param: ReportsApiExportAnswerReportRequest, options?: Configuration): Promise<any>;
    exportLiveboardReport(param: ReportsApiExportLiveboardReportRequest, options?: Configuration): Promise<any>;
}
import { RolesApiRequestFactory, RolesApiResponseProcessor } from "../apis/RolesApi";
export interface RolesApiCreateRoleRequest {
    createRoleRequest: CreateRoleRequest;
}
export interface RolesApiDeleteRoleRequest {
    roleIdentifier: string;
}
export interface RolesApiSearchRolesRequest {
    searchRolesRequest?: SearchRolesRequest;
}
export interface RolesApiUpdateRoleRequest {
    roleIdentifier: string;
    updateRoleRequest: UpdateRoleRequest;
}
export declare class ObjectRolesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: RolesApiRequestFactory, responseProcessor?: RolesApiResponseProcessor);
    createRole(param: RolesApiCreateRoleRequest, options?: Configuration): Promise<RoleResponse>;
    deleteRole(param: RolesApiDeleteRoleRequest, options?: Configuration): Promise<void>;
    searchRoles(param?: RolesApiSearchRolesRequest, options?: Configuration): Promise<Array<SearchRoleResponse>>;
    updateRole(param: RolesApiUpdateRoleRequest, options?: Configuration): Promise<RoleResponse>;
}
import { SchedulesApiRequestFactory, SchedulesApiResponseProcessor } from "../apis/SchedulesApi";
export interface SchedulesApiCreateScheduleRequest {
    createScheduleRequest: CreateScheduleRequest;
}
export interface SchedulesApiDeleteScheduleRequest {
    scheduleIdentifier: string;
}
export interface SchedulesApiSearchSchedulesRequest {
    searchSchedulesRequest?: SearchSchedulesRequest;
}
export interface SchedulesApiUpdateScheduleRequest {
    scheduleIdentifier: string;
    updateScheduleRequest?: UpdateScheduleRequest;
}
export declare class ObjectSchedulesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SchedulesApiRequestFactory, responseProcessor?: SchedulesApiResponseProcessor);
    createSchedule(param: SchedulesApiCreateScheduleRequest, options?: Configuration): Promise<ResponseSchedule>;
    deleteSchedule(param: SchedulesApiDeleteScheduleRequest, options?: Configuration): Promise<void>;
    searchSchedules(param?: SchedulesApiSearchSchedulesRequest, options?: Configuration): Promise<Array<ResponseSchedule>>;
    updateSchedule(param: SchedulesApiUpdateScheduleRequest, options?: Configuration): Promise<void>;
}
import { SecurityApiRequestFactory, SecurityApiResponseProcessor } from "../apis/SecurityApi";
export interface SecurityApiAssignChangeAuthorRequest {
    assignChangeAuthorRequest: AssignChangeAuthorRequest;
}
export interface SecurityApiFetchPermissionsOfPrincipalsRequest {
    fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest;
}
export interface SecurityApiFetchPermissionsOnMetadataRequest {
    fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest;
}
export interface SecurityApiShareMetadataRequest {
    shareMetadataRequest: ShareMetadataRequest;
}
export declare class ObjectSecurityApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SecurityApiRequestFactory, responseProcessor?: SecurityApiResponseProcessor);
    assignChangeAuthor(param: SecurityApiAssignChangeAuthorRequest, options?: Configuration): Promise<void>;
    fetchPermissionsOfPrincipals(param: SecurityApiFetchPermissionsOfPrincipalsRequest, options?: Configuration): Promise<any>;
    fetchPermissionsOnMetadata(param: SecurityApiFetchPermissionsOnMetadataRequest, options?: Configuration): Promise<any>;
    shareMetadata(param: SecurityApiShareMetadataRequest, options?: Configuration): Promise<void>;
}
import { SystemApiRequestFactory, SystemApiResponseProcessor } from "../apis/SystemApi";
export interface SystemApiGetSystemConfigRequest {
}
export interface SystemApiGetSystemInformationRequest {
}
export interface SystemApiGetSystemOverrideInfoRequest {
}
export interface SystemApiUpdateSystemConfigRequest {
    updateSystemConfigRequest: UpdateSystemConfigRequest;
}
export declare class ObjectSystemApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SystemApiRequestFactory, responseProcessor?: SystemApiResponseProcessor);
    getSystemConfig(param?: SystemApiGetSystemConfigRequest, options?: Configuration): Promise<SystemConfig>;
    getSystemInformation(param?: SystemApiGetSystemInformationRequest, options?: Configuration): Promise<SystemInfo>;
    getSystemOverrideInfo(param?: SystemApiGetSystemOverrideInfoRequest, options?: Configuration): Promise<any>;
    updateSystemConfig(param: SystemApiUpdateSystemConfigRequest, options?: Configuration): Promise<void>;
}
import { TagsApiRequestFactory, TagsApiResponseProcessor } from "../apis/TagsApi";
export interface TagsApiAssignTagRequest {
    assignTagRequest: AssignTagRequest;
}
export interface TagsApiCreateTagRequest {
    createTagRequest: CreateTagRequest;
}
export interface TagsApiDeleteTagRequest {
    tagIdentifier: string;
}
export interface TagsApiSearchTagsRequest {
    searchTagsRequest?: SearchTagsRequest;
}
export interface TagsApiUnassignTagRequest {
    assignTagRequest: AssignTagRequest;
}
export interface TagsApiUpdateTagRequest {
    tagIdentifier: string;
    updateTagRequest?: UpdateTagRequest;
}
export declare class ObjectTagsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: TagsApiRequestFactory, responseProcessor?: TagsApiResponseProcessor);
    assignTag(param: TagsApiAssignTagRequest, options?: Configuration): Promise<void>;
    createTag(param: TagsApiCreateTagRequest, options?: Configuration): Promise<Tag>;
    deleteTag(param: TagsApiDeleteTagRequest, options?: Configuration): Promise<void>;
    searchTags(param?: TagsApiSearchTagsRequest, options?: Configuration): Promise<Array<Tag>>;
    unassignTag(param: TagsApiUnassignTagRequest, options?: Configuration): Promise<void>;
    updateTag(param: TagsApiUpdateTagRequest, options?: Configuration): Promise<void>;
}
import { ThoughtSpotRestApiRequestFactory, ThoughtSpotRestApiResponseProcessor } from "../apis/ThoughtSpotRestApi";
export interface ThoughtSpotRestApiAssignChangeAuthorRequest {
    assignChangeAuthorRequest: AssignChangeAuthorRequest;
}
export interface ThoughtSpotRestApiAssignTagRequest {
    assignTagRequest: AssignTagRequest;
}
export interface ThoughtSpotRestApiChangeUserPasswordRequest {
    changeUserPasswordRequest: ChangeUserPasswordRequest;
}
export interface ThoughtSpotRestApiCommitBranchRequest {
    commitBranchRequest: CommitBranchRequest;
}
export interface ThoughtSpotRestApiCreateConfigRequest {
    createConfigRequest: CreateConfigRequest;
}
export interface ThoughtSpotRestApiCreateConnectionRequest {
    createConnectionRequest: CreateConnectionRequest;
}
export interface ThoughtSpotRestApiCreateCustomActionRequest {
    createCustomActionRequest: CreateCustomActionRequest;
}
export interface ThoughtSpotRestApiCreateOrgRequest {
    createOrgRequest: CreateOrgRequest;
}
export interface ThoughtSpotRestApiCreateRoleRequest {
    createRoleRequest: CreateRoleRequest;
}
export interface ThoughtSpotRestApiCreateScheduleRequest {
    createScheduleRequest: CreateScheduleRequest;
}
export interface ThoughtSpotRestApiCreateTagRequest {
    createTagRequest: CreateTagRequest;
}
export interface ThoughtSpotRestApiCreateUserRequest {
    createUserRequest: CreateUserRequest;
}
export interface ThoughtSpotRestApiCreateUserGroupRequest {
    createUserGroupRequest: CreateUserGroupRequest;
}
export interface ThoughtSpotRestApiDeleteConfigRequest {
    deleteConfigRequest?: DeleteConfigRequest;
}
export interface ThoughtSpotRestApiDeleteConnectionRequest {
    deleteConnectionRequest: DeleteConnectionRequest;
}
export interface ThoughtSpotRestApiDeleteCustomActionRequest {
    customActionIdentifier: string;
}
export interface ThoughtSpotRestApiDeleteMetadataRequest {
    deleteMetadataRequest: DeleteMetadataRequest;
}
export interface ThoughtSpotRestApiDeleteOrgRequest {
    orgIdentifier: string;
}
export interface ThoughtSpotRestApiDeleteRoleRequest {
    roleIdentifier: string;
}
export interface ThoughtSpotRestApiDeleteScheduleRequest {
    scheduleIdentifier: string;
}
export interface ThoughtSpotRestApiDeleteTagRequest {
    tagIdentifier: string;
}
export interface ThoughtSpotRestApiDeleteUserRequest {
    userIdentifier: string;
}
export interface ThoughtSpotRestApiDeleteUserGroupRequest {
    groupIdentifier: string;
}
export interface ThoughtSpotRestApiDeployCommitRequest {
    deployCommitRequest?: DeployCommitRequest;
}
export interface ThoughtSpotRestApiExportAnswerReportRequest {
    exportAnswerReportRequest: ExportAnswerReportRequest;
}
export interface ThoughtSpotRestApiExportLiveboardReportRequest {
    exportLiveboardReportRequest: ExportLiveboardReportRequest;
}
export interface ThoughtSpotRestApiExportMetadataTMLRequest {
    exportMetadataTMLRequest: ExportMetadataTMLRequest;
}
export interface ThoughtSpotRestApiFetchAnswerDataRequest {
    fetchAnswerDataRequest: FetchAnswerDataRequest;
}
export interface ThoughtSpotRestApiFetchAnswerSqlQueryRequest {
    fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest;
}
export interface ThoughtSpotRestApiFetchLiveboardDataRequest {
    fetchLiveboardDataRequest: FetchLiveboardDataRequest;
}
export interface ThoughtSpotRestApiFetchLiveboardSqlQueryRequest {
    fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest;
}
export interface ThoughtSpotRestApiFetchLogsRequest {
    fetchLogsRequest: FetchLogsRequest;
}
export interface ThoughtSpotRestApiFetchPermissionsOfPrincipalsRequest {
    fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest;
}
export interface ThoughtSpotRestApiFetchPermissionsOnMetadataRequest {
    fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest;
}
export interface ThoughtSpotRestApiForceLogoutUsersRequest {
    forceLogoutUsersRequest?: ForceLogoutUsersRequest;
}
export interface ThoughtSpotRestApiGetCurrentUserInfoRequest {
}
export interface ThoughtSpotRestApiGetCurrentUserTokenRequest {
}
export interface ThoughtSpotRestApiGetFullAccessTokenRequest {
    getFullAccessTokenRequest: GetFullAccessTokenRequest;
}
export interface ThoughtSpotRestApiGetObjectAccessTokenRequest {
    getObjectAccessTokenRequest: GetObjectAccessTokenRequest;
}
export interface ThoughtSpotRestApiGetSystemConfigRequest {
}
export interface ThoughtSpotRestApiGetSystemInformationRequest {
}
export interface ThoughtSpotRestApiGetSystemOverrideInfoRequest {
}
export interface ThoughtSpotRestApiImportMetadataTMLRequest {
    importMetadataTMLRequest: ImportMetadataTMLRequest;
}
export interface ThoughtSpotRestApiImportUserGroupsRequest {
    importUserGroupsRequest?: ImportUserGroupsRequest;
}
export interface ThoughtSpotRestApiImportUsersRequest {
    importUsersRequest: ImportUsersRequest;
}
export interface ThoughtSpotRestApiLoginRequest {
    loginRequest?: LoginRequest;
}
export interface ThoughtSpotRestApiLogoutRequest {
}
export interface ThoughtSpotRestApiResetUserPasswordRequest {
    resetUserPasswordRequest: ResetUserPasswordRequest;
}
export interface ThoughtSpotRestApiRevertCommitRequest {
    commitId: string;
    revertCommitRequest?: RevertCommitRequest;
}
export interface ThoughtSpotRestApiRevokeTokenRequest {
    revokeTokenRequest?: RevokeTokenRequest;
}
export interface ThoughtSpotRestApiSearchCommitsRequest {
    searchCommitsRequest: SearchCommitsRequest;
}
export interface ThoughtSpotRestApiSearchConfigRequest {
    searchConfigRequest?: SearchConfigRequest;
}
export interface ThoughtSpotRestApiSearchConnectionRequest {
    searchConnectionRequest?: SearchConnectionRequest;
}
export interface ThoughtSpotRestApiSearchCustomActionsRequest {
    searchCustomActionsRequest?: SearchCustomActionsRequest;
}
export interface ThoughtSpotRestApiSearchDataRequest {
    searchDataRequest: SearchDataRequest;
}
export interface ThoughtSpotRestApiSearchMetadataRequest {
    searchMetadataRequest?: SearchMetadataRequest;
}
export interface ThoughtSpotRestApiSearchOrgsRequest {
    searchOrgsRequest?: SearchOrgsRequest;
}
export interface ThoughtSpotRestApiSearchRolesRequest {
    searchRolesRequest?: SearchRolesRequest;
}
export interface ThoughtSpotRestApiSearchSchedulesRequest {
    searchSchedulesRequest?: SearchSchedulesRequest;
}
export interface ThoughtSpotRestApiSearchTagsRequest {
    searchTagsRequest?: SearchTagsRequest;
}
export interface ThoughtSpotRestApiSearchUserGroupsRequest {
    searchUserGroupsRequest?: SearchUserGroupsRequest;
}
export interface ThoughtSpotRestApiSearchUsersRequest {
    searchUsersRequest?: SearchUsersRequest;
}
export interface ThoughtSpotRestApiShareMetadataRequest {
    shareMetadataRequest: ShareMetadataRequest;
}
export interface ThoughtSpotRestApiUnassignTagRequest {
    assignTagRequest: AssignTagRequest;
}
export interface ThoughtSpotRestApiUpdateConfigRequest {
    updateConfigRequest?: UpdateConfigRequest;
}
export interface ThoughtSpotRestApiUpdateConnectionRequest {
    updateConnectionRequest: UpdateConnectionRequest;
}
export interface ThoughtSpotRestApiUpdateCustomActionRequest {
    customActionIdentifier: string;
    updateCustomActionRequest?: UpdateCustomActionRequest;
}
export interface ThoughtSpotRestApiUpdateOrgRequest {
    orgIdentifier: string;
    updateOrgRequest?: UpdateOrgRequest;
}
export interface ThoughtSpotRestApiUpdateRoleRequest {
    roleIdentifier: string;
    updateRoleRequest: UpdateRoleRequest;
}
export interface ThoughtSpotRestApiUpdateScheduleRequest {
    scheduleIdentifier: string;
    updateScheduleRequest?: UpdateScheduleRequest;
}
export interface ThoughtSpotRestApiUpdateSystemConfigRequest {
    updateSystemConfigRequest: UpdateSystemConfigRequest;
}
export interface ThoughtSpotRestApiUpdateTagRequest {
    tagIdentifier: string;
    updateTagRequest?: UpdateTagRequest;
}
export interface ThoughtSpotRestApiUpdateUserRequest {
    userIdentifier: string;
    updateUserRequest?: UpdateUserRequest;
}
export interface ThoughtSpotRestApiUpdateUserGroupRequest {
    groupIdentifier: string;
    updateUserGroupRequest?: UpdateUserGroupRequest;
}
export interface ThoughtSpotRestApiValidateMergeRequest {
    validateMergeRequest: ValidateMergeRequest;
}
export declare class ObjectThoughtSpotRestApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ThoughtSpotRestApiRequestFactory, responseProcessor?: ThoughtSpotRestApiResponseProcessor);
    assignChangeAuthor(param: ThoughtSpotRestApiAssignChangeAuthorRequest, options?: Configuration): Promise<void>;
    assignTag(param: ThoughtSpotRestApiAssignTagRequest, options?: Configuration): Promise<void>;
    changeUserPassword(param: ThoughtSpotRestApiChangeUserPasswordRequest, options?: Configuration): Promise<void>;
    commitBranch(param: ThoughtSpotRestApiCommitBranchRequest, options?: Configuration): Promise<CommitResponse>;
    createConfig(param: ThoughtSpotRestApiCreateConfigRequest, options?: Configuration): Promise<RepoConfigObject>;
    createConnection(param: ThoughtSpotRestApiCreateConnectionRequest, options?: Configuration): Promise<CreateConnectionResponse>;
    createCustomAction(param: ThoughtSpotRestApiCreateCustomActionRequest, options?: Configuration): Promise<ResponseCustomAction>;
    createOrg(param: ThoughtSpotRestApiCreateOrgRequest, options?: Configuration): Promise<OrgResponse>;
    createRole(param: ThoughtSpotRestApiCreateRoleRequest, options?: Configuration): Promise<RoleResponse>;
    createSchedule(param: ThoughtSpotRestApiCreateScheduleRequest, options?: Configuration): Promise<ResponseSchedule>;
    createTag(param: ThoughtSpotRestApiCreateTagRequest, options?: Configuration): Promise<Tag>;
    createUser(param: ThoughtSpotRestApiCreateUserRequest, options?: Configuration): Promise<User>;
    createUserGroup(param: ThoughtSpotRestApiCreateUserGroupRequest, options?: Configuration): Promise<UserGroupResponse>;
    deleteConfig(param?: ThoughtSpotRestApiDeleteConfigRequest, options?: Configuration): Promise<void>;
    deleteConnection(param: ThoughtSpotRestApiDeleteConnectionRequest, options?: Configuration): Promise<void>;
    deleteCustomAction(param: ThoughtSpotRestApiDeleteCustomActionRequest, options?: Configuration): Promise<void>;
    deleteMetadata(param: ThoughtSpotRestApiDeleteMetadataRequest, options?: Configuration): Promise<void>;
    deleteOrg(param: ThoughtSpotRestApiDeleteOrgRequest, options?: Configuration): Promise<void>;
    deleteRole(param: ThoughtSpotRestApiDeleteRoleRequest, options?: Configuration): Promise<void>;
    deleteSchedule(param: ThoughtSpotRestApiDeleteScheduleRequest, options?: Configuration): Promise<void>;
    deleteTag(param: ThoughtSpotRestApiDeleteTagRequest, options?: Configuration): Promise<void>;
    deleteUser(param: ThoughtSpotRestApiDeleteUserRequest, options?: Configuration): Promise<void>;
    deleteUserGroup(param: ThoughtSpotRestApiDeleteUserGroupRequest, options?: Configuration): Promise<void>;
    deployCommit(param?: ThoughtSpotRestApiDeployCommitRequest, options?: Configuration): Promise<Array<DeployResponse>>;
    exportAnswerReport(param: ThoughtSpotRestApiExportAnswerReportRequest, options?: Configuration): Promise<any>;
    exportLiveboardReport(param: ThoughtSpotRestApiExportLiveboardReportRequest, options?: Configuration): Promise<any>;
    exportMetadataTML(param: ThoughtSpotRestApiExportMetadataTMLRequest, options?: Configuration): Promise<Array<any>>;
    fetchAnswerData(param: ThoughtSpotRestApiFetchAnswerDataRequest, options?: Configuration): Promise<AnswerDataResponse>;
    fetchAnswerSqlQuery(param: ThoughtSpotRestApiFetchAnswerSqlQueryRequest, options?: Configuration): Promise<SqlQueryResponse>;
    fetchLiveboardData(param: ThoughtSpotRestApiFetchLiveboardDataRequest, options?: Configuration): Promise<LiveboardDataResponse>;
    fetchLiveboardSqlQuery(param: ThoughtSpotRestApiFetchLiveboardSqlQueryRequest, options?: Configuration): Promise<SqlQueryResponse>;
    fetchLogs(param: ThoughtSpotRestApiFetchLogsRequest, options?: Configuration): Promise<Array<LogResponse>>;
    fetchPermissionsOfPrincipals(param: ThoughtSpotRestApiFetchPermissionsOfPrincipalsRequest, options?: Configuration): Promise<any>;
    fetchPermissionsOnMetadata(param: ThoughtSpotRestApiFetchPermissionsOnMetadataRequest, options?: Configuration): Promise<any>;
    forceLogoutUsers(param?: ThoughtSpotRestApiForceLogoutUsersRequest, options?: Configuration): Promise<void>;
    getCurrentUserInfo(param?: ThoughtSpotRestApiGetCurrentUserInfoRequest, options?: Configuration): Promise<User>;
    getCurrentUserToken(param?: ThoughtSpotRestApiGetCurrentUserTokenRequest, options?: Configuration): Promise<GetTokenResponse>;
    getFullAccessToken(param: ThoughtSpotRestApiGetFullAccessTokenRequest, options?: Configuration): Promise<Token>;
    getObjectAccessToken(param: ThoughtSpotRestApiGetObjectAccessTokenRequest, options?: Configuration): Promise<Token>;
    getSystemConfig(param?: ThoughtSpotRestApiGetSystemConfigRequest, options?: Configuration): Promise<SystemConfig>;
    getSystemInformation(param?: ThoughtSpotRestApiGetSystemInformationRequest, options?: Configuration): Promise<SystemInfo>;
    getSystemOverrideInfo(param?: ThoughtSpotRestApiGetSystemOverrideInfoRequest, options?: Configuration): Promise<any>;
    importMetadataTML(param: ThoughtSpotRestApiImportMetadataTMLRequest, options?: Configuration): Promise<Array<any>>;
    importUserGroups(param?: ThoughtSpotRestApiImportUserGroupsRequest, options?: Configuration): Promise<ImportUserGroupsResponse>;
    importUsers(param: ThoughtSpotRestApiImportUsersRequest, options?: Configuration): Promise<ImportUsersResponse>;
    login(param?: ThoughtSpotRestApiLoginRequest, options?: Configuration): Promise<void>;
    logout(param?: ThoughtSpotRestApiLogoutRequest, options?: Configuration): Promise<void>;
    resetUserPassword(param: ThoughtSpotRestApiResetUserPasswordRequest, options?: Configuration): Promise<void>;
    revertCommit(param: ThoughtSpotRestApiRevertCommitRequest, options?: Configuration): Promise<RevertResponse>;
    revokeToken(param?: ThoughtSpotRestApiRevokeTokenRequest, options?: Configuration): Promise<void>;
    searchCommits(param: ThoughtSpotRestApiSearchCommitsRequest, options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    searchConfig(param?: ThoughtSpotRestApiSearchConfigRequest, options?: Configuration): Promise<Array<RepoConfigObject>>;
    searchConnection(param?: ThoughtSpotRestApiSearchConnectionRequest, options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    searchCustomActions(param?: ThoughtSpotRestApiSearchCustomActionsRequest, options?: Configuration): Promise<Array<ResponseCustomAction>>;
    searchData(param: ThoughtSpotRestApiSearchDataRequest, options?: Configuration): Promise<SearchDataResponse>;
    searchMetadata(param?: ThoughtSpotRestApiSearchMetadataRequest, options?: Configuration): Promise<Array<MetadataSearchResponse>>;
    searchOrgs(param?: ThoughtSpotRestApiSearchOrgsRequest, options?: Configuration): Promise<Array<OrgResponse>>;
    searchRoles(param?: ThoughtSpotRestApiSearchRolesRequest, options?: Configuration): Promise<Array<SearchRoleResponse>>;
    searchSchedules(param?: ThoughtSpotRestApiSearchSchedulesRequest, options?: Configuration): Promise<Array<ResponseSchedule>>;
    searchTags(param?: ThoughtSpotRestApiSearchTagsRequest, options?: Configuration): Promise<Array<Tag>>;
    searchUserGroups(param?: ThoughtSpotRestApiSearchUserGroupsRequest, options?: Configuration): Promise<Array<UserGroupResponse>>;
    searchUsers(param?: ThoughtSpotRestApiSearchUsersRequest, options?: Configuration): Promise<Array<User>>;
    shareMetadata(param: ThoughtSpotRestApiShareMetadataRequest, options?: Configuration): Promise<void>;
    unassignTag(param: ThoughtSpotRestApiUnassignTagRequest, options?: Configuration): Promise<void>;
    updateConfig(param?: ThoughtSpotRestApiUpdateConfigRequest, options?: Configuration): Promise<RepoConfigObject>;
    updateConnection(param: ThoughtSpotRestApiUpdateConnectionRequest, options?: Configuration): Promise<void>;
    updateCustomAction(param: ThoughtSpotRestApiUpdateCustomActionRequest, options?: Configuration): Promise<void>;
    updateOrg(param: ThoughtSpotRestApiUpdateOrgRequest, options?: Configuration): Promise<void>;
    updateRole(param: ThoughtSpotRestApiUpdateRoleRequest, options?: Configuration): Promise<RoleResponse>;
    updateSchedule(param: ThoughtSpotRestApiUpdateScheduleRequest, options?: Configuration): Promise<void>;
    updateSystemConfig(param: ThoughtSpotRestApiUpdateSystemConfigRequest, options?: Configuration): Promise<void>;
    updateTag(param: ThoughtSpotRestApiUpdateTagRequest, options?: Configuration): Promise<void>;
    updateUser(param: ThoughtSpotRestApiUpdateUserRequest, options?: Configuration): Promise<void>;
    updateUserGroup(param: ThoughtSpotRestApiUpdateUserGroupRequest, options?: Configuration): Promise<void>;
    validateMerge(param: ThoughtSpotRestApiValidateMergeRequest, options?: Configuration): Promise<Array<DeployResponse>>;
}
import { UsersApiRequestFactory, UsersApiResponseProcessor } from "../apis/UsersApi";
export interface UsersApiChangeUserPasswordRequest {
    changeUserPasswordRequest: ChangeUserPasswordRequest;
}
export interface UsersApiCreateUserRequest {
    createUserRequest: CreateUserRequest;
}
export interface UsersApiDeleteUserRequest {
    userIdentifier: string;
}
export interface UsersApiForceLogoutUsersRequest {
    forceLogoutUsersRequest?: ForceLogoutUsersRequest;
}
export interface UsersApiImportUsersRequest {
    importUsersRequest: ImportUsersRequest;
}
export interface UsersApiResetUserPasswordRequest {
    resetUserPasswordRequest: ResetUserPasswordRequest;
}
export interface UsersApiSearchUsersRequest {
    searchUsersRequest?: SearchUsersRequest;
}
export interface UsersApiUpdateUserRequest {
    userIdentifier: string;
    updateUserRequest?: UpdateUserRequest;
}
export declare class ObjectUsersApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: UsersApiRequestFactory, responseProcessor?: UsersApiResponseProcessor);
    changeUserPassword(param: UsersApiChangeUserPasswordRequest, options?: Configuration): Promise<void>;
    createUser(param: UsersApiCreateUserRequest, options?: Configuration): Promise<User>;
    deleteUser(param: UsersApiDeleteUserRequest, options?: Configuration): Promise<void>;
    forceLogoutUsers(param?: UsersApiForceLogoutUsersRequest, options?: Configuration): Promise<void>;
    importUsers(param: UsersApiImportUsersRequest, options?: Configuration): Promise<ImportUsersResponse>;
    resetUserPassword(param: UsersApiResetUserPasswordRequest, options?: Configuration): Promise<void>;
    searchUsers(param?: UsersApiSearchUsersRequest, options?: Configuration): Promise<Array<User>>;
    updateUser(param: UsersApiUpdateUserRequest, options?: Configuration): Promise<void>;
}
import { VersionControlApiRequestFactory, VersionControlApiResponseProcessor } from "../apis/VersionControlApi";
export interface VersionControlApiCommitBranchRequest {
    commitBranchRequest: CommitBranchRequest;
}
export interface VersionControlApiCreateConfigRequest {
    createConfigRequest: CreateConfigRequest;
}
export interface VersionControlApiDeleteConfigRequest {
    deleteConfigRequest?: DeleteConfigRequest;
}
export interface VersionControlApiDeployCommitRequest {
    deployCommitRequest?: DeployCommitRequest;
}
export interface VersionControlApiRevertCommitRequest {
    commitId: string;
    revertCommitRequest?: RevertCommitRequest;
}
export interface VersionControlApiSearchCommitsRequest {
    searchCommitsRequest: SearchCommitsRequest;
}
export interface VersionControlApiSearchConfigRequest {
    searchConfigRequest?: SearchConfigRequest;
}
export interface VersionControlApiUpdateConfigRequest {
    updateConfigRequest?: UpdateConfigRequest;
}
export interface VersionControlApiValidateMergeRequest {
    validateMergeRequest: ValidateMergeRequest;
}
export declare class ObjectVersionControlApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: VersionControlApiRequestFactory, responseProcessor?: VersionControlApiResponseProcessor);
    commitBranch(param: VersionControlApiCommitBranchRequest, options?: Configuration): Promise<CommitResponse>;
    createConfig(param: VersionControlApiCreateConfigRequest, options?: Configuration): Promise<RepoConfigObject>;
    deleteConfig(param?: VersionControlApiDeleteConfigRequest, options?: Configuration): Promise<void>;
    deployCommit(param?: VersionControlApiDeployCommitRequest, options?: Configuration): Promise<Array<DeployResponse>>;
    revertCommit(param: VersionControlApiRevertCommitRequest, options?: Configuration): Promise<RevertResponse>;
    searchCommits(param: VersionControlApiSearchCommitsRequest, options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    searchConfig(param?: VersionControlApiSearchConfigRequest, options?: Configuration): Promise<Array<RepoConfigObject>>;
    updateConfig(param?: VersionControlApiUpdateConfigRequest, options?: Configuration): Promise<RepoConfigObject>;
    validateMerge(param: VersionControlApiValidateMergeRequest, options?: Configuration): Promise<Array<DeployResponse>>;
}
