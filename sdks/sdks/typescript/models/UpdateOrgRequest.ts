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

export class UpdateOrgRequest {
    /**
    * Name of the Org.
    */
    'name'?: string;
    /**
    * Description of the Org.
    */
    'description'?: string;
    /**
    * Add Users to an Org.
    */
    'userIdentifiers'?: Array<string>;
    /**
    * Type of update operation. Default operation type is ADD
    */
    'operation'?: UpdateOrgRequestOperationEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "userIdentifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateOrgRequestOperationEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateOrgRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type UpdateOrgRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE" ;

