import { ActionDetailsInputCreate } from '../models/ActionDetailsInputCreate';
import { AssociateMetadataInputCreate } from '../models/AssociateMetadataInputCreate';
import { DefaultActionConfigInputCreate } from '../models/DefaultActionConfigInputCreate';
export declare class CreateCustomActionRequest {
    'name': string;
    'action_details': ActionDetailsInputCreate;
    'associate_metadata'?: Array<AssociateMetadataInputCreate>;
    'default_action_config'?: DefaultActionConfigInputCreate;
    'group_identifiers'?: Array<string>;
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
