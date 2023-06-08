/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

/**
* Sort options.
*/
export class SortingOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'fieldName'?: string;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fieldName",
            "baseName": "field_name",
            "type": "string"
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return SortingOptions.attributeTypeMap;
    }
}

