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

/**
* MetadataType InputType used in Export MetadataType API\'s
*/
export class ExportMetadataTypeInput {
    /**
    * Type of metadata (Optional when given identifier is ID).
    */
    'type'?: ExportMetadataTypeInput.TypeEnum;
    /**
    * Unique ID or name of the metadata.
    */
    'identifier': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "ExportMetadataTypeInput.TypeEnum"
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ExportMetadataTypeInput.attributeTypeMap;
    }
}

export namespace ExportMetadataTypeInput {
    export enum TypeEnum {
        Liveboard = <any> 'LIVEBOARD',
        Answer = <any> 'ANSWER',
        LogicalTable = <any> 'LOGICAL_TABLE',
        Connection = <any> 'CONNECTION'
    }
}
