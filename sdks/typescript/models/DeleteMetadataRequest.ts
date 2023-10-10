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

import { DeleteMetadataTypeInput } from '../models/DeleteMetadataTypeInput';
import { HttpFile } from '../http/http';

export class DeleteMetadataRequest {
    /**
    * Metadata objects.
    */
    'metadata': Array<DeleteMetadataTypeInput>;
    /**
    * Indicates whether to delete disabled metadata objects.
    */
    'delete_disabled_objects'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<DeleteMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "delete_disabled_objects",
            "baseName": "delete_disabled_objects",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DeleteMetadataRequest.attributeTypeMap;
    }

    public constructor() {
    }
}
