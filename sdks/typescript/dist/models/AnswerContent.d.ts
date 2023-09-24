export declare class AnswerContent {
    'available_data_row_count': number;
    'column_names': Array<string>;
    'data_rows': Array<any>;
    'record_offset': number;
    'record_size': number;
    'returned_data_row_count': number;
    'sampling_ratio': number;
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
