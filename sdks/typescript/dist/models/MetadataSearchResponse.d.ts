export declare class MetadataSearchResponse {
    'metadataId'?: string;
    'metadataName'?: string;
    'metadataType': MetadataSearchResponseMetadataTypeEnum;
    'dependentObjects'?: any;
    'incompleteObjects'?: Array<any>;
    'metadataDetail'?: any;
    'metadataHeader'?: any;
    'visualizationHeaders'?: Array<any>;
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
