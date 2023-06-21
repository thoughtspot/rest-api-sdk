import { ActionDetails } from '../models/ActionDetails';
import { DefaultActionConfig } from '../models/DefaultActionConfig';
import { MetadataAssociationListItem } from '../models/MetadataAssociationListItem';
import { ObjectIDAndName } from '../models/ObjectIDAndName';
export declare class ResponseCustomAction {
    'actionDetails': ActionDetails;
    'defaultActionConfig': DefaultActionConfig;
    'id': string;
    'metadataAssociation'?: Array<MetadataAssociationListItem>;
    'name': string;
    'userGroups'?: Array<ObjectIDAndName>;
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
