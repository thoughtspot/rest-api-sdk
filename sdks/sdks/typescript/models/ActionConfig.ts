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
* Specify that the association is enabled for the metadata object
*/
export class ActionConfig {
    /**
    * Position of the Custom action on the Metadata object. Earlier naming convention: context.
    */
    'position'?: string;
    /**
    * Visibility of the metadata association with custom action. Earlier naming convention: enabled
    */
    'visibility'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "position",
            "baseName": "position",
            "type": "string",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ActionConfig.attributeTypeMap;
    }

    public constructor() {
    }
}

