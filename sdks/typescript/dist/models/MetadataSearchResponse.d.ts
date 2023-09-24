export declare class MetadataSearchResponse {
    'metadata_id'?: string;
    'metadata_name'?: string;
    'metadata_type': MetadataSearchResponseMetadataTypeEnum;
    'dependent_objects'?: any;
    'incomplete_objects'?: Array<any>;
    'metadata_detail'?: any;
    'metadata_header'?: any;
    'visualization_headers'?: Array<any>;
    'stats'?: any;
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
export type MetadataSearchResponseMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";
