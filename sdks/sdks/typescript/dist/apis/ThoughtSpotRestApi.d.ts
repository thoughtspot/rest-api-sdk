import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
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
export declare class ThoughtSpotRestApiRequestFactory extends BaseAPIRequestFactory {
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext>;
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<RequestContext>;
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<RequestContext>;
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<RequestContext>;
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    dbtSearch(_options?: Configuration): Promise<RequestContext>;
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    deleteConfig(deleteConfigRequest?: DeleteConfigRequest, _options?: Configuration): Promise<RequestContext>;
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<RequestContext>;
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<RequestContext>;
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<RequestContext>;
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<RequestContext>;
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<RequestContext>;
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<RequestContext>;
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<RequestContext>;
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    forceLogoutUsers(forceLogoutUsersRequest?: ForceLogoutUsersRequest, _options?: Configuration): Promise<RequestContext>;
    generateSyncTml(generateSyncTmlRequest: GenerateSyncTmlRequest, _options?: Configuration): Promise<RequestContext>;
    generateTml(generateTmlRequest: GenerateTmlRequest, _options?: Configuration): Promise<RequestContext>;
    getCurrentUserInfo(_options?: Configuration): Promise<RequestContext>;
    getCurrentUserToken(_options?: Configuration): Promise<RequestContext>;
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    getSystemConfig(_options?: Configuration): Promise<RequestContext>;
    getSystemInformation(_options?: Configuration): Promise<RequestContext>;
    getSystemOverrideInfo(_options?: Configuration): Promise<RequestContext>;
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    importUserGroups(importUserGroupsRequest?: ImportUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<RequestContext>;
    login(loginRequest?: LoginRequest, _options?: Configuration): Promise<RequestContext>;
    logout(_options?: Configuration): Promise<RequestContext>;
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    revertCommit(commitId: string, revertCommitRequest?: RevertCommitRequest, _options?: Configuration): Promise<RequestContext>;
    revokeToken(revokeTokenRequest?: RevokeTokenRequest, _options?: Configuration): Promise<RequestContext>;
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<RequestContext>;
    searchConfig(searchConfigRequest?: SearchConfigRequest, _options?: Configuration): Promise<RequestContext>;
    searchConnection(searchConnectionRequest?: SearchConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    searchCustomActions(searchCustomActionsRequest?: SearchCustomActionsRequest, _options?: Configuration): Promise<RequestContext>;
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<RequestContext>;
    searchMetadata(searchMetadataRequest?: SearchMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    searchOrgs(searchOrgsRequest?: SearchOrgsRequest, _options?: Configuration): Promise<RequestContext>;
    searchRoles(searchRolesRequest?: SearchRolesRequest, _options?: Configuration): Promise<RequestContext>;
    searchSchedules(searchSchedulesRequest?: SearchSchedulesRequest, _options?: Configuration): Promise<RequestContext>;
    searchTags(searchTagsRequest?: SearchTagsRequest, _options?: Configuration): Promise<RequestContext>;
    searchUserGroups(searchUserGroupsRequest?: SearchUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    searchUsers(searchUsersRequest?: SearchUsersRequest, _options?: Configuration): Promise<RequestContext>;
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    updateConfig(updateConfigRequest?: UpdateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest?: UpdateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    updateDbtConnection(dbtConnectionIdentifier: string, updateDbtConnectionRequest?: UpdateDbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    updateOrg(orgIdentifier: string, updateOrgRequest?: UpdateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest?: UpdateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<RequestContext>;
    updateTag(tagIdentifier: string, updateTagRequest?: UpdateTagRequest, _options?: Configuration): Promise<RequestContext>;
    updateUser(userIdentifier: string, updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<RequestContext>;
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest?: UpdateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class ThoughtSpotRestApiResponseProcessor {
    activateUser(response: ResponseContext): Promise<User>;
    assignChangeAuthor(response: ResponseContext): Promise<void>;
    assignTag(response: ResponseContext): Promise<void>;
    changeUserPassword(response: ResponseContext): Promise<void>;
    commitBranch(response: ResponseContext): Promise<CommitResponse>;
    createConfig(response: ResponseContext): Promise<RepoConfigObject>;
    createConnection(response: ResponseContext): Promise<CreateConnectionResponse>;
    createCustomAction(response: ResponseContext): Promise<ResponseCustomAction>;
    createOrg(response: ResponseContext): Promise<OrgResponse>;
    createRole(response: ResponseContext): Promise<RoleResponse>;
    createSchedule(response: ResponseContext): Promise<ResponseSchedule>;
    createTag(response: ResponseContext): Promise<Tag>;
    createUser(response: ResponseContext): Promise<User>;
    createUserGroup(response: ResponseContext): Promise<UserGroupResponse>;
    dbtConnection(response: ResponseContext): Promise<any>;
    dbtSearch(response: ResponseContext): Promise<any>;
    deactivateUser(response: ResponseContext): Promise<ResponseActivationURL>;
    deleteConfig(response: ResponseContext): Promise<void>;
    deleteConnection(response: ResponseContext): Promise<void>;
    deleteCustomAction(response: ResponseContext): Promise<void>;
    deleteMetadata(response: ResponseContext): Promise<void>;
    deleteOrg(response: ResponseContext): Promise<void>;
    deleteRole(response: ResponseContext): Promise<void>;
    deleteSchedule(response: ResponseContext): Promise<void>;
    deleteTag(response: ResponseContext): Promise<void>;
    deleteUser(response: ResponseContext): Promise<void>;
    deleteUserGroup(response: ResponseContext): Promise<void>;
    deployCommit(response: ResponseContext): Promise<Array<DeployResponse>>;
    exportAnswerReport(response: ResponseContext): Promise<void>;
    exportLiveboardReport(response: ResponseContext): Promise<void>;
    exportMetadataTML(response: ResponseContext): Promise<Array<any>>;
    fetchAnswerData(response: ResponseContext): Promise<AnswerDataResponse>;
    fetchAnswerSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    fetchLiveboardData(response: ResponseContext): Promise<LiveboardDataResponse>;
    fetchLiveboardSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    fetchLogs(response: ResponseContext): Promise<Array<LogResponse>>;
    fetchPermissionsOfPrincipals(response: ResponseContext): Promise<any>;
    fetchPermissionsOnMetadata(response: ResponseContext): Promise<any>;
    forceLogoutUsers(response: ResponseContext): Promise<void>;
    generateSyncTml(response: ResponseContext): Promise<any>;
    generateTml(response: ResponseContext): Promise<any>;
    getCurrentUserInfo(response: ResponseContext): Promise<User>;
    getCurrentUserToken(response: ResponseContext): Promise<GetTokenResponse>;
    getFullAccessToken(response: ResponseContext): Promise<Token>;
    getObjectAccessToken(response: ResponseContext): Promise<Token>;
    getSystemConfig(response: ResponseContext): Promise<SystemConfig>;
    getSystemInformation(response: ResponseContext): Promise<SystemInfo>;
    getSystemOverrideInfo(response: ResponseContext): Promise<any>;
    importMetadataTML(response: ResponseContext): Promise<Array<any>>;
    importUserGroups(response: ResponseContext): Promise<ImportUserGroupsResponse>;
    importUsers(response: ResponseContext): Promise<ImportUsersResponse>;
    login(response: ResponseContext): Promise<void>;
    logout(response: ResponseContext): Promise<void>;
    resetUserPassword(response: ResponseContext): Promise<void>;
    revertCommit(response: ResponseContext): Promise<RevertResponse>;
    revokeToken(response: ResponseContext): Promise<void>;
    searchCommits(response: ResponseContext): Promise<Array<CommitHistoryResponse>>;
    searchConfig(response: ResponseContext): Promise<Array<RepoConfigObject>>;
    searchConnection(response: ResponseContext): Promise<Array<SearchConnectionResponse>>;
    searchCustomActions(response: ResponseContext): Promise<Array<ResponseCustomAction>>;
    searchData(response: ResponseContext): Promise<SearchDataResponse>;
    searchMetadata(response: ResponseContext): Promise<Array<MetadataSearchResponse>>;
    searchOrgs(response: ResponseContext): Promise<Array<OrgResponse>>;
    searchRoles(response: ResponseContext): Promise<Array<SearchRoleResponse>>;
    searchSchedules(response: ResponseContext): Promise<Array<ResponseSchedule>>;
    searchTags(response: ResponseContext): Promise<Array<Tag>>;
    searchUserGroups(response: ResponseContext): Promise<Array<UserGroupResponse>>;
    searchUsers(response: ResponseContext): Promise<Array<User>>;
    shareMetadata(response: ResponseContext): Promise<void>;
    unassignTag(response: ResponseContext): Promise<void>;
    updateConfig(response: ResponseContext): Promise<RepoConfigObject>;
    updateConnection(response: ResponseContext): Promise<void>;
    updateCustomAction(response: ResponseContext): Promise<void>;
    updateDbtConnection(response: ResponseContext): Promise<void>;
    updateOrg(response: ResponseContext): Promise<void>;
    updateRole(response: ResponseContext): Promise<RoleResponse>;
    updateSchedule(response: ResponseContext): Promise<void>;
    updateSystemConfig(response: ResponseContext): Promise<void>;
    updateTag(response: ResponseContext): Promise<void>;
    updateUser(response: ResponseContext): Promise<void>;
    updateUserGroup(response: ResponseContext): Promise<void>;
    validateMerge(response: ResponseContext): Promise<Array<DeployResponse>>;
}