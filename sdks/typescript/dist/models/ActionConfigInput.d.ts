export declare class ActionConfigInput {
    'position'?: ActionConfigInputPositionEnum;
    'visibility'?: boolean;
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
export type ActionConfigInputPositionEnum = "MENU" | "PRIMARY" | "CONTEXT_MENU";
