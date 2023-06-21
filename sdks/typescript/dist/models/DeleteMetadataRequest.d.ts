import { DeleteMetadataTypeInput } from '../models/DeleteMetadataTypeInput';
export declare class DeleteMetadataRequest {
    'metadata': Array<DeleteMetadataTypeInput>;
    'deleteDisabledObjects'?: boolean | null;
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
