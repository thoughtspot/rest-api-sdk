import { SharePermissionsInput } from '../models/SharePermissionsInput';
export declare class ShareMetadataRequest {
    'metadataType': ShareMetadataRequestMetadataTypeEnum;
    'metadataIdentifiers': Array<string>;
    'permissions': Array<SharePermissionsInput>;
    'visualizationIdentifiers'?: Array<string>;
    'emails': Array<string>;
    'message': string;
    'enableCustomUrl'?: boolean | null;
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
