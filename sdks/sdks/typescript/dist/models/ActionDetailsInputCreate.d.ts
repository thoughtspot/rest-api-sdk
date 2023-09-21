import { CALLBACKInputMandatory } from '../models/CALLBACKInputMandatory';
import { URLInputMandatory } from '../models/URLInputMandatory';
export declare class ActionDetailsInputCreate {
    'CALLBACK'?: CALLBACKInputMandatory;
    'URL'?: URLInputMandatory;
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
