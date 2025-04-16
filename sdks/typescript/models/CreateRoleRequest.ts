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

export class CreateRoleRequest {
    /**
    * Unique name of the Role.
    */
    'name': string;
    /**
    * Description of the Role.
    */
    'description'?: string;
    /**
    * Privileges granted to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.
    */
    'privileges'?: Array<CreateRoleRequestPrivilegesEnum>;
    /**
    * <div>Version: 10.5.0.cl or later </div>  Indicates whether the role is read only. A readonly role can neither be updated nor deleted.
    */
    'read_only'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
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
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<CreateRoleRequestPrivilegesEnum>",
            "format": ""
        },
        {
            "name": "read_only",
            "baseName": "read_only",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateRoleRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type CreateRoleRequestPrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CONTROL_TRUSTED_AUTH" | "TAGMANAGEMENT" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CAN_CREATE_CATALOG" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL" | "PREVIEW_THOUGHTSPOT_SAGE" ;

