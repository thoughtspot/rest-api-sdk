export declare class SearchDataRequest {
    'queryString': string;
    'logicalTableIdentifier': string;
    'dataFormat'?: SearchDataRequestDataFormatEnum;
    'recordOffset'?: number;
    'recordSize'?: number;
    'runtimeFilter'?: any;
    'runtimeSort'?: any;
    'runtimeParamOverride'?: any;
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
