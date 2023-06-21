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

export class SearchConfigRequest {
    /**
    *    List of Unique identifier of the organization. Provide value -1 for cluster level. Example : [\"OrgID1-or-Name1\", \"OrgID2-or-Name2\"]      Note:  If no org identifier is specified,then the configurations will be returned for all orgs the user has access to <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>
    */
    'orgIdentifiers'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "orgIdentifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchConfigRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

