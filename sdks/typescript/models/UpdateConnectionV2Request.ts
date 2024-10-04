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

export class UpdateConnectionV2Request {
    /**
    * Updated name of the connection.
    */
    'name'?: string;
    /**
    * Updated description of the connection.
    */
    'description'?: string;
    /**
    * Configuration of the data warehouse in JSON.
    */
    'data_warehouse_config'?: any;
    /**
    * Indicates whether to validate the connection details.
    */
    'validate'?: boolean | null;

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
            "name": "data_warehouse_config",
            "baseName": "data_warehouse_config",
            "type": "any",
            "format": ""
        },
        {
            "name": "validate",
            "baseName": "validate",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateConnectionV2Request.attributeTypeMap;
    }

    public constructor() {
    }
}

