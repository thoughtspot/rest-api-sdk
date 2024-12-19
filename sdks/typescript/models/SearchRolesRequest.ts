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

export class SearchRolesRequest {
    /**
    * unique ID or name of the Roles
    */
    'role_identifiers'?: Array<string>;
    /**
    * Unique Id or name of the Organisation
    */
    'org_identifiers'?: Array<string>;
    /**
    * Unique Id or name of the User Group
    */
    'group_identifiers'?: Array<string>;
    /**
    * Privileges assigned to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.
    */
    'privileges'?: Array<SearchRolesRequestPrivilegesEnum>;
    /**
    * Indicates whether the Role is deprecated.
    */
    'deprecated'?: boolean | null;
    /**
    * Indicates whether the Role is external
    */
    'external'?: boolean | null;
    /**
    * Indicates whether the Role is shared via connection
    */
    'shared_via_connection'?: boolean | null;
    /**
    * Permission details of the Role
    */
    'permissions'?: Array<SearchRolesRequestPermissionsEnum>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "role_identifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
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
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<SearchRolesRequestPrivilegesEnum>",
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
            "name": "shared_via_connection",
            "baseName": "shared_via_connection",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<SearchRolesRequestPermissionsEnum>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchRolesRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchRolesRequestPrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_CONFIGURE_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CONTROL_TRUSTED_AUTH" | "CAN_CREATE_CATALOG" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL" ;
export type SearchRolesRequestPermissionsEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS" ;

