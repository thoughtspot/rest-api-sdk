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

export class MetadataObject {
    /**
    * Unique ID or name of the metadata
    */
    'identifier': string;
    /**
    * Type of metadata.
    */
    'type'?: MetadataObject.TypeEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "MetadataObject.TypeEnum"
        }    ];

    static getAttributeTypeMap() {
        return MetadataObject.attributeTypeMap;
    }
}

export namespace MetadataObject {
    export enum TypeEnum {
        Liveboard = <any> 'LIVEBOARD',
        Answer = <any> 'ANSWER',
        LogicalTable = <any> 'LOGICAL_TABLE'
    }
}
