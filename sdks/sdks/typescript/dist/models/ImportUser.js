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
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "account_type",
            "baseName": "account_type",
            "type": "ImportUserAccountTypeEnum",
            "format": ""
        },
        {
            "name": "account_status",
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
            "type": "ImportUserVisibilityEnum",
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
        }
    ];
    return ImportUser;
}());
exports.ImportUser = ImportUser;
//# sourceMappingURL=ImportUser.js.map