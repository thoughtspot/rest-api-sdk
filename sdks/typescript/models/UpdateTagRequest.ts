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

export class UpdateTagRequest {
    /**
    * Name of the tag.
    */
    'name'?: string;
    /**
    * Hex color code to be assigned to the tag. For example, #ff78a9.
    */
    'color'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "color",
            "baseName": "color",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateTagRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

