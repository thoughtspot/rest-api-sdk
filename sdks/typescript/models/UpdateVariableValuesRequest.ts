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

import { VariableValueInput } from '../models/VariableValueInput';
import { HttpFile } from '../http/http';

export class UpdateVariableValuesRequest {
    /**
    * Variables and values
    */
    'variable_updates': Array<VariableValueInput>;
    /**
    * Type of update operation
    */
    'operation': UpdateVariableValuesRequestOperationEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "variable_updates",
            "baseName": "variable_updates",
            "type": "Array<VariableValueInput>",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateVariableValuesRequestOperationEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateVariableValuesRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type UpdateVariableValuesRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE" ;

