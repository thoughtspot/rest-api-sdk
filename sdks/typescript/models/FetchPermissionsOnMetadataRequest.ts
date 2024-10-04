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

import { PermissionsMetadataTypeInput } from '../models/PermissionsMetadataTypeInput';
import { PrincipalsInput } from '../models/PrincipalsInput';
import { HttpFile } from '../http/http';

export class FetchPermissionsOnMetadataRequest {
    /**
    * GUID or name of the metadata object.
    */
    'metadata': Array<PermissionsMetadataTypeInput>;
    /**
    * User or group objects for which you want to fetch permissions. If not specified, the API returns all users and groups that can access the specified metadata objects.
    */
    'principals'?: Array<PrincipalsInput>;
    /**
    * Indicates whether to fetch permissions of dependent metadata objects.
    */
    'include_dependent_objects'?: boolean | null;
    /**
    * The starting record number from where the records should be included for each metadata type.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included for each metadata type.
    */
    'record_size'?: number;
    /**
    * Permission type if it is effective then fetch the effective permission of principals else fetch the defined permission of principals.
    */
    'permission_type'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<PermissionsMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "principals",
            "baseName": "principals",
            "type": "Array<PrincipalsInput>",
            "format": ""
        },
        {
            "name": "include_dependent_objects",
            "baseName": "include_dependent_objects",
            "type": "boolean",
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
            "name": "permission_type",
            "baseName": "permission_type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FetchPermissionsOnMetadataRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

