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

import { Column } from '../models/Column';
import { HttpFile } from '../http/http';

export class Table {
    /**
    * Name of the table.
    */
    'name': string;
    /**
    * Columns of the table.
    */
    'columns'?: Array<Column> | null;
    /**
    * Type of table. Either view or table
    */
    'type'?: string | null;
    /**
    * Description of the table
    */
    'description'?: string | null;
    /**
    * Determines if the table is selected
    */
    'selected'?: boolean | null;
    /**
    * Determines if the table is linked
    */
    'linked'?: boolean | null;
    /**
    * List of relationships for the table
    */
    'relationships'?: Array<any> | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "columns",
            "baseName": "columns",
            "type": "Array<Column>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
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
            "name": "selected",
            "baseName": "selected",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "linked",
            "baseName": "linked",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "relationships",
            "baseName": "relationships",
            "type": "Array<any>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Table.attributeTypeMap;
    }

    public constructor() {
    }
}

