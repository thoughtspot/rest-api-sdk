export declare class UpdateConnectionRequest {
    'connectionIdentifier': string;
    'name'?: string;
    'description'?: string;
    'dataWarehouseConfig'?: any;
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
