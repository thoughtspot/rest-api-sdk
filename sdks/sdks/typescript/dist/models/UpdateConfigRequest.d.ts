export declare class UpdateConfigRequest {
    'username'?: string;
    'access_token'?: string;
    'org_identifier'?: string;
    'branch_names'?: Array<string>;
    'commit_branch_name'?: string;
    'default_branch_name'?: string;
    'enable_guid_mapping'?: boolean | null;
    'configuration_branch_name'?: string;
    'guid_mapping_branch_name'?: string;
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
