export declare class PdfOptions {
    'complete_liveboard'?: boolean;
    'include_cover_page'?: boolean;
    'include_custom_logo'?: boolean;
    'include_filter_page'?: boolean;
    'include_page_number'?: boolean;
    'page_footer_text'?: string;
    'page_orientation'?: string;
    'page_size'?: PdfOptionsPageSizeEnum;
    'truncate_table'?: boolean;
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
