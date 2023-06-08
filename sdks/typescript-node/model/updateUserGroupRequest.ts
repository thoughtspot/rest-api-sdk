/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

export class UpdateUserGroupRequest {
    /**
    * Name of the group to modify.
    */
    'name'?: string;
    /**
    * Unique ID of Liveboards to assign as default liveboards to the users in the group.
    */
    'defaultLiveboardIdentifiers'?: Array<string>;
    /**
    * Description for the group.
    */
    'description'?: string;
    /**
    * Display name of the group.
    */
    'displayName'?: string;
    /**
    * Privileges to assign to the group.
    */
    'privileges'?: Array<UpdateUserGroupRequest.PrivilegesEnum>;
    /**
    * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
    */
    'subGroupIdentifiers'?: Array<string>;
    /**
    * Type of the user group.
    */
    'type'?: UpdateUserGroupRequest.TypeEnum;
    /**
    * GUID or name of the users to assign to the group.
    */
    'userIdentifiers'?: Array<string>;
    /**
    * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
    */
    'visibility'?: UpdateUserGroupRequest.VisibilityEnum;
    /**
    * Role identifiers of the roles that should be assigned to the group.
    */
    'roleIdentifiers'?: Array<string>;
    /**
    * Type of update operation. Default operation type is REPLACE
    */
    'operation'?: UpdateUserGroupRequest.OperationEnum = UpdateUserGroupRequest.OperationEnum.Replace;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "defaultLiveboardIdentifiers",
            "baseName": "default_liveboard_identifiers",
            "type": "Array<string>"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "displayName",
            "baseName": "display_name",
            "type": "string"
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<UpdateUserGroupRequest.PrivilegesEnum>"
        },
        {
            "name": "subGroupIdentifiers",
            "baseName": "sub_group_identifiers",
            "type": "Array<string>"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "UpdateUserGroupRequest.TypeEnum"
        },
        {
            "name": "userIdentifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>"
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "UpdateUserGroupRequest.VisibilityEnum"
        },
        {
            "name": "roleIdentifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>"
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateUserGroupRequest.OperationEnum"
        }    ];

    static getAttributeTypeMap() {
        return UpdateUserGroupRequest.attributeTypeMap;
    }
}

export namespace UpdateUserGroupRequest {
    export enum PrivilegesEnum {
        Administration = <any> 'ADMINISTRATION',
        Authoring = <any> 'AUTHORING',
        Userdatauploading = <any> 'USERDATAUPLOADING',
        Datadownloading = <any> 'DATADOWNLOADING',
        Usermanagement = <any> 'USERMANAGEMENT',
        Datamanagement = <any> 'DATAMANAGEMENT',
        Sharewithall = <any> 'SHAREWITHALL',
        Jobscheduling = <any> 'JOBSCHEDULING',
        A3Analysis = <any> 'A3ANALYSIS',
        Experimentalfeatureprivilege = <any> 'EXPERIMENTALFEATUREPRIVILEGE',
        Bypassrls = <any> 'BYPASSRLS',
        Ranalysis = <any> 'RANALYSIS',
        Developer = <any> 'DEVELOPER',
        UserAdministration = <any> 'USER_ADMINISTRATION',
        GroupAdministration = <any> 'GROUP_ADMINISTRATION',
        Syncmanagement = <any> 'SYNCMANAGEMENT',
        CanCreateCatalog = <any> 'CAN_CREATE_CATALOG',
        DisablePinboardCreation = <any> 'DISABLE_PINBOARD_CREATION',
        Enablespotappcreation = <any> 'ENABLESPOTAPPCREATION',
        LiveboardVerifier = <any> 'LIVEBOARD_VERIFIER',
        PreviewThoughtspotSage = <any> 'PREVIEW_THOUGHTSPOT_SAGE'
    }
    export enum TypeEnum {
        LocalGroup = <any> 'LOCAL_GROUP',
        LdapGroup = <any> 'LDAP_GROUP'
    }
    export enum VisibilityEnum {
        Sharable = <any> 'SHARABLE',
        NonSharable = <any> 'NON_SHARABLE'
    }
    export enum OperationEnum {
        Add = <any> 'ADD',
        Remove = <any> 'REMOVE',
        Replace = <any> 'REPLACE'
    }
}
