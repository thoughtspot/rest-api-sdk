export declare class CustomActionMetadataTypeInput {
    'type'?: CustomActionMetadataTypeInputTypeEnum;
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
export type CustomActionMetadataTypeInputTypeEnum = "VISUALIZATION" | "ANSWER" | "WORKSHEET";
