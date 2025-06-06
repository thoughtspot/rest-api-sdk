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

export class InputEurekaNLSRequest {
    /**
    * Cluster version like 10.4.0.cl, 10.5.0.cl, so on.
    */
    'agentVersion'?: number | null;
    /**
    * If true, results are not returned from cache & calculated every time. Can incur high costs & latency.
    */
    'bypassCache'?: boolean | null;
    /**
    * User specific instructions for processing the @query.
    */
    'instructions'?: Array<string> | null;
    /**
    * User query which is a topical/goal oriented question that needs to be broken down into smaller simple analytical questions.
    */
    'query'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "agentVersion",
            "baseName": "agentVersion",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "bypassCache",
            "baseName": "bypassCache",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "instructions",
            "baseName": "instructions",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "query",
            "baseName": "query",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return InputEurekaNLSRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

