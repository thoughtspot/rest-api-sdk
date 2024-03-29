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

export class DeactivateUserRequest {
    /**
    * Unique ID or name of the user.
    */
    'user_identifier': string;
    /**
    * Base url of the cluster.
    */
    'base_url': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "base_url",
            "baseName": "base_url",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DeactivateUserRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

