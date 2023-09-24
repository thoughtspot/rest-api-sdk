import { PdfOptionsInput } from '../models/PdfOptionsInput';
import { PngOptionsInput } from '../models/PngOptionsInput';
export declare class ExportLiveboardReportRequest {
    'metadata_identifier': string;
    'visualization_identifiers'?: Array<string>;
    'transient_content'?: string;
    'file_format'?: ExportLiveboardReportRequestFileFormatEnum;
    'runtime_filter'?: any;
    'runtime_sort'?: any;
    'pdf_options'?: PdfOptionsInput;
    'png_options'?: PngOptionsInput;
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
export type ExportLiveboardReportRequestFileFormatEnum = "CSV" | "PDF" | "XLSX" | "PNG";
