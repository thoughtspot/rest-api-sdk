export declare class ResponseScheduleRun {
    'id': string;
    'start_time_in_millis': number;
    'end_time_in_millis': number;
    'status': string;
    'detail'?: string;
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
