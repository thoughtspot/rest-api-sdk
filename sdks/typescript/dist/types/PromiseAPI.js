"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PromiseVersionControlApi = exports.PromiseUsersApi = exports.PromiseThoughtSpotRestApi = exports.PromiseTagsApi = exports.PromiseSystemApi = exports.PromiseSecurityApi = exports.PromiseSchedulesApi = exports.PromiseRolesApi = exports.PromiseReportsApi = exports.PromiseOrgsApi = exports.PromiseMetadataApi = exports.PromiseLogApi = exports.PromiseGroupsApi = exports.PromiseDataApi = exports.PromiseCustomActionApi = exports.PromiseConnectionsApi = exports.PromiseClass950ClApi = exports.PromiseClass940ClApi = exports.PromiseClass920ClApi = exports.PromiseClass900ClApi = exports.PromiseAuthenticationApi = void 0;
var ObservableAPI_1 = require("./ObservableAPI");
var PromiseAuthenticationApi = (function () {
    function PromiseAuthenticationApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_1.ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }
    PromiseAuthenticationApi.prototype.getCurrentUserInfo = function (_options) {
        var result = this.api.getCurrentUserInfo(_options);
        return result.toPromise();
    };
    PromiseAuthenticationApi.prototype.getCurrentUserToken = function (_options) {
        var result = this.api.getCurrentUserToken(_options);
        return result.toPromise();
    };
    PromiseAuthenticationApi.prototype.getFullAccessToken = function (getFullAccessTokenRequest, _options) {
        var result = this.api.getFullAccessToken(getFullAccessTokenRequest, _options);
        return result.toPromise();
    };
    PromiseAuthenticationApi.prototype.getObjectAccessToken = function (getObjectAccessTokenRequest, _options) {
        var result = this.api.getObjectAccessToken(getObjectAccessTokenRequest, _options);
        return result.toPromise();
    };
    PromiseAuthenticationApi.prototype.login = function (loginRequest, _options) {
        var result = this.api.login(loginRequest, _options);
        return result.toPromise();
    };
    PromiseAuthenticationApi.prototype.logout = function (_options) {
        var result = this.api.logout(_options);
        return result.toPromise();
    };
    PromiseAuthenticationApi.prototype.revokeToken = function (revokeTokenRequest, _options) {
        var result = this.api.revokeToken(revokeTokenRequest, _options);
        return result.toPromise();
    };
    return PromiseAuthenticationApi;
}());
exports.PromiseAuthenticationApi = PromiseAuthenticationApi;
var ObservableAPI_2 = require("./ObservableAPI");
var PromiseClass900ClApi = (function () {
    function PromiseClass900ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_2.ObservableClass900ClApi(configuration, requestFactory, responseProcessor);
    }
    PromiseClass900ClApi.prototype.assignChangeAuthor = function (assignChangeAuthorRequest, _options) {
        var result = this.api.assignChangeAuthor(assignChangeAuthorRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.assignTag = function (assignTagRequest, _options) {
        var result = this.api.assignTag(assignTagRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.changeUserPassword = function (changeUserPasswordRequest, _options) {
        var result = this.api.changeUserPassword(changeUserPasswordRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.createOrg = function (createOrgRequest, _options) {
        var result = this.api.createOrg(createOrgRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.createTag = function (createTagRequest, _options) {
        var result = this.api.createTag(createTagRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.createUser = function (createUserRequest, _options) {
        var result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.createUserGroup = function (createUserGroupRequest, _options) {
        var result = this.api.createUserGroup(createUserGroupRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.deleteMetadata = function (deleteMetadataRequest, _options) {
        var result = this.api.deleteMetadata(deleteMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.deleteOrg = function (orgIdentifier, _options) {
        var result = this.api.deleteOrg(orgIdentifier, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.deleteTag = function (tagIdentifier, _options) {
        var result = this.api.deleteTag(tagIdentifier, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.deleteUser = function (userIdentifier, _options) {
        var result = this.api.deleteUser(userIdentifier, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.deleteUserGroup = function (groupIdentifier, _options) {
        var result = this.api.deleteUserGroup(groupIdentifier, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.exportAnswerReport = function (exportAnswerReportRequest, _options) {
        var result = this.api.exportAnswerReport(exportAnswerReportRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.exportLiveboardReport = function (exportLiveboardReportRequest, _options) {
        var result = this.api.exportLiveboardReport(exportLiveboardReportRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.exportMetadataTML = function (exportMetadataTMLRequest, _options) {
        var result = this.api.exportMetadataTML(exportMetadataTMLRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.fetchAnswerData = function (fetchAnswerDataRequest, _options) {
        var result = this.api.fetchAnswerData(fetchAnswerDataRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.fetchAnswerSqlQuery = function (fetchAnswerSqlQueryRequest, _options) {
        var result = this.api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.fetchLiveboardData = function (fetchLiveboardDataRequest, _options) {
        var result = this.api.fetchLiveboardData(fetchLiveboardDataRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.fetchLiveboardSqlQuery = function (fetchLiveboardSqlQueryRequest, _options) {
        var result = this.api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.fetchLogs = function (fetchLogsRequest, _options) {
        var result = this.api.fetchLogs(fetchLogsRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.fetchPermissionsOfPrincipals = function (fetchPermissionsOfPrincipalsRequest, _options) {
        var result = this.api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.fetchPermissionsOnMetadata = function (fetchPermissionsOnMetadataRequest, _options) {
        var result = this.api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.forceLogoutUsers = function (forceLogoutUsersRequest, _options) {
        var result = this.api.forceLogoutUsers(forceLogoutUsersRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.getCurrentUserInfo = function (_options) {
        var result = this.api.getCurrentUserInfo(_options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.getFullAccessToken = function (getFullAccessTokenRequest, _options) {
        var result = this.api.getFullAccessToken(getFullAccessTokenRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.getObjectAccessToken = function (getObjectAccessTokenRequest, _options) {
        var result = this.api.getObjectAccessToken(getObjectAccessTokenRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.getSystemConfig = function (_options) {
        var result = this.api.getSystemConfig(_options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.getSystemInformation = function (_options) {
        var result = this.api.getSystemInformation(_options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.importMetadataTML = function (importMetadataTMLRequest, _options) {
        var result = this.api.importMetadataTML(importMetadataTMLRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.importUserGroups = function (importUserGroupsRequest, _options) {
        var result = this.api.importUserGroups(importUserGroupsRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.importUsers = function (importUsersRequest, _options) {
        var result = this.api.importUsers(importUsersRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.login = function (loginRequest, _options) {
        var result = this.api.login(loginRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.logout = function (_options) {
        var result = this.api.logout(_options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.resetUserPassword = function (resetUserPasswordRequest, _options) {
        var result = this.api.resetUserPassword(resetUserPasswordRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.revokeToken = function (revokeTokenRequest, _options) {
        var result = this.api.revokeToken(revokeTokenRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.searchData = function (searchDataRequest, _options) {
        var result = this.api.searchData(searchDataRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.searchMetadata = function (searchMetadataRequest, _options) {
        var result = this.api.searchMetadata(searchMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.searchOrgs = function (searchOrgsRequest, _options) {
        var result = this.api.searchOrgs(searchOrgsRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.searchTags = function (searchTagsRequest, _options) {
        var result = this.api.searchTags(searchTagsRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.searchUserGroups = function (searchUserGroupsRequest, _options) {
        var result = this.api.searchUserGroups(searchUserGroupsRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.searchUsers = function (searchUsersRequest, _options) {
        var result = this.api.searchUsers(searchUsersRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.shareMetadata = function (shareMetadataRequest, _options) {
        var result = this.api.shareMetadata(shareMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.unassignTag = function (assignTagRequest, _options) {
        var result = this.api.unassignTag(assignTagRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.updateOrg = function (orgIdentifier, updateOrgRequest, _options) {
        var result = this.api.updateOrg(orgIdentifier, updateOrgRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.updateTag = function (tagIdentifier, updateTagRequest, _options) {
        var result = this.api.updateTag(tagIdentifier, updateTagRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.updateUser = function (userIdentifier, updateUserRequest, _options) {
        var result = this.api.updateUser(userIdentifier, updateUserRequest, _options);
        return result.toPromise();
    };
    PromiseClass900ClApi.prototype.updateUserGroup = function (groupIdentifier, updateUserGroupRequest, _options) {
        var result = this.api.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);
        return result.toPromise();
    };
    return PromiseClass900ClApi;
}());
exports.PromiseClass900ClApi = PromiseClass900ClApi;
var ObservableAPI_3 = require("./ObservableAPI");
var PromiseClass920ClApi = (function () {
    function PromiseClass920ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_3.ObservableClass920ClApi(configuration, requestFactory, responseProcessor);
    }
    PromiseClass920ClApi.prototype.createConnection = function (createConnectionRequest, _options) {
        var result = this.api.createConnection(createConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseClass920ClApi.prototype.deleteConnection = function (deleteConnectionRequest, _options) {
        var result = this.api.deleteConnection(deleteConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseClass920ClApi.prototype.getSystemOverrideInfo = function (_options) {
        var result = this.api.getSystemOverrideInfo(_options);
        return result.toPromise();
    };
    PromiseClass920ClApi.prototype.searchConnection = function (searchConnectionRequest, _options) {
        var result = this.api.searchConnection(searchConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseClass920ClApi.prototype.updateConnection = function (updateConnectionRequest, _options) {
        var result = this.api.updateConnection(updateConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseClass920ClApi.prototype.updateSystemConfig = function (updateSystemConfigRequest, _options) {
        var result = this.api.updateSystemConfig(updateSystemConfigRequest, _options);
        return result.toPromise();
    };
    return PromiseClass920ClApi;
}());
exports.PromiseClass920ClApi = PromiseClass920ClApi;
var ObservableAPI_4 = require("./ObservableAPI");
var PromiseClass940ClApi = (function () {
    function PromiseClass940ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_4.ObservableClass940ClApi(configuration, requestFactory, responseProcessor);
    }
    PromiseClass940ClApi.prototype.createSchedule = function (createScheduleRequest, _options) {
        var result = this.api.createSchedule(createScheduleRequest, _options);
        return result.toPromise();
    };
    PromiseClass940ClApi.prototype.deleteSchedule = function (scheduleIdentifier, _options) {
        var result = this.api.deleteSchedule(scheduleIdentifier, _options);
        return result.toPromise();
    };
    PromiseClass940ClApi.prototype.getCurrentUserToken = function (_options) {
        var result = this.api.getCurrentUserToken(_options);
        return result.toPromise();
    };
    PromiseClass940ClApi.prototype.searchSchedules = function (searchSchedulesRequest, _options) {
        var result = this.api.searchSchedules(searchSchedulesRequest, _options);
        return result.toPromise();
    };
    PromiseClass940ClApi.prototype.updateSchedule = function (scheduleIdentifier, updateScheduleRequest, _options) {
        var result = this.api.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);
        return result.toPromise();
    };
    return PromiseClass940ClApi;
}());
exports.PromiseClass940ClApi = PromiseClass940ClApi;
var ObservableAPI_5 = require("./ObservableAPI");
var PromiseClass950ClApi = (function () {
    function PromiseClass950ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_5.ObservableClass950ClApi(configuration, requestFactory, responseProcessor);
    }
    PromiseClass950ClApi.prototype.createCustomAction = function (createCustomActionRequest, _options) {
        var result = this.api.createCustomAction(createCustomActionRequest, _options);
        return result.toPromise();
    };
    PromiseClass950ClApi.prototype.createRole = function (createRoleRequest, _options) {
        var result = this.api.createRole(createRoleRequest, _options);
        return result.toPromise();
    };
    PromiseClass950ClApi.prototype.deleteCustomAction = function (customActionIdentifier, _options) {
        var result = this.api.deleteCustomAction(customActionIdentifier, _options);
        return result.toPromise();
    };
    PromiseClass950ClApi.prototype.deleteRole = function (roleIdentifier, _options) {
        var result = this.api.deleteRole(roleIdentifier, _options);
        return result.toPromise();
    };
    PromiseClass950ClApi.prototype.searchCustomActions = function (searchCustomActionsRequest, _options) {
        var result = this.api.searchCustomActions(searchCustomActionsRequest, _options);
        return result.toPromise();
    };
    PromiseClass950ClApi.prototype.searchRoles = function (searchRolesRequest, _options) {
        var result = this.api.searchRoles(searchRolesRequest, _options);
        return result.toPromise();
    };
    PromiseClass950ClApi.prototype.updateCustomAction = function (customActionIdentifier, updateCustomActionRequest, _options) {
        var result = this.api.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);
        return result.toPromise();
    };
    PromiseClass950ClApi.prototype.updateRole = function (roleIdentifier, updateRoleRequest, _options) {
        var result = this.api.updateRole(roleIdentifier, updateRoleRequest, _options);
        return result.toPromise();
    };
    return PromiseClass950ClApi;
}());
exports.PromiseClass950ClApi = PromiseClass950ClApi;
var ObservableAPI_6 = require("./ObservableAPI");
var PromiseConnectionsApi = (function () {
    function PromiseConnectionsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_6.ObservableConnectionsApi(configuration, requestFactory, responseProcessor);
    }
    PromiseConnectionsApi.prototype.createConnection = function (createConnectionRequest, _options) {
        var result = this.api.createConnection(createConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseConnectionsApi.prototype.deleteConnection = function (deleteConnectionRequest, _options) {
        var result = this.api.deleteConnection(deleteConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseConnectionsApi.prototype.searchConnection = function (searchConnectionRequest, _options) {
        var result = this.api.searchConnection(searchConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseConnectionsApi.prototype.updateConnection = function (updateConnectionRequest, _options) {
        var result = this.api.updateConnection(updateConnectionRequest, _options);
        return result.toPromise();
    };
    return PromiseConnectionsApi;
}());
exports.PromiseConnectionsApi = PromiseConnectionsApi;
var ObservableAPI_7 = require("./ObservableAPI");
var PromiseCustomActionApi = (function () {
    function PromiseCustomActionApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_7.ObservableCustomActionApi(configuration, requestFactory, responseProcessor);
    }
    PromiseCustomActionApi.prototype.createCustomAction = function (createCustomActionRequest, _options) {
        var result = this.api.createCustomAction(createCustomActionRequest, _options);
        return result.toPromise();
    };
    PromiseCustomActionApi.prototype.deleteCustomAction = function (customActionIdentifier, _options) {
        var result = this.api.deleteCustomAction(customActionIdentifier, _options);
        return result.toPromise();
    };
    PromiseCustomActionApi.prototype.searchCustomActions = function (searchCustomActionsRequest, _options) {
        var result = this.api.searchCustomActions(searchCustomActionsRequest, _options);
        return result.toPromise();
    };
    PromiseCustomActionApi.prototype.updateCustomAction = function (customActionIdentifier, updateCustomActionRequest, _options) {
        var result = this.api.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);
        return result.toPromise();
    };
    return PromiseCustomActionApi;
}());
exports.PromiseCustomActionApi = PromiseCustomActionApi;
var ObservableAPI_8 = require("./ObservableAPI");
var PromiseDataApi = (function () {
    function PromiseDataApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_8.ObservableDataApi(configuration, requestFactory, responseProcessor);
    }
    PromiseDataApi.prototype.fetchAnswerData = function (fetchAnswerDataRequest, _options) {
        var result = this.api.fetchAnswerData(fetchAnswerDataRequest, _options);
        return result.toPromise();
    };
    PromiseDataApi.prototype.fetchLiveboardData = function (fetchLiveboardDataRequest, _options) {
        var result = this.api.fetchLiveboardData(fetchLiveboardDataRequest, _options);
        return result.toPromise();
    };
    PromiseDataApi.prototype.searchData = function (searchDataRequest, _options) {
        var result = this.api.searchData(searchDataRequest, _options);
        return result.toPromise();
    };
    return PromiseDataApi;
}());
exports.PromiseDataApi = PromiseDataApi;
var ObservableAPI_9 = require("./ObservableAPI");
var PromiseGroupsApi = (function () {
    function PromiseGroupsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_9.ObservableGroupsApi(configuration, requestFactory, responseProcessor);
    }
    PromiseGroupsApi.prototype.createUserGroup = function (createUserGroupRequest, _options) {
        var result = this.api.createUserGroup(createUserGroupRequest, _options);
        return result.toPromise();
    };
    PromiseGroupsApi.prototype.deleteUserGroup = function (groupIdentifier, _options) {
        var result = this.api.deleteUserGroup(groupIdentifier, _options);
        return result.toPromise();
    };
    PromiseGroupsApi.prototype.importUserGroups = function (importUserGroupsRequest, _options) {
        var result = this.api.importUserGroups(importUserGroupsRequest, _options);
        return result.toPromise();
    };
    PromiseGroupsApi.prototype.searchUserGroups = function (searchUserGroupsRequest, _options) {
        var result = this.api.searchUserGroups(searchUserGroupsRequest, _options);
        return result.toPromise();
    };
    PromiseGroupsApi.prototype.updateUserGroup = function (groupIdentifier, updateUserGroupRequest, _options) {
        var result = this.api.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);
        return result.toPromise();
    };
    return PromiseGroupsApi;
}());
exports.PromiseGroupsApi = PromiseGroupsApi;
var ObservableAPI_10 = require("./ObservableAPI");
var PromiseLogApi = (function () {
    function PromiseLogApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_10.ObservableLogApi(configuration, requestFactory, responseProcessor);
    }
    PromiseLogApi.prototype.fetchLogs = function (fetchLogsRequest, _options) {
        var result = this.api.fetchLogs(fetchLogsRequest, _options);
        return result.toPromise();
    };
    return PromiseLogApi;
}());
exports.PromiseLogApi = PromiseLogApi;
var ObservableAPI_11 = require("./ObservableAPI");
var PromiseMetadataApi = (function () {
    function PromiseMetadataApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_11.ObservableMetadataApi(configuration, requestFactory, responseProcessor);
    }
    PromiseMetadataApi.prototype.deleteMetadata = function (deleteMetadataRequest, _options) {
        var result = this.api.deleteMetadata(deleteMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseMetadataApi.prototype.exportMetadataTML = function (exportMetadataTMLRequest, _options) {
        var result = this.api.exportMetadataTML(exportMetadataTMLRequest, _options);
        return result.toPromise();
    };
    PromiseMetadataApi.prototype.fetchAnswerSqlQuery = function (fetchAnswerSqlQueryRequest, _options) {
        var result = this.api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);
        return result.toPromise();
    };
    PromiseMetadataApi.prototype.fetchLiveboardSqlQuery = function (fetchLiveboardSqlQueryRequest, _options) {
        var result = this.api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);
        return result.toPromise();
    };
    PromiseMetadataApi.prototype.importMetadataTML = function (importMetadataTMLRequest, _options) {
        var result = this.api.importMetadataTML(importMetadataTMLRequest, _options);
        return result.toPromise();
    };
    PromiseMetadataApi.prototype.searchMetadata = function (searchMetadataRequest, _options) {
        var result = this.api.searchMetadata(searchMetadataRequest, _options);
        return result.toPromise();
    };
    return PromiseMetadataApi;
}());
exports.PromiseMetadataApi = PromiseMetadataApi;
var ObservableAPI_12 = require("./ObservableAPI");
var PromiseOrgsApi = (function () {
    function PromiseOrgsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_12.ObservableOrgsApi(configuration, requestFactory, responseProcessor);
    }
    PromiseOrgsApi.prototype.createOrg = function (createOrgRequest, _options) {
        var result = this.api.createOrg(createOrgRequest, _options);
        return result.toPromise();
    };
    PromiseOrgsApi.prototype.deleteOrg = function (orgIdentifier, _options) {
        var result = this.api.deleteOrg(orgIdentifier, _options);
        return result.toPromise();
    };
    PromiseOrgsApi.prototype.searchOrgs = function (searchOrgsRequest, _options) {
        var result = this.api.searchOrgs(searchOrgsRequest, _options);
        return result.toPromise();
    };
    PromiseOrgsApi.prototype.updateOrg = function (orgIdentifier, updateOrgRequest, _options) {
        var result = this.api.updateOrg(orgIdentifier, updateOrgRequest, _options);
        return result.toPromise();
    };
    return PromiseOrgsApi;
}());
exports.PromiseOrgsApi = PromiseOrgsApi;
var ObservableAPI_13 = require("./ObservableAPI");
var PromiseReportsApi = (function () {
    function PromiseReportsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_13.ObservableReportsApi(configuration, requestFactory, responseProcessor);
    }
    PromiseReportsApi.prototype.exportAnswerReport = function (exportAnswerReportRequest, _options) {
        var result = this.api.exportAnswerReport(exportAnswerReportRequest, _options);
        return result.toPromise();
    };
    PromiseReportsApi.prototype.exportLiveboardReport = function (exportLiveboardReportRequest, _options) {
        var result = this.api.exportLiveboardReport(exportLiveboardReportRequest, _options);
        return result.toPromise();
    };
    return PromiseReportsApi;
}());
exports.PromiseReportsApi = PromiseReportsApi;
var ObservableAPI_14 = require("./ObservableAPI");
var PromiseRolesApi = (function () {
    function PromiseRolesApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_14.ObservableRolesApi(configuration, requestFactory, responseProcessor);
    }
    PromiseRolesApi.prototype.createRole = function (createRoleRequest, _options) {
        var result = this.api.createRole(createRoleRequest, _options);
        return result.toPromise();
    };
    PromiseRolesApi.prototype.deleteRole = function (roleIdentifier, _options) {
        var result = this.api.deleteRole(roleIdentifier, _options);
        return result.toPromise();
    };
    PromiseRolesApi.prototype.searchRoles = function (searchRolesRequest, _options) {
        var result = this.api.searchRoles(searchRolesRequest, _options);
        return result.toPromise();
    };
    PromiseRolesApi.prototype.updateRole = function (roleIdentifier, updateRoleRequest, _options) {
        var result = this.api.updateRole(roleIdentifier, updateRoleRequest, _options);
        return result.toPromise();
    };
    return PromiseRolesApi;
}());
exports.PromiseRolesApi = PromiseRolesApi;
var ObservableAPI_15 = require("./ObservableAPI");
var PromiseSchedulesApi = (function () {
    function PromiseSchedulesApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_15.ObservableSchedulesApi(configuration, requestFactory, responseProcessor);
    }
    PromiseSchedulesApi.prototype.createSchedule = function (createScheduleRequest, _options) {
        var result = this.api.createSchedule(createScheduleRequest, _options);
        return result.toPromise();
    };
    PromiseSchedulesApi.prototype.deleteSchedule = function (scheduleIdentifier, _options) {
        var result = this.api.deleteSchedule(scheduleIdentifier, _options);
        return result.toPromise();
    };
    PromiseSchedulesApi.prototype.searchSchedules = function (searchSchedulesRequest, _options) {
        var result = this.api.searchSchedules(searchSchedulesRequest, _options);
        return result.toPromise();
    };
    PromiseSchedulesApi.prototype.updateSchedule = function (scheduleIdentifier, updateScheduleRequest, _options) {
        var result = this.api.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);
        return result.toPromise();
    };
    return PromiseSchedulesApi;
}());
exports.PromiseSchedulesApi = PromiseSchedulesApi;
var ObservableAPI_16 = require("./ObservableAPI");
var PromiseSecurityApi = (function () {
    function PromiseSecurityApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_16.ObservableSecurityApi(configuration, requestFactory, responseProcessor);
    }
    PromiseSecurityApi.prototype.assignChangeAuthor = function (assignChangeAuthorRequest, _options) {
        var result = this.api.assignChangeAuthor(assignChangeAuthorRequest, _options);
        return result.toPromise();
    };
    PromiseSecurityApi.prototype.fetchPermissionsOfPrincipals = function (fetchPermissionsOfPrincipalsRequest, _options) {
        var result = this.api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);
        return result.toPromise();
    };
    PromiseSecurityApi.prototype.fetchPermissionsOnMetadata = function (fetchPermissionsOnMetadataRequest, _options) {
        var result = this.api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseSecurityApi.prototype.shareMetadata = function (shareMetadataRequest, _options) {
        var result = this.api.shareMetadata(shareMetadataRequest, _options);
        return result.toPromise();
    };
    return PromiseSecurityApi;
}());
exports.PromiseSecurityApi = PromiseSecurityApi;
var ObservableAPI_17 = require("./ObservableAPI");
var PromiseSystemApi = (function () {
    function PromiseSystemApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_17.ObservableSystemApi(configuration, requestFactory, responseProcessor);
    }
    PromiseSystemApi.prototype.getSystemConfig = function (_options) {
        var result = this.api.getSystemConfig(_options);
        return result.toPromise();
    };
    PromiseSystemApi.prototype.getSystemInformation = function (_options) {
        var result = this.api.getSystemInformation(_options);
        return result.toPromise();
    };
    PromiseSystemApi.prototype.getSystemOverrideInfo = function (_options) {
        var result = this.api.getSystemOverrideInfo(_options);
        return result.toPromise();
    };
    PromiseSystemApi.prototype.updateSystemConfig = function (updateSystemConfigRequest, _options) {
        var result = this.api.updateSystemConfig(updateSystemConfigRequest, _options);
        return result.toPromise();
    };
    return PromiseSystemApi;
}());
exports.PromiseSystemApi = PromiseSystemApi;
var ObservableAPI_18 = require("./ObservableAPI");
var PromiseTagsApi = (function () {
    function PromiseTagsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_18.ObservableTagsApi(configuration, requestFactory, responseProcessor);
    }
    PromiseTagsApi.prototype.assignTag = function (assignTagRequest, _options) {
        var result = this.api.assignTag(assignTagRequest, _options);
        return result.toPromise();
    };
    PromiseTagsApi.prototype.createTag = function (createTagRequest, _options) {
        var result = this.api.createTag(createTagRequest, _options);
        return result.toPromise();
    };
    PromiseTagsApi.prototype.deleteTag = function (tagIdentifier, _options) {
        var result = this.api.deleteTag(tagIdentifier, _options);
        return result.toPromise();
    };
    PromiseTagsApi.prototype.searchTags = function (searchTagsRequest, _options) {
        var result = this.api.searchTags(searchTagsRequest, _options);
        return result.toPromise();
    };
    PromiseTagsApi.prototype.unassignTag = function (assignTagRequest, _options) {
        var result = this.api.unassignTag(assignTagRequest, _options);
        return result.toPromise();
    };
    PromiseTagsApi.prototype.updateTag = function (tagIdentifier, updateTagRequest, _options) {
        var result = this.api.updateTag(tagIdentifier, updateTagRequest, _options);
        return result.toPromise();
    };
    return PromiseTagsApi;
}());
exports.PromiseTagsApi = PromiseTagsApi;
var ObservableAPI_19 = require("./ObservableAPI");
var PromiseThoughtSpotRestApi = (function () {
    function PromiseThoughtSpotRestApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_19.ObservableThoughtSpotRestApi(configuration, requestFactory, responseProcessor);
    }
    PromiseThoughtSpotRestApi.prototype.assignChangeAuthor = function (assignChangeAuthorRequest, _options) {
        var result = this.api.assignChangeAuthor(assignChangeAuthorRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.assignTag = function (assignTagRequest, _options) {
        var result = this.api.assignTag(assignTagRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.changeUserPassword = function (changeUserPasswordRequest, _options) {
        var result = this.api.changeUserPassword(changeUserPasswordRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.commitBranch = function (commitBranchRequest, _options) {
        var result = this.api.commitBranch(commitBranchRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createConfig = function (createConfigRequest, _options) {
        var result = this.api.createConfig(createConfigRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createConnection = function (createConnectionRequest, _options) {
        var result = this.api.createConnection(createConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createCustomAction = function (createCustomActionRequest, _options) {
        var result = this.api.createCustomAction(createCustomActionRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createOrg = function (createOrgRequest, _options) {
        var result = this.api.createOrg(createOrgRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createRole = function (createRoleRequest, _options) {
        var result = this.api.createRole(createRoleRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createSchedule = function (createScheduleRequest, _options) {
        var result = this.api.createSchedule(createScheduleRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createTag = function (createTagRequest, _options) {
        var result = this.api.createTag(createTagRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createUser = function (createUserRequest, _options) {
        var result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.createUserGroup = function (createUserGroupRequest, _options) {
        var result = this.api.createUserGroup(createUserGroupRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteConfig = function (deleteConfigRequest, _options) {
        var result = this.api.deleteConfig(deleteConfigRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteConnection = function (deleteConnectionRequest, _options) {
        var result = this.api.deleteConnection(deleteConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteCustomAction = function (customActionIdentifier, _options) {
        var result = this.api.deleteCustomAction(customActionIdentifier, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteMetadata = function (deleteMetadataRequest, _options) {
        var result = this.api.deleteMetadata(deleteMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteOrg = function (orgIdentifier, _options) {
        var result = this.api.deleteOrg(orgIdentifier, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteRole = function (roleIdentifier, _options) {
        var result = this.api.deleteRole(roleIdentifier, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteSchedule = function (scheduleIdentifier, _options) {
        var result = this.api.deleteSchedule(scheduleIdentifier, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteTag = function (tagIdentifier, _options) {
        var result = this.api.deleteTag(tagIdentifier, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteUser = function (userIdentifier, _options) {
        var result = this.api.deleteUser(userIdentifier, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deleteUserGroup = function (groupIdentifier, _options) {
        var result = this.api.deleteUserGroup(groupIdentifier, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.deployCommit = function (deployCommitRequest, _options) {
        var result = this.api.deployCommit(deployCommitRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.exportAnswerReport = function (exportAnswerReportRequest, _options) {
        var result = this.api.exportAnswerReport(exportAnswerReportRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.exportLiveboardReport = function (exportLiveboardReportRequest, _options) {
        var result = this.api.exportLiveboardReport(exportLiveboardReportRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.exportMetadataTML = function (exportMetadataTMLRequest, _options) {
        var result = this.api.exportMetadataTML(exportMetadataTMLRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.fetchAnswerData = function (fetchAnswerDataRequest, _options) {
        var result = this.api.fetchAnswerData(fetchAnswerDataRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.fetchAnswerSqlQuery = function (fetchAnswerSqlQueryRequest, _options) {
        var result = this.api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.fetchLiveboardData = function (fetchLiveboardDataRequest, _options) {
        var result = this.api.fetchLiveboardData(fetchLiveboardDataRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.fetchLiveboardSqlQuery = function (fetchLiveboardSqlQueryRequest, _options) {
        var result = this.api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.fetchLogs = function (fetchLogsRequest, _options) {
        var result = this.api.fetchLogs(fetchLogsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.fetchPermissionsOfPrincipals = function (fetchPermissionsOfPrincipalsRequest, _options) {
        var result = this.api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.fetchPermissionsOnMetadata = function (fetchPermissionsOnMetadataRequest, _options) {
        var result = this.api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.forceLogoutUsers = function (forceLogoutUsersRequest, _options) {
        var result = this.api.forceLogoutUsers(forceLogoutUsersRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.getCurrentUserInfo = function (_options) {
        var result = this.api.getCurrentUserInfo(_options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.getCurrentUserToken = function (_options) {
        var result = this.api.getCurrentUserToken(_options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.getFullAccessToken = function (getFullAccessTokenRequest, _options) {
        var result = this.api.getFullAccessToken(getFullAccessTokenRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.getObjectAccessToken = function (getObjectAccessTokenRequest, _options) {
        var result = this.api.getObjectAccessToken(getObjectAccessTokenRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.getSystemConfig = function (_options) {
        var result = this.api.getSystemConfig(_options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.getSystemInformation = function (_options) {
        var result = this.api.getSystemInformation(_options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.getSystemOverrideInfo = function (_options) {
        var result = this.api.getSystemOverrideInfo(_options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.importMetadataTML = function (importMetadataTMLRequest, _options) {
        var result = this.api.importMetadataTML(importMetadataTMLRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.importUserGroups = function (importUserGroupsRequest, _options) {
        var result = this.api.importUserGroups(importUserGroupsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.importUsers = function (importUsersRequest, _options) {
        var result = this.api.importUsers(importUsersRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.login = function (loginRequest, _options) {
        var result = this.api.login(loginRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.logout = function (_options) {
        var result = this.api.logout(_options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.resetUserPassword = function (resetUserPasswordRequest, _options) {
        var result = this.api.resetUserPassword(resetUserPasswordRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.revertCommit = function (commitId, revertCommitRequest, _options) {
        var result = this.api.revertCommit(commitId, revertCommitRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.revokeToken = function (revokeTokenRequest, _options) {
        var result = this.api.revokeToken(revokeTokenRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchCommits = function (searchCommitsRequest, _options) {
        var result = this.api.searchCommits(searchCommitsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchConfig = function (searchConfigRequest, _options) {
        var result = this.api.searchConfig(searchConfigRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchConnection = function (searchConnectionRequest, _options) {
        var result = this.api.searchConnection(searchConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchCustomActions = function (searchCustomActionsRequest, _options) {
        var result = this.api.searchCustomActions(searchCustomActionsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchData = function (searchDataRequest, _options) {
        var result = this.api.searchData(searchDataRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchMetadata = function (searchMetadataRequest, _options) {
        var result = this.api.searchMetadata(searchMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchOrgs = function (searchOrgsRequest, _options) {
        var result = this.api.searchOrgs(searchOrgsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchRoles = function (searchRolesRequest, _options) {
        var result = this.api.searchRoles(searchRolesRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchSchedules = function (searchSchedulesRequest, _options) {
        var result = this.api.searchSchedules(searchSchedulesRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchTags = function (searchTagsRequest, _options) {
        var result = this.api.searchTags(searchTagsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchUserGroups = function (searchUserGroupsRequest, _options) {
        var result = this.api.searchUserGroups(searchUserGroupsRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.searchUsers = function (searchUsersRequest, _options) {
        var result = this.api.searchUsers(searchUsersRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.shareMetadata = function (shareMetadataRequest, _options) {
        var result = this.api.shareMetadata(shareMetadataRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.unassignTag = function (assignTagRequest, _options) {
        var result = this.api.unassignTag(assignTagRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateConfig = function (updateConfigRequest, _options) {
        var result = this.api.updateConfig(updateConfigRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateConnection = function (updateConnectionRequest, _options) {
        var result = this.api.updateConnection(updateConnectionRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateCustomAction = function (customActionIdentifier, updateCustomActionRequest, _options) {
        var result = this.api.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateOrg = function (orgIdentifier, updateOrgRequest, _options) {
        var result = this.api.updateOrg(orgIdentifier, updateOrgRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateRole = function (roleIdentifier, updateRoleRequest, _options) {
        var result = this.api.updateRole(roleIdentifier, updateRoleRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateSchedule = function (scheduleIdentifier, updateScheduleRequest, _options) {
        var result = this.api.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateSystemConfig = function (updateSystemConfigRequest, _options) {
        var result = this.api.updateSystemConfig(updateSystemConfigRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateTag = function (tagIdentifier, updateTagRequest, _options) {
        var result = this.api.updateTag(tagIdentifier, updateTagRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateUser = function (userIdentifier, updateUserRequest, _options) {
        var result = this.api.updateUser(userIdentifier, updateUserRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.updateUserGroup = function (groupIdentifier, updateUserGroupRequest, _options) {
        var result = this.api.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);
        return result.toPromise();
    };
    PromiseThoughtSpotRestApi.prototype.validateMerge = function (validateMergeRequest, _options) {
        var result = this.api.validateMerge(validateMergeRequest, _options);
        return result.toPromise();
    };
    return PromiseThoughtSpotRestApi;
}());
exports.PromiseThoughtSpotRestApi = PromiseThoughtSpotRestApi;
var ObservableAPI_20 = require("./ObservableAPI");
var PromiseUsersApi = (function () {
    function PromiseUsersApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_20.ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }
    PromiseUsersApi.prototype.changeUserPassword = function (changeUserPasswordRequest, _options) {
        var result = this.api.changeUserPassword(changeUserPasswordRequest, _options);
        return result.toPromise();
    };
    PromiseUsersApi.prototype.createUser = function (createUserRequest, _options) {
        var result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    };
    PromiseUsersApi.prototype.deleteUser = function (userIdentifier, _options) {
        var result = this.api.deleteUser(userIdentifier, _options);
        return result.toPromise();
    };
    PromiseUsersApi.prototype.forceLogoutUsers = function (forceLogoutUsersRequest, _options) {
        var result = this.api.forceLogoutUsers(forceLogoutUsersRequest, _options);
        return result.toPromise();
    };
    PromiseUsersApi.prototype.importUsers = function (importUsersRequest, _options) {
        var result = this.api.importUsers(importUsersRequest, _options);
        return result.toPromise();
    };
    PromiseUsersApi.prototype.resetUserPassword = function (resetUserPasswordRequest, _options) {
        var result = this.api.resetUserPassword(resetUserPasswordRequest, _options);
        return result.toPromise();
    };
    PromiseUsersApi.prototype.searchUsers = function (searchUsersRequest, _options) {
        var result = this.api.searchUsers(searchUsersRequest, _options);
        return result.toPromise();
    };
    PromiseUsersApi.prototype.updateUser = function (userIdentifier, updateUserRequest, _options) {
        var result = this.api.updateUser(userIdentifier, updateUserRequest, _options);
        return result.toPromise();
    };
    return PromiseUsersApi;
}());
exports.PromiseUsersApi = PromiseUsersApi;
var ObservableAPI_21 = require("./ObservableAPI");
var PromiseVersionControlApi = (function () {
    function PromiseVersionControlApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_21.ObservableVersionControlApi(configuration, requestFactory, responseProcessor);
    }
    PromiseVersionControlApi.prototype.commitBranch = function (commitBranchRequest, _options) {
        var result = this.api.commitBranch(commitBranchRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.createConfig = function (createConfigRequest, _options) {
        var result = this.api.createConfig(createConfigRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.deleteConfig = function (deleteConfigRequest, _options) {
        var result = this.api.deleteConfig(deleteConfigRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.deployCommit = function (deployCommitRequest, _options) {
        var result = this.api.deployCommit(deployCommitRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.revertCommit = function (commitId, revertCommitRequest, _options) {
        var result = this.api.revertCommit(commitId, revertCommitRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.searchCommits = function (searchCommitsRequest, _options) {
        var result = this.api.searchCommits(searchCommitsRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.searchConfig = function (searchConfigRequest, _options) {
        var result = this.api.searchConfig(searchConfigRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.updateConfig = function (updateConfigRequest, _options) {
        var result = this.api.updateConfig(updateConfigRequest, _options);
        return result.toPromise();
    };
    PromiseVersionControlApi.prototype.validateMerge = function (validateMergeRequest, _options) {
        var result = this.api.validateMerge(validateMergeRequest, _options);
        return result.toPromise();
    };
    return PromiseVersionControlApi;
}());
exports.PromiseVersionControlApi = PromiseVersionControlApi;
//# sourceMappingURL=PromiseAPI.js.map