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

export class FetchLogsRequest {
    /**
    * Name of the log type
    */
    'log_type': FetchLogsRequestLogTypeEnum;
    /**
    * Start time in EPOCH format
    */
    'start_epoch_time_in_millis'?: number;
    /**
    * End time in EPOCH format
    */
    'end_epoch_time_in_millis'?: number;
    /**
    * Fetch all the logs. This is available from 9.10.5.cl
    */
    'get_all_logs'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "log_type",
            "baseName": "log_type",
            "type": "FetchLogsRequestLogTypeEnum",
            "format": ""
        },
        {
            "name": "start_epoch_time_in_millis",
            "baseName": "start_epoch_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "end_epoch_time_in_millis",
            "baseName": "end_epoch_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "get_all_logs",
            "baseName": "get_all_logs",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FetchLogsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type FetchLogsRequestLogTypeEnum = "SECURITY_AUDIT" ;

