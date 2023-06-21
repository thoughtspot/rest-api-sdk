export declare class TagMetadataTypeInput {
    'type'?: TagMetadataTypeInputTypeEnum;
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
export type TagMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION";
