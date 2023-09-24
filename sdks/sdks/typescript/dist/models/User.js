"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.User = void 0;
var User = (function () {
    function User() {
    }
    User.getAttributeTypeMap = function () {
        return User.attributeTypeMap;
    };
    User.discriminator = undefined;
    User.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
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
            "type": "UserVisibilityEnum",
            "format": ""
        },
        {
            "name": "author_id",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "can_change_password",
            "baseName": "can_change_password",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "complete_detail",
            "baseName": "complete_detail",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "creation_time_in_millis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "current_org",
            "baseName": "current_org",
            "type": "Org",
            "format": ""
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "deprecated",
            "baseName": "deprecated",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "account_type",
            "baseName": "account_type",
            "type": "UserAccountTypeEnum",
            "format": ""
        },
        {
            "name": "account_status",
            "baseName": "account_status",
            "type": "UserAccountStatusEnum",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "expiration_time_in_millis",
            "baseName": "expiration_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "external",
            "baseName": "external",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "favorite_metadata",
            "baseName": "favorite_metadata",
            "type": "Array<FavoriteMetadataItem>",
            "format": ""
        },
        {
            "name": "first_login_time_in_millis",
            "baseName": "first_login_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "group_mask",
            "baseName": "group_mask",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "hidden",
            "baseName": "hidden",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "home_liveboard",
            "baseName": "home_liveboard",
            "type": "ObjectIDAndName",
            "format": ""
        },
        {
            "name": "incomplete_details",
            "baseName": "incomplete_details",
            "type": "any",
            "format": ""
        },
        {
            "name": "is_first_login",
            "baseName": "is_first_login",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "modification_time_in_millis",
            "baseName": "modification_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "modifier_id",
            "baseName": "modifier_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "notify_on_share",
            "baseName": "notify_on_share",
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
            "name": "orgs",
            "baseName": "orgs",
            "type": "Array<Org>",
            "format": ""
        },
        {
            "name": "owner_id",
            "baseName": "owner_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "parent_type",
            "baseName": "parent_type",
            "type": "UserParentTypeEnum",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "show_onboarding_experience",
            "baseName": "show_onboarding_experience",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "super_user",
            "baseName": "super_user",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "system_user",
            "baseName": "system_user",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<ObjectIDAndName>",
            "format": ""
        },
        {
            "name": "tenant_id",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "user_groups",
            "baseName": "user_groups",
            "type": "Array<ObjectIDAndName>",
            "format": ""
        },
        {
            "name": "user_inherited_groups",
            "baseName": "user_inherited_groups",
            "type": "Array<ObjectIDAndName>",
            "format": ""
        },
        {
            "name": "welcome_email_sent",
            "baseName": "welcome_email_sent",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "org_privileges",
            "baseName": "org_privileges",
            "type": "any",
            "format": ""
        },
        {
            "name": "preferred_locale",
            "baseName": "preferred_locale",
            "type": "string",
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
    return User;
}());
exports.User = User;
//# sourceMappingURL=User.js.map