export declare class Tag {
    'name': string;
    'id': string;
    'color'?: string;
    'deleted'?: boolean;
    'hidden'?: boolean;
    'external'?: boolean;
    'deprecated'?: boolean;
    'creation_time_in_millis'?: number;
    'modification_time_in_millis'?: number;
    'author_id'?: string;
    'modifier_id'?: string;
    'owner_id'?: string;
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
