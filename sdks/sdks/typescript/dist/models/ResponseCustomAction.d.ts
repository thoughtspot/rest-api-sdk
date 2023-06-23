import { ActionDetails } from '../models/ActionDetails';
import { DefaultActionConfig } from '../models/DefaultActionConfig';
import { MetadataAssociationItem } from '../models/MetadataAssociationItem';
import { ObjectIDAndName } from '../models/ObjectIDAndName';
export declare class ResponseCustomAction {
    'actionDetails': ActionDetails;
    'defaultActionConfig': DefaultActionConfig;
    'id': string;
    'metadataAssociation'?: Array<MetadataAssociationItem>;
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
