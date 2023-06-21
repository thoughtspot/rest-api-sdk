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

import { AnswerContent } from '../models/AnswerContent';
import { HttpFile } from '../http/http';

/**
* Response format associated with the search data API.
*/
export class SearchDataResponse {
    /**
    * Data content of metadata objects.
    */
    'contents': Array<AnswerContent>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "contents",
            "baseName": "contents",
            "type": "Array<AnswerContent>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchDataResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

