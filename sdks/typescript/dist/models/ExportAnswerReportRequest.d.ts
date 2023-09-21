export declare class ExportAnswerReportRequest {
    'metadata_identifier': string;
    'file_format'?: ExportAnswerReportRequestFileFormatEnum;
    'runtime_filter'?: any;
    'runtime_sort'?: any;
    'runtime_param_override'?: any;
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
