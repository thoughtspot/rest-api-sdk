import { CustomActionMetadataTypeInput } from '../models/CustomActionMetadataTypeInput';
import { DefaultActionConfigSearchInput } from '../models/DefaultActionConfigSearchInput';
export declare class SearchCustomActionsRequest {
    'custom_action_identifier'?: string;
    'name_pattern'?: string;
    'default_action_config'?: DefaultActionConfigSearchInput;
    'include_group_associations'?: boolean | null;
    'include_metadata_associations'?: boolean | null;
    'metadata'?: Array<CustomActionMetadataTypeInput>;
    'type'?: SearchCustomActionsRequestTypeEnum;
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
export type SearchCustomActionsRequestTypeEnum = "CALLBACK" | "URL";
