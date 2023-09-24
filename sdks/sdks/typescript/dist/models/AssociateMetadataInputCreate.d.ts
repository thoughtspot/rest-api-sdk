import { ActionConfigInputCreate } from '../models/ActionConfigInputCreate';
export declare class AssociateMetadataInputCreate {
    'action_config'?: ActionConfigInputCreate;
    'identifier': string;
    'type'?: AssociateMetadataInputCreateTypeEnum;
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
export type AssociateMetadataInputCreateTypeEnum = "VISUALIZATION" | "ANSWER" | "WORKSHEET";
