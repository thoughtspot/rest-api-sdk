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

/**
* MetadataType InputType used in Export MetadataType API
*/
export class ExportMetadataTypeInput {
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: ExportMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "ExportMetadataTypeInputTypeEnum",
            "format": ""
        },
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ExportMetadataTypeInput.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ExportMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "CONNECTION" | "CUSTOM_ACTION" | "USER" | "USER_GROUP" | "ROLE" ;

