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

import { PrincipalsInput } from '../models/PrincipalsInput';
import { HttpFile } from '../http/http';

/**
* Details of users or user groups.
*/
export class PermissionInput {
    'principal': PrincipalsInput;
    /**
    * Object share mode.
    */
    'shareMode': PermissionInputShareModeEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "principal",
            "baseName": "principal",
            "type": "PrincipalsInput",
            "format": ""
        },
        {
            "name": "shareMode",
            "baseName": "share_mode",
            "type": "PermissionInputShareModeEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PermissionInput.attributeTypeMap;
    }

    public constructor() {
    }
}


export type PermissionInputShareModeEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS" ;

