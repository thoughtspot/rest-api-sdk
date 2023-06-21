export declare class AnswerContent {
    'availableDataRowCount': number;
    'columnNames': Array<string>;
    'dataRows': Array<any>;
    'recordOffset': number;
    'recordSize': number;
    'returnedDataRowCount': number;
    'samplingRatio': number;
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
