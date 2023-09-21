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

import { Author } from '../models/Author';
import { Frequency } from '../models/Frequency';
import { LiveboardOptions } from '../models/LiveboardOptions';
import { MetadataResponse } from '../models/MetadataResponse';
import { PdfOptions } from '../models/PdfOptions';
import { RecipientDetails } from '../models/RecipientDetails';
import { ResponseScheduleRun } from '../models/ResponseScheduleRun';
import { HttpFile } from '../http/http';

export class ResponseSchedule {
    'author': Author;
    /**
    * Schedule creation time in milliseconds.
    */
    'creation_time_in_millis': any;
    /**
    * Description of the job.
    */
    'description'?: string;
    /**
    * Export file format.
    */
    'file_format': string;
    'frequency': Frequency;
    /**
    * GUID of the scheduled job.
    */
    'id': string;
    'liveboard_options'?: LiveboardOptions;
    'metadata': MetadataResponse;
    /**
    * Name of the scheduled job.
    */
    'name': string;
    'pdf_options'?: PdfOptions;
    'recipient_details': RecipientDetails;
    /**
    * Status of the job
    */
    'status'?: string;
    /**
    * Time zone
    */
    'time_zone': string;
    /**
    * Schedule runs history records.
    */
    'history_runs'?: Array<ResponseScheduleRun>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "author",
            "baseName": "author",
            "type": "Author",
            "format": ""
        },
        {
            "name": "creation_time_in_millis",
            "baseName": "creation_time_in_millis",
            "type": "any",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "file_format",
            "baseName": "file_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "frequency",
            "baseName": "frequency",
            "type": "Frequency",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "liveboard_options",
            "baseName": "liveboard_options",
            "type": "LiveboardOptions",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "MetadataResponse",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "pdf_options",
            "baseName": "pdf_options",
            "type": "PdfOptions",
            "format": ""
        },
        {
            "name": "recipient_details",
            "baseName": "recipient_details",
            "type": "RecipientDetails",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string",
            "format": ""
        },
        {
            "name": "time_zone",
            "baseName": "time_zone",
            "type": "string",
            "format": ""
        },
        {
            "name": "history_runs",
            "baseName": "history_runs",
            "type": "Array<ResponseScheduleRun>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ResponseSchedule.attributeTypeMap;
    }

    public constructor() {
    }
}

