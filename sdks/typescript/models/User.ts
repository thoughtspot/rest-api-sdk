/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { FavoriteMetadataItem } from '../models/FavoriteMetadataItem';
import { ObjectIDAndName } from '../models/ObjectIDAndName';
import { Org } from '../models/Org';
import { HttpFile } from '../http/http';

export class User {
    /**
    * Unique identifier of the user.
    */
    'id': string;
    /**
    * Name of the user.
    */
    'name': string;
    /**
    * Display name of the user.
    */
    'display_name': string;
    /**
    * Visibility of the users. The `SHARABLE` property makes a user visible to other users and group, who can share objects with the user.
    */
    'visibility': UserVisibilityEnum;
    /**
    * Unique identifier of author of the user.
    */
    'author_id'?: string;
    /**
    * Defines whether the user can change their password.
    */
    'can_change_password'?: boolean;
    /**
    * Defines whether the response has complete detail of the user.
    */
    'complete_detail'?: boolean;
    /**
    * Creation time of the user in milliseconds.
    */
    'creation_time_in_millis'?: number;
    'current_org'?: Org;
    /**
    * Indicates whether the user is deleted.
    */
    'deleted'?: boolean;
    /**
    * Indicates whether the user is deprecated.
    */
    'deprecated'?: boolean;
    /**
    * Type of the user account.
    */
    'account_type'?: UserAccountTypeEnum;
    /**
    * Status of the user account.
    */
    'account_status'?: UserAccountStatusEnum;
    /**
    * Email of the user.
    */
    'email'?: string;
    /**
    * Expiration time of the user in milliseconds.
    */
    'expiration_time_in_millis'?: number;
    /**
    * Indicates whether the user is external.
    */
    'external'?: boolean;
    /**
    * Metadata objects to add to the users\' favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataItem>;
    /**
    * Timestamp of the first login session of the user in milliseconds.
    */
    'first_login_time_in_millis'?: number;
    /**
    * Group mask of the user.
    */
    'group_mask'?: number;
    /**
    * Indicates whether the user is hidden.
    */
    'hidden'?: boolean;
    'home_liveboard'?: ObjectIDAndName;
    /**
    * Incomplete details of user if any present.
    */
    'incomplete_details'?: any;
    /**
    * Indicates whether it is first login of the user.
    */
    'is_first_login'?: boolean;
    /**
    * Last modified time of the user in milliseconds.
    */
    'modification_time_in_millis'?: number;
    /**
    * Unique identifier of modifier of the user.
    */
    'modifier_id'?: string;
    /**
    * User preference for receiving email notifications on shared Answers or Liveboard.
    */
    'notify_on_share'?: boolean;
    /**
    * The user preference for turning off the onboarding experience.
    */
    'onboarding_experience_completed'?: boolean;
    /**
    * Orgs to which the user belongs.
    */
    'orgs'?: Array<Org>;
    /**
    * Unique identifier of owner of the user.
    */
    'owner_id'?: string;
    /**
    * Parent type of the user.
    */
    'parent_type'?: UserParentTypeEnum;
    /**
    * Privileges which are assigned to the user.
    */
    'privileges'?: Array<string>;
    /**
    * User\'s preference to revisit the new user onboarding experience.
    */
    'show_onboarding_experience'?: boolean;
    /**
    * Indicates whether the user is a super user.
    */
    'super_user'?: boolean;
    /**
    * Indicates whether the user is a system user.
    */
    'system_user'?: boolean;
    /**
    * Tags associated with the user.
    */
    'tags'?: Array<ObjectIDAndName>;
    /**
    * Unique identifier of tenant of the user.
    */
    'tenant_id'?: string;
    /**
    * Groups to which the user is assigned.
    */
    'user_groups'?: Array<ObjectIDAndName>;
    /**
    * Inherited User Groups which the user is part of.
    */
    'user_inherited_groups'?: Array<ObjectIDAndName>;
    /**
    * Indicates whether welcome email is sent for the user.
    */
    'welcome_email_sent'?: boolean;
    /**
    * Privileges which are assigned to the user with org.
    */
    'org_privileges'?: any;
    /**
    * Locale for the user.
    */
    'preferred_locale'?: string;
    /**
    * Properties for the user
    */
    'extended_properties'?: any;
    /**
    * Preferences for the user
    */
    'extended_preferences'?: any;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
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
        }    ];

    static getAttributeTypeMap() {
        return User.attributeTypeMap;
    }

    public constructor() {
    }
}


export type UserVisibilityEnum = "SHARABLE" | "NON_SHARABLE" ;
export type UserAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER" ;
export type UserAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" ;
export type UserParentTypeEnum = "USER" | "GROUP" ;
