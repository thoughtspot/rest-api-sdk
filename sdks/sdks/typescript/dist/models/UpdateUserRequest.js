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
            "name": "displayName",
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
            "name": "accountStatus",
            "baseName": "account_status",
            "type": "UpdateUserRequestAccountStatusEnum",
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
            "name": "accountType",
            "baseName": "account_type",
            "type": "UpdateUserRequestAccountTypeEnum",
            "format": ""
        },
        {
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
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
            "name": "orgIdentifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateUserRequestOperationEnum",
            "format": ""
        }
    ];
    return UpdateUserRequest;
}());
exports.UpdateUserRequest = UpdateUserRequest;
//# sourceMappingURL=UpdateUserRequest.js.map