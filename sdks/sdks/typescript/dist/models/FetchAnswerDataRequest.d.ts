export declare class FetchAnswerDataRequest {
    'metadataIdentifier': string;
    'dataFormat'?: FetchAnswerDataRequestDataFormatEnum;
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
export type FetchAnswerDataRequestDataFormatEnum = "COMPACT";
