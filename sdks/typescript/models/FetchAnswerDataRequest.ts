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

export class FetchAnswerDataRequest {
    /**
    * GUID or name of the Answer.
    */
    'metadata_identifier': string;
    /**
    * JSON output in compact or full format. The FULL option is available in 9.12.5.cl or later.
    */
    'data_format'?: FetchAnswerDataRequestDataFormatEnum;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records to include in a batch.
    */
    'record_size'?: number;
    /**
    * JSON object with representing filter condition to apply filters at runtime. For example, <code> {\"col1\": \"item type\", \"op1\": \"EQ\", \"val1\": \"Bags\"} </code>. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
    */
    'runtime_filter'?: any;
    /**
    * JSON object representing columns to sort data at runtime. For example, <code> {\"sortCol1\": \"sales\", \"asc1\": true} </code>. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
    */
    'runtime_sort'?: any;
    /**
    * JSON object for setting values of parameters at runtime. For example, <code> {\"param1\": \"Double List Param\", \"paramVal1\": 0.5}</code>. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
    */
    'runtime_param_override'?: any;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "data_format",
            "baseName": "data_format",
            "type": "FetchAnswerDataRequestDataFormatEnum",
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
            "name": "runtime_filter",
            "baseName": "runtime_filter",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_sort",
            "baseName": "runtime_sort",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_param_override",
            "baseName": "runtime_param_override",
            "type": "any",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FetchAnswerDataRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type FetchAnswerDataRequestDataFormatEnum = "FULL" | "COMPACT" ;

