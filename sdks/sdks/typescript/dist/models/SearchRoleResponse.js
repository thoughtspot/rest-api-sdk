"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchRoleResponse = void 0;
var SearchRoleResponse = (function () {
    function SearchRoleResponse() {
    }
    SearchRoleResponse.getAttributeTypeMap = function () {
        return SearchRoleResponse.attributeTypeMap;
    };
    SearchRoleResponse.discriminator = undefined;
    SearchRoleResponse.attributeTypeMap = [
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
            "name": "groups_assigned_count",
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
            "type": "Array<SearchRoleResponsePrivilegesEnum>",
            "format": ""
        },
        {
            "name": "permission",
            "baseName": "permission",
            "type": "SearchRoleResponsePermissionEnum",
            "format": ""
        },
        {
            "name": "author_id",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "modifier_id",
            "baseName": "modifier_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "creation_time_in_millis",
            "baseName": "creation_time_in_millis",
            "type": "any",
            "format": ""
        },
        {
            "name": "modification_time_in_millis",
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
            "name": "shared_via_connection",
            "baseName": "shared_via_connection",
            "type": "boolean",
            "format": ""
        }
    ];
    return SearchRoleResponse;
}());
exports.SearchRoleResponse = SearchRoleResponse;
//# sourceMappingURL=SearchRoleResponse.js.map