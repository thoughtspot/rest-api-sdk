export declare class ExportAnswerReportRequest {
    'metadataIdentifier': string;
    'fileFormat'?: ExportAnswerReportRequestFileFormatEnum;
    'runtimeFilter'?: any;
    'runtimeSort'?: any;
    'runtimeParamOverride'?: any;
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
export type ExportAnswerReportRequestFileFormatEnum = "CSV" | "PDF" | "XLSX" | "PNG";
