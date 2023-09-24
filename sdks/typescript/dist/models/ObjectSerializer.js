"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __exportStar = (this && this.__exportStar) || function(m, exports) {
    for (var p in m) if (p !== "default" && !Object.prototype.hasOwnProperty.call(exports, p)) __createBinding(exports, m, p);
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.ObjectSerializer = void 0;
__exportStar(require("../models/APIKey"), exports);
__exportStar(require("../models/APIKeyInput"), exports);
__exportStar(require("../models/ActionConfig"), exports);
__exportStar(require("../models/ActionConfigInput"), exports);
__exportStar(require("../models/ActionConfigInputCreate"), exports);
__exportStar(require("../models/ActionDetails"), exports);
__exportStar(require("../models/ActionDetailsInput"), exports);
__exportStar(require("../models/ActionDetailsInputCreate"), exports);
__exportStar(require("../models/ActivateUserRequest"), exports);
__exportStar(require("../models/AnswerContent"), exports);
__exportStar(require("../models/AnswerDataResponse"), exports);
__exportStar(require("../models/AssignChangeAuthorRequest"), exports);
__exportStar(require("../models/AssignTagRequest"), exports);
__exportStar(require("../models/AssociateMetadataInput"), exports);
__exportStar(require("../models/AssociateMetadataInputCreate"), exports);
__exportStar(require("../models/Authentication"), exports);
__exportStar(require("../models/AuthenticationInput"), exports);
__exportStar(require("../models/Author"), exports);
__exportStar(require("../models/AuthorMetadataTypeInput"), exports);
__exportStar(require("../models/AuthorType"), exports);
__exportStar(require("../models/BasicAuth"), exports);
__exportStar(require("../models/BasicAuthInput"), exports);
__exportStar(require("../models/CALLBACK"), exports);
__exportStar(require("../models/CALLBACKInput"), exports);
__exportStar(require("../models/CALLBACKInputMandatory"), exports);
__exportStar(require("../models/ChangeUserPasswordRequest"), exports);
__exportStar(require("../models/Column"), exports);
__exportStar(require("../models/CommitBranchRequest"), exports);
__exportStar(require("../models/CommitFileType"), exports);
__exportStar(require("../models/CommitHistoryResponse"), exports);
__exportStar(require("../models/CommitResponse"), exports);
__exportStar(require("../models/CommiterType"), exports);
__exportStar(require("../models/ConnectionInput"), exports);
__exportStar(require("../models/CreateConfigRequest"), exports);
__exportStar(require("../models/CreateConnectionRequest"), exports);
__exportStar(require("../models/CreateConnectionResponse"), exports);
__exportStar(require("../models/CreateCustomActionRequest"), exports);
__exportStar(require("../models/CreateOrgRequest"), exports);
__exportStar(require("../models/CreateRoleRequest"), exports);
__exportStar(require("../models/CreateScheduleRequest"), exports);
__exportStar(require("../models/CreateTagRequest"), exports);
__exportStar(require("../models/CreateUserGroupRequest"), exports);
__exportStar(require("../models/CreateUserRequest"), exports);
__exportStar(require("../models/CronExpression"), exports);
__exportStar(require("../models/CronExpressionInput"), exports);
__exportStar(require("../models/CustomActionMetadataTypeInput"), exports);
__exportStar(require("../models/DataWarehouseObjectInput"), exports);
__exportStar(require("../models/DataWarehouseObjects"), exports);
__exportStar(require("../models/Database"), exports);
__exportStar(require("../models/DbtConnectionRequest"), exports);
__exportStar(require("../models/DeactivateUserRequest"), exports);
__exportStar(require("../models/DefaultActionConfig"), exports);
__exportStar(require("../models/DefaultActionConfigInput"), exports);
__exportStar(require("../models/DefaultActionConfigInputCreate"), exports);
__exportStar(require("../models/DefaultActionConfigSearchInput"), exports);
__exportStar(require("../models/DeleteConfigRequest"), exports);
__exportStar(require("../models/DeleteConnectionRequest"), exports);
__exportStar(require("../models/DeleteMetadataRequest"), exports);
__exportStar(require("../models/DeleteMetadataTypeInput"), exports);
__exportStar(require("../models/DeployCommitRequest"), exports);
__exportStar(require("../models/DeployResponse"), exports);
__exportStar(require("../models/ErrorResponse"), exports);
__exportStar(require("../models/ExcludeMetadataListItemInput"), exports);
__exportStar(require("../models/ExportAnswerReportRequest"), exports);
__exportStar(require("../models/ExportLiveboardReportRequest"), exports);
__exportStar(require("../models/ExportMetadataTMLRequest"), exports);
__exportStar(require("../models/ExportMetadataTypeInput"), exports);
__exportStar(require("../models/FavoriteMetadataInput"), exports);
__exportStar(require("../models/FavoriteMetadataItem"), exports);
__exportStar(require("../models/FavoriteObjectOptionsInput"), exports);
__exportStar(require("../models/FetchAnswerDataRequest"), exports);
__exportStar(require("../models/FetchAnswerSqlQueryRequest"), exports);
__exportStar(require("../models/FetchLiveboardDataRequest"), exports);
__exportStar(require("../models/FetchLiveboardSqlQueryRequest"), exports);
__exportStar(require("../models/FetchLogsRequest"), exports);
__exportStar(require("../models/FetchPermissionsOfPrincipalsRequest"), exports);
__exportStar(require("../models/FetchPermissionsOnMetadataRequest"), exports);
__exportStar(require("../models/ForceLogoutUsersRequest"), exports);
__exportStar(require("../models/Frequency"), exports);
__exportStar(require("../models/FrequencyInput"), exports);
__exportStar(require("../models/GenerateSyncTmlRequest"), exports);
__exportStar(require("../models/GenerateTmlRequest"), exports);
__exportStar(require("../models/GenericInfo"), exports);
__exportStar(require("../models/GetFullAccessTokenRequest"), exports);
__exportStar(require("../models/GetObjectAccessTokenRequest"), exports);
__exportStar(require("../models/GetTokenResponse"), exports);
__exportStar(require("../models/GroupsImportListInput"), exports);
__exportStar(require("../models/ImportMetadataTMLRequest"), exports);
__exportStar(require("../models/ImportUser"), exports);
__exportStar(require("../models/ImportUserGroupsRequest"), exports);
__exportStar(require("../models/ImportUserGroupsResponse"), exports);
__exportStar(require("../models/ImportUserType"), exports);
__exportStar(require("../models/ImportUsersRequest"), exports);
__exportStar(require("../models/ImportUsersResponse"), exports);
__exportStar(require("../models/JWTMetadataObject"), exports);
__exportStar(require("../models/JWTParameter"), exports);
__exportStar(require("../models/JWTUserOptions"), exports);
__exportStar(require("../models/JWTUserOptionsParametersInner"), exports);
__exportStar(require("../models/LiveboardContent"), exports);
__exportStar(require("../models/LiveboardDataResponse"), exports);
__exportStar(require("../models/LiveboardOptions"), exports);
__exportStar(require("../models/LiveboardOptionsInput"), exports);
__exportStar(require("../models/LogResponse"), exports);
__exportStar(require("../models/LoginRequest"), exports);
__exportStar(require("../models/MetadataAssociationItem"), exports);
__exportStar(require("../models/MetadataInput"), exports);
__exportStar(require("../models/MetadataListItemInput"), exports);
__exportStar(require("../models/MetadataObject"), exports);
__exportStar(require("../models/MetadataResponse"), exports);
__exportStar(require("../models/MetadataSearchResponse"), exports);
__exportStar(require("../models/MetadataSearchSortOptions"), exports);
__exportStar(require("../models/ModelTableList"), exports);
__exportStar(require("../models/ObjectIDAndName"), exports);
__exportStar(require("../models/Org"), exports);
__exportStar(require("../models/OrgResponse"), exports);
__exportStar(require("../models/ParametersListItem"), exports);
__exportStar(require("../models/ParametersListItemInput"), exports);
__exportStar(require("../models/PdfOptions"), exports);
__exportStar(require("../models/PdfOptionsInput"), exports);
__exportStar(require("../models/PermissionInput"), exports);
__exportStar(require("../models/PermissionsMetadataTypeInput"), exports);
__exportStar(require("../models/PngOptionsInput"), exports);
__exportStar(require("../models/PrincipalsInput"), exports);
__exportStar(require("../models/PrincipalsListItem"), exports);
__exportStar(require("../models/PrincipalsListItemInput"), exports);
__exportStar(require("../models/RecipientDetails"), exports);
__exportStar(require("../models/RecipientDetailsInput"), exports);
__exportStar(require("../models/RepoConfigObject"), exports);
__exportStar(require("../models/ResetUserPasswordRequest"), exports);
__exportStar(require("../models/ResponseActivationURL"), exports);
__exportStar(require("../models/ResponseCustomAction"), exports);
__exportStar(require("../models/ResponseSchedule"), exports);
__exportStar(require("../models/ResponseScheduleRun"), exports);
__exportStar(require("../models/RevertCommitRequest"), exports);
__exportStar(require("../models/RevertResponse"), exports);
__exportStar(require("../models/RevertedMetadata"), exports);
__exportStar(require("../models/RevokeTokenRequest"), exports);
__exportStar(require("../models/RiseSetter"), exports);
__exportStar(require("../models/Role"), exports);
__exportStar(require("../models/RoleResponse"), exports);
__exportStar(require("../models/RuntimeFilter"), exports);
__exportStar(require("../models/RuntimeParamOverride"), exports);
__exportStar(require("../models/RuntimeSort"), exports);
__exportStar(require("../models/ScheduleHistoryRunsOptionsInput"), exports);
__exportStar(require("../models/SchedulesPdfOptionsInput"), exports);
__exportStar(require("../models/SchemaObject"), exports);
__exportStar(require("../models/Scope"), exports);
__exportStar(require("../models/SearchCommitsRequest"), exports);
__exportStar(require("../models/SearchConfigRequest"), exports);
__exportStar(require("../models/SearchConnectionRequest"), exports);
__exportStar(require("../models/SearchConnectionResponse"), exports);
__exportStar(require("../models/SearchCustomActionsRequest"), exports);
__exportStar(require("../models/SearchDataRequest"), exports);
__exportStar(require("../models/SearchDataResponse"), exports);
__exportStar(require("../models/SearchMetadataRequest"), exports);
__exportStar(require("../models/SearchOrgsRequest"), exports);
__exportStar(require("../models/SearchRoleResponse"), exports);
__exportStar(require("../models/SearchRolesRequest"), exports);
__exportStar(require("../models/SearchSchedulesRequest"), exports);
__exportStar(require("../models/SearchTagsRequest"), exports);
__exportStar(require("../models/SearchUserGroupsRequest"), exports);
__exportStar(require("../models/SearchUsersRequest"), exports);
__exportStar(require("../models/ShareMetadataRequest"), exports);
__exportStar(require("../models/SharePermissionsInput"), exports);
__exportStar(require("../models/SortOptionInput"), exports);
__exportStar(require("../models/SortOptions"), exports);
__exportStar(require("../models/SortingOptions"), exports);
__exportStar(require("../models/SqlQuery"), exports);
__exportStar(require("../models/SqlQueryResponse"), exports);
__exportStar(require("../models/SystemConfig"), exports);
__exportStar(require("../models/SystemInfo"), exports);
__exportStar(require("../models/Table"), exports);
__exportStar(require("../models/Tag"), exports);
__exportStar(require("../models/TagMetadataTypeInput"), exports);
__exportStar(require("../models/Token"), exports);
__exportStar(require("../models/URL"), exports);
__exportStar(require("../models/URLInput"), exports);
__exportStar(require("../models/URLInputMandatory"), exports);
__exportStar(require("../models/UpdateConfigRequest"), exports);
__exportStar(require("../models/UpdateConnectionRequest"), exports);
__exportStar(require("../models/UpdateCustomActionRequest"), exports);
__exportStar(require("../models/UpdateDbtConnectionRequest"), exports);
__exportStar(require("../models/UpdateOrgRequest"), exports);
__exportStar(require("../models/UpdateRoleRequest"), exports);
__exportStar(require("../models/UpdateScheduleRequest"), exports);
__exportStar(require("../models/UpdateSystemConfigRequest"), exports);
__exportStar(require("../models/UpdateTagRequest"), exports);
__exportStar(require("../models/UpdateUserGroupRequest"), exports);
__exportStar(require("../models/UpdateUserRequest"), exports);
__exportStar(require("../models/User"), exports);
__exportStar(require("../models/UserGroup"), exports);
__exportStar(require("../models/UserGroupResponse"), exports);
__exportStar(require("../models/ValidateMergeRequest"), exports);
var APIKey_1 = require("../models/APIKey");
var APIKeyInput_1 = require("../models/APIKeyInput");
var ActionConfig_1 = require("../models/ActionConfig");
var ActionConfigInput_1 = require("../models/ActionConfigInput");
var ActionConfigInputCreate_1 = require("../models/ActionConfigInputCreate");
var ActionDetails_1 = require("../models/ActionDetails");
var ActionDetailsInput_1 = require("../models/ActionDetailsInput");
var ActionDetailsInputCreate_1 = require("../models/ActionDetailsInputCreate");
var ActivateUserRequest_1 = require("../models/ActivateUserRequest");
var AnswerContent_1 = require("../models/AnswerContent");
var AnswerDataResponse_1 = require("../models/AnswerDataResponse");
var AssignChangeAuthorRequest_1 = require("../models/AssignChangeAuthorRequest");
var AssignTagRequest_1 = require("../models/AssignTagRequest");
var AssociateMetadataInput_1 = require("../models/AssociateMetadataInput");
var AssociateMetadataInputCreate_1 = require("../models/AssociateMetadataInputCreate");
var Authentication_1 = require("../models/Authentication");
var AuthenticationInput_1 = require("../models/AuthenticationInput");
var Author_1 = require("../models/Author");
var AuthorMetadataTypeInput_1 = require("../models/AuthorMetadataTypeInput");
var AuthorType_1 = require("../models/AuthorType");
var BasicAuth_1 = require("../models/BasicAuth");
var BasicAuthInput_1 = require("../models/BasicAuthInput");
var CALLBACK_1 = require("../models/CALLBACK");
var CALLBACKInput_1 = require("../models/CALLBACKInput");
var CALLBACKInputMandatory_1 = require("../models/CALLBACKInputMandatory");
var ChangeUserPasswordRequest_1 = require("../models/ChangeUserPasswordRequest");
var Column_1 = require("../models/Column");
var CommitBranchRequest_1 = require("../models/CommitBranchRequest");
var CommitFileType_1 = require("../models/CommitFileType");
var CommitHistoryResponse_1 = require("../models/CommitHistoryResponse");
var CommitResponse_1 = require("../models/CommitResponse");
var CommiterType_1 = require("../models/CommiterType");
var ConnectionInput_1 = require("../models/ConnectionInput");
var CreateConfigRequest_1 = require("../models/CreateConfigRequest");
var CreateConnectionRequest_1 = require("../models/CreateConnectionRequest");
var CreateConnectionResponse_1 = require("../models/CreateConnectionResponse");
var CreateCustomActionRequest_1 = require("../models/CreateCustomActionRequest");
var CreateOrgRequest_1 = require("../models/CreateOrgRequest");
var CreateRoleRequest_1 = require("../models/CreateRoleRequest");
var CreateScheduleRequest_1 = require("../models/CreateScheduleRequest");
var CreateTagRequest_1 = require("../models/CreateTagRequest");
var CreateUserGroupRequest_1 = require("../models/CreateUserGroupRequest");
var CreateUserRequest_1 = require("../models/CreateUserRequest");
var CronExpression_1 = require("../models/CronExpression");
var CronExpressionInput_1 = require("../models/CronExpressionInput");
var CustomActionMetadataTypeInput_1 = require("../models/CustomActionMetadataTypeInput");
var DataWarehouseObjectInput_1 = require("../models/DataWarehouseObjectInput");
var DataWarehouseObjects_1 = require("../models/DataWarehouseObjects");
var Database_1 = require("../models/Database");
var DbtConnectionRequest_1 = require("../models/DbtConnectionRequest");
var DeactivateUserRequest_1 = require("../models/DeactivateUserRequest");
var DefaultActionConfig_1 = require("../models/DefaultActionConfig");
var DefaultActionConfigInput_1 = require("../models/DefaultActionConfigInput");
var DefaultActionConfigInputCreate_1 = require("../models/DefaultActionConfigInputCreate");
var DefaultActionConfigSearchInput_1 = require("../models/DefaultActionConfigSearchInput");
var DeleteConfigRequest_1 = require("../models/DeleteConfigRequest");
var DeleteConnectionRequest_1 = require("../models/DeleteConnectionRequest");
var DeleteMetadataRequest_1 = require("../models/DeleteMetadataRequest");
var DeleteMetadataTypeInput_1 = require("../models/DeleteMetadataTypeInput");
var DeployCommitRequest_1 = require("../models/DeployCommitRequest");
var DeployResponse_1 = require("../models/DeployResponse");
var ErrorResponse_1 = require("../models/ErrorResponse");
var ExcludeMetadataListItemInput_1 = require("../models/ExcludeMetadataListItemInput");
var ExportAnswerReportRequest_1 = require("../models/ExportAnswerReportRequest");
var ExportLiveboardReportRequest_1 = require("../models/ExportLiveboardReportRequest");
var ExportMetadataTMLRequest_1 = require("../models/ExportMetadataTMLRequest");
var ExportMetadataTypeInput_1 = require("../models/ExportMetadataTypeInput");
var FavoriteMetadataInput_1 = require("../models/FavoriteMetadataInput");
var FavoriteMetadataItem_1 = require("../models/FavoriteMetadataItem");
var FavoriteObjectOptionsInput_1 = require("../models/FavoriteObjectOptionsInput");
var FetchAnswerDataRequest_1 = require("../models/FetchAnswerDataRequest");
var FetchAnswerSqlQueryRequest_1 = require("../models/FetchAnswerSqlQueryRequest");
var FetchLiveboardDataRequest_1 = require("../models/FetchLiveboardDataRequest");
var FetchLiveboardSqlQueryRequest_1 = require("../models/FetchLiveboardSqlQueryRequest");
var FetchLogsRequest_1 = require("../models/FetchLogsRequest");
var FetchPermissionsOfPrincipalsRequest_1 = require("../models/FetchPermissionsOfPrincipalsRequest");
var FetchPermissionsOnMetadataRequest_1 = require("../models/FetchPermissionsOnMetadataRequest");
var ForceLogoutUsersRequest_1 = require("../models/ForceLogoutUsersRequest");
var Frequency_1 = require("../models/Frequency");
var FrequencyInput_1 = require("../models/FrequencyInput");
var GenerateSyncTmlRequest_1 = require("../models/GenerateSyncTmlRequest");
var GenerateTmlRequest_1 = require("../models/GenerateTmlRequest");
var GenericInfo_1 = require("../models/GenericInfo");
var GetFullAccessTokenRequest_1 = require("../models/GetFullAccessTokenRequest");
var GetObjectAccessTokenRequest_1 = require("../models/GetObjectAccessTokenRequest");
var GetTokenResponse_1 = require("../models/GetTokenResponse");
var GroupsImportListInput_1 = require("../models/GroupsImportListInput");
var ImportMetadataTMLRequest_1 = require("../models/ImportMetadataTMLRequest");
var ImportUser_1 = require("../models/ImportUser");
var ImportUserGroupsRequest_1 = require("../models/ImportUserGroupsRequest");
var ImportUserGroupsResponse_1 = require("../models/ImportUserGroupsResponse");
var ImportUserType_1 = require("../models/ImportUserType");
var ImportUsersRequest_1 = require("../models/ImportUsersRequest");
var ImportUsersResponse_1 = require("../models/ImportUsersResponse");
var JWTMetadataObject_1 = require("../models/JWTMetadataObject");
var JWTParameter_1 = require("../models/JWTParameter");
var JWTUserOptions_1 = require("../models/JWTUserOptions");
var JWTUserOptionsParametersInner_1 = require("../models/JWTUserOptionsParametersInner");
var LiveboardContent_1 = require("../models/LiveboardContent");
var LiveboardDataResponse_1 = require("../models/LiveboardDataResponse");
var LiveboardOptions_1 = require("../models/LiveboardOptions");
var LiveboardOptionsInput_1 = require("../models/LiveboardOptionsInput");
var LogResponse_1 = require("../models/LogResponse");
var LoginRequest_1 = require("../models/LoginRequest");
var MetadataAssociationItem_1 = require("../models/MetadataAssociationItem");
var MetadataInput_1 = require("../models/MetadataInput");
var MetadataListItemInput_1 = require("../models/MetadataListItemInput");
var MetadataObject_1 = require("../models/MetadataObject");
var MetadataResponse_1 = require("../models/MetadataResponse");
var MetadataSearchResponse_1 = require("../models/MetadataSearchResponse");
var MetadataSearchSortOptions_1 = require("../models/MetadataSearchSortOptions");
var ModelTableList_1 = require("../models/ModelTableList");
var ObjectIDAndName_1 = require("../models/ObjectIDAndName");
var Org_1 = require("../models/Org");
var OrgResponse_1 = require("../models/OrgResponse");
var ParametersListItem_1 = require("../models/ParametersListItem");
var ParametersListItemInput_1 = require("../models/ParametersListItemInput");
var PdfOptions_1 = require("../models/PdfOptions");
var PdfOptionsInput_1 = require("../models/PdfOptionsInput");
var PermissionInput_1 = require("../models/PermissionInput");
var PermissionsMetadataTypeInput_1 = require("../models/PermissionsMetadataTypeInput");
var PngOptionsInput_1 = require("../models/PngOptionsInput");
var PrincipalsInput_1 = require("../models/PrincipalsInput");
var PrincipalsListItem_1 = require("../models/PrincipalsListItem");
var PrincipalsListItemInput_1 = require("../models/PrincipalsListItemInput");
var RecipientDetails_1 = require("../models/RecipientDetails");
var RecipientDetailsInput_1 = require("../models/RecipientDetailsInput");
var RepoConfigObject_1 = require("../models/RepoConfigObject");
var ResetUserPasswordRequest_1 = require("../models/ResetUserPasswordRequest");
var ResponseActivationURL_1 = require("../models/ResponseActivationURL");
var ResponseCustomAction_1 = require("../models/ResponseCustomAction");
var ResponseSchedule_1 = require("../models/ResponseSchedule");
var ResponseScheduleRun_1 = require("../models/ResponseScheduleRun");
var RevertCommitRequest_1 = require("../models/RevertCommitRequest");
var RevertResponse_1 = require("../models/RevertResponse");
var RevertedMetadata_1 = require("../models/RevertedMetadata");
var RevokeTokenRequest_1 = require("../models/RevokeTokenRequest");
var RiseSetter_1 = require("../models/RiseSetter");
var Role_1 = require("../models/Role");
var RoleResponse_1 = require("../models/RoleResponse");
var RuntimeFilter_1 = require("../models/RuntimeFilter");
var RuntimeParamOverride_1 = require("../models/RuntimeParamOverride");
var RuntimeSort_1 = require("../models/RuntimeSort");
var ScheduleHistoryRunsOptionsInput_1 = require("../models/ScheduleHistoryRunsOptionsInput");
var SchedulesPdfOptionsInput_1 = require("../models/SchedulesPdfOptionsInput");
var SchemaObject_1 = require("../models/SchemaObject");
var Scope_1 = require("../models/Scope");
var SearchCommitsRequest_1 = require("../models/SearchCommitsRequest");
var SearchConfigRequest_1 = require("../models/SearchConfigRequest");
var SearchConnectionRequest_1 = require("../models/SearchConnectionRequest");
var SearchConnectionResponse_1 = require("../models/SearchConnectionResponse");
var SearchCustomActionsRequest_1 = require("../models/SearchCustomActionsRequest");
var SearchDataRequest_1 = require("../models/SearchDataRequest");
var SearchDataResponse_1 = require("../models/SearchDataResponse");
var SearchMetadataRequest_1 = require("../models/SearchMetadataRequest");
var SearchOrgsRequest_1 = require("../models/SearchOrgsRequest");
var SearchRoleResponse_1 = require("../models/SearchRoleResponse");
var SearchRolesRequest_1 = require("../models/SearchRolesRequest");
var SearchSchedulesRequest_1 = require("../models/SearchSchedulesRequest");
var SearchTagsRequest_1 = require("../models/SearchTagsRequest");
var SearchUserGroupsRequest_1 = require("../models/SearchUserGroupsRequest");
var SearchUsersRequest_1 = require("../models/SearchUsersRequest");
var ShareMetadataRequest_1 = require("../models/ShareMetadataRequest");
var SharePermissionsInput_1 = require("../models/SharePermissionsInput");
var SortOptionInput_1 = require("../models/SortOptionInput");
var SortOptions_1 = require("../models/SortOptions");
var SortingOptions_1 = require("../models/SortingOptions");
var SqlQuery_1 = require("../models/SqlQuery");
var SqlQueryResponse_1 = require("../models/SqlQueryResponse");
var SystemConfig_1 = require("../models/SystemConfig");
var SystemInfo_1 = require("../models/SystemInfo");
var Table_1 = require("../models/Table");
var Tag_1 = require("../models/Tag");
var TagMetadataTypeInput_1 = require("../models/TagMetadataTypeInput");
var Token_1 = require("../models/Token");
var URL_1 = require("../models/URL");
var URLInput_1 = require("../models/URLInput");
var URLInputMandatory_1 = require("../models/URLInputMandatory");
var UpdateConfigRequest_1 = require("../models/UpdateConfigRequest");
var UpdateConnectionRequest_1 = require("../models/UpdateConnectionRequest");
var UpdateCustomActionRequest_1 = require("../models/UpdateCustomActionRequest");
var UpdateDbtConnectionRequest_1 = require("../models/UpdateDbtConnectionRequest");
var UpdateOrgRequest_1 = require("../models/UpdateOrgRequest");
var UpdateRoleRequest_1 = require("../models/UpdateRoleRequest");
var UpdateScheduleRequest_1 = require("../models/UpdateScheduleRequest");
var UpdateSystemConfigRequest_1 = require("../models/UpdateSystemConfigRequest");
var UpdateTagRequest_1 = require("../models/UpdateTagRequest");
var UpdateUserGroupRequest_1 = require("../models/UpdateUserGroupRequest");
var UpdateUserRequest_1 = require("../models/UpdateUserRequest");
var User_1 = require("../models/User");
var UserGroup_1 = require("../models/UserGroup");
var UserGroupResponse_1 = require("../models/UserGroupResponse");
var ValidateMergeRequest_1 = require("../models/ValidateMergeRequest");
var primitives = [
    "string",
    "boolean",
    "double",
    "integer",
    "long",
    "float",
    "number",
    "any"
];
var supportedMediaTypes = {
    "application/json": Infinity,
    "application/octet-stream": 0,
    "application/x-www-form-urlencoded": 0
};
var enumsMap = new Set([
    "ActionConfigInputPositionEnum",
    "ActionConfigInputCreatePositionEnum",
    "AssociateMetadataInputTypeEnum",
    "AssociateMetadataInputCreateTypeEnum",
    "AuthorMetadataTypeInputTypeEnum",
    "CreateConnectionRequestDataWarehouseTypeEnum",
    "CreateConnectionResponseDataWarehouseTypeEnum",
    "CreateRoleRequestPrivilegesEnum",
    "CreateScheduleRequestMetadataTypeEnum",
    "CreateScheduleRequestFileFormatEnum",
    "CreateScheduleRequestTimeZoneEnum",
    "CreateUserGroupRequestPrivilegesEnum",
    "CreateUserGroupRequestTypeEnum",
    "CreateUserGroupRequestVisibilityEnum",
    "CreateUserRequestAccountTypeEnum",
    "CreateUserRequestAccountStatusEnum",
    "CreateUserRequestVisibilityEnum",
    "CreateUserRequestPreferredLocaleEnum",
    "CustomActionMetadataTypeInputTypeEnum",
    "DbtConnectionRequestImportTypeEnum",
    "DeleteMetadataTypeInputTypeEnum",
    "DeployCommitRequestDeployTypeEnum",
    "DeployCommitRequestDeployPolicyEnum",
    "ExcludeMetadataListItemInputTypeEnum",
    "ExportAnswerReportRequestFileFormatEnum",
    "ExportLiveboardReportRequestFileFormatEnum",
    "ExportMetadataTMLRequestEdocFormatEnum",
    "ExportMetadataTypeInputTypeEnum",
    "FavoriteMetadataInputTypeEnum",
    "FavoriteMetadataItemTypeEnum",
    "FetchAnswerDataRequestDataFormatEnum",
    "FetchLiveboardDataRequestDataFormatEnum",
    "FetchLogsRequestLogTypeEnum",
    "GenerateTmlRequestImportWorksheetsEnum",
    "GroupsImportListInputPrivilegesEnum",
    "GroupsImportListInputTypeEnum",
    "GroupsImportListInputVisibilityEnum",
    "ImportMetadataTMLRequestImportPolicyEnum",
    "ImportUserAccountTypeEnum",
    "ImportUserAccountStatusEnum",
    "ImportUserVisibilityEnum",
    "JWTMetadataObjectTypeEnum",
    "MetadataInputTypeEnum",
    "MetadataListItemInputTypeEnum",
    "MetadataObjectTypeEnum",
    "MetadataResponseTypeEnum",
    "MetadataSearchResponseMetadataTypeEnum",
    "MetadataSearchSortOptionsFieldNameEnum",
    "MetadataSearchSortOptionsOrderEnum",
    "OrgResponseStatusEnum",
    "OrgResponseVisibilityEnum",
    "PdfOptionsPageSizeEnum",
    "PdfOptionsInputPageOrientationEnum",
    "PermissionInputShareModeEnum",
    "PermissionsMetadataTypeInputTypeEnum",
    "PrincipalsInputTypeEnum",
    "RevertCommitRequestRevertPolicyEnum",
    "RoleResponsePrivilegesEnum",
    "RoleResponsePermissionEnum",
    "SchedulesPdfOptionsInputPageSizeEnum",
    "SearchCommitsRequestMetadataTypeEnum",
    "SearchConnectionRequestDataWarehouseTypesEnum",
    "SearchConnectionRequestDataWarehouseObjectTypeEnum",
    "SearchConnectionRequestAuthenticationTypeEnum",
    "SearchConnectionResponseDataWarehouseTypeEnum",
    "SearchCustomActionsRequestTypeEnum",
    "SearchDataRequestDataFormatEnum",
    "SearchMetadataRequestDependentObjectVersionEnum",
    "SearchOrgsRequestVisibilityEnum",
    "SearchOrgsRequestStatusEnum",
    "SearchRoleResponsePrivilegesEnum",
    "SearchRoleResponsePermissionEnum",
    "SearchRolesRequestPrivilegesEnum",
    "SearchRolesRequestPermissionsEnum",
    "SearchUserGroupsRequestPrivilegesEnum",
    "SearchUserGroupsRequestTypeEnum",
    "SearchUserGroupsRequestVisibilityEnum",
    "SearchUsersRequestVisibilityEnum",
    "SearchUsersRequestPrivilegesEnum",
    "SearchUsersRequestAccountTypeEnum",
    "SearchUsersRequestAccountStatusEnum",
    "ShareMetadataRequestMetadataTypeEnum",
    "SharePermissionsInputShareModeEnum",
    "SortOptionInputFieldNameEnum",
    "SortOptionInputOrderEnum",
    "SortOptionsFieldNameEnum",
    "SortOptionsOrderEnum",
    "SqlQueryResponseMetadataTypeEnum",
    "TagMetadataTypeInputTypeEnum",
    "UpdateCustomActionRequestOperationEnum",
    "UpdateDbtConnectionRequestImportTypeEnum",
    "UpdateOrgRequestOperationEnum",
    "UpdateRoleRequestPrivilegesEnum",
    "UpdateScheduleRequestMetadataTypeEnum",
    "UpdateScheduleRequestFileFormatEnum",
    "UpdateScheduleRequestTimeZoneEnum",
    "UpdateScheduleRequestStatusEnum",
    "UpdateUserGroupRequestPrivilegesEnum",
    "UpdateUserGroupRequestTypeEnum",
    "UpdateUserGroupRequestVisibilityEnum",
    "UpdateUserGroupRequestOperationEnum",
    "UpdateUserRequestVisibilityEnum",
    "UpdateUserRequestAccountStatusEnum",
    "UpdateUserRequestAccountTypeEnum",
    "UpdateUserRequestOperationEnum",
    "UpdateUserRequestPreferredLocaleEnum",
    "UserVisibilityEnum",
    "UserAccountTypeEnum",
    "UserAccountStatusEnum",
    "UserParentTypeEnum",
    "UserGroupResponseParentTypeEnum",
    "UserGroupResponseTypeEnum",
    "UserGroupResponseVisibilityEnum",
]);
var typeMap = {
    "APIKey": APIKey_1.APIKey,
    "APIKeyInput": APIKeyInput_1.APIKeyInput,
    "ActionConfig": ActionConfig_1.ActionConfig,
    "ActionConfigInput": ActionConfigInput_1.ActionConfigInput,
    "ActionConfigInputCreate": ActionConfigInputCreate_1.ActionConfigInputCreate,
    "ActionDetails": ActionDetails_1.ActionDetails,
    "ActionDetailsInput": ActionDetailsInput_1.ActionDetailsInput,
    "ActionDetailsInputCreate": ActionDetailsInputCreate_1.ActionDetailsInputCreate,
    "ActivateUserRequest": ActivateUserRequest_1.ActivateUserRequest,
    "AnswerContent": AnswerContent_1.AnswerContent,
    "AnswerDataResponse": AnswerDataResponse_1.AnswerDataResponse,
    "AssignChangeAuthorRequest": AssignChangeAuthorRequest_1.AssignChangeAuthorRequest,
    "AssignTagRequest": AssignTagRequest_1.AssignTagRequest,
    "AssociateMetadataInput": AssociateMetadataInput_1.AssociateMetadataInput,
    "AssociateMetadataInputCreate": AssociateMetadataInputCreate_1.AssociateMetadataInputCreate,
    "Authentication": Authentication_1.Authentication,
    "AuthenticationInput": AuthenticationInput_1.AuthenticationInput,
    "Author": Author_1.Author,
    "AuthorMetadataTypeInput": AuthorMetadataTypeInput_1.AuthorMetadataTypeInput,
    "AuthorType": AuthorType_1.AuthorType,
    "BasicAuth": BasicAuth_1.BasicAuth,
    "BasicAuthInput": BasicAuthInput_1.BasicAuthInput,
    "CALLBACK": CALLBACK_1.CALLBACK,
    "CALLBACKInput": CALLBACKInput_1.CALLBACKInput,
    "CALLBACKInputMandatory": CALLBACKInputMandatory_1.CALLBACKInputMandatory,
    "ChangeUserPasswordRequest": ChangeUserPasswordRequest_1.ChangeUserPasswordRequest,
    "Column": Column_1.Column,
    "CommitBranchRequest": CommitBranchRequest_1.CommitBranchRequest,
    "CommitFileType": CommitFileType_1.CommitFileType,
    "CommitHistoryResponse": CommitHistoryResponse_1.CommitHistoryResponse,
    "CommitResponse": CommitResponse_1.CommitResponse,
    "CommiterType": CommiterType_1.CommiterType,
    "ConnectionInput": ConnectionInput_1.ConnectionInput,
    "CreateConfigRequest": CreateConfigRequest_1.CreateConfigRequest,
    "CreateConnectionRequest": CreateConnectionRequest_1.CreateConnectionRequest,
    "CreateConnectionResponse": CreateConnectionResponse_1.CreateConnectionResponse,
    "CreateCustomActionRequest": CreateCustomActionRequest_1.CreateCustomActionRequest,
    "CreateOrgRequest": CreateOrgRequest_1.CreateOrgRequest,
    "CreateRoleRequest": CreateRoleRequest_1.CreateRoleRequest,
    "CreateScheduleRequest": CreateScheduleRequest_1.CreateScheduleRequest,
    "CreateTagRequest": CreateTagRequest_1.CreateTagRequest,
    "CreateUserGroupRequest": CreateUserGroupRequest_1.CreateUserGroupRequest,
    "CreateUserRequest": CreateUserRequest_1.CreateUserRequest,
    "CronExpression": CronExpression_1.CronExpression,
    "CronExpressionInput": CronExpressionInput_1.CronExpressionInput,
    "CustomActionMetadataTypeInput": CustomActionMetadataTypeInput_1.CustomActionMetadataTypeInput,
    "DataWarehouseObjectInput": DataWarehouseObjectInput_1.DataWarehouseObjectInput,
    "DataWarehouseObjects": DataWarehouseObjects_1.DataWarehouseObjects,
    "Database": Database_1.Database,
    "DbtConnectionRequest": DbtConnectionRequest_1.DbtConnectionRequest,
    "DeactivateUserRequest": DeactivateUserRequest_1.DeactivateUserRequest,
    "DefaultActionConfig": DefaultActionConfig_1.DefaultActionConfig,
    "DefaultActionConfigInput": DefaultActionConfigInput_1.DefaultActionConfigInput,
    "DefaultActionConfigInputCreate": DefaultActionConfigInputCreate_1.DefaultActionConfigInputCreate,
    "DefaultActionConfigSearchInput": DefaultActionConfigSearchInput_1.DefaultActionConfigSearchInput,
    "DeleteConfigRequest": DeleteConfigRequest_1.DeleteConfigRequest,
    "DeleteConnectionRequest": DeleteConnectionRequest_1.DeleteConnectionRequest,
    "DeleteMetadataRequest": DeleteMetadataRequest_1.DeleteMetadataRequest,
    "DeleteMetadataTypeInput": DeleteMetadataTypeInput_1.DeleteMetadataTypeInput,
    "DeployCommitRequest": DeployCommitRequest_1.DeployCommitRequest,
    "DeployResponse": DeployResponse_1.DeployResponse,
    "ErrorResponse": ErrorResponse_1.ErrorResponse,
    "ExcludeMetadataListItemInput": ExcludeMetadataListItemInput_1.ExcludeMetadataListItemInput,
    "ExportAnswerReportRequest": ExportAnswerReportRequest_1.ExportAnswerReportRequest,
    "ExportLiveboardReportRequest": ExportLiveboardReportRequest_1.ExportLiveboardReportRequest,
    "ExportMetadataTMLRequest": ExportMetadataTMLRequest_1.ExportMetadataTMLRequest,
    "ExportMetadataTypeInput": ExportMetadataTypeInput_1.ExportMetadataTypeInput,
    "FavoriteMetadataInput": FavoriteMetadataInput_1.FavoriteMetadataInput,
    "FavoriteMetadataItem": FavoriteMetadataItem_1.FavoriteMetadataItem,
    "FavoriteObjectOptionsInput": FavoriteObjectOptionsInput_1.FavoriteObjectOptionsInput,
    "FetchAnswerDataRequest": FetchAnswerDataRequest_1.FetchAnswerDataRequest,
    "FetchAnswerSqlQueryRequest": FetchAnswerSqlQueryRequest_1.FetchAnswerSqlQueryRequest,
    "FetchLiveboardDataRequest": FetchLiveboardDataRequest_1.FetchLiveboardDataRequest,
    "FetchLiveboardSqlQueryRequest": FetchLiveboardSqlQueryRequest_1.FetchLiveboardSqlQueryRequest,
    "FetchLogsRequest": FetchLogsRequest_1.FetchLogsRequest,
    "FetchPermissionsOfPrincipalsRequest": FetchPermissionsOfPrincipalsRequest_1.FetchPermissionsOfPrincipalsRequest,
    "FetchPermissionsOnMetadataRequest": FetchPermissionsOnMetadataRequest_1.FetchPermissionsOnMetadataRequest,
    "ForceLogoutUsersRequest": ForceLogoutUsersRequest_1.ForceLogoutUsersRequest,
    "Frequency": Frequency_1.Frequency,
    "FrequencyInput": FrequencyInput_1.FrequencyInput,
    "GenerateSyncTmlRequest": GenerateSyncTmlRequest_1.GenerateSyncTmlRequest,
    "GenerateTmlRequest": GenerateTmlRequest_1.GenerateTmlRequest,
    "GenericInfo": GenericInfo_1.GenericInfo,
    "GetFullAccessTokenRequest": GetFullAccessTokenRequest_1.GetFullAccessTokenRequest,
    "GetObjectAccessTokenRequest": GetObjectAccessTokenRequest_1.GetObjectAccessTokenRequest,
    "GetTokenResponse": GetTokenResponse_1.GetTokenResponse,
    "GroupsImportListInput": GroupsImportListInput_1.GroupsImportListInput,
    "ImportMetadataTMLRequest": ImportMetadataTMLRequest_1.ImportMetadataTMLRequest,
    "ImportUser": ImportUser_1.ImportUser,
    "ImportUserGroupsRequest": ImportUserGroupsRequest_1.ImportUserGroupsRequest,
    "ImportUserGroupsResponse": ImportUserGroupsResponse_1.ImportUserGroupsResponse,
    "ImportUserType": ImportUserType_1.ImportUserType,
    "ImportUsersRequest": ImportUsersRequest_1.ImportUsersRequest,
    "ImportUsersResponse": ImportUsersResponse_1.ImportUsersResponse,
    "JWTMetadataObject": JWTMetadataObject_1.JWTMetadataObject,
    "JWTParameter": JWTParameter_1.JWTParameter,
    "JWTUserOptions": JWTUserOptions_1.JWTUserOptions,
    "JWTUserOptionsParametersInner": JWTUserOptionsParametersInner_1.JWTUserOptionsParametersInner,
    "LiveboardContent": LiveboardContent_1.LiveboardContent,
    "LiveboardDataResponse": LiveboardDataResponse_1.LiveboardDataResponse,
    "LiveboardOptions": LiveboardOptions_1.LiveboardOptions,
    "LiveboardOptionsInput": LiveboardOptionsInput_1.LiveboardOptionsInput,
    "LogResponse": LogResponse_1.LogResponse,
    "LoginRequest": LoginRequest_1.LoginRequest,
    "MetadataAssociationItem": MetadataAssociationItem_1.MetadataAssociationItem,
    "MetadataInput": MetadataInput_1.MetadataInput,
    "MetadataListItemInput": MetadataListItemInput_1.MetadataListItemInput,
    "MetadataObject": MetadataObject_1.MetadataObject,
    "MetadataResponse": MetadataResponse_1.MetadataResponse,
    "MetadataSearchResponse": MetadataSearchResponse_1.MetadataSearchResponse,
    "MetadataSearchSortOptions": MetadataSearchSortOptions_1.MetadataSearchSortOptions,
    "ModelTableList": ModelTableList_1.ModelTableList,
    "ObjectIDAndName": ObjectIDAndName_1.ObjectIDAndName,
    "Org": Org_1.Org,
    "OrgResponse": OrgResponse_1.OrgResponse,
    "ParametersListItem": ParametersListItem_1.ParametersListItem,
    "ParametersListItemInput": ParametersListItemInput_1.ParametersListItemInput,
    "PdfOptions": PdfOptions_1.PdfOptions,
    "PdfOptionsInput": PdfOptionsInput_1.PdfOptionsInput,
    "PermissionInput": PermissionInput_1.PermissionInput,
    "PermissionsMetadataTypeInput": PermissionsMetadataTypeInput_1.PermissionsMetadataTypeInput,
    "PngOptionsInput": PngOptionsInput_1.PngOptionsInput,
    "PrincipalsInput": PrincipalsInput_1.PrincipalsInput,
    "PrincipalsListItem": PrincipalsListItem_1.PrincipalsListItem,
    "PrincipalsListItemInput": PrincipalsListItemInput_1.PrincipalsListItemInput,
    "RecipientDetails": RecipientDetails_1.RecipientDetails,
    "RecipientDetailsInput": RecipientDetailsInput_1.RecipientDetailsInput,
    "RepoConfigObject": RepoConfigObject_1.RepoConfigObject,
    "ResetUserPasswordRequest": ResetUserPasswordRequest_1.ResetUserPasswordRequest,
    "ResponseActivationURL": ResponseActivationURL_1.ResponseActivationURL,
    "ResponseCustomAction": ResponseCustomAction_1.ResponseCustomAction,
    "ResponseSchedule": ResponseSchedule_1.ResponseSchedule,
    "ResponseScheduleRun": ResponseScheduleRun_1.ResponseScheduleRun,
    "RevertCommitRequest": RevertCommitRequest_1.RevertCommitRequest,
    "RevertResponse": RevertResponse_1.RevertResponse,
    "RevertedMetadata": RevertedMetadata_1.RevertedMetadata,
    "RevokeTokenRequest": RevokeTokenRequest_1.RevokeTokenRequest,
    "RiseSetter": RiseSetter_1.RiseSetter,
    "Role": Role_1.Role,
    "RoleResponse": RoleResponse_1.RoleResponse,
    "RuntimeFilter": RuntimeFilter_1.RuntimeFilter,
    "RuntimeParamOverride": RuntimeParamOverride_1.RuntimeParamOverride,
    "RuntimeSort": RuntimeSort_1.RuntimeSort,
    "ScheduleHistoryRunsOptionsInput": ScheduleHistoryRunsOptionsInput_1.ScheduleHistoryRunsOptionsInput,
    "SchedulesPdfOptionsInput": SchedulesPdfOptionsInput_1.SchedulesPdfOptionsInput,
    "SchemaObject": SchemaObject_1.SchemaObject,
    "Scope": Scope_1.Scope,
    "SearchCommitsRequest": SearchCommitsRequest_1.SearchCommitsRequest,
    "SearchConfigRequest": SearchConfigRequest_1.SearchConfigRequest,
    "SearchConnectionRequest": SearchConnectionRequest_1.SearchConnectionRequest,
    "SearchConnectionResponse": SearchConnectionResponse_1.SearchConnectionResponse,
    "SearchCustomActionsRequest": SearchCustomActionsRequest_1.SearchCustomActionsRequest,
    "SearchDataRequest": SearchDataRequest_1.SearchDataRequest,
    "SearchDataResponse": SearchDataResponse_1.SearchDataResponse,
    "SearchMetadataRequest": SearchMetadataRequest_1.SearchMetadataRequest,
    "SearchOrgsRequest": SearchOrgsRequest_1.SearchOrgsRequest,
    "SearchRoleResponse": SearchRoleResponse_1.SearchRoleResponse,
    "SearchRolesRequest": SearchRolesRequest_1.SearchRolesRequest,
    "SearchSchedulesRequest": SearchSchedulesRequest_1.SearchSchedulesRequest,
    "SearchTagsRequest": SearchTagsRequest_1.SearchTagsRequest,
    "SearchUserGroupsRequest": SearchUserGroupsRequest_1.SearchUserGroupsRequest,
    "SearchUsersRequest": SearchUsersRequest_1.SearchUsersRequest,
    "ShareMetadataRequest": ShareMetadataRequest_1.ShareMetadataRequest,
    "SharePermissionsInput": SharePermissionsInput_1.SharePermissionsInput,
    "SortOptionInput": SortOptionInput_1.SortOptionInput,
    "SortOptions": SortOptions_1.SortOptions,
    "SortingOptions": SortingOptions_1.SortingOptions,
    "SqlQuery": SqlQuery_1.SqlQuery,
    "SqlQueryResponse": SqlQueryResponse_1.SqlQueryResponse,
    "SystemConfig": SystemConfig_1.SystemConfig,
    "SystemInfo": SystemInfo_1.SystemInfo,
    "Table": Table_1.Table,
    "Tag": Tag_1.Tag,
    "TagMetadataTypeInput": TagMetadataTypeInput_1.TagMetadataTypeInput,
    "Token": Token_1.Token,
    "URL": URL_1.URL,
    "URLInput": URLInput_1.URLInput,
    "URLInputMandatory": URLInputMandatory_1.URLInputMandatory,
    "UpdateConfigRequest": UpdateConfigRequest_1.UpdateConfigRequest,
    "UpdateConnectionRequest": UpdateConnectionRequest_1.UpdateConnectionRequest,
    "UpdateCustomActionRequest": UpdateCustomActionRequest_1.UpdateCustomActionRequest,
    "UpdateDbtConnectionRequest": UpdateDbtConnectionRequest_1.UpdateDbtConnectionRequest,
    "UpdateOrgRequest": UpdateOrgRequest_1.UpdateOrgRequest,
    "UpdateRoleRequest": UpdateRoleRequest_1.UpdateRoleRequest,
    "UpdateScheduleRequest": UpdateScheduleRequest_1.UpdateScheduleRequest,
    "UpdateSystemConfigRequest": UpdateSystemConfigRequest_1.UpdateSystemConfigRequest,
    "UpdateTagRequest": UpdateTagRequest_1.UpdateTagRequest,
    "UpdateUserGroupRequest": UpdateUserGroupRequest_1.UpdateUserGroupRequest,
    "UpdateUserRequest": UpdateUserRequest_1.UpdateUserRequest,
    "User": User_1.User,
    "UserGroup": UserGroup_1.UserGroup,
    "UserGroupResponse": UserGroupResponse_1.UserGroupResponse,
    "ValidateMergeRequest": ValidateMergeRequest_1.ValidateMergeRequest,
};
var ObjectSerializer = (function () {
    function ObjectSerializer() {
    }
    ObjectSerializer.findCorrectType = function (data, expectedType) {
        if (data == undefined) {
            return expectedType;
        }
        else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        }
        else if (expectedType === "Date") {
            return expectedType;
        }
        else {
            if (enumsMap.has(expectedType)) {
                return expectedType;
            }
            if (!typeMap[expectedType]) {
                return expectedType;
            }
            var discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType;
            }
            else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if (typeMap[discriminatorType]) {
                        return discriminatorType;
                    }
                    else {
                        return expectedType;
                    }
                }
                else {
                    return expectedType;
                }
            }
        }
    };
    ObjectSerializer.serialize = function (data, type, format) {
        if (data == undefined) {
            return data;
        }
        else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        }
        else if (type.lastIndexOf("Array<", 0) === 0) {
            var subType = type.replace("Array<", "");
            subType = subType.substring(0, subType.length - 1);
            var transformedData = [];
            for (var _i = 0, data_1 = data; _i < data_1.length; _i++) {
                var date = data_1[_i];
                transformedData.push(ObjectSerializer.serialize(date, subType, format));
            }
            return transformedData;
        }
        else if (type === "Date") {
            if (format == "date") {
                var month = data.getMonth() + 1;
                month = month < 10 ? "0" + month.toString() : month.toString();
                var day = data.getDate();
                day = day < 10 ? "0" + day.toString() : day.toString();
                return data.getFullYear() + "-" + month + "-" + day;
            }
            else {
                return data.toISOString();
            }
        }
        else {
            if (enumsMap.has(type)) {
                return data;
            }
            if (!typeMap[type]) {
                return data;
            }
            type = this.findCorrectType(data, type);
            var attributeTypes = typeMap[type].getAttributeTypeMap();
            var instance = {};
            for (var _a = 0, attributeTypes_1 = attributeTypes; _a < attributeTypes_1.length; _a++) {
                var attributeType = attributeTypes_1[_a];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type, attributeType.format);
            }
            return instance;
        }
    };
    ObjectSerializer.deserialize = function (data, type, format) {
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        }
        else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        }
        else if (type.lastIndexOf("Array<", 0) === 0) {
            var subType = type.replace("Array<", "");
            subType = subType.substring(0, subType.length - 1);
            var transformedData = [];
            for (var _i = 0, data_2 = data; _i < data_2.length; _i++) {
                var date = data_2[_i];
                transformedData.push(ObjectSerializer.deserialize(date, subType, format));
            }
            return transformedData;
        }
        else if (type === "Date") {
            return new Date(data);
        }
        else {
            if (enumsMap.has(type)) {
                return data;
            }
            if (!typeMap[type]) {
                return data;
            }
            var instance = new typeMap[type]();
            var attributeTypes = typeMap[type].getAttributeTypeMap();
            for (var _a = 0, attributeTypes_2 = attributeTypes; _a < attributeTypes_2.length; _a++) {
                var attributeType = attributeTypes_2[_a];
                var value = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type, attributeType.format);
                if (value !== undefined) {
                    instance[attributeType.name] = value;
                }
            }
            return instance;
        }
    };
    ObjectSerializer.normalizeMediaType = function (mediaType) {
        if (mediaType === undefined) {
            return undefined;
        }
        return mediaType.split(";")[0].trim().toLowerCase();
    };
    ObjectSerializer.getPreferredMediaType = function (mediaTypes) {
        if (!mediaTypes) {
            return "application/json";
        }
        var normalMediaTypes = mediaTypes.map(this.normalizeMediaType);
        var selectedMediaType = undefined;
        var selectedRank = -Infinity;
        for (var _i = 0, normalMediaTypes_1 = normalMediaTypes; _i < normalMediaTypes_1.length; _i++) {
            var mediaType = normalMediaTypes_1[_i];
            if (supportedMediaTypes[mediaType] > selectedRank) {
                selectedMediaType = mediaType;
                selectedRank = supportedMediaTypes[mediaType];
            }
        }
        if (selectedMediaType === undefined) {
            throw new Error("None of the given media types are supported: " + mediaTypes.join(", "));
        }
        return selectedMediaType;
    };
    ObjectSerializer.stringify = function (data, mediaType) {
        if (mediaType === "text/plain") {
            return String(data);
        }
        if (mediaType === "application/json") {
            return JSON.stringify(data);
        }
        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.stringify.");
    };
    ObjectSerializer.parse = function (rawData, mediaType) {
        if (mediaType === undefined) {
            throw new Error("Cannot parse content. No Content-Type defined.");
        }
        if (mediaType === "text/plain") {
            return rawData;
        }
        if (mediaType === "application/json") {
            return JSON.parse(rawData);
        }
        if (mediaType === "text/html") {
            return rawData;
        }
        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.parse.");
    };
    return ObjectSerializer;
}());
exports.ObjectSerializer = ObjectSerializer;
//# sourceMappingURL=ObjectSerializer.js.map