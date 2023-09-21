export declare class ActionConfigInputCreate {
    'position'?: ActionConfigInputCreatePositionEnum;
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
export type ActionConfigInputCreatePositionEnum = "MENU" | "PRIMARY" | "CONTEXT_MENU";
