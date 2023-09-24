export declare class SearchCommitsRequest {
    'metadata_identifier': string;
    'metadata_type'?: SearchCommitsRequestMetadataTypeEnum;
    'branch_name'?: string;
    'record_offset'?: number;
    'record_size'?: number;
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
