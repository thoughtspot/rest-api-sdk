"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RoleResponse = void 0;
var RoleResponse = (function () {
    function RoleResponse() {
    }
    RoleResponse.getAttributeTypeMap = function () {
        return RoleResponse.attributeTypeMap;
    };
    RoleResponse.discriminator = undefined;
    RoleResponse.attributeTypeMap = [
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
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "groupsAssignedCount",
            "baseName": "groups_assigned_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "orgs",
            "baseName": "orgs",
            "type": "Array<GenericInfo>",
            "format": ""
        },
        {
            "name": "groups",
            "baseName": "groups",
            "type": "Array<GenericInfo>",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<RoleResponsePrivilegesEnum>",
            "format": ""
        },
        {
            "name": "permission",
            "baseName": "permission",
            "type": "RoleResponsePermissionEnum",
            "format": ""
        },
        {
            "name": "authorId",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "modifierId",
            "baseName": "modifier_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "creationTimeInMillis",
            "baseName": "creation_time_in_millis",
            "type": "any",
            "format": ""
        },
        {
            "name": "modificationTimeInMillis",
            "baseName": "modification_time_in_millis",
            "type": "any",
            "format": ""
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "deprecated",
            "baseName": "deprecated",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "external",
            "baseName": "external",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "hidden",
            "baseName": "hidden",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "sharedViaConnection",
            "baseName": "shared_via_connection",
            "type": "boolean",
            "format": ""
        }
    ];
    return RoleResponse;
}());
exports.RoleResponse = RoleResponse;
//# sourceMappingURL=RoleResponse.js.map