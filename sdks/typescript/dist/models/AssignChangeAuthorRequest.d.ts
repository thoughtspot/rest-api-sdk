import { AuthorMetadataTypeInput } from '../models/AuthorMetadataTypeInput';
export declare class AssignChangeAuthorRequest {
    'metadata': Array<AuthorMetadataTypeInput>;
    'user_identifier': string;
    'current_owner_identifier'?: string;
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
