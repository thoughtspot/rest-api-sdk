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

import { DataWarehouseObjectInput } from '../models/DataWarehouseObjectInput';
import { HttpFile } from '../http/http';

export class ConnectionInput {
    /**
    * Unique ID or name of the connection.
    */
    'identifier'?: string;
    /**
    * A pattern to match case-insensitive name of the connection object. User % for a wildcard match.
    */
    'namePattern'?: string;
    /**
    * Filter options for databases, schemas, tables and columns.
    */
    'dataWarehouseObjects'?: Array<DataWarehouseObjectInput>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "namePattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataWarehouseObjects",
            "baseName": "data_warehouse_objects",
            "type": "Array<DataWarehouseObjectInput>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ConnectionInput.attributeTypeMap;
    }

    public constructor() {
    }
}

