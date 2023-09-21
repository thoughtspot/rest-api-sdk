import { ActionConfig } from '../models/ActionConfig';
export declare class MetadataAssociationItem {
    'action_config': ActionConfig;
    'identifier': string;
    'type': string;
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
