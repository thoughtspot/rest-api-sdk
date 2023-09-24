import { LiveboardContent } from '../models/LiveboardContent';
export declare class LiveboardDataResponse {
    'metadata_id': string;
    'metadata_name': string;
    'contents': Array<LiveboardContent>;
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
