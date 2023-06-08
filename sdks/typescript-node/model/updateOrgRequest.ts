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
    'operation'?: UpdateOrgRequest.OperationEnum = UpdateOrgRequest.OperationEnum.Add;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "userIdentifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>"
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateOrgRequest.OperationEnum"
        }    ];

    static getAttributeTypeMap() {
        return UpdateOrgRequest.attributeTypeMap;
    }
}

export namespace UpdateOrgRequest {
    export enum OperationEnum {
        Add = <any> 'ADD',
        Remove = <any> 'REMOVE',
        Replace = <any> 'REPLACE'
    }
}
