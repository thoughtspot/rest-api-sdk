export declare class Column {
    'name': string;
    'data_type': string;
    'is_aggregate'?: string;
    'can_import'?: boolean;
    'selected'?: boolean;
    'is_linked_active'?: boolean;
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
