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

export class FavoriteMetadataItem {
    /**
    * Unique ID of the metadata object.
    */
    'id': string;
    /**
    * name of the metadata object.
    */
    'name': string;
    /**
    *   Type of metadata object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type': FavoriteMetadataItemTypeEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "FavoriteMetadataItemTypeEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FavoriteMetadataItem.attributeTypeMap;
    }

    public constructor() {
    }
}


export type FavoriteMetadataItemTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP" ;

