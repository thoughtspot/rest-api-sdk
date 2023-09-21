import { JWTUserOptions } from '../models/JWTUserOptions';
export declare class GetObjectAccessTokenRequest {
    'username': string;
    'object_id': string;
    'password'?: string;
    'secret_key'?: string;
    'validity_time_in_sec'?: number;
    'org_id'?: number;
    'email'?: string;
    'display_name'?: string;
    'auto_create'?: boolean | null;
    'group_identifiers'?: Array<string>;
    'jwt_user_options'?: JWTUserOptions;
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
