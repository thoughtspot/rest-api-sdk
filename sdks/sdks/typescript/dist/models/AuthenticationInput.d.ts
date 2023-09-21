import { APIKeyInput } from '../models/APIKeyInput';
import { BasicAuthInput } from '../models/BasicAuthInput';
export declare class AuthenticationInput {
    'API_Key'?: APIKeyInput;
    'Basic_Auth'?: BasicAuthInput;
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
