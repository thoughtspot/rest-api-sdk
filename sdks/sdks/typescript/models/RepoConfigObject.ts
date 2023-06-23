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
    'repositoryUrl'?: string;
    /**
    * Username to authenticate connection to vcs
    */
    'username'?: string;
    /**
    * Name of the default remote branch
    */
    'defaultBranch'?: string;
    /**
    * Branches that have been pulled in local repository
    */
    'branches'?: Array<string>;
    /**
    * Maintain mapping of guid for the deployment to an instance
    */
    'enableGuidMapping'?: boolean;
    /**
    * Name of the branch where file containing guid mapping should be maintained
    */
    'guidMappingBranchName'?: string;
    'org'?: Org;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "repositoryUrl",
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
            "name": "defaultBranch",
            "baseName": "default_branch",
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
            "name": "enableGuidMapping",
            "baseName": "enable_guid_mapping",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "guidMappingBranchName",
            "baseName": "guid_mapping_branch_name",
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

