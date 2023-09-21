import { JWTMetadataObject } from '../models/JWTMetadataObject';
import { JWTUserOptionsParametersInner } from '../models/JWTUserOptionsParametersInner';
export declare class JWTUserOptions {
    'parameters'?: Array<JWTUserOptionsParametersInner>;
    'metadata'?: Array<JWTMetadataObject>;
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
