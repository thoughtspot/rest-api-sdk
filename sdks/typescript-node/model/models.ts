import localVarRequest from 'request';

export * from './answerContent';
export * from './answerDataResponse';
export * from './assignChangeAuthorRequest';
export * from './assignTagRequest';
export * from './author';
export * from './authorMetadataTypeInput';
export * from './authorType';
export * from './changeUserPasswordRequest';
export * from './column';
export * from './commitBranchRequest';
export * from './commitFileType';
export * from './commitHistoryResponse';
export * from './commitResponse';
export * from './commiterType';
export * from './connectionInput';
export * from './createConfigRequest';
export * from './createConnectionRequest';
export * from './createConnectionResponse';
export * from './createOrgRequest';
export * from './createRoleRequest';
export * from './createScheduleRequest';
export * from './createTagRequest';
export * from './createUserGroupRequest';
export * from './createUserRequest';
export * from './cronExpression';
export * from './cronExpressionInput';
export * from './dataWarehouseObjectInput';
export * from './dataWarehouseObjects';
export * from './database';
export * from './deleteConfigRequest';
export * from './deleteConnectionRequest';
export * from './deleteMetadataRequest';
export * from './deleteMetadataTypeInput';
export * from './deployCommitRequest';
export * from './deployResponse';
export * from './errorResponse';
export * from './excludeMetadataListItemInput';
export * from './exportAnswerReportRequest';
export * from './exportLiveboardReportRequest';
export * from './exportMetadataTMLRequest';
export * from './exportMetadataTypeInput';
export * from './favoriteMetadataInput';
export * from './favoriteMetadataItem';
export * from './favoriteObjectOptionsInput';
export * from './fetchAnswerDataRequest';
export * from './fetchAnswerSqlQueryRequest';
export * from './fetchLiveboardDataRequest';
export * from './fetchLiveboardSqlQueryRequest';
export * from './fetchLogsRequest';
export * from './fetchPermissionsOfPrincipalsRequest';
export * from './fetchPermissionsOnMetadataRequest';
export * from './forceLogoutUsersRequest';
export * from './frequency';
export * from './frequencyInput';
export * from './genericInfo';
export * from './getFullAccessTokenRequest';
export * from './getObjectAccessTokenRequest';
export * from './getTokenResponse';
export * from './groupsImportListInput';
export * from './importMetadataTMLRequest';
export * from './importUser';
export * from './importUserGroupsRequest';
export * from './importUserGroupsResponse';
export * from './importUserType';
export * from './importUsersRequest';
export * from './importUsersResponse';
export * from './liveboardContent';
export * from './liveboardDataResponse';
export * from './liveboardOptions';
export * from './liveboardOptionsInput';
export * from './logResponse';
export * from './loginRequest';
export * from './metadataInput';
export * from './metadataListItemInput';
export * from './metadataObject';
export * from './metadataResponse';
export * from './metadataSearchResponse';
export * from './metadataSearchSortOptions';
export * from './metadataTypeInput';
export * from './objectIDAndName';
export * from './org';
export * from './orgResponse';
export * from './pdfOptions';
export * from './pdfOptionsInput';
export * from './permissionInput';
export * from './permissionsMetadataTypeInput';
export * from './pngOptionsInput';
export * from './principalsInput';
export * from './principalsListItem';
export * from './principalsListItemInput';
export * from './recipientDetails';
export * from './recipientDetailsInput';
export * from './repoConfigObject';
export * from './resetUserPasswordRequest';
export * from './responseSchedule';
export * from './responseScheduleRun';
export * from './revertCommitRequest';
export * from './revertResponse';
export * from './revertedMetadata';
export * from './revokeTokenRequest';
export * from './riseSetter';
export * from './role';
export * from './roleResponse';
export * from './scheduleHistoryRunsOptionsInput';
export * from './schedulesPdfOptionsInput';
export * from './schemaObject';
export * from './scope';
export * from './searchCommitsRequest';
export * from './searchConfigRequest';
export * from './searchConnectionRequest';
export * from './searchConnectionResponse';
export * from './searchDataRequest';
export * from './searchDataResponse';
export * from './searchMetadataRequest';
export * from './searchOrgsRequest';
export * from './searchRoleResponse';
export * from './searchRolesRequest';
export * from './searchSchedulesRequest';
export * from './searchTagsRequest';
export * from './searchUserGroupsRequest';
export * from './searchUsersRequest';
export * from './shareMetadataRequest';
export * from './sharePermissionsInput';
export * from './sortOptionInput';
export * from './sortOptions';
export * from './sortingOptions';
export * from './sqlQuery';
export * from './sqlQueryResponse';
export * from './systemConfig';
export * from './systemInfo';
export * from './table';
export * from './tag';
export * from './tagMetadataTypeInput';
export * from './token';
export * from './updateConfigRequest';
export * from './updateConnectionRequest';
export * from './updateOrgRequest';
export * from './updateRoleRequest';
export * from './updateScheduleRequest';
export * from './updateSystemConfigRequest';
export * from './updateTagRequest';
export * from './updateUserGroupRequest';
export * from './updateUserRequest';
export * from './user';
export * from './userGroup';
export * from './userGroupResponse';
export * from './validateMergeRequest';
export * from './visualizationIdentifiersInput';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { AnswerContent } from './answerContent';
import { AnswerDataResponse } from './answerDataResponse';
import { AssignChangeAuthorRequest } from './assignChangeAuthorRequest';
import { AssignTagRequest } from './assignTagRequest';
import { Author } from './author';
import { AuthorMetadataTypeInput } from './authorMetadataTypeInput';
import { AuthorType } from './authorType';
import { ChangeUserPasswordRequest } from './changeUserPasswordRequest';
import { Column } from './column';
import { CommitBranchRequest } from './commitBranchRequest';
import { CommitFileType } from './commitFileType';
import { CommitHistoryResponse } from './commitHistoryResponse';
import { CommitResponse } from './commitResponse';
import { CommiterType } from './commiterType';
import { ConnectionInput } from './connectionInput';
import { CreateConfigRequest } from './createConfigRequest';
import { CreateConnectionRequest } from './createConnectionRequest';
import { CreateConnectionResponse } from './createConnectionResponse';
import { CreateOrgRequest } from './createOrgRequest';
import { CreateRoleRequest } from './createRoleRequest';
import { CreateScheduleRequest } from './createScheduleRequest';
import { CreateTagRequest } from './createTagRequest';
import { CreateUserGroupRequest } from './createUserGroupRequest';
import { CreateUserRequest } from './createUserRequest';
import { CronExpression } from './cronExpression';
import { CronExpressionInput } from './cronExpressionInput';
import { DataWarehouseObjectInput } from './dataWarehouseObjectInput';
import { DataWarehouseObjects } from './dataWarehouseObjects';
import { Database } from './database';
import { DeleteConfigRequest } from './deleteConfigRequest';
import { DeleteConnectionRequest } from './deleteConnectionRequest';
import { DeleteMetadataRequest } from './deleteMetadataRequest';
import { DeleteMetadataTypeInput } from './deleteMetadataTypeInput';
import { DeployCommitRequest } from './deployCommitRequest';
import { DeployResponse } from './deployResponse';
import { ErrorResponse } from './errorResponse';
import { ExcludeMetadataListItemInput } from './excludeMetadataListItemInput';
import { ExportAnswerReportRequest } from './exportAnswerReportRequest';
import { ExportLiveboardReportRequest } from './exportLiveboardReportRequest';
import { ExportMetadataTMLRequest } from './exportMetadataTMLRequest';
import { ExportMetadataTypeInput } from './exportMetadataTypeInput';
import { FavoriteMetadataInput } from './favoriteMetadataInput';
import { FavoriteMetadataItem } from './favoriteMetadataItem';
import { FavoriteObjectOptionsInput } from './favoriteObjectOptionsInput';
import { FetchAnswerDataRequest } from './fetchAnswerDataRequest';
import { FetchAnswerSqlQueryRequest } from './fetchAnswerSqlQueryRequest';
import { FetchLiveboardDataRequest } from './fetchLiveboardDataRequest';
import { FetchLiveboardSqlQueryRequest } from './fetchLiveboardSqlQueryRequest';
import { FetchLogsRequest } from './fetchLogsRequest';
import { FetchPermissionsOfPrincipalsRequest } from './fetchPermissionsOfPrincipalsRequest';
import { FetchPermissionsOnMetadataRequest } from './fetchPermissionsOnMetadataRequest';
import { ForceLogoutUsersRequest } from './forceLogoutUsersRequest';
import { Frequency } from './frequency';
import { FrequencyInput } from './frequencyInput';
import { GenericInfo } from './genericInfo';
import { GetFullAccessTokenRequest } from './getFullAccessTokenRequest';
import { GetObjectAccessTokenRequest } from './getObjectAccessTokenRequest';
import { GetTokenResponse } from './getTokenResponse';
import { GroupsImportListInput } from './groupsImportListInput';
import { ImportMetadataTMLRequest } from './importMetadataTMLRequest';
import { ImportUser } from './importUser';
import { ImportUserGroupsRequest } from './importUserGroupsRequest';
import { ImportUserGroupsResponse } from './importUserGroupsResponse';
import { ImportUserType } from './importUserType';
import { ImportUsersRequest } from './importUsersRequest';
import { ImportUsersResponse } from './importUsersResponse';
import { LiveboardContent } from './liveboardContent';
import { LiveboardDataResponse } from './liveboardDataResponse';
import { LiveboardOptions } from './liveboardOptions';
import { LiveboardOptionsInput } from './liveboardOptionsInput';
import { LogResponse } from './logResponse';
import { LoginRequest } from './loginRequest';
import { MetadataInput } from './metadataInput';
import { MetadataListItemInput } from './metadataListItemInput';
import { MetadataObject } from './metadataObject';
import { MetadataResponse } from './metadataResponse';
import { MetadataSearchResponse } from './metadataSearchResponse';
import { MetadataSearchSortOptions } from './metadataSearchSortOptions';
import { MetadataTypeInput } from './metadataTypeInput';
import { ObjectIDAndName } from './objectIDAndName';
import { Org } from './org';
import { OrgResponse } from './orgResponse';
import { PdfOptions } from './pdfOptions';
import { PdfOptionsInput } from './pdfOptionsInput';
import { PermissionInput } from './permissionInput';
import { PermissionsMetadataTypeInput } from './permissionsMetadataTypeInput';
import { PngOptionsInput } from './pngOptionsInput';
import { PrincipalsInput } from './principalsInput';
import { PrincipalsListItem } from './principalsListItem';
import { PrincipalsListItemInput } from './principalsListItemInput';
import { RecipientDetails } from './recipientDetails';
import { RecipientDetailsInput } from './recipientDetailsInput';
import { RepoConfigObject } from './repoConfigObject';
import { ResetUserPasswordRequest } from './resetUserPasswordRequest';
import { ResponseSchedule } from './responseSchedule';
import { ResponseScheduleRun } from './responseScheduleRun';
import { RevertCommitRequest } from './revertCommitRequest';
import { RevertResponse } from './revertResponse';
import { RevertedMetadata } from './revertedMetadata';
import { RevokeTokenRequest } from './revokeTokenRequest';
import { RiseSetter } from './riseSetter';
import { Role } from './role';
import { RoleResponse } from './roleResponse';
import { ScheduleHistoryRunsOptionsInput } from './scheduleHistoryRunsOptionsInput';
import { SchedulesPdfOptionsInput } from './schedulesPdfOptionsInput';
import { SchemaObject } from './schemaObject';
import { Scope } from './scope';
import { SearchCommitsRequest } from './searchCommitsRequest';
import { SearchConfigRequest } from './searchConfigRequest';
import { SearchConnectionRequest } from './searchConnectionRequest';
import { SearchConnectionResponse } from './searchConnectionResponse';
import { SearchDataRequest } from './searchDataRequest';
import { SearchDataResponse } from './searchDataResponse';
import { SearchMetadataRequest } from './searchMetadataRequest';
import { SearchOrgsRequest } from './searchOrgsRequest';
import { SearchRoleResponse } from './searchRoleResponse';
import { SearchRolesRequest } from './searchRolesRequest';
import { SearchSchedulesRequest } from './searchSchedulesRequest';
import { SearchTagsRequest } from './searchTagsRequest';
import { SearchUserGroupsRequest } from './searchUserGroupsRequest';
import { SearchUsersRequest } from './searchUsersRequest';
import { ShareMetadataRequest } from './shareMetadataRequest';
import { SharePermissionsInput } from './sharePermissionsInput';
import { SortOptionInput } from './sortOptionInput';
import { SortOptions } from './sortOptions';
import { SortingOptions } from './sortingOptions';
import { SqlQuery } from './sqlQuery';
import { SqlQueryResponse } from './sqlQueryResponse';
import { SystemConfig } from './systemConfig';
import { SystemInfo } from './systemInfo';
import { Table } from './table';
import { Tag } from './tag';
import { TagMetadataTypeInput } from './tagMetadataTypeInput';
import { Token } from './token';
import { UpdateConfigRequest } from './updateConfigRequest';
import { UpdateConnectionRequest } from './updateConnectionRequest';
import { UpdateOrgRequest } from './updateOrgRequest';
import { UpdateRoleRequest } from './updateRoleRequest';
import { UpdateScheduleRequest } from './updateScheduleRequest';
import { UpdateSystemConfigRequest } from './updateSystemConfigRequest';
import { UpdateTagRequest } from './updateTagRequest';
import { UpdateUserGroupRequest } from './updateUserGroupRequest';
import { UpdateUserRequest } from './updateUserRequest';
import { User } from './user';
import { UserGroup } from './userGroup';
import { UserGroupResponse } from './userGroupResponse';
import { ValidateMergeRequest } from './validateMergeRequest';
import { VisualizationIdentifiersInput } from './visualizationIdentifiersInput';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "AuthorMetadataTypeInput.TypeEnum": AuthorMetadataTypeInput.TypeEnum,
        "CreateConnectionRequest.DataWarehouseTypeEnum": CreateConnectionRequest.DataWarehouseTypeEnum,
        "CreateConnectionResponse.DataWarehouseTypeEnum": CreateConnectionResponse.DataWarehouseTypeEnum,
        "CreateRoleRequest.PrivilegesEnum": CreateRoleRequest.PrivilegesEnum,
        "CreateScheduleRequest.MetadataTypeEnum": CreateScheduleRequest.MetadataTypeEnum,
        "CreateScheduleRequest.FileFormatEnum": CreateScheduleRequest.FileFormatEnum,
        "CreateUserGroupRequest.PrivilegesEnum": CreateUserGroupRequest.PrivilegesEnum,
        "CreateUserGroupRequest.TypeEnum": CreateUserGroupRequest.TypeEnum,
        "CreateUserGroupRequest.VisibilityEnum": CreateUserGroupRequest.VisibilityEnum,
        "CreateUserRequest.AccountTypeEnum": CreateUserRequest.AccountTypeEnum,
        "CreateUserRequest.AccountStatusEnum": CreateUserRequest.AccountStatusEnum,
        "CreateUserRequest.VisibilityEnum": CreateUserRequest.VisibilityEnum,
        "DeleteMetadataTypeInput.TypeEnum": DeleteMetadataTypeInput.TypeEnum,
        "DeployCommitRequest.ImportTypeEnum": DeployCommitRequest.ImportTypeEnum,
        "DeployCommitRequest.DeployTypeEnum": DeployCommitRequest.DeployTypeEnum,
        "DeployCommitRequest.DeployPolicyEnum": DeployCommitRequest.DeployPolicyEnum,
        "ExcludeMetadataListItemInput.TypeEnum": ExcludeMetadataListItemInput.TypeEnum,
        "ExportAnswerReportRequest.FileFormatEnum": ExportAnswerReportRequest.FileFormatEnum,
        "ExportLiveboardReportRequest.FileFormatEnum": ExportLiveboardReportRequest.FileFormatEnum,
        "ExportMetadataTMLRequest.EdocFormatEnum": ExportMetadataTMLRequest.EdocFormatEnum,
        "ExportMetadataTypeInput.TypeEnum": ExportMetadataTypeInput.TypeEnum,
        "FavoriteMetadataInput.TypeEnum": FavoriteMetadataInput.TypeEnum,
        "FavoriteMetadataItem.TypeEnum": FavoriteMetadataItem.TypeEnum,
        "FetchAnswerDataRequest.DataFormatEnum": FetchAnswerDataRequest.DataFormatEnum,
        "FetchLiveboardDataRequest.DataFormatEnum": FetchLiveboardDataRequest.DataFormatEnum,
        "FetchLogsRequest.LogTypeEnum": FetchLogsRequest.LogTypeEnum,
        "GroupsImportListInput.PrivilegesEnum": GroupsImportListInput.PrivilegesEnum,
        "GroupsImportListInput.TypeEnum": GroupsImportListInput.TypeEnum,
        "GroupsImportListInput.VisibilityEnum": GroupsImportListInput.VisibilityEnum,
        "ImportMetadataTMLRequest.ImportPolicyEnum": ImportMetadataTMLRequest.ImportPolicyEnum,
        "ImportUser.AccountTypeEnum": ImportUser.AccountTypeEnum,
        "ImportUser.AccountStatusEnum": ImportUser.AccountStatusEnum,
        "ImportUser.VisibilityEnum": ImportUser.VisibilityEnum,
        "MetadataInput.TypeEnum": MetadataInput.TypeEnum,
        "MetadataListItemInput.TypeEnum": MetadataListItemInput.TypeEnum,
        "MetadataObject.TypeEnum": MetadataObject.TypeEnum,
        "MetadataResponse.TypeEnum": MetadataResponse.TypeEnum,
        "MetadataSearchResponse.MetadataTypeEnum": MetadataSearchResponse.MetadataTypeEnum,
        "MetadataSearchSortOptions.FieldNameEnum": MetadataSearchSortOptions.FieldNameEnum,
        "MetadataSearchSortOptions.OrderEnum": MetadataSearchSortOptions.OrderEnum,
        "MetadataTypeInput.TypeEnum": MetadataTypeInput.TypeEnum,
        "OrgResponse.StatusEnum": OrgResponse.StatusEnum,
        "OrgResponse.VisibilityEnum": OrgResponse.VisibilityEnum,
        "PdfOptions.PageSizeEnum": PdfOptions.PageSizeEnum,
        "PdfOptionsInput.PageOrientationEnum": PdfOptionsInput.PageOrientationEnum,
        "PermissionInput.ShareModeEnum": PermissionInput.ShareModeEnum,
        "PermissionsMetadataTypeInput.TypeEnum": PermissionsMetadataTypeInput.TypeEnum,
        "PrincipalsInput.TypeEnum": PrincipalsInput.TypeEnum,
        "RevertCommitRequest.RevertPolicyEnum": RevertCommitRequest.RevertPolicyEnum,
        "RoleResponse.PrivilegesEnum": RoleResponse.PrivilegesEnum,
        "RoleResponse.PermissionEnum": RoleResponse.PermissionEnum,
        "SchedulesPdfOptionsInput.PageSizeEnum": SchedulesPdfOptionsInput.PageSizeEnum,
        "SearchCommitsRequest.MetadataTypeEnum": SearchCommitsRequest.MetadataTypeEnum,
        "SearchConnectionRequest.DataWarehouseTypesEnum": SearchConnectionRequest.DataWarehouseTypesEnum,
        "SearchConnectionRequest.DataWarehouseObjectTypeEnum": SearchConnectionRequest.DataWarehouseObjectTypeEnum,
        "SearchConnectionRequest.AuthenticationTypeEnum": SearchConnectionRequest.AuthenticationTypeEnum,
        "SearchConnectionResponse.DataWarehouseTypeEnum": SearchConnectionResponse.DataWarehouseTypeEnum,
        "SearchDataRequest.DataFormatEnum": SearchDataRequest.DataFormatEnum,
        "SearchMetadataRequest.DependentObjectVersionEnum": SearchMetadataRequest.DependentObjectVersionEnum,
        "SearchOrgsRequest.VisibilityEnum": SearchOrgsRequest.VisibilityEnum,
        "SearchOrgsRequest.StatusEnum": SearchOrgsRequest.StatusEnum,
        "SearchRoleResponse.PrivilegesEnum": SearchRoleResponse.PrivilegesEnum,
        "SearchRoleResponse.PermissionEnum": SearchRoleResponse.PermissionEnum,
        "SearchRolesRequest.PrivilegesEnum": SearchRolesRequest.PrivilegesEnum,
        "SearchRolesRequest.PermissionsEnum": SearchRolesRequest.PermissionsEnum,
        "SearchUserGroupsRequest.PrivilegesEnum": SearchUserGroupsRequest.PrivilegesEnum,
        "SearchUserGroupsRequest.TypeEnum": SearchUserGroupsRequest.TypeEnum,
        "SearchUserGroupsRequest.VisibilityEnum": SearchUserGroupsRequest.VisibilityEnum,
        "SearchUsersRequest.VisibilityEnum": SearchUsersRequest.VisibilityEnum,
        "SearchUsersRequest.PrivilegesEnum": SearchUsersRequest.PrivilegesEnum,
        "SearchUsersRequest.AccountTypeEnum": SearchUsersRequest.AccountTypeEnum,
        "SearchUsersRequest.AccountStatusEnum": SearchUsersRequest.AccountStatusEnum,
        "ShareMetadataRequest.MetadataTypeEnum": ShareMetadataRequest.MetadataTypeEnum,
        "SharePermissionsInput.ShareModeEnum": SharePermissionsInput.ShareModeEnum,
        "SortOptionInput.FieldNameEnum": SortOptionInput.FieldNameEnum,
        "SortOptionInput.OrderEnum": SortOptionInput.OrderEnum,
        "SortOptions.FieldNameEnum": SortOptions.FieldNameEnum,
        "SortOptions.OrderEnum": SortOptions.OrderEnum,
        "SqlQueryResponse.MetadataTypeEnum": SqlQueryResponse.MetadataTypeEnum,
        "TagMetadataTypeInput.TypeEnum": TagMetadataTypeInput.TypeEnum,
        "UpdateOrgRequest.OperationEnum": UpdateOrgRequest.OperationEnum,
        "UpdateRoleRequest.PrivilegesEnum": UpdateRoleRequest.PrivilegesEnum,
        "UpdateScheduleRequest.MetadataTypeEnum": UpdateScheduleRequest.MetadataTypeEnum,
        "UpdateScheduleRequest.FileFormatEnum": UpdateScheduleRequest.FileFormatEnum,
        "UpdateScheduleRequest.StatusEnum": UpdateScheduleRequest.StatusEnum,
        "UpdateUserGroupRequest.PrivilegesEnum": UpdateUserGroupRequest.PrivilegesEnum,
        "UpdateUserGroupRequest.TypeEnum": UpdateUserGroupRequest.TypeEnum,
        "UpdateUserGroupRequest.VisibilityEnum": UpdateUserGroupRequest.VisibilityEnum,
        "UpdateUserGroupRequest.OperationEnum": UpdateUserGroupRequest.OperationEnum,
        "UpdateUserRequest.VisibilityEnum": UpdateUserRequest.VisibilityEnum,
        "UpdateUserRequest.AccountStatusEnum": UpdateUserRequest.AccountStatusEnum,
        "UpdateUserRequest.AccountTypeEnum": UpdateUserRequest.AccountTypeEnum,
        "UpdateUserRequest.OperationEnum": UpdateUserRequest.OperationEnum,
        "User.VisibilityEnum": User.VisibilityEnum,
        "User.AccountTypeEnum": User.AccountTypeEnum,
        "User.AccountStatusEnum": User.AccountStatusEnum,
        "User.ParentTypeEnum": User.ParentTypeEnum,
        "UserGroupResponse.ParentTypeEnum": UserGroupResponse.ParentTypeEnum,
        "UserGroupResponse.TypeEnum": UserGroupResponse.TypeEnum,
        "UserGroupResponse.VisibilityEnum": UserGroupResponse.VisibilityEnum,
}

