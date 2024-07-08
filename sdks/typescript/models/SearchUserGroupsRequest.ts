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

import { SortOptions } from '../models/SortOptions';
import { HttpFile } from '../http/http';

export class SearchUserGroupsRequest {
    /**
    * GUID of Liveboards that are assigned as default Liveboards to the users in the group.
    */
    'default_liveboard_identifiers'?: Array<string>;
    /**
    * Description of the group
    */
    'description'?: string;
    /**
    * Display name of the group
    */
    'display_name'?: string;
    /**
    * A pattern to match case-insensitive name of the Group object.
    */
    'name_pattern'?: string;
    /**
    * GUID or name of the group
    */
    'group_identifier'?: string;
    /**
    * ID or name of the Org to which the group belongs
    */
    'org_identifiers'?: Array<string>;
    /**
    * Privileges assigned to the group.
    */
    'privileges'?: Array<SearchUserGroupsRequestPrivilegesEnum>;
    /**
    * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
    */
    'sub_group_identifiers'?: Array<string>;
    /**
    * Group type.
    */
    'type'?: SearchUserGroupsRequestTypeEnum;
    /**
    * GUID or name of the users assigned to the group.
    */
    'user_identifiers'?: Array<string>;
    /**
    * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
    */
    'visibility'?: SearchUserGroupsRequestVisibilityEnum;
    /**
    * Filter groups with a list of Roles assigned to a group
    */
    'role_identifiers'?: Array<string>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    'sort_options'?: SortOptions;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
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
            "name": "display_name",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "group_identifier",
            "baseName": "group_identifier",
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
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<SearchUserGroupsRequestPrivilegesEnum>",
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
            "type": "SearchUserGroupsRequestTypeEnum",
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
            "type": "SearchUserGroupsRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "role_identifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "SortOptions",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchUserGroupsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchUserGroupsRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE" | "APPLICATION_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" ;
export type SearchUserGroupsRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP" ;
export type SearchUserGroupsRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE" ;

