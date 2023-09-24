import { SchemaObject } from '../models/SchemaObject';
export declare class Database {
    'name': string;
    'schemas'?: Array<SchemaObject>;
    'auto_created'?: boolean;
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
