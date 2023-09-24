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

import { Org } from '../models/Org';
import { HttpFile } from '../http/http';

export class RepoConfigObject {
    /**
    * Remote repository URL configured
    */
    'repository_url'?: string;
    /**
    * Username to authenticate connection to the version control system
    */
    'username'?: string;
    /**
    * Name of the remote branch where objects from this Thoughtspot instance will be versioned.
    */
    'commit_branch_name'?: string;
    /**
    * Branches that have been pulled in local repository
    */
    'branches'?: Array<string>;
    /**
    * Maintain mapping of guid for the deployment to an instance
    */
    'enable_guid_mapping'?: boolean;
    /**
    * Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.
    */
    'configuration_branch_name'?: string;
    'org'?: Org;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "repository_url",
            "baseName": "repository_url",
            "type": "string",
            "format": ""
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        },
        {
            "name": "commit_branch_name",
            "baseName": "commit_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "branches",
            "baseName": "branches",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "enable_guid_mapping",
            "baseName": "enable_guid_mapping",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "configuration_branch_name",
            "baseName": "configuration_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "org",
            "baseName": "org",
            "type": "Org",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RepoConfigObject.attributeTypeMap;
    }

    public constructor() {
    }
}

