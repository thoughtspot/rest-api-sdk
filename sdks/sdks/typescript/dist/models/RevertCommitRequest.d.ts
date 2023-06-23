import { MetadataObject } from '../models/MetadataObject';
export declare class RevertCommitRequest {
    'metadata'?: Array<MetadataObject>;
    'branchName'?: string;
    'revertPolicy'?: RevertCommitRequestRevertPolicyEnum;
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
export type RevertCommitRequestRevertPolicyEnum = "ALL_OR_NONE" | "PARTIAL";
