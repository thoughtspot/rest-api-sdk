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
* Default Custom action configuration. This includes if the custom action visibility across visualization. By default, visible across visualizations.
*/
export class DefaultActionConfigInput {
    /**
    * Custom action is visible to all Visualizations. Earlier naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility.
    */
    'visibility'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DefaultActionConfigInput.attributeTypeMap;
    }

    public constructor() {
    }
}

