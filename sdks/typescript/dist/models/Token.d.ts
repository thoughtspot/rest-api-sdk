import { Scope } from '../models/Scope';
export declare class Token {
    'token': string;
    'creationTimeInMillis': number;
    'expirationTimeInMillis': number;
    'scope': Scope;
    'validForUserId': string;
    'validForUsername': string;
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
