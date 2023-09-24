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

export class DataWarehouseObjectInput {
    /**
    * Name of the database.
    */
    'database'?: string;
    /**
    * Name of the schema within the database.
    */
    'schema'?: string;
    /**
    * Name of the table within the schema.
    */
    'table'?: string;
    /**
    * Name of the column within the table.
    */
    'column'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "database",
            "baseName": "database",
            "type": "string",
            "format": ""
        },
        {
            "name": "schema",
            "baseName": "schema",
            "type": "string",
            "format": ""
        },
        {
            "name": "table",
            "baseName": "table",
            "type": "string",
            "format": ""
        },
        {
            "name": "column",
            "baseName": "column",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DataWarehouseObjectInput.attributeTypeMap;
    }

    public constructor() {
    }
}
