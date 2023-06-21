import { ActionConfigInput } from '../models/ActionConfigInput';
export declare class AssociateMetadataListItemInput {
    'actionConfig'?: ActionConfigInput;
    'identifier': string;
    'type'?: string;
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
