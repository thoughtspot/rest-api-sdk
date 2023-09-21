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

export class Scope {
    /**
    * Object access scope type.
    */
    'access_type': string;
    /**
    * Unique identifier of the metadata.
    */
    'org_id'?: number;
    /**
    * Unique identifier of the Org.
    */
    'metadata_id'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "access_type",
            "baseName": "access_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "org_id",
            "baseName": "org_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "metadata_id",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Scope.attributeTypeMap;
    }

    public constructor() {
    }
}

