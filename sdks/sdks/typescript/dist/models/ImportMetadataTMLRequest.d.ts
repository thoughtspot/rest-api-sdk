export declare class ImportMetadataTMLRequest {
    'metadataTmls': Array<string>;
    'importPolicy'?: ImportMetadataTMLRequestImportPolicyEnum;
    'createNew'?: boolean | null;
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
export type ImportMetadataTMLRequestImportPolicyEnum = "PARTIAL" | "ALL_OR_NONE" | "VALIDATE_ONLY";
