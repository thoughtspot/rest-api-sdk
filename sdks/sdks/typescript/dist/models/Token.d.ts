import { Scope } from '../models/Scope';
export declare class Token {
    'token': string;
    'creation_time_in_millis': number;
    'expiration_time_in_millis': number;
    'scope': Scope;
    'valid_for_user_id': string;
    'valid_for_username': string;
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