let typeMap: {[index: string]: any} = {
    "AnswerContent": AnswerContent,
    "AnswerDataResponse": AnswerDataResponse,
    "AssignChangeAuthorRequest": AssignChangeAuthorRequest,
    "AssignTagRequest": AssignTagRequest,
    "Author": Author,
    "AuthorMetadataTypeInput": AuthorMetadataTypeInput,
    "AuthorType": AuthorType,
    "ChangeUserPasswordRequest": ChangeUserPasswordRequest,
    "Column": Column,
    "CommitBranchRequest": CommitBranchRequest,
    "CommitFileType": CommitFileType,
    "CommitHistoryResponse": CommitHistoryResponse,
    "CommitResponse": CommitResponse,
    "CommiterType": CommiterType,
    "ConnectionInput": ConnectionInput,
    "CreateConfigRequest": CreateConfigRequest,
    "CreateConnectionRequest": CreateConnectionRequest,
    "CreateConnectionResponse": CreateConnectionResponse,
    "CreateOrgRequest": CreateOrgRequest,
    "CreateRoleRequest": CreateRoleRequest,
    "CreateScheduleRequest": CreateScheduleRequest,
    "CreateTagRequest": CreateTagRequest,
    "CreateUserGroupRequest": CreateUserGroupRequest,
    "CreateUserRequest": CreateUserRequest,
    "CronExpression": CronExpression,
    "CronExpressionInput": CronExpressionInput,
    "DataWarehouseObjectInput": DataWarehouseObjectInput,
    "DataWarehouseObjects": DataWarehouseObjects,
    "Database": Database,
    "DeleteConfigRequest": DeleteConfigRequest,
    "DeleteConnectionRequest": DeleteConnectionRequest,
    "DeleteMetadataRequest": DeleteMetadataRequest,
    "DeleteMetadataTypeInput": DeleteMetadataTypeInput,
    "DeployCommitRequest": DeployCommitRequest,
    "DeployResponse": DeployResponse,
    "ErrorResponse": ErrorResponse,
    "ExcludeMetadataListItemInput": ExcludeMetadataListItemInput,
    "ExportAnswerReportRequest": ExportAnswerReportRequest,
    "ExportLiveboardReportRequest": ExportLiveboardReportRequest,
    "ExportMetadataTMLRequest": ExportMetadataTMLRequest,
    "ExportMetadataTypeInput": ExportMetadataTypeInput,
    "FavoriteMetadataInput": FavoriteMetadataInput,
    "FavoriteMetadataItem": FavoriteMetadataItem,
    "FavoriteObjectOptionsInput": FavoriteObjectOptionsInput,
    "FetchAnswerDataRequest": FetchAnswerDataRequest,
    "FetchAnswerSqlQueryRequest": FetchAnswerSqlQueryRequest,
    "FetchLiveboardDataRequest": FetchLiveboardDataRequest,
    "FetchLiveboardSqlQueryRequest": FetchLiveboardSqlQueryRequest,
    "FetchLogsRequest": FetchLogsRequest,
    "FetchPermissionsOfPrincipalsRequest": FetchPermissionsOfPrincipalsRequest,
    "FetchPermissionsOnMetadataRequest": FetchPermissionsOnMetadataRequest,
    "ForceLogoutUsersRequest": ForceLogoutUsersRequest,
    "Frequency": Frequency,
    "FrequencyInput": FrequencyInput,
    "GenericInfo": GenericInfo,
    "GetFullAccessTokenRequest": GetFullAccessTokenRequest,
    "GetObjectAccessTokenRequest": GetObjectAccessTokenRequest,
    "GetTokenResponse": GetTokenResponse,
    "GroupsImportListInput": GroupsImportListInput,
    "ImportMetadataTMLRequest": ImportMetadataTMLRequest,
    "ImportUser": ImportUser,
    "ImportUserGroupsRequest": ImportUserGroupsRequest,
    "ImportUserGroupsResponse": ImportUserGroupsResponse,
    "ImportUserType": ImportUserType,
    "ImportUsersRequest": ImportUsersRequest,
    "ImportUsersResponse": ImportUsersResponse,
    "LiveboardContent": LiveboardContent,
    "LiveboardDataResponse": LiveboardDataResponse,
    "LiveboardOptions": LiveboardOptions,
    "LiveboardOptionsInput": LiveboardOptionsInput,
    "LogResponse": LogResponse,
    "LoginRequest": LoginRequest,
    "MetadataInput": MetadataInput,
    "MetadataListItemInput": MetadataListItemInput,
    "MetadataObject": MetadataObject,
    "MetadataResponse": MetadataResponse,
    "MetadataSearchResponse": MetadataSearchResponse,
    "MetadataSearchSortOptions": MetadataSearchSortOptions,
    "MetadataTypeInput": MetadataTypeInput,
    "ObjectIDAndName": ObjectIDAndName,
    "Org": Org,
    "OrgResponse": OrgResponse,
    "PdfOptions": PdfOptions,
    "PdfOptionsInput": PdfOptionsInput,
    "PermissionInput": PermissionInput,
    "PermissionsMetadataTypeInput": PermissionsMetadataTypeInput,
    "PngOptionsInput": PngOptionsInput,
    "PrincipalsInput": PrincipalsInput,
    "PrincipalsListItem": PrincipalsListItem,
    "PrincipalsListItemInput": PrincipalsListItemInput,
    "RecipientDetails": RecipientDetails,
    "RecipientDetailsInput": RecipientDetailsInput,
    "RepoConfigObject": RepoConfigObject,
    "ResetUserPasswordRequest": ResetUserPasswordRequest,
    "ResponseSchedule": ResponseSchedule,
    "ResponseScheduleRun": ResponseScheduleRun,
    "RevertCommitRequest": RevertCommitRequest,
    "RevertResponse": RevertResponse,
    "RevertedMetadata": RevertedMetadata,
    "RevokeTokenRequest": RevokeTokenRequest,
    "RiseSetter": RiseSetter,
    "Role": Role,
    "RoleResponse": RoleResponse,
    "ScheduleHistoryRunsOptionsInput": ScheduleHistoryRunsOptionsInput,
    "SchedulesPdfOptionsInput": SchedulesPdfOptionsInput,
    "SchemaObject": SchemaObject,
    "Scope": Scope,
    "SearchCommitsRequest": SearchCommitsRequest,
    "SearchConfigRequest": SearchConfigRequest,
    "SearchConnectionRequest": SearchConnectionRequest,
    "SearchConnectionResponse": SearchConnectionResponse,
    "SearchDataRequest": SearchDataRequest,
    "SearchDataResponse": SearchDataResponse,
    "SearchMetadataRequest": SearchMetadataRequest,
    "SearchOrgsRequest": SearchOrgsRequest,
    "SearchRoleResponse": SearchRoleResponse,
    "SearchRolesRequest": SearchRolesRequest,
    "SearchSchedulesRequest": SearchSchedulesRequest,
    "SearchTagsRequest": SearchTagsRequest,
    "SearchUserGroupsRequest": SearchUserGroupsRequest,
    "SearchUsersRequest": SearchUsersRequest,
    "ShareMetadataRequest": ShareMetadataRequest,
    "SharePermissionsInput": SharePermissionsInput,
    "SortOptionInput": SortOptionInput,
    "SortOptions": SortOptions,
    "SortingOptions": SortingOptions,
    "SqlQuery": SqlQuery,
    "SqlQueryResponse": SqlQueryResponse,
    "SystemConfig": SystemConfig,
    "SystemInfo": SystemInfo,
    "Table": Table,
    "Tag": Tag,
    "TagMetadataTypeInput": TagMetadataTypeInput,
    "Token": Token,
    "UpdateConfigRequest": UpdateConfigRequest,
    "UpdateConnectionRequest": UpdateConnectionRequest,
    "UpdateOrgRequest": UpdateOrgRequest,
    "UpdateRoleRequest": UpdateRoleRequest,
    "UpdateScheduleRequest": UpdateScheduleRequest,
    "UpdateSystemConfigRequest": UpdateSystemConfigRequest,
    "UpdateTagRequest": UpdateTagRequest,
    "UpdateUserGroupRequest": UpdateUserGroupRequest,
    "UpdateUserRequest": UpdateUserRequest,
    "User": User,
    "UserGroup": UserGroup,
    "UserGroupResponse": UserGroupResponse,
    "ValidateMergeRequest": ValidateMergeRequest,
    "VisualizationIdentifiersInput": VisualizationIdentifiersInput,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
