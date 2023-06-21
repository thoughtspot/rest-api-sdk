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
            "name": "displayName",
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
            "name": "authorId",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "canChangePassword",
            "baseName": "can_change_password",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "completeDetail",
            "baseName": "complete_detail",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "creationTimeInMillis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "currentOrg",
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
            "name": "accountType",
            "baseName": "account_type",
            "type": "UserAccountTypeEnum",
            "format": ""
        },
        {
            "name": "accountStatus",
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
            "name": "expirationTimeInMillis",
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
            "name": "favoriteMetadata",
            "baseName": "favorite_metadata",
            "type": "Array<FavoriteMetadataItem>",
            "format": ""
        },
        {
            "name": "firstLoginTimeInMillis",
            "baseName": "first_login_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "groupMask",
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
            "name": "homeLiveboard",
            "baseName": "home_liveboard",
            "type": "ObjectIDAndName",
            "format": ""
        },
        {
            "name": "incompleteDetails",
            "baseName": "incomplete_details",
            "type": "any",
            "format": ""
        },
        {
            "name": "isFirstLogin",
            "baseName": "is_first_login",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "modificationTimeInMillis",
            "baseName": "modification_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "modifierId",
            "baseName": "modifier_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "notifyOnShare",
            "baseName": "notify_on_share",
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
            "name": "orgs",
            "baseName": "orgs",
            "type": "Array<Org>",
            "format": ""
        },
        {
            "name": "ownerId",
            "baseName": "owner_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "parentType",
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
            "name": "showOnboardingExperience",
            "baseName": "show_onboarding_experience",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "superUser",
            "baseName": "super_user",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "systemUser",
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
            "name": "tenantId",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "userGroups",
            "baseName": "user_groups",
            "type": "Array<ObjectIDAndName>",
            "format": ""
        },
        {
            "name": "userInheritedGroups",
            "baseName": "user_inherited_groups",
            "type": "Array<ObjectIDAndName>",
            "format": ""
        },
        {
            "name": "welcomeEmailSent",
            "baseName": "welcome_email_sent",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "orgPrivileges",
            "baseName": "org_privileges",
            "type": "any",
            "format": ""
        }
    ];
    return User;
}());
exports.User = User;
//# sourceMappingURL=User.js.map