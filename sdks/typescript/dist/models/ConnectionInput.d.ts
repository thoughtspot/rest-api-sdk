import { DataWarehouseObjectInput } from '../models/DataWarehouseObjectInput';
export declare class ConnectionInput {
    'identifier'?: string;
    'name_pattern'?: string;
    'data_warehouse_objects'?: Array<DataWarehouseObjectInput>;
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
