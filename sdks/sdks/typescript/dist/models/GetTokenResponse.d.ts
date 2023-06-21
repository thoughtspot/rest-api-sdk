export declare class GetTokenResponse {
    'token': string;
    'creationTimeInMillis': number;
    'expirationTimeInMillis': number;
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
