export declare class MetadataObject {
    'identifier': string;
    'type'?: MetadataObjectTypeEnum;
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
export type MetadataObjectTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";
