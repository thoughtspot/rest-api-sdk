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

export class FavoriteMetadataItem {
    /**
    * Unique ID of the metadata.
    */
    'id': string;
    /**
    * name of the metadata.
    */
    'name': string;
    /**
    * Type of metadata.
    */
    'type': FavoriteMetadataItem.TypeEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "FavoriteMetadataItem.TypeEnum"
        }    ];

    static getAttributeTypeMap() {
        return FavoriteMetadataItem.attributeTypeMap;
    }
}

export namespace FavoriteMetadataItem {
    export enum TypeEnum {
        Liveboard = <any> 'LIVEBOARD',
        Answer = <any> 'ANSWER',
        LogicalTable = <any> 'LOGICAL_TABLE',
        LogicalColumn = <any> 'LOGICAL_COLUMN',
        Connection = <any> 'CONNECTION',
        Tag = <any> 'TAG',
        User = <any> 'USER',
        UserGroup = <any> 'USER_GROUP',
        LogicalRelationship = <any> 'LOGICAL_RELATIONSHIP'
    }
}
