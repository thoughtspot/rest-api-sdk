export declare class FetchLogsRequest {
    'logType': FetchLogsRequestLogTypeEnum;
    'startEpochTimeInMillis'?: number;
    'endEpochTimeInMillis'?: number;
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
export type FetchLogsRequestLogTypeEnum = "SECURITY_AUDIT";
