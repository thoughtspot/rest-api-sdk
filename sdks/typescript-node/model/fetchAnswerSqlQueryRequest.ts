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

export class FetchAnswerSqlQueryRequest {
    /**
    * ID or name of an Answer.
    */
    'metadataIdentifier': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "metadataIdentifier",
            "baseName": "metadata_identifier",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return FetchAnswerSqlQueryRequest.attributeTypeMap;
    }
}

