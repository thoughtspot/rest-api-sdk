export declare class FetchLogsRequest {
    'log_type': FetchLogsRequestLogTypeEnum;
    'start_epoch_time_in_millis'?: number;
    'end_epoch_time_in_millis'?: number;
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
