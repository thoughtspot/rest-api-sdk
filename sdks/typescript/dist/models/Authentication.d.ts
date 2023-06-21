import { APIKey } from '../models/APIKey';
import { BasicAuth } from '../models/BasicAuth';
export declare class Authentication {
    'aPIKey'?: APIKey;
    'basicAuth'?: BasicAuth;
    'bearerToken'?: string;
    'noAuth'?: string;
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
