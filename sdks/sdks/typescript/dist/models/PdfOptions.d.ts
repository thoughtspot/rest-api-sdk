export declare class PdfOptions {
    'completeLiveboard'?: boolean;
    'includeCoverPage'?: boolean;
    'includeCustomLogo'?: boolean;
    'includeFilterPage'?: boolean;
    'includePageNumber'?: boolean;
    'pageFooterText'?: string;
    'pageOrientation'?: string;
    'pageSize'?: PdfOptionsPageSizeEnum;
    'truncateTable'?: boolean;
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
export type PdfOptionsPageSizeEnum = "A4";
