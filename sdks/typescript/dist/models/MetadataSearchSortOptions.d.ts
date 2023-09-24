export declare class MetadataSearchSortOptions {
    'field_name'?: MetadataSearchSortOptionsFieldNameEnum;
    'order'?: MetadataSearchSortOptionsOrderEnum;
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
export type MetadataSearchSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "VIEWS" | "FAVORITES" | "LAST_ACCESSED";
export type MetadataSearchSortOptionsOrderEnum = "ASC" | "DESC";
