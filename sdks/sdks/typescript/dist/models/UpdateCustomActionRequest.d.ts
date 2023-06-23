import { ActionDetailsInput } from '../models/ActionDetailsInput';
import { AssociateMetadataInput } from '../models/AssociateMetadataInput';
import { DefaultActionConfigInput } from '../models/DefaultActionConfigInput';
export declare class UpdateCustomActionRequest {
    'actionDetails'?: ActionDetailsInput;
    'associateMetadata'?: Array<AssociateMetadataInput>;
    'defaultActionConfig'?: DefaultActionConfigInput;
    'groupIdentifiers'?: Array<string>;
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
