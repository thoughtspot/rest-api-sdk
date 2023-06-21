import { AnswerContent } from '../models/AnswerContent';
export declare class AnswerDataResponse {
    'metadataId': string;
    'metadataName': string;
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
