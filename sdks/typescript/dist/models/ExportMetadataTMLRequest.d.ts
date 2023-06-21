import { ExportMetadataTypeInput } from '../models/ExportMetadataTypeInput';
export declare class ExportMetadataTMLRequest {
    'metadata': Array<ExportMetadataTypeInput>;
    'exportAssociated'?: boolean | null;
    'exportFqn'?: boolean | null;
    'edocFormat'?: ExportMetadataTMLRequestEdocFormatEnum;
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
