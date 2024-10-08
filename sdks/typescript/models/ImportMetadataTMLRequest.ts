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

export class ImportMetadataTMLRequest {
    /**
    * Details of TML objects.
    */
    'metadata_tmls': Array<string>;
    /**
    * Specifies the import policy for the TML import.
    */
    'import_policy'?: ImportMetadataTMLRequestImportPolicyEnum;
    /**
    * If selected, creates TML objects with new GUIDs.
    */
    'create_new'?: boolean | null;
    /**
    * If import is happening from all orgs context.
    */
    'all_orgs_context'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata_tmls",
            "baseName": "metadata_tmls",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "import_policy",
            "baseName": "import_policy",
            "type": "ImportMetadataTMLRequestImportPolicyEnum",
            "format": ""
        },
        {
            "name": "create_new",
            "baseName": "create_new",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "all_orgs_context",
            "baseName": "all_orgs_context",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ImportMetadataTMLRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ImportMetadataTMLRequestImportPolicyEnum = "PARTIAL" | "ALL_OR_NONE" | "VALIDATE_ONLY" | "PARTIAL_OBJECT" ;

