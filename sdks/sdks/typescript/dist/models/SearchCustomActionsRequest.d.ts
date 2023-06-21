import { DefaultActionConfigInput } from '../models/DefaultActionConfigInput';
import { MetadataTypeInput } from '../models/MetadataTypeInput';
import { TypeInput } from '../models/TypeInput';
export declare class SearchCustomActionsRequest {
    'customActionIdentifier'?: string;
    'defaultActionConfig'?: DefaultActionConfigInput;
    'includeGroupAssociations'?: boolean | null;
    'includeMetadataAssociations'?: boolean | null;
    'metadata'?: Array<MetadataTypeInput>;
    'type'?: TypeInput;
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
