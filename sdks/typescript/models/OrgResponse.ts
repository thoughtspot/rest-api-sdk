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

export class OrgResponse {
    /**
    * Unique identifier of the Org.
    */
    'id'?: number | null;
    /**
    * Name of the Org.
    */
    'name'?: string | null;
    /**
    * Status of the Org.
    */
    'status'?: OrgResponseStatusEnum | null;
    /**
    * Description of the Org.
    */
    'description'?: string | null;
    /**
    * Visibility of the Org.
    */
    'visibility'?: OrgResponseVisibilityEnum | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "OrgResponseStatusEnum",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "OrgResponseVisibilityEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return OrgResponse.attributeTypeMap;
    }

    public constructor() {
    }
}


export type OrgResponseStatusEnum = "ACTIVE" | "IN_ACTIVE" ;
export type OrgResponseVisibilityEnum = "SHOW" | "HIDDEN" ;

