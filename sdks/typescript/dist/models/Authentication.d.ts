import { APIKey } from '../models/APIKey';
import { BasicAuth } from '../models/BasicAuth';
export declare class Authentication {
    'API_Key'?: APIKey;
    'Basic_Auth'?: BasicAuth;
    'Bearer_Token'?: string;
    'No_Auth'?: string;
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
