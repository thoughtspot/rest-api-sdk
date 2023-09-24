"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UserGroupResponse = void 0;
var UserGroupResponse = (function () {
    function UserGroupResponse() {
    }
    UserGroupResponse.getAttributeTypeMap = function () {
        return UserGroupResponse.attributeTypeMap;
    };
    UserGroupResponse.discriminator = undefined;
    UserGroupResponse.attributeTypeMap = [
        {
            "name": "author_id",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "complete_detail",
            "baseName": "complete_detail",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "any",
            "format": ""
        },
        {
            "name": "creation_time_in_millis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "default_liveboards",
            "baseName": "default_liveboards",
            "type": "Array<UserGroup>",
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
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "display_name",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "external",
            "baseName": "external",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "generation_number",
            "baseName": "generation_number",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "hidden",
            "baseName": "hidden",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "index_version",
            "baseName": "index_version",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "metadata_version",
            "baseName": "metadata_version",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "modification_time_in_millis",
            "baseName": "modification_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "modifier_id",
            "baseName": "modifier_id",
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
            "name": "orgs",
            "baseName": "orgs",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "owner_id",
            "baseName": "owner_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "parent_type",
            "baseName": "parent_type",
            "type": "UserGroupResponseParentTypeEnum",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sub_groups",
            "baseName": "sub_groups",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "system_group",
            "baseName": "system_group",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "UserGroupResponseTypeEnum",
            "format": ""
        },
        {
            "name": "users",
            "baseName": "users",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "UserGroupResponseVisibilityEnum",
            "format": ""
        },
        {
            "name": "roles",
            "baseName": "roles",
            "type": "Array<Role>",
            "format": ""
        }
    ];
    return UserGroupResponse;
}());
exports.UserGroupResponse = UserGroupResponse;
//# sourceMappingURL=UserGroupResponse.js.map