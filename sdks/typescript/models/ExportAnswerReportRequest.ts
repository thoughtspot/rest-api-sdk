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

import { ExportAnswerReportRequestRegionalSettings } from '../models/ExportAnswerReportRequestRegionalSettings';
import { HttpFile } from '../http/http';

export class ExportAnswerReportRequest {
    /**
    * Unique ID or name of the metadata object.
    */
    'metadata_identifier'?: string;
    /**
    * Unique ID of the answer session.
    */
    'session_identifier'?: string;
    /**
    * Generation number of the answer session.
    */
    'generation_number'?: number;
    /**
    * Export file format.
    */
    'file_format'?: ExportAnswerReportRequestFileFormatEnum;
    /**
    * JSON string representing runtime filter. { col1:region, op1: EQ, val1: northeast }
    */
    'runtime_filter'?: any;
    /**
    * JSON string representing runtime sort. { sortCol1: region, asc1 :true, sortCol2 : date }
    */
    'runtime_sort'?: any;
    /**
    * JSON object for setting values of parameters in runtime.
    */
    'runtime_param_override'?: any;
    'regional_settings'?: ExportAnswerReportRequestRegionalSettings;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "session_identifier",
            "baseName": "session_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "generation_number",
            "baseName": "generation_number",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "file_format",
            "baseName": "file_format",
            "type": "ExportAnswerReportRequestFileFormatEnum",
            "format": ""
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
        },
        {
            "name": "regional_settings",
            "baseName": "regional_settings",
            "type": "ExportAnswerReportRequestRegionalSettings",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ExportAnswerReportRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ExportAnswerReportRequestFileFormatEnum = "CSV" | "PDF" | "XLSX" | "PNG" ;

