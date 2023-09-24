import { AnswerContent } from '../models/AnswerContent';
export declare class AnswerDataResponse {
    'metadata_id': string;
    'metadata_name': string;
    'contents': Array<AnswerContent>;
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
