export declare class RevertedMetadata {
    'fileName': string;
    'metadataName': string;
    'metadataType': string;
    'statusCode': string;
    'statusMessage': string;
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
