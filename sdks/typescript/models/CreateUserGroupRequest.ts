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

import { HttpFile } from '../http/http';

export class CreateUserGroupRequest {
    /**
    * Name of the group. The group name must be unique.
    */
    'name': string;
    /**
    * Display name for the group.
    */
    'display_name': string;
    /**
    * GUID of the Liveboards to assign as default Liveboards to the users in the group.
    */
    'default_liveboard_identifiers'?: Array<string>;
    /**
    * Description of the group
    */
    'description'?: string;
    /**
    * Privileges to assign to the group
    */
    'privileges'?: Array<CreateUserGroupRequestPrivilegesEnum>;
    /**
    * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
    */
    'sub_group_identifiers'?: Array<string>;
    /**
    * Group type.
    */
    'type'?: CreateUserGroupRequestTypeEnum;
    /**
    * GUID or name of the users to assign to the group.
    */
    'user_identifiers'?: Array<string>;
    /**
    * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
    */
    'visibility'?: CreateUserGroupRequestVisibilityEnum;
    /**
    * Role identifiers of the roles that should be assigned to the group.
    */
    'role_identifiers'?: Array<string>;

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
            "name": "default_liveboard_identifiers",
            "baseName": "default_liveboard_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<CreateUserGroupRequestPrivilegesEnum>",
            "format": ""
        },
        {
            "name": "sub_group_identifiers",
            "baseName": "sub_group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "CreateUserGroupRequestTypeEnum",
            "format": ""
        },
        {
            "name": "user_identifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "CreateUserGroupRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "role_identifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateUserGroupRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type CreateUserGroupRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL" ;
export type CreateUserGroupRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP" ;
export type CreateUserGroupRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE" ;

