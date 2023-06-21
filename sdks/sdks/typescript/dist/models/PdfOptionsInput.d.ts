export declare class PdfOptionsInput {
    'includeCoverPage'?: boolean;
    'includeCustomLogo'?: boolean;
    'includeFilterPage'?: boolean;
    'includePageNumber'?: boolean;
    'pageOrientation'?: PdfOptionsInputPageOrientationEnum;
    'truncateTable'?: boolean;
    'pageFooterText'?: string;
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
export type PdfOptionsInputPageOrientationEnum = "PORTRAIT" | "LANDSCAPE";
