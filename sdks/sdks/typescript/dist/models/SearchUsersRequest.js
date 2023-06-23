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
            "name": "userIdentifier",
            "baseName": "user_identifier",
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
            "name": "groupIdentifiers",
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
            "name": "accountType",
            "baseName": "account_type",
            "type": "SearchUsersRequestAccountTypeEnum",
            "format": ""
        },
        {
            "name": "accountStatus",
            "baseName": "account_status",
            "type": "SearchUsersRequestAccountStatusEnum",
            "format": ""
        },
        {
            "name": "notifyOnShare",
            "baseName": "notify_on_share",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "showOnboardingExperience",
            "baseName": "show_onboarding_experience",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "onboardingExperienceCompleted",
            "baseName": "onboarding_experience_completed",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "orgIdentifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "homeLiveboardIdentifier",
            "baseName": "home_liveboard_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "favoriteMetadata",
            "baseName": "favorite_metadata",
            "type": "Array<FavoriteMetadataInput>",
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
        },
        {
            "name": "roleIdentifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "includeFavoriteMetadata",
            "baseName": "include_favorite_metadata",
            "type": "boolean",
            "format": ""
        }
    ];
    return SearchUsersRequest;
}());
exports.SearchUsersRequest = SearchUsersRequest;
//# sourceMappingURL=SearchUsersRequest.js.map