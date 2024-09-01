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

import { GenericInfo } from '../models/GenericInfo';
import { HttpFile } from '../http/http';

/**
* Response for search role api should handle hidden privileges as well.
*/
export class SearchRoleResponse {
    /**
    * Unique Id of the role.
    */
    'id': string;
    /**
    * Name of the role
    */
    'name': string;
    /**
    * Description of the role
    */
    'description': string;
    /**
    * number of groups assigned with this role
    */
    'groups_assigned_count'?: number;
    /**
    * Orgs in which role exists.
    */
    'orgs'?: Array<GenericInfo>;
    /**
    * Details of groups assigned with this role
    */
    'groups'?: Array<GenericInfo>;
    /**
    * Privileges granted to the role.
    */
    'privileges': Array<SearchRoleResponsePrivilegesEnum>;
    /**
    * Permission details of the Role
    */
    'permission'?: SearchRoleResponsePermissionEnum;
    /**
    * Unique identifier of author of the role.
    */
    'author_id'?: string;
    /**
    * Unique identifier of modifier of the role.
    */
    'modifier_id'?: string;
    /**
    * Creation time of the role in milliseconds.
    */
    'creation_time_in_millis'?: any;
    /**
    * Last modified time of the role in milliseconds.
    */
    'modification_time_in_millis'?: any;
    /**
    * Indicates whether the role is deleted.
    */
    'deleted'?: boolean;
    /**
    * Indicates whether the role is deprecated.
    */
    'deprecated'?: boolean;
    /**
    * Indicates whether the role is external.
    */
    'external'?: boolean;
    /**
    * Indicates whether the role is hidden.
    */
    'hidden'?: boolean;
    /**
    * Indicates whether the role is shared via connection
    */
    'shared_via_connection'?: boolean;

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
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "groups_assigned_count",
            "baseName": "groups_assigned_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "orgs",
            "baseName": "orgs",
            "type": "Array<GenericInfo>",
            "format": ""
        },
        {
            "name": "groups",
            "baseName": "groups",
            "type": "Array<GenericInfo>",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<SearchRoleResponsePrivilegesEnum>",
            "format": ""
        },
        {
            "name": "permission",
            "baseName": "permission",
            "type": "SearchRoleResponsePermissionEnum",
            "format": ""
        },
        {
            "name": "author_id",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "modifier_id",
            "baseName": "modifier_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "creation_time_in_millis",
            "baseName": "creation_time_in_millis",
            "type": "any",
            "format": ""
        },
        {
            "name": "modification_time_in_millis",
            "baseName": "modification_time_in_millis",
            "type": "any",
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
            "name": "external",
            "baseName": "external",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "hidden",
            "baseName": "hidden",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "shared_via_connection",
            "baseName": "shared_via_connection",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchRoleResponse.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchRoleResponsePrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_CONFIGURE_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CONTROL_TRUSTED_AUTH" | "CAN_CREATE_CATALOG" ;
export type SearchRoleResponsePermissionEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS" ;

