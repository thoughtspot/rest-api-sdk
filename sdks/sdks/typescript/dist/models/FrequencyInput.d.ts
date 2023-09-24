import { CronExpressionInput } from '../models/CronExpressionInput';
export declare class FrequencyInput {
    'cron_expression': CronExpressionInput;
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
