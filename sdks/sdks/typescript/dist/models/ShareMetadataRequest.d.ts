import { SharePermissionsInput } from '../models/SharePermissionsInput';
export declare class ShareMetadataRequest {
    'metadata_type'?: ShareMetadataRequestMetadataTypeEnum;
    'metadata_identifiers': Array<string>;
    'permissions': Array<SharePermissionsInput>;
    'visualization_identifiers'?: Array<string>;
    'emails': Array<string>;
    'message': string;
    'enable_custom_url'?: boolean | null;
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
export type ShareMetadataRequestMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";
