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
* Sort options to filter group details.
*/
export class SearchUserGroupsRequestSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SearchUserGroupsRequestSortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SearchUserGroupsRequestSortOptionsOrderEnum | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "field_name",
            "baseName": "field_name",
            "type": "SearchUserGroupsRequestSortOptionsFieldNameEnum",
            "format": ""
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "SearchUserGroupsRequestSortOptionsOrderEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchUserGroupsRequestSortOptions.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchUserGroupsRequestSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" ;
export type SearchUserGroupsRequestSortOptionsOrderEnum = "ASC" | "DESC" ;

