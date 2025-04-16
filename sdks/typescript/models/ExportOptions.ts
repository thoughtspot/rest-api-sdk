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
* Flags to specify additional options for export. This will only be active when UserDefinedId in TML is enabled.
*/
export class ExportOptions {
    /**
    * Boolean Flag to whether to export user_defined_id of referenced object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'include_obj_id_ref'?: boolean | null;
    /**
    * Boolean flag to whether to export guid of the object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'include_guid'?: boolean | null;
    /**
    * Boolean flag to whether to export user_defined_id of the object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'include_obj_id'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "include_obj_id_ref",
            "baseName": "include_obj_id_ref",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_guid",
            "baseName": "include_guid",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_obj_id",
            "baseName": "include_obj_id",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ExportOptions.attributeTypeMap;
    }

    public constructor() {
    }
}

