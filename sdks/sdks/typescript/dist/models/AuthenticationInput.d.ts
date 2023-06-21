import { APIKeyInput } from '../models/APIKeyInput';
import { BasicAuthInput } from '../models/BasicAuthInput';
export declare class AuthenticationInput {
    'aPIKey'?: APIKeyInput;
    'basicAuth'?: BasicAuthInput;
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
