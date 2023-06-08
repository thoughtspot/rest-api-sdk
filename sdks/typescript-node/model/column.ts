/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

export class Column {
    /**
    * Name of the column.
    */
    'name': string;
    /**
    * Data type of the column.
    */
    'dataType': string;
    /**
    * Determines if the column schema is an aggregate
    */
    'isAggregate'?: string;
    /**
    * Determines if the column schema can be imported
    */
    'canImport'?: boolean;
    /**
    * Determines if the table is selected
    */
    'selected'?: boolean;
    /**
    * Determines if the table is linked
    */
    'isLinkedActive'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "dataType",
            "baseName": "data_type",
            "type": "string"
        },
        {
            "name": "isAggregate",
            "baseName": "is_aggregate",
            "type": "string"
        },
        {
            "name": "canImport",
            "baseName": "can_import",
            "type": "boolean"
        },
        {
            "name": "selected",
            "baseName": "selected",
            "type": "boolean"
        },
        {
            "name": "isLinkedActive",
            "baseName": "is_linked_active",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return Column.attributeTypeMap;
    }
}

