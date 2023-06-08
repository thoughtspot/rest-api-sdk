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

export class DeleteConfigRequest {
    /**
    * Consider cluster level or org level config. Set it to false to delete configuration from current org. If set to true, then the configuration at cluster level and orgs that inherited the configuration from cluster level will be deleted. <br/>  <span class=\"since-beta-tag\">Version: 9.5.0.cl or later</span>
    */
    'clusterLevel'?: boolean | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "clusterLevel",
            "baseName": "cluster_level",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return DeleteConfigRequest.attributeTypeMap;
    }
}

