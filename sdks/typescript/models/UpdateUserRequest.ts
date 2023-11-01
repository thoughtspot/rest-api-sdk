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

import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
import { HttpFile } from '../http/http';

export class UpdateUserRequest {
    /**
    * Name of the user. The username string must be unique.
    */
    'name'?: string;
    /**
    * A unique display name string for the user account, usually their first and last name
    */
    'display_name'?: string;
    /**
    * Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object.
    */
    'visibility'?: UpdateUserRequestVisibilityEnum;
    /**
    * Email of the user account
    */
    'email'?: string;
    /**
    * Current status of the user account.
    */
    'account_status'?: UpdateUserRequestAccountStatusEnum;
    /**
    * User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
    */
    'notify_on_share'?: boolean | null;
    /**
    * The user preference for revisiting the onboarding experience.
    */
    'show_onboarding_experience'?: boolean | null;
    /**
    * Indicates if the user has completed the onboarding and allows turning off the onboarding walkthrough.
    */
    'onboarding_experience_completed'?: boolean | null;
    /**
    * Type of the account.
    */
    'account_type'?: UpdateUserRequestAccountTypeEnum;
    /**
    * GUIDs or names of the groups.
    */
    'group_identifiers'?: Array<string>;
    /**
    * GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in.
    */
    'home_liveboard_identifier'?: string;
    /**
    * Metadata objects to add to the user\'s favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    /**
    * IDs of the Orgs.
    */
    'org_identifiers'?: Array<string>;
    /**
    * Type of update operation. Default operation type is REPLACE
    */
    'operation'?: UpdateUserRequestOperationEnum;
    /**
    * Locale for the user.
    */
    'preferred_locale'?: UpdateUserRequestPreferredLocaleEnum;
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
        }    ];

    static getAttributeTypeMap() {
        return UpdateUserRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type UpdateUserRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE" ;
export type UpdateUserRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" ;
export type UpdateUserRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER" ;
export type UpdateUserRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE" ;
export type UpdateUserRequestPreferredLocaleEnum = "en-CA" | "en-GB" | "en-US" | "de-DE" | "ja-JP" | "zh-CN" | "pt-BR" | "fr-FR" | "fr-CA" | "es-US" | "da-DK" | "es-ES" | "fi-FI" | "sv-SE" | "nb-NO" | "pt-PT" | "nl-NL" | "it-IT" | "ru-RU" | "en-IN" ;
