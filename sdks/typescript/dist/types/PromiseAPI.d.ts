import { Configuration } from '../configuration';
import { ActivateUserRequest } from '../models/ActivateUserRequest';
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
import { DbtConnectionRequest } from '../models/DbtConnectionRequest';
import { DeactivateUserRequest } from '../models/DeactivateUserRequest';
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
import { GenerateSyncTmlRequest } from '../models/GenerateSyncTmlRequest';
import { GenerateTmlRequest } from '../models/GenerateTmlRequest';
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
import { ResponseActivationURL } from '../models/ResponseActivationURL';
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
import { UpdateDbtConnectionRequest } from '../models/UpdateDbtConnectionRequest';
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
export declare class PromiseAuthenticationApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: AuthenticationApiRequestFactory, responseProcessor?: AuthenticationApiResponseProcessor);
    getCurrentUserInfo(_options?: Configuration): Promise<User>;
    getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse>;
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token>;
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token>;
    login(loginRequest?: LoginRequest, _options?: Configuration): Promise<void>;
    logout(_options?: Configuration): Promise<void>;
    revokeToken(revokeTokenRequest?: RevokeTokenRequest, _options?: Configuration): Promise<void>;
}
import { ConnectionsApiRequestFactory, ConnectionsApiResponseProcessor } from "../apis/ConnectionsApi";
export declare class PromiseConnectionsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ConnectionsApiRequestFactory, responseProcessor?: ConnectionsApiResponseProcessor);
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse>;
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void>;
    searchConnection(searchConnectionRequest?: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void>;
}
import { CustomActionApiRequestFactory, CustomActionApiResponseProcessor } from "../apis/CustomActionApi";
export declare class PromiseCustomActionApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: CustomActionApiRequestFactory, responseProcessor?: CustomActionApiResponseProcessor);
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction>;
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void>;
    searchCustomActions(searchCustomActionsRequest?: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>>;
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest?: UpdateCustomActionRequest, _options?: Configuration): Promise<void>;
}
import { DBTApiRequestFactory, DBTApiResponseProcessor } from "../apis/DBTApi";
export declare class PromiseDBTApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: DBTApiRequestFactory, responseProcessor?: DBTApiResponseProcessor);
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<any>;
    dbtSearch(_options?: Configuration): Promise<any>;
    generateSyncTml(generateSyncTmlRequest: GenerateSyncTmlRequest, _options?: Configuration): Promise<any>;
    generateTml(generateTmlRequest: GenerateTmlRequest, _options?: Configuration): Promise<any>;
    updateDbtConnection(dbtConnectionIdentifier: string, updateDbtConnectionRequest?: UpdateDbtConnectionRequest, _options?: Configuration): Promise<void>;
}
import { DataApiRequestFactory, DataApiResponseProcessor } from "../apis/DataApi";
export declare class PromiseDataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: DataApiRequestFactory, responseProcessor?: DataApiResponseProcessor);
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse>;
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse>;
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse>;
}
import { GroupsApiRequestFactory, GroupsApiResponseProcessor } from "../apis/GroupsApi";
export declare class PromiseGroupsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: GroupsApiRequestFactory, responseProcessor?: GroupsApiResponseProcessor);
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse>;
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void>;
    importUserGroups(importUserGroupsRequest?: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse>;
    searchUserGroups(searchUserGroupsRequest?: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>>;
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest?: UpdateUserGroupRequest, _options?: Configuration): Promise<void>;
}
import { LogApiRequestFactory, LogApiResponseProcessor } from "../apis/LogApi";
export declare class PromiseLogApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: LogApiRequestFactory, responseProcessor?: LogApiResponseProcessor);
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>>;
}
import { MetadataApiRequestFactory, MetadataApiResponseProcessor } from "../apis/MetadataApi";
export declare class PromiseMetadataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: MetadataApiRequestFactory, responseProcessor?: MetadataApiResponseProcessor);
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void>;
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    searchMetadata(searchMetadataRequest?: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>>;
}
import { OrgsApiRequestFactory, OrgsApiResponseProcessor } from "../apis/OrgsApi";
export declare class PromiseOrgsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: OrgsApiRequestFactory, responseProcessor?: OrgsApiResponseProcessor);
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse>;
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void>;
    searchOrgs(searchOrgsRequest?: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>>;
    updateOrg(orgIdentifier: string, updateOrgRequest?: UpdateOrgRequest, _options?: Configuration): Promise<void>;
}
import { ReportsApiRequestFactory, ReportsApiResponseProcessor } from "../apis/ReportsApi";
export declare class PromiseReportsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ReportsApiRequestFactory, responseProcessor?: ReportsApiResponseProcessor);
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<void>;
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<void>;
}
import { RolesApiRequestFactory, RolesApiResponseProcessor } from "../apis/RolesApi";
export declare class PromiseRolesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: RolesApiRequestFactory, responseProcessor?: RolesApiResponseProcessor);
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void>;
    searchRoles(searchRolesRequest?: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>>;
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
}
import { SchedulesApiRequestFactory, SchedulesApiResponseProcessor } from "../apis/SchedulesApi";
export declare class PromiseSchedulesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SchedulesApiRequestFactory, responseProcessor?: SchedulesApiResponseProcessor);
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule>;
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void>;
    searchSchedules(searchSchedulesRequest?: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>>;
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest?: UpdateScheduleRequest, _options?: Configuration): Promise<void>;
}
import { SecurityApiRequestFactory, SecurityApiResponseProcessor } from "../apis/SecurityApi";
export declare class PromiseSecurityApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SecurityApiRequestFactory, responseProcessor?: SecurityApiResponseProcessor);
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void>;
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<any>;
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<any>;
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void>;
}
import { SystemApiRequestFactory, SystemApiResponseProcessor } from "../apis/SystemApi";
export declare class PromiseSystemApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SystemApiRequestFactory, responseProcessor?: SystemApiResponseProcessor);
    getSystemConfig(_options?: Configuration): Promise<SystemConfig>;
    getSystemInformation(_options?: Configuration): Promise<SystemInfo>;
    getSystemOverrideInfo(_options?: Configuration): Promise<any>;
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void>;
}
import { TagsApiRequestFactory, TagsApiResponseProcessor } from "../apis/TagsApi";
export declare class PromiseTagsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: TagsApiRequestFactory, responseProcessor?: TagsApiResponseProcessor);
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag>;
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void>;
    searchTags(searchTagsRequest?: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>>;
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    updateTag(tagIdentifier: string, updateTagRequest?: UpdateTagRequest, _options?: Configuration): Promise<void>;
}
import { ThoughtSpotRestApiRequestFactory, ThoughtSpotRestApiResponseProcessor } from "../apis/ThoughtSpotRestApi";
export declare class PromiseThoughtSpotRestApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ThoughtSpotRestApiRequestFactory, responseProcessor?: ThoughtSpotRestApiResponseProcessor);
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<User>;
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void>;
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void>;
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse>;
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse>;
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction>;
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse>;
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule>;
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag>;
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User>;
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse>;
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<any>;
    dbtSearch(_options?: Configuration): Promise<any>;
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<ResponseActivationURL>;
    deleteConfig(deleteConfigRequest?: DeleteConfigRequest, _options?: Configuration): Promise<void>;
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void>;
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void>;
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void>;
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void>;
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void>;
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void>;
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void>;
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<void>;
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void>;
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<void>;
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<void>;
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse>;
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse>;
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>>;
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<any>;
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<any>;
    forceLogoutUsers(forceLogoutUsersRequest?: ForceLogoutUsersRequest, _options?: Configuration): Promise<void>;
    generateSyncTml(generateSyncTmlRequest: GenerateSyncTmlRequest, _options?: Configuration): Promise<any>;
    generateTml(generateTmlRequest: GenerateTmlRequest, _options?: Configuration): Promise<any>;
    getCurrentUserInfo(_options?: Configuration): Promise<User>;
    getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse>;
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token>;
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token>;
    getSystemConfig(_options?: Configuration): Promise<SystemConfig>;
    getSystemInformation(_options?: Configuration): Promise<SystemInfo>;
    getSystemOverrideInfo(_options?: Configuration): Promise<any>;
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    importUserGroups(importUserGroupsRequest?: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse>;
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse>;
    login(loginRequest?: LoginRequest, _options?: Configuration): Promise<void>;
    logout(_options?: Configuration): Promise<void>;
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void>;
    revertCommit(commitId: string, revertCommitRequest?: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse>;
    revokeToken(revokeTokenRequest?: RevokeTokenRequest, _options?: Configuration): Promise<void>;
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    searchConfig(searchConfigRequest?: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>>;
    searchConnection(searchConnectionRequest?: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    searchCustomActions(searchCustomActionsRequest?: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>>;
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse>;
    searchMetadata(searchMetadataRequest?: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>>;
    searchOrgs(searchOrgsRequest?: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>>;
    searchRoles(searchRolesRequest?: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>>;
    searchSchedules(searchSchedulesRequest?: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>>;
    searchTags(searchTagsRequest?: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>>;
    searchUserGroups(searchUserGroupsRequest?: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>>;
    searchUsers(searchUsersRequest?: SearchUsersRequest, _options?: Configuration): Promise<Array<User>>;
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void>;
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    updateConfig(updateConfigRequest?: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void>;
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest?: UpdateCustomActionRequest, _options?: Configuration): Promise<void>;
    updateDbtConnection(dbtConnectionIdentifier: string, updateDbtConnectionRequest?: UpdateDbtConnectionRequest, _options?: Configuration): Promise<void>;
    updateOrg(orgIdentifier: string, updateOrgRequest?: UpdateOrgRequest, _options?: Configuration): Promise<void>;
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest?: UpdateScheduleRequest, _options?: Configuration): Promise<void>;
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void>;
    updateTag(tagIdentifier: string, updateTagRequest?: UpdateTagRequest, _options?: Configuration): Promise<void>;
    updateUser(userIdentifier: string, updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<void>;
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest?: UpdateUserGroupRequest, _options?: Configuration): Promise<void>;
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
}
import { UsersApiRequestFactory, UsersApiResponseProcessor } from "../apis/UsersApi";
export declare class PromiseUsersApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: UsersApiRequestFactory, responseProcessor?: UsersApiResponseProcessor);
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<User>;
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void>;
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User>;
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<ResponseActivationURL>;
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<void>;
    forceLogoutUsers(forceLogoutUsersRequest?: ForceLogoutUsersRequest, _options?: Configuration): Promise<void>;
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse>;
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void>;
    searchUsers(searchUsersRequest?: SearchUsersRequest, _options?: Configuration): Promise<Array<User>>;
    updateUser(userIdentifier: string, updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<void>;
}
import { VersionControlApiRequestFactory, VersionControlApiResponseProcessor } from "../apis/VersionControlApi";
export declare class PromiseVersionControlApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: VersionControlApiRequestFactory, responseProcessor?: VersionControlApiResponseProcessor);
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse>;
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    deleteConfig(deleteConfigRequest?: DeleteConfigRequest, _options?: Configuration): Promise<void>;
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
    revertCommit(commitId: string, revertCommitRequest?: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse>;
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    searchConfig(searchConfigRequest?: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>>;
    updateConfig(updateConfigRequest?: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
}
