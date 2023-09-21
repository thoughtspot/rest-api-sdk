import { ActionConfigInput } from '../models/ActionConfigInput';
export declare class AssociateMetadataInput {
    'action_config'?: ActionConfigInput;
    'identifier'?: string;
    'type'?: AssociateMetadataInputTypeEnum;
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
export type AssociateMetadataInputTypeEnum = "VISUALIZATION" | "ANSWER" | "WORKSHEET";
