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
* Response format associated with fetch SQL query api
*/
export class SqlQuery {
    /**
    * Unique identifier of the metadata.
    */
    'metadataId': string;
    /**
    * Name of the metadata.
    */
    'metadataName': string;
    /**
    * SQL query of a metadata object.
    */
    'sqlQuery': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadataId",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataName",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "sqlQuery",
            "baseName": "sql_query",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SqlQuery.attributeTypeMap;
    }

    public constructor() {
    }
}

