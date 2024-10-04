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

export class CommitFileType {
    /**
    * Name of the file deployed
    */
    'file_name': string;
    /**
    * Indicates the status of deployment for the file
    */
    'status_code': string;
    /**
    * Any error or warning with the deployment
    */
    'status_message'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "file_name",
            "baseName": "file_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "status_code",
            "baseName": "status_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "status_message",
            "baseName": "status_message",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CommitFileType.attributeTypeMap;
    }

    public constructor() {
    }
}

