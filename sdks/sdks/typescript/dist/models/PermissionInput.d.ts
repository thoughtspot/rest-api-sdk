import { PrincipalsInput } from '../models/PrincipalsInput';
export declare class PermissionInput {
    'principal': PrincipalsInput;
    'share_mode': PermissionInputShareModeEnum;
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
export type PermissionInputShareModeEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";
