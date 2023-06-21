export declare class FetchLiveboardDataRequest {
    'metadataIdentifier': string;
    'visualizationIdentifiers'?: Array<string>;
    'transientContent'?: string;
    'dataFormat'?: FetchLiveboardDataRequestDataFormatEnum;
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
export type FetchLiveboardDataRequestDataFormatEnum = "COMPACT";
