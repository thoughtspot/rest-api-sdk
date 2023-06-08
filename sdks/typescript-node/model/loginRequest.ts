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

export class LoginRequest {
    /**
    * Username of the user account
    */
    'username'?: string;
    /**
    * The password of the user account
    */
    'password'?: string;
    /**
    * Id of the Org to be associated with the user login. If no input is provided then last logged in Org will be considered
    */
    'orgIdentifier'?: string;
    /**
    * A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls.
    */
    'rememberMe'?: boolean | null = false;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "orgIdentifier",
            "baseName": "org_identifier",
            "type": "string"
        },
        {
            "name": "rememberMe",
            "baseName": "remember_me",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return LoginRequest.attributeTypeMap;
    }
}

