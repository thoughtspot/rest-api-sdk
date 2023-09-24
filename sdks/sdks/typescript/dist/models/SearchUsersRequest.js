"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchUsersRequest = void 0;
var SearchUsersRequest = (function () {
    function SearchUsersRequest() {
    }
    SearchUsersRequest.getAttributeTypeMap = function () {
        return SearchUsersRequest.attributeTypeMap;
    };
    SearchUsersRequest.discriminator = undefined;
    SearchUsersRequest.attributeTypeMap = [
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
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
            "name": "visibility",
            "baseName": "visibility",
            "type": "SearchUsersRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<SearchUsersRequestPrivilegesEnum>",
            "format": ""
        },
        {
            "name": "account_type",
            "baseName": "account_type",
            "type": "SearchUsersRequestAccountTypeEnum",
            "format": ""
        },
        {
            "name": "account_status",
            "baseName": "account_status",
            "type": "SearchUsersRequestAccountStatusEnum",
            "format": ""
        },
        {
            "name": "notify_on_share",
            "baseName": "notify_on_share",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "show_onboarding_experience",
            "baseName": "show_onboarding_experience",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "onboarding_experience_completed",
            "baseName": "onboarding_experience_completed",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "org_identifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "home_liveboard_identifier",
            "baseName": "home_liveboard_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "favorite_metadata",
            "baseName": "favorite_metadata",
            "type": "Array<FavoriteMetadataInput>",
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
        },
        {
            "name": "role_identifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "include_favorite_metadata",
            "baseName": "include_favorite_metadata",
            "type": "boolean",
            "format": ""
        }
    ];
    return SearchUsersRequest;
}());
exports.SearchUsersRequest = SearchUsersRequest;
//# sourceMappingURL=SearchUsersRequest.js.map