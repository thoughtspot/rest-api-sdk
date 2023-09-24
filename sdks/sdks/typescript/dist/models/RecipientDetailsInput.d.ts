import { PrincipalsListItemInput } from '../models/PrincipalsListItemInput';
export declare class RecipientDetailsInput {
    'emails'?: Array<string>;
    'principals'?: Array<PrincipalsListItemInput>;
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
