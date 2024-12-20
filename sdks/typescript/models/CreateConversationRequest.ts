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

export class CreateConversationRequest {
    /**
    * Data model id to start the conversation on.
    */
    'metadata_identifier': string;
    /**
    * Tokens to start the conversation with.
    */
    'tokens'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "tokens",
            "baseName": "tokens",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateConversationRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

