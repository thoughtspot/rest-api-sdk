export declare class MetadataTypeInput {
    'type'?: MetadataTypeInputTypeEnum;
    'identifier': string;
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
export type MetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";
