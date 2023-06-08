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
export class SortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'fieldName'?: SortOptions.FieldNameEnum;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SortOptions.OrderEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fieldName",
            "baseName": "field_name",
            "type": "SortOptions.FieldNameEnum"
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "SortOptions.OrderEnum"
        }    ];

    static getAttributeTypeMap() {
        return SortOptions.attributeTypeMap;
    }
}

export namespace SortOptions {
    export enum FieldNameEnum {
        Name = <any> 'NAME',
        DisplayName = <any> 'DISPLAY_NAME',
        Author = <any> 'AUTHOR',
        Created = <any> 'CREATED',
        Modified = <any> 'MODIFIED'
    }
    export enum OrderEnum {
        Asc = <any> 'ASC',
        Desc = <any> 'DESC'
    }
}
