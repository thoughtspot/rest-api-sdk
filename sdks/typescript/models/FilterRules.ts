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
* Filter Rules to be applied on Objects.
*/
export class FilterRules {
    /**
    * The name of the column to apply the filter on.
    */
    'column_name': string;
    /**
    * The operator to use for filtering. Example: EQ (equals), GT(greater than), etc.
    */
    'operator': FilterRulesOperatorEnum;
    /**
    * The values to filter on. To get all records, use TS_WILDCARD_ALL as values.
    */
    'values': Array<any>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "column_name",
            "baseName": "column_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "operator",
            "baseName": "operator",
            "type": "FilterRulesOperatorEnum",
            "format": ""
        },
        {
            "name": "values",
            "baseName": "values",
            "type": "Array<any>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FilterRules.attributeTypeMap;
    }

    public constructor() {
    }
}


export type FilterRulesOperatorEnum = "EQ" | "NE" | "LT" | "LE" | "GT" | "GE" | "IN" | "BW" | "CONTAINS" | "BEGINS_WITH" | "ENDS_WITH" | "BW_INC" | "BW_INC_MIN" | "BW_INC_MAX" | "LIKE" | "NOT_IN" ;

