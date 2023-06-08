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
import { ImportUserType } from './importUserType';

export class ImportUsersResponse {
    'usersAdded'?: Array<ImportUserType>;
    'usersUpdated'?: Array<ImportUserType>;
    'usersDeleted'?: Array<ImportUserType>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "usersAdded",
            "baseName": "users_added",
            "type": "Array<ImportUserType>"
        },
        {
            "name": "usersUpdated",
            "baseName": "users_updated",
            "type": "Array<ImportUserType>"
        },
        {
            "name": "usersDeleted",
            "baseName": "users_deleted",
            "type": "Array<ImportUserType>"
        }    ];

    static getAttributeTypeMap() {
        return ImportUsersResponse.attributeTypeMap;
    }
}

