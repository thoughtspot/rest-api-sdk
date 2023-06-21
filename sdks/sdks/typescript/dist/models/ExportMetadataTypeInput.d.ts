export declare class ExportMetadataTypeInput {
    'type'?: ExportMetadataTypeInputTypeEnum;
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
export type ExportMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "CONNECTION";
