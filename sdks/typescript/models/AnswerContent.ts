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

export class AnswerContent {
    /**
    * Total available data row count.
    */
    'available_data_row_count': number;
    /**
    * Name of the columns.
    */
    'column_names': Array<string>;
    /**
    * Rows of data set.
    */
    'data_rows': Array<any>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset': number;
    /**
    * The number of records that should be included.
    */
    'record_size': number;
    /**
    * Total returned data row count.
    */
    'returned_data_row_count': number;
    /**
    * Sampling ratio (0 to 1). If the query was sampled, it is the ratio of keys returned in the data set to the total number of keys expected in the query. If the value is 1.0, this means that the complete result is returned.
    */
    'sampling_ratio': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "available_data_row_count",
            "baseName": "available_data_row_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "column_names",
            "baseName": "column_names",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "data_rows",
            "baseName": "data_rows",
            "type": "Array<any>",
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
            "name": "returned_data_row_count",
            "baseName": "returned_data_row_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sampling_ratio",
            "baseName": "sampling_ratio",
            "type": "number",
            "format": "float"
        }    ];

    static getAttributeTypeMap() {
        return AnswerContent.attributeTypeMap;
    }

    public constructor() {
    }
}
