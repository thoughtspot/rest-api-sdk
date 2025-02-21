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

export class ActivateUserRequest {
    /**
    * Unique ID or name of the user.
    */
    'user_identifier': string;
    /**
    * Auth token for the user.
    */
    'auth_token': string;
    /**
    * New password for the user to access the account.
    */
    'password': string;
    /**
    * Properties of the user.
    */
    'properties'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "auth_token",
            "baseName": "auth_token",
            "type": "string",
            "format": ""
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "properties",
            "baseName": "properties",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ActivateUserRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

