"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ObjectVersionControlApi = exports.ObjectUsersApi = exports.ObjectThoughtSpotRestApi = exports.ObjectTagsApi = exports.ObjectSystemApi = exports.ObjectSecurityApi = exports.ObjectSchedulesApi = exports.ObjectRolesApi = exports.ObjectReportsApi = exports.ObjectOrgsApi = exports.ObjectMetadataApi = exports.ObjectLogApi = exports.ObjectGroupsApi = exports.ObjectDataApi = exports.ObjectCustomActionApi = exports.ObjectConnectionsApi = exports.ObjectClass950ClApi = exports.ObjectClass940ClApi = exports.ObjectClass920ClApi = exports.ObjectClass900ClApi = exports.ObjectAuthenticationApi = void 0;
var ObservableAPI_1 = require("./ObservableAPI");
var ObjectAuthenticationApi = (function () {
    function ObjectAuthenticationApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_1.ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }
    ObjectAuthenticationApi.prototype.getCurrentUserInfo = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getCurrentUserInfo(options).toPromise();
    };
    ObjectAuthenticationApi.prototype.getCurrentUserToken = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getCurrentUserToken(options).toPromise();
    };
    ObjectAuthenticationApi.prototype.getFullAccessToken = function (param, options) {
        return this.api.getFullAccessToken(param.getFullAccessTokenRequest, options).toPromise();
    };
    ObjectAuthenticationApi.prototype.getObjectAccessToken = function (param, options) {
        return this.api.getObjectAccessToken(param.getObjectAccessTokenRequest, options).toPromise();
    };
    ObjectAuthenticationApi.prototype.login = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.login(param.loginRequest, options).toPromise();
    };
    ObjectAuthenticationApi.prototype.logout = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.logout(options).toPromise();
    };
    ObjectAuthenticationApi.prototype.revokeToken = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.revokeToken(param.revokeTokenRequest, options).toPromise();
    };
    return ObjectAuthenticationApi;
}());
exports.ObjectAuthenticationApi = ObjectAuthenticationApi;
var ObservableAPI_2 = require("./ObservableAPI");
var ObjectClass900ClApi = (function () {
    function ObjectClass900ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_2.ObservableClass900ClApi(configuration, requestFactory, responseProcessor);
    }
    ObjectClass900ClApi.prototype.assignChangeAuthor = function (param, options) {
        return this.api.assignChangeAuthor(param.assignChangeAuthorRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.assignTag = function (param, options) {
        return this.api.assignTag(param.assignTagRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.changeUserPassword = function (param, options) {
        return this.api.changeUserPassword(param.changeUserPasswordRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.createOrg = function (param, options) {
        return this.api.createOrg(param.createOrgRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.createTag = function (param, options) {
        return this.api.createTag(param.createTagRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.createUser = function (param, options) {
        return this.api.createUser(param.createUserRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.createUserGroup = function (param, options) {
        return this.api.createUserGroup(param.createUserGroupRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.deleteMetadata = function (param, options) {
        return this.api.deleteMetadata(param.deleteMetadataRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.deleteOrg = function (param, options) {
        return this.api.deleteOrg(param.orgIdentifier, options).toPromise();
    };
    ObjectClass900ClApi.prototype.deleteTag = function (param, options) {
        return this.api.deleteTag(param.tagIdentifier, options).toPromise();
    };
    ObjectClass900ClApi.prototype.deleteUser = function (param, options) {
        return this.api.deleteUser(param.userIdentifier, options).toPromise();
    };
    ObjectClass900ClApi.prototype.deleteUserGroup = function (param, options) {
        return this.api.deleteUserGroup(param.groupIdentifier, options).toPromise();
    };
    ObjectClass900ClApi.prototype.exportAnswerReport = function (param, options) {
        return this.api.exportAnswerReport(param.exportAnswerReportRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.exportLiveboardReport = function (param, options) {
        return this.api.exportLiveboardReport(param.exportLiveboardReportRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.exportMetadataTML = function (param, options) {
        return this.api.exportMetadataTML(param.exportMetadataTMLRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.fetchAnswerData = function (param, options) {
        return this.api.fetchAnswerData(param.fetchAnswerDataRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.fetchAnswerSqlQuery = function (param, options) {
        return this.api.fetchAnswerSqlQuery(param.fetchAnswerSqlQueryRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.fetchLiveboardData = function (param, options) {
        return this.api.fetchLiveboardData(param.fetchLiveboardDataRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.fetchLiveboardSqlQuery = function (param, options) {
        return this.api.fetchLiveboardSqlQuery(param.fetchLiveboardSqlQueryRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.fetchLogs = function (param, options) {
        return this.api.fetchLogs(param.fetchLogsRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.fetchPermissionsOfPrincipals = function (param, options) {
        return this.api.fetchPermissionsOfPrincipals(param.fetchPermissionsOfPrincipalsRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.fetchPermissionsOnMetadata = function (param, options) {
        return this.api.fetchPermissionsOnMetadata(param.fetchPermissionsOnMetadataRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.forceLogoutUsers = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.forceLogoutUsers(param.forceLogoutUsersRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.getCurrentUserInfo = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getCurrentUserInfo(options).toPromise();
    };
    ObjectClass900ClApi.prototype.getFullAccessToken = function (param, options) {
        return this.api.getFullAccessToken(param.getFullAccessTokenRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.getObjectAccessToken = function (param, options) {
        return this.api.getObjectAccessToken(param.getObjectAccessTokenRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.getSystemConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemConfig(options).toPromise();
    };
    ObjectClass900ClApi.prototype.getSystemInformation = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemInformation(options).toPromise();
    };
    ObjectClass900ClApi.prototype.importMetadataTML = function (param, options) {
        return this.api.importMetadataTML(param.importMetadataTMLRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.importUserGroups = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.importUserGroups(param.importUserGroupsRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.importUsers = function (param, options) {
        return this.api.importUsers(param.importUsersRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.login = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.login(param.loginRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.logout = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.logout(options).toPromise();
    };
    ObjectClass900ClApi.prototype.resetUserPassword = function (param, options) {
        return this.api.resetUserPassword(param.resetUserPasswordRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.revokeToken = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.revokeToken(param.revokeTokenRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.searchData = function (param, options) {
        return this.api.searchData(param.searchDataRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.searchMetadata = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchMetadata(param.searchMetadataRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.searchOrgs = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchOrgs(param.searchOrgsRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.searchTags = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchTags(param.searchTagsRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.searchUserGroups = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchUserGroups(param.searchUserGroupsRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.searchUsers = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchUsers(param.searchUsersRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.shareMetadata = function (param, options) {
        return this.api.shareMetadata(param.shareMetadataRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.unassignTag = function (param, options) {
        return this.api.unassignTag(param.assignTagRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.updateOrg = function (param, options) {
        return this.api.updateOrg(param.orgIdentifier, param.updateOrgRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.updateTag = function (param, options) {
        return this.api.updateTag(param.tagIdentifier, param.updateTagRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.updateUser = function (param, options) {
        return this.api.updateUser(param.userIdentifier, param.updateUserRequest, options).toPromise();
    };
    ObjectClass900ClApi.prototype.updateUserGroup = function (param, options) {
        return this.api.updateUserGroup(param.groupIdentifier, param.updateUserGroupRequest, options).toPromise();
    };
    return ObjectClass900ClApi;
}());
exports.ObjectClass900ClApi = ObjectClass900ClApi;
var ObservableAPI_3 = require("./ObservableAPI");
var ObjectClass920ClApi = (function () {
    function ObjectClass920ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_3.ObservableClass920ClApi(configuration, requestFactory, responseProcessor);
    }
    ObjectClass920ClApi.prototype.createConnection = function (param, options) {
        return this.api.createConnection(param.createConnectionRequest, options).toPromise();
    };
    ObjectClass920ClApi.prototype.deleteConnection = function (param, options) {
        return this.api.deleteConnection(param.deleteConnectionRequest, options).toPromise();
    };
    ObjectClass920ClApi.prototype.getSystemOverrideInfo = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemOverrideInfo(options).toPromise();
    };
    ObjectClass920ClApi.prototype.searchConnection = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchConnection(param.searchConnectionRequest, options).toPromise();
    };
    ObjectClass920ClApi.prototype.updateConnection = function (param, options) {
        return this.api.updateConnection(param.updateConnectionRequest, options).toPromise();
    };
    ObjectClass920ClApi.prototype.updateSystemConfig = function (param, options) {
        return this.api.updateSystemConfig(param.updateSystemConfigRequest, options).toPromise();
    };
    return ObjectClass920ClApi;
}());
exports.ObjectClass920ClApi = ObjectClass920ClApi;
var ObservableAPI_4 = require("./ObservableAPI");
var ObjectClass940ClApi = (function () {
    function ObjectClass940ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_4.ObservableClass940ClApi(configuration, requestFactory, responseProcessor);
    }
    ObjectClass940ClApi.prototype.createSchedule = function (param, options) {
        return this.api.createSchedule(param.createScheduleRequest, options).toPromise();
    };
    ObjectClass940ClApi.prototype.deleteSchedule = function (param, options) {
        return this.api.deleteSchedule(param.scheduleIdentifier, options).toPromise();
    };
    ObjectClass940ClApi.prototype.getCurrentUserToken = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getCurrentUserToken(options).toPromise();
    };
    ObjectClass940ClApi.prototype.searchSchedules = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchSchedules(param.searchSchedulesRequest, options).toPromise();
    };
    ObjectClass940ClApi.prototype.updateSchedule = function (param, options) {
        return this.api.updateSchedule(param.scheduleIdentifier, param.updateScheduleRequest, options).toPromise();
    };
    return ObjectClass940ClApi;
}());
exports.ObjectClass940ClApi = ObjectClass940ClApi;
var ObservableAPI_5 = require("./ObservableAPI");
var ObjectClass950ClApi = (function () {
    function ObjectClass950ClApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_5.ObservableClass950ClApi(configuration, requestFactory, responseProcessor);
    }
    ObjectClass950ClApi.prototype.createCustomAction = function (param, options) {
        return this.api.createCustomAction(param.createCustomActionRequest, options).toPromise();
    };
    ObjectClass950ClApi.prototype.createRole = function (param, options) {
        return this.api.createRole(param.createRoleRequest, options).toPromise();
    };
    ObjectClass950ClApi.prototype.deleteCustomAction = function (param, options) {
        return this.api.deleteCustomAction(param.customActionIdentifier, options).toPromise();
    };
    ObjectClass950ClApi.prototype.deleteRole = function (param, options) {
        return this.api.deleteRole(param.roleIdentifier, options).toPromise();
    };
    ObjectClass950ClApi.prototype.searchCustomActions = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchCustomActions(param.searchCustomActionsRequest, options).toPromise();
    };
    ObjectClass950ClApi.prototype.searchRoles = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchRoles(param.searchRolesRequest, options).toPromise();
    };
    ObjectClass950ClApi.prototype.updateCustomAction = function (param, options) {
        return this.api.updateCustomAction(param.customActionIdentifier, param.updateCustomActionRequest, options).toPromise();
    };
    ObjectClass950ClApi.prototype.updateRole = function (param, options) {
        return this.api.updateRole(param.roleIdentifier, param.updateRoleRequest, options).toPromise();
    };
    return ObjectClass950ClApi;
}());
exports.ObjectClass950ClApi = ObjectClass950ClApi;
var ObservableAPI_6 = require("./ObservableAPI");
var ObjectConnectionsApi = (function () {
    function ObjectConnectionsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_6.ObservableConnectionsApi(configuration, requestFactory, responseProcessor);
    }
    ObjectConnectionsApi.prototype.createConnection = function (param, options) {
        return this.api.createConnection(param.createConnectionRequest, options).toPromise();
    };
    ObjectConnectionsApi.prototype.deleteConnection = function (param, options) {
        return this.api.deleteConnection(param.deleteConnectionRequest, options).toPromise();
    };
    ObjectConnectionsApi.prototype.searchConnection = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchConnection(param.searchConnectionRequest, options).toPromise();
    };
    ObjectConnectionsApi.prototype.updateConnection = function (param, options) {
        return this.api.updateConnection(param.updateConnectionRequest, options).toPromise();
    };
    return ObjectConnectionsApi;
}());
exports.ObjectConnectionsApi = ObjectConnectionsApi;
var ObservableAPI_7 = require("./ObservableAPI");
var ObjectCustomActionApi = (function () {
    function ObjectCustomActionApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_7.ObservableCustomActionApi(configuration, requestFactory, responseProcessor);
    }
    ObjectCustomActionApi.prototype.createCustomAction = function (param, options) {
        return this.api.createCustomAction(param.createCustomActionRequest, options).toPromise();
    };
    ObjectCustomActionApi.prototype.deleteCustomAction = function (param, options) {
        return this.api.deleteCustomAction(param.customActionIdentifier, options).toPromise();
    };
    ObjectCustomActionApi.prototype.searchCustomActions = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchCustomActions(param.searchCustomActionsRequest, options).toPromise();
    };
    ObjectCustomActionApi.prototype.updateCustomAction = function (param, options) {
        return this.api.updateCustomAction(param.customActionIdentifier, param.updateCustomActionRequest, options).toPromise();
    };
    return ObjectCustomActionApi;
}());
exports.ObjectCustomActionApi = ObjectCustomActionApi;
var ObservableAPI_8 = require("./ObservableAPI");
var ObjectDataApi = (function () {
    function ObjectDataApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_8.ObservableDataApi(configuration, requestFactory, responseProcessor);
    }
    ObjectDataApi.prototype.fetchAnswerData = function (param, options) {
        return this.api.fetchAnswerData(param.fetchAnswerDataRequest, options).toPromise();
    };
    ObjectDataApi.prototype.fetchLiveboardData = function (param, options) {
        return this.api.fetchLiveboardData(param.fetchLiveboardDataRequest, options).toPromise();
    };
    ObjectDataApi.prototype.searchData = function (param, options) {
        return this.api.searchData(param.searchDataRequest, options).toPromise();
    };
    return ObjectDataApi;
}());
exports.ObjectDataApi = ObjectDataApi;
var ObservableAPI_9 = require("./ObservableAPI");
var ObjectGroupsApi = (function () {
    function ObjectGroupsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_9.ObservableGroupsApi(configuration, requestFactory, responseProcessor);
    }
    ObjectGroupsApi.prototype.createUserGroup = function (param, options) {
        return this.api.createUserGroup(param.createUserGroupRequest, options).toPromise();
    };
    ObjectGroupsApi.prototype.deleteUserGroup = function (param, options) {
        return this.api.deleteUserGroup(param.groupIdentifier, options).toPromise();
    };
    ObjectGroupsApi.prototype.importUserGroups = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.importUserGroups(param.importUserGroupsRequest, options).toPromise();
    };
    ObjectGroupsApi.prototype.searchUserGroups = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchUserGroups(param.searchUserGroupsRequest, options).toPromise();
    };
    ObjectGroupsApi.prototype.updateUserGroup = function (param, options) {
        return this.api.updateUserGroup(param.groupIdentifier, param.updateUserGroupRequest, options).toPromise();
    };
    return ObjectGroupsApi;
}());
exports.ObjectGroupsApi = ObjectGroupsApi;
var ObservableAPI_10 = require("./ObservableAPI");
var ObjectLogApi = (function () {
    function ObjectLogApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_10.ObservableLogApi(configuration, requestFactory, responseProcessor);
    }
    ObjectLogApi.prototype.fetchLogs = function (param, options) {
        return this.api.fetchLogs(param.fetchLogsRequest, options).toPromise();
    };
    return ObjectLogApi;
}());
exports.ObjectLogApi = ObjectLogApi;
var ObservableAPI_11 = require("./ObservableAPI");
var ObjectMetadataApi = (function () {
    function ObjectMetadataApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_11.ObservableMetadataApi(configuration, requestFactory, responseProcessor);
    }
    ObjectMetadataApi.prototype.deleteMetadata = function (param, options) {
        return this.api.deleteMetadata(param.deleteMetadataRequest, options).toPromise();
    };
    ObjectMetadataApi.prototype.exportMetadataTML = function (param, options) {
        return this.api.exportMetadataTML(param.exportMetadataTMLRequest, options).toPromise();
    };
    ObjectMetadataApi.prototype.fetchAnswerSqlQuery = function (param, options) {
        return this.api.fetchAnswerSqlQuery(param.fetchAnswerSqlQueryRequest, options).toPromise();
    };
    ObjectMetadataApi.prototype.fetchLiveboardSqlQuery = function (param, options) {
        return this.api.fetchLiveboardSqlQuery(param.fetchLiveboardSqlQueryRequest, options).toPromise();
    };
    ObjectMetadataApi.prototype.importMetadataTML = function (param, options) {
        return this.api.importMetadataTML(param.importMetadataTMLRequest, options).toPromise();
    };
    ObjectMetadataApi.prototype.searchMetadata = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchMetadata(param.searchMetadataRequest, options).toPromise();
    };
    return ObjectMetadataApi;
}());
exports.ObjectMetadataApi = ObjectMetadataApi;
var ObservableAPI_12 = require("./ObservableAPI");
var ObjectOrgsApi = (function () {
    function ObjectOrgsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_12.ObservableOrgsApi(configuration, requestFactory, responseProcessor);
    }
    ObjectOrgsApi.prototype.createOrg = function (param, options) {
        return this.api.createOrg(param.createOrgRequest, options).toPromise();
    };
    ObjectOrgsApi.prototype.deleteOrg = function (param, options) {
        return this.api.deleteOrg(param.orgIdentifier, options).toPromise();
    };
    ObjectOrgsApi.prototype.searchOrgs = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchOrgs(param.searchOrgsRequest, options).toPromise();
    };
    ObjectOrgsApi.prototype.updateOrg = function (param, options) {
        return this.api.updateOrg(param.orgIdentifier, param.updateOrgRequest, options).toPromise();
    };
    return ObjectOrgsApi;
}());
exports.ObjectOrgsApi = ObjectOrgsApi;
var ObservableAPI_13 = require("./ObservableAPI");
var ObjectReportsApi = (function () {
    function ObjectReportsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_13.ObservableReportsApi(configuration, requestFactory, responseProcessor);
    }
    ObjectReportsApi.prototype.exportAnswerReport = function (param, options) {
        return this.api.exportAnswerReport(param.exportAnswerReportRequest, options).toPromise();
    };
    ObjectReportsApi.prototype.exportLiveboardReport = function (param, options) {
        return this.api.exportLiveboardReport(param.exportLiveboardReportRequest, options).toPromise();
    };
    return ObjectReportsApi;
}());
exports.ObjectReportsApi = ObjectReportsApi;
var ObservableAPI_14 = require("./ObservableAPI");
var ObjectRolesApi = (function () {
    function ObjectRolesApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_14.ObservableRolesApi(configuration, requestFactory, responseProcessor);
    }
    ObjectRolesApi.prototype.createRole = function (param, options) {
        return this.api.createRole(param.createRoleRequest, options).toPromise();
    };
    ObjectRolesApi.prototype.deleteRole = function (param, options) {
        return this.api.deleteRole(param.roleIdentifier, options).toPromise();
    };
    ObjectRolesApi.prototype.searchRoles = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchRoles(param.searchRolesRequest, options).toPromise();
    };
    ObjectRolesApi.prototype.updateRole = function (param, options) {
        return this.api.updateRole(param.roleIdentifier, param.updateRoleRequest, options).toPromise();
    };
    return ObjectRolesApi;
}());
exports.ObjectRolesApi = ObjectRolesApi;
var ObservableAPI_15 = require("./ObservableAPI");
var ObjectSchedulesApi = (function () {
    function ObjectSchedulesApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_15.ObservableSchedulesApi(configuration, requestFactory, responseProcessor);
    }
    ObjectSchedulesApi.prototype.createSchedule = function (param, options) {
        return this.api.createSchedule(param.createScheduleRequest, options).toPromise();
    };
    ObjectSchedulesApi.prototype.deleteSchedule = function (param, options) {
        return this.api.deleteSchedule(param.scheduleIdentifier, options).toPromise();
    };
    ObjectSchedulesApi.prototype.searchSchedules = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchSchedules(param.searchSchedulesRequest, options).toPromise();
    };
    ObjectSchedulesApi.prototype.updateSchedule = function (param, options) {
        return this.api.updateSchedule(param.scheduleIdentifier, param.updateScheduleRequest, options).toPromise();
    };
    return ObjectSchedulesApi;
}());
exports.ObjectSchedulesApi = ObjectSchedulesApi;
var ObservableAPI_16 = require("./ObservableAPI");
var ObjectSecurityApi = (function () {
    function ObjectSecurityApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_16.ObservableSecurityApi(configuration, requestFactory, responseProcessor);
    }
    ObjectSecurityApi.prototype.assignChangeAuthor = function (param, options) {
        return this.api.assignChangeAuthor(param.assignChangeAuthorRequest, options).toPromise();
    };
    ObjectSecurityApi.prototype.fetchPermissionsOfPrincipals = function (param, options) {
        return this.api.fetchPermissionsOfPrincipals(param.fetchPermissionsOfPrincipalsRequest, options).toPromise();
    };
    ObjectSecurityApi.prototype.fetchPermissionsOnMetadata = function (param, options) {
        return this.api.fetchPermissionsOnMetadata(param.fetchPermissionsOnMetadataRequest, options).toPromise();
    };
    ObjectSecurityApi.prototype.shareMetadata = function (param, options) {
        return this.api.shareMetadata(param.shareMetadataRequest, options).toPromise();
    };
    return ObjectSecurityApi;
}());
exports.ObjectSecurityApi = ObjectSecurityApi;
var ObservableAPI_17 = require("./ObservableAPI");
var ObjectSystemApi = (function () {
    function ObjectSystemApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_17.ObservableSystemApi(configuration, requestFactory, responseProcessor);
    }
    ObjectSystemApi.prototype.getSystemConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemConfig(options).toPromise();
    };
    ObjectSystemApi.prototype.getSystemInformation = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemInformation(options).toPromise();
    };
    ObjectSystemApi.prototype.getSystemOverrideInfo = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemOverrideInfo(options).toPromise();
    };
    ObjectSystemApi.prototype.updateSystemConfig = function (param, options) {
        return this.api.updateSystemConfig(param.updateSystemConfigRequest, options).toPromise();
    };
    return ObjectSystemApi;
}());
exports.ObjectSystemApi = ObjectSystemApi;
var ObservableAPI_18 = require("./ObservableAPI");
var ObjectTagsApi = (function () {
    function ObjectTagsApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_18.ObservableTagsApi(configuration, requestFactory, responseProcessor);
    }
    ObjectTagsApi.prototype.assignTag = function (param, options) {
        return this.api.assignTag(param.assignTagRequest, options).toPromise();
    };
    ObjectTagsApi.prototype.createTag = function (param, options) {
        return this.api.createTag(param.createTagRequest, options).toPromise();
    };
    ObjectTagsApi.prototype.deleteTag = function (param, options) {
        return this.api.deleteTag(param.tagIdentifier, options).toPromise();
    };
    ObjectTagsApi.prototype.searchTags = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchTags(param.searchTagsRequest, options).toPromise();
    };
    ObjectTagsApi.prototype.unassignTag = function (param, options) {
        return this.api.unassignTag(param.assignTagRequest, options).toPromise();
    };
    ObjectTagsApi.prototype.updateTag = function (param, options) {
        return this.api.updateTag(param.tagIdentifier, param.updateTagRequest, options).toPromise();
    };
    return ObjectTagsApi;
}());
exports.ObjectTagsApi = ObjectTagsApi;
var ObservableAPI_19 = require("./ObservableAPI");
var ObjectThoughtSpotRestApi = (function () {
    function ObjectThoughtSpotRestApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_19.ObservableThoughtSpotRestApi(configuration, requestFactory, responseProcessor);
    }
    ObjectThoughtSpotRestApi.prototype.assignChangeAuthor = function (param, options) {
        return this.api.assignChangeAuthor(param.assignChangeAuthorRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.assignTag = function (param, options) {
        return this.api.assignTag(param.assignTagRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.changeUserPassword = function (param, options) {
        return this.api.changeUserPassword(param.changeUserPasswordRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.commitBranch = function (param, options) {
        return this.api.commitBranch(param.commitBranchRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createConfig = function (param, options) {
        return this.api.createConfig(param.createConfigRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createConnection = function (param, options) {
        return this.api.createConnection(param.createConnectionRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createCustomAction = function (param, options) {
        return this.api.createCustomAction(param.createCustomActionRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createOrg = function (param, options) {
        return this.api.createOrg(param.createOrgRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createRole = function (param, options) {
        return this.api.createRole(param.createRoleRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createSchedule = function (param, options) {
        return this.api.createSchedule(param.createScheduleRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createTag = function (param, options) {
        return this.api.createTag(param.createTagRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createUser = function (param, options) {
        return this.api.createUser(param.createUserRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.createUserGroup = function (param, options) {
        return this.api.createUserGroup(param.createUserGroupRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.deleteConfig(param.deleteConfigRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteConnection = function (param, options) {
        return this.api.deleteConnection(param.deleteConnectionRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteCustomAction = function (param, options) {
        return this.api.deleteCustomAction(param.customActionIdentifier, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteMetadata = function (param, options) {
        return this.api.deleteMetadata(param.deleteMetadataRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteOrg = function (param, options) {
        return this.api.deleteOrg(param.orgIdentifier, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteRole = function (param, options) {
        return this.api.deleteRole(param.roleIdentifier, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteSchedule = function (param, options) {
        return this.api.deleteSchedule(param.scheduleIdentifier, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteTag = function (param, options) {
        return this.api.deleteTag(param.tagIdentifier, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteUser = function (param, options) {
        return this.api.deleteUser(param.userIdentifier, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deleteUserGroup = function (param, options) {
        return this.api.deleteUserGroup(param.groupIdentifier, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.deployCommit = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.deployCommit(param.deployCommitRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.exportAnswerReport = function (param, options) {
        return this.api.exportAnswerReport(param.exportAnswerReportRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.exportLiveboardReport = function (param, options) {
        return this.api.exportLiveboardReport(param.exportLiveboardReportRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.exportMetadataTML = function (param, options) {
        return this.api.exportMetadataTML(param.exportMetadataTMLRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.fetchAnswerData = function (param, options) {
        return this.api.fetchAnswerData(param.fetchAnswerDataRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.fetchAnswerSqlQuery = function (param, options) {
        return this.api.fetchAnswerSqlQuery(param.fetchAnswerSqlQueryRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.fetchLiveboardData = function (param, options) {
        return this.api.fetchLiveboardData(param.fetchLiveboardDataRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.fetchLiveboardSqlQuery = function (param, options) {
        return this.api.fetchLiveboardSqlQuery(param.fetchLiveboardSqlQueryRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.fetchLogs = function (param, options) {
        return this.api.fetchLogs(param.fetchLogsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.fetchPermissionsOfPrincipals = function (param, options) {
        return this.api.fetchPermissionsOfPrincipals(param.fetchPermissionsOfPrincipalsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.fetchPermissionsOnMetadata = function (param, options) {
        return this.api.fetchPermissionsOnMetadata(param.fetchPermissionsOnMetadataRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.forceLogoutUsers = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.forceLogoutUsers(param.forceLogoutUsersRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.getCurrentUserInfo = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getCurrentUserInfo(options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.getCurrentUserToken = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getCurrentUserToken(options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.getFullAccessToken = function (param, options) {
        return this.api.getFullAccessToken(param.getFullAccessTokenRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.getObjectAccessToken = function (param, options) {
        return this.api.getObjectAccessToken(param.getObjectAccessTokenRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.getSystemConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemConfig(options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.getSystemInformation = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemInformation(options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.getSystemOverrideInfo = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.getSystemOverrideInfo(options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.importMetadataTML = function (param, options) {
        return this.api.importMetadataTML(param.importMetadataTMLRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.importUserGroups = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.importUserGroups(param.importUserGroupsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.importUsers = function (param, options) {
        return this.api.importUsers(param.importUsersRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.login = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.login(param.loginRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.logout = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.logout(options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.resetUserPassword = function (param, options) {
        return this.api.resetUserPassword(param.resetUserPasswordRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.revertCommit = function (param, options) {
        return this.api.revertCommit(param.commitId, param.revertCommitRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.revokeToken = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.revokeToken(param.revokeTokenRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchCommits = function (param, options) {
        return this.api.searchCommits(param.searchCommitsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchConfig(param.searchConfigRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchConnection = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchConnection(param.searchConnectionRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchCustomActions = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchCustomActions(param.searchCustomActionsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchData = function (param, options) {
        return this.api.searchData(param.searchDataRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchMetadata = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchMetadata(param.searchMetadataRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchOrgs = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchOrgs(param.searchOrgsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchRoles = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchRoles(param.searchRolesRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchSchedules = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchSchedules(param.searchSchedulesRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchTags = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchTags(param.searchTagsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchUserGroups = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchUserGroups(param.searchUserGroupsRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.searchUsers = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchUsers(param.searchUsersRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.shareMetadata = function (param, options) {
        return this.api.shareMetadata(param.shareMetadataRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.unassignTag = function (param, options) {
        return this.api.unassignTag(param.assignTagRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.updateConfig(param.updateConfigRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateConnection = function (param, options) {
        return this.api.updateConnection(param.updateConnectionRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateCustomAction = function (param, options) {
        return this.api.updateCustomAction(param.customActionIdentifier, param.updateCustomActionRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateOrg = function (param, options) {
        return this.api.updateOrg(param.orgIdentifier, param.updateOrgRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateRole = function (param, options) {
        return this.api.updateRole(param.roleIdentifier, param.updateRoleRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateSchedule = function (param, options) {
        return this.api.updateSchedule(param.scheduleIdentifier, param.updateScheduleRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateSystemConfig = function (param, options) {
        return this.api.updateSystemConfig(param.updateSystemConfigRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateTag = function (param, options) {
        return this.api.updateTag(param.tagIdentifier, param.updateTagRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateUser = function (param, options) {
        return this.api.updateUser(param.userIdentifier, param.updateUserRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.updateUserGroup = function (param, options) {
        return this.api.updateUserGroup(param.groupIdentifier, param.updateUserGroupRequest, options).toPromise();
    };
    ObjectThoughtSpotRestApi.prototype.validateMerge = function (param, options) {
        return this.api.validateMerge(param.validateMergeRequest, options).toPromise();
    };
    return ObjectThoughtSpotRestApi;
}());
exports.ObjectThoughtSpotRestApi = ObjectThoughtSpotRestApi;
var ObservableAPI_20 = require("./ObservableAPI");
var ObjectUsersApi = (function () {
    function ObjectUsersApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_20.ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }
    ObjectUsersApi.prototype.changeUserPassword = function (param, options) {
        return this.api.changeUserPassword(param.changeUserPasswordRequest, options).toPromise();
    };
    ObjectUsersApi.prototype.createUser = function (param, options) {
        return this.api.createUser(param.createUserRequest, options).toPromise();
    };
    ObjectUsersApi.prototype.deleteUser = function (param, options) {
        return this.api.deleteUser(param.userIdentifier, options).toPromise();
    };
    ObjectUsersApi.prototype.forceLogoutUsers = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.forceLogoutUsers(param.forceLogoutUsersRequest, options).toPromise();
    };
    ObjectUsersApi.prototype.importUsers = function (param, options) {
        return this.api.importUsers(param.importUsersRequest, options).toPromise();
    };
    ObjectUsersApi.prototype.resetUserPassword = function (param, options) {
        return this.api.resetUserPassword(param.resetUserPasswordRequest, options).toPromise();
    };
    ObjectUsersApi.prototype.searchUsers = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchUsers(param.searchUsersRequest, options).toPromise();
    };
    ObjectUsersApi.prototype.updateUser = function (param, options) {
        return this.api.updateUser(param.userIdentifier, param.updateUserRequest, options).toPromise();
    };
    return ObjectUsersApi;
}());
exports.ObjectUsersApi = ObjectUsersApi;
var ObservableAPI_21 = require("./ObservableAPI");
var ObjectVersionControlApi = (function () {
    function ObjectVersionControlApi(configuration, requestFactory, responseProcessor) {
        this.api = new ObservableAPI_21.ObservableVersionControlApi(configuration, requestFactory, responseProcessor);
    }
    ObjectVersionControlApi.prototype.commitBranch = function (param, options) {
        return this.api.commitBranch(param.commitBranchRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.createConfig = function (param, options) {
        return this.api.createConfig(param.createConfigRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.deleteConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.deleteConfig(param.deleteConfigRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.deployCommit = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.deployCommit(param.deployCommitRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.revertCommit = function (param, options) {
        return this.api.revertCommit(param.commitId, param.revertCommitRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.searchCommits = function (param, options) {
        return this.api.searchCommits(param.searchCommitsRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.searchConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.searchConfig(param.searchConfigRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.updateConfig = function (param, options) {
        if (param === void 0) { param = {}; }
        return this.api.updateConfig(param.updateConfigRequest, options).toPromise();
    };
    ObjectVersionControlApi.prototype.validateMerge = function (param, options) {
        return this.api.validateMerge(param.validateMergeRequest, options).toPromise();
    };
    return ObjectVersionControlApi;
}());
exports.ObjectVersionControlApi = ObjectVersionControlApi;
//# sourceMappingURL=ObjectParamAPI.js.map