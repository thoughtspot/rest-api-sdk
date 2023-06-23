import { CustomActionMetadataTypeInput } from '../models/CustomActionMetadataTypeInput';
import { DefaultActionConfigSearchInput } from '../models/DefaultActionConfigSearchInput';
import { TypeInput } from '../models/TypeInput';
export declare class SearchCustomActionsRequest {
    'customActionIdentifier'?: string;
    'defaultActionConfig'?: DefaultActionConfigSearchInput;
    'includeGroupAssociations'?: boolean | null;
    'includeMetadataAssociations'?: boolean | null;
    'metadata'?: Array<CustomActionMetadataTypeInput>;
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
