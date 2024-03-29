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

import { Role } from '../models/Role';
import { UserGroup } from '../models/UserGroup';
import { HttpFile } from '../http/http';

export class UserGroupResponse {
    /**
    * The unique identifier of the object
    */
    'author_id'?: string;
    /**
    * Indicates whether the response has complete detail of the group.
    */
    'complete_detail'?: boolean;
    /**
    * Content details of the group
    */
    'content'?: any;
    /**
    * Creation time of the group in milliseconds
    */
    'creation_time_in_millis'?: number;
    /**
    * Liveboards that are assigned as default Liveboards to the group.
    */
    'default_liveboards'?: Array<UserGroup>;
    /**
    * Indicates whether the group is deleted
    */
    'deleted'?: boolean;
    /**
    * Indicates whether the group is deprecated
    */
    'deprecated'?: boolean;
    /**
    * Description of the group
    */
    'description'?: string;
    /**
    * Display name of the group.
    */
    'display_name': string;
    /**
    * Indicates whether the group is external
    */
    'external'?: boolean;
    /**
    * Generation number of the group
    */
    'generation_number'?: number;
    /**
    * Indicates whether the group is hidden
    */
    'hidden'?: boolean;
    /**
    * The unique identifier of the object
    */
    'id': string;
    /**
    * Index number of the group
    */
    'index'?: number;
    /**
    * Index version number of the group
    */
    'index_version'?: number;
    /**
    * Metadata version number of the group
    */
    'metadata_version'?: number;
    /**
    * Last modified time of the group in milliseconds.
    */
    'modification_time_in_millis'?: number;
    /**
    * The unique identifier of the object
    */
    'modifier_id'?: string;
    /**
    * Name of the group.
    */
    'name': string;
    /**
    * Orgs in which group exists.
    */
    'orgs'?: Array<UserGroup>;
    /**
    * The unique identifier of the object
    */
    'owner_id'?: string;
    /**
    * Parent type of the group.
    */
    'parent_type'?: UserGroupResponseParentTypeEnum;
    /**
    * Privileges which are assigned to the group
    */
    'privileges'?: Array<string>;
    /**
    * Groups who are part of the group
    */
    'sub_groups'?: Array<UserGroup>;
    /**
    * Indicates whether the group is a system group.
    */
    'system_group'?: boolean;
    /**
    * Tags associated with the group.
    */
    'tags'?: Array<UserGroup>;
    /**
    * Type of the group.
    */
    'type'?: UserGroupResponseTypeEnum;
    /**
    * Users who are part of the group.
    */
    'users'?: Array<UserGroup>;
    /**
    * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects.
    */
    'visibility': UserGroupResponseVisibilityEnum;
    /**
    * List of roles assgined to the user
    */
    'roles'?: Array<Role>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "author_id",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "complete_detail",
            "baseName": "complete_detail",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "any",
            "format": ""
        },
        {
            "name": "creation_time_in_millis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "default_liveboards",
            "baseName": "default_liveboards",
            "type": "Array<UserGroup>",
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
            "name": "external",
            "baseName": "external",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "generation_number",
            "baseName": "generation_number",
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
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "index_version",
            "baseName": "index_version",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "metadata_version",
            "baseName": "metadata_version",
            "type": "number",
            "format": "int32"
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
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "orgs",
            "baseName": "orgs",
            "type": "Array<UserGroup>",
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
            "type": "UserGroupResponseParentTypeEnum",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sub_groups",
            "baseName": "sub_groups",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "system_group",
            "baseName": "system_group",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "UserGroupResponseTypeEnum",
            "format": ""
        },
        {
            "name": "users",
            "baseName": "users",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "UserGroupResponseVisibilityEnum",
            "format": ""
        },
        {
            "name": "roles",
            "baseName": "roles",
            "type": "Array<Role>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UserGroupResponse.attributeTypeMap;
    }

    public constructor() {
    }
}


export type UserGroupResponseParentTypeEnum = "USER" | "GROUP" ;
export type UserGroupResponseTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP" ;
export type UserGroupResponseVisibilityEnum = "SHARABLE" | "NON_SHARABLE" ;

