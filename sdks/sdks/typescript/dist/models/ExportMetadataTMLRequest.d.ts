import { ExportMetadataTypeInput } from '../models/ExportMetadataTypeInput';
export declare class ExportMetadataTMLRequest {
    'metadata': Array<ExportMetadataTypeInput>;
    'export_associated'?: boolean | null;
    'export_fqn'?: boolean | null;
    'edoc_format'?: ExportMetadataTMLRequestEdocFormatEnum;
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
export type ExportMetadataTMLRequestEdocFormatEnum = "JSON" | "YAML";
