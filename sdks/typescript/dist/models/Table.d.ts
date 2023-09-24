import { Column } from '../models/Column';
export declare class Table {
    'name': string;
    'columns'?: Array<Column>;
    'type'?: string;
    'description'?: string;
    'selected'?: boolean;
    'linked'?: boolean;
    'relationships'?: Array<any>;
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
