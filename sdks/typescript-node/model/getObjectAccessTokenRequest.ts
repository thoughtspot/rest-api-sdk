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

export class GetObjectAccessTokenRequest {
    /**
    * Username of the user account
    */
    'username': string;
    /**
    * GUID of the ThoughtSpot object. If set, the bearer will only have access to the specified Liveboard or another object.
    */
    'objectId': string;
    /**
    * The password of the user account
    */
    'password'?: string = '';
    /**
    * The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication.
    */
    'secretKey'?: string = '';
    /**
    * Duration in seconds after which the token expires
    */
    'validityTimeInSec'?: number = 300;
    /**
    * Id of the Org to be associated with the user login. If no input is provided then last logged in Org will be considered
    */
    'orgId'?: number = 0;
    /**
    * Indicates email id of the user. Use this parameter to provision a user just-in-time (JIT).
    */
    'email'?: string;
    /**
    * Indicates display name of the user. Use this parameter to provision a user just-in-time (JIT).
    */
    'displayName'?: string;
    /**
    * “Creates a new user if the specified username does not already exist in ThoughtSpot. Use this parameter to provision a user just-in-time (JIT)    Note: This is only available for clusters with trusted authentication enabled. 
    */
    'autoCreate'?: boolean | null = false;
    /**
    * Unique ID or name of the User Groups to which newly created user to be added. Use this parameter to provision a user just-in-time (JIT).
    */
    'groupIdentifiers'?: Array<string>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        },
        {
            "name": "objectId",
            "baseName": "object_id",
            "type": "string"
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "secretKey",
            "baseName": "secret_key",
            "type": "string"
        },
        {
            "name": "validityTimeInSec",
            "baseName": "validity_time_in_sec",
            "type": "number"
        },
        {
            "name": "orgId",
            "baseName": "org_id",
            "type": "number"
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "displayName",
            "baseName": "display_name",
            "type": "string"
        },
        {
            "name": "autoCreate",
            "baseName": "auto_create",
            "type": "boolean"
        },
        {
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>"
        }    ];

    static getAttributeTypeMap() {
        return GetObjectAccessTokenRequest.attributeTypeMap;
    }
}

