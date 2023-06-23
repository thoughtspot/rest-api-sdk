export declare class SortOptions {
    'fieldName'?: SortOptionsFieldNameEnum;
    'order'?: SortOptionsOrderEnum;
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
export type SortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED";
export type SortOptionsOrderEnum = "ASC" | "DESC";
