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
* Default Custom action configuration. This includes the custom action\'s visibility across all visualizations and Answers. By default, a custom action is added to all visualizations and Answers.
*/
export class DefaultActionConfig {
    /**
    * Custom action is available on all visualizations. Earlier , the naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility.
    */
    'visibility'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DefaultActionConfig.attributeTypeMap;
    }

    public constructor() {
    }
}

