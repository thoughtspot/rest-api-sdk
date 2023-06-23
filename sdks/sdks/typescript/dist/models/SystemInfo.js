"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SystemInfo = void 0;
var SystemInfo = (function () {
    function SystemInfo() {
    }
    SystemInfo.getAttributeTypeMap = function () {
        return SystemInfo.attributeTypeMap;
    };
    SystemInfo.discriminator = undefined;
    SystemInfo.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "releaseVersion",
            "baseName": "release_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "timeZone",
            "baseName": "time_zone",
            "type": "string",
            "format": ""
        },
        {
            "name": "locale",
            "baseName": "locale",
            "type": "string",
            "format": ""
        },
        {
            "name": "dateFormat",
            "baseName": "date_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "apiVersion",
            "baseName": "api_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "environment",
            "baseName": "environment",
            "type": "string",
            "format": ""
        },
        {
            "name": "license",
            "baseName": "license",
            "type": "string",
            "format": ""
        },
        {
            "name": "dateTimeFormat",
            "baseName": "date_time_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "timeFormat",
            "baseName": "time_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "systemUserId",
            "baseName": "system_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "superUserId",
            "baseName": "super_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "hiddenObjectId",
            "baseName": "hidden_object_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "systemGroupId",
            "baseName": "system_group_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tsadminUserId",
            "baseName": "tsadmin_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "adminGroupId",
            "baseName": "admin_group_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "allTablesConnectionId",
            "baseName": "all_tables_connection_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "allUserGroupId",
            "baseName": "all_user_group_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "acceptLanguage",
            "baseName": "accept_language",
            "type": "string",
            "format": ""
        },
        {
            "name": "allUserGroupMemberUserCount",
            "baseName": "all_user_group_member_user_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "logicalModelVersion",
            "baseName": "logical_model_version",
            "type": "number",
            "format": "int32"
        }
    ];
    return SystemInfo;
}());
exports.SystemInfo = SystemInfo;
//# sourceMappingURL=SystemInfo.js.map