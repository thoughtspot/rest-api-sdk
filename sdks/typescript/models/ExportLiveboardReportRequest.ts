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
import { ExportLiveboardReportRequestPdfOptions } from '../models/ExportLiveboardReportRequestPdfOptions';
import { ExportLiveboardReportRequestPngOptions } from '../models/ExportLiveboardReportRequestPngOptions';
import { HttpFile } from '../http/http';

export class ExportLiveboardReportRequest {
    /**
    * GUID or name of the Liveboard object.
    */
    'metadata_identifier': string;
    /**
    * GUID or name of the tab of the Liveboard object.    Version: 10.9.0.cl or later 
    */
    'tab_identifiers'?: Array<string>;
    /**
    * GUID or name of the personalised view of the Liveboard object.    Version: 10.9.0.cl or later 
    */
    'personalised_view_identifier'?: string;
    /**
    * GUID or name of visualizations on the Liveboard. If this parameter is not defined, the API returns a report with all visualizations saved on a Liveboard.
    */
    'visualization_identifiers'?: Array<string>;
    /**
    * Transient content of the Liveboard.
    */
    'transient_content'?: string;
    /**
    * Export file format.
    */
    'file_format'?: ExportLiveboardReportRequestFileFormatEnum;
    /**
    * JSON object with representing filter condition to apply filters at runtime. For example, {\"col1\": \"region\", \"op1\": \"EQ\", \"val1\": \"northeast\" }. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
    */
    'runtime_filter'?: any;
    /**
    * Applied to the liveboard and overrides any filters already applied on the same columns in liveboard. Following example illustrate different kinds of filters: {   \"override_filters\": [     {       \"column_name\": \"Color\",       \"generic_filter\": {         \"op\": \"IN\",         \"values\": [           \"almond\",           \"turquoise\"         ]       },       \"negate\": false     },     {       \"column_name\": \"Commit Date\",       \"date_filter\": {         \"datePeriod\": \"HOUR\",         \"number\": 3,         \"type\": \"LAST_N_PERIOD\",         \"op\": \"EQ\"       }     },     {       \"column_name\": \"Sales\",       \"generic_filter\": {         \"op\": \"BW_INC\",         \"values\": [           \"100000\",           \"70000\"         ]       },       \"negate\": true     }   ] }
    */
    'override_filters'?: any;
    /**
    * JSON string representing runtime sort. For example, {\"sortCol1\": \"region\", \"asc1\" : true}. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
    */
    'runtime_sort'?: any;
    'pdf_options'?: ExportLiveboardReportRequestPdfOptions;
    'png_options'?: ExportLiveboardReportRequestPngOptions;
    /**
    * JSON object for setting values of parameters at runtime. For example, <code> {\"param1\": \"Double List Param\", \"paramVal1\": 0.5}</code>. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
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
            "name": "tab_identifiers",
            "baseName": "tab_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "personalised_view_identifier",
            "baseName": "personalised_view_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "visualization_identifiers",
            "baseName": "visualization_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "transient_content",
            "baseName": "transient_content",
            "type": "string",
            "format": ""
        },
        {
            "name": "file_format",
            "baseName": "file_format",
            "type": "ExportLiveboardReportRequestFileFormatEnum",
            "format": ""
        },
        {
            "name": "runtime_filter",
            "baseName": "runtime_filter",
            "type": "any",
            "format": ""
        },
        {
            "name": "override_filters",
            "baseName": "override_filters",
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
            "name": "pdf_options",
            "baseName": "pdf_options",
            "type": "ExportLiveboardReportRequestPdfOptions",
            "format": ""
        },
        {
            "name": "png_options",
            "baseName": "png_options",
            "type": "ExportLiveboardReportRequestPngOptions",
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
        return ExportLiveboardReportRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ExportLiveboardReportRequestFileFormatEnum = "PDF" | "PNG" ;

