import { Org } from '../models/Org';
export declare class RepoConfigObject {
    'repositoryUrl'?: string;
    'username'?: string;
    'defaultBranch'?: string;
    'branches'?: Array<string>;
    'enableGuidMapping'?: boolean;
    'guidMappingBranchName'?: string;
    'org'?: Org;
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
