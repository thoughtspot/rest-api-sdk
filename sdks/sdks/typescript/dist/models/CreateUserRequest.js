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
            "name": "displayName",
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
            "name": "accountType",
            "baseName": "account_type",
            "type": "CreateUserRequestAccountTypeEnum",
            "format": ""
        },
        {
            "name": "accountStatus",
            "baseName": "account_status",
            "type": "CreateUserRequestAccountStatusEnum",
            "format": ""
        },
        {
            "name": "orgIdentifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "groupIdentifiers",
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
        }
    ];
    return CreateUserRequest;
}());
exports.CreateUserRequest = CreateUserRequest;
//# sourceMappingURL=CreateUserRequest.js.map