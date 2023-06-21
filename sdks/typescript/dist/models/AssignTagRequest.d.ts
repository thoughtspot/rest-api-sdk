import { TagMetadataTypeInput } from '../models/TagMetadataTypeInput';
export declare class AssignTagRequest {
    'metadata': Array<TagMetadataTypeInput>;
    'tagIdentifiers': Array<string>;
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
