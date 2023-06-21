import { PdfOptionsInput } from '../models/PdfOptionsInput';
import { PngOptionsInput } from '../models/PngOptionsInput';
export declare class ExportLiveboardReportRequest {
    'metadataIdentifier': string;
    'visualizationIdentifiers'?: Array<string>;
    'transientContent'?: string;
    'fileFormat'?: ExportLiveboardReportRequestFileFormatEnum;
    'runtimeFilter'?: any;
    'runtimeSort'?: any;
    'pdfOptions'?: PdfOptionsInput;
    'pngOptions'?: PngOptionsInput;
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
export type ExportLiveboardReportRequestFileFormatEnum = "CSV" | "PDF" | "XLSX" | "PNG";
