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
* List of runtime parameters need to set during the session.
*/
export class JWTParameter {
    /**
    * Runtime filter parameter type in JWT.
    */
    'runtime_filter'?: any | null;
    /**
    * Runtime sort parameter type in JWT.
    */
    'runtime_sort'?: any | null;
    /**
    * Runtime param override type in JWT.
    */
    'runtime_param_override'?: any | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "runtime_filter",
            "baseName": "runtime_filter",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_sort",
            "baseName": "runtime_sort",
            "type": "any",
            "format": ""
        },
        {
            "name": "runtime_param_override",
            "baseName": "runtime_param_override",
            "type": "any",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return JWTParameter.attributeTypeMap;
    }

    public constructor() {
    }
}

