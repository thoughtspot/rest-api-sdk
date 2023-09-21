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

import { UserGroup } from '../models/UserGroup';
import { HttpFile } from '../http/http';

export class ImportUserGroupsResponse {
    /**
    * The groups which are added into the system.
    */
    'groups_added': Array<UserGroup>;
    /**
    * The groups which are deleted from the system.
    */
    'groups_deleted': Array<UserGroup>;
    /**
    * The groups which are updated in the system.
    */
    'groups_updated': Array<UserGroup>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "groups_added",
            "baseName": "groups_added",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "groups_deleted",
            "baseName": "groups_deleted",
            "type": "Array<UserGroup>",
            "format": ""
        },
        {
            "name": "groups_updated",
            "baseName": "groups_updated",
            "type": "Array<UserGroup>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ImportUserGroupsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
