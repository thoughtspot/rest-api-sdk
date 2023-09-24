import { PrincipalsListItem } from '../models/PrincipalsListItem';
export declare class RecipientDetails {
    'emails'?: Array<string>;
    'principals'?: Array<PrincipalsListItem>;
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
