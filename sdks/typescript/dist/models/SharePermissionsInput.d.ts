import { PrincipalsInput } from '../models/PrincipalsInput';
export declare class SharePermissionsInput {
    'principal': PrincipalsInput;
    'share_mode': SharePermissionsInputShareModeEnum;
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
export type SharePermissionsInputShareModeEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";
