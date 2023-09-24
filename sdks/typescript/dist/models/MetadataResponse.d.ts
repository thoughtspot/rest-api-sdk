export declare class MetadataResponse {
    'name'?: string;
    'id': string;
    'type': MetadataResponseTypeEnum;
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
export type MetadataResponseTypeEnum = "LIVEBOARD";
