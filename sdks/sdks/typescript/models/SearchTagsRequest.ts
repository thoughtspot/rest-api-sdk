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

export class SearchTagsRequest {
    /**
    * Name or Id of the tag.
    */
    'tag_identifier'?: string;
    /**
    * A pattern to match case-insensitive name of the Tag object.
    */
    'name_pattern'?: string;
    /**
    * Color of the tag.
    */
    'color'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "tag_identifier",
            "baseName": "tag_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "color",
            "baseName": "color",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchTagsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

