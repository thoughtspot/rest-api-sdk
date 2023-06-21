export declare class PrincipalsInput {
    'identifier': string;
    'type': PrincipalsInputTypeEnum;
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
export type PrincipalsInputTypeEnum = "USER" | "USER_GROUP";
