"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateUserRequest = void 0;
var UpdateUserRequest = (function () {
    function UpdateUserRequest() {
    }
    UpdateUserRequest.getAttributeTypeMap = function () {
        return UpdateUserRequest.attributeTypeMap;
    };
    UpdateUserRequest.discriminator = undefined;
    UpdateUserRequest.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
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
            "name": "visibility",
            "baseName": "visibility",
            "type": "UpdateUserRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "account_status",
            "baseName": "account_status",
            "type": "UpdateUserRequestAccountStatusEnum",
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
            "name": "account_type",
            "baseName": "account_type",
            "type": "UpdateUserRequestAccountTypeEnum",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
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
            "name": "org_identifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateUserRequestOperationEnum",
            "format": ""
        },
        {
            "name": "preferred_locale",
            "baseName": "preferred_locale",
            "type": "UpdateUserRequestPreferredLocaleEnum",
            "format": ""
        },
        {
            "name": "extended_properties",
            "baseName": "extended_properties",
            "type": "any",
            "format": ""
        },
        {
            "name": "extended_preferences",
            "baseName": "extended_preferences",
            "type": "any",
            "format": ""
        }
    ];
    return UpdateUserRequest;
}());
exports.UpdateUserRequest = UpdateUserRequest;
//# sourceMappingURL=UpdateUserRequest.js.map