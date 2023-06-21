import { ActionDetailsInput } from '../models/ActionDetailsInput';
import { AssociateMetadataListItemInput } from '../models/AssociateMetadataListItemInput';
import { DefaultActionConfigInput } from '../models/DefaultActionConfigInput';
export declare class UpdateCustomActionRequest {
    'actionDetails'?: ActionDetailsInput;
    'associateMetadata'?: Array<AssociateMetadataListItemInput>;
    'defaultActionConfig'?: DefaultActionConfigInput;
    'groupIdentifiers'?: Array<string>;
    'name'?: string;
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
