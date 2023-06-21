import { DataWarehouseObjectInput } from '../models/DataWarehouseObjectInput';
export declare class ConnectionInput {
    'identifier'?: string;
    'namePattern'?: string;
    'dataWarehouseObjects'?: Array<DataWarehouseObjectInput>;
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
