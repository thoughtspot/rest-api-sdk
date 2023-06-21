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
export class MetadataSearchSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'fieldName'?: MetadataSearchSortOptionsFieldNameEnum;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: MetadataSearchSortOptionsOrderEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "fieldName",
            "baseName": "field_name",
            "type": "MetadataSearchSortOptionsFieldNameEnum",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "MetadataSearchSortOptionsOrderEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MetadataSearchSortOptions.attributeTypeMap;
    }

    public constructor() {
    }
}


export type MetadataSearchSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "VIEWS" | "FAVORITES" | "LAST_ACCESSED" ;
export type MetadataSearchSortOptionsOrderEnum = "ASC" | "DESC" ;

