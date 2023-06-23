export declare class CreateConfigRequest {
    'repositoryUrl': string;
    'username': string;
    'accessToken': string;
    'orgIdentifier'?: string;
    'branchNames'?: Array<string>;
    'defaultBranchName'?: string;
    'enableGuidMapping'?: boolean | null;
    'guidMappingBranchName'?: string;
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
