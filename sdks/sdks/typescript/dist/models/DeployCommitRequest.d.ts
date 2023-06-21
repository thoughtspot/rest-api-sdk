export declare class DeployCommitRequest {
    'commitId'?: string;
    'branchName'?: string;
    'deployType'?: DeployCommitRequestDeployTypeEnum;
    'deployPolicy'?: DeployCommitRequestDeployPolicyEnum;
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
export type DeployCommitRequestDeployPolicyEnum = "ALL_OR_NONE" | "PARTIAL";
