import { ActionDetailsInput } from '../models/ActionDetailsInput';
import { AssociateMetadataInput } from '../models/AssociateMetadataInput';
import { DefaultActionConfigInput } from '../models/DefaultActionConfigInput';
export declare class UpdateCustomActionRequest {
    'action_details'?: ActionDetailsInput;
    'associate_metadata'?: Array<AssociateMetadataInput>;
    'default_action_config'?: DefaultActionConfigInput;
    'group_identifiers'?: Array<string>;
    'name'?: string;
    'operation'?: UpdateCustomActionRequestOperationEnum;
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
export type UpdateCustomActionRequestOperationEnum = "ADD" | "REMOVE";
