"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchUserGroupsRequest = void 0;
var SearchUserGroupsRequest = (function () {
    function SearchUserGroupsRequest() {
    }
    SearchUserGroupsRequest.getAttributeTypeMap = function () {
        return SearchUserGroupsRequest.attributeTypeMap;
    };
    SearchUserGroupsRequest.discriminator = undefined;
    SearchUserGroupsRequest.attributeTypeMap = [
        {
            "name": "default_liveboard_identifiers",
            "baseName": "default_liveboard_identifiers",
            "type": "Array<string>",
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
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "group_identifier",
            "baseName": "group_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "org_identifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<SearchUserGroupsRequestPrivilegesEnum>",
            "format": ""
        },
        {
            "name": "sub_group_identifiers",
            "baseName": "sub_group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "SearchUserGroupsRequestTypeEnum",
            "format": ""
        },
        {
            "name": "user_identifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "SearchUserGroupsRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "role_identifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "SortOptions",
            "format": ""
        }
    ];
    return SearchUserGroupsRequest;
}());
exports.SearchUserGroupsRequest = SearchUserGroupsRequest;
//# sourceMappingURL=SearchUserGroupsRequest.js.map