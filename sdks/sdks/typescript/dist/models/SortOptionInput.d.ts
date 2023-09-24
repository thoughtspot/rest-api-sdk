export declare class SortOptionInput {
    'field_name'?: SortOptionInputFieldNameEnum;
    'order'?: SortOptionInputOrderEnum;
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
export type SortOptionInputFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "LAST_ACCESSED" | "SYNCED" | "VIEWS" | "USER_STATE" | "ROW_COUNT";
export type SortOptionInputOrderEnum = "ASC" | "DESC";
