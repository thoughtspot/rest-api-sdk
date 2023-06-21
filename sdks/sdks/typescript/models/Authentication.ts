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

import { APIKey } from '../models/APIKey';
import { BasicAuth } from '../models/BasicAuth';
import { HttpFile } from '../http/http';

/**
* Authorization type for the custom action.
*/
export class Authentication {
    'aPIKey'?: APIKey;
    'basicAuth'?: BasicAuth;
    /**
    * Bearer tokens enable requests to authenticate using an access key.
    */
    'bearerToken'?: string;
    /**
    * No authorization. If your request doesn\'t require authorization.
    */
    'noAuth'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "aPIKey",
            "baseName": "API_Key",
            "type": "APIKey",
            "format": ""
        },
        {
            "name": "basicAuth",
            "baseName": "Basic_Auth",
            "type": "BasicAuth",
            "format": ""
        },
        {
            "name": "bearerToken",
            "baseName": "Bearer_Token",
            "type": "string",
            "format": ""
        },
        {
            "name": "noAuth",
            "baseName": "No_Auth",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Authentication.attributeTypeMap;
    }

    public constructor() {
    }
}

