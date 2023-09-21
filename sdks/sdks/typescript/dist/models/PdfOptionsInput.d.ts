export declare class PdfOptionsInput {
    'include_cover_page'?: boolean;
    'include_custom_logo'?: boolean;
    'include_filter_page'?: boolean;
    'include_page_number'?: boolean;
    'page_orientation'?: PdfOptionsInputPageOrientationEnum;
    'truncate_table'?: boolean;
    'page_footer_text'?: string;
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
