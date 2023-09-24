export declare class FetchLiveboardDataRequest {
    'metadata_identifier': string;
    'visualization_identifiers'?: Array<string>;
    'transient_content'?: string;
    'data_format'?: FetchLiveboardDataRequestDataFormatEnum;
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
export type FetchLiveboardDataRequestDataFormatEnum = "COMPACT";
