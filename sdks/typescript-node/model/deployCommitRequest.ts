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

export class DeployCommitRequest {
    /**
    *    Commit_id against which the files should be picked to deploy.      Note: If no commit_id is specified, then the head of the branch is considered.
    */
    'commitId'?: string;
    /**
    *    Name of the remote branch where changes should be picked      Note: If no branch_name is specified, then the default branch will be considered. <br/> <span class=\"since-beta-tag\">Beta</span> <span class=\"since-beta-tag\">Version: 9.3.0.cl or later</span>
    */
    'branchName'?: string;
    /**
    *    Indicates if all files or only modified file at specified commit point should be considered      *Deprecated since 9.3.0.cl : Replaced by deploy_type * <br/> <span class=\"since-beta-tag\">Beta</span> <span class=\"since-beta-tag\">Version: 9.2.0.cl or later</span>
    */
    'importType'?: DeployCommitRequest.ImportTypeEnum = DeployCommitRequest.ImportTypeEnum.Delta;
    /**
    * Indicates if all files or only modified file at specified commit point should be considered <br/> <span class=\"since-beta-tag\">Beta</span> <span class=\"since-beta-tag\">Version: 9.3.0.cl or later</span>
    */
    'deployType'?: DeployCommitRequest.DeployTypeEnum = DeployCommitRequest.DeployTypeEnum.Delta;
    /**
    * Define the policy to follow while importing TML in the ThoughtSpot environment. Use “ALL_OR_NONE” to cancel the deployment of all ThoughtSpot objects if at least one of them fails to import. Use “Partial” to import ThoughtSpot objects that validate successfully even if other objects in the same deploy operations fail to import. <br/> <span class=\"since-beta-tag\">Beta</span> <span class=\"since-beta-tag\">Version: 9.3.0.cl or later</span>
    */
    'deployPolicy'?: DeployCommitRequest.DeployPolicyEnum = DeployCommitRequest.DeployPolicyEnum.AllOrNone;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "commitId",
            "baseName": "commit_id",
            "type": "string"
        },
        {
            "name": "branchName",
            "baseName": "branch_name",
            "type": "string"
        },
        {
            "name": "importType",
            "baseName": "import_type",
            "type": "DeployCommitRequest.ImportTypeEnum"
        },
        {
            "name": "deployType",
            "baseName": "deploy_type",
            "type": "DeployCommitRequest.DeployTypeEnum"
        },
        {
            "name": "deployPolicy",
            "baseName": "deploy_policy",
            "type": "DeployCommitRequest.DeployPolicyEnum"
        }    ];

    static getAttributeTypeMap() {
        return DeployCommitRequest.attributeTypeMap;
    }
}

export namespace DeployCommitRequest {
    export enum ImportTypeEnum {
        Full = <any> 'FULL',
        Delta = <any> 'DELTA'
    }
    export enum DeployTypeEnum {
        Full = <any> 'FULL',
        Delta = <any> 'DELTA'
    }
    export enum DeployPolicyEnum {
        AllOrNone = <any> 'ALL_OR_NONE',
        Partial = <any> 'PARTIAL'
    }
}
