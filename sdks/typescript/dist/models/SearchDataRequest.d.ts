export declare class SearchDataRequest {
    'query_string': string;
    'logical_table_identifier': string;
    'data_format'?: SearchDataRequestDataFormatEnum;
    'record_offset'?: number;
    'record_size'?: number;
    'runtime_filter'?: any;
    'runtime_sort'?: any;
    'runtime_param_override'?: any;
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
export type SearchDataRequestDataFormatEnum = "COMPACT";
