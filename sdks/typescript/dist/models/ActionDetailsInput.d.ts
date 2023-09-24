import { CALLBACKInput } from '../models/CALLBACKInput';
import { URLInput } from '../models/URLInput';
export declare class ActionDetailsInput {
    'CALLBACK'?: CALLBACKInput;
    'URL'?: URLInput;
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
