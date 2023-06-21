export declare class Tag {
    'name': string;
    'id': string;
    'color'?: string;
    'deleted'?: boolean;
    'hidden'?: boolean;
    'external'?: boolean;
    'deprecated'?: boolean;
    'creationTimeInMillis'?: number;
    'modificationTimeInMillis'?: number;
    'authorId'?: string;
    'modifierId'?: string;
    'ownerId'?: string;
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
