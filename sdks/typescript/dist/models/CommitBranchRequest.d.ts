import { MetadataObject } from '../models/MetadataObject';
export declare class CommitBranchRequest {
    'metadata': Array<MetadataObject>;
    'delete_aware'?: boolean | null;
    'branch_name'?: string;
    'comment': string;
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
