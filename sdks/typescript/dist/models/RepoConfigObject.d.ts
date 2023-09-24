import { Org } from '../models/Org';
export declare class RepoConfigObject {
    'repository_url'?: string;
    'username'?: string;
    'commit_branch_name'?: string;
    'branches'?: Array<string>;
    'enable_guid_mapping'?: boolean;
    'configuration_branch_name'?: string;
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
