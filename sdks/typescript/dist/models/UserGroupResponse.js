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
            "name": "authorId",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "completeDetail",
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
            "name": "creationTimeInMillis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "defaultLiveboards",
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
            "name": "displayName",
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
            "name": "generationNumber",
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
            "name": "indexVersion",
            "baseName": "index_version",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "metadataVersion",
            "baseName": "metadata_version",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "modificationTimeInMillis",
            "baseName": "modification_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "modifierId",
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
            "name": "ownerId",
            "baseName": "owner_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "parentType",
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
            "name": "subGroups",
            "baseName": "sub_groups",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "systemGroup",
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