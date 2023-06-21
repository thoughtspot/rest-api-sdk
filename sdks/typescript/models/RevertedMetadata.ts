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

export class RevertedMetadata {
    /**
    * Name of the file deployed
    */
    'fileName': string;
    /**
    * Name of the metadata object
    */
    'metadataName': string;
    /**
    * Type of the metadata object
    */
    'metadataType': string;
    /**
    * Indicates the status of deployment for the file
    */
    'statusCode': string;
    /**
    * Any error or warning with the deployment
    */
    'statusMessage': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "fileName",
            "baseName": "file_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataName",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "statusCode",
            "baseName": "status_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "statusMessage",
            "baseName": "status_message",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RevertedMetadata.attributeTypeMap;
    }

    public constructor() {
    }
}

