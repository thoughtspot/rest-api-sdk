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

export class ResponseMessage {
    /**
    * Unique identifier of the generated response.
    */
    'session_identifier'?: string | null;
    /**
    * Generate number of the response.
    */
    'generation_number'?: number | null;
    /**
    * Type of the generated response.
    */
    'message_type': ResponseMessageMessageTypeEnum;
    /**
    * Generated visualization type.
    */
    'visualization_type'?: ResponseMessageVisualizationTypeEnum | null;
    /**
    * Tokens for the response.
    */
    'tokens'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "session_identifier",
            "baseName": "session_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "generation_number",
            "baseName": "generation_number",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "message_type",
            "baseName": "message_type",
            "type": "ResponseMessageMessageTypeEnum",
            "format": ""
        },
        {
            "name": "visualization_type",
            "baseName": "visualization_type",
            "type": "ResponseMessageVisualizationTypeEnum",
            "format": ""
        },
        {
            "name": "tokens",
            "baseName": "tokens",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ResponseMessage.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ResponseMessageMessageTypeEnum = "TSAnswer" ;
export type ResponseMessageVisualizationTypeEnum = "Chart" | "Table" | "Undefined" ;
