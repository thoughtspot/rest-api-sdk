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
            "name": "defaultLiveboardIdentifiers",
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
            "name": "displayName",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "groupIdentifier",
            "baseName": "group_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "orgIdentifiers",
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
            "name": "subGroupIdentifiers",
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
            "name": "userIdentifiers",
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
            "name": "roleIdentifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "recordOffset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "recordSize",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sortOptions",
            "baseName": "sort_options",
            "type": "SortOptions",
            "format": ""
        }
    ];
    return SearchUserGroupsRequest;
}());
exports.SearchUserGroupsRequest = SearchUserGroupsRequest;
//# sourceMappingURL=SearchUserGroupsRequest.js.map