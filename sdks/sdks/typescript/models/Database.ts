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

import { SchemaObject } from '../models/SchemaObject';
import { HttpFile } from '../http/http';

export class Database {
    /**
    * Name of the database.
    */
    'name': string;
    /**
    * Schemas of the database.
    */
    'schemas'?: Array<SchemaObject>;
    /**
    * Determines if the object is auto created.
    */
    'auto_created'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "schemas",
            "baseName": "schemas",
            "type": "Array<SchemaObject>",
            "format": ""
        },
        {
            "name": "auto_created",
            "baseName": "auto_created",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Database.attributeTypeMap;
    }

    public constructor() {
    }
}
