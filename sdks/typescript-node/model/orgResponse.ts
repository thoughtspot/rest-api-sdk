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

export class OrgResponse {
    /**
    * Unique identifier of the organization.
    */
    'id'?: number;
    /**
    * Name of the organization.
    */
    'name'?: string;
    /**
    * Status of the organization.
    */
    'status'?: OrgResponse.StatusEnum;
    /**
    * Description of the organization.
    */
    'description'?: string;
    /**
    * Visibility of the organization.
    */
    'visibility'?: OrgResponse.VisibilityEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "OrgResponse.StatusEnum"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "OrgResponse.VisibilityEnum"
        }    ];

    static getAttributeTypeMap() {
        return OrgResponse.attributeTypeMap;
    }
}

export namespace OrgResponse {
    export enum StatusEnum {
        Active = <any> 'ACTIVE',
        InActive = <any> 'IN_ACTIVE'
    }
    export enum VisibilityEnum {
        Show = <any> 'SHOW',
        Hidden = <any> 'HIDDEN'
    }
}
