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
* Sort options.
*/
export class SearchConnectionRequestSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SearchConnectionRequestSortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SearchConnectionRequestSortOptionsOrderEnum | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "field_name",
            "baseName": "field_name",
            "type": "SearchConnectionRequestSortOptionsFieldNameEnum",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "SearchConnectionRequestSortOptionsOrderEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchConnectionRequestSortOptions.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchConnectionRequestSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "LAST_ACCESSED" | "SYNCED" | "VIEWS" | "USER_STATE" | "ROW_COUNT" ;
export type SearchConnectionRequestSortOptionsOrderEnum = "ASC" | "DESC" ;

