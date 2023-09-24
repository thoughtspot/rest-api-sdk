"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateUserRequest = void 0;
var CreateUserRequest = (function () {
    function CreateUserRequest() {
    }
    CreateUserRequest.getAttributeTypeMap = function () {
        return CreateUserRequest.attributeTypeMap;
    };
    CreateUserRequest.discriminator = undefined;
    CreateUserRequest.attributeTypeMap = [
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
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "account_type",
            "baseName": "account_type",
            "type": "CreateUserRequestAccountTypeEnum",
            "format": ""
        },
        {
            "name": "account_status",
            "baseName": "account_status",
            "type": "CreateUserRequestAccountStatusEnum",
            "format": ""
        },
        {
            "name": "org_identifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "CreateUserRequestVisibilityEnum",
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
            "name": "preferred_locale",
            "baseName": "preferred_locale",
            "type": "CreateUserRequestPreferredLocaleEnum",
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
        },
        {
            "name": "trigger_welcome_email",
            "baseName": "trigger_welcome_email",
            "type": "boolean",
            "format": ""
        }
    ];
    return CreateUserRequest;
}());
exports.CreateUserRequest = CreateUserRequest;
//# sourceMappingURL=CreateUserRequest.js.map