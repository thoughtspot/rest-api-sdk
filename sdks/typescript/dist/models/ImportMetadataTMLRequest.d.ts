export declare class ImportMetadataTMLRequest {
    'metadata_tmls': Array<string>;
    'import_policy'?: ImportMetadataTMLRequestImportPolicyEnum;
    'create_new'?: boolean | null;
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
