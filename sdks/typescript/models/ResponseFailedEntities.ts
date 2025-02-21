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

import { ResponseFailedEntity } from '../models/ResponseFailedEntity';
import { HttpFile } from '../http/http';

/**
* Wrapper for the failed entities, as they are inside a \'data\' field in the response.
*/
export class ResponseFailedEntities {
    'data': Array<ResponseFailedEntity>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<ResponseFailedEntity>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ResponseFailedEntities.attributeTypeMap;
    }

    public constructor() {
    }
}

