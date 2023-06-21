export declare class SearchCommitsRequest {
    'metadataIdentifier': string;
    'metadataType'?: SearchCommitsRequestMetadataTypeEnum;
    'branchName'?: string;
    'recordOffset'?: number;
    'recordSize'?: number;
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
export type SearchCommitsRequestMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";
