export declare class UpdateConnectionRequest {
    'connection_identifier': string;
    'name'?: string;
    'description'?: string;
    'data_warehouse_config'?: any;
    'validate'?: boolean | null;
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
