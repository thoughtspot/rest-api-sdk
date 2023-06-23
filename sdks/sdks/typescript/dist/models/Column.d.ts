export declare class Column {
    'name': string;
    'dataType': string;
    'isAggregate'?: string;
    'canImport'?: boolean;
    'selected'?: boolean;
    'isLinkedActive'?: boolean;
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
