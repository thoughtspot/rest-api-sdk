"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImportUser = void 0;
var ImportUser = (function () {
    function ImportUser() {
    }
    ImportUser.getAttributeTypeMap = function () {
        return ImportUser.attributeTypeMap;
    };
    ImportUser.discriminator = undefined;
    ImportUser.attributeTypeMap = [
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
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "accountType",
            "baseName": "account_type",
            "type": "ImportUserAccountTypeEnum",
            "format": ""
        },
        {
            "name": "accountStatus",
            "baseName": "account_status",
            "type": "ImportUserAccountStatusEnum",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
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
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "ImportUserVisibilityEnum",
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
    return ImportUser;
}());
exports.ImportUser = ImportUser;
//# sourceMappingURL=ImportUser.js.map