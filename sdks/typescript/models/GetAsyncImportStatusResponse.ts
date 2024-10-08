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

import { ImportEPackAsyncTaskStatus } from '../models/ImportEPackAsyncTaskStatus';
import { HttpFile } from '../http/http';

export class GetAsyncImportStatusResponse {
    /**
    * List of task statuses.
    */
    'status_list'?: Array<ImportEPackAsyncTaskStatus> | null;
    /**
    * Indicates whether there are more task statuses to fetch.
    */
    'last_batch'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status_list",
            "baseName": "status_list",
            "type": "Array<ImportEPackAsyncTaskStatus>",
            "format": ""
        },
        {
            "name": "last_batch",
            "baseName": "last_batch",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GetAsyncImportStatusResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

