export declare class DeployCommitRequest {
    'commit_id'?: string;
    'branch_name': string;
    'deploy_type'?: DeployCommitRequestDeployTypeEnum;
    'deploy_policy'?: DeployCommitRequestDeployPolicyEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
export type DeployCommitRequestDeployTypeEnum = "FULL" | "DELTA";
export type DeployCommitRequestDeployPolicyEnum = "ALL_OR_NONE" | "PARTIAL" | "VALIDATE_ONLY";
