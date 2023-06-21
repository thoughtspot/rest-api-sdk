export declare class GetFullAccessTokenRequest {
    'username': string;
    'password'?: string;
    'secretKey'?: string;
    'validityTimeInSec'?: number;
    'orgId'?: number;
    'email'?: string;
    'displayName'?: string;
    'autoCreate'?: boolean | null;
    'groupIdentifiers'?: Array<string>;
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
