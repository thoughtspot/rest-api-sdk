export declare class UpdateOrgRequest {
    'name'?: string;
    'description'?: string;
    'userIdentifiers'?: Array<string>;
    'operation'?: UpdateOrgRequestOperationEnum;
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
export type UpdateOrgRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE";
