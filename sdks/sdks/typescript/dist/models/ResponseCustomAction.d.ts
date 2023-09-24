import { ActionDetails } from '../models/ActionDetails';
import { DefaultActionConfig } from '../models/DefaultActionConfig';
import { MetadataAssociationItem } from '../models/MetadataAssociationItem';
import { ObjectIDAndName } from '../models/ObjectIDAndName';
export declare class ResponseCustomAction {
    'action_details': ActionDetails;
    'default_action_config': DefaultActionConfig;
    'id': string;
    'metadata_association'?: Array<MetadataAssociationItem>;
    'name': string;
    'user_groups'?: Array<ObjectIDAndName>;
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
