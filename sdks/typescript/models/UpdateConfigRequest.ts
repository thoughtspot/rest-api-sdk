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

export class UpdateConfigRequest {
    /**
    * Username to authenticate connection to version control system
    */
    'username'?: string;
    /**
    * Access token corresponding to the user to authenticate connection to version control system
    */
    'access_token'?: string;
    /**
    *    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\"OrgID1-or-Name1\", \"OrgID2-or-Name2\"]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to  /n  Version: 9.5.0.cl or later
    */
    'org_identifier'?: string;
    /**
    * List the remote branches to configure. Example:[development, production]
    */
    'branch_names'?: Array<string>;
    /**
    * Name of the remote branch where objects from this Thoughtspot instance will be versioned. /n  Version: 9.7.0.cl or later
    */
    'commit_branch_name'?: string;
    /**
    *    Use commit_branch_name instead.      Name of the remote branch where objects from this Thoughtspot instance will be versioned.        *Deprecated from 10.0.0.cl : Replaced by commit_branch_name* 
    */
    'default_branch_name'?: string;
    /**
    * Maintain mapping of guid for the deployment to an instance /n  Version: 9.4.0.cl or later
    */
    'enable_guid_mapping'?: boolean | null;
    /**
    * Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained. /n  Version: 9.7.0.cl or later
    */
    'configuration_branch_name'?: string;
    /**
    *    Use configuration_branch_name instead.      Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.        *Deprecated from 10.0.0.cl : Replaced by configuration_branch_name*  /n  Version: 9.4.0.cl or later
    */
    'guid_mapping_branch_name'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        },
        {
            "name": "access_token",
            "baseName": "access_token",
            "type": "string",
            "format": ""
        },
        {
            "name": "org_identifier",
            "baseName": "org_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "branch_names",
            "baseName": "branch_names",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "commit_branch_name",
            "baseName": "commit_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "default_branch_name",
            "baseName": "default_branch_name",
            "type": "string",
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
            "name": "guid_mapping_branch_name",
            "baseName": "guid_mapping_branch_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateConfigRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

