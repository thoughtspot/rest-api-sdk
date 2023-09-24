export declare class CronExpression {
    'day_of_month': string;
    'day_of_week': string;
    'hour': string;
    'minute': string;
    'month': string;
    'second': string;
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
