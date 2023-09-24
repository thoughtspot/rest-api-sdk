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
            "name": "release_version",
            "baseName": "release_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "time_zone",
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
            "name": "date_format",
            "baseName": "date_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "api_version",
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
            "name": "date_time_format",
            "baseName": "date_time_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "time_format",
            "baseName": "time_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "system_user_id",
            "baseName": "system_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "super_user_id",
            "baseName": "super_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "hidden_object_id",
            "baseName": "hidden_object_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "system_group_id",
            "baseName": "system_group_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tsadmin_user_id",
            "baseName": "tsadmin_user_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "admin_group_id",
            "baseName": "admin_group_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "all_tables_connection_id",
            "baseName": "all_tables_connection_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "all_user_group_id",
            "baseName": "all_user_group_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "accept_language",
            "baseName": "accept_language",
            "type": "string",
            "format": ""
        },
        {
            "name": "all_user_group_member_user_count",
            "baseName": "all_user_group_member_user_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "logical_model_version",
            "baseName": "logical_model_version",
            "type": "number",
            "format": "int32"
        }
    ];
    return SystemInfo;
}());
exports.SystemInfo = SystemInfo;
//# sourceMappingURL=SystemInfo.js.map