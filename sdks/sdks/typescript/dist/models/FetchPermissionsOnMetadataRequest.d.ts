import { PermissionsMetadataTypeInput } from '../models/PermissionsMetadataTypeInput';
import { PrincipalsInput } from '../models/PrincipalsInput';
export declare class FetchPermissionsOnMetadataRequest {
    'metadata': Array<PermissionsMetadataTypeInput>;
    'principals'?: Array<PrincipalsInput>;
    'includeDependentObjects'?: boolean | null;
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
