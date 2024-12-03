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

export class ExportMetadataTMLBatchedRequest {
    /**
    * Type of metadata object to export, can be one of USER | ROLE | USER_GROUP
    */
    'metadata_type': ExportMetadataTMLBatchedRequestMetadataTypeEnum;
    /**
    * Indicates the position within the complete set from where the API should begin returning objects.
    */
    'batch_offset'?: number;
    /**
    * Determines the number of objects or items to be retrieved in a single request.
    */
    'batch_size'?: number;
    /**
    * TML EDOC content format.
    */
    'edoc_format'?: ExportMetadataTMLBatchedRequestEdocFormatEnum;
    /**
    * Indicates whether to export dependent metadata objects of specified metadata objects.
    */
    'export_dependent'?: boolean | null;
    /**
    * Indicates whether to export is happening from all orgs context.
    */
    'all_orgs_override'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "ExportMetadataTMLBatchedRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "batch_offset",
            "baseName": "batch_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "batch_size",
            "baseName": "batch_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "edoc_format",
            "baseName": "edoc_format",
            "type": "ExportMetadataTMLBatchedRequestEdocFormatEnum",
            "format": ""
        },
        {
            "name": "export_dependent",
            "baseName": "export_dependent",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "all_orgs_override",
            "baseName": "all_orgs_override",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ExportMetadataTMLBatchedRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ExportMetadataTMLBatchedRequestMetadataTypeEnum = "USER" | "USER_GROUP" | "ROLE" ;
export type ExportMetadataTMLBatchedRequestEdocFormatEnum = "JSON" | "YAML" ;
