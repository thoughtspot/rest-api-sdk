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

/**
* Favorite object options.
*/
export class FavoriteObjectOptionsInput {
    /**
    * Includes objects marked as favorite for the specified users.
    */
    'include'?: boolean | null;
    /**
    * Unique ID or name of the users. If not specified, the favorite objects of current logged in user are returned.
    */
    'user_identifiers'?: Array<string> | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "include",
            "baseName": "include",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "user_identifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FavoriteObjectOptionsInput.attributeTypeMap;
    }

    public constructor() {
    }
}

